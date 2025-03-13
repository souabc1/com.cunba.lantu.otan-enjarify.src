package androidx.core.os;

import android.os.BaseBundle;
import android.os.PersistableBundle;
import kotlin.jvm.internal.Intrinsics;

final class PersistableBundleApi22ImplKt
{
  public static final PersistableBundleApi22ImplKt OooO00o;
  
  static
  {
    PersistableBundleApi22ImplKt localPersistableBundleApi22ImplKt = new androidx/core/os/PersistableBundleApi22ImplKt;
    localPersistableBundleApi22ImplKt.<init>();
    OooO00o = localPersistableBundleApi22ImplKt;
  }
  
  public static final void OooO00o(PersistableBundle paramPersistableBundle, String paramString, boolean paramBoolean)
  {
    Intrinsics.OooO0o(paramPersistableBundle, "persistableBundle");
    paramPersistableBundle.putBoolean(paramString, paramBoolean);
  }
  
  public static final void OooO0O0(PersistableBundle paramPersistableBundle, String paramString, boolean[] paramArrayOfBoolean)
  {
    Intrinsics.OooO0o(paramPersistableBundle, "persistableBundle");
    Intrinsics.OooO0o(paramArrayOfBoolean, "value");
    paramPersistableBundle.putBooleanArray(paramString, paramArrayOfBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.PersistableBundleApi22ImplKt
 * JD-Core Version:    0.7.0.1
 */