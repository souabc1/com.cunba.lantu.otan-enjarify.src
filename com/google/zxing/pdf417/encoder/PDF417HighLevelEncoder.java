package com.google.zxing.pdf417.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.ECIInput;
import com.google.zxing.common.MinimalECIInput;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import m54207b69;

final class PDF417HighLevelEncoder
{
  private static final int BYTE_COMPACTION = 1;
  private static final Charset DEFAULT_ENCODING;
  private static final int ECI_CHARSET = 927;
  private static final int ECI_GENERAL_PURPOSE = 926;
  private static final int ECI_USER_DEFINED = 925;
  private static final int LATCH_TO_BYTE = 924;
  private static final int LATCH_TO_BYTE_PADDED = 901;
  private static final int LATCH_TO_NUMERIC = 902;
  private static final int LATCH_TO_TEXT = 900;
  private static final byte[] MIXED;
  private static final int NUMERIC_COMPACTION = 2;
  private static final byte[] PUNCTUATION;
  private static final int SHIFT_TO_BYTE = 913;
  private static final int SUBMODE_ALPHA = 0;
  private static final int SUBMODE_LOWER = 1;
  private static final int SUBMODE_MIXED = 2;
  private static final int SUBMODE_PUNCTUATION = 3;
  private static final int TEXT_COMPACTION;
  private static final byte[] TEXT_MIXED_RAW;
  private static final byte[] TEXT_PUNCTUATION_RAW;
  
