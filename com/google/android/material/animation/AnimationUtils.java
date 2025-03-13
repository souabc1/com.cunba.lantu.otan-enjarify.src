package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

public class AnimationUtils
{
  public static final TimeInterpolator DECELERATE_INTERPOLATOR;
  public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR;
  public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR;
  public static final TimeInterpolator LINEAR_INTERPOLATOR;
  public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR;
  
  static
  {
    Object localObject = new android/view/animation/LinearInterpolator;
    ((LinearInterpolator)localObject).<init>();
    LINEAR_INTERPOLATOR = (TimeInterpolator)localObject;
    localObject = new androidx/interpolator/view/animation/FastOutSlowInInterpolator;
    ((FastOutSlowInInterpolator)localObject).<init>();
    FAST_OUT_SLOW_IN_INTERPOLATOR = (TimeInterpolator)localObject;
    localObject = new androidx/interpolator/view/animation/FastOutLinearInInterpolator;
    ((FastOutLinearInInterpolator)localObject).<init>();
    FAST_OUT_LINEAR_IN_INTERPOLATOR = (TimeInterpolator)localObject;
    localObject = new androidx/interpolator/view/animation/LinearOutSlowInInterpolator;
    ((LinearOutSlowInInterpolator)localObject).<init>();
    LINEAR_OUT_SLOW_IN_INTERPOLATOR = (TimeInterpolator)localObject;
    localObject = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject).<init>();
    DECELERATE_INTERPOLATOR = (TimeInterpolator)localObject;
  }
  
  public static float lerp(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramFloat2 -= paramFloat1;
    paramFloat3 *= paramFloat2;
    return paramFloat1 + paramFloat3;
  }
  
  public static float lerp(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
    boolean bool = paramFloat5 < paramFloat3;
    if (!bool) {
      return paramFloat1;
    }
    bool = paramFloat5 < paramFloat4;
    if (!bool) {
      return paramFloat2;
    }
    paramFloat5 -= paramFloat3;
    paramFloat4 -= paramFloat3;
    paramFloat5 /= paramFloat4;
    return lerp(paramFloat1, paramFloat2, paramFloat5);
  }
  
  public static int lerp(int paramInt1, int paramInt2, float paramFloat)
  {
    float f = paramInt2 - paramInt1;
    paramInt2 = Math.round(paramFloat * f);
    return paramInt1 + paramInt2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.animation.AnimationUtils
 * JD-Core Version:    0.7.0.1
 */