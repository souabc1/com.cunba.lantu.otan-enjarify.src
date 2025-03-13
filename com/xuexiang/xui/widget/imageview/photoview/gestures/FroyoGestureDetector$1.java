package com.xuexiang.xui.widget.imageview.photoview.gestures;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import m54207b69;

class FroyoGestureDetector$1
  implements ScaleGestureDetector.OnScaleGestureListener
{
  public FroyoGestureDetector$1(FroyoGestureDetector paramFroyoGestureDetector) {}
  
  public boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramScaleGestureDetector;
    return m54207b69.F54207b69_01(4183, arrayOfObject);
  }
  
  public boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramScaleGestureDetector;
    return m54207b69.F54207b69_01(4184, arrayOfObject);
  }
  
  public void onScaleEnd(ScaleGestureDetector paramScaleGestureDetector)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramScaleGestureDetector;
    m54207b69.F54207b69_00(4185, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.photoview.gestures.FroyoGestureDetector.1
 * JD-Core Version:    0.7.0.1
 */