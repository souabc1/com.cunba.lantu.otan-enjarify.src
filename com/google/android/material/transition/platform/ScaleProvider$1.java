package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class ScaleProvider$1
  extends AnimatorListenerAdapter
{
  public ScaleProvider$1(View paramView, float paramFloat1, float paramFloat2) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.val$view;
    float f = this.val$originalScaleX;
    paramAnimator.setScaleX(f);
    paramAnimator = this.val$view;
    f = this.val$originalScaleY;
    paramAnimator.setScaleY(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.platform.ScaleProvider.1
 * JD-Core Version:    0.7.0.1
 */