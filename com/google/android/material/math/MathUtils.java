package com.google.android.material.math;

public final class MathUtils
{
  public static final float DEFAULT_EPSILON = 1.0E-004F;
  
  public static float dist(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat3 -= paramFloat1;
    paramFloat4 -= paramFloat2;
    double d1 = paramFloat3;
    double d2 = paramFloat4;
    return (float)Math.hypot(d1, d2);
  }
  
  public static float distanceToFurthestCorner(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    float f = dist(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    paramFloat4 = dist(paramFloat1, paramFloat2, paramFloat5, paramFloat4);
    paramFloat5 = dist(paramFloat1, paramFloat2, paramFloat5, paramFloat6);
    paramFloat1 = dist(paramFloat1, paramFloat2, paramFloat3, paramFloat6);
    return max(f, paramFloat4, paramFloat5, paramFloat1);
  }
  
  public static float floorMod(float paramFloat, int paramInt)
  {
    float f1 = paramInt;
    float f2 = paramFloat / f1;
    int i = (int)f2;
    float f3 = Math.signum(paramFloat) * f1;
    f1 = 0.0F;
    boolean bool = f3 < 0.0F;
    if (bool)
    {
      f1 = i * paramInt;
      bool = f1 < paramFloat;
      if (bool) {
        i += -1;
      }
    }
    float f4 = i * paramInt;
    return paramFloat - f4;
  }
  
  public static int floorMod(int paramInt1, int paramInt2)
  {
    int i = paramInt1 / paramInt2;
    int j = paramInt1 ^ paramInt2;
    if (j < 0)
    {
      j = i * paramInt2;
      if (j != paramInt1) {
        i += -1;
      }
    }
    i *= paramInt2;
    return paramInt1 - i;
  }
  
  public static boolean geq(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramFloat1 += paramFloat3;
    boolean bool = paramFloat1 < paramFloat2;
    if (!bool)
    {
      bool = true;
      paramFloat1 = 1.4E-45F;
    }
    else
    {
      bool = false;
      paramFloat1 = 0.0F;
    }
    return bool;
  }
  
  public static float lerp(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f = (1.0F - paramFloat3) * paramFloat1;
    paramFloat3 *= paramFloat2;
    return f + paramFloat3;
  }
  
  private static float max(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    boolean bool1 = paramFloat1 < paramFloat2;
    if (bool1)
    {
      bool1 = paramFloat1 < paramFloat3;
      if (bool1)
      {
        bool1 = paramFloat1 < paramFloat4;
        if (bool1) {
          return paramFloat1;
        }
      }
    }
    boolean bool2 = paramFloat2 < paramFloat3;
    if (bool2)
    {
      bool2 = paramFloat2 < paramFloat4;
      if (bool2)
      {
        paramFloat1 = paramFloat2;
        return paramFloat1;
      }
    }
    bool2 = paramFloat3 < paramFloat4;
    if (bool2) {
      paramFloat1 = paramFloat3;
    } else {
      paramFloat1 = paramFloat4;
    }
    return paramFloat1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.math.MathUtils
 * JD-Core Version:    0.7.0.1
 */