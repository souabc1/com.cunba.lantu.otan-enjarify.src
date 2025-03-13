package com.qinggan.system;

import android.os.IInterface;
import java.util.List;

public abstract interface ISystemPolicy
  extends IInterface
{
  public abstract List getAutoConnectDevice();
  
  public abstract int getBackLight(int paramInt);
  
  public abstract int getDimmer(int paramInt);
  
  public abstract int getPdcState();
  
  public abstract int getPreReverseState();
  
  public abstract int getReverseState();
  
  public abstract boolean isBTRecording(int paramInt);
  
  public abstract boolean isQGNetworkAvailable();
  
  public abstract int o000Oooo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  public abstract void o000o0oO(IBTAutoConnectCallback paramIBTAutoConnectCallback);
  
  public abstract boolean o000ooo();
  
  public abstract boolean o00O(IReverseCallback paramIReverseCallback);
  
  public abstract boolean o00O0Ooo(boolean paramBoolean);
  
  public abstract int o00OO0o0(IBackLightCallback paramIBackLightCallback, int paramInt);
  
  public abstract int o00o0Oo();
  
  public abstract int o00o0o();
  
  public abstract boolean o0O00o0(IBTAutoConnectCallback paramIBTAutoConnectCallback);
  
  public abstract void o0O0O0o0(int paramInt);
  
  public abstract int o0O0OOO(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract int o0O0OOoO(INightVisionCallback paramINightVisionCallback);
  
  public abstract boolean o0O0OoO0(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
  
  public abstract boolean o0O0Ooo(int paramInt, boolean paramBoolean);
  
  public abstract void o0O0Oooo(int paramInt);
  
  public abstract boolean o0O0o0OO(IReverseCallback paramIReverseCallback);
  
  public abstract void o0OOo0O0(String paramString, int paramInt);
  
  public abstract int o0ooO(IBackLightCallback paramIBackLightCallback, int paramInt);
  
  public abstract boolean o0ooO0O0(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
  
  public abstract int o0ooOO(int paramInt);
  
  public abstract void reset();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.ISystemPolicy
 * JD-Core Version:    0.7.0.1
 */