package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class FabTransformationBehavior$1
  extends AnimatorListenerAdapter
{
  public FabTransformationBehavior$1(FabTransformationBehavior paramFabTransformationBehavior, boolean paramBoolean, View paramView1, View paramView2) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    boolean bool = this.val$expanded;
    if (!bool)
    {
      this.val$child.setVisibility(4);
      this.val$dependency.setAlpha(1.0F);
      paramAnimator = this.val$dependency;
      paramAnimator.setVisibility(0);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    boolean bool = this.val$expanded;
    if (bool)
    {
      this.val$child.setVisibility(0);
      this.val$dependency.setAlpha(0.0F);
      paramAnimator = this.val$dependency;
      int i = 4;
      paramAnimator.setVisibility(i);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transformation.FabTransformationBehavior.1
 * JD-Core Version:    0.7.0.1
 */