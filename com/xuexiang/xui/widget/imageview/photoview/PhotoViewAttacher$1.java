package com.xuexiang.xui.widget.imageview.photoview;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import m54207b69;

class PhotoViewAttacher$1
  extends GestureDetector.SimpleOnGestureListener
{
  public PhotoViewAttacher$1(PhotoViewAttacher paramPhotoViewAttacher) {}
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent1;
    arrayOfObject[2] = paramMotionEvent2;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[3] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[4] = localFloat;
    return m54207b69.F54207b69_01(4104, arrayOfObject);
  }
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    m54207b69.F54207b69_00(4105, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher.1
 * JD-Core Version:    0.7.0.1
 */