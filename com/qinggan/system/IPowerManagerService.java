package com.qinggan.system;

import android.os.IInterface;
import com.qinggan.power.IPowerManagerListener;

public abstract interface IPowerManagerService
  extends IInterface
{
  public abstract int getAVNStatus();
  
  public abstract int getAVNStatusForScreen(int paramInt);
  
  public abstract int getCarKeyStatus();
  
  public abstract int getCurrentMBHighTempLevel();
  
  public abstract int getLCDTemp();
  
  public abstract boolean isScreenOff();
  
  public abstract boolean isScreenOffForScreen(int paramInt);
  
  public abstract boolean o000oOoo(String paramString, IPowerManagerListener paramIPowerManagerListener);
  
  public abstract void o00OOOO0(int paramInt);
  
  public abstract boolean o00OooOo(int paramInt1, int paramInt2);
  
  public abstract boolean o00oOoO0(int paramInt1, int paramInt2);
  
  public abstract boolean o00ooO0o(String paramString, IPowerManagerListener paramIPowerManagerListener);
  
  public abstract void o0O0o00O(int paramInt);
  
  public abstract boolean o0OOOOO0(int paramInt);
  
  public abstract void o0OOOoOo();
  
  public abstract void o0OOo00();
  
  public abstract boolean o0OOo000(int paramInt);
  
  public abstract void o0OOo0oO();
  
  public abstract void o0OOoo();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.IPowerManagerService
 * JD-Core Version:    0.7.0.1
 */