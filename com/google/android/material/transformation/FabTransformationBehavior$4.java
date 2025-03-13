package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.CircularRevealWidget;

class FabTransformationBehavior$4
  extends AnimatorListenerAdapter
{
  public FabTransformationBehavior$4(FabTransformationBehavior paramFabTransformationBehavior, CircularRevealWidget paramCircularRevealWidget) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.val$circularRevealChild.getRevealInfo();
    paramAnimator.radius = 3.4028235E+38F;
    this.val$circularRevealChild.setRevealInfo(paramAnimator);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transformation.FabTransformationBehavior.4
 * JD-Core Version:    0.7.0.1
 */