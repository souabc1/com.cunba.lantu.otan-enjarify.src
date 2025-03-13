package com.xuexiang.xui.widget.picker.widget;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import m54207b69;

class BasePickerView$4
  implements View.OnKeyListener
{
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    arrayOfObject[3] = paramKeyEvent;
    return m54207b69.F54207b69_01(4841, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.picker.widget.BasePickerView.4
 * JD-Core Version:    0.7.0.1
 */