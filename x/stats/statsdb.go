package stats

import (
	"errors"
	"fmt"
	"sync"

	leveldbError "github.com/syndtr/goleveldb/leveldb/errors"
	"github.com/syndtr/goleveldb/leveldb/filter"
	"github.com/syndtr/goleveldb/leveldb/opt"

	"github.com/PlatONnetwork/PlatON-Go/log"
	"github.com/syndtr/goleveldb/leveldb"
)

const (
	DBPath = "statsdb"

	ValidatorName  = "Validator"
	VerifierName   = "Verifier"
	RewardName     = "Reward"
	YearName       = "Year"
	InitNodeName   = "InitNode"
	SlashName      = "Slash"
	TransBlockName = "TransBlock"
	TransHashName  = "TransHash"
)

var (
	dbpath string

	dbInstance *StatsDB

	instance sync.Mutex

	levelDBcache   = int(16)
	levelDBhandles = int(500)

	logger = log.Root().New("package", "statsdb")

	//ErrNotFound when db not found
	ErrNotFound = errors.New("statsDB: not found")
)

type StatsDB struct {
	path    string
	levelDB *leveldb.DB
	closed  bool
	dbError error
}

func (db *StatsDB) Put(key, value []byte) error {
	err := db.levelDB.Put(key, value, nil)
	if err != nil {
		return err
	}
	return nil
}

func (db *StatsDB) Delete(key []byte) error {
	err := db.levelDB.Delete(key, nil)
	if err != nil {
		return err
	}
	return nil
}

func (db *StatsDB) Get(key []byte) ([]byte, error) {
	if v, err := db.levelDB.Get(key, nil); err == nil {
		return v, nil
	} else if err != leveldb.ErrNotFound {
		return nil, err
	} else {
		return nil, ErrNotFound
	}
}

func (db *StatsDB) Has(key []byte) (bool, error) {
	_, err := db.Get(key)
	if err == nil {
		return true, nil
	} else if err == ErrNotFound {
		return true, ErrNotFound
	} else {
		return false, err
	}
}

func (db *StatsDB) Close() error {
	if db.levelDB != nil {
		if err := db.levelDB.Close(); err != nil {
			return fmt.Errorf("[statsDB]close level db fail:%v", err)
		}
	}
	db.closed = true
	return nil
}

func SetDBPath(path string) {
	dbpath = path
	logger.Info("set path", "path", dbpath)
}

func SetDBOptions(cache int, handles int) {
	levelDBcache = cache
	levelDBhandles = handles
}

func Instance() *StatsDB {
	instance.Lock()
	defer instance.Unlock()
	if dbInstance == nil || dbInstance.closed {
		logger.Debug("dbInstance is nil", "path", dbpath)
		if dbInstance == nil {
			dbInstance = new(StatsDB)
		}
		if levelDB, err := openLevelDB(levelDBcache, levelDBhandles); err != nil {
			logger.Error("init db fail", "err", err)
			panic(err)
		} else {
			dbInstance.levelDB = levelDB
		}
	}
	return dbInstance
}

func openLevelDB(cache int, handles int) (*leveldb.DB, error) {
	if len(dbpath) == 0 {
		dbpath = DBPath
	}
	db, err := leveldb.OpenFile(dbpath, &opt.Options{
		OpenFilesCacheCapacity: handles,
		BlockCacheCapacity:     cache / 2 * opt.MiB,
		WriteBuffer:            cache / 4 * opt.MiB, // Two of these are used internally
		Filter:                 filter.NewBloomFilter(10),
	})
	if err != nil {
		if _, corrupted := err.(*leveldbError.ErrCorrupted); corrupted {
			db, err = leveldb.RecoverFile(dbpath, nil)
			if err != nil {
				return nil, fmt.Errorf("[StatsDB.recover]RecoverFile levelDB fail:%v", err)
			}
		} else {
			return nil, err
		}
	}
	return db, nil
}
