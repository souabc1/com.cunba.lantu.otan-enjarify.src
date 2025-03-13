package com.google.android.material.color.utilities;

public final class Contrast
{
  private static final double CONTRAST_RATIO_EPSILON = 0.04D;
  private static final double LUMINANCE_GAMUT_MAP_TOLERANCE = 0.4D;
  public static final double RATIO_30 = 3.0D;
  public static final double RATIO_45 = 4.5D;
  public static final double RATIO_70 = 7.0D;
  public static final double RATIO_MAX = 21.0D;
  public static final double RATIO_MIN = 1.0D;
  
  public static double darker(double paramDouble1, double paramDouble2)
  {
    double d1 = 0.0D;
    boolean bool1 = paramDouble1 < d1;
    double d2 = -1.0D;
    if (!bool1)
    {
      double d3 = 100.0D;
      bool1 = paramDouble1 < d3;
      if (!bool1)
      {
        paramDouble1 = ColorUtils.yFromLstar(paramDouble1);
        double d4 = 5.0D;
        double d5 = (paramDouble1 + d4) / paramDouble2 - d4;
        bool1 = d5 < d1;
        if (!bool1)
        {
          bool1 = d5 < d3;
          if (!bool1)
          {
            paramDouble1 = ratioOfYs(paramDouble1, d5);
            d4 = Math.abs(paramDouble1 - paramDouble2);
            boolean bool2 = paramDouble1 < paramDouble2;
            if (bool2)
            {
              paramDouble1 = 0.04D;
              bool2 = d4 < paramDouble1;
              if (bool2) {
                return d2;
              }
            }
            paramDouble1 = ColorUtils.lstarFromY(d5);
            paramDouble2 = 0.4D;
            paramDouble1 -= paramDouble2;
            boolean bool3 = paramDouble1 < d1;
            if (!bool3)
            {
              bool3 = paramDouble1 < d3;
              if (!bool3) {
                return paramDouble1;
              }
            }
          }
        }
      }
    }
    return d2;
  }
  
  public static double darkerUnsafe(double paramDouble1, double paramDouble2)
  {
    paramDouble1 = darker(paramDouble1, paramDouble2);
    return Math.max(0.0D, paramDouble1);
  }
  
  public static double lighter(double paramDouble1, double paramDouble2)
  {
    double d1 = 0.0D;
    boolean bool1 = paramDouble1 < d1;
    double d2 = -1.0D;
    if (!bool1)
    {
      double d3 = 100.0D;
      bool1 = paramDouble1 < d3;
      if (!bool1)
      {
        paramDouble1 = ColorUtils.yFromLstar(paramDouble1);
        double d4 = 5.0D;
        double d5 = (paramDouble1 + d4) * paramDouble2 - d4;
        bool1 = d5 < d1;
        if (!bool1)
        {
          bool1 = d5 < d3;
          if (!bool1)
          {
            paramDouble1 = ratioOfYs(d5, paramDouble1);
            d4 = Math.abs(paramDouble1 - paramDouble2);
            boolean bool2 = paramDouble1 < paramDouble2;
            if (bool2)
            {
              paramDouble1 = 0.04D;
              bool2 = d4 < paramDouble1;
              if (bool2) {
                return d2;
              }
            }
            paramDouble1 = ColorUtils.lstarFromY(d5);
            paramDouble2 = 0.4D;
            paramDouble1 += paramDouble2;
            boolean bool3 = paramDouble1 < d1;
            if (!bool3)
            {
              bool3 = paramDouble1 < d3;
              if (!bool3) {
                return paramDouble1;
              }
            }
          }
        }
      }
    }
    return d2;
  }
  
  public static double lighterUnsafe(double paramDouble1, double paramDouble2)
  {
    paramDouble1 = lighter(paramDouble1, paramDouble2);
    paramDouble2 = 0.0D;
    boolean bool = paramDouble1 < paramDouble2;
    if (bool) {
      paramDouble1 = 100.0D;
    }
    return paramDouble1;
  }
  
  public static double ratioOfTones(double paramDouble1, double paramDouble2)
  {
    paramDouble1 = ColorUtils.yFromLstar(paramDouble1);
    paramDouble2 = ColorUtils.yFromLstar(paramDouble2);
    return ratioOfYs(paramDouble1, paramDouble2);
  }
  
  public static double ratioOfYs(double paramDouble1, double paramDouble2)
  {
    double d = Math.max(paramDouble1, paramDouble2);
    boolean bool = d < paramDouble2;
    if (bool) {
      paramDouble1 = paramDouble2;
    }
    paramDouble2 = 5.0D;
    d += paramDouble2;
    paramDouble1 += paramDouble2;
    return d / paramDouble1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.Contrast
 * JD-Core Version:    0.7.0.1
 */