package androidx.window.layout;

import android.app.Activity;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarInterface.SidecarCallback;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class SidecarCompat$TranslatingCallback
  implements SidecarInterface.SidecarCallback
{
  public SidecarCompat$TranslatingCallback(SidecarCompat paramSidecarCompat) {}
  
  public void onDeviceStateChanged(SidecarDeviceState paramSidecarDeviceState)
  {
    Intrinsics.OooO0o(paramSidecarDeviceState, "newDeviceState");
    Object localObject1 = SidecarCompat.OooO0o0(this.OooO00o).values();
    SidecarCompat localSidecarCompat = this.OooO00o;
    localObject1 = ((Iterable)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      Activity localActivity = (Activity)((Iterator)localObject1).next();
      Object localObject2 = SidecarCompat.OooO0o.OooO00o(localActivity);
      Object localObject3 = null;
      Object localObject4;
      if (localObject2 != null)
      {
        localObject4 = localSidecarCompat.getSidecar();
        if (localObject4 != null)
        {
          localObject2 = ((SidecarInterface)localObject4).getWindowLayoutInfo((IBinder)localObject2);
          localObject3 = localObject2;
        }
      }
      localObject2 = SidecarCompat.OooO0OO(localSidecarCompat);
      if (localObject2 != null)
      {
        localObject4 = SidecarCompat.OooO0Oo(localSidecarCompat);
        localObject3 = ((SidecarAdapter)localObject4).OooO0o0((SidecarWindowLayoutInfo)localObject3, paramSidecarDeviceState);
        ((ExtensionInterfaceCompat.ExtensionCallbackInterface)localObject2).OooO00o(localActivity, (WindowLayoutInfo)localObject3);
      }
    }
  }
  
  public void onWindowLayoutChanged(IBinder paramIBinder, SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo)
  {
    Intrinsics.OooO0o(paramIBinder, "windowToken");
    Intrinsics.OooO0o(paramSidecarWindowLayoutInfo, "newLayout");
    Object localObject1 = SidecarCompat.OooO0o0(this.OooO00o);
    paramIBinder = (Activity)((Map)localObject1).get(paramIBinder);
    if (paramIBinder == null) {
      return;
    }
    localObject1 = SidecarCompat.OooO0Oo(this.OooO00o);
    Object localObject2 = this.OooO00o.getSidecar();
    if (localObject2 == null) {
      localObject2 = null;
    } else {
      localObject2 = ((SidecarInterface)localObject2).getDeviceState();
    }
    if (localObject2 == null)
    {
      localObject2 = new androidx/window/sidecar/SidecarDeviceState;
      ((SidecarDeviceState)localObject2).<init>();
    }
    paramSidecarWindowLayoutInfo = ((SidecarAdapter)localObject1).OooO0o0(paramSidecarWindowLayoutInfo, (SidecarDeviceState)localObject2);
    localObject1 = SidecarCompat.OooO0OO(this.OooO00o);
    if (localObject1 != null) {
      ((ExtensionInterfaceCompat.ExtensionCallbackInterface)localObject1).OooO00o(paramIBinder, paramSidecarWindowLayoutInfo);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.SidecarCompat.TranslatingCallback
 * JD-Core Version:    0.7.0.1
 */