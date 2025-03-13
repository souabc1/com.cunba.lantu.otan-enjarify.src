package com.google.android.material.color.utilities;

public final class Cam16
{
  static final double[][] CAM16RGB_TO_XYZ;
  static final double[][] XYZ_TO_CAM16RGB;
  private final double astar;
  private final double bstar;
  private final double chroma;
  private final double hue;
  private final double j;
  private final double jstar;
  private final double m;
  private final double q;
  private final double s;
  private final double[] tempArray;
  
  static
  {
    int i = 3;
    double[][] arrayOfDouble = new double[i][];
    double[] arrayOfDouble1 = new double[i];
    double[] tmp12_11 = arrayOfDouble1;
    tmp12_11[0] = 0.401288D;
    double[] tmp18_12 = tmp12_11;
    tmp18_12[1] = 0.650173D;
    tmp18_12[2] = -0.051461D;
    arrayOfDouble[0] = arrayOfDouble1;
    arrayOfDouble1 = new double[i];
    double[] tmp38_37 = arrayOfDouble1;
    tmp38_37[0] = -0.250268D;
    double[] tmp44_38 = tmp38_37;
    tmp44_38[1] = 1.204414D;
    tmp44_38[2] = 0.045854D;
    int k = 1;
    arrayOfDouble[k] = arrayOfDouble1;
    arrayOfDouble1 = new double[i];
    double[] tmp66_65 = arrayOfDouble1;
    tmp66_65[0] = -0.002079D;
    double[] tmp72_66 = tmp66_65;
    tmp72_66[1] = 0.048952D;
    tmp72_66[2] = 0.953127D;
    int n = 2;
    arrayOfDouble[n] = arrayOfDouble1;
    XYZ_TO_CAM16RGB = arrayOfDouble;
    arrayOfDouble = new double[i][];
    arrayOfDouble1 = new double[i];
    double[] tmp105_104 = arrayOfDouble1;
    tmp105_104[0] = 1.8620678D;
    double[] tmp111_105 = tmp105_104;
    tmp111_105[1] = -1.0112547D;
    tmp111_105[2] = 0.14918678D;
    arrayOfDouble[0] = arrayOfDouble1;
    arrayOfDouble1 = new double[i];
    double[] tmp131_130 = arrayOfDouble1;
    tmp131_130[0] = 0.38752654D;
    double[] tmp137_131 = tmp131_130;
    tmp137_131[1] = 0.62144744D;
    tmp137_131[2] = -0.00897398D;
    arrayOfDouble[k] = arrayOfDouble1;
    double[] arrayOfDouble2 = new double[i];
    double[] tmp159_157 = arrayOfDouble2;
    tmp159_157[0] = -0.0158415D;
    double[] tmp165_159 = tmp159_157;
    tmp165_159[1] = -0.03412294D;
    tmp165_159[2] = 1.0499644D;
    arrayOfDouble[n] = arrayOfDouble2;
    CAM16RGB_TO_XYZ = arrayOfDouble;
  }
  
  private Cam16(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9)
  {
    double[] arrayOfDouble = new double[3];
    double[] tmp11_9 = arrayOfDouble;
    tmp11_9[0] = 0.0D;
    double[] tmp15_11 = tmp11_9;
    tmp15_11[1] = 0.0D;
    tmp15_11[2] = 0.0D;
    this.tempArray = arrayOfDouble;
    this.hue = paramDouble1;
    this.chroma = paramDouble2;
    this.j = paramDouble3;
    this.q = paramDouble4;
    this.m = paramDouble5;
    this.s = tmp11_9;
    this.jstar = paramDouble7;
    this.astar = paramDouble8;
    this.bstar = paramDouble9;
  }
  
  public static Cam16 fromInt(int paramInt)
  {
    ViewingConditions localViewingConditions = ViewingConditions.DEFAULT;
    return fromIntInViewingConditions(paramInt, localViewingConditions);
  }
  
