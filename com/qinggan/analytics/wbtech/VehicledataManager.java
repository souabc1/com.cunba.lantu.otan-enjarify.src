package com.qinggan.analytics.wbtech;

import android.content.Context;
import m54207b69;
import org.json.JSONObject;

class VehicledataManager
{
  public final String OooO00o;
  public final String OooO0O0;
  public Context OooO0OO;
  public final String OooO0Oo;
  
  public VehicledataManager(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("fW013341413840383A3E2C40254246443F4236");
    this.OooO0Oo = str;
    str = m54207b69.F54207b69_11(")l0D030A21070A0E");
    this.OooO00o = str;
    str = m54207b69.F54207b69_11("=,035A4362076149666083534F515C4E58585E6A60");
    this.OooO0O0 = str;
    this.OooO0OO = paramContext;
  }
  
  public void OooO00o(JSONObject paramJSONObject)
  {
    String str1 = m54207b69.F54207b69_11("fW013341413840383A3E2C40254246443F4236");
    if (paramJSONObject == null)
    {
      paramJSONObject = m54207b69.F54207b69_11("5J1C3024262D2B3535334735752F4678334F3738");
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
      str2 = m54207b69.F54207b69_11("=,035A4362076149666083534F515C4E58585E6A60");
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
        paramJSONObject = m54207b69.F54207b69_11("K^0E322F2D822D413D3F463C46464C384E8E3E3D505150434450444C4D43");
        CobubLog.OooO0Oo(str1, paramJSONObject);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.VehicledataManager
 * JD-Core Version:    0.7.0.1
 */