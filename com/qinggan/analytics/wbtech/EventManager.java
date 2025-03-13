package com.qinggan.analytics.wbtech;

import android.content.Context;
import java.util.Map;
import m54207b69;
import org.json.JSONException;
import org.json.JSONObject;

class EventManager
{
  public final String OooO00o;
  public int OooO0O0;
  public Context OooO0OO;
  public String OooO0Oo;
  public Map OooO0o;
  public String OooO0o0;
  public final String OooO0oO;
  
  public EventManager(Context paramContext, String paramString1, String paramString2, int paramInt, Map paramMap)
  {
    String str = m54207b69.F54207b69_11("e$6153434D546E4B514D4C4B61");
    this.OooO0oO = str;
    str = m54207b69.F54207b69_11("u?104B544F14545653538353655D58");
    this.OooO00o = str;
    this.OooO0OO = paramContext;
    this.OooO0Oo = paramString1;
    this.OooO0o0 = paramString2;
    this.OooO0O0 = paramInt;
    this.OooO0o = paramMap;
  }
  
  public void OooO00o()
  {
    Object localObject1 = m54207b69.F54207b69_11("e$6153434D546E4B514D4C4B61");
    try
    {
      localObject2 = OooO0O0();
      Object localObject3 = CommonUtil.OooO0o(this.OooO0OO);
      Object localObject4 = UmsAgent.SendPolicy.o00Ooo0;
      String str1 = m54207b69.F54207b69_11("(C263628303B0F332C34");
      if (localObject3 == localObject4)
      {
        localObject3 = this.OooO0OO;
        boolean bool = CommonUtil.OooOO0o((Context)localObject3);
        if (bool)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject4 = UmsConstants.OooO0oO;
          ((StringBuilder)localObject3).append((String)localObject4);
          localObject4 = m54207b69.F54207b69_11("u?104B544F14545653538353655D58");
          ((StringBuilder)localObject3).append((String)localObject4);
          localObject3 = ((StringBuilder)localObject3).toString();
          localObject4 = ((JSONObject)localObject2).toString();
          localObject3 = NetworkUtil.OooO0O0(NetworkUtil.OooO00o((String)localObject3, (String)localObject4));
          if (localObject3 == null)
          {
            localObject1 = this.OooO0OO;
            CommonUtil.OooOOo0(str1, (JSONObject)localObject2, (Context)localObject1);
            return;
          }
          int j = ((MyMessage)localObject3).getFlag();
          if (j < 0)
          {
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            String str2 = m54207b69.F54207b69_11("H@05333432366509362C2E87");
            ((StringBuilder)localObject4).append(str2);
            int k = ((MyMessage)localObject3).getFlag();
            ((StringBuilder)localObject4).append(k);
            str2 = m54207b69.F54207b69_11("t{5737200B0C1F22254E");
            ((StringBuilder)localObject4).append(str2);
            str2 = ((MyMessage)localObject3).getMsg();
            ((StringBuilder)localObject4).append(str2);
            localObject4 = ((StringBuilder)localObject4).toString();
            CobubLog.OooO0OO((String)localObject1, (String)localObject4);
            int m = ((MyMessage)localObject3).getFlag();
            int i = -4;
            if (m == i)
            {
              localObject1 = this.OooO0OO;
              CommonUtil.OooOOo0(str1, (JSONObject)localObject2, (Context)localObject1);
            }
          }
          return;
        }
      }
      localObject1 = this.OooO0OO;
      CommonUtil.OooOOo0(str1, (JSONObject)localObject2, (Context)localObject1);
      return;
    }
    catch (Exception localException)
    {
      Object localObject2 = localException.toString();
      CobubLog.OooO0OO((String)localObject1, (String)localObject2);
    }
  }
  
  public final JSONObject OooO0O0()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    Object localObject1 = "NS273B4039";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject2 = DeviceInfo.getDeviceTime();
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = "/h1E0E1C1E050C0C";
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject2 = AppInfo.getAppVersion();
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = "=a0418061219430E0C0C181F1313151222";
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject2 = this.OooO0Oo;
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = "UV372728403734";
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject2 = AppInfo.getAppKey();
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = new com/qinggan/analytics/wbtech/SharedPrefUtil;
      localObject2 = this.OooO0OO;
      ((SharedPrefUtil)localObject1).<init>((Context)localObject2);
      localObject2 = ":'4645555155535965";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      String str2 = "]K083F3B3C322A4522323538";
      str2 = m54207b69.F54207b69_11(str2);
      Object localObject3 = this.OooO0OO;
      localObject3 = CommonUtil.OooO0OO((Context)localObject3);
      localObject1 = ((SharedPrefUtil)localObject1).OooO0OO(str2, (String)localObject3);
      localJSONObject.put((String)localObject2, localObject1);
      localObject1 = "|\\303E403C34";
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject2 = this.OooO0o0;
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = "acc";
      int i = this.OooO0O0;
      localJSONObject.put((String)localObject1, i);
      localObject1 = "ch091D1E0C0F050B140E25";
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject2 = "";
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = "U_2A2D3C303A40";
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject2 = this.OooO0OO;
      localObject2 = CommonUtil.OooOO0O((Context)localObject2);
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = "]s1717071D141B201E";
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject2 = DeviceInfo.getDeviceId();
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = this.OooO0o;
      if (localObject1 != null)
      {
        localObject1 = new org/json/JSONObject;
        localObject2 = this.OooO0o;
        ((JSONObject)localObject1).<init>((Map)localObject2);
        localObject2 = "=*4750605B474E5F";
        localObject2 = m54207b69.F54207b69_11((String)localObject2);
        localObject1 = ((JSONObject)localObject1).toString();
        localJSONObject.put((String)localObject2, localObject1);
      }
    }
    catch (JSONException localJSONException)
    {
      Object localObject2 = m54207b69.F54207b69_11("e$6153434D546E4B514D4C4B61");
      String str1 = localJSONException.toString();
      CobubLog.OooO0OO((String)localObject2, str1);
    }
    return localJSONObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.EventManager
 * JD-Core Version:    0.7.0.1
 */