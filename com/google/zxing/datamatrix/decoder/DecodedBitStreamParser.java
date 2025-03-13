package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.ECIStringBuilder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m54207b69;

final class DecodedBitStreamParser
{
  private static final char[] C40_BASIC_SET_CHARS;
  private static final char[] C40_SHIFT2_SET_CHARS;
  private static final char[] TEXT_BASIC_SET_CHARS;
  private static final char[] TEXT_SHIFT2_SET_CHARS;
  private static final char[] TEXT_SHIFT3_SET_CHARS;
  
  static
  {
    int i = 40;
    char[] arrayOfChar1 = new char[i];
    char[] tmp8_7 = arrayOfChar1;
    char[] tmp9_8 = tmp8_7;
    char[] tmp9_8 = tmp8_7;
    tmp9_8[0] = 42;
    tmp9_8[1] = 42;
    char[] tmp18_9 = tmp9_8;
    char[] tmp18_9 = tmp9_8;
    tmp18_9[2] = 42;
    tmp18_9[3] = 32;
    char[] tmp27_18 = tmp18_9;
    char[] tmp27_18 = tmp18_9;
    tmp27_18[4] = 48;
    tmp27_18[5] = 49;
    char[] tmp36_27 = tmp27_18;
    char[] tmp36_27 = tmp27_18;
    tmp36_27[6] = 50;
    tmp36_27[7] = 51;
    char[] tmp47_36 = tmp36_27;
    char[] tmp47_36 = tmp36_27;
    tmp47_36[8] = 52;
    tmp47_36[9] = 53;
    char[] tmp58_47 = tmp47_36;
    char[] tmp58_47 = tmp47_36;
    tmp58_47[10] = 54;
    tmp58_47[11] = 55;
    char[] tmp69_58 = tmp58_47;
    char[] tmp69_58 = tmp58_47;
    tmp69_58[12] = 56;
    tmp69_58[13] = 57;
    char[] tmp80_69 = tmp69_58;
    char[] tmp80_69 = tmp69_58;
    tmp80_69[14] = 65;
    tmp80_69[15] = 66;
    char[] tmp91_80 = tmp80_69;
    char[] tmp91_80 = tmp80_69;
    tmp91_80[16] = 67;
    tmp91_80[17] = 68;
    char[] tmp102_91 = tmp91_80;
    char[] tmp102_91 = tmp91_80;
    tmp102_91[18] = 69;
    tmp102_91[19] = 70;
    char[] tmp113_102 = tmp102_91;
    char[] tmp113_102 = tmp102_91;
    tmp113_102[20] = 71;
    tmp113_102[21] = 72;
    char[] tmp124_113 = tmp113_102;
    char[] tmp124_113 = tmp113_102;
    tmp124_113[22] = 73;
    tmp124_113[23] = 74;
    char[] tmp135_124 = tmp124_113;
    char[] tmp135_124 = tmp124_113;
    tmp135_124[24] = 75;
    tmp135_124[25] = 76;
    char[] tmp146_135 = tmp135_124;
    char[] tmp146_135 = tmp135_124;
    tmp146_135[26] = 77;
    tmp146_135[27] = 78;
    char[] tmp157_146 = tmp146_135;
    char[] tmp157_146 = tmp146_135;
    tmp157_146[28] = 79;
    tmp157_146[29] = 80;
    char[] tmp168_157 = tmp157_146;
    char[] tmp168_157 = tmp157_146;
    tmp168_157[30] = 81;
    tmp168_157[31] = 82;
    char[] tmp179_168 = tmp168_157;
    char[] tmp179_168 = tmp168_157;
    tmp179_168[32] = 83;
    tmp179_168[33] = 84;
    char[] tmp190_179 = tmp179_168;
    char[] tmp190_179 = tmp179_168;
    tmp190_179[34] = 85;
    tmp190_179[35] = 86;
    char[] tmp201_190 = tmp190_179;
    char[] tmp201_190 = tmp190_179;
    tmp201_190[36] = 87;
    tmp201_190[37] = 88;
    tmp201_190[38] = 89;
    tmp201_190[39] = 90;
    C40_BASIC_SET_CHARS = arrayOfChar1;
    arrayOfChar1 = new char[27];
    char[] tmp232_231 = arrayOfChar1;
    char[] tmp233_232 = tmp232_231;
    char[] tmp233_232 = tmp232_231;
    tmp233_232[0] = 33;
    tmp233_232[1] = 34;
    char[] tmp242_233 = tmp233_232;
    char[] tmp242_233 = tmp233_232;
    tmp242_233[2] = 35;
    tmp242_233[3] = 36;
    char[] tmp251_242 = tmp242_233;
    char[] tmp251_242 = tmp242_233;
    tmp251_242[4] = 37;
    tmp251_242[5] = 38;
    char[] tmp260_251 = tmp251_242;
    char[] tmp260_251 = tmp251_242;
    tmp260_251[6] = 39;
    tmp260_251[7] = 40;
    char[] tmp271_260 = tmp260_251;
    char[] tmp271_260 = tmp260_251;
    tmp271_260[8] = 41;
    tmp271_260[9] = 42;
    char[] tmp282_271 = tmp271_260;
    char[] tmp282_271 = tmp271_260;
    tmp282_271[10] = 43;
    tmp282_271[11] = 44;
    char[] tmp293_282 = tmp282_271;
    char[] tmp293_282 = tmp282_271;
    tmp293_282[12] = 45;
    tmp293_282[13] = 46;
    char[] tmp304_293 = tmp293_282;
    char[] tmp304_293 = tmp293_282;
    tmp304_293[14] = 47;
    tmp304_293[15] = 58;
    char[] tmp315_304 = tmp304_293;
    char[] tmp315_304 = tmp304_293;
    tmp315_304[16] = 59;
    tmp315_304[17] = 60;
    char[] tmp326_315 = tmp315_304;
    char[] tmp326_315 = tmp315_304;
    tmp326_315[18] = 61;
    tmp326_315[19] = 62;
    char[] tmp337_326 = tmp326_315;
    char[] tmp337_326 = tmp326_315;
    tmp337_326[20] = 63;
    tmp337_326[21] = 64;
    char[] tmp348_337 = tmp337_326;
    char[] tmp348_337 = tmp337_326;
    tmp348_337[22] = 91;
    tmp348_337[23] = 92;
    tmp348_337[24] = 93;
    char[] tmp364_348 = tmp348_337;
    tmp364_348[25] = 94;
    tmp364_348[26] = 95;
    C40_SHIFT2_SET_CHARS = arrayOfChar1;
    char[] arrayOfChar2 = new char[i];
    char[] tmp384_383 = arrayOfChar2;
    char[] tmp385_384 = tmp384_383;
    char[] tmp385_384 = tmp384_383;
    tmp385_384[0] = 42;
    tmp385_384[1] = 42;
    char[] tmp394_385 = tmp385_384;
    char[] tmp394_385 = tmp385_384;
    tmp394_385[2] = 42;
    tmp394_385[3] = 32;
    char[] tmp403_394 = tmp394_385;
    char[] tmp403_394 = tmp394_385;
    tmp403_394[4] = 48;
    tmp403_394[5] = 49;
    char[] tmp412_403 = tmp403_394;
    char[] tmp412_403 = tmp403_394;
    tmp412_403[6] = 50;
    tmp412_403[7] = 51;
    char[] tmp423_412 = tmp412_403;
    char[] tmp423_412 = tmp412_403;
    tmp423_412[8] = 52;
    tmp423_412[9] = 53;
    char[] tmp434_423 = tmp423_412;
    char[] tmp434_423 = tmp423_412;
    tmp434_423[10] = 54;
    tmp434_423[11] = 55;
    char[] tmp445_434 = tmp434_423;
    char[] tmp445_434 = tmp434_423;
    tmp445_434[12] = 56;
    tmp445_434[13] = 57;
    char[] tmp456_445 = tmp445_434;
    char[] tmp456_445 = tmp445_434;
    tmp456_445[14] = 97;
    tmp456_445[15] = 98;
    char[] tmp467_456 = tmp456_445;
    char[] tmp467_456 = tmp456_445;
    tmp467_456[16] = 99;
    tmp467_456[17] = 100;
    char[] tmp478_467 = tmp467_456;
    char[] tmp478_467 = tmp467_456;
    tmp478_467[18] = 101;
    tmp478_467[19] = 102;
    char[] tmp489_478 = tmp478_467;
    char[] tmp489_478 = tmp478_467;
    tmp489_478[20] = 103;
    tmp489_478[21] = 104;
    char[] tmp500_489 = tmp489_478;
    char[] tmp500_489 = tmp489_478;
    tmp500_489[22] = 105;
    tmp500_489[23] = 106;
    char[] tmp511_500 = tmp500_489;
    char[] tmp511_500 = tmp500_489;
    tmp511_500[24] = 107;
    tmp511_500[25] = 108;
    char[] tmp522_511 = tmp511_500;
    char[] tmp522_511 = tmp511_500;
    tmp522_511[26] = 109;
    tmp522_511[27] = 110;
    char[] tmp533_522 = tmp522_511;
    char[] tmp533_522 = tmp522_511;
    tmp533_522[28] = 111;
    tmp533_522[29] = 112;
    char[] tmp544_533 = tmp533_522;
    char[] tmp544_533 = tmp533_522;
    tmp544_533[30] = 113;
    tmp544_533[31] = 114;
    char[] tmp555_544 = tmp544_533;
    char[] tmp555_544 = tmp544_533;
    tmp555_544[32] = 115;
    tmp555_544[33] = 116;
    char[] tmp566_555 = tmp555_544;
    char[] tmp566_555 = tmp555_544;
    tmp566_555[34] = 117;
    tmp566_555[35] = 118;
    char[] tmp577_566 = tmp566_555;
    char[] tmp577_566 = tmp566_555;
    tmp577_566[36] = 119;
    tmp577_566[37] = 120;
    tmp577_566[38] = 121;
    tmp577_566[39] = 122;
    TEXT_BASIC_SET_CHARS = arrayOfChar2;
    TEXT_SHIFT2_SET_CHARS = arrayOfChar1;
    arrayOfChar2 = new char[32];
    char[] tmp612_611 = arrayOfChar2;
    char[] tmp613_612 = tmp612_611;
    char[] tmp613_612 = tmp612_611;
    tmp613_612[0] = 96;
    tmp613_612[1] = 65;
    char[] tmp622_613 = tmp613_612;
    char[] tmp622_613 = tmp613_612;
    tmp622_613[2] = 66;
    tmp622_613[3] = 67;
    char[] tmp631_622 = tmp622_613;
    char[] tmp631_622 = tmp622_613;
    tmp631_622[4] = 68;
    tmp631_622[5] = 69;
    char[] tmp640_631 = tmp631_622;
    char[] tmp640_631 = tmp631_622;
    tmp640_631[6] = 70;
    tmp640_631[7] = 71;
    char[] tmp651_640 = tmp640_631;
    char[] tmp651_640 = tmp640_631;
    tmp651_640[8] = 72;
    tmp651_640[9] = 73;
    char[] tmp662_651 = tmp651_640;
    char[] tmp662_651 = tmp651_640;
    tmp662_651[10] = 74;
    tmp662_651[11] = 75;
    char[] tmp673_662 = tmp662_651;
    char[] tmp673_662 = tmp662_651;
    tmp673_662[12] = 76;
    tmp673_662[13] = 77;
    char[] tmp684_673 = tmp673_662;
    char[] tmp684_673 = tmp673_662;
    tmp684_673[14] = 78;
    tmp684_673[15] = 79;
    char[] tmp695_684 = tmp684_673;
    char[] tmp695_684 = tmp684_673;
    tmp695_684[16] = 80;
    tmp695_684[17] = 81;
    char[] tmp706_695 = tmp695_684;
    char[] tmp706_695 = tmp695_684;
    tmp706_695[18] = 82;
    tmp706_695[19] = 83;
    char[] tmp717_706 = tmp706_695;
    char[] tmp717_706 = tmp706_695;
    tmp717_706[20] = 84;
    tmp717_706[21] = 85;
    char[] tmp728_717 = tmp717_706;
    char[] tmp728_717 = tmp717_706;
    tmp728_717[22] = 86;
    tmp728_717[23] = 87;
    char[] tmp739_728 = tmp728_717;
    char[] tmp739_728 = tmp728_717;
    tmp739_728[24] = 88;
    tmp739_728[25] = 89;
    char[] tmp750_739 = tmp739_728;
    char[] tmp750_739 = tmp739_728;
    tmp750_739[26] = 90;
    tmp750_739[27] = 123;
    char[] tmp761_750 = tmp750_739;
    char[] tmp761_750 = tmp750_739;
    tmp761_750[28] = 124;
    tmp761_750[29] = 125;
    tmp761_750[30] = 126;
    tmp761_750[31] = 127;
    TEXT_SHIFT3_SET_CHARS = arrayOfChar2;
  }
  
