package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

public final class StateListAnimator
{
  private final Animator.AnimatorListener animationListener;
  private StateListAnimator.Tuple lastMatch;
  ValueAnimator runningAnimator;
  private final ArrayList tuples;
  
  public StateListAnimator()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.tuples = ((ArrayList)localObject);
    this.lastMatch = null;
    this.runningAnimator = null;
    localObject = new com/google/android/material/internal/StateListAnimator$1;
    ((StateListAnimator.1)localObject).<init>(this);
    this.animationListener = ((Animator.AnimatorListener)localObject);
  }
  
  private void cancel()
  {
    ValueAnimator localValueAnimator = this.runningAnimator;
    if (localValueAnimator != null)
    {
      localValueAnimator.cancel();
      localValueAnimator = null;
      this.runningAnimator = null;
    }
  }
  
  private void start(StateListAnimator.Tuple paramTuple)
  {
    paramTuple = paramTuple.animator;
    this.runningAnimator = paramTuple;
    paramTuple.start();
  }
  
  public void addState(int[] paramArrayOfInt, ValueAnimator paramValueAnimator)
  {
    StateListAnimator.Tuple localTuple = new com/google/android/material/internal/StateListAnimator$Tuple;
    localTuple.<init>(paramArrayOfInt, paramValueAnimator);
    paramArrayOfInt = this.animationListener;
    paramValueAnimator.addListener(paramArrayOfInt);
    this.tuples.add(localTuple);
  }
  
  public void jumpToCurrentState()
  {
    ValueAnimator localValueAnimator = this.runningAnimator;
    if (localValueAnimator != null)
    {
      localValueAnimator.end();
      localValueAnimator = null;
      this.runningAnimator = null;
    }
  }
  
  public void setState(int[] paramArrayOfInt)
  {
    ArrayList localArrayList = this.tuples;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      localTuple = (StateListAnimator.Tuple)this.tuples.get(j);
      int[] arrayOfInt = localTuple.specs;
      boolean bool = StateSet.stateSetMatches(arrayOfInt, paramArrayOfInt);
      if (bool) {
        break label68;
      }
      j += 1;
    }
    StateListAnimator.Tuple localTuple = null;
    label68:
    paramArrayOfInt = this.lastMatch;
    if (localTuple == paramArrayOfInt) {
      return;
    }
    if (paramArrayOfInt != null) {
      cancel();
    }
    this.lastMatch = localTuple;
    if (localTuple != null) {
      start(localTuple);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.StateListAnimator
 * JD-Core Version:    0.7.0.1
 */