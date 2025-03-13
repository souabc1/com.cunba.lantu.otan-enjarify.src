package com.qinggan.analytics.wbtech;

import m54207b69;
import org.json.JSONException;
import org.json.JSONObject;

class NetworkUtil
{
  public static String OooO00o(String paramString1, String paramString2)
  {
    return null;
  }
  
  public static MyMessage OooO0O0(String paramString)
  {
    String str1 = m54207b69.F54207b69_11("3,624A5A5E47634D80604E4A");
    if (paramString == null) {
      return null;
    }
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      paramString = new com/qinggan/analytics/wbtech/MyMessage;
      paramString.<init>();
      String str2 = "2M2B222E2D";
      str2 = m54207b69.F54207b69_11(str2);
      int i = ((JSONObject)localObject).getInt(str2);
      paramString.setFlag(i);
      str2 = "msg";
      localObject = ((JSONObject)localObject).getString(str2);
      paramString.setMsg((String)localObject);
      return paramString;
    }
    catch (Exception paramString)
    {
      CobubLog.OooO0O0(str1, paramString);
      return null;
    }
    catch (JSONException paramString)
    {
      CobubLog.OooO0O0(str1, paramString);
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.NetworkUtil
 * JD-Core Version:    0.7.0.1
 */