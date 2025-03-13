package com.scwang.smartrefresh.layout.util;

import android.view.animation.Interpolator;

public class ViscousFluidInterpolator
  implements Interpolator
{
  public static final float OooO00o;
  public static final float OooO0O0;
  
  static
  {
    float f1 = 1.0F;
    float f2 = OooO00o(f1);
    f2 = f1 / f2;
    OooO00o = f2;
    float f3 = OooO00o(f1);
    f2 *= f3;
    OooO0O0 = f1 - f2;
  }
  
  public static float OooO00o(float paramFloat)
  {
    paramFloat *= 8.0F;
    float f1 = 1.0F;
    boolean bool = paramFloat < f1;
    double d;
    if (bool)
    {
      d = Math.exp(-paramFloat);
      float f2 = (float)d;
      f1 -= f2;
      paramFloat -= f1;
    }
    else
    {
      d = Math.exp(f1 - paramFloat);
      paramFloat = (float)d;
      f1 = (f1 - paramFloat) * 0.6321206F;
      paramFloat = 0.3678795F + f1;
    }
    return paramFloat;
  }
  
  public float getInterpolation(float paramFloat)
  {
    float f = OooO00o;
    paramFloat = OooO00o(paramFloat);
    f *= paramFloat;
    paramFloat = 0.0F;
    boolean bool = f < 0.0F;
    if (bool)
    {
      paramFloat = OooO0O0;
      f += paramFloat;
    }
    return f;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.util.ViscousFluidInterpolator
 * JD-Core Version:    0.7.0.1
 */