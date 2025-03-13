package com.xuexiang.xui.widget.imageview.photoview;

import android.content.Context;
import com.xuexiang.xui.widget.imageview.photoview.scrollerproxy.ScrollerProxy;
import m54207b69;

class PhotoViewAttacher$FlingRunnable
  implements Runnable
{
  public final ScrollerProxy o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  
  public PhotoViewAttacher$FlingRunnable(PhotoViewAttacher paramPhotoViewAttacher, Context paramContext)
  {
    paramPhotoViewAttacher = ScrollerProxy.OooO0Oo(paramContext);
    this.o00OoOoo = paramPhotoViewAttacher;
  }
  
  public void OooO00o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(4108, arrayOfObject);
  }
  
  public void OooO0O0(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
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
    m54207b69.F54207b69_00(4109, arrayOfObject);
  }
  
  public void run()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(4110, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.photoview.PhotoViewAttacher.FlingRunnable
 * JD-Core Version:    0.7.0.1
 */