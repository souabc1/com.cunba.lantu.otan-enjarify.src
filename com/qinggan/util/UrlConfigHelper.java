package com.qinggan.util;

import android.text.TextUtils;
import com.qinggan.os.SystemProperties;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m54207b69;

public class UrlConfigHelper
{
  public static Object OooO0Oo;
  public String OooO00o;
  public boolean OooO0O0;
  public Map OooO0OO;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0Oo = localObject;
  }
  
  public Set getConfigTypes()
  {
    return this.OooO0OO.keySet();
  }
  
  public Map getConfigs()
  {
    Object localObject1 = this.OooO0OO;
    boolean bool1 = ((Map)localObject1).isEmpty();
    if (bool1)
    {
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      return localObject1;
    }
    localObject1 = this.OooO0OO;
    Object localObject2 = getSelectType();
    localObject1 = (UrlConfigHelper.UrlConfig)((Map)localObject1).get(localObject2);
    if (localObject1 == null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("+{1515115E21171B2663211E20291F2A6A30");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = getSelectType();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append("]");
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      return localObject1;
    }
    localObject1 = ((UrlConfigHelper.UrlConfig)localObject1).getConfigs();
    localObject2 = ((Map)localObject1).keySet().iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      Object localObject3 = (String)((Iterator)localObject2).next();
      Object localObject4 = ((Map)localObject1).get(localObject3);
      localObject3 = new Object[] { localObject3, localObject4 };
      localObject4 = m54207b69.F54207b69_11("Sf0D04215F4A481B514E1911151F106A555326");
      String.format((String)localObject4, (Object[])localObject3);
    }
    return localObject1;
  }
  
  public String getSelectType()
  {
    String str1 = m54207b69.F54207b69_11("kI392D3D3D243F436E42394472443B754C4A4A793F3B54");
    String str2 = "";
    str1 = SystemProperties.OooO0O0(str1, str2);
    boolean bool = TextUtils.isEmpty(str1);
    if (bool) {
      str1 = this.OooO00o;
    }
    return str1;
  }
  
  public boolean isRefresh()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.util.UrlConfigHelper
 * JD-Core Version:    0.7.0.1
 */