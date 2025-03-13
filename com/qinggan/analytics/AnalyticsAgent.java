package com.qinggan.analytics;

import com.qinggan.analytics.wbtech.UmsAgent;

public class AnalyticsAgent
{
  public static final String OooO00o = "AnalyticsAgent";
  
  public static String getDeviceId()
  {
    return UmsAgent.getDeviceId();
  }
  
  public static void setAppVersion(String paramString)
  {
    UmsAgent.setAppVersion(paramString);
  }
  
  public static void setDeviceId(String paramString)
  {
    UmsAgent.setDeviceId(paramString);
  }
  
  public static void setSessionDuration(long paramLong)
  {
    UmsAgent.setSessionContinueMillis(paramLong);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.AnalyticsAgent
 * JD-Core Version:    0.7.0.1
 */