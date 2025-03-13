package androidx.core.util;

import android.util.SizeF;

final class SizeFCompat$Api21Impl
{
  public static SizeF OooO00o(SizeFCompat paramSizeFCompat)
  {
    Preconditions.OooO0oo(paramSizeFCompat);
    SizeF localSizeF = new android/util/SizeF;
    float f1 = paramSizeFCompat.getWidth();
    float f2 = paramSizeFCompat.getHeight();
    localSizeF.<init>(f1, f2);
    return localSizeF;
  }
  
  public static SizeFCompat OooO0O0(SizeF paramSizeF)
  {
    Preconditions.OooO0oo(paramSizeF);
    SizeFCompat localSizeFCompat = new androidx/core/util/SizeFCompat;
    float f1 = paramSizeF.getWidth();
    float f2 = paramSizeF.getHeight();
    localSizeFCompat.<init>(f1, f2);
    return localSizeFCompat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.util.SizeFCompat.Api21Impl
 * JD-Core Version:    0.7.0.1
 */