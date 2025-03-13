package com.xuexiang.xui.widget.edittext.verify;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import m54207b69;

public class TInputConnection
  extends InputConnectionWrapper
{
  public TInputConnection.BackspaceListener OooO00o;
  
  public TInputConnection(InputConnection paramInputConnection, boolean paramBoolean)
  {
    super(paramInputConnection, paramBoolean);
  }
  
  public boolean deleteSurroundingText(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    return m54207b69.F54207b69_01(3527, arrayOfObject);
  }
  
  public boolean sendKeyEvent(KeyEvent paramKeyEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramKeyEvent;
    return m54207b69.F54207b69_01(3528, arrayOfObject);
  }
  
  public void setBackspaceListener(TInputConnection.BackspaceListener paramBackspaceListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBackspaceListener;
    m54207b69.F54207b69_00(3529, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.edittext.verify.TInputConnection
 * JD-Core Version:    0.7.0.1
 */