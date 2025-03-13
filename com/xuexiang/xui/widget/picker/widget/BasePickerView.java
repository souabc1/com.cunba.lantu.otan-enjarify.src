package com.xuexiang.xui.widget.picker.widget;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import com.xuexiang.xui.widget.picker.widget.configure.PickerOptions;
import com.xuexiang.xui.widget.picker.widget.listener.OnDismissListener;
import m54207b69;

public class BasePickerView
{
  public Context o00OoOoo;
  public ViewGroup o00Ooo0;
  public ViewGroup o00Ooo00;
  public ViewGroup o00Ooo0O;
  public PickerOptions o00Ooo0o;
  public boolean o00OooO;
  public OnDismissListener o00OooO0;
  public Animation o00OooOO;
  public boolean o00OooOo;
  public Dialog o00OoooO;
  public View o00Ooooo;
  public View.OnKeyListener o00o000;
  public boolean o00o0000;
  public int o0O00o0;
  
  private void OooO0o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(4849, arrayOfObject);
  }
  
  private Animation getInAnimation()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Animation)m54207b69.F54207b69_09(4855, arrayOfObject);
  }
  
  private Animation getOutAnimation()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Animation)m54207b69.F54207b69_09(4856, arrayOfObject);
  }
  
  private void setWindowMaxWidth(Window paramWindow)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWindow;
    m54207b69.F54207b69_00(4860, arrayOfObject);
  }
  
  public final int OooO(Window paramWindow)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWindow;
    return m54207b69.F54207b69_05(4844, arrayOfObject);
  }
  
  public void OooO0o0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(4850, arrayOfObject);
  }
  
  public void OooO0oO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(4851, arrayOfObject);
  }
  
  public View OooO0oo(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (View)m54207b69.F54207b69_09(4852, arrayOfObject);
  }
  
  public Dialog getDialog()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Dialog)m54207b69.F54207b69_09(4853, arrayOfObject);
  }
  
  public ViewGroup getDialogContainerLayout()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ViewGroup)m54207b69.F54207b69_09(4854, arrayOfObject);
  }
  
  public boolean isDialog()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(4857, arrayOfObject);
  }
  
  public boolean isShowing()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(4858, arrayOfObject);
  }
  
  public void setKeyBackCancelable(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(4859, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.picker.widget.BasePickerView
 * JD-Core Version:    0.7.0.1
 */