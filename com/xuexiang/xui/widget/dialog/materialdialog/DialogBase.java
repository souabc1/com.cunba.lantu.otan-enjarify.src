package com.xuexiang.xui.widget.dialog.materialdialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.xuexiang.xui.utils.KeyboardUtils;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;
import m54207b69;

class DialogBase
  extends Dialog
  implements DialogInterface.OnShowListener
{
  public MDRootLayout o00OoOoo;
  public DialogInterface.OnShowListener o00Ooo00;
  
  public DialogBase(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }
  
  public final void OooO0O0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3048, arrayOfObject);
  }
  
  public View findViewById(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (View)m54207b69.F54207b69_09(3049, arrayOfObject);
  }
  
  public void onShow(DialogInterface paramDialogInterface)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDialogInterface;
    m54207b69.F54207b69_00(3050, arrayOfObject);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    KeyboardUtils.OooO00o(paramMotionEvent, this);
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setContentView(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3052, arrayOfObject);
  }
  
  public void setContentView(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(3053, arrayOfObject);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    arrayOfObject[2] = paramLayoutParams;
    m54207b69.F54207b69_00(3054, arrayOfObject);
  }
  
  public final void setOnShowListener(DialogInterface.OnShowListener paramOnShowListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnShowListener;
    m54207b69.F54207b69_00(3055, arrayOfObject);
  }
  
  public final void setViewInternal(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(3056, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.dialog.materialdialog.DialogBase
 * JD-Core Version:    0.7.0.1
 */