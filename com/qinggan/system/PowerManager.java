package com.qinggan.system;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import com.qinggan.os.ServiceManager;
import java.util.HashMap;
import java.util.List;
import m54207b69;

public class PowerManager
{
  public static PowerManager OooO;
  public static PowerManager.PowerManagerHandler OooO0oo;
  public HashMap OooO00o;
  public Context OooO0O0;
  public IBinder.DeathRecipient OooO0OO;
  public boolean OooO0Oo;
  public PowerManager.ObtainServiceThread OooO0o;
  public final List OooO0o0;
  public IPowerManagerService OooO0oO;
  
  public final void OooOO0()
  {
    Object localObject1 = "he14034D180E17061E42110E16100F0E26";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = ServiceManager.OooO0O0((String)localObject1);
      if (localObject1 == null)
      {
        localObject1 = this.OooO0O0;
        if (localObject1 == null) {
          return;
        }
        localObject1 = new android/content/Intent;
        ((Intent)localObject1).<init>();
        localObject4 = "0+484548085E474B5354534F1067516A5D69575C585E616470";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        ((Intent)localObject1).setPackage((String)localObject4);
        localObject4 = "wi0A07064A1C050D151611115225132C1B2B151A1A1C2322325F2124381C2325665947604F5F5B4A4F4F5158576763685B6B70525D60";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        ((Intent)localObject1).setAction((String)localObject4);
        localObject4 = this.OooO0O0;
        ((Context)localObject4).startService((Intent)localObject1);
        localObject1 = this.OooO0o;
        bool1 = false;
        localObject4 = null;
        if (localObject1 == null)
        {
          localObject1 = new com/qinggan/system/PowerManager$ObtainServiceThread;
          ((PowerManager.ObtainServiceThread)localObject1).<init>(this, null);
        }
        for (this.OooO0o = ((PowerManager.ObtainServiceThread)localObject1);; this.OooO0o = ((PowerManager.ObtainServiceThread)localObject1))
        {
          ((Thread)localObject1).start();
          break;
          boolean bool2 = ((Thread)localObject1).isAlive();
          if (bool2) {
            break;
          }
          this.OooO0o = null;
          localObject1 = new com/qinggan/system/PowerManager$ObtainServiceThread;
          ((PowerManager.ObtainServiceThread)localObject1).<init>(this, null);
        }
        return;
      }
      boolean bool1 = true;
      this.OooO0Oo = bool1;
      Object localObject4 = IPowerManagerService.Stub.o0Oo0o0O((IBinder)localObject1);
      this.OooO0oO = ((IPowerManagerService)localObject4);
      try
      {
        localObject4 = this.OooO0OO;
        ((IBinder)localObject1).linkToDeath((IBinder.DeathRecipient)localObject4, 0);
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
      Object localObject2 = this.OooO00o;
      int i = ((HashMap)localObject2).size();
      if (i > 0)
      {
        localObject2 = this.OooO00o;
        localObject4 = this.OooO0O0;
        localObject2 = ((HashMap)localObject2).get(localObject4);
        localObject2 = (PowerManager.OnInitListener)localObject2;
        OooOO0O((PowerManager.OnInitListener)localObject2);
      }
      return;
    }
    finally {}
  }
  
  public final void OooOO0O(PowerManager.OnInitListener paramOnInitListener)
  {
    Message localMessage = new android/os/Message;
    localMessage.<init>();
    localMessage.what = 0;
    Context localContext = this.OooO0O0;
    paramOnInitListener = new Object[] { localContext, paramOnInitListener };
    localMessage.obj = paramOnInitListener;
    OooO0oo.OooO00o(localMessage, 50);
  }
  
  public int getAVNStatus()
  {
    try
    {
      IPowerManagerService localIPowerManagerService = this.OooO0oO;
      if (localIPowerManagerService != null) {
        return localIPowerManagerService.getAVNStatus();
      }
      OooOO0();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("{:5D60507E70796F5563575954266C50686F5B6066696916");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
      OooOO0();
    }
    return -1;
  }
  
  public int getAVNStatus(int paramInt)
  {
    try
    {
      localObject = this.OooO0oO;
      if (localObject != null) {
        return ((IPowerManagerService)localObject).getAVNStatusForScreen(paramInt);
      }
      OooOO0();
    }
    catch (Exception localException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11("{:5D60507E70796F5563575954266C50686F5B6066696916");
      ((StringBuilder)localObject).append(str2);
      String str1 = localException.toString();
      ((StringBuilder)localObject).append(str1);
      OooOO0();
    }
    return -1;
  }
  
  public int getCarKeyStatus()
  {
    try
    {
      IPowerManagerService localIPowerManagerService = this.OooO0oO;
      if (localIPowerManagerService != null) {
        return localIPowerManagerService.getCarKeyStatus();
      }
      OooOO0();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("}25558487457457F5E536A505E52544F21675B636A565B71747421");
      localStringBuilder.append(str2);
      String str1 = localException.getMessage();
      localStringBuilder.append(str1);
      OooOO0();
    }
    return -1;
  }
  
  public int getCurrentMBHighTempLevel()
  {
    try
    {
      IPowerManagerService localIPowerManagerService = this.OooO0oO;
      if (localIPowerManagerService != null) {
        return localIPowerManagerService.getCurrentMBHighTempLevel();
      }
      OooOO0();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("Yf0104142817191A0A101B352F3A1C0F1D42141D293E18261A225F1D39212034312F2A2A7F");
      localStringBuilder.append(str2);
      String str1 = localException.getMessage();
      localStringBuilder.append(str1);
      OooOO0();
    }
    return -1;
  }
  
  public int getLCDTemp()
  {
    try
    {
      IPowerManagerService localIPowerManagerService = this.OooO0oO;
      if (localIPowerManagerService != null) {
        return localIPowerManagerService.getLCDTemp();
      }
      OooOO0();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("fZ3D4030191D2314463F33844A2E464D393E44474774");
      localStringBuilder.append(str2);
      String str1 = localException.getMessage();
      localStringBuilder.append(str1);
      OooOO0();
    }
    return -1;
  }
  
  public boolean isScreenOff()
  {
    try
    {
      IPowerManagerService localIPowerManagerService = this.OooO0oO;
      if (localIPowerManagerService != null) {
        return localIPowerManagerService.isScreenOff();
      }
      OooOO0();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("$*435A7B4C5C54554B6D5556155B5F575E6A6F55585825");
      localStringBuilder.append(str2);
      String str1 = localException.getMessage();
      localStringBuilder.append(str1);
      OooOO0();
    }
    return false;
  }
  
  public boolean isScreenOff(int paramInt)
  {
    try
    {
      localObject = this.OooO0oO;
      if (localObject != null) {
        return ((IPowerManagerService)localObject).isScreenOffForScreen(paramInt);
      }
      OooOO0();
    }
    catch (Exception localException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11("$*435A7B4C5C54554B6D5556155B5F575E6A6F55585825");
      ((StringBuilder)localObject).append(str2);
      String str1 = localException.getMessage();
      ((StringBuilder)localObject).append(str1);
      OooOO0();
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.PowerManager
 * JD-Core Version:    0.7.0.1
 */