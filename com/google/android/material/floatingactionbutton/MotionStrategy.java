package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import com.google.android.material.animation.MotionSpec;
import java.util.List;

abstract interface MotionStrategy
{
  public abstract void addAnimationListener(Animator.AnimatorListener paramAnimatorListener);
  
  public abstract AnimatorSet createAnimator();
  
  public abstract MotionSpec getCurrentMotionSpec();
  
  public abstract int getDefaultMotionSpecResource();
  
  public abstract List getListeners();
  
  public abstract MotionSpec getMotionSpec();
  
  public abstract void onAnimationCancel();
  
  public abstract void onAnimationEnd();
  
  public abstract void onAnimationStart(Animator paramAnimator);
  
  public abstract void onChange(ExtendedFloatingActionButton.OnChangedCallback paramOnChangedCallback);
  
  public abstract void performNow();
  
  public abstract void removeAnimationListener(Animator.AnimatorListener paramAnimatorListener);
  
  public abstract void setMotionSpec(MotionSpec paramMotionSpec);
  
  public abstract boolean shouldCancel();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.floatingactionbutton.MotionStrategy
 * JD-Core Version:    0.7.0.1
 */