  public static DecoderResult decode(byte[] paramArrayOfByte)
  {
    Object localObject1 = new com/google/zxing/common/BitSource;
    ((BitSource)localObject1).<init>(paramArrayOfByte);
    ECIStringBuilder localECIStringBuilder = new com/google/zxing/common/ECIStringBuilder;
    int i = 100;
    localECIStringBuilder.<init>(i);
    Object localObject2 = new java/lang/StringBuilder;
    boolean bool2 = false;
    Integer localInteger1 = null;
    Integer localInteger2 = Integer.valueOf(0);
    ((StringBuilder)localObject2).<init>(0);
    ArrayList localArrayList = new java/util/ArrayList;
    int j = 1;
    Object localObject3 = Integer.valueOf(j);
    localArrayList.<init>(j);
    Object localObject4 = DecodedBitStreamParser.Mode.ASCII_ENCODE;
    Object localObject5 = new java/util/HashSet;
    ((HashSet)localObject5).<init>();
    int m;
    do
    {
      localObject6 = DecodedBitStreamParser.Mode.ASCII_ENCODE;
      if (localObject4 == localObject6)
      {
        localObject4 = decodeAsciiSegment((BitSource)localObject1, localECIStringBuilder, (StringBuilder)localObject2, (Set)localObject5);
      }
      else
      {
        int[] arrayOfInt = DecodedBitStreamParser.1.$SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode;
        int k = ((Enum)localObject4).ordinal();
        k = arrayOfInt[k];
        switch (k)
        {
        default: 
          throw FormatException.getFormatInstance();
        case 6: 
          decodeECISegment((BitSource)localObject1, localECIStringBuilder);
          bool2 = j;
          break;
        case 5: 
          decodeBase256Segment((BitSource)localObject1, localECIStringBuilder, localArrayList);
          break;
        case 4: 
          decodeEdifactSegment((BitSource)localObject1, localECIStringBuilder);
          break;
        case 3: 
          decodeAnsiX12Segment((BitSource)localObject1, localECIStringBuilder);
          break;
        case 2: 
          decodeTextSegment((BitSource)localObject1, localECIStringBuilder, (Set)localObject5);
          break;
        case 1: 
          decodeC40Segment((BitSource)localObject1, localECIStringBuilder, (Set)localObject5);
        }
        localObject4 = localObject6;
      }
      localObject6 = DecodedBitStreamParser.Mode.PAD_ENCODE;
      if (localObject4 == localObject6) {
        break;
      }
      m = ((BitSource)localObject1).available();
    } while (m > 0);
    int n = ((StringBuilder)localObject2).length();
    if (n > 0) {
      localECIStringBuilder.appendCharacters((StringBuilder)localObject2);
    }
    n = 5;
    i = 4;
    int i1;
    if (bool2)
    {
      bool2 = ((Set)localObject5).contains(localInteger2);
      if (!bool2)
      {
        localInteger1 = Integer.valueOf(i);
        bool2 = ((Set)localObject5).contains(localInteger1);
        if (!bool2)
        {
          bool2 = ((Set)localObject5).contains(localObject3);
          if (!bool2)
          {
            localObject1 = Integer.valueOf(n);
            i1 = ((Set)localObject5).contains(localObject1);
            if (i1 == 0)
            {
              i2 = i;
              break label470;
            }
          }
          j = 6;
          break label466;
        }
      }
      i2 = i1;
      break label470;
    }
    else
    {
      bool2 = ((Set)localObject5).contains(localInteger2);
      if (!bool2)
      {
        localObject2 = Integer.valueOf(i);
        boolean bool1 = ((Set)localObject5).contains(localObject2);
        if (!bool1)
        {
          bool1 = ((Set)localObject5).contains(localObject3);
          if (!bool1)
          {
            localObject1 = Integer.valueOf(i1);
            boolean bool3 = ((Set)localObject5).contains(localObject1);
            if (!bool3) {
              break label466;
            }
          }
          j = 3;
          break label466;
        }
      }
      j = 2;
    }
    label466:
    int i2 = j;
    label470:
    localObject1 = new com/google/zxing/common/DecoderResult;
    localObject5 = localECIStringBuilder.toString();
    boolean bool4 = localArrayList.isEmpty();
    if (bool4) {
      localArrayList = null;
    }
    Object localObject6 = localArrayList;
    localObject3 = localObject1;
    localObject4 = paramArrayOfByte;
    ((DecoderResult)localObject1).<init>(paramArrayOfByte, (String)localObject5, localArrayList, null, i2);
    return localObject1;
  }
  
