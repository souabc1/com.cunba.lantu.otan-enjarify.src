package com.scwang.smartrefresh.header;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class BezierCircleHeader$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public float o00OoOoo = 0.0F;
  public float o00Ooo0 = 0.0F;
  public float o00Ooo00;
  public int o00Ooo0O = 0;
  
  public BezierCircleHeader$1(BezierCircleHeader paramBezierCircleHeader, float paramFloat) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    Float localFloat = (Float)paramValueAnimator.getAnimatedValue();
    float f1 = localFloat.floatValue();
    int i = this.o00Ooo0O;
    boolean bool4 = false;
    float f2 = 0.0F;
    int m = 1;
    BezierCircleHeader localBezierCircleHeader1;
    float f3;
    if (i == 0)
    {
      boolean bool1 = f1 < 0.0F;
      if (!bool1)
      {
        this.o00Ooo0O = m;
        localBezierCircleHeader1 = this.o00OooO0;
        f3 = localBezierCircleHeader1.o00OooOO;
        f3 = Math.abs(f1 - f3);
        this.o00OoOoo = f3;
      }
    }
    int j = this.o00Ooo0O;
    int n = 2;
    float f4 = 2.802597E-045F;
    float f5;
    float f6;
    boolean bool5;
    if (j == m)
    {
      f3 = -f1;
      f5 = this.o00Ooo0o;
      f3 /= f5;
      this.o00Ooo0 = f3;
      BezierCircleHeader localBezierCircleHeader2 = this.o00OooO0;
      f6 = localBezierCircleHeader2.o0O00o0;
      bool5 = f3 < f6;
      if (!bool5)
      {
        localBezierCircleHeader2.o0O00o0 = f3;
        f3 = localBezierCircleHeader2.o00OooOo + f1;
        localBezierCircleHeader2.o00Ooooo = f3;
        f3 = localBezierCircleHeader2.o00OooOO;
        f3 = Math.abs(f1 - f3);
        this.o00OoOoo = f3;
      }
      else
      {
        this.o00Ooo0O = n;
        localBezierCircleHeader2.o0O00o0 = 0.0F;
        localBezierCircleHeader2.o00o0000 = m;
        localBezierCircleHeader2.o00o000 = m;
        f3 = localBezierCircleHeader2.o00Ooooo;
        this.o00Ooo00 = f3;
      }
    }
    j = this.o00Ooo0O;
    if (j == n)
    {
      localBezierCircleHeader1 = this.o00OooO0;
      f2 = localBezierCircleHeader1.o00Ooooo;
      f4 = localBezierCircleHeader1.o00OooOo;
      f5 = 2.0F;
      f6 = f4 / f5;
      bool5 = f2 < f6;
      if (bool5)
      {
        f4 /= f5;
        f6 = this.o00OoOoo;
        f2 -= f6;
        f2 = Math.max(f4, f2);
        localBezierCircleHeader1.o00Ooooo = f2;
        float f7 = paramValueAnimator.getAnimatedFraction();
        localBezierCircleHeader1 = this.o00OooO0;
        f2 = localBezierCircleHeader1.o00OooOo / f5;
        f4 = this.o00Ooo00;
        f2 -= f4;
        f7 = f7 * f2 + f4;
        f2 = localBezierCircleHeader1.o00Ooooo;
        bool4 = f2 < f7;
        if (bool4) {
          localBezierCircleHeader1.o00Ooooo = f7;
        }
      }
    }
    paramValueAnimator = this.o00OooO0;
    boolean bool2 = paramValueAnimator.o00o000;
    if (bool2)
    {
      f3 = paramValueAnimator.o00OooOO;
      bool2 = f1 < f3;
      if (bool2)
      {
        paramValueAnimator.o00o000O = m;
        localBezierCircleHeader1 = null;
        paramValueAnimator.o00o000 = false;
        paramValueAnimator.o00o00O0 = m;
        int k = 90;
        f3 = 1.261169E-043F;
        paramValueAnimator.o00o00 = k;
        paramValueAnimator.oo00oO = k;
      }
    }
    boolean bool3 = paramValueAnimator.o00o00Oo;
    if (!bool3)
    {
      paramValueAnimator.o00OooOO = f1;
      paramValueAnimator.invalidate();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.BezierCircleHeader.1
 * JD-Core Version:    0.7.0.1
 */