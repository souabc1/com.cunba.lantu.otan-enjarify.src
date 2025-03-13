package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;

class AlarmManagerCompat$Api23Impl
{
  public static void OooO00o(AlarmManager paramAlarmManager, int paramInt, long paramLong, PendingIntent paramPendingIntent)
  {
    paramAlarmManager.setAndAllowWhileIdle(paramInt, paramLong, paramPendingIntent);
  }
  
  public static void OooO0O0(AlarmManager paramAlarmManager, int paramInt, long paramLong, PendingIntent paramPendingIntent)
  {
    paramAlarmManager.setExactAndAllowWhileIdle(paramInt, paramLong, paramPendingIntent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.AlarmManagerCompat.Api23Impl
 * JD-Core Version:    0.7.0.1
 */