  static
  {
    int i = 30;
    byte[] arrayOfByte1 = new byte[i];
    byte[] tmp8_7 = arrayOfByte1;
    byte[] tmp9_8 = tmp8_7;
    byte[] tmp9_8 = tmp8_7;
    tmp9_8[0] = 48;
    tmp9_8[1] = 49;
    byte[] tmp18_9 = tmp9_8;
    byte[] tmp18_9 = tmp9_8;
    tmp18_9[2] = 50;
    tmp18_9[3] = 51;
    byte[] tmp27_18 = tmp18_9;
    byte[] tmp27_18 = tmp18_9;
    tmp27_18[4] = 52;
    tmp27_18[5] = 53;
    byte[] tmp36_27 = tmp27_18;
    byte[] tmp36_27 = tmp27_18;
    tmp36_27[6] = 54;
    tmp36_27[7] = 55;
    byte[] tmp47_36 = tmp36_27;
    byte[] tmp47_36 = tmp36_27;
    tmp47_36[8] = 56;
    tmp47_36[9] = 57;
    byte[] tmp58_47 = tmp47_36;
    byte[] tmp58_47 = tmp47_36;
    tmp58_47[10] = 38;
    tmp58_47[11] = 13;
    byte[] tmp69_58 = tmp58_47;
    byte[] tmp69_58 = tmp58_47;
    tmp69_58[12] = 9;
    tmp69_58[13] = 44;
    byte[] tmp80_69 = tmp69_58;
    byte[] tmp80_69 = tmp69_58;
    tmp80_69[14] = 58;
    tmp80_69[15] = 35;
    byte[] tmp91_80 = tmp80_69;
    byte[] tmp91_80 = tmp80_69;
    tmp91_80[16] = 45;
    tmp91_80[17] = 46;
    byte[] tmp102_91 = tmp91_80;
    byte[] tmp102_91 = tmp91_80;
    tmp102_91[18] = 36;
    tmp102_91[19] = 47;
    byte[] tmp113_102 = tmp102_91;
    byte[] tmp113_102 = tmp102_91;
    tmp113_102[20] = 43;
    tmp113_102[21] = 37;
    byte[] tmp124_113 = tmp113_102;
    byte[] tmp124_113 = tmp113_102;
    tmp124_113[22] = 42;
    tmp124_113[23] = 61;
    byte[] tmp135_124 = tmp124_113;
    byte[] tmp135_124 = tmp124_113;
    tmp135_124[24] = 94;
    tmp135_124[25] = 0;
    byte[] tmp145_135 = tmp135_124;
    byte[] tmp145_135 = tmp135_124;
    tmp145_135[26] = 32;
    tmp145_135[27] = 0;
    tmp145_135[28] = 0;
    tmp145_135[29] = 0;
    TEXT_MIXED_RAW = arrayOfByte1;
    Object localObject = new byte[i];
    Object tmp172_171 = localObject;
    Object tmp173_172 = tmp172_171;
    Object tmp173_172 = tmp172_171;
    tmp173_172[0] = 59;
    tmp173_172[1] = 60;
    Object tmp182_173 = tmp173_172;
    Object tmp182_173 = tmp173_172;
    tmp182_173[2] = 62;
    tmp182_173[3] = 64;
    Object tmp191_182 = tmp182_173;
    Object tmp191_182 = tmp182_173;
    tmp191_182[4] = 91;
    tmp191_182[5] = 92;
    Object tmp200_191 = tmp191_182;
    Object tmp200_191 = tmp191_182;
    tmp200_191[6] = 93;
    tmp200_191[7] = 95;
    Object tmp211_200 = tmp200_191;
    Object tmp211_200 = tmp200_191;
    tmp211_200[8] = 96;
    tmp211_200[9] = 126;
    Object tmp222_211 = tmp211_200;
    Object tmp222_211 = tmp211_200;
    tmp222_211[10] = 33;
    tmp222_211[11] = 13;
    Object tmp233_222 = tmp222_211;
    Object tmp233_222 = tmp222_211;
    tmp233_222[12] = 9;
    tmp233_222[13] = 44;
    Object tmp244_233 = tmp233_222;
    Object tmp244_233 = tmp233_222;
    tmp244_233[14] = 58;
    tmp244_233[15] = 10;
    Object tmp255_244 = tmp244_233;
    Object tmp255_244 = tmp244_233;
    tmp255_244[16] = 45;
    tmp255_244[17] = 46;
    Object tmp266_255 = tmp255_244;
    Object tmp266_255 = tmp255_244;
    tmp266_255[18] = 36;
    tmp266_255[19] = 47;
    Object tmp277_266 = tmp266_255;
    Object tmp277_266 = tmp266_255;
    tmp277_266[20] = 34;
    tmp277_266[21] = 124;
    Object tmp288_277 = tmp277_266;
    Object tmp288_277 = tmp277_266;
    tmp288_277[22] = 42;
    tmp288_277[23] = 40;
    Object tmp299_288 = tmp288_277;
    Object tmp299_288 = tmp288_277;
    tmp299_288[24] = 41;
    tmp299_288[25] = 63;
    Object tmp310_299 = tmp299_288;
    Object tmp310_299 = tmp299_288;
    tmp310_299[26] = 123;
    tmp310_299[27] = 125;
    tmp310_299[28] = 39;
    tmp310_299[29] = 0;
    TEXT_PUNCTUATION_RAW = (byte[])localObject;
    i = 128;
    arrayOfByte1 = new byte[i];
    MIXED = arrayOfByte1;
    PUNCTUATION = new byte[i];
    localObject = StandardCharsets.ISO_8859_1;
    DEFAULT_ENCODING = (Charset)localObject;
    i = -1;
    Arrays.fill(arrayOfByte1, i);
    int k = 0;
    arrayOfByte1 = null;
    int m = 0;
    byte[] arrayOfByte2 = null;
    int i1;
    for (;;)
    {
      byte[] arrayOfByte3 = TEXT_MIXED_RAW;
      int n = arrayOfByte3.length;
      if (m >= n) {
        break;
      }
      i1 = arrayOfByte3[m];
      if (i1 > 0)
      {
        byte[] arrayOfByte4 = MIXED;
        int i2 = (byte)m;
        arrayOfByte4[i1] = i2;
      }
      m += 1;
    }
    arrayOfByte2 = PUNCTUATION;
    Arrays.fill(arrayOfByte2, i);
    for (;;)
    {
      localObject = TEXT_PUNCTUATION_RAW;
      m = localObject.length;
      if (k >= m) {
        break;
      }
      int j = localObject[k];
      if (j > 0)
      {
        arrayOfByte2 = PUNCTUATION;
        i1 = (byte)k;
        arrayOfByte2[j] = i1;
      }
      k += 1;
    }
  }
  
