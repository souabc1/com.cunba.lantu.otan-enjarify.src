package com.xuexiang.xui.widget.imageview.nine;

import android.content.Context;
import android.widget.ImageView;
import java.util.List;
import m54207b69;

public abstract class NineGridImageViewAdapter
{
  public ImageView OooO00o(Context paramContext)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    return (ImageView)m54207b69.F54207b69_09(4057, arrayOfObject);
  }
  
  public abstract void OooO0O0(Context paramContext, ImageView paramImageView, Object paramObject);
  
  public void OooO0OO(ImageView paramImageView, int paramInt, List paramList)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramImageView;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    arrayOfObject[3] = paramList;
    m54207b69.F54207b69_00(4058, arrayOfObject);
  }
  
  public boolean OooO0Oo(ImageView paramImageView, int paramInt, List paramList)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramImageView;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    arrayOfObject[3] = paramList;
    return m54207b69.F54207b69_01(4059, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.nine.NineGridImageViewAdapter
 * JD-Core Version:    0.7.0.1
 */