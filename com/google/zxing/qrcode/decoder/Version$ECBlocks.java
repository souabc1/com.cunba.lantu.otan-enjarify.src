package com.google.zxing.qrcode.decoder;

public final class Version$ECBlocks
{
  private final Version.ECB[] ecBlocks;
  private final int ecCodewordsPerBlock;
  
  public Version$ECBlocks(int paramInt, Version.ECB... paramVarArgs)
  {
    this.ecCodewordsPerBlock = paramInt;
    this.ecBlocks = paramVarArgs;
  }
  
  public Version.ECB[] getECBlocks()
  {
    return this.ecBlocks;
  }
  
  public int getECCodewordsPerBlock()
  {
    return this.ecCodewordsPerBlock;
  }
  
  public int getNumBlocks()
  {
    Version.ECB[] arrayOfECB = this.ecBlocks;
    int i = arrayOfECB.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Version.ECB localECB = arrayOfECB[j];
      int m = localECB.getCount();
      k += m;
      j += 1;
    }
    return k;
  }
  
  public int getTotalECCodewords()
  {
    int i = this.ecCodewordsPerBlock;
    int j = getNumBlocks();
    return i * j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.Version.ECBlocks
 * JD-Core Version:    0.7.0.1
 */