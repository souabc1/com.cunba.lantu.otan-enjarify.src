package com.qinggan.airtrip;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.qinggan.account.QGSupportMutiUserCommonhelper;
import com.qinggan.common.OnInitListener;
import java.util.HashMap;
import m54207b69;

public class AirTripManager
  implements ServiceConnection
{
  public static final String OooO0o = "AirTripManager";
  public static Object OooO0oO;
  public QrUrlListener OooO00o;
  public boolean OooO0O0;
  public Context OooO0OO;
  public HashMap OooO0Oo;
  public IAirTripService OooO0o0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0oO = localObject;
  }
  
  public final void OooO0O0()
  {
    Intent localIntent = new android/content/Intent;
    Object localObject = m54207b69.F54207b69_11("t6555A5D1B4B645E5859606223636C52515470582B59685A57776E6D33937C628164806888776966867D7C");
    localIntent.<init>((String)localObject);
    localObject = m54207b69.F54207b69_11("]3505D6020465F635B5C5B67285E674F56516B55");
    localIntent.setPackage((String)localObject);
    QGSupportMutiUserCommonhelper.OooO0OO(this.OooO0OO, localIntent);
    localObject = this.OooO0OO;
    int i = 1;
    boolean bool = QGSupportMutiUserCommonhelper.OooO00o((Context)localObject, localIntent, this, i);
    if (!bool)
    {
      bool = false;
      localIntent = null;
      this.OooO0o0 = null;
    }
  }
  
  public final void OooO0OO(boolean paramBoolean)
  {
    Object localObject = this.OooO0Oo;
    if (localObject != null)
    {
      int i = ((HashMap)localObject).size();
      if (i > 0)
      {
        localObject = this.OooO0Oo;
        Context localContext = this.OooO0OO;
        localObject = (OnInitListener)((HashMap)localObject).get(localContext);
        ((OnInitListener)localObject).OooO00o(paramBoolean);
      }
    }
  }
  
  public boolean isLogin()
  {
    String str = m54207b69.F54207b69_11("\\{1209391720171B62260C2229171C20232552");
    try
    {
      IAirTripService localIAirTripService = this.OooO0o0;
      if (localIAirTripService == null)
      {
        OooO0O0();
        return false;
      }
      return localIAirTripService.isLogin();
    }
    catch (Exception localException)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str);
      str = localException.getMessage();
      localStringBuilder.append(str);
      localException.printStackTrace();
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str);
      str = localRemoteException.getMessage();
      localStringBuilder.append(str);
      localRemoteException.printStackTrace();
      OooO0O0();
    }
    return false;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO0o0;
    if (paramComponentName == null)
    {
      paramComponentName = IAirTripService.Stub.o0Oo0o0O(paramIBinder);
      this.OooO0o0 = paramComponentName;
      bool = true;
      this.OooO0O0 = bool;
    }
    boolean bool = this.OooO0O0;
    OooO0OO(bool);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = this.OooO0o0;
    if (paramComponentName != null)
    {
      this.OooO0o0 = null;
      bool = false;
      paramComponentName = null;
      this.OooO0O0 = false;
    }
    boolean bool = this.OooO0O0;
    OooO0OO(bool);
    OooO0O0();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.AirTripManager
 * JD-Core Version:    0.7.0.1
 */