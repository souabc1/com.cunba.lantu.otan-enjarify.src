package com.qinggan.system;

import com.qinggan.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import m54207b69;

public class LocalCityManager
{
  public static Object OooO0o;
  public boolean OooO00o;
  public ArrayList OooO0O0;
  public ArrayList OooO0OO;
  public ILocalCityService OooO0Oo;
  public LocalCityManager.ServiceCityObserver OooO0o0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0o = localObject;
  }
  
  public final void OooO0oO(String paramString)
  {
    synchronized (this.OooO0OO)
    {
      Object localObject1 = this.OooO0OO;
      localObject1 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject1).hasNext();
        if (!bool) {
          break;
        }
        Object localObject2 = ((Iterator)localObject1).next();
        localObject2 = (LocalCityManager.CityObserver)localObject2;
        ((LocalCityManager.CityObserver)localObject2).OooO(paramString);
      }
      return;
    }
  }
  
  public final void OooO0oo(String paramString1, String paramString2)
  {
    ??? = new java/lang/StringBuilder;
    ((StringBuilder)???).<init>();
    Object localObject2 = m54207b69.F54207b69_11("(y17170F1323053B1D22211F451D25252D2C546B");
    ((StringBuilder)???).append((String)localObject2);
    ((StringBuilder)???).append(paramString1);
    ((StringBuilder)???).append(" ");
    ((StringBuilder)???).append(paramString2);
    localObject2 = m54207b69.F54207b69_11("e4785C59585C7C634755825F6561605F55");
    ??? = ((StringBuilder)???).toString();
    Log.OooO00o((String)localObject2, (String)???);
    synchronized (this.OooO0O0)
    {
      localObject2 = this.OooO0O0;
      localObject2 = ((ArrayList)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        Object localObject3 = ((Iterator)localObject2).next();
        localObject3 = (LocalCityManager.LocalObserver)localObject3;
        ((LocalCityManager.LocalObserver)localObject3).OoooOoO(paramString1, paramString2);
      }
      return;
    }
  }
  
  public String getCity()
  {
    ILocalCityService localILocalCityService = this.OooO0Oo;
    String str = null;
    if (localILocalCityService == null) {
      return null;
    }
    try
    {
      str = localILocalCityService.getLocalCity();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return str;
  }
  
  public String getCityName()
  {
    ILocalCityService localILocalCityService = this.OooO0Oo;
    String str = null;
    if (localILocalCityService == null) {
      return null;
    }
    try
    {
      str = localILocalCityService.getCityName();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return str;
  }
  
  public String getProvinceName()
  {
    ILocalCityService localILocalCityService = this.OooO0Oo;
    String str = null;
    if (localILocalCityService == null) {
      return null;
    }
    try
    {
      str = localILocalCityService.getProvinceName();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return str;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.LocalCityManager
 * JD-Core Version:    0.7.0.1
 */