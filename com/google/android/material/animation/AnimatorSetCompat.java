package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

public class AnimatorSetCompat
{
  public static void playTogether(AnimatorSet paramAnimatorSet, List paramList)
  {
    int i = paramList.size();
    long l1 = 0L;
    int j = 0;
    while (j < i)
    {
      Animator localAnimator = (Animator)paramList.get(j);
      long l2 = localAnimator.getStartDelay();
      long l3 = localAnimator.getDuration();
      l2 += l3;
      l1 = Math.max(l1, l2);
      j += 1;
    }
    ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { 0, 0 });
    localValueAnimator.setDuration(l1);
    paramList.add(0, localValueAnimator);
    paramAnimatorSet.playTogether(paramList);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.animation.AnimatorSetCompat
 * JD-Core Version:    0.7.0.1
 */