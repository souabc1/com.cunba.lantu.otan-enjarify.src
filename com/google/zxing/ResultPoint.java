package com.google.zxing;

import com.google.zxing.common.detector.MathUtils;

public class ResultPoint
{
  private final float x;
  private final float y;
  
  public ResultPoint(float paramFloat1, float paramFloat2)
  {
    this.x = paramFloat1;
    this.y = paramFloat2;
  }
  
  private static float crossProductZ(ResultPoint paramResultPoint1, ResultPoint paramResultPoint2, ResultPoint paramResultPoint3)
  {
    float f1 = paramResultPoint2.x;
    float f2 = paramResultPoint2.y;
    float f3 = paramResultPoint3.x - f1;
    float f4 = paramResultPoint1.y - f2;
    f3 *= f4;
    float f5 = paramResultPoint3.y - f2;
    float f6 = paramResultPoint1.x - f1;
    f5 *= f6;
    return f3 - f5;
  }
  
  public static float distance(ResultPoint paramResultPoint1, ResultPoint paramResultPoint2)
  {
    float f1 = paramResultPoint1.x;
    float f2 = paramResultPoint1.y;
    float f3 = paramResultPoint2.x;
    float f4 = paramResultPoint2.y;
    return MathUtils.distance(f1, f2, f3, f4);
  }
  
  public static void orderBestPatterns(ResultPoint[] paramArrayOfResultPoint)
  {
    ResultPoint localResultPoint1 = paramArrayOfResultPoint[0];
    int i = 1;
    Object localObject1 = paramArrayOfResultPoint[i];
    float f1 = distance(localResultPoint1, (ResultPoint)localObject1);
    localObject1 = paramArrayOfResultPoint[i];
    int j = 2;
    Object localObject2 = paramArrayOfResultPoint[j];
    float f2 = distance((ResultPoint)localObject1, (ResultPoint)localObject2);
    localObject2 = paramArrayOfResultPoint[0];
    ResultPoint localResultPoint2 = paramArrayOfResultPoint[j];
    float f3 = distance((ResultPoint)localObject2, localResultPoint2);
    boolean bool1 = f2 < f1;
    if (!bool1)
    {
      bool1 = f2 < f3;
      if (!bool1)
      {
        localResultPoint1 = paramArrayOfResultPoint[0];
        localObject1 = paramArrayOfResultPoint[i];
        localObject2 = paramArrayOfResultPoint[j];
        break label154;
      }
    }
    boolean bool2 = f3 < f2;
    if (!bool2)
    {
      boolean bool3 = f3 < f1;
      if (!bool3)
      {
        localResultPoint1 = paramArrayOfResultPoint[i];
        localObject1 = paramArrayOfResultPoint[0];
        localObject2 = paramArrayOfResultPoint[j];
        break label154;
      }
    }
    localResultPoint1 = paramArrayOfResultPoint[j];
    localObject1 = paramArrayOfResultPoint[0];
    localObject2 = paramArrayOfResultPoint[i];
    label154:
    float f4 = crossProductZ((ResultPoint)localObject1, localResultPoint1, (ResultPoint)localObject2);
    bool1 = f4 < 0.0F;
    if (bool1)
    {
      Object localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
    paramArrayOfResultPoint[0] = localObject1;
    paramArrayOfResultPoint[i] = localResultPoint1;
    paramArrayOfResultPoint[j] = localObject2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof ResultPoint;
    boolean bool2 = false;
    if (bool1)
    {
      paramObject = (ResultPoint)paramObject;
      float f1 = this.x;
      float f2 = paramObject.x;
      bool1 = f1 < f2;
      if (!bool1)
      {
        f1 = this.y;
        float f3 = paramObject.y;
        boolean bool3 = f1 < f3;
        if (!bool3) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final float getX()
  {
    return this.x;
  }
  
  public final float getY()
  {
    return this.y;
  }
  
  public final int hashCode()
  {
    int i = Float.floatToIntBits(this.x) * 31;
    int j = Float.floatToIntBits(this.y);
    return i + j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("(");
    float f = this.x;
    localStringBuilder.append(f);
    localStringBuilder.append(',');
    f = this.y;
    localStringBuilder.append(f);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.ResultPoint
 * JD-Core Version:    0.7.0.1
 */