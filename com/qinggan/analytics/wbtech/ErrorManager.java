package com.qinggan.analytics.wbtech;

import android.content.Context;
import m54207b69;
import org.json.JSONException;
import org.json.JSONObject;

class ErrorManager
{
  public Context OooO00o;
  public final String OooO0O0;
  
  public ErrorManager(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("TP152324422622374539403F2D");
    this.OooO0O0 = str;
    this.OooO00o = paramContext;
  }
  
  public void OooO00o(String paramString)
  {
    Object localObject1 = m54207b69.F54207b69_11("TP152324422622374539403F2D");
    try
    {
      paramString = OooO0O0(paramString);
      Object localObject2 = CommonUtil.OooO0o(this.OooO00o);
      Object localObject3 = UmsAgent.SendPolicy.o00Ooo0;
      String str1 = m54207b69.F54207b69_11("u+4E5A5B475D674B544C");
      if (localObject2 == localObject3)
      {
        localObject2 = this.OooO00o;
        boolean bool = CommonUtil.OooOO0o((Context)localObject2);
        if (bool)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = UmsConstants.OooO0oO;
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject3 = m54207b69.F54207b69_11("(h471E071E4B1D0D2224362425132732161F");
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject3 = paramString.toString();
          localObject2 = NetworkUtil.OooO0O0(NetworkUtil.OooO00o((String)localObject2, (String)localObject3));
          if (localObject2 == null)
          {
            localObject1 = this.OooO00o;
            CommonUtil.OooOOo0(str1, paramString, (Context)localObject1);
            return;
          }
          int j = ((MyMessage)localObject2).getFlag();
          if (j >= 0) {
            break label247;
          }
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          String str2 = m54207b69.F54207b69_11("H@05333432366509362C2E87");
          ((StringBuilder)localObject3).append(str2);
          int k = ((MyMessage)localObject2).getFlag();
          ((StringBuilder)localObject3).append(k);
          str2 = m54207b69.F54207b69_11("t{5737200B0C1F22254E");
          ((StringBuilder)localObject3).append(str2);
          str2 = ((MyMessage)localObject2).getMsg();
          ((StringBuilder)localObject3).append(str2);
          localObject3 = ((StringBuilder)localObject3).toString();
          CobubLog.OooO0OO((String)localObject1, (String)localObject3);
          int m = ((MyMessage)localObject2).getFlag();
          int i = -4;
          if (m != i) {
            break label247;
          }
        }
      }
      localObject1 = this.OooO00o;
      CommonUtil.OooOOo0(str1, paramString, (Context)localObject1);
      label247:
      return;
    }
    catch (Exception paramString)
    {
      CobubLog.OooO0O0((String)localObject1, paramString);
    }
  }
  
  public final JSONObject OooO0O0(String paramString)
  {
    Object localObject = CommonUtil.OooO0OO(this.OooO00o);
    String str1 = AppInfo.getAppKey();
    String str2 = DeviceInfo.getOsVersion();
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str3 = "B%5652464952565D4B4E49";
    try
    {
      str3 = m54207b69.F54207b69_11(str3);
      localJSONObject.put(str3, paramString);
      paramString = "NS273B4039";
      paramString = m54207b69.F54207b69_11(paramString);
      str3 = DeviceInfo.getDeviceTime();
      localJSONObject.put(paramString, str3);
      paramString = ":'4645555155535965";
      paramString = m54207b69.F54207b69_11(paramString);
      localJSONObject.put(paramString, localObject);
      paramString = "UV372728403734";
      paramString = m54207b69.F54207b69_11(paramString);
      localJSONObject.put(paramString, str1);
      paramString = "'~110E230B1F11131E1919";
      paramString = m54207b69.F54207b69_11(paramString);
      localJSONObject.put(paramString, str2);
      paramString = "]s1717071D141B201E";
      paramString = m54207b69.F54207b69_11(paramString);
      localObject = DeviceInfo.getDeviceName();
      localJSONObject.put(paramString, localObject);
      paramString = "U_2A2D3C303A40";
      paramString = m54207b69.F54207b69_11(paramString);
      localObject = this.OooO00o;
      localObject = CommonUtil.OooOO0O((Context)localObject);
      localJSONObject.put(paramString, localObject);
      return localJSONObject;
    }
    catch (JSONException paramString)
    {
      localObject = m54207b69.F54207b69_11("TP152324422622374539403F2D");
      paramString = paramString.toString();
      CobubLog.OooO0OO((String)localObject, paramString);
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.ErrorManager
 * JD-Core Version:    0.7.0.1
 */