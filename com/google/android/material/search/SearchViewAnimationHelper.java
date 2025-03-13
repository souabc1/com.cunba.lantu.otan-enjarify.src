package com.google.android.material.search;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import java.util.Objects;

class SearchViewAnimationHelper
{
  private static final float CONTENT_FROM_SCALE = 0.95F;
  private static final long HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS = 42L;
  private static final long HIDE_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 0L;
  private static final long HIDE_CONTENT_ALPHA_DURATION_MS = 83L;
  private static final long HIDE_CONTENT_ALPHA_START_DELAY_MS = 0L;
  private static final long HIDE_CONTENT_SCALE_DURATION_MS = 250L;
  private static final long HIDE_DURATION_MS = 250L;
  private static final long HIDE_TRANSLATE_DURATION_MS = 300L;
  private static final long SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS = 50L;
  private static final long SHOW_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 250L;
  private static final long SHOW_CONTENT_ALPHA_DURATION_MS = 150L;
  private static final long SHOW_CONTENT_ALPHA_START_DELAY_MS = 75L;
  private static final long SHOW_CONTENT_SCALE_DURATION_MS = 300L;
  private static final long SHOW_DURATION_MS = 300L;
  private static final long SHOW_TRANSLATE_DURATION_MS = 350L;
  private static final long SHOW_TRANSLATE_KEYBOARD_START_DELAY_MS = 150L;
  private final ImageButton clearButton;
  private final TouchObserverFrameLayout contentContainer;
  private final View divider;
  private final Toolbar dummyToolbar;
  private final EditText editText;
  private final FrameLayout headerContainer;
  private final ClippableRoundedCornerLayout rootView;
  private final View scrim;
  private SearchBar searchBar;
  private final TextView searchPrefix;
  private final SearchView searchView;
  private final Toolbar toolbar;
  private final FrameLayout toolbarContainer;
  
  public SearchViewAnimationHelper(SearchView paramSearchView)
  {
    this.searchView = paramSearchView;
    Object localObject = paramSearchView.scrim;
    this.scrim = ((View)localObject);
    localObject = paramSearchView.rootView;
    this.rootView = ((ClippableRoundedCornerLayout)localObject);
    localObject = paramSearchView.headerContainer;
    this.headerContainer = ((FrameLayout)localObject);
    localObject = paramSearchView.toolbarContainer;
    this.toolbarContainer = ((FrameLayout)localObject);
    localObject = paramSearchView.toolbar;
    this.toolbar = ((Toolbar)localObject);
    localObject = paramSearchView.dummyToolbar;
    this.dummyToolbar = ((Toolbar)localObject);
    localObject = paramSearchView.searchPrefix;
    this.searchPrefix = ((TextView)localObject);
    localObject = paramSearchView.editText;
    this.editText = ((EditText)localObject);
    localObject = paramSearchView.clearButton;
    this.clearButton = ((ImageButton)localObject);
    localObject = paramSearchView.divider;
    this.divider = ((View)localObject);
    paramSearchView = paramSearchView.contentContainer;
    this.contentContainer = paramSearchView;
  }
  
