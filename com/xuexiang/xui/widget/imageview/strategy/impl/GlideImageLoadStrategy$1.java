package com.xuexiang.xui.widget.imageview.strategy.impl;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import m54207b69;

class GlideImageLoadStrategy$1
  implements RequestListener
{
  public boolean OooO00o(Drawable paramDrawable, Object paramObject, Target paramTarget, DataSource paramDataSource, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    arrayOfObject[2] = paramObject;
    arrayOfObject[3] = paramTarget;
    arrayOfObject[4] = paramDataSource;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[5] = localBoolean;
    return m54207b69.F54207b69_01(4326, arrayOfObject);
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
    return m54207b69.F54207b69_01(4327, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.strategy.impl.GlideImageLoadStrategy.1
 * JD-Core Version:    0.7.0.1
 */