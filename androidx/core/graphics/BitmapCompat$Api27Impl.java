package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace.Named;
import android.os.Build.VERSION;

class BitmapCompat$Api27Impl
{
  public static Bitmap OooO00o(Bitmap paramBitmap)
  {
    Bitmap.Config localConfig1 = paramBitmap.getConfig();
    Bitmap.Config localConfig2 = Bitmap.Config.HARDWARE;
    if (localConfig1 == localConfig2)
    {
      localConfig1 = Bitmap.Config.ARGB_8888;
      int i = Build.VERSION.SDK_INT;
      int j = 31;
      if (i >= j) {
        localConfig1 = BitmapCompat.Api31Impl.OooO00o(paramBitmap);
      }
      i = 1;
      paramBitmap = paramBitmap.copy(localConfig1, i);
    }
    return paramBitmap;
  }
  
  public static Bitmap OooO0O0(int paramInt1, int paramInt2, Bitmap paramBitmap, boolean paramBoolean)
  {
    Bitmap.Config localConfig = paramBitmap.getConfig();
    Object localObject1 = paramBitmap.getColorSpace();
    Object localObject2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
    if (paramBoolean)
    {
      localObject3 = paramBitmap.getColorSpace();
      paramBoolean = ((ColorSpace)localObject3).equals(localObject2);
      if (!paramBoolean)
      {
        localConfig = Bitmap.Config.RGBA_F16;
        localObject1 = localObject2;
        break label97;
      }
    }
    Object localObject3 = paramBitmap.getConfig();
    localObject2 = Bitmap.Config.HARDWARE;
    if (localObject3 == localObject2)
    {
      localConfig = Bitmap.Config.ARGB_8888;
      paramBoolean = Build.VERSION.SDK_INT;
      boolean bool1 = true;
      if (paramBoolean >= bool1) {
        localConfig = BitmapCompat.Api31Impl.OooO00o(paramBitmap);
      }
    }
    label97:
    boolean bool2 = paramBitmap.hasAlpha();
    return Bitmap.createBitmap(paramInt1, paramInt2, localConfig, bool2, (ColorSpace)localObject1);
  }
  
  public static boolean OooO0OO(Bitmap paramBitmap)
  {
    ColorSpace localColorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
    Bitmap.Config localConfig1 = paramBitmap.getConfig();
    Bitmap.Config localConfig2 = Bitmap.Config.RGBA_F16;
    if (localConfig1 == localConfig2)
    {
      paramBitmap = paramBitmap.getColorSpace();
      bool = paramBitmap.equals(localColorSpace);
      if (bool)
      {
        bool = true;
        break label49;
      }
    }
    boolean bool = false;
    paramBitmap = null;
    label49:
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.BitmapCompat.Api27Impl
 * JD-Core Version:    0.7.0.1
 */