package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.ripple.RippleUtils;
import m54207b69;

public final class TabLayout$TabView
  extends LinearLayout
{
  private View badgeAnchorView;
  private BadgeDrawable badgeDrawable;
  private Drawable baseBackgroundDrawable;
  private ImageView customIconView;
  private TextView customTextView;
  private View customView;
  private int defaultMaxLines = 2;
  private ImageView iconView;
  private TabLayout.Tab tab;
  private TextView textView;
  
  public TabLayout$TabView(TabLayout paramTabLayout, Context paramContext)
  {
    super(paramContext);
    updateBackgroundDrawable(paramContext);
    int i = paramTabLayout.tabPaddingStart;
    int j = paramTabLayout.tabPaddingTop;
    int k = paramTabLayout.tabPaddingEnd;
    int m = paramTabLayout.tabPaddingBottom;
    ViewCompat.o00000O(this, i, j, k, m);
    setGravity(17);
    int n = paramTabLayout.inlineLabel;
    i = 1;
    n ^= i;
    setOrientation(n);
    setClickable(i);
    paramTabLayout = PointerIconCompat.OooO00o(getContext(), 1002);
    ViewCompat.o00000OO(this, paramTabLayout);
  }
  
  private void addOnLayoutChangeListener(View paramView)
  {
    if (paramView == null) {
      return;
    }
    TabLayout.TabView.1 local1 = new com/google/android/material/tabs/TabLayout$TabView$1;
    local1.<init>(this, paramView);
    paramView.addOnLayoutChangeListener(local1);
  }
  
  private float approximateLineWidth(Layout paramLayout, int paramInt, float paramFloat)
  {
    float f1 = paramLayout.getLineWidth(paramInt);
    float f2 = paramLayout.getPaint().getTextSize();
    paramFloat /= f2;
    return f1 * paramFloat;
  }
  
  private void clipViewToPaddingForBadge(boolean paramBoolean)
  {
    setClipChildren(paramBoolean);
    setClipToPadding(paramBoolean);
    ViewGroup localViewGroup = (ViewGroup)getParent();
    if (localViewGroup != null)
    {
      localViewGroup.setClipChildren(paramBoolean);
      localViewGroup.setClipToPadding(paramBoolean);
    }
  }
  
  private FrameLayout createPreApi18BadgeAnchorRoot()
  {
    FrameLayout localFrameLayout = new android/widget/FrameLayout;
    Object localObject = getContext();
    localFrameLayout.<init>((Context)localObject);
    localObject = new android/widget/FrameLayout$LayoutParams;
    int i = -2;
    ((FrameLayout.LayoutParams)localObject).<init>(i, i);
    localFrameLayout.setLayoutParams((ViewGroup.LayoutParams)localObject);
    return localFrameLayout;
  }
  
  private void drawBackground(Canvas paramCanvas)
  {
    Drawable localDrawable = this.baseBackgroundDrawable;
    if (localDrawable != null)
    {
      int i = getLeft();
      int j = getTop();
      int k = getRight();
      int m = getBottom();
      localDrawable.setBounds(i, j, k, m);
      localDrawable = this.baseBackgroundDrawable;
      localDrawable.draw(paramCanvas);
    }
  }
  
  private BadgeDrawable getBadge()
  {
    return this.badgeDrawable;
  }
  
  private FrameLayout getCustomParentForBadge(View paramView)
  {
    Object localObject1 = this.iconView;
    Object localObject2 = null;
    if (paramView != localObject1)
    {
      localObject1 = this.textView;
      if (paramView != localObject1) {
        return null;
      }
    }
    boolean bool = BadgeUtils.USE_COMPAT_PARENT;
    if (bool)
    {
      paramView = paramView.getParent();
      localObject2 = paramView;
      localObject2 = (FrameLayout)paramView;
    }
    return localObject2;
  }
  
  private BadgeDrawable getOrCreateBadge()
  {
    Object localObject = this.badgeDrawable;
    if (localObject == null)
    {
      localObject = BadgeDrawable.create(getContext());
      this.badgeDrawable = ((BadgeDrawable)localObject);
    }
    tryUpdateBadgeAnchor();
    localObject = this.badgeDrawable;
    if (localObject != null) {
      return localObject;
    }
    localObject = new java/lang/IllegalStateException;
    String str = m54207b69.F54207b69_11("?U003C363A3D357B28427E40323C412F3F854846444645");
    ((IllegalStateException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  private boolean hasBadgeDrawable()
  {
    BadgeDrawable localBadgeDrawable = this.badgeDrawable;
    boolean bool;
    if (localBadgeDrawable != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localBadgeDrawable = null;
    }
    return bool;
  }
  
  private void inflateAndAddDefaultIconView()
  {
    boolean bool = BadgeUtils.USE_COMPAT_PARENT;
    Object localObject1;
    if (bool)
    {
      localObject1 = createPreApi18BadgeAnchorRoot();
      addView((View)localObject1, 0);
    }
    else
    {
      localObject1 = this;
    }
    Object localObject2 = LayoutInflater.from(getContext());
    int i = R.layout.design_layout_tab_icon;
    localObject2 = (ImageView)((LayoutInflater)localObject2).inflate(i, (ViewGroup)localObject1, false);
    this.iconView = ((ImageView)localObject2);
    ((ViewGroup)localObject1).addView((View)localObject2, 0);
  }
  
  private void inflateAndAddDefaultTextView()
  {
    boolean bool = BadgeUtils.USE_COMPAT_PARENT;
    Object localObject1;
    if (bool)
    {
      localObject1 = createPreApi18BadgeAnchorRoot();
      addView((View)localObject1);
    }
    else
    {
      localObject1 = this;
    }
    Object localObject2 = LayoutInflater.from(getContext());
    int i = R.layout.design_layout_tab_text;
    localObject2 = (TextView)((LayoutInflater)localObject2).inflate(i, (ViewGroup)localObject1, false);
    this.textView = ((TextView)localObject2);
    ((ViewGroup)localObject1).addView((View)localObject2);
  }
  
  private void removeBadge()
  {
    View localView = this.badgeAnchorView;
    if (localView != null) {
      tryRemoveBadgeFromAnchor();
    }
    this.badgeDrawable = null;
  }
  
  private void tryAttachBadgeToAnchor(View paramView)
  {
    boolean bool = hasBadgeDrawable();
    if (!bool) {
      return;
    }
    if (paramView != null)
    {
      bool = false;
      clipViewToPaddingForBadge(false);
      BadgeDrawable localBadgeDrawable = this.badgeDrawable;
      FrameLayout localFrameLayout = getCustomParentForBadge(paramView);
      BadgeUtils.attachBadgeDrawable(localBadgeDrawable, paramView, localFrameLayout);
      this.badgeAnchorView = paramView;
    }
  }
  
  private void tryRemoveBadgeFromAnchor()
  {
    boolean bool = hasBadgeDrawable();
    if (!bool) {
      return;
    }
    bool = true;
    clipViewToPaddingForBadge(bool);
    View localView = this.badgeAnchorView;
    if (localView != null)
    {
      BadgeDrawable localBadgeDrawable = this.badgeDrawable;
      BadgeUtils.detachBadgeDrawable(localBadgeDrawable, localView);
      bool = false;
      localView = null;
      this.badgeAnchorView = null;
    }
  }
  
  private void tryUpdateBadgeAnchor()
  {
    boolean bool = hasBadgeDrawable();
    if (!bool) {
      return;
    }
    Object localObject1 = this.customView;
    if (localObject1 != null)
    {
      tryRemoveBadgeFromAnchor();
    }
    else
    {
      localObject1 = this.iconView;
      Object localObject2;
      if (localObject1 != null)
      {
        localObject1 = this.tab;
        if (localObject1 != null)
        {
          localObject1 = ((TabLayout.Tab)localObject1).getIcon();
          if (localObject1 != null)
          {
            localObject1 = this.badgeAnchorView;
            localObject2 = this.iconView;
            if (localObject1 != localObject2) {
              tryRemoveBadgeFromAnchor();
            }
          }
        }
      }
      for (localObject1 = this.iconView;; localObject1 = this.textView)
      {
        tryAttachBadgeToAnchor((View)localObject1);
        return;
        do
        {
          tryUpdateBadgeDrawableBounds((View)localObject2);
          return;
          localObject1 = this.textView;
          if (localObject1 == null) {
            break;
          }
          localObject1 = this.tab;
          if (localObject1 == null) {
            break;
          }
          int i = ((TabLayout.Tab)localObject1).getTabLabelVisibility();
          int j = 1;
          if (i != j) {
            break;
          }
          localObject1 = this.badgeAnchorView;
          localObject2 = this.textView;
        } while (localObject1 == localObject2);
        tryRemoveBadgeFromAnchor();
      }
    }
  }
  
  private void tryUpdateBadgeDrawableBounds(View paramView)
  {
    boolean bool = hasBadgeDrawable();
    if (bool)
    {
      Object localObject = this.badgeAnchorView;
      if (paramView == localObject)
      {
        localObject = this.badgeDrawable;
        FrameLayout localFrameLayout = getCustomParentForBadge(paramView);
        BadgeUtils.setBadgeDrawableBounds((BadgeDrawable)localObject, paramView, localFrameLayout);
      }
    }
  }
  
  private void updateBackgroundDrawable(Context paramContext)
  {
    Object localObject1 = this.this$0;
    int i = ((TabLayout)localObject1).tabBackgroundResId;
    Object localObject2 = null;
    boolean bool1;
    if (i != 0)
    {
      paramContext = AppCompatResources.OooO0O0(paramContext, i);
      this.baseBackgroundDrawable = paramContext;
      if (paramContext != null)
      {
        bool1 = paramContext.isStateful();
        if (bool1)
        {
          paramContext = this.baseBackgroundDrawable;
          localObject1 = getDrawableState();
          paramContext.setState((int[])localObject1);
        }
      }
    }
    else
    {
      this.baseBackgroundDrawable = null;
    }
    paramContext = new android/graphics/drawable/GradientDrawable;
    paramContext.<init>();
    i = 0;
    paramContext.setColor(0);
    localObject1 = this.this$0.tabRippleColorStateList;
    if (localObject1 != null)
    {
      localObject1 = new android/graphics/drawable/GradientDrawable;
      ((GradientDrawable)localObject1).<init>();
      ((GradientDrawable)localObject1).setCornerRadius(1.0E-005F);
      int j = -1;
      ((GradientDrawable)localObject1).setColor(j);
      ColorStateList localColorStateList = RippleUtils.convertToRippleDrawableColor(this.this$0.tabRippleColorStateList);
      RippleDrawable localRippleDrawable = new android/graphics/drawable/RippleDrawable;
      TabLayout localTabLayout = this.this$0;
      boolean bool2 = localTabLayout.unboundedRipple;
      if (bool2)
      {
        bool1 = false;
        paramContext = null;
      }
      if (!bool2) {
        localObject2 = localObject1;
      }
      localRippleDrawable.<init>(localColorStateList, paramContext, localObject2);
      paramContext = localRippleDrawable;
    }
    ViewCompat.o0ooOoO(this, paramContext);
    this.this$0.invalidate();
  }
  
  private void updateTextAndIcon(TextView paramTextView, ImageView paramImageView, boolean paramBoolean)
  {
    Object localObject1 = this.tab;
    CharSequence localCharSequence = null;
    if (localObject1 != null)
    {
      localObject1 = ((TabLayout.Tab)localObject1).getIcon();
      if (localObject1 != null)
      {
        localObject1 = DrawableCompat.OooOOo(this.tab.getIcon()).mutate();
        break label50;
      }
    }
    boolean bool1 = false;
    localObject1 = null;
    label50:
    if (localObject1 != null)
    {
      localObject2 = this.this$0.tabIconTint;
      DrawableCompat.OooOOOO((Drawable)localObject1, (ColorStateList)localObject2);
      localObject2 = this.this$0.tabIconTintMode;
      if (localObject2 != null) {
        DrawableCompat.OooOOOo((Drawable)localObject1, (PorterDuff.Mode)localObject2);
      }
    }
    Object localObject2 = this.tab;
    if (localObject2 != null) {
      localObject2 = ((TabLayout.Tab)localObject2).getText();
    } else {
      localObject2 = null;
    }
    int i = 8;
    if (paramImageView != null) {
      if (localObject1 != null)
      {
        paramImageView.setImageDrawable((Drawable)localObject1);
        paramImageView.setVisibility(0);
        setVisibility(0);
      }
      else
      {
        paramImageView.setVisibility(i);
        paramImageView.setImageDrawable(null);
      }
    }
    bool1 = TextUtils.isEmpty((CharSequence)localObject2);
    int j = 1;
    bool1 ^= j;
    if (paramTextView != null)
    {
      Object localObject3;
      if (bool1)
      {
        localObject3 = this.tab;
        int k = TabLayout.Tab.access$1500((TabLayout.Tab)localObject3);
        if (k == j) {}
      }
      else
      {
        j = 0;
      }
      int m;
      if (bool1)
      {
        localObject3 = localObject2;
      }
      else
      {
        m = 0;
        localObject3 = null;
      }
      paramTextView.setText((CharSequence)localObject3);
      if (j != 0)
      {
        m = 0;
        localObject3 = null;
      }
      else
      {
        m = i;
      }
      paramTextView.setVisibility(m);
      if (bool1) {
        setVisibility(0);
      }
    }
    else
    {
      j = 0;
    }
    if ((paramBoolean) && (paramImageView != null))
    {
      paramTextView = (ViewGroup.MarginLayoutParams)paramImageView.getLayoutParams();
      if (j != 0)
      {
        paramBoolean = paramImageView.getVisibility();
        if (!paramBoolean)
        {
          localContext = getContext();
          f = ViewUtils.dpToPx(localContext, i);
          paramBoolean = (int)f;
          break label335;
        }
      }
      paramBoolean = false;
      Context localContext = null;
      float f = 0.0F;
      label335:
      TabLayout localTabLayout = this.this$0;
      boolean bool2 = localTabLayout.inlineLabel;
      if (bool2)
      {
        boolean bool3 = MarginLayoutParamsCompat.OooO00o(paramTextView);
        if (paramBoolean == bool3) {
          break label409;
        }
        MarginLayoutParamsCompat.OooO0OO(paramTextView, paramBoolean);
        paramTextView.bottomMargin = 0;
      }
      else
      {
        boolean bool4 = paramTextView.bottomMargin;
        if (paramBoolean == bool4) {
          break label409;
        }
        paramTextView.bottomMargin = paramBoolean;
        MarginLayoutParamsCompat.OooO0OO(paramTextView, 0);
      }
      paramImageView.setLayoutParams(paramTextView);
      paramImageView.requestLayout();
    }
    label409:
    paramTextView = this.tab;
    if (paramTextView != null) {
      localCharSequence = TabLayout.Tab.access$300(paramTextView);
    }
    if (!bool1) {
      localObject2 = localCharSequence;
    }
    TooltipCompat.OooO00o(this, (CharSequence)localObject2);
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = getDrawableState();
    Drawable localDrawable = this.baseBackgroundDrawable;
    int i = 0;
    if (localDrawable != null)
    {
      boolean bool1 = localDrawable.isStateful();
      if (bool1)
      {
        localDrawable = this.baseBackgroundDrawable;
        boolean bool2 = localDrawable.setState((int[])localObject);
        i = false | bool2;
      }
    }
    if (i != 0)
    {
      invalidate();
      localObject = this.this$0;
      ((View)localObject).invalidate();
    }
  }
  
  public int getContentHeight()
  {
    int i = 3;
    View[] arrayOfView = new View[i];
    Object localObject = this.textView;
    int j = 0;
    arrayOfView[0] = localObject;
    localObject = this.iconView;
    int k = 1;
    arrayOfView[k] = localObject;
    View localView1 = this.customView;
    arrayOfView[2] = localView1;
    int m = 0;
    localObject = null;
    int n = 0;
    localView1 = null;
    int i1 = 0;
    while (j < i)
    {
      View localView2 = arrayOfView[j];
      if (localView2 != null)
      {
        int i2 = localView2.getVisibility();
        if (i2 == 0)
        {
          if (i1 != 0)
          {
            i2 = localView2.getTop();
            n = Math.min(n, i2);
          }
          else
          {
            n = localView2.getTop();
          }
          if (i1 != 0)
          {
            i1 = localView2.getBottom();
            m = Math.max(m, i1);
          }
          else
          {
            m = localView2.getBottom();
          }
          i1 = k;
        }
      }
      j += 1;
    }
    return m - n;
  }
  
  public int getContentWidth()
  {
    int i = 3;
    View[] arrayOfView = new View[i];
    Object localObject = this.textView;
    int j = 0;
    arrayOfView[0] = localObject;
    localObject = this.iconView;
    int k = 1;
    arrayOfView[k] = localObject;
    View localView1 = this.customView;
    arrayOfView[2] = localView1;
    int m = 0;
    localObject = null;
    int n = 0;
    localView1 = null;
    int i1 = 0;
    while (j < i)
    {
      View localView2 = arrayOfView[j];
      if (localView2 != null)
      {
        int i2 = localView2.getVisibility();
        if (i2 == 0)
        {
          if (i1 != 0)
          {
            i2 = localView2.getLeft();
            n = Math.min(n, i2);
          }
          else
          {
            n = localView2.getLeft();
          }
          if (i1 != 0)
          {
            i1 = localView2.getRight();
            m = Math.max(m, i1);
          }
          else
          {
            m = localView2.getRight();
          }
          i1 = k;
        }
      }
      j += 1;
    }
    return m - n;
  }
  
  public TabLayout.Tab getTab()
  {
    return this.tab;
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    Object localObject = this.badgeDrawable;
    if (localObject != null)
    {
      bool1 = ((Drawable)localObject).isVisible();
      if (bool1)
      {
        localObject = getContentDescription();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append(localObject);
        localStringBuilder.append(", ");
        localObject = this.badgeDrawable.getContentDescription();
        localStringBuilder.append(localObject);
        localObject = localStringBuilder.toString();
        paramAccessibilityNodeInfo.setContentDescription((CharSequence)localObject);
      }
    }
    paramAccessibilityNodeInfo = AccessibilityNodeInfoCompat.OooOo00(paramAccessibilityNodeInfo);
    int i = 1;
    TabLayout.Tab localTab = this.tab;
    int j = localTab.getPosition();
    int k = 1;
    boolean bool2 = isSelected();
    localObject = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.OooO00o(0, i, j, k, false, bool2);
    paramAccessibilityNodeInfo.setCollectionItemInfo(localObject);
    boolean bool1 = isSelected();
    if (bool1)
    {
      bool1 = false;
      paramAccessibilityNodeInfo.setClickable(false);
      localObject = AccessibilityNodeInfoCompat.AccessibilityActionCompat.OooO;
      paramAccessibilityNodeInfo.OooOOOo((AccessibilityNodeInfoCompat.AccessibilityActionCompat)localObject);
    }
    localObject = getResources();
    i = R.string.item_view_role_description;
    localObject = ((Resources)localObject).getString(i);
    paramAccessibilityNodeInfo.setRoleDescription((CharSequence)localObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt1);
    Object localObject1 = this.this$0;
    int k = ((TabLayout)localObject1).getTabMaxWidth();
    float f1;
    if ((k > 0) && ((j == 0) || (i > k)))
    {
      TabLayout localTabLayout = this.this$0;
      paramInt1 = localTabLayout.tabMaxWidth;
      i = -1 << -1;
      f1 = -0.0F;
      paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, i);
    }
    super.onMeasure(paramInt1, paramInt2);
    Object localObject2 = this.textView;
    if (localObject2 != null)
    {
      localObject2 = this.this$0;
      f1 = ((TabLayout)localObject2).tabTextSize;
      j = this.defaultMaxLines;
      localObject1 = this.iconView;
      int m = 1;
      if (localObject1 != null)
      {
        k = ((View)localObject1).getVisibility();
        if (k == 0)
        {
          j = m;
          break label173;
        }
      }
      localObject1 = this.textView;
      if (localObject1 != null)
      {
        k = ((TextView)localObject1).getLineCount();
        if (k > m)
        {
          localObject2 = this.this$0;
          f1 = ((TabLayout)localObject2).tabTextMultiLineSize;
        }
      }
      label173:
      localObject1 = this.textView;
      float f2 = ((TextView)localObject1).getTextSize();
      TextView localTextView = this.textView;
      int n = localTextView.getLineCount();
      Object localObject3 = this.textView;
      int i1 = TextViewCompat.OooO0Oo((TextView)localObject3);
      boolean bool = f1 < f2;
      if ((bool) || ((i1 >= 0) && (j != i1)))
      {
        localObject3 = this.this$0;
        i1 = ((TabLayout)localObject3).mode;
        if ((i1 == m) && (bool) && (n == m))
        {
          localObject1 = this.textView.getLayout();
          if (localObject1 != null)
          {
            f2 = approximateLineWidth((Layout)localObject1, 0, f1);
            n = getMeasuredWidth();
            i1 = getPaddingLeft();
            n -= i1;
            i1 = getPaddingRight();
            n -= i1;
            float f3 = n;
            bool = f2 < f3;
            if (!bool) {}
          }
          else
          {
            m = 0;
          }
        }
        if (m != 0)
        {
          localObject1 = this.textView;
          ((TextView)localObject1).setTextSize(0, f1);
          localObject2 = this.textView;
          ((TextView)localObject2).setMaxLines(j);
          super.onMeasure(paramInt1, paramInt2);
        }
      }
    }
  }
  
  public boolean performClick()
  {
    boolean bool = super.performClick();
    TabLayout.Tab localTab1 = this.tab;
    if (localTab1 != null)
    {
      if (!bool)
      {
        bool = false;
        localTab2 = null;
        playSoundEffect(0);
      }
      TabLayout.Tab localTab2 = this.tab;
      localTab2.select();
      bool = true;
    }
    return bool;
  }
  
  public void reset()
  {
    setTab(null);
    setSelected(false);
  }
  
  public void setSelected(boolean paramBoolean)
  {
    boolean bool = isSelected();
    if (bool != paramBoolean)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localObject = null;
    }
    super.setSelected(paramBoolean);
    Object localObject = this.textView;
    if (localObject != null) {
      ((TextView)localObject).setSelected(paramBoolean);
    }
    localObject = this.iconView;
    if (localObject != null) {
      ((ImageView)localObject).setSelected(paramBoolean);
    }
    localObject = this.customView;
    if (localObject != null) {
      ((View)localObject).setSelected(paramBoolean);
    }
  }
  
  public void setTab(TabLayout.Tab paramTab)
  {
    TabLayout.Tab localTab = this.tab;
    if (paramTab != localTab)
    {
      this.tab = paramTab;
      update();
    }
  }
  
  public final void update()
  {
    updateTab();
    TabLayout.Tab localTab = this.tab;
    if (localTab != null)
    {
      bool = localTab.isSelected();
      if (bool)
      {
        bool = true;
        break label31;
      }
    }
    boolean bool = false;
    localTab = null;
    label31:
    setSelected(bool);
  }
  
  public final void updateOrientation()
  {
    int i = this.this$0.inlineLabel;
    int j = 1;
    i ^= j;
    setOrientation(i);
    TextView localTextView = this.customTextView;
    if (localTextView == null)
    {
      localImageView1 = this.customIconView;
      if (localImageView1 == null)
      {
        localTextView = this.textView;
        localImageView1 = this.iconView;
        updateTextAndIcon(localTextView, localImageView1, j);
        return;
      }
    }
    ImageView localImageView2 = this.customIconView;
    ImageView localImageView1 = null;
    updateTextAndIcon(localTextView, localImageView2, false);
  }
  
  public final void updateTab()
  {
    Object localObject1 = this.tab;
    int i = 0;
    Object localObject2 = null;
    Object localObject3;
    int k;
    if (localObject1 != null)
    {
      localObject3 = ((TabLayout.Tab)localObject1).getCustomView();
    }
    else
    {
      k = 0;
      localObject3 = null;
    }
    Object localObject4;
    if (localObject3 != null)
    {
      localObject4 = ((View)localObject3).getParent();
      if (localObject4 != this)
      {
        if (localObject4 != null)
        {
          localObject4 = (ViewGroup)localObject4;
          ((ViewGroup)localObject4).removeView((View)localObject3);
        }
        localObject4 = this.customView;
        if (localObject4 != null)
        {
          localObject4 = ((View)localObject4).getParent();
          if (localObject4 != null)
          {
            localObject4 = (ViewGroup)localObject4;
            View localView = this.customView;
            ((ViewGroup)localObject4).removeView(localView);
          }
        }
        addView((View)localObject3);
      }
      this.customView = ((View)localObject3);
      localObject4 = this.textView;
      int m = 8;
      if (localObject4 != null) {
        ((View)localObject4).setVisibility(m);
      }
      localObject4 = this.iconView;
      if (localObject4 != null)
      {
        ((ImageView)localObject4).setVisibility(m);
        localObject4 = this.iconView;
        ((ImageView)localObject4).setImageDrawable(null);
      }
      i = 16908308;
      localObject2 = (TextView)((View)localObject3).findViewById(i);
      this.customTextView = ((TextView)localObject2);
      if (localObject2 != null)
      {
        i = TextViewCompat.OooO0Oo((TextView)localObject2);
        this.defaultMaxLines = i;
      }
      i = 16908294;
      localObject2 = (ImageView)((View)localObject3).findViewById(i);
    }
    else
    {
      localObject3 = this.customView;
      if (localObject3 != null)
      {
        removeView((View)localObject3);
        this.customView = null;
      }
      this.customTextView = null;
    }
    this.customIconView = ((ImageView)localObject2);
    localObject2 = this.customView;
    label395:
    boolean bool3;
    if (localObject2 == null)
    {
      localObject2 = this.iconView;
      if (localObject2 == null) {
        inflateAndAddDefaultIconView();
      }
      localObject2 = this.textView;
      if (localObject2 == null)
      {
        inflateAndAddDefaultTextView();
        localObject2 = this.textView;
        i = TextViewCompat.OooO0Oo((TextView)localObject2);
        this.defaultMaxLines = i;
      }
      localObject2 = this.textView;
      localObject3 = this.this$0;
      k = TabLayout.access$1100((TabLayout)localObject3);
      TextViewCompat.OooOOO((TextView)localObject2, k);
      boolean bool1 = isSelected();
      if (bool1)
      {
        localObject2 = this.this$0;
        int j = TabLayout.access$1200((TabLayout)localObject2);
        k = -1;
        if (j != k)
        {
          localObject2 = this.textView;
          localObject3 = this.this$0;
          k = TabLayout.access$1200((TabLayout)localObject3);
          break label395;
        }
      }
      localObject2 = this.textView;
      localObject3 = this.this$0;
      k = TabLayout.access$1300((TabLayout)localObject3);
      TextViewCompat.OooOOO((TextView)localObject2, k);
      localObject2 = this.this$0.tabTextColors;
      if (localObject2 != null)
      {
        localObject3 = this.textView;
        ((TextView)localObject3).setTextColor((ColorStateList)localObject2);
      }
      localObject2 = this.textView;
      localObject3 = this.iconView;
      bool3 = true;
      updateTextAndIcon((TextView)localObject2, (ImageView)localObject3, bool3);
      tryUpdateBadgeAnchor();
      localObject2 = this.iconView;
      addOnLayoutChangeListener((View)localObject2);
      localObject2 = this.textView;
      addOnLayoutChangeListener((View)localObject2);
    }
    else
    {
      localObject2 = this.customTextView;
      if (localObject2 == null)
      {
        localObject3 = this.customIconView;
        if (localObject3 == null) {}
      }
      else
      {
        localObject3 = this.customIconView;
        bool3 = false;
        localObject4 = null;
        updateTextAndIcon((TextView)localObject2, (ImageView)localObject3, false);
      }
    }
    if (localObject1 != null)
    {
      localObject2 = TabLayout.Tab.access$300((TabLayout.Tab)localObject1);
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool2)
      {
        localObject1 = TabLayout.Tab.access$300((TabLayout.Tab)localObject1);
        setContentDescription((CharSequence)localObject1);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.tabs.TabLayout.TabView
 * JD-Core Version:    0.7.0.1
 */