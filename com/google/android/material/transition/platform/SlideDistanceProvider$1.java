package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class SlideDistanceProvider$1
  extends AnimatorListenerAdapter
{
  public SlideDistanceProvider$1(View paramView, float paramFloat) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.val$view;
    float f = this.val$originalTranslation;
    paramAnimator.setTranslationX(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.platform.SlideDistanceProvider.1
 * JD-Core Version:    0.7.0.1
 */