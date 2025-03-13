package com.google.android.material.color.utilities;

public class ColorUtils
{
  static final double[][] SRGB_TO_XYZ;
  static final double[] WHITE_POINT_D65;
  static final double[][] XYZ_TO_SRGB;
  
  static
  {
    int i = 3;
    double[][] arrayOfDouble = new double[i][];
    double[] arrayOfDouble1 = new double[i];
    double[] tmp12_11 = arrayOfDouble1;
    tmp12_11[0] = 0.41233895D;
    double[] tmp18_12 = tmp12_11;
    tmp18_12[1] = 0.35762064D;
    tmp18_12[2] = 0.18051042D;
    arrayOfDouble[0] = arrayOfDouble1;
    arrayOfDouble1 = new double[i];
    double[] tmp38_37 = arrayOfDouble1;
    tmp38_37[0] = 0.2126D;
    double[] tmp44_38 = tmp38_37;
    tmp44_38[1] = 0.7152D;
    tmp44_38[2] = 0.0722D;
    int j = 1;
    arrayOfDouble[j] = arrayOfDouble1;
    arrayOfDouble1 = new double[i];
    double[] tmp66_65 = arrayOfDouble1;
    tmp66_65[0] = 0.01932141D;
    double[] tmp72_66 = tmp66_65;
    tmp72_66[1] = 0.11916382D;
    tmp72_66[2] = 0.95034478D;
    int k = 2;
    arrayOfDouble[k] = arrayOfDouble1;
    SRGB_TO_XYZ = arrayOfDouble;
    arrayOfDouble = new double[i][];
    arrayOfDouble1 = new double[i];
    double[] tmp105_104 = arrayOfDouble1;
    tmp105_104[0] = 3.241377479238869D;
    double[] tmp111_105 = tmp105_104;
    tmp111_105[1] = -1.537665240285185D;
    tmp111_105[2] = -0.4988536684626805D;
    arrayOfDouble[0] = arrayOfDouble1;
    arrayOfDouble1 = new double[i];
    double[] tmp131_130 = arrayOfDouble1;
    tmp131_130[0] = -0.9691452513005321D;
    double[] tmp137_131 = tmp131_130;
    tmp137_131[1] = 1.875885345106787D;
    tmp137_131[2] = 0.04156585616912061D;
    arrayOfDouble[j] = arrayOfDouble1;
    arrayOfDouble1 = new double[i];
    double[] tmp157_156 = arrayOfDouble1;
    tmp157_156[0] = 0.05562093689691305D;
    double[] tmp163_157 = tmp157_156;
    tmp163_157[1] = -0.2039552456474212D;
    tmp163_157[2] = 1.057179911122034D;
    arrayOfDouble[k] = arrayOfDouble1;
    XYZ_TO_SRGB = arrayOfDouble;
    double[] arrayOfDouble2 = new double[i];
    double[] tmp190_188 = arrayOfDouble2;
    tmp190_188[0] = 95.046999999999997D;
    double[] tmp196_190 = tmp190_188;
    tmp196_190[1] = 100.0D;
    tmp196_190[2] = 108.883D;
    WHITE_POINT_D65 = arrayOfDouble2;
  }
  
  public static int alphaFromArgb(int paramInt)
  {
    return paramInt >> 24 & 0xFF;
  }
  
  public static int argbFromLab(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double[] arrayOfDouble = WHITE_POINT_D65;
    paramDouble1 = (paramDouble1 + 16.0D) / 116.0D;
    paramDouble2 = paramDouble2 / 500.0D + paramDouble1;
    paramDouble3 /= 200.0D;
    paramDouble3 = paramDouble1 - paramDouble3;
    paramDouble2 = labInvf(paramDouble2);
    paramDouble1 = labInvf(paramDouble1);
    paramDouble3 = labInvf(paramDouble3);
    double d1 = arrayOfDouble[0];
    double d2 = paramDouble2 * d1;
    paramDouble2 = arrayOfDouble[1];
    double d3 = paramDouble1 * paramDouble2;
    paramDouble1 = arrayOfDouble[2];
    double d4 = paramDouble3 * paramDouble1;
    return argbFromXyz(d2, d3, d4);
  }
  
  public static int argbFromLinrgb(double[] paramArrayOfDouble)
  {
    int i = delinearized(paramArrayOfDouble[0]);
    int j = delinearized(paramArrayOfDouble[1]);
    int k = delinearized(paramArrayOfDouble[2]);
    return argbFromRgb(i, j, k);
  }
  
  public static int argbFromLstar(double paramDouble)
  {
    int i = delinearized(yFromLstar(paramDouble));
    return argbFromRgb(i, i, i);
  }
  
  public static int argbFromRgb(int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt1 = (paramInt1 & 0xFF) << 16 | 0xFF000000;
    paramInt2 = (paramInt2 & 0xFF) << 8;
    paramInt1 |= paramInt2;
    paramInt2 = paramInt3 & 0xFF;
    return paramInt1 | paramInt2;
  }
  
  public static int argbFromXyz(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    Object localObject1 = XYZ_TO_SRGB;
    Object localObject2 = localObject1[0];
    double d1 = localObject2[0] * paramDouble1;
    int i = 1;
    double d2 = localObject2[i] * paramDouble2;
    d1 += d2;
    int j = 2;
    double d3 = localObject2[j] * paramDouble3;
    d1 += d3;
    localObject2 = localObject1[i];
    d3 = localObject2[0] * paramDouble1;
    double d4 = localObject2[i] * paramDouble2;
    d3 += d4;
    d4 = localObject2[j] * paramDouble3;
    d3 += d4;
    localObject1 = localObject1[j];
    double d5 = localObject1[0] * paramDouble1;
    d4 = localObject1[i] * paramDouble2;
    d5 += d4;
    double d6 = localObject1[j] * paramDouble3;
    d5 += d6;
    int k = delinearized(d1);
    int m = delinearized(d3);
    int n = delinearized(d5);
    return argbFromRgb(k, m, n);
  }
  
