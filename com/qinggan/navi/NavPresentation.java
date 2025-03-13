package com.qinggan.navi;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.qinggan.os.ServiceManager;
import com.qinggan.util.Log;
import java.util.ArrayList;
import m54207b69;

public class NavPresentation
{
  public static Object OooO;
  public static String OooO0Oo = "com.qinggan.systemservice.DisplayManagerService";
  public static NavPresentation.OnInitListener OooO0o;
  public static String OooO0o0 = "com.qinggan.systemservice";
  public static ArrayList OooO0oO;
  public static boolean OooO0oo = false;
  public Context OooO00o;
  public Runnable OooO0O0;
  public IDisplayManagerService OooO0OO;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO = localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    OooO0oO = (ArrayList)localObject;
  }
  
  public final boolean OooO0oO()
  {
    Object localObject1 = ServiceManager.OooO0O0(m54207b69.F54207b69_11("Xb13064E090F1618150B24471A0F1911141721"));
    if (localObject1 == null)
    {
      localObject1 = m54207b69.F54207b69_11("Or3C140625041C071E240F1D11272A2A");
      localObject2 = m54207b69.F54207b69_11(":g04070B4A0D0D194E080B1D52200F23201E15145A2A155F1A262D3126223B5629262A2823263A");
      Log.OooO0O0((String)localObject1, (String)localObject2);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = OooO0o0;
      ((Intent)localObject1).setPackage((String)localObject2);
      localObject2 = OooO0Oo;
      ((Intent)localObject1).setAction((String)localObject2);
      this.OooO00o.startService((Intent)localObject1);
      localObject1 = new java/lang/Thread;
      localObject2 = this.OooO0O0;
      ((Thread)localObject1).<init>((Runnable)localObject2);
      ((Thread)localObject1).start();
      return false;
    }
    localObject1 = IDisplayManagerService.Stub.o0Oo0o0O((IBinder)localObject1);
    this.OooO0OO = ((IDisplayManagerService)localObject1);
    localObject1 = new java/lang/Thread;
    Object localObject2 = new com/qinggan/navi/NavPresentation$2;
    ((NavPresentation.2)localObject2).<init>(this);
    ((Thread)localObject1).<init>((Runnable)localObject2);
    ((Thread)localObject1).start();
    return true;
  }
  
  public int getMUState()
  {
    String str1 = m54207b69.F54207b69_11("Or3C140625041C071E240F1D11272A2A");
    try
    {
      Object localObject = this.OooO0OO;
      if (localObject != null) {
        return ((IDisplayManagerService)localObject).getMUState();
      }
      localObject = "@(6C425D5B4D494F586D5250545B5A688A5D6B70545F621E5D5F7522666363646C6B7D";
      localObject = m54207b69.F54207b69_11((String)localObject);
      Log.OooO0oO(str1, (String)localObject);
      OooO0oO();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str3 = m54207b69.F54207b69_11("XU3231231B040B273B29397F3B39433E34314D4C4E83");
      localStringBuilder.append(str3);
      String str2 = localException.getMessage();
      localStringBuilder.append(str2);
      str2 = localStringBuilder.toString();
      Log.OooO0O0(str1, str2);
      OooO0oO();
    }
    return -1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.NavPresentation
 * JD-Core Version:    0.7.0.1
 */