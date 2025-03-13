package com.qinggan.dvr;

import android.os.IInterface;

public abstract interface IDvrService
  extends IInterface
{
  public abstract boolean getAudioMuteState();
  
  public abstract int getGSensorSensitivity(int paramInt);
  
  public abstract int getLoopRecordDuration();
  
  public abstract boolean getLoopRecordState();
  
  public abstract long[] getUdiskSize();
  
  public abstract boolean getUdiskStorageState();
  
  public abstract boolean getUrgentDmsRecordState();
  
  public abstract boolean getUrgentRecordState();
  
  public abstract boolean o00();
  
  public abstract void o0000oo0(String paramString);
  
  public abstract boolean o000O0oo();
  
  public abstract void o000OooO(String paramString);
  
  public abstract void o00O00o();
  
  public abstract long o00O0oOO();
  
  public abstract void o00OoO0(String paramString);
  
  public abstract void o00OoO00(IDvrListener paramIDvrListener);
  
  public abstract boolean o00Ooo00();
  
  public abstract int o00OooO0(String paramString, int paramInt);
  
  public abstract void o00o0o0O(String paramString);
  
  public abstract void o00o0o0o();
  
  public abstract boolean o00oO0(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract void o00oOOOO(boolean paramBoolean);
  
  public abstract void o00oOOOo();
  
  public abstract int o00ooOo(String paramString, int paramInt);
  
  public abstract long o0O000Oo();
  
  public abstract boolean o0O00O(int paramInt);
  
  public abstract void o0O00o(String paramString);
  
  public abstract void o0O0Oo0o(String paramString);
  
  public abstract void o0O0o0oO();
  
  public abstract int o0O0ooo(String paramString, int paramInt);
  
  public abstract boolean o0OO0o0O();
  
  public abstract int o0OO0o0o(int paramInt);
  
  public abstract int o0OOO00(String paramString, int paramInt);
  
  public abstract void o0Oo00oO(IDvrListener paramIDvrListener);
  
  public abstract void o0Oo0OO(String paramString);
  
  public abstract void o0Oo0Oo0(String paramString);
  
  public abstract int o0oOooO0(String paramString, int paramInt);
  
  public abstract void oo0OOoo();
  
  public abstract void setAudioMuteState(boolean paramBoolean);
  
  public abstract void setGSensorSensitivity(int paramInt1, int paramInt2);
  
  public abstract void setLoopRecordDuration(int paramInt);
  
  public abstract void setLoopRecordState(boolean paramBoolean);
  
  public abstract void setUdiskStorageState(boolean paramBoolean);
  
  public abstract void setUrgentDmsRecordState(boolean paramBoolean);
  
  public abstract void setUrgentRecordState(boolean paramBoolean);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.dvr.IDvrService
 * JD-Core Version:    0.7.0.1
 */