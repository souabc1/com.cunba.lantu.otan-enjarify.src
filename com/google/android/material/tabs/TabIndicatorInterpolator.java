package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;

class TabIndicatorInterpolator
{
  private static final int MIN_INDICATOR_WIDTH = 24;
  
  public static RectF calculateIndicatorWidthForTab(TabLayout paramTabLayout, View paramView)
  {
    if (paramView == null)
    {
      paramTabLayout = new android/graphics/RectF;
      paramTabLayout.<init>();
      return paramTabLayout;
    }
    boolean bool = paramTabLayout.isTabIndicatorFullWidth();
    if (!bool)
    {
      bool = paramView instanceof TabLayout.TabView;
      if (bool) {
        return calculateTabViewContentBounds((TabLayout.TabView)paramView, 24);
      }
    }
    paramTabLayout = new android/graphics/RectF;
    float f1 = paramView.getLeft();
    float f2 = paramView.getTop();
    float f3 = paramView.getRight();
    float f4 = paramView.getBottom();
    paramTabLayout.<init>(f1, f2, f3, f4);
    return paramTabLayout;
  }
  
  public static RectF calculateTabViewContentBounds(TabLayout.TabView paramTabView, int paramInt)
  {
    int i = paramTabView.getContentWidth();
    int j = paramTabView.getContentHeight();
    Context localContext = paramTabView.getContext();
    float f1 = ViewUtils.dpToPx(localContext, paramInt);
    paramInt = (int)f1;
    if (i < paramInt) {
      i = paramInt;
    }
    paramInt = paramTabView.getLeft();
    int k = paramTabView.getRight();
    paramInt = (paramInt + k) / 2;
    k = paramTabView.getTop();
    int m = paramTabView.getBottom();
    k = (k + m) / 2;
    i /= 2;
    m = paramInt - i;
    j /= 2;
    j = k - j;
    i += paramInt;
    paramInt /= 2;
    k += paramInt;
    RectF localRectF = new android/graphics/RectF;
    float f2 = m;
    float f3 = j;
    float f4 = i;
    float f5 = k;
    localRectF.<init>(f2, f3, f4, f5);
    return localRectF;
  }
  
  public void setIndicatorBoundsForTab(TabLayout paramTabLayout, View paramView, Drawable paramDrawable)
  {
    paramTabLayout = calculateIndicatorWidthForTab(paramTabLayout, paramView);
    int i = (int)paramTabLayout.left;
    int j = paramDrawable.getBounds().top;
    int k = (int)paramTabLayout.right;
    int m = paramDrawable.getBounds().bottom;
    paramDrawable.setBounds(i, j, k, m);
  }
  
  public void updateIndicatorForOffset(TabLayout paramTabLayout, View paramView1, View paramView2, float paramFloat, Drawable paramDrawable)
  {
    paramView1 = calculateIndicatorWidthForTab(paramTabLayout, paramView1);
    paramTabLayout = calculateIndicatorWidthForTab(paramTabLayout, paramView2);
    int i = (int)paramView1.left;
    int j = (int)paramTabLayout.left;
    i = AnimationUtils.lerp(i, j, paramFloat);
    j = paramDrawable.getBounds().top;
    int k = (int)paramView1.right;
    int m = (int)paramTabLayout.right;
    m = AnimationUtils.lerp(k, m, paramFloat);
    k = paramDrawable.getBounds().bottom;
    paramDrawable.setBounds(i, j, m, k);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.tabs.TabIndicatorInterpolator
 * JD-Core Version:    0.7.0.1
 */