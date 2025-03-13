package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

class PointerIconCompat$Api24Impl
{
  public static PointerIcon OooO00o(Bitmap paramBitmap, float paramFloat1, float paramFloat2)
  {
    return PointerIcon.create(paramBitmap, paramFloat1, paramFloat2);
  }
  
  public static PointerIcon OooO0O0(Context paramContext, int paramInt)
  {
    return PointerIcon.getSystemIcon(paramContext, paramInt);
  }
  
  public static PointerIcon OooO0OO(Resources paramResources, int paramInt)
  {
    return PointerIcon.load(paramResources, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.PointerIconCompat.Api24Impl
 * JD-Core Version:    0.7.0.1
 */