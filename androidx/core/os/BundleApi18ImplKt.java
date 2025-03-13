package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

final class BundleApi18ImplKt
{
  public static final BundleApi18ImplKt OooO00o;
  
  static
  {
    BundleApi18ImplKt localBundleApi18ImplKt = new androidx/core/os/BundleApi18ImplKt;
    localBundleApi18ImplKt.<init>();
    OooO00o = localBundleApi18ImplKt;
  }
  
  public static final void OooO00o(Bundle paramBundle, String paramString, IBinder paramIBinder)
  {
    Intrinsics.OooO0o(paramBundle, "bundle");
    Intrinsics.OooO0o(paramString, "key");
    paramBundle.putBinder(paramString, paramIBinder);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.BundleApi18ImplKt
 * JD-Core Version:    0.7.0.1
 */