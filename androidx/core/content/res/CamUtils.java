package androidx.core.content.res;

import android.graphics.Color;
import androidx.core.graphics.ColorUtils;

final class CamUtils
{
  public static final float[][] OooO00o;
  public static final float[][] OooO0O0;
  public static final float[] OooO0OO;
  public static final float[][] OooO0Oo;
  
  static
  {
    int i = 3;
    Object localObject = new float[i][];
    float[] arrayOfFloat1 = new float[i];
    float[] tmp12_11 = arrayOfFloat1;
    tmp12_11[0] = 0.401288F;
    float[] tmp17_12 = tmp12_11;
    tmp17_12[1] = 0.650173F;
    tmp17_12[2] = -0.051461F;
    localObject[0] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp35_34 = arrayOfFloat1;
    tmp35_34[0] = -0.250268F;
    float[] tmp40_35 = tmp35_34;
    tmp40_35[1] = 1.204414F;
    tmp40_35[2] = 0.045854F;
    int j = 1;
    localObject[j] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp60_59 = arrayOfFloat1;
    tmp60_59[0] = -0.002079F;
    float[] tmp65_60 = tmp60_59;
    tmp65_60[1] = 0.048952F;
    tmp65_60[2] = 0.953127F;
    int k = 2;
    localObject[k] = arrayOfFloat1;
    OooO00o = (float[][])localObject;
    localObject = new float[i][];
    arrayOfFloat1 = new float[i];
    float[] tmp96_95 = arrayOfFloat1;
    tmp96_95[0] = 1.862068F;
    float[] tmp101_96 = tmp96_95;
    tmp101_96[1] = -1.011255F;
    tmp101_96[2] = 0.1491868F;
    localObject[0] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp119_118 = arrayOfFloat1;
    tmp119_118[0] = 0.3875265F;
    float[] tmp124_119 = tmp119_118;
    tmp124_119[1] = 0.6214474F;
    tmp124_119[2] = -0.00897398F;
    localObject[j] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp142_141 = arrayOfFloat1;
    tmp142_141[0] = -0.0158415F;
    float[] tmp147_142 = tmp142_141;
    tmp147_142[1] = -0.0341229F;
    tmp147_142[2] = 1.049964F;
    localObject[k] = arrayOfFloat1;
    OooO0O0 = (float[][])localObject;
    localObject = new float[i];
    Object tmp170_169 = localObject;
    tmp170_169[0] = 95.046997F;
    Object tmp175_170 = tmp170_169;
    tmp175_170[1] = 100.0F;
    tmp175_170[2] = 108.883F;
    OooO0OO = (float[])localObject;
    localObject = new float[i][];
    arrayOfFloat1 = new float[i];
    float[] tmp198_197 = arrayOfFloat1;
    tmp198_197[0] = 0.4123389F;
    float[] tmp203_198 = tmp198_197;
    tmp203_198[1] = 0.3576206F;
    tmp203_198[2] = 0.1805104F;
    localObject[0] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp221_220 = arrayOfFloat1;
    tmp221_220[0] = 0.2126F;
    float[] tmp226_221 = tmp221_220;
    tmp226_221[1] = 0.7152F;
    tmp226_221[2] = 0.0722F;
    localObject[j] = arrayOfFloat1;
    float[] arrayOfFloat2 = new float[i];
    float[] tmp246_244 = arrayOfFloat2;
    tmp246_244[0] = 0.0193214F;
    float[] tmp251_246 = tmp246_244;
    tmp251_246[1] = 0.1191638F;
    tmp251_246[2] = 0.950345F;
    localObject[k] = arrayOfFloat2;
    OooO0Oo = (float[][])localObject;
  }
  
