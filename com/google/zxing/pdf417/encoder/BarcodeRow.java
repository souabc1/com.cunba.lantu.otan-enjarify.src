package com.google.zxing.pdf417.encoder;

final class BarcodeRow
{
  private int currentLocation;
  private final byte[] row;
  
  public BarcodeRow(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    this.row = arrayOfByte;
    this.currentLocation = 0;
  }
  
  private void set(int paramInt, boolean paramBoolean)
  {
    byte[] arrayOfByte = this.row;
    paramBoolean = (byte)paramBoolean;
    arrayOfByte[paramInt] = paramBoolean;
  }
  
  public void addBar(boolean paramBoolean, int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      int j = this.currentLocation;
      int k = j + 1;
      this.currentLocation = k;
      set(j, paramBoolean);
      i += 1;
    }
  }
  
  public byte[] getScaledRow(int paramInt)
  {
    byte[] arrayOfByte1 = this.row;
    int i = arrayOfByte1.length * paramInt;
    byte[] arrayOfByte2 = new byte[i];
    int j = 0;
    while (j < i)
    {
      byte[] arrayOfByte3 = this.row;
      int k = j / paramInt;
      int m = arrayOfByte3[k];
      arrayOfByte2[j] = m;
      j += 1;
    }
    return arrayOfByte2;
  }
  
  public void set(int paramInt, byte paramByte)
  {
    this.row[paramInt] = paramByte;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.encoder.BarcodeRow
 * JD-Core Version:    0.7.0.1
 */