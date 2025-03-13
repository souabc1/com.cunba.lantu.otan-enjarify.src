package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

public final class Hold
  extends Visibility
{
  public Animator onAppear(ViewGroup paramViewGroup, View paramView, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    paramViewGroup = new float[1];
    paramViewGroup[0] = 0.0F;
    return ValueAnimator.ofFloat(paramViewGroup);
  }
  
  public Animator onDisappear(ViewGroup paramViewGroup, View paramView, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    paramViewGroup = new float[1];
    paramViewGroup[0] = 0.0F;
    return ValueAnimator.ofFloat(paramViewGroup);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.platform.Hold
 * JD-Core Version:    0.7.0.1
 */