package com.qinggan.recognition;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.qinggan.common.OnInitListener;
import com.qinggan.os.ServiceManager;
import java.util.List;
import m54207b69;

public class MusicRecognition
  implements ServiceConnection
{
  public static MusicRecognition OooO0o;
  public static Object OooO0o0;
  public Context OooO00o;
  public final Handler OooO0O0;
  public OnInitListener OooO0OO;
  public IMusicRecognitionService OooO0Oo;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0o0 = localObject;
  }
  
  private boolean isConnected()
  {
    IMusicRecognitionService localIMusicRecognitionService = this.OooO0Oo;
    boolean bool;
    if (localIMusicRecognitionService != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localIMusicRecognitionService = null;
    }
    return bool;
  }
  
  public final void OooO0OO()
  {
    Intent localIntent = new android/content/Intent;
    Object localObject = m54207b69.F54207b69_11("'k080508481E070B1314130F50251B16131C16143216191B5C2221391D202263455E59444B585E544F4C554F4D6B4F52546469606C71575E65");
    localIntent.<init>((String)localObject);
    localObject = m54207b69.F54207b69_11("m}1E1312561019192122251D5E1B252C212A24261C2827296A26312926303B36");
    localIntent.setPackage((String)localObject);
    localObject = this.OooO00o;
    int i = 1;
    boolean bool = ((Context)localObject).bindService(localIntent, this, i);
    if (!bool)
    {
      bool = false;
      localIntent = null;
      this.OooO0Oo = null;
    }
  }
  
  public final void OooO0Oo(boolean paramBoolean)
  {
    synchronized (OooO0o0)
    {
      OnInitListener localOnInitListener = this.OooO0OO;
      if (localOnInitListener != null) {
        localOnInitListener.OooO00o(paramBoolean);
      }
      return;
    }
  }
  
  public final void OooO0o0()
  {
    Object localObject = ServiceManager.OooO0O0(m54207b69.F54207b69_11("'k080508481E070B1314130F50251B16131C16143216191B5C2221391D202263455E59444B585E544F4C554F4D6B4F52546469606C71575E65"));
    if (localObject != null)
    {
      localObject = IMusicRecognitionService.Stub.o0Oo0o0O((IBinder)localObject);
      this.OooO0Oo = ((IMusicRecognitionService)localObject);
      localObject = this.OooO0O0;
      MusicRecognition.1 local1 = new com/qinggan/recognition/MusicRecognition$1;
      local1.<init>(this);
      ((Handler)localObject).post(local1);
      return;
    }
    OooO0OO();
  }
  
  public List getIdentification()
  {
    try
    {
      boolean bool = isConnected();
      if (bool)
      {
        IMusicRecognitionService localIMusicRecognitionService = this.OooO0Oo;
        return localIMusicRecognitionService.getIdentificationList();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("GD2322321024263037352B3732313D3B3A3A75334F3B364A4745444499");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooO0o0();
    }
    return null;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = IMusicRecognitionService.Stub.o0Oo0o0O(paramIBinder);
    this.OooO0Oo = paramComponentName;
    OooO0Oo(true);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = this.OooO0Oo;
    if (paramComponentName != null)
    {
      this.OooO0Oo = null;
      paramComponentName = null;
      OooO0Oo(false);
    }
  }
  
  public void setMusicRecognitionListener(IMusicRecognitionListener paramIMusicRecognitionListener)
  {
    try
    {
      boolean bool = isConnected();
      if (bool)
      {
        localObject = this.OooO0Oo;
        ((IMusicRecognitionService)localObject).setMusicRecognitionListener(paramIMusicRecognitionListener);
      }
      else
      {
        OooO0o0();
      }
    }
    catch (Exception paramIMusicRecognitionListener)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = m54207b69.F54207b69_11("&Z29403020381C35303B421D49153B364E4B48313F53494491573B535A464B51545481");
      ((StringBuilder)localObject).append(str);
      paramIMusicRecognitionListener = paramIMusicRecognitionListener.getMessage();
      ((StringBuilder)localObject).append(paramIMusicRecognitionListener);
      OooO0o0();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.recognition.MusicRecognition
 * JD-Core Version:    0.7.0.1
 */