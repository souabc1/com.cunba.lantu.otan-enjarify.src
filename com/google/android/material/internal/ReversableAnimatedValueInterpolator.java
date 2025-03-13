package com.google.android.material.internal;

import android.animation.TimeInterpolator;

public class ReversableAnimatedValueInterpolator
  implements TimeInterpolator
{
  private final TimeInterpolator sourceInterpolator;
  
  public ReversableAnimatedValueInterpolator(TimeInterpolator paramTimeInterpolator)
  {
    this.sourceInterpolator = paramTimeInterpolator;
  }
  
  public static TimeInterpolator of(boolean paramBoolean, TimeInterpolator paramTimeInterpolator)
  {
    if (paramBoolean) {
      return paramTimeInterpolator;
    }
    ReversableAnimatedValueInterpolator localReversableAnimatedValueInterpolator = new com/google/android/material/internal/ReversableAnimatedValueInterpolator;
    localReversableAnimatedValueInterpolator.<init>(paramTimeInterpolator);
    return localReversableAnimatedValueInterpolator;
  }
  
  public float getInterpolation(float paramFloat)
  {
    paramFloat = this.sourceInterpolator.getInterpolation(paramFloat);
    return 1.0F - paramFloat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ReversableAnimatedValueInterpolator
 * JD-Core Version:    0.7.0.1
 */