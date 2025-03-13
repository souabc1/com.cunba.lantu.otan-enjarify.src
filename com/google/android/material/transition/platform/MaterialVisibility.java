package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class MaterialVisibility
  extends Visibility
{
  private final List additionalAnimatorProviders;
  private final VisibilityAnimatorProvider primaryAnimatorProvider;
  private VisibilityAnimatorProvider secondaryAnimatorProvider;
  
  public MaterialVisibility(VisibilityAnimatorProvider paramVisibilityAnimatorProvider1, VisibilityAnimatorProvider paramVisibilityAnimatorProvider2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.additionalAnimatorProviders = localArrayList;
    this.primaryAnimatorProvider = paramVisibilityAnimatorProvider1;
    this.secondaryAnimatorProvider = paramVisibilityAnimatorProvider2;
  }
  
  private static void addAnimatorIfNeeded(List paramList, VisibilityAnimatorProvider paramVisibilityAnimatorProvider, ViewGroup paramViewGroup, View paramView, boolean paramBoolean)
  {
    if (paramVisibilityAnimatorProvider == null) {
      return;
    }
    if (paramBoolean) {
      paramVisibilityAnimatorProvider = paramVisibilityAnimatorProvider.createAppear(paramViewGroup, paramView);
    } else {
      paramVisibilityAnimatorProvider = paramVisibilityAnimatorProvider.createDisappear(paramViewGroup, paramView);
    }
    if (paramVisibilityAnimatorProvider != null) {
      paramList.add(paramVisibilityAnimatorProvider);
    }
  }
  
  private Animator createAnimator(ViewGroup paramViewGroup, View paramView, boolean paramBoolean)
  {
    AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
    localAnimatorSet.<init>();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = this.primaryAnimatorProvider;
    addAnimatorIfNeeded(localArrayList, (VisibilityAnimatorProvider)localObject, paramViewGroup, paramView, paramBoolean);
    localObject = this.secondaryAnimatorProvider;
    addAnimatorIfNeeded(localArrayList, (VisibilityAnimatorProvider)localObject, paramViewGroup, paramView, paramBoolean);
    localObject = this.additionalAnimatorProviders.iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject).hasNext();
      if (!bool) {
        break;
      }
      VisibilityAnimatorProvider localVisibilityAnimatorProvider = (VisibilityAnimatorProvider)((Iterator)localObject).next();
      addAnimatorIfNeeded(localArrayList, localVisibilityAnimatorProvider, paramViewGroup, paramView, paramBoolean);
    }
    paramViewGroup = paramViewGroup.getContext();
    maybeApplyThemeValues(paramViewGroup, paramBoolean);
    AnimatorSetCompat.playTogether(localAnimatorSet, localArrayList);
    return localAnimatorSet;
  }
  
  private void maybeApplyThemeValues(Context paramContext, boolean paramBoolean)
  {
    int i = getDurationThemeAttrResId(paramBoolean);
    TransitionUtils.maybeApplyThemeDuration(this, paramContext, i);
    i = getEasingThemeAttrResId(paramBoolean);
    TimeInterpolator localTimeInterpolator = getDefaultEasingInterpolator(paramBoolean);
    TransitionUtils.maybeApplyThemeInterpolator(this, paramContext, i, localTimeInterpolator);
  }
  
  public void addAdditionalAnimatorProvider(VisibilityAnimatorProvider paramVisibilityAnimatorProvider)
  {
    this.additionalAnimatorProviders.add(paramVisibilityAnimatorProvider);
  }
  
  public void clearAdditionalAnimatorProvider()
  {
    this.additionalAnimatorProviders.clear();
  }
  
  public TimeInterpolator getDefaultEasingInterpolator(boolean paramBoolean)
  {
    return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
  }
  
  public int getDurationThemeAttrResId(boolean paramBoolean)
  {
    return 0;
  }
  
  public int getEasingThemeAttrResId(boolean paramBoolean)
  {
    return 0;
  }
  
  public VisibilityAnimatorProvider getPrimaryAnimatorProvider()
  {
    return this.primaryAnimatorProvider;
  }
  
  public VisibilityAnimatorProvider getSecondaryAnimatorProvider()
  {
    return this.secondaryAnimatorProvider;
  }
  
  public Animator onAppear(ViewGroup paramViewGroup, View paramView, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    return createAnimator(paramViewGroup, paramView, true);
  }
  
  public Animator onDisappear(ViewGroup paramViewGroup, View paramView, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    return createAnimator(paramViewGroup, paramView, false);
  }
  
  public boolean removeAdditionalAnimatorProvider(VisibilityAnimatorProvider paramVisibilityAnimatorProvider)
  {
    return this.additionalAnimatorProviders.remove(paramVisibilityAnimatorProvider);
  }
  
  public void setSecondaryAnimatorProvider(VisibilityAnimatorProvider paramVisibilityAnimatorProvider)
  {
    this.secondaryAnimatorProvider = paramVisibilityAnimatorProvider;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.platform.MaterialVisibility
 * JD-Core Version:    0.7.0.1
 */