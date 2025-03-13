package com.qinggan.ota;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.excelfore.hmiagent.DiagTaskInfo;
import com.excelfore.hmiagent.OtaInstallPolicy;
import com.excelfore.hmiagent.OtaInstallState;
import com.excelfore.hmiagent.OtaUpdateReq;
import com.excelfore.hmiagent.VehicleDiagState;
import com.qinggan.account.AccountUserManager;
import com.qinggan.common.OnInitListener;
import com.qinggan.util.Log;
import java.util.List;
import m54207b69;

public class OTAManager
{
  public static OTAManager OooO0oo;
  public ServiceConnection OooO00o;
  public Context OooO0O0;
  public boolean OooO0OO;
  public final List OooO0Oo;
  public IOTAService OooO0o;
  public IOTAServiceListener.Stub OooO0o0;
  public OnInitListener OooO0oO;
  
  public final void OooO()
  {
    Object localObject1 = m54207b69.F54207b69_11("i07F6573805563575E5D4B");
    Object localObject2 = m54207b69.F54207b69_11("Ym0F05050C263E32451028250F1A155353");
    Log.OooO00o((String)localObject1, (String)localObject2);
    localObject1 = new android/content/Intent;
    localObject2 = m54207b69.F54207b69_11("@m0E0302462009091112150D4E0E261A0F1C141E1D1C34592326321E1D1F6040584C414E46504F4E665A67526A67515C57");
    ((Intent)localObject1).<init>((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("{Y3A37367A2C353D4546414182423A46394C3C41434E51");
    ((Intent)localObject1).setPackage((String)localObject2);
    localObject2 = this.OooO0O0;
    if (localObject2 == null) {
      return;
    }
    ServiceConnection localServiceConnection = this.OooO00o;
    AccountUserManager.OooO0O0((Context)localObject2, (Intent)localObject1, localServiceConnection, 1);
  }
  
  public final void OooOO0()
  {
    Object localObject1 = this.OooO0o;
    if (localObject1 != null)
    {
      localObject1 = "i07F6573805563575E5D4B";
      try
      {
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        Object localObject2 = "ck190F0E051C2414202C4834431A262B11181F39152C34241C26325D5D";
        localObject2 = m54207b69.F54207b69_11((String)localObject2);
        Log.OooO00o((String)localObject1, (String)localObject2);
        localObject1 = this.OooO0o;
        localObject2 = this.OooO0o0;
        ((IOTAService)localObject1).o0OOOO0o((IOTAServiceListener)localObject2);
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
  }
  
  public DiagTaskInfo getDiagTaskReq()
  {
    IOTAService localIOTAService = this.OooO0o;
    if (localIOTAService != null) {
      try
      {
        return localIOTAService.getDiagTaskReq();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public VehicleDiagState getDiagTaskStateInfo()
  {
    IOTAService localIOTAService = this.OooO0o;
    if (localIOTAService != null) {
      try
      {
        return localIOTAService.getDiagTaskStateInfo();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public int getExcelforeOTACampaignState()
  {
    IOTAService localIOTAService = this.OooO0o;
    if (localIOTAService != null) {
      try
      {
        return localIOTAService.getExcelforeOTACampaignState();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return -1;
  }
  
  public OtaInstallState getExcelforeOTAInstallInfo()
  {
    IOTAService localIOTAService = this.OooO0o;
    if (localIOTAService != null) {
      try
      {
        return localIOTAService.getExcelforeOTAInstallInfo();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public OtaInstallPolicy getExcelforeOTAInstallPolicy()
  {
    IOTAService localIOTAService = this.OooO0o;
    if (localIOTAService != null) {
      try
      {
        return localIOTAService.getExcelforeOTAInstallPolicy();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public OtaUpdateReq getExcelforeOTAUpdateRequest()
  {
    IOTAService localIOTAService = this.OooO0o;
    if (localIOTAService != null) {
      try
      {
        return localIOTAService.getExcelforeOTAUpdateRequest();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.ota.OTAManager
 * JD-Core Version:    0.7.0.1
 */