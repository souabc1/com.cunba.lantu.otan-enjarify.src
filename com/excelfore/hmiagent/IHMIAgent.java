package com.excelfore.hmiagent;

import android.os.IInterface;

public abstract interface IHMIAgent
  extends IInterface
{
  public abstract int getCampaignState();
  
  public abstract void o0(int paramInt);
  
  public abstract void o0000OO0(IDiagListener paramIDiagListener);
  
  public abstract void o000oooO(int paramInt);
  
  public abstract OtaInstallState o00OOO00();
  
  public abstract void o00OoO(IOtaListener paramIOtaListener);
  
  public abstract OtaUpdateReq o00oo0O0();
  
  public abstract void o0O0OO0O(OtaInstallConfirm paramOtaInstallConfirm);
  
  public abstract OtaInstallPolicy o0O0Ooo0();
  
  public abstract DiagTaskInfo o0O0o000();
  
  public abstract void o0OO0OoO(int paramInt);
  
  public abstract boolean o0OOOOoO(String paramString);
  
  public abstract VehicleDiagState o0OOoO0o();
  
  public abstract void o0OOoo0(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.excelfore.hmiagent.IHMIAgent
 * JD-Core Version:    0.7.0.1
 */