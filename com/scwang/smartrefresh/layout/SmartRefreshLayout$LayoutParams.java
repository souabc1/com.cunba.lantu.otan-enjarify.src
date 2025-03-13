package com.scwang.smartrefresh.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;

public class SmartRefreshLayout$LayoutParams
  extends ViewGroup.MarginLayoutParams
{
  public int OooO00o = 0;
  public SpinnerStyle OooO0O0 = null;
  
  public SmartRefreshLayout$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public SmartRefreshLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = R.styleable.SmartRefreshLayout_Layout;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    int i = R.styleable.SmartRefreshLayout_Layout_layout_srlBackgroundColor;
    int j = this.OooO00o;
    i = paramContext.getColor(i, j);
    this.OooO00o = i;
    i = R.styleable.SmartRefreshLayout_Layout_layout_srlSpinnerStyle;
    boolean bool = paramContext.hasValue(i);
    if (bool)
    {
      paramAttributeSet = SpinnerStyle.values();
      j = R.styleable.SmartRefreshLayout_Layout_layout_srlSpinnerStyle;
      SpinnerStyle localSpinnerStyle = SpinnerStyle.o00OoOoo;
      int k = localSpinnerStyle.ordinal();
      j = paramContext.getInt(j, k);
      paramAttributeSet = paramAttributeSet[j];
      this.OooO0O0 = paramAttributeSet;
    }
    paramContext.recycle();
  }
  
  public SmartRefreshLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.SmartRefreshLayout.LayoutParams
 * JD-Core Version:    0.7.0.1
 */