  public static Cam16 fromIntInViewingConditions(int paramInt, ViewingConditions paramViewingConditions)
  {
    int i = paramInt;
    int k = (0xFF0000 & paramInt) >> 16;
    int n = (0xFF00 & paramInt) >> 8;
    i = paramInt & 0xFF;
    double d1 = ColorUtils.linearized(k);
    double d2 = ColorUtils.linearized(n);
    double d3 = ColorUtils.linearized(i);
    double d4 = 0.41233895D * d1;
    double d5 = 0.35762064D * d2;
    d4 += d5;
    d5 = 0.18051042D * d3;
    double d6 = d4 + d5;
    d4 = 0.2126D * d1;
    d5 = 0.7152D * d2;
    d4 += d5;
    d5 = 0.0722D * d3;
    double d7 = d4 + d5;
    d1 *= 0.01932141D;
    d2 *= 0.11916382D;
    d1 += d2;
    d3 *= 0.95034478D;
    double d8 = d1 + d3;
    return fromXyzInViewingConditions(d6, d7, d8, paramViewingConditions);
  }
  
  public static Cam16 fromJch(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    ViewingConditions localViewingConditions = ViewingConditions.DEFAULT;
    return fromJchInViewingConditions(paramDouble1, paramDouble2, paramDouble3, localViewingConditions);
  }
  
  private static Cam16 fromJchInViewingConditions(double paramDouble1, double paramDouble2, double paramDouble3, ViewingConditions paramViewingConditions)
  {
    double d1 = paramViewingConditions.getC();
    double d2 = 4.0D;
    d1 = d2 / d1;
    double d3 = paramDouble1 / 100.0D;
    double d4 = Math.sqrt(d3);
    d1 *= d4;
    d4 = paramViewingConditions.getAw() + d2;
    d1 *= d4;
    d4 = paramViewingConditions.getFlRoot();
    d1 *= d4;
    d4 = paramViewingConditions.getFlRoot();
    double d5 = paramDouble2 * d4;
    d4 = d5;
    d3 = Math.sqrt(d3);
    d3 = paramDouble2 / d3;
    double d6 = paramViewingConditions.getC();
    d3 *= d6;
    d6 = paramViewingConditions.getAw() + d2;
    d2 = Math.sqrt(d3 / d6) * 50.0D;
    d6 = Math.toRadians(paramDouble3);
    d3 = 1.7D * paramDouble1;
    double d7 = 0.007D * paramDouble1 + 1.0D;
    d3 /= d7;
    d5 = Math.log1p(d5 * 0.0228D);
    d7 = 43.859649122807014D * d5;
    d5 = Math.cos(d6) * d7;
    d6 = Math.sin(d6) * d7;
    Cam16 localCam16 = new com/google/android/material/color/utilities/Cam16;
    localCam16.<init>(paramDouble3, paramDouble2, paramDouble1, d1, d4, d2, d3, d5, d6);
    return localCam16;
  }
  
  public static Cam16 fromUcs(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    ViewingConditions localViewingConditions = ViewingConditions.DEFAULT;
    return fromUcsInViewingConditions(paramDouble1, paramDouble2, paramDouble3, localViewingConditions);
  }
  
  public static Cam16 fromUcsInViewingConditions(double paramDouble1, double paramDouble2, double paramDouble3, ViewingConditions paramViewingConditions)
  {
    double d1 = Math.hypot(paramDouble2, paramDouble3);
    double d2 = 0.0228D;
    d1 = Math.expm1(d1 * d2) / d2;
    d2 = paramViewingConditions.getFlRoot();
    double d3 = d1 / d2;
    d1 = paramDouble2;
    d2 = paramDouble3;
    d1 = Math.atan2(paramDouble3, paramDouble2) * 57.295779513082323D;
    d2 = 0.0D;
    boolean bool = d1 < d2;
    if (bool)
    {
      d2 = 360.0D;
      d1 += d2;
    }
    double d4 = d1;
    d1 = (paramDouble1 - 100.0D) * 0.007D;
    d2 = 1.0D - d1;
    return fromJchInViewingConditions(paramDouble1 / d2, d3, d4, paramViewingConditions);
  }
  
