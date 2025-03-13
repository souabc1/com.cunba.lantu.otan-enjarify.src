package com.qinggan.provider;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import m54207b69;

public class MediaScannerConnection
  implements ServiceConnection
{
  public MediaScannerConnection.MediaScannerConnectionClient OooO00o;
  public boolean OooO0O0;
  public Context OooO0OO;
  public final IMediaScannerListener.Stub OooO0Oo;
  public IMediaScannerService OooO0o0;
  
  public void OooO0O0()
  {
    label21:
    try
    {
      bool = this.OooO0O0;
      if (!bool) {}
    }
    finally {}
    try
    {
      localContext = this.OooO0OO;
      localContext.unbindService(this);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label21;
    }
    boolean bool = false;
    Context localContext = null;
    this.OooO0O0 = false;
  }
  
  public void OooO0OO(String paramString1, String paramString2)
  {
    IMediaScannerService localIMediaScannerService;
    IMediaScannerListener.Stub localStub;
    label38:
    try
    {
      localIMediaScannerService = this.OooO0o0;
      if (localIMediaScannerService != null)
      {
        boolean bool = this.OooO0O0;
        if (!bool) {}
      }
    }
    finally {}
    try
    {
      localStub = this.OooO0Oo;
      localIMediaScannerService.o00OO0oo(paramString1, paramString2, localStub);
    }
    catch (RemoteException localRemoteException)
    {
      break label38;
    }
    return;
    paramString1 = new java/lang/IllegalStateException;
    paramString2 = "aX36382E7B3F3C3C3D4544364848853A4688264F4F454E2152514F505846285B494E525D60";
    paramString2 = m54207b69.F54207b69_11(paramString2);
    paramString1.<init>(paramString2);
    throw paramString1;
  }
  
  public boolean isConnected()
  {
    try
    {
      IMediaScannerService localIMediaScannerService = this.OooO0o0;
      if (localIMediaScannerService != null)
      {
        bool = this.OooO0O0;
        if (bool)
        {
          bool = true;
          break label29;
        }
      }
      boolean bool = false;
      localIMediaScannerService = null;
      label29:
      return bool;
    }
    finally {}
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    try
    {
      paramComponentName = IMediaScannerService.Stub.o0Oo0o0O(paramIBinder);
      this.OooO0o0 = paramComponentName;
      if (paramComponentName != null)
      {
        paramComponentName = this.OooO00o;
        if (paramComponentName != null) {
          paramComponentName.OooO0O0();
        }
      }
      return;
    }
    finally {}
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = null;
    try
    {
      this.OooO0o0 = null;
      return;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.provider.MediaScannerConnection
 * JD-Core Version:    0.7.0.1
 */