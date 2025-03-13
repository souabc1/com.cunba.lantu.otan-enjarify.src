package com.google.zxing.pdf417.detector;

import com.google.zxing.common.BitMatrix;
import java.util.List;

public final class PDF417DetectorResult
{
  private final BitMatrix bits;
  private final List points;
  private final int rotation;
  
  public PDF417DetectorResult(BitMatrix paramBitMatrix, List paramList)
  {
    this(paramBitMatrix, paramList, 0);
  }
  
  public PDF417DetectorResult(BitMatrix paramBitMatrix, List paramList, int paramInt)
  {
    this.bits = paramBitMatrix;
    this.points = paramList;
    this.rotation = paramInt;
  }
  
  public BitMatrix getBits()
  {
    return this.bits;
  }
  
  public List getPoints()
  {
    return this.points;
  }
  
  public int getRotation()
  {
    return this.rotation;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.detector.PDF417DetectorResult
 * JD-Core Version:    0.7.0.1
 */