  public static Cam16 fromXyzInViewingConditions(double paramDouble1, double paramDouble2, double paramDouble3, ViewingConditions paramViewingConditions)
  {
    Object localObject = XYZ_TO_CAM16RGB;
    double[] arrayOfDouble1 = localObject[0];
    double d1 = arrayOfDouble1[0] * paramDouble1;
    int i = 1;
    double d2 = arrayOfDouble1[i] * paramDouble2;
    d1 += d2;
    int k = 2;
    double d3 = arrayOfDouble1[k] * paramDouble3;
    d1 += d3;
    arrayOfDouble1 = localObject[i];
    d3 = arrayOfDouble1[0] * paramDouble1;
    double d4 = arrayOfDouble1[i] * paramDouble2;
    d3 += d4;
    d4 = arrayOfDouble1[k] * paramDouble3;
    d3 += d4;
    localObject = localObject[k];
    d4 = localObject[0] * paramDouble1;
    double d5 = localObject[i] * paramDouble2;
    d4 += d5;
    d5 = localObject[k] * paramDouble3;
    d4 += d5;
    localObject = paramViewingConditions.getRgbD();
    double d6 = localObject[0] * d1;
    arrayOfDouble1 = paramViewingConditions.getRgbD();
    double d7 = arrayOfDouble1[i] * d3;
    double[] arrayOfDouble2 = paramViewingConditions.getRgbD();
    double d8 = arrayOfDouble2[k] * d4;
    d2 = paramViewingConditions.getFl();
    double d9 = Math.abs(d6);
    d2 *= d9;
    d9 = 100.0D;
    d2 /= d9;
    double d10 = 0.42D;
    d2 = Math.pow(d2, d10);
    double d11 = paramViewingConditions.getFl();
    double d12 = Math.abs(d7);
    d11 = Math.pow(d11 * d12 / d9, d10);
    d12 = paramViewingConditions.getFl();
    double d13 = Math.abs(d8);
    d10 = Math.pow(d12 * d13 / d9, d10);
    d6 = Math.signum(d6);
    d12 = 400.0D;
    d6 = d6 * d12 * d2;
    d13 = 27.129999999999999D;
    d2 += d13;
    d6 /= d2;
    d7 = Math.signum(d7) * d12 * d11;
    d11 += d13;
    d7 /= d11;
    d8 = Math.signum(d8) * d12 * d10;
    d10 += d13;
    d8 /= d10;
    d2 = 11.0D;
    d10 = d6 * d2;
    d11 = -12.0D * d7;
    d10 = (d10 + d11 + d8) / d2;
    d2 = d6 + d7;
    d11 = 2.0D;
    d12 = d8 * d11;
    d2 = (d2 - d12) / 9.0D;
    d12 = 20.0D;
    d13 = d6 * d12;
    d7 *= d12;
    d13 += d7;
    double d14 = 21.0D * d8;
    d13 = (d13 + d14) / d12;
    d14 = 40.0D;
    d6 = (d6 * d14 + d7 + d8) / d12;
    d7 = Math.toDegrees(Math.atan2(d2, d10));
    d8 = 0.0D;
    boolean bool1 = d7 < d8;
    d12 = 360.0D;
    if (bool1) {
      d7 += d12;
    }
    double d15;
    for (;;)
    {
      d15 = d7;
      break;
      bool1 = d7 < d12;
      if (!bool1) {
        d7 -= d12;
      }
    }
    d7 = Math.toRadians(d7);
    d8 = paramViewingConditions.getNbb();
    d6 *= d8;
    d8 = paramViewingConditions.getAw();
    d6 /= d8;
    d8 = paramViewingConditions.getC();
    double d16 = paramViewingConditions.getZ();
    d8 *= d16;
    double d17 = Math.pow(d6, d8) * d9;
    d6 = paramViewingConditions.getC();
    d8 = 4.0D;
    d6 = d8 / d6;
    d9 = d17 / d9;
    d16 = Math.sqrt(d9);
    d6 *= d16;
    d16 = paramViewingConditions.getAw() + d8;
    d6 *= d16;
    d16 = paramViewingConditions.getFlRoot();
    double d18 = d6 * d16;
    d6 = 20.140000000000001D;
    boolean bool2 = d15 < d6;
    if (bool2) {
      d12 = d15 + d12;
    } else {
      d12 = d15;
    }
    d6 = (Math.cos(Math.toRadians(d12) + d11) + 3.8D) * 0.25D * 3846.1538461538462D;
    d11 = paramViewingConditions.getNc();
    d6 *= d11;
    d11 = paramViewingConditions.getNcb();
    d6 *= d11;
    d2 = Math.hypot(d10, d2);
    d6 *= d2;
    d13 += 0.305D;
    d6 /= d13;
    d10 = paramViewingConditions.getN();
    d2 = Math.pow(0.29D, d10);
    d2 = Math.pow(1.64D - d2, 0.73D);
    d6 = Math.pow(d6, 0.9D);
    d2 *= d6;
    d6 = Math.sqrt(d9) * d2;
    d16 = d6;
    d9 = paramViewingConditions.getFlRoot();
    d6 *= d9;
    double d19 = d6;
    d9 = paramViewingConditions.getC();
    d2 *= d9;
    d9 = paramViewingConditions.getAw() + d8;
    double d20 = Math.sqrt(d2 / d9) * 50.0D;
    d8 = 1.7D * d17;
    d2 = 0.007D * d17 + 1.0D;
    double d21 = d8 / d2;
    d6 = Math.log1p(d6 * 0.0228D) * 43.859649122807014D;
    d8 = Math.cos(d7);
    double d22 = d6 * d8;
    d7 = Math.sin(d7);
    double d23 = d6 * d7;
    localObject = new com/google/android/material/color/utilities/Cam16;
    ((Cam16)localObject).<init>(d15, d16, d17, d18, d19, d20, d21, d22, d23);
    return localObject;
  }
  
