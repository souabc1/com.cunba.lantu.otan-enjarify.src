package com.xuexiang.xui.widget.toast;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.widget.Toast;
import m54207b69;

final class XToast$1
  implements View.OnAttachStateChangeListener
{
  public XToast$1(Toast paramToast) {}
  
  public void onViewAttachedToWindow(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(6537, arrayOfObject);
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(6538, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.toast.XToast.1
 * JD-Core Version:    0.7.0.1
 */