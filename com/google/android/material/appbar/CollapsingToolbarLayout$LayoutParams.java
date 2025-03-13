package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.material.R.styleable;

public class CollapsingToolbarLayout$LayoutParams
  extends FrameLayout.LayoutParams
{
  public static final int COLLAPSE_MODE_OFF = 0;
  public static final int COLLAPSE_MODE_PARALLAX = 2;
  public static final int COLLAPSE_MODE_PIN = 1;
  private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5F;
  int collapseMode = 0;
  float parallaxMult;
  
  public CollapsingToolbarLayout$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.parallaxMult = 0.5F;
  }
  
  public CollapsingToolbarLayout$LayoutParams(int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt2, paramInt3);
    this.parallaxMult = 0.5F;
  }
  
  public CollapsingToolbarLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    float f1 = 0.5F;
    this.parallaxMult = f1;
    int[] arrayOfInt = R.styleable.CollapsingToolbarLayout_Layout;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    int i = R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode;
    i = paramContext.getInt(i, 0);
    this.collapseMode = i;
    i = R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier;
    float f2 = paramContext.getFloat(i, f1);
    setParallaxMultiplier(f2);
    paramContext.recycle();
  }
  
  public CollapsingToolbarLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.parallaxMult = 0.5F;
  }
  
  public CollapsingToolbarLayout$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    this.parallaxMult = 0.5F;
  }
  
  public CollapsingToolbarLayout$LayoutParams(FrameLayout.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.parallaxMult = 0.5F;
  }
  
  public CollapsingToolbarLayout$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.parallaxMult = 0.5F;
    int i = paramLayoutParams.collapseMode;
    this.collapseMode = i;
    float f = paramLayoutParams.parallaxMult;
    this.parallaxMult = f;
  }
  
  public int getCollapseMode()
  {
    return this.collapseMode;
  }
  
  public float getParallaxMultiplier()
  {
    return this.parallaxMult;
  }
  
  public void setCollapseMode(int paramInt)
  {
    this.collapseMode = paramInt;
  }
  
  public void setParallaxMultiplier(float paramFloat)
  {
    this.parallaxMult = paramFloat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams
 * JD-Core Version:    0.7.0.1
 */