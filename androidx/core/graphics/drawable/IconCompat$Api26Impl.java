package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

class IconCompat$Api26Impl
{
  public static Drawable OooO00o(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    AdaptiveIconDrawable localAdaptiveIconDrawable = new android/graphics/drawable/AdaptiveIconDrawable;
    localAdaptiveIconDrawable.<init>(paramDrawable1, paramDrawable2);
    return localAdaptiveIconDrawable;
  }
  
  public static Icon OooO0O0(Bitmap paramBitmap)
  {
    return Icon.createWithAdaptiveBitmap(paramBitmap);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.drawable.IconCompat.Api26Impl
 * JD-Core Version:    0.7.0.1
 */