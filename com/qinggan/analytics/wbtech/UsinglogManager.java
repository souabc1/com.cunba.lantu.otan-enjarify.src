package com.qinggan.analytics.wbtech;

import android.content.Context;
import m54207b69;
import org.json.JSONException;
import org.json.JSONObject;

public class UsinglogManager
{
  public final String OooO00o;
  public Context OooO0O0;
  public final String OooO0OO;
  
  public UsinglogManager(Context paramContext)
  {
    String str = m54207b69.F54207b69_11(">$71584F4D474D514A714E54504F4E64");
    this.OooO0OO = str;
    str = m54207b69.F54207b69_11("(|530A13125711191610462913211723171541252E");
    this.OooO00o = str;
    this.OooO0O0 = paramContext;
  }
  
  public void OooO00o(String paramString)
  {
    paramString = m54207b69.F54207b69_11("fN0D30242572262625374447367274");
    Object localObject1 = m54207b69.F54207b69_11(">$71584F4D474D514A714E54504F4E64");
    CobubLog.OooO0Oo((String)localObject1, paramString);
    paramString = new com/qinggan/analytics/wbtech/SharedPrefUtil;
    Object localObject2 = this.OooO0O0;
    paramString.<init>((Context)localObject2);
    localObject2 = m54207b69.F54207b69_11("]K083F3B3C322A4522323538");
    Object localObject3 = "";
    String str1 = paramString.OooO0OO((String)localObject2, (String)localObject3);
    localObject2 = m54207b69.F54207b69_11("s-6E5961624C485F85605887575655");
    String str2 = paramString.OooO0OO((String)localObject2, (String)localObject3);
    localObject2 = m54207b69.F54207b69_11("Sz09200B0C171A1A2C1124162A311B21262F");
    long l1 = System.currentTimeMillis();
    l1 = paramString.OooO00o((String)localObject2, l1);
    paramString = CommonUtil.OooO0o0(l1);
    long l2 = System.currentTimeMillis();
    localObject2 = CommonUtil.OooO0o0(l2);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    l2 -= l1;
    localStringBuilder.append(l2);
    localStringBuilder.append((String)localObject3);
    String str3 = localStringBuilder.toString();
    localObject3 = this.OooO0O0;
    CommonUtil.OooOo00((Context)localObject3);
    Object localObject4 = this;
    String str4 = paramString;
    try
    {
      paramString = OooO0Oo(paramString, (String)localObject2, str3, str1, str2);
      localObject2 = CommonUtil.OooO0o(this.OooO0O0);
      localObject3 = UmsAgent.SendPolicy.o00Ooo0;
      localObject4 = m54207b69.F54207b69_11("m+4A496145614765596A4E574F");
      if (localObject2 == localObject3)
      {
        localObject2 = this.OooO0O0;
        boolean bool = CommonUtil.OooOO0o((Context)localObject2);
        if (bool)
        {
          localObject2 = m54207b69.F54207b69_11("xd140C1913480A0D17151B171B29511B19121C");
          CobubLog.OooO0Oo((String)localObject1, (String)localObject2);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = UmsConstants.OooO0oO;
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject3 = m54207b69.F54207b69_11("(|530A13125711191610462913211723171541252E");
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject3 = paramString.toString();
          localObject2 = NetworkUtil.OooO0O0(NetworkUtil.OooO00o((String)localObject2, (String)localObject3));
          if (localObject2 == null)
          {
            localObject1 = this.OooO0O0;
            CommonUtil.OooOOo0((String)localObject4, paramString, (Context)localObject1);
            return;
          }
          int j = ((MyMessage)localObject2).getFlag();
          if (j >= 0) {
            break label435;
          }
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          str4 = m54207b69.F54207b69_11("H@05333432366509362C2E87");
          ((StringBuilder)localObject3).append(str4);
          int k = ((MyMessage)localObject2).getFlag();
          ((StringBuilder)localObject3).append(k);
          str4 = m54207b69.F54207b69_11("t{5737200B0C1F22254E");
          ((StringBuilder)localObject3).append(str4);
          str4 = ((MyMessage)localObject2).getMsg();
          ((StringBuilder)localObject3).append(str4);
          localObject3 = ((StringBuilder)localObject3).toString();
          CobubLog.OooO0OO((String)localObject1, (String)localObject3);
          int m = ((MyMessage)localObject2).getFlag();
          j = -4;
          if (m != j)
          {
            m = ((MyMessage)localObject2).getFlag();
            int i = -5;
            if (m != i) {
              break label435;
            }
          }
        }
      }
      localObject1 = this.OooO0O0;
      CommonUtil.OooOOo0((String)localObject4, paramString, (Context)localObject1);
      label435:
      return;
    }
    catch (JSONException paramString)
    {
      CobubLog.OooO0O0((String)localObject1, paramString);
    }
  }
  