  private static int determineConsecutiveBinaryCount(ECIInput paramECIInput, int paramInt, Charset paramCharset)
  {
    if (paramCharset == null) {
      paramCharset = null;
    } else {
      paramCharset = paramCharset.newEncoder();
    }
    int i = paramECIInput.length();
    int j = paramInt;
    while (j < i)
    {
      int k = 0;
      int m = j;
      int i1;
      int n;
      do
      {
        i1 = 13;
        if (k >= i1) {
          break;
        }
        boolean bool3 = paramECIInput.isECI(m);
        if (bool3) {
          break;
        }
        boolean bool2 = isDigit(paramECIInput.charAt(m));
        if (!bool2) {
          break;
        }
        k += 1;
        n = j + k;
      } while (n < i);
      if (k >= i1) {
        return j - paramInt;
      }
      if (paramCharset != null)
      {
        k = paramECIInput.charAt(j);
        boolean bool1 = paramCharset.canEncode(k);
        if (!bool1)
        {
          char c = paramECIInput.charAt(j);
          WriterException localWriterException = new com/google/zxing/WriterException;
          paramCharset = new java/lang/StringBuilder;
          paramCharset.<init>();
          String str = m54207b69.F54207b69_11("-Q1F3F417F384438453D393D48407E404840344245394939884D4D3F4F4E4252548B92");
          paramCharset.append(str);
          paramCharset.append(c);
          str = m54207b69.F54207b69_11("{g4750340C12090E0A0A6651");
          paramCharset.append(str);
          paramCharset.append(c);
          paramCharset.append(')');
          paramECIInput = paramCharset.toString();
          localWriterException.<init>(paramECIInput);
          throw localWriterException;
        }
      }
      j += 1;
    }
    return j - paramInt;
  }
  
  private static int determineConsecutiveDigitCount(ECIInput paramECIInput, int paramInt)
  {
    int i = paramECIInput.length();
    int j = 0;
    if (paramInt < i) {
      while (paramInt < i)
      {
        boolean bool = paramECIInput.isECI(paramInt);
        if (bool) {
          break;
        }
        bool = isDigit(paramECIInput.charAt(paramInt));
        if (!bool) {
          break;
        }
        j += 1;
        paramInt += 1;
      }
    }
    return j;
  }
  
  private static int determineConsecutiveTextCount(ECIInput paramECIInput, int paramInt)
  {
    int i = paramECIInput.length();
    int j = paramInt;
    while (j < i)
    {
      int k = 0;
      int m;
      for (;;)
      {
        m = 13;
        if ((k >= m) || (j >= i)) {
          break;
        }
        boolean bool2 = paramECIInput.isECI(j);
        if (bool2) {
          break;
        }
        bool2 = isDigit(paramECIInput.charAt(j));
        if (!bool2) {
          break;
        }
        k += 1;
        j += 1;
      }
      if (k >= m) {
        return j - paramInt - k;
      }
      if (k <= 0)
      {
        boolean bool1 = paramECIInput.isECI(j);
        if (bool1) {
          break;
        }
        bool1 = isText(paramECIInput.charAt(j));
        if (!bool1) {
          break;
        }
        j += 1;
      }
    }
    return j - paramInt;
  }
  
