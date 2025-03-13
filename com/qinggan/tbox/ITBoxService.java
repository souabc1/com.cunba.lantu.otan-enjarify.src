package com.qinggan.tbox;

import android.os.IInterface;

public abstract interface ITBoxService
  extends IInterface
{
  public abstract boolean getDatacomSwitchStatus();
  
  public abstract int getECallType();
  
  public abstract boolean getEFenceEnable();
  
  public abstract int getEFenceRange();
  
  public abstract int getEFenceSensitivity();
  
  public abstract String getNetworkOperator();
  
  public abstract int getNetworkStatus();
  
  public abstract int getNetworkType();
  
  public abstract String getPhoneNumber();
  
  public abstract int getSimCardStatus();
  
  public abstract int getTBoxCallStatus();
  
  public abstract int getTBoxCallType();
  
  public abstract String getTBoxDumpInfo();
  
  public abstract String getTBoxHWVersion();
  
  public abstract String getTBoxICCID();
  
  public abstract String getTBoxIMEI();
  
  public abstract String getTBoxIMSI();
  
  public abstract String getTBoxInfo(int paramInt);
  
  public abstract String getTBoxMCUVersion();
  
  public abstract String getTBoxMPUVersion();
  
  public abstract String getTBoxMSISDN();
  
  public abstract String getTBoxPDSN();
  
  public abstract int getTBoxSignalStrength();
  
  public abstract String getTBoxVIN();
  
  public abstract int getUpgradePercentage();
  
  public abstract int getUpgradeStatus();
  
  public abstract boolean isLianLuTBox();
  
  public abstract boolean isTBoxConnected();
  
  public abstract void o000O0oO();
  
  public abstract void o000o000();
  
  public abstract void o00O0oo0();
  
  public abstract void o00Oo00o();
  
  public abstract void o00Ooo0(boolean paramBoolean);
  
  public abstract void o00Ooooo();
  
  public abstract void o00o00o();
  
  public abstract void o00o0o00(boolean paramBoolean, int paramInt1, int paramInt2);
  
  public abstract void o0O0OOOo(String paramString);
  
  public abstract boolean o0O0OooO(int paramInt, String paramString);
  
  public abstract boolean o0OO0ooo(String paramString, ITBoxListener paramITBoxListener);
  
  public abstract void o0OOOOO();
  
  public abstract void o0OooO0(String paramString);
  
  public abstract void o0ooOoOO();
  
  public abstract boolean oo0o0O0(String paramString, ITBoxListener paramITBoxListener);
  
  public abstract void set5GSwitch(int paramInt);
  
  public abstract void setTimeZone(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.tbox.ITBoxService
 * JD-Core Version:    0.7.0.1
 */