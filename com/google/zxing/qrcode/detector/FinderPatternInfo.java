package com.google.zxing.qrcode.detector;

public final class FinderPatternInfo
{
  private final FinderPattern bottomLeft;
  private final FinderPattern topLeft;
  private final FinderPattern topRight;
  
  public FinderPatternInfo(FinderPattern[] paramArrayOfFinderPattern)
  {
    FinderPattern localFinderPattern = paramArrayOfFinderPattern[0];
    this.bottomLeft = localFinderPattern;
    localFinderPattern = paramArrayOfFinderPattern[1];
    this.topLeft = localFinderPattern;
    paramArrayOfFinderPattern = paramArrayOfFinderPattern[2];
    this.topRight = paramArrayOfFinderPattern;
  }
  
  public FinderPattern getBottomLeft()
  {
    return this.bottomLeft;
  }
  
  public FinderPattern getTopLeft()
  {
    return this.topLeft;
  }
  
  public FinderPattern getTopRight()
  {
    return this.topRight;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.detector.FinderPatternInfo
 * JD-Core Version:    0.7.0.1
 */