package com.xuexiang.xui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.xuexiang.xui.utils.Utils;
import com.xuexiang.xui.widget.statelayout.StateLayoutConfig;
import m54207b69;

public class UIConfig
{
  public static volatile UIConfig OooO0OO;
  public StateLayoutConfig OooO00o;
  public Drawable OooO0O0;
  
  public UIConfig(Context paramContext)
  {
    StateLayoutConfig localStateLayoutConfig = new com/xuexiang/xui/widget/statelayout/StateLayoutConfig;
    localStateLayoutConfig.<init>(paramContext);
    this.OooO00o = localStateLayoutConfig;
    paramContext = Utils.OooO0OO(paramContext);
    this.OooO0O0 = paramContext;
  }
  
  public static UIConfig OooO00o(Context paramContext)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    return (UIConfig)m54207b69.F54207b69_09(1859, arrayOfObject);
  }
  
  public Drawable getAppIcon()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Drawable)m54207b69.F54207b69_09(1860, arrayOfObject);
  }
  
  public StateLayoutConfig getStateLayoutConfig()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (StateLayoutConfig)m54207b69.F54207b69_09(1861, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.UIConfig
 * JD-Core Version:    0.7.0.1
 */