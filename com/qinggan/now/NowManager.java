package com.qinggan.now;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import m54207b69;

public class NowManager
{
  public static String OooO0oO = "com.qinggan.soulmate.SoulMateService";
  public static String OooO0oo = "com.qinggan.soulmate";
  public ServiceConnection OooO00o;
  public INowCardCallback OooO0O0;
  public NowCardListener OooO0OO;
  public Context OooO0Oo;
  public INowService OooO0o;
  public NowManager.OnInitListener OooO0o0;
  
  public NowManager()
  {
    Object localObject = new com/qinggan/now/NowManager$1;
    ((NowManager.1)localObject).<init>(this);
    this.OooO0O0 = ((INowCardCallback)localObject);
    localObject = new com/qinggan/now/NowManager$2;
    ((NowManager.2)localObject).<init>(this);
    this.OooO00o = ((ServiceConnection)localObject);
  }
  
  public final void OooO0Oo()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    Object localObject = OooO0oO;
    localIntent.setAction((String)localObject);
    localObject = OooO0oo;
    localIntent.setPackage((String)localObject);
    this.OooO0Oo.startService(localIntent);
    localObject = this.OooO0Oo;
    ServiceConnection localServiceConnection = this.OooO00o;
    ((Context)localObject).bindService(localIntent, localServiceConnection, 1);
  }
  
  public String getSoulMateSceneList()
  {
    String str1 = null;
    try
    {
      INowService localINowService = this.OooO0o;
      if (localINowService != null) {
        str1 = localINowService.getSoulMateSceneList();
      }
      return str1;
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str3 = m54207b69.F54207b69_11("lE222133192E352F0F2C3A2A21322D392F193D48447935533D384E4B4746489D");
      localStringBuilder.append(str3);
      String str2 = localException.getMessage();
      localStringBuilder.append(str2);
      OooO0Oo();
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NowManager
 * JD-Core Version:    0.7.0.1
 */