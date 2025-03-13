package com.excelfore.hmiagent;

import android.os.IInterface;

public abstract interface IOtaListener
  extends IInterface
{
  public abstract void o00OO00O(OtaInstallState paramOtaInstallState);
  
  public abstract void o00OO0oO(OtaUpdateReq paramOtaUpdateReq);
  
  public abstract void o0OOoO0O(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.excelfore.hmiagent.IOtaListener
 * JD-Core Version:    0.7.0.1
 */