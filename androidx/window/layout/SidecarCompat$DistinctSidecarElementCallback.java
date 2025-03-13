package androidx.window.layout;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface.SidecarCallback;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

final class SidecarCompat$DistinctSidecarElementCallback
  implements SidecarInterface.SidecarCallback
{
  public final SidecarAdapter OooO00o;
  public final SidecarInterface.SidecarCallback OooO0O0;
  public final ReentrantLock OooO0OO;
  public SidecarDeviceState OooO0Oo;
  public final WeakHashMap OooO0o0;
  
  public SidecarCompat$DistinctSidecarElementCallback(SidecarAdapter paramSidecarAdapter, SidecarInterface.SidecarCallback paramSidecarCallback)
  {
    this.OooO00o = paramSidecarAdapter;
    this.OooO0O0 = paramSidecarCallback;
    paramSidecarAdapter = new java/util/concurrent/locks/ReentrantLock;
    paramSidecarAdapter.<init>();
    this.OooO0OO = paramSidecarAdapter;
    paramSidecarAdapter = new java/util/WeakHashMap;
    paramSidecarAdapter.<init>();
    this.OooO0o0 = paramSidecarAdapter;
  }
  
  public void onDeviceStateChanged(SidecarDeviceState paramSidecarDeviceState)
  {
    Intrinsics.OooO0o(paramSidecarDeviceState, "newDeviceState");
    ReentrantLock localReentrantLock = this.OooO0OO;
    localReentrantLock.lock();
    try
    {
      Object localObject = this.OooO00o;
      SidecarDeviceState localSidecarDeviceState = this.OooO0Oo;
      boolean bool = ((SidecarAdapter)localObject).OooO00o(localSidecarDeviceState, paramSidecarDeviceState);
      if (bool) {
        return;
      }
      this.OooO0Oo = paramSidecarDeviceState;
      localObject = this.OooO0O0;
      ((SidecarInterface.SidecarCallback)localObject).onDeviceStateChanged(paramSidecarDeviceState);
      paramSidecarDeviceState = Unit.OooO00o;
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public void onWindowLayoutChanged(IBinder paramIBinder, SidecarWindowLayoutInfo paramSidecarWindowLayoutInfo)
  {
    Intrinsics.OooO0o(paramIBinder, "token");
    Intrinsics.OooO0o(paramSidecarWindowLayoutInfo, "newLayout");
    synchronized (this.OooO0OO)
    {
      Object localObject = this.OooO0o0;
      localObject = ((WeakHashMap)localObject).get(paramIBinder);
      localObject = (SidecarWindowLayoutInfo)localObject;
      SidecarAdapter localSidecarAdapter = this.OooO00o;
      boolean bool = localSidecarAdapter.OooO0Oo((SidecarWindowLayoutInfo)localObject, paramSidecarWindowLayoutInfo);
      if (bool) {
        return;
      }
      localObject = this.OooO0o0;
      localObject = ((WeakHashMap)localObject).put(paramIBinder, paramSidecarWindowLayoutInfo);
      localObject = (SidecarWindowLayoutInfo)localObject;
      this.OooO0O0.onWindowLayoutChanged(paramIBinder, paramSidecarWindowLayoutInfo);
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.layout.SidecarCompat.DistinctSidecarElementCallback
 * JD-Core Version:    0.7.0.1
 */