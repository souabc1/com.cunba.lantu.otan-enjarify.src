package com.google.zxing;

import m54207b69;

public abstract class LuminanceSource
{
  private final int height;
  private final int width;
  
  public LuminanceSource(int paramInt1, int paramInt2)
  {
    this.width = paramInt1;
    this.height = paramInt2;
  }
  
  public LuminanceSource crop(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("pa350A0A1545121A1310180A1A0E114F211E25251518561B251C2B5B2A2A325F3134323331373A67293B373B3C343C347E");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public final int getHeight()
  {
    return this.height;
  }
  
  public abstract byte[] getMatrix();
  
  public abstract byte[] getRow(int paramInt, byte[] paramArrayOfByte);
  
  public final int getWidth()
  {
    return this.width;
  }
  
  public LuminanceSource invert()
  {
    InvertedLuminanceSource localInvertedLuminanceSource = new com/google/zxing/InvertedLuminanceSource;
    localInvertedLuminanceSource.<init>(this);
    return localInvertedLuminanceSource;
  }
  
  public boolean isCropSupported()
  {
    return false;
  }
  
  public boolean isRotateSupported()
  {
    return false;
  }
  
  public LuminanceSource rotateCounterClockwise()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("Qz2E13150C5E1B151E1B1D251F252C681825201A2C336F342C3722742F312B78282F2B2C382C33802F3D3745393F42428948348C767E8F54565541595A4591");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public LuminanceSource rotateCounterClockwise45()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("3w232020075B20082126222024201F651328131727266C292F2A1D7134342075232228293B29287D2C402C402E4A454786453F8976768C4949483E4C4D4096");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public final String toString()
  {
    int i = this.width;
    byte[] arrayOfByte = new byte[i];
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int j = this.height;
    i += 1;
    j *= i;
    localStringBuilder.<init>(j);
    i = 0;
    j = 0;
    for (;;)
    {
      int k = this.height;
      if (j >= k) {
        break;
      }
      arrayOfByte = getRow(j, arrayOfByte);
      k = 0;
      for (;;)
      {
        int m = this.width;
        if (k >= m) {
          break;
        }
        int n = arrayOfByte[k] & 0xFF;
        int i1 = 64;
        if (n < i1)
        {
          n = 35;
        }
        else
        {
          int i2 = 128;
          if (n < i2)
          {
            n = 43;
          }
          else
          {
            int i3 = 192;
            if (n < i3) {
              n = 46;
            } else {
              n = 32;
            }
          }
        }
        localStringBuilder.append(n);
        k += 1;
      }
      k = 10;
      localStringBuilder.append(k);
      j += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.LuminanceSource
 * JD-Core Version:    0.7.0.1
 */