  public void OooO0O0(String paramString)
  {
    String str1 = m54207b69.F54207b69_11("`u36151B1C591F212E180F0A231C6A6A");
    String str2 = m54207b69.F54207b69_11(">$71584F4D474D514A714E54504F4E64");
    CobubLog.OooO0Oo(str2, str1);
    try
    {
      UmsAgent.OooO0Oo();
    }
    catch (Exception localException)
    {
      CobubLog.OooO0O0(str2, localException);
    }
    CommonUtil.OooOo00(this.OooO0O0);
    Context localContext = this.OooO0O0;
    str2 = CommonUtil.OooO0OO(localContext);
    CommonUtil.OooOOoo(localContext, str2, paramString);
  }
  
  public void OooO0OO(String paramString)
  {
    Object localObject1 = m54207b69.F54207b69_11(">$71584F4D474D514A714E54504F4E64");
    Object localObject2 = new com/qinggan/analytics/wbtech/SharedPrefUtil;
    Object localObject3 = this.OooO0O0;
    ((SharedPrefUtil)localObject2).<init>((Context)localObject3);
    localObject3 = m54207b69.F54207b69_11("]K083F3B3C322A4522323538");
    String str1 = "";
    String str2 = ((SharedPrefUtil)localObject2).OooO0OO((String)localObject3, str1);
    boolean bool1 = str2.equals(str1);
    String str3 = m54207b69.F54207b69_11("Sz09200B0C171A1A2C1124162A311B21262F");
    String str4;
    if (bool1)
    {
      ((SharedPrefUtil)localObject2).OooO0o((String)localObject3, paramString);
      long l1 = System.currentTimeMillis();
      ((SharedPrefUtil)localObject2).OooO0Oo(str3, l1);
    }
    else
    {
      long l2 = Long.valueOf(System.currentTimeMillis()).longValue();
      l2 = ((SharedPrefUtil)localObject2).OooO00o(str3, l2);
      str4 = CommonUtil.OooO0o0(l2);
      long l3 = System.currentTimeMillis();
      str2 = CommonUtil.OooO0o0(l3);
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      l2 = l3 - l2;
      ((StringBuilder)localObject4).append(l2);
      ((StringBuilder)localObject4).append(str1);
      str1 = ((StringBuilder)localObject4).toString();
      ((SharedPrefUtil)localObject2).OooO0o((String)localObject3, paramString);
      ((SharedPrefUtil)localObject2).OooO0Oo(str3, l3);
      localObject4 = this;
    }
    try
    {
      paramString = OooO0Oo(str4, str2, str1, paramString, null);
      localObject2 = CommonUtil.OooO0o(this.OooO0O0);
      localObject3 = UmsAgent.SendPolicy.o00Ooo0;
      str1 = m54207b69.F54207b69_11("m+4A496145614765596A4E574F");
      if (localObject2 == localObject3)
      {
        localObject2 = this.OooO0O0;
        boolean bool2 = CommonUtil.OooOO0o((Context)localObject2);
        if (bool2)
        {
          localObject2 = m54207b69.F54207b69_11("xd140C1913480A0D17151B171B29511B19121C");
          CobubLog.OooO0Oo((String)localObject1, (String)localObject2);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = UmsConstants.OooO0oO;
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject3 = m54207b69.F54207b69_11("(|530A13125711191610462913211723171541252E");
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject2 = ((StringBuilder)localObject2).toString();
          localObject3 = paramString.toString();
          localObject2 = NetworkUtil.OooO0O0(NetworkUtil.OooO00o((String)localObject2, (String)localObject3));
          if (localObject2 == null)
          {
            localObject1 = this.OooO0O0;
            CommonUtil.OooOOo0(str1, paramString, (Context)localObject1);
            return;
          }
          int k = ((MyMessage)localObject2).getFlag();
          if (k >= 0) {
            break label461;
          }
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          str2 = m54207b69.F54207b69_11("H@05333432366509362C2E87");
          ((StringBuilder)localObject3).append(str2);
          int i = ((MyMessage)localObject2).getFlag();
          ((StringBuilder)localObject3).append(i);
          str2 = m54207b69.F54207b69_11("t{5737200B0C1F22254E");
          ((StringBuilder)localObject3).append(str2);
          str2 = ((MyMessage)localObject2).getMsg();
          ((StringBuilder)localObject3).append(str2);
          localObject3 = ((StringBuilder)localObject3).toString();
          CobubLog.OooO0OO((String)localObject1, (String)localObject3);
          int m = ((MyMessage)localObject2).getFlag();
          k = -4;
          if (m != k)
          {
            m = ((MyMessage)localObject2).getFlag();
            int j = -5;
            if (m != j) {
              break label461;
            }
          }
        }
      }
      localObject1 = this.OooO0O0;
      CommonUtil.OooOOo0(str1, paramString, (Context)localObject1);
      label461:
      return;
    }
    catch (JSONException paramString)
    {
      CobubLog.OooO0O0((String)localObject1, paramString);
    }
  }
  