  public static int OooO00o(float paramFloat)
  {
    float f1 = 1.0F;
    boolean bool1 = paramFloat < f1;
    if (bool1) {
      return -16777216;
    }
    f1 = 99.0F;
    bool1 = paramFloat < f1;
    if (bool1) {
      return -1;
    }
    int i = 1098907648;
    f1 = 16.0F;
    float f2 = paramFloat + f1;
    float f3 = 116.0F;
    f2 /= f3;
    float f4 = 8.0F;
    boolean bool2 = paramFloat < f4;
    boolean bool3 = true;
    float f5 = 1.4E-45F;
    if (bool2)
    {
      bool2 = bool3;
      f4 = f5;
    }
    else
    {
      bool2 = false;
      f4 = 0.0F;
    }
    float f6 = 903.29633F;
    if (bool2) {
      paramFloat = f2 * f2 * f2;
    } else {
      paramFloat /= f6;
    }
    f4 = f2 * f2 * f2;
    float f7 = 0.008856452F;
    boolean bool4 = f4 < f7;
    if (bool4)
    {
      bool4 = bool3;
      f7 = f5;
    }
    else
    {
      bool4 = false;
      f7 = 0.0F;
    }
    float f8;
    if (bool4) {
      f8 = f4;
    } else {
      f8 = (f2 * f3 - f1) / f6;
    }
    if (!bool4)
    {
      f2 = f2 * f3 - f1;
      f4 = f2 / f6;
    }
    float[] arrayOfFloat = OooO0OO;
    f2 = arrayOfFloat[0];
    double d1 = f8 * f2;
    f2 = arrayOfFloat[bool3];
    double d2 = paramFloat * f2;
    paramFloat = arrayOfFloat[2];
    double d3 = f4 * paramFloat;
    return ColorUtils.OooO0O0(d1, d2, d3);
  }
  
  public static float OooO0O0(int paramInt)
  {
    return OooO0OO(OooO0oO(paramInt));
  }
  
  public static float OooO0OO(float paramFloat)
  {
    paramFloat /= 100.0F;
    float f = 0.008856452F;
    boolean bool = paramFloat < f;
    if (!bool) {
      return paramFloat * 903.29633F;
    }
    return (float)Math.cbrt(paramFloat) * 116.0F - 16.0F;
  }
  
  public static float OooO0Oo(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramFloat2 = (paramFloat2 - paramFloat1) * paramFloat3;
    return paramFloat1 + paramFloat2;
  }
  
  public static float[] OooO0o(int paramInt)
  {
    float f1 = OooO0o0(Color.red(paramInt));
    float f2 = OooO0o0(Color.green(paramInt));
    float f3 = OooO0o0(Color.blue(paramInt));
    Object localObject1 = OooO0Oo;
    Object localObject2 = localObject1[0];
    float f4 = localObject2[0] * f1;
    int i = 1;
    float f5 = localObject2[i] * f2;
    f4 += f5;
    int j = 2;
    float f6 = localObject2[j] * f3;
    f4 += f6;
    localObject2 = localObject1[i];
    float f7 = localObject2[0] * f1;
    float f8 = localObject2[i] * f2;
    f7 += f8;
    f6 = localObject2[j] * f3;
    f7 += f6;
    localObject1 = localObject1[j];
    f6 = localObject1[0];
    f1 *= f6;
    f6 = localObject1[i];
    f2 *= f6;
    f1 += f2;
    f2 = localObject1[j];
    f3 *= f2;
    f1 += f3;
    float[] arrayOfFloat = new float[3];
    arrayOfFloat[0] = f4;
    arrayOfFloat[i] = f7;
    arrayOfFloat[j] = f1;
    return arrayOfFloat;
  }
  
  public static float OooO0o0(int paramInt)
  {
    float f1 = paramInt / 255.0F;
    float f2 = 0.04045F;
    boolean bool = f1 < f2;
    float f3 = 100.0F;
    int i;
    if (!bool)
    {
      i = 1095678034;
      f2 = 12.92F;
    }
    double d1;
    for (f1 /= f2;; f1 = (float)d1)
    {
      return f1 * f3;
      f1 += 0.055F;
      i = 1065814589;
      f2 = 1.055F;
      d1 = f1 / f2;
      double d2 = 2.400000095367432D;
      d1 = Math.pow(d1, d2);
    }
  }
  
  public static float OooO0oO(int paramInt)
  {
    float f1 = OooO0o0(Color.red(paramInt));
    float f2 = OooO0o0(Color.green(paramInt));
    float f3 = OooO0o0(Color.blue(paramInt));
    Object localObject = OooO0Oo;
    int i = 1;
    localObject = localObject[i];
    float f4 = localObject[0];
    f1 *= f4;
    float f5 = localObject[i];
    f2 *= f5;
    f1 += f2;
    f2 = localObject[2];
    f3 *= f2;
    return f1 + f3;
  }
  
  public static float OooO0oo(float paramFloat)
  {
    float f1 = 8.0F;
    boolean bool = paramFloat < f1;
    float f2 = 100.0F;
    double d1;
    if (bool)
    {
      d1 = (paramFloat + 16.0D) / 116.0D;
      double d2 = 3.0D;
      d1 = Math.pow(d1, d2);
    }
    for (paramFloat = (float)d1;; paramFloat /= f1)
    {
      return paramFloat * f2;
      int i = 1147261687;
      f1 = 903.29633F;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.CamUtils
 * JD-Core Version:    0.7.0.1
 */