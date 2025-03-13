package com.xuexiang.xui.widget.popupwindow.popup;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.FrameLayout;
import m54207b69;

public class XUIBasePopup$RootView
  extends FrameLayout
{
  public XUIBasePopup$RootView(XUIBasePopup paramXUIBasePopup, Context paramContext)
  {
    super(paramContext);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramConfiguration;
    m54207b69.F54207b69_00(5106, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup.RootView
 * JD-Core Version:    0.7.0.1
 */