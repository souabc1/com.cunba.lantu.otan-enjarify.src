package androidx.core.content.res;

final class ViewingConditions
{
  public static final ViewingConditions OooOO0O;
  public final float OooO;
  public final float OooO00o;
  public final float OooO0O0;
  public final float OooO0OO;
  public final float OooO0Oo;
  public final float OooO0o;
  public final float OooO0o0;
  public final float[] OooO0oO;
  public final float OooO0oo;
  public final float OooOO0;
  
  static
  {
    float[] arrayOfFloat = CamUtils.OooO0OO;
    float f1 = 50.0F;
    float f2 = (float)(CamUtils.OooO0oo(f1) * 63.661977236758133D / 100.0D);
    OooOO0O = OooO00o(arrayOfFloat, f2, f1, 2.0F, false);
  }
  
  public ViewingConditions(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float[] paramArrayOfFloat, float paramFloat7, float paramFloat8, float paramFloat9)
  {
    this.OooO0o = paramFloat1;
    this.OooO00o = paramFloat2;
    this.OooO0O0 = paramFloat3;
    this.OooO0OO = paramFloat4;
    this.OooO0Oo = paramFloat5;
    this.OooO0o0 = paramFloat6;
    this.OooO0oO = paramArrayOfFloat;
    this.OooO0oo = paramFloat7;
    this.OooO = paramFloat8;
    this.OooOO0 = paramFloat9;
  }
  
  public static ViewingConditions OooO00o(float[] paramArrayOfFloat, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean)
  {
    float f1 = paramFloat1;
    Object localObject1 = CamUtils.OooO00o;
    float f2 = 0.0F;
    float f3 = paramArrayOfFloat[0];
    Object localObject2 = localObject1[0];
    float f4 = localObject2[0] * f3;
    int i = 1;
    float f5 = 1.4E-45F;
    float f6 = paramArrayOfFloat[i];
    float f7 = localObject2[i] * f6;
    f4 += f7;
    int j = 2;
    f7 = 2.802597E-045F;
    float f8 = paramArrayOfFloat[j];
    float f9 = localObject2[j] * f8;
    f4 += f9;
    localObject2 = localObject1[i];
    float f10 = localObject2[0] * f3;
    float f11 = localObject2[i] * f6;
    f10 += f11;
    f9 = localObject2[j] * f8;
    f10 += f9;
    localObject1 = localObject1[j];
    f9 = localObject1[0];
    f3 *= f9;
    f9 = localObject1[i];
    f6 *= f9;
    f3 += f6;
    float f12 = localObject1[j];
    f8 *= f12;
    f3 += f8;
    int k = 1092616192;
    f12 = 10.0F;
    f9 = paramFloat3 / f12;
    f6 = 0.8F;
    f9 += f6;
    double d1 = f9;
    double d2 = 0.9D;
    boolean bool1 = d1 < d2;
    f11 = 0.59F;
    if (!bool1)
    {
      f6 = (f9 - 0.9F) * f12;
      k = 1060152279;
      f12 = CamUtils.OooO0Oo(f11, 0.69F, f6);
    }
    else
    {
      f6 = (f9 - f6) * f12;
      k = 1057384038;
      f12 = CamUtils.OooO0Oo(0.525F, f11, f6);
    }
    float f13 = f12;
    k = 1065353216;
    f12 = 1.0F;
    if (paramBoolean)
    {
      f6 = f12;
    }
    else
    {
      d1 = Math.exp((-f1 - 42.0F) / 92.0F);
      f6 = (float)d1;
      int m = 1049508068;
      f8 = 0.2777778F;
      f6 *= f8;
      f6 = (f12 - f6) * f9;
    }
    d1 = f6;
    d2 = 1.0D;
    boolean bool2 = d1 < d2;
    if (bool2)
    {
      f6 = f12;
    }
    else
    {
      d2 = 0.0D;
      bool2 = d1 < d2;
      if (bool2)
      {
        f6 = 0.0F;
        arrayOfFloat1 = null;
      }
    }
    int n = 3;
    float[] arrayOfFloat2 = new float[n];
    f11 = 100.0F;
    float f14 = f11 / f4 * f6 + f12 - f6;
    arrayOfFloat2[0] = f14;
    f14 = f11 / f10 * f6 + f12 - f6;
    arrayOfFloat2[i] = f14;
    f11 = f11 / f3 * f6 + f12 - f6;
    arrayOfFloat2[j] = f11;
    f6 = 5.0F * f1 + f12;
    f6 = f12 / f6;
    f11 = f6 * f6 * f6 * f6;
    f12 -= f11;
    f11 *= f1;
    f6 = 0.1F * f12 * f12;
    f1 = (float)Math.cbrt(f1 * 5.0D);
    f6 *= f1;
    f1 = f11 + f6;
    f12 = CamUtils.OooO0oo(paramFloat2);
    f6 = paramArrayOfFloat[i];
    f14 = f12 / f6;
    d2 = f14;
    float f15 = (float)Math.sqrt(d2) + 1.48F;
    f5 = (float)Math.pow(d2, 0.2D);
    f5 = 0.725F / f5;
    float[] arrayOfFloat1 = new float[n];
    d2 = arrayOfFloat2[0] * f1 * f4;
    double d3 = 100.0D;
    d2 /= d3;
    double d4 = 0.42D;
    f11 = (float)Math.pow(d2, d4);
    arrayOfFloat1[0] = f11;
    k = 1;
    f10 = (float)Math.pow(arrayOfFloat2[k] * f1 * f10 / d3, d4);
    arrayOfFloat1[k] = f10;
    int i1 = 2;
    f3 = (float)Math.pow(arrayOfFloat2[i1] * f1 * f3 / d3, d4);
    arrayOfFloat1[i1] = f3;
    f2 = arrayOfFloat1[0];
    f4 = 400.0F;
    f7 = f2 * f4;
    f8 = 27.129999F;
    f2 += f8;
    f7 /= f2;
    f12 = arrayOfFloat1[1];
    f2 = f12 * f4;
    f12 += f8;
    f2 /= f12;
    f4 *= f3;
    f3 += f8;
    f4 /= f3;
    f7 = f7 * 2.0F + f2;
    f4 *= 0.05F;
    float f16 = (f7 + f4) * f5;
    localObject1 = new androidx/core/content/res/ViewingConditions;
    f2 = (float)Math.pow(f1, 0.25D);
    ((ViewingConditions)localObject1).<init>(f14, f16, f5, f5, f13, f9, arrayOfFloat2, f1, f2, f15);
    return localObject1;
  }
  
  public float getAw()
  {
    return this.OooO00o;
  }
  
  public float getC()
  {
    return this.OooO0Oo;
  }
  
  public float getFl()
  {
    return this.OooO0oo;
  }
  
  public float getFlRoot()
  {
    return this.OooO;
  }
  
  public float getN()
  {
    return this.OooO0o;
  }
  
  public float getNbb()
  {
    return this.OooO0O0;
  }
  
  public float getNc()
  {
    return this.OooO0o0;
  }
  
  public float getNcb()
  {
    return this.OooO0OO;
  }
  
  public float[] getRgbD()
  {
    return this.OooO0oO;
  }
  
  public float getZ()
  {
    return this.OooOO0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.ViewingConditions
 * JD-Core Version:    0.7.0.1
 */