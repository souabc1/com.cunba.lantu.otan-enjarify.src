package com.xuexiang.xui.widget.imageview.preview.loader;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import m54207b69;

class GlideMediaLoader$2
  implements RequestListener
{
  public GlideMediaLoader$2(GlideMediaLoader paramGlideMediaLoader, ISimpleTarget paramISimpleTarget) {}
  
  public boolean OooO00o(GifDrawable paramGifDrawable, Object paramObject, Target paramTarget, DataSource paramDataSource, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramGifDrawable;
    arrayOfObject[2] = paramObject;
    arrayOfObject[3] = paramTarget;
    arrayOfObject[4] = paramDataSource;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[5] = localBoolean;
    return m54207b69.F54207b69_01(4213, arrayOfObject);
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
    return m54207b69.F54207b69_01(4214, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.preview.loader.GlideMediaLoader.2
 * JD-Core Version:    0.7.0.1
 */