  private void addActionMenuViewAnimatorIfNeeded(AnimatorSet paramAnimatorSet)
  {
    Object localObject1 = ToolbarUtils.getActionMenuView(this.toolbar);
    if (localObject1 == null) {
      return;
    }
    int i = 2;
    Object localObject2 = new float[i];
    float f1 = getFromTranslationXEnd((View)localObject1);
    localObject2[0] = f1;
    int j = 1;
    localObject2[j] = 0.0F;
    localObject2 = ValueAnimator.ofFloat((float[])localObject2);
    Object localObject3 = new View[j];
    localObject3[0] = localObject1;
    localObject3 = MultiViewUpdateListener.translationXListener((View[])localObject3);
    ((ValueAnimator)localObject2).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject3);
    localObject3 = new float[i];
    float f2 = getFromTranslationY();
    localObject3[0] = f2;
    localObject3[j] = 0.0F;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat((float[])localObject3);
    localObject3 = new View[j];
    localObject3[0] = localObject1;
    localObject1 = MultiViewUpdateListener.translationYListener((View[])localObject3);
    localValueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject1);
    localObject1 = new Animator[i];
    localObject1[0] = localObject2;
    localObject1[j] = localValueAnimator;
    paramAnimatorSet.playTogether((Animator[])localObject1);
  }
  
  private void addBackButtonProgressAnimatorIfNeeded(AnimatorSet paramAnimatorSet)
  {
    Object localObject = ToolbarUtils.getNavigationIconButton(this.toolbar);
    if (localObject == null) {
      return;
    }
    localObject = DrawableCompat.OooOOo0(((ImageView)localObject).getDrawable());
    SearchView localSearchView = this.searchView;
    boolean bool = localSearchView.isAnimatedNavigationIcon();
    if (bool)
    {
      addDrawerArrowDrawableAnimatorIfNeeded(paramAnimatorSet, (Drawable)localObject);
      addFadeThroughDrawableAnimatorIfNeeded(paramAnimatorSet, (Drawable)localObject);
    }
    else
    {
      setFullDrawableProgressIfNeeded((Drawable)localObject);
    }
  }
  
  private void addBackButtonTranslationAnimatorIfNeeded(AnimatorSet paramAnimatorSet)
  {
    Object localObject1 = ToolbarUtils.getNavigationIconButton(this.toolbar);
    if (localObject1 == null) {
      return;
    }
    int i = 2;
    Object localObject2 = new float[i];
    float f1 = getFromTranslationXStart((View)localObject1);
    localObject2[0] = f1;
    int j = 1;
    localObject2[j] = 0.0F;
    localObject2 = ValueAnimator.ofFloat((float[])localObject2);
    Object localObject3 = new View[j];
    localObject3[0] = localObject1;
    localObject3 = MultiViewUpdateListener.translationXListener((View[])localObject3);
    ((ValueAnimator)localObject2).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject3);
    localObject3 = new float[i];
    float f2 = getFromTranslationY();
    localObject3[0] = f2;
    localObject3[j] = 0.0F;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat((float[])localObject3);
    localObject3 = new View[j];
    localObject3[0] = localObject1;
    localObject1 = MultiViewUpdateListener.translationYListener((View[])localObject3);
    localValueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject1);
    localObject1 = new Animator[i];
    localObject1[0] = localObject2;
    localObject1[j] = localValueAnimator;
    paramAnimatorSet.playTogether((Animator[])localObject1);
  }
  
  private void addDrawerArrowDrawableAnimatorIfNeeded(AnimatorSet paramAnimatorSet, Drawable paramDrawable)
  {
    boolean bool = paramDrawable instanceof DrawerArrowDrawable;
    if (bool)
    {
      paramDrawable = (DrawerArrowDrawable)paramDrawable;
      int i = 2;
      Object localObject = new float[i];
      Object tmp23_21 = localObject;
      tmp23_21[0] = 0.0F;
      tmp23_21[1] = 1.0F;
      localObject = ValueAnimator.ofFloat((float[])localObject);
      oo000o localoo000o = new com/google/android/material/search/oo000o;
      localoo000o.<init>(paramDrawable);
      ((ValueAnimator)localObject).addUpdateListener(localoo000o);
      int j = 1;
      paramDrawable = new Animator[j];
      localoo000o = null;
      paramDrawable[0] = localObject;
      paramAnimatorSet.playTogether(paramDrawable);
    }
  }
  
  private void addFadeThroughDrawableAnimatorIfNeeded(AnimatorSet paramAnimatorSet, Drawable paramDrawable)
  {
    boolean bool = paramDrawable instanceof FadeThroughDrawable;
    if (bool)
    {
      paramDrawable = (FadeThroughDrawable)paramDrawable;
      int i = 2;
      Object localObject = new float[i];
      Object tmp23_21 = localObject;
      tmp23_21[0] = 0.0F;
      tmp23_21[1] = 1.0F;
      localObject = ValueAnimator.ofFloat((float[])localObject);
      o00Ooo localo00Ooo = new com/google/android/material/search/o00Ooo;
      localo00Ooo.<init>(paramDrawable);
      ((ValueAnimator)localObject).addUpdateListener(localo00Ooo);
      int j = 1;
      paramDrawable = new Animator[j];
      localo00Ooo = null;
      paramDrawable[0] = localObject;
      paramAnimatorSet.playTogether(paramDrawable);
    }
  }
  
  private Rect calculateFromClipBounds()
  {
    int i = 2;
    int[] arrayOfInt1 = new int[i];
    this.searchBar.getLocationOnScreen(arrayOfInt1);
    int j = arrayOfInt1[0];
    int k = 1;
    int m = arrayOfInt1[k];
    int[] arrayOfInt2 = new int[i];
    this.rootView.getLocationOnScreen(arrayOfInt2);
    int n = arrayOfInt2[0];
    i = arrayOfInt2[k];
    j -= n;
    m -= i;
    i = this.searchBar.getWidth() + j;
    n = this.searchBar.getHeight() + m;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>(j, m, i, n);
    return localRect;
  }
  
  private Animator getActionMenuViewsAlphaAnimator(boolean paramBoolean)
  {
    int i = 2;
    Object localObject1 = new float[i];
    Object tmp7_6 = localObject1;
    tmp7_6[0] = 0.0F;
    tmp7_6[1] = 1.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    long l;
    if (paramBoolean) {
      l = 300L;
    } else {
      l = 250L;
    }
    ((ValueAnimator)localObject1).setDuration(l);
    Object localObject2 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    Object localObject3 = ReversableAnimatedValueInterpolator.of(paramBoolean, (TimeInterpolator)localObject2);
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject3);
    localObject3 = this.searchView;
    paramBoolean = ((SearchView)localObject3).isMenuItemsAnimated();
    if (paramBoolean)
    {
      localObject3 = ToolbarUtils.getActionMenuView(this.dummyToolbar);
      localObject2 = ToolbarUtils.getActionMenuView(this.toolbar);
      FadeThroughUpdateListener localFadeThroughUpdateListener = new com/google/android/material/internal/FadeThroughUpdateListener;
      localFadeThroughUpdateListener.<init>((View)localObject3, (View)localObject2);
      ((ValueAnimator)localObject1).addUpdateListener(localFadeThroughUpdateListener);
    }
    return localObject1;
  }
  
  private Animator getButtonsAnimator(boolean paramBoolean)
  {
    AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
    localAnimatorSet.<init>();
    addBackButtonTranslationAnimatorIfNeeded(localAnimatorSet);
    addBackButtonProgressAnimatorIfNeeded(localAnimatorSet);
    addActionMenuViewAnimatorIfNeeded(localAnimatorSet);
    long l;
    if (paramBoolean) {
      l = 300L;
    } else {
      l = 250L;
    }
    localAnimatorSet.setDuration(l);
    TimeInterpolator localTimeInterpolator1 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    TimeInterpolator localTimeInterpolator2 = ReversableAnimatedValueInterpolator.of(paramBoolean, localTimeInterpolator1);
    localAnimatorSet.setInterpolator(localTimeInterpolator2);
    return localAnimatorSet;
  }
  
  private Animator getClearButtonAnimator(boolean paramBoolean)
  {
    int i = 2;
    Object localObject1 = new float[i];
    Object tmp7_6 = localObject1;
    tmp7_6[0] = 0.0F;
    tmp7_6[1] = 1.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    long l;
    if (paramBoolean) {
      l = 50;
    } else {
      l = 42;
    }
    ((ValueAnimator)localObject1).setDuration(l);
    if (paramBoolean) {
      l = 250L;
    } else {
      l = 0L;
    }
    ((ValueAnimator)localObject1).setStartDelay(l);
    TimeInterpolator localTimeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
    Object localObject2 = ReversableAnimatedValueInterpolator.of(paramBoolean, localTimeInterpolator);
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
    localObject2 = new View[1];
    ImageButton localImageButton = this.clearButton;
    localObject2[0] = localImageButton;
    localObject2 = MultiViewUpdateListener.alphaListener((View[])localObject2);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    return localObject1;
  }
  
  private Animator getContentAlphaAnimator(boolean paramBoolean)
  {
    int i = 2;
    Object localObject1 = new float[i];
    Object tmp7_6 = localObject1;
    tmp7_6[0] = 0.0F;
    tmp7_6[1] = 1.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    long l;
    if (paramBoolean) {
      l = 150L;
    } else {
      l = 83;
    }
    ((ValueAnimator)localObject1).setDuration(l);
    if (paramBoolean) {
      l = 75;
    } else {
      l = 0L;
    }
    ((ValueAnimator)localObject1).setStartDelay(l);
    Object localObject2 = AnimationUtils.LINEAR_INTERPOLATOR;
    Object localObject3 = ReversableAnimatedValueInterpolator.of(paramBoolean, (TimeInterpolator)localObject2);
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject3);
    localObject3 = new View[i];
    localObject2 = this.divider;
    localObject3[0] = localObject2;
    localObject2 = this.contentContainer;
    localObject3[1] = localObject2;
    localObject3 = MultiViewUpdateListener.alphaListener((View[])localObject3);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject3);
    return localObject1;
  }
  
  private Animator getContentAnimator(boolean paramBoolean)
  {
    AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
    localAnimatorSet.<init>();
    Animator[] arrayOfAnimator = new Animator[3];
    Animator localAnimator1 = getContentAlphaAnimator(paramBoolean);
    arrayOfAnimator[0] = localAnimator1;
    localAnimator1 = getDividerAnimator(paramBoolean);
    arrayOfAnimator[1] = localAnimator1;
    Animator localAnimator2 = getContentScaleAnimator(paramBoolean);
    arrayOfAnimator[2] = localAnimator2;
    localAnimatorSet.playTogether(arrayOfAnimator);
    return localAnimatorSet;
  }
  
  private Animator getContentScaleAnimator(boolean paramBoolean)
  {
    int i = 2;
    Object localObject1 = new float[i];
    Object tmp7_6 = localObject1;
    tmp7_6[0] = 0.95F;
    tmp7_6[1] = 1.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    long l;
    if (paramBoolean) {
      l = 300L;
    } else {
      l = 250L;
    }
    ((ValueAnimator)localObject1).setDuration(l);
    TimeInterpolator localTimeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    Object localObject2 = ReversableAnimatedValueInterpolator.of(paramBoolean, localTimeInterpolator);
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
    localObject2 = new View[1];
    TouchObserverFrameLayout localTouchObserverFrameLayout = this.contentContainer;
    localObject2[0] = localTouchObserverFrameLayout;
    localObject2 = MultiViewUpdateListener.scaleListener((View[])localObject2);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    return localObject1;
  }
  
  private Animator getDividerAnimator(boolean paramBoolean)
  {
    float f = this.contentContainer.getHeight() * 0.05000001F / 2.0F;
    int i = 2;
    Object localObject1 = new float[i];
    localObject1[0] = f;
    f = 0.0F;
    int j = 1;
    localObject1[j] = 0.0F;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat((float[])localObject1);
    long l;
    if (paramBoolean) {
      l = 300L;
    } else {
      l = 250L;
    }
    localValueAnimator.setDuration(l);
    localObject1 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    Object localObject2 = ReversableAnimatedValueInterpolator.of(paramBoolean, (TimeInterpolator)localObject1);
    localValueAnimator.setInterpolator((TimeInterpolator)localObject2);
    localObject2 = new View[j];
    localObject1 = this.divider;
    localObject2[0] = localObject1;
    localObject2 = MultiViewUpdateListener.translationYListener((View[])localObject2);
    localValueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    return localValueAnimator;
  }
  
  private Animator getDummyToolbarAnimator(boolean paramBoolean)
  {
    Toolbar localToolbar = this.dummyToolbar;
    return getTranslationAnimator(paramBoolean, false, localToolbar);
  }
  
  private Animator getEditTextAnimator(boolean paramBoolean)
  {
    EditText localEditText = this.editText;
    return getTranslationAnimator(paramBoolean, true, localEditText);
  }
  
  private AnimatorSet getExpandCollapseAnimatorSet(boolean paramBoolean)
  {
    AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
    localAnimatorSet.<init>();
    Object localObject = new Animator[10];
    Animator localAnimator = getScrimAlphaAnimator(paramBoolean);
    localObject[0] = localAnimator;
    localAnimator = getRootViewAnimator(paramBoolean);
    localObject[1] = localAnimator;
    localAnimator = getClearButtonAnimator(paramBoolean);
    localObject[2] = localAnimator;
    localAnimator = getContentAnimator(paramBoolean);
    localObject[3] = localAnimator;
    localAnimator = getButtonsAnimator(paramBoolean);
    localObject[4] = localAnimator;
    localAnimator = getHeaderContainerAnimator(paramBoolean);
    localObject[5] = localAnimator;
    localAnimator = getDummyToolbarAnimator(paramBoolean);
    localObject[6] = localAnimator;
    localAnimator = getActionMenuViewsAlphaAnimator(paramBoolean);
    localObject[7] = localAnimator;
    localAnimator = getEditTextAnimator(paramBoolean);
    localObject[8] = localAnimator;
    localAnimator = getSearchPrefixAnimator(paramBoolean);
    localObject[9] = localAnimator;
    localAnimatorSet.playTogether((Animator[])localObject);
    localObject = new com/google/android/material/search/SearchViewAnimationHelper$5;
    ((SearchViewAnimationHelper.5)localObject).<init>(this, paramBoolean);
    localAnimatorSet.addListener((Animator.AnimatorListener)localObject);
    return localAnimatorSet;
  }
  
  private int getFromTranslationXEnd(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = MarginLayoutParamsCompat.OooO00o(paramView);
    SearchBar localSearchBar = this.searchBar;
    boolean bool = ViewUtils.isLayoutRtl(localSearchBar);
    int j;
    if (bool)
    {
      localSearchBar = this.searchBar;
      j = localSearchBar.getLeft() - i;
    }
    else
    {
      localSearchBar = this.searchBar;
      j = localSearchBar.getRight();
      SearchView localSearchView = this.searchView;
      int k = localSearchView.getWidth();
      j = j - k + i;
    }
    return j;
  }
  
  private int getFromTranslationXStart(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = MarginLayoutParamsCompat.OooO0O0(paramView);
    SearchBar localSearchBar1 = this.searchBar;
    int j = ViewCompat.Oooo000(localSearchBar1);
    SearchBar localSearchBar2 = this.searchBar;
    boolean bool = ViewUtils.isLayoutRtl(localSearchBar2);
    int k;
    if (bool)
    {
      localSearchBar2 = this.searchBar;
      k = localSearchBar2.getWidth();
      SearchBar localSearchBar3 = this.searchBar;
      int m = localSearchBar3.getRight();
      k = k - m + i - j;
    }
    else
    {
      localSearchBar2 = this.searchBar;
      k = localSearchBar2.getLeft() - i + j;
    }
    return k;
  }
  
  private int getFromTranslationY()
  {
    int i = this.toolbarContainer.getTop();
    int j = this.toolbarContainer.getBottom();
    i = (i + j) / 2;
    j = this.searchBar.getTop();
    int k = this.searchBar.getBottom();
    return (j + k) / 2 - i;
  }
  
  private Animator getHeaderContainerAnimator(boolean paramBoolean)
  {
    FrameLayout localFrameLayout = this.headerContainer;
    return getTranslationAnimator(paramBoolean, false, localFrameLayout);
  }
  
  private Animator getRootViewAnimator(boolean paramBoolean)
  {
    Object localObject1 = ViewUtils.calculateRectFromBounds(this.searchView);
    Object localObject2 = calculateFromClipBounds();
    Rect localRect = new android/graphics/Rect;
    localRect.<init>((Rect)localObject2);
    SearchBar localSearchBar = this.searchBar;
    float f = localSearchBar.getCornerSize();
    RectEvaluator localRectEvaluator = new com/google/android/material/internal/RectEvaluator;
    localRectEvaluator.<init>(localRect);
    localObject1 = new Object[] { localObject2, localObject1 };
    localObject1 = ValueAnimator.ofObject(localRectEvaluator, (Object[])localObject1);
    localObject2 = new com/google/android/material/search/o0Oo0oo;
    ((o0Oo0oo)localObject2).<init>(this, f, localRect);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    long l;
    if (paramBoolean) {
      l = 300L;
    } else {
      l = 250L;
    }
    ((ValueAnimator)localObject1).setDuration(l);
    localObject2 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    TimeInterpolator localTimeInterpolator = ReversableAnimatedValueInterpolator.of(paramBoolean, (TimeInterpolator)localObject2);
    ((ValueAnimator)localObject1).setInterpolator(localTimeInterpolator);
    return localObject1;
  }
  
  private Animator getScrimAlphaAnimator(boolean paramBoolean)
  {
    TimeInterpolator localTimeInterpolator;
    if (paramBoolean) {
      localTimeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
    } else {
      localTimeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }
    int i = 2;
    Object localObject1 = new float[i];
    Object tmp24_22 = localObject1;
    tmp24_22[0] = 0.0F;
    tmp24_22[1] = 1.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    long l;
    if (paramBoolean) {
      l = 300L;
    } else {
      l = 250L;
    }
    ((ValueAnimator)localObject1).setDuration(l);
    Object localObject2 = ReversableAnimatedValueInterpolator.of(paramBoolean, localTimeInterpolator);
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
    localObject2 = new View[1];
    View localView = this.scrim;
    localObject2[0] = localView;
    localObject2 = MultiViewUpdateListener.alphaListener((View[])localObject2);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    return localObject1;
  }
  
  private Animator getSearchPrefixAnimator(boolean paramBoolean)
  {
    TextView localTextView = this.searchPrefix;
    return getTranslationAnimator(paramBoolean, true, localTextView);
  }
  
  private AnimatorSet getTranslateAnimatorSet(boolean paramBoolean)
  {
    AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
    localAnimatorSet.<init>();
    int i = 1;
    Object localObject = new Animator[i];
    Animator localAnimator = getTranslationYAnimator();
    localObject[0] = localAnimator;
    localAnimatorSet.playTogether((Animator[])localObject);
    addBackButtonProgressAnimatorIfNeeded(localAnimatorSet);
    localObject = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    localObject = ReversableAnimatedValueInterpolator.of(paramBoolean, (TimeInterpolator)localObject);
    localAnimatorSet.setInterpolator((TimeInterpolator)localObject);
    long l;
    if (paramBoolean) {
      l = 350L;
    } else {
      l = 300L;
    }
    localAnimatorSet.setDuration(l);
    return localAnimatorSet;
  }
  
  private Animator getTranslationAnimator(boolean paramBoolean1, boolean paramBoolean2, View paramView)
  {
    if (paramBoolean2) {
      paramBoolean2 = getFromTranslationXStart(paramView);
    } else {
      paramBoolean2 = getFromTranslationXEnd(paramView);
    }
    int i = 2;
    Object localObject1 = new float[i];
    float f1 = paramBoolean2;
    localObject1[0] = f1;
    paramBoolean2 = true;
    f1 = 1.4E-45F;
    localObject1[paramBoolean2] = 0.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    Object localObject2 = new View[paramBoolean2];
    localObject2[0] = paramView;
    localObject2 = MultiViewUpdateListener.translationXListener((View[])localObject2);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    localObject2 = new float[i];
    int j = getFromTranslationY();
    float f2 = j;
    localObject2[0] = f2;
    localObject2[paramBoolean2] = 0.0F;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat((float[])localObject2);
    localObject2 = new View[paramBoolean2];
    localObject2[0] = paramView;
    paramView = MultiViewUpdateListener.translationYListener((View[])localObject2);
    localValueAnimator.addUpdateListener(paramView);
    paramView = new android/animation/AnimatorSet;
    paramView.<init>();
    Animator[] arrayOfAnimator = new Animator[i];
    arrayOfAnimator[0] = localObject1;
    arrayOfAnimator[paramBoolean2] = localValueAnimator;
    paramView.playTogether(arrayOfAnimator);
    long l;
    if (paramBoolean1) {
      l = 300L;
    } else {
      l = 250L;
    }
    paramView.setDuration(l);
    TimeInterpolator localTimeInterpolator1 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    TimeInterpolator localTimeInterpolator2 = ReversableAnimatedValueInterpolator.of(paramBoolean1, localTimeInterpolator1);
    paramView.setInterpolator(localTimeInterpolator2);
    return paramView;
  }
  
  private Animator getTranslationYAnimator()
  {
    Object localObject1 = new float[2];
    float f = this.rootView.getHeight();
    localObject1[0] = f;
    int i = 1;
    localObject1[i] = 0.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    Object localObject2 = new View[i];
    ClippableRoundedCornerLayout localClippableRoundedCornerLayout = this.rootView;
    localObject2[0] = localClippableRoundedCornerLayout;
    localObject2 = MultiViewUpdateListener.translationYListener((View[])localObject2);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    return localObject1;
  }
  
  private void setActionMenuViewAlphaIfNeeded(float paramFloat)
  {
    Object localObject = this.searchView;
    boolean bool = ((SearchView)localObject).isMenuItemsAnimated();
    if (bool)
    {
      localObject = ToolbarUtils.getActionMenuView(this.toolbar);
      if (localObject != null) {
        ((View)localObject).setAlpha(paramFloat);
      }
    }
  }
  
  private void setContentViewsAlpha(float paramFloat)
  {
    this.clearButton.setAlpha(paramFloat);
    this.divider.setAlpha(paramFloat);
    this.contentContainer.setAlpha(paramFloat);
    setActionMenuViewAlphaIfNeeded(paramFloat);
  }
  
  private void setFullDrawableProgressIfNeeded(Drawable paramDrawable)
  {
    boolean bool = paramDrawable instanceof DrawerArrowDrawable;
    float f = 1.0F;
    if (bool)
    {
      Object localObject = paramDrawable;
      localObject = (DrawerArrowDrawable)paramDrawable;
      ((DrawerArrowDrawable)localObject).setProgress(f);
    }
    bool = paramDrawable instanceof FadeThroughDrawable;
    if (bool)
    {
      paramDrawable = (FadeThroughDrawable)paramDrawable;
      paramDrawable.setProgress(f);
    }
  }
  
  private void setMenuItemsNotClickable(Toolbar paramToolbar)
  {
    paramToolbar = ToolbarUtils.getActionMenuView(paramToolbar);
    if (paramToolbar != null)
    {
      int i = 0;
      for (;;)
      {
        int j = paramToolbar.getChildCount();
        if (i >= j) {
          break;
        }
        View localView = paramToolbar.getChildAt(i);
        localView.setClickable(false);
        localView.setFocusable(false);
        localView.setFocusableInTouchMode(false);
        i += 1;
      }
    }
  }
  
  private void setUpDummyToolbarIfNeeded()
  {
    Object localObject = this.dummyToolbar.getMenu();
    if (localObject != null) {
      ((Menu)localObject).clear();
    }
    localObject = this.searchBar;
    int i = ((SearchBar)localObject).getMenuResId();
    int j = -1;
    if (i != j)
    {
      localObject = this.searchView;
      boolean bool = ((SearchView)localObject).isMenuItemsAnimated();
      if (bool)
      {
        localObject = this.dummyToolbar;
        j = this.searchBar.getMenuResId();
        ((Toolbar)localObject).inflateMenu(j);
        localObject = this.dummyToolbar;
        setMenuItemsNotClickable((Toolbar)localObject);
        localObject = this.dummyToolbar;
        j = 0;
        break label95;
      }
    }
    localObject = this.dummyToolbar;
    j = 8;
    label95:
    ((View)localObject).setVisibility(j);
  }
  
  private void startHideAnimationCollapse()
  {
    Object localObject = this.searchView;
    boolean bool = ((SearchView)localObject).isAdjustNothingSoftInputMode();
    if (bool)
    {
      localObject = this.searchView;
      ((SearchView)localObject).clearFocusAndHideKeyboard();
    }
    localObject = getExpandCollapseAnimatorSet(false);
    SearchViewAnimationHelper.2 local2 = new com/google/android/material/search/SearchViewAnimationHelper$2;
    local2.<init>(this);
    ((Animator)localObject).addListener(local2);
    ((AnimatorSet)localObject).start();
  }
  
  private void startHideAnimationTranslate()
  {
    Object localObject = this.searchView;
    boolean bool = ((SearchView)localObject).isAdjustNothingSoftInputMode();
    if (bool)
    {
      localObject = this.searchView;
      ((SearchView)localObject).clearFocusAndHideKeyboard();
    }
    localObject = getTranslateAnimatorSet(false);
    SearchViewAnimationHelper.4 local4 = new com/google/android/material/search/SearchViewAnimationHelper$4;
    local4.<init>(this);
    ((Animator)localObject).addListener(local4);
    ((AnimatorSet)localObject).start();
  }
  
  private void startShowAnimationExpand()
  {
    Object localObject1 = this.searchView;
    boolean bool = ((SearchView)localObject1).isAdjustNothingSoftInputMode();
    if (bool)
    {
      localObject1 = this.searchView;
      ((SearchView)localObject1).requestFocusAndShowKeyboardIfNeeded();
    }
    localObject1 = this.searchView;
    Object localObject2 = SearchView.TransitionState.SHOWING;
    ((SearchView)localObject1).setTransitionState((SearchView.TransitionState)localObject2);
    setUpDummyToolbarIfNeeded();
    localObject1 = this.editText;
    localObject2 = this.searchBar.getText();
    ((TextView)localObject1).setText((CharSequence)localObject2);
    localObject1 = this.editText;
    int i = ((EditText)localObject1).getText().length();
    ((EditText)localObject1).setSelection(i);
    this.rootView.setVisibility(4);
    localObject1 = this.rootView;
    localObject2 = new com/google/android/material/search/o00oO0o;
    ((o00oO0o)localObject2).<init>(this);
    ((View)localObject1).post((Runnable)localObject2);
  }
  
  private void startShowAnimationTranslate()
  {
    Object localObject1 = this.searchView;
    boolean bool = ((SearchView)localObject1).isAdjustNothingSoftInputMode();
    if (bool)
    {
      localObject1 = this.searchView;
      Objects.requireNonNull(localObject1);
      localObject2 = new com/google/android/material/search/o0ooOOo;
      ((o0ooOOo)localObject2).<init>((SearchView)localObject1);
      long l = 150L;
      ((View)localObject1).postDelayed((Runnable)localObject2, l);
    }
    this.rootView.setVisibility(4);
    localObject1 = this.rootView;
    Object localObject2 = new com/google/android/material/search/o0OOO0o;
    ((o0OOO0o)localObject2).<init>(this);
    ((View)localObject1).post((Runnable)localObject2);
  }
  
  public void hide()
  {
    SearchBar localSearchBar = this.searchBar;
    if (localSearchBar != null) {
      startHideAnimationCollapse();
    } else {
      startHideAnimationTranslate();
    }
  }
  
  public void setSearchBar(SearchBar paramSearchBar)
  {
    this.searchBar = paramSearchBar;
  }
  
  public void show()
  {
    SearchBar localSearchBar = this.searchBar;
    if (localSearchBar != null) {
      startShowAnimationExpand();
    } else {
      startShowAnimationTranslate();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.search.SearchViewAnimationHelper
 * JD-Core Version:    0.7.0.1
 */