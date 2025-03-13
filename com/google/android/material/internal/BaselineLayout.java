package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout
  extends ViewGroup
{
  private int baseline = -1;
  
  public BaselineLayout(Context paramContext)
  {
    super(paramContext, null, 0);
  }
  
  public BaselineLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public BaselineLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public int getBaseline()
  {
    return this.baseline;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = getChildCount();
    paramInt2 = getPaddingLeft();
    paramInt3 -= paramInt1;
    paramInt1 = getPaddingRight();
    paramInt3 = paramInt3 - paramInt1 - paramInt2;
    paramInt1 = getPaddingTop();
    paramInt4 = 0;
    while (paramInt4 < paramBoolean)
    {
      View localView = getChildAt(paramInt4);
      int i = localView.getVisibility();
      int j = 8;
      if (i != j)
      {
        i = localView.getMeasuredWidth();
        j = localView.getMeasuredHeight();
        int k = (paramInt3 - i) / 2 + paramInt2;
        int m = this.baseline;
        int n = -1;
        if (m != n)
        {
          m = localView.getBaseline();
          if (m != n)
          {
            m = this.baseline + paramInt1;
            n = localView.getBaseline();
            m -= n;
            break label155;
          }
        }
        m = paramInt1;
        label155:
        i += k;
        j += m;
        localView.layout(k, m, i, j);
      }
      paramInt4 += 1;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    int j = 0;
    int k = -1;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = k;
    int i3 = k;
    while (j < i)
    {
      View localView = getChildAt(j);
      int i4 = localView.getVisibility();
      int i5 = 8;
      if (i4 != i5)
      {
        measureChild(localView, paramInt1, paramInt2);
        i4 = localView.getBaseline();
        if (i4 != k)
        {
          i2 = Math.max(i2, i4);
          i5 = localView.getMeasuredHeight() - i4;
          i3 = Math.max(i3, i5);
        }
        i4 = localView.getMeasuredWidth();
        n = Math.max(n, i4);
        i4 = localView.getMeasuredHeight();
        m = Math.max(m, i4);
        int i6 = localView.getMeasuredState();
        i1 = View.combineMeasuredStates(i1, i6);
      }
      j += 1;
    }
    if (i2 != k)
    {
      i = getPaddingBottom();
      i = Math.max(i3, i) + i2;
      m = Math.max(m, i);
      this.baseline = i2;
    }
    i = getSuggestedMinimumHeight();
    i = Math.max(m, i);
    j = getSuggestedMinimumWidth();
    paramInt1 = View.resolveSizeAndState(Math.max(n, j), paramInt1, i1);
    j = i1 << 16;
    paramInt2 = View.resolveSizeAndState(i, paramInt2, j);
    setMeasuredDimension(paramInt1, paramInt2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.BaselineLayout
 * JD-Core Version:    0.7.0.1
 */