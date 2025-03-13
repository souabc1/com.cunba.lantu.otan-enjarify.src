package com.google.android.material.progressindicator;

import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;

abstract class IndeterminateAnimatorDelegate
{
  protected IndeterminateDrawable drawable;
  protected final int[] segmentColors;
  protected final float[] segmentPositions;
  
  public IndeterminateAnimatorDelegate(int paramInt)
  {
    float[] arrayOfFloat = new float[paramInt * 2];
    this.segmentPositions = arrayOfFloat;
    int[] arrayOfInt = new int[paramInt];
    this.segmentColors = arrayOfInt;
  }
  
  public abstract void cancelAnimatorImmediately();
  
  public float getFractionInRange(int paramInt1, int paramInt2, int paramInt3)
  {
    float f1 = paramInt1 - paramInt2;
    float f2 = paramInt3;
    return f1 / f2;
  }
  
  public abstract void invalidateSpecValues();
  
  public abstract void registerAnimatorsCompleteCallback(Animatable2Compat.AnimationCallback paramAnimationCallback);
  
  public void registerDrawable(IndeterminateDrawable paramIndeterminateDrawable)
  {
    this.drawable = paramIndeterminateDrawable;
  }
  
  public abstract void requestCancelAnimatorAfterCurrentCycle();
  
  public abstract void startAnimator();
  
  public abstract void unregisterAnimatorsCompleteCallback();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
 * JD-Core Version:    0.7.0.1
 */