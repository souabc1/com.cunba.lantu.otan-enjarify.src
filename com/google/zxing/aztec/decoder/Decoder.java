package com.google.zxing.aztec.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import m54207b69;

public final class Decoder
{
  private static final Charset DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;
  private static final String[] DIGIT_TABLE;
  private static final String[] LOWER_TABLE;
  private static final String[] MIXED_TABLE;
  private static final String[] PUNCT_TABLE;
  private static final String[] UPPER_TABLE;
  private AztecDetectorResult ddata;
  
  static
  {
    String str1 = m54207b69.F54207b69_11("U%6672796C7E7A7C");
    String str2 = m54207b69.F54207b69_11("Y<7F697073677576");
    String str3 = m54207b69.F54207b69_11("4G0414170E1C0F11");
    String str4 = m54207b69.F54207b69_11("MI0A1E1D081A120B");
    String str5 = m54207b69.F54207b69_11("?\\1F091013072315");
    String[] tmp36_33 = new String[32];
    String[] tmp37_36 = tmp36_33;
    String[] tmp37_36 = tmp36_33;
    tmp37_36[0] = str1;
    tmp37_36[1] = " ";
    String[] tmp45_37 = tmp37_36;
    String[] tmp45_37 = tmp37_36;
    tmp45_37[2] = "A";
    tmp45_37[3] = "B";
    String[] tmp54_45 = tmp45_37;
    String[] tmp54_45 = tmp45_37;
    tmp54_45[4] = "C";
    tmp54_45[5] = "D";
    String[] tmp63_54 = tmp54_45;
    String[] tmp63_54 = tmp54_45;
    tmp63_54[6] = "E";
    tmp63_54[7] = "F";
    String[] tmp74_63 = tmp63_54;
    String[] tmp74_63 = tmp63_54;
    tmp74_63[8] = "G";
    tmp74_63[9] = "H";
    String[] tmp85_74 = tmp74_63;
    String[] tmp85_74 = tmp74_63;
    tmp85_74[10] = "I";
    tmp85_74[11] = "J";
    String[] tmp96_85 = tmp85_74;
    String[] tmp96_85 = tmp85_74;
    tmp96_85[12] = "K";
    tmp96_85[13] = "L";
    String[] tmp107_96 = tmp96_85;
    String[] tmp107_96 = tmp96_85;
    tmp107_96[14] = "M";
    tmp107_96[15] = "N";
    String[] tmp118_107 = tmp107_96;
    String[] tmp118_107 = tmp107_96;
    tmp118_107[16] = "O";
    tmp118_107[17] = "P";
    String[] tmp129_118 = tmp118_107;
    String[] tmp129_118 = tmp118_107;
    tmp129_118[18] = "Q";
    tmp129_118[19] = "R";
    String[] tmp140_129 = tmp129_118;
    String[] tmp140_129 = tmp129_118;
    tmp140_129[20] = "S";
    tmp140_129[21] = "T";
    String[] tmp151_140 = tmp140_129;
    String[] tmp151_140 = tmp140_129;
    tmp151_140[22] = "U";
    tmp151_140[23] = "V";
    String[] tmp162_151 = tmp151_140;
    String[] tmp162_151 = tmp151_140;
    tmp162_151[24] = "W";
    tmp162_151[25] = "X";
    String[] tmp173_162 = tmp162_151;
    String[] tmp173_162 = tmp162_151;
    tmp173_162[26] = "Y";
    tmp173_162[27] = "Z";
    String[] tmp184_173 = tmp173_162;
    String[] tmp184_173 = tmp173_162;
    tmp184_173[28] = str2;
    tmp184_173[29] = str3;
    tmp184_173[30] = str4;
    String[] tmp197_184 = tmp184_173;
    tmp197_184[31] = str5;
    UPPER_TABLE = tmp197_184;
    String str6 = m54207b69.F54207b69_11("U%6672796C7E7A7C");
    str3 = m54207b69.F54207b69_11("eW1404071E0C070A");
    str4 = m54207b69.F54207b69_11("4G0414170E1C0F11");
    str5 = m54207b69.F54207b69_11("MI0A1E1D081A120B");
    String str7 = m54207b69.F54207b69_11("?\\1F091013072315");
    String[] tmp244_241 = new String[32];
    String[] tmp245_244 = tmp244_241;
    String[] tmp245_244 = tmp244_241;
    tmp245_244[0] = str6;
    tmp245_244[1] = " ";
    String[] tmp254_245 = tmp245_244;
    String[] tmp254_245 = tmp245_244;
    tmp254_245[2] = "a";
    tmp254_245[3] = "b";
    String[] tmp263_254 = tmp254_245;
    String[] tmp263_254 = tmp254_245;
    tmp263_254[4] = "c";
    tmp263_254[5] = "d";
    String[] tmp272_263 = tmp263_254;
    String[] tmp272_263 = tmp263_254;
    tmp272_263[6] = "e";
    tmp272_263[7] = "f";
    String[] tmp283_272 = tmp272_263;
    String[] tmp283_272 = tmp272_263;
    tmp283_272[8] = "g";
    tmp283_272[9] = "h";
    String[] tmp294_283 = tmp283_272;
    String[] tmp294_283 = tmp283_272;
    tmp294_283[10] = "i";
    tmp294_283[11] = "j";
    String[] tmp305_294 = tmp294_283;
    String[] tmp305_294 = tmp294_283;
    tmp305_294[12] = "k";
    tmp305_294[13] = "l";
    String[] tmp316_305 = tmp305_294;
    String[] tmp316_305 = tmp305_294;
    tmp316_305[14] = "m";
    tmp316_305[15] = "n";
    String[] tmp327_316 = tmp316_305;
    String[] tmp327_316 = tmp316_305;
    tmp327_316[16] = "o";
    tmp327_316[17] = "p";
    String[] tmp338_327 = tmp327_316;
    String[] tmp338_327 = tmp327_316;
    tmp338_327[18] = "q";
    tmp338_327[19] = "r";
    String[] tmp349_338 = tmp338_327;
    String[] tmp349_338 = tmp338_327;
    tmp349_338[20] = "s";
    tmp349_338[21] = "t";
    String[] tmp360_349 = tmp349_338;
    String[] tmp360_349 = tmp349_338;
    tmp360_349[22] = "u";
    tmp360_349[23] = "v";
    String[] tmp371_360 = tmp360_349;
    String[] tmp371_360 = tmp360_349;
    tmp371_360[24] = "w";
    tmp371_360[25] = "x";
    String[] tmp382_371 = tmp371_360;
    String[] tmp382_371 = tmp371_360;
    tmp382_371[26] = "y";
    tmp382_371[27] = "z";
    String[] tmp393_382 = tmp382_371;
    String[] tmp393_382 = tmp382_371;
    tmp393_382[28] = str3;
    tmp393_382[29] = str4;
    tmp393_382[30] = str5;
    String[] tmp407_393 = tmp393_382;
    tmp407_393[31] = str7;
    LOWER_TABLE = tmp407_393;
    str6 = m54207b69.F54207b69_11("U%6672796C7E7A7C");
    str3 = m54207b69.F54207b69_11("Y<7F697073677576");
    str4 = m54207b69.F54207b69_11("D-6E7A8164767D67");
    str5 = m54207b69.F54207b69_11("(77464677E6C6C81");
    str7 = m54207b69.F54207b69_11("?\\1F091013072315");
    String[] tmp454_451 = new String[32];
    String[] tmp455_454 = tmp454_451;
    String[] tmp455_454 = tmp454_451;
    tmp455_454[0] = str6;
    tmp455_454[1] = " ";
    String[] tmp464_455 = tmp455_454;
    String[] tmp464_455 = tmp455_454;
    tmp464_455[2] = "\001";
    tmp464_455[3] = "\002";
    String[] tmp473_464 = tmp464_455;
    String[] tmp473_464 = tmp464_455;
    tmp473_464[4] = "\003";
    tmp473_464[5] = "\004";
    String[] tmp482_473 = tmp473_464;
    String[] tmp482_473 = tmp473_464;
    tmp482_473[6] = "\005";
    tmp482_473[7] = "\006";
    String[] tmp493_482 = tmp482_473;
    String[] tmp493_482 = tmp482_473;
    tmp493_482[8] = "\007";
    tmp493_482[9] = "\b";
    String[] tmp504_493 = tmp493_482;
    String[] tmp504_493 = tmp493_482;
    tmp504_493[10] = "\t";
    tmp504_493[11] = "\n";
    String[] tmp515_504 = tmp504_493;
    String[] tmp515_504 = tmp504_493;
    tmp515_504[12] = "\013";
    tmp515_504[13] = "\f";
    String[] tmp526_515 = tmp515_504;
    String[] tmp526_515 = tmp515_504;
    tmp526_515[14] = "\r";
    tmp526_515[15] = "\033";
    String[] tmp537_526 = tmp526_515;
    String[] tmp537_526 = tmp526_515;
    tmp537_526[16] = "\034";
    tmp537_526[17] = "\035";
    String[] tmp548_537 = tmp537_526;
    String[] tmp548_537 = tmp537_526;
    tmp548_537[18] = "\036";
    tmp548_537[19] = "\037";
    String[] tmp559_548 = tmp548_537;
    String[] tmp559_548 = tmp548_537;
    tmp559_548[20] = "@";
    tmp559_548[21] = "\\";
    String[] tmp570_559 = tmp559_548;
    String[] tmp570_559 = tmp559_548;
    tmp570_559[22] = "^";
    tmp570_559[23] = "_";
    String[] tmp581_570 = tmp570_559;
    String[] tmp581_570 = tmp570_559;
    tmp581_570[24] = "`";
    tmp581_570[25] = "|";
    String[] tmp592_581 = tmp581_570;
    String[] tmp592_581 = tmp581_570;
    tmp592_581[26] = "~";
    tmp592_581[27] = "";
    String[] tmp603_592 = tmp592_581;
    String[] tmp603_592 = tmp592_581;
    tmp603_592[28] = str3;
    tmp603_592[29] = str4;
    tmp603_592[30] = str5;
    String[] tmp617_603 = tmp603_592;
    tmp617_603[31] = str7;
    MIXED_TABLE = tmp617_603;
    str6 = m54207b69.F54207b69_11("['616C62124D13");
    str7 = m54207b69.F54207b69_11("D-6E7A8164767D67");
    String[] tmp645_642 = new String[32];
    String[] tmp646_645 = tmp645_642;
    String[] tmp646_645 = tmp645_642;
    tmp646_645[0] = str6;
    tmp646_645[1] = "\r";
    String[] tmp655_646 = tmp646_645;
    String[] tmp655_646 = tmp646_645;
    tmp655_646[2] = "\r\n";
    tmp655_646[3] = ". ";
    String[] tmp664_655 = tmp655_646;
    String[] tmp664_655 = tmp655_646;
    tmp664_655[4] = ", ";
    tmp664_655[5] = ": ";
    String[] tmp673_664 = tmp664_655;
    String[] tmp673_664 = tmp664_655;
    tmp673_664[6] = "!";
    tmp673_664[7] = "\"";
    String[] tmp684_673 = tmp673_664;
    String[] tmp684_673 = tmp673_664;
    tmp684_673[8] = "#";
    tmp684_673[9] = "$";
    String[] tmp695_684 = tmp684_673;
    String[] tmp695_684 = tmp684_673;
    tmp695_684[10] = "%";
    tmp695_684[11] = "&";
    String[] tmp706_695 = tmp695_684;
    String[] tmp706_695 = tmp695_684;
    tmp706_695[12] = "'";
    tmp706_695[13] = "(";
    String[] tmp717_706 = tmp706_695;
    String[] tmp717_706 = tmp706_695;
    tmp717_706[14] = ")";
    tmp717_706[15] = "*";
    String[] tmp728_717 = tmp717_706;
    String[] tmp728_717 = tmp717_706;
    tmp728_717[16] = "+";
    tmp728_717[17] = ",";
    String[] tmp739_728 = tmp728_717;
    String[] tmp739_728 = tmp728_717;
    tmp739_728[18] = "-";
    tmp739_728[19] = ".";
    String[] tmp750_739 = tmp739_728;
    String[] tmp750_739 = tmp739_728;
    tmp750_739[20] = "/";
    tmp750_739[21] = ":";
    String[] tmp761_750 = tmp750_739;
    String[] tmp761_750 = tmp750_739;
    tmp761_750[22] = ";";
    tmp761_750[23] = "<";
    String[] tmp772_761 = tmp761_750;
    String[] tmp772_761 = tmp761_750;
    tmp772_761[24] = "=";
    tmp772_761[25] = ">";
    String[] tmp783_772 = tmp772_761;
    String[] tmp783_772 = tmp772_761;
    tmp783_772[26] = "?";
    tmp783_772[27] = "[";
    String[] tmp795_783 = tmp783_772;
    String[] tmp795_783 = tmp783_772;
    tmp795_783[28] = "]";
    tmp795_783[29] = "{";
    tmp795_783[30] = "}";
    String[] tmp814_795 = tmp795_783;
    tmp814_795[31] = str7;
    PUNCT_TABLE = tmp814_795;
    str6 = m54207b69.F54207b69_11("U%6672796C7E7A7C");
    String str8 = m54207b69.F54207b69_11("D-6E7A8164767D67");
    String str9 = m54207b69.F54207b69_11("eW1404071E0C070A");
    String[] tmp849_846 = new String[16];
    String[] tmp850_849 = tmp849_846;
    String[] tmp850_849 = tmp849_846;
    tmp850_849[0] = str6;
    tmp850_849[1] = " ";
    String[] tmp859_850 = tmp850_849;
    String[] tmp859_850 = tmp850_849;
    tmp859_850[2] = "0";
    tmp859_850[3] = "1";
    String[] tmp870_859 = tmp859_850;
    String[] tmp870_859 = tmp859_850;
    tmp870_859[4] = "2";
    tmp870_859[5] = "3";
    String[] tmp881_870 = tmp870_859;
    String[] tmp881_870 = tmp870_859;
    tmp881_870[6] = "4";
    tmp881_870[7] = "5";
    String[] tmp894_881 = tmp881_870;
    String[] tmp894_881 = tmp881_870;
    tmp894_881[8] = "6";
    tmp894_881[9] = "7";
    String[] tmp907_894 = tmp894_881;
    String[] tmp907_894 = tmp894_881;
    tmp907_894[10] = "8";
    tmp907_894[11] = "9";
    String[] tmp920_907 = tmp907_894;
    String[] tmp920_907 = tmp907_894;
    tmp920_907[12] = ",";
    tmp920_907[13] = ".";
    tmp920_907[14] = str8;
    String[] tmp936_920 = tmp920_907;
    tmp936_920[15] = str9;
    DIGIT_TABLE = tmp936_920;
  }
  
