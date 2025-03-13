package androidx.window.layout;

import android.content.Context;
import androidx.window.core.Version;
import androidx.window.core.Version.Companion;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class SidecarWindowBackend$Companion
{
  public final SidecarWindowBackend OooO00o(Context paramContext)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Object localObject1 = SidecarWindowBackend.OooO0OO();
    if (localObject1 == null)
    {
      localObject1 = SidecarWindowBackend.OooO0Oo();
      ((Lock)localObject1).lock();
      try
      {
        Object localObject2 = SidecarWindowBackend.OooO0OO();
        if (localObject2 == null)
        {
          localObject2 = SidecarWindowBackend.OooO0OO;
          paramContext = ((Companion)localObject2).OooO0O0(paramContext);
          localObject2 = new androidx/window/layout/SidecarWindowBackend;
          ((SidecarWindowBackend)localObject2).<init>(paramContext);
          SidecarWindowBackend.OooO0o0((SidecarWindowBackend)localObject2);
        }
        paramContext = Unit.OooO00o;
      }
      finally
      {
        ((Lock)localObject1).unlock();
      }
    }
    paramContext = SidecarWindowBackend.OooO0OO();
    Intrinsics.OooO0OO(paramContext);
    return paramContext;
  }
  
  public final ExtensionInterfaceCompat OooO0O0(Context paramContext)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Object localObject1 = null;
    try
    {
      Object localObject2 = SidecarCompat.OooO0o;
      localObject2 = ((SidecarCompat.Companion)localObject2).getSidecarVersion();
      boolean bool1 = OooO0OO((Version)localObject2);
      if (bool1)
      {
        localObject2 = new androidx/window/layout/SidecarCompat;
        ((SidecarCompat)localObject2).<init>(paramContext);
        boolean bool2 = ((SidecarCompat)localObject2).OooOO0();
        if (bool2) {
          localObject1 = localObject2;
        }
      }
    }
    finally
    {
      label54:
      break label54;
    }
    return localObject1;
  }
  
  public final boolean OooO0OO(Version paramVersion)
  {
    boolean bool = false;
    if (paramVersion == null) {
      return false;
    }
    Version localVersion = Version.o00OooO0.getVERSION_0_1();
    int i = paramVersion.OooO0o(localVersion);
    if (i >= 0) {
      bool = true;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.SidecarWindowBackend.Companion
 * JD-Core Version:    0.7.0.1
 */