  private static void encodeBinary(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, StringBuilder paramStringBuilder)
  {
    int i = 1;
    if ((paramInt2 == i) && (paramInt3 == 0))
    {
      paramInt3 = 913;
    }
    else
    {
      paramInt3 = paramInt2 % 6;
      if (paramInt3 == 0) {
        paramInt3 = 924;
      } else {
        paramInt3 = 901;
      }
    }
    paramStringBuilder.append(paramInt3);
    paramInt3 = 6;
    if (paramInt2 >= paramInt3)
    {
      i = 5;
      char[] arrayOfChar = new char[i];
      j = paramInt1;
      for (;;)
      {
        int k = paramInt1 + paramInt2 - j;
        if (k < paramInt3) {
          break;
        }
        k = 0;
        long l1 = 0L;
        int m = 0;
        while (m < paramInt3)
        {
          l1 <<= 8;
          int n = j + m;
          n = paramArrayOfByte[n] & 0xFF;
          long l2 = n;
          l1 += l2;
          m += 1;
        }
        while (k < i)
        {
          long l3 = 900L;
          long l4 = l1 % l3;
          int i1 = (char)(int)l4;
          arrayOfChar[k] = i1;
          l1 /= l3;
          k += 1;
        }
        k = 4;
        while (k >= 0)
        {
          char c = arrayOfChar[k];
          paramStringBuilder.append(c);
          k += -1;
        }
        j += 6;
      }
    }
    int j = paramInt1;
    for (;;)
    {
      paramInt3 = paramInt1 + paramInt2;
      if (j >= paramInt3) {
        break;
      }
      paramInt3 = (char)(paramArrayOfByte[j] & 0xFF);
      paramStringBuilder.append(paramInt3);
      j += 1;
    }
  }
  