  public static byte[] convertBoolArrayToByteArray(boolean[] paramArrayOfBoolean)
  {
    int i = (paramArrayOfBoolean.length + 7) / 8;
    byte[] arrayOfByte = new byte[i];
    int j = 0;
    while (j < i)
    {
      int k = j * 8;
      k = readByte(paramArrayOfBoolean, k);
      arrayOfByte[j] = k;
      j += 1;
    }
    return arrayOfByte;
  }
  
  private Decoder.CorrectedBitsResult correctBits(boolean[] paramArrayOfBoolean)
  {
    Object localObject = this.ddata;
    int i = ((AztecDetectorResult)localObject).getNbLayers();
    int j = 2;
    if (i <= j)
    {
      localObject = GenericGF.AZTEC_DATA_6;
      j = 6;
    }
    else
    {
      localObject = this.ddata;
      i = ((AztecDetectorResult)localObject).getNbLayers();
      j = 8;
      if (i <= j)
      {
        localObject = GenericGF.AZTEC_DATA_8;
      }
      else
      {
        localObject = this.ddata;
        i = ((AztecDetectorResult)localObject).getNbLayers();
        j = 22;
        if (i <= j)
        {
          localObject = GenericGF.AZTEC_DATA_10;
          j = 10;
        }
        else
        {
          localObject = GenericGF.AZTEC_DATA_12;
          j = 12;
        }
      }
    }
    AztecDetectorResult localAztecDetectorResult = this.ddata;
    int k = localAztecDetectorResult.getNbDatablocks();
    int m = paramArrayOfBoolean.length / j;
    if (m >= k)
    {
      int n = paramArrayOfBoolean.length % j;
      int[] arrayOfInt = new int[m];
      int i1 = 0;
      boolean[] arrayOfBoolean = null;
      int i2;
      while (i1 < m)
      {
        i2 = readCode(paramArrayOfBoolean, n, j);
        arrayOfInt[i1] = i2;
        i1 += 1;
        n += j;
      }
      try
      {
        paramArrayOfBoolean = new com/google/zxing/common/reedsolomon/ReedSolomonDecoder;
        paramArrayOfBoolean.<init>((GenericGF)localObject);
        i = m - k;
        paramArrayOfBoolean.decode(arrayOfInt, i);
        int i3 = 1;
        n = (i3 << j) - i3;
        i1 = 0;
        arrayOfBoolean = null;
        i2 = 0;
        int i5;
        while (i1 < k)
        {
          i4 = arrayOfInt[i1];
          if ((i4 != 0) && (i4 != n))
          {
            if (i4 != i3)
            {
              i5 = n + -1;
              if (i4 != i5) {}
            }
            else
            {
              i2 += 1;
            }
            i1 += 1;
          }
          else
          {
            throw FormatException.getFormatInstance();
          }
        }
        i1 = k * j - i2;
        arrayOfBoolean = new boolean[i1];
        i2 = 0;
        int i4 = 0;
        while (i2 < k)
        {
          i5 = arrayOfInt[i2];
          if (i5 != i3)
          {
            int i7 = n + -1;
            if (i5 != i7)
            {
              i8 = j + -1;
              while (i8 >= 0)
              {
                int i9 = i4 + 1;
                int i10 = i3 << i8 & i5;
                if (i10 != 0) {
                  i10 = i3;
                } else {
                  i10 = 0;
                }
                arrayOfBoolean[i4] = i10;
                i8 += -1;
                i4 = i9;
              }
            }
          }
          int i8 = i4 + j - i3;
          if (i5 > i3) {
            i5 = i3;
          } else {
            i5 = 0;
          }
          Arrays.fill(arrayOfBoolean, i4, i8, i5);
          int i6 = j + -1;
          i4 += i6;
          i2 += 1;
        }
        paramArrayOfBoolean = new com/google/zxing/aztec/decoder/Decoder$CorrectedBitsResult;
        i = i * 100 / m;
        paramArrayOfBoolean.<init>(arrayOfBoolean, i);
        return paramArrayOfBoolean;
      }
      catch (ReedSolomonException localReedSolomonException)
      {
        throw FormatException.getFormatInstance(localReedSolomonException);
      }
    }
    throw FormatException.getFormatInstance();
  }
  
