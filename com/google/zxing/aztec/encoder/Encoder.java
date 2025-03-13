package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import m54207b69;

public final class Encoder
{
  public static final int DEFAULT_AZTEC_LAYERS = 0;
  public static final int DEFAULT_EC_PERCENT = 33;
  private static final int MAX_NB_BITS = 32;
  private static final int MAX_NB_BITS_COMPACT = 4;
  private static final int[] WORD_SIZE;
  
  static
  {
    int[] arrayOfInt = new int[33];
    int[] tmp7_5 = arrayOfInt;
    tmp7_5[0] = 4;
    arrayOfInt[1] = 6;
    int[] tmp15_7 = tmp7_5;
    tmp15_7[2] = 6;
    arrayOfInt[3] = 8;
    int[] tmp24_15 = tmp15_7;
    tmp24_15[4] = 8;
    arrayOfInt[5] = 8;
    int[] tmp33_24 = tmp24_15;
    tmp33_24[6] = 8;
    arrayOfInt[7] = 8;
    int[] tmp44_33 = tmp33_24;
    tmp44_33[8] = 8;
    arrayOfInt[9] = 10;
    int[] tmp55_44 = tmp44_33;
    tmp55_44[10] = 10;
    arrayOfInt[11] = 10;
    int[] tmp66_55 = tmp55_44;
    tmp66_55[12] = 10;
    arrayOfInt[13] = 10;
    int[] tmp77_66 = tmp66_55;
    tmp77_66[14] = 10;
    arrayOfInt[15] = 10;
    int[] tmp88_77 = tmp77_66;
    tmp88_77[16] = 10;
    arrayOfInt[17] = 10;
    int[] tmp99_88 = tmp88_77;
    tmp99_88[18] = 10;
    arrayOfInt[19] = 10;
    int[] tmp110_99 = tmp99_88;
    tmp110_99[20] = 10;
    arrayOfInt[21] = 10;
    int[] tmp121_110 = tmp110_99;
    tmp121_110[22] = 10;
    arrayOfInt[23] = 12;
    int[] tmp132_121 = tmp121_110;
    tmp132_121[24] = 12;
    arrayOfInt[25] = 12;
    int[] tmp143_132 = tmp132_121;
    tmp143_132[26] = 12;
    arrayOfInt[27] = 12;
    int[] tmp154_143 = tmp143_132;
    tmp154_143[28] = 12;
    arrayOfInt[29] = 12;
    tmp154_143[30] = 12;
    arrayOfInt[31] = 12;
    arrayOfInt[32] = 12;
    WORD_SIZE = arrayOfInt;
  }
  
  private static int[] bitsToWords(BitArray paramBitArray, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = new int[paramInt2];
    int i = paramBitArray.getSize() / paramInt1;
    int j = 0;
    while (j < i)
    {
      int k = 0;
      int m = 0;
      while (k < paramInt1)
      {
        int n = j * paramInt1 + k;
        boolean bool = paramBitArray.get(n);
        int i1;
        if (bool)
        {
          i1 = paramInt1 - k;
          int i2 = 1;
          i1 -= i2;
          i1 = i2 << i1;
        }
        else
        {
          i1 = 0;
        }
        m |= i1;
        k += 1;
      }
      arrayOfInt[j] = m;
      j += 1;
    }
    return arrayOfInt;
  }
  
  private static void drawBullsEye(BitMatrix paramBitMatrix, int paramInt1, int paramInt2)
  {
    int i = 0;
    while (i < paramInt2)
    {
      j = paramInt1 - i;
      int k = j;
      for (;;)
      {
        int m = paramInt1 + i;
        if (k > m) {
          break;
        }
        paramBitMatrix.set(k, j);
        paramBitMatrix.set(k, m);
        paramBitMatrix.set(j, k);
        paramBitMatrix.set(m, k);
        k += 1;
      }
      i += 2;
    }
    i = paramInt1 - paramInt2;
    paramBitMatrix.set(i, i);
    int j = i + 1;
    paramBitMatrix.set(j, i);
    paramBitMatrix.set(i, j);
    paramInt1 += paramInt2;
    paramBitMatrix.set(paramInt1, i);
    paramBitMatrix.set(paramInt1, j);
    paramInt2 = paramInt1 + -1;
    paramBitMatrix.set(paramInt1, paramInt2);
  }
  
