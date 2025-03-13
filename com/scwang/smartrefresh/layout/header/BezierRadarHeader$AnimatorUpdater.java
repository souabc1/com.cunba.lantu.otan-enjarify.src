package com.scwang.smartrefresh.layout.header;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

public class BezierRadarHeader$AnimatorUpdater
  implements ValueAnimator.AnimatorUpdateListener
{
  public byte o00OoOoo;
  
  public BezierRadarHeader$AnimatorUpdater(BezierRadarHeader paramBezierRadarHeader, byte paramByte)
  {
    this.o00OoOoo = paramByte;
  }
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = this.o00OoOoo;
    BezierRadarHeader localBezierRadarHeader;
    float f;
    if (i == 0)
    {
      localBezierRadarHeader = this.o00Ooo00;
      paramValueAnimator = (Float)paramValueAnimator.getAnimatedValue();
      f = paramValueAnimator.floatValue();
      localBezierRadarHeader.o00o00o = f;
    }
    else
    {
      int j = 1;
      int m = 2;
      int n;
      if (j == i)
      {
        localBezierRadarHeader = this.o00Ooo00;
        boolean bool = localBezierRadarHeader.o00OooOO;
        if (bool)
        {
          paramValueAnimator.cancel();
          return;
        }
        paramValueAnimator = (Integer)paramValueAnimator.getAnimatedValue();
        n = paramValueAnimator.intValue() / m;
        localBezierRadarHeader.o00o0000 = n;
      }
      else if (m == i)
      {
        localBezierRadarHeader = this.o00Ooo00;
        paramValueAnimator = (Float)paramValueAnimator.getAnimatedValue();
        f = paramValueAnimator.floatValue();
        localBezierRadarHeader.o00o000O = f;
      }
      else
      {
        int k = 3;
        if (k == i)
        {
          localBezierRadarHeader = this.o00Ooo00;
          paramValueAnimator = (Float)paramValueAnimator.getAnimatedValue();
          f = paramValueAnimator.floatValue();
          localBezierRadarHeader.o00o00 = f;
        }
        else
        {
          k = 4;
          if (k == i)
          {
            localBezierRadarHeader = this.o00Ooo00;
            paramValueAnimator = (Integer)paramValueAnimator.getAnimatedValue();
            n = paramValueAnimator.intValue();
            localBezierRadarHeader.o00o00O0 = n;
          }
        }
      }
    }
    this.o00Ooo00.invalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.header.BezierRadarHeader.AnimatorUpdater
 * JD-Core Version:    0.7.0.1
 */