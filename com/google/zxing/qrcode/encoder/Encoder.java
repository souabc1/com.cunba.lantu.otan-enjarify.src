package com.google.zxing.qrcode.encoder;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.StringUtils;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.decoder.Version.ECBlocks;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import m54207b69;

public final class Encoder
{
  private static final int[] ALPHANUMERIC_TABLE;
  static final Charset DEFAULT_BYTE_MODE_ENCODING = StandardCharsets.ISO_8859_1;
  
  static
  {
    int[] arrayOfInt = new int[96];
    int[] tmp7_5 = arrayOfInt;
    tmp7_5[0] = -1;
    arrayOfInt[1] = -1;
    int[] tmp14_7 = tmp7_5;
    tmp14_7[2] = -1;
    arrayOfInt[3] = -1;
    int[] tmp21_14 = tmp14_7;
    tmp21_14[4] = -1;
    arrayOfInt[5] = -1;
    int[] tmp28_21 = tmp21_14;
    tmp28_21[6] = -1;
    arrayOfInt[7] = -1;
    int[] tmp37_28 = tmp28_21;
    tmp37_28[8] = -1;
    arrayOfInt[9] = -1;
    int[] tmp46_37 = tmp37_28;
    tmp46_37[10] = -1;
    arrayOfInt[11] = -1;
    int[] tmp55_46 = tmp46_37;
    tmp55_46[12] = -1;
    arrayOfInt[13] = -1;
    int[] tmp64_55 = tmp55_46;
    tmp64_55[14] = -1;
    arrayOfInt[15] = -1;
    int[] tmp73_64 = tmp64_55;
    tmp73_64[16] = -1;
    arrayOfInt[17] = -1;
    int[] tmp82_73 = tmp73_64;
    tmp82_73[18] = -1;
    arrayOfInt[19] = -1;
    int[] tmp91_82 = tmp82_73;
    tmp91_82[20] = -1;
    arrayOfInt[21] = -1;
    int[] tmp100_91 = tmp91_82;
    tmp100_91[22] = -1;
    arrayOfInt[23] = -1;
    int[] tmp109_100 = tmp100_91;
    tmp109_100[24] = -1;
    arrayOfInt[25] = -1;
    int[] tmp118_109 = tmp109_100;
    tmp118_109[26] = -1;
    arrayOfInt[27] = -1;
    int[] tmp127_118 = tmp118_109;
    tmp127_118[28] = -1;
    arrayOfInt[29] = -1;
    int[] tmp136_127 = tmp127_118;
    tmp136_127[30] = -1;
    arrayOfInt[31] = -1;
    int[] tmp145_136 = tmp136_127;
    tmp145_136[32] = 36;
    arrayOfInt[33] = -1;
    int[] tmp155_145 = tmp145_136;
    tmp155_145[34] = -1;
    arrayOfInt[35] = -1;
    int[] tmp164_155 = tmp155_145;
    tmp164_155[36] = 37;
    arrayOfInt[37] = 38;
    int[] tmp175_164 = tmp164_155;
    tmp175_164[38] = -1;
    arrayOfInt[39] = -1;
    int[] tmp184_175 = tmp175_164;
    tmp184_175[40] = -1;
    arrayOfInt[41] = -1;
    int[] tmp193_184 = tmp184_175;
    tmp193_184[42] = 39;
    arrayOfInt[43] = 40;
    int[] tmp204_193 = tmp193_184;
    tmp204_193[44] = -1;
    arrayOfInt[45] = 41;
    int[] tmp214_204 = tmp204_193;
    tmp214_204[46] = 42;
    arrayOfInt[47] = 43;
    int[] tmp225_214 = tmp214_204;
    tmp225_214[48] = 0;
    arrayOfInt[49] = 1;
    int[] tmp234_225 = tmp225_214;
    tmp234_225[50] = 2;
    arrayOfInt[51] = 3;
    int[] tmp243_234 = tmp234_225;
    tmp243_234[52] = 4;
    arrayOfInt[53] = 5;
    int[] tmp252_243 = tmp243_234;
    tmp252_243[54] = 6;
    arrayOfInt[55] = 7;
    int[] tmp263_252 = tmp252_243;
    tmp263_252[56] = 8;
    arrayOfInt[57] = 9;
    int[] tmp274_263 = tmp263_252;
    tmp274_263[58] = 44;
    arrayOfInt[59] = -1;
    int[] tmp284_274 = tmp274_263;
    tmp284_274[60] = -1;
    arrayOfInt[61] = -1;
    int[] tmp293_284 = tmp284_274;
    tmp293_284[62] = -1;
    arrayOfInt[63] = -1;
    int[] tmp302_293 = tmp293_284;
    tmp302_293[64] = -1;
    arrayOfInt[65] = 10;
    int[] tmp312_302 = tmp302_293;
    tmp312_302[66] = 11;
    arrayOfInt[67] = 12;
    int[] tmp323_312 = tmp312_302;
    tmp323_312[68] = 13;
    arrayOfInt[69] = 14;
    int[] tmp334_323 = tmp323_312;
    tmp334_323[70] = 15;
    arrayOfInt[71] = 16;
    int[] tmp345_334 = tmp334_323;
    tmp345_334[72] = 17;
    arrayOfInt[73] = 18;
    int[] tmp356_345 = tmp345_334;
    tmp356_345[74] = 19;
    arrayOfInt[75] = 20;
    int[] tmp367_356 = tmp356_345;
    tmp367_356[76] = 21;
    arrayOfInt[77] = 22;
    int[] tmp378_367 = tmp367_356;
    tmp378_367[78] = 23;
    arrayOfInt[79] = 24;
    int[] tmp389_378 = tmp378_367;
    tmp389_378[80] = 25;
    arrayOfInt[81] = 26;
    int[] tmp400_389 = tmp389_378;
    tmp400_389[82] = 27;
    arrayOfInt[83] = 28;
    int[] tmp411_400 = tmp400_389;
    tmp411_400[84] = 29;
    arrayOfInt[85] = 30;
    int[] tmp422_411 = tmp411_400;
    tmp422_411[86] = 31;
    arrayOfInt[87] = 32;
    int[] tmp433_422 = tmp422_411;
    tmp433_422[88] = 33;
    arrayOfInt[89] = 34;
    int[] tmp444_433 = tmp433_422;
    tmp444_433[90] = 35;
    arrayOfInt[91] = -1;
    int[] tmp454_444 = tmp444_433;
    tmp454_444[92] = -1;
    arrayOfInt[93] = -1;
    tmp454_444[94] = -1;
    arrayOfInt[95] = -1;
    ALPHANUMERIC_TABLE = arrayOfInt;
  }
  
