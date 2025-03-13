package com.google.android.material.internal;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.id;
import com.google.android.material.R.styleable;

public class FlowLayout
  extends ViewGroup
{
  private int itemSpacing;
  private int lineSpacing;
  private int rowCount;
  private boolean singleLine = false;
  
  public FlowLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    loadFromAttributes(paramContext, paramAttributeSet);
  }
  
  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    loadFromAttributes(paramContext, paramAttributeSet);
  }
  
  private static int getMeasuredDimension(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = -1 << -1;
    if (paramInt2 != i)
    {
      i = 1073741824;
      if (paramInt2 != i) {
        return paramInt3;
      }
      return paramInt1;
    }
    return Math.min(paramInt3, paramInt1);
  }
  
  private void loadFromAttributes(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = paramContext.getTheme();
    int[] arrayOfInt = R.styleable.FlowLayout;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, 0, 0);
    int i = R.styleable.FlowLayout_lineSpacing;
    i = paramContext.getDimensionPixelSize(i, 0);
    this.lineSpacing = i;
    i = R.styleable.FlowLayout_itemSpacing;
    i = paramContext.getDimensionPixelSize(i, 0);
    this.itemSpacing = i;
    paramContext.recycle();
  }
  
  public int getItemSpacing()
  {
    return this.itemSpacing;
  }
  
  public int getLineSpacing()
  {
    return this.lineSpacing;
  }
  
  public int getRowCount()
  {
    return this.rowCount;
  }
  
  public int getRowIndex(View paramView)
  {
    int i = R.id.row_index_key;
    paramView = paramView.getTag(i);
    boolean bool = paramView instanceof Integer;
    if (!bool) {
      return -1;
    }
    return ((Integer)paramView).intValue();
  }
  
  public boolean isSingleLine()
  {
    return this.singleLine;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = getChildCount();
    if (!paramBoolean)
    {
      this.rowCount = 0;
      return;
    }
    paramBoolean = true;
    this.rowCount = paramBoolean;
    paramInt4 = ViewCompat.OooOoOO(this);
    if (paramInt4 == paramBoolean) {
      paramInt4 = paramBoolean;
    } else {
      paramInt4 = 0;
    }
    int i;
    if (paramInt4 != 0) {
      i = getPaddingRight();
    } else {
      i = getPaddingLeft();
    }
    if (paramInt4 != 0) {
      j = getPaddingLeft();
    } else {
      j = getPaddingRight();
    }
    int k = getPaddingTop();
    paramInt3 = paramInt3 - paramInt1 - j;
    int j = 0;
    int m = i;
    paramInt1 = k;
    for (;;)
    {
      int n = getChildCount();
      if (j >= n) {
        break;
      }
      View localView = getChildAt(j);
      int i1 = localView.getVisibility();
      int i2 = 8;
      Integer localInteger1;
      if (i1 == i2)
      {
        i1 = R.id.row_index_key;
        i2 = -1;
        localInteger1 = Integer.valueOf(i2);
        localView.setTag(i1, localInteger1);
      }
      else
      {
        Object localObject = localView.getLayoutParams();
        boolean bool1 = localObject instanceof ViewGroup.MarginLayoutParams;
        int i3;
        if (bool1)
        {
          localObject = (ViewGroup.MarginLayoutParams)localObject;
          i3 = MarginLayoutParamsCompat.OooO0O0((ViewGroup.MarginLayoutParams)localObject);
          i1 = MarginLayoutParamsCompat.OooO00o((ViewGroup.MarginLayoutParams)localObject);
        }
        else
        {
          i1 = 0;
          localObject = null;
          i3 = 0;
          localInteger1 = null;
        }
        int i4 = m + i3;
        int i5 = localView.getMeasuredWidth();
        i4 += i5;
        boolean bool2 = this.singleLine;
        if ((!bool2) && (i4 > paramInt3))
        {
          paramInt1 = this.lineSpacing + k;
          k = this.rowCount + paramBoolean;
          this.rowCount = k;
          m = i;
        }
        k = R.id.row_index_key;
        Integer localInteger2 = Integer.valueOf(this.rowCount - paramBoolean);
        localView.setTag(k, localInteger2);
        k = m + i3;
        i4 = localView.getMeasuredWidth() + k;
        int i6 = localView.getMeasuredHeight() + paramInt1;
        if (paramInt4 != 0)
        {
          k = paramInt3 - i4;
          i4 = paramInt3 - m - i3;
        }
        localView.layout(k, paramInt1, i4, i6);
        i3 += i1;
        k = localView.getMeasuredWidth();
        i3 += k;
        k = this.itemSpacing;
        i3 += k;
        m += i3;
        k = i6;
      }
      j += 1;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    FlowLayout localFlowLayout = this;
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt1);
    int k = View.MeasureSpec.getSize(paramInt2);
    int m = View.MeasureSpec.getMode(paramInt2);
    int n = -1 << -1;
    if (j != n)
    {
      n = 1073741824;
      if (j != n)
      {
        n = -1 >>> 1;
        break label64;
      }
    }
    n = i;
    label64:
    int i1 = getPaddingLeft();
    int i3 = getPaddingTop();
    int i4 = getPaddingRight();
    n -= i4;
    int i6 = i3;
    int i7 = 0;
    int i8 = 0;
    for (;;)
    {
      int i9 = getChildCount();
      if (i7 >= i9) {
        break;
      }
      View localView = localFlowLayout.getChildAt(i7);
      int i10 = localView.getVisibility();
      int i11 = 8;
      if (i10 == i11)
      {
        i10 = paramInt1;
        i11 = paramInt2;
      }
      else
      {
        i10 = paramInt1;
        i11 = paramInt2;
        localFlowLayout.measureChild(localView, paramInt1, paramInt2);
        Object localObject = localView.getLayoutParams();
        boolean bool2 = localObject instanceof ViewGroup.MarginLayoutParams;
        int i5;
        int i12;
        if (bool2)
        {
          localObject = (ViewGroup.MarginLayoutParams)localObject;
          i5 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin + 0;
          i12 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin + 0;
        }
        else
        {
          i5 = 0;
          i12 = 0;
          localObject = null;
        }
        int i13 = i1 + i5;
        int i14 = localView.getMeasuredWidth();
        int i15 = i1;
        i1 = i13 + i14;
        if (i1 > n)
        {
          boolean bool1 = isSingleLine();
          if (!bool1)
          {
            i2 = getPaddingLeft();
            i6 = localFlowLayout.lineSpacing + i3;
            break label282;
          }
        }
        int i2 = i15;
        label282:
        i3 = i2 + i5;
        i13 = localView.getMeasuredWidth();
        i3 += i13;
        i13 = localView.getMeasuredHeight();
        i13 = i6 + i13;
        if (i3 > i8) {
          i8 = i3;
        }
        i5 += i12;
        i3 = localView.getMeasuredWidth();
        i5 += i3;
        i3 = localFlowLayout.itemSpacing;
        i5 += i3;
        i2 += i5;
        i3 = getChildCount() + -1;
        if (i7 == i3) {
          i8 += i12;
        }
        i3 = i13;
      }
      i7 += 1;
    }
    n = getPaddingRight();
    i8 += n;
    n = getPaddingBottom();
    i3 += n;
    i = getMeasuredDimension(i, j, i8);
    j = getMeasuredDimension(k, m, i3);
    localFlowLayout.setMeasuredDimension(i, j);
  }
  
  public void setItemSpacing(int paramInt)
  {
    this.itemSpacing = paramInt;
  }
  
  public void setLineSpacing(int paramInt)
  {
    this.lineSpacing = paramInt;
  }
  
  public void setSingleLine(boolean paramBoolean)
  {
    this.singleLine = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.FlowLayout
 * JD-Core Version:    0.7.0.1
 */