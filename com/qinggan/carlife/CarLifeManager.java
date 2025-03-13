package com.qinggan.carlife;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.qinggan.common.OnInitListener;
import com.qinggan.os.ServiceManager;
import com.qinggan.os.SystemProperties;
import java.util.HashMap;
import m54207b69;

public class CarLifeManager
{
  public static Object OooO0oO;
  public static Object OooO0oo;
  public final Object OooO00o;
  public final HashMap OooO0O0;
  public final ICarLifeCallback OooO0OO;
  public Context OooO0Oo;
  public ICarLifeService OooO0o;
  public OnInitListener OooO0o0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0oO = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooO0oo = localObject;
  }
  
  public static String getCarlifeMobileDeviceOS()
  {
    String str1 = m54207b69.F54207b69_11(":o1F0B1F1F0A212148241F264C2A154F1B1E2E15191D1F5719235A1A37");
    String str2 = m54207b69.F54207b69_11("/21F202122");
    return SystemProperties.OooO0O0(str1, str2);
  }
  
  public static boolean isPlayerThreadDebug()
  {
    return SystemProperties.OooO0O0(m54207b69.F54207b69_11("cd0706180B110707511815200C110D582318162F142A5F16181E2A1D"), "0").equals("1");
  }
  
  public static boolean isRecorderThreadDebug()
  {
    return SystemProperties.OooO0O0(m54207b69.F54207b69_11("'+484B5B4A4652540C674C6359565C13685E59566C63636F1C6767637968"), "0").equals("1");
  }
  
  public static boolean isVideoThreadDebug()
  {
    return SystemProperties.OooO0O0(m54207b69.F54207b69_11("]a020115100C0C0A561D121D0F0C125D2618161621631A1A1A2C1F"), "0").equals("1");
  }
  
  public ICarLifeService OooO0Oo()
  {
    synchronized (OooO0oo)
    {
      Object localObject2 = this.OooO0o;
      if (localObject2 != null) {
        return localObject2;
      }
      localObject2 = "5C32256F23263635312D2F263B323E43393037";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject2 = ServiceManager.OooO0O0((String)localObject2);
      if (localObject2 == null)
      {
        localObject5 = new android/content/Intent;
        ((Intent)localObject5).<init>();
        Object localObject6 = "{.4D424503634C465051584A0B595C6A5157595D136362705E59591A888B998086888C93A08FA19E8E9594";
        localObject6 = m54207b69.F54207b69_11((String)localObject6);
        ((Intent)localObject5).setAction((String)localObject6);
        localObject6 = "04575C5B1D4962605A5B5E6425636254676D63632D5B665C5975706B";
        localObject6 = m54207b69.F54207b69_11((String)localObject6);
        ((Intent)localObject5).setPackage((String)localObject6);
        localObject6 = "$O2E222D40242B31682E2A45352D486F3B3E4C3C3B34524C782427371E222628";
        localObject6 = m54207b69.F54207b69_11((String)localObject6);
        ((Intent)localObject5).addCategory((String)localObject6);
        localObject6 = this.OooO0Oo;
        ((Context)localObject6).startService((Intent)localObject5);
        int i = 0;
        localObject5 = null;
        for (;;)
        {
          int j = 20;
          if (i >= j) {
            break;
          }
          long l = 200L;
          try
          {
            Thread.sleep(l);
          }
          catch (InterruptedException localInterruptedException)
          {
            localInterruptedException.printStackTrace();
          }
          localObject3 = "5C32256F23263635312D2F263B323E43393037";
          localObject3 = m54207b69.F54207b69_11((String)localObject3);
          localObject3 = ServiceManager.OooO0O0((String)localObject3);
          if (localObject3 != null)
          {
            localObject5 = ICarLifeService.Stub.o0Oo0o0O((IBinder)localObject3);
            this.OooO0o = ((ICarLifeService)localObject5);
            break;
          }
          i += 1;
        }
      }
      Object localObject3 = ICarLifeService.Stub.o0Oo0o0O((IBinder)localObject3);
      this.OooO0o = ((ICarLifeService)localObject3);
      localObject3 = new java/lang/Thread;
      Object localObject5 = new com/qinggan/carlife/CarLifeManager$2;
      ((CarLifeManager.2)localObject5).<init>(this);
      ((Thread)localObject3).<init>((Runnable)localObject5);
      ((Thread)localObject3).start();
      localObject3 = this.OooO0o;
      return localObject3;
    }
  }
  
  public final ICarLifeService OooO0o0()
  {
    Object localObject1 = OooO0oo;
    ICarLifeService localICarLifeService = null;
    try
    {
      this.OooO0o = null;
      localICarLifeService = OooO0Oo();
      return localICarLifeService;
    }
    finally {}
  }
  
  public void finalize()
  {
    ICarLifeService localICarLifeService = this.OooO0o;
    ICarLifeCallback localICarLifeCallback = this.OooO0OO;
    localICarLifeService.o000oo0o(localICarLifeCallback);
    super.finalize();
  }
  
  public boolean isCarLifeConnected()
  {
    try
    {
      ICarLifeService localICarLifeService = this.OooO0o;
      if (localICarLifeService != null) {
        return localICarLifeService.isCarLifeConnected();
      }
      OooO0Oo();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11(")e16010D042C1B084C0826100B211E1A191B70");
      localStringBuilder.append(str2);
      String str1 = localException.getMessage();
      localStringBuilder.append(str1);
      OooO0o0();
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.carlife.CarLifeManager
 * JD-Core Version:    0.7.0.1
 */