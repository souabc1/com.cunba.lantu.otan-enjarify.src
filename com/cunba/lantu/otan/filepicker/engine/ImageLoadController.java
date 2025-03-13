package com.cunba.lantu.otan.filepicker.engine;

import android.content.Context;
import android.widget.ImageView;
import kotlin.Lazy;
import kotlin.LazyKt;
import m54207b69;

public final class ImageLoadController
{
  public static final ImageLoadController OooO00o;
  public static final Lazy OooO0O0 = LazyKt.OooO0O0(ImageLoadController.enableGlide.2.o00OoOoo);
  public static final Lazy OooO0OO = LazyKt.OooO0O0(ImageLoadController.enablePicasso.2.o00OoOoo);
  public static ImageEngine OooO0Oo;
  
  static
  {
    ImageLoadController localImageLoadController = new com/cunba/lantu/otan/filepicker/engine/ImageLoadController;
    localImageLoadController.<init>();
    OooO00o = localImageLoadController;
  }
  
  private final boolean getEnableGlide()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(303, arrayOfObject);
  }
  
  private final boolean getEnablePicasso()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(304, arrayOfObject);
  }
  
  public final boolean OooO00o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(300, arrayOfObject);
  }
  
  public final void OooO0O0(Context paramContext, ImageView paramImageView, String paramString, Integer paramInteger)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    arrayOfObject[2] = paramImageView;
    arrayOfObject[3] = paramString;
    arrayOfObject[4] = paramInteger;
    m54207b69.F54207b69_00(301, arrayOfObject);
  }
  
  public final void OooO0OO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(302, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.filepicker.engine.ImageLoadController
 * JD-Core Version:    0.7.0.1
 */