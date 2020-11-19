package network.platon.contracts.wasm;

import com.alaya.abi.wasm.WasmFunctionEncoder;
import com.alaya.abi.wasm.datatypes.WasmFunction;
import com.alaya.crypto.Credentials;
import com.alaya.protocol.Web3j;
import com.alaya.protocol.core.RemoteCall;
import com.alaya.rlp.wasm.datatypes.Uint32;
import com.alaya.tx.TransactionManager;
import com.alaya.tx.WasmContract;
import com.alaya.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.alaya.codegen.WasmFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with platon-web3j version 0.13.2.0.
 */
public class Sha3Function extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001490d60000060017f017f60017f0060027f7f006000017f60037f7f7f0060047f7f7f7f0060037e7e7f0060027f7f017f60037f7f7f017f60047f7f7f7f017f60027e7e017f60017f017e02c3010903656e760b706c61746f6e5f73686133000603656e760c706c61746f6e5f70616e6963000003656e760d726c705f6c6973745f73697a65000103656e760f706c61746f6e5f726c705f6c697374000503656e760d726c705f753132385f73697a65000b03656e760f706c61746f6e5f726c705f75313238000703656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000403656e7610706c61746f6e5f6765745f696e707574000203656e760d706c61746f6e5f72657475726e000303131200040900010a030802010c020303000001010405017001010105030100020608017f0141b088040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300090f5f5f66756e63735f6f6e5f65786974001706696e766f6b65000c0af91d12040010180b7701027f230041406a220024002000413c6a4184082d00003a00002000418008280000360238200041286a4200370300200041206a42003703002000420037031820004200370310200041386a4105200041106a412010002000410c6a200041106a4120100b1a200028020c2101200041406b240020010bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b930802087f027e230041406a22022400101810062200100d220110070240200241086a20012000411c100e2203280208450440200341146a2802002100200328021021010c010b200241386a2003100f20032002280238200228023c101036020c200241206a2003100f410021002003027f410020022802202204450d001a410020022802242206200328020c2205490d001a200620052005417f461b210020040b2201360210200341146a2000360200200341003602080b200241206a200120004114100e22001011024002402000280204450d00200010110240200028020022042c0000220141004e044020010d010c020b200141807f460d00200141ff0171220541b7014d0440200028020441014d04401001200028020021040b20042d00010d010c020b200541bf014b0d012000280204200141ff017141ca7e6a22014d04401001200028020021040b200120046a2d0000450d010b2000280204450d0020042d000041c001490d010b10010b200010122206200028020422044b04401001200028020421040b20002802002107024002400240200404404100210520072c00002200417f4a0d01027f200041ff0171220541bf014d04404100200041ff017141b801490d011a200541c97e6a0c010b4100200041ff017141f801490d001a200541897e6a0b41016a21050c010b4101210520070d00410021000c010b41002100200520066a20044b0d0020042006490d004100210120042005490d01200520076a2101200420056b20062006417f461b22004109490d0110010c010b410021010b0340200004402000417f6a210020013100002008420886842108200141016a21010c010b0b024002402008500d0041850810132008510440200310140c020b418a0810132008520d0020031014100a210341002100200241003602284200210820024200370320200241206a41001015200241346a41003602002002420037022c4101210120034180014f04402003ad2109034020082009845045044020084238862009420888842109200041016a2100200842088821080c010b0b024020004138490d002000210103402001450d01200041016a2100200141087621010c000b000b200041016a21010b20022802282001490440200241206a200110150b200241206a42002003ad22081004200228022422006a1016420020082000200228022022066a10050340024020022802302201200228022c22044622050d00200141786a220028020022034504401001200028020021030b20002003417f6a220336020020030d0020022000360230200241206a2001417c6a2802002200200228022420006b220110026a10162000200228022022066a22002001200010030c010b0b200545044010010b2006200228022410082004450d01200220043602300c010b10010b1017200241406b24000b9b0101047f230041106b220124002001200036020c2000047f41ac08200041086a2202411076220041ac082802006a220336020041a80841a808280200220420026a41076a417871220236020002400240200341107420024d044041ac08200341016a360200200041016a21000c010b2000450d010b200040000d0010010b20042001410c6a4104100b41086a0541000b2100200141106a240020000b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000101920024f0d002003410471044010010c010b200042003702000b02402003411071450d002000101920024d0d0020034104710440100120000f0b200042003702000b20000b7201047f20011012220220012802044b044010010b2001101a21032000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012003490d00410020012002490d011a200320056a2104200120036b20022002417f461b0c010b41000b360204200020043602000b2701017f230041206b22022400200241086a200020014114100e10192100200241206a240020000b4101017f200028020445044010010b0240200028020022012d0000418101470d00200028020441014d047f100120002802000520010b2c00014100480d0010010b0bff0201037f200028020445044041000f0b2000101141012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100120002802040520010b4102490d0020002802002d00010d0010010b200241054f044010010b20002802002d000145044010010b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100120002802040520010b4102490d0020002802002d00010d0010010b200241054f044010010b20002802002d000145044010010b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10010b20020b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b8b0101047f230041106b22012400024002402000280204450d0020002802002d000041c001490d00200141086a2000100f41012103200128020c2100034020000440200141002001280208220220022000101022046a20024520002004497222021b3602084100200020046b20021b21002003417f6a21030c010b0b2003450d010b10010b200141106a24000b2f01017f200028020820014904402001100d20002802002000280204100b210220002001360208200020023602000b0b3601017f200028020820014904402001100d20002802002000280204100b210220002001360208200020023602000b200020013602040b880101037f4198084101360200419c082802002100034020000440034041a00841a0082802002201417f6a220236020020014101484504404198084100360200200020024102746a22004184016a280200200041046a2802001102004198084101360200419c0828020021000c010b0b41a0084120360200419c08200028020022003602000c010b0b0b3501017f230041106b220041b0880436020c41a408200028020c41076a417871220036020041a808200036020041ac083f003602000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f2000101a200010126a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b0b1b01004180080b140107102030696e69740053686133526573756c74";

    public static String BINARY = BINARY_0;

    public static final String FUNC_SHA3RESULT = "Sha3Result";

    protected Sha3Function(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected Sha3Function(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public static RemoteCall<Sha3Function> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(Sha3Function.class, web3j, credentials, contractGasProvider, encodedConstructor, chainId);
    }

    public static RemoteCall<Sha3Function> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(Sha3Function.class, web3j, transactionManager, contractGasProvider, encodedConstructor, chainId);
    }

    public static RemoteCall<Sha3Function> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(Sha3Function.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue, chainId);
    }

    public static RemoteCall<Sha3Function> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(Sha3Function.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue, chainId);
    }

    public RemoteCall<Uint32> Sha3Result() {
        final WasmFunction function = new WasmFunction(FUNC_SHA3RESULT, Arrays.asList(), Uint32.class);
        return executeRemoteCall(function, Uint32.class);
    }

    public static Sha3Function load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new Sha3Function(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static Sha3Function load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new Sha3Function(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }
}
