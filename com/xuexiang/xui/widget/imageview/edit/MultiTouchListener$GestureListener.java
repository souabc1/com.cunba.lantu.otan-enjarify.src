package com.xuexiang.xui.widget.imageview.edit;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import m54207b69;

final class MultiTouchListener$GestureListener
  extends GestureDetector.SimpleOnGestureListener
{
  public MultiTouchListener$GestureListener(MultiTouchListener paramMultiTouchListener) {}
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    m54207b69.F54207b69_00(3921, arrayOfObject);
  }
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(3922, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.edit.MultiTouchListener.GestureListener
 * JD-Core Version:    0.7.0.1
 */