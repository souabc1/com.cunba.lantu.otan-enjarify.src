package com.qinggan.analytics.wbtech;

import android.content.Context;
import m54207b69;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigManager
{
  public final String OooO00o;
  public Context OooO0O0;
  public final String OooO0OO;
  
  public ConfigManager(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("Pl2F04040D091027140A1615142A");
    this.OooO0OO = str;
    str = m54207b69.F54207b69_11("vU7A213A297E37362822444347473D24494B444E45343C4A38545355");
    this.OooO00o = str;
    this.OooO0O0 = paramContext;
  }
  
  public JSONObject OooO00o()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str1 = m54207b69.F54207b69_11("UV372728403734");
    String str2 = AppInfo.getAppKey();
    localJSONObject.put(str1, str2);
    return localJSONObject;
  }
  
  public void OooO0O0()
  {
    try
    {
      Object localObject1 = OooO00o();
      Object localObject2 = this.OooO0O0;
      boolean bool = CommonUtil.OooOO0o((Context)localObject2);
      if (bool)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject3 = UmsConstants.OooO0oO;
        ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = m54207b69.F54207b69_11("vU7A213A297E37362822444347473D24494B444E45343C4A38545355");
        ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).toString();
        localObject1 = ((JSONObject)localObject1).toString();
        localObject1 = NetworkUtil.OooO00o((String)localObject2, (String)localObject1);
        localObject2 = NetworkUtil.OooO0O0((String)localObject1);
        if (localObject2 == null) {
          return;
        }
        try
        {
          int i = ((MyMessage)localObject2).getFlag();
          if (i > 0)
          {
            localObject2 = new org/json/JSONObject;
            ((JSONObject)localObject2).<init>((String)localObject1);
            localObject1 = "J%4451534D46455750524F4E5C585759";
            localObject1 = m54207b69.F54207b69_11((String)localObject1);
            int j = ((JSONObject)localObject2).getInt((String)localObject1);
            localObject3 = null;
            int k = 1;
            if (j == 0) {
              UmsAgent.setAutoLocation(false);
            } else {
              UmsAgent.setAutoLocation(k);
            }
            localObject1 = "B<494D5A604C5E5959584E55606662";
            localObject1 = m54207b69.F54207b69_11((String)localObject1);
            j = ((JSONObject)localObject2).getInt((String)localObject1);
            if (j == 0) {
              UmsAgent.setUpdateOnlyWifi(false);
            } else {
              UmsAgent.setUpdateOnlyWifi(k);
            }
            localObject1 = "XD3622362E3A353A3230363148";
            localObject1 = m54207b69.F54207b69_11((String)localObject1);
            j = ((JSONObject)localObject2).getInt((String)localObject1);
            if (j == 0)
            {
              localObject3 = this.OooO0O0;
              UmsAgent.SendPolicy localSendPolicy = UmsAgent.SendPolicy.o00Ooo00;
              UmsAgent.OooO0o((Context)localObject3, localSendPolicy);
            }
            if (j == k)
            {
              localObject1 = this.OooO0O0;
              localObject3 = UmsAgent.SendPolicy.o00Ooo0;
              UmsAgent.OooO0o((Context)localObject1, (UmsAgent.SendPolicy)localObject3);
            }
            localObject1 = "h{081F0A0B16191B1D1A20211D14";
            localObject1 = m54207b69.F54207b69_11((String)localObject1);
            j = ((JSONObject)localObject2).getInt((String)localObject1) * 1000;
            long l = j;
            UmsAgent.setSessionContinueMillis(l);
          }
        }
        catch (JSONException localJSONException)
        {
          localObject2 = m54207b69.F54207b69_11("Pl2F04040D091027140A1615142A");
          CobubLog.OooO0O0((String)localObject2, localJSONException);
        }
      }
      label272:
      return;
    }
    catch (Exception localException)
    {
      break label272;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.ConfigManager
 * JD-Core Version:    0.7.0.1
 */