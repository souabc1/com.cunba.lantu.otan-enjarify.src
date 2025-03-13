package com.xuexiang.xui.widget.textview.autofit;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import m54207b69;

public class AutoFitLayout
  extends FrameLayout
{
  public boolean o00OoOoo;
  public float o00Ooo0;
  public float o00Ooo00;
  public WeakHashMap o00Ooo0O;
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    arrayOfObject[3] = paramLayoutParams;
    m54207b69.F54207b69_00(6203, arrayOfObject);
  }
  
  public AutoFitHelper getAutofitHelper(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (AutoFitHelper)m54207b69.F54207b69_09(6204, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.textview.autofit.AutoFitLayout
 * JD-Core Version:    0.7.0.1
 */