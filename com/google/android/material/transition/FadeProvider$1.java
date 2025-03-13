package com.google.android.material.transition;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class FadeProvider$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public FadeProvider$1(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f1 = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    View localView = this.val$view;
    float f2 = this.val$startValue;
    float f3 = this.val$endValue;
    float f4 = this.val$startFraction;
    float f5 = this.val$endFraction;
    f1 = TransitionUtils.lerp(f2, f3, f4, f5, f1);
    localView.setAlpha(f1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.FadeProvider.1
 * JD-Core Version:    0.7.0.1
 */