  private boolean[] extractBits(BitMatrix paramBitMatrix)
  {
    BitMatrix localBitMatrix = paramBitMatrix;
    AztecDetectorResult localAztecDetectorResult1 = this.ddata;
    int i = localAztecDetectorResult1.isCompact();
    AztecDetectorResult localAztecDetectorResult2 = this.ddata;
    int i1 = localAztecDetectorResult2.getNbLayers();
    int i2;
    if (i != 0) {
      i2 = 11;
    } else {
      i2 = 14;
    }
    int i3 = i1 * 4;
    i2 += i3;
    int[] arrayOfInt = new int[i2];
    int i4 = totalBitsInLayer(i1, i);
    boolean[] arrayOfBoolean = new boolean[i4];
    int i5 = 2;
    if (i != 0)
    {
      i6 = 0;
      while (i6 < i2)
      {
        arrayOfInt[i6] = i6;
        i6 += 1;
      }
    }
    int i6 = i2 + 1;
    int i7 = i2 / 2;
    int i8 = (i7 + -1) / 15 * i5;
    i6 = (i6 + i8) / i5;
    i8 = 0;
    int i9;
    int i10;
    int i11;
    while (i8 < i7)
    {
      i9 = i8 / 15 + i8;
      i10 = i7 - i8 + -1;
      i11 = i6 - i9 + -1;
      arrayOfInt[i10] = i11;
      i10 = i7 + i8;
      i9 = i9 + i6 + 1;
      arrayOfInt[i10] = i9;
      i8 += 1;
    }
    i6 = 0;
    i7 = 0;
    while (i6 < i1)
    {
      i8 = (i1 - i6) * 4;
      if (i != 0) {
        i9 = 9;
      } else {
        i9 = 12;
      }
      i8 += i9;
      i9 = i6 * 2;
      i10 = i2 + -1 - i9;
      i11 = 0;
      int n;
      while (i11 < i8)
      {
        int i12 = i11 * 2;
        int i13 = 0;
        while (i13 < i5)
        {
          i14 = i7 + i12 + i13;
          int i15 = i9 + i13;
          i5 = arrayOfInt[i15];
          i16 = i9 + i11;
          int i17 = arrayOfInt[i16];
          boolean bool3 = localBitMatrix.get(i5, i17);
          arrayOfBoolean[i14] = bool3;
          int i18 = i8 * 2 + i7 + i12 + i13;
          i5 = arrayOfInt[i16];
          i14 = i10 - i13;
          i16 = i;
          int j = arrayOfInt[i14];
          boolean bool1 = localBitMatrix.get(i5, j);
          arrayOfBoolean[i18] = bool1;
          i18 = i8 * 4 + i7 + i12 + i13;
          int k = arrayOfInt[i14];
          i5 = i10 - i11;
          i14 = i1;
          i1 = arrayOfInt[i5];
          boolean bool2 = localBitMatrix.get(k, i1);
          arrayOfBoolean[i18] = bool2;
          i18 = i8 * 6 + i7 + i12 + i13;
          int m = arrayOfInt[i5];
          i1 = arrayOfInt[i15];
          n = localBitMatrix.get(m, i1);
          arrayOfBoolean[i18] = n;
          i13 += 1;
          i1 = i14;
          n = i16;
          i5 = 2;
        }
        i16 = n;
        i14 = i1;
        i11 += 1;
        i5 = 2;
      }
      int i16 = n;
      int i14 = i1;
      i8 *= 8;
      i7 += i8;
      i6 += 1;
      i5 = 2;
    }
    return arrayOfBoolean;
  }
  
