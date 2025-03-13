package androidx.core.content.res;

import androidx.core.graphics.ColorUtils;

class CamColor
{
  public final float OooO;
  public final float OooO00o;
  public final float OooO0O0;
  public final float OooO0OO;
  public final float OooO0Oo;
  public final float OooO0o;
  public final float OooO0o0;
  public final float OooO0oO;
  public final float OooO0oo;
  
  public CamColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9)
  {
    this.OooO00o = paramFloat1;
    this.OooO0O0 = paramFloat2;
    this.OooO0OO = paramFloat3;
    this.OooO0Oo = paramFloat4;
    this.OooO0o0 = paramFloat5;
    this.OooO0o = paramFloat6;
    this.OooO0oO = paramFloat7;
    this.OooO0oo = paramFloat8;
    this.OooO = paramFloat9;
  }
  
  public static CamColor OooO0O0(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = 100.0F;
    float f2 = 1000.0F;
    float f3 = 0.0F;
    Object localObject = null;
    float f4 = f2;
    for (;;)
    {
      float f5 = Math.abs(f3 - f1);
      int i = 1008981770;
      float f6 = 0.01F;
      boolean bool2 = f5 < f6;
      if (!bool2) {
        break;
      }
      f5 = f1 - f3;
      f6 = 2.0F;
      f5 = f5 / f6 + f3;
      CamColor localCamColor1 = OooO0o0(f5, paramFloat2, paramFloat1);
      i = localCamColor1.OooOO0();
      float f7 = CamUtils.OooO0O0(i);
      float f8 = Math.abs(paramFloat3 - f7);
      float f9 = 0.2F;
      boolean bool3 = f8 < f9;
      if (bool3)
      {
        localCamColor1 = OooO0OO(i);
        f9 = localCamColor1.getJ();
        float f10 = localCamColor1.getChroma();
        CamColor localCamColor2 = OooO0o0(f9, f10, paramFloat1);
        f9 = localCamColor1.OooO00o(localCamColor2);
        f10 = 1.0F;
        boolean bool4 = f9 < f10;
        if (!bool4)
        {
          localObject = localCamColor1;
          f2 = f8;
          f4 = f9;
        }
      }
      boolean bool1 = f2 < 0.0F;
      if (!bool1)
      {
        bool1 = f4 < 0.0F;
        if (!bool1) {
          break;
        }
      }
      bool1 = f7 < paramFloat3;
      if (bool1) {
        f3 = f5;
      } else {
        f1 = f5;
      }
    }
    return localObject;
  }
  
  public static CamColor OooO0OO(int paramInt)
  {
    ViewingConditions localViewingConditions = ViewingConditions.OooOO0O;
    return OooO0Oo(paramInt, localViewingConditions);
  }
  
  public static CamColor OooO0Oo(int paramInt, ViewingConditions paramViewingConditions)
  {
    float[] arrayOfFloat = CamUtils.OooO0o(paramInt);
    Object localObject1 = CamUtils.OooO00o;
    float f1 = arrayOfFloat[0];
    Object localObject2 = localObject1[0];
    float f2 = localObject2[0] * f1;
    int i = 1;
    float f3 = 1.4E-45F;
    float f4 = arrayOfFloat[i];
    float f5 = localObject2[i] * f4;
    f2 += f5;
    int j = 2;
    float f6 = arrayOfFloat[j];
    float f7 = localObject2[j] * f6;
    f2 += f7;
    localObject2 = localObject1[i];
    float f8 = localObject2[0] * f1;
    float f9 = localObject2[i] * f4;
    f8 += f9;
    f7 = localObject2[j] * f6;
    f8 += f7;
    localObject1 = localObject1[j];
    f7 = localObject1[0];
    f1 *= f7;
    f7 = localObject1[i];
    f4 *= f7;
    f1 += f4;
    float f10 = localObject1[j];
    f6 *= f10;
    f1 += f6;
    arrayOfFloat = paramViewingConditions.getRgbD();
    f6 = arrayOfFloat[0] * f2;
    localObject1 = paramViewingConditions.getRgbD();
    f10 = localObject1[i] * f8;
    Object localObject3 = paramViewingConditions.getRgbD();
    float f11 = localObject3[j] * f1;
    f1 = paramViewingConditions.getFl();
    f7 = Math.abs(f6);
    double d1 = f1 * f7;
    double d2 = 100.0D;
    d1 /= d2;
    double d3 = 0.42D;
    f1 = (float)Math.pow(d1, d3);
    f7 = paramViewingConditions.getFl();
    f8 = Math.abs(f10);
    f7 = (float)Math.pow(f7 * f8 / d2, d3);
    f8 = paramViewingConditions.getFl();
    f9 = Math.abs(f11);
    f4 = (float)Math.pow(f8 * f9 / d2, d3);
    f6 = Math.signum(f6);
    f5 = 400.0F;
    f6 = f6 * f5 * f1;
    f8 = 27.129999F;
    f1 += f8;
    f6 /= f1;
    f10 = Math.signum(f10) * f5 * f7;
    f7 += f8;
    f10 /= f7;
    f11 = Math.signum(f11) * f5 * f4;
    f4 += f8;
    f11 /= f4;
    d3 = f6 * 11.0D;
    double d4 = f10 * -12.0D;
    d3 += d4;
    d1 = f11;
    d3 += d1;
    f4 = (float)d3;
    j = 1093664768;
    f4 /= 11.0F;
    double d5 = f6 + f10;
    double d6 = 2.0D;
    d1 *= d6;
    d5 -= d1;
    f1 = (float)d5 / 9.0F;
    f7 = 20.0F;
    f5 = f6 * f7;
    f10 *= f7;
    f5 += f10;
    f8 = 21.0F * f11;
    f5 = (f5 + f8) / f7;
    f6 = (f6 * 40.0F + f10 + f11) / f7;
    double d7 = f1;
    double d8 = f4;
    d7 = Math.atan2(d7, d8);
    f10 = (float)d7;
    int k = 1127481344;
    f11 = 180.0F;
    f10 *= f11;
    f7 = 3.141593F;
    f10 /= f7;
    f8 = 0.0F;
    boolean bool2 = f10 < 0.0F;
    float f12 = 360.0F;
    if (bool2) {
      f10 += f12;
    }
    float f13;
    for (;;)
    {
      f13 = f10;
      break;
      bool2 = f10 < f12;
      if (!bool2) {
        f10 -= f12;
      }
    }
    f7 = f7 * f10 / f11;
    f10 = paramViewingConditions.getNbb();
    f6 *= f10;
    f10 = paramViewingConditions.getAw();
    double d9 = f6 / f10;
    f11 = paramViewingConditions.getC();
    f8 = paramViewingConditions.getZ();
    d2 = f11 * f8;
    d9 = Math.pow(d9, d2);
    f6 = (float)d9;
    f10 = 100.0F;
    f6 *= f10;
    f11 = paramViewingConditions.getC();
    f2 = 4.0F;
    f11 = f2 / f11;
    d6 = f6 / f10;
    f10 = (float)Math.sqrt(d6);
    f11 *= f10;
    f10 = paramViewingConditions.getAw() + f2;
    f11 *= f10;
    f10 = paramViewingConditions.getFlRoot() * f11;
    d4 = f13;
    double d10 = 20.140000000000001D;
    boolean bool1 = d4 < d10;
    if (bool1) {
      f12 += f13;
    } else {
      f12 = f13;
    }
    f11 = (float)(Math.cos(f12 * 3.141592653589793D / 180.0D + 2.0D) + 3.8D) * 0.25F * 3846.1538F;
    f3 = paramViewingConditions.getNc();
    f11 *= f3;
    f3 = paramViewingConditions.getNcb();
    f11 *= f3;
    f4 *= f4;
    f1 *= f1;
    f1 = (float)Math.sqrt(f4 + f1);
    f11 *= f1;
    f5 += 0.305F;
    f11 /= f5;
    double d11 = paramViewingConditions.getN();
    d11 = Math.pow(0.29D, d11);
    f1 = (float)Math.pow(1.64D - d11, 0.73D);
    f11 = (float)Math.pow(f11, 0.9D);
    f1 *= f11;
    f11 = (float)Math.sqrt(f6 / 100.0D);
    float f14 = f1 * f11;
    f11 = paramViewingConditions.getFlRoot();
    float f15 = f14 * f11;
    f11 = paramViewingConditions.getC();
    f1 *= f11;
    f11 = paramViewingConditions.getAw() + f2;
    float f16 = (float)Math.sqrt(f1 / f11) * 50.0F;
    f11 = 1.7F * f6;
    f1 = 0.007F * f6;
    f2 = 1.0F;
    f1 += f2;
    float f17 = f11 / f1;
    f11 = (float)Math.log(0.0228F * f15 + f2) * 43.85965F;
    d1 = f7;
    f2 = (float)Math.cos(d1);
    float f18 = f11 * f2;
    f1 = (float)Math.sin(d1);
    float f19 = f11 * f1;
    localObject3 = new androidx/core/content/res/CamColor;
    ((CamColor)localObject3).<init>(f13, f14, f6, f10, f15, f16, f17, f18, f19);
    return localObject3;
  }
  
  public static CamColor OooO0o(float paramFloat1, float paramFloat2, float paramFloat3, ViewingConditions paramViewingConditions)
  {
    float f1 = paramViewingConditions.getC();
    float f2 = 4.0F;
    f1 = f2 / f1;
    double d = paramFloat1 / 100.0D;
    float f3 = (float)Math.sqrt(d);
    f1 *= f3;
    f3 = paramViewingConditions.getAw() + f2;
    f1 *= f3;
    f3 = paramViewingConditions.getFlRoot();
    float f4 = f1 * f3;
    f1 = paramViewingConditions.getFlRoot();
    float f5 = paramFloat2 * f1;
    f1 = (float)Math.sqrt(d);
    f1 = paramFloat2 / f1;
    f3 = paramViewingConditions.getC();
    f1 *= f3;
    f3 = paramViewingConditions.getAw() + f2;
    float f6 = (float)Math.sqrt(f1 / f3) * 50.0F;
    f1 = 3.141593F * paramFloat3 / 180.0F;
    f2 = 1.7F * paramFloat1;
    f3 = 0.007F * paramFloat1 + 1.0F;
    float f7 = f2 / f3;
    f2 = (float)Math.log(f5 * 0.0228D + 1.0D) * 43.85965F;
    d = f1;
    f1 = (float)Math.cos(d);
    float f8 = f2 * f1;
    f1 = (float)Math.sin(d);
    float f9 = f2 * f1;
    CamColor localCamColor = new androidx/core/content/res/CamColor;
    f2 = paramFloat3;
    f3 = paramFloat2;
    float f10 = f4;
    float f11 = f5;
    f4 = f6;
    f5 = f7;
    f6 = f8;
    f7 = f9;
    localCamColor.<init>(paramFloat3, paramFloat2, paramFloat1, f10, f11, f4, f5, f8, f9);
    return localCamColor;
  }
  
  public static CamColor OooO0o0(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    ViewingConditions localViewingConditions = ViewingConditions.OooOO0O;
    return OooO0o(paramFloat1, paramFloat2, paramFloat3, localViewingConditions);
  }
  
  public static int OooO0oO(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    ViewingConditions localViewingConditions = ViewingConditions.OooOO0O;
    return OooO0oo(paramFloat1, paramFloat2, paramFloat3, localViewingConditions);
  }
  
  public static int OooO0oo(float paramFloat1, float paramFloat2, float paramFloat3, ViewingConditions paramViewingConditions)
  {
    double d1 = paramFloat2;
    double d2 = 1.0D;
    boolean bool1 = d1 < d2;
    if (!bool1)
    {
      d1 = Math.round(paramFloat3);
      d2 = 0.0D;
      bool1 = d1 < d2;
      if (bool1)
      {
        d1 = Math.round(paramFloat3);
        d2 = 100.0D;
        bool1 = d1 < d2;
        if (bool1)
        {
          bool1 = false;
          float f1 = 0.0F;
          boolean bool2 = paramFloat1 < 0.0F;
          if (bool2)
          {
            paramFloat1 = 0.0F;
          }
          else
          {
            i = 1135869952;
            f2 = 360.0F;
            paramFloat1 = Math.min(f2, paramFloat1);
          }
          Object localObject = null;
          int j = 1;
          int i = 0;
          float f2 = 0.0F;
          f1 = paramFloat2;
          for (;;)
          {
            float f3 = Math.abs(f2 - paramFloat2);
            float f4 = 0.4F;
            boolean bool3 = f3 < f4;
            if (bool3) {
              break;
            }
            CamColor localCamColor = OooO0O0(paramFloat1, f1, paramFloat3);
            f4 = 2.0F;
            if (j != 0)
            {
              if (localCamColor != null) {
                return localCamColor.OooO(paramViewingConditions);
              }
              f1 = (paramFloat2 - f2) / f4 + f2;
              j = 0;
            }
            else
            {
              if (localCamColor == null)
              {
                paramFloat2 = f1;
              }
              else
              {
                f2 = f1;
                localObject = localCamColor;
              }
              f1 = (paramFloat2 - f2) / f4 + f2;
            }
          }
          if (localObject == null) {
            return CamUtils.OooO00o(paramFloat3);
          }
          return localObject.OooO(paramViewingConditions);
        }
      }
    }
    return CamUtils.OooO00o(paramFloat3);
  }
  
  public int OooO(ViewingConditions paramViewingConditions)
  {
    float f1 = getChroma();
    double d1 = f1;
    double d2 = 0.0D;
    boolean bool = d1 < d2;
    double d3 = 100.0D;
    if (bool)
    {
      f1 = getJ();
      d1 = f1;
      bool = d1 < d2;
      if (bool)
      {
        f1 = getChroma();
        d4 = Math.sqrt(getJ() / d3);
        f2 = (float)d4;
        f1 /= f2;
        break label85;
      }
    }
    bool = false;
    f1 = 0.0F;
    label85:
    d1 = f1;
    double d4 = paramViewingConditions.getN();
    d4 = Math.pow(0.29D, d4);
    d4 = Math.pow(1.64D - d4, 0.73D);
    f1 = (float)Math.pow(d1 / d4, 1.111111111111111D);
    d4 = getHue() * 3.141593F / 180.0F;
    float f2 = (float)(Math.cos(2.0D + d4) + 3.8D) * 0.25F;
    float f3 = paramViewingConditions.getAw();
    double d5 = getJ() / d3;
    d3 = paramViewingConditions.getC();
    double d6 = 1.0D / d3;
    d3 = paramViewingConditions.getZ();
    d6 /= d3;
    float f4 = (float)Math.pow(d5, d6);
    f3 *= f4;
    f2 *= 3846.1538F;
    f4 = paramViewingConditions.getNc();
    f2 *= f4;
    f4 = paramViewingConditions.getNcb();
    f2 *= f4;
    f4 = paramViewingConditions.getNbb();
    f3 /= f4;
    f4 = (float)Math.sin(d4);
    float f5 = (float)Math.cos(d4);
    float f6 = 0.305F + f3;
    float f7 = 23.0F;
    f6 = f6 * f7 * f1;
    f2 *= f7;
    f7 = 11.0F * f1 * f5;
    f2 += f7;
    f1 = f1 * 108.0F * f4;
    f2 += f1;
    f6 /= f2;
    f5 *= f6;
    f6 *= f4;
    f3 *= 460.0F;
    f1 = 451.0F * f5 + f3;
    f2 = 288.0F * f6;
    f1 += f2;
    f2 = 1403.0F;
    f1 /= f2;
    f4 = 891.0F * f5;
    f4 = f3 - f4;
    f7 = 261.0F * f6;
    f4 = (f4 - f7) / f2;
    f5 *= 220.0F;
    f3 -= f5;
    f6 *= 6300.0F;
    f3 = (f3 - f6) / f2;
    double d7 = Math.abs(f1);
    d5 = 27.129999999999999D;
    d7 *= d5;
    d6 = Math.abs(f1);
    double d8 = 400.0D;
    d6 = d8 - d6;
    d7 /= d6;
    f2 = (float)Math.max(d2, d7);
    f1 = Math.signum(f1);
    f5 = paramViewingConditions.getFl();
    f5 = 100.0F / f5;
    f1 *= f5;
    d6 = f2;
    d4 = 2.380952380952381D;
    f5 = (float)Math.pow(d6, d4);
    f1 *= f5;
    d6 = Math.abs(f4) * d5;
    d5 = Math.abs(f4);
    d5 = d8 - d5;
    d6 /= d5;
    f5 = (float)Math.max(d2, d6);
    f4 = Math.signum(f4);
    float f8 = paramViewingConditions.getFl();
    f8 = 100.0F / f8;
    f4 *= f8;
    f5 = (float)Math.pow(f5, d4);
    f4 *= f5;
    d5 = Math.abs(f3) * 27.129999999999999D;
    d6 = Math.abs(f3);
    d8 -= d6;
    d5 /= d8;
    float f9 = (float)Math.max(d2, d5);
    float f10 = Math.signum(f3);
    f5 = paramViewingConditions.getFl();
    f2 = 100.0F / f5;
    f10 *= f2;
    f2 = (float)Math.pow(f9, d4);
    f10 *= f2;
    f2 = paramViewingConditions.getRgbD()[0];
    f1 /= f2;
    Object localObject1 = paramViewingConditions.getRgbD();
    int i = 1;
    f2 = localObject1[i];
    f4 /= f2;
    localObject1 = paramViewingConditions.getRgbD();
    int j = 2;
    f2 = localObject1[j];
    f10 /= f2;
    localObject1 = CamUtils.OooO0O0;
    Object localObject2 = localObject1[0];
    f3 = localObject2[0] * f1;
    f8 = localObject2[i] * f4;
    f3 += f8;
    f7 = localObject2[j] * f10;
    f3 += f7;
    localObject2 = localObject1[i];
    f8 = localObject2[0] * f1;
    float f11 = localObject2[i] * f4;
    f8 += f11;
    f7 = localObject2[j] * f10;
    f8 += f7;
    localObject1 = localObject1[j];
    f9 = localObject1[0];
    f1 *= f9;
    f9 = localObject1[i];
    f4 *= f9;
    f1 += f4;
    f2 = localObject1[j];
    f10 *= f2;
    f1 += f10;
    double d9 = f3;
    double d10 = f8;
    d7 = f1;
    return ColorUtils.OooO0O0(d9, d10, d7);
  }
  
  public float OooO00o(CamColor paramCamColor)
  {
    float f1 = getJStar();
    float f2 = paramCamColor.getJStar();
    f1 -= f2;
    f2 = getAStar();
    float f3 = paramCamColor.getAStar();
    f2 -= f3;
    f3 = getBStar();
    float f4 = paramCamColor.getBStar();
    f3 -= f4;
    f1 *= f1;
    f2 *= f2;
    f1 += f2;
    f3 *= f3;
    return (float)(Math.pow(Math.sqrt(f1 + f3), 0.63D) * 1.41D);
  }
  
  public int OooOO0()
  {
    ViewingConditions localViewingConditions = ViewingConditions.OooOO0O;
    return OooO(localViewingConditions);
  }
  
  public float getAStar()
  {
    return this.OooO0oo;
  }
  
  public float getBStar()
  {
    return this.OooO;
  }
  
  public float getChroma()
  {
    return this.OooO0O0;
  }
  
  public float getHue()
  {
    return this.OooO00o;
  }
  
  public float getJ()
  {
    return this.OooO0OO;
  }
  
  public float getJStar()
  {
    return this.OooO0oO;
  }
  
  public float getM()
  {
    return this.OooO0o0;
  }
  
  public float getQ()
  {
    return this.OooO0Oo;
  }
  
  public float getS()
  {
    return this.OooO0o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.CamColor
 * JD-Core Version:    0.7.0.1
 */