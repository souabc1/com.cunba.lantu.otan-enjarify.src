package com.xuexiang.xui.widget.picker.wheelview.listener;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import m54207b69;

public final class LoopViewGestureListener
  extends GestureDetector.SimpleOnGestureListener
{
  public final WheelView OooO00o;
  
  public LoopViewGestureListener(WheelView paramWheelView)
  {
    this.OooO00o = paramWheelView;
  }
  
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent1;
    arrayOfObject[2] = paramMotionEvent2;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[3] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[4] = localFloat;
    return m54207b69.F54207b69_01(4832, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.picker.wheelview.listener.LoopViewGestureListener
 * JD-Core Version:    0.7.0.1
 */