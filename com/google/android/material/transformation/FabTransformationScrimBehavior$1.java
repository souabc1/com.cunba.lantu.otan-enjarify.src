package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class FabTransformationScrimBehavior$1
  extends AnimatorListenerAdapter
{
  public FabTransformationScrimBehavior$1(FabTransformationScrimBehavior paramFabTransformationScrimBehavior, boolean paramBoolean, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    boolean bool = this.val$expanded;
    if (!bool)
    {
      paramAnimator = this.val$child;
      int i = 4;
      paramAnimator.setVisibility(i);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    boolean bool = this.val$expanded;
    if (bool)
    {
      paramAnimator = this.val$child;
      paramAnimator.setVisibility(0);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transformation.FabTransformationScrimBehavior.1
 * JD-Core Version:    0.7.0.1
 */