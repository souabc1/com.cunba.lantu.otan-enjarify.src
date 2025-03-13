package com.just.agentweb.download;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat.Action;
import androidx.core.app.NotificationCompat.Builder;
import com.cunba.lantu.otan.R.drawable;
import com.just.agentweb.R.string;
import com.just.agentweb.utils.AgentWebUtils;
import com.just.agentweb.utils.LogUtils;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import m54207b69;

public class DownloadNotifier
{
  public static final String OooOO0o = "DownloadNotifier";
  public String OooO;
  public int OooO00o;
  public int OooO0O0;
  public NotificationManager OooO0OO;
  public Notification OooO0Oo;
  public Context OooO0o;
  public NotificationCompat.Builder OooO0o0;
  public String OooO0oO;
  public volatile boolean OooO0oo;
  public File OooOO0;
  public NotificationCompat.Action OooOO0O;
  
  public DownloadNotifier(Context paramContext, int paramInt)
  {
    long l = SystemClock.uptimeMillis();
    int i = (int)l;
    this.OooO00o = i;
    this.OooO0oO = "";
    i = 0;
    this.OooO0oo = false;
    this.OooO0O0 = paramInt;
    this.OooO0o = paramContext;
    String str1 = m54207b69.F54207b69_11("Cl02041A080E0A1514200E0D0D");
    Object localObject1 = (NotificationManager)paramContext.getSystemService(str1);
    this.OooO0OO = ((NotificationManager)localObject1);
    try
    {
      localObject1 = new androidx/core/app/NotificationCompat$Builder;
      Object localObject2 = this.OooO0o;
      String str2 = ((Context)localObject2).getPackageName();
      String str3 = "QW773732353D2826393D816D8473867386";
      str3 = m54207b69.F54207b69_11(str3);
      str2 = str2.concat(str3);
      this.OooO0oO = str2;
      ((NotificationCompat.Builder)localObject1).<init>((Context)localObject2, str2);
      this.OooO0o0 = ((NotificationCompat.Builder)localObject1);
      localObject1 = new android/app/NotificationChannel;
      localObject2 = this.OooO0oO;
      paramContext = AgentWebUtils.OooOO0O(paramContext);
      int j = 2;
      ((NotificationChannel)localObject1).<init>((String)localObject2, paramContext, j);
      paramContext = this.OooO0o;
      paramContext = paramContext.getSystemService(str1);
      paramContext = (NotificationManager)paramContext;
      paramContext.createNotificationChannel((NotificationChannel)localObject1);
      ((NotificationChannel)localObject1).enableLights(false);
      ((NotificationChannel)localObject1).enableVibration(false);
      paramContext = null;
      ((NotificationChannel)localObject1).setSound(null, null);
    }
    finally
    {
      paramInt = LogUtils.isDebug();
      if (paramInt != 0) {
        paramContext.printStackTrace();
      }
    }
  }
  
  private void setDelecte(PendingIntent paramPendingIntent)
  {
    this.OooO0o0.getNotification().deleteIntent = paramPendingIntent;
  }
  
  public final void OooO(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.OooO0o0.OooOOO(paramInt1, paramInt2, paramBoolean);
    OooO0oo();
  }
  
  public final PendingIntent OooO00o(Context paramContext, int paramInt, String paramString)
  {
    Object localObject = new android/content/Intent;
    ((Intent)localObject).<init>(paramContext, NotificationCancelReceiver.class);
    String str1 = m54207b69.F54207b69_11("@~1D121553231E2117121225275C2A2D1F2D2C24252F2F");
    ((Intent)localObject).setAction(str1);
    ((Intent)localObject).putExtra("TAG", paramString);
    paramInt <<= 3;
    paramContext = PendingIntent.getBroadcast(paramContext, paramInt, (Intent)localObject, 134217728);
    paramString = OooOO0o;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str1 = m54207b69.F54207b69_11("{f0F035C5D5961");
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append(paramInt);
    String str2 = ((StringBuilder)localObject).toString();
    LogUtils.OooO0OO(paramString, str2);
    return paramContext;
  }
  
