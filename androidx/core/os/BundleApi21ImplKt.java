package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.jvm.internal.Intrinsics;

final class BundleApi21ImplKt
{
  public static final BundleApi21ImplKt OooO00o;
  
  static
  {
    BundleApi21ImplKt localBundleApi21ImplKt = new androidx/core/os/BundleApi21ImplKt;
    localBundleApi21ImplKt.<init>();
    OooO00o = localBundleApi21ImplKt;
  }
  
  public static final void OooO00o(Bundle paramBundle, String paramString, Size paramSize)
  {
    Intrinsics.OooO0o(paramBundle, "bundle");
    Intrinsics.OooO0o(paramString, "key");
    paramBundle.putSize(paramString, paramSize);
  }
  
  public static final void OooO0O0(Bundle paramBundle, String paramString, SizeF paramSizeF)
  {
    Intrinsics.OooO0o(paramBundle, "bundle");
    Intrinsics.OooO0o(paramString, "key");
    paramBundle.putSizeF(paramString, paramSizeF);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.BundleApi21ImplKt
 * JD-Core Version:    0.7.0.1
 */