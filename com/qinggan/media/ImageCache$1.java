package com.qinggan.media;

import android.graphics.Bitmap;
import android.util.LruCache;

class ImageCache$1
  extends LruCache
{
  public int OooO00o(String paramString, Bitmap paramBitmap)
  {
    int i = ImageCache.OooO0o(paramBitmap) / 1024;
    if (i == 0) {
      i = 1;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.media.ImageCache.1
 * JD-Core Version:    0.7.0.1
 */