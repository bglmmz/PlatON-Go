package network.platon.contracts.wasm;

import com.alaya.abi.wasm.WasmFunctionEncoder;
import com.alaya.abi.wasm.datatypes.WasmFunction;
import com.alaya.crypto.Credentials;
import com.alaya.protocol.Web3j;
import com.alaya.protocol.core.RemoteCall;
import com.alaya.rlp.wasm.datatypes.Uint8;
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
public class FunctionTemplateContract extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001540f60017f017f60017f0060027f7f0060037f7f7f017f60027f7f017f60000060037f7f7f0060047f7f7f7f017f60047f7f7f7f0060027f7e0060037e7e7f006000017f60027f7e017f60027e7e017f60017f017e02a9020d03656e760c706c61746f6e5f70616e6963000503656e760d726c705f6c6973745f73697a65000003656e760f706c61746f6e5f726c705f6c697374000603656e760e726c705f62797465735f73697a65000403656e7610706c61746f6e5f726c705f6279746573000603656e760d726c705f753132385f73697a65000d03656e760f706c61746f6e5f726c705f75313238000a03656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000b03656e7610706c61746f6e5f6765745f696e707574000103656e7617706c61746f6e5f6765745f73746174655f6c656e677468000403656e7610706c61746f6e5f6765745f7374617465000703656e7610706c61746f6e5f7365745f7374617465000803656e760d706c61746f6e5f72657475726e0002034a490500000100040000010000020300020305000302040701020e01000102050000000907020103000104030602010009010202020002030201010c0302020002030701030606050000080405017001131305030100020608017f0141b089040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f7273000d0f5f5f66756e63735f6f6e5f65786974002a06696e766f6b65001d0918010041010b1212120e111314151618151519151a1b15151c0aba5649040010520b3801017f230041206b22002400200041ac083602082000200041086a360218200041086a100f2101200041086a1010200041206a240020010b3d01017f230041106b22012400200141053a000e200141013a000f20002001410f6a2001410e6a20002802002802181103002100200141106a240020000b2f00200020002802102200460440200020002802002802101101000f0b20000440200020002802002802141101000b0b3f01017f230041206b220024002000410136020c20004188083602082000200041086a360218200041086a100f2101200041086a1010200041206a240020010b0b00200020016a41ff01710b3f01017f230041206b220024002000410236020c20004188083602082000200041086a360218200041086a100f2101200041086a1010200041206a240020010b040020000b0300010b1c01017f4108101722014188083602002001200028020436020420010b0b002000410120001b101e0b14002001418808360200200120002802043602040b140020012d000020022d000020002802041104000b100041081017220041ac0836020020000b0a00200141ac083602000b110020022d000020012d00006a41ff01710b9e0402067f017e230041d0006b22022400105210072200101e220110080240200241086a20012000101f2203280208450440200341146a2802002100200328021021010c010b200241c8006a2003102020032002280248200228024c102136020c200241206a20031020410021002003027f410020022802202204450d001a410020022802242201200328020c2205490d001a200120052005417f461b210020040b2201360210200341146a2000360200200341003602080b200241206a200120004114102222001023024002402000280204450d00200010230240200028020022042c0000220141004e044020010d010c020b200141807f460d00200141ff0171220541b7014d0440200028020441014d04401000200028020021040b20042d00010d010c020b200541bf014b0d012000280204200141ff017141ca7e6a22014d04401000200028020021040b200120046a2d0000450d010b2000280204450d0020042d000041c001490d010b10000b200241c8006a20001024200228024c220041094f044010000b200228024821010340200004402000417f6a210020013100002006420886842106200141016a21010c010b0b024002402006500d0041c8081025200651044020031026200241206a102710280c020b41cd08102520065104402003410310290c020b41e108102520065104402003410410290c020b41f50810252006520d002003410510290c010b10000b102a200241d0006a24000b9b0101047f230041106b220124002001200036020c2000047f41a409200041086a2202411076220041a4092802006a220336020041a00941a009280200220420026a41076a417871220236020002400240200341107420024d044041a409200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104104241086a0541000b2100200141106a240020000b0c00200020012002411c10220b2101017f2001102b220220012802044b044010000b2000200120011054200210550b2701017f230041206b22022400200241086a200020014114102210532100200241206a240020000b730020004200370210200042ffffffff0f370208200020023602042000200136020002402003410871450d002000105320024f0d002003410471044010000c010b200042003702000b02402003411071450d002000105320024d0d0020034104710440100020000f0b200042003702000b20000b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0bd50101047f2001102b2204200128020422024b04401000200128020421020b200128020021052000027f02400240200204404100210120052c00002203417f4a0d01027f200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a21010c010b4101210120050d000c010b41002103200120046a20024b0d0020022001490d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b0e002000102c410147044010000b0b900a010f7f230041a0016b22032400200042003702182000428debc585c3a7f9dbf7003703102000410036020820004200370200200041206a4100360200200341206a102d22082000290310102e200828020c200841106a28020047044010000b200041186a21062000411c6a2109024020082802002205200828020422041009220a450d00200a101721020340200120026a41003a0000200a200141016a2201470d000b2005200420022001100a417f460440410021010c010b02400240200341086a200241016a200120026a2002417f736a101f2201280204450d0020012802002d000041c001490d002001102c21022000280220200028021822056b410c6d20024904402006200341c8006a2002200028021c20056b410c6d200041206a102f22021030200210310b200341f0006a2001410110322104200341e0006a200141001032210c200041206a210d2004280204210120034188016a410172210e0340200c280204200146410020042802082202200c280208461b0d02200341c8006a20012002411c10222101200341386a1033210b02400240200328024c044020032802482d000041c001490d010b20034188016a10331a0c010b20034180016a200110242001102b2102024002400240024020032802800122010440200328028401220520024f0d010b4100210120034190016a4100360200200342003703880141002107410021050c010b20034190016a410036020020034200370388012001200520022002417f461b22076a21052007410a4b0d010b200320074101743a008801200e21020c010b200741106a417071220f101721022003200736028c012003200f4101723602880120032002360290010b03402001200546450440200220012d00003a0000200241016a2102200141016a21010c010b0b200241003a00000b024020032d0038410171450440200341003b01380c010b200328024041003a00002003410036023c20032d0038410171450d00200341003602380b200341406b220220034190016a280200360200200320032903880137033820034188016a10340240200028021c2201200028022049044020012003290338370200200141086a2002280200360200200b103420092009280200410c6a3602000c010b20034188016a2006200120062802006b410c6d220141016a10352001200d102f210120032802900122052003290338370200200541086a2002280200360200200b10342003200328029001410c6a36029001200620011030200110310b20042004280204220120042802086a410020011b22013602042004280200220204402004200236020820012002102121052004027f2004280204220b4504404100210241000c010b410021024100200428020822072005490d001a200720052005417f461b2102200b0b2201ad2002ad42208684370204200441002004280200220520026b2202200220054b1b3602000c0105200441003602080c010b000b000b10000b200a21010b200828020c22020440200820023602100b024020010d0020002802042205200028020022026b410c6d22042000280220200028021822016b410c6d4d04402004200928020020016b410c6d220a4b044020022002200a410c6c6a2204200110361a20042005200910370c020b2006200220052001103610380c010b200104402006103920004100360220200042003702180b20002006200410352204103a22013602182000200136021c200020012004410c6c6a36022020022005200910370b200341a0016a240020000bdc08010b7f230041e0006b22022400200241186a102d2108200241c8006a22034100360200200241406b22044200370300200241386a2205420037030020024200370330200241306a2000290310103b20022802302101200241306a410472103c20082001103d20082000290310102e200828020c200841106a28020047044010000b2008280204210a2008280200210b2002102d210120034100360200200442003703002005420037030020024200370330027f20002802182000411c6a2802004604402002410136023041010c010b200241306a4100103e200241d0006a4101722109200028021c210720002802182103037f2003200746047f200241306a4101103e200228023005200241d0006a2003103f41012105024002400240200228025420022d00502204410176200441017122061b220441014d0440200441016b0d032002280258200920061b2c0000417f4c0d010c030b200441374b0d010b200441016a21050c010b2004104020046a41016a21050b027f200241306a20022802482204450d001a2002280238200420022802446a417f6a220441087641fcffff07716a280200200441ff07714102746a0b2204200428020020056a3602002003410c6a21030c010b0b0b2106200241306a410472103c41011017220341fe013a0000200128020c200141106a28020047044010000b200341016a21052001280204220441016a220720012802084b047f20012007104120012802040520040b20012802006a2003410110421a2001200128020441016a3602042001200620036b20056a103d0240200028021c20002802186b220304402003410c6d21032001280204210420012802102205200141146a280200220649044020052003ad2004ad422086843702002001200128021041086a3602100c020b027f41002005200128020c22076b410375220941016a2205200620076b2206410275220720072005491b41ffffffff01200641037541ffffffff00491b2207450d001a200741037410170b2105200520094103746a22062003ad2004ad4220868437020020062001280210200128020c22096b22036b2104200520074103746a2105200641086a2106200341014e044020042009200310421a0b20012005360214200120063602102001200436020c0c010b200141001001200128020422036a104341004100200320012802006a1002200110440b200241306a4101722109200028021c210720002802182103034020032007470440200241306a2003103f20012002280238200920022d0030220441017122051b22062002280234200441017620051b22041003200128020422056a104320062004200520012802006a1004200110442003410c6a21030c010b0b0240200128020c2001280210460440200128020021030c010b100020012802002103200128020c2001280210460d0010000b200b200a20032001280204100b200128020c22030440200120033602100b200828020c22010440200820013602100b200041186a104520001045200241e0006a24000bb90102027f017e230041e0006b2202240020001026200210272103200220011100002100200241286a102d2101200241d8006a4100360200200241d0006a4200370300200241c8006a420037030020024200370340200241406b2000ad2204103b20022802402100200241406b410472103c20012000103d200120041046220128020c200141106a28020047044010000b20012802002001280204100c200128020c22000440200120003602100b20031028200241e0006a24000b880101037f4190094101360200419409280200210003402000044003404198094198092802002201417f6a220236020020014101484504404190094100360200200020024102746a22004184016a280200200041046a280200110100419009410136020041940928020021000c010b0b4198094120360200419409200028020022003602000c010b0b0bff0201037f200028020445044041000f0b2000102341012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b800101047f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a20001020200128020c210003402000450d01200141002001280208220320032000102122046a20034520002004497222031b3602084100200020046b20031b2100200241016a21020c000b000b200141106a240020020b29002000410036020820004200370200200041001041200041146a41003602002000420037020c20000b09002000200110461a0b4c01017f2000410036020c200041106a2003360200200104402001103a21040b20002004360200200020042002410c6c6a2202360208200020042001410c6c6a36020c2000200236020420000baa0101037f200028020421022000280200210303402002200346450440200128020441746a2204200241746a2202290200370200200441086a200241086a280200360200200210342001200128020441746a3602040c010b0b200028020021022000200128020436020020012002360204200028020421022000200128020836020420012002360208200028020821022000200128020c3602082001200236020c200120012802043602000b2b01027f20002802082101200028020421020340200120024704402000200141746a22013602080c010b0b0be70101037f230041106b2204240020004200370200200041086a410036020020012802042103024002402002450440200321020c010b410021022003450d002003210220012802002d000041c001490d00200441086a2001102020004100200428020c2201200428020822022001102122032003417f461b20024520012003497222031b220536020820004100200220031b3602042000200120056b3602000c010b20012802002103200128020421012000410036020020004100200220016b20034520022001497222021b36020820004100200120036a20021b3602040b200441106a240020000b190020004200370200200041086a41003602002000103420000b2201017f03402001410c470440200020016a4100360200200141046a21010c010b0b0b3101017f2001200028020820002802006b410c6d2200410174220220022001491b41d5aad5aa01200041aad5aad500491b0bd00201077f200120006b2108410021010340200120026a2105200120084645044002402005200020016a2203460d00200341046a28020020032d00002204410176200441017122071b2104200341016a2106200341086a2802002109410a21032009200620071b210720052d0000410171220604402005280200417e71417f6a21030b200420034d0440027f20060440200541086a2802000c010b200541016a0b21032004044020032007200410500b200320046a41003a000020052d00004101710440200541046a20043602000c020b200520044101743a00000c010b416f2106200341e6ffffff074d0440410b20034101742203200420042003491b220341106a4170712003410b491b21060b200610172203200720041051200541046a200436020020052006410172360200200541086a2003360200200320046a41003a00000b2001410c6a21010c010b0b20050b2d000340200020014645044020022802002000103f20022002280200410c6a3602002000410c6a21000c010b0b0b0900200020013602040b0b002000200028020010380b09002000410c6c10170b840102027f017e4101210320014280015a0440034020012004845045044020044238862001420888842101200241016a2102200442088821040c010b0b200241384f047f2002104020026a0520020b41016a21030b200041186a28020022020440200041086a280200200041146a2802002002104721000b2000200028020020036a3602000bea0101047f230041106b22042400200028020422012000280210220241087641fcffff07716a2103027f410020012000280208460d001a2003280200200241ff07714102746a0b2101200441086a20001048200428020c210203400240200120024604402000410036021420002802082103200028020421010340200320016b41027522024103490d022000200141046a22013602040c000b000b200141046a220120032802006b418020470d0120032802042101200341046a21030c010b0b2002417f6a220241014d04402000418004418008200241016b1b3602100b200020011049200441106a24000b1300200028020820014904402000200110410b0bc10c02077f027e230041306b22042400200041046a2107024020014101460440200041086a280200200041146a280200200041186a220228020022031047280200210120022003417f6a3602002007104a4180104f044020072000410c6a280200417c6a10490b200141384f047f2001104020016a0520010b41016a2101200041186a2802002202450d01200041086a280200200041146a2802002002104721000c010b02402007104a0d00200041146a28020022014180084f0440200020014180786a360214200041086a2201280200220228020021032001200241046a360200200420033602182007200441186a104b0c010b2000410c6a2802002202200041086a2802006b4102752203200041106a2205280200220620002802046b220141027549044041802010172105200220064704400240200028020c220120002802102202470d0020002802082203200028020422064b04402000200320012003200320066b41027541016a417e6d41027422026a104c220136020c2000200028020820026a3602080c010b200441186a200220066b2201410175410120011b22012001410276200041106a104d2102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c200220093702082002104e200028020c21010b200120053602002000200028020c41046a36020c0c020b02402000280208220120002802042202470d00200028020c2203200028021022064904402000200120032003200620036b41027541016a41026d41027422026a104f22013602082000200028020c20026a36020c0c010b200441186a200620026b2201410175410120011b2201200141036a410276200041106a104d2102200028020c210320002802082101034020012003470440200228020820012802003602002002200228020841046a360208200141046a21010c010b0b200029020421092000200229020037020420022009370200200029020c21092000200229020837020c200220093702082002104e200028020821010b2001417c6a2005360200200020002802082201417c6a22023602082002280200210220002001360208200420023602182007200441186a104b0c010b20042001410175410120011b20032005104d210241802010172106024020022802082201200228020c2203470d0020022802042205200228020022084b04402002200520012005200520086b41027541016a417e6d41027422036a104c22013602082002200228020420036a3602040c010b200441186a200320086b2201410175410120011b22012001410276200241106a280200104d21032002280208210520022802042101034020012005470440200328020820012802003602002003200328020841046a360208200141046a21010c010b0b2002290200210920022003290200370200200320093702002002290208210920022003290208370208200320093702082003104e200228020821010b200120063602002002200228020841046a360208200028020c2105034020002802082005460440200028020421012000200228020036020420022001360200200228020421012002200536020420002001360208200029020c21092000200229020837020c200220093702082002104e052005417c6a210502402002280204220120022802002203470d0020022802082206200228020c22084904402002200120062006200820066b41027541016a41026d41027422036a104f22013602042002200228020820036a3602080c010b200441186a200820036b2201410175410120011b2201200141036a4102762002280210104d21062002280208210320022802042101034020012003470440200428022020012802003602002004200428022041046a360220200141046a21010c010b0b20022902002109200220042903183702002002290208210a20022004290320370208200420093703182004200a3703202006104e200228020421010b2001417c6a200528020036020020022002280204417c6a3602040c010b0b0b200441186a20071048200428021c4100360200200041186a2100410121010b2000200028020020016a360200200441306a24000b9d0101037f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a2802003602000f0b20012802082103024020012802042201410a4d0440200020014101743a0000200041016a21020c010b200141106a4170712204101721022000200136020420002004410172360200200020023602080b2002200320011051200120026a41003a00000b1e01017f03402000044020004108762100200141016a21010c010b0b20010b2f01017f200028020820014904402001101e200028020020002802041042210220002001360208200020023602000b0bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b3601017f200028020820014904402001101e200028020020002802041042210220002001360208200020023602000b200020013602040b7a01037f0340024020002802102201200028020c460d00200141786a2802004504401000200028021021010b200141786a22022002280200417f6a220336020020030d002000200236021020002001417c6a2802002201200028020420016b220210016a1043200120002802006a22012002200110020c010b0b0b0e0020002802000440200010390b0b2a01017f2000420020011005200028020422026a104342002001200220002802006a10062000104420000b25002000200120026a417f6a220241087641fcffff07716a280200200241ff07714102746a0b4f01037f20012802042203200128021020012802146a220441087641fcffff07716a21022000027f410020032001280208460d001a2002280200200441ff07714102746a0b360204200020023602000b2501017f200028020821020340200120024645044020002002417c6a22023602080c010b0b0b2801017f200028020820002802046b2201410874417f6a410020011b200028021420002802106a6b0ba10202057f017e230041206b22052400024020002802082202200028020c2203470d0020002802042204200028020022064b04402000200420022004200420066b41027541016a417e6d41027422036a104c22023602082000200028020420036a3602040c010b200541086a200320066b2202410175410120021b220220024102762000410c6a104d2103200028020821042000280204210203402002200446450440200328020820022802003602002003200328020841046a360208200241046a21020c010b0b2000290200210720002003290200370200200320073702002000290208210720002003290208370208200320073702082003104e200028020821020b200220012802003602002000200028020841046a360208200541206a24000b2501017f200120006b220141027521032001044020022000200110500b200220034102746a0b4f01017f2000410036020c200041106a2003360200200104402001410274101721040b200020043602002000200420024102746a22023602082000200420014102746a36020c2000200236020420000b2b01027f200028020821012000280204210203402001200247044020002001417c6a22013602080c010b0b0b1b00200120006b22010440200220016b22022000200110500b20020b8d0301037f024020002001460d00200120006b20026b410020024101746b4d044020002001200210421a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2105200020036a2204410371450440200220036b210241002103034020024104490d04200320046a200320056a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200420052d00003a0000200341016a21030c000b000b024020030d002001417f6a21040340200020026a22034103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042003417f6a200220046a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320056a2101200320046a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b10002002044020002001200210421a0b0b3501017f230041106b220041b0890436020c419c09200028020c41076a417871220036020041a009200036020041a4093f003602000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f200010542000102b6a0520010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b0b880102004188080b19060000000700000008000000090000000a0000000b0000000c0041ac080b62060000000d0000000e0000000f000000100000001100000012000000696e6974006765745f6c616d6264615f66756e6374696f6e006765745f6e6f726d616c5f66756e6374696f6e006765745f636c6173735f7374617469635f66756e6374696f6e";

    public static String BINARY = BINARY_0;

    public static final String FUNC_GET_LAMBDA_FUNCTION = "get_lambda_function";

    public static final String FUNC_GET_NORMAL_FUNCTION = "get_normal_function";

    public static final String FUNC_GET_CLASS_STATIC_FUNCTION = "get_class_static_function";

    protected FunctionTemplateContract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected FunctionTemplateContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public static RemoteCall<FunctionTemplateContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(FunctionTemplateContract.class, web3j, credentials, contractGasProvider, encodedConstructor, chainId);
    }

    public static RemoteCall<FunctionTemplateContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(FunctionTemplateContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor, chainId);
    }

    public static RemoteCall<FunctionTemplateContract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(FunctionTemplateContract.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue, chainId);
    }

    public static RemoteCall<FunctionTemplateContract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(FunctionTemplateContract.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue, chainId);
    }

    public RemoteCall<Uint8> get_lambda_function() {
        final WasmFunction function = new WasmFunction(FUNC_GET_LAMBDA_FUNCTION, Arrays.asList(), Uint8.class);
        return executeRemoteCall(function, Uint8.class);
    }

    public RemoteCall<Uint8> get_normal_function() {
        final WasmFunction function = new WasmFunction(FUNC_GET_NORMAL_FUNCTION, Arrays.asList(), Uint8.class);
        return executeRemoteCall(function, Uint8.class);
    }

    public RemoteCall<Uint8> get_class_static_function() {
        final WasmFunction function = new WasmFunction(FUNC_GET_CLASS_STATIC_FUNCTION, Arrays.asList(), Uint8.class);
        return executeRemoteCall(function, Uint8.class);
    }

    public static FunctionTemplateContract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new FunctionTemplateContract(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static FunctionTemplateContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new FunctionTemplateContract(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }
}
