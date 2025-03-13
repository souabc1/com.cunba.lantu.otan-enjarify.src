package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.material.R.styleable;

public class AppBarLayout$LayoutParams
  extends LinearLayout.LayoutParams
{
  static final int COLLAPSIBLE_FLAGS = 10;
  static final int FLAG_QUICK_RETURN = 5;
  static final int FLAG_SNAP = 17;
  public static final int SCROLL_EFFECT_COMPRESS = 1;
  public static final int SCROLL_EFFECT_NONE = 0;
  public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
  public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
  public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
  public static final int SCROLL_FLAG_NO_SCROLL = 0;
  public static final int SCROLL_FLAG_SCROLL = 1;
  public static final int SCROLL_FLAG_SNAP = 16;
  public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
  private AppBarLayout.ChildScrollEffect scrollEffect;
  int scrollFlags = 1;
  Interpolator scrollInterpolator;
  
  public AppBarLayout$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public AppBarLayout$LayoutParams(int paramInt1, int paramInt2, float paramFloat)
  {
    super(paramInt1, paramInt2, paramFloat);
  }
  
  public AppBarLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = R.styleable.AppBarLayout_Layout;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    int i = R.styleable.AppBarLayout_Layout_layout_scrollFlags;
    i = paramAttributeSet.getInt(i, 0);
    this.scrollFlags = i;
    i = R.styleable.AppBarLayout_Layout_layout_scrollEffect;
    i = paramAttributeSet.getInt(i, 0);
    setScrollEffect(i);
    i = R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
    boolean bool = paramAttributeSet.hasValue(i);
    if (bool)
    {
      int j = R.styleable.AppBarLayout_Layout_layout_scrollInterpolator;
      j = paramAttributeSet.getResourceId(j, 0);
      paramContext = AnimationUtils.loadInterpolator(paramContext, j);
      this.scrollInterpolator = paramContext;
    }
    paramAttributeSet.recycle();
  }
  
  public AppBarLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public AppBarLayout$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
  
  public AppBarLayout$LayoutParams(LinearLayout.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public AppBarLayout$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    int i = paramLayoutParams.scrollFlags;
    this.scrollFlags = i;
    AppBarLayout.ChildScrollEffect localChildScrollEffect = paramLayoutParams.scrollEffect;
    this.scrollEffect = localChildScrollEffect;
    paramLayoutParams = paramLayoutParams.scrollInterpolator;
    this.scrollInterpolator = paramLayoutParams;
  }
  
  private AppBarLayout.ChildScrollEffect createScrollEffectFromInt(int paramInt)
  {
    int i = 1;
    if (paramInt != i) {
      return null;
    }
    AppBarLayout.CompressChildScrollEffect localCompressChildScrollEffect = new com/google/android/material/appbar/AppBarLayout$CompressChildScrollEffect;
    localCompressChildScrollEffect.<init>();
    return localCompressChildScrollEffect;
  }
  
  public AppBarLayout.ChildScrollEffect getScrollEffect()
  {
    return this.scrollEffect;
  }
  
  public int getScrollFlags()
  {
    return this.scrollFlags;
  }
  
  public Interpolator getScrollInterpolator()
  {
    return this.scrollInterpolator;
  }
  
  public boolean isCollapsible()
  {
    int i = this.scrollFlags;
    int j = i & 0x1;
    boolean bool = true;
    if (j == bool)
    {
      i &= 0xA;
      if (i != 0) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public void setScrollEffect(int paramInt)
  {
    AppBarLayout.ChildScrollEffect localChildScrollEffect = createScrollEffectFromInt(paramInt);
    this.scrollEffect = localChildScrollEffect;
  }
  
  public void setScrollEffect(AppBarLayout.ChildScrollEffect paramChildScrollEffect)
  {
    this.scrollEffect = paramChildScrollEffect;
  }
  
  public void setScrollFlags(int paramInt)
  {
    this.scrollFlags = paramInt;
  }
  
  public void setScrollInterpolator(Interpolator paramInterpolator)
  {
    this.scrollInterpolator = paramInterpolator;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.appbar.AppBarLayout.LayoutParams
 * JD-Core Version:    0.7.0.1
 */