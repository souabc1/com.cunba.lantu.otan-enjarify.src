package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExpandCollapseAnimationHelper
{
  private ValueAnimator.AnimatorUpdateListener additionalUpdateListener;
  private final View collapsedView;
  private int collapsedViewOffsetY;
  private long duration;
  private final List endAnchoredViews;
  private final View expandedView;
  private int expandedViewOffsetY;
  private final List listeners;
  
  public ExpandCollapseAnimationHelper(View paramView1, View paramView2)
  {
    this.collapsedView = paramView1;
    this.expandedView = paramView2;
    paramView1 = new java/util/ArrayList;
    paramView1.<init>();
    this.listeners = paramView1;
    paramView1 = new java/util/ArrayList;
    paramView1.<init>();
    this.endAnchoredViews = paramView1;
  }
  
  private void addListeners(Animator paramAnimator, List paramList)
  {
    paramList = paramList.iterator();
    for (;;)
    {
      boolean bool = paramList.hasNext();
      if (!bool) {
        break;
      }
      AnimatorListenerAdapter localAnimatorListenerAdapter = (AnimatorListenerAdapter)paramList.next();
      paramAnimator.addListener(localAnimatorListenerAdapter);
    }
  }
  
  private AnimatorSet getAnimatorSet(boolean paramBoolean)
  {
    AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
    localAnimatorSet.<init>();
    Animator[] arrayOfAnimator = new Animator[3];
    Animator localAnimator1 = getExpandCollapseAnimator(paramBoolean);
    arrayOfAnimator[0] = localAnimator1;
    localAnimator1 = getExpandedViewChildrenAlphaAnimator(paramBoolean);
    arrayOfAnimator[1] = localAnimator1;
    Animator localAnimator2 = getEndAnchoredViewsTranslateAnimator(paramBoolean);
    arrayOfAnimator[2] = localAnimator2;
    localAnimatorSet.playTogether(arrayOfAnimator);
    return localAnimatorSet;
  }
  
  private Animator getEndAnchoredViewsTranslateAnimator(boolean paramBoolean)
  {
    int i = this.expandedView.getLeft();
    int j = this.collapsedView.getLeft();
    i -= j;
    j = this.collapsedView.getRight();
    int k = this.expandedView.getRight();
    j -= k;
    i += j;
    Object localObject = new float[2];
    float f = i;
    localObject[0] = f;
    localObject[1] = 0.0F;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat((float[])localObject);
    localObject = MultiViewUpdateListener.translationXListener(this.endAnchoredViews);
    localValueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject);
    long l = this.duration;
    localValueAnimator.setDuration(l);
    localObject = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    TimeInterpolator localTimeInterpolator = ReversableAnimatedValueInterpolator.of(paramBoolean, (TimeInterpolator)localObject);
    localValueAnimator.setInterpolator(localTimeInterpolator);
    return localValueAnimator;
  }
  
  private Animator getExpandCollapseAnimator(boolean paramBoolean)
  {
    Object localObject1 = this.collapsedView;
    int i = this.collapsedViewOffsetY;
    localObject1 = ViewUtils.calculateRectFromBounds((View)localObject1, i);
    Object localObject2 = this.expandedView;
    int j = this.expandedViewOffsetY;
    localObject2 = ViewUtils.calculateRectFromBounds((View)localObject2, j);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>((Rect)localObject1);
    RectEvaluator localRectEvaluator = new com/google/android/material/internal/RectEvaluator;
    localRectEvaluator.<init>(localRect);
    localObject1 = new Object[] { localObject1, localObject2 };
    localObject1 = ValueAnimator.ofObject(localRectEvaluator, (Object[])localObject1);
    localObject2 = new com/google/android/material/internal/OooO00o;
    ((OooO00o)localObject2).<init>(this, localRect);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    localObject2 = this.additionalUpdateListener;
    if (localObject2 != null) {
      ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    }
    long l = this.duration;
    ((ValueAnimator)localObject1).setDuration(l);
    localObject2 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    TimeInterpolator localTimeInterpolator = ReversableAnimatedValueInterpolator.of(paramBoolean, (TimeInterpolator)localObject2);
    ((ValueAnimator)localObject1).setInterpolator(localTimeInterpolator);
    return localObject1;
  }
  
  private Animator getExpandedViewChildrenAlphaAnimator(boolean paramBoolean)
  {
    Object localObject1 = ViewUtils.getChildren(this.expandedView);
    Object localObject2 = new float[2];
    Object tmp13_12 = localObject2;
    tmp13_12[0] = 0.0F;
    tmp13_12[1] = 1.0F;
    localObject2 = ValueAnimator.ofFloat((float[])localObject2);
    localObject1 = MultiViewUpdateListener.alphaListener((Collection)localObject1);
    ((ValueAnimator)localObject2).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject1);
    long l = this.duration;
    ((ValueAnimator)localObject2).setDuration(l);
    localObject1 = AnimationUtils.LINEAR_INTERPOLATOR;
    TimeInterpolator localTimeInterpolator = ReversableAnimatedValueInterpolator.of(paramBoolean, (TimeInterpolator)localObject1);
    ((ValueAnimator)localObject2).setInterpolator(localTimeInterpolator);
    return localObject2;
  }
  
  public ExpandCollapseAnimationHelper addEndAnchoredViews(Collection paramCollection)
  {
    this.endAnchoredViews.addAll(paramCollection);
    return this;
  }
  
  public ExpandCollapseAnimationHelper addEndAnchoredViews(View... paramVarArgs)
  {
    Collections.addAll(this.endAnchoredViews, paramVarArgs);
    return this;
  }
  
  public ExpandCollapseAnimationHelper addListener(AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    this.listeners.add(paramAnimatorListenerAdapter);
    return this;
  }
  
  public Animator getCollapseAnimator()
  {
    AnimatorSet localAnimatorSet = getAnimatorSet(false);
    Object localObject = new com/google/android/material/internal/ExpandCollapseAnimationHelper$2;
    ((ExpandCollapseAnimationHelper.2)localObject).<init>(this);
    localAnimatorSet.addListener((Animator.AnimatorListener)localObject);
    localObject = this.listeners;
    addListeners(localAnimatorSet, (List)localObject);
    return localAnimatorSet;
  }
  
  public Animator getExpandAnimator()
  {
    AnimatorSet localAnimatorSet = getAnimatorSet(true);
    Object localObject = new com/google/android/material/internal/ExpandCollapseAnimationHelper$1;
    ((ExpandCollapseAnimationHelper.1)localObject).<init>(this);
    localAnimatorSet.addListener((Animator.AnimatorListener)localObject);
    localObject = this.listeners;
    addListeners(localAnimatorSet, (List)localObject);
    return localAnimatorSet;
  }
  
  public ExpandCollapseAnimationHelper setAdditionalUpdateListener(ValueAnimator.AnimatorUpdateListener paramAnimatorUpdateListener)
  {
    this.additionalUpdateListener = paramAnimatorUpdateListener;
    return this;
  }
  
  public ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int paramInt)
  {
    this.collapsedViewOffsetY = paramInt;
    return this;
  }
  
  public ExpandCollapseAnimationHelper setDuration(long paramLong)
  {
    this.duration = paramLong;
    return this;
  }
  
  public ExpandCollapseAnimationHelper setExpandedViewOffsetY(int paramInt)
  {
    this.expandedViewOffsetY = paramInt;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ExpandCollapseAnimationHelper
 * JD-Core Version:    0.7.0.1
 */