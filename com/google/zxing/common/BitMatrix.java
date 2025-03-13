package com.google.zxing.common;

import java.util.Arrays;
import m54207b69;

public final class BitMatrix
  implements Cloneable
{
  private int[] bits;
  private int height;
  private int rowSize;
  private int width;
  
  public BitMatrix(int paramInt)
  {
    this(paramInt, paramInt);
  }
  
  public BitMatrix(int paramInt1, int paramInt2)
  {
    int i = 1;
    if ((paramInt1 >= i) && (paramInt2 >= i))
    {
      this.width = paramInt1;
      this.height = paramInt2;
      paramInt1 = (paramInt1 + 31) / 32;
      this.rowSize = paramInt1;
      localObject = new int[paramInt1 * paramInt2];
      this.bits = ((int[])localObject);
      return;
    }
    Object localObject = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("5>7C524C59225F5D5A635957625D5D5B2D635C5F5D327171357165757A66786A3D6A7781734233");
    ((IllegalArgumentException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  private BitMatrix(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    this.width = paramInt1;
    this.height = paramInt2;
    this.rowSize = paramInt3;
    this.bits = paramArrayOfInt;
  }
  
  private String buildToString(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = this.height;
    int j = this.width + 1;
    i *= j;
    localStringBuilder.<init>(i);
    i = 0;
    j = 0;
    for (;;)
    {
      int k = this.height;
      if (j >= k) {
        break;
      }
      k = 0;
      for (;;)
      {
        int m = this.width;
        if (k >= m) {
          break;
        }
        boolean bool = get(k, j);
        String str;
        if (bool) {
          str = paramString1;
        } else {
          str = paramString2;
        }
        localStringBuilder.append(str);
        k += 1;
      }
      localStringBuilder.append(paramString3);
      j += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static BitMatrix parse(String paramString1, String paramString2, String paramString3)
  {
    if (paramString1 != null)
    {
      int i = paramString1.length();
      Object localObject = new boolean[i];
      int j = -1;
      int k = 0;
      int m = j;
      int n = 0;
      int i1 = 0;
      int i2 = 0;
      int i3 = 0;
      String str;
      for (;;)
      {
        int i4 = paramString1.length();
        str = m54207b69.F54207b69_11("x1435F48146159655D4D624C1C616B1F6E6E56236F645A6870");
        if (n >= i4) {
          break;
        }
        i4 = paramString1.charAt(n);
        int i7 = 10;
        if (i4 != i7)
        {
          i4 = paramString1.charAt(n);
          i7 = 13;
          if (i4 != i7)
          {
            boolean bool1 = paramString1.startsWith(paramString2, n);
            if (bool1)
            {
              int i5 = paramString2.length();
              n += i5;
              i5 = 1;
              localObject[i1] = i5;
            }
            for (;;)
            {
              i1 += 1;
              break;
              boolean bool2 = paramString1.startsWith(paramString3, n);
              if (!bool2) {
                break label179;
              }
              int i6 = paramString3.length();
              n += i6;
              localObject[i1] = 0;
            }
            label179:
            paramString2 = new java/lang/IllegalArgumentException;
            paramString3 = new java/lang/StringBuilder;
            paramString3.<init>();
            localObject = m54207b69.F54207b69_11("7{12181921201F1D62201C241426251D2D196C30282C29242C273723393B5E79");
            paramString3.append((String)localObject);
            paramString1 = paramString1.substring(n);
            paramString3.append(paramString1);
            paramString1 = paramString3.toString();
            paramString2.<init>(paramString1);
            throw paramString2;
          }
        }
        if (i1 > i2)
        {
          if (m == j)
          {
            m = i1 - i2;
          }
          else
          {
            i2 = i1 - i2;
            if (i2 != m) {
              break label281;
            }
          }
          i3 += 1;
          i2 = i1;
          break label293;
          label281:
          paramString1 = new java/lang/IllegalArgumentException;
          paramString1.<init>(str);
          throw paramString1;
        }
        label293:
        n += 1;
      }
      if (i1 > i2)
      {
        int i8 = i1 - i2;
        if (m == j) {
          m = i8;
        } else {
          if (i8 != m) {
            break label346;
          }
        }
        i3 += 1;
        break label358;
        label346:
        paramString1 = new java/lang/IllegalArgumentException;
        paramString1.<init>(str);
        throw paramString1;
      }
      label358:
      paramString1 = new com/google/zxing/common/BitMatrix;
      paramString1.<init>(m, i3);
      while (k < i1)
      {
        int i9 = localObject[k];
        if (i9 != 0)
        {
          i9 = k % m;
          int i10 = k / m;
          paramString1.set(i9, i10);
        }
        k += 1;
      }
      return paramString1;
    }
    paramString1 = new java/lang/IllegalArgumentException;
    paramString1.<init>();
    throw paramString1;
  }
  
  public static BitMatrix parse(boolean[][] paramArrayOfBoolean)
  {
    int i = paramArrayOfBoolean.length;
    boolean[] arrayOfBoolean1 = paramArrayOfBoolean[0];
    int j = arrayOfBoolean1.length;
    BitMatrix localBitMatrix = new com/google/zxing/common/BitMatrix;
    localBitMatrix.<init>(j, i);
    int k = 0;
    while (k < i)
    {
      boolean[] arrayOfBoolean2 = paramArrayOfBoolean[k];
      int m = 0;
      while (m < j)
      {
        int n = arrayOfBoolean2[m];
        if (n != 0) {
          localBitMatrix.set(m, k);
        }
        m += 1;
      }
      k += 1;
    }
    return localBitMatrix;
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
  
  public BitMatrix clone()
  {
    BitMatrix localBitMatrix = new com/google/zxing/common/BitMatrix;
    int i = this.width;
    int j = this.height;
    int k = this.rowSize;
    int[] arrayOfInt = (int[])this.bits.clone();
    localBitMatrix.<init>(i, j, k, arrayOfInt);
    return localBitMatrix;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof BitMatrix;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (BitMatrix)paramObject;
    int i = this.width;
    int j = paramObject.width;
    if (i == j)
    {
      i = this.height;
      j = paramObject.height;
      if (i == j)
      {
        i = this.rowSize;
        j = paramObject.rowSize;
        if (i == j)
        {
          int[] arrayOfInt = this.bits;
          paramObject = paramObject.bits;
          boolean bool3 = Arrays.equals(arrayOfInt, paramObject);
          if (bool3) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public void flip()
  {
    int[] arrayOfInt1 = this.bits;
    int i = arrayOfInt1.length;
    int j = 0;
    while (j < i)
    {
      int[] arrayOfInt2 = this.bits;
      int k = arrayOfInt2[j] ^ 0xFFFFFFFF;
      arrayOfInt2[j] = k;
      j += 1;
    }
  }
  
  public void flip(int paramInt1, int paramInt2)
  {
    int i = this.rowSize;
    paramInt2 *= i;
    i = paramInt1 / 32;
    paramInt2 += i;
    int[] arrayOfInt = this.bits;
    int j = arrayOfInt[paramInt2];
    paramInt1 &= 0x1F;
    paramInt1 = 1 << paramInt1 ^ j;
    arrayOfInt[paramInt2] = paramInt1;
  }
  
  public boolean get(int paramInt1, int paramInt2)
  {
    int i = this.rowSize;
    paramInt2 *= i;
    i = paramInt1 / 32;
    paramInt2 += i;
    int[] arrayOfInt = this.bits;
    paramInt2 = arrayOfInt[paramInt2];
    paramInt1 &= 0x1F;
    paramInt1 = paramInt2 >>> paramInt1;
    paramInt2 = 1;
    paramInt1 &= paramInt2;
    if (paramInt1 == 0) {
      paramInt2 = 0;
    }
    return paramInt2;
  }
  
  public int[] getBottomRightOnBit()
  {
    int[] arrayOfInt1 = this.bits;
    int i = arrayOfInt1.length + -1;
    while (i >= 0)
    {
      int[] arrayOfInt2 = this.bits;
      j = arrayOfInt2[i];
      if (j != 0) {
        break;
      }
      i += -1;
    }
    if (i < 0) {
      return null;
    }
    int j = this.rowSize;
    int k = i / j;
    j = i % j * 32;
    int[] arrayOfInt3 = this.bits;
    i = arrayOfInt3[i];
    int m = 31;
    for (;;)
    {
      int n = i >>> m;
      if (n != 0) {
        break;
      }
      m += -1;
    }
    j += m;
    return new int[] { j, k };
  }
  
  public int[] getEnclosingRectangle()
  {
    int i = this.width;
    int j = this.height;
    int k = -1;
    int m = k;
    int n = 0;
    for (;;)
    {
      int i1 = this.height;
      if (n >= i1) {
        break;
      }
      i1 = 0;
      for (;;)
      {
        int i2 = this.rowSize;
        if (i1 >= i2) {
          break;
        }
        int[] arrayOfInt = this.bits;
        i2 = i2 * n + i1;
        i2 = arrayOfInt[i2];
        if (i2 != 0)
        {
          if (n < j) {
            j = n;
          }
          if (n > m) {
            m = n;
          }
          int i3 = i1 * 32;
          int i5;
          if (i3 < i)
          {
            i4 = 0;
            for (;;)
            {
              i5 = 31 - i4;
              i5 = i2 << i5;
              if (i5 != 0) {
                break;
              }
              i4 += 1;
            }
            i4 += i3;
            if (i4 < i) {
              i = i4;
            }
          }
          int i4 = i3 + 31;
          if (i4 > k)
          {
            i4 = 31;
            for (;;)
            {
              i5 = i2 >>> i4;
              if (i5 != 0) {
                break;
              }
              i4 += -1;
            }
            i3 += i4;
            if (i3 > k) {
              k = i3;
            }
          }
        }
        i1 += 1;
      }
      n += 1;
    }
    if ((k >= i) && (m >= j))
    {
      k = k - i + 1;
      m = m - j + 1;
      int[] tmp258_256 = new int[4];
      int[] tmp259_258 = tmp258_256;
      int[] tmp259_258 = tmp258_256;
      tmp259_258[0] = i;
      tmp259_258[1] = j;
      tmp259_258[2] = k;
      int[] tmp269_259 = tmp259_258;
      tmp269_259[3] = m;
      return tmp269_259;
    }
    return null;
  }
  
  public int getHeight()
  {
    return this.height;
  }
  
  public BitArray getRow(int paramInt, BitArray paramBitArray)
  {
    int j;
    if (paramBitArray != null)
    {
      i = paramBitArray.getSize();
      j = this.width;
      if (i >= j)
      {
        paramBitArray.clear();
        break label45;
      }
    }
    paramBitArray = new com/google/zxing/common/BitArray;
    int i = this.width;
    paramBitArray.<init>(i);
    label45:
    i = this.rowSize;
    paramInt *= i;
    i = 0;
    for (;;)
    {
      j = this.rowSize;
      if (i >= j) {
        break;
      }
      j = i * 32;
      int[] arrayOfInt = this.bits;
      int k = paramInt + i;
      int m = arrayOfInt[k];
      paramBitArray.setBulk(j, m);
      i += 1;
    }
    return paramBitArray;
  }
  
  public int getRowSize()
  {
    return this.rowSize;
  }
  
  public int[] getTopLeftOnBit()
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt;
    for (;;)
    {
      arrayOfInt = this.bits;
      k = arrayOfInt.length;
      if (j >= k) {
        break;
      }
      k = arrayOfInt[j];
      if (k != 0) {
        break;
      }
      j += 1;
    }
    int k = arrayOfInt.length;
    if (j == k) {
      return null;
    }
    k = this.rowSize;
    int m = j / k;
    k = j % k * 32;
    j = arrayOfInt[j];
    for (;;)
    {
      int n = 31 - i;
      n = j << n;
      if (n != 0) {
        break;
      }
      i += 1;
    }
    k += i;
    return new int[] { k, m };
  }
  
  public int getWidth()
  {
    return this.width;
  }
  
  public int hashCode()
  {
    int i = this.width;
    int j = (i * 31 + i) * 31;
    i = this.height;
    j = (j + i) * 31;
    i = this.rowSize;
    j = (j + i) * 31;
    i = Arrays.hashCode(this.bits);
    return j + i;
  }
  
  public void rotate(int paramInt)
  {
    paramInt %= 360;
    if (paramInt != 0)
    {
      int i = 90;
      if (paramInt != i)
      {
        i = 180;
        if (paramInt != i)
        {
          i = 270;
          if (paramInt == i)
          {
            rotate90();
            rotate180();
            return;
          }
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          String str = m54207b69.F54207b69_11("7k0F0F0E1C12131E520E27222A57161C5A1A5C18311B3418321F27651F296879666B737D6A6F7F79826F742E4477868A8A");
          localIllegalArgumentException.<init>(str);
          throw localIllegalArgumentException;
        }
        rotate180();
        return;
      }
      rotate90();
    }
  }
  
  public void rotate180()
  {
    BitArray localBitArray1 = new com/google/zxing/common/BitArray;
    int i = this.width;
    localBitArray1.<init>(i);
    BitArray localBitArray2 = new com/google/zxing/common/BitArray;
    int j = this.width;
    localBitArray2.<init>(j);
    j = (this.height + 1) / 2;
    int k = 0;
    while (k < j)
    {
      localBitArray1 = getRow(k, localBitArray1);
      int m = this.height + -1 - k;
      localBitArray2 = getRow(m, localBitArray2);
      localBitArray1.reverse();
      localBitArray2.reverse();
      setRow(k, localBitArray2);
      setRow(m, localBitArray1);
      k += 1;
    }
  }
  
  public void rotate90()
  {
    int i = this.height;
    int j = this.width;
    int k = (i + 31) / 32;
    int m = k * j;
    int[] arrayOfInt1 = new int[m];
    int n = 0;
    for (;;)
    {
      int i1 = this.height;
      if (n >= i1) {
        break;
      }
      i1 = 0;
      for (;;)
      {
        int i2 = this.width;
        if (i1 >= i2) {
          break;
        }
        i2 = this.rowSize * n;
        int i3 = i1 / 32;
        i2 += i3;
        int[] arrayOfInt2 = this.bits;
        i2 = arrayOfInt2[i2];
        i3 = i1 & 0x1F;
        i2 >>>= i3;
        i3 = 1;
        i2 &= i3;
        if (i2 != 0)
        {
          i2 = (j + -1 - i1) * k;
          int i4 = n / 32;
          i2 += i4;
          i4 = arrayOfInt1[i2];
          int i5 = n & 0x1F;
          i3 = i3 << i5 | i4;
          arrayOfInt1[i2] = i3;
        }
        i1 += 1;
      }
      n += 1;
    }
    this.width = i;
    this.height = j;
    this.rowSize = k;
    this.bits = arrayOfInt1;
  }
  
  public void set(int paramInt1, int paramInt2)
  {
    int i = this.rowSize;
    paramInt2 *= i;
    i = paramInt1 / 32;
    paramInt2 += i;
    int[] arrayOfInt = this.bits;
    int j = arrayOfInt[paramInt2];
    paramInt1 &= 0x1F;
    paramInt1 = 1 << paramInt1 | j;
    arrayOfInt[paramInt2] = paramInt1;
  }
  
  public void setRegion(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 >= 0) && (paramInt1 >= 0))
    {
      int i = 1;
      if ((paramInt4 >= i) && (paramInt3 >= i))
      {
        paramInt3 += paramInt1;
        paramInt4 += paramInt2;
        int j = this.height;
        if (paramInt4 <= j)
        {
          j = this.width;
          if (paramInt3 <= j)
          {
            while (paramInt2 < paramInt4)
            {
              j = this.rowSize * paramInt2;
              int k = paramInt1;
              while (k < paramInt3)
              {
                int[] arrayOfInt = this.bits;
                int m = k / 32 + j;
                int n = arrayOfInt[m];
                int i1 = k & 0x1F;
                i1 = i << i1;
                n |= i1;
                arrayOfInt[m] = n;
                k += 1;
              }
              paramInt2 += 1;
            }
            return;
          }
        }
        localIllegalArgumentException = new java/lang/IllegalArgumentException;
        str = m54207b69.F54207b69_11("^`34090743160A0D1017174A182120224F161A26531D2329201C1E5A2F24225E2C2135342C3C");
        localIllegalArgumentException.<init>(str);
        throw localIllegalArgumentException;
      }
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      str = m54207b69.F54207b69_11("'.664C494C4A5F145648531864535768551E546D706E236262266874295E686D7C7A2F41");
      localIllegalArgumentException.<init>(str);
      throw localIllegalArgumentException;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("_M01292D3C7131293075422C48792D464D497E413B8138383A3B41444755415947");
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public void setRow(int paramInt, BitArray paramBitArray)
  {
    paramBitArray = paramBitArray.getBitArray();
    int[] arrayOfInt = this.bits;
    int i = this.rowSize;
    paramInt *= i;
    System.arraycopy(paramBitArray, 0, arrayOfInt, paramInt, i);
  }
  
  public String toString()
  {
    return toString("X ", "  ");
  }
  
  public String toString(String paramString1, String paramString2)
  {
    return buildToString(paramString1, paramString2, "\n");
  }
  
  public String toString(String paramString1, String paramString2, String paramString3)
  {
    return buildToString(paramString1, paramString2, paramString3);
  }
  
  public void unset(int paramInt1, int paramInt2)
  {
    int i = this.rowSize;
    paramInt2 *= i;
    i = paramInt1 / 32;
    paramInt2 += i;
    int[] arrayOfInt = this.bits;
    int j = arrayOfInt[paramInt2];
    paramInt1 &= 0x1F;
    paramInt1 = (1 << paramInt1 ^ 0xFFFFFFFF) & j;
    arrayOfInt[paramInt2] = paramInt1;
  }
  
  public void xor(BitMatrix paramBitMatrix)
  {
    int i = this.width;
    int j = paramBitMatrix.width;
    if (i == j)
    {
      i = this.height;
      j = paramBitMatrix.height;
      if (i == j)
      {
        i = this.rowSize;
        j = paramBitMatrix.rowSize;
        if (i == j)
        {
          localObject = new com/google/zxing/common/BitArray;
          j = this.width;
          ((BitArray)localObject).<init>(j);
          j = 0;
          int k = 0;
          for (;;)
          {
            int m = this.height;
            if (k >= m) {
              break;
            }
            m = this.rowSize * k;
            int[] arrayOfInt1 = paramBitMatrix.getRow(k, (BitArray)localObject).getBitArray();
            int n = 0;
            for (;;)
            {
              int i1 = this.rowSize;
              if (n >= i1) {
                break;
              }
              int[] arrayOfInt2 = this.bits;
              int i2 = m + n;
              int i3 = arrayOfInt2[i2];
              int i4 = arrayOfInt1[n];
              i3 ^= i4;
              arrayOfInt2[i2] = i3;
              n += 1;
            }
            k += 1;
          }
          return;
        }
      }
    }
    paramBitMatrix = new java/lang/IllegalArgumentException;
    Object localObject = m54207b69.F54207b69_11("UJ23253C42426F2D3246412D3D763B31363F354B3639394F81463E843F415B88464B5F4B45");
    paramBitMatrix.<init>((String)localObject);
    throw paramBitMatrix;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.BitMatrix
 * JD-Core Version:    0.7.0.1
 */