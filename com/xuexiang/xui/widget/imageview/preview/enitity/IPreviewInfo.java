package com.xuexiang.xui.widget.imageview.preview.enitity;

import android.graphics.Rect;
import android.os.Parcelable;

public abstract interface IPreviewInfo
  extends Parcelable
{
  public abstract Rect getBounds();
  
  public abstract String getUrl();
  
  public abstract String getVideoUrl();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo
 * JD-Core Version:    0.7.0.1
 */