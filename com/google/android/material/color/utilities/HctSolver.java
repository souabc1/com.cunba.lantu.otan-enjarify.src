package com.google.android.material.color.utilities;

public class HctSolver
{
  static final double[] CRITICAL_PLANES;
  static final double[][] LINRGB_FROM_SCALED_DISCOUNT;
  static final double[][] SCALED_DISCOUNT_FROM_LINRGB;
  static final double[] Y_FROM_LINRGB;
  
  static
  {
    int i = 3;
    double[][] arrayOfDouble = new double[i][];
    double[] arrayOfDouble1 = new double[i];
    double[] tmp12_11 = arrayOfDouble1;
    tmp12_11[0] = 0.0012008335687845D;
    double[] tmp18_12 = tmp12_11;
    tmp18_12[1] = 0.00238969449217089D;
    tmp18_12[2] = 0.0002795742885861124D;
    arrayOfDouble[0] = arrayOfDouble1;
    arrayOfDouble1 = new double[i];
    double[] tmp38_37 = arrayOfDouble1;
    tmp38_37[0] = 0.0005891086651375999D;
    double[] tmp44_38 = tmp38_37;
    tmp44_38[1] = 0.002978550257343876D;
    tmp44_38[2] = 0.0003270666104008398D;
    int j = 1;
    arrayOfDouble[j] = arrayOfDouble1;
    arrayOfDouble1 = new double[i];
    double[] tmp66_65 = arrayOfDouble1;
    tmp66_65[0] = 0.0001014669249164057D;
    double[] tmp72_66 = tmp66_65;
    tmp72_66[1] = 0.0005364214359186694D;
    tmp72_66[2] = 0.003297940177071208D;
    int k = 2;
    arrayOfDouble[k] = arrayOfDouble1;
    SCALED_DISCOUNT_FROM_LINRGB = arrayOfDouble;
    arrayOfDouble = new double[i][];
    arrayOfDouble1 = new double[i];
    double[] tmp105_104 = arrayOfDouble1;
    tmp105_104[0] = 1373.2198709594231D;
    double[] tmp111_105 = tmp105_104;
    tmp111_105[1] = -1100.4251190754821D;
    tmp111_105[2] = -7.278681089101213D;
    arrayOfDouble[0] = arrayOfDouble1;
    arrayOfDouble1 = new double[i];
    double[] tmp131_130 = arrayOfDouble1;
    tmp131_130[0] = -271.81596907790299D;
    double[] tmp137_131 = tmp131_130;
    tmp137_131[1] = 559.65804659407331D;
    tmp137_131[2] = -32.460474827911938D;
    arrayOfDouble[j] = arrayOfDouble1;
    arrayOfDouble1 = new double[i];
    double[] tmp157_156 = arrayOfDouble1;
    tmp157_156[0] = 1.962289959966567D;
    double[] tmp163_157 = tmp157_156;
    tmp163_157[1] = -57.173814538844006D;
    tmp163_157[2] = 308.7233197812385D;
    arrayOfDouble[k] = arrayOfDouble1;
    LINRGB_FROM_SCALED_DISCOUNT = arrayOfDouble;
    double[] arrayOfDouble2 = new double[i];
    double[] tmp190_188 = arrayOfDouble2;
    tmp190_188[0] = 0.2126D;
    double[] tmp196_190 = tmp190_188;
    tmp196_190[1] = 0.7152D;
    tmp196_190[2] = 0.0722D;
    Y_FROM_LINRGB = arrayOfDouble2;
    arrayOfDouble2 = new double['ÿ'];
    double[] tmp221_219 = arrayOfDouble2;
    double[] tmp222_221 = tmp221_219;
    double[] tmp222_221 = tmp221_219;
    tmp222_221[0] = 0.01517634917744188D;
    tmp222_221[1] = 0.04552904753232562D;
    double[] tmp233_222 = tmp222_221;
    double[] tmp233_222 = tmp222_221;
    tmp233_222[2] = 0.07588174588720938D;
    tmp233_222[3] = 0.1062344442420931D;
    double[] tmp244_233 = tmp233_222;
    double[] tmp244_233 = tmp233_222;
    tmp244_233[4] = 0.1365871425969769D;
    tmp244_233[5] = 0.1669398409518606D;
    double[] tmp255_244 = tmp244_233;
    double[] tmp255_244 = tmp244_233;
    tmp255_244[6] = 0.1972925393067443D;
    tmp255_244[7] = 0.2276452376616281D;
    double[] tmp268_255 = tmp255_244;
    double[] tmp268_255 = tmp255_244;
    tmp268_255[8] = 0.2579979360165119D;
    tmp268_255[9] = 0.2883506343713956D;
    double[] tmp281_268 = tmp268_255;
    double[] tmp281_268 = tmp268_255;
    tmp281_268[10] = 0.3188300904430532D;
    tmp281_268[11] = 0.350925934958123D;
    double[] tmp294_281 = tmp281_268;
    double[] tmp294_281 = tmp281_268;
    tmp294_281[12] = 0.3848314933096426D;
    tmp294_281[13] = 0.4205748030104947D;
    double[] tmp307_294 = tmp294_281;
    double[] tmp307_294 = tmp294_281;
    tmp307_294[14] = 0.458183274052838D;
    tmp307_294[15] = 0.4976837250274023D;
    double[] tmp320_307 = tmp307_294;
    double[] tmp320_307 = tmp307_294;
    tmp320_307[16] = 0.5391024159806381D;
    tmp320_307[17] = 0.5824650784040898D;
    double[] tmp333_320 = tmp320_307;
    double[] tmp333_320 = tmp320_307;
    tmp333_320[18] = 0.6277969426914107D;
    tmp333_320[19] = 0.6751227633498623D;
    double[] tmp346_333 = tmp333_320;
    double[] tmp346_333 = tmp333_320;
    tmp346_333[20] = 0.7244668422128922D;
    tmp346_333[21] = 0.7758530498667861D;
    double[] tmp359_346 = tmp346_333;
    double[] tmp359_346 = tmp346_333;
    tmp359_346[22] = 0.829304845476233D;
    tmp359_346[23] = 0.8848452951698498D;
    double[] tmp372_359 = tmp359_346;
    double[] tmp372_359 = tmp359_346;
    tmp372_359[24] = 0.942497089126609D;
    tmp372_359[25] = 1.002282557486904D;
    double[] tmp385_372 = tmp372_359;
    double[] tmp385_372 = tmp372_359;
    tmp385_372[26] = 1.064223685197358D;
    tmp385_372[27] = 1.12834212588583D;
    double[] tmp398_385 = tmp385_372;
    double[] tmp398_385 = tmp385_372;
    tmp398_385[28] = 1.194659214852213D;
    tmp398_385[29] = 1.263195981251186D;
    double[] tmp411_398 = tmp398_385;
    double[] tmp411_398 = tmp398_385;
    tmp411_398[30] = 1.333973159534903D;
    tmp411_398[31] = 1.407011200216447D;
    double[] tmp424_411 = tmp411_398;
    double[] tmp424_411 = tmp411_398;
    tmp424_411[32] = 1.482330280008642D;
    tmp424_411[33] = 1.559950311387327D;
    double[] tmp437_424 = tmp424_411;
    double[] tmp437_424 = tmp424_411;
    tmp437_424[34] = 1.639890951623368D;
    tmp437_424[35] = 1.722171611323411D;
    double[] tmp450_437 = tmp437_424;
    double[] tmp450_437 = tmp437_424;
    tmp450_437[36] = 1.806811462515638D;
    tmp450_437[37] = 1.893829446313407D;
    double[] tmp463_450 = tmp450_437;
    double[] tmp463_450 = tmp450_437;
    tmp463_450[38] = 1.983244280186685D;
    tmp463_450[39] = 2.075074464868551D;
    double[] tmp476_463 = tmp463_450;
    double[] tmp476_463 = tmp463_450;
    tmp476_463[40] = 2.169338290921623D;
    tmp476_463[41] = 2.266053844987206D;
    double[] tmp489_476 = tmp476_463;
    double[] tmp489_476 = tmp476_463;
    tmp489_476[42] = 2.36523901573795D;
    tmp489_476[43] = 2.466911499553201D;
    double[] tmp502_489 = tmp489_476;
    double[] tmp502_489 = tmp489_476;
    tmp502_489[44] = 2.571088805934576D;
    tmp502_489[45] = 2.677788262677979D;
    double[] tmp515_502 = tmp502_489;
    double[] tmp515_502 = tmp502_489;
    tmp515_502[46] = 2.787027020816926D;
    tmp515_502[47] = 2.898822059350997D;
    double[] tmp528_515 = tmp515_502;
    double[] tmp528_515 = tmp515_502;
    tmp528_515[48] = 3.013190189772091D;
    tmp528_515[49] = 3.130148060400286D;
    double[] tmp541_528 = tmp528_515;
    double[] tmp541_528 = tmp528_515;
    tmp541_528[50] = 3.249712160540223D;
    tmp541_528[51] = 3.371898824468109D;
    double[] tmp554_541 = tmp541_528;
    double[] tmp554_541 = tmp541_528;
    tmp554_541[52] = 3.496724235258795D;
    tmp554_541[53] = 3.624204428461639D;
    double[] tmp567_554 = tmp554_541;
    double[] tmp567_554 = tmp554_541;
    tmp567_554[54] = 3.754355295633311D;
    tmp567_554[55] = 3.887192587735158D;
    double[] tmp580_567 = tmp567_554;
    double[] tmp580_567 = tmp567_554;
    tmp580_567[56] = 4.022731918402185D;
    tmp580_567[57] = 4.160988767090289D;
    double[] tmp593_580 = tmp580_567;
    double[] tmp593_580 = tmp580_567;
    tmp593_580[58] = 4.301978482107941D;
    tmp593_580[59] = 4.445716283538092D;
    double[] tmp606_593 = tmp593_580;
    double[] tmp606_593 = tmp593_580;
    tmp606_593[60] = 4.592217266055746D;
    tmp606_593[61] = 4.741496401646282D;
    double[] tmp619_606 = tmp606_593;
    double[] tmp619_606 = tmp606_593;
    tmp619_606[62] = 4.893568542229298D;
    tmp619_606[63] = 5.048448422192488D;
    double[] tmp632_619 = tmp619_606;
    double[] tmp632_619 = tmp619_606;
    tmp632_619[64] = 5.20615066083972D;
    tmp632_619[65] = 5.366689764757338D;
    double[] tmp645_632 = tmp632_619;
    double[] tmp645_632 = tmp632_619;
    tmp645_632[66] = 5.530080130102387D;
    tmp645_632[67] = 5.696336044816294D;
    double[] tmp658_645 = tmp645_632;
    double[] tmp658_645 = tmp645_632;
    tmp658_645[68] = 5.865471690767354D;
    tmp658_645[69] = 6.037501145825082D;
    double[] tmp671_658 = tmp658_645;
    double[] tmp671_658 = tmp658_645;
    tmp671_658[70] = 6.212438385869475D;
    tmp671_658[71] = 6.390297286737924D;
    double[] tmp684_671 = tmp671_658;
    double[] tmp684_671 = tmp671_658;
    tmp684_671[72] = 6.571091626112461D;
    tmp684_671[73] = 6.754835085349805D;
    double[] tmp697_684 = tmp684_671;
    double[] tmp697_684 = tmp684_671;
    tmp697_684[74] = 6.941541251256611D;
    tmp697_684[75] = 7.131223617812143D;
    double[] tmp710_697 = tmp697_684;
    double[] tmp710_697 = tmp697_684;
    tmp710_697[76] = 7.323895587840543D;
    tmp710_697[77] = 7.519570474634667D;
    double[] tmp723_710 = tmp710_697;
    double[] tmp723_710 = tmp710_697;
    tmp723_710[78] = 7.718261503533435D;
    tmp723_710[79] = 7.919981813454504D;
    double[] tmp736_723 = tmp723_710;
    double[] tmp736_723 = tmp723_710;
    tmp736_723[80] = 8.124744458384042D;
    tmp736_723[81] = 8.332562408825165D;
    double[] tmp749_736 = tmp736_723;
    double[] tmp749_736 = tmp736_723;
    tmp749_736[82] = 8.543448553206703D;
    tmp749_736[83] = 8.757415699253683D;
    double[] tmp762_749 = tmp749_736;
    double[] tmp762_749 = tmp749_736;
    tmp762_749[84] = 8.974476575321063D;
    tmp762_749[85] = 9.194643831691977D;
    double[] tmp775_762 = tmp762_749;
    double[] tmp775_762 = tmp762_749;
    tmp775_762[86] = 9.417930041841839D;
    tmp775_762[87] = 9.644347703669503D;
    double[] tmp788_775 = tmp775_762;
    double[] tmp788_775 = tmp775_762;
    tmp788_775[88] = 9.873909240696694D;
    tmp788_775[89] = 10.106627003236781D;
    double[] tmp801_788 = tmp788_775;
    double[] tmp801_788 = tmp788_775;
    tmp801_788[90] = 10.342513269534024D;
    tmp801_788[91] = 10.581580246874269D;
    double[] tmp814_801 = tmp801_788;
    double[] tmp814_801 = tmp801_788;
    tmp814_801[92] = 10.8238400726681D;
    tmp814_801[93] = 11.069304815507364D;
    double[] tmp827_814 = tmp814_801;
    double[] tmp827_814 = tmp814_801;
    tmp827_814[94] = 11.317986476196008D;
    tmp827_814[95] = 11.569896988756009D;
    double[] tmp840_827 = tmp827_814;
    double[] tmp840_827 = tmp827_814;
    tmp840_827[96] = 11.825048221409341D;
    tmp840_827[97] = 12.083451977536606D;
    double[] tmp853_840 = tmp840_827;
    double[] tmp853_840 = tmp840_827;
    tmp853_840[98] = 12.345119996613247D;
    tmp853_840[99] = 12.610063955123938D;
    double[] tmp866_853 = tmp853_840;
    double[] tmp866_853 = tmp853_840;
    tmp866_853[100] = 12.878295467455942D;
    tmp866_853[101] = 13.149826086772048D;
    double[] tmp879_866 = tmp866_853;
    double[] tmp879_866 = tmp866_853;
    tmp879_866[102] = 13.42466730586372D;
    tmp879_866[103] = 13.702830557985108D;
    double[] tmp892_879 = tmp879_866;
    double[] tmp892_879 = tmp879_866;
    tmp892_879[104] = 13.984327217668513D;
    tmp892_879[105] = 14.269168601521828D;
    double[] tmp905_892 = tmp892_879;
    double[] tmp905_892 = tmp892_879;
    tmp905_892[106] = 14.55736596900856D;
    tmp905_892[107] = 14.848930523210871D;
    double[] tmp918_905 = tmp905_892;
    double[] tmp918_905 = tmp905_892;
    tmp918_905[108] = 15.143873411576273D;
    tmp918_905[109] = 15.44220572664832D;
    double[] tmp931_918 = tmp918_905;
    double[] tmp931_918 = tmp918_905;
    tmp931_918[110] = 15.743938506781891D;
    tmp931_918[111] = 16.049082736843371D;
    double[] tmp944_931 = tmp931_918;
    double[] tmp944_931 = tmp931_918;
    tmp944_931[112] = 16.357649348896341D;
    tmp944_931[113] = 16.669649222873041D;
    double[] tmp957_944 = tmp944_931;
    double[] tmp957_944 = tmp944_931;
    tmp957_944[114] = 16.985093187232053D;
    tmp957_944[115] = 17.303992019602688D;
    double[] tmp970_957 = tmp957_944;
    double[] tmp970_957 = tmp957_944;
    tmp970_957[116] = 17.626356447416249D;
    tmp970_957[117] = 17.95219714852476D;
    double[] tmp983_970 = tmp970_957;
    double[] tmp983_970 = tmp970_957;
    tmp983_970[118] = 18.281524751807332D;
    tmp983_970[119] = 18.614349837764564D;
    double[] tmp996_983 = tmp983_970;
    double[] tmp996_983 = tmp983_970;
    tmp996_983[120] = 18.95068293910138D;
    tmp996_983[121] = 19.290534541298456D;
    double[] tmp1009_996 = tmp996_983;
    double[] tmp1009_996 = tmp996_983;
    tmp1009_996[122] = 19.633915083172692D;
    tmp1009_996[123] = 19.98083495742689D;
    double[] tmp1022_1009 = tmp1009_996;
    double[] tmp1022_1009 = tmp1009_996;
    tmp1022_1009[124] = 20.331304511189067D;
    tmp1022_1009[125] = 20.685334046541502D;
    double[] tmp1035_1022 = tmp1022_1009;
    double[] tmp1035_1022 = tmp1022_1009;
    tmp1035_1022[126] = 21.042933821039977D;
    tmp1035_1022[127] = 21.404114048223256D;
    double[] tmp1048_1035 = tmp1035_1022;
    double[] tmp1048_1035 = tmp1035_1022;
    tmp1048_1035[''] = 21.768884898113221D;
    tmp1048_1035[''] = 22.137256497705877D;
    double[] tmp1063_1048 = tmp1048_1035;
    double[] tmp1063_1048 = tmp1048_1035;
    tmp1063_1048[''] = 22.509238931453279D;
    tmp1063_1048[''] = 22.884842241736916D;
    double[] tmp1078_1063 = tmp1063_1048;
    double[] tmp1078_1063 = tmp1063_1048;
    tmp1078_1063[''] = 23.264076429332462D;
    tmp1078_1063[''] = 23.646951453866301D;
    double[] tmp1093_1078 = tmp1078_1063;
    double[] tmp1093_1078 = tmp1078_1063;
    tmp1093_1078[''] = 24.033477234264016D;
    tmp1093_1078[''] = 24.423663649190829D;
    double[] tmp1108_1093 = tmp1093_1078;
    double[] tmp1108_1093 = tmp1093_1078;
    tmp1108_1093[''] = 24.817520537484558D;
    tmp1108_1093[''] = 25.215057698580889D;
    double[] tmp1123_1108 = tmp1108_1093;
    double[] tmp1123_1108 = tmp1108_1093;
    tmp1123_1108[''] = 25.616284892931379D;
    tmp1123_1108[''] = 26.021211842414342D;
    double[] tmp1138_1123 = tmp1123_1108;
    double[] tmp1138_1123 = tmp1123_1108;
    tmp1138_1123[''] = 26.429848230738664D;
    tmp1138_1123[''] = 26.842203703840827D;
    double[] tmp1153_1138 = tmp1138_1123;
    double[] tmp1153_1138 = tmp1138_1123;
    tmp1153_1138[''] = 27.258287870275353D;
    tmp1153_1138[''] = 27.678110301598522D;
    double[] tmp1168_1153 = tmp1153_1138;
    double[] tmp1168_1153 = tmp1153_1138;
    tmp1168_1153[''] = 28.10168053274597D;
    tmp1168_1153[''] = 28.529008062403893D;
    double[] tmp1183_1168 = tmp1168_1153;
    double[] tmp1183_1168 = tmp1168_1153;
    tmp1183_1168[''] = 28.960102353374221D;
    tmp1183_1168[''] = 29.394972832933959D;
    double[] tmp1198_1183 = tmp1183_1168;
    double[] tmp1198_1183 = tmp1183_1168;
    tmp1198_1183[''] = 29.83362889318845D;
    tmp1198_1183[''] = 30.276079891419332D;
    double[] tmp1213_1198 = tmp1198_1183;
    double[] tmp1213_1198 = tmp1198_1183;
    tmp1213_1198[''] = 30.722335150426627D;
    tmp1213_1198[''] = 31.172403958865512D;
    double[] tmp1228_1213 = tmp1213_1198;
    double[] tmp1228_1213 = tmp1213_1198;
    tmp1228_1213[''] = 31.626295571577849D;
    tmp1228_1213[''] = 32.084019209918367D;
    double[] tmp1243_1228 = tmp1228_1213;
    double[] tmp1243_1228 = tmp1228_1213;
    tmp1243_1228[''] = 32.545584062075918D;
    tmp1243_1228[''] = 33.010999283389665D;
    double[] tmp1258_1243 = tmp1243_1228;
    double[] tmp1258_1243 = tmp1243_1228;
    tmp1258_1243[''] = 33.480273996660301D;
    tmp1258_1243[''] = 33.953417292456834D;
    double[] tmp1273_1258 = tmp1258_1243;
    double[] tmp1273_1258 = tmp1258_1243;
    tmp1273_1258[''] = 34.430438229418264D;
    tmp1273_1258[''] = 34.911345834551085D;
    double[] tmp1288_1273 = tmp1273_1258;
    double[] tmp1288_1273 = tmp1273_1258;
    tmp1288_1273[' '] = 35.39614910352207D;
    tmp1288_1273['¡'] = 35.88485700094671D;
    double[] tmp1303_1288 = tmp1288_1273;
    double[] tmp1303_1288 = tmp1288_1273;
    tmp1303_1288['¢'] = 36.377478460673487D;
    tmp1303_1288['£'] = 36.874022386063821D;
    double[] tmp1318_1303 = tmp1303_1288;
    double[] tmp1318_1303 = tmp1303_1288;
    tmp1318_1303['¤'] = 37.374497650267891D;
    tmp1318_1303['¥'] = 37.878913096496589D;
    double[] tmp1333_1318 = tmp1318_1303;
    double[] tmp1333_1318 = tmp1318_1303;
    tmp1333_1318['¦'] = 38.387277538289261D;
    tmp1333_1318['§'] = 38.89959975977785D;
    double[] tmp1348_1333 = tmp1333_1318;
    double[] tmp1348_1333 = tmp1333_1318;
    tmp1348_1333['¨'] = 39.415888515946968D;
    tmp1348_1333['©'] = 39.936152532890539D;
    double[] tmp1363_1348 = tmp1348_1333;
    double[] tmp1363_1348 = tmp1348_1333;
    tmp1363_1348['ª'] = 40.460400508064545D;
    tmp1363_1348['«'] = 40.988641110536292D;
    double[] tmp1378_1363 = tmp1363_1348;
    double[] tmp1378_1363 = tmp1363_1348;
    tmp1378_1363['¬'] = 41.520882981230194D;
    tmp1378_1363['­'] = 42.057134733170159D;
    double[] tmp1393_1378 = tmp1378_1363;
    double[] tmp1393_1378 = tmp1378_1363;
    tmp1393_1378['®'] = 42.597404951718396D;
    tmp1393_1378['¯'] = 43.141702194811224D;
    double[] tmp1408_1393 = tmp1393_1378;
    double[] tmp1408_1393 = tmp1393_1378;
    tmp1408_1393['°'] = 43.690034993191297D;
    tmp1408_1393['±'] = 44.242411850636969D;
    double[] tmp1423_1408 = tmp1408_1393;
    double[] tmp1423_1408 = tmp1408_1393;
    tmp1423_1408['²'] = 44.798841244188324D;
    tmp1423_1408['³'] = 45.359331624370171D;
    double[] tmp1438_1423 = tmp1423_1408;
    double[] tmp1438_1423 = tmp1423_1408;
    tmp1438_1423['´'] = 45.923891415412093D;
    tmp1438_1423['µ'] = 46.492529015465522D;
    double[] tmp1453_1438 = tmp1438_1423;
    double[] tmp1453_1438 = tmp1438_1423;
    tmp1453_1438['¶'] = 47.065252796817916D;
    tmp1453_1438['·'] = 47.64207110610409D;
    double[] tmp1468_1453 = tmp1453_1438;
    double[] tmp1468_1453 = tmp1453_1438;
    tmp1468_1453['¸'] = 48.22299226451468D;
    tmp1468_1453['¹'] = 48.808024568002054D;
    double[] tmp1483_1468 = tmp1468_1453;
    double[] tmp1483_1468 = tmp1468_1453;
    tmp1483_1468['º'] = 49.397176287483298D;
    tmp1483_1468['»'] = 49.990455669040799D;
    double[] tmp1498_1483 = tmp1483_1468;
    double[] tmp1498_1483 = tmp1483_1468;
    tmp1498_1483['¼'] = 50.587870934119984D;
    tmp1498_1483['½'] = 51.189430279724725D;
    double[] tmp1513_1498 = tmp1498_1483;
    double[] tmp1513_1498 = tmp1498_1483;
    tmp1513_1498['¾'] = 51.795141878610139D;
    tmp1513_1498['¿'] = 52.405013879472882D;
    double[] tmp1528_1513 = tmp1513_1498;
    double[] tmp1528_1513 = tmp1513_1498;
    tmp1528_1513['À'] = 53.019054407139201D;
    tmp1528_1513['Á'] = 53.637271562750364D;
    double[] tmp1543_1528 = tmp1528_1513;
    double[] tmp1543_1528 = tmp1528_1513;
    tmp1543_1528['Â'] = 54.259673423945976D;
    tmp1543_1528['Ã'] = 54.886268045044929D;
    double[] tmp1558_1543 = tmp1543_1528;
    double[] tmp1558_1543 = tmp1543_1528;
    tmp1558_1543['Ä'] = 55.517063457223934D;
    tmp1558_1543['Å'] = 56.152067668694237D;
    double[] tmp1573_1558 = tmp1558_1543;
    double[] tmp1573_1558 = tmp1558_1543;
    tmp1573_1558['Æ'] = 56.791288664875736D;
    tmp1573_1558['Ç'] = 57.434734408569163D;
    double[] tmp1588_1573 = tmp1573_1558;
    double[] tmp1588_1573 = tmp1573_1558;
    tmp1588_1573['È'] = 58.08241284012621D;
    tmp1588_1573['É'] = 58.734331877617365D;
    double[] tmp1603_1588 = tmp1588_1573;
    double[] tmp1603_1588 = tmp1588_1573;
    tmp1603_1588['Ê'] = 59.390499416998068D;
    tmp1603_1588['Ë'] = 60.050923332272511D;
    double[] tmp1618_1603 = tmp1603_1588;
    double[] tmp1618_1603 = tmp1603_1588;
    tmp1618_1603['Ì'] = 60.715611475655585D;
    tmp1618_1603['Í'] = 61.384571677733113D;
    double[] tmp1633_1618 = tmp1618_1603;
    double[] tmp1633_1618 = tmp1618_1603;
    tmp1633_1618['Î'] = 62.057811747619894D;
    tmp1633_1618['Ï'] = 62.7353394731159D;
    double[] tmp1648_1633 = tmp1633_1618;
    double[] tmp1648_1633 = tmp1633_1618;
    tmp1648_1633['Ð'] = 63.417162620860914D;
    tmp1648_1633['Ñ'] = 64.103288936486919D;
    double[] tmp1663_1648 = tmp1648_1633;
    double[] tmp1663_1648 = tmp1648_1633;
    tmp1663_1648['Ò'] = 64.793726144769209D;
    tmp1663_1648['Ó'] = 65.488481949775291D;
    double[] tmp1678_1663 = tmp1663_1648;
    double[] tmp1678_1663 = tmp1663_1648;
    tmp1678_1663['Ô'] = 66.187564035012244D;
    tmp1678_1663['Õ'] = 66.890980063572584D;
    double[] tmp1693_1678 = tmp1678_1663;
    double[] tmp1693_1678 = tmp1678_1663;
    tmp1693_1678['Ö'] = 67.598737678278084D;
    tmp1693_1678['×'] = 68.310844501822217D;
    double[] tmp1708_1693 = tmp1693_1678;
    double[] tmp1708_1693 = tmp1693_1678;
    tmp1708_1693['Ø'] = 69.027308136910932D;
    tmp1708_1693['Ù'] = 69.748136166401636D;
    double[] tmp1723_1708 = tmp1708_1693;
    double[] tmp1723_1708 = tmp1708_1693;
    tmp1723_1708['Ú'] = 70.473336153441068D;
    tmp1723_1708['Û'] = 71.202915641601038D;
    double[] tmp1738_1723 = tmp1723_1708;
    double[] tmp1738_1723 = tmp1723_1708;
    tmp1738_1723['Ü'] = 71.936882155013123D;
    tmp1738_1723['Ý'] = 72.675243198501718D;
    double[] tmp1753_1738 = tmp1738_1723;
    double[] tmp1753_1738 = tmp1738_1723;
    tmp1753_1738['Þ'] = 73.418006257715419D;
    tmp1753_1738['ß'] = 74.165178799257333D;
    double[] tmp1768_1753 = tmp1753_1738;
    double[] tmp1768_1753 = tmp1753_1738;
    tmp1768_1753['à'] = 74.916768270813606D;
    tmp1768_1753['á'] = 75.672782101280717D;
    double[] tmp1783_1768 = tmp1768_1753;
    double[] tmp1783_1768 = tmp1768_1753;
    tmp1783_1768['â'] = 76.433227700891464D;
    tmp1783_1768['ã'] = 77.198112461339306D;
    double[] tmp1798_1783 = tmp1783_1768;
    double[] tmp1798_1783 = tmp1783_1768;
    tmp1798_1783['ä'] = 77.96744375590167D;
    tmp1798_1783['å'] = 78.741228939561736D;
    double[] tmp1813_1798 = tmp1798_1783;
    double[] tmp1813_1798 = tmp1798_1783;
    tmp1813_1798['æ'] = 79.519475349129038D;
    tmp1813_1798['ç'] = 80.302190303358685D;
    double[] tmp1828_1813 = tmp1813_1798;
    double[] tmp1828_1813 = tmp1813_1798;
    tmp1828_1813['è'] = 81.089381103069343D;
    tmp1828_1813['é'] = 81.88105503125999D;
    double[] tmp1843_1828 = tmp1828_1813;
    double[] tmp1843_1828 = tmp1828_1813;
    tmp1843_1828['ê'] = 82.677219353225411D;
    tmp1843_1828['ë'] = 83.477881316670604D;
    double[] tmp1858_1843 = tmp1843_1828;
    double[] tmp1858_1843 = tmp1843_1828;
    tmp1858_1843['ì'] = 84.283048151823721D;
    tmp1858_1843['í'] = 85.092727071548083D;
    double[] tmp1873_1858 = tmp1858_1843;
    double[] tmp1873_1858 = tmp1858_1843;
    tmp1873_1858['î'] = 85.906925271453019D;
    tmp1873_1858['ï'] = 86.725649930003428D;
    double[] tmp1888_1873 = tmp1873_1858;
    double[] tmp1888_1873 = tmp1873_1858;
    tmp1888_1873['ð'] = 87.548908208628191D;
    tmp1888_1873['ñ'] = 88.376707251827696D;
    double[] tmp1903_1888 = tmp1888_1873;
    double[] tmp1903_1888 = tmp1888_1873;
    tmp1903_1888['ò'] = 89.209054187280103D;
    tmp1903_1888['ó'] = 90.045956125946546D;
    double[] tmp1918_1903 = tmp1903_1888;
    double[] tmp1918_1903 = tmp1903_1888;
    tmp1918_1903['ô'] = 90.887420162175175D;
    tmp1918_1903['õ'] = 91.73345337380438D;
    double[] tmp1933_1918 = tmp1918_1903;
    double[] tmp1933_1918 = tmp1918_1903;
    tmp1933_1918['ö'] = 92.584062822264912D;
    tmp1933_1918['÷'] = 93.439255552680663D;
    double[] tmp1948_1933 = tmp1933_1918;
    double[] tmp1948_1933 = tmp1933_1918;
    tmp1948_1933['ø'] = 94.299038593969016D;
    tmp1948_1933['ù'] = 95.163418958939687D;
    double[] tmp1963_1948 = tmp1948_1933;
    double[] tmp1963_1948 = tmp1948_1933;
    tmp1963_1948['ú'] = 96.032403644392744D;
    tmp1963_1948['û'] = 96.905999631215906D;
    tmp1963_1948['ü'] = 97.784213884480437D;
    double[] tmp1985_1963 = tmp1963_1948;
    tmp1985_1963['ý'] = 98.667053353536602D;
    tmp1985_1963['þ'] = 99.554524972107757D;
    CRITICAL_PLANES = arrayOfDouble2;
  }
  
