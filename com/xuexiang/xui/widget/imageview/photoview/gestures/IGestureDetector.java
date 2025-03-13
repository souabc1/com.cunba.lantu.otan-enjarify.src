package com.xuexiang.xui.widget.imageview.photoview.gestures;

import android.view.MotionEvent;

public abstract interface IGestureDetector
{
  public abstract boolean OooO00o(MotionEvent paramMotionEvent);
  
  public abstract boolean isDragging();
  
  public abstract boolean isScaling();
  
  public abstract void setOnGestureListener(OnGestureListener paramOnGestureListener);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.photoview.gestures.IGestureDetector
 * JD-Core Version:    0.7.0.1
 */