package com.excelfore.hmiagent;

import android.os.IInterface;

public abstract interface IDiagListener
  extends IInterface
{
  public abstract int o00O0OO(VehicleDiagState paramVehicleDiagState);
  
  public abstract void o00o0oO();
  
  public abstract int o00oOo0o(DiagTaskInfo paramDiagTaskInfo);
  
  public abstract int o0Oo0OO0(DiagOnlineReq paramDiagOnlineReq);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.excelfore.hmiagent.IDiagListener
 * JD-Core Version:    0.7.0.1
 */