package com.google.zxing.pdf417.decoder;

import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import java.lang.reflect.Array;

final class PDF417CodewordDecoder
{
  private static final float[][] RATIOS_TABLE;
  
  static
  {
    int i = PDF417Common.SYMBOL_TABLE.length;
    int j = 8;
    int[] arrayOfInt1 = { i, j };
    RATIOS_TABLE = (float[][])Array.newInstance(Float.TYPE, arrayOfInt1);
    i = 0;
    arrayOfInt1 = null;
    int k = 0;
    for (;;)
    {
      int[] arrayOfInt2 = PDF417Common.SYMBOL_TABLE;
      int m = arrayOfInt2.length;
      if (k >= m) {
        break;
      }
      int n = arrayOfInt2[k];
      m = n & 0x1;
      int i1 = 0;
      while (i1 < j)
      {
        float f1 = 0.0F;
        int i2;
        for (;;)
        {
          i2 = n & 0x1;
          if (i2 != m) {
            break;
          }
          i2 = 1065353216;
          float f2 = 1.0F;
          f1 += f2;
          n >>= 1;
        }
        float[] arrayOfFloat = RATIOS_TABLE[k];
        int i3 = 8 - i1 + -1;
        float f3 = 17.0F;
        f1 /= f3;
        arrayOfFloat[i3] = f1;
        i1 += 1;
        m = i2;
      }
      k += 1;
    }
  }
  
  private static int getBitValue(int[] paramArrayOfInt)
  {
    long l1 = 0L;
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfInt.length;
      if (i >= j) {
        break;
      }
      j = 0;
      for (;;)
      {
        int k = paramArrayOfInt[i];
        if (j >= k) {
          break;
        }
        k = 1;
        l1 <<= k;
        int m = i % 2;
        if (m != 0) {
          k = 0;
        }
        long l2 = k;
        l1 |= l2;
        j += 1;
      }
      i += 1;
    }
    return (int)l1;
  }
  
  private static int getClosestDecodedValue(int[] paramArrayOfInt)
  {
    int i = MathUtils.sum(paramArrayOfInt);
    int j = 8;
    float[] arrayOfFloat = new float[j];
    int k = 1;
    float f2;
    if (i > k)
    {
      k = 0;
      while (k < j)
      {
        int m = paramArrayOfInt[k];
        float f1 = m;
        f2 = i;
        f1 /= f2;
        arrayOfFloat[k] = f1;
        k += 1;
      }
    }
    int n = 2139095039;
    float f3 = 3.4028235E+38F;
    i = -1;
    k = 0;
    for (;;)
    {
      Object localObject = RATIOS_TABLE;
      int i1 = localObject.length;
      if (k >= i1) {
        break;
      }
      localObject = localObject[k];
      i1 = 0;
      f2 = 0.0F;
      int i2 = 0;
      while (i2 < j)
      {
        float f4 = localObject[i2];
        float f5 = arrayOfFloat[i2];
        f4 -= f5;
        f4 *= f4;
        f2 += f4;
        boolean bool2 = f2 < f3;
        if (!bool2) {
          break;
        }
        i2 += 1;
      }
      boolean bool1 = f2 < f3;
      if (bool1)
      {
        paramArrayOfInt = PDF417Common.SYMBOL_TABLE;
        n = paramArrayOfInt[k];
        i = n;
        f3 = f2;
      }
      k += 1;
    }
    return i;
  }
  
  private static int getDecodedCodewordValue(int[] paramArrayOfInt)
  {
    int i = getBitValue(paramArrayOfInt);
    int j = PDF417Common.getCodeword(i);
    int k = -1;
    if (j == k) {
      i = k;
    }
    return i;
  }
  
  public static int getDecodedValue(int[] paramArrayOfInt)
  {
    int[] arrayOfInt = sampleBitCounts(paramArrayOfInt);
    int i = getDecodedCodewordValue(arrayOfInt);
    int j = -1;
    if (i != j) {
      return i;
    }
    return getClosestDecodedValue(paramArrayOfInt);
  }
  
  private static int[] sampleBitCounts(int[] paramArrayOfInt)
  {
    int i = MathUtils.sum(paramArrayOfInt);
    float f1 = i;
    int j = 8;
    int[] arrayOfInt = new int[j];
    int k = 0;
    int m = 0;
    int n = 0;
    for (;;)
    {
      int i1 = 17;
      float f2 = 2.382207E-044F;
      if (k >= i1) {
        break;
      }
      f2 = f1 / 34.0F;
      float f3 = k * f1 / 17.0F;
      f2 += f3;
      int i3 = paramArrayOfInt[n];
      int i4 = m + i3;
      float f4 = i4;
      boolean bool = f4 < f2;
      if (!bool)
      {
        m += i3;
        n += 1;
      }
      int i2 = arrayOfInt[n] + 1;
      arrayOfInt[n] = i2;
      k += 1;
    }
    return arrayOfInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.PDF417CodewordDecoder
 * JD-Core Version:    0.7.0.1
 */