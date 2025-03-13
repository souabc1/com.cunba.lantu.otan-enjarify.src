package com.qinggan.analytics.wbtech;

import android.content.Context;
import m54207b69;
import org.json.JSONException;
import org.json.JSONObject;

class TagManager
{
  public final String OooO00o;
  public Context OooO0O0;
  public final String OooO0OO;
  public String OooO0Oo;
  
  public TagManager(Context paramContext, String paramString)
  {
    String str = m54207b69.F54207b69_11("yU0135341B38403A393830");
    this.OooO0OO = str;
    str = m54207b69.F54207b69_11(":t5B021B0A5F09210E08091F1E");
    this.OooO00o = str;
    this.OooO0O0 = paramContext;
    this.OooO0Oo = paramString;
  }
  
  public void OooO00o()
  {
    Object localObject1 = m54207b69.F54207b69_11("yU0135341B38403A393830");
    try
    {
      JSONObject localJSONObject = OooO0O0();
      Object localObject2 = CommonUtil.OooO0o(this.OooO0O0);
      Object localObject3 = UmsAgent.SendPolicy.o00Ooo0;
      String str1 = m54207b69.F54207b69_11(":r06141704");
      if (localObject2 == localObject3)
      {
        localObject2 = this.OooO0O0;
        boolean bool = CommonUtil.OooOO0o((Context)localObject2);
        if (bool)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = UmsConstants.OooO0oO;
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject3 = m54207b69.F54207b69_11(":t5B021B0A5F09210E08091F1E");
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject3 = localJSONObject.toString();
          localObject2 = NetworkUtil.OooO0O0(NetworkUtil.OooO00o((String)localObject2, (String)localObject3));
          if (localObject2 == null)
          {
            localObject1 = this.OooO0O0;
            CommonUtil.OooOOo0(str1, localJSONObject, (Context)localObject1);
            return;
          }
          int j = ((MyMessage)localObject2).getFlag();
          if (j >= 0) {
            break label246;
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
            break label246;
          }
        }
      }
      localObject1 = this.OooO0O0;
      CommonUtil.OooOOo0(str1, localJSONObject, (Context)localObject1);
      label246:
      return;
    }
    catch (Exception localException)
    {
      CobubLog.OooO0O0((String)localObject1, localException);
    }
  }
  
  public final JSONObject OooO0O0()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str1 = ":r06141704";
    try
    {
      str1 = m54207b69.F54207b69_11(str1);
      String str2 = this.OooO0Oo;
      localJSONObject.put(str1, str2);
      str1 = "]s1717071D141B201E";
      str1 = m54207b69.F54207b69_11(str1);
      str2 = DeviceInfo.getDeviceId();
      localJSONObject.put(str1, str2);
      str1 = "UV372728403734";
      str1 = m54207b69.F54207b69_11(str1);
      str2 = AppInfo.getAppKey();
      localJSONObject.put(str1, str2);
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
    }
    return localJSONObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.TagManager
 * JD-Core Version:    0.7.0.1
 */