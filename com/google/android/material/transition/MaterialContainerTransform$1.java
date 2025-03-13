package com.google.android.material.transition;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class MaterialContainerTransform$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public MaterialContainerTransform$1(MaterialContainerTransform paramMaterialContainerTransform, MaterialContainerTransform.TransitionDrawable paramTransitionDrawable) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    MaterialContainerTransform.TransitionDrawable localTransitionDrawable = this.val$transitionDrawable;
    float f = paramValueAnimator.getAnimatedFraction();
    MaterialContainerTransform.TransitionDrawable.access$200(localTransitionDrawable, f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.MaterialContainerTransform.1
 * JD-Core Version:    0.7.0.1
 */