  private static void drawModeMessage(BitMatrix paramBitMatrix, boolean paramBoolean, int paramInt, BitArray paramBitArray)
  {
    paramInt /= 2;
    boolean bool1 = false;
    boolean bool7;
    boolean bool2;
    if (paramBoolean) {
      for (;;)
      {
        paramBoolean = true;
        if (bool1 >= paramBoolean) {
          break;
        }
        paramBoolean = paramInt + -3 + bool1;
        boolean bool3 = paramBitArray.get(bool1);
        if (bool3)
        {
          j = paramInt + -5;
          paramBitMatrix.set(paramBoolean, j);
        }
        int j = bool1 + true;
        boolean bool4 = paramBitArray.get(j);
        if (bool4)
        {
          k = paramInt + 5;
          paramBitMatrix.set(k, paramBoolean);
        }
        int k = true - bool1;
        boolean bool5 = paramBitArray.get(k);
        if (bool5)
        {
          m = paramInt + 5;
          paramBitMatrix.set(paramBoolean, m);
        }
        int m = true - bool1;
        boolean bool6 = paramBitArray.get(m);
        if (bool6)
        {
          bool7 = paramInt + -5;
          paramBitMatrix.set(bool7, paramBoolean);
        }
        bool1 += true;
      }
    }
    for (;;)
    {
      paramBoolean = true;
      if (bool2 >= paramBoolean) {
        break;
      }
      paramBoolean = paramInt + -5 + bool2;
      bool7 = bool2 / true;
      paramBoolean += bool7;
      bool7 = paramBitArray.get(bool2);
      if (bool7)
      {
        n = paramInt + -7;
        paramBitMatrix.set(paramBoolean, n);
      }
      int n = bool2 + true;
      boolean bool8 = paramBitArray.get(n);
      if (bool8)
      {
        i1 = paramInt + 7;
        paramBitMatrix.set(i1, paramBoolean);
      }
      int i1 = true - bool2;
      boolean bool9 = paramBitArray.get(i1);
      if (bool9)
      {
        i2 = paramInt + 7;
        paramBitMatrix.set(paramBoolean, i2);
      }
      int i2 = true - bool2;
      boolean bool10 = paramBitArray.get(i2);
      if (bool10)
      {
        int i3 = paramInt + -7;
        paramBitMatrix.set(i3, paramBoolean);
      }
      int i;
      bool2 += true;
    }
  }
  
  public static AztecCode encode(String paramString)
  {
    Charset localCharset = StandardCharsets.ISO_8859_1;
    return encode(paramString.getBytes(localCharset));
  }
  
  public static AztecCode encode(String paramString, int paramInt1, int paramInt2)
  {
    Charset localCharset = StandardCharsets.ISO_8859_1;
    return encode(paramString.getBytes(localCharset), paramInt1, paramInt2, null);
  }
  
  public static AztecCode encode(String paramString, int paramInt1, int paramInt2, Charset paramCharset)
  {
    Charset localCharset;
    if (paramCharset != null) {
      localCharset = paramCharset;
    } else {
      localCharset = StandardCharsets.ISO_8859_1;
    }
    return encode(paramString.getBytes(localCharset), paramInt1, paramInt2, paramCharset);
  }
  
  public static AztecCode encode(byte[] paramArrayOfByte)
  {
    return encode(paramArrayOfByte, 33, 0, null);
  }
  
  public static AztecCode encode(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return encode(paramArrayOfByte, paramInt1, paramInt2, null);
  }
  
