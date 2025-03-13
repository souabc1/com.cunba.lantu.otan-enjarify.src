package com.xuexiang.xui.widget.imageview.photoview;

import m54207b69;

class PhotoViewAttacher$AnimatedZoomRunnable
  implements Runnable
{
  public final float o00OoOoo;
  public final long o00Ooo0;
  public final float o00Ooo00;
  public final float o00Ooo0O;
  public final float o00Ooo0o;
  
  public PhotoViewAttacher$AnimatedZoomRunnable(PhotoViewAttacher paramPhotoViewAttacher, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.o00OoOoo = paramFloat3;
    this.o00Ooo00 = paramFloat4;
    long l = System.currentTimeMillis();
    this.o00Ooo0 = l;
    this.o00Ooo0O = paramFloat1;
    this.o00Ooo0o = paramFloat2;
  }
  
  public final float OooO00o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(4106, arrayOfObject);
  }
  
  public void run()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(4107, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher.AnimatedZoomRunnable
 * JD-Core Version:    0.7.0.1
 */