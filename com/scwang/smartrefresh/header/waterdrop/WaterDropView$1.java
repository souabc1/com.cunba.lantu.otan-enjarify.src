package com.scwang.smartrefresh.header.waterdrop;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class WaterDropView$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public WaterDropView$1(WaterDropView paramWaterDropView) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    WaterDropView localWaterDropView = this.o00OoOoo;
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    localWaterDropView.OooO0OO(f);
    this.o00OoOoo.postInvalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.waterdrop.WaterDropView.1
 * JD-Core Version:    0.7.0.1
 */