  private static void decodeAnsiX12Segment(BitSource paramBitSource, ECIStringBuilder paramECIStringBuilder)
  {
    int i = 3;
    int[] arrayOfInt = new int[i];
    int j;
    label183:
    do
    {
      j = paramBitSource.available();
      int k = 8;
      if (j == k) {
        return;
      }
      j = paramBitSource.readBits(k);
      int m = 254;
      if (j == m) {
        return;
      }
      k = paramBitSource.readBits(k);
      parseTwoBytes(j, k, arrayOfInt);
      j = 0;
      while (j < i)
      {
        k = arrayOfInt[j];
        if (k != 0)
        {
          m = 1;
          if (k != m)
          {
            int n = 2;
            if (k != n)
            {
              if (k != i)
              {
                int i1 = 14;
                if (k < i1) {
                  k += 44;
                }
                for (;;)
                {
                  k = (char)k;
                  break label183;
                  int i2 = 40;
                  if (k >= i2) {
                    break;
                  }
                  k += 51;
                }
                throw FormatException.getFormatInstance();
              }
              k = 32;
            }
            else
            {
              k = 62;
            }
          }
          else
          {
            k = 42;
          }
        }
        else
        {
          k = 13;
        }
        paramECIStringBuilder.append(k);
        j += 1;
      }
      j = paramBitSource.available();
    } while (j > 0);
  }
  
