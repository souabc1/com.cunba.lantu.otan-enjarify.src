package com.qinggan.dvr;

import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.os.ServiceManager;
import m54207b69;

public class DvrManager
{
  public static DvrManager OooO0o;
  public Runnable OooO00o;
  public DvrManager.DvrListener OooO0O0 = null;
  public IDvrService OooO0OO = null;
  public Handler OooO0Oo;
  public IDvrListener OooO0o0;
  
  private DvrManager()
  {
    Object localObject = new android/os/Handler;
    ((Handler)localObject).<init>();
    this.OooO0Oo = ((Handler)localObject);
    localObject = new com/qinggan/dvr/DvrManager$1;
    ((DvrManager.1)localObject).<init>(this);
    this.OooO00o = ((Runnable)localObject);
    localObject = new com/qinggan/dvr/DvrManager$2;
    ((DvrManager.2)localObject).<init>(this);
    this.OooO0o0 = ((IDvrListener)localObject);
    OooO0oO();
  }
  
  public static DvrManager getInstance()
  {
    DvrManager localDvrManager = DvrManager.class;
    try
    {
      localDvrManager = OooO0o;
      if (localDvrManager == null)
      {
        localDvrManager = new com/qinggan/dvr/DvrManager;
        localDvrManager.<init>();
        OooO0o = localDvrManager;
      }
      localDvrManager = OooO0o;
      return localDvrManager;
    }
    finally {}
  }
  
  public final void OooO0oO()
  {
    Object localObject1 = ServiceManager.getService(m54207b69.F54207b69_11("v95D504D694E615156586366"));
    String str;
    if (localObject1 != null)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = m54207b69.F54207b69_11("F$424C534D440946595E84614C625F5B5651153017");
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(localObject1);
      localObject2 = IDvrService.Stub.o0Oo0o0O((IBinder)localObject1);
      this.OooO0OO = ((IDvrService)localObject2);
      OooO0oo();
    }
    try
    {
      localObject2 = this.OooO0o0;
      int i = 6;
      ((IDvrListener)localObject2).OooO0O0(i);
      localObject2 = new com/qinggan/dvr/DvrManager$3;
      ((DvrManager.3)localObject2).<init>(this);
      i = 0;
      str = null;
      ((IBinder)localObject1).linkToDeath((IBinder.DeathRecipient)localObject2, 0);
    }
    catch (RemoteException localRemoteException)
    {
      long l;
      break label118;
    }
    localObject1 = this.OooO0Oo;
    Object localObject2 = this.OooO00o;
    l = 200L;
    ((Handler)localObject1).postDelayed((Runnable)localObject2, l);
    label118:
  }
  
  public final void OooO0oo()
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null)
      {
        IDvrListener localIDvrListener = this.OooO0o0;
        localIDvrService.o00OoO00(localIDvrListener);
      }
      label21:
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label21;
    }
  }
  
  public boolean getAudioMuteState()
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        return localIDvrService.getAudioMuteState();
      }
    }
    catch (RemoteException localRemoteException) {}
    return false;
  }
  
  public int getGSensorSensitivity(int paramInt)
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        return localIDvrService.getGSensorSensitivity(paramInt);
      }
    }
    catch (Exception localException) {}
    return -1;
  }
  
  public int getLoopRecordDuration()
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        return localIDvrService.getLoopRecordDuration();
      }
    }
    catch (RemoteException localRemoteException) {}
    return -1;
  }
  
  public boolean getLoopRecordState()
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        return localIDvrService.getLoopRecordState();
      }
    }
    catch (RemoteException localRemoteException) {}
    return false;
  }
  
  public long[] getUdiskInfo()
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        return localIDvrService.getUdiskSize();
      }
    }
    catch (RemoteException localRemoteException) {}
    return null;
  }
  
  public boolean getUdiskStorageState()
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        return localIDvrService.getUdiskStorageState();
      }
    }
    catch (Exception localException) {}
    return false;
  }
  
  public boolean getUrgentDmsRecordState()
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        return localIDvrService.getUrgentDmsRecordState();
      }
    }
    catch (RemoteException localRemoteException) {}
    return false;
  }
  
  public boolean getUrgentRecordState()
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        return localIDvrService.getUrgentRecordState();
      }
    }
    catch (RemoteException localRemoteException) {}
    return false;
  }
  
  public void setAudioMuteState(boolean paramBoolean)
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        localIDvrService.setAudioMuteState(paramBoolean);
      }
      label16:
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label16;
    }
  }
  
  public void setDvrListener(DvrManager.DvrListener paramDvrListener)
  {
    DvrManager.DvrListener localDvrListener = this.OooO0O0;
    if (localDvrListener != paramDvrListener) {
      this.OooO0O0 = paramDvrListener;
    }
  }
  
  public void setGSensorSensitivity(int paramInt1, int paramInt2)
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        localIDvrService.setGSensorSensitivity(paramInt1, paramInt2);
      }
      label17:
      return;
    }
    catch (Exception localException)
    {
      break label17;
    }
  }
  
  public void setLoopRecordDuration(int paramInt)
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        localIDvrService.setLoopRecordDuration(paramInt);
      }
      label16:
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label16;
    }
  }
  
  public void setLoopRecordState(boolean paramBoolean)
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        localIDvrService.setLoopRecordState(paramBoolean);
      }
      label16:
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label16;
    }
  }
  
  public void setUdiskStorageState(boolean paramBoolean)
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        localIDvrService.setUdiskStorageState(paramBoolean);
      }
      label16:
      return;
    }
    catch (Exception localException)
    {
      break label16;
    }
  }
  
  public void setUrgentDmsRecordState(boolean paramBoolean)
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        localIDvrService.setUrgentDmsRecordState(paramBoolean);
      }
      label16:
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label16;
    }
  }
  
  public void setUrgentRecordState(boolean paramBoolean)
  {
    try
    {
      IDvrService localIDvrService = this.OooO0OO;
      if (localIDvrService != null) {
        localIDvrService.setUrgentRecordState(paramBoolean);
      }
      label16:
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label16;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.dvr.DvrManager
 * JD-Core Version:    0.7.0.1
 */