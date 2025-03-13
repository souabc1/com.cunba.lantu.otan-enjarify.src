package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.ViewUtils;

class TabLayout$SlidingTabIndicator
  extends LinearLayout
{
  ValueAnimator indicatorAnimator;
  private int layoutDirection = -1;
  
  public TabLayout$SlidingTabIndicator(TabLayout paramTabLayout, Context paramContext)
  {
    super(paramContext);
    setWillNotDraw(false);
  }
  
  private void jumpIndicatorToIndicatorPosition()
  {
    TabLayout localTabLayout = this.this$0;
    int i = localTabLayout.indicatorPosition;
    int j = -1;
    if (i == j)
    {
      i = localTabLayout.getSelectedTabPosition();
      localTabLayout.indicatorPosition = i;
    }
    int k = this.this$0.indicatorPosition;
    jumpIndicatorToPosition(k);
  }
  
  private void jumpIndicatorToPosition(int paramInt)
  {
    Object localObject = this.this$0;
    int i = TabLayout.access$1600((TabLayout)localObject);
    if (i != 0)
    {
      localObject = this.this$0.getTabSelectedIndicator().getBounds();
      i = ((Rect)localObject).left;
      int j = -1;
      if (i == j)
      {
        localObject = this.this$0.getTabSelectedIndicator().getBounds();
        i = ((Rect)localObject).right;
        if (i == j) {}
      }
      else
      {
        return;
      }
    }
    localObject = getChildAt(paramInt);
    TabIndicatorInterpolator localTabIndicatorInterpolator = TabLayout.access$1700(this.this$0);
    TabLayout localTabLayout = this.this$0;
    Drawable localDrawable = localTabLayout.tabSelectedIndicator;
    localTabIndicatorInterpolator.setIndicatorBoundsForTab(localTabLayout, (View)localObject, localDrawable);
    this.this$0.indicatorPosition = paramInt;
  }
  
  private void jumpIndicatorToSelectedPosition()
  {
    int i = this.this$0.getSelectedTabPosition();
    jumpIndicatorToPosition(i);
  }
  
  private void tweenIndicatorPosition(View paramView1, View paramView2, float paramFloat)
  {
    if (paramView1 != null)
    {
      i = paramView1.getWidth();
      if (i > 0)
      {
        i = 1;
        break label27;
      }
    }
    int i = 0;
    TabLayout localTabLayout1 = null;
    label27:
    if (i != 0)
    {
      localTabLayout1 = this.this$0;
      TabIndicatorInterpolator localTabIndicatorInterpolator = TabLayout.access$1700(localTabLayout1);
      TabLayout localTabLayout2 = this.this$0;
      Drawable localDrawable = localTabLayout2.tabSelectedIndicator;
      localTabIndicatorInterpolator.updateIndicatorForOffset(localTabLayout2, paramView1, paramView2, paramFloat, localDrawable);
    }
    else
    {
      paramView1 = this.this$0.tabSelectedIndicator;
      paramView2 = paramView1.getBounds();
      int j = paramView2.top;
      Rect localRect = this.this$0.tabSelectedIndicator.getBounds();
      int k = localRect.bottom;
      i = -1;
      paramView1.setBounds(i, j, i, k);
    }
    ViewCompat.Ooooooo(this);
  }
  
  private void updateOrRecreateIndicatorAnimation(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    Object localObject = this.this$0;
    int i = ((TabLayout)localObject).indicatorPosition;
    if (i == paramInt1) {
      return;
    }
    int j = ((TabLayout)localObject).getSelectedTabPosition();
    localObject = getChildAt(j);
    View localView = getChildAt(paramInt1);
    if (localView == null)
    {
      jumpIndicatorToSelectedPosition();
      return;
    }
    TabLayout localTabLayout = this.this$0;
    localTabLayout.indicatorPosition = paramInt1;
    TabLayout.SlidingTabIndicator.1 local1 = new com/google/android/material/tabs/TabLayout$SlidingTabIndicator$1;
    local1.<init>(this, (View)localObject, localView);
    ValueAnimator localValueAnimator;
    if (paramBoolean)
    {
      localValueAnimator = new android/animation/ValueAnimator;
      localValueAnimator.<init>();
      this.indicatorAnimator = localValueAnimator;
      localObject = TabLayout.access$1900(this.this$0);
      localValueAnimator.setInterpolator((TimeInterpolator)localObject);
      long l = paramInt2;
      localValueAnimator.setDuration(l);
      paramInt2 = 2;
      float[] arrayOfFloat = new float[paramInt2];
      float[] tmp136_134 = arrayOfFloat;
      tmp136_134[0] = 0.0F;
      tmp136_134[1] = 1.0F;
      localValueAnimator.setFloatValues(tmp136_134);
      localValueAnimator.addUpdateListener(local1);
      localValueAnimator.start();
    }
    else
    {
      this.indicatorAnimator.removeAllUpdateListeners();
      localValueAnimator = this.indicatorAnimator;
      localValueAnimator.addUpdateListener(local1);
    }
  }
  
  public void animateIndicatorToPosition(int paramInt1, int paramInt2)
  {
    Object localObject = this.indicatorAnimator;
    if (localObject != null)
    {
      boolean bool = ((ValueAnimator)localObject).isRunning();
      if (bool)
      {
        localObject = this.this$0;
        int i = ((TabLayout)localObject).indicatorPosition;
        if (i != paramInt1)
        {
          localObject = this.indicatorAnimator;
          ((ValueAnimator)localObject).cancel();
        }
      }
    }
    updateOrRecreateIndicatorAnimation(true, paramInt1, paramInt2);
  }
  
  public boolean childrenNeedLayout()
  {
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      View localView = getChildAt(j);
      int k = localView.getWidth();
      if (k <= 0) {
        return true;
      }
      j += 1;
    }
    return false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject1 = this.this$0.tabSelectedIndicator.getBounds();
    int i = ((Rect)localObject1).height();
    if (i < 0)
    {
      localObject1 = this.this$0.tabSelectedIndicator;
      i = ((Drawable)localObject1).getIntrinsicHeight();
    }
    Object localObject2 = this.this$0;
    int j = ((TabLayout)localObject2).tabIndicatorGravity;
    int k;
    if (j != 0)
    {
      k = 1;
      int m = 2;
      if (j != k)
      {
        k = 0;
        if (j == m) {
          break label132;
        }
        i = 3;
        if (j != i)
        {
          i = 0;
          localObject1 = null;
          break label132;
        }
      }
      else
      {
        k = (getHeight() - i) / 2;
        j = getHeight() + i;
        i = j / 2;
        break label132;
      }
    }
    else
    {
      j = getHeight();
      k = j - i;
    }
    i = getHeight();
    label132:
    localObject2 = this.this$0.tabSelectedIndicator.getBounds();
    j = ((Rect)localObject2).width();
    if (j > 0)
    {
      localObject2 = this.this$0.tabSelectedIndicator.getBounds();
      Drawable localDrawable = this.this$0.tabSelectedIndicator;
      int n = ((Rect)localObject2).left;
      j = ((Rect)localObject2).right;
      localDrawable.setBounds(n, k, j, i);
      localObject1 = this.this$0.tabSelectedIndicator;
      ((Drawable)localObject1).draw(paramCanvas);
    }
    super.draw(paramCanvas);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject = this.indicatorAnimator;
    if (localObject != null)
    {
      paramBoolean = ((ValueAnimator)localObject).isRunning();
      if (paramBoolean)
      {
        localObject = this.this$0;
        paramBoolean = ((TabLayout)localObject).getSelectedTabPosition();
        paramInt1 = -1;
        paramInt2 = 0;
        updateOrRecreateIndicatorAnimation(false, paramBoolean, paramInt1);
        return;
      }
    }
    jumpIndicatorToIndicatorPosition();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = 1073741824;
    if (i != j) {
      return;
    }
    TabLayout localTabLayout = this.this$0;
    j = localTabLayout.tabGravity;
    int k = 2;
    float f1 = 2.802597E-045F;
    int m = 1;
    float f2 = 1.4E-45F;
    if (j != m)
    {
      i = localTabLayout.mode;
      if (i != k) {}
    }
    else
    {
      i = getChildCount();
      j = 0;
      int n = 0;
      Object localObject = null;
      float f3 = 0.0F;
      int i1 = 0;
      while (n < i)
      {
        View localView = getChildAt(n);
        i2 = localView.getVisibility();
        if (i2 == 0)
        {
          i3 = localView.getMeasuredWidth();
          i1 = Math.max(i1, i3);
        }
        n += 1;
      }
      if (i1 <= 0) {
        return;
      }
      localObject = getContext();
      float f4 = 2.242078E-044F;
      f3 = ViewUtils.dpToPx((Context)localObject, 16);
      n = (int)f3;
      int i3 = i1 * i;
      int i2 = getMeasuredWidth();
      n *= k;
      i2 -= n;
      if (i3 <= i2)
      {
        k = 0;
        f1 = 0.0F;
        while (j < i)
        {
          localObject = (LinearLayout.LayoutParams)getChildAt(j).getLayoutParams();
          i3 = ((LinearLayout.LayoutParams)localObject).width;
          i2 = 0;
          if (i3 == i1)
          {
            f4 = ((LinearLayout.LayoutParams)localObject).weight;
            boolean bool = f4 < 0.0F;
            if (!bool) {}
          }
          else
          {
            ((LinearLayout.LayoutParams)localObject).width = i1;
            ((LinearLayout.LayoutParams)localObject).weight = 0.0F;
            k = m;
            f1 = f2;
          }
          j += 1;
        }
        m = k;
        f2 = f1;
      }
      else
      {
        localTabLayout = this.this$0;
        localTabLayout.tabGravity = 0;
        localTabLayout.updateTabViews(false);
      }
      if (m != 0) {
        super.onMeasure(paramInt1, paramInt2);
      }
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    super.onRtlPropertiesChanged(paramInt);
  }
  
  public void setIndicatorPositionFromTabPosition(int paramInt, float paramFloat)
  {
    Object localObject = this.this$0;
    float f = paramInt + paramFloat;
    int i = Math.round(f);
    ((TabLayout)localObject).indicatorPosition = i;
    localObject = this.indicatorAnimator;
    if (localObject != null)
    {
      boolean bool = ((ValueAnimator)localObject).isRunning();
      if (bool)
      {
        localObject = this.indicatorAnimator;
        ((ValueAnimator)localObject).cancel();
      }
    }
    localObject = getChildAt(paramInt);
    paramInt += 1;
    View localView = getChildAt(paramInt);
    tweenIndicatorPosition((View)localObject, localView, paramFloat);
  }
  
  public void setSelectedIndicatorHeight(int paramInt)
  {
    Rect localRect = this.this$0.tabSelectedIndicator.getBounds();
    Drawable localDrawable = this.this$0.tabSelectedIndicator;
    int i = localRect.left;
    int j = localRect.right;
    localDrawable.setBounds(i, 0, j, paramInt);
    requestLayout();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.tabs.TabLayout.SlidingTabIndicator
 * JD-Core Version:    0.7.0.1
 */