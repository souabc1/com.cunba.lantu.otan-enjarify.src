package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class ByteMatrix
{
  private final byte[][] bytes;
  private final int height;
  private final int width;
  
  public ByteMatrix(int paramInt1, int paramInt2)
  {
    Object localObject = { paramInt2, paramInt1 };
    localObject = (byte[][])Array.newInstance(Byte.TYPE, (int[])localObject);
    this.bytes = ((byte[][])localObject);
    this.width = paramInt1;
    this.height = paramInt2;
  }
  
  public void clear(byte paramByte)
  {
    byte[][] arrayOfByte = this.bytes;
    int i = arrayOfByte.length;
    int j = 0;
    while (j < i)
    {
      byte[] arrayOfByte1 = arrayOfByte[j];
      Arrays.fill(arrayOfByte1, paramByte);
      j += 1;
    }
  }
  
  public byte get(int paramInt1, int paramInt2)
  {
    return this.bytes[paramInt2][paramInt1];
  }
  
  public byte[][] getArray()
  {
    return this.bytes;
  }
  
  public int getHeight()
  {
    return this.height;
  }
  
  public int getWidth()
  {
    return this.width;
  }
  
  public void set(int paramInt1, int paramInt2, byte paramByte)
  {
    this.bytes[paramInt2][paramInt1] = paramByte;
  }
  
  public void set(int paramInt1, int paramInt2, int paramInt3)
  {
    byte[] arrayOfByte = this.bytes[paramInt2];
    paramInt3 = (byte)paramInt3;
    arrayOfByte[paramInt1] = paramInt3;
  }
  
  public void set(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    byte[] arrayOfByte = this.bytes[paramInt2];
    paramBoolean = (byte)paramBoolean;
    arrayOfByte[paramInt1] = paramBoolean;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = this.width * 2;
    int j = this.height;
    i = i * j + 2;
    localStringBuilder.<init>(i);
    i = 0;
    j = 0;
    for (;;)
    {
      int k = this.height;
      if (j >= k) {
        break;
      }
      byte[] arrayOfByte = this.bytes[j];
      int m = 0;
      for (;;)
      {
        int n = this.width;
        if (m >= n) {
          break;
        }
        n = arrayOfByte[m];
        String str;
        if (n != 0)
        {
          int i1 = 1;
          if (n != i1) {
            str = "  ";
          } else {
            str = " 1";
          }
        }
        else
        {
          str = " 0";
        }
        localStringBuilder.append(str);
        m += 1;
      }
      k = 10;
      localStringBuilder.append(k);
      j += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.encoder.ByteMatrix
 * JD-Core Version:    0.7.0.1
 */