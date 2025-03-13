package com.google.zxing.qrcode.encoder;

import m54207b69;

final class MaskUtil
{
  private static final int N1 = 3;
  private static final int N2 = 3;
  private static final int N3 = 40;
  private static final int N4 = 10;
  
  public static int applyMaskPenaltyRule1(ByteMatrix paramByteMatrix)
  {
    int i = applyMaskPenaltyRule1Internal(paramByteMatrix, true);
    int j = applyMaskPenaltyRule1Internal(paramByteMatrix, false);
    return i + j;
  }
  
  private static int applyMaskPenaltyRule1Internal(ByteMatrix paramByteMatrix, boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = paramByteMatrix.getHeight();
    } else {
      i = paramByteMatrix.getWidth();
    }
    int j;
    if (paramBoolean) {
      j = paramByteMatrix.getWidth();
    } else {
      j = paramByteMatrix.getHeight();
    }
    paramByteMatrix = paramByteMatrix.getArray();
    int k = 0;
    int m = 0;
    while (k < i)
    {
      int n = -1;
      int i1 = 0;
      int i2 = 0;
      int i3;
      for (;;)
      {
        i3 = 5;
        if (i1 >= j) {
          break;
        }
        Object localObject;
        int i4;
        if (paramBoolean)
        {
          localObject = paramByteMatrix[k];
          i4 = localObject[i1];
        }
        else
        {
          localObject = paramByteMatrix[i1];
          i4 = localObject[k];
        }
        if (i4 == n)
        {
          i2 += 1;
        }
        else
        {
          if (i2 >= i3)
          {
            i2 = i2 + -5 + 3;
            m += i2;
          }
          i2 = 1;
          n = i4;
        }
        i1 += 1;
      }
      if (i2 >= i3)
      {
        i2 = i2 + -5 + 3;
        m += i2;
      }
      k += 1;
    }
    return m;
  }
  
  public static int applyMaskPenaltyRule2(ByteMatrix paramByteMatrix)
  {
    byte[][] arrayOfByte = paramByteMatrix.getArray();
    int i = paramByteMatrix.getWidth();
    int j = paramByteMatrix.getHeight();
    int k = 0;
    int m = 0;
    for (;;)
    {
      int n = j + -1;
      if (k >= n) {
        break;
      }
      byte[] arrayOfByte1 = arrayOfByte[k];
      int i3;
      for (int i1 = 0;; i1 = i3)
      {
        int i2 = i + -1;
        if (i1 >= i2) {
          break;
        }
        i2 = arrayOfByte1[i1];
        i3 = i1 + 1;
        int i4 = arrayOfByte1[i3];
        if (i2 == i4)
        {
          i4 = k + 1;
          byte[] arrayOfByte2 = arrayOfByte[i4];
          i1 = arrayOfByte2[i1];
          if (i2 == i1)
          {
            i1 = arrayOfByte2[i3];
            if (i2 == i1) {
              m += 1;
            }
          }
        }
      }
      k += 1;
    }
    return m * 3;
  }
  
  public static int applyMaskPenaltyRule3(ByteMatrix paramByteMatrix)
  {
    byte[][] arrayOfByte = paramByteMatrix.getArray();
    int i = paramByteMatrix.getWidth();
    int j = paramByteMatrix.getHeight();
    int k = 0;
    int m = 0;
    while (k < j)
    {
      int n = 0;
      while (n < i)
      {
        byte[] arrayOfByte1 = arrayOfByte[k];
        int i1 = n + 6;
        int i3 = 1;
        int i2;
        if (i1 < i)
        {
          int i4 = arrayOfByte1[n];
          if (i4 == i3)
          {
            i4 = n + 1;
            i4 = arrayOfByte1[i4];
            if (i4 == 0)
            {
              i4 = n + 2;
              i4 = arrayOfByte1[i4];
              if (i4 == i3)
              {
                i4 = n + 3;
                i4 = arrayOfByte1[i4];
                if (i4 == i3)
                {
                  i4 = n + 4;
                  i4 = arrayOfByte1[i4];
                  if (i4 == i3)
                  {
                    i4 = n + 5;
                    i4 = arrayOfByte1[i4];
                    if (i4 == 0)
                    {
                      i1 = arrayOfByte1[i1];
                      if (i1 == i3)
                      {
                        i1 = n + -4;
                        boolean bool1 = isWhiteHorizontal(arrayOfByte1, i1, n);
                        if (!bool1)
                        {
                          i2 = n + 7;
                          i4 = n + 11;
                          boolean bool2 = isWhiteHorizontal(arrayOfByte1, i2, i4);
                          if (!bool2) {}
                        }
                        else
                        {
                          m += 1;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        int i5 = k + 6;
        if (i5 < j)
        {
          byte[] arrayOfByte2 = arrayOfByte[k];
          i2 = arrayOfByte2[n];
          if (i2 == i3)
          {
            i2 = k + 1;
            arrayOfByte2 = arrayOfByte[i2];
            i2 = arrayOfByte2[n];
            if (i2 == 0)
            {
              i2 = k + 2;
              arrayOfByte2 = arrayOfByte[i2];
              i2 = arrayOfByte2[n];
              if (i2 == i3)
              {
                i2 = k + 3;
                arrayOfByte2 = arrayOfByte[i2];
                i2 = arrayOfByte2[n];
                if (i2 == i3)
                {
                  i2 = k + 4;
                  arrayOfByte2 = arrayOfByte[i2];
                  i2 = arrayOfByte2[n];
                  if (i2 == i3)
                  {
                    i2 = k + 5;
                    arrayOfByte2 = arrayOfByte[i2];
                    i2 = arrayOfByte2[n];
                    if (i2 == 0)
                    {
                      arrayOfByte1 = arrayOfByte[i5];
                      i5 = arrayOfByte1[n];
                      if (i5 == i3)
                      {
                        i5 = k + -4;
                        boolean bool3 = isWhiteVertical(arrayOfByte, n, i5, k);
                        if (!bool3)
                        {
                          int i6 = k + 7;
                          i2 = k + 11;
                          boolean bool4 = isWhiteVertical(arrayOfByte, n, i6, i2);
                          if (!bool4) {}
                        }
                        else
                        {
                          m += 1;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        n += 1;
      }
      k += 1;
    }
    return m * 40;
  }
  
  public static int applyMaskPenaltyRule4(ByteMatrix paramByteMatrix)
  {
    byte[][] arrayOfByte = paramByteMatrix.getArray();
    int i = paramByteMatrix.getWidth();
    int j = paramByteMatrix.getHeight();
    int k = 0;
    int m = 0;
    while (k < j)
    {
      byte[] arrayOfByte1 = arrayOfByte[k];
      int n = 0;
      while (n < i)
      {
        int i1 = arrayOfByte1[n];
        int i2 = 1;
        if (i1 == i2) {
          m += 1;
        }
        n += 1;
      }
      k += 1;
    }
    int i3 = paramByteMatrix.getHeight();
    int i4 = paramByteMatrix.getWidth();
    i3 *= i4;
    return Math.abs(m * 2 - i3) * 10 / i3 * 10;
  }
  
  public static boolean getDataMaskBit(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    String str1;
    switch (paramInt1)
    {
    default: 
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str1 = m54207b69.F54207b69_11("c/66425B51474B51164A57664F1B6C5C6A6B5B6F542924");
      localStringBuilder.append(str1);
      localStringBuilder.append(paramInt1);
      String str2 = localStringBuilder.toString();
      localIllegalArgumentException.<init>(str2);
      throw localIllegalArgumentException;
    case 7: 
      paramInt1 = paramInt3 * paramInt2 % 3;
      paramInt3 += paramInt2;
      paramInt2 = paramInt3 & 0x1;
      paramInt1 += paramInt2;
      break;
    case 6: 
      paramInt3 *= paramInt2;
      paramInt1 = paramInt3 & 0x1;
      paramInt3 %= 3;
      paramInt1 += paramInt3;
      paramInt1 &= i;
      break;
    case 5: 
      paramInt3 *= paramInt2;
      paramInt1 = paramInt3 & 0x1;
      paramInt3 %= 3;
      paramInt1 += paramInt3;
      break;
    case 4: 
      paramInt3 /= 2;
      paramInt2 /= 3;
      break;
    case 3: 
      paramInt3 += paramInt2;
      paramInt1 = paramInt3 % 3;
      break;
    case 2: 
      paramInt1 = paramInt2 % 3;
      break;
    case 0: 
      paramInt3 += paramInt2;
    }
    paramInt1 = paramInt3 & 0x1;
    if (paramInt1 != 0)
    {
      i = 0;
      str1 = null;
    }
    return i;
  }
  
  private static boolean isWhiteHorizontal(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      int i = paramArrayOfByte.length;
      if (i >= paramInt2)
      {
        for (;;)
        {
          i = 1;
          if (paramInt1 >= paramInt2) {
            break;
          }
          int j = paramArrayOfByte[paramInt1];
          if (j == i) {
            return false;
          }
          paramInt1 += 1;
        }
        return i;
      }
    }
    return false;
  }
  
  private static boolean isWhiteVertical(byte[][] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 >= 0)
    {
      int i = paramArrayOfByte.length;
      if (i >= paramInt3)
      {
        for (;;)
        {
          i = 1;
          if (paramInt2 >= paramInt3) {
            break;
          }
          byte[] arrayOfByte = paramArrayOfByte[paramInt2];
          int j = arrayOfByte[paramInt1];
          if (j == i) {
            return false;
          }
          paramInt2 += 1;
        }
        return i;
      }
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.encoder.MaskUtil
 * JD-Core Version:    0.7.0.1
 */