  private static String getCharacter(Decoder.Table paramTable, int paramInt)
  {
    int[] arrayOfInt = Decoder.1.$SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;
    int i = paramTable.ordinal();
    i = arrayOfInt[i];
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j)
      {
        j = 3;
        if (i != j)
        {
          j = 4;
          if (i != j)
          {
            j = 5;
            if (i == j) {
              return DIGIT_TABLE[paramInt];
            }
            paramTable = new java/lang/IllegalStateException;
            String str = m54207b69.F54207b69_11("A57755531845595D6058");
            paramTable.<init>(str);
            throw paramTable;
          }
          return PUNCT_TABLE[paramInt];
        }
        return MIXED_TABLE[paramInt];
      }
      return LOWER_TABLE[paramInt];
    }
    return UPPER_TABLE[paramInt];
  }
  
  private static String getEncodedData(boolean[] paramArrayOfBoolean)
  {
    int i = paramArrayOfBoolean.length;
    Object localObject1 = Decoder.Table.UPPER;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int j = paramArrayOfBoolean.length;
    int k = 5;
    j -= k;
    int m = 4;
    j /= m;
    localStringBuilder.<init>(j);
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    Charset localCharset = DEFAULT_ENCODING;
    int n = 0;
    Object localObject2 = localObject1;
    label499:
    IllegalStateException localIllegalStateException;
    if (n < i)
    {
      Object localObject3 = Decoder.Table.BINARY;
      int i1 = 11;
      int i3;
      int i8;
      int i5;
      if (localObject1 == localObject3)
      {
        i3 = i - n;
        if (i3 >= k)
        {
          i3 = readCode(paramArrayOfBoolean, n, k);
          n += 5;
          if (i3 == 0)
          {
            i3 = i - n;
            if (i3 >= i1)
            {
              i3 = readCode(paramArrayOfBoolean, n, i1) + 31;
              n += 11;
            }
          }
          else
          {
            int i4 = 0;
            localObject3 = null;
            while (i4 < i3)
            {
              i1 = i - n;
              i8 = 8;
              if (i1 < i8)
              {
                n = i;
                break;
              }
              i1 = (byte)readCode(paramArrayOfBoolean, n, i8);
              localByteArrayOutputStream.write(i1);
              n += 8;
              i4 += 1;
            }
          }
        }
      }
      else
      {
        for (;;)
        {
          localObject1 = localObject2;
          break;
          localObject3 = Decoder.Table.DIGIT;
          if (localObject1 == localObject3) {
            i5 = m;
          } else {
            i5 = k;
          }
          i8 = i - n;
          if (i8 < i5) {
            break label656;
          }
          int i9 = readCode(paramArrayOfBoolean, n, i5);
          n += i5;
          localObject3 = getCharacter((Decoder.Table)localObject1, i9);
          String str1 = m54207b69.F54207b69_11("['616C62124D13");
          boolean bool2 = str1.equals(localObject3);
          int i7;
          if (bool2)
          {
            i3 = i - n;
            i5 = 3;
            if (i3 < i5) {
              break label656;
            }
            i3 = readCode(paramArrayOfBoolean, n, i5);
            n += 3;
            try
            {
              localObject3 = localCharset.name();
              localObject3 = localByteArrayOutputStream.toString((String)localObject3);
              localStringBuilder.append((String)localObject3);
              localByteArrayOutputStream.reset();
              if (i3 != 0)
              {
                int i6 = 7;
                if (i3 != i6)
                {
                  i7 = i - n;
                  int i10 = i3 * 4;
                  if (i7 < i10) {
                    continue;
                  }
                  int i11 = 0;
                  localCharset = null;
                  int i12;
                  for (;;)
                  {
                    i7 = i3 + -1;
                    if (i3 <= 0) {
                      break label499;
                    }
                    i3 = readCode(paramArrayOfBoolean, n, m);
                    n += 4;
                    i10 = 2;
                    if ((i3 < i10) || (i3 > i1)) {
                      break;
                    }
                    i11 *= 10;
                    i3 += -2;
                    i11 += i3;
                    i3 = i7;
                  }
                  throw FormatException.getFormatInstance();
                  localObject1 = CharacterSetECI.getCharacterSetECIByValue(i12);
                  if (localObject1 != null)
                  {
                    localCharset = ((CharacterSetECI)localObject1).getCharset();
                    continue;
                  }
                  throw FormatException.getFormatInstance();
                }
                throw FormatException.getFormatInstance();
              }
              i3 = 29;
              localStringBuilder.append(i3);
            }
            catch (UnsupportedEncodingException paramArrayOfBoolean)
            {
              localIllegalStateException = new java/lang/IllegalStateException;
              localIllegalStateException.<init>(paramArrayOfBoolean);
              throw localIllegalStateException;
            }
          }
          else
          {
            String str2 = m54207b69.F54207b69_11("LX1B0D0C170B");
            boolean bool1 = ((String)localObject3).startsWith(str2);
            if (bool1)
            {
              char c = ((String)localObject3).charAt(k);
              localObject2 = getTable(c);
              i7 = ((String)localObject3).charAt(6);
              int i2 = 76;
              if (i7 == i2) {
                continue;
              }
              Object localObject4 = localObject2;
              localObject2 = localObject1;
              localObject1 = localObject4;
              break;
            }
            localObject1 = StandardCharsets.US_ASCII;
            localObject1 = ((String)localObject3).getBytes((Charset)localObject1);
            i7 = localObject1.length;
            localByteArrayOutputStream.write((byte[])localObject1, 0, i7);
          }
        }
      }
    }
    try
    {
      label656:
      paramArrayOfBoolean = localCharset.name();
      paramArrayOfBoolean = localByteArrayOutputStream.toString(paramArrayOfBoolean);
      localStringBuilder.append(paramArrayOfBoolean);
      return localStringBuilder.toString();
    }
    catch (UnsupportedEncodingException paramArrayOfBoolean)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>(paramArrayOfBoolean);
      throw localIllegalStateException;
    }
  }
  
  private static Decoder.Table getTable(char paramChar)
  {
    char c = 'B';
    if (paramChar != c)
    {
      c = 'D';
      if (paramChar != c)
      {
        c = 'P';
        if (paramChar != c)
        {
          c = 'L';
          if (paramChar != c)
          {
            c = 'M';
            if (paramChar != c) {
              return Decoder.Table.UPPER;
            }
            return Decoder.Table.MIXED;
          }
          return Decoder.Table.LOWER;
        }
        return Decoder.Table.PUNCT;
      }
      return Decoder.Table.DIGIT;
    }
    return Decoder.Table.BINARY;
  }
  
  public static String highLevelDecode(boolean[] paramArrayOfBoolean)
  {
    return getEncodedData(paramArrayOfBoolean);
  }
  
  private static byte readByte(boolean[] paramArrayOfBoolean, int paramInt)
  {
    int i = paramArrayOfBoolean.length - paramInt;
    int j = 8;
    int k;
    if (i >= j) {
      k = readCode(paramArrayOfBoolean, paramInt, j);
    }
    for (;;)
    {
      return (byte)k;
      k = readCode(paramArrayOfBoolean, paramInt, i);
      j -= i;
      k <<= j;
    }
  }
  
  private static int readCode(boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = paramInt1;
    for (;;)
    {
      int k = paramInt1 + paramInt2;
      if (j >= k) {
        break;
      }
      i <<= 1;
      k = paramArrayOfBoolean[j];
      if (k != 0) {
        i |= 0x1;
      }
      j += 1;
    }
    return i;
  }
  
  private static int totalBitsInLayer(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramBoolean = true;
    } else {
      paramBoolean = true;
    }
    boolean bool = paramInt * 16;
    return (paramBoolean + bool) * paramInt;
  }
  
  public DecoderResult decode(AztecDetectorResult paramAztecDetectorResult)
  {
    this.ddata = paramAztecDetectorResult;
    paramAztecDetectorResult = paramAztecDetectorResult.getBits();
    paramAztecDetectorResult = extractBits(paramAztecDetectorResult);
    paramAztecDetectorResult = correctBits(paramAztecDetectorResult);
    byte[] arrayOfByte = convertBoolArrayToByteArray(Decoder.CorrectedBitsResult.access$000(paramAztecDetectorResult));
    String str = getEncodedData(Decoder.CorrectedBitsResult.access$000(paramAztecDetectorResult));
    DecoderResult localDecoderResult = new com/google/zxing/common/DecoderResult;
    Object localObject = Integer.valueOf(Decoder.CorrectedBitsResult.access$100(paramAztecDetectorResult));
    localObject = new Object[] { localObject };
    localObject = String.format(m54207b69.F54207b69_11("y}581A5A5B"), (Object[])localObject);
    localDecoderResult.<init>(arrayOfByte, str, null, (String)localObject);
    int i = Decoder.CorrectedBitsResult.access$000(paramAztecDetectorResult).length;
    localDecoderResult.setNumBits(i);
    return localDecoderResult;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.aztec.decoder.Decoder
 * JD-Core Version:    0.7.0.1
 */