  private static DecodedBitStreamParser.Mode decodeAsciiSegment(BitSource paramBitSource, ECIStringBuilder paramECIStringBuilder, StringBuilder paramStringBuilder, Set paramSet)
  {
    int i = 0;
    int k;
    do
    {
      int j = paramBitSource.readBits(8);
      if (j == 0) {
        break label337;
      }
      int m = 1;
      int i2 = 128;
      if (j <= i2)
      {
        if (i != 0) {
          j += 128;
        }
        char c = (char)(j - m);
        paramECIStringBuilder.append(c);
        return DecodedBitStreamParser.Mode.ASCII_ENCODE;
      }
      int i3 = 129;
      if (j == i3) {
        return DecodedBitStreamParser.Mode.PAD_ENCODE;
      }
      int i4 = 229;
      int i1;
      if (j <= i4)
      {
        j += -130;
        int n = 10;
        if (j < n)
        {
          i1 = 48;
          paramECIStringBuilder.append(i1);
        }
        paramECIStringBuilder.append(j);
      }
      else
      {
        String str = "\036\004";
        Object localObject;
        switch (j)
        {
        default: 
          i1 = 254;
          if (j != i1) {
            break label333;
          }
          j = paramBitSource.available();
          if (j != 0) {
            break label333;
          }
          break;
        case 241: 
          return DecodedBitStreamParser.Mode.ECI_ENCODE;
        case 240: 
          return DecodedBitStreamParser.Mode.EDIFACT_ENCODE;
        case 239: 
          return DecodedBitStreamParser.Mode.TEXT_ENCODE;
        case 238: 
          return DecodedBitStreamParser.Mode.ANSIX12_ENCODE;
        case 237: 
          localObject = m54207b69.F54207b69_11("Nh334258795C637B");
          break;
        case 236: 
          localObject = m54207b69.F54207b69_11("{p2B5A5071444A73");
          paramECIStringBuilder.append((String)localObject);
          paramStringBuilder.insert(0, str);
          break;
        case 235: 
          i = i1;
          break;
        case 232: 
          localObject = Integer.valueOf(paramECIStringBuilder.length());
          paramSet.add(localObject);
          j = 29;
          paramECIStringBuilder.append(j);
          break;
        case 231: 
          return DecodedBitStreamParser.Mode.BASE256_ENCODE;
        case 230: 
          return DecodedBitStreamParser.Mode.C40_ENCODE;
        }
      }
      k = paramBitSource.available();
    } while (k > 0);
    return DecodedBitStreamParser.Mode.ASCII_ENCODE;
    label333:
    throw FormatException.getFormatInstance();
    label337:
    throw FormatException.getFormatInstance();
  }
  
