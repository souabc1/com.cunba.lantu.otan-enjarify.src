package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class FadeProvider$2
  extends AnimatorListenerAdapter
{
  public FadeProvider$2(View paramView, float paramFloat) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.val$view;
    float f = this.val$originalAlpha;
    paramAnimator.setAlpha(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.FadeProvider.2
 * JD-Core Version:    0.7.0.1
 */