  public static void append8BitBytes(String paramString, BitArray paramBitArray, Charset paramCharset)
  {
    paramString = paramString.getBytes(paramCharset);
    int i = paramString.length;
    int j = 0;
    while (j < i)
    {
      int k = paramString[j];
      int m = 8;
      paramBitArray.appendBits(k, m);
      j += 1;
    }
  }
  
  public static void appendAlphanumericBytes(CharSequence paramCharSequence, BitArray paramBitArray)
  {
    int i = paramCharSequence.length();
    int j = 0;
    while (j < i)
    {
      int k = getAlphanumericCode(paramCharSequence.charAt(j));
      int m = -1;
      if (k != m)
      {
        int n = j + 1;
        if (n < i)
        {
          n = getAlphanumericCode(paramCharSequence.charAt(n));
          if (n != m)
          {
            k = k * 45 + n;
            m = 11;
            paramBitArray.appendBits(k, m);
            j += 2;
          }
          else
          {
            paramCharSequence = new com/google/zxing/WriterException;
            paramCharSequence.<init>();
            throw paramCharSequence;
          }
        }
        else
        {
          paramBitArray.appendBits(k, 6);
          j = n;
        }
      }
      else
      {
        paramCharSequence = new com/google/zxing/WriterException;
        paramCharSequence.<init>();
        throw paramCharSequence;
      }
    }
  }
  
  public static void appendBytes(String paramString, Mode paramMode, BitArray paramBitArray, Charset paramCharset)
  {
    int[] arrayOfInt = Encoder.1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode;
    int i = paramMode.ordinal();
    int j = arrayOfInt[i];
    i = 1;
    if (j != i)
    {
      i = 2;
      if (j != i)
      {
        i = 3;
        if (j != i)
        {
          int k = 4;
          if (j == k)
          {
            appendKanjiBytes(paramString, paramBitArray);
          }
          else
          {
            paramString = new com/google/zxing/WriterException;
            paramBitArray = new java/lang/StringBuilder;
            paramBitArray.<init>();
            paramCharset = m54207b69.F54207b69_11("m37A5E4755635F5D1A666561611520");
            paramBitArray.append(paramCharset);
            paramBitArray.append(paramMode);
            paramMode = paramBitArray.toString();
            paramString.<init>(paramMode);
            throw paramString;
          }
        }
        else
        {
          append8BitBytes(paramString, paramBitArray, paramCharset);
        }
      }
      else
      {
        appendAlphanumericBytes(paramString, paramBitArray);
      }
    }
    else
    {
      appendNumericBytes(paramString, paramBitArray);
    }
  }
  