  public static String encodeHighLevel(String paramString, Compaction paramCompaction, Charset paramCharset, boolean paramBoolean)
  {
    boolean bool1 = paramString.isEmpty();
    if (!bool1)
    {
      bool1 = false;
      if ((paramCharset == null) && (!paramBoolean))
      {
        int i = 0;
        localStringBuilder = null;
        for (;;)
        {
          j = paramString.length();
          if (i >= j) {
            break label162;
          }
          j = paramString.charAt(i);
          int k = 255;
          if (j > k) {
            break;
          }
          i += 1;
        }
        paramCompaction = new com/google/zxing/WriterException;
        paramCharset = new java/lang/StringBuilder;
        paramCharset.<init>();
        String str = m54207b69.F54207b69_11("-Q1F3F417F384438453D393D48407E404840344245394939884D4D3F4F4E4252548B92");
        paramCharset.append(str);
        paramBoolean = paramString.charAt(i);
        paramCharset.append(paramBoolean);
        str = m54207b69.F54207b69_11("{g4750340C12090E0A0A6651");
        paramCharset.append(str);
        int m = paramString.charAt(i);
        paramCharset.append(m);
        paramString = m54207b69.F54207b69_11("Fb4B4D4424111117120E101A4D1D1F15101B152D1E201A583E241A27212347292B36573D352B71584D4C7F7D80695065655D6E59545F7739433E86474B7E644A404D4749795F574D71535560976D77717F7372887A8492877E8EA5");
        paramCharset.append(paramString);
        paramString = paramCharset.toString();
        paramCompaction.<init>(paramString);
        throw paramCompaction;
      }
      label162:
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      int j = paramString.length();
      localStringBuilder.<init>(j);
      j = 0;
      Object localObject;
      if (paramBoolean)
      {
        localObject = new com/google/zxing/common/MinimalECIInput;
        i1 = -1;
        ((MinimalECIInput)localObject).<init>(paramString, paramCharset, i1);
      }
      else
      {
        localObject = new com/google/zxing/pdf417/encoder/PDF417HighLevelEncoder$NoECIInput;
        ((PDF417HighLevelEncoder.NoECIInput)localObject).<init>(paramString, null);
        if (paramCharset == null)
        {
          paramCharset = DEFAULT_ENCODING;
        }
        else
        {
          paramString = DEFAULT_ENCODING;
          boolean bool2 = paramString.equals(paramCharset);
          if (!bool2)
          {
            paramString = CharacterSetECI.getCharacterSetECI(paramCharset);
            if (paramString != null)
            {
              n = paramString.getValue();
              encodingECI(n, localStringBuilder);
            }
          }
        }
      }
      int n = ((ECIInput)localObject).length();
      int[] arrayOfInt = PDF417HighLevelEncoder.1.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction;
      int i2 = paramCompaction.ordinal();
      i2 = arrayOfInt[i2];
      int i1 = 1;
      if (i2 != i1)
      {
        int i3 = 2;
        if (i2 != i3)
        {
          int i4 = 3;
          int i5 = 902;
          if (i2 != i4)
          {
            i2 = 0;
            paramCompaction = null;
            i4 = 0;
            int i6 = 0;
            while (i2 < n)
            {
              while (i2 < n)
              {
                boolean bool3 = ((ECIInput)localObject).isECI(i2);
                if (!bool3) {
                  break;
                }
                i7 = ((ECIInput)localObject).getECIValue(i2);
                encodingECI(i7, localStringBuilder);
                i2 += 1;
              }
              if (i2 >= n) {
                break;
              }
              int i7 = determineConsecutiveDigitCount((ECIInput)localObject, i2);
              int i8 = 13;
              if (i7 >= i8)
              {
                localStringBuilder.append(i5);
                encodeNumeric((ECIInput)localObject, i2, i7, localStringBuilder);
                i2 += i7;
                i4 = 0;
                i6 = i3;
              }
              else
              {
                i8 = determineConsecutiveTextCount((ECIInput)localObject, i2);
                int i9 = 5;
                if ((i8 < i9) && (i7 != n))
                {
                  Charset localCharset;
                  if (paramBoolean)
                  {
                    i7 = 0;
                    localCharset = null;
                  }
                  else
                  {
                    localCharset = paramCharset;
                  }
                  i7 = determineConsecutiveBinaryCount((ECIInput)localObject, i2, localCharset);
                  if (i7 == 0) {
                    i7 = i1;
                  }
                  byte[] arrayOfByte;
                  if (paramBoolean)
                  {
                    i8 = 0;
                    arrayOfByte = null;
                  }
                  else
                  {
                    i8 = i2 + i7;
                    arrayOfByte = ((ECIInput)localObject).subSequence(i2, i8).toString().getBytes(paramCharset);
                  }
                  if ((arrayOfByte != null) || (i7 != i1))
                  {
                    if (arrayOfByte != null)
                    {
                      i9 = arrayOfByte.length;
                      if (i9 != i1) {}
                    }
                  }
                  else if (i6 == 0)
                  {
                    if (paramBoolean)
                    {
                      encodeMultiECIBinary((ECIInput)localObject, i2, i1, 0, localStringBuilder);
                      break label689;
                    }
                    encodeBinary(arrayOfByte, 0, i1, 0, localStringBuilder);
                    break label689;
                  }
                  if (paramBoolean)
                  {
                    i4 = i2 + i7;
                    encodeMultiECIBinary((ECIInput)localObject, i2, i4, i6, localStringBuilder);
                  }
                  else
                  {
                    i4 = arrayOfByte.length;
                    encodeBinary(arrayOfByte, 0, i4, i6, localStringBuilder);
                  }
                  i4 = 0;
                  i6 = i1;
                  label689:
                  i2 += i7;
                }
                else
                {
                  if (i6 != 0)
                  {
                    localStringBuilder.append('Î„');
                    i4 = 0;
                    i6 = 0;
                  }
                  i4 = encodeText((ECIInput)localObject, i2, i8, localStringBuilder, i4);
                  i2 += i8;
                }
              }
            }
          }
          localStringBuilder.append(i5);
          encodeNumeric((ECIInput)localObject, 0, n, localStringBuilder);
        }
        else if (paramBoolean)
        {
          n = ((ECIInput)localObject).length();
          encodeMultiECIBinary((ECIInput)localObject, 0, n, 0, localStringBuilder);
        }
        else
        {
          paramString = localObject.toString().getBytes(paramCharset);
          i2 = paramString.length;
          encodeBinary(paramString, 0, i2, i1, localStringBuilder);
        }
      }
      else
      {
        encodeText((ECIInput)localObject, 0, n, localStringBuilder, 0);
      }
      return localStringBuilder.toString();
    }
    paramString = new com/google/zxing/WriterException;
    paramCompaction = m54207b69.F54207b69_11("3d210A161321490F081F200F0E0D51181A2055171B1C20291818");
    paramString.<init>(paramCompaction);
    throw paramString;
  }
  
