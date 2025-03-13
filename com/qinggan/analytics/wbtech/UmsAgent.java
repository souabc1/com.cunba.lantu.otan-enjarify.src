package com.qinggan.analytics.wbtech;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.text.ParseException;
import m54207b69;

public class UmsAgent
{
  public static Handler OooO00o;
  public static Context OooO0O0;
  public static UsinglogManager OooO0OO;
  
  static
  {
    Object localObject1 = new android/os/HandlerThread;
    Object localObject2 = m54207b69.F54207b69_11("ZC162F3205282B333E");
    ((HandlerThread)localObject1).<init>((String)localObject2);
    ((Thread)localObject1).start();
    localObject2 = new android/os/Handler;
    localObject1 = ((HandlerThread)localObject1).getLooper();
    ((Handler)localObject2).<init>((Looper)localObject1);
    OooO00o = (Handler)localObject2;
  }
  
  public static void OooO0Oo()
  {
    Object localObject1 = OooO0O0;
    boolean bool = CommonUtil.OooOOO((Context)localObject1);
    Object localObject3 = m54207b69.F54207b69_11("sJ1F081B0E31342A45");
    Object localObject2;
    if (bool)
    {
      try
      {
        localObject1 = OooO0O0;
        localObject1 = CommonUtil.OooO0O0((Context)localObject1);
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str = "\\67854431949584B4C676262216B5F1A25";
        str = m54207b69.F54207b69_11(str);
        localStringBuilder.append(str);
        localStringBuilder.append((String)localObject1);
        localObject1 = localStringBuilder.toString();
        CobubLog.OooO0Oo((String)localObject3, (String)localObject1);
      }
      catch (ParseException localParseException)
      {
        CobubLog.OooO0O0((String)localObject3, localParseException);
      }
      localObject2 = new java/lang/Thread;
      localObject3 = new com/qinggan/analytics/wbtech/UmsAgent$3;
      ((UmsAgent.3)localObject3).<init>();
      ((Thread)localObject2).<init>((Runnable)localObject3);
      localObject3 = OooO00o;
      ((Handler)localObject3).post((Runnable)localObject2);
    }
    else
    {
      localObject2 = m54207b69.F54207b69_11("(S1D3D29763678433D2C7C2A412C2D484B4D90854A50528A3E8B3C563B43904E5E5A575F4A975C584E5A");
      CobubLog.OooO0Oo((String)localObject3, (String)localObject2);
    }
  }
  
  public static void OooO0o(Context paramContext, UmsAgent.SendPolicy paramSendPolicy)
  {
    UmsConstants.OooO0o0 = paramSendPolicy;
    paramContext = new java/lang/StringBuilder;
    paramContext.<init>();
    String str = m54207b69.F54207b69_11("f'5443556646464C59535C7F4D6355636287595D6158731D311F");
    paramContext.append(str);
    paramSendPolicy = String.valueOf(paramSendPolicy);
    paramContext.append(paramSendPolicy);
    paramSendPolicy = m54207b69.F54207b69_11("sJ1F081B0E31342A45");
    paramContext = paramContext.toString();
    CobubLog.OooO0Oo(paramSendPolicy, paramContext);
  }
  
  public static void OooO0o0(Context paramContext)
  {
    Object localObject = m54207b69.F54207b69_11("sJ1F081B0E31342A45");
    String str = m54207b69.F54207b69_11("3W2739262623432A2A402E3826443D");
    CobubLog.OooO0Oo((String)localObject, str);
    boolean bool = CommonUtil.OooOO0o(paramContext);
    if (bool)
    {
      localObject = new com/qinggan/analytics/wbtech/UploadHistoryLog;
      ((UploadHistoryLog)localObject).<init>(paramContext);
      paramContext = OooO00o;
      paramContext.post((Runnable)localObject);
    }
  }
  
  public static UmsAgent.SendPolicy getDefaultReportPolicy()
  {
    return UmsConstants.OooO0o0;
  }
  
  public static String getDeviceId()
  {
    return DeviceInfo.getDeviceId();
  }
  
  public static void setAppVersion(String paramString)
  {
    AppInfo.setAppVersion(paramString);
  }
  
  public static void setAutoLocation(boolean paramBoolean)
  {
    UmsConstants.OooO0Oo = paramBoolean;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str1 = m54207b69.F54207b69_11("9>4D5C4C824F4F577959666955635E5E2D132F");
    ((StringBuilder)localObject).append(str1);
    String str2 = String.valueOf(paramBoolean);
    ((StringBuilder)localObject).append(str2);
    str2 = m54207b69.F54207b69_11("sJ1F081B0E31342A45");
    localObject = ((StringBuilder)localObject).toString();
    CobubLog.OooO0Oo(str2, (String)localObject);
  }
  
  public static void setDebugEnabled(boolean paramBoolean)
  {
    UmsConstants.OooO00o = paramBoolean;
  }
  
  public static void setDebugLevel(UmsAgent.LogLevel paramLogLevel)
  {
    UmsConstants.OooO0O0 = paramLogLevel;
  }
  
  public static void setDeviceId(String paramString)
  {
    DeviceInfo.setDeviceId(paramString);
  }
  
  public static void setSessionContinueMillis(long paramLong)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("|Z2940300C432E2F3A3D3D2340403B41433F5029464A4B4940928094");
    ((StringBuilder)localObject).append(str);
    str = String.valueOf(paramLong);
    ((StringBuilder)localObject).append(str);
    str = m54207b69.F54207b69_11("sJ1F081B0E31342A45");
    localObject = ((StringBuilder)localObject).toString();
    CobubLog.OooO0Oo(str, (String)localObject);
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool) {
      UmsConstants.OooO0OO = paramLong;
    }
  }
  
  public static void setUpdateOnlyWifi(boolean paramBoolean)
  {
    UmsConstants.OooO0o = paramBoolean;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str1 = m54207b69.F54207b69_11("_L3F2A3A1C402D333F310C2C2B41283339357D837F");
    ((StringBuilder)localObject).append(str1);
    String str2 = String.valueOf(paramBoolean);
    ((StringBuilder)localObject).append(str2);
    str2 = m54207b69.F54207b69_11("sJ1F081B0E31342A45");
    localObject = ((StringBuilder)localObject).toString();
    CobubLog.OooO0Oo(str2, (String)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.UmsAgent
 * JD-Core Version:    0.7.0.1
 */