  public JSONObject OooO0Oo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str1 = CommonUtil.OooOO0(this.OooO0O0);
    String str2 = m54207b69.F54207b69_11("_2415843445F626274635F");
    localJSONObject.put(str2, str1);
    str1 = m54207b69.F54207b69_11("Cd1711071914400F1410111722");
    localJSONObject.put(str1, paramString1);
    paramString1 = m54207b69.F54207b69_11("SH2D272E1A29262A2B2944");
    localJSONObject.put(paramString1, paramString2);
    paramString1 = m54207b69.F54207b69_11("4b061812061A101313");
    localJSONObject.put(paramString1, paramString3);
    paramString1 = m54207b69.F54207b69_11("/h1E0E1C1E050C0C");
    paramString2 = AppInfo.getAppVersion();
    localJSONObject.put(paramString1, paramString2);
    paramString1 = m54207b69.F54207b69_11("/W36352541254329453A2D");
    localJSONObject.put(paramString1, paramString4);
    paramString1 = m54207b69.F54207b69_11("N545555453");
    localJSONObject.put(paramString1, paramString5);
    paramString1 = m54207b69.F54207b69_11("UV372728403734");
    paramString2 = AppInfo.getAppKey();
    localJSONObject.put(paramString1, paramString2);
    paramString1 = CommonUtil.OooOO0O(this.OooO0O0);
    paramString2 = m54207b69.F54207b69_11("U_2A2D3C303A40");
    localJSONObject.put(paramString2, paramString1);
    paramString1 = m54207b69.F54207b69_11("]s1717071D141B201E");
    paramString2 = DeviceInfo.getDeviceId();
    localJSONObject.put(paramString1, paramString2);
    return localJSONObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.UsinglogManager
 * JD-Core Version:    0.7.0.1
 */