package com.google.android.material.search;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class SearchBarAnimationHelper
{
  private static final long COLLAPSE_DURATION_MS = 250L;
  private static final long COLLAPSE_FADE_IN_CHILDREN_DURATION_MS = 100L;
  private static final long EXPAND_DURATION_MS = 300L;
  private static final long EXPAND_FADE_OUT_CHILDREN_DURATION_MS = 75L;
  private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_DURATION_MS = 250L;
  private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_IN_START_DELAY_MS = 500L;
  private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_OUT_START_DELAY_MS = 750L;
  private static final long ON_LOAD_ANIM_SECONDARY_DURATION_MS = 250L;
  private static final long ON_LOAD_ANIM_SECONDARY_START_DELAY_MS = 250L;
  private final Set collapseAnimationListeners;
  private boolean collapsing;
  private Animator defaultCenterViewAnimator;
  private final Set expandAnimationListeners;
  private boolean expanding;
  private final Set onLoadAnimationCallbacks;
  private boolean onLoadAnimationFadeInEnabled;
  private Animator runningExpandOrCollapseAnimator;
  private Animator secondaryViewAnimator;
  
  public SearchBarAnimationHelper()
  {
    LinkedHashSet localLinkedHashSet = new java/util/LinkedHashSet;
    localLinkedHashSet.<init>();
    this.onLoadAnimationCallbacks = localLinkedHashSet;
    localLinkedHashSet = new java/util/LinkedHashSet;
    localLinkedHashSet.<init>();
    this.expandAnimationListeners = localLinkedHashSet;
    localLinkedHashSet = new java/util/LinkedHashSet;
    localLinkedHashSet.<init>();
    this.collapseAnimationListeners = localLinkedHashSet;
    this.onLoadAnimationFadeInEnabled = true;
    this.runningExpandOrCollapseAnimator = null;
  }
  
  private void dispatchOnLoadAnimation(SearchBarAnimationHelper.OnLoadAnimationInvocation paramOnLoadAnimationInvocation)
  {
    Iterator localIterator = this.onLoadAnimationCallbacks.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      SearchBar.OnLoadAnimationCallback localOnLoadAnimationCallback = (SearchBar.OnLoadAnimationCallback)localIterator.next();
      paramOnLoadAnimationInvocation.invoke(localOnLoadAnimationCallback);
    }
  }
  
  private Animator getCollapseAnimator(SearchBar paramSearchBar, View paramView, AppBarLayout paramAppBarLayout)
  {
    paramView = getExpandCollapseAnimationHelper(paramSearchBar, paramView, paramAppBarLayout).setDuration(250L);
    paramAppBarLayout = new com/google/android/material/search/SearchBarAnimationHelper$6;
    paramAppBarLayout.<init>(this, paramSearchBar);
    return paramView.addListener(paramAppBarLayout).getCollapseAnimator();
  }
  
  private Animator getDefaultCenterViewAnimator(View paramView)
  {
    int i = 2;
    Object localObject1 = new float[i];
    Object tmp7_6 = localObject1;
    tmp7_6[0] = 0.0F;
    tmp7_6[1] = 1.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    int j = 1;
    Object localObject2 = new View[j];
    localObject2[0] = paramView;
    localObject2 = MultiViewUpdateListener.alphaListener((View[])localObject2);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    localObject2 = AnimationUtils.LINEAR_INTERPOLATOR;
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
    boolean bool = this.onLoadAnimationFadeInEnabled;
    long l1 = 250L;
    long l2 = 0L;
    long l3;
    if (bool) {
      l3 = l1;
    } else {
      l3 = l2;
    }
    ((ValueAnimator)localObject1).setDuration(l3);
    bool = this.onLoadAnimationFadeInEnabled;
    if (bool) {
      l2 = 500L;
    }
    ((ValueAnimator)localObject1).setStartDelay(l2);
    Object localObject3 = new float[i];
    Object tmp125_123 = localObject3;
    tmp125_123[0] = 1.0F;
    tmp125_123[1] = 0.0F;
    localObject3 = ValueAnimator.ofFloat((float[])localObject3);
    View[] arrayOfView = new View[j];
    arrayOfView[0] = paramView;
    paramView = MultiViewUpdateListener.alphaListener(arrayOfView);
    ((ValueAnimator)localObject3).addUpdateListener(paramView);
    ((ValueAnimator)localObject3).setInterpolator((TimeInterpolator)localObject2);
    ((ValueAnimator)localObject3).setDuration(l1);
    ((ValueAnimator)localObject3).setStartDelay(750L);
    paramView = new android/animation/AnimatorSet;
    paramView.<init>();
    Animator[] arrayOfAnimator = new Animator[i];
    arrayOfAnimator[0] = localObject1;
    arrayOfAnimator[j] = localObject3;
    paramView.playSequentially(arrayOfAnimator);
    return paramView;
  }
  
  private List getEndAnchoredViews(View paramView)
  {
    boolean bool1 = ViewUtils.isLayoutRtl(paramView);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramView instanceof ViewGroup;
    if (i != 0)
    {
      paramView = (ViewGroup)paramView;
      i = 0;
      for (;;)
      {
        int k = paramView.getChildCount();
        if (i >= k) {
          break;
        }
        View localView = paramView.getChildAt(i);
        boolean bool2;
        if (!bool1)
        {
          bool2 = localView instanceof ActionMenuView;
          if (bool2) {}
        }
        else
        {
          if (!bool1) {
            break label94;
          }
          bool2 = localView instanceof ActionMenuView;
          if (bool2) {
            break label94;
          }
        }
        localArrayList.add(localView);
        label94:
        int j;
        i += 1;
      }
    }
    return localArrayList;
  }
  
  private Animator getExpandAnimator(SearchBar paramSearchBar, View paramView, AppBarLayout paramAppBarLayout)
  {
    paramView = getExpandCollapseAnimationHelper(paramSearchBar, paramView, paramAppBarLayout).setDuration(300L);
    paramAppBarLayout = new com/google/android/material/search/SearchBarAnimationHelper$4;
    paramAppBarLayout.<init>(this, paramSearchBar);
    return paramView.addListener(paramAppBarLayout).getExpandAnimator();
  }
  
  private ExpandCollapseAnimationHelper getExpandCollapseAnimationHelper(SearchBar paramSearchBar, View paramView, AppBarLayout paramAppBarLayout)
  {
    ExpandCollapseAnimationHelper localExpandCollapseAnimationHelper = new com/google/android/material/internal/ExpandCollapseAnimationHelper;
    localExpandCollapseAnimationHelper.<init>(paramSearchBar, paramView);
    paramSearchBar = getExpandedViewBackgroundUpdateListener(paramSearchBar, paramView);
    paramSearchBar = localExpandCollapseAnimationHelper.setAdditionalUpdateListener(paramSearchBar);
    int i;
    if (paramAppBarLayout != null)
    {
      i = paramAppBarLayout.getTop();
    }
    else
    {
      i = 0;
      paramAppBarLayout = null;
    }
    paramSearchBar = paramSearchBar.setCollapsedViewOffsetY(i);
    paramView = getEndAnchoredViews(paramView);
    return paramSearchBar.addEndAnchoredViews(paramView);
  }
  
  private ValueAnimator.AnimatorUpdateListener getExpandedViewBackgroundUpdateListener(SearchBar paramSearchBar, View paramView)
  {
    MaterialShapeDrawable localMaterialShapeDrawable = MaterialShapeDrawable.createWithElevationOverlay(paramView.getContext());
    float f1 = paramSearchBar.getCornerSize();
    localMaterialShapeDrawable.setCornerSize(f1);
    float f2 = ViewCompat.OooOo0O(paramSearchBar);
    localMaterialShapeDrawable.setElevation(f2);
    paramSearchBar = new com/google/android/material/search/OooO0o;
    paramSearchBar.<init>(localMaterialShapeDrawable, paramView);
    return paramSearchBar;
  }
  
  private List getFadeChildren(SearchBar paramSearchBar)
  {
    List localList = ViewUtils.getChildren(paramSearchBar);
    View localView = paramSearchBar.getCenterView();
    if (localView != null)
    {
      paramSearchBar = paramSearchBar.getCenterView();
      localList.remove(paramSearchBar);
    }
    return localList;
  }
  
  private Animator getFadeInChildrenAnimator(SearchBar paramSearchBar)
  {
    paramSearchBar = getFadeChildren(paramSearchBar);
    Object localObject = new float[2];
    Object tmp11_10 = localObject;
    tmp11_10[0] = 0.0F;
    tmp11_10[1] = 1.0F;
    localObject = ValueAnimator.ofFloat((float[])localObject);
    paramSearchBar = MultiViewUpdateListener.alphaListener(paramSearchBar);
    ((ValueAnimator)localObject).addUpdateListener(paramSearchBar);
    ((ValueAnimator)localObject).setDuration(100);
    paramSearchBar = AnimationUtils.LINEAR_INTERPOLATOR;
    ((ValueAnimator)localObject).setInterpolator(paramSearchBar);
    return localObject;
  }
  
  private Animator getFadeOutChildrenAnimator(SearchBar paramSearchBar, View paramView)
  {
    paramSearchBar = getFadeChildren(paramSearchBar);
    Object localObject = new float[2];
    Object tmp11_10 = localObject;
    tmp11_10[0] = 1.0F;
    tmp11_10[1] = 0.0F;
    localObject = ValueAnimator.ofFloat((float[])localObject);
    paramSearchBar = MultiViewUpdateListener.alphaListener(paramSearchBar);
    ((ValueAnimator)localObject).addUpdateListener(paramSearchBar);
    paramSearchBar = new com/google/android/material/search/OooO;
    paramSearchBar.<init>(paramView);
    ((ValueAnimator)localObject).addUpdateListener(paramSearchBar);
    ((ValueAnimator)localObject).setDuration(75);
    paramSearchBar = AnimationUtils.LINEAR_INTERPOLATOR;
    ((ValueAnimator)localObject).setInterpolator(paramSearchBar);
    return localObject;
  }
  
  private Animator getSecondaryActionMenuItemAnimator(View paramView)
  {
    Object localObject = new float[2];
    Object tmp5_4 = localObject;
    tmp5_4[0] = 0.0F;
    tmp5_4[1] = 1.0F;
    localObject = ValueAnimator.ofFloat((float[])localObject);
    View[] arrayOfView = new View[1];
    arrayOfView[0] = paramView;
    paramView = MultiViewUpdateListener.alphaListener(arrayOfView);
    ((ValueAnimator)localObject).addUpdateListener(paramView);
    paramView = AnimationUtils.LINEAR_INTERPOLATOR;
    ((ValueAnimator)localObject).setInterpolator(paramView);
    ((ValueAnimator)localObject).setDuration(250L);
    return localObject;
  }
  
  private Animator getSecondaryViewAnimator(TextView paramTextView, View paramView)
  {
    AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
    localAnimatorSet.<init>();
    long l = 250L;
    localAnimatorSet.setStartDelay(l);
    paramTextView = getTextViewAnimator(paramTextView);
    localAnimatorSet.play(paramTextView);
    if (paramView != null)
    {
      paramTextView = getSecondaryActionMenuItemAnimator(paramView);
      localAnimatorSet.play(paramTextView);
    }
    return localAnimatorSet;
  }
  
  private Animator getTextViewAnimator(TextView paramTextView)
  {
    Object localObject = new float[2];
    Object tmp5_4 = localObject;
    tmp5_4[0] = 0.0F;
    tmp5_4[1] = 1.0F;
    localObject = ValueAnimator.ofFloat((float[])localObject);
    View[] arrayOfView = new View[1];
    arrayOfView[0] = paramTextView;
    paramTextView = MultiViewUpdateListener.alphaListener(arrayOfView);
    ((ValueAnimator)localObject).addUpdateListener(paramTextView);
    paramTextView = AnimationUtils.LINEAR_INTERPOLATOR;
    ((ValueAnimator)localObject).setInterpolator(paramTextView);
    ((ValueAnimator)localObject).setDuration(250L);
    return localObject;
  }
  
  public void addCollapseAnimationListener(AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    this.collapseAnimationListeners.add(paramAnimatorListenerAdapter);
  }
  
  public void addExpandAnimationListener(AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    this.expandAnimationListeners.add(paramAnimatorListenerAdapter);
  }
  
  public void addOnLoadAnimationCallback(SearchBar.OnLoadAnimationCallback paramOnLoadAnimationCallback)
  {
    this.onLoadAnimationCallbacks.add(paramOnLoadAnimationCallback);
  }
  
  public boolean isCollapsing()
  {
    return this.collapsing;
  }
  
  public boolean isExpanding()
  {
    return this.expanding;
  }
  
  public boolean isOnLoadAnimationFadeInEnabled()
  {
    return this.onLoadAnimationFadeInEnabled;
  }
  
  public boolean removeCollapseAnimationListener(AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    return this.collapseAnimationListeners.remove(paramAnimatorListenerAdapter);
  }
  
  public boolean removeExpandAnimationListener(AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    return this.expandAnimationListeners.remove(paramAnimatorListenerAdapter);
  }
  
  public boolean removeOnLoadAnimationCallback(SearchBar.OnLoadAnimationCallback paramOnLoadAnimationCallback)
  {
    return this.onLoadAnimationCallbacks.remove(paramOnLoadAnimationCallback);
  }
  
  public void setOnLoadAnimationFadeInEnabled(boolean paramBoolean)
  {
    this.onLoadAnimationFadeInEnabled = paramBoolean;
  }
  
  public void startCollapseAnimation(SearchBar paramSearchBar, View paramView, AppBarLayout paramAppBarLayout, boolean paramBoolean)
  {
    boolean bool1 = isExpanding();
    if (bool1)
    {
      Animator localAnimator = this.runningExpandOrCollapseAnimator;
      if (localAnimator != null) {
        localAnimator.cancel();
      }
    }
    bool1 = true;
    this.collapsing = bool1;
    AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
    localAnimatorSet.<init>();
    paramView = getCollapseAnimator(paramSearchBar, paramView, paramAppBarLayout);
    paramSearchBar = getFadeInChildrenAnimator(paramSearchBar);
    int i = 2;
    paramAppBarLayout = new Animator[i];
    paramAppBarLayout[0] = paramView;
    paramAppBarLayout[bool1] = paramSearchBar;
    localAnimatorSet.playSequentially(paramAppBarLayout);
    paramSearchBar = new com/google/android/material/search/SearchBarAnimationHelper$5;
    paramSearchBar.<init>(this);
    localAnimatorSet.addListener(paramSearchBar);
    paramSearchBar = this.collapseAnimationListeners.iterator();
    for (;;)
    {
      boolean bool2 = paramSearchBar.hasNext();
      if (!bool2) {
        break;
      }
      paramView = (AnimatorListenerAdapter)paramSearchBar.next();
      localAnimatorSet.addListener(paramView);
    }
    if (paramBoolean)
    {
      long l = 0L;
      localAnimatorSet.setDuration(l);
    }
    localAnimatorSet.start();
    this.runningExpandOrCollapseAnimator = localAnimatorSet;
  }
  
  public void startExpandAnimation(SearchBar paramSearchBar, View paramView, AppBarLayout paramAppBarLayout, boolean paramBoolean)
  {
    boolean bool = isCollapsing();
    if (bool)
    {
      localObject = this.runningExpandOrCollapseAnimator;
      if (localObject != null) {
        ((Animator)localObject).cancel();
      }
    }
    this.expanding = true;
    paramView.setVisibility(4);
    Object localObject = new com/google/android/material/search/OooO0OO;
    ((OooO0OO)localObject).<init>(this, paramSearchBar, paramView, paramAppBarLayout, paramBoolean);
    paramView.post((Runnable)localObject);
  }
  
  public void startOnLoadAnimation(SearchBar paramSearchBar)
  {
    Object localObject1 = new com/google/android/material/search/OooOO0;
    ((OooOO0)localObject1).<init>();
    dispatchOnLoadAnimation((SearchBarAnimationHelper.OnLoadAnimationInvocation)localObject1);
    localObject1 = paramSearchBar.getTextView();
    Object localObject2 = paramSearchBar.getCenterView();
    paramSearchBar = ToolbarUtils.getSecondaryActionMenuItemView(paramSearchBar);
    Animator localAnimator = getSecondaryViewAnimator((TextView)localObject1, paramSearchBar);
    SearchBarAnimationHelper.1 local1 = new com/google/android/material/search/SearchBarAnimationHelper$1;
    local1.<init>(this);
    localAnimator.addListener(local1);
    this.secondaryViewAnimator = localAnimator;
    local1 = null;
    ((View)localObject1).setAlpha(0.0F);
    if (paramSearchBar != null) {
      paramSearchBar.setAlpha(0.0F);
    }
    boolean bool = localObject2 instanceof AnimatableView;
    if (bool)
    {
      localObject2 = (AnimatableView)localObject2;
      paramSearchBar = new com/google/android/material/search/OooOO0O;
      paramSearchBar.<init>(localAnimator);
      ((AnimatableView)localObject2).startAnimation(paramSearchBar);
    }
    else if (localObject2 != null)
    {
      ((View)localObject2).setAlpha(0.0F);
      bool = false;
      ((View)localObject2).setVisibility(0);
      paramSearchBar = getDefaultCenterViewAnimator((View)localObject2);
      this.defaultCenterViewAnimator = paramSearchBar;
      localObject1 = new com/google/android/material/search/SearchBarAnimationHelper$2;
      ((SearchBarAnimationHelper.2)localObject1).<init>(this, (View)localObject2, localAnimator);
      paramSearchBar.addListener((Animator.AnimatorListener)localObject1);
      paramSearchBar.start();
    }
    else
    {
      localAnimator.start();
    }
  }
  
  public void stopOnLoadAnimation(SearchBar paramSearchBar)
  {
    Object localObject = this.secondaryViewAnimator;
    if (localObject != null) {
      ((Animator)localObject).end();
    }
    localObject = this.defaultCenterViewAnimator;
    if (localObject != null) {
      ((Animator)localObject).end();
    }
    paramSearchBar = paramSearchBar.getCenterView();
    boolean bool = paramSearchBar instanceof AnimatableView;
    if (bool)
    {
      localObject = paramSearchBar;
      localObject = (AnimatableView)paramSearchBar;
      ((AnimatableView)localObject).stopAnimation();
    }
    if (paramSearchBar != null)
    {
      bool = false;
      localObject = null;
      ((View)paramSearchBar).setAlpha(0.0F);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.search.SearchBarAnimationHelper
 * JD-Core Version:    0.7.0.1
 */