  public static boolean areInCyclicOrder(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    paramDouble2 = sanitizeRadians(paramDouble2 - paramDouble1);
    paramDouble3 -= paramDouble1;
    paramDouble1 = sanitizeRadians(paramDouble3);
    boolean bool = paramDouble2 < paramDouble1;
    if (bool) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static double[] bisectToLimit(double paramDouble1, double paramDouble2)
  {
    Object localObject1 = bisectToSegment(paramDouble1, paramDouble2);
    Object localObject2 = localObject1[0];
    double d1 = hueOf((double[])localObject2);
    int i = 1;
    localObject1 = localObject1[i];
    int j = 0;
    for (;;)
    {
      int k = 3;
      if (j >= k) {
        break;
      }
      double d2 = localObject2[j];
      double d3 = localObject1[j];
      boolean bool2 = d2 < d3;
      if (bool2)
      {
        boolean bool3 = d2 < d3;
        d2 = trueDelinearized(d2);
        double d4;
        int n;
        if (bool3)
        {
          k = criticalPlaneBelow(d2);
          d4 = trueDelinearized(localObject1[j]);
          n = criticalPlaneAbove(d4);
        }
        else
        {
          k = criticalPlaneAbove(d2);
          d4 = trueDelinearized(localObject1[j]);
          n = criticalPlaneBelow(d4);
        }
        int i1 = 0;
        int i2 = k;
        int i3 = n;
        for (;;)
        {
          k = 8;
          if (i1 >= k) {
            break;
          }
          k = Math.abs(i3 - i2);
          if (k <= i) {
            break;
          }
          int m = (int)Math.floor((i2 + i3) / 2.0D);
          double[] arrayOfDouble1 = CRITICAL_PLANES;
          d2 = arrayOfDouble1[m];
          double[] arrayOfDouble2 = setCoordinate((double[])localObject2, d2, (double[])localObject1, j);
          double d5 = hueOf(arrayOfDouble2);
          d2 = d1;
          d3 = paramDouble2;
          boolean bool1 = areInCyclicOrder(d1, paramDouble2, d5);
          if (bool1)
          {
            localObject1 = arrayOfDouble2;
            i3 = m;
          }
          else
          {
            localObject2 = arrayOfDouble2;
            d1 = d5;
            i2 = m;
          }
          i1 += 1;
        }
      }
      j += 1;
    }
    return midpoint((double[])localObject2, (double[])localObject1);
  }
  
  public static double[][] bisectToSegment(double paramDouble1, double paramDouble2)
  {
    int i = 3;
    Object localObject1 = new double[i];
    Object tmp11_9 = localObject1;
    tmp11_9[0] = -1.0D;
    Object tmp17_11 = tmp11_9;
    tmp17_11[1] = -1.0D;
    tmp17_11[2] = -1.0D;
    double d1 = 0.0D;
    boolean bool1 = true;
    Object localObject2 = localObject1;
    double d2 = d1;
    double d3 = d1;
    int j = 0;
    int k = 0;
    boolean bool2 = bool1;
    for (;;)
    {
      int m = 12;
      if (j >= m) {
        break;
      }
      double[] arrayOfDouble = nthVertex(paramDouble1, j);
      double d4 = arrayOfDouble[0];
      boolean bool3 = d4 < d1;
      if (!bool3)
      {
        double d5 = hueOf(arrayOfDouble);
        if (k == 0)
        {
          k = bool1;
          localObject1 = arrayOfDouble;
          localObject2 = arrayOfDouble;
          d2 = d5;
          d3 = d5;
        }
        else if (!bool2)
        {
          d4 = d2;
          bool3 = areInCyclicOrder(d2, d5, d3);
          if (!bool3) {}
        }
        else
        {
          d4 = d2;
          bool2 = areInCyclicOrder(d2, paramDouble2, d5);
          if (bool2)
          {
            bool2 = false;
            localObject2 = arrayOfDouble;
            d3 = d5;
          }
          else
          {
            bool2 = false;
            localObject1 = arrayOfDouble;
            d2 = d5;
          }
        }
      }
      j += 1;
    }
    double[][] arrayOfDouble1 = new double[2][];
    arrayOfDouble1[0] = localObject1;
    arrayOfDouble1[bool1] = localObject2;
    return arrayOfDouble1;
  }
  
  public static double chromaticAdaptation(double paramDouble)
  {
    double d = Math.pow(Math.abs(paramDouble), 0.42D);
    paramDouble = MathUtils.signum(paramDouble) * 400.0D * d;
    d += 27.129999999999999D;
    return paramDouble / d;
  }
  
  public static int criticalPlaneAbove(double paramDouble)
  {
    return (int)Math.ceil(paramDouble - 0.5D);
  }
  
  public static int criticalPlaneBelow(double paramDouble)
  {
    return (int)Math.floor(paramDouble - 0.5D);
  }
  
  public static int findResultByJ(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d1 = Math.sqrt(paramDouble3);
    double d2 = 11.0D;
    d1 *= d2;
    ViewingConditions localViewingConditions = ViewingConditions.DEFAULT;
    double d3 = localViewingConditions.getN();
    d3 = Math.pow(0.29D, d3);
    d3 = Math.pow(1.64D - d3, 0.73D);
    double d4 = 1.0D;
    d3 = d4 / d3;
    double d5 = 2.0D;
    double d6 = (Math.cos(paramDouble1 + d5) + 3.8D) * 0.25D * 3846.1538461538462D;
    double d7 = localViewingConditions.getNc();
    d6 *= d7;
    d7 = localViewingConditions.getNcb();
    d6 *= d7;
    d7 = Math.sin(paramDouble1);
    double d8 = Math.cos(paramDouble1);
    int i = 0;
    label203:
    boolean bool2;
    int m;
    Object localObject;
    for (;;)
    {
      int j = 5;
      if (i >= j) {
        break label876;
      }
      d2 = d1 / 100.0D;
      double d9 = 0.0D;
      boolean bool1 = paramDouble2 < d9;
      if (bool1)
      {
        bool1 = d1 < d9;
        if (bool1)
        {
          d10 = Math.sqrt(d2);
          d10 = paramDouble2 / d10;
          break label203;
        }
      }
      double d10 = d9;
      d4 = d10 * d3;
      d10 = d3;
      d3 = Math.pow(d4, 1.111111111111111D);
      d4 = localViewingConditions.getAw();
      double d11 = localViewingConditions.getC();
      double d12 = 1.0D;
      d11 = d12 / d11;
      double d13 = localViewingConditions.getZ();
      paramDouble1 = d1;
      d1 = d11 / d13;
      d1 = Math.pow(d2, d1);
      d4 *= d1;
      d1 = localViewingConditions.getNbb();
      d4 /= d1;
      d1 = 0.305D + d4;
      d2 = 23.0D;
      d1 = d1 * d2 * d3;
      d2 *= d6;
      double d14 = 11.0D;
      d11 = d3 * d14 * d8;
      d2 += d11;
      d3 = d3 * 108.0D * d7;
      d2 += d3;
      d1 /= d2;
      d2 = d1 * d8;
      d1 *= d7;
      d4 *= 460.0D;
      d3 = 451.0D * d2 + d4;
      d11 = 288.0D * d1;
      d3 += d11;
      d11 = 1403.0D;
      d3 /= d11;
      d13 = 891.0D * d2;
      d13 = d4 - d13;
      double d15 = 261.0D * d1;
      d13 = (d13 - d15) / d11;
      d15 = 220.0D;
      d2 *= d15;
      d4 -= d2;
      d1 *= 6300.0D;
      d4 = (d4 - d1) / d11;
      d1 = inverseChromaticAdaptation(d3);
      d2 = inverseChromaticAdaptation(d13);
      d3 = inverseChromaticAdaptation(d4);
      int k = 3;
      double[] arrayOfDouble1 = new double[k];
      arrayOfDouble1[0] = d1;
      bool2 = true;
      arrayOfDouble1[bool2] = d2;
      m = 2;
      arrayOfDouble1[m] = d3;
      localObject = LINRGB_FROM_SCALED_DISCOUNT;
      localObject = MathUtils.matrixMultiply(arrayOfDouble1, (double[][])localObject);
      d3 = localObject[0];
      boolean bool3 = d3 < d9;
      if (bool3) {
        break label876;
      }
      d4 = localObject[bool2];
      bool3 = d4 < d9;
      if (bool3) {
        break label876;
      }
      d11 = localObject[m];
      bool3 = d11 < d9;
      if (bool3) {
        break label876;
      }
      double[] arrayOfDouble2 = Y_FROM_LINRGB;
      d13 = arrayOfDouble2[0];
      d15 = arrayOfDouble2[bool2];
      double d16 = arrayOfDouble2[m];
      d13 *= d3;
      d15 *= d4;
      d13 += d15;
      d16 *= d11;
      d13 += d16;
      bool3 = d13 < d9;
      if (!bool3) {
        return 0;
      }
      int n = 4;
      if (i == n) {
        break;
      }
      d3 = d13 - paramDouble3;
      d4 = Math.abs(d3);
      d9 = 0.002D;
      bool4 = d4 < d9;
      if (bool4) {
        break;
      }
      d4 = paramDouble1;
      d3 *= paramDouble1;
      double d17 = 2.0D;
      d13 *= d17;
      d3 /= d13;
      d1 = paramDouble1 - d3;
      i += 1;
      d2 = d14;
      d3 = d10;
      d4 = d12;
    }
    double d18 = localObject[0];
    d3 = 100.01000000000001D;
    boolean bool4 = d18 < d3;
    if (!bool4)
    {
      d18 = localObject[bool2];
      bool2 = d18 < d3;
      if (!bool2)
      {
        d1 = localObject[m];
        bool2 = d1 < d3;
        if (!bool2) {
          return ColorUtils.argbFromLinrgb((double[])localObject);
        }
      }
    }
    label876:
    return 0;
  }
  
  public static double hueOf(double[] paramArrayOfDouble)
  {
    double[][] arrayOfDouble = SCALED_DISCOUNT_FROM_LINRGB;
    paramArrayOfDouble = MathUtils.matrixMultiply(paramArrayOfDouble, arrayOfDouble);
    double d1 = chromaticAdaptation(paramArrayOfDouble[0]);
    double d2 = chromaticAdaptation(paramArrayOfDouble[1]);
    double d3 = chromaticAdaptation(paramArrayOfDouble[2]);
    double d4 = 11.0D;
    double d5 = d1 * d4;
    double d6 = -12.0D * d2;
    d5 = (d5 + d6 + d3) / d4;
    d1 += d2;
    d3 *= 2.0D;
    return Math.atan2((d1 - d3) / 9.0D, d5);
  }
  
  public static double intercept(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    paramDouble2 -= paramDouble1;
    paramDouble3 -= paramDouble1;
    return paramDouble2 / paramDouble3;
  }
  
  public static double inverseChromaticAdaptation(double paramDouble)
  {
    double d1 = Math.abs(paramDouble);
    double d2 = 27.129999999999999D * d1;
    double d3 = 400.0D - d1;
    d2 /= d3;
    d1 = Math.max(0.0D, d2);
    paramDouble = MathUtils.signum(paramDouble);
    d1 = Math.pow(d1, 2.380952380952381D);
    return paramDouble * d1;
  }
  
  public static boolean isBounded(double paramDouble)
  {
    double d = 0.0D;
    boolean bool1 = d < paramDouble;
    if (!bool1)
    {
      d = 100.0D;
      bool2 = paramDouble < d;
      if (!bool2)
      {
        bool2 = true;
        break label35;
      }
    }
    boolean bool2 = false;
    label35:
    return bool2;
  }
  
  public static double[] lerpPoint(double[] paramArrayOfDouble1, double paramDouble, double[] paramArrayOfDouble2)
  {
    double[] arrayOfDouble = new double[3];
    double d1 = paramArrayOfDouble1[0];
    double d2 = (paramArrayOfDouble2[0] - d1) * paramDouble;
    d1 += d2;
    arrayOfDouble[0] = d1;
    int i = 1;
    d1 = paramArrayOfDouble1[i];
    d2 = (paramArrayOfDouble2[i] - d1) * paramDouble;
    d1 += d2;
    arrayOfDouble[i] = d1;
    i = 2;
    d1 = paramArrayOfDouble1[i];
    d2 = (paramArrayOfDouble2[i] - d1) * paramDouble;
    d1 += d2;
    arrayOfDouble[i] = d1;
    return arrayOfDouble;
  }
  
  public static double[] midpoint(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    double[] arrayOfDouble = new double[3];
    double d1 = paramArrayOfDouble1[0];
    double d2 = paramArrayOfDouble2[0];
    d1 += d2;
    d2 = 2.0D;
    d1 /= d2;
    arrayOfDouble[0] = d1;
    int i = 1;
    d1 = paramArrayOfDouble1[i];
    double d3 = paramArrayOfDouble2[i];
    d1 = (d1 + d3) / d2;
    arrayOfDouble[i] = d1;
    i = 2;
    d1 = paramArrayOfDouble1[i];
    double d4 = paramArrayOfDouble2[i];
    d1 = (d1 + d4) / d2;
    arrayOfDouble[i] = d1;
    return arrayOfDouble;
  }
  
  public static double[] nthVertex(double paramDouble, int paramInt)
  {
    int i = paramInt;
    double[] arrayOfDouble1 = Y_FROM_LINRGB;
    double d1 = arrayOfDouble1[0];
    int k = 1;
    double d2 = arrayOfDouble1[k];
    int m = 2;
    double d3 = arrayOfDouble1[m];
    int n = paramInt % 4;
    double d4 = 0.0D;
    long l = 4636737291354636288L;
    double d5 = 100.0D;
    double d6;
    if (n <= k) {
      d6 = d4;
    } else {
      d6 = d5;
    }
    n = i % 2;
    if (n != 0) {
      d4 = d5;
    }
    n = 3;
    int i1 = 4;
    if (i < i1)
    {
      d2 *= d6;
      d2 = paramDouble - d2;
      d3 *= d4;
      d2 = (d2 - d3) / d1;
      j = isBounded(d2);
      if (j != 0)
      {
        arrayOfDouble2 = new double[n];
        arrayOfDouble2[0] = d2;
        arrayOfDouble2[k] = d6;
        arrayOfDouble2[m] = d4;
        return arrayOfDouble2;
      }
      arrayOfDouble2 = new double[n];
      double[] tmp175_173 = arrayOfDouble2;
      tmp175_173[0] = -1.0D;
      double[] tmp181_175 = tmp175_173;
      tmp181_175[1] = -1.0D;
      tmp181_175[2] = -1.0D;
      return arrayOfDouble2;
    }
    i1 = 8;
    if (j < i1)
    {
      d1 *= d4;
      d1 = paramDouble - d1;
      d3 *= d6;
      d1 = (d1 - d3) / d2;
      j = isBounded(d1);
      if (j != 0)
      {
        arrayOfDouble2 = new double[n];
        arrayOfDouble2[0] = d4;
        arrayOfDouble2[k] = d1;
        arrayOfDouble2[m] = d6;
        return arrayOfDouble2;
      }
      arrayOfDouble2 = new double[n];
      double[] tmp282_280 = arrayOfDouble2;
      tmp282_280[0] = -1.0D;
      double[] tmp288_282 = tmp282_280;
      tmp288_282[1] = -1.0D;
      tmp288_282[2] = -1.0D;
      return arrayOfDouble2;
    }
    d1 *= tmp288_282;
    d1 = paramDouble - d1;
    d2 *= d4;
    d1 = (d1 - d2) / d3;
    int j = isBounded(d1);
    if (j != 0)
    {
      arrayOfDouble2 = new double[n];
      arrayOfDouble2[0] = tmp288_282;
      arrayOfDouble2[k] = d4;
      arrayOfDouble2[m] = d1;
      return arrayOfDouble2;
    }
    double[] arrayOfDouble2 = new double[n];
    double[] tmp379_377 = arrayOfDouble2;
    tmp379_377[0] = -1.0D;
    double[] tmp385_379 = tmp379_377;
    tmp385_379[1] = -1.0D;
    tmp385_379[2] = -1.0D;
    return arrayOfDouble2;
  }
  
  public static double sanitizeRadians(double paramDouble)
  {
    return (paramDouble + 25.132741228718345D) % 6.283185307179586D;
  }
  
  public static double[] setCoordinate(double[] paramArrayOfDouble1, double paramDouble, double[] paramArrayOfDouble2, int paramInt)
  {
    double d1 = paramArrayOfDouble1[paramInt];
    double d2 = paramArrayOfDouble2[paramInt];
    paramDouble = intercept(d1, paramDouble, d2);
    return lerpPoint(paramArrayOfDouble1, paramDouble, paramArrayOfDouble2);
  }
  
  public static Cam16 solveToCam(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    return Cam16.fromInt(solveToInt(paramDouble1, paramDouble2, paramDouble3));
  }
  
  public static int solveToInt(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d = 0.0001D;
    boolean bool1 = paramDouble2 < d;
    if (!bool1)
    {
      boolean bool2 = paramDouble3 < d;
      if (!bool2)
      {
        d = 99.999899999999997D;
        bool2 = paramDouble3 < d;
        if (!bool2)
        {
          paramDouble1 = MathUtils.sanitizeDegreesDouble(paramDouble1) / 180.0D;
          d = 3.141592653589793D;
          paramDouble1 *= d;
          paramDouble3 = ColorUtils.yFromLstar(paramDouble3);
          int i = findResultByJ(paramDouble1, paramDouble2, paramDouble3);
          if (i != 0) {
            return i;
          }
          return ColorUtils.argbFromLinrgb(bisectToLimit(paramDouble3, paramDouble1));
        }
      }
    }
    return ColorUtils.argbFromLstar(paramDouble3);
  }
  
  public static double trueDelinearized(double paramDouble)
  {
    paramDouble /= 100.0D;
    double d = 0.0031308D;
    boolean bool = paramDouble < d;
    if (!bool)
    {
      d = 12.92D;
      paramDouble *= d;
    }
    else
    {
      paramDouble = Math.pow(paramDouble, 0.4166666666666667D) * 1.055D;
      d = 0.055D;
      paramDouble -= d;
    }
    return paramDouble * 255.0D;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.HctSolver
 * JD-Core Version:    0.7.0.1
 */