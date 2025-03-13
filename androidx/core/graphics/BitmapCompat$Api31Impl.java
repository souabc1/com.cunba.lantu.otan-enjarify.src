package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.hardware.HardwareBuffer;

class BitmapCompat$Api31Impl
{
  public static Bitmap.Config OooO00o(Bitmap paramBitmap)
  {
    paramBitmap = paramBitmap.getHardwareBuffer();
    int i = paramBitmap.getFormat();
    int j = 22;
    if (i == j) {
      return Bitmap.Config.RGBA_F16;
    }
    return Bitmap.Config.ARGB_8888;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.BitmapCompat.Api31Impl
 * JD-Core Version:    0.7.0.1
 */