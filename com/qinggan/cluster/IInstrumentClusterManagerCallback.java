package com.qinggan.cluster;

import android.os.Bundle;
import android.os.IInterface;

public abstract interface IInstrumentClusterManagerCallback
  extends IInterface
{
  public abstract void o000OOO(String paramString, int paramInt1, int paramInt2);
  
  public abstract void o00oOOoO(String paramString1, String paramString2, Bundle paramBundle);
  
  public abstract void o00oOoo0(String paramString1, String paramString2, int paramInt);
  
  public abstract void o0OO0o(String paramString, int paramInt);
  
  public abstract void o0OOO0O(String paramString, ClusterState paramClusterState, int paramInt);
  
  public abstract void setClusterConnect(boolean paramBoolean);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.IInstrumentClusterManagerCallback
 * JD-Core Version:    0.7.0.1
 */