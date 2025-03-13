package androidx.core.app;

import android.app.AlarmManager;
import android.app.AlarmManager.AlarmClockInfo;
import android.app.PendingIntent;

class AlarmManagerCompat$Api21Impl
{
  public static AlarmManager.AlarmClockInfo OooO00o(long paramLong, PendingIntent paramPendingIntent)
  {
    AlarmManager.AlarmClockInfo localAlarmClockInfo = new android/app/AlarmManager$AlarmClockInfo;
    localAlarmClockInfo.<init>(paramLong, paramPendingIntent);
    return localAlarmClockInfo;
  }
  
  public static void OooO0O0(AlarmManager paramAlarmManager, Object paramObject, PendingIntent paramPendingIntent)
  {
    paramObject = (AlarmManager.AlarmClockInfo)paramObject;
    paramAlarmManager.setAlarmClock(paramObject, paramPendingIntent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.AlarmManagerCompat.Api21Impl
 * JD-Core Version:    0.7.0.1
 */