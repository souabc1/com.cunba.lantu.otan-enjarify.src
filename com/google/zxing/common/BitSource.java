package com.google.zxing.common;

public final class BitSource
{
  private int bitOffset;
  private int byteOffset;
  private final byte[] bytes;
  
  public BitSource(byte[] paramArrayOfByte)
  {
    this.bytes = paramArrayOfByte;
  }
  
  public int available()
  {
    int i = this.bytes.length;
    int j = this.byteOffset;
    i = (i - j) * 8;
    j = this.bitOffset;
    return i - j;
  }
  
  public int getBitOffset()
  {
    return this.bitOffset;
  }
  
  public int getByteOffset()
  {
    return this.byteOffset;
  }
  
  public int readBits(int paramInt)
  {
    int i = 1;
    if (paramInt >= i)
    {
      int j = 32;
      if (paramInt <= j)
      {
        j = available();
        if (paramInt <= j)
        {
          j = this.bitOffset;
          int k = 0;
          byte[] arrayOfByte1 = null;
          int m = 255;
          int n = 8;
          int i1;
          if (j > 0)
          {
            j = 8 - j;
            i1 = Math.min(paramInt, j);
            j -= i1;
            int i2 = 8 - i1;
            i2 = m >> i2 << j;
            byte[] arrayOfByte2 = this.bytes;
            int i3 = this.byteOffset;
            int i4 = arrayOfByte2[i3];
            j = (i2 & i4) >> j;
            paramInt -= i1;
            i2 = this.bitOffset + i1;
            this.bitOffset = i2;
            if (i2 == n)
            {
              this.bitOffset = 0;
              i3 += i;
              this.byteOffset = i3;
            }
            k = j;
          }
          if (paramInt > 0)
          {
            while (paramInt >= n)
            {
              j = k << 8;
              arrayOfByte1 = this.bytes;
              i1 = this.byteOffset;
              k = arrayOfByte1[i1] & m | j;
              i1 += i;
              this.byteOffset = i1;
              paramInt += -8;
            }
            if (paramInt > 0)
            {
              i = 8 - paramInt;
              j = m >> i << i;
              k <<= paramInt;
              byte[] arrayOfByte3 = this.bytes;
              n = this.byteOffset;
              m = arrayOfByte3[n];
              j &= m;
              i = j >> i;
              k |= i;
              i = this.bitOffset + paramInt;
              this.bitOffset = i;
            }
          }
          return k;
        }
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    String str = String.valueOf(paramInt);
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.BitSource
 * JD-Core Version:    0.7.0.1
 */