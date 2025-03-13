package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

public abstract interface VisibilityAnimatorProvider
{
  public abstract Animator createAppear(ViewGroup paramViewGroup, View paramView);
  
  public abstract Animator createDisappear(ViewGroup paramViewGroup, View paramView);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.VisibilityAnimatorProvider
 * JD-Core Version:    0.7.0.1
 */