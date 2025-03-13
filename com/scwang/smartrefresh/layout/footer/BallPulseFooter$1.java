package com.scwang.smartrefresh.layout.footer;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class BallPulseFooter$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public BallPulseFooter$1(BallPulseFooter paramBallPulseFooter, int paramInt, View paramView) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float[] arrayOfFloat = this.o00Ooo0.o0O00o0;
    int i = this.o00OoOoo;
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    arrayOfFloat[i] = f;
    this.o00Ooo00.postInvalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.footer.BallPulseFooter.1
 * JD-Core Version:    0.7.0.1
 */