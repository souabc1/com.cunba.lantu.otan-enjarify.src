package com.xdandroid.hellodaemon;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import m54207b69;

public abstract class AbsWorkService
  extends Service
{
  public boolean o00OoOoo = true;
  
  public static void OooO0O0()
  {
    boolean bool = DaemonEnv.OooO0Oo;
    if (!bool) {
      return;
    }
    Context localContext = DaemonEnv.OooO00o;
    Intent localIntent = new android/content/Intent;
    String str = m54207b69.F54207b69_11("AO2C2124643B30342833462A31376E35393334323E423F3837397A26291D2928223026223034332935452B3A47463A");
    localIntent.<init>(str);
    localContext.sendBroadcast(localIntent);
  }
  
  public void OooO(Intent paramIntent, int paramInt1, int paramInt2)
  {
    Boolean localBoolean = OooO0oo(paramIntent, paramInt1, paramInt2);
    boolean bool;
    if (localBoolean != null)
    {
      bool = localBoolean.booleanValue();
      if (bool) {
        return;
      }
    }
    localBoolean = OooO0OO(paramIntent, paramInt1, paramInt2);
    if (localBoolean != null)
    {
      bool = localBoolean.booleanValue();
      if (bool) {
        return;
      }
    }
    OooOO0(paramIntent, paramInt1, paramInt2);
  }
  
  public abstract Boolean OooO0OO(Intent paramIntent, int paramInt1, int paramInt2);
  
  public abstract IBinder OooO0Oo(Intent paramIntent, Void paramVoid);
  
  public abstract void OooO0o(Intent paramIntent);
  
  public void OooO0o0(Intent paramIntent)
  {
    OooO0o(paramIntent);
    boolean bool = DaemonEnv.OooO0Oo;
    if (!bool) {
      return;
    }
    DaemonEnv.OooO0O0(DaemonEnv.OooO0O0);
    DaemonEnv.OooO0O0(WatchDogService.class);
  }
  
  public int OooO0oO(Intent paramIntent, int paramInt1, int paramInt2)
  {
    Object localObject1 = WatchDogService.class;
    DaemonEnv.OooO0O0((Class)localObject1);
    Object localObject2 = OooO0oo(paramIntent, paramInt1, paramInt2);
    if (localObject2 != null)
    {
      boolean bool1 = ((Boolean)localObject2).booleanValue();
      if (bool1) {
        OooOO0O(paramIntent, paramInt1, paramInt2);
      } else {
        OooO(paramIntent, paramInt1, paramInt2);
      }
    }
    boolean bool2 = this.o00OoOoo;
    paramInt1 = 1;
    if (bool2)
    {
      bool2 = false;
      this.o00OoOoo = false;
      paramIntent = getPackageManager();
      ComponentName localComponentName = new android/content/ComponentName;
      localObject2 = getPackageName();
      localObject1 = ((Class)localObject1).getName();
      localComponentName.<init>((String)localObject2, (String)localObject1);
      paramIntent.setComponentEnabledSetting(localComponentName, paramInt1, paramInt1);
    }
    return paramInt1;
  }
  
  public abstract Boolean OooO0oo(Intent paramIntent, int paramInt1, int paramInt2);
  
  public abstract void OooOO0(Intent paramIntent, int paramInt1, int paramInt2);
  
  public void OooOO0O(Intent paramIntent, int paramInt1, int paramInt2)
  {
    OooOO0o(paramIntent, paramInt1, paramInt2);
    OooO0O0();
  }
  
  public abstract void OooOO0o(Intent paramIntent, int paramInt1, int paramInt2);
  
  public IBinder onBind(Intent paramIntent)
  {
    OooO0oO(paramIntent, 0, 0);
    return OooO0Oo(paramIntent, null);
  }
  
  public void onDestroy()
  {
    OooO0o0(null);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return OooO0oO(paramIntent, paramInt1, paramInt2);
  }
  
  public void onTaskRemoved(Intent paramIntent)
  {
    OooO0o0(paramIntent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xdandroid.hellodaemon.AbsWorkService
 * JD-Core Version:    0.7.0.1
 */