  private static void encodeMultiECIBinary(ECIInput paramECIInput, int paramInt1, int paramInt2, int paramInt3, StringBuilder paramStringBuilder)
  {
    paramInt2 += paramInt1;
    int i = paramECIInput.length();
    paramInt2 = Math.min(paramInt2, i);
    i = paramInt1;
    for (;;)
    {
      if (i < paramInt2)
      {
        boolean bool1 = paramECIInput.isECI(i);
        if (bool1)
        {
          j = paramECIInput.getECIValue(i);
          encodingECI(j, paramStringBuilder);
          i += 1;
          continue;
        }
      }
      int j = i;
      while (j < paramInt2)
      {
        boolean bool2 = paramECIInput.isECI(j);
        if (bool2) {
          break;
        }
        j += 1;
      }
      int k = j - i;
      if (k <= 0) {
        return;
      }
      byte[] arrayOfByte = subBytes(paramECIInput, i, j);
      if (i == paramInt1) {
        i = paramInt3;
      } else {
        i = 1;
      }
      encodeBinary(arrayOfByte, 0, k, i, paramStringBuilder);
      i = j;
    }
  }
  
  private static void encodeNumeric(ECIInput paramECIInput, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = paramInt2 / 3 + 1;
    localStringBuilder.<init>(i);
    long l1 = 900L;
    BigInteger localBigInteger1 = BigInteger.valueOf(l1);
    long l2 = 0L;
    BigInteger localBigInteger2 = BigInteger.valueOf(l2);
    int j = 0;
    while (j < paramInt2)
    {
      localStringBuilder.setLength(0);
      int k = paramInt2 - j;
      int n = Math.min(44, k);
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("1");
      int i1 = paramInt1 + j;
      int i2 = i1 + n;
      Object localObject2 = paramECIInput.subSequence(i1, i2);
      ((StringBuilder)localObject1).append(localObject2);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject2 = new java/math/BigInteger;
      ((BigInteger)localObject2).<init>((String)localObject1);
      boolean bool;
      do
      {
        localObject1 = ((BigInteger)localObject2).mod(localBigInteger1);
        k = (char)((BigInteger)localObject1).intValue();
        localStringBuilder.append(k);
        localObject2 = ((BigInteger)localObject2).divide(localBigInteger1);
        bool = ((BigInteger)localObject2).equals(localBigInteger2);
      } while (!bool);
      int m = localStringBuilder.length() + -1;
      while (m >= 0)
      {
        i1 = localStringBuilder.charAt(m);
        paramStringBuilder.append(i1);
        m += -1;
      }
      j += n;
    }
  }
  
