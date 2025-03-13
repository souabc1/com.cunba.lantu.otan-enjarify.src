package com.qinggan.ota;

import android.os.IInterface;
import com.excelfore.hmiagent.DiagOnlineReq;
import com.excelfore.hmiagent.DiagTaskInfo;
import com.excelfore.hmiagent.OtaInstallState;
import com.excelfore.hmiagent.OtaUpdateReq;
import com.excelfore.hmiagent.VehicleDiagState;
import java.util.List;

public abstract interface IOTAServiceListener
  extends IInterface
{
  public abstract void OooO00o(int paramInt);
  
  public abstract void OooOO0O(OTAFullPkg paramOTAFullPkg, List paramList, long paramLong1, long paramLong2, int paramInt);
  
  public abstract void OooOOO0(int paramInt1, int paramInt2);
  
  public abstract void OooOo(int paramInt);
  
  public abstract void OooOoO(int paramInt, String paramString);
  
  public abstract void OoooO0(OTAVersion paramOTAVersion);
  
  public abstract void OooooO0(int paramInt);
  
  public abstract void Oooooo();
  
  public abstract void Oooooo0(DiagTaskInfo paramDiagTaskInfo);
  
  public abstract void Ooooooo(DiagOnlineReq paramDiagOnlineReq);
  
  public abstract void o000000(VehicleDiagState paramVehicleDiagState);
  
  public abstract void o00000OO(OtaInstallState paramOtaInstallState);
  
  public abstract void o000OOo(int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public abstract void o0OoOo0(OTAPushInfo paramOTAPushInfo);
  
  public abstract void o0ooOO0(OtaUpdateReq paramOtaUpdateReq);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.ota.IOTAServiceListener
 * JD-Core Version:    0.7.0.1
 */