  private static void appendECI(CharacterSetECI paramCharacterSetECI, BitArray paramBitArray)
  {
    int i = Mode.ECI.getBits();
    paramBitArray.appendBits(i, 4);
    int j = paramCharacterSetECI.getValue();
    paramBitArray.appendBits(j, 8);
  }
  
  public static void appendKanjiBytes(String paramString, BitArray paramBitArray)
  {
    Charset localCharset = StringUtils.SHIFT_JIS_CHARSET;
    paramString = paramString.getBytes(localCharset);
    int i = paramString.length % 2;
    if (i == 0)
    {
      i = paramString.length + -1;
      int j = 0;
      while (j < i)
      {
        int k = paramString[j] & 0xFF;
        int m = j + 1;
        m = paramString[m] & 0xFF;
        k = k << 8 | m;
        m = 33088;
        int n = -1;
        if (k >= m)
        {
          int i1 = 40956;
          if (k > i1) {}
        }
        for (;;)
        {
          k -= m;
          break label137;
          m = 57408;
          if (k < m) {
            break;
          }
          m = 60351;
          if (k > m) {
            break;
          }
          m = 49472;
        }
        k = n;
        label137:
        if (k != n)
        {
          m = (k >> 8) * 192;
          k &= 0xFF;
          m += k;
          k = 13;
          paramBitArray.appendBits(m, k);
          j += 2;
        }
        else
        {
          paramString = new com/google/zxing/WriterException;
          paramBitArray = m54207b69.F54207b69_11("/T1D3B24383C42367B3E362A3C80343F3431424C4A45");
          paramString.<init>(paramBitArray);
          throw paramString;
        }
      }
      return;
    }
    paramString = new com/google/zxing/WriterException;
    paramBitArray = m54207b69.F54207b69_11("1J012C2623276F2E3A463874442F3D3D793436507D4351453B");
    paramString.<init>(paramBitArray);
    throw paramString;
  }
  
  public static void appendLengthInfo(int paramInt, Version paramVersion, Mode paramMode, BitArray paramBitArray)
  {
    int i = paramMode.getCharacterCountBits(paramVersion);
    int j = 1;
    int k = j << i;
    if (paramInt < k)
    {
      paramBitArray.appendBits(paramInt, i);
      return;
    }
    paramVersion = new com/google/zxing/WriterException;
    paramBitArray = new java/lang/StringBuilder;
    paramBitArray.<init>();
    paramBitArray.append(paramInt);
    String str = m54207b69.F54207b69_11("rW773F267A394336373A2E812E4B434786");
    paramBitArray.append(str);
    k -= j;
    paramBitArray.append(k);
    str = paramBitArray.toString();
    paramVersion.<init>(str);
    throw paramVersion;
  }
  
  public static void appendModeInfo(Mode paramMode, BitArray paramBitArray)
  {
    int i = paramMode.getBits();
    paramBitArray.appendBits(i, 4);
  }
  
  public static void appendNumericBytes(CharSequence paramCharSequence, BitArray paramBitArray)
  {
    int i = paramCharSequence.length();
    int j = 0;
    while (j < i)
    {
      int k = paramCharSequence.charAt(j) + '￐';
      int m = j + 2;
      if (m < i)
      {
        int n = j + 1;
        n = paramCharSequence.charAt(n) + '￐';
        m = paramCharSequence.charAt(m) + '￐';
        k *= 100;
        int i1 = 10;
        n *= i1;
        k = k + n + m;
        paramBitArray.appendBits(k, i1);
        j += 3;
      }
      else
      {
        j += 1;
        if (j < i)
        {
          j = paramCharSequence.charAt(j) + '￐';
          k = k * 10 + j;
          paramBitArray.appendBits(k, 7);
          j = m;
        }
        else
        {
          m = 4;
          paramBitArray.appendBits(k, m);
        }
      }
    }
  }
  