  private static void decodeBase256Segment(BitSource paramBitSource, ECIStringBuilder paramECIStringBuilder, Collection paramCollection)
  {
    int i = paramBitSource.getByteOffset() + 1;
    int j = 8;
    int k = paramBitSource.readBits(j);
    int m = i + 1;
    i = unrandomize255State(k, i);
    int n;
    if (i == 0)
    {
      i = paramBitSource.available() / j;
    }
    else
    {
      k = 250;
      if (i >= k)
      {
        i = (i + -249) * k;
        k = paramBitSource.readBits(j);
        n = m + 1;
        k = unrandomize255State(k, m);
        i += k;
        m = n;
      }
    }
    if (i >= 0)
    {
      byte[] arrayOfByte = new byte[i];
      n = 0;
      while (n < i)
      {
        int i1 = paramBitSource.available();
        if (i1 >= j)
        {
          i1 = paramBitSource.readBits(j);
          int i2 = m + 1;
          m = (byte)unrandomize255State(i1, m);
          arrayOfByte[n] = m;
          n += 1;
          m = i2;
        }
        else
        {
          throw FormatException.getFormatInstance();
        }
      }
      paramCollection.add(arrayOfByte);
      paramBitSource = new java/lang/String;
      paramCollection = StandardCharsets.ISO_8859_1;
      paramBitSource.<init>(arrayOfByte, paramCollection);
      paramECIStringBuilder.append(paramBitSource);
      return;
    }
    throw FormatException.getFormatInstance();
  }
  
