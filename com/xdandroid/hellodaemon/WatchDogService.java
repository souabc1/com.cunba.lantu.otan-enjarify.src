package com.xdandroid.hellodaemon;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import m54207b69;

public class WatchDogService
  extends Service
{
  public static Disposable o00OoOoo;
  
  public static void OooO00o()
  {
    boolean bool = DaemonEnv.OooO0Oo;
    if (!bool) {
      return;
    }
    Object localObject = DaemonEnv.OooO00o;
    String str = m54207b69.F54207b69_11(")C292D233324302C2E3E38303C");
    localObject = (JobScheduler)((Context)localObject).getSystemService(str);
    int i = 2;
    ((JobScheduler)localObject).cancel(i);
    localObject = o00OoOoo;
    if (localObject != null) {
      ((Disposable)localObject).dispose();
    }
  }
  
  public void OooO0O0(Intent paramIntent)
  {
    boolean bool = DaemonEnv.OooO0Oo;
    if (!bool) {
      return;
    }
    DaemonEnv.OooO0O0(DaemonEnv.OooO0O0);
    DaemonEnv.OooO0O0(WatchDogService.class);
  }
  
  public final int OooO0OO(Intent paramIntent, int paramInt1, int paramInt2)
  {
    boolean bool = DaemonEnv.OooO0Oo;
    paramInt1 = 1;
    if (!bool) {
      return paramInt1;
    }
    paramIntent = o00OoOoo;
    if (paramIntent != null)
    {
      bool = paramIntent.isDisposed();
      if (!bool) {
        return paramInt1;
      }
    }
    paramIntent = new android/app/job/JobInfo$Builder;
    Object localObject1 = new android/content/ComponentName;
    Object localObject2 = DaemonEnv.OooO00o;
    ((ComponentName)localObject1).<init>((Context)localObject2, JobSchedulerService.class);
    paramIntent.<init>(2, (ComponentName)localObject1);
    long l1 = DaemonEnv.getWakeUpInterval();
    paramIntent.setPeriodic(l1);
    l1 = JobInfo.getMinPeriodMillis();
    long l2 = JobInfo.getMinFlexMillis();
    paramIntent.setPeriodic(l1, l2);
    paramIntent.setPersisted(paramInt1);
    localObject1 = m54207b69.F54207b69_11(")C292D233324302C2E3E38303C");
    localObject1 = (JobScheduler)getSystemService((String)localObject1);
    paramIntent = paramIntent.build();
    ((JobScheduler)localObject1).schedule(paramIntent);
    l1 = DaemonEnv.getWakeUpInterval();
    paramIntent = TimeUnit.MILLISECONDS;
    paramIntent = Flowable.OooO0oO(l1, paramIntent);
    localObject1 = new com/xdandroid/hellodaemon/WatchDogService$1;
    ((WatchDogService.1)localObject1).<init>(this);
    localObject2 = new com/xdandroid/hellodaemon/WatchDogService$2;
    ((WatchDogService.2)localObject2).<init>(this);
    o00OoOoo = paramIntent.OooOo0o((Consumer)localObject1, (Consumer)localObject2);
    paramIntent = getPackageManager();
    localObject1 = new android/content/ComponentName;
    localObject2 = getPackageName();
    String str = DaemonEnv.OooO0O0.getName();
    ((ComponentName)localObject1).<init>((String)localObject2, str);
    paramIntent.setComponentEnabledSetting((ComponentName)localObject1, paramInt1, paramInt1);
    return paramInt1;
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    OooO0OO(paramIntent, 0, 0);
    return null;
  }
  
  public void onDestroy()
  {
    OooO0O0(null);
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return OooO0OO(paramIntent, paramInt1, paramInt2);
  }
  
  public void onTaskRemoved(Intent paramIntent)
  {
    OooO0O0(paramIntent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xdandroid.hellodaemon.WatchDogService
 * JD-Core Version:    0.7.0.1
 */