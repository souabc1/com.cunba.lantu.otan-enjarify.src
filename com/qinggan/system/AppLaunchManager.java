package com.qinggan.system;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import com.qinggan.app.LaunchParams;
import com.qinggan.util.Log;
import m54207b69;

public class AppLaunchManager
{
  public IBinder.DeathRecipient OooO00o;
  public Context OooO0O0;
  public Handler OooO0OO;
  public boolean OooO0Oo;
  public IAppLaunchService OooO0o;
  public Runnable OooO0o0;
  
  public void OooO(String paramString)
  {
    Object localObject = this.OooO0o;
    if (localObject != null)
    {
      try
      {
        ((IAppLaunchService)localObject).o00OO0o(paramString);
      }
      catch (RemoteException paramString)
      {
        paramString.printStackTrace();
      }
    }
    else
    {
      localObject = m54207b69.F54207b69_11("9C02343512263B332733172C382E313440");
      String str = m54207b69.F54207b69_11("<k2A1C1D2A0E230B0F0B411824290F161D5B132A5E19331D1E62");
      Log.OooO00o((String)localObject, str);
      OooO0oO(paramString);
    }
  }
  
  public final void OooO0oO(String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("G$40424A486168517353524B291061535251152B17");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramString);
    str = m54207b69.F54207b69_11("9C02343512263B332733172C382E313440");
    localObject = ((StringBuilder)localObject).toString();
    Log.OooO00o(str, (String)localObject);
    localObject = this.OooO0OO.obtainMessage(2);
    ((Message)localObject).obj = paramString;
    this.OooO0OO.sendMessageDelayed((Message)localObject, 500L);
  }
  
  public final void OooO0oo(int paramInt1, String paramString, int paramInt2)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("Xy1D1D171B043A1E131F231B4522211725272D2920576E23172135735F75");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramInt1);
    str = m54207b69.F54207b69_11("1X7479383C39427E6C80");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramString);
    str = m54207b69.F54207b69_11("CO63703E233E423231777B79");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramInt2);
    str = m54207b69.F54207b69_11("9C02343512263B332733172C382E313440");
    localObject = ((StringBuilder)localObject).toString();
    Log.OooO00o(str, (String)localObject);
    Message localMessage = this.OooO0OO.obtainMessage(paramInt1);
    localMessage.obj = paramString;
    localMessage.arg1 = paramInt2;
    this.OooO0OO.sendMessageDelayed(localMessage, 300L);
  }
  
  public boolean OooOO0(String paramString, int paramInt)
  {
    Object localObject = this.OooO0o;
    boolean bool1 = false;
    if (localObject != null)
    {
      if (paramInt != 0) {}
      try
      {
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>();
        LaunchParams.OooO00o((Bundle)localObject, paramInt);
        IAppLaunchService localIAppLaunchService = this.OooO0o;
        localIAppLaunchService.o0OOooO0(paramString, (Bundle)localObject);
        break label62;
        paramInt = 0;
        localIAppLaunchService = null;
        ((IAppLaunchService)localObject).o0OOooO0(paramString, null);
        label62:
        boolean bool2 = true;
        bool1 = bool2;
      }
      catch (RemoteException paramString)
      {
        paramString.printStackTrace();
      }
    }
    else
    {
      OooO0oo(0, paramString, paramInt);
    }
    return bool1;
  }
  
  public boolean OooOO0O(String paramString, int paramInt)
  {
    Object localObject = this.OooO0o;
    int i = 1;
    boolean bool = false;
    if (localObject != null)
    {
      if (paramInt != 0) {}
      try
      {
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>();
        LaunchParams.OooO00o((Bundle)localObject, paramInt);
        localIAppLaunchService = this.OooO0o;
        localIAppLaunchService.o0OOO0o0(paramString, (Bundle)localObject);
      }
      catch (RemoteException paramString)
      {
        IAppLaunchService localIAppLaunchService;
        paramString.printStackTrace();
        i = 0;
      }
      paramInt = 0;
      localIAppLaunchService = null;
      ((IAppLaunchService)localObject).o0OOO0o0(paramString, null);
      bool = i;
    }
    else
    {
      OooO0oo(i, paramString, paramInt);
    }
    return bool;
  }
  
  public boolean isServiceConnected()
  {
    IAppLaunchService localIAppLaunchService = this.OooO0o;
    if (localIAppLaunchService == null) {
      return false;
    }
    return this.OooO0Oo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.AppLaunchManager
 * JD-Core Version:    0.7.0.1
 */