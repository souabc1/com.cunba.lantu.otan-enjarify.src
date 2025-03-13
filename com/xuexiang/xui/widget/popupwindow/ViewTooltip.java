package com.xuexiang.xui.widget.popupwindow;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import m54207b69;

public class ViewTooltip
{
  public final View OooO00o;
  public final ViewTooltip.TooltipView OooO0O0;
  
  public ViewTooltip(View paramView)
  {
    this.OooO00o = paramView;
    ViewTooltip.TooltipView localTooltipView = new com/xuexiang/xui/widget/popupwindow/ViewTooltip$TooltipView;
    paramView = paramView.getContext();
    paramView = OooO0Oo(paramView);
    localTooltipView.<init>(paramView);
    this.OooO0O0 = localTooltipView;
  }
  
  public static ViewTooltip OooO0o0(View paramView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramView;
    return (ViewTooltip)m54207b69.F54207b69_09(5042, arrayOfObject);
  }
  
  public ViewTooltip OooO0OO(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (ViewTooltip)m54207b69.F54207b69_09(5039, arrayOfObject);
  }
  
  public Activity OooO0Oo(Context paramContext)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    return (Activity)m54207b69.F54207b69_09(5040, arrayOfObject);
  }
  
  public ViewTooltip OooO0o(ViewTooltip.Position paramPosition)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramPosition;
    return (ViewTooltip)m54207b69.F54207b69_09(5041, arrayOfObject);
  }
  
  public ViewTooltip.TooltipView OooO0oO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ViewTooltip.TooltipView)m54207b69.F54207b69_09(5043, arrayOfObject);
  }
  
  public ViewTooltip OooO0oo(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (ViewTooltip)m54207b69.F54207b69_09(5044, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.popupwindow.ViewTooltip
 * JD-Core Version:    0.7.0.1
 */