  private static void decodeC40Segment(BitSource paramBitSource, ECIStringBuilder paramECIStringBuilder, Set paramSet)
  {
    int i = 3;
    int[] arrayOfInt = new int[i];
    int j = 0;
    int k = 0;
    Object localObject = null;
    int n;
    label270:
    label282:
    label287:
    label293:
    do
    {
      n = paramBitSource.available();
      int i1 = 8;
      if (n == i1) {
        return;
      }
      n = paramBitSource.readBits(i1);
      int i3 = 254;
      if (n == i3) {
        return;
      }
      i1 = paramBitSource.readBits(i1);
      parseTwoBytes(n, i1, arrayOfInt);
      n = 0;
      while (n < i)
      {
        i1 = arrayOfInt[n];
        int i2;
        int m;
        if (k != 0)
        {
          i3 = 1;
          if (k != i3)
          {
            int i4 = 2;
            if (k != i4)
            {
              if (k == i)
              {
                if (j != 0)
                {
                  i1 += 224;
                }
                else
                {
                  i1 += 96;
                  break label282;
                }
              }
              else {
                throw FormatException.getFormatInstance();
              }
            }
            else
            {
              localObject = C40_SHIFT2_SET_CHARS;
              int i5 = localObject.length;
              if (i1 < i5)
              {
                k = localObject[i1];
                if (j == 0) {
                  break label287;
                }
                k += 128;
                j = (char)k;
                break label270;
              }
              k = 27;
              if (i1 != k)
              {
                j = 30;
                if (i1 == j)
                {
                  j = i3;
                  break label293;
                }
                throw FormatException.getFormatInstance();
              }
              localObject = Integer.valueOf(paramECIStringBuilder.length());
              paramSet.add(localObject);
              k = 29;
              break label287;
            }
          }
          else
          {
            if (j == 0) {
              break label282;
            }
            i1 += 128;
          }
          j = (char)i2;
          paramECIStringBuilder.append(j);
          j = 0;
          break label293;
          k = (char)i2;
          paramECIStringBuilder.append(k);
          m = 0;
          localObject = null;
        }
        else if (i2 < i)
        {
          i2 += 1;
          m = i2;
        }
        else
        {
          char[] arrayOfChar = C40_BASIC_SET_CHARS;
          int i6 = arrayOfChar.length;
          if (i2 >= i6) {
            break label390;
          }
          i2 = arrayOfChar[i2];
          if (j != 0)
          {
            i2 += 128;
            j = (char)i2;
            paramECIStringBuilder.append(j);
            j = 0;
          }
          else
          {
            paramECIStringBuilder.append(i2);
          }
        }
        n += 1;
        continue;
        throw FormatException.getFormatInstance();
      }
      n = paramBitSource.available();
    } while (n > 0);
    label390:
  }
  
