package com.xuexiang.xui.widget.imageview.preview.loader;

import android.graphics.Bitmap;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import m54207b69;

class GlideMediaLoader$1
  implements RequestListener
{
  public GlideMediaLoader$1(GlideMediaLoader paramGlideMediaLoader, ISimpleTarget paramISimpleTarget) {}
  
  public boolean OooO00o(Bitmap paramBitmap, Object paramObject, Target paramTarget, DataSource paramDataSource, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBitmap;
    arrayOfObject[2] = paramObject;
    arrayOfObject[3] = paramTarget;
    arrayOfObject[4] = paramDataSource;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[5] = localBoolean;
    return m54207b69.F54207b69_01(4210, arrayOfObject);
  }
  
  public boolean onLoadFailed(GlideException paramGlideException, Object paramObject, Target paramTarget, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramGlideException;
    arrayOfObject[2] = paramObject;
    arrayOfObject[3] = paramTarget;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[4] = localBoolean;
    return m54207b69.F54207b69_01(4211, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.preview.loader.GlideMediaLoader.1
 * JD-Core Version:    0.7.0.1
 */