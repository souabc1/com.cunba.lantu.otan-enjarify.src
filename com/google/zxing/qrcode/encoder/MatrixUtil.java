package com.google.zxing.qrcode.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Version;
import m54207b69;

final class MatrixUtil
{
  private static final int[][] POSITION_ADJUSTMENT_PATTERN;
  private static final int[][] POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE;
  private static final int[][] POSITION_DETECTION_PATTERN;
  private static final int[][] TYPE_INFO_COORDINATES;
  private static final int TYPE_INFO_MASK_PATTERN = 21522;
  private static final int TYPE_INFO_POLY = 1335;
  private static final int VERSION_INFO_POLY = 7973;
  
  static
  {
    int i = 7;
    int[][] arrayOfInt = new int[i][];
    int[] arrayOfInt1 = new int[i];
    int[] tmp13_12 = arrayOfInt1;
    int[] tmp14_13 = tmp13_12;
    int[] tmp14_13 = tmp13_12;
    tmp14_13[0] = 1;
    tmp14_13[1] = 1;
    int[] tmp21_14 = tmp14_13;
    int[] tmp21_14 = tmp14_13;
    tmp21_14[2] = 1;
    tmp21_14[3] = 1;
    tmp21_14[4] = 1;
    int[] tmp31_21 = tmp21_14;
    tmp31_21[5] = 1;
    tmp31_21[6] = 1;
    arrayOfInt[0] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp48_47 = arrayOfInt1;
    int[] tmp49_48 = tmp48_47;
    int[] tmp49_48 = tmp48_47;
    tmp49_48[0] = 1;
    tmp49_48[1] = 0;
    int[] tmp56_49 = tmp49_48;
    int[] tmp56_49 = tmp49_48;
    tmp56_49[2] = 0;
    tmp56_49[3] = 0;
    tmp56_49[4] = 0;
    int[] tmp66_56 = tmp56_49;
    tmp66_56[5] = 0;
    tmp66_56[6] = 1;
    int j = 1;
    arrayOfInt[j] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp85_84 = arrayOfInt1;
    int[] tmp86_85 = tmp85_84;
    int[] tmp86_85 = tmp85_84;
    tmp86_85[0] = 1;
    tmp86_85[1] = 0;
    int[] tmp93_86 = tmp86_85;
    int[] tmp93_86 = tmp86_85;
    tmp93_86[2] = 1;
    tmp93_86[3] = 1;
    tmp93_86[4] = 1;
    int[] tmp103_93 = tmp93_86;
    tmp103_93[5] = 0;
    tmp103_93[6] = 1;
    int k = 2;
    arrayOfInt[k] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp124_123 = arrayOfInt1;
    int[] tmp125_124 = tmp124_123;
    int[] tmp125_124 = tmp124_123;
    tmp125_124[0] = 1;
    tmp125_124[1] = 0;
    int[] tmp132_125 = tmp125_124;
    int[] tmp132_125 = tmp125_124;
    tmp132_125[2] = 1;
    tmp132_125[3] = 1;
    tmp132_125[4] = 1;
    int[] tmp142_132 = tmp132_125;
    tmp142_132[5] = 0;
    tmp142_132[6] = 1;
    int m = 3;
    arrayOfInt[m] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp163_162 = arrayOfInt1;
    int[] tmp164_163 = tmp163_162;
    int[] tmp164_163 = tmp163_162;
    tmp164_163[0] = 1;
    tmp164_163[1] = 0;
    int[] tmp171_164 = tmp164_163;
    int[] tmp171_164 = tmp164_163;
    tmp171_164[2] = 1;
    tmp171_164[3] = 1;
    tmp171_164[4] = 1;
    int[] tmp181_171 = tmp171_164;
    tmp181_171[5] = 0;
    tmp181_171[6] = 1;
    int n = 4;
    arrayOfInt[n] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp202_201 = arrayOfInt1;
    int[] tmp203_202 = tmp202_201;
    int[] tmp203_202 = tmp202_201;
    tmp203_202[0] = 1;
    tmp203_202[1] = 0;
    int[] tmp210_203 = tmp203_202;
    int[] tmp210_203 = tmp203_202;
    tmp210_203[2] = 0;
    tmp210_203[3] = 0;
    tmp210_203[4] = 0;
    int[] tmp220_210 = tmp210_203;
    tmp220_210[5] = 0;
    tmp220_210[6] = 1;
    int i1 = 5;
    arrayOfInt[i1] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp241_240 = arrayOfInt1;
    int[] tmp242_241 = tmp241_240;
    int[] tmp242_241 = tmp241_240;
    tmp242_241[0] = 1;
    tmp242_241[1] = 1;
    int[] tmp249_242 = tmp242_241;
    int[] tmp249_242 = tmp242_241;
    tmp249_242[2] = 1;
    tmp249_242[3] = 1;
    tmp249_242[4] = 1;
    int[] tmp259_249 = tmp249_242;
    tmp259_249[5] = 1;
    tmp259_249[6] = 1;
    int i2 = 6;
    arrayOfInt[i2] = arrayOfInt1;
    POSITION_DETECTION_PATTERN = arrayOfInt;
    arrayOfInt = new int[i1][];
    int[] tmp289_287 = new int[5];
    int[] tmp290_289 = tmp289_287;
    int[] tmp290_289 = tmp289_287;
    tmp290_289[0] = j;
    tmp290_289[1] = j;
    int[] tmp297_290 = tmp290_289;
    int[] tmp297_290 = tmp290_289;
    tmp297_290[2] = j;
    tmp297_290[3] = j;
    tmp297_290[4] = j;
    arrayOfInt1 = tmp297_290;
    arrayOfInt[0] = arrayOfInt1;
    int[] tmp315_313 = new int[5];
    int[] tmp316_315 = tmp315_313;
    int[] tmp316_315 = tmp315_313;
    tmp316_315[0] = j;
    tmp316_315[1] = 0;
    int[] tmp323_316 = tmp316_315;
    int[] tmp323_316 = tmp316_315;
    tmp323_316[2] = 0;
    tmp323_316[3] = 0;
    tmp323_316[4] = j;
    arrayOfInt1 = tmp323_316;
    arrayOfInt[j] = arrayOfInt1;
    int[] tmp341_339 = new int[5];
    int[] tmp342_341 = tmp341_339;
    int[] tmp342_341 = tmp341_339;
    tmp342_341[0] = j;
    tmp342_341[1] = 0;
    int[] tmp349_342 = tmp342_341;
    int[] tmp349_342 = tmp342_341;
    tmp349_342[2] = j;
    tmp349_342[3] = 0;
    tmp349_342[4] = j;
    arrayOfInt1 = tmp349_342;
    arrayOfInt[k] = arrayOfInt1;
    int[] tmp368_366 = new int[5];
    int[] tmp369_368 = tmp368_366;
    int[] tmp369_368 = tmp368_366;
    tmp369_368[0] = j;
    tmp369_368[1] = 0;
    int[] tmp376_369 = tmp369_368;
    int[] tmp376_369 = tmp369_368;
    tmp376_369[2] = 0;
    tmp376_369[3] = 0;
    tmp376_369[4] = j;
    arrayOfInt1 = tmp376_369;
    arrayOfInt[m] = arrayOfInt1;
    int[] tmp395_393 = new int[5];
    int[] tmp396_395 = tmp395_393;
    int[] tmp396_395 = tmp395_393;
    tmp396_395[0] = j;
    tmp396_395[1] = j;
    int[] tmp403_396 = tmp396_395;
    int[] tmp403_396 = tmp396_395;
    tmp403_396[2] = j;
    tmp403_396[3] = j;
    tmp403_396[4] = j;
    arrayOfInt1 = tmp403_396;
    arrayOfInt[n] = arrayOfInt1;
    POSITION_ADJUSTMENT_PATTERN = arrayOfInt;
    arrayOfInt = new int[40][];
    arrayOfInt1 = new int[i];
    int[] tmp434_433 = arrayOfInt1;
    int[] tmp435_434 = tmp434_433;
    int[] tmp435_434 = tmp434_433;
    tmp435_434[0] = -1;
    tmp435_434[1] = -1;
    int[] tmp442_435 = tmp435_434;
    int[] tmp442_435 = tmp435_434;
    tmp442_435[2] = -1;
    tmp442_435[3] = -1;
    tmp442_435[4] = -1;
    int[] tmp452_442 = tmp442_435;
    tmp452_442[5] = -1;
    tmp452_442[6] = -1;
    arrayOfInt[0] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp469_468 = arrayOfInt1;
    int[] tmp470_469 = tmp469_468;
    int[] tmp470_469 = tmp469_468;
    tmp470_469[0] = 6;
    tmp470_469[1] = 18;
    int[] tmp479_470 = tmp470_469;
    int[] tmp479_470 = tmp470_469;
    tmp479_470[2] = -1;
    tmp479_470[3] = -1;
    tmp479_470[4] = -1;
    int[] tmp489_479 = tmp479_470;
    tmp489_479[5] = -1;
    tmp489_479[6] = -1;
    arrayOfInt[j] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp506_505 = arrayOfInt1;
    int[] tmp507_506 = tmp506_505;
    int[] tmp507_506 = tmp506_505;
    tmp507_506[0] = 6;
    tmp507_506[1] = 22;
    int[] tmp516_507 = tmp507_506;
    int[] tmp516_507 = tmp507_506;
    tmp516_507[2] = -1;
    tmp516_507[3] = -1;
    tmp516_507[4] = -1;
    int[] tmp526_516 = tmp516_507;
    tmp526_516[5] = -1;
    tmp526_516[6] = -1;
    arrayOfInt[k] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp544_543 = arrayOfInt1;
    int[] tmp545_544 = tmp544_543;
    int[] tmp545_544 = tmp544_543;
    tmp545_544[0] = 6;
    tmp545_544[1] = 26;
    int[] tmp554_545 = tmp545_544;
    int[] tmp554_545 = tmp545_544;
    tmp554_545[2] = -1;
    tmp554_545[3] = -1;
    tmp554_545[4] = -1;
    int[] tmp564_554 = tmp554_545;
    tmp564_554[5] = -1;
    tmp564_554[6] = -1;
    arrayOfInt[m] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp582_581 = arrayOfInt1;
    int[] tmp583_582 = tmp582_581;
    int[] tmp583_582 = tmp582_581;
    tmp583_582[0] = 6;
    tmp583_582[1] = 30;
    int[] tmp592_583 = tmp583_582;
    int[] tmp592_583 = tmp583_582;
    tmp592_583[2] = -1;
    tmp592_583[3] = -1;
    tmp592_583[4] = -1;
    int[] tmp602_592 = tmp592_583;
    tmp602_592[5] = -1;
    tmp602_592[6] = -1;
    arrayOfInt[n] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp620_619 = arrayOfInt1;
    int[] tmp621_620 = tmp620_619;
    int[] tmp621_620 = tmp620_619;
    tmp621_620[0] = 6;
    tmp621_620[1] = 34;
    int[] tmp630_621 = tmp621_620;
    int[] tmp630_621 = tmp621_620;
    tmp630_621[2] = -1;
    tmp630_621[3] = -1;
    tmp630_621[4] = -1;
    int[] tmp640_630 = tmp630_621;
    tmp640_630[5] = -1;
    tmp640_630[6] = -1;
    arrayOfInt[i1] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp658_657 = arrayOfInt1;
    int[] tmp659_658 = tmp658_657;
    int[] tmp659_658 = tmp658_657;
    tmp659_658[0] = 6;
    tmp659_658[1] = 22;
    int[] tmp668_659 = tmp659_658;
    int[] tmp668_659 = tmp659_658;
    tmp668_659[2] = 38;
    tmp668_659[3] = -1;
    tmp668_659[4] = -1;
    int[] tmp679_668 = tmp668_659;
    tmp679_668[5] = -1;
    tmp679_668[6] = -1;
    arrayOfInt[i2] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp697_696 = arrayOfInt1;
    int[] tmp698_697 = tmp697_696;
    int[] tmp698_697 = tmp697_696;
    tmp698_697[0] = 6;
    tmp698_697[1] = 24;
    int[] tmp707_698 = tmp698_697;
    int[] tmp707_698 = tmp698_697;
    tmp707_698[2] = 42;
    tmp707_698[3] = -1;
    tmp707_698[4] = -1;
    int[] tmp718_707 = tmp707_698;
    tmp718_707[5] = -1;
    tmp718_707[6] = -1;
    arrayOfInt[i] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp735_734 = arrayOfInt1;
    int[] tmp736_735 = tmp735_734;
    int[] tmp736_735 = tmp735_734;
    tmp736_735[0] = 6;
    tmp736_735[1] = 26;
    int[] tmp745_736 = tmp736_735;
    int[] tmp745_736 = tmp736_735;
    tmp745_736[2] = 46;
    tmp745_736[3] = -1;
    tmp745_736[4] = -1;
    int[] tmp756_745 = tmp745_736;
    tmp756_745[5] = -1;
    tmp756_745[6] = -1;
    int i3 = 8;
    arrayOfInt[i3] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp778_777 = arrayOfInt1;
    int[] tmp779_778 = tmp778_777;
    int[] tmp779_778 = tmp778_777;
    tmp779_778[0] = 6;
    tmp779_778[1] = 28;
    int[] tmp788_779 = tmp779_778;
    int[] tmp788_779 = tmp779_778;
    tmp788_779[2] = 50;
    tmp788_779[3] = -1;
    tmp788_779[4] = -1;
    int[] tmp799_788 = tmp788_779;
    tmp799_788[5] = -1;
    tmp799_788[6] = -1;
    int i4 = 9;
    arrayOfInt[i4] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp821_820 = arrayOfInt1;
    int[] tmp822_821 = tmp821_820;
    int[] tmp822_821 = tmp821_820;
    tmp822_821[0] = 6;
    tmp822_821[1] = 30;
    int[] tmp831_822 = tmp822_821;
    int[] tmp831_822 = tmp822_821;
    tmp831_822[2] = 54;
    tmp831_822[3] = -1;
    tmp831_822[4] = -1;
    int[] tmp842_831 = tmp831_822;
    tmp842_831[5] = -1;
    tmp842_831[6] = -1;
    int i5 = 10;
    arrayOfInt[i5] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp864_863 = arrayOfInt1;
    int[] tmp865_864 = tmp864_863;
    int[] tmp865_864 = tmp864_863;
    tmp865_864[0] = 6;
    tmp865_864[1] = 32;
    int[] tmp874_865 = tmp865_864;
    int[] tmp874_865 = tmp865_864;
    tmp874_865[2] = 58;
    tmp874_865[3] = -1;
    tmp874_865[4] = -1;
    int[] tmp885_874 = tmp874_865;
    tmp885_874[5] = -1;
    tmp885_874[6] = -1;
    int i6 = 11;
    arrayOfInt[i6] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp907_906 = arrayOfInt1;
    int[] tmp908_907 = tmp907_906;
    int[] tmp908_907 = tmp907_906;
    tmp908_907[0] = 6;
    tmp908_907[1] = 34;
    int[] tmp917_908 = tmp908_907;
    int[] tmp917_908 = tmp908_907;
    tmp917_908[2] = 62;
    tmp917_908[3] = -1;
    tmp917_908[4] = -1;
    int[] tmp928_917 = tmp917_908;
    tmp928_917[5] = -1;
    tmp928_917[6] = -1;
    int i7 = 12;
    arrayOfInt[i7] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp950_949 = arrayOfInt1;
    int[] tmp951_950 = tmp950_949;
    int[] tmp951_950 = tmp950_949;
    tmp951_950[0] = 6;
    tmp951_950[1] = 26;
    int[] tmp960_951 = tmp951_950;
    int[] tmp960_951 = tmp951_950;
    tmp960_951[2] = 46;
    tmp960_951[3] = 66;
    tmp960_951[4] = -1;
    int[] tmp972_960 = tmp960_951;
    tmp972_960[5] = -1;
    tmp972_960[6] = -1;
    arrayOfInt[13] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp990_989 = arrayOfInt1;
    int[] tmp991_990 = tmp990_989;
    int[] tmp991_990 = tmp990_989;
    tmp991_990[0] = 6;
    tmp991_990[1] = 26;
    int[] tmp1000_991 = tmp991_990;
    int[] tmp1000_991 = tmp991_990;
    tmp1000_991[2] = 48;
    tmp1000_991[3] = 70;
    tmp1000_991[4] = -1;
    int[] tmp1012_1000 = tmp1000_991;
    tmp1012_1000[5] = -1;
    tmp1012_1000[6] = -1;
    int i8 = 14;
    arrayOfInt[i8] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1034_1033 = arrayOfInt1;
    int[] tmp1035_1034 = tmp1034_1033;
    int[] tmp1035_1034 = tmp1034_1033;
    tmp1035_1034[0] = 6;
    tmp1035_1034[1] = 26;
    int[] tmp1044_1035 = tmp1035_1034;
    int[] tmp1044_1035 = tmp1035_1034;
    tmp1044_1035[2] = 50;
    tmp1044_1035[3] = 74;
    tmp1044_1035[4] = -1;
    int[] tmp1056_1044 = tmp1044_1035;
    tmp1056_1044[5] = -1;
    tmp1056_1044[6] = -1;
    int i9 = 15;
    arrayOfInt[i9] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1078_1077 = arrayOfInt1;
    int[] tmp1079_1078 = tmp1078_1077;
    int[] tmp1079_1078 = tmp1078_1077;
    tmp1079_1078[0] = 6;
    tmp1079_1078[1] = 30;
    int[] tmp1088_1079 = tmp1079_1078;
    int[] tmp1088_1079 = tmp1079_1078;
    tmp1088_1079[2] = 54;
    tmp1088_1079[3] = 78;
    tmp1088_1079[4] = -1;
    int[] tmp1100_1088 = tmp1088_1079;
    tmp1100_1088[5] = -1;
    tmp1100_1088[6] = -1;
    arrayOfInt[16] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1118_1117 = arrayOfInt1;
    int[] tmp1119_1118 = tmp1118_1117;
    int[] tmp1119_1118 = tmp1118_1117;
    tmp1119_1118[0] = 6;
    tmp1119_1118[1] = 30;
    int[] tmp1128_1119 = tmp1119_1118;
    int[] tmp1128_1119 = tmp1119_1118;
    tmp1128_1119[2] = 56;
    tmp1128_1119[3] = 82;
    tmp1128_1119[4] = -1;
    int[] tmp1140_1128 = tmp1128_1119;
    tmp1140_1128[5] = -1;
    tmp1140_1128[6] = -1;
    arrayOfInt[17] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1158_1157 = arrayOfInt1;
    int[] tmp1159_1158 = tmp1158_1157;
    int[] tmp1159_1158 = tmp1158_1157;
    tmp1159_1158[0] = 6;
    tmp1159_1158[1] = 30;
    int[] tmp1168_1159 = tmp1159_1158;
    int[] tmp1168_1159 = tmp1159_1158;
    tmp1168_1159[2] = 58;
    tmp1168_1159[3] = 86;
    tmp1168_1159[4] = -1;
    int[] tmp1180_1168 = tmp1168_1159;
    tmp1180_1168[5] = -1;
    tmp1180_1168[6] = -1;
    arrayOfInt[18] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1198_1197 = arrayOfInt1;
    int[] tmp1199_1198 = tmp1198_1197;
    int[] tmp1199_1198 = tmp1198_1197;
    tmp1199_1198[0] = 6;
    tmp1199_1198[1] = 34;
    int[] tmp1208_1199 = tmp1199_1198;
    int[] tmp1208_1199 = tmp1199_1198;
    tmp1208_1199[2] = 62;
    tmp1208_1199[3] = 90;
    tmp1208_1199[4] = -1;
    int[] tmp1220_1208 = tmp1208_1199;
    tmp1220_1208[5] = -1;
    tmp1220_1208[6] = -1;
    arrayOfInt[19] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1238_1237 = arrayOfInt1;
    int[] tmp1239_1238 = tmp1238_1237;
    int[] tmp1239_1238 = tmp1238_1237;
    tmp1239_1238[0] = 6;
    tmp1239_1238[1] = 28;
    int[] tmp1248_1239 = tmp1239_1238;
    int[] tmp1248_1239 = tmp1239_1238;
    tmp1248_1239[2] = 50;
    tmp1248_1239[3] = 72;
    tmp1248_1239[4] = 94;
    int[] tmp1261_1248 = tmp1248_1239;
    tmp1261_1248[5] = -1;
    tmp1261_1248[6] = -1;
    arrayOfInt[20] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1279_1278 = arrayOfInt1;
    int[] tmp1280_1279 = tmp1279_1278;
    int[] tmp1280_1279 = tmp1279_1278;
    tmp1280_1279[0] = 6;
    tmp1280_1279[1] = 26;
    int[] tmp1289_1280 = tmp1280_1279;
    int[] tmp1289_1280 = tmp1280_1279;
    tmp1289_1280[2] = 50;
    tmp1289_1280[3] = 74;
    tmp1289_1280[4] = 98;
    int[] tmp1302_1289 = tmp1289_1280;
    tmp1302_1289[5] = -1;
    tmp1302_1289[6] = -1;
    arrayOfInt[21] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1320_1319 = arrayOfInt1;
    int[] tmp1321_1320 = tmp1320_1319;
    int[] tmp1321_1320 = tmp1320_1319;
    tmp1321_1320[0] = 6;
    tmp1321_1320[1] = 30;
    int[] tmp1330_1321 = tmp1321_1320;
    int[] tmp1330_1321 = tmp1321_1320;
    tmp1330_1321[2] = 54;
    tmp1330_1321[3] = 78;
    tmp1330_1321[4] = 102;
    int[] tmp1343_1330 = tmp1330_1321;
    tmp1343_1330[5] = -1;
    tmp1343_1330[6] = -1;
    arrayOfInt[22] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1361_1360 = arrayOfInt1;
    int[] tmp1362_1361 = tmp1361_1360;
    int[] tmp1362_1361 = tmp1361_1360;
    tmp1362_1361[0] = 6;
    tmp1362_1361[1] = 28;
    int[] tmp1371_1362 = tmp1362_1361;
    int[] tmp1371_1362 = tmp1362_1361;
    tmp1371_1362[2] = 54;
    tmp1371_1362[3] = 80;
    tmp1371_1362[4] = 106;
    int[] tmp1384_1371 = tmp1371_1362;
    tmp1384_1371[5] = -1;
    tmp1384_1371[6] = -1;
    arrayOfInt[23] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1402_1401 = arrayOfInt1;
    int[] tmp1403_1402 = tmp1402_1401;
    int[] tmp1403_1402 = tmp1402_1401;
    tmp1403_1402[0] = 6;
    tmp1403_1402[1] = 32;
    int[] tmp1412_1403 = tmp1403_1402;
    int[] tmp1412_1403 = tmp1403_1402;
    tmp1412_1403[2] = 58;
    tmp1412_1403[3] = 84;
    tmp1412_1403[4] = 110;
    int[] tmp1425_1412 = tmp1412_1403;
    tmp1425_1412[5] = -1;
    tmp1425_1412[6] = -1;
    arrayOfInt[24] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1443_1442 = arrayOfInt1;
    int[] tmp1444_1443 = tmp1443_1442;
    int[] tmp1444_1443 = tmp1443_1442;
    tmp1444_1443[0] = 6;
    tmp1444_1443[1] = 30;
    int[] tmp1453_1444 = tmp1444_1443;
    int[] tmp1453_1444 = tmp1444_1443;
    tmp1453_1444[2] = 58;
    tmp1453_1444[3] = 86;
    tmp1453_1444[4] = 114;
    int[] tmp1466_1453 = tmp1453_1444;
    tmp1466_1453[5] = -1;
    tmp1466_1453[6] = -1;
    arrayOfInt[25] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1484_1483 = arrayOfInt1;
    int[] tmp1485_1484 = tmp1484_1483;
    int[] tmp1485_1484 = tmp1484_1483;
    tmp1485_1484[0] = 6;
    tmp1485_1484[1] = 34;
    int[] tmp1494_1485 = tmp1485_1484;
    int[] tmp1494_1485 = tmp1485_1484;
    tmp1494_1485[2] = 62;
    tmp1494_1485[3] = 90;
    tmp1494_1485[4] = 118;
    int[] tmp1507_1494 = tmp1494_1485;
    tmp1507_1494[5] = -1;
    tmp1507_1494[6] = -1;
    arrayOfInt[26] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1525_1524 = arrayOfInt1;
    int[] tmp1526_1525 = tmp1525_1524;
    int[] tmp1526_1525 = tmp1525_1524;
    tmp1526_1525[0] = 6;
    tmp1526_1525[1] = 26;
    int[] tmp1535_1526 = tmp1526_1525;
    int[] tmp1535_1526 = tmp1526_1525;
    tmp1535_1526[2] = 50;
    tmp1535_1526[3] = 74;
    tmp1535_1526[4] = 98;
    int[] tmp1548_1535 = tmp1535_1526;
    tmp1548_1535[5] = 122;
    tmp1548_1535[6] = -1;
    arrayOfInt[27] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1567_1566 = arrayOfInt1;
    int[] tmp1568_1567 = tmp1567_1566;
    int[] tmp1568_1567 = tmp1567_1566;
    tmp1568_1567[0] = 6;
    tmp1568_1567[1] = 30;
    int[] tmp1577_1568 = tmp1568_1567;
    int[] tmp1577_1568 = tmp1568_1567;
    tmp1577_1568[2] = 54;
    tmp1577_1568[3] = 78;
    tmp1577_1568[4] = 102;
    int[] tmp1590_1577 = tmp1577_1568;
    tmp1590_1577[5] = 126;
    tmp1590_1577[6] = -1;
    arrayOfInt[28] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1609_1608 = arrayOfInt1;
    int[] tmp1610_1609 = tmp1609_1608;
    int[] tmp1610_1609 = tmp1609_1608;
    tmp1610_1609[0] = 6;
    tmp1610_1609[1] = 26;
    int[] tmp1619_1610 = tmp1610_1609;
    int[] tmp1619_1610 = tmp1610_1609;
    tmp1619_1610[2] = 52;
    tmp1619_1610[3] = 78;
    tmp1619_1610[4] = 104;
    int[] tmp1632_1619 = tmp1619_1610;
    tmp1632_1619[5] = '';
    tmp1632_1619[6] = -1;
    arrayOfInt[29] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1652_1651 = arrayOfInt1;
    int[] tmp1653_1652 = tmp1652_1651;
    int[] tmp1653_1652 = tmp1652_1651;
    tmp1653_1652[0] = 6;
    tmp1653_1652[1] = 30;
    int[] tmp1662_1653 = tmp1653_1652;
    int[] tmp1662_1653 = tmp1653_1652;
    tmp1662_1653[2] = 56;
    tmp1662_1653[3] = 82;
    tmp1662_1653[4] = 108;
    int[] tmp1675_1662 = tmp1662_1653;
    tmp1675_1662[5] = '';
    tmp1675_1662[6] = -1;
    arrayOfInt[30] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1695_1694 = arrayOfInt1;
    int[] tmp1696_1695 = tmp1695_1694;
    int[] tmp1696_1695 = tmp1695_1694;
    tmp1696_1695[0] = 6;
    tmp1696_1695[1] = 34;
    int[] tmp1705_1696 = tmp1696_1695;
    int[] tmp1705_1696 = tmp1696_1695;
    tmp1705_1696[2] = 60;
    tmp1705_1696[3] = 86;
    tmp1705_1696[4] = 112;
    int[] tmp1718_1705 = tmp1705_1696;
    tmp1718_1705[5] = '';
    tmp1718_1705[6] = -1;
    arrayOfInt[31] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1738_1737 = arrayOfInt1;
    int[] tmp1739_1738 = tmp1738_1737;
    int[] tmp1739_1738 = tmp1738_1737;
    tmp1739_1738[0] = 6;
    tmp1739_1738[1] = 30;
    int[] tmp1748_1739 = tmp1739_1738;
    int[] tmp1748_1739 = tmp1739_1738;
    tmp1748_1739[2] = 58;
    tmp1748_1739[3] = 86;
    tmp1748_1739[4] = 114;
    int[] tmp1761_1748 = tmp1748_1739;
    tmp1761_1748[5] = '';
    tmp1761_1748[6] = -1;
    arrayOfInt[32] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1781_1780 = arrayOfInt1;
    int[] tmp1782_1781 = tmp1781_1780;
    int[] tmp1782_1781 = tmp1781_1780;
    tmp1782_1781[0] = 6;
    tmp1782_1781[1] = 34;
    int[] tmp1791_1782 = tmp1782_1781;
    int[] tmp1791_1782 = tmp1782_1781;
    tmp1791_1782[2] = 62;
    tmp1791_1782[3] = 90;
    tmp1791_1782[4] = 118;
    int[] tmp1804_1791 = tmp1791_1782;
    tmp1804_1791[5] = '';
    tmp1804_1791[6] = -1;
    arrayOfInt[33] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1824_1823 = arrayOfInt1;
    int[] tmp1825_1824 = tmp1824_1823;
    int[] tmp1825_1824 = tmp1824_1823;
    tmp1825_1824[0] = 6;
    tmp1825_1824[1] = 30;
    int[] tmp1834_1825 = tmp1825_1824;
    int[] tmp1834_1825 = tmp1825_1824;
    tmp1834_1825[2] = 54;
    tmp1834_1825[3] = 78;
    tmp1834_1825[4] = 102;
    int[] tmp1847_1834 = tmp1834_1825;
    tmp1847_1834[5] = 126;
    tmp1847_1834[6] = '';
    arrayOfInt[34] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1868_1867 = arrayOfInt1;
    int[] tmp1869_1868 = tmp1868_1867;
    int[] tmp1869_1868 = tmp1868_1867;
    tmp1869_1868[0] = 6;
    tmp1869_1868[1] = 24;
    int[] tmp1878_1869 = tmp1869_1868;
    int[] tmp1878_1869 = tmp1869_1868;
    tmp1878_1869[2] = 50;
    tmp1878_1869[3] = 76;
    tmp1878_1869[4] = 102;
    int[] tmp1891_1878 = tmp1878_1869;
    tmp1891_1878[5] = '';
    tmp1891_1878[6] = '';
    arrayOfInt[35] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1913_1912 = arrayOfInt1;
    int[] tmp1914_1913 = tmp1913_1912;
    int[] tmp1914_1913 = tmp1913_1912;
    tmp1914_1913[0] = 6;
    tmp1914_1913[1] = 28;
    int[] tmp1923_1914 = tmp1914_1913;
    int[] tmp1923_1914 = tmp1914_1913;
    tmp1923_1914[2] = 54;
    tmp1923_1914[3] = 80;
    tmp1923_1914[4] = 106;
    int[] tmp1936_1923 = tmp1923_1914;
    tmp1936_1923[5] = '';
    tmp1936_1923[6] = '';
    arrayOfInt[36] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp1958_1957 = arrayOfInt1;
    int[] tmp1959_1958 = tmp1958_1957;
    int[] tmp1959_1958 = tmp1958_1957;
    tmp1959_1958[0] = 6;
    tmp1959_1958[1] = 32;
    int[] tmp1968_1959 = tmp1959_1958;
    int[] tmp1968_1959 = tmp1959_1958;
    tmp1968_1959[2] = 58;
    tmp1968_1959[3] = 84;
    tmp1968_1959[4] = 110;
    int[] tmp1981_1968 = tmp1968_1959;
    tmp1981_1968[5] = '';
    tmp1981_1968[6] = '¢';
    arrayOfInt[37] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp2003_2002 = arrayOfInt1;
    int[] tmp2004_2003 = tmp2003_2002;
    int[] tmp2004_2003 = tmp2003_2002;
    tmp2004_2003[0] = 6;
    tmp2004_2003[1] = 26;
    int[] tmp2013_2004 = tmp2004_2003;
    int[] tmp2013_2004 = tmp2004_2003;
    tmp2013_2004[2] = 54;
    tmp2013_2004[3] = 82;
    tmp2013_2004[4] = 110;
    int[] tmp2026_2013 = tmp2013_2004;
    tmp2026_2013[5] = '';
    tmp2026_2013[6] = '¦';
    arrayOfInt[38] = arrayOfInt1;
    arrayOfInt1 = new int[i];
    int[] tmp2048_2047 = arrayOfInt1;
    int[] tmp2049_2048 = tmp2048_2047;
    int[] tmp2049_2048 = tmp2048_2047;
    tmp2049_2048[0] = 6;
    tmp2049_2048[1] = 30;
    int[] tmp2058_2049 = tmp2049_2048;
    int[] tmp2058_2049 = tmp2049_2048;
    tmp2058_2049[2] = 58;
    tmp2058_2049[3] = 86;
    tmp2058_2049[4] = 114;
    int[] tmp2071_2058 = tmp2058_2049;
    tmp2071_2058[5] = '';
    tmp2071_2058[6] = 'ª';
    arrayOfInt[39] = arrayOfInt1;
    POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE = arrayOfInt;
    arrayOfInt = new int[i9][];
    arrayOfInt1 = new int[] { i3, 0 };
    arrayOfInt[0] = arrayOfInt1;
    arrayOfInt1 = new int[] { i3, j };
    arrayOfInt[j] = arrayOfInt1;
    arrayOfInt1 = new int[] { i3, k };
    arrayOfInt[k] = arrayOfInt1;
    arrayOfInt1 = new int[] { i3, m };
    arrayOfInt[m] = arrayOfInt1;
    arrayOfInt1 = new int[] { i3, n };
    arrayOfInt[n] = arrayOfInt1;
    arrayOfInt1 = new int[] { i3, i1 };
    arrayOfInt[i1] = arrayOfInt1;
    arrayOfInt1 = new int[] { i3, i };
    arrayOfInt[i2] = arrayOfInt1;
    arrayOfInt1 = new int[] { i3, i3 };
    arrayOfInt[i] = arrayOfInt1;
    int[] arrayOfInt2 = { i, i3 };
    arrayOfInt[i3] = arrayOfInt2;
    arrayOfInt2 = new int[] { i1, i3 };
    arrayOfInt[i4] = arrayOfInt2;
    arrayOfInt2 = new int[] { n, i3 };
    arrayOfInt[i5] = arrayOfInt2;
    arrayOfInt2 = new int[] { m, i3 };
    arrayOfInt[i6] = arrayOfInt2;
    arrayOfInt2 = new int[] { k, i3 };
    arrayOfInt[i7] = arrayOfInt2;
    arrayOfInt2 = new int[] { j, i3 };
    arrayOfInt[13] = arrayOfInt2;
    arrayOfInt2 = new int[] { 0, i3 };
    arrayOfInt[i8] = arrayOfInt2;
    TYPE_INFO_COORDINATES = arrayOfInt;
  }
  
