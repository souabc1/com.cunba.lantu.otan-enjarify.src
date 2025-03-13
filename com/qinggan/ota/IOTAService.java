package com.qinggan.ota;

import android.os.IInterface;
import com.excelfore.hmiagent.DiagTaskInfo;
import com.excelfore.hmiagent.OtaInstallConfirm;
import com.excelfore.hmiagent.OtaInstallPolicy;
import com.excelfore.hmiagent.OtaInstallState;
import com.excelfore.hmiagent.OtaUpdateReq;
import com.excelfore.hmiagent.VehicleDiagState;

public abstract interface IOTAService
  extends IInterface
{
  public abstract int OoooOOO();
  
  public abstract DiagTaskInfo getDiagTaskReq();
  
  public abstract VehicleDiagState getDiagTaskStateInfo();
  
  public abstract int getExcelforeOTACampaignState();
  
  public abstract OtaInstallState getExcelforeOTAInstallInfo();
  
  public abstract OtaInstallPolicy getExcelforeOTAInstallPolicy();
  
  public abstract OtaUpdateReq getExcelforeOTAUpdateRequest();
  
  public abstract boolean o0000OoO();
  
  public abstract boolean o0000Ooo(IOTAServiceListener paramIOTAServiceListener);
  
  public abstract void o000OoOo();
  
  public abstract boolean o000o0O0(String paramString);
  
  public abstract void o00O0OOO(int paramInt);
  
  public abstract int o00O0OoO();
  
  public abstract int o00O0o00();
  
  public abstract int o00OO0OO();
  
  public abstract void o00OOO0O(int paramInt);
  
  public abstract int o00OOooO();
  
  public abstract void o00Ooo0O(int paramInt);
  
  public abstract int o00OooOO();
  
  public abstract void o00o0OO0();
  
  public abstract void o00oOo();
  
  public abstract void o0O0ooOO(int paramInt);
  
  public abstract boolean o0OOOO0o(IOTAServiceListener paramIOTAServiceListener);
  
  public abstract int o0OOooo0();
  
  public abstract void o0OOoooO(OtaInstallConfirm paramOtaInstallConfirm);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.ota.IOTAService
 * JD-Core Version:    0.7.0.1
 */