  private static void decodeECISegment(BitSource paramBitSource, ECIStringBuilder paramECIStringBuilder)
  {
    int i = paramBitSource.available();
    int j = 8;
    if (i >= j)
    {
      int k = paramBitSource.readBits(j);
      i = 127;
      if (k <= i)
      {
        k += -1;
        paramECIStringBuilder.appendECI(k);
      }
      return;
    }
    throw FormatException.getFormatInstance();
  }
  
  private static void decodeEdifactSegment(BitSource paramBitSource, ECIStringBuilder paramECIStringBuilder)
  {
    int i;
    do
    {
      i = paramBitSource.available();
      int j = 16;
      if (i <= j) {
        return;
      }
      i = 0;
      for (;;)
      {
        j = 4;
        if (i >= j) {
          break;
        }
        j = paramBitSource.readBits(6);
        int k = 31;
        if (j == k)
        {
          int n = paramBitSource.getBitOffset();
          i = 8;
          n = 8 - n;
          if (n != i) {
            paramBitSource.readBits(n);
          }
          return;
        }
        int m = j & 0x20;
        if (m == 0) {
          j |= 0x40;
        }
        j = (char)j;
        paramECIStringBuilder.append(j);
        i += 1;
      }
      i = paramBitSource.available();
    } while (i > 0);
  }
  
