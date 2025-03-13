package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.widget.TextView;

class TextScale$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public TextScale$1(TextScale paramTextScale, TextView paramTextView) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.val$view.setScaleX(f);
    this.val$view.setScaleY(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.TextScale.1
 * JD-Core Version:    0.7.0.1
 */