  public void OooO0O0()
  {
    NotificationManager localNotificationManager = this.OooO0OO;
    int i = this.OooO0O0;
    localNotificationManager.cancel(i);
  }
  
  public final boolean OooO0OO()
  {
    PendingIntent localPendingIntent = this.OooO0o0.getNotification().deleteIntent;
    boolean bool;
    if (localPendingIntent != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localPendingIntent = null;
    }
    return bool;
  }
  
  public void OooO0Oo(DownloadTask paramDownloadTask)
  {
    Object localObject1 = paramDownloadTask.getFile().getName();
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    if (bool)
    {
      localObject1 = this.OooO0o;
      i = R.string.agentweb_file_download;
      localObject1 = ((Context)localObject1).getString(i);
    }
    else
    {
      localObject1 = paramDownloadTask.getFile().getName();
    }
    int i = ((String)localObject1).length();
    int j = 20;
    if (i > j)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "...";
      ((StringBuilder)localObject2).append((String)localObject3);
      k = ((String)localObject1).length() - j;
      j = ((String)localObject1).length();
      localObject1 = ((String)localObject1).substring(k, j);
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = ((StringBuilder)localObject2).toString();
    }
    Object localObject2 = this.OooO0o0;
    Object localObject4 = this.OooO0o;
    Object localObject3 = new android/content/Intent;
    ((Intent)localObject3).<init>();
    localObject4 = PendingIntent.getActivity((Context)localObject4, 200, (Intent)localObject3, 134217728);
    ((NotificationCompat.Builder)localObject2).OooO0o((PendingIntent)localObject4);
    localObject2 = this.OooO0o0;
    j = paramDownloadTask.getDrawableRes();
    ((NotificationCompat.Builder)localObject2).OooOOOO(j);
    localObject2 = this.OooO0o0;
    localObject4 = this.OooO0o;
    int k = R.string.agentweb_trickter;
    localObject4 = ((Context)localObject4).getString(k);
    ((NotificationCompat.Builder)localObject2).OooOOo0((CharSequence)localObject4);
    this.OooO0o0.OooO0oo((CharSequence)localObject1);
    localObject1 = this.OooO0o0;
    localObject2 = this.OooO0o;
    j = R.string.agentweb_coming_soon_download;
    localObject2 = ((Context)localObject2).getString(j);
    ((NotificationCompat.Builder)localObject1).OooO0oO((CharSequence)localObject2);
    localObject1 = this.OooO0o0;
    long l = System.currentTimeMillis();
    ((NotificationCompat.Builder)localObject1).OooOOo(l);
    this.OooO0o0.OooO0o0(true);
    this.OooO0o0.OooOOO0(-1);
    localObject1 = paramDownloadTask.getUrl();
    this.OooO = ((String)localObject1);
    localObject1 = paramDownloadTask.getFile();
    this.OooOO0 = ((File)localObject1);
    localObject1 = this.OooO0o0;
    localObject2 = this.OooO0o;
    j = paramDownloadTask.getId();
    paramDownloadTask = paramDownloadTask.getUrl();
    paramDownloadTask = OooO00o((Context)localObject2, j, paramDownloadTask);
    ((NotificationCompat.Builder)localObject1).OooOO0(paramDownloadTask);
    this.OooO0o0.OooO(0);
  }
  
  public void OooO0o(int paramInt)
  {
    boolean bool = OooO0OO();
    int i;
    Object localObject2;
    if (!bool)
    {
      localObject1 = this.OooO0o;
      i = this.OooO0O0;
      localObject2 = this.OooO;
      localObject1 = OooO00o((Context)localObject1, i, (String)localObject2);
      setDelecte((PendingIntent)localObject1);
    }
    bool = this.OooO0oo;
    if (!bool)
    {
      bool = true;
      this.OooO0oo = bool;
      localObject1 = new androidx/core/app/NotificationCompat$Action;
      i = R.drawable.ic_cancel_transparent_2dp;
      localObject2 = this.OooO0o;
      int j = 17039360;
      localObject2 = ((Context)localObject2).getString(j);
      localObject3 = this.OooO0o;
      int k = this.OooO0O0;
      String str = this.OooO;
      localObject3 = OooO00o((Context)localObject3, k, str);
      ((NotificationCompat.Action)localObject1).<init>(i, (CharSequence)localObject2, (PendingIntent)localObject3);
      this.OooOO0O = ((NotificationCompat.Action)localObject1);
      localObject4 = this.OooO0o0;
      ((NotificationCompat.Builder)localObject4).OooO00o((NotificationCompat.Action)localObject1);
    }
    Object localObject1 = this.OooO0o0;
    Object localObject4 = this.OooO0o;
    int m = R.string.agentweb_current_downloading_progress;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    ((StringBuilder)localObject3).append(paramInt);
    ((StringBuilder)localObject3).append("%");
    localObject3 = ((StringBuilder)localObject3).toString();
    localObject3 = new Object[] { localObject3 };
    localObject4 = ((Context)localObject4).getString(m, (Object[])localObject3);
    ((NotificationCompat.Builder)localObject1).OooO0oO((CharSequence)localObject4);
    OooO(100, paramInt, false);
    OooO0oo();
  }
  
  public void OooO0o0()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int m;
    try
    {
      Object localObject2 = this.OooO0o0;
      localObject2 = localObject2.getClass();
      localObject5 = ")&4B684755534E4E5C";
      localObject5 = m54207b69.F54207b69_11((String)localObject5);
      localObject2 = ((Class)localObject2).getDeclaredField((String)localObject5);
      if (localObject2 != null)
      {
        localObject5 = this.OooO0o0;
        localObject2 = ((Field)localObject2).get(localObject5);
        localObject2 = (ArrayList)localObject2;
      }
      else
      {
        localObject2 = null;
      }
      if (localObject2 != null)
      {
        localObject5 = this.OooOO0O;
        int j = ((ArrayList)localObject2).indexOf(localObject5);
        m = -1;
        if (j != m) {
          ((ArrayList)localObject2).remove(j);
        }
      }
    }
    finally
    {
      boolean bool2 = LogUtils.isDebug();
      if (bool2) {
        localObject3.printStackTrace();
      }
    }
    Object localObject4 = this.OooO0o;
    Object localObject5 = this.OooOO0;
    localObject4 = AgentWebUtils.OooOO0o((Context)localObject4, (File)localObject5);
    setDelecte(null);
    if (localObject4 != null)
    {
      localObject1 = this.OooO0o;
      bool1 = localObject1 instanceof Activity;
      if (!bool1)
      {
        int i = 268435456;
        ((Intent)localObject4).addFlags(i);
      }
      localObject1 = this.OooO0o;
      int k = this.OooO0O0 << 4;
      localObject1 = PendingIntent.getActivity((Context)localObject1, k, (Intent)localObject4, 134217728);
      localObject4 = this.OooO0o0;
      localObject5 = this.OooO0o;
      m = R.string.agentweb_click_open;
      localObject5 = ((Context)localObject5).getString(m);
      ((NotificationCompat.Builder)localObject4).OooO0oO((CharSequence)localObject5);
      localObject4 = this.OooO0o0;
      k = 0;
      localObject5 = null;
      m = 100;
      ((NotificationCompat.Builder)localObject4).OooOOO(m, m, false);
      localObject4 = this.OooO0o0;
      ((NotificationCompat.Builder)localObject4).OooO0o((PendingIntent)localObject1);
      OooO0oo();
    }
  }
  
  public void OooO0oO()
  {
    OooO0oo();
  }
  
  public final void OooO0oo()
  {
    Notification localNotification = this.OooO0o0.OooO0O0();
    this.OooO0Oo = localNotification;
    NotificationManager localNotificationManager = this.OooO0OO;
    int i = this.OooO0O0;
    localNotificationManager.notify(i, localNotification);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.download.DownloadNotifier
 * JD-Core Version:    0.7.0.1
 */