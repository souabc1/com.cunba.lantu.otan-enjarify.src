package com.xuexiang.xui.utils;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import m54207b69;

final class StatusBarUtils$1
  implements View.OnAttachStateChangeListener
{
  public void onViewAttachedToWindow(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(2139, arrayOfObject);
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(2140, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.utils.StatusBarUtils.1
 * JD-Core Version:    0.7.0.1
 */