package com.qinggan.telephony;

import android.os.RemoteException;
import android.telephony.TelephonyManager;
import com.qinggan.common.OnInitListener;
import java.lang.reflect.Method;
import java.util.List;

public class QGTelephonyManager
{
  public final List OooO00o;
  public boolean OooO0O0;
  public Method OooO0OO;
  public IQGTelephonyService OooO0Oo;
  public TelephonyManager OooO0o;
  public OnInitListener OooO0o0;
  
  public int getCallState()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getCallState();
    }
    return 0;
  }
  
  public int getDataState()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getDataState();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getDataState();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return 0;
  }
  
  public String getDeviceId()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getDeviceId();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getDeviceId();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public String getDeviceSoftwareVersion()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getDeviceSoftwareVersion();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getDeviceSoftwareVersion();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public boolean getDeviceState()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return true;
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getDeviceState();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return false;
  }
  
  public String getLine1Number()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getLine1Number();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getLine1Number();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public String getNetworkCountryIso()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getNetworkCountryIso();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getNetworkCountryIso();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public String getNetworkOperator()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getNetworkOperator();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getNetworkOperator();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public String getNetworkOperatorName()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getNetworkOperatorName();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getNetworkOperatorName();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public int getNetworkType()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getNetworkType();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getNetworkType();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return 0;
  }
  
  public String getSimCountryIso()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getSimCountryIso();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getSimCountryIso();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public String getSimOperator()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getSimOperator();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getSimOperator();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public String getSimOperatorName()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getSimOperatorName();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getSimOperatorName();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public String getSimSerialNumber()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getSimSerialNumber();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getSimSerialNumber();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public int getSimState()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getSimState();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getSimState();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return 0;
  }
  
  public String getSubscriberId()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.getSubscriberId();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.getSubscriberId();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return null;
  }
  
  public boolean isNetworkRoaming()
  {
    boolean bool = this.OooO0O0;
    if (bool) {
      return this.OooO0o.isNetworkRoaming();
    }
    IQGTelephonyService localIQGTelephonyService = this.OooO0Oo;
    if (localIQGTelephonyService != null) {
      try
      {
        return localIQGTelephonyService.isNetworkRoaming();
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.telephony.QGTelephonyManager
 * JD-Core Version:    0.7.0.1
 */