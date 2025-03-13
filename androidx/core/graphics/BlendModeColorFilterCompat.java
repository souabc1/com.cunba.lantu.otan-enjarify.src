package androidx.core.graphics;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;

public class BlendModeColorFilterCompat
{
  public static ColorFilter OooO00o(int paramInt, BlendModeCompat paramBlendModeCompat)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    Object localObject = null;
    if (i >= j)
    {
      paramBlendModeCompat = BlendModeUtils.Api29Impl.OooO00o(paramBlendModeCompat);
      if (paramBlendModeCompat != null) {
        localObject = BlendModeColorFilterCompat.Api29Impl.OooO00o(paramInt, paramBlendModeCompat);
      }
      return localObject;
    }
    paramBlendModeCompat = BlendModeUtils.OooO00o(paramBlendModeCompat);
    if (paramBlendModeCompat != null)
    {
      localObject = new android/graphics/PorterDuffColorFilter;
      ((PorterDuffColorFilter)localObject).<init>(paramInt, paramBlendModeCompat);
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.BlendModeColorFilterCompat
 * JD-Core Version:    0.7.0.1
 */