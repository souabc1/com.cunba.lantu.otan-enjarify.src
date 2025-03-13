package com.qinggan.analytics.wbtech;

import android.content.Context;
import m54207b69;
import org.json.JSONObject;

class ClientdataManager
{
  public final String OooO00o;
  public final String OooO0O0;
  public Context OooO0OO;
  public final String OooO0Oo;
  
  public ClientdataManager(Context paramContext)
  {
    String str = m54207b69.F54207b69_11(".k28080411092415112713301511171A1D29");
    this.OooO0Oo = str;
    str = m54207b69.F54207b69_11(")l0D030A21070A0E");
    this.OooO0O0 = str;
    str = m54207b69.F54207b69_11("5)065D465D0A5E4C6165734F4B58546B7C586E5A");
    this.OooO00o = str;
    this.OooO0OO = paramContext;
    DeviceInfo.OooO0O0(paramContext);
    AppInfo.OooO00o(paramContext);
  }
  
  public void OooO00o()
  {
    Object localObject1 = m54207b69.F54207b69_11(".k28080411092415112713301511171A1D29");
    try
    {
      JSONObject localJSONObject = OooO0O0();
      Object localObject2 = CommonUtil.OooO0o(this.OooO0OO);
      Object localObject3 = UmsAgent.SendPolicy.o00Ooo0;
      int i;
      if (localObject2 == localObject3)
      {
        i = 1;
      }
      else
      {
        i = 0;
        localObject2 = null;
      }
      int j = CommonUtil.OooOO0o(this.OooO0OO);
      i &= j;
      localObject3 = m54207b69.F54207b69_11("m$47494F444E55664C584E");
      if (i != 0)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject4 = UmsConstants.OooO0oO;
        ((StringBuilder)localObject2).append((String)localObject4);
        localObject4 = m54207b69.F54207b69_11("5)065D465D0A5E4C6165734F4B58546B7C586E5A");
        ((StringBuilder)localObject2).append((String)localObject4);
        localObject2 = ((StringBuilder)localObject2).toString();
        localObject4 = localJSONObject.toString();
        localObject2 = NetworkUtil.OooO0O0(NetworkUtil.OooO00o((String)localObject2, (String)localObject4));
        if (localObject2 == null)
        {
          localObject1 = this.OooO0OO;
          CommonUtil.OooOOo0((String)localObject3, localJSONObject, (Context)localObject1);
          return;
        }
        int k = ((MyMessage)localObject2).getFlag();
        if (k < 0)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          String str = m54207b69.F54207b69_11("H@05333432366509362C2E87");
          ((StringBuilder)localObject4).append(str);
          int m = ((MyMessage)localObject2).getFlag();
          ((StringBuilder)localObject4).append(m);
          str = m54207b69.F54207b69_11("t{5737200B0C1F22254E");
          ((StringBuilder)localObject4).append(str);
          str = ((MyMessage)localObject2).getMsg();
          ((StringBuilder)localObject4).append(str);
          localObject4 = ((StringBuilder)localObject4).toString();
          CobubLog.OooO0OO((String)localObject1, (String)localObject4);
          int n = ((MyMessage)localObject2).getFlag();
          i = -4;
          if (n != i) {}
        }
      }
      else
      {
        localObject1 = this.OooO0OO;
        CommonUtil.OooOOo0((String)localObject3, localJSONObject, (Context)localObject1);
      }
      return;
    }
    catch (Exception localException)
    {
      CobubLog.OooO0O0((String)localObject1, localException);
    }
  }
  
  public JSONObject OooO0O0()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str1 = m54207b69.F54207b69_11("]s1717071D141B201E");
    String str2 = DeviceInfo.getDeviceId();
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("'~110E230B1F11131E1919");
    str2 = DeviceInfo.getOsVersion();
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("'0405D53475A644864");
    str2 = m54207b69.F54207b69_11(")l0D030A21070A0E");
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("<]313D353D2C41403F");
    str2 = DeviceInfo.getLanguage();
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("UV372728403734");
    str2 = AppInfo.getAppKey();
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("N?4D5B4E53574F515D585A");
    str2 = DeviceInfo.getResolution();
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("ga08130E11070D130B0D0D21130E11");
    localJSONObject.put(str1, true);
    str1 = m54207b69.F54207b69_11("NF362F2B2B2737453D2B");
    int i = DeviceInfo.getPhoneType();
    localJSONObject.put(str1, i);
    str1 = m54207b69.F54207b69_11(",75E5B4661");
    str2 = DeviceInfo.getIMSI();
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("E8555C5D585A60");
    str2 = DeviceInfo.getMCCMNC();
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("K_313B2D2B34323A");
    str2 = DeviceInfo.getNetworkTypeWIFI2G3G();
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("NS273B4039");
    str2 = DeviceInfo.getDeviceTime();
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("/h1E0E1C1E050C0C");
    str2 = AppInfo.getAppVersion();
    localJSONObject.put(str1, str2);
    str1 = CommonUtil.OooOO0O(this.OooO0OO);
    str2 = m54207b69.F54207b69_11("U_2A2D3C303A40");
    localJSONObject.put(str2, str1);
    str1 = m54207b69.F54207b69_11("<g0A0905150F070F0D120B");
    str2 = DeviceInfo.getDeviceProduct();
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("(R3638263E353C423A4740");
    str2 = DeviceInfo.getDeviceName();
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("pZ2D343E363B403F");
    str2 = DeviceInfo.getWifiMac();
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("N*424C5E524C63");
    boolean bool1 = DeviceInfo.getBluetoothAvailable();
    localJSONObject.put(str1, bool1);
    str1 = m54207b69.F54207b69_11("UL242E3C2C3F2A302C");
    bool1 = DeviceInfo.getWiFiAvailable();
    localJSONObject.put(str1, bool1);
    str1 = m54207b69.F54207b69_11("R8505A5060634D51");
    str2 = DeviceInfo.getGPSAvailable();
    localJSONObject.put(str1, str2);
    str1 = m54207b69.F54207b69_11("-m050D1D0B0E2412220C221E");
    bool1 = DeviceInfo.getGravityAvailable();
    localJSONObject.put(str1, bool1);
    str1 = m54207b69.F54207b69_11("Yc0A0F080D");
    str2 = DeviceInfo.getDeviceIMEI();
    localJSONObject.put(str1, str2);
    str1 = CommonUtil.OooO0oO(this.OooO0OO);
    str2 = m54207b69.F54207b69_11("$d17060A13");
    localJSONObject.put(str2, str1);
    boolean bool2 = UmsConstants.OooO0Oo;
    if (bool2)
    {
      str1 = m54207b69.F54207b69_11(".D2826323034362628");
      str2 = DeviceInfo.getLatitude();
      localJSONObject.put(str1, str2);
      str1 = m54207b69.F54207b69_11("E?5351535B5A50506262");
      str2 = DeviceInfo.getLongitude();
      localJSONObject.put(str1, str2);
    }
    return localJSONObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.ClientdataManager
 * JD-Core Version:    0.7.0.1
 */