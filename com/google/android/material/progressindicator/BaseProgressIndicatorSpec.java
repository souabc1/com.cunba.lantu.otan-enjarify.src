package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import m54207b69;

public abstract class BaseProgressIndicatorSpec
{
  public int hideAnimationBehavior;
  public int[] indicatorColors;
  public int showAnimationBehavior;
  public int trackColor;
  public int trackCornerRadius;
  public int trackThickness;
  
  public BaseProgressIndicatorSpec(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    Object localObject = new int[0];
    this.indicatorColors = ((int[])localObject);
    localObject = paramContext.getResources();
    int i = R.dimen.mtrl_progress_track_thickness;
    int j = ((Resources)localObject).getDimensionPixelSize(i);
    int[] arrayOfInt1 = R.styleable.BaseProgressIndicator;
    int[] arrayOfInt2 = new int[0];
    paramAttributeSet = ThemeEnforcement.obtainStyledAttributes(paramContext, paramAttributeSet, arrayOfInt1, paramInt1, paramInt2, arrayOfInt2);
    paramInt1 = R.styleable.BaseProgressIndicator_trackThickness;
    paramInt1 = MaterialResources.getDimensionPixelSize(paramContext, paramAttributeSet, paramInt1, j);
    this.trackThickness = paramInt1;
    paramInt1 = R.styleable.BaseProgressIndicator_trackCornerRadius;
    paramInt1 = MaterialResources.getDimensionPixelSize(paramContext, paramAttributeSet, paramInt1, 0);
    paramInt2 = this.trackThickness / 2;
    paramInt1 = Math.min(paramInt1, paramInt2);
    this.trackCornerRadius = paramInt1;
    paramInt1 = R.styleable.BaseProgressIndicator_showAnimationBehavior;
    paramInt1 = paramAttributeSet.getInt(paramInt1, 0);
    this.showAnimationBehavior = paramInt1;
    paramInt1 = R.styleable.BaseProgressIndicator_hideAnimationBehavior;
    paramInt1 = paramAttributeSet.getInt(paramInt1, 0);
    this.hideAnimationBehavior = paramInt1;
    loadIndicatorColors(paramContext, paramAttributeSet);
    loadTrackColor(paramContext, paramAttributeSet);
    paramAttributeSet.recycle();
  }
  
  private void loadIndicatorColors(Context paramContext, TypedArray paramTypedArray)
  {
    int i = R.styleable.BaseProgressIndicator_indicatorColor;
    boolean bool = paramTypedArray.hasValue(i);
    int k = -1;
    if (!bool)
    {
      m = R.attr.colorPrimary;
      n = MaterialColors.getColor(paramContext, m, k);
      paramContext = new int[] { n };
      this.indicatorColors = paramContext;
      return;
    }
    int j = R.styleable.BaseProgressIndicator_indicatorColor;
    TypedValue localTypedValue = paramTypedArray.peekValue(j);
    j = localTypedValue.type;
    int i1 = 1;
    if (j != i1)
    {
      n = R.styleable.BaseProgressIndicator_indicatorColor;
      n = paramTypedArray.getColor(n, k);
      paramContext = new int[] { n };
      this.indicatorColors = paramContext;
      return;
    }
    paramContext = paramContext.getResources();
    j = R.styleable.BaseProgressIndicator_indicatorColor;
    int m = paramTypedArray.getResourceId(j, k);
    paramContext = paramContext.getIntArray(m);
    this.indicatorColors = paramContext;
    int n = paramContext.length;
    if (n != 0) {
      return;
    }
    paramContext = new java/lang/IllegalArgumentException;
    paramTypedArray = m54207b69.F54207b69_11("E;525661555C5F555B51815E626056562A686B67686864317076347871676C603A6C7480783F777B867A81847A8076A68387857B4E867D518C8C885589849B9D54");
    paramContext.<init>(paramTypedArray);
    throw paramContext;
  }
  
  private void loadTrackColor(Context paramContext, TypedArray paramTypedArray)
  {
    int i = R.styleable.BaseProgressIndicator_trackColor;
    boolean bool = paramTypedArray.hasValue(i);
    int j;
    if (bool)
    {
      k = R.styleable.BaseProgressIndicator_trackColor;
      j = -1;
    }
    int m;
    for (int k = paramTypedArray.getColor(k, j);; k = MaterialColors.compositeARGBWithAlpha(m, k))
    {
      this.trackColor = k;
      return;
      paramTypedArray = this.indicatorColors;
      j = 0;
      m = paramTypedArray[0];
      this.trackColor = m;
      paramContext = paramContext.getTheme();
      paramTypedArray = new int[] { 16842803 };
      paramContext = paramContext.obtainStyledAttributes(paramTypedArray);
      float f1 = paramContext.getFloat(0, 0.2F);
      paramContext.recycle();
      float f2 = 255.0F;
      f1 *= f2;
      k = (int)f1;
      m = this.trackColor;
    }
  }
  
  public boolean isHideAnimationEnabled()
  {
    int i = this.hideAnimationBehavior;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isShowAnimationEnabled()
  {
    int i = this.showAnimationBehavior;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public abstract void validateSpec();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.progressindicator.BaseProgressIndicatorSpec
 * JD-Core Version:    0.7.0.1
 */