package com.qinggan.system;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.qinggan.common.OnInitListener;
import m54207b69;

public class LastMemory
{
  public static final String OooO0o0 = "LastMemory";
  public OnInitListener OooO00o;
  public Context OooO0O0;
  public ILastMemoryService OooO0OO;
  public ServiceConnection OooO0Oo;
  
  public final void OooO0Oo()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    Object localObject = m54207b69.F54207b69_11("x.4D424503634C465051584A0B4E5C6B69535C5554706C16666573615C5C1D808E9D9B93868F8887A39F9AA796A8A5959C9B");
    localIntent.setAction((String)localObject);
    localObject = m54207b69.F54207b69_11("SZ393639772F383A4445443E7F4248373D475049483C388A405741464E555C");
    localIntent.setPackage((String)localObject);
    localObject = this.OooO0O0;
    ServiceConnection localServiceConnection = this.OooO0Oo;
    ((Context)localObject).bindService(localIntent, localServiceConnection, 1);
  }
  
  public int getRestoreStatus()
  {
    try
    {
      ILastMemoryService localILastMemoryService = this.OooO0OO;
      if (localILastMemoryService != null) {
        return localILastMemoryService.getRestoreStatus();
      }
      OooO0Oo();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("`o01011D090D1B431124240A2816380E101A60611D2B212036331F1A1C71");
      localStringBuilder.append(str2);
      String str1 = localException.getMessage();
      localStringBuilder.append(str1);
      OooO0Oo();
    }
    return -1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.LastMemory
 * JD-Core Version:    0.7.0.1
 */