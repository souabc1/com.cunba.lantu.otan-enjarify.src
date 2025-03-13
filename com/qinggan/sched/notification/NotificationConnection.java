package com.qinggan.sched.notification;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import m54207b69;

public class NotificationConnection
  implements ServiceConnection
{
  public static HandlerThread OooO;
  public static NotificationConnection.MyHandler OooOO0;
  public NotificationConnection.connectionCallBack OooO00o;
  public boolean OooO0O0;
  public Context OooO0OO;
  public NotificationConstants.NotificationLevel OooO0Oo;
  public int OooO0o;
  public final INotifyCallBack.Stub OooO0o0;
  public INotificationCenterService OooO0oO;
  public int OooO0oo;
  
  static
  {
    Object localObject1 = new android/os/HandlerThread;
    Object localObject2 = m54207b69.F54207b69_11("cd2A0C121006120D0C18161515330E181F1127");
    ((HandlerThread)localObject1).<init>((String)localObject2);
    OooO = (HandlerThread)localObject1;
    OooOO0 = null;
    ((Thread)localObject1).start();
    localObject1 = new com/qinggan/sched/notification/NotificationConnection$MyHandler;
    localObject2 = OooO.getLooper();
    ((NotificationConnection.MyHandler)localObject1).<init>((Looper)localObject2);
    OooOO0 = (NotificationConnection.MyHandler)localObject1;
  }
  
  public void OooO0O0(int paramInt)
  {
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = "=8556C5F4D525661640A";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = this.OooO0oO;
      ((StringBuilder)localObject1).append(localObject2);
      localObject2 = "ih44062D0A0A0B13122416165D";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      ((StringBuilder)localObject1).append((String)localObject2);
      boolean bool = this.OooO0O0;
      ((StringBuilder)localObject1).append(bool);
      localObject1 = this.OooO0oO;
      if (localObject1 != null)
      {
        bool = this.OooO0O0;
        if (bool)
        {
          try
          {
            localObject2 = this.OooO0OO;
            localObject2 = ((Context)localObject2).getPackageName();
            int i = this.OooO0o;
            ((INotificationCenterService)localObject1).oo0ooO((String)localObject2, paramInt, i);
          }
          catch (RemoteException localRemoteException)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject2 = "gd0A0C121006222D12111D120C1C0E52102C1813272422212176";
            localObject2 = m54207b69.F54207b69_11((String)localObject2);
            ((StringBuilder)localObject1).append((String)localObject2);
            localObject3 = localRemoteException.getMessage();
            ((StringBuilder)localObject1).append((String)localObject3);
          }
          return;
        }
      }
      Object localObject3 = new java/lang/IllegalStateException;
      localObject1 = "Op1E20061C1A0E39262509262010225E2D2F1562263333342C2B1D2F2F6C213D6F5D362526353C3B5A3D472E2D3D49514432374B4649";
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      ((IllegalStateException)localObject3).<init>((String)localObject1);
      throw ((Throwable)localObject3);
    }
    finally {}
  }
  
  public void OooO0OO()
  {
    try
    {
      Object localObject1 = this.OooO0oO;
      if (localObject1 != null)
      {
        boolean bool = this.OooO0O0;
        if (bool)
        {
          try
          {
            localObject1 = this.OooO0Oo;
            int i;
            if (localObject1 != null) {
              i = ((Enum)localObject1).ordinal();
            } else {
              i = -1;
            }
            localObject4 = this.OooO0oO;
            localObject1 = this.OooO0OO;
            str = ((Context)localObject1).getPackageName();
            int j = this.OooO0oo;
            int k = this.OooO0o;
            INotifyCallBack.Stub localStub = this.OooO0o0;
            ((INotificationCenterService)localObject4).o000o00o(str, j, k, i, localStub);
          }
          catch (RemoteException localRemoteException)
          {
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            String str = "uX2A3E41342F314331233D3B484239864D494246505089";
            str = m54207b69.F54207b69_11(str);
            ((StringBuilder)localObject4).append(str);
            localObject2 = localRemoteException.getMessage();
            ((StringBuilder)localObject4).append((String)localObject2);
          }
          return;
        }
      }
      Object localObject2 = new java/lang/IllegalStateException;
      Object localObject4 = "\\86A5E61544F516351835D5B6862592665675D2A6E6B6B6C747365777734697537957E6D6E7D8483A2857F76758581998C7A7F838E91";
      localObject4 = m54207b69.F54207b69_11((String)localObject4);
      ((IllegalStateException)localObject2).<init>((String)localObject4);
      throw ((Throwable)localObject2);
    }
    finally {}
  }
  
  public boolean isConnected()
  {
    try
    {
      INotificationCenterService localINotificationCenterService = this.OooO0oO;
      if (localINotificationCenterService != null)
      {
        bool = this.OooO0O0;
        if (bool)
        {
          bool = true;
          break label29;
        }
      }
      boolean bool = false;
      localINotificationCenterService = null;
      label29:
      return bool;
    }
    finally {}
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    try
    {
      paramComponentName = INotificationCenterService.Stub.o0Oo0o0O(paramIBinder);
      this.OooO0oO = paramComponentName;
      if (paramComponentName != null)
      {
        paramComponentName = this.OooO00o;
        if (paramComponentName != null) {
          paramComponentName.OooO00o();
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
      this.OooO0oO = null;
      return;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.sched.notification.NotificationConnection
 * JD-Core Version:    0.7.0.1
 */