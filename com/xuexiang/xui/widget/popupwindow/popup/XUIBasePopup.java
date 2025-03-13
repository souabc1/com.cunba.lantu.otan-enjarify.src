package com.xuexiang.xui.widget.popupwindow.popup;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import m54207b69;

public abstract class XUIBasePopup
{
  public Context OooO00o;
  public PopupWindow OooO0O0;
  public XUIBasePopup.RootView OooO0OO;
  public View OooO0Oo;
  public PopupWindow.OnDismissListener OooO0o;
  public Drawable OooO0o0;
  public boolean OooO0oO;
  
  public void OooO0OO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5109, arrayOfObject);
  }
  
  public void OooO0Oo(Configuration paramConfiguration)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramConfiguration;
    m54207b69.F54207b69_00(5110, arrayOfObject);
  }
  
  public void OooO0o0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5111, arrayOfObject);
  }
  
  public Context getContext()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Context)m54207b69.F54207b69_09(5112, arrayOfObject);
  }
  
  public PopupWindow getPopupWindow()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (PopupWindow)m54207b69.F54207b69_09(5113, arrayOfObject);
  }
  
  public boolean isShowing()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(5114, arrayOfObject);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(5115, arrayOfObject);
  }
  
  public void setContentView(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5116, arrayOfObject);
  }
  
  public void setContentView(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(5117, arrayOfObject);
  }
  
  public void setNeedCacheSize(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5118, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup
 * JD-Core Version:    0.7.0.1
 */