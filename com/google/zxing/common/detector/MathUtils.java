package com.google.zxing.common.detector;

public final class MathUtils
{
  public static float distance(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    double d1 = paramFloat1 - paramFloat3;
    double d2 = paramFloat2 - paramFloat4;
    d1 *= d1;
    d2 *= d2;
    return (float)Math.sqrt(d1 + d2);
  }
  
  public static float distance(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    double d1 = paramInt1 - paramInt3;
    double d2 = paramInt2 - paramInt4;
    d1 *= d1;
    d2 *= d2;
    return (float)Math.sqrt(d1 + d2);
  }
  
  public static int round(float paramFloat)
  {
    float f = 0.0F;
    boolean bool = paramFloat < 0.0F;
    int i;
    if (bool)
    {
      i = -1090519040;
      f = -0.5F;
    }
    else
    {
      i = 1056964608;
      f = 0.5F;
    }
    return (int)(paramFloat + f);
  }
  
  public static int sum(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      int m = paramArrayOfInt[j];
      k += m;
      j += 1;
    }
    return k;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.detector.MathUtils
 * JD-Core Version:    0.7.0.1
 */