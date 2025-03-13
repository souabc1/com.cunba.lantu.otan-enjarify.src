package com.xdandroid.hellodaemon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import m54207b69;

public class WakeUpReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent != null)
    {
      paramContext = m54207b69.F54207b69_11("AO2C2124643B30342833462A31376E35393334323E423F3837397A26291D2928223026223034332935452B3A47463A");
      paramIntent = paramIntent.getAction();
      bool = paramContext.equals(paramIntent);
      if (bool)
      {
        WatchDogService.OooO00o();
        return;
      }
    }
    boolean bool = DaemonEnv.OooO0Oo;
    if (!bool) {
      return;
    }
    DaemonEnv.OooO0O0(DaemonEnv.OooO0O0);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xdandroid.hellodaemon.WakeUpReceiver
 * JD-Core Version:    0.7.0.1
 */