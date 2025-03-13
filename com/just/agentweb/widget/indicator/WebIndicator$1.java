package com.just.agentweb.widget.indicator;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class WebIndicator$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public WebIndicator$1(WebIndicator paramWebIndicator) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    WebIndicator.OooO0O0(this.o00OoOoo, f);
    this.o00OoOoo.invalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.widget.indicator.WebIndicator.1
 * JD-Core Version:    0.7.0.1
 */