  private static void decodeTextSegment(BitSource paramBitSource, ECIStringBuilder paramECIStringBuilder, Set paramSet)
  {
    int i = 3;
    int[] arrayOfInt = new int[i];
    int j = 0;
    int k = 0;
    Object localObject = null;
    int n;
    label280:
    label297:
    label303:
    do
    {
      n = paramBitSource.available();
      int i1 = 8;
      if (n == i1) {
        return;
      }
      n = paramBitSource.readBits(i1);
      int i3 = 254;
      if (n == i3) {
        return;
      }
      i1 = paramBitSource.readBits(i1);
      parseTwoBytes(n, i1, arrayOfInt);
      n = 0;
      while (n < i)
      {
        i1 = arrayOfInt[n];
        int i2;
        int m;
        if (k != 0)
        {
          i3 = 1;
          if (k != i3)
          {
            int i5 = 2;
            int i4;
            if (k != i5) {
              if (k == i)
              {
                localObject = TEXT_SHIFT3_SET_CHARS;
                i4 = localObject.length;
                if (i1 < i4)
                {
                  k = localObject[i1];
                  if (j == 0) {
                    break label297;
                  }
                }
              }
            }
            for (;;)
            {
              k += 128;
              j = (char)k;
              break label280;
              throw FormatException.getFormatInstance();
              throw FormatException.getFormatInstance();
              localObject = TEXT_SHIFT2_SET_CHARS;
              int i6 = localObject.length;
              if (i1 >= i6) {
                break;
              }
              k = localObject[i1];
              if (j == 0) {
                break label297;
              }
            }
            k = 27;
            if (i1 != k)
            {
              j = 30;
              if (i1 == j)
              {
                j = i4;
                break label303;
              }
              throw FormatException.getFormatInstance();
            }
            localObject = Integer.valueOf(paramECIStringBuilder.length());
            paramSet.add(localObject);
            k = 29;
          }
          else
          {
            if (j != 0)
            {
              i1 += 128;
              j = (char)i2;
              paramECIStringBuilder.append(j);
              j = 0;
              break label303;
            }
            k = (char)i2;
          }
          paramECIStringBuilder.append(k);
          m = 0;
          localObject = null;
        }
        else if (i2 < i)
        {
          i2 += 1;
          m = i2;
        }
        else
        {
          char[] arrayOfChar = TEXT_BASIC_SET_CHARS;
          int i7 = arrayOfChar.length;
          if (i2 >= i7) {
            break label400;
          }
          i2 = arrayOfChar[i2];
          if (j != 0)
          {
            i2 += 128;
            j = (char)i2;
            paramECIStringBuilder.append(j);
            j = 0;
          }
          else
          {
            paramECIStringBuilder.append(i2);
          }
        }
        n += 1;
        continue;
        throw FormatException.getFormatInstance();
      }
      n = paramBitSource.available();
    } while (n > 0);
    label400:
  }
  
  private static void parseTwoBytes(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    paramInt1 = (paramInt1 << 8) + paramInt2;
    paramInt2 = 1;
    paramInt1 -= paramInt2;
    int i = paramInt1 / 1600;
    paramArrayOfInt[0] = i;
    i *= 1600;
    paramInt1 -= i;
    i = paramInt1 / 40;
    paramArrayOfInt[paramInt2] = i;
    i *= 40;
    paramInt1 -= i;
    paramArrayOfInt[2] = paramInt1;
  }
  
  private static int unrandomize255State(int paramInt1, int paramInt2)
  {
    paramInt2 = paramInt2 * 149 % 255 + 1;
    paramInt1 -= paramInt2;
    if (paramInt1 < 0) {
      paramInt1 += 256;
    }
    return paramInt1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.decoder.DecodedBitStreamParser
 * JD-Core Version:    0.7.0.1
 */