package com.xdandroid.hellodaemon;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AbsWorkService$WorkNotificationService
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
    paramInt1 = 1;
    startForeground(paramInt1, paramIntent);
    stopSelf();
    return paramInt1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xdandroid.hellodaemon.AbsWorkService.WorkNotificationService
 * JD-Core Version:    0.7.0.1
 */