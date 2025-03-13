package com.scwang.smartrefresh.header;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class FlyRefreshHeader$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public FlyRefreshHeader$1(FlyRefreshHeader paramFlyRefreshHeader) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    FlyRefreshHeader localFlyRefreshHeader = this.o00OoOoo;
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    localFlyRefreshHeader.OooOOOo(true, f, 0, 0, 0);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.FlyRefreshHeader.1
 * JD-Core Version:    0.7.0.1
 */