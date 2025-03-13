package com.qinggan.system;

import android.os.IBinder;
import android.os.IInterface;

public abstract interface IKeyManagerService
  extends IInterface
{
  public abstract void o0000O(int paramInt1, int paramInt2, String paramString);
  
  public abstract boolean o0000oO0(AreaFocusModel paramAreaFocusModel, String paramString);
  
  public abstract boolean o0000ooO(AreaFocusModel paramAreaFocusModel, String paramString);
  
  public abstract boolean o000O0O0(IDirectionEventListener paramIDirectionEventListener, String paramString);
  
  public abstract boolean o00O0o(IDirectionEventListener paramIDirectionEventListener, String paramString);
  
  public abstract int o00O0o0o(IBinder paramIBinder, IKeyManagerCallback paramIKeyManagerCallback, int[] paramArrayOfInt, String paramString, int paramInt1, int paramInt2);
  
  public abstract int o00Oo0oo(IKeyManagerCallback paramIKeyManagerCallback, String paramString);
  
  public abstract void o00o00o0(boolean paramBoolean, int[] paramArrayOfInt);
  
  public abstract void o00ooOoo(int paramInt1, int paramInt2, String paramString);
  
  public abstract int o0O0o0oo(IKeyManagerCallback paramIKeyManagerCallback, String paramString);
  
  public abstract int o0O0oO(int paramInt, String paramString);
  
  public abstract void o0O0oO0(QGKeyEvent paramQGKeyEvent, String paramString);
  
  public abstract void o0OO00o(int paramInt, int[] paramArrayOfInt, String paramString);
  
  public abstract boolean o0OOOo0o(AreaFocusModel paramAreaFocusModel, String paramString);
  
  public abstract void o0OOo0O(boolean paramBoolean, String paramString);
  
  public abstract int oo00o(IBinder paramIBinder, IKeyManagerCallback paramIKeyManagerCallback, int[] paramArrayOfInt, String paramString, int paramInt1, int paramInt2);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.IKeyManagerService
 * JD-Core Version:    0.7.0.1
 */