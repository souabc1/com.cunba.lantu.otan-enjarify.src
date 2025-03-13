package com.qinggan.analytics.wbtech;

import android.content.Context;
import m54207b69;
import org.json.JSONException;
import org.json.JSONObject;

public class OtherManager
{
  public final String OooO00o;
  public final String OooO0O0;
  public String OooO0OO;
  public Context OooO0Oo;
  public final String OooO0o0;
  
  public OtherManager(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("/S1C283D39252338443A3D402C");
    this.OooO0o0 = str;
    str = m54207b69.F54207b69_11("A21D486144214763484E704B624C6864");
    this.OooO0O0 = str;
    str = m54207b69.F54207b69_11("Wr5D082104610723080E2B110C262824");
    this.OooO00o = str;
    this.OooO0Oo = paramContext;
  }
  
  public OtherManager(Context paramContext, String paramString)
  {
    String str = m54207b69.F54207b69_11("/S1C283D39252338443A3D402C");
    this.OooO0o0 = str;
    str = m54207b69.F54207b69_11("A21D486144214763484E704B624C6864");
    this.OooO0O0 = str;
    str = m54207b69.F54207b69_11("Wr5D082104610723080E2B110C262824");
    this.OooO00o = str;
    this.OooO0Oo = paramContext;
    this.OooO0OO = paramString;
  }
  