  private static int calculateBitsNeeded(Mode paramMode, BitArray paramBitArray1, BitArray paramBitArray2, Version paramVersion)
  {
    int i = paramBitArray1.getSize();
    int j = paramMode.getCharacterCountBits(paramVersion);
    i += j;
    j = paramBitArray2.getSize();
    return i + j;
  }
  
  private static int calculateMaskPenalty(ByteMatrix paramByteMatrix)
  {
    int i = MaskUtil.applyMaskPenaltyRule1(paramByteMatrix);
    int j = MaskUtil.applyMaskPenaltyRule2(paramByteMatrix);
    i += j;
    j = MaskUtil.applyMaskPenaltyRule3(paramByteMatrix);
    i += j;
    int k = MaskUtil.applyMaskPenaltyRule4(paramByteMatrix);
    return i + k;
  }
  
  private static int chooseMaskPattern(BitArray paramBitArray, ErrorCorrectionLevel paramErrorCorrectionLevel, Version paramVersion, ByteMatrix paramByteMatrix)
  {
    int i = -1 >>> 1;
    int j = -1;
    int k = 0;
    for (;;)
    {
      int m = 8;
      if (k >= m) {
        break;
      }
      MatrixUtil.buildMatrix(paramBitArray, paramErrorCorrectionLevel, paramVersion, k, paramByteMatrix);
      m = calculateMaskPenalty(paramByteMatrix);
      if (m < i)
      {
        j = k;
        i = m;
      }
      k += 1;
    }
    return j;
  }
  
  public static Mode chooseMode(String paramString)
  {
    return chooseMode(paramString, null);
  }
  
  private static Mode chooseMode(String paramString, Charset paramCharset)
  {
    Charset localCharset = StringUtils.SHIFT_JIS_CHARSET;
    int i = localCharset.equals(paramCharset);
    if (i != 0)
    {
      i = isOnlyDoubleByteKanji(paramString);
      if (i != 0) {
        return Mode.KANJI;
      }
    }
    i = 0;
    paramCharset = null;
    int k = 0;
    localCharset = null;
    int m = 0;
    for (;;)
    {
      int n = paramString.length();
      if (i >= n) {
        break label122;
      }
      int i1 = paramString.charAt(i);
      int i2 = 48;
      int i3 = 1;
      if (i1 >= i2)
      {
        i2 = 57;
        if (i1 <= i2)
        {
          m = i3;
          break label111;
        }
      }
      k = getAlphanumericCode(i1);
      i1 = -1;
      if (k == i1) {
        break;
      }
      k = i3;
      label111:
      int j;
      i += 1;
    }
    return Mode.BYTE;
    label122:
    if (k != 0) {
      return Mode.ALPHANUMERIC;
    }
    if (m != 0) {
      return Mode.NUMERIC;
    }
    return Mode.BYTE;
  }
  
  private static Version chooseVersion(int paramInt, ErrorCorrectionLevel paramErrorCorrectionLevel)
  {
    int i = 1;
    for (;;)
    {
      int j = 40;
      if (i > j) {
        break;
      }
      Version localVersion = Version.getVersionForNumber(i);
      boolean bool = willFit(paramInt, localVersion, paramErrorCorrectionLevel);
      if (bool) {
        return localVersion;
      }
      i += 1;
    }
    WriterException localWriterException = new com/google/zxing/WriterException;
    paramErrorCorrectionLevel = m54207b69.F54207b69_11("-z3E1C101E5E131B1C62211D28");
    localWriterException.<init>(paramErrorCorrectionLevel);
    throw localWriterException;
  }
  
  public static QRCode encode(String paramString, ErrorCorrectionLevel paramErrorCorrectionLevel)
  {
    return encode(paramString, paramErrorCorrectionLevel, null);
  }
  