  public static int blueFromArgb(int paramInt)
  {
    return paramInt & 0xFF;
  }
  
  public static int delinearized(double paramDouble)
  {
    paramDouble /= 100.0D;
    double d = 0.0031308D;
    boolean bool = paramDouble < d;
    if (!bool)
    {
      d = 12.92D;
      paramDouble *= d;
    }
    else
    {
      paramDouble = Math.pow(paramDouble, 0.4166666666666667D) * 1.055D;
      d = 0.055D;
      paramDouble -= d;
    }
    int i = (int)Math.round(paramDouble * 255.0D);
    return MathUtils.clampInt(0, 255, i);
  }
  
  public static int greenFromArgb(int paramInt)
  {
    return paramInt >> 8 & 0xFF;
  }
  
  public static boolean isOpaque(int paramInt)
  {
    paramInt = alphaFromArgb(paramInt);
    int i = 255;
    if (paramInt >= i) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public static double labF(double paramDouble)
  {
    double d = 0.008856451679035631D;
    boolean bool = paramDouble < d;
    if (bool) {
      return Math.pow(paramDouble, 0.3333333333333333D);
    }
    return (paramDouble * 903.2962962962963D + 16.0D) / 116.0D;
  }
  
  public static double[] labFromArgb(int paramInt)
  {
    double d1 = linearized(redFromArgb(paramInt));
    double d2 = linearized(greenFromArgb(paramInt));
    double d3 = linearized(blueFromArgb(paramInt));
    Object localObject1 = SRGB_TO_XYZ;
    Object localObject2 = localObject1[0];
    double d4 = localObject2[0] * d1;
    int i = 1;
    double d5 = localObject2[i] * d2;
    d4 += d5;
    int j = 2;
    double d6 = localObject2[j] * d3;
    d4 += d6;
    localObject2 = localObject1[i];
    d6 = localObject2[0] * d1;
    double d7 = localObject2[i] * d2;
    d6 += d7;
    d7 = localObject2[j] * d3;
    d6 += d7;
    localObject1 = localObject1[j];
    d7 = localObject1[0] * d1;
    d1 = localObject1[i] * d2;
    d7 += d1;
    d1 = localObject1[j] * d3;
    d7 += d1;
    double[] arrayOfDouble1 = WHITE_POINT_D65;
    double d8 = arrayOfDouble1[0];
    d4 /= d8;
    d8 = arrayOfDouble1[i];
    d6 /= d8;
    d1 = arrayOfDouble1[j];
    d7 /= d1;
    d1 = labF(d4);
    d2 = labF(d6);
    d3 = labF(d7);
    double d9 = 116.0D * d2 - 16.0D;
    d1 = (d1 - d2) * 500.0D;
    d2 = (d2 - d3) * 200.0D;
    double[] arrayOfDouble2 = new double[3];
    arrayOfDouble2[0] = d9;
    arrayOfDouble2[i] = d1;
    arrayOfDouble2[j] = d2;
    return arrayOfDouble2;
  }
  
  public static double labInvf(double paramDouble)
  {
    double d1 = paramDouble * paramDouble * paramDouble;
    double d2 = 0.008856451679035631D;
    boolean bool = d1 < d2;
    if (bool) {
      return d1;
    }
    return (paramDouble * 116.0D - 16.0D) / 903.2962962962963D;
  }
  
  public static double linearized(int paramInt)
  {
    double d1 = paramInt / 255.0D;
    paramInt = d1 < 0.040449936D;
    double d2 = 100.0D;
    double d3;
    if (paramInt <= 0) {
      d3 = 12.92D;
    }
    for (d1 /= d3;; d1 = Math.pow(d1, d3))
    {
      return d1 * d2;
      d1 = (d1 + 0.055D) / 1.055D;
      d3 = 2.4D;
    }
  }
  
  public static double lstarFromArgb(int paramInt)
  {
    return labF(xyzFromArgb(paramInt)[1] / 100.0D) * 116.0D - 16.0D;
  }
  
  public static double lstarFromY(double paramDouble)
  {
    return labF(paramDouble / 100.0D) * 116.0D - 16.0D;
  }
  
  public static int redFromArgb(int paramInt)
  {
    return paramInt >> 16 & 0xFF;
  }
  
  public static double[] whitePointD65()
  {
    return WHITE_POINT_D65;
  }
  
  public static double[] xyzFromArgb(int paramInt)
  {
    double d1 = linearized(redFromArgb(paramInt));
    double d2 = linearized(greenFromArgb(paramInt));
    double d3 = linearized(blueFromArgb(paramInt));
    double[] arrayOfDouble = new double[3];
    arrayOfDouble[0] = d1;
    arrayOfDouble[1] = d2;
    arrayOfDouble[2] = d3;
    double[][] arrayOfDouble1 = SRGB_TO_XYZ;
    return MathUtils.matrixMultiply(arrayOfDouble, arrayOfDouble1);
  }
  
  public static double yFromLstar(double paramDouble)
  {
    return labInvf((paramDouble + 16.0D) / 116.0D) * 100.0D;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.ColorUtils
 * JD-Core Version:    0.7.0.1
 */