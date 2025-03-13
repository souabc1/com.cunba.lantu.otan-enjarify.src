package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;

public final class FinderPattern
{
  private final ResultPoint[] resultPoints;
  private final int[] startEnd;
  private final int value;
  
  public FinderPattern(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4)
  {
    this.value = paramInt1;
    this.startEnd = paramArrayOfInt;
    ResultPoint[] arrayOfResultPoint = new ResultPoint[2];
    paramArrayOfInt = new com/google/zxing/ResultPoint;
    float f1 = paramInt2;
    float f2 = paramInt4;
    paramArrayOfInt.<init>(f1, f2);
    arrayOfResultPoint[0] = paramArrayOfInt;
    paramArrayOfInt = new com/google/zxing/ResultPoint;
    f1 = paramInt3;
    paramArrayOfInt.<init>(f1, f2);
    arrayOfResultPoint[1] = paramArrayOfInt;
    this.resultPoints = arrayOfResultPoint;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof FinderPattern;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (FinderPattern)paramObject;
    int i = this.value;
    int j = paramObject.value;
    if (i == j) {
      bool2 = true;
    }
    return bool2;
  }
  
  public ResultPoint[] getResultPoints()
  {
    return this.resultPoints;
  }
  
  public int[] getStartEnd()
  {
    return this.startEnd;
  }
  
  public int getValue()
  {
    return this.value;
  }
  
  public int hashCode()
  {
    return this.value;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.rss.FinderPattern
 * JD-Core Version:    0.7.0.1
 */