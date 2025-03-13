package com.qinggan.app;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.qinggan.bus.QGBus;
import com.qinggan.bus.QGBusEvent;
import com.qinggan.util.Log;
import m54207b69;

public class ActivityWatcher
  implements Application.ActivityLifecycleCallbacks
{
  public static ActivityWatcher o00Ooo0;
  public Application o00OoOoo;
  public QGBus o00Ooo00 = null;
  
  public ActivityWatcher(Application paramApplication)
  {
    this.o00OoOoo = paramApplication;
  }
  
  public static ActivityWatcher OooO0O0(Application paramApplication)
  {
    ActivityWatcher localActivityWatcher = o00Ooo0;
    if (localActivityWatcher == null)
    {
      localActivityWatcher = new com/qinggan/app/ActivityWatcher;
      localActivityWatcher.<init>(paramApplication);
      o00Ooo0 = localActivityWatcher;
    }
    return o00Ooo0;
  }
  
  public void OooO00o()
  {
    Object localObject = this.o00OoOoo;
    if (localObject != null)
    {
      ((Application)localObject).unregisterActivityLifecycleCallbacks(this);
      return;
    }
    localObject = new java/lang/IllegalStateException;
    String str = m54207b69.F54207b69_11("cH2B2A28292B416E2E3245332C32754A2F3D791B4B4C39374241553B4242854549424E4D5F");
    ((IllegalStateException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public void OooO0OO()
  {
    Object localObject1 = this.o00OoOoo;
    if (localObject1 != null)
    {
      localObject2 = new com/qinggan/bus/QGBus;
      localObject1 = ((Context)localObject1).getApplicationContext();
      ((QGBus)localObject2).<init>((Context)localObject1);
      this.o00Ooo00 = ((QGBus)localObject2);
      this.o00OoOoo.registerActivityLifecycleCallbacks(this);
      return;
    }
    localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = m54207b69.F54207b69_11("cH2B2A28292B416E2E3245332C32754A2F3D791B4B4C39374241553B4242854549424E4D5F");
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public final void OooO0Oo(Activity paramActivity)
  {
    Object localObject1 = this.o00Ooo00;
    if (localObject1 == null)
    {
      paramActivity = m54207b69.F54207b69_11("VL0D303A283E2A3E3C2336423A30364C");
      localObject1 = m54207b69.F54207b69_11("IR3F0417132B267842297B46324A4B");
      Log.OooO0oO(paramActivity, (String)localObject1);
      return;
    }
    localObject1 = new com/qinggan/bus/QGBusEvent;
    ((QGBusEvent)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("8F0726343234343846133032322D30427817364442444448561D4741433D40");
    ((QGBusEvent)localObject1).setEventType((String)localObject2);
    localObject2 = new android/os/Bundle;
    ((Bundle)localObject2).<init>();
    String str1 = paramActivity.getPackageName();
    String str2 = m54207b69.F54207b69_11(";o1F0F0E07120D10");
    ((BaseBundle)localObject2).putString(str2, str1);
    paramActivity = paramActivity.getComponentName().getClassName();
    str1 = m54207b69.F54207b69_11("g;5855584E585A645C57");
    ((BaseBundle)localObject2).putString(str1, paramActivity);
    ((QGBusEvent)localObject1).setData((Bundle)localObject2);
    this.o00Ooo00.OooO00o((QGBusEvent)localObject1);
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity)
  {
    OooO0Oo(paramActivity);
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.app.ActivityWatcher
 * JD-Core Version:    0.7.0.1
 */