  public static AztecCode encode(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Charset paramCharset)
  {
    Object localObject1 = new com/google/zxing/aztec/encoder/HighLevelEncoder;
    Object localObject2 = paramArrayOfByte;
    Object localObject3 = paramCharset;
    ((HighLevelEncoder)localObject1).<init>(paramArrayOfByte, paramCharset);
    localObject1 = ((HighLevelEncoder)localObject1).encode();
    int i = ((BitArray)localObject1).getSize() * paramInt1 / 100;
    int j = 11;
    i += j;
    int k = ((BitArray)localObject1).getSize() + i;
    int m = 32;
    int n = 4;
    int i1 = 1;
    float f = 1.4E-45F;
    int i6;
    int[] arrayOfInt1;
    int i7;
    int i8;
    int i9;
    Object localObject4;
    BitArray localBitArray;
    if (paramInt2 != 0)
    {
      if (paramInt2 < 0) {
        k = i1;
      } else {
        k = 0;
      }
      i6 = Math.abs(paramInt2);
      if (k != 0) {
        m = n;
      }
      if (i6 <= m)
      {
        m = totalBitsInLayer(i6, k);
        arrayOfInt1 = WORD_SIZE;
        i7 = arrayOfInt1[i6];
        i8 = m % i7;
        i8 = m - i8;
        localObject1 = stuffBits((BitArray)localObject1, i7);
        i9 = ((BitArray)localObject1).getSize() + i;
        localObject2 = m54207b69.F54207b69_11("]*6E4C604E0E634B114E5462585B175A54681B716C636D20707268635E68606D6D2A676D76737D");
        if (i9 <= i8)
        {
          if (k != 0)
          {
            i8 = ((BitArray)localObject1).getSize();
            i9 = i7 * 64;
            if (i8 > i9)
            {
              localObject1 = new java/lang/IllegalArgumentException;
              ((IllegalArgumentException)localObject1).<init>((String)localObject2);
              throw ((Throwable)localObject1);
            }
          }
        }
        else
        {
          localObject1 = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      else
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = Integer.valueOf(paramInt2);
        localObject2 = new Object[] { localObject2 };
        localObject2 = String.format(m54207b69.F54207b69_11("Tk22080911100F0D52251311291A585C275B1E162C5F1C2029263232"), (Object[])localObject2);
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    else
    {
      i6 = 0;
      localObject4 = null;
      i7 = 0;
      arrayOfInt1 = null;
      i8 = 0;
      localBitArray = null;
    }
    while (i7 <= m)
    {
      i9 = 3;
      if (i7 <= i9) {
        i9 = i1;
      } else {
        i9 = 0;
      }
      int i11;
      if (i9 != 0) {
        i11 = i7 + 1;
      } else {
        i11 = i7;
      }
      int i12 = totalBitsInLayer(i11, i9);
      if (k > i12) {}
      int i17;
      do
      {
        do
        {
          i12 = i1;
          break label1418;
          if (localObject4 != null)
          {
            arrayOfInt2 = WORD_SIZE;
            int i14 = arrayOfInt2[i11];
            if (i8 == i14) {}
          }
          else
          {
            i6 = WORD_SIZE[i11];
            localBitArray = stuffBits((BitArray)localObject1, i6);
            i8 = i6;
            localObject4 = localBitArray;
          }
          int i15 = i12 % i8;
          i16 = i12 - i15;
          if (i9 == 0) {
            break;
          }
          i17 = localObject4.getSize();
          j = i8 * 64;
        } while (i17 > j);
        j = localObject4.getSize() + i;
      } while (j > i16);
      localObject1 = localObject4;
      i7 = i8;
      k = i9;
      i6 = i11;
      m = i12;
      localObject2 = generateCheckWords((BitArray)localObject1, m, i7);
      int i18 = ((BitArray)localObject1).getSize() / i7;
      localObject3 = generateModeMessage(k, i6, i18);
      if (k != 0) {
        m = 11;
      } else {
        m = 14;
      }
      i7 = i6 * 4;
      m += i7;
      arrayOfInt1 = new int[m];
      i8 = 2;
      int i10;
      int i19;
      int i20;
      if (k != 0)
      {
        i10 = 0;
        while (i10 < m)
        {
          arrayOfInt1[i10] = i10;
          i10 += 1;
        }
        i10 = m;
      }
      else
      {
        i10 = m + 1;
        i11 = m / 2;
        i13 = (i11 + -1) / 15 * i8;
        i10 += i13;
        i13 = i10 / 2;
        i16 = 0;
        arrayOfInt2 = null;
        while (i16 < i11)
        {
          i17 = i16 / 15 + i16;
          i19 = i11 - i16 + -1;
          i20 = i13 - i17 + -1;
          arrayOfInt1[i19] = i20;
          i19 = i11 + i16;
          i17 = i17 + i13 + i1;
          arrayOfInt1[i19] = i17;
          i16 += 1;
        }
      }
      BitMatrix localBitMatrix = new com/google/zxing/common/BitMatrix;
      localBitMatrix.<init>(i10);
      int i13 = 0;
      int i16 = 0;
      int[] arrayOfInt2 = null;
      int i5;
      int i22;
      while (i13 < i6)
      {
        i17 = (i6 - i13) * n;
        if (k != 0) {
          i19 = 9;
        } else {
          i19 = 12;
        }
        i17 += i19;
        n = 0;
        while (n < i17)
        {
          i19 = n * 2;
          int i21 = 0;
          while (i21 < i8)
          {
            i20 = i16 + i19;
            i1 = i20 + i21;
            boolean bool1 = ((BitArray)localObject2).get(i1);
            if (bool1)
            {
              i2 = i13 * 2;
              i20 = i2 + i21;
              i8 = arrayOfInt1[i20];
              i2 += n;
              i2 = arrayOfInt1[i2];
              localBitMatrix.set(i8, i2);
            }
            int i2 = i17 * 2 + i16 + i19 + i21;
            boolean bool2 = ((BitArray)localObject2).get(i2);
            if (bool2)
            {
              i3 = i13 * 2;
              i8 = i3 + n;
              i8 = arrayOfInt1[i8];
              i20 = m + -1 - i3 - i21;
              i3 = arrayOfInt1[i20];
              localBitMatrix.set(i8, i3);
            }
            int i3 = i17 * 4 + i16 + i19 + i21;
            boolean bool3 = ((BitArray)localObject2).get(i3);
            if (bool3)
            {
              i4 = m + -1;
              i8 = i13 * 2;
              i4 -= i8;
              i8 = i4 - i21;
              i8 = arrayOfInt1[i8];
              i4 -= n;
              i4 = arrayOfInt1[i4];
              localBitMatrix.set(i8, i4);
            }
            int i4 = i17 * 6 + i16 + i19 + i21;
            boolean bool4 = ((BitArray)localObject2).get(i4);
            if (bool4)
            {
              i5 = m + -1;
              i8 = i13 * 2;
              i5 = i5 - i8 - n;
              i5 = arrayOfInt1[i5];
              i8 += i21;
              i8 = arrayOfInt1[i8];
              localBitMatrix.set(i5, i8);
            }
            i21 += 1;
            i5 = 1;
            f = 1.4E-45F;
            i8 = 2;
          }
          n += 1;
          i5 = 1;
          f = 1.4E-45F;
          i8 = 2;
        }
        i17 *= 8;
        i16 += i17;
        i13 += 1;
        n = 4;
        i5 = 1;
        f = 1.4E-45F;
        i8 = 2;
      }
      drawModeMessage(localBitMatrix, k, i10, (BitArray)localObject3);
      i = i10 / 2;
      if (k != 0)
      {
        j = 5;
        drawBullsEye(localBitMatrix, i, j);
      }
      else
      {
        drawBullsEye(localBitMatrix, i, 7);
        j = 0;
        localObject3 = null;
        n = 2;
        i22 = 0;
        for (;;)
        {
          i5 = m / 2;
          i13 = 1;
          i5 -= i13;
          if (i22 >= i5) {
            break;
          }
          i5 = i & 0x1;
          while (i5 < i10)
          {
            i7 = i - j;
            localBitMatrix.set(i7, i5);
            i8 = i + j;
            localBitMatrix.set(i8, i5);
            localBitMatrix.set(i5, i7);
            localBitMatrix.set(i5, i8);
            i5 += 2;
          }
          i22 += 15;
          j += 16;
        }
      }
      localObject2 = new com/google/zxing/aztec/encoder/AztecCode;
      ((AztecCode)localObject2).<init>();
      ((AztecCode)localObject2).setCompact(k);
      ((AztecCode)localObject2).setSize(i10);
      ((AztecCode)localObject2).setLayers(i6);
      ((AztecCode)localObject2).setCodeWords(i18);
      ((AztecCode)localObject2).setMatrix(localBitMatrix);
      return localObject2;
      label1418:
      i7 += 1;
      j = 11;
      n = 4;
    }
    localObject1 = new java/lang/IllegalArgumentException;
    localObject2 = m54207b69.F54207b69_11("Tl280E1A10501D090A5409172917165A19132F5E201661432D302229672B202628");
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private static BitArray generateCheckWords(BitArray paramBitArray, int paramInt1, int paramInt2)
  {
    int i = paramBitArray.getSize() / paramInt2;
    ReedSolomonEncoder localReedSolomonEncoder = new com/google/zxing/common/reedsolomon/ReedSolomonEncoder;
    GenericGF localGenericGF = getGF(paramInt2);
    localReedSolomonEncoder.<init>(localGenericGF);
    int j = paramInt1 / paramInt2;
    paramBitArray = bitsToWords(paramBitArray, paramInt2, j);
    j -= i;
    localReedSolomonEncoder.encode(paramBitArray, j);
    paramInt1 %= paramInt2;
    BitArray localBitArray = new com/google/zxing/common/BitArray;
    localBitArray.<init>();
    int k = 0;
    localReedSolomonEncoder = null;
    localBitArray.appendBits(0, paramInt1);
    paramInt1 = paramBitArray.length;
    while (k < paramInt1)
    {
      j = paramBitArray[k];
      localBitArray.appendBits(j, paramInt2);
      k += 1;
    }
    return localBitArray;
  }
  
  public static BitArray generateModeMessage(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    BitArray localBitArray = new com/google/zxing/common/BitArray;
    localBitArray.<init>();
    int i = 4;
    paramInt1 += -1;
    if (paramBoolean)
    {
      localBitArray.appendBits(paramInt1, 2);
      paramInt2 += -1;
      localBitArray.appendBits(paramInt2, 6);
      paramBoolean = true;
    }
    else
    {
      localBitArray.appendBits(paramInt1, 5);
      paramInt2 += -1;
      localBitArray.appendBits(paramInt2, 11);
      paramBoolean = true;
    }
    return generateCheckWords(localBitArray, paramBoolean, i);
  }
  
  private static GenericGF getGF(int paramInt)
  {
    int i = 4;
    if (paramInt != i)
    {
      i = 6;
      if (paramInt != i)
      {
        i = 8;
        if (paramInt != i)
        {
          i = 10;
          if (paramInt != i)
          {
            i = 12;
            if (paramInt == i) {
              return GenericGF.AZTEC_DATA_12;
            }
            IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            String str1 = m54207b69.F54207b69_11("^Y0C382C2F2D2E3C32354547843A43394C893B4236508E");
            localStringBuilder.append(str1);
            localStringBuilder.append(paramInt);
            String str2 = localStringBuilder.toString();
            localIllegalArgumentException.<init>(str2);
            throw localIllegalArgumentException;
          }
          return GenericGF.AZTEC_DATA_10;
        }
        return GenericGF.AZTEC_DATA_8;
      }
      return GenericGF.AZTEC_DATA_6;
    }
    return GenericGF.AZTEC_PARAM;
  }
  
  public static BitArray stuffBits(BitArray paramBitArray, int paramInt)
  {
    BitArray localBitArray = new com/google/zxing/common/BitArray;
    localBitArray.<init>();
    int i = paramBitArray.getSize();
    int j = 1;
    int k = (j << paramInt) + -2;
    int m = 0;
    while (m < i)
    {
      int n = 0;
      int i1 = 0;
      while (n < paramInt)
      {
        int i2 = m + n;
        if (i2 < i)
        {
          boolean bool = paramBitArray.get(i2);
          if (!bool) {}
        }
        else
        {
          int i3 = paramInt + -1 - n;
          i3 = j << i3;
          i1 |= i3;
        }
        n += 1;
      }
      n = i1 & k;
      if (n == k) {}
      for (;;)
      {
        localBitArray.appendBits(n, paramInt);
        m += -1;
        break label154;
        if (n != 0) {
          break;
        }
        n = i1 | 0x1;
      }
      localBitArray.appendBits(i1, paramInt);
      label154:
      m += paramInt;
    }
    return localBitArray;
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
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.aztec.encoder.Encoder
 * JD-Core Version:    0.7.0.1
 */