  public static void buildMatrix(BitArray paramBitArray, ErrorCorrectionLevel paramErrorCorrectionLevel, Version paramVersion, int paramInt, ByteMatrix paramByteMatrix)
  {
    clearMatrix(paramByteMatrix);
    embedBasicPatterns(paramVersion, paramByteMatrix);
    embedTypeInfo(paramErrorCorrectionLevel, paramInt, paramByteMatrix);
    maybeEmbedVersionInfo(paramVersion, paramByteMatrix);
    embedDataBits(paramBitArray, paramInt, paramByteMatrix);
  }
  
  public static int calculateBCHCode(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      int i = findMSBSet(paramInt2);
      int j = i + -1;
      paramInt1 <<= j;
      for (;;)
      {
        j = findMSBSet(paramInt1);
        if (j < i) {
          break;
        }
        j = findMSBSet(paramInt1) - i;
        j = paramInt2 << j;
        paramInt1 ^= j;
      }
      return paramInt1;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("bh58491A0A08160C0E0D0A130F");
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public static void clearMatrix(ByteMatrix paramByteMatrix)
  {
    paramByteMatrix.clear((byte)-1);
  }
  
  public static void embedBasicPatterns(Version paramVersion, ByteMatrix paramByteMatrix)
  {
    embedPositionDetectionPatternsAndSeparators(paramByteMatrix);
    embedDarkDotAtLeftBottomCorner(paramByteMatrix);
    maybeEmbedPositionAdjustmentPatterns(paramVersion, paramByteMatrix);
    embedTimingPatterns(paramByteMatrix);
  }
  
  private static void embedDarkDotAtLeftBottomCorner(ByteMatrix paramByteMatrix)
  {
    int i = paramByteMatrix.getHeight();
    int j = 8;
    i -= j;
    i = paramByteMatrix.get(j, i);
    if (i != 0)
    {
      i = paramByteMatrix.getHeight() - j;
      paramByteMatrix.set(j, i, 1);
      return;
    }
    paramByteMatrix = new com/google/zxing/WriterException;
    paramByteMatrix.<init>();
    throw paramByteMatrix;
  }
  
  public static void embedDataBits(BitArray paramBitArray, int paramInt, ByteMatrix paramByteMatrix)
  {
    int i = paramByteMatrix.getWidth() + -1;
    int j = paramByteMatrix.getHeight() + -1;
    int k = -1;
    int m = 0;
    int n = k;
    while (i > 0)
    {
      int i1 = 6;
      if (i == i1) {
        i += -1;
      }
      while (j >= 0)
      {
        i1 = paramByteMatrix.getHeight();
        if (j >= i1) {
          break;
        }
        i1 = 0;
        for (;;)
        {
          int i2 = 2;
          if (i1 >= i2) {
            break;
          }
          i2 = i - i1;
          boolean bool1 = isEmpty(paramByteMatrix.get(i2, j));
          if (bool1)
          {
            int i3 = paramBitArray.getSize();
            boolean bool2;
            if (m < i3)
            {
              bool2 = paramBitArray.get(m);
              m += 1;
            }
            else
            {
              bool2 = false;
            }
            if (paramInt != k)
            {
              boolean bool3 = MaskUtil.getDataMaskBit(paramInt, i2, j);
              if (bool3) {
                bool2 ^= true;
              }
            }
            paramByteMatrix.set(i2, j, bool2);
          }
          i1 += 1;
        }
        j += n;
      }
      n = -n;
      j += n;
      i += -2;
    }
    paramInt = paramBitArray.getSize();
    if (m == paramInt) {
      return;
    }
    WriterException localWriterException = new com/google/zxing/WriterException;
    paramByteMatrix = new java/lang/StringBuilder;
    paramByteMatrix.<init>();
    String str = m54207b69.F54207b69_11("^R1C3E2875374344793844302C7E3E4B4B3138514A4A7D88");
    paramByteMatrix.append(str);
    paramByteMatrix.append(m);
    paramByteMatrix.append('/');
    int i4 = paramBitArray.getSize();
    paramByteMatrix.append(i4);
    paramBitArray = paramByteMatrix.toString();
    localWriterException.<init>(paramBitArray);
    throw localWriterException;
  }
  
  private static void embedHorizontalSeparationPattern(int paramInt1, int paramInt2, ByteMatrix paramByteMatrix)
  {
    int i = 0;
    for (;;)
    {
      int j = 8;
      if (i >= j) {
        return;
      }
      j = paramInt1 + i;
      boolean bool = isEmpty(paramByteMatrix.get(j, paramInt2));
      if (!bool) {
        break;
      }
      paramByteMatrix.set(j, paramInt2, 0);
      i += 1;
    }
    WriterException localWriterException = new com/google/zxing/WriterException;
    localWriterException.<init>();
    throw localWriterException;
  }
  
  private static void embedPositionAdjustmentPattern(int paramInt1, int paramInt2, ByteMatrix paramByteMatrix)
  {
    int i = 0;
    for (;;)
    {
      int j = 5;
      if (i >= j) {
        break;
      }
      int[] arrayOfInt = POSITION_ADJUSTMENT_PATTERN[i];
      int k = 0;
      while (k < j)
      {
        int m = paramInt1 + k;
        int n = paramInt2 + i;
        int i1 = arrayOfInt[k];
        paramByteMatrix.set(m, n, i1);
        k += 1;
      }
      i += 1;
    }
  }
  
  private static void embedPositionDetectionPattern(int paramInt1, int paramInt2, ByteMatrix paramByteMatrix)
  {
    int i = 0;
    for (;;)
    {
      int j = 7;
      if (i >= j) {
        break;
      }
      int[] arrayOfInt = POSITION_DETECTION_PATTERN[i];
      int k = 0;
      while (k < j)
      {
        int m = paramInt1 + k;
        int n = paramInt2 + i;
        int i1 = arrayOfInt[k];
        paramByteMatrix.set(m, n, i1);
        k += 1;
      }
      i += 1;
    }
  }
  
  private static void embedPositionDetectionPatternsAndSeparators(ByteMatrix paramByteMatrix)
  {
    int i = POSITION_DETECTION_PATTERN[0].length;
    embedPositionDetectionPattern(0, 0, paramByteMatrix);
    embedPositionDetectionPattern(paramByteMatrix.getWidth() - i, 0, paramByteMatrix);
    int j = paramByteMatrix.getWidth() - i;
    embedPositionDetectionPattern(0, j, paramByteMatrix);
    i = 7;
    embedHorizontalSeparationPattern(0, i, paramByteMatrix);
    embedHorizontalSeparationPattern(paramByteMatrix.getWidth() + -8, i, paramByteMatrix);
    j = paramByteMatrix.getWidth() + -8;
    embedHorizontalSeparationPattern(0, j, paramByteMatrix);
    embedVerticalSeparationPattern(i, 0, paramByteMatrix);
    embedVerticalSeparationPattern(paramByteMatrix.getHeight() - i + -1, 0, paramByteMatrix);
    int k = paramByteMatrix.getHeight() - i;
    embedVerticalSeparationPattern(i, k, paramByteMatrix);
  }
  
  private static void embedTimingPatterns(ByteMatrix paramByteMatrix)
  {
    int i = 8;
    int k;
    for (int j = i;; j = k)
    {
      k = paramByteMatrix.getWidth() - i;
      if (j >= k) {
        break;
      }
      k = j + 1;
      int m = k % 2;
      int n = 6;
      boolean bool = isEmpty(paramByteMatrix.get(j, n));
      if (bool) {
        paramByteMatrix.set(j, n, m);
      }
      bool = isEmpty(paramByteMatrix.get(n, j));
      if (bool) {
        paramByteMatrix.set(n, j, m);
      }
    }
  }
  
  public static void embedTypeInfo(ErrorCorrectionLevel paramErrorCorrectionLevel, int paramInt, ByteMatrix paramByteMatrix)
  {
    BitArray localBitArray = new com/google/zxing/common/BitArray;
    localBitArray.<init>();
    makeTypeInfoBits(paramErrorCorrectionLevel, paramInt, localBitArray);
    paramErrorCorrectionLevel = null;
    paramInt = 0;
    for (;;)
    {
      int i = localBitArray.getSize();
      if (paramInt >= i) {
        break;
      }
      i = localBitArray.getSize();
      int j = 1;
      i = i - j - paramInt;
      boolean bool = localBitArray.get(i);
      int[] arrayOfInt = TYPE_INFO_COORDINATES[paramInt];
      int k = arrayOfInt[0];
      int m = arrayOfInt[j];
      paramByteMatrix.set(k, m, bool);
      m = 8;
      if (paramInt < m)
      {
        k = paramByteMatrix.getWidth() - paramInt - j;
        j = m;
        m = k;
      }
      else
      {
        j = paramByteMatrix.getHeight() + -7;
        k = paramInt + -8;
        j += k;
      }
      paramByteMatrix.set(m, j, bool);
      paramInt += 1;
    }
  }
  
  private static void embedVerticalSeparationPattern(int paramInt1, int paramInt2, ByteMatrix paramByteMatrix)
  {
    int i = 0;
    for (;;)
    {
      int j = 7;
      if (i >= j) {
        return;
      }
      j = paramInt2 + i;
      boolean bool = isEmpty(paramByteMatrix.get(paramInt1, j));
      if (!bool) {
        break;
      }
      paramByteMatrix.set(paramInt1, j, 0);
      i += 1;
    }
    WriterException localWriterException = new com/google/zxing/WriterException;
    localWriterException.<init>();
    throw localWriterException;
  }
  
  public static int findMSBSet(int paramInt)
  {
    paramInt = Integer.numberOfLeadingZeros(paramInt);
    return 32 - paramInt;
  }
  
  private static boolean isEmpty(int paramInt)
  {
    int i = -1;
    if (paramInt == i) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public static void makeTypeInfoBits(ErrorCorrectionLevel paramErrorCorrectionLevel, int paramInt, BitArray paramBitArray)
  {
    boolean bool = QRCode.isValidMaskPattern(paramInt);
    if (bool)
    {
      int j = paramErrorCorrectionLevel.getBits() << 3 | paramInt;
      paramBitArray.appendBits(j, 5);
      j = calculateBCHCode(j, 1335);
      paramBitArray.appendBits(j, 10);
      paramErrorCorrectionLevel = new com/google/zxing/common/BitArray;
      paramErrorCorrectionLevel.<init>();
      paramInt = 21522;
      int i = 15;
      paramErrorCorrectionLevel.appendBits(paramInt, i);
      paramBitArray.xor(paramErrorCorrectionLevel);
      j = paramBitArray.getSize();
      if (j == i) {
        return;
      }
      paramErrorCorrectionLevel = new com/google/zxing/WriterException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = m54207b69.F54207b69_11("g.5D47435E464F1447496318515B6B6C5A501F5E6E6E236F6226625B75302B");
      ((StringBuilder)localObject).append(str);
      int k = paramBitArray.getSize();
      ((StringBuilder)localObject).append(k);
      localObject = ((StringBuilder)localObject).toString();
      paramErrorCorrectionLevel.<init>((String)localObject);
      throw paramErrorCorrectionLevel;
    }
    paramErrorCorrectionLevel = new com/google/zxing/WriterException;
    Object localObject = m54207b69.F54207b69_11("g_16322B41373B41863A47363F8B3C4C3A3B4B3F44");
    paramErrorCorrectionLevel.<init>((String)localObject);
    throw paramErrorCorrectionLevel;
  }
  
  public static void makeVersionInfoBits(Version paramVersion, BitArray paramBitArray)
  {
    int i = paramVersion.getVersionNumber();
    int j = 6;
    paramBitArray.appendBits(i, j);
    int k = calculateBCHCode(paramVersion.getVersionNumber(), 7973);
    paramBitArray.appendBits(k, 12);
    k = paramBitArray.getSize();
    i = 18;
    if (k == i) {
      return;
    }
    paramVersion = new com/google/zxing/WriterException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("g.5D47435E464F1447496318515B6B6C5A501F5E6E6E236F6226625B75302B");
    localStringBuilder.append(str);
    int m = paramBitArray.getSize();
    localStringBuilder.append(m);
    paramBitArray = localStringBuilder.toString();
    paramVersion.<init>(paramBitArray);
    throw paramVersion;
  }
  
  private static void maybeEmbedPositionAdjustmentPatterns(Version paramVersion, ByteMatrix paramByteMatrix)
  {
    int i = paramVersion.getVersionNumber();
    int j = 2;
    if (i < j) {
      return;
    }
    int k = paramVersion.getVersionNumber() + -1;
    int[][] arrayOfInt = POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE;
    paramVersion = arrayOfInt[k];
    i = paramVersion.length;
    j = 0;
    int m = 0;
    while (m < i)
    {
      int n = paramVersion[m];
      if (n >= 0)
      {
        int i1 = paramVersion.length;
        int i2 = 0;
        while (i2 < i1)
        {
          int i3 = paramVersion[i2];
          if (i3 >= 0)
          {
            boolean bool = isEmpty(paramByteMatrix.get(i3, n));
            if (bool)
            {
              i3 += -2;
              int i4 = n + -2;
              embedPositionAdjustmentPattern(i3, i4, paramByteMatrix);
            }
          }
          i2 += 1;
        }
      }
      m += 1;
    }
  }
  
  public static void maybeEmbedVersionInfo(Version paramVersion, ByteMatrix paramByteMatrix)
  {
    int i = paramVersion.getVersionNumber();
    int j = 7;
    if (i < j) {
      return;
    }
    BitArray localBitArray = new com/google/zxing/common/BitArray;
    localBitArray.<init>();
    makeVersionInfoBits(paramVersion, localBitArray);
    paramVersion = null;
    j = 17;
    int k = 0;
    for (;;)
    {
      int m = 6;
      if (k >= m) {
        break;
      }
      m = 0;
      for (;;)
      {
        int n = 3;
        if (m >= n) {
          break;
        }
        boolean bool = localBitArray.get(j);
        j += -1;
        int i1 = paramByteMatrix.getHeight() + -11 + m;
        paramByteMatrix.set(k, i1, bool);
        i1 = paramByteMatrix.getHeight() + -11 + m;
        paramByteMatrix.set(i1, k, bool);
        m += 1;
      }
      k += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.encoder.MatrixUtil
 * JD-Core Version:    0.7.0.1
 */