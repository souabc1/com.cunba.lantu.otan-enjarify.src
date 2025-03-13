package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.styleable;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;

public class CollapsingToolbarLayout
  extends FrameLayout
{
  private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
  private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_CollapsingToolbar;
  public static final int TITLE_COLLAPSE_MODE_FADE = 1;
  public static final int TITLE_COLLAPSE_MODE_SCALE;
  final CollapsingTextHelper collapsingTextHelper;
  private boolean collapsingTitleEnabled;
  private Drawable contentScrim;
  int currentOffset;
  private boolean drawCollapsingTitle;
  private View dummyView;
  final ElevationOverlayProvider elevationOverlayProvider;
  private int expandedMarginBottom;
  private int expandedMarginEnd;
  private int expandedMarginStart;
  private int expandedMarginTop;
  private int extraMultilineHeight;
  private boolean extraMultilineHeightEnabled;
  private boolean forceApplySystemWindowInsetTop;
  WindowInsetsCompat lastInsets;
  private AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
  private boolean refreshToolbar;
  private int scrimAlpha;
  private long scrimAnimationDuration;
  private final TimeInterpolator scrimAnimationFadeInInterpolator;
  private final TimeInterpolator scrimAnimationFadeOutInterpolator;
  private ValueAnimator scrimAnimator;
  private int scrimVisibleHeightTrigger;
  private boolean scrimsAreShown;
  Drawable statusBarScrim;
  private int titleCollapseMode;
  private final Rect tmpRect;
  private ViewGroup toolbar;
  private View toolbarDirectChild;
  private int toolbarId;
  private int topInsetApplied;
  
  public CollapsingToolbarLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CollapsingToolbarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public CollapsingToolbarLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int j = 1;
    this.refreshToolbar = j;
    Object localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.tmpRect = ((Rect)localObject1);
    int i1 = -1;
    this.scrimVisibleHeightTrigger = i1;
    this.topInsetApplied = 0;
    this.extraMultilineHeight = 0;
    Context localContext = getContext();
    CollapsingTextHelper localCollapsingTextHelper = new com/google/android/material/internal/CollapsingTextHelper;
    localCollapsingTextHelper.<init>(this);
    this.collapsingTextHelper = localCollapsingTextHelper;
    localObject1 = com.google.android.material.animation.AnimationUtils.DECELERATE_INTERPOLATOR;
    localCollapsingTextHelper.setTextSizeInterpolator((TimeInterpolator)localObject1);
    localCollapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(false);
    localObject1 = new com/google/android/material/elevation/ElevationOverlayProvider;
    ((ElevationOverlayProvider)localObject1).<init>(localContext);
    this.elevationOverlayProvider = ((ElevationOverlayProvider)localObject1);
    int[] arrayOfInt1 = R.styleable.CollapsingToolbarLayout;
    int[] arrayOfInt2 = new int[0];
    localObject1 = localContext;
    paramAttributeSet = ThemeEnforcement.obtainStyledAttributes(localContext, paramAttributeSet, arrayOfInt1, paramInt, i, arrayOfInt2);
    paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleGravity;
    paramInt = paramAttributeSet.getInt(paramInt, 8388691);
    localCollapsingTextHelper.setExpandedTextGravity(paramInt);
    paramInt = R.styleable.CollapsingToolbarLayout_collapsedTitleGravity;
    int i2 = 8388627;
    paramInt = paramAttributeSet.getInt(paramInt, i2);
    localCollapsingTextHelper.setCollapsedTextGravity(paramInt);
    paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleMargin;
    paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, 0);
    this.expandedMarginBottom = paramInt;
    this.expandedMarginEnd = paramInt;
    this.expandedMarginTop = paramInt;
    this.expandedMarginStart = paramInt;
    paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart;
    paramInt = paramAttributeSet.hasValue(paramInt);
    if (paramInt != 0)
    {
      paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart;
      paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, 0);
      this.expandedMarginStart = paramInt;
    }
    paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd;
    paramInt = paramAttributeSet.hasValue(paramInt);
    if (paramInt != 0)
    {
      paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd;
      paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, 0);
      this.expandedMarginEnd = paramInt;
    }
    paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop;
    paramInt = paramAttributeSet.hasValue(paramInt);
    if (paramInt != 0)
    {
      paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop;
      paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, 0);
      this.expandedMarginTop = paramInt;
    }
    paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom;
    paramInt = paramAttributeSet.hasValue(paramInt);
    if (paramInt != 0)
    {
      paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom;
      paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, 0);
      this.expandedMarginBottom = paramInt;
    }
    paramInt = R.styleable.CollapsingToolbarLayout_titleEnabled;
    paramInt = paramAttributeSet.getBoolean(paramInt, j);
    this.collapsingTitleEnabled = paramInt;
    paramInt = R.styleable.CollapsingToolbarLayout_title;
    Object localObject2 = paramAttributeSet.getText(paramInt);
    setTitle((CharSequence)localObject2);
    paramInt = com.google.android.material.R.style.TextAppearance_Design_CollapsingToolbar_Expanded;
    localCollapsingTextHelper.setExpandedTextAppearance(paramInt);
    paramInt = androidx.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title;
    localCollapsingTextHelper.setCollapsedTextAppearance(paramInt);
    paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance;
    paramInt = paramAttributeSet.hasValue(paramInt);
    if (paramInt != 0)
    {
      paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance;
      paramInt = paramAttributeSet.getResourceId(paramInt, 0);
      localCollapsingTextHelper.setExpandedTextAppearance(paramInt);
    }
    paramInt = R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance;
    paramInt = paramAttributeSet.hasValue(paramInt);
    if (paramInt != 0)
    {
      paramInt = R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance;
      paramInt = paramAttributeSet.getResourceId(paramInt, 0);
      localCollapsingTextHelper.setCollapsedTextAppearance(paramInt);
    }
    paramInt = R.styleable.CollapsingToolbarLayout_titleTextEllipsize;
    paramInt = paramAttributeSet.hasValue(paramInt);
    if (paramInt != 0)
    {
      paramInt = R.styleable.CollapsingToolbarLayout_titleTextEllipsize;
      paramInt = paramAttributeSet.getInt(paramInt, i1);
      localObject2 = convertEllipsizeToTruncateAt(paramInt);
      setTitleEllipsize((TextUtils.TruncateAt)localObject2);
    }
    paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleTextColor;
    paramInt = paramAttributeSet.hasValue(paramInt);
    if (paramInt != 0)
    {
      paramInt = R.styleable.CollapsingToolbarLayout_expandedTitleTextColor;
      localObject2 = MaterialResources.getColorStateList(localContext, paramAttributeSet, paramInt);
      localCollapsingTextHelper.setExpandedTextColor((ColorStateList)localObject2);
    }
    paramInt = R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor;
    paramInt = paramAttributeSet.hasValue(paramInt);
    if (paramInt != 0)
    {
      paramInt = R.styleable.CollapsingToolbarLayout_collapsedTitleTextColor;
      localObject2 = MaterialResources.getColorStateList(localContext, paramAttributeSet, paramInt);
      localCollapsingTextHelper.setCollapsedTextColor((ColorStateList)localObject2);
    }
    paramInt = R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger;
    paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, i1);
    this.scrimVisibleHeightTrigger = paramInt;
    paramInt = R.styleable.CollapsingToolbarLayout_maxLines;
    paramInt = paramAttributeSet.hasValue(paramInt);
    if (paramInt != 0)
    {
      paramInt = R.styleable.CollapsingToolbarLayout_maxLines;
      k = paramAttributeSet.getInt(paramInt, j);
      localCollapsingTextHelper.setMaxLines(k);
    }
    int k = R.styleable.CollapsingToolbarLayout_titlePositionInterpolator;
    boolean bool1 = paramAttributeSet.hasValue(k);
    if (bool1)
    {
      m = R.styleable.CollapsingToolbarLayout_titlePositionInterpolator;
      m = paramAttributeSet.getResourceId(m, 0);
      paramContext = android.view.animation.AnimationUtils.loadInterpolator(localContext, m);
      localCollapsingTextHelper.setPositionInterpolator(paramContext);
    }
    int m = R.styleable.CollapsingToolbarLayout_scrimAnimationDuration;
    long l = paramAttributeSet.getInt(m, 600);
    this.scrimAnimationDuration = l;
    m = R.attr.motionEasingStandardInterpolator;
    localObject2 = com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
    paramContext = MotionUtils.resolveThemeInterpolator(localContext, m, (TimeInterpolator)localObject2);
    this.scrimAnimationFadeInInterpolator = paramContext;
    m = R.attr.motionEasingStandardInterpolator;
    localObject2 = com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
    paramContext = MotionUtils.resolveThemeInterpolator(localContext, m, (TimeInterpolator)localObject2);
    this.scrimAnimationFadeOutInterpolator = paramContext;
    m = R.styleable.CollapsingToolbarLayout_contentScrim;
    paramContext = paramAttributeSet.getDrawable(m);
    setContentScrim(paramContext);
    m = R.styleable.CollapsingToolbarLayout_statusBarScrim;
    paramContext = paramAttributeSet.getDrawable(m);
    setStatusBarScrim(paramContext);
    m = R.styleable.CollapsingToolbarLayout_titleCollapseMode;
    m = paramAttributeSet.getInt(m, 0);
    setTitleCollapseMode(m);
    m = R.styleable.CollapsingToolbarLayout_toolbarId;
    m = paramAttributeSet.getResourceId(m, i1);
    this.toolbarId = m;
    m = R.styleable.CollapsingToolbarLayout_forceApplySystemWindowInsetTop;
    boolean bool2 = paramAttributeSet.getBoolean(m, false);
    this.forceApplySystemWindowInsetTop = bool2;
    int n = R.styleable.CollapsingToolbarLayout_extraMultilineHeightEnabled;
    boolean bool3 = paramAttributeSet.getBoolean(n, false);
    this.extraMultilineHeightEnabled = bool3;
    paramAttributeSet.recycle();
    setWillNotDraw(false);
    paramContext = new com/google/android/material/appbar/CollapsingToolbarLayout$1;
    paramContext.<init>(this);
    ViewCompat.o00000O0(this, paramContext);
  }
  
  private void animateScrim(int paramInt)
  {
    ensureToolbar();
    ValueAnimator localValueAnimator = this.scrimAnimator;
    if (localValueAnimator == null)
    {
      localValueAnimator = new android/animation/ValueAnimator;
      localValueAnimator.<init>();
      this.scrimAnimator = localValueAnimator;
      i = this.scrimAlpha;
      if (paramInt > i) {
        localObject = this.scrimAnimationFadeInInterpolator;
      } else {
        localObject = this.scrimAnimationFadeOutInterpolator;
      }
      localValueAnimator.setInterpolator((TimeInterpolator)localObject);
      localValueAnimator = this.scrimAnimator;
      Object localObject = new com/google/android/material/appbar/CollapsingToolbarLayout$2;
      ((CollapsingToolbarLayout.2)localObject).<init>(this);
      localValueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject);
    }
    else
    {
      boolean bool = localValueAnimator.isRunning();
      if (bool)
      {
        localValueAnimator = this.scrimAnimator;
        localValueAnimator.cancel();
      }
    }
    localValueAnimator = this.scrimAnimator;
    long l = this.scrimAnimationDuration;
    localValueAnimator.setDuration(l);
    localValueAnimator = this.scrimAnimator;
    int i = this.scrimAlpha;
    int[] arrayOfInt = { i, paramInt };
    localValueAnimator.setIntValues(arrayOfInt);
    this.scrimAnimator.start();
  }
  
  private TextUtils.TruncateAt convertEllipsizeToTruncateAt(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        i = 3;
        if (paramInt != i) {
          return TextUtils.TruncateAt.END;
        }
        return TextUtils.TruncateAt.MARQUEE;
      }
      return TextUtils.TruncateAt.MIDDLE;
    }
    return TextUtils.TruncateAt.START;
  }
  
  private void disableLiftOnScrollIfNeeded(AppBarLayout paramAppBarLayout)
  {
    boolean bool = isTitleCollapseFadeMode();
    if (bool)
    {
      bool = false;
      paramAppBarLayout.setLiftOnScroll(false);
    }
  }
  
  private void ensureToolbar()
  {
    boolean bool1 = this.refreshToolbar;
    if (!bool1) {
      return;
    }
    bool1 = false;
    Object localObject1 = null;
    this.toolbar = null;
    this.toolbarDirectChild = null;
    int i = this.toolbarId;
    int j = -1;
    if (i != j)
    {
      localObject2 = (ViewGroup)findViewById(i);
      this.toolbar = ((ViewGroup)localObject2);
      if (localObject2 != null)
      {
        localObject2 = findDirectChild((View)localObject2);
        this.toolbarDirectChild = ((View)localObject2);
      }
    }
    Object localObject2 = this.toolbar;
    j = 0;
    if (localObject2 == null)
    {
      i = getChildCount();
      int k = 0;
      while (k < i)
      {
        View localView = getChildAt(k);
        boolean bool2 = isToolbar(localView);
        if (bool2)
        {
          localObject1 = localView;
          localObject1 = (ViewGroup)localView;
          break;
        }
        k += 1;
      }
      this.toolbar = ((ViewGroup)localObject1);
    }
    updateDummyView();
    this.refreshToolbar = false;
  }
  
  private View findDirectChild(View paramView)
  {
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent != this) && (localViewParent != null); localViewParent = ((ViewParent)localViewParent).getParent())
    {
      boolean bool = localViewParent instanceof View;
      if (bool)
      {
        paramView = localViewParent;
        paramView = (View)localViewParent;
      }
    }
    return paramView;
  }
  
  private static int getHeightWithMargins(View paramView)
  {
    Object localObject = paramView.getLayoutParams();
    boolean bool = localObject instanceof ViewGroup.MarginLayoutParams;
    if (bool)
    {
      localObject = (ViewGroup.MarginLayoutParams)localObject;
      int j = paramView.getMeasuredHeight();
      int i = ((ViewGroup.MarginLayoutParams)localObject).topMargin;
      j += i;
      int k = ((ViewGroup.MarginLayoutParams)localObject).bottomMargin;
      return j + k;
    }
    return paramView.getMeasuredHeight();
  }
  
  private static CharSequence getToolbarTitle(View paramView)
  {
    boolean bool = paramView instanceof androidx.appcompat.widget.Toolbar;
    if (bool) {
      return ((androidx.appcompat.widget.Toolbar)paramView).getTitle();
    }
    bool = paramView instanceof android.widget.Toolbar;
    if (bool) {
      return ((android.widget.Toolbar)paramView).getTitle();
    }
    return null;
  }
  
  public static ViewOffsetHelper getViewOffsetHelper(View paramView)
  {
    int i = R.id.view_offset_helper;
    ViewOffsetHelper localViewOffsetHelper = (ViewOffsetHelper)paramView.getTag(i);
    if (localViewOffsetHelper == null)
    {
      localViewOffsetHelper = new com/google/android/material/appbar/ViewOffsetHelper;
      localViewOffsetHelper.<init>(paramView);
      int j = R.id.view_offset_helper;
      paramView.setTag(j, localViewOffsetHelper);
    }
    return localViewOffsetHelper;
  }
  
  private boolean isTitleCollapseFadeMode()
  {
    int i = this.titleCollapseMode;
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  private static boolean isToolbar(View paramView)
  {
    boolean bool1 = paramView instanceof androidx.appcompat.widget.Toolbar;
    if (!bool1)
    {
      bool2 = paramView instanceof android.widget.Toolbar;
      if (!bool2)
      {
        bool2 = false;
        paramView = null;
        return bool2;
      }
    }
    boolean bool2 = true;
    return bool2;
  }
  
  private boolean isToolbarChild(View paramView)
  {
    Object localObject = this.toolbarDirectChild;
    boolean bool = true;
    if ((localObject != null) && (localObject != this))
    {
      if (paramView == localObject) {
        return bool;
      }
    }
    else
    {
      localObject = this.toolbar;
      if (paramView == localObject) {
        return bool;
      }
    }
    bool = false;
    return bool;
  }
  
  private void updateCollapsedBounds(boolean paramBoolean)
  {
    Object localObject1 = this.toolbarDirectChild;
    if (localObject1 == null) {
      localObject1 = this.toolbar;
    }
    int i = getMaxOffsetForPinChild((View)localObject1);
    Object localObject2 = this.dummyView;
    Rect localRect1 = this.tmpRect;
    DescendantOffsetUtils.getDescendantRect(this, (View)localObject2, localRect1);
    localObject2 = this.toolbar;
    boolean bool1 = localObject2 instanceof androidx.appcompat.widget.Toolbar;
    int m;
    int i1;
    int k;
    if (bool1)
    {
      localObject2 = (androidx.appcompat.widget.Toolbar)localObject2;
      int j = ((androidx.appcompat.widget.Toolbar)localObject2).getTitleMarginStart();
      m = ((androidx.appcompat.widget.Toolbar)localObject2).getTitleMarginEnd();
      n = ((androidx.appcompat.widget.Toolbar)localObject2).getTitleMarginTop();
      i1 = ((androidx.appcompat.widget.Toolbar)localObject2).getTitleMarginBottom();
    }
    else
    {
      boolean bool2 = localObject2 instanceof android.widget.Toolbar;
      if (bool2)
      {
        localObject2 = (android.widget.Toolbar)localObject2;
        k = ((android.widget.Toolbar)localObject2).getTitleMarginStart();
        m = ((android.widget.Toolbar)localObject2).getTitleMarginEnd();
        n = ((android.widget.Toolbar)localObject2).getTitleMarginTop();
        i1 = ((android.widget.Toolbar)localObject2).getTitleMarginBottom();
      }
      else
      {
        k = 0;
        localRect1 = null;
        i1 = 0;
        localObject2 = null;
        m = 0;
        n = 0;
      }
    }
    CollapsingTextHelper localCollapsingTextHelper = this.collapsingTextHelper;
    Rect localRect2 = this.tmpRect;
    int i2 = localRect2.left;
    if (paramBoolean) {
      i3 = m;
    } else {
      i3 = k;
    }
    i2 += i3;
    int i3 = localRect2.top + i + n;
    int n = localRect2.right;
    if (!paramBoolean) {
      k = m;
    }
    n -= k;
    paramBoolean = localRect2.bottom + i - i1;
    localCollapsingTextHelper.setCollapsedBounds(i2, i3, n, paramBoolean);
  }
  
  private void updateContentDescriptionFromTitle()
  {
    CharSequence localCharSequence = getTitle();
    setContentDescription(localCharSequence);
  }
  
  private void updateContentScrimBounds(Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    ViewGroup localViewGroup = this.toolbar;
    updateContentScrimBounds(paramDrawable, localViewGroup, paramInt1, paramInt2);
  }
  
  private void updateContentScrimBounds(Drawable paramDrawable, View paramView, int paramInt1, int paramInt2)
  {
    boolean bool = isTitleCollapseFadeMode();
    if ((bool) && (paramView != null))
    {
      bool = this.collapsingTitleEnabled;
      if (bool) {
        paramInt2 = paramView.getBottom();
      }
    }
    paramDrawable.setBounds(0, 0, paramInt1, paramInt2);
  }
  
  private void updateDummyView()
  {
    boolean bool1 = this.collapsingTitleEnabled;
    Object localObject1;
    Object localObject2;
    if (!bool1)
    {
      localObject1 = this.dummyView;
      if (localObject1 != null)
      {
        localObject1 = ((View)localObject1).getParent();
        boolean bool2 = localObject1 instanceof ViewGroup;
        if (bool2)
        {
          localObject1 = (ViewGroup)localObject1;
          localObject2 = this.dummyView;
          ((ViewGroup)localObject1).removeView((View)localObject2);
        }
      }
    }
    bool1 = this.collapsingTitleEnabled;
    if (bool1)
    {
      localObject1 = this.toolbar;
      if (localObject1 != null)
      {
        localObject1 = this.dummyView;
        if (localObject1 == null)
        {
          localObject1 = new android/view/View;
          localObject2 = getContext();
          ((View)localObject1).<init>((Context)localObject2);
          this.dummyView = ((View)localObject1);
        }
        localObject1 = this.dummyView.getParent();
        if (localObject1 == null)
        {
          localObject1 = this.toolbar;
          localObject2 = this.dummyView;
          int i = -1;
          ((ViewGroup)localObject1).addView((View)localObject2, i, i);
        }
      }
    }
  }
  
  private void updateTextBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    boolean bool1 = this.collapsingTitleEnabled;
    if (bool1)
    {
      Object localObject = this.dummyView;
      if (localObject != null)
      {
        bool1 = ViewCompat.o000oOoO((View)localObject);
        boolean bool2 = false;
        int j = 1;
        if (bool1)
        {
          localObject = this.dummyView;
          i = ((View)localObject).getVisibility();
          if (i == 0)
          {
            i = j;
            break label71;
          }
        }
        int i = 0;
        localObject = null;
        label71:
        this.drawCollapsingTitle = i;
        if ((i != 0) || (paramBoolean))
        {
          i = ViewCompat.OooOoOO(this);
          if (i == j) {
            bool2 = j;
          }
          updateCollapsedBounds(bool2);
          localObject = this.collapsingTextHelper;
          if (bool2) {
            j = this.expandedMarginEnd;
          } else {
            j = this.expandedMarginStart;
          }
          Rect localRect = this.tmpRect;
          int k = localRect.top;
          int m = this.expandedMarginTop;
          k += m;
          paramInt3 -= paramInt1;
          if (bool2) {
            paramInt1 = this.expandedMarginStart;
          } else {
            paramInt1 = this.expandedMarginEnd;
          }
          paramInt3 -= paramInt1;
          paramInt4 -= paramInt2;
          paramInt1 = this.expandedMarginBottom;
          paramInt4 -= paramInt1;
          ((CollapsingTextHelper)localObject).setExpandedBounds(j, k, paramInt3, paramInt4);
          CollapsingTextHelper localCollapsingTextHelper = this.collapsingTextHelper;
          localCollapsingTextHelper.recalculate(paramBoolean);
        }
      }
    }
  }
  
  private void updateTitleFromToolbarIfNeeded()
  {
    Object localObject = this.toolbar;
    if (localObject != null)
    {
      boolean bool = this.collapsingTitleEnabled;
      if (bool)
      {
        localObject = this.collapsingTextHelper.getText();
        bool = TextUtils.isEmpty((CharSequence)localObject);
        if (bool)
        {
          localObject = getToolbarTitle(this.toolbar);
          setTitle((CharSequence)localObject);
        }
      }
    }
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof CollapsingToolbarLayout.LayoutParams;
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    ensureToolbar();
    Object localObject1 = this.toolbar;
    int i;
    if (localObject1 == null)
    {
      localObject1 = this.contentScrim;
      if (localObject1 != null)
      {
        i = this.scrimAlpha;
        if (i > 0)
        {
          localObject1 = ((Drawable)localObject1).mutate();
          i = this.scrimAlpha;
          ((Drawable)localObject1).setAlpha(i);
          localObject1 = this.contentScrim;
          ((Drawable)localObject1).draw(paramCanvas);
        }
      }
    }
    boolean bool1 = this.collapsingTitleEnabled;
    float f1;
    Object localObject2;
    float f2;
    int k;
    Object localObject3;
    if (bool1)
    {
      bool1 = this.drawCollapsingTitle;
      if (bool1)
      {
        localObject1 = this.toolbar;
        if (localObject1 != null)
        {
          localObject1 = this.contentScrim;
          if (localObject1 != null)
          {
            int j = this.scrimAlpha;
            if (j > 0)
            {
              boolean bool2 = isTitleCollapseFadeMode();
              if (bool2)
              {
                localObject1 = this.collapsingTextHelper;
                f1 = ((CollapsingTextHelper)localObject1).getExpansionFraction();
                localObject2 = this.collapsingTextHelper;
                f2 = ((CollapsingTextHelper)localObject2).getFadeModeThresholdFraction();
                bool2 = f1 < f2;
                if (bool2)
                {
                  k = paramCanvas.save();
                  localObject2 = this.contentScrim.getBounds();
                  localObject3 = Region.Op.DIFFERENCE;
                  paramCanvas.clipRect((Rect)localObject2, (Region.Op)localObject3);
                  localObject2 = this.collapsingTextHelper;
                  ((CollapsingTextHelper)localObject2).draw(paramCanvas);
                  paramCanvas.restoreToCount(k);
                  break label219;
                }
              }
            }
          }
        }
        localObject1 = this.collapsingTextHelper;
        ((CollapsingTextHelper)localObject1).draw(paramCanvas);
      }
    }
    label219:
    localObject1 = this.statusBarScrim;
    if (localObject1 != null)
    {
      k = this.scrimAlpha;
      if (k > 0)
      {
        localObject1 = this.lastInsets;
        i = 0;
        f2 = 0.0F;
        localObject2 = null;
        if (localObject1 != null)
        {
          k = ((WindowInsetsCompat)localObject1).getSystemWindowInsetTop();
        }
        else
        {
          k = 0;
          localObject1 = null;
          f1 = 0.0F;
        }
        if (k > 0)
        {
          localObject3 = this.statusBarScrim;
          int m = -this.currentOffset;
          int n = getWidth();
          int i1 = this.currentOffset;
          k -= i1;
          ((Drawable)localObject3).setBounds(0, m, n, k);
          localObject1 = this.statusBarScrim.mutate();
          i = this.scrimAlpha;
          ((Drawable)localObject1).setAlpha(i);
          localObject1 = this.statusBarScrim;
          ((Drawable)localObject1).draw(paramCanvas);
        }
      }
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    Drawable localDrawable = this.contentScrim;
    boolean bool1 = true;
    if (localDrawable != null)
    {
      int i = this.scrimAlpha;
      if (i > 0)
      {
        bool2 = isToolbarChild(paramView);
        if (bool2)
        {
          localDrawable = this.contentScrim;
          int j = getWidth();
          int k = getHeight();
          updateContentScrimBounds(localDrawable, paramView, j, k);
          localDrawable = this.contentScrim.mutate();
          j = this.scrimAlpha;
          localDrawable.setAlpha(j);
          localDrawable = this.contentScrim;
          localDrawable.draw(paramCanvas);
          bool2 = bool1;
          break label113;
        }
      }
    }
    boolean bool2 = false;
    localDrawable = null;
    label113:
    boolean bool3 = super.drawChild(paramCanvas, paramView, paramLong);
    if ((!bool3) && (!bool2)) {
      bool1 = false;
    }
    return bool1;
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Object localObject = this.statusBarScrim;
    boolean bool1 = false;
    boolean bool2;
    boolean bool3;
    if (localObject != null)
    {
      bool2 = ((Drawable)localObject).isStateful();
      if (bool2)
      {
        bool3 = ((Drawable)localObject).setState(arrayOfInt);
        bool1 = false | bool3;
      }
    }
    localObject = this.contentScrim;
    if (localObject != null)
    {
      bool2 = ((Drawable)localObject).isStateful();
      if (bool2)
      {
        bool3 = ((Drawable)localObject).setState(arrayOfInt);
        bool1 |= bool3;
      }
    }
    localObject = this.collapsingTextHelper;
    if (localObject != null)
    {
      boolean bool4 = ((CollapsingTextHelper)localObject).setState(arrayOfInt);
      bool1 |= bool4;
    }
    if (bool1) {
      invalidate();
    }
  }
  
  public CollapsingToolbarLayout.LayoutParams generateDefaultLayoutParams()
  {
    CollapsingToolbarLayout.LayoutParams localLayoutParams = new com/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;
    int i = -1;
    localLayoutParams.<init>(i, i);
    return localLayoutParams;
  }
  
  public FrameLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    CollapsingToolbarLayout.LayoutParams localLayoutParams = new com/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;
    Context localContext = getContext();
    localLayoutParams.<init>(localContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    CollapsingToolbarLayout.LayoutParams localLayoutParams = new com/google/android/material/appbar/CollapsingToolbarLayout$LayoutParams;
    localLayoutParams.<init>(paramLayoutParams);
    return localLayoutParams;
  }
  
  public int getCollapsedTitleGravity()
  {
    return this.collapsingTextHelper.getCollapsedTextGravity();
  }
  
  public float getCollapsedTitleTextSize()
  {
    return this.collapsingTextHelper.getCollapsedTextSize();
  }
  
  public Typeface getCollapsedTitleTypeface()
  {
    return this.collapsingTextHelper.getCollapsedTypeface();
  }
  
  public Drawable getContentScrim()
  {
    return this.contentScrim;
  }
  
  public int getExpandedTitleGravity()
  {
    return this.collapsingTextHelper.getExpandedTextGravity();
  }
  
  public int getExpandedTitleMarginBottom()
  {
    return this.expandedMarginBottom;
  }
  
  public int getExpandedTitleMarginEnd()
  {
    return this.expandedMarginEnd;
  }
  
  public int getExpandedTitleMarginStart()
  {
    return this.expandedMarginStart;
  }
  
  public int getExpandedTitleMarginTop()
  {
    return this.expandedMarginTop;
  }
  
  public float getExpandedTitleTextSize()
  {
    return this.collapsingTextHelper.getExpandedTextSize();
  }
  
  public Typeface getExpandedTitleTypeface()
  {
    return this.collapsingTextHelper.getExpandedTypeface();
  }
  
  public int getHyphenationFrequency()
  {
    return this.collapsingTextHelper.getHyphenationFrequency();
  }
  
  public int getLineCount()
  {
    return this.collapsingTextHelper.getLineCount();
  }
  
  public float getLineSpacingAdd()
  {
    return this.collapsingTextHelper.getLineSpacingAdd();
  }
  
  public float getLineSpacingMultiplier()
  {
    return this.collapsingTextHelper.getLineSpacingMultiplier();
  }
  
  public int getMaxLines()
  {
    return this.collapsingTextHelper.getMaxLines();
  }
  
  public final int getMaxOffsetForPinChild(View paramView)
  {
    ViewOffsetHelper localViewOffsetHelper = getViewOffsetHelper(paramView);
    CollapsingToolbarLayout.LayoutParams localLayoutParams = (CollapsingToolbarLayout.LayoutParams)paramView.getLayoutParams();
    int i = getHeight();
    int j = localViewOffsetHelper.getLayoutTop();
    i -= j;
    int k = paramView.getHeight();
    i -= k;
    k = localLayoutParams.bottomMargin;
    return i - k;
  }
  
  public int getScrimAlpha()
  {
    return this.scrimAlpha;
  }
  
  public long getScrimAnimationDuration()
  {
    return this.scrimAnimationDuration;
  }
  
  public int getScrimVisibleHeightTrigger()
  {
    int i = this.scrimVisibleHeightTrigger;
    if (i >= 0)
    {
      j = this.topInsetApplied;
      i += j;
      j = this.extraMultilineHeight;
      return i + j;
    }
    WindowInsetsCompat localWindowInsetsCompat = this.lastInsets;
    if (localWindowInsetsCompat != null)
    {
      i = localWindowInsetsCompat.getSystemWindowInsetTop();
    }
    else
    {
      i = 0;
      localWindowInsetsCompat = null;
    }
    int j = ViewCompat.OooOoo0(this);
    if (j > 0)
    {
      j = j * 2 + i;
      i = getHeight();
      return Math.min(j, i);
    }
    return getHeight() / 3;
  }
  
  public Drawable getStatusBarScrim()
  {
    return this.statusBarScrim;
  }
  
  public CharSequence getTitle()
  {
    boolean bool = this.collapsingTitleEnabled;
    CharSequence localCharSequence;
    if (bool)
    {
      localCharSequence = this.collapsingTextHelper.getText();
    }
    else
    {
      bool = false;
      localCharSequence = null;
    }
    return localCharSequence;
  }
  
  public int getTitleCollapseMode()
  {
    return this.titleCollapseMode;
  }
  
  public TimeInterpolator getTitlePositionInterpolator()
  {
    return this.collapsingTextHelper.getPositionInterpolator();
  }
  
  public TextUtils.TruncateAt getTitleTextEllipsize()
  {
    return this.collapsingTextHelper.getTitleTextEllipsize();
  }
  
  public boolean isExtraMultilineHeightEnabled()
  {
    return this.extraMultilineHeightEnabled;
  }
  
  public boolean isForceApplySystemWindowInsetTop()
  {
    return this.forceApplySystemWindowInsetTop;
  }
  
  public boolean isRtlTextDirectionHeuristicsEnabled()
  {
    return this.collapsingTextHelper.isRtlTextDirectionHeuristicsEnabled();
  }
  
  public boolean isTitleEnabled()
  {
    return this.collapsingTitleEnabled;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Object localObject1 = getParent();
    boolean bool = localObject1 instanceof AppBarLayout;
    if (bool)
    {
      localObject1 = (AppBarLayout)localObject1;
      disableLiftOnScrollIfNeeded((AppBarLayout)localObject1);
      bool = ViewCompat.OooOo((View)localObject1);
      ViewCompat.o0O0O00(this, bool);
      Object localObject2 = this.onOffsetChangedListener;
      if (localObject2 == null)
      {
        localObject2 = new com/google/android/material/appbar/CollapsingToolbarLayout$OffsetUpdateListener;
        ((CollapsingToolbarLayout.OffsetUpdateListener)localObject2).<init>(this);
        this.onOffsetChangedListener = ((AppBarLayout.OnOffsetChangedListener)localObject2);
      }
      localObject2 = this.onOffsetChangedListener;
      ((AppBarLayout)localObject1).addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener)localObject2);
      ViewCompat.o00o0O(this);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(paramConfiguration);
  }
  
  public void onDetachedFromWindow()
  {
    Object localObject = getParent();
    AppBarLayout.OnOffsetChangedListener localOnOffsetChangedListener = this.onOffsetChangedListener;
    if (localOnOffsetChangedListener != null)
    {
      boolean bool = localObject instanceof AppBarLayout;
      if (bool)
      {
        localObject = (AppBarLayout)localObject;
        ((AppBarLayout)localObject).removeOnOffsetChangedListener(localOnOffsetChangedListener);
      }
    }
    super.onDetachedFromWindow();
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    WindowInsetsCompat localWindowInsetsCompat = this.lastInsets;
    boolean bool1 = false;
    if (localWindowInsetsCompat != null)
    {
      paramBoolean = localWindowInsetsCompat.getSystemWindowInsetTop();
      bool2 = getChildCount();
      boolean bool3 = false;
      localObject = null;
      while (bool3 < bool2)
      {
        View localView = getChildAt(bool3);
        boolean bool4 = ViewCompat.OooOo(localView);
        if (!bool4)
        {
          boolean bool5 = localView.getTop();
          if (bool5 < paramBoolean) {
            ViewCompat.OooooO0(localView, paramBoolean);
          }
        }
        int k;
        bool3 += true;
      }
    }
    paramBoolean = getChildCount();
    boolean bool2 = false;
    while (bool2 < paramBoolean)
    {
      localObject = getViewOffsetHelper(getChildAt(bool2));
      ((ViewOffsetHelper)localObject).onViewLayout();
      int j;
      bool2 += true;
    }
    Object localObject = this;
    int m = paramInt2;
    updateTextBounds(paramInt1, paramInt2, paramInt3, paramInt4, false);
    updateTitleFromToolbarIfNeeded();
    updateScrimVisibility();
    paramBoolean = getChildCount();
    while (bool1 < paramBoolean)
    {
      ViewOffsetHelper localViewOffsetHelper = getViewOffsetHelper(getChildAt(bool1));
      localViewOffsetHelper.applyOffsets();
      int i;
      bool1 += true;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    ensureToolbar();
    super.onMeasure(paramInt1, paramInt2);
    paramInt2 = View.MeasureSpec.getMode(paramInt2);
    WindowInsetsCompat localWindowInsetsCompat = this.lastInsets;
    int i;
    if (localWindowInsetsCompat != null)
    {
      i = localWindowInsetsCompat.getSystemWindowInsetTop();
    }
    else
    {
      i = 0;
      localWindowInsetsCompat = null;
    }
    int j = 1073741824;
    if (paramInt2 != 0)
    {
      paramInt2 = this.forceApplySystemWindowInsetTop;
      if (paramInt2 == 0) {}
    }
    else if (i > 0)
    {
      this.topInsetApplied = i;
      paramInt2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i, j);
      super.onMeasure(paramInt1, paramInt2);
    }
    paramInt2 = this.extraMultilineHeightEnabled;
    Object localObject1;
    if (paramInt2 != 0)
    {
      localObject1 = this.collapsingTextHelper;
      paramInt2 = ((CollapsingTextHelper)localObject1).getMaxLines();
      i = 1;
      if (paramInt2 > i)
      {
        updateTitleFromToolbarIfNeeded();
        int k = getMeasuredWidth();
        int m = getMeasuredHeight();
        boolean bool = true;
        Object localObject2 = this;
        updateTextBounds(0, 0, k, m, bool);
        localObject1 = this.collapsingTextHelper;
        paramInt2 = ((CollapsingTextHelper)localObject1).getExpandedLineCount();
        if (paramInt2 > i)
        {
          localObject2 = this.collapsingTextHelper;
          float f = ((CollapsingTextHelper)localObject2).getExpandedTextFullHeight();
          int n = Math.round(f);
          paramInt2 -= i;
          n *= paramInt2;
          this.extraMultilineHeight = n;
          paramInt2 = getMeasuredHeight();
          i = this.extraMultilineHeight;
          paramInt2 = View.MeasureSpec.makeMeasureSpec(paramInt2 + i, j);
          super.onMeasure(paramInt1, paramInt2);
        }
      }
    }
    ViewGroup localViewGroup = this.toolbar;
    if (localViewGroup != null)
    {
      localObject1 = this.toolbarDirectChild;
      if ((localObject1 != null) && (localObject1 != this)) {
        paramInt1 = getHeightWithMargins((View)localObject1);
      } else {
        paramInt1 = getHeightWithMargins(localViewGroup);
      }
      setMinimumHeight(paramInt1);
    }
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable localDrawable = this.contentScrim;
    if (localDrawable != null) {
      updateContentScrimBounds(localDrawable, paramInt1, paramInt2);
    }
  }
  
  public WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat paramWindowInsetsCompat)
  {
    boolean bool1 = ViewCompat.OooOo(this);
    WindowInsetsCompat localWindowInsetsCompat1;
    if (bool1)
    {
      localWindowInsetsCompat1 = paramWindowInsetsCompat;
    }
    else
    {
      bool1 = false;
      localWindowInsetsCompat1 = null;
    }
    WindowInsetsCompat localWindowInsetsCompat2 = this.lastInsets;
    boolean bool2 = ObjectsCompat.OooO00o(localWindowInsetsCompat2, localWindowInsetsCompat1);
    if (!bool2)
    {
      this.lastInsets = localWindowInsetsCompat1;
      requestLayout();
    }
    return paramWindowInsetsCompat.OooO0OO();
  }
  
  public void setCollapsedTitleGravity(int paramInt)
  {
    this.collapsingTextHelper.setCollapsedTextGravity(paramInt);
  }
  
  public void setCollapsedTitleTextAppearance(int paramInt)
  {
    this.collapsingTextHelper.setCollapsedTextAppearance(paramInt);
  }
  
  public void setCollapsedTitleTextColor(int paramInt)
  {
    ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
    setCollapsedTitleTextColor(localColorStateList);
  }
  
  public void setCollapsedTitleTextColor(ColorStateList paramColorStateList)
  {
    this.collapsingTextHelper.setCollapsedTextColor(paramColorStateList);
  }
  
  public void setCollapsedTitleTextSize(float paramFloat)
  {
    this.collapsingTextHelper.setCollapsedTextSize(paramFloat);
  }
  
  public void setCollapsedTitleTypeface(Typeface paramTypeface)
  {
    this.collapsingTextHelper.setCollapsedTypeface(paramTypeface);
  }
  
  public void setContentScrim(Drawable paramDrawable)
  {
    Drawable localDrawable1 = this.contentScrim;
    if (localDrawable1 != paramDrawable)
    {
      Drawable localDrawable2 = null;
      if (localDrawable1 != null) {
        localDrawable1.setCallback(null);
      }
      if (paramDrawable != null) {
        localDrawable2 = paramDrawable.mutate();
      }
      this.contentScrim = localDrawable2;
      if (localDrawable2 != null)
      {
        int i = getWidth();
        int j = getHeight();
        updateContentScrimBounds(localDrawable2, i, j);
        this.contentScrim.setCallback(this);
        paramDrawable = this.contentScrim;
        j = this.scrimAlpha;
        paramDrawable.setAlpha(j);
      }
      ViewCompat.Ooooooo(this);
    }
  }
  
  public void setContentScrimColor(int paramInt)
  {
    ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
    localColorDrawable.<init>(paramInt);
    setContentScrim(localColorDrawable);
  }
  
  public void setContentScrimResource(int paramInt)
  {
    Drawable localDrawable = ContextCompat.OooO0o0(getContext(), paramInt);
    setContentScrim(localDrawable);
  }
  
  public void setExpandedTitleColor(int paramInt)
  {
    ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
    setExpandedTitleTextColor(localColorStateList);
  }
  
  public void setExpandedTitleGravity(int paramInt)
  {
    this.collapsingTextHelper.setExpandedTextGravity(paramInt);
  }
  
  public void setExpandedTitleMargin(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.expandedMarginStart = paramInt1;
    this.expandedMarginTop = paramInt2;
    this.expandedMarginEnd = paramInt3;
    this.expandedMarginBottom = paramInt4;
    requestLayout();
  }
  
  public void setExpandedTitleMarginBottom(int paramInt)
  {
    this.expandedMarginBottom = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleMarginEnd(int paramInt)
  {
    this.expandedMarginEnd = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleMarginStart(int paramInt)
  {
    this.expandedMarginStart = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleMarginTop(int paramInt)
  {
    this.expandedMarginTop = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleTextAppearance(int paramInt)
  {
    this.collapsingTextHelper.setExpandedTextAppearance(paramInt);
  }
  
  public void setExpandedTitleTextColor(ColorStateList paramColorStateList)
  {
    this.collapsingTextHelper.setExpandedTextColor(paramColorStateList);
  }
  
  public void setExpandedTitleTextSize(float paramFloat)
  {
    this.collapsingTextHelper.setExpandedTextSize(paramFloat);
  }
  
  public void setExpandedTitleTypeface(Typeface paramTypeface)
  {
    this.collapsingTextHelper.setExpandedTypeface(paramTypeface);
  }
  
  public void setExtraMultilineHeightEnabled(boolean paramBoolean)
  {
    this.extraMultilineHeightEnabled = paramBoolean;
  }
  
  public void setForceApplySystemWindowInsetTop(boolean paramBoolean)
  {
    this.forceApplySystemWindowInsetTop = paramBoolean;
  }
  
  public void setHyphenationFrequency(int paramInt)
  {
    this.collapsingTextHelper.setHyphenationFrequency(paramInt);
  }
  
  public void setLineSpacingAdd(float paramFloat)
  {
    this.collapsingTextHelper.setLineSpacingAdd(paramFloat);
  }
  
  public void setLineSpacingMultiplier(float paramFloat)
  {
    this.collapsingTextHelper.setLineSpacingMultiplier(paramFloat);
  }
  
  public void setMaxLines(int paramInt)
  {
    this.collapsingTextHelper.setMaxLines(paramInt);
  }
  
  public void setRtlTextDirectionHeuristicsEnabled(boolean paramBoolean)
  {
    this.collapsingTextHelper.setRtlTextDirectionHeuristicsEnabled(paramBoolean);
  }
  
  public void setScrimAlpha(int paramInt)
  {
    int i = this.scrimAlpha;
    if (paramInt != i)
    {
      Object localObject = this.contentScrim;
      if (localObject != null)
      {
        localObject = this.toolbar;
        if (localObject != null) {
          ViewCompat.Ooooooo((View)localObject);
        }
      }
      this.scrimAlpha = paramInt;
      ViewCompat.Ooooooo(this);
    }
  }
  
  public void setScrimAnimationDuration(long paramLong)
  {
    this.scrimAnimationDuration = paramLong;
  }
  
  public void setScrimVisibleHeightTrigger(int paramInt)
  {
    int i = this.scrimVisibleHeightTrigger;
    if (i != paramInt)
    {
      this.scrimVisibleHeightTrigger = paramInt;
      updateScrimVisibility();
    }
  }
  
  public void setScrimsShown(boolean paramBoolean)
  {
    boolean bool = ViewCompat.OoooOOO(this);
    if (bool)
    {
      bool = isInEditMode();
      if (!bool)
      {
        bool = true;
        break label25;
      }
    }
    bool = false;
    label25:
    setScrimsShown(paramBoolean, bool);
  }
  
  public void setScrimsShown(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = this.scrimsAreShown;
    if (bool != paramBoolean1)
    {
      int i = 255;
      if (paramBoolean2)
      {
        if (!paramBoolean1) {
          i = 0;
        }
        animateScrim(i);
      }
      else
      {
        if (!paramBoolean1) {
          i = 0;
        }
        setScrimAlpha(i);
      }
      this.scrimsAreShown = paramBoolean1;
    }
  }
  
  public void setStaticLayoutBuilderConfigurer(CollapsingToolbarLayout.StaticLayoutBuilderConfigurer paramStaticLayoutBuilderConfigurer)
  {
    this.collapsingTextHelper.setStaticLayoutBuilderConfigurer(paramStaticLayoutBuilderConfigurer);
  }
  
  public void setStatusBarScrim(Drawable paramDrawable)
  {
    Object localObject = this.statusBarScrim;
    if (localObject != paramDrawable)
    {
      Drawable localDrawable = null;
      if (localObject != null) {
        ((Drawable)localObject).setCallback(null);
      }
      if (paramDrawable != null) {
        localDrawable = paramDrawable.mutate();
      }
      this.statusBarScrim = localDrawable;
      if (localDrawable != null)
      {
        boolean bool = localDrawable.isStateful();
        if (bool)
        {
          paramDrawable = this.statusBarScrim;
          localObject = getDrawableState();
          paramDrawable.setState((int[])localObject);
        }
        paramDrawable = this.statusBarScrim;
        int i = ViewCompat.OooOoOO(this);
        DrawableCompat.OooOOO0(paramDrawable, i);
        paramDrawable = this.statusBarScrim;
        i = getVisibility();
        localDrawable = null;
        if (i == 0)
        {
          i = 1;
        }
        else
        {
          i = 0;
          localObject = null;
        }
        paramDrawable.setVisible(i, false);
        this.statusBarScrim.setCallback(this);
        paramDrawable = this.statusBarScrim;
        int j = this.scrimAlpha;
        paramDrawable.setAlpha(j);
      }
      ViewCompat.Ooooooo(this);
    }
  }
  
  public void setStatusBarScrimColor(int paramInt)
  {
    ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
    localColorDrawable.<init>(paramInt);
    setStatusBarScrim(localColorDrawable);
  }
  
  public void setStatusBarScrimResource(int paramInt)
  {
    Drawable localDrawable = ContextCompat.OooO0o0(getContext(), paramInt);
    setStatusBarScrim(localDrawable);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.collapsingTextHelper.setText(paramCharSequence);
    updateContentDescriptionFromTitle();
  }
  
  public void setTitleCollapseMode(int paramInt)
  {
    this.titleCollapseMode = paramInt;
    paramInt = isTitleCollapseFadeMode();
    this.collapsingTextHelper.setFadeModeEnabled(paramInt);
    Object localObject1 = getParent();
    boolean bool = localObject1 instanceof AppBarLayout;
    if (bool)
    {
      localObject1 = (AppBarLayout)localObject1;
      disableLiftOnScrollIfNeeded((AppBarLayout)localObject1);
    }
    if (paramInt != 0)
    {
      Object localObject2 = this.contentScrim;
      if (localObject2 == null)
      {
        localObject2 = getResources();
        int i = R.dimen.design_appbar_elevation;
        float f = ((Resources)localObject2).getDimension(i);
        localObject1 = this.elevationOverlayProvider;
        paramInt = ((ElevationOverlayProvider)localObject1).compositeOverlayWithThemeSurfaceColorIfNeeded(f);
        setContentScrimColor(paramInt);
      }
    }
  }
  
  public void setTitleEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
    this.collapsingTextHelper.setTitleTextEllipsize(paramTruncateAt);
  }
  
  public void setTitleEnabled(boolean paramBoolean)
  {
    boolean bool = this.collapsingTitleEnabled;
    if (paramBoolean != bool)
    {
      this.collapsingTitleEnabled = paramBoolean;
      updateContentDescriptionFromTitle();
      updateDummyView();
      requestLayout();
    }
  }
  
  public void setTitlePositionInterpolator(TimeInterpolator paramTimeInterpolator)
  {
    this.collapsingTextHelper.setPositionInterpolator(paramTimeInterpolator);
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    Drawable localDrawable = this.statusBarScrim;
    if (localDrawable != null)
    {
      int i = localDrawable.isVisible();
      if (i != paramInt)
      {
        localDrawable = this.statusBarScrim;
        localDrawable.setVisible(paramInt, false);
      }
    }
    localDrawable = this.contentScrim;
    if (localDrawable != null)
    {
      int j = localDrawable.isVisible();
      if (j != paramInt)
      {
        localDrawable = this.contentScrim;
        localDrawable.setVisible(paramInt, false);
      }
    }
  }
  
  public final void updateScrimVisibility()
  {
    Drawable localDrawable = this.contentScrim;
    if (localDrawable == null)
    {
      localDrawable = this.statusBarScrim;
      if (localDrawable == null) {}
    }
    else
    {
      int i = getHeight();
      int j = this.currentOffset;
      i += j;
      int k = getScrimVisibleHeightTrigger();
      if (i < k)
      {
        i = 1;
      }
      else
      {
        i = 0;
        localDrawable = null;
      }
      setScrimsShown(i);
    }
  }
  
  public boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool1 = super.verifyDrawable(paramDrawable);
    if (!bool1)
    {
      Drawable localDrawable = this.contentScrim;
      if (paramDrawable != localDrawable)
      {
        localDrawable = this.statusBarScrim;
        if (paramDrawable != localDrawable)
        {
          bool2 = false;
          paramDrawable = null;
          break label44;
        }
      }
    }
    boolean bool2 = true;
    label44:
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.appbar.CollapsingToolbarLayout
 * JD-Core Version:    0.7.0.1
 */