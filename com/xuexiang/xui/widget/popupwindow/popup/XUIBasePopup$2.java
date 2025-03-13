package com.xuexiang.xui.widget.popupwindow.popup;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import m54207b69;

class XUIBasePopup$2
  implements View.OnAttachStateChangeListener
{
  public void onViewAttachedToWindow(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(5103, arrayOfObject);
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(5104, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup.2
 * JD-Core Version:    0.7.0.1
 */