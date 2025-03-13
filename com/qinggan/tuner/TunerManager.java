package com.qinggan.tuner;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.qinggan.os.SystemProperties;
import m54207b69;

public class TunerManager
{
  public static String OooO0o = "com.qinggan.tuner.service";
  public static String OooO0o0 = "com.qinggan.tuner.action.TUNER_SERVICE";
  public ServiceConnection OooO00o;
  public Context OooO0O0;
  public TunerManager.OnInitListener OooO0OO;
  public ITunerService OooO0Oo;
  
  public final void OooO0OO()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    Object localObject = OooO0o0;
    localIntent.setAction((String)localObject);
    localObject = OooO0o;
    localIntent.setPackage((String)localObject);
    localObject = this.OooO0O0;
    ServiceConnection localServiceConnection = this.OooO00o;
    ((Context)localObject).bindService(localIntent, localServiceConnection, 1);
  }
  
  public int getBand()
  {
    int i = -1;
    try
    {
      ITunerService localITunerService = this.OooO0Oo;
      if (localITunerService != null) {
        i = localITunerService.getBand();
      } else {
        OooO0OO();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("K85F5E4E7D5D5B621F6549656854595F666613");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooO0OO();
    }
    return i;
  }
  
  public int[] getFreqInfo()
  {
    int[] arrayOfInt = null;
    try
    {
      ITunerService localITunerService = this.OooO0Oo;
      if (localITunerService != null) {
        arrayOfInt = localITunerService.getFreqInfo();
      } else {
        OooO0OO();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11(":`07061629160A1730160F194B1125111420251B22226F");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooO0OO();
    }
    return arrayOfInt;
  }
  
  public TunerStatus getTunerStatus()
  {
    TunerStatus localTunerStatus = null;
    try
    {
      ITunerService localITunerService = this.OooO0Oo;
      if (localITunerService != null) {
        localTunerStatus = localITunerService.getTunerStatus();
      } else {
        OooO0OO();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("2156554766545A5E656A4E5A50504F1F6359636654596D747623");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooO0OO();
    }
    return localTunerStatus;
  }
  
  public boolean isTunerInitSuccess()
  {
    return SystemProperties.OooO0OO(m54207b69.F54207b69_11("(^2D282F732E3036423479413B4337"), false);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.tuner.TunerManager
 * JD-Core Version:    0.7.0.1
 */