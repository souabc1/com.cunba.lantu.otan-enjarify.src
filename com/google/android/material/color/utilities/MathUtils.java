package com.google.android.material.color.utilities;

public class MathUtils
{
  public static double clampDouble(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    boolean bool1 = paramDouble3 < paramDouble1;
    if (bool1) {
      return paramDouble1;
    }
    boolean bool2 = paramDouble3 < paramDouble2;
    if (bool2) {
      return paramDouble2;
    }
    return paramDouble3;
  }
  
  public static int clampInt(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 < paramInt1) {
      return paramInt1;
    }
    if (paramInt3 > paramInt2) {
      return paramInt2;
    }
    return paramInt3;
  }
  
  public static double differenceDegrees(double paramDouble1, double paramDouble2)
  {
    paramDouble1 = Math.abs(paramDouble1 - paramDouble2);
    paramDouble2 = 180.0D;
    paramDouble1 = Math.abs(paramDouble1 - paramDouble2);
    return paramDouble2 - paramDouble1;
  }
  
  public static double lerp(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d = (1.0D - paramDouble3) * paramDouble1;
    paramDouble3 *= paramDouble2;
    return d + paramDouble3;
  }
  
  public static double[] matrixMultiply(double[] paramArrayOfDouble, double[][] paramArrayOfDouble1)
  {
    double d1 = paramArrayOfDouble[0];
    double[] arrayOfDouble = paramArrayOfDouble1[0];
    double d2 = arrayOfDouble[0] * d1;
    int i = 1;
    double d3 = paramArrayOfDouble[i];
    double d4 = arrayOfDouble[i] * d3;
    d2 += d4;
    int j = 2;
    double d5 = paramArrayOfDouble[j];
    double d6 = arrayOfDouble[j] * d5;
    d2 += d6;
    arrayOfDouble = paramArrayOfDouble1[i];
    d6 = arrayOfDouble[0] * d1;
    double d7 = arrayOfDouble[i] * d3;
    d6 += d7;
    d7 = arrayOfDouble[j] * d5;
    d6 += d7;
    arrayOfDouble = paramArrayOfDouble1[j];
    d7 = arrayOfDouble[0];
    d1 *= d7;
    d7 = arrayOfDouble[i];
    d3 *= d7;
    d1 += d3;
    d3 = arrayOfDouble[j];
    d5 *= d3;
    d1 += d5;
    arrayOfDouble = new double[3];
    arrayOfDouble[0] = d2;
    arrayOfDouble[i] = d6;
    arrayOfDouble[j] = d1;
    return arrayOfDouble;
  }
  
  public static double rotationDirection(double paramDouble1, double paramDouble2)
  {
    paramDouble1 = sanitizeDegreesDouble(paramDouble2 - paramDouble1);
    paramDouble2 = 180.0D;
    boolean bool = paramDouble1 < paramDouble2;
    if (!bool) {
      paramDouble1 = 1.0D;
    } else {
      paramDouble1 = -1.0D;
    }
    return paramDouble1;
  }
  
  public static double sanitizeDegreesDouble(double paramDouble)
  {
    double d1 = 360.0D;
    paramDouble %= d1;
    double d2 = 0.0D;
    boolean bool = paramDouble < d2;
    if (bool) {
      paramDouble += d1;
    }
    return paramDouble;
  }
  
  public static int sanitizeDegreesInt(int paramInt)
  {
    paramInt %= 360;
    if (paramInt < 0) {
      paramInt += 360;
    }
    return paramInt;
  }
  
  public static int signum(double paramDouble)
  {
    double d = 0.0D;
    boolean bool1 = paramDouble < d;
    if (bool1) {
      return -1;
    }
    boolean bool2 = paramDouble < d;
    if (!bool2) {
      return 0;
    }
    return 1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.MathUtils
 * JD-Core Version:    0.7.0.1
 */