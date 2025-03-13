package com.xuexiang.xui.widget.imageview.photoview;

import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import m54207b69;

public class DefaultOnDoubleTapListener
  implements GestureDetector.OnDoubleTapListener
{
  public PhotoViewAttacher OooO00o;
  
  public DefaultOnDoubleTapListener(PhotoViewAttacher paramPhotoViewAttacher)
  {
    setPhotoViewAttacher(paramPhotoViewAttacher);
  }
  
  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(4065, arrayOfObject);
  }
  
  public boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(4066, arrayOfObject);
  }
  
  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(4067, arrayOfObject);
  }
  
  public void setPhotoViewAttacher(PhotoViewAttacher paramPhotoViewAttacher)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramPhotoViewAttacher;
    m54207b69.F54207b69_00(4068, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.photoview.DefaultOnDoubleTapListener
 * JD-Core Version:    0.7.0.1
 */