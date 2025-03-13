package com.xuexiang.xui.widget.imageview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import m54207b69;

public class SignatureView
  extends View
{
  public float o00OoOoo;
  public Paint o00Ooo0;
  public float o00Ooo00;
  public Path o00Ooo0O;
  public Canvas o00Ooo0o;
  public boolean o00OooO;
  public Bitmap o00OooO0;
  public int o00OooOO;
  public Paint o00OooOo;
  public int o0O00o0;
  
  public final void OooO00o(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(3745, arrayOfObject);
  }
  
  public final void OooO0O0(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    m54207b69.F54207b69_00(3746, arrayOfObject);
  }
  
  public final void OooO0OO(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    m54207b69.F54207b69_00(3747, arrayOfObject);
  }
  
  public final void OooO0Oo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3748, arrayOfObject);
  }
  
  public final void OooO0o0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3749, arrayOfObject);
  }
  
  public Bitmap getSnapshot()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Bitmap)m54207b69.F54207b69_09(3750, arrayOfObject);
  }
  
  public boolean getTouched()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(3751, arrayOfObject);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(3752, arrayOfObject);
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt4);
    arrayOfObject[4] = localInteger;
    m54207b69.F54207b69_00(3753, arrayOfObject);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = 1;
    if (i != 0)
    {
      if (i != j)
      {
        int k = 2;
        if (i == k)
        {
          this.o00OooO = j;
          OooO0OO(paramMotionEvent);
        }
      }
      else
      {
        OooO0Oo();
      }
    }
    else {
      OooO0O0(paramMotionEvent);
    }
    invalidate();
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.SignatureView
 * JD-Core Version:    0.7.0.1
 */