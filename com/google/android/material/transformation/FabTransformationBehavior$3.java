package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.CircularRevealWidget;

class FabTransformationBehavior$3
  extends AnimatorListenerAdapter
{
  public FabTransformationBehavior$3(FabTransformationBehavior paramFabTransformationBehavior, CircularRevealWidget paramCircularRevealWidget, Drawable paramDrawable) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.val$circularRevealChild.setCircularRevealOverlayDrawable(null);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = this.val$circularRevealChild;
    Drawable localDrawable = this.val$icon;
    paramAnimator.setCircularRevealOverlayDrawable(localDrawable);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transformation.FabTransformationBehavior.3
 * JD-Core Version:    0.7.0.1
 */