  public void OooO00o()
  {
    Object localObject1 = m54207b69.F54207b69_11("/S1C283D39252338443A3D402C");
    Object localObject2 = m54207b69.F54207b69_11("C&564A5755697468");
    try
    {
      Object localObject3 = new com/qinggan/analytics/wbtech/SharedPrefUtil;
      Object localObject4 = this.OooO0Oo;
      ((SharedPrefUtil)localObject3).<init>((Context)localObject4);
      localObject4 = Boolean.FALSE;
      localObject4 = ((SharedPrefUtil)localObject3).OooO0O0((String)localObject2, (Boolean)localObject4);
      boolean bool1 = ((Boolean)localObject4).booleanValue();
      if (bool1) {
        return;
      }
      try
      {
        localObject4 = OooO0OO();
        Object localObject5 = this.OooO0Oo;
        localObject5 = CommonUtil.OooO0o((Context)localObject5);
        Object localObject6 = UmsAgent.SendPolicy.o00Ooo0;
        if (localObject5 == localObject6)
        {
          localObject5 = this.OooO0Oo;
          boolean bool2 = CommonUtil.OooOO0o((Context)localObject5);
          if (bool2)
          {
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            localObject6 = UmsConstants.OooO0oO;
            ((StringBuilder)localObject5).append((String)localObject6);
            localObject6 = "Wr5D082104610723080E2B110C262824";
            localObject6 = m54207b69.F54207b69_11((String)localObject6);
            ((StringBuilder)localObject5).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject5).toString();
            localObject4 = ((JSONObject)localObject4).toString();
            localObject4 = NetworkUtil.OooO00o((String)localObject5, (String)localObject4);
            localObject4 = NetworkUtil.OooO0O0((String)localObject4);
            if (localObject4 == null) {
              return;
            }
            int i = ((MyMessage)localObject4).getFlag();
            if (i < 0)
            {
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject3 = "H@05333432366509362C2E87";
              localObject3 = m54207b69.F54207b69_11((String)localObject3);
              ((StringBuilder)localObject2).append((String)localObject3);
              int j = ((MyMessage)localObject4).getFlag();
              ((StringBuilder)localObject2).append(j);
              localObject3 = "t{5737200B0C1F22254E";
              localObject3 = m54207b69.F54207b69_11((String)localObject3);
              ((StringBuilder)localObject2).append((String)localObject3);
              localObject3 = ((MyMessage)localObject4).getMsg();
              ((StringBuilder)localObject2).append((String)localObject3);
              localObject2 = ((StringBuilder)localObject2).toString();
              CobubLog.OooO0OO((String)localObject1, (String)localObject2);
              return;
            }
            localObject1 = Boolean.TRUE;
            ((SharedPrefUtil)localObject3).OooO0o0((String)localObject2, (Boolean)localObject1);
            break label292;
          }
        }
        return;
      }
      catch (Exception localException1)
      {
        String str = localException1.toString();
        CobubLog.OooO0OO((String)localObject1, str);
      }
      label292:
      return;
    }
    catch (Exception localException2)
    {
      break label292;
    }
  }
  
  public void OooO0O0()
  {
    localObject1 = m54207b69.F54207b69_11("((58485D5F816053616955");
    String str = m54207b69.F54207b69_11("/S1C283D39252338443A3D402C");
    CobubLog.OooO0Oo(str, (String)localObject1);
    try
    {
      localObject1 = OooO0Oo();
      Object localObject2 = CommonUtil.OooO0o(this.OooO0Oo);
      Object localObject3 = UmsAgent.SendPolicy.o00Ooo0;
      if (localObject2 != localObject3) {
        break label196;
      }
      localObject2 = this.OooO0Oo;
      boolean bool = CommonUtil.OooOO0o((Context)localObject2);
      if (!bool) {
        break label196;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = UmsConstants.OooO0oO;
      ((StringBuilder)localObject2).append((String)localObject3);
      localObject3 = m54207b69.F54207b69_11("A21D486144214763484E704B624C6864");
      ((StringBuilder)localObject2).append((String)localObject3);
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject1 = ((JSONObject)localObject1).toString();
      localObject1 = NetworkUtil.OooO0O0(NetworkUtil.OooO00o((String)localObject2, (String)localObject1));
      if (localObject1 == null) {
        return;
      }
      int i = ((MyMessage)localObject1).getFlag();
      if (i >= 0) {
        break label196;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = m54207b69.F54207b69_11("H@05333432366509362C2E87");
      ((StringBuilder)localObject2).append((String)localObject3);
      int j = ((MyMessage)localObject1).getFlag();
      ((StringBuilder)localObject2).append(j);
      localObject3 = m54207b69.F54207b69_11("t{5737200B0C1F22254E");
      ((StringBuilder)localObject2).append((String)localObject3);
      localObject1 = ((MyMessage)localObject1).getMsg();
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = ((StringBuilder)localObject2).toString();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject1 = localException.toString();
      }
    }
    CobubLog.OooO0OO(str, (String)localObject1);
    label196:
  }
  
  public final JSONObject OooO0OO()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str1 = "UV372728403734";
    try
    {
      str1 = m54207b69.F54207b69_11(str1);
      str3 = AppInfo.getAppKey();
      localJSONObject.put(str1, str3);
      str1 = "]s1717071D141B201E";
      str1 = m54207b69.F54207b69_11(str1);
      str3 = DeviceInfo.getDeviceId();
      localJSONObject.put(str1, str3);
      str1 = "<b010F0D0A101B110D";
      str1 = m54207b69.F54207b69_11(str1);
      str3 = this.OooO0OO;
      localJSONObject.put(str1, str3);
    }
    catch (JSONException localJSONException)
    {
      String str3 = m54207b69.F54207b69_11("/S1C283D39252338443A3D402C");
      String str2 = localJSONException.toString();
      CobubLog.OooO0OO(str3, str2);
    }
    return localJSONObject;
  }
  
  public final JSONObject OooO0Oo()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str1 = "UV372728403734";
    try
    {
      str1 = m54207b69.F54207b69_11(str1);
      localObject = AppInfo.getAppKey();
      localJSONObject.put(str1, localObject);
      str1 = "]s1717071D141B201E";
      str1 = m54207b69.F54207b69_11(str1);
      localObject = DeviceInfo.getDeviceId();
      localJSONObject.put(str1, localObject);
      str1 = "U_2A2D3C303A40";
      str1 = m54207b69.F54207b69_11(str1);
      localObject = this.OooO0Oo;
      localObject = CommonUtil.OooOO0O((Context)localObject);
      localJSONObject.put(str1, localObject);
    }
    catch (JSONException localJSONException)
    {
      Object localObject = m54207b69.F54207b69_11("/S1C283D39252338443A3D402C");
      String str2 = localJSONException.toString();
      CobubLog.OooO0OO((String)localObject, str2);
    }
    return localJSONObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.OtherManager
 * JD-Core Version:    0.7.0.1
 */