  public double distance(Cam16 paramCam16)
  {
    double d1 = getJstar();
    double d2 = paramCam16.getJstar();
    d1 -= d2;
    d2 = getAstar();
    double d3 = paramCam16.getAstar();
    d2 -= d3;
    d3 = getBstar();
    double d4 = paramCam16.getBstar();
    d3 -= d4;
    d1 *= d1;
    d2 *= d2;
    d1 += d2;
    d3 *= d3;
    return Math.pow(Math.sqrt(d1 + d3), 0.63D) * 1.41D;
  }
  
  public double getAstar()
  {
    return this.astar;
  }
  
  public double getBstar()
  {
    return this.bstar;
  }
  
  public double getChroma()
  {
    return this.chroma;
  }
  
  public double getHue()
  {
    return this.hue;
  }
  
  public double getJ()
  {
    return this.j;
  }
  
  public double getJstar()
  {
    return this.jstar;
  }
  
  public double getM()
  {
    return this.m;
  }
  
  public double getQ()
  {
    return this.q;
  }
  
  public double getS()
  {
    return this.s;
  }
  
  public int toInt()
  {
    ViewingConditions localViewingConditions = ViewingConditions.DEFAULT;
    return viewed(localViewingConditions);
  }
  
  public int viewed(ViewingConditions paramViewingConditions)
  {
    double[] arrayOfDouble = this.tempArray;
    paramViewingConditions = xyzInViewingConditions(paramViewingConditions, arrayOfDouble);
    double d1 = paramViewingConditions[0];
    double d2 = paramViewingConditions[1];
    double d3 = paramViewingConditions[2];
    return ColorUtils.argbFromXyz(d1, d2, d3);
  }
  
