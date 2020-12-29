package plugin

import (
	"encoding/json"
	"io/ioutil"
	"math/big"
	"os"

	"github.com/PlatONnetwork/PlatON-Go/common"
)

var Issue1625Config string

type issue1625Accounts struct {
	Address common.Address `json:"address"`
	Amount  *big.Int       `json:"amount"`
}

func NewIssue1625Accounts() ([]issue1625Accounts, error) {
	file, err := os.Open(Issue1625Config)
	if err != nil {
		return nil, err
	}
	defer file.Close()
	val, err := ioutil.ReadAll(file)
	if err != nil {
		return nil, err
	}
	var accounts []issue1625Accounts
	if err := json.Unmarshal(val, &accounts); err != nil {
		return nil, err
	}
	return accounts, nil
}