  private static int encodeText(ECIInput paramECIInput, int paramInt1, int paramInt2, StringBuilder paramStringBuilder, int paramInt3)
  {
    ECIInput localECIInput = paramECIInput;
    int i = paramInt2;
    StringBuilder localStringBuilder1 = paramStringBuilder;
    StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
    localStringBuilder2.<init>(paramInt2);
    int j = paramInt3;
    int k = 0;
    int i12;
    int i13;
    int i14;
    byte[] arrayOfByte;
    label167:
    label197:
    label336:
    label474:
    label486:
    int i5;
    label429:
    label459:
    do
    {
      int i6;
      int i11;
      char c1;
      char c2;
      int n;
      for (;;)
      {
        int m = paramInt1 + k;
        boolean bool6 = localECIInput.isECI(m);
        if (bool6)
        {
          m = localECIInput.getECIValue(m);
          encodingECI(m, localStringBuilder1);
          k += 1;
        }
        else
        {
          i6 = localECIInput.charAt(m);
          int i9 = 26;
          i11 = 32;
          c1 = '\034';
          c2 = '\033';
          i12 = 29;
          i13 = 2;
          i14 = 1;
          if (j == 0) {
            break label429;
          }
          if (j == i14) {
            break label336;
          }
          if (j == i13) {
            break;
          }
          boolean bool1 = isPunctuation(i6);
          if (bool1)
          {
            arrayOfByte = PUNCTUATION;
            n = arrayOfByte[i6];
            break label197;
          }
          localStringBuilder2.append(i12);
          j = 0;
        }
      }
      int i10 = isMixed(i6);
      if (i10 != 0)
      {
        arrayOfByte = MIXED;
        n = arrayOfByte[i6];
      }
      for (;;)
      {
        int i8;
        int i4;
        for (n = (char)n;; i4 = (char)i8)
        {
          localStringBuilder2.append(n);
          break label551;
          i10 = isAlphaUpper(i6);
          if (i10 != 0)
          {
            localStringBuilder2.append(c1);
            break label167;
          }
          i10 = isAlphaLower(i6);
          if (i10 != 0) {
            break label486;
          }
          int i1;
          n += 1;
          if (i1 < i)
          {
            i10 = localECIInput.isECI(i1);
            if (i10 == 0)
            {
              boolean bool2 = isPunctuation(localECIInput.charAt(i1));
              if (bool2)
              {
                localStringBuilder2.append('\031');
                j = 3;
                break;
              }
            }
          }
          localStringBuilder2.append(i12);
          arrayOfByte = PUNCTUATION;
          int i2 = arrayOfByte[i6];
          break label197;
          boolean bool3 = isAlphaLower(i6);
          int i7;
          if (bool3)
          {
            if (i6 != i11)
            {
              i6 += -97;
              continue;
            }
          }
          else
          {
            bool3 = isAlphaUpper(i7);
            if (bool3)
            {
              localStringBuilder2.append(c2);
              break label459;
            }
            bool3 = isMixed(i7);
            if (bool3) {
              break label513;
            }
            localStringBuilder2.append(i12);
            arrayOfByte = PUNCTUATION;
            int i3 = arrayOfByte[i7];
            break label197;
            boolean bool4 = isAlphaUpper(i7);
            if (!bool4) {
              break label474;
            }
            if (i7 != i11) {
              break label459;
            }
          }
          localStringBuilder2.append(i10);
          break label551;
          i7 += -65;
        }
        boolean bool5 = isAlphaLower(i8);
        if (bool5)
        {
          localStringBuilder2.append(c2);
          j = i14;
          break;
        }
        bool5 = isMixed(i8);
        if (bool5)
        {
          localStringBuilder2.append(c1);
          j = i13;
          break;
        }
        localStringBuilder2.append(i12);
        arrayOfByte = PUNCTUATION;
        i5 = arrayOfByte[i8];
      }
      k += 1;
    } while (k < i);
    label513:
    label551:
    int i15 = localStringBuilder2.length();
    i = 0;
    k = 0;
    while (i < i15)
    {
      i5 = i % 2;
      if (i5 != 0)
      {
        i5 = i14;
      }
      else
      {
        i5 = 0;
        arrayOfByte = null;
      }
      if (i5 != 0)
      {
        k *= 30;
        i5 = localStringBuilder2.charAt(i);
        k = (char)(k + i5);
        localStringBuilder1.append(k);
      }
      else
      {
        k = localStringBuilder2.charAt(i);
      }
      i += 1;
    }
    i15 %= i13;
    if (i15 != 0)
    {
      k = k * 30 + i12;
      i15 = (char)k;
      localStringBuilder1.append(i15);
    }
    return j;
  }
  
