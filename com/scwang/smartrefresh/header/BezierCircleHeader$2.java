package com.scwang.smartrefresh.header;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class BezierCircleHeader$2
  implements ValueAnimator.AnimatorUpdateListener
{
  public BezierCircleHeader$2(BezierCircleHeader paramBezierCircleHeader) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    BezierCircleHeader localBezierCircleHeader = this.o00OoOoo;
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    localBezierCircleHeader.o00OoooO = f;
    localBezierCircleHeader.invalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.BezierCircleHeader.2
 * JD-Core Version:    0.7.0.1
 */