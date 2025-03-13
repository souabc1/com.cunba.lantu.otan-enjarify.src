package com.google.android.material.color.utilities;

public final class ViewingConditions
{
  public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0D);
  private final double aw;
  private final double c;
  private final double fl;
  private final double flRoot;
  private final double n;
  private final double nbb;
  private final double nc;
  private final double ncb;
  private final double[] rgbD;
  private final double z;
  
  private ViewingConditions(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double[] paramArrayOfDouble, double paramDouble7, double paramDouble8, double paramDouble9)
  {
    this.n = paramDouble1;
    this.aw = paramDouble2;
    this.nbb = paramDouble3;
    this.ncb = paramDouble4;
    this.c = paramDouble5;
    this.nc = paramDouble6;
    this.rgbD = paramArrayOfDouble;
    this.fl = paramDouble7;
    this.flRoot = paramDouble8;
    this.z = paramDouble9;
  }
  
  public static ViewingConditions defaultWithBackgroundLstar(double paramDouble)
  {
    double[] arrayOfDouble = ColorUtils.whitePointD65();
    double d = ColorUtils.yFromLstar(50.0D) * 63.661977236758133D / 100.0D;
    return make(arrayOfDouble, d, paramDouble, 2.0D, false);
  }
  
  public static ViewingConditions make(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean)
  {
    double d1 = paramDouble1;
    double d2 = 0.1D;
    double d3 = paramDouble2;
    d3 = Math.max(d2, paramDouble2);
    Object localObject1 = Cam16.XYZ_TO_CAM16RGB;
    double d4 = paramArrayOfDouble[0];
    double[] arrayOfDouble = localObject1[0];
    double d5 = arrayOfDouble[0] * d4;
    int i = 1;
    double d6 = paramArrayOfDouble[i];
    double d7 = arrayOfDouble[i] * d6;
    d5 += d7;
    int j = 2;
    double d8 = paramArrayOfDouble[j];
    double d9 = arrayOfDouble[j] * d8;
    d5 += d9;
    arrayOfDouble = localObject1[i];
    d9 = arrayOfDouble[0] * d4;
    double d10 = arrayOfDouble[i] * d6;
    d9 += d10;
    d10 = arrayOfDouble[j] * d8;
    d9 += d10;
    localObject1 = localObject1[j];
    d10 = localObject1[0];
    d4 *= d10;
    d10 = localObject1[i];
    d6 *= d10;
    d4 += d6;
    d6 = localObject1[j];
    d8 *= d6;
    d4 += d8;
    d6 = 10.0D;
    d8 = paramDouble3 / d6;
    d10 = 0.8D;
    double d11 = d8 + d10;
    d8 = 0.9D;
    boolean bool = d11 < d8;
    if (!bool)
    {
      d12 = 0.59D;
      d13 = 0.69D;
      d8 = d11 - d8;
      double d14 = d8 * d6;
      d6 = MathUtils.lerp(d12, d13, d14);
    }
    else
    {
      d8 = 0.525D;
      d12 = 0.59D;
      d13 = (d11 - d10) * d6;
      d10 = d8;
      d6 = MathUtils.lerp(d8, d12, d13);
    }
    double d15 = d6;
    d6 = 1.0D;
    if (paramBoolean)
    {
      d13 = d6;
    }
    else
    {
      d2 = Math.exp((-d1 - 42.0D) / 92.0D);
      d10 = 0.2777777777777778D;
      d2 *= d10;
      d2 = (d6 - d2) * d11;
      d13 = d2;
    }
    d2 = MathUtils.clampDouble(0.0D, 1.0D, d13);
    int k = 3;
    arrayOfDouble = new double[k];
    d10 = 100.0D;
    double d12 = d10 / d5 * d2 + d6 - d2;
    arrayOfDouble[0] = d12;
    d12 = d10 / d9 * d2 + d6 - d2;
    arrayOfDouble[i] = d12;
    d12 = d10 / d4 * d2 + d6 - d2;
    arrayOfDouble[j] = d12;
    d2 = 5.0D * d1;
    d12 = d2 + d6;
    d12 = d6 / d12;
    double d13 = d12 * d12 * d12 * d12;
    d6 -= d13;
    d13 *= d1;
    d1 = 0.1D * d6 * d6;
    d2 = Math.cbrt(d2);
    d1 *= d2;
    d1 = d13 + d1;
    d2 = ColorUtils.yFromLstar(d3);
    d3 = paramArrayOfDouble[i];
    d2 /= d3;
    double d16 = d2;
    double d17 = Math.sqrt(d2) + 1.48D;
    d2 = Math.pow(d2, 0.2D);
    d3 = 0.725D / d2;
    Object localObject2 = new double[k];
    d6 = arrayOfDouble[0] * d1 * d5 / d10;
    d5 = 0.42D;
    d6 = Math.pow(d6, d5);
    localObject2[0] = d6;
    d6 = Math.pow(arrayOfDouble[i] * d1 * d9 / d10, d5);
    localObject2[i] = d6;
    d4 = Math.pow(arrayOfDouble[j] * d1 * d4 / d10, d5);
    localObject2[j] = d4;
    double d18 = localObject2[0];
    double d19 = 400.0D;
    d6 = d18 * d19;
    d7 = 27.129999999999999D;
    d18 += d7;
    d6 /= d18;
    d2 = localObject2[i];
    d18 = d2 * d19;
    d2 += d7;
    d18 /= d2;
    d19 *= d4;
    d4 += d7;
    d19 /= d4;
    d6 = d6 * 2.0D + d18;
    d19 *= 0.05D;
    double d20 = (d6 + d19) * d3;
    localObject2 = new com/google/android/material/color/utilities/ViewingConditions;
    double d21 = Math.pow(d1, 0.25D);
    ((ViewingConditions)localObject2).<init>(d16, d20, d3, d3, d15, d11, arrayOfDouble, d1, d21, d17);
    return localObject2;
  }
  
  public double getAw()
  {
    return this.aw;
  }
  
  public double getC()
  {
    return this.c;
  }
  
  public double getFl()
  {
    return this.fl;
  }
  
  public double getFlRoot()
  {
    return this.flRoot;
  }
  
  public double getN()
  {
    return this.n;
  }
  
  public double getNbb()
  {
    return this.nbb;
  }
  
  public double getNc()
  {
    return this.nc;
  }
  
  public double getNcb()
  {
    return this.ncb;
  }
  
  public double[] getRgbD()
  {
    return this.rgbD;
  }
  
  public double getZ()
  {
    return this.z;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.ViewingConditions
 * JD-Core Version:    0.7.0.1
 */