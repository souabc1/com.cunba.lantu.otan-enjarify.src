package com.qinggan.analytics.wbtech;

import android.content.Context;
import m54207b69;
import org.json.JSONObject;

class SysdataManager
{
  public final String OooO00o;
  public final String OooO0O0;
  public Context OooO0OO;
  public final String OooO0Oo;
  
  public SysdataManager(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("5_0C272E3E42304419463A4843463A");
    this.OooO0Oo = str;
    str = m54207b69.F54207b69_11(")l0D030A21070A0E");
    this.OooO00o = str;
    str = m54207b69.F54207b69_11("I_702B342F7434363333153037474B394D");
    this.OooO0O0 = str;
    this.OooO0OO = paramContext;
  }
  
  public void OooO00o(JSONObject paramJSONObject)
  {
    String str1 = m54207b69.F54207b69_11("5_0C272E3E42304419463A4843463A");
    if (paramJSONObject == null)
    {
      paramJSONObject = m54207b69.F54207b69_11("^@133A352725392767313C6A3941393A");
      CobubLog.OooO0OO(str1, paramJSONObject);
      return;
    }
    Object localObject = this.OooO0OO;
    boolean bool = CommonUtil.OooOO0o((Context)localObject);
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = UmsConstants.OooO0oO;
      ((StringBuilder)localObject).append(str2);
      str2 = m54207b69.F54207b69_11("I_702B342F7434363333153037474B394D");
      ((StringBuilder)localObject).append(str2);
      localObject = ((StringBuilder)localObject).toString();
      paramJSONObject = paramJSONObject.toString();
      paramJSONObject = NetworkUtil.OooO0O0(NetworkUtil.OooO00o((String)localObject, paramJSONObject));
      if (paramJSONObject == null) {
        return;
      }
      int i = paramJSONObject.getFlag();
      if (i < 0)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str2 = m54207b69.F54207b69_11("H@05333432366509362C2E87");
        ((StringBuilder)localObject).append(str2);
        int j = paramJSONObject.getFlag();
        ((StringBuilder)localObject).append(j);
        str2 = m54207b69.F54207b69_11("t{5737200B0C1F22254E");
        ((StringBuilder)localObject).append(str2);
        paramJSONObject = paramJSONObject.getMsg();
        ((StringBuilder)localObject).append(paramJSONObject);
        paramJSONObject = ((StringBuilder)localObject).toString();
        CobubLog.OooO0OO(str1, paramJSONObject);
      }
      else
      {
        paramJSONObject = m54207b69.F54207b69_11(".d340C1913481C231E080E1A1050241F161712292A16261E1F35");
        CobubLog.OooO0Oo(str1, paramJSONObject);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.SysdataManager
 * JD-Core Version:    0.7.0.1
 */