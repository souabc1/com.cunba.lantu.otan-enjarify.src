package com.google.zxing.common;

import com.google.zxing.ResultPoint;

public class DetectorResult
{
  private final BitMatrix bits;
  private final ResultPoint[] points;
  
  public DetectorResult(BitMatrix paramBitMatrix, ResultPoint[] paramArrayOfResultPoint)
  {
    this.bits = paramBitMatrix;
    this.points = paramArrayOfResultPoint;
  }
  
  public final BitMatrix getBits()
  {
    return this.bits;
  }
  
  public final ResultPoint[] getPoints()
  {
    return this.points;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.DetectorResult
 * JD-Core Version:    0.7.0.1
 */