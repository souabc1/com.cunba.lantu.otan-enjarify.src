package com.qinggan.media;

import android.graphics.Bitmap.CompressFormat;
import m54207b69;

public class ImageCache$ImageCacheParams
{
  public Bitmap.CompressFormat OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  
  public void setMemCacheSizePercent(float paramFloat)
  {
    float f = 0.05F;
    boolean bool = paramFloat < f;
    if (!bool)
    {
      f = 0.8F;
      bool = paramFloat < f;
      if (!bool)
      {
        int i = Math.round((float)Runtime.getRuntime().maxMemory() * paramFloat / 1024.0F);
        this.OooO0OO = i;
        return;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("bY2A3D2F174039203F423A46153C304A184C3C4C4F4B428F8B914256465659554C99554E4D519E6163A16466585A696A66A99AA99CA0AE6E6E75B2A3B29DB6AF6F777B776F6E757583B8");
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.media.ImageCache.ImageCacheParams
 * JD-Core Version:    0.7.0.1
 */