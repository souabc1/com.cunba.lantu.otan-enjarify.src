package com.xuexiang.xui.widget.slideback.widget;

import android.view.MotionEvent;
import android.widget.FrameLayout;
import m54207b69;

public class SlideBackInterceptLayout
  extends FrameLayout
{
  public float o00OoOoo;
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(5576, arrayOfObject);
  }
  
  public void setSideSlideLength(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(5577, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.slideback.widget.SlideBackInterceptLayout
 * JD-Core Version:    0.7.0.1
 */