  public double[] xyzInViewingConditions(ViewingConditions paramViewingConditions, double[] paramArrayOfDouble)
  {
    double d1 = getChroma();
    double d2 = 0.0D;
    boolean bool = d1 < d2;
    double d3 = 100.0D;
    if (bool)
    {
      d1 = getJ();
      bool = d1 < d2;
      if (bool)
      {
        d1 = getChroma();
        d4 = Math.sqrt(getJ() / d3);
        d1 /= d4;
        break label71;
      }
    }
    d1 = d2;
    label71:
    double d4 = paramViewingConditions.getN();
    d4 = Math.pow(0.29D, d4);
    d4 = Math.pow(1.64D - d4, 0.73D);
    d1 = Math.pow(d1 / d4, 1.111111111111111D);
    d4 = Math.toRadians(getHue());
    double d5 = (Math.cos(2.0D + d4) + 3.8D) * 0.25D;
    double d6 = paramViewingConditions.getAw();
    double d7 = getJ() / d3;
    double d8 = paramViewingConditions.getC();
    double d9 = 1.0D / d8;
    d8 = paramViewingConditions.getZ();
    d9 /= d8;
    d7 = Math.pow(d7, d9);
    d6 *= d7;
    d5 *= 3846.1538461538462D;
    d7 = paramViewingConditions.getNc();
    d5 *= d7;
    d7 = paramViewingConditions.getNcb();
    d5 *= d7;
    d7 = paramViewingConditions.getNbb();
    d6 /= d7;
    d7 = Math.sin(d4);
    d4 = Math.cos(d4);
    d9 = 0.305D + d6;
    d8 = 23.0D;
    d9 = d9 * d8 * d1;
    d5 *= d8;
    d8 = 11.0D * d1 * d4;
    d5 += d8;
    d1 = d1 * 108.0D * d7;
    d5 += d1;
    d9 /= d5;
    d4 *= d9;
    d9 *= d7;
    d6 *= 460.0D;
    d1 = 451.0D * d4 + d6;
    d5 = 288.0D * d9;
    d1 += d5;
    d5 = 1403.0D;
    d1 /= d5;
    d7 = 891.0D * d4;
    d7 = d6 - d7;
    d8 = 261.0D * d9;
    d7 = (d7 - d8) / d5;
    d4 *= 220.0D;
    d6 -= d4;
    d9 *= 6300.0D;
    d6 = (d6 - d9) / d5;
    d4 = Math.abs(d1);
    d5 = 27.129999999999999D;
    d4 *= d5;
    d9 = Math.abs(d1);
    d8 = 400.0D;
    d9 = d8 - d9;
    d4 /= d9;
    d4 = Math.max(d2, d4);
    d1 = Math.signum(d1);
    d9 = paramViewingConditions.getFl();
    d9 = d3 / d9;
    d1 *= d9;
    d9 = 2.380952380952381D;
    d4 = Math.pow(d4, d9);
    d1 *= d4;
    d4 = Math.abs(d7) * d5;
    double d10 = Math.abs(d7);
    d10 = d8 - d10;
    d4 /= d10;
    d4 = Math.max(d2, d4);
    d7 = Math.signum(d7);
    d10 = paramViewingConditions.getFl();
    d10 = d3 / d10;
    d7 *= d10;
    d4 = Math.pow(d4, d9);
    d7 *= d4;
    d4 = Math.abs(d6) * d5;
    d5 = Math.abs(d6);
    d8 -= d5;
    d4 /= d8;
    d2 = Math.max(d2, d4);
    d4 = Math.signum(d6);
    d5 = paramViewingConditions.getFl();
    d3 /= d5;
    d4 *= d3;
    d2 = Math.pow(d2, d9);
    d4 *= d2;
    d3 = paramViewingConditions.getRgbD()[0];
    d1 /= d3;
    Object localObject1 = paramViewingConditions.getRgbD();
    int i = 1;
    d5 = localObject1[i];
    d7 /= d5;
    localObject1 = paramViewingConditions.getRgbD();
    int k = 2;
    d5 = localObject1[k];
    d4 /= d5;
    localObject1 = CAM16RGB_TO_XYZ;
    Object localObject2 = localObject1[0];
    double d11 = localObject2[0] * d1;
    d9 = localObject2[i] * d7;
    d11 += d9;
    d9 = localObject2[k] * d4;
    d11 += d9;
    localObject2 = localObject1[i];
    d9 = localObject2[0] * d1;
    d8 = localObject2[i] * d7;
    d9 += d8;
    d8 = localObject2[k] * d4;
    d9 += d8;
    localObject1 = localObject1[k];
    d8 = localObject1[0];
    d1 *= d8;
    d8 = localObject1[i];
    d7 *= d8;
    d1 += d7;
    double d12 = localObject1[k];
    d4 *= d12;
    d1 += d4;
    if (paramArrayOfDouble != null)
    {
      paramArrayOfDouble[0] = d11;
      paramArrayOfDouble[i] = d9;
      paramArrayOfDouble[k] = d1;
      return paramArrayOfDouble;
    }
    localObject1 = new double[3];
    localObject1[0] = d11;
    localObject1[i] = d9;
    localObject1[k] = d1;
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.Cam16
 * JD-Core Version:    0.7.0.1
 */