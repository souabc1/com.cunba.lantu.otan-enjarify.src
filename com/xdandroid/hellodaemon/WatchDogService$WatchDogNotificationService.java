package com.xdandroid.hellodaemon;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class WatchDogService$WatchDogNotificationService
  extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    paramIntent = new android/app/Notification;
    paramIntent.<init>();
    startForeground(2, paramIntent);
    stopSelf();
    return 1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xdandroid.hellodaemon.WatchDogService.WatchDogNotificationService
 * JD-Core Version:    0.7.0.1
 */