  private static void encodingECI(int paramInt, StringBuilder paramStringBuilder)
  {
    int i = 900;
    int j;
    if ((paramInt >= 0) && (paramInt < i))
    {
      i = 927;
      paramStringBuilder.append(i);
    }
    else
    {
      j = 810900;
      if (paramInt >= j) {
        break label74;
      }
      paramStringBuilder.append('Îž');
      j = (char)(paramInt / 900 + -1);
      paramStringBuilder.append(j);
      paramInt %= i;
    }
    for (paramInt = (char)paramInt;; paramInt = (char)j)
    {
      paramStringBuilder.append(paramInt);
      break;
      label74:
      i = 811800;
      if (paramInt >= i) {
        break label104;
      }
      i = 925;
      paramStringBuilder.append(i);
      j -= paramInt;
    }
    return;
    label104:
    paramStringBuilder = new com/google/zxing/WriterException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("1l2930274F061E07151127560D0F255A14125D2C20141A1E6336261C262569283D23226E7F66677A8485847F806C793C48487D4D405381");
    localStringBuilder.append(str1);
    localStringBuilder.append(paramInt);
    String str2 = localStringBuilder.toString();
    paramStringBuilder.<init>(str2);
    throw paramStringBuilder;
  }
  
  private static boolean isAlphaLower(char paramChar)
  {
    char c = ' ';
    if (paramChar != c)
    {
      c = 'a';
      if (paramChar >= c)
      {
        c = 'z';
        if (paramChar <= c) {}
      }
      else
      {
        return '\000';
      }
    }
    paramChar = '\001';
    return paramChar;
  }
  
  private static boolean isAlphaUpper(char paramChar)
  {
    char c = ' ';
    if (paramChar != c)
    {
      c = 'A';
      if (paramChar >= c)
      {
        c = 'Z';
        if (paramChar <= c) {}
      }
      else
      {
        return '\000';
      }
    }
    paramChar = '\001';
    return paramChar;
  }
  
  private static boolean isDigit(char paramChar)
  {
    char c = '0';
    if (paramChar >= c)
    {
      c = '9';
      if (paramChar <= c) {
        return '\001';
      }
    }
    paramChar = '\000';
    return paramChar;
  }
  
  private static boolean isMixed(char paramChar)
  {
    byte[] arrayOfByte = MIXED;
    paramChar = arrayOfByte[paramChar];
    char c = 'ð¿¿';
    if (paramChar != c) {
      paramChar = '\001';
    } else {
      paramChar = '\000';
    }
    return paramChar;
  }
  
  private static boolean isPunctuation(char paramChar)
  {
    byte[] arrayOfByte = PUNCTUATION;
    paramChar = arrayOfByte[paramChar];
    char c = 'ð¿¿';
    if (paramChar != c) {
      paramChar = '\001';
    } else {
      paramChar = '\000';
    }
    return paramChar;
  }
  
  private static boolean isText(char paramChar)
  {
    char c = '\t';
    if (paramChar != c)
    {
      c = '\n';
      if (paramChar != c)
      {
        c = '\r';
        if (paramChar != c)
        {
          c = ' ';
          if (paramChar >= c)
          {
            c = '~';
            if (paramChar <= c) {}
          }
          else
          {
            return '\000';
          }
        }
      }
    }
    paramChar = '\001';
    return paramChar;
  }
  
  public static byte[] subBytes(ECIInput paramECIInput, int paramInt1, int paramInt2)
  {
    int i = paramInt2 - paramInt1;
    byte[] arrayOfByte = new byte[i];
    int j = paramInt1;
    while (j < paramInt2)
    {
      int k = j - paramInt1;
      int m = (byte)(paramECIInput.charAt(j) & 0xFF);
      arrayOfByte[k] = m;
      j += 1;
    }
    return arrayOfByte;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder
 * JD-Core Version:    0.7.0.1
 */