  public static QRCode encode(String paramString, ErrorCorrectionLevel paramErrorCorrectionLevel, Map paramMap)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    if (paramMap != null)
    {
      localObject2 = EncodeHintType.GS1_FORMAT;
      bool1 = paramMap.containsKey(localObject2);
      if (bool1)
      {
        localObject2 = paramMap.get(localObject2).toString();
        bool2 = Boolean.parseBoolean((String)localObject2);
        if (bool2)
        {
          bool2 = i;
          break label69;
        }
      }
    }
    boolean bool2 = false;
    Object localObject2 = null;
    label69:
    boolean bool3;
    if (paramMap != null)
    {
      localObject3 = EncodeHintType.QR_COMPACT;
      bool3 = paramMap.containsKey(localObject3);
      if (bool3)
      {
        localObject3 = paramMap.get(localObject3).toString();
        bool1 = Boolean.parseBoolean((String)localObject3);
        if (bool1)
        {
          bool1 = i;
          break label130;
        }
      }
    }
    boolean bool1 = false;
    Object localObject3 = null;
    label130:
    Object localObject4 = DEFAULT_BYTE_MODE_ENCODING;
    Object localObject5;
    boolean bool5;
    Object localObject6;
    if (paramMap != null)
    {
      localObject5 = EncodeHintType.CHARACTER_SET;
      bool5 = paramMap.containsKey(localObject5);
      if (bool5) {}
    }
    else
    {
      i = 0;
      localObject6 = null;
    }
    if (i != 0)
    {
      localObject1 = EncodeHintType.CHARACTER_SET;
      localObject1 = Charset.forName(paramMap.get(localObject1).toString());
    }
    else
    {
      localObject1 = localObject4;
    }
    if (bool1)
    {
      localObject6 = Mode.BYTE;
      bool1 = ((Charset)localObject1).equals(localObject4);
      bool3 = false;
      localObject4 = null;
      if (bool1)
      {
        j = 0;
        localObject1 = null;
      }
      paramString = MinimalEncoder.encode(paramString, null, (Charset)localObject1, bool2, paramErrorCorrectionLevel);
      localObject1 = new com/google/zxing/common/BitArray;
      ((BitArray)localObject1).<init>();
      paramString.getBits((BitArray)localObject1);
      paramString = paramString.getVersion();
    }
    else
    {
      localObject3 = chooseMode(paramString, (Charset)localObject1);
      localObject4 = new com/google/zxing/common/BitArray;
      ((BitArray)localObject4).<init>();
      localObject5 = Mode.BYTE;
      if ((localObject3 == localObject5) && (i != 0))
      {
        localObject6 = CharacterSetECI.getCharacterSetECI((Charset)localObject1);
        if (localObject6 != null) {
          appendECI((CharacterSetECI)localObject6, (BitArray)localObject4);
        }
      }
      if (bool2)
      {
        localObject6 = Mode.FNC1_FIRST_POSITION;
        appendModeInfo((Mode)localObject6, (BitArray)localObject4);
      }
      appendModeInfo((Mode)localObject3, (BitArray)localObject4);
      localObject6 = new com/google/zxing/common/BitArray;
      ((BitArray)localObject6).<init>();
      appendBytes(paramString, (Mode)localObject3, (BitArray)localObject6, (Charset)localObject1);
      if (paramMap != null)
      {
        localObject1 = EncodeHintType.QR_VERSION;
        bool2 = paramMap.containsKey(localObject1);
        if (bool2)
        {
          j = Integer.parseInt(paramMap.get(localObject1).toString());
          localObject1 = Version.getVersionForNumber(j);
          bool2 = willFit(calculateBitsNeeded((Mode)localObject3, (BitArray)localObject4, (BitArray)localObject6, (Version)localObject1), (Version)localObject1, paramErrorCorrectionLevel);
          if (bool2) {
            break label471;
          }
          paramString = new com/google/zxing/WriterException;
          paramErrorCorrectionLevel = m54207b69.F54207b69_11("Oy3D190F1B5D121C1D61241A29652C241A691C2E1B203120243436732A3828282F3638");
          paramString.<init>(paramErrorCorrectionLevel);
          throw paramString;
        }
      }
      localObject1 = recommendVersion(paramErrorCorrectionLevel, (Mode)localObject3, (BitArray)localObject4, (BitArray)localObject6);
      label471:
      localObject2 = new com/google/zxing/common/BitArray;
      ((BitArray)localObject2).<init>();
      ((BitArray)localObject2).appendBitArray((BitArray)localObject4);
      int i1;
      if (localObject3 == localObject5) {
        i1 = ((BitArray)localObject6).getSizeInBytes();
      } else {
        i1 = paramString.length();
      }
      appendLengthInfo(i1, (Version)localObject1, (Mode)localObject3, (BitArray)localObject2);
      ((BitArray)localObject2).appendBitArray((BitArray)localObject6);
      paramString = (String)localObject1;
      localObject1 = localObject2;
      localObject6 = localObject3;
    }
    localObject2 = paramString.getECBlocksForLevel(paramErrorCorrectionLevel);
    int k = paramString.getTotalCodewords();
    int n = ((Version.ECBlocks)localObject2).getTotalECCodewords();
    k -= n;
    terminateBits(k, (BitArray)localObject1);
    n = paramString.getTotalCodewords();
    int m = ((Version.ECBlocks)localObject2).getNumBlocks();
    localObject1 = interleaveWithECBytes((BitArray)localObject1, n, k, m);
    localObject2 = new com/google/zxing/qrcode/encoder/QRCode;
    ((QRCode)localObject2).<init>();
    ((QRCode)localObject2).setECLevel(paramErrorCorrectionLevel);
    ((QRCode)localObject2).setMode((Mode)localObject6);
    ((QRCode)localObject2).setVersion(paramString);
    i = paramString.getDimensionForVersion();
    localObject3 = new com/google/zxing/qrcode/encoder/ByteMatrix;
    ((ByteMatrix)localObject3).<init>(i, i);
    i = -1;
    if (paramMap != null)
    {
      localObject4 = EncodeHintType.QR_MASK_PATTERN;
      bool5 = paramMap.containsKey(localObject4);
      if (bool5)
      {
        paramMap = paramMap.get(localObject4).toString();
        i2 = Integer.parseInt(paramMap);
        boolean bool4 = QRCode.isValidMaskPattern(i2);
        if (bool4) {
          break label708;
        }
      }
    }
    int i2 = i;
    label708:
    if (i2 == i) {
      i2 = chooseMaskPattern((BitArray)localObject1, paramErrorCorrectionLevel, paramString, (ByteMatrix)localObject3);
    }
    ((QRCode)localObject2).setMaskPattern(i2);
    MatrixUtil.buildMatrix((BitArray)localObject1, paramErrorCorrectionLevel, paramString, i2, (ByteMatrix)localObject3);
    ((QRCode)localObject2).setMatrix((ByteMatrix)localObject3);
    return localObject2;
  }
  
  public static byte[] generateECBytes(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte.length;
    int j = i + paramInt;
    int[] arrayOfInt = new int[j];
    int k = 0;
    int m = 0;
    GenericGF localGenericGF = null;
    while (m < i)
    {
      int n = paramArrayOfByte[m] & 0xFF;
      arrayOfInt[m] = n;
      m += 1;
    }
    paramArrayOfByte = new com/google/zxing/common/reedsolomon/ReedSolomonEncoder;
    localGenericGF = GenericGF.QR_CODE_FIELD_256;
    paramArrayOfByte.<init>(localGenericGF);
    paramArrayOfByte.encode(arrayOfInt, paramInt);
    paramArrayOfByte = new byte[paramInt];
    while (k < paramInt)
    {
      m = i + k;
      m = (byte)arrayOfInt[m];
      paramArrayOfByte[k] = m;
      k += 1;
    }
    return paramArrayOfByte;
  }
  
  public static int getAlphanumericCode(int paramInt)
  {
    int[] arrayOfInt = ALPHANUMERIC_TABLE;
    int i = arrayOfInt.length;
    if (paramInt < i) {
      return arrayOfInt[paramInt];
    }
    return -1;
  }
  
  public static void getNumDataBytesAndNumECBytesForBlockID(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if (paramInt4 < paramInt3)
    {
      int i = paramInt1 % paramInt3;
      int j = paramInt3 - i;
      int k = paramInt1 / paramInt3;
      int m = k + 1;
      paramInt2 /= paramInt3;
      int n = paramInt2 + 1;
      k -= paramInt2;
      m -= n;
      if (k == m)
      {
        int i1 = j + i;
        if (paramInt3 == i1)
        {
          paramInt3 = (paramInt2 + k) * j;
          i1 = (n + m) * i;
          paramInt3 += i1;
          if (paramInt1 == paramInt3)
          {
            paramInt1 = 0;
            localWriterException = null;
            if (paramInt4 < j)
            {
              paramArrayOfInt1[0] = paramInt2;
              paramArrayOfInt2[0] = k;
            }
            else
            {
              paramArrayOfInt1[0] = n;
              paramArrayOfInt2[0] = m;
            }
            return;
          }
          localWriterException = new com/google/zxing/WriterException;
          str = m54207b69.F54207b69_11("lD102C32282C692C44382A416F353A45383541393F");
          localWriterException.<init>(str);
          throw localWriterException;
        }
        localWriterException = new com/google/zxing/WriterException;
        str = m54207b69.F54207b69_11("$@12146225303429323B6937343F3A2F433339");
        localWriterException.<init>(str);
        throw localWriterException;
      }
      localWriterException = new com/google/zxing/WriterException;
      str = m54207b69.F54207b69_11("aC060165243E3C2C376B37343B3A2F452F3B");
      localWriterException.<init>(str);
      throw localWriterException;
    }
    WriterException localWriterException = new com/google/zxing/WriterException;
    String str = m54207b69.F54207b69_11("^Q133E40353E761E1C792E48497D4A3E324645");
    localWriterException.<init>(str);
    throw localWriterException;
  }
  
  public static BitArray interleaveWithECBytes(BitArray paramBitArray, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1;
    int j = paramInt2;
    int k = paramInt3;
    int m = paramBitArray.getSizeInBytes();
    if (m == paramInt2)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramInt3);
      int n = 0;
      int i1 = 0;
      int i2 = 0;
      int i3 = 0;
      int i4 = 0;
      int i5;
      int i6;
      Object localObject1;
      Object localObject3;
      Object localObject4;
      while (i1 < k)
      {
        m = 1;
        int[] arrayOfInt1 = new int[m];
        int[] arrayOfInt2 = new int[m];
        m = paramInt1;
        i5 = paramInt2;
        i6 = paramInt3;
        int i7 = i1;
        localObject1 = arrayOfInt1;
        getNumDataBytesAndNumECBytesForBlockID(paramInt1, paramInt2, paramInt3, i1, arrayOfInt1, arrayOfInt2);
        m = arrayOfInt1[0];
        localObject2 = new byte[m];
        i6 = i2 * 8;
        localObject3 = paramBitArray;
        paramBitArray.toBytes(i6, (byte[])localObject2, 0, m);
        i6 = arrayOfInt2[0];
        localObject4 = generateECBytes((byte[])localObject2, i6);
        localObject1 = new com/google/zxing/qrcode/encoder/BlockPair;
        ((BlockPair)localObject1).<init>((byte[])localObject2, (byte[])localObject4);
        localArrayList.add(localObject1);
        i3 = Math.max(i3, m);
        m = localObject4.length;
        i4 = Math.max(i4, m);
        m = arrayOfInt1[0];
        i2 += m;
        i1 += 1;
      }
      if (j == i2)
      {
        localObject5 = new com/google/zxing/common/BitArray;
        ((BitArray)localObject5).<init>();
        i5 = 0;
        localObject2 = null;
        int i9;
        for (;;)
        {
          i6 = 8;
          if (i5 >= i3) {
            break;
          }
          localObject3 = localArrayList.iterator();
          for (;;)
          {
            boolean bool2 = ((Iterator)localObject3).hasNext();
            if (!bool2) {
              break;
            }
            localObject1 = ((BlockPair)((Iterator)localObject3).next()).getDataBytes();
            int i10 = localObject1.length;
            if (i5 < i10)
            {
              i9 = localObject1[i5];
              ((BitArray)localObject5).appendBits(i9, i6);
            }
          }
          i5 += 1;
        }
        while (n < i4)
        {
          localObject2 = localArrayList.iterator();
          for (;;)
          {
            boolean bool1 = ((Iterator)localObject2).hasNext();
            if (!bool1) {
              break;
            }
            localObject3 = ((BlockPair)((Iterator)localObject2).next()).getErrorCorrectionBytes();
            i9 = localObject3.length;
            if (n < i9)
            {
              int i8 = localObject3[n];
              ((BitArray)localObject5).appendBits(i8, i6);
            }
          }
          n += 1;
        }
        i5 = ((BitArray)localObject5).getSizeInBytes();
        if (i == i5) {
          return localObject5;
        }
        localObject2 = new com/google/zxing/WriterException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject3 = m54207b69.F54207b69_11("_^17312C3E3037414630403A448A483A3B413D7691");
        ((StringBuilder)localObject4).append((String)localObject3);
        ((StringBuilder)localObject4).append(i);
        localObject3 = m54207b69.F54207b69_11(",H682A282F6C");
        ((StringBuilder)localObject4).append((String)localObject3);
        m = ((BitArray)localObject5).getSizeInBytes();
        ((StringBuilder)localObject4).append(m);
        localObject5 = m54207b69.F54207b69_11(".q51161A1A1B190966");
        ((StringBuilder)localObject4).append((String)localObject5);
        localObject5 = ((StringBuilder)localObject4).toString();
        ((WriterException)localObject2).<init>((String)localObject5);
        throw ((Throwable)localObject2);
      }
      localObject5 = new com/google/zxing/WriterException;
      localObject2 = m54207b69.F54207b69_11("e=795D4B5F21644A50605727645E655C2C63635B3064715F756D366C76776B7668");
      ((WriterException)localObject5).<init>((String)localObject2);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/zxing/WriterException;
    Object localObject2 = m54207b69.F54207b69_11("V37D4760545A4619635D1C5B65534D21616D68256A665C682A696361715C30757B76613580806C39857A707A86");
    ((WriterException)localObject5).<init>((String)localObject2);
    throw ((Throwable)localObject5);
  }
  
  public static boolean isOnlyDoubleByteKanji(String paramString)
  {
    Charset localCharset = StringUtils.SHIFT_JIS_CHARSET;
    paramString = paramString.getBytes(localCharset);
    int i = paramString.length;
    int j = i % 2;
    if (j != 0) {
      return false;
    }
    j = 0;
    while (j < i)
    {
      int k = paramString[j] & 0xFF;
      int m = 129;
      if (k >= m)
      {
        m = 159;
        if (k <= m) {}
      }
      else
      {
        m = 224;
        if (k < m) {
          break label97;
        }
        m = 235;
        if (k > m) {
          break label97;
        }
      }
      j += 2;
      continue;
      label97:
      return false;
    }
    return true;
  }
  
  private static Version recommendVersion(ErrorCorrectionLevel paramErrorCorrectionLevel, Mode paramMode, BitArray paramBitArray1, BitArray paramBitArray2)
  {
    Version localVersion = Version.getVersionForNumber(1);
    localVersion = chooseVersion(calculateBitsNeeded(paramMode, paramBitArray1, paramBitArray2, localVersion), paramErrorCorrectionLevel);
    return chooseVersion(calculateBitsNeeded(paramMode, paramBitArray1, paramBitArray2, localVersion), paramErrorCorrectionLevel);
  }
  
  public static void terminateBits(int paramInt, BitArray paramBitArray)
  {
    int i = paramInt * 8;
    int j = paramBitArray.getSize();
    if (j <= i)
    {
      j = 0;
      localStringBuilder = null;
      int k = 0;
      str = null;
      for (;;)
      {
        m = 4;
        if (k >= m) {
          break;
        }
        m = paramBitArray.getSize();
        if (m >= i) {
          break;
        }
        paramBitArray.appendBit(false);
        k += 1;
      }
      k = paramBitArray.getSize() & 0x7;
      int m = 8;
      if (k > 0) {
        while (k < m)
        {
          paramBitArray.appendBit(false);
          k += 1;
        }
      }
      k = paramBitArray.getSizeInBytes();
      paramInt -= k;
      while (j < paramInt)
      {
        k = j & 0x1;
        if (k == 0) {
          k = 236;
        } else {
          k = 17;
        }
        paramBitArray.appendBits(k, m);
        j += 1;
      }
      paramInt = paramBitArray.getSize();
      if (paramInt == i) {
        return;
      }
      localWriterException = new com/google/zxing/WriterException;
      paramBitArray = m54207b69.F54207b69_11("Ry3B110F0D5D0F160A2462272128176726261E6B2F1C212E2C7133322434372E2C20");
      localWriterException.<init>(paramBitArray);
      throw localWriterException;
    }
    WriterException localWriterException = new com/google/zxing/WriterException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("Jq1511071355181E0C0A5A1C1B2B2C2C1461282A18652D35681D322E6C3C406F513E3636");
    localStringBuilder.append(str);
    int n = paramBitArray.getSize();
    localStringBuilder.append(n);
    localStringBuilder.append(" > ");
    localStringBuilder.append(i);
    paramBitArray = localStringBuilder.toString();
    localWriterException.<init>(paramBitArray);
    throw localWriterException;
  }
  
  public static boolean willFit(int paramInt, Version paramVersion, ErrorCorrectionLevel paramErrorCorrectionLevel)
  {
    int i = paramVersion.getTotalCodewords();
    paramVersion = paramVersion.getECBlocksForLevel(paramErrorCorrectionLevel);
    int j = paramVersion.getTotalECCodewords();
    i -= j;
    paramInt = (paramInt + 7) / 8;
    if (i >= paramInt) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.encoder.Encoder
 * JD-Core Version:    0.7.0.1
 */