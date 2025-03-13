package com.google.zxing.datamatrix.decoder;

final class Version$ECBlocks
{
  private final Version.ECB[] ecBlocks;
  private final int ecCodewords;
  
  private Version$ECBlocks(int paramInt, Version.ECB paramECB)
  {
    this.ecCodewords = paramInt;
    Version.ECB[] arrayOfECB = { paramECB };
    this.ecBlocks = arrayOfECB;
  }
  
  private Version$ECBlocks(int paramInt, Version.ECB paramECB1, Version.ECB paramECB2)
  {
    this.ecCodewords = paramInt;
    Version.ECB[] arrayOfECB = { paramECB1, paramECB2 };
    this.ecBlocks = arrayOfECB;
  }
  
  public Version.ECB[] getECBlocks()
  {
    return this.ecBlocks;
  }
  
  public int getECCodewords()
  {
    return this.ecCodewords;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.decoder.Version.ECBlocks
 * JD-Core Version:    0.7.0.1
 */