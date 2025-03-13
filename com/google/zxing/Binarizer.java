package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

public abstract class Binarizer
{
  private final LuminanceSource source;
  
  public Binarizer(LuminanceSource paramLuminanceSource)
  {
    this.source = paramLuminanceSource;
  }
  
  public abstract Binarizer createBinarizer(LuminanceSource paramLuminanceSource);
  
  public abstract BitMatrix getBlackMatrix();
  
  public abstract BitArray getBlackRow(int paramInt, BitArray paramBitArray);
  
  public final int getHeight()
  {
    return this.source.getHeight();
  }
  
  public final LuminanceSource getLuminanceSource()
  {
    return this.source;
  }
  
  public final int getWidth()
  {
    return this.source.getWidth();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.Binarizer
 * JD-Core Version:    0.7.0.1
 */