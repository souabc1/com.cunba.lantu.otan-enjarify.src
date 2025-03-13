package com.xuexiang.xui.widget.button;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import m54207b69;

class RippleView$2
  extends GestureDetector.SimpleOnGestureListener
{
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    m54207b69.F54207b69_00(2711, arrayOfObject);
  }
  
  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(2712, arrayOfObject);
  }
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(2713, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.button.RippleView.2
 * JD-Core Version:    0.7.0.1
 */