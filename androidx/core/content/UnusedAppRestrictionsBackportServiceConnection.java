package androidx.core.content;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub;

class UnusedAppRestrictionsBackportServiceConnection
  implements ServiceConnection
{
  public IUnusedAppRestrictionsBackportService OooO00o;
  public ResolvableFuture OooO0O0;
  
  private IUnusedAppRestrictionsBackportCallback getBackportCallback()
  {
    UnusedAppRestrictionsBackportServiceConnection.1 local1 = new androidx/core/content/UnusedAppRestrictionsBackportServiceConnection$1;
    local1.<init>(this);
    return local1;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = IUnusedAppRestrictionsBackportService.Stub.o0Oo0o0O(paramIBinder);
    this.OooO00o = paramComponentName;
    try
    {
      paramIBinder = getBackportCallback();
      paramComponentName.o00OO0O(paramIBinder);
    }
    catch (RemoteException localRemoteException)
    {
      paramComponentName = this.OooO0O0;
      paramIBinder = Integer.valueOf(0);
      paramComponentName.OooOOOO(paramIBinder);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.OooO00o = null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.UnusedAppRestrictionsBackportServiceConnection
 * JD-Core Version:    0.7.0.1
 */