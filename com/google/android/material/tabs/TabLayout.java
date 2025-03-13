package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;
import androidx.core.util.Pools.SynchronizedPool;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import m54207b69;

public class TabLayout
  extends HorizontalScrollView
{
  private static final int ANIMATION_DURATION = 300;
  static final int DEFAULT_GAP_TEXT_ICON = 8;
  private static final int DEFAULT_HEIGHT = 48;
  private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
  private static final int DEF_STYLE_RES = R.style.Widget_Design_TabLayout;
  static final int FIXED_WRAP_GUTTER_MIN = 16;
  public static final int GRAVITY_CENTER = 1;
  public static final int GRAVITY_FILL = 0;
  public static final int GRAVITY_START = 2;
  public static final int INDICATOR_ANIMATION_MODE_ELASTIC = 1;
  public static final int INDICATOR_ANIMATION_MODE_FADE = 2;
  public static final int INDICATOR_ANIMATION_MODE_LINEAR = 0;
  public static final int INDICATOR_GRAVITY_BOTTOM = 0;
  public static final int INDICATOR_GRAVITY_CENTER = 1;
  public static final int INDICATOR_GRAVITY_STRETCH = 3;
  public static final int INDICATOR_GRAVITY_TOP = 2;
  private static final int INVALID_WIDTH = 255;
  private static final String LOG_TAG = "TabLayout";
  public static final int MODE_AUTO = 2;
  public static final int MODE_FIXED = 1;
  public static final int MODE_SCROLLABLE = 0;
  private static final int SELECTED_INDICATOR_HEIGHT_DEFAULT = 255;
  public static final int TAB_LABEL_VISIBILITY_LABELED = 1;
  public static final int TAB_LABEL_VISIBILITY_UNLABELED = 0;
  private static final int TAB_MIN_WIDTH_MARGIN = 56;
  private static final Pools.Pool tabPool;
  private TabLayout.AdapterChangeListener adapterChangeListener;
  private int contentInsetStart;
  private TabLayout.BaseOnTabSelectedListener currentVpSelectedListener;
  private final int defaultTabTextAppearance;
  int indicatorPosition;
  boolean inlineLabel;
  int mode;
  private TabLayout.TabLayoutOnPageChangeListener pageChangeListener;
  private PagerAdapter pagerAdapter;
  private DataSetObserver pagerAdapterObserver;
  private final int requestedTabMaxWidth;
  private final int requestedTabMinWidth;
  private ValueAnimator scrollAnimator;
  private final int scrollableTabMinWidth;
  private TabLayout.BaseOnTabSelectedListener selectedListener;
  private final ArrayList selectedListeners;
  private TabLayout.Tab selectedTab;
  private int selectedTabTextAppearance;
  float selectedTabTextSize;
  private boolean setupViewPagerImplicitly;
  final TabLayout.SlidingTabIndicator slidingTabIndicator;
  final int tabBackgroundResId;
  int tabGravity;
  ColorStateList tabIconTint;
  PorterDuff.Mode tabIconTintMode;
  int tabIndicatorAnimationDuration;
  int tabIndicatorAnimationMode;
  boolean tabIndicatorFullWidth;
  int tabIndicatorGravity;
  int tabIndicatorHeight;
  private TabIndicatorInterpolator tabIndicatorInterpolator;
  private final TimeInterpolator tabIndicatorTimeInterpolator;
  int tabMaxWidth;
  int tabPaddingBottom;
  int tabPaddingEnd;
  int tabPaddingStart;
  int tabPaddingTop;
  ColorStateList tabRippleColorStateList;
  Drawable tabSelectedIndicator;
  private int tabSelectedIndicatorColor;
  private final int tabTextAppearance;
  ColorStateList tabTextColors;
  float tabTextMultiLineSize;
  float tabTextSize;
  private final Pools.Pool tabViewPool;
  private final ArrayList tabs;
  boolean unboundedRipple;
  ViewPager viewPager;
  private int viewPagerScrollState;
  
  static
  {
    Pools.SynchronizedPool localSynchronizedPool = new androidx/core/util/Pools$SynchronizedPool;
    localSynchronizedPool.<init>(16);
    tabPool = localSynchronizedPool;
  }
  
  public TabLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TabLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public TabLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int j = -1;
    this.indicatorPosition = j;
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.tabs = ((ArrayList)localObject1);
    this.selectedTabTextAppearance = j;
    this.tabSelectedIndicatorColor = 0;
    this.tabMaxWidth = (-1 >>> 1);
    this.tabIndicatorHeight = j;
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.selectedListeners = ((ArrayList)localObject1);
    localObject1 = new androidx/core/util/Pools$SimplePool;
    ((Pools.SimplePool)localObject1).<init>(12);
    this.tabViewPool = ((Pools.Pool)localObject1);
    Context localContext = getContext();
    setHorizontalScrollBarEnabled(false);
    TabLayout.SlidingTabIndicator localSlidingTabIndicator = new com/google/android/material/tabs/TabLayout$SlidingTabIndicator;
    localSlidingTabIndicator.<init>(this, localContext);
    this.slidingTabIndicator = localSlidingTabIndicator;
    localObject1 = new android/widget/FrameLayout$LayoutParams;
    int n = -2;
    float f1 = 0.0F / 0.0F;
    ((FrameLayout.LayoutParams)localObject1).<init>(n, j);
    super.addView(localSlidingTabIndicator, 0, (ViewGroup.LayoutParams)localObject1);
    Object localObject2 = com.google.android.material.R.styleable.TabLayout;
    int i2 = com.google.android.material.R.styleable.TabLayout_tabTextAppearance;
    int[] arrayOfInt1 = { i2 };
    localObject1 = localContext;
    Object localObject3 = paramAttributeSet;
    int i3 = paramInt;
    paramAttributeSet = ThemeEnforcement.obtainStyledAttributes(localContext, paramAttributeSet, (int[])localObject2, paramInt, i, arrayOfInt1);
    Object localObject4 = getBackground();
    paramInt = localObject4 instanceof ColorDrawable;
    if (paramInt != 0)
    {
      localObject4 = (ColorDrawable)getBackground();
      localObject1 = new com/google/android/material/shape/MaterialShapeDrawable;
      ((MaterialShapeDrawable)localObject1).<init>();
      paramInt = ((ColorDrawable)localObject4).getColor();
      localObject4 = ColorStateList.valueOf(paramInt);
      ((MaterialShapeDrawable)localObject1).setFillColor((ColorStateList)localObject4);
      ((MaterialShapeDrawable)localObject1).initializeElevationOverlay(localContext);
      float f2 = ViewCompat.OooOo0O(this);
      ((MaterialShapeDrawable)localObject1).setElevation(f2);
      ViewCompat.o0ooOoO(this, (Drawable)localObject1);
    }
    paramInt = com.google.android.material.R.styleable.TabLayout_tabIndicator;
    localObject4 = MaterialResources.getDrawable(localContext, paramAttributeSet, paramInt);
    setSelectedTabIndicator((Drawable)localObject4);
    paramInt = com.google.android.material.R.styleable.TabLayout_tabIndicatorColor;
    paramInt = paramAttributeSet.getColor(paramInt, 0);
    setSelectedTabIndicatorColor(paramInt);
    paramInt = com.google.android.material.R.styleable.TabLayout_tabIndicatorHeight;
    paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, j);
    localSlidingTabIndicator.setSelectedIndicatorHeight(paramInt);
    paramInt = com.google.android.material.R.styleable.TabLayout_tabIndicatorGravity;
    paramInt = paramAttributeSet.getInt(paramInt, 0);
    setSelectedTabIndicatorGravity(paramInt);
    paramInt = com.google.android.material.R.styleable.TabLayout_tabIndicatorAnimationMode;
    paramInt = paramAttributeSet.getInt(paramInt, 0);
    setTabIndicatorAnimationMode(paramInt);
    paramInt = com.google.android.material.R.styleable.TabLayout_tabIndicatorFullWidth;
    i2 = 1;
    paramInt = paramAttributeSet.getBoolean(paramInt, i2);
    setTabIndicatorFullWidth(paramInt);
    paramInt = com.google.android.material.R.styleable.TabLayout_tabPadding;
    paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, 0);
    this.tabPaddingBottom = paramInt;
    this.tabPaddingEnd = paramInt;
    this.tabPaddingTop = paramInt;
    this.tabPaddingStart = paramInt;
    n = com.google.android.material.R.styleable.TabLayout_tabPaddingStart;
    paramInt = paramAttributeSet.getDimensionPixelSize(n, paramInt);
    this.tabPaddingStart = paramInt;
    paramInt = com.google.android.material.R.styleable.TabLayout_tabPaddingTop;
    n = this.tabPaddingTop;
    paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, n);
    this.tabPaddingTop = paramInt;
    paramInt = com.google.android.material.R.styleable.TabLayout_tabPaddingEnd;
    n = this.tabPaddingEnd;
    paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, n);
    this.tabPaddingEnd = paramInt;
    paramInt = com.google.android.material.R.styleable.TabLayout_tabPaddingBottom;
    n = this.tabPaddingBottom;
    paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, n);
    this.tabPaddingBottom = paramInt;
    paramInt = ThemeEnforcement.isMaterial3Theme(localContext);
    if (paramInt != 0) {
      paramInt = R.attr.textAppearanceTitleSmall;
    } else {
      paramInt = R.attr.textAppearanceButton;
    }
    this.defaultTabTextAppearance = paramInt;
    paramInt = com.google.android.material.R.styleable.TabLayout_tabTextAppearance;
    n = R.style.TextAppearance_Design_Tab;
    paramInt = paramAttributeSet.getResourceId(paramInt, n);
    this.tabTextAppearance = paramInt;
    localObject3 = androidx.appcompat.R.styleable.TextAppearance;
    localObject3 = localContext.obtainStyledAttributes(paramInt, (int[])localObject3);
    try
    {
      int i4 = androidx.appcompat.R.styleable.TextAppearance_android_textSize;
      i4 = ((TypedArray)localObject3).getDimensionPixelSize(i4, 0);
      float f3 = i4;
      this.tabTextSize = f3;
      i4 = androidx.appcompat.R.styleable.TextAppearance_android_textColor;
      localObject2 = MaterialResources.getColorStateList(localContext, (TypedArray)localObject3, i4);
      this.tabTextColors = ((ColorStateList)localObject2);
      ((TypedArray)localObject3).recycle();
      n = com.google.android.material.R.styleable.TabLayout_tabSelectedTextAppearance;
      boolean bool3 = paramAttributeSet.hasValue(n);
      int i1;
      if (bool3)
      {
        i1 = com.google.android.material.R.styleable.TabLayout_tabSelectedTextAppearance;
        paramInt = paramAttributeSet.getResourceId(i1, paramInt);
        this.selectedTabTextAppearance = paramInt;
      }
      paramInt = this.selectedTabTextAppearance;
      if (paramInt != j)
      {
        localObject3 = androidx.appcompat.R.styleable.TextAppearance;
        localObject4 = localContext.obtainStyledAttributes(paramInt, (int[])localObject3);
        try
        {
          i1 = androidx.appcompat.R.styleable.TextAppearance_android_textSize;
          f3 = this.tabTextSize;
          i4 = (int)f3;
          i1 = ((TypedArray)localObject4).getDimensionPixelSize(i1, i4);
          f1 = i1;
          this.selectedTabTextSize = f1;
          i1 = androidx.appcompat.R.styleable.TextAppearance_android_textColor;
          localObject3 = MaterialResources.getColorStateList(localContext, (TypedArray)localObject4, i1);
          if (localObject3 != null)
          {
            localObject2 = this.tabTextColors;
            i4 = ((ColorStateList)localObject2).getDefaultColor();
            i3 = 16842913;
            int[] arrayOfInt2 = { i3 };
            i = ((ColorStateList)localObject3).getDefaultColor();
            i1 = ((ColorStateList)localObject3).getColorForState(arrayOfInt2, i);
            localObject3 = createColorStateList(i4, i1);
            this.tabTextColors = ((ColorStateList)localObject3);
          }
        }
        finally {}
      }
      paramInt = com.google.android.material.R.styleable.TabLayout_tabTextColor;
      paramInt = paramAttributeSet.hasValue(paramInt);
      if (paramInt != 0)
      {
        paramInt = com.google.android.material.R.styleable.TabLayout_tabTextColor;
        localObject4 = MaterialResources.getColorStateList(localContext, paramAttributeSet, paramInt);
        this.tabTextColors = ((ColorStateList)localObject4);
      }
      paramInt = com.google.android.material.R.styleable.TabLayout_tabSelectedTextColor;
      paramInt = paramAttributeSet.hasValue(paramInt);
      if (paramInt != 0)
      {
        paramInt = com.google.android.material.R.styleable.TabLayout_tabSelectedTextColor;
        paramInt = paramAttributeSet.getColor(paramInt, 0);
        localObject3 = this.tabTextColors;
        i1 = ((ColorStateList)localObject3).getDefaultColor();
        localObject4 = createColorStateList(i1, paramInt);
        this.tabTextColors = ((ColorStateList)localObject4);
      }
      paramInt = com.google.android.material.R.styleable.TabLayout_tabIconTint;
      localObject4 = MaterialResources.getColorStateList(localContext, paramAttributeSet, paramInt);
      this.tabIconTint = ((ColorStateList)localObject4);
      paramInt = com.google.android.material.R.styleable.TabLayout_tabIconTintMode;
      localObject4 = ViewUtils.parseTintMode(paramAttributeSet.getInt(paramInt, j), null);
      this.tabIconTintMode = ((PorterDuff.Mode)localObject4);
      paramInt = com.google.android.material.R.styleable.TabLayout_tabRippleColor;
      localObject4 = MaterialResources.getColorStateList(localContext, paramAttributeSet, paramInt);
      this.tabRippleColorStateList = ((ColorStateList)localObject4);
      paramInt = com.google.android.material.R.styleable.TabLayout_tabIndicatorAnimationDuration;
      paramInt = paramAttributeSet.getInt(paramInt, 300);
      this.tabIndicatorAnimationDuration = paramInt;
      paramInt = R.attr.motionEasingEmphasizedInterpolator;
      localObject3 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
      localObject4 = MotionUtils.resolveThemeInterpolator(localContext, paramInt, (TimeInterpolator)localObject3);
      this.tabIndicatorTimeInterpolator = ((TimeInterpolator)localObject4);
      paramInt = com.google.android.material.R.styleable.TabLayout_tabMinWidth;
      paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, j);
      this.requestedTabMinWidth = paramInt;
      paramInt = com.google.android.material.R.styleable.TabLayout_tabMaxWidth;
      j = paramAttributeSet.getDimensionPixelSize(paramInt, j);
      this.requestedTabMaxWidth = j;
      j = com.google.android.material.R.styleable.TabLayout_tabBackground;
      j = paramAttributeSet.getResourceId(j, 0);
      this.tabBackgroundResId = j;
      j = com.google.android.material.R.styleable.TabLayout_tabContentStart;
      j = paramAttributeSet.getDimensionPixelSize(j, 0);
      this.contentInsetStart = j;
      j = com.google.android.material.R.styleable.TabLayout_tabMode;
      j = paramAttributeSet.getInt(j, i2);
      this.mode = j;
      j = com.google.android.material.R.styleable.TabLayout_tabGravity;
      j = paramAttributeSet.getInt(j, 0);
      this.tabGravity = j;
      j = com.google.android.material.R.styleable.TabLayout_tabInlineLabel;
      boolean bool1 = paramAttributeSet.getBoolean(j, false);
      this.inlineLabel = bool1;
      int k = com.google.android.material.R.styleable.TabLayout_tabUnboundedRipple;
      boolean bool2 = paramAttributeSet.getBoolean(k, false);
      this.unboundedRipple = bool2;
      paramAttributeSet.recycle();
      paramContext = getResources();
      int i5 = R.dimen.design_tab_text_size_2line;
      float f4 = paramContext.getDimensionPixelSize(i5);
      this.tabTextMultiLineSize = f4;
      i5 = R.dimen.design_tab_scrollable_min_width;
      int m = paramContext.getDimensionPixelSize(i5);
      this.scrollableTabMinWidth = m;
      applyModeAndGravity();
      return;
    }
    finally
    {
      ((TypedArray)localObject3).recycle();
    }
  }
  
  private void addTabFromItemView(TabItem paramTabItem)
  {
    TabLayout.Tab localTab = newTab();
    Object localObject = paramTabItem.text;
    if (localObject != null) {
      localTab.setText((CharSequence)localObject);
    }
    localObject = paramTabItem.icon;
    if (localObject != null) {
      localTab.setIcon((Drawable)localObject);
    }
    int i = paramTabItem.customLayout;
    if (i != 0) {
      localTab.setCustomView(i);
    }
    localObject = paramTabItem.getContentDescription();
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool)
    {
      paramTabItem = paramTabItem.getContentDescription();
      localTab.setContentDescription(paramTabItem);
    }
    addTab(localTab);
  }
  
  private void addTabView(TabLayout.Tab paramTab)
  {
    TabLayout.TabView localTabView = paramTab.view;
    localTabView.setSelected(false);
    localTabView.setActivated(false);
    TabLayout.SlidingTabIndicator localSlidingTabIndicator = this.slidingTabIndicator;
    int i = paramTab.getPosition();
    LinearLayout.LayoutParams localLayoutParams = createLayoutParamsForTabs();
    localSlidingTabIndicator.addView(localTabView, i, localLayoutParams);
  }
  
  private void addViewInternal(View paramView)
  {
    boolean bool = paramView instanceof TabItem;
    if (bool)
    {
      paramView = (TabItem)paramView;
      addTabFromItemView(paramView);
      return;
    }
    paramView = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("ok240609154F4410102A281811570F13272F1B171B222D611F221E65242A68282E2F2F316E43297166323251353E314C4E");
    paramView.<init>(str);
    throw paramView;
  }
  
  private void animateToTab(int paramInt)
  {
    int i = -1;
    if (paramInt == i) {
      return;
    }
    Object localObject = getWindowToken();
    int k = 0;
    if (localObject != null)
    {
      boolean bool = ViewCompat.OoooOOO(this);
      if (bool)
      {
        localObject = this.slidingTabIndicator;
        bool = ((TabLayout.SlidingTabIndicator)localObject).childrenNeedLayout();
        if (!bool)
        {
          int j = getScrollX();
          k = calculateScrollXForTab(paramInt, 0.0F);
          if (j != k)
          {
            ensureScrollAnimator();
            ValueAnimator localValueAnimator = this.scrollAnimator;
            localObject = new int[] { j, k };
            localValueAnimator.setIntValues((int[])localObject);
            localObject = this.scrollAnimator;
            ((ValueAnimator)localObject).start();
          }
          localObject = this.slidingTabIndicator;
          k = this.tabIndicatorAnimationDuration;
          ((TabLayout.SlidingTabIndicator)localObject).animateIndicatorToPosition(paramInt, k);
          return;
        }
      }
    }
    setScrollPosition(paramInt, 0.0F, true);
  }
  
  private void applyGravityForModeScrollable(int paramInt)
  {
    if (paramInt != 0)
    {
      i = 1;
      if (paramInt != i)
      {
        i = 2;
        if (paramInt != i) {
          return;
        }
      }
      else
      {
        localSlidingTabIndicator = this.slidingTabIndicator;
        break label38;
      }
    }
    TabLayout.SlidingTabIndicator localSlidingTabIndicator = this.slidingTabIndicator;
    int i = 8388611;
    label38:
    localSlidingTabIndicator.setGravity(i);
  }
  
  private void applyModeAndGravity()
  {
    int i = this.mode;
    int j = 2;
    int k = 0;
    TabLayout.SlidingTabIndicator localSlidingTabIndicator1;
    if ((i != 0) && (i != j))
    {
      i = 0;
      localSlidingTabIndicator1 = null;
    }
    else
    {
      i = this.contentInsetStart;
      int m = this.tabPaddingStart;
      i -= m;
      i = Math.max(0, i);
    }
    TabLayout.SlidingTabIndicator localSlidingTabIndicator2 = this.slidingTabIndicator;
    ViewCompat.o00000O(localSlidingTabIndicator2, i, 0, 0, 0);
    i = this.mode;
    k = 1;
    if (i != 0)
    {
      if ((i == k) || (i == j))
      {
        localSlidingTabIndicator1 = this.slidingTabIndicator;
        localSlidingTabIndicator1.setGravity(k);
      }
    }
    else
    {
      i = this.tabGravity;
      applyGravityForModeScrollable(i);
    }
    updateTabViews(k);
  }
  
  private int calculateScrollXForTab(int paramInt, float paramFloat)
  {
    int i = this.mode;
    int j = 0;
    float f1 = 0.0F;
    int k = 2;
    if ((i != 0) && (i != k)) {
      return 0;
    }
    View localView1 = this.slidingTabIndicator.getChildAt(paramInt);
    if (localView1 == null) {
      return 0;
    }
    paramInt += 1;
    TabLayout.SlidingTabIndicator localSlidingTabIndicator = this.slidingTabIndicator;
    int m = localSlidingTabIndicator.getChildCount();
    View localView2;
    if (paramInt < m)
    {
      localSlidingTabIndicator = this.slidingTabIndicator;
      localView2 = localSlidingTabIndicator.getChildAt(paramInt);
    }
    else
    {
      paramInt = 0;
      localView2 = null;
    }
    m = localView1.getWidth();
    if (localView2 != null) {
      j = localView2.getWidth();
    }
    paramInt = localView1.getLeft();
    i = m / 2;
    paramInt += i;
    i = getWidth() / k;
    paramInt -= i;
    m += j;
    float f2 = m;
    j = 1056964608;
    f1 = 0.5F;
    f2 = f2 * f1 * paramFloat;
    int n = (int)f2;
    i = ViewCompat.OooOoOO(this);
    if (i == 0) {
      paramInt += n;
    } else {
      paramInt -= n;
    }
    return paramInt;
  }
  
  private void configureTab(TabLayout.Tab paramTab, int paramInt)
  {
    paramTab.setPosition(paramInt);
    ArrayList localArrayList = this.tabs;
    localArrayList.add(paramInt, paramTab);
    paramTab = this.tabs;
    int i = paramTab.size();
    paramInt += 1;
    int j = -1;
    while (paramInt < i)
    {
      TabLayout.Tab localTab = (TabLayout.Tab)this.tabs.get(paramInt);
      int k = localTab.getPosition();
      int m = this.indicatorPosition;
      if (k == m) {
        j = paramInt;
      }
      localTab = (TabLayout.Tab)this.tabs.get(paramInt);
      localTab.setPosition(paramInt);
      paramInt += 1;
    }
    this.indicatorPosition = j;
  }
  
  private static ColorStateList createColorStateList(int paramInt1, int paramInt2)
  {
    int i = 2;
    int[][] arrayOfInt = new int[i][];
    int[] arrayOfInt1 = new int[i];
    int[] arrayOfInt2 = HorizontalScrollView.SELECTED_STATE_SET;
    arrayOfInt[0] = arrayOfInt2;
    arrayOfInt1[0] = paramInt2;
    int[] arrayOfInt3 = HorizontalScrollView.EMPTY_STATE_SET;
    int j = 1;
    arrayOfInt[j] = arrayOfInt3;
    arrayOfInt1[j] = paramInt1;
    ColorStateList localColorStateList = new android/content/res/ColorStateList;
    localColorStateList.<init>(arrayOfInt, arrayOfInt1);
    return localColorStateList;
  }
  
  private LinearLayout.LayoutParams createLayoutParamsForTabs()
  {
    LinearLayout.LayoutParams localLayoutParams = new android/widget/LinearLayout$LayoutParams;
    localLayoutParams.<init>(-2, -1);
    updateTabViewLayoutParams(localLayoutParams);
    return localLayoutParams;
  }
  
  private TabLayout.TabView createTabView(TabLayout.Tab paramTab)
  {
    Object localObject1 = this.tabViewPool;
    if (localObject1 != null) {
      localObject1 = (TabLayout.TabView)((Pools.Pool)localObject1).OooO0O0();
    } else {
      localObject1 = null;
    }
    if (localObject1 == null)
    {
      localObject1 = new com/google/android/material/tabs/TabLayout$TabView;
      localObject2 = getContext();
      ((TabLayout.TabView)localObject1).<init>(this, (Context)localObject2);
    }
    ((TabLayout.TabView)localObject1).setTab(paramTab);
    ((View)localObject1).setFocusable(true);
    int i = getTabMinWidth();
    ((View)localObject1).setMinimumWidth(i);
    Object localObject2 = TabLayout.Tab.access$300(paramTab);
    boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
    if (bool) {
      paramTab = TabLayout.Tab.access$400(paramTab);
    } else {
      paramTab = TabLayout.Tab.access$300(paramTab);
    }
    ((View)localObject1).setContentDescription(paramTab);
    return localObject1;
  }
  
  private void dispatchTabReselected(TabLayout.Tab paramTab)
  {
    ArrayList localArrayList = this.selectedListeners;
    int i = localArrayList.size() + -1;
    while (i >= 0)
    {
      TabLayout.BaseOnTabSelectedListener localBaseOnTabSelectedListener = (TabLayout.BaseOnTabSelectedListener)this.selectedListeners.get(i);
      localBaseOnTabSelectedListener.onTabReselected(paramTab);
      i += -1;
    }
  }
  
  private void dispatchTabSelected(TabLayout.Tab paramTab)
  {
    ArrayList localArrayList = this.selectedListeners;
    int i = localArrayList.size() + -1;
    while (i >= 0)
    {
      TabLayout.BaseOnTabSelectedListener localBaseOnTabSelectedListener = (TabLayout.BaseOnTabSelectedListener)this.selectedListeners.get(i);
      localBaseOnTabSelectedListener.onTabSelected(paramTab);
      i += -1;
    }
  }
  
  private void dispatchTabUnselected(TabLayout.Tab paramTab)
  {
    ArrayList localArrayList = this.selectedListeners;
    int i = localArrayList.size() + -1;
    while (i >= 0)
    {
      TabLayout.BaseOnTabSelectedListener localBaseOnTabSelectedListener = (TabLayout.BaseOnTabSelectedListener)this.selectedListeners.get(i);
      localBaseOnTabSelectedListener.onTabUnselected(paramTab);
      i += -1;
    }
  }
  
  private void ensureScrollAnimator()
  {
    ValueAnimator localValueAnimator = this.scrollAnimator;
    if (localValueAnimator == null)
    {
      localValueAnimator = new android/animation/ValueAnimator;
      localValueAnimator.<init>();
      this.scrollAnimator = localValueAnimator;
      Object localObject = this.tabIndicatorTimeInterpolator;
      localValueAnimator.setInterpolator((TimeInterpolator)localObject);
      localValueAnimator = this.scrollAnimator;
      int i = this.tabIndicatorAnimationDuration;
      long l = i;
      localValueAnimator.setDuration(l);
      localValueAnimator = this.scrollAnimator;
      localObject = new com/google/android/material/tabs/TabLayout$1;
      ((TabLayout.1)localObject).<init>(this);
      localValueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject);
    }
  }
  
  private int getDefaultHeight()
  {
    ArrayList localArrayList = this.tabs;
    int i = localArrayList.size();
    int k = 0;
    int m = 0;
    while (m < i)
    {
      Object localObject = (TabLayout.Tab)this.tabs.get(m);
      if (localObject != null)
      {
        Drawable localDrawable = ((TabLayout.Tab)localObject).getIcon();
        if (localDrawable != null)
        {
          localObject = ((TabLayout.Tab)localObject).getText();
          boolean bool2 = TextUtils.isEmpty((CharSequence)localObject);
          if (!bool2)
          {
            k = 1;
            break;
          }
        }
      }
      m += 1;
    }
    if (k != 0)
    {
      boolean bool1 = this.inlineLabel;
      if (!bool1) {
        return 72;
      }
    }
    int j = 48;
    return j;
  }
  
  private int getTabMinWidth()
  {
    int i = this.requestedTabMinWidth;
    int j = -1;
    if (i != j) {
      return i;
    }
    i = this.mode;
    if (i != 0)
    {
      j = 2;
      if (i != j) {
        return 0;
      }
    }
    i = this.scrollableTabMinWidth;
    return i;
  }
  
  private int getTabScrollRange()
  {
    int i = this.slidingTabIndicator.getWidth();
    int j = getWidth();
    i -= j;
    j = getPaddingLeft();
    i -= j;
    j = getPaddingRight();
    i -= j;
    return Math.max(0, i);
  }
  
  private boolean isScrollingEnabled()
  {
    int i = getTabMode();
    if (i != 0)
    {
      i = getTabMode();
      int j = 2;
      if (i != j) {
        return 0;
      }
    }
    i = 1;
    return i;
  }
  
  private void removeTabViewAt(int paramInt)
  {
    TabLayout.TabView localTabView = (TabLayout.TabView)this.slidingTabIndicator.getChildAt(paramInt);
    TabLayout.SlidingTabIndicator localSlidingTabIndicator = this.slidingTabIndicator;
    localSlidingTabIndicator.removeViewAt(paramInt);
    if (localTabView != null)
    {
      localTabView.reset();
      Pools.Pool localPool = this.tabViewPool;
      localPool.OooO00o(localTabView);
    }
    requestLayout();
  }
  
  private void setSelectedTabView(int paramInt)
  {
    TabLayout.SlidingTabIndicator localSlidingTabIndicator = this.slidingTabIndicator;
    int i = localSlidingTabIndicator.getChildCount();
    if (paramInt < i)
    {
      int j = 0;
      while (j < i)
      {
        Object localObject = this.slidingTabIndicator.getChildAt(j);
        boolean bool1 = true;
        boolean bool2;
        if (j == paramInt)
        {
          bool2 = ((View)localObject).isSelected();
          if (!bool2) {}
        }
        else
        {
          if (j == paramInt) {
            break label143;
          }
          bool2 = ((View)localObject).isSelected();
          if (!bool2) {
            break label143;
          }
        }
        if (j == paramInt) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
        ((View)localObject).setSelected(bool2);
        if (j != paramInt) {
          bool1 = false;
        }
        ((View)localObject).setActivated(bool1);
        bool1 = localObject instanceof TabLayout.TabView;
        if (bool1)
        {
          localObject = (TabLayout.TabView)localObject;
          ((TabLayout.TabView)localObject).updateTab();
          break label185;
          label143:
          if (j == paramInt) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
          ((View)localObject).setSelected(bool2);
          if (j != paramInt) {
            bool1 = false;
          }
          ((View)localObject).setActivated(bool1);
        }
        label185:
        j += 1;
      }
    }
  }
  
  private void setupWithViewPager(ViewPager paramViewPager, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = this.viewPager;
    if (localObject1 != null)
    {
      localObject2 = this.pageChangeListener;
      if (localObject2 != null) {
        ((ViewPager)localObject1).Oooo0OO((ViewPager.OnPageChangeListener)localObject2);
      }
      localObject1 = this.adapterChangeListener;
      if (localObject1 != null)
      {
        localObject2 = this.viewPager;
        ((ViewPager)localObject2).Oooo0O0((ViewPager.OnAdapterChangeListener)localObject1);
      }
    }
    localObject1 = this.currentVpSelectedListener;
    Object localObject2 = null;
    if (localObject1 != null)
    {
      removeOnTabSelectedListener((TabLayout.BaseOnTabSelectedListener)localObject1);
      this.currentVpSelectedListener = null;
    }
    int i;
    if (paramViewPager != null)
    {
      this.viewPager = paramViewPager;
      localObject1 = this.pageChangeListener;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/material/tabs/TabLayout$TabLayoutOnPageChangeListener;
        ((TabLayout.TabLayoutOnPageChangeListener)localObject1).<init>(this);
        this.pageChangeListener = ((TabLayout.TabLayoutOnPageChangeListener)localObject1);
      }
      this.pageChangeListener.reset();
      localObject1 = this.pageChangeListener;
      paramViewPager.OooO0OO((ViewPager.OnPageChangeListener)localObject1);
      localObject1 = new com/google/android/material/tabs/TabLayout$ViewPagerOnTabSelectedListener;
      ((TabLayout.ViewPagerOnTabSelectedListener)localObject1).<init>(paramViewPager);
      this.currentVpSelectedListener = ((TabLayout.BaseOnTabSelectedListener)localObject1);
      addOnTabSelectedListener((TabLayout.BaseOnTabSelectedListener)localObject1);
      localObject1 = paramViewPager.getAdapter();
      if (localObject1 != null) {
        setPagerAdapter((PagerAdapter)localObject1, paramBoolean1);
      }
      localObject1 = this.adapterChangeListener;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/material/tabs/TabLayout$AdapterChangeListener;
        ((TabLayout.AdapterChangeListener)localObject1).<init>(this);
        this.adapterChangeListener = ((TabLayout.AdapterChangeListener)localObject1);
      }
      localObject1 = this.adapterChangeListener;
      ((TabLayout.AdapterChangeListener)localObject1).setAutoRefresh(paramBoolean1);
      TabLayout.AdapterChangeListener localAdapterChangeListener = this.adapterChangeListener;
      paramViewPager.OooO0O0(localAdapterChangeListener);
      i = paramViewPager.getCurrentItem();
      paramBoolean1 = false;
      localAdapterChangeListener = null;
      boolean bool = true;
      setScrollPosition(i, 0.0F, bool);
    }
    else
    {
      this.viewPager = null;
      i = 0;
      paramViewPager = null;
      setPagerAdapter(null, false);
    }
    this.setupViewPagerImplicitly = paramBoolean2;
  }
  
  private void updateAllTabs()
  {
    ArrayList localArrayList = this.tabs;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      TabLayout.Tab localTab = (TabLayout.Tab)this.tabs.get(j);
      localTab.updateView();
      j += 1;
    }
  }
  
  private void updateTabViewLayoutParams(LinearLayout.LayoutParams paramLayoutParams)
  {
    int i = this.mode;
    int j = 1;
    if (i == j)
    {
      i = this.tabGravity;
      if (i == 0)
      {
        paramLayoutParams.width = 0;
        i = 1065353216;
        f = 1.0F;
        break label49;
      }
    }
    paramLayoutParams.width = -2;
    i = 0;
    float f = 0.0F;
    label49:
    paramLayoutParams.weight = f;
  }
  
  public void addOnTabSelectedListener(TabLayout.BaseOnTabSelectedListener paramBaseOnTabSelectedListener)
  {
    ArrayList localArrayList = this.selectedListeners;
    boolean bool = localArrayList.contains(paramBaseOnTabSelectedListener);
    if (!bool)
    {
      localArrayList = this.selectedListeners;
      localArrayList.add(paramBaseOnTabSelectedListener);
    }
  }
  
  public void addOnTabSelectedListener(TabLayout.OnTabSelectedListener paramOnTabSelectedListener)
  {
    addOnTabSelectedListener(paramOnTabSelectedListener);
  }
  
  public void addTab(TabLayout.Tab paramTab)
  {
    boolean bool = this.tabs.isEmpty();
    addTab(paramTab, bool);
  }
  
  public void addTab(TabLayout.Tab paramTab, int paramInt)
  {
    boolean bool = this.tabs.isEmpty();
    addTab(paramTab, paramInt, bool);
  }
  
  public void addTab(TabLayout.Tab paramTab, int paramInt, boolean paramBoolean)
  {
    TabLayout localTabLayout = paramTab.parent;
    if (localTabLayout == this)
    {
      configureTab(paramTab, paramInt);
      addTabView(paramTab);
      if (paramBoolean) {
        paramTab.select();
      }
      return;
    }
    paramTab = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("cQ0531357437394345473F2C7C314B7F3F81464A4A4B49394B573E8B204C503B4F485F4648A3");
    paramTab.<init>(str);
    throw paramTab;
  }
  
  public void addTab(TabLayout.Tab paramTab, boolean paramBoolean)
  {
    int i = this.tabs.size();
    addTab(paramTab, i, paramBoolean);
  }
  
  public void addView(View paramView)
  {
    addViewInternal(paramView);
  }
  
  public void addView(View paramView, int paramInt)
  {
    addViewInternal(paramView);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    addViewInternal(paramView);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    addViewInternal(paramView);
  }
  
  public void clearOnTabSelectedListeners()
  {
    this.selectedListeners.clear();
  }
  
  public TabLayout.Tab createTabFromPool()
  {
    TabLayout.Tab localTab = (TabLayout.Tab)tabPool.OooO0O0();
    if (localTab == null)
    {
      localTab = new com/google/android/material/tabs/TabLayout$Tab;
      localTab.<init>();
    }
    return localTab;
  }
  
  public FrameLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return generateDefaultLayoutParams();
  }
  
  public int getSelectedTabPosition()
  {
    TabLayout.Tab localTab = this.selectedTab;
    int i;
    if (localTab != null) {
      i = localTab.getPosition();
    } else {
      i = -1;
    }
    return i;
  }
  
  public TabLayout.Tab getTabAt(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = getTabCount();
      if (paramInt < i)
      {
        ArrayList localArrayList = this.tabs;
        localTab = (TabLayout.Tab)localArrayList.get(paramInt);
        break label40;
      }
    }
    paramInt = 0;
    TabLayout.Tab localTab = null;
    label40:
    return localTab;
  }
  
  public int getTabCount()
  {
    return this.tabs.size();
  }
  
  public int getTabGravity()
  {
    return this.tabGravity;
  }
  
  public ColorStateList getTabIconTint()
  {
    return this.tabIconTint;
  }
  
  public int getTabIndicatorAnimationMode()
  {
    return this.tabIndicatorAnimationMode;
  }
  
  public int getTabIndicatorGravity()
  {
    return this.tabIndicatorGravity;
  }
  
  public int getTabMaxWidth()
  {
    return this.tabMaxWidth;
  }
  
  public int getTabMode()
  {
    return this.mode;
  }
  
  public ColorStateList getTabRippleColor()
  {
    return this.tabRippleColorStateList;
  }
  
  public Drawable getTabSelectedIndicator()
  {
    return this.tabSelectedIndicator;
  }
  
  public ColorStateList getTabTextColors()
  {
    return this.tabTextColors;
  }
  
  public boolean hasUnboundedRipple()
  {
    return this.unboundedRipple;
  }
  
  public boolean isInlineLabel()
  {
    return this.inlineLabel;
  }
  
  public boolean isTabIndicatorFullWidth()
  {
    return this.tabIndicatorFullWidth;
  }
  
  public TabLayout.Tab newTab()
  {
    TabLayout.Tab localTab = createTabFromPool();
    localTab.parent = this;
    TabLayout.TabView localTabView = createTabView(localTab);
    localTab.view = localTabView;
    int i = TabLayout.Tab.access$000(localTab);
    int j = -1;
    if (i != j)
    {
      localTabView = localTab.view;
      j = TabLayout.Tab.access$000(localTab);
      localTabView.setId(j);
    }
    return localTab;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    MaterialShapeUtils.setParentAbsoluteElevation(this);
    Object localObject = this.viewPager;
    if (localObject == null)
    {
      localObject = getParent();
      boolean bool = localObject instanceof ViewPager;
      if (bool)
      {
        localObject = (ViewPager)localObject;
        bool = true;
        setupWithViewPager((ViewPager)localObject, bool, bool);
      }
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    boolean bool = this.setupViewPagerImplicitly;
    if (bool)
    {
      setupWithViewPager(null);
      bool = false;
      this.setupViewPagerImplicitly = false;
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    int i = 0;
    for (;;)
    {
      Object localObject = this.slidingTabIndicator;
      int j = ((ViewGroup)localObject).getChildCount();
      if (i >= j) {
        break;
      }
      localObject = this.slidingTabIndicator.getChildAt(i);
      boolean bool = localObject instanceof TabLayout.TabView;
      if (bool)
      {
        localObject = (TabLayout.TabView)localObject;
        TabLayout.TabView.access$500((TabLayout.TabView)localObject, paramCanvas);
      }
      i += 1;
    }
    super.onDraw(paramCanvas);
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo = AccessibilityNodeInfoCompat.OooOo00(paramAccessibilityNodeInfo);
    int i = getTabCount();
    int j = 1;
    AccessibilityNodeInfoCompat.CollectionInfoCompat localCollectionInfoCompat = AccessibilityNodeInfoCompat.CollectionInfoCompat.OooO0O0(j, i, false, j);
    paramAccessibilityNodeInfo.setCollectionInfo(localCollectionInfoCompat);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = isScrollingEnabled();
    if (bool1)
    {
      bool2 = super.onInterceptTouchEvent(paramMotionEvent);
      if (bool2) {
        return true;
      }
    }
    boolean bool2 = false;
    paramMotionEvent = null;
    return bool2;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Context localContext = getContext();
    int i = getDefaultHeight();
    float f1 = ViewUtils.dpToPx(localContext, i);
    int j = Math.round(f1);
    i = View.MeasureSpec.getMode(paramInt2);
    int k = -1 << -1;
    int m = 1073741824;
    int n = 0;
    int i1 = 1;
    Object localObject;
    if (i != k)
    {
      if (i == 0)
      {
        paramInt2 = getPaddingTop();
        j += paramInt2;
        paramInt2 = getPaddingBottom();
        j += paramInt2;
        paramInt2 = View.MeasureSpec.makeMeasureSpec(j, m);
      }
    }
    else
    {
      i = getChildCount();
      if (i == i1)
      {
        i = View.MeasureSpec.getSize(paramInt2);
        if (i >= j)
        {
          localObject = getChildAt(0);
          ((View)localObject).setMinimumHeight(j);
        }
      }
    }
    j = View.MeasureSpec.getSize(paramInt1);
    i = View.MeasureSpec.getMode(paramInt1);
    float f2;
    if (i != 0)
    {
      i = this.requestedTabMaxWidth;
      if (i <= 0)
      {
        f1 = j;
        localObject = getContext();
        k = 56;
        f2 = ViewUtils.dpToPx((Context)localObject, k);
        f1 -= f2;
        i = (int)f1;
      }
      this.tabMaxWidth = i;
    }
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = getChildCount();
    if (paramInt1 == i1)
    {
      View localView = getChildAt(0);
      j = this.mode;
      if (j != 0) {
        if (j != i1)
        {
          i = 2;
          f2 = 2.802597E-045F;
          if (j != i) {
            break label319;
          }
        }
        else
        {
          j = localView.getMeasuredWidth();
          i = getMeasuredWidth();
          if (j == i) {
            break label319;
          }
        }
      }
      do
      {
        n = i1;
        break;
        j = localView.getMeasuredWidth();
        i = getMeasuredWidth();
      } while (j < i);
      label319:
      if (n != 0)
      {
        j = getPaddingTop();
        i = getPaddingBottom();
        j += i;
        localObject = localView.getLayoutParams();
        i = ((ViewGroup.LayoutParams)localObject).height;
        paramInt2 = ViewGroup.getChildMeasureSpec(paramInt2, j, i);
        j = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), m);
        localView.measure(j, paramInt2);
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    int j = 8;
    if (i == j)
    {
      boolean bool = isScrollingEnabled();
      if (!bool) {
        return false;
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void populateFromPagerAdapter()
  {
    removeAllTabs();
    Object localObject = this.pagerAdapter;
    if (localObject != null)
    {
      int i = ((PagerAdapter)localObject).getCount();
      int j = 0;
      ViewPager localViewPager = null;
      int k = 0;
      while (k < i)
      {
        TabLayout.Tab localTab = newTab();
        CharSequence localCharSequence = this.pagerAdapter.getPageTitle(k);
        localTab = localTab.setText(localCharSequence);
        addTab(localTab, false);
        k += 1;
      }
      localViewPager = this.viewPager;
      if ((localViewPager != null) && (i > 0))
      {
        i = localViewPager.getCurrentItem();
        j = getSelectedTabPosition();
        if (i != j)
        {
          j = getTabCount();
          if (i < j)
          {
            localObject = getTabAt(i);
            selectTab((TabLayout.Tab)localObject);
          }
        }
      }
    }
  }
  
  public boolean releaseFromTabPool(TabLayout.Tab paramTab)
  {
    return tabPool.OooO00o(paramTab);
  }
  
  public void removeAllTabs()
  {
    Object localObject = this.slidingTabIndicator;
    int i = ((ViewGroup)localObject).getChildCount() + -1;
    while (i >= 0)
    {
      removeTabViewAt(i);
      i += -1;
    }
    localObject = this.tabs.iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject).hasNext();
      if (!bool) {
        break;
      }
      TabLayout.Tab localTab = (TabLayout.Tab)((Iterator)localObject).next();
      ((Iterator)localObject).remove();
      localTab.reset();
      releaseFromTabPool(localTab);
    }
    this.selectedTab = null;
  }
  
  public void removeOnTabSelectedListener(TabLayout.BaseOnTabSelectedListener paramBaseOnTabSelectedListener)
  {
    this.selectedListeners.remove(paramBaseOnTabSelectedListener);
  }
  
  public void removeOnTabSelectedListener(TabLayout.OnTabSelectedListener paramOnTabSelectedListener)
  {
    removeOnTabSelectedListener(paramOnTabSelectedListener);
  }
  
  public void removeTab(TabLayout.Tab paramTab)
  {
    Object localObject = paramTab.parent;
    if (localObject == this)
    {
      int i = paramTab.getPosition();
      removeTabAt(i);
      return;
    }
    paramTab = new java/lang/IllegalArgumentException;
    localObject = m54207b69.F54207b69_11("AF12282669262E293C6E31333D7231313939393379463E7C4946484F812E44422947604B56568D");
    paramTab.<init>((String)localObject);
    throw paramTab;
  }
  
  public void removeTabAt(int paramInt)
  {
    Object localObject1 = this.selectedTab;
    int i;
    if (localObject1 != null)
    {
      i = ((TabLayout.Tab)localObject1).getPosition();
    }
    else
    {
      i = 0;
      localObject1 = null;
    }
    removeTabViewAt(paramInt);
    Object localObject2 = (TabLayout.Tab)this.tabs.remove(paramInt);
    if (localObject2 != null)
    {
      ((TabLayout.Tab)localObject2).reset();
      releaseFromTabPool((TabLayout.Tab)localObject2);
    }
    localObject2 = this.tabs;
    int j = ((ArrayList)localObject2).size();
    int k = -1;
    int m = paramInt;
    while (m < j)
    {
      TabLayout.Tab localTab1 = (TabLayout.Tab)this.tabs.get(m);
      int n = localTab1.getPosition();
      int i1 = this.indicatorPosition;
      if (n == i1) {
        k = m;
      }
      localTab1 = (TabLayout.Tab)this.tabs.get(m);
      localTab1.setPosition(m);
      m += 1;
    }
    this.indicatorPosition = k;
    if (i == paramInt)
    {
      localObject1 = this.tabs;
      boolean bool = ((ArrayList)localObject1).isEmpty();
      TabLayout.Tab localTab2;
      if (bool)
      {
        paramInt = 0;
        localTab2 = null;
      }
      else
      {
        localObject1 = this.tabs;
        paramInt += -1;
        paramInt = Math.max(0, paramInt);
        localTab2 = (TabLayout.Tab)((ArrayList)localObject1).get(paramInt);
      }
      selectTab(localTab2);
    }
  }
  
  public void selectTab(TabLayout.Tab paramTab)
  {
    selectTab(paramTab, true);
  }
  
  public void selectTab(TabLayout.Tab paramTab, boolean paramBoolean)
  {
    TabLayout.Tab localTab = this.selectedTab;
    if (localTab == paramTab)
    {
      if (localTab != null)
      {
        dispatchTabReselected(paramTab);
        int i = paramTab.getPosition();
        animateToTab(i);
      }
    }
    else
    {
      boolean bool1 = true;
      boolean bool2;
      if (paramTab != null) {
        int j = paramTab.getPosition();
      } else {
        bool2 = bool1;
      }
      TabLayout localTabLayout;
      if (paramBoolean)
      {
        if (localTab != null)
        {
          paramBoolean = localTab.getPosition();
          if (paramBoolean != bool1) {}
        }
        else if (bool2 != bool1)
        {
          paramBoolean = false;
          localTabLayout = null;
          boolean bool3 = true;
          setScrollPosition(bool2, 0.0F, bool3);
          break label106;
        }
        animateToTab(bool2);
        label106:
        if (bool2 != bool1) {
          setSelectedTabView(bool2);
        }
      }
      this.selectedTab = paramTab;
      if (localTab != null)
      {
        localTabLayout = localTab.parent;
        if (localTabLayout != null) {
          dispatchTabUnselected(localTab);
        }
      }
      if (paramTab != null) {
        dispatchTabSelected(paramTab);
      }
    }
  }
  
  public void setElevation(float paramFloat)
  {
    super.setElevation(paramFloat);
    MaterialShapeUtils.setElevation(this, paramFloat);
  }
  
  public void setInlineLabel(boolean paramBoolean)
  {
    boolean bool1 = this.inlineLabel;
    if (bool1 != paramBoolean)
    {
      this.inlineLabel = paramBoolean;
      paramBoolean = false;
      for (;;)
      {
        Object localObject = this.slidingTabIndicator;
        boolean bool2 = ((ViewGroup)localObject).getChildCount();
        if (paramBoolean >= bool2) {
          break;
        }
        localObject = this.slidingTabIndicator.getChildAt(paramBoolean);
        boolean bool3 = localObject instanceof TabLayout.TabView;
        if (bool3)
        {
          localObject = (TabLayout.TabView)localObject;
          ((TabLayout.TabView)localObject).updateOrientation();
        }
        paramBoolean += true;
      }
      applyModeAndGravity();
    }
  }
  
  public void setInlineLabelResource(int paramInt)
  {
    paramInt = getResources().getBoolean(paramInt);
    setInlineLabel(paramInt);
  }
  
  public void setOnTabSelectedListener(TabLayout.BaseOnTabSelectedListener paramBaseOnTabSelectedListener)
  {
    TabLayout.BaseOnTabSelectedListener localBaseOnTabSelectedListener = this.selectedListener;
    if (localBaseOnTabSelectedListener != null) {
      removeOnTabSelectedListener(localBaseOnTabSelectedListener);
    }
    this.selectedListener = paramBaseOnTabSelectedListener;
    if (paramBaseOnTabSelectedListener != null) {
      addOnTabSelectedListener(paramBaseOnTabSelectedListener);
    }
  }
  
  public void setOnTabSelectedListener(TabLayout.OnTabSelectedListener paramOnTabSelectedListener)
  {
    setOnTabSelectedListener(paramOnTabSelectedListener);
  }
  
  public void setPagerAdapter(PagerAdapter paramPagerAdapter, boolean paramBoolean)
  {
    PagerAdapter localPagerAdapter = this.pagerAdapter;
    if (localPagerAdapter != null)
    {
      DataSetObserver localDataSetObserver = this.pagerAdapterObserver;
      if (localDataSetObserver != null) {
        localPagerAdapter.OooOOo0(localDataSetObserver);
      }
    }
    this.pagerAdapter = paramPagerAdapter;
    if ((paramBoolean) && (paramPagerAdapter != null))
    {
      Object localObject = this.pagerAdapterObserver;
      if (localObject == null)
      {
        localObject = new com/google/android/material/tabs/TabLayout$PagerAdapterObserver;
        ((TabLayout.PagerAdapterObserver)localObject).<init>(this);
        this.pagerAdapterObserver = ((DataSetObserver)localObject);
      }
      localObject = this.pagerAdapterObserver;
      paramPagerAdapter.OooOO0((DataSetObserver)localObject);
    }
    populateFromPagerAdapter();
  }
  
  public void setScrollAnimatorListener(Animator.AnimatorListener paramAnimatorListener)
  {
    ensureScrollAnimator();
    this.scrollAnimator.addListener(paramAnimatorListener);
  }
  
  public void setScrollPosition(int paramInt, float paramFloat, boolean paramBoolean)
  {
    setScrollPosition(paramInt, paramFloat, paramBoolean, true);
  }
  
  public void setScrollPosition(int paramInt, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    setScrollPosition(paramInt, paramFloat, paramBoolean1, paramBoolean2, true);
  }
  
  public void setScrollPosition(int paramInt, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    float f = paramInt + paramFloat;
    int i = Math.round(f);
    if (i >= 0)
    {
      TabLayout.SlidingTabIndicator localSlidingTabIndicator = this.slidingTabIndicator;
      int j = localSlidingTabIndicator.getChildCount();
      if (i < j)
      {
        if (paramBoolean2)
        {
          localObject = this.slidingTabIndicator;
          ((TabLayout.SlidingTabIndicator)localObject).setIndicatorPositionFromTabPosition(paramInt, paramFloat);
        }
        Object localObject = this.scrollAnimator;
        if (localObject != null)
        {
          paramBoolean2 = ((ValueAnimator)localObject).isRunning();
          if (paramBoolean2)
          {
            localObject = this.scrollAnimator;
            ((ValueAnimator)localObject).cancel();
          }
        }
        boolean bool1 = calculateScrollXForTab(paramInt, paramFloat);
        paramBoolean2 = getScrollX();
        j = getSelectedTabPosition();
        boolean bool2 = true;
        if ((paramInt >= j) || (bool1 < paramBoolean2))
        {
          j = getSelectedTabPosition();
          if ((paramInt <= j) || (bool1 > paramBoolean2))
          {
            j = getSelectedTabPosition();
            if (paramInt != j) {
              break label167;
            }
          }
        }
        j = bool2;
        break label173;
        label167:
        j = 0;
        localSlidingTabIndicator = null;
        label173:
        boolean bool3 = ViewCompat.OooOoOO(this);
        if (bool3 == bool2)
        {
          j = getSelectedTabPosition();
          if ((paramInt >= j) || (bool1 > paramBoolean2))
          {
            j = getSelectedTabPosition();
            if ((paramInt <= j) || (bool1 < paramBoolean2))
            {
              paramBoolean2 = getSelectedTabPosition();
              if (paramInt != paramBoolean2) {
                break label243;
              }
            }
          }
          j = bool2;
          break label249;
          label243:
          j = 0;
          localSlidingTabIndicator = null;
        }
        label249:
        if (j == 0)
        {
          paramBoolean2 = this.viewPagerScrollState;
          if ((paramBoolean2 != bool2) && (!paramBoolean3)) {}
        }
        else
        {
          if (paramInt < 0)
          {
            bool1 = false;
            paramFloat = 0.0F;
          }
          scrollTo(bool1, 0);
        }
        if (paramBoolean1) {
          setSelectedTabView(i);
        }
      }
    }
  }
  
  public void setSelectedTabIndicator(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0)
    {
      Context localContext = getContext();
      localDrawable = AppCompatResources.OooO0O0(localContext, paramInt);
    }
    else
    {
      paramInt = 0;
      localDrawable = null;
    }
    setSelectedTabIndicator(localDrawable);
  }
  
  public void setSelectedTabIndicator(Drawable paramDrawable)
  {
    if (paramDrawable == null)
    {
      paramDrawable = new android/graphics/drawable/GradientDrawable;
      paramDrawable.<init>();
    }
    paramDrawable = DrawableCompat.OooOOo(paramDrawable).mutate();
    this.tabSelectedIndicator = paramDrawable;
    int i = this.tabSelectedIndicatorColor;
    DrawableUtils.setTint(paramDrawable, i);
    int j = this.tabIndicatorHeight;
    i = -1;
    if (j == i)
    {
      paramDrawable = this.tabSelectedIndicator;
      j = paramDrawable.getIntrinsicHeight();
    }
    this.slidingTabIndicator.setSelectedIndicatorHeight(j);
  }
  
  public void setSelectedTabIndicatorColor(int paramInt)
  {
    this.tabSelectedIndicatorColor = paramInt;
    DrawableUtils.setTint(this.tabSelectedIndicator, paramInt);
    updateTabViews(false);
  }
  
  public void setSelectedTabIndicatorGravity(int paramInt)
  {
    int i = this.tabIndicatorGravity;
    if (i != paramInt)
    {
      this.tabIndicatorGravity = paramInt;
      TabLayout.SlidingTabIndicator localSlidingTabIndicator = this.slidingTabIndicator;
      ViewCompat.Ooooooo(localSlidingTabIndicator);
    }
  }
  
  public void setSelectedTabIndicatorHeight(int paramInt)
  {
    this.tabIndicatorHeight = paramInt;
    this.slidingTabIndicator.setSelectedIndicatorHeight(paramInt);
  }
  
  public void setTabGravity(int paramInt)
  {
    int i = this.tabGravity;
    if (i != paramInt)
    {
      this.tabGravity = paramInt;
      applyModeAndGravity();
    }
  }
  
  public void setTabIconTint(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.tabIconTint;
    if (localColorStateList != paramColorStateList)
    {
      this.tabIconTint = paramColorStateList;
      updateAllTabs();
    }
  }
  
  public void setTabIconTintResource(int paramInt)
  {
    ColorStateList localColorStateList = AppCompatResources.OooO00o(getContext(), paramInt);
    setTabIconTint(localColorStateList);
  }
  
  public void setTabIndicatorAnimationMode(int paramInt)
  {
    this.tabIndicatorAnimationMode = paramInt;
    Object localObject;
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        i = 2;
        if (paramInt == i)
        {
          localObject = new com/google/android/material/tabs/FadeTabIndicatorInterpolator;
          ((FadeTabIndicatorInterpolator)localObject).<init>();
        }
        else
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append(paramInt);
          localObject = m54207b69.F54207b69_11("DH68223D6B2A2C426F31714834302E3A772C3A3C143A4137424155415525433F44495D434A4A2A4D5355");
          localStringBuilder.append((String)localObject);
          localObject = localStringBuilder.toString();
          localIllegalArgumentException.<init>((String)localObject);
          throw localIllegalArgumentException;
        }
      }
      else
      {
        localObject = new com/google/android/material/tabs/ElasticTabIndicatorInterpolator;
        ((ElasticTabIndicatorInterpolator)localObject).<init>();
      }
    }
    else
    {
      localObject = new com/google/android/material/tabs/TabIndicatorInterpolator;
      ((TabIndicatorInterpolator)localObject).<init>();
    }
    this.tabIndicatorInterpolator = ((TabIndicatorInterpolator)localObject);
  }
  
  public void setTabIndicatorFullWidth(boolean paramBoolean)
  {
    this.tabIndicatorFullWidth = paramBoolean;
    TabLayout.SlidingTabIndicator.access$100(this.slidingTabIndicator);
    ViewCompat.Ooooooo(this.slidingTabIndicator);
  }
  
  public void setTabMode(int paramInt)
  {
    int i = this.mode;
    if (paramInt != i)
    {
      this.mode = paramInt;
      applyModeAndGravity();
    }
  }
  
  public void setTabRippleColor(ColorStateList paramColorStateList)
  {
    Object localObject = this.tabRippleColorStateList;
    if (localObject != paramColorStateList)
    {
      this.tabRippleColorStateList = paramColorStateList;
      int i = 0;
      paramColorStateList = null;
      for (;;)
      {
        localObject = this.slidingTabIndicator;
        int j = ((ViewGroup)localObject).getChildCount();
        if (i >= j) {
          break;
        }
        localObject = this.slidingTabIndicator.getChildAt(i);
        boolean bool = localObject instanceof TabLayout.TabView;
        if (bool)
        {
          localObject = (TabLayout.TabView)localObject;
          Context localContext = getContext();
          TabLayout.TabView.access$200((TabLayout.TabView)localObject, localContext);
        }
        i += 1;
      }
    }
  }
  
  public void setTabRippleColorResource(int paramInt)
  {
    ColorStateList localColorStateList = AppCompatResources.OooO00o(getContext(), paramInt);
    setTabRippleColor(localColorStateList);
  }
  
  public void setTabTextColors(int paramInt1, int paramInt2)
  {
    ColorStateList localColorStateList = createColorStateList(paramInt1, paramInt2);
    setTabTextColors(localColorStateList);
  }
  
  public void setTabTextColors(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.tabTextColors;
    if (localColorStateList != paramColorStateList)
    {
      this.tabTextColors = paramColorStateList;
      updateAllTabs();
    }
  }
  
  public void setTabsFromPagerAdapter(PagerAdapter paramPagerAdapter)
  {
    setPagerAdapter(paramPagerAdapter, false);
  }
  
  public void setUnboundedRipple(boolean paramBoolean)
  {
    boolean bool1 = this.unboundedRipple;
    if (bool1 != paramBoolean)
    {
      this.unboundedRipple = paramBoolean;
      paramBoolean = false;
      for (;;)
      {
        Object localObject = this.slidingTabIndicator;
        boolean bool2 = ((ViewGroup)localObject).getChildCount();
        if (paramBoolean >= bool2) {
          break;
        }
        localObject = this.slidingTabIndicator.getChildAt(paramBoolean);
        boolean bool3 = localObject instanceof TabLayout.TabView;
        if (bool3)
        {
          localObject = (TabLayout.TabView)localObject;
          Context localContext = getContext();
          TabLayout.TabView.access$200((TabLayout.TabView)localObject, localContext);
        }
        paramBoolean += true;
      }
    }
  }
  
  public void setUnboundedRippleResource(int paramInt)
  {
    paramInt = getResources().getBoolean(paramInt);
    setUnboundedRipple(paramInt);
  }
  
  public void setupWithViewPager(ViewPager paramViewPager)
  {
    setupWithViewPager(paramViewPager, true);
  }
  
  public void setupWithViewPager(ViewPager paramViewPager, boolean paramBoolean)
  {
    setupWithViewPager(paramViewPager, paramBoolean, false);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    int i = getTabScrollRange();
    if (i > 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void updateTabViews(boolean paramBoolean)
  {
    int i = 0;
    for (;;)
    {
      Object localObject = this.slidingTabIndicator;
      int j = ((ViewGroup)localObject).getChildCount();
      if (i >= j) {
        break;
      }
      localObject = this.slidingTabIndicator.getChildAt(i);
      int k = getTabMinWidth();
      ((View)localObject).setMinimumWidth(k);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)((View)localObject).getLayoutParams();
      updateTabViewLayoutParams(localLayoutParams);
      if (paramBoolean) {
        ((View)localObject).requestLayout();
      }
      i += 1;
    }
  }
  
  public void updateViewPagerScrollState(int paramInt)
  {
    this.viewPagerScrollState = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.tabs.TabLayout
 * JD-Core Version:    0.7.0.1
 */