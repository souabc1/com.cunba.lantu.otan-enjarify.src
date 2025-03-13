package com.google.zxing.aztec.detector;

import com.google.zxing.ResultPoint;

final class Detector$Point
{
  private final int x;
  private final int y;
  
  public Detector$Point(int paramInt1, int paramInt2)
  {
    this.x = paramInt1;
    this.y = paramInt2;
  }
  
  public int getX()
  {
    return this.x;
  }
  
  public int getY()
  {
    return this.y;
  }
  
  public ResultPoint toResultPoint()
  {
    ResultPoint localResultPoint = new com/google/zxing/ResultPoint;
    float f1 = this.x;
    float f2 = this.y;
    localResultPoint.<init>(f1, f2);
    return localResultPoint;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("<");
    int i = this.x;
    localStringBuilder.append(i);
    localStringBuilder.append(' ');
    i = this.y;
    localStringBuilder.append(i);
    localStringBuilder.append('>');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.aztec.detector.Detector.Point
 * JD-Core Version:    0.7.0.1
 */