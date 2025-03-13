package com.google.zxing.common;

import java.util.Arrays;
import m54207b69;

public final class BitArray
  implements Cloneable
{
  private static final int[] EMPTY_BITS = new int[0];
  private static final float LOAD_FACTOR = 0.75F;
  private int[] bits;
  private int size;
  
  public BitArray()
  {
    this.size = 0;
    int[] arrayOfInt = EMPTY_BITS;
    this.bits = arrayOfInt;
  }
  
  public BitArray(int paramInt)
  {
    this.size = paramInt;
    int[] arrayOfInt = makeArray(paramInt);
    this.bits = arrayOfInt;
  }
  
  public BitArray(int[] paramArrayOfInt, int paramInt)
  {
    this.bits = paramArrayOfInt;
    this.size = paramInt;
  }
  
  private void ensureCapacity(int paramInt)
  {
    int[] arrayOfInt1 = this.bits;
    int i = arrayOfInt1.length * 32;
    if (paramInt > i)
    {
      float f1 = paramInt;
      i = 1061158912;
      float f2 = 0.75F;
      f1 /= f2;
      double d = Math.ceil(f1);
      paramInt = (int)d;
      int[] arrayOfInt2 = makeArray(paramInt);
      arrayOfInt1 = this.bits;
      int j = arrayOfInt1.length;
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, j);
      this.bits = arrayOfInt2;
    }
  }
  
  private static int[] makeArray(int paramInt)
  {
    return new int[(paramInt + 31) / 32];
  }
  
  public void appendBit(boolean paramBoolean)
  {
    int i = this.size;
    int j = 1;
    i += j;
    ensureCapacity(i);
    if (paramBoolean)
    {
      int[] arrayOfInt = this.bits;
      i = this.size;
      int k = i / 32;
      int m = arrayOfInt[k];
      i &= 0x1F;
      i = j << i | m;
      arrayOfInt[k] = i;
    }
    paramBoolean = this.size + j;
    this.size = paramBoolean;
  }
  
  public void appendBitArray(BitArray paramBitArray)
  {
    int i = paramBitArray.size;
    int j = this.size + i;
    ensureCapacity(j);
    j = 0;
    while (j < i)
    {
      boolean bool = paramBitArray.get(j);
      appendBit(bool);
      j += 1;
    }
  }
  
  public void appendBits(int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
    {
      int i = 32;
      if (paramInt2 <= i)
      {
        i = this.size;
        int j = i + paramInt2;
        ensureCapacity(j);
        j = 1;
        paramInt2 -= j;
        while (paramInt2 >= 0)
        {
          int k = j << paramInt2 & paramInt1;
          if (k != 0)
          {
            int[] arrayOfInt = this.bits;
            int m = i / 32;
            int n = arrayOfInt[m];
            int i1 = i & 0x1F;
            i1 = j << i1;
            n |= i1;
            arrayOfInt[m] = n;
          }
          i += 1;
          paramInt2 += -1;
        }
        this.size = i;
        return;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("8Q1F253E74373D2B2979452E2D317E4143814446383A494A56897A8B4B5B528F8183");
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public void clear()
  {
    int[] arrayOfInt1 = this.bits;
    int i = arrayOfInt1.length;
    int j = 0;
    while (j < i)
    {
      int[] arrayOfInt2 = this.bits;
      arrayOfInt2[j] = 0;
      j += 1;
    }
  }
  
  public BitArray clone()
  {
    BitArray localBitArray = new com/google/zxing/common/BitArray;
    int[] arrayOfInt = (int[])this.bits.clone();
    int i = this.size;
    localBitArray.<init>(arrayOfInt, i);
    return localBitArray;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof BitArray;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (BitArray)paramObject;
    int i = this.size;
    int j = paramObject.size;
    if (i == j)
    {
      int[] arrayOfInt = this.bits;
      paramObject = paramObject.bits;
      boolean bool3 = Arrays.equals(arrayOfInt, paramObject);
      if (bool3) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public void flip(int paramInt)
  {
    int[] arrayOfInt = this.bits;
    int i = paramInt / 32;
    int j = arrayOfInt[i];
    paramInt &= 0x1F;
    paramInt = 1 << paramInt ^ j;
    arrayOfInt[i] = paramInt;
  }
  
  public boolean get(int paramInt)
  {
    int[] arrayOfInt = this.bits;
    int i = paramInt / 32;
    int j = arrayOfInt[i];
    paramInt &= 0x1F;
    i = 1;
    paramInt = i << paramInt & j;
    if (paramInt == 0) {
      i = 0;
    }
    return i;
  }
  
  public int[] getBitArray()
  {
    return this.bits;
  }
  
  public int getNextSet(int paramInt)
  {
    int i = this.size;
    if (paramInt >= i) {
      return i;
    }
    i = paramInt / 32;
    int[] arrayOfInt1 = this.bits;
    int j = arrayOfInt1[i];
    paramInt &= 0x1F;
    int k = 1;
    int[] arrayOfInt2;
    for (paramInt = -(k << paramInt) & j; paramInt == 0; paramInt = arrayOfInt2[i])
    {
      i += 1;
      arrayOfInt2 = this.bits;
      j = arrayOfInt2.length;
      if (i == j) {
        return this.size;
      }
    }
    i *= 32;
    paramInt = Integer.numberOfTrailingZeros(paramInt);
    i += paramInt;
    paramInt = this.size;
    return Math.min(i, paramInt);
  }
  
  public int getNextUnset(int paramInt)
  {
    int i = this.size;
    if (paramInt >= i) {
      return i;
    }
    i = paramInt / 32;
    int[] arrayOfInt1 = this.bits;
    int j = arrayOfInt1[i] ^ 0xFFFFFFFF;
    paramInt &= 0x1F;
    int k = 1;
    int[] arrayOfInt2;
    for (paramInt = -(k << paramInt) & j; paramInt == 0; paramInt = arrayOfInt2[i] ^ 0xFFFFFFFF)
    {
      i += 1;
      arrayOfInt2 = this.bits;
      j = arrayOfInt2.length;
      if (i == j) {
        return this.size;
      }
    }
    i *= 32;
    paramInt = Integer.numberOfTrailingZeros(paramInt);
    i += paramInt;
    paramInt = this.size;
    return Math.min(i, paramInt);
  }
  
  public int getSize()
  {
    return this.size;
  }
  
  public int getSizeInBytes()
  {
    return (this.size + 7) / 8;
  }
  
  public int hashCode()
  {
    int i = this.size * 31;
    int j = Arrays.hashCode(this.bits);
    return i + j;
  }
  
  public boolean isRange(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramInt2 >= paramInt1) && (paramInt1 >= 0))
    {
      int i = this.size;
      if (paramInt2 <= i)
      {
        i = 1;
        if (paramInt2 == paramInt1) {
          return i;
        }
        paramInt2 += -1;
        int j = paramInt1 / 32;
        int k = paramInt2 / 32;
        int m = j;
        while (m <= k)
        {
          int n = 31;
          if (m > j)
          {
            i1 = 0;
            arrayOfInt = null;
          }
          else
          {
            i1 = paramInt1 & 0x1F;
          }
          if (m >= k) {
            n &= paramInt2;
          }
          int i2 = 2;
          n = i2 << n;
          int i1 = i << i1;
          n -= i1;
          int[] arrayOfInt = this.bits;
          i1 = arrayOfInt[m] & n;
          if (!paramBoolean) {
            n = 0;
          }
          if (i1 != n) {
            return false;
          }
          m += 1;
        }
        return i;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>();
    throw localIllegalArgumentException;
  }
  
  public void reverse()
  {
    int i = this.bits.length;
    int[] arrayOfInt1 = new int[i];
    int j = this.size;
    int k = 1;
    j = (j - k) / 32;
    int m = j + 1;
    int n = 0;
    int i1 = 0;
    int i2;
    int i3;
    while (i1 < m)
    {
      i2 = j - i1;
      int[] arrayOfInt2 = this.bits;
      i3 = Integer.reverse(arrayOfInt2[i1]);
      arrayOfInt1[i2] = i3;
      i1 += 1;
    }
    j = this.size;
    i1 = m * 32;
    if (j != i1)
    {
      i1 -= j;
      j = arrayOfInt1[0] >>> i1;
      n = k;
      while (n < m)
      {
        i2 = arrayOfInt1[n];
        i3 = 32 - i1;
        i3 = i2 << i3;
        j |= i3;
        i3 = n + -1;
        arrayOfInt1[i3] = j;
        j = i2 >>> i1;
        n += 1;
      }
      m -= k;
      arrayOfInt1[m] = j;
    }
    this.bits = arrayOfInt1;
  }
  
  public void set(int paramInt)
  {
    int[] arrayOfInt = this.bits;
    int i = paramInt / 32;
    int j = arrayOfInt[i];
    paramInt &= 0x1F;
    paramInt = 1 << paramInt | j;
    arrayOfInt[i] = paramInt;
  }
  
  public void setBulk(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = this.bits;
    paramInt1 /= 32;
    arrayOfInt[paramInt1] = paramInt2;
  }
  
  public void setRange(int paramInt1, int paramInt2)
  {
    if ((paramInt2 >= paramInt1) && (paramInt1 >= 0))
    {
      int i = this.size;
      if (paramInt2 <= i)
      {
        if (paramInt2 == paramInt1) {
          return;
        }
        paramInt2 += -1;
        i = paramInt1 / 32;
        int j = paramInt2 / 32;
        int k = i;
        while (k <= j)
        {
          int m = 31;
          if (k > i)
          {
            n = 0;
            arrayOfInt = null;
          }
          else
          {
            n = paramInt1 & 0x1F;
          }
          if (k >= j) {
            m &= paramInt2;
          }
          m = 2 << m;
          int n = 1 << n;
          m -= n;
          int[] arrayOfInt = this.bits;
          int i1 = arrayOfInt[k];
          m |= i1;
          arrayOfInt[k] = m;
          k += 1;
        }
        return;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>();
    throw localIllegalArgumentException;
  }
  
  public void toBytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = 0;
    while (i < paramInt3)
    {
      int j = 0;
      int k = 0;
      for (;;)
      {
        int m = 8;
        if (j >= m) {
          break;
        }
        boolean bool = get(paramInt1);
        if (bool)
        {
          int n = 7 - j;
          int i1 = 1;
          n = i1 << n;
          k |= n;
        }
        paramInt1 += 1;
        j += 1;
      }
      j = paramInt2 + i;
      k = (byte)k;
      paramArrayOfByte[j] = k;
      i += 1;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = this.size;
    int j = i / 8;
    i = i + j + 1;
    localStringBuilder.<init>(i);
    i = 0;
    for (;;)
    {
      j = this.size;
      if (i >= j) {
        break;
      }
      j = i & 0x7;
      if (j == 0)
      {
        j = 32;
        localStringBuilder.append(j);
      }
      boolean bool = get(i);
      char c;
      if (bool) {
        c = 'X';
      } else {
        c = '.';
      }
      localStringBuilder.append(c);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public void xor(BitArray paramBitArray)
  {
    int i = this.size;
    int j = paramBitArray.size;
    if (i == j)
    {
      i = 0;
      str = null;
      for (;;)
      {
        int[] arrayOfInt1 = this.bits;
        int k = arrayOfInt1.length;
        if (i >= k) {
          break;
        }
        k = arrayOfInt1[i];
        int[] arrayOfInt2 = paramBitArray.bits;
        int m = arrayOfInt2[i];
        k ^= m;
        arrayOfInt1[i] = k;
        i += 1;
      }
      return;
    }
    paramBitArray = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("SX0B3224402F7D423E3E88368341463A4A40");
    paramBitArray.<init>(str);
    throw paramBitArray;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.BitArray
 * JD-Core Version:    0.7.0.1
 */