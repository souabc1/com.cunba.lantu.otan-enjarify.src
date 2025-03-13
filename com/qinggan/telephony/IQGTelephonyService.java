package com.qinggan.telephony;

import android.os.IInterface;

public abstract interface IQGTelephonyService
  extends IInterface
{
  public abstract int getDataState();
  
  public abstract String getDeviceId();
  
  public abstract String getDeviceSoftwareVersion();
  
  public abstract boolean getDeviceState();
  
  public abstract String getLine1Number();
  
  public abstract String getNetworkCountryIso();
  
  public abstract String getNetworkOperator();
  
  public abstract String getNetworkOperatorName();
  
  public abstract int getNetworkType();
  
  public abstract String getSimCountryIso();
  
  public abstract String getSimOperator();
  
  public abstract String getSimOperatorName();
  
  public abstract String getSimSerialNumber();
  
  public abstract int getSimState();
  
  public abstract String getSubscriberId();
  
  public abstract boolean isNetworkRoaming();
  
  public abstract void o0000oOO(IQGPhoneStateListener paramIQGPhoneStateListener);
  
  public abstract void o0O00OO(IQGPhoneStateListener paramIQGPhoneStateListener);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.telephony.IQGTelephonyService
 * JD-Core Version:    0.7.0.1
 */