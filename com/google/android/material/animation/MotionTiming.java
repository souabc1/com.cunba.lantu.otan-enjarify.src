package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import m54207b69;

public class MotionTiming
{
  private long delay;
  private long duration;
  private TimeInterpolator interpolator;
  private int repeatCount;
  private int repeatMode;
  
  public MotionTiming(long paramLong1, long paramLong2)
  {
    this.interpolator = null;
    this.repeatCount = 0;
    this.repeatMode = 1;
    this.delay = paramLong1;
    this.duration = paramLong2;
  }
  
  public MotionTiming(long paramLong1, long paramLong2, TimeInterpolator paramTimeInterpolator)
  {
    this.repeatCount = 0;
    this.repeatMode = 1;
    this.delay = paramLong1;
    this.duration = paramLong2;
    this.interpolator = paramTimeInterpolator;
  }
  
  public static MotionTiming createFromAnimator(ValueAnimator paramValueAnimator)
  {
    MotionTiming localMotionTiming = new com/google/android/material/animation/MotionTiming;
    long l1 = paramValueAnimator.getStartDelay();
    long l2 = paramValueAnimator.getDuration();
    TimeInterpolator localTimeInterpolator = getInterpolatorCompat(paramValueAnimator);
    localMotionTiming.<init>(l1, l2, localTimeInterpolator);
    int i = paramValueAnimator.getRepeatCount();
    localMotionTiming.repeatCount = i;
    int j = paramValueAnimator.getRepeatMode();
    localMotionTiming.repeatMode = j;
    return localMotionTiming;
  }
  
  private static TimeInterpolator getInterpolatorCompat(ValueAnimator paramValueAnimator)
  {
    paramValueAnimator = paramValueAnimator.getInterpolator();
    boolean bool = paramValueAnimator instanceof AccelerateDecelerateInterpolator;
    if ((!bool) && (paramValueAnimator != null))
    {
      bool = paramValueAnimator instanceof AccelerateInterpolator;
      if (bool) {
        return AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
      }
      bool = paramValueAnimator instanceof DecelerateInterpolator;
      if (bool) {
        paramValueAnimator = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
      }
      return paramValueAnimator;
    }
    return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
  }
  
  public void apply(Animator paramAnimator)
  {
    long l = getDelay();
    paramAnimator.setStartDelay(l);
    l = getDuration();
    paramAnimator.setDuration(l);
    TimeInterpolator localTimeInterpolator = getInterpolator();
    paramAnimator.setInterpolator(localTimeInterpolator);
    boolean bool = paramAnimator instanceof ValueAnimator;
    if (bool)
    {
      paramAnimator = (ValueAnimator)paramAnimator;
      int i = getRepeatCount();
      paramAnimator.setRepeatCount(i);
      i = getRepeatMode();
      paramAnimator.setRepeatMode(i);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    boolean bool = paramObject instanceof MotionTiming;
    if (!bool) {
      return false;
    }
    paramObject = (MotionTiming)paramObject;
    long l1 = getDelay();
    long l2 = paramObject.getDelay();
    bool = l1 < l2;
    if (bool) {
      return false;
    }
    l1 = getDuration();
    l2 = paramObject.getDuration();
    bool = l1 < l2;
    if (bool) {
      return false;
    }
    int i = getRepeatCount();
    int j = paramObject.getRepeatCount();
    if (i != j) {
      return false;
    }
    i = getRepeatMode();
    j = paramObject.getRepeatMode();
    if (i != j) {
      return false;
    }
    Class localClass = getInterpolator().getClass();
    paramObject = paramObject.getInterpolator().getClass();
    return localClass.equals(paramObject);
  }
  
  public long getDelay()
  {
    return this.delay;
  }
  
  public long getDuration()
  {
    return this.duration;
  }
  
  public TimeInterpolator getInterpolator()
  {
    TimeInterpolator localTimeInterpolator = this.interpolator;
    if (localTimeInterpolator == null) {
      localTimeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }
    return localTimeInterpolator;
  }
  
  public int getRepeatCount()
  {
    return this.repeatCount;
  }
  
  public int getRepeatMode()
  {
    return this.repeatMode;
  }
  
  public int hashCode()
  {
    long l1 = getDelay();
    long l2 = getDelay();
    int i = 32;
    l2 >>>= i;
    int j = (int)(l1 ^ l2) * 31;
    long l3 = getDuration();
    long l4 = getDuration() >>> i;
    int k = (int)(l3 ^ l4);
    j = (j + k) * 31;
    k = getInterpolator().getClass().hashCode();
    j = (j + k) * 31;
    k = getRepeatCount();
    j = (j + k) * 31;
    k = getRepeatMode();
    return j + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append('\n');
    Object localObject = getClass().getName();
    localStringBuilder.append((String)localObject);
    localStringBuilder.append('{');
    localObject = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("Gx581D1F171D06485F");
    localStringBuilder.append((String)localObject);
    long l = getDelay();
    localStringBuilder.append(l);
    localObject = m54207b69.F54207b69_11("6'074454584A58544F512611");
    localStringBuilder.append((String)localObject);
    l = getDuration();
    localStringBuilder.append(l);
    localObject = m54207b69.F54207b69_11("8R723C3E293B252844463C30482C7580");
    localStringBuilder.append((String)localObject);
    localObject = getInterpolator().getClass();
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("/,0C5F4B5F4D525E764B624C632219");
    localStringBuilder.append((String)localObject);
    int i = getRepeatCount();
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("2'0756445A464B5971504C4C2813");
    localStringBuilder.append((String)localObject);
    i = getRepeatMode();
    localStringBuilder.append(i);
    localStringBuilder.append("}\n");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.animation.MotionTiming
 * JD-Core Version:    0.7.0.1
 */