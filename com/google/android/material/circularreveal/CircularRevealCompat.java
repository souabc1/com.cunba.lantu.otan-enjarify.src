package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import m54207b69;

public final class CircularRevealCompat
{
  public static Animator createCircularReveal(CircularRevealWidget paramCircularRevealWidget, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    Object localObject1 = CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL;
    Object localObject2 = CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL;
    int i = 1;
    CircularRevealWidget.RevealInfo[] arrayOfRevealInfo = new CircularRevealWidget.RevealInfo[i];
    CircularRevealWidget.RevealInfo localRevealInfo = new com/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;
    localRevealInfo.<init>(paramFloat1, paramFloat2, paramFloat3);
    arrayOfRevealInfo[0] = localRevealInfo;
    localObject1 = ObjectAnimator.ofObject(paramCircularRevealWidget, (Property)localObject1, (TypeEvaluator)localObject2, arrayOfRevealInfo);
    localObject2 = paramCircularRevealWidget.getRevealInfo();
    if (localObject2 != null)
    {
      float f = ((CircularRevealWidget.RevealInfo)localObject2).radius;
      paramCircularRevealWidget = (View)paramCircularRevealWidget;
      int j = (int)paramFloat1;
      int k = (int)paramFloat2;
      paramCircularRevealWidget = ViewAnimationUtils.createCircularReveal(paramCircularRevealWidget, j, k, f, paramFloat3);
      localObject3 = new android/animation/AnimatorSet;
      ((AnimatorSet)localObject3).<init>();
      Animator[] arrayOfAnimator = new Animator[2];
      arrayOfAnimator[0] = localObject1;
      arrayOfAnimator[i] = paramCircularRevealWidget;
      ((AnimatorSet)localObject3).playTogether(arrayOfAnimator);
      return localObject3;
    }
    paramCircularRevealWidget = new java/lang/IllegalStateException;
    Object localObject3 = m54207b69.F54207b69_11("CE06252B2C243C6B2F383F3B70422D3F7434763D3D3F7D414741427F323C503E43492D4D464E8A4D474B53614B91535258595D5D55996663636EA4");
    paramCircularRevealWidget.<init>((String)localObject3);
    throw paramCircularRevealWidget;
  }
  
  public static Animator createCircularReveal(CircularRevealWidget paramCircularRevealWidget, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Object localObject = CircularRevealWidget.CircularRevealProperty.CIRCULAR_REVEAL;
    TypeEvaluator localTypeEvaluator = CircularRevealWidget.CircularRevealEvaluator.CIRCULAR_REVEAL;
    int i = 2;
    CircularRevealWidget.RevealInfo[] arrayOfRevealInfo = new CircularRevealWidget.RevealInfo[i];
    CircularRevealWidget.RevealInfo localRevealInfo = new com/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;
    localRevealInfo.<init>(paramFloat1, paramFloat2, paramFloat3);
    arrayOfRevealInfo[0] = localRevealInfo;
    localRevealInfo = new com/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;
    localRevealInfo.<init>(paramFloat1, paramFloat2, paramFloat4);
    int j = 1;
    arrayOfRevealInfo[j] = localRevealInfo;
    localObject = ObjectAnimator.ofObject(paramCircularRevealWidget, (Property)localObject, localTypeEvaluator, arrayOfRevealInfo);
    paramCircularRevealWidget = (View)paramCircularRevealWidget;
    int k = (int)paramFloat1;
    int m = (int)paramFloat2;
    paramCircularRevealWidget = ViewAnimationUtils.createCircularReveal(paramCircularRevealWidget, k, m, paramFloat3, paramFloat4);
    AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
    localAnimatorSet.<init>();
    Animator[] arrayOfAnimator = new Animator[i];
    arrayOfAnimator[0] = localObject;
    arrayOfAnimator[j] = paramCircularRevealWidget;
    localAnimatorSet.playTogether(arrayOfAnimator);
    return localAnimatorSet;
  }
  
  public static Animator.AnimatorListener createCircularRevealListener(CircularRevealWidget paramCircularRevealWidget)
  {
    CircularRevealCompat.1 local1 = new com/google/android/material/circularreveal/CircularRevealCompat$1;
    local1.<init>(paramCircularRevealWidget);
    return local1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.circularreveal.CircularRevealCompat
 * JD-Core Version:    0.7.0.1
 */