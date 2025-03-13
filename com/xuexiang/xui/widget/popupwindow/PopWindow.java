package com.xuexiang.xui.widget.popupwindow;

import android.content.Context;
import android.widget.PopupWindow;
import m54207b69;

public class PopWindow
  extends PopupWindow
{
  public Context getContext()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Context)m54207b69.F54207b69_09(4991, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.popupwindow.PopWindow
 * JD-Core Version:    0.7.0.1
 */