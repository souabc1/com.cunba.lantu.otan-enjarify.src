package com.qinggan.analytics.wbtech;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.format.Time;
import java.io.File;
import m54207b69;
import org.json.JSONException;
import org.json.JSONObject;

class UpdateManager
{
  public static Thread OooOO0O;
  public static String OooOO0o;
  public static Dialog OooOOO;
  public static boolean OooOOO0 = false;
  public static int OooOOOO;
  public static ProgressDialog OooOOOo;
  public final String OooO;
  public final String OooO00o;
  public String OooO0O0;
  public Context OooO0OO;
  public Handler OooO0Oo;
  public String OooO0o;
  public Runnable OooO0o0;
  public String OooO0oO;
  public String OooO0oo;
  public String OooOO0;
  
  public UpdateManager(Context paramContext)
  {
    Object localObject = m54207b69.F54207b69_11("_97F574E5A611E5D635622596757575E6567262B5F5D726E64741F");
    this.OooO0o = ((String)localObject);
    this.OooOO0 = null;
    this.OooO0O0 = null;
    this.OooO0oo = null;
    localObject = m54207b69.F54207b69_11("B+7E5C514D63536C514D53565965");
    this.OooO = ((String)localObject);
    localObject = m54207b69.F54207b69_11("<.015C4560054E51617767684D535A5D695752528E725F657163");
    this.OooO00o = ((String)localObject);
    localObject = new com/qinggan/analytics/wbtech/UpdateManager$1;
    ((UpdateManager.1)localObject).<init>(this);
    this.OooO0Oo = ((Handler)localObject);
    localObject = OooOOOo();
    this.OooO0oO = ((String)localObject);
    localObject = new com/qinggan/analytics/wbtech/UpdateManager$6;
    ((UpdateManager.6)localObject).<init>(this);
    this.OooO0o0 = ((Runnable)localObject);
    this.OooO0OO = paramContext;
  }
  
  public final void OooOOO()
  {
    Thread localThread = new java/lang/Thread;
    Runnable localRunnable = this.OooO0o0;
    localThread.<init>(localRunnable);
    OooOO0O = localThread;
    localThread.start();
  }
  
  public final void OooOOOO()
  {
    Object localObject1 = new java/io/File;
    Object localObject2 = this.OooO0oo;
    ((File)localObject1).<init>((String)localObject2);
    boolean bool = ((File)localObject1).exists();
    if (!bool) {
      return;
    }
    localObject2 = new android/content/Intent;
    Object localObject3 = m54207b69.F54207b69_11("(958585F4E5A55631E58605767635A25676A5E62696B2C85879487");
    ((Intent)localObject2).<init>((String)localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    String str = m54207b69.F54207b69_11("BQ37393F376F8384");
    ((StringBuilder)localObject3).append(str);
    localObject1 = ((File)localObject1).toString();
    ((StringBuilder)localObject3).append((String)localObject1);
    localObject1 = Uri.parse(((StringBuilder)localObject3).toString());
    localObject3 = m54207b69.F54207b69_11("8u1406071C201B1A08242325650F281F6A242C231A2E3127721D2D3039302F2E7734283840402836");
    ((Intent)localObject2).setDataAndType((Uri)localObject1, (String)localObject3);
    this.OooO0OO.startActivity((Intent)localObject2);
  }
  
  public String OooOOOo()
  {
    Time localTime = new android/text/format/Time;
    String str = m54207b69.F54207b69_11("R@01342B2473072B3032323832");
    localTime.<init>(str);
    localTime.setToNow();
    str = m54207b69.F54207b69_11("]g423F4C450E4F480A");
    return localTime.format(str);
  }
  
  public JSONObject OooOOo()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    String str1 = m54207b69.F54207b69_11("UV372728403734");
    String str2 = AppInfo.getAppKey();
    localJSONObject.put(str1, str2);
    str1 = CommonUtil.OooO0Oo(this.OooO0OO);
    str2 = m54207b69.F54207b69_11("DO392B3F3F2A25271734293535");
    localJSONObject.put(str2, str1);
    return localJSONObject;
  }
  
  public void OooOOo0()
  {
    try
    {
      Object localObject1 = OooOOo();
      localObject2 = this.OooO0OO;
      boolean bool = CommonUtil.OooOO0o((Context)localObject2);
      if (bool)
      {
        localObject2 = this.OooO0OO;
        bool = CommonUtil.OooOOO0((Context)localObject2);
        if (bool)
        {
          bool = UmsConstants.OooO0o;
          if (bool)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            Object localObject3 = UmsConstants.OooO0oO;
            ((StringBuilder)localObject2).append((String)localObject3);
            localObject3 = m54207b69.F54207b69_11("<.015C4560054E51617767684D535A5D695752528E725F657163");
            ((StringBuilder)localObject2).append((String)localObject3);
            localObject2 = ((StringBuilder)localObject2).toString();
            localObject1 = ((JSONObject)localObject1).toString();
            localObject1 = NetworkUtil.OooO0O0(NetworkUtil.OooO00o((String)localObject2, (String)localObject1));
            if (localObject1 == null) {
              return;
            }
            int i = ((MyMessage)localObject1).getFlag();
            if (i > 0) {
              try
              {
                localObject2 = new org/json/JSONObject;
                localObject1 = ((MyMessage)localObject1).getMsg();
                ((JSONObject)localObject2).<init>((String)localObject1);
                localObject1 = "2M2B222E2D";
                localObject1 = m54207b69.F54207b69_11((String)localObject1);
                localObject1 = ((JSONObject)localObject2).getString((String)localObject1);
                int j = Integer.parseInt((String)localObject1);
                if (j > 0)
                {
                  localObject1 = "/,4A46424C5D6346";
                  localObject1 = m54207b69.F54207b69_11((String)localObject1);
                  localObject1 = ((JSONObject)localObject2).getString((String)localObject1);
                  this.OooO0O0 = ((String)localObject1);
                  localObject1 = "msg";
                  ((JSONObject)localObject2).getString((String)localObject1);
                  localObject1 = "A'4149574746575D4A4E5C4C";
                  localObject1 = m54207b69.F54207b69_11((String)localObject1);
                  localObject1 = ((JSONObject)localObject2).getString((String)localObject1);
                  OooOO0o = (String)localObject1;
                  localObject1 = "aA25253425372D373C303739";
                  localObject1 = m54207b69.F54207b69_11((String)localObject1);
                  localObject1 = ((JSONObject)localObject2).getString((String)localObject1);
                  localObject3 = "NS273B4039";
                  localObject3 = m54207b69.F54207b69_11((String)localObject3);
                  ((JSONObject)localObject2).getString((String)localObject3);
                  localObject3 = "/h1E0E1C1E050C0C";
                  localObject3 = m54207b69.F54207b69_11((String)localObject3);
                  localObject2 = ((JSONObject)localObject2).getString((String)localObject3);
                  localObject3 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject3).<init>();
                  String str2 = this.OooO0o;
                  ((StringBuilder)localObject3).append(str2);
                  str2 = "\n";
                  ((StringBuilder)localObject3).append(str2);
                  ((StringBuilder)localObject3).append((String)localObject2);
                  localObject2 = ":";
                  ((StringBuilder)localObject3).append((String)localObject2);
                  ((StringBuilder)localObject3).append((String)localObject1);
                  localObject1 = ((StringBuilder)localObject3).toString();
                  this.OooOO0 = ((String)localObject1);
                  localObject1 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject1).<init>();
                  localObject2 = "ef491604080B190850";
                  localObject2 = m54207b69.F54207b69_11((String)localObject2);
                  ((StringBuilder)localObject1).append((String)localObject2);
                  localObject2 = this.OooO0oO;
                  ((StringBuilder)localObject1).append((String)localObject2);
                  localObject1 = ((StringBuilder)localObject1).toString();
                  this.OooO0oo = ((String)localObject1);
                  localObject1 = this.OooO0OO;
                  OooOo00((Context)localObject1);
                }
              }
              catch (JSONException localJSONException)
              {
                localJSONException.printStackTrace();
              }
            }
          }
        }
      }
      return;
    }
    catch (Exception localException)
    {
      Object localObject2 = m54207b69.F54207b69_11("B+7E5C514D63536C514D53565965");
      String str1 = localException.toString();
      CobubLog.OooO0OO((String)localObject2, str1);
    }
  }
  
  public final void OooOOoo(Context paramContext)
  {
    Object localObject = new android/app/ProgressDialog;
    ((ProgressDialog)localObject).<init>(paramContext);
    OooOOOo = (ProgressDialog)localObject;
    paramContext = m54207b69.F54207b69_11("af3317040A16084C1C11091C1C132111");
    ((Dialog)localObject).setTitle(paramContext);
    OooOOOo.setProgressStyle(1);
    paramContext = OooOOOo;
    localObject = new com/qinggan/analytics/wbtech/UpdateManager$5;
    ((UpdateManager.5)localObject).<init>(this);
    String str = m54207b69.F54207b69_11("yO0C2F232F2E28");
    paramContext.setButton(str, (DialogInterface.OnClickListener)localObject);
    OooOOOo.show();
    OooOOO();
  }
  
  public final void OooOo0(Context paramContext)
  {
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    localBuilder.<init>(paramContext);
    paramContext = m54207b69.F54207b69_11("GT243C3F3D24");
    localBuilder.setTitle(paramContext);
    paramContext = m54207b69.F54207b69_11("q}2E3A5F2120141F64211B2219692020186D291727221E");
    localBuilder.setMessage(paramContext);
    paramContext = new com/qinggan/analytics/wbtech/UpdateManager$4;
    paramContext.<init>(this);
    localBuilder.setNegativeButton("OK", paramContext);
    paramContext = localBuilder.create();
    OooOOO = paramContext;
    paramContext.show();
  }
  
  public void OooOo00(Context paramContext)
  {
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    localBuilder.<init>(paramContext);
    Object localObject = m54207b69.F54207b69_11("af3317040A16084C1C11091C1C132111");
    localBuilder.setTitle((CharSequence)localObject);
    localObject = this.OooOO0;
    localBuilder.setMessage((CharSequence)localObject);
    localObject = new com/qinggan/analytics/wbtech/UpdateManager$2;
    ((UpdateManager.2)localObject).<init>(this, paramContext);
    localBuilder.setPositiveButton("OK", (DialogInterface.OnClickListener)localObject);
    paramContext = new com/qinggan/analytics/wbtech/UpdateManager$3;
    paramContext.<init>(this);
    localObject = m54207b69.F54207b69_11("yO0C2F232F2E28");
    localBuilder.setNegativeButton((CharSequence)localObject, paramContext);
    paramContext = localBuilder.create();
    OooOOO = paramContext;
    paramContext.show();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.UpdateManager
 * JD-Core Version:    0.7.0.1
 */