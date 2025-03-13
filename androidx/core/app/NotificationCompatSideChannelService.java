package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;

public abstract class NotificationCompatSideChannelService
  extends Service
{
  public abstract void OooO00o(String paramString1, int paramInt, String paramString2);
  
  public abstract void OooO0O0(String paramString);
  
  public void OooO0OO(int paramInt, String paramString)
  {
    Object localObject1 = getPackageManager().getPackagesForUid(paramInt);
    int i = localObject1.length;
    int j = 0;
    while (j < i)
    {
      Object localObject2 = localObject1[j];
      boolean bool = localObject2.equals(paramString);
      if (bool) {
        return;
      }
      j += 1;
    }
    localObject1 = new java/lang/SecurityException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("NotificationSideChannelService: Uid ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" is not authorized for package ");
    localStringBuilder.append(paramString);
    String str = localStringBuilder.toString();
    ((SecurityException)localObject1).<init>(str);
    throw ((Throwable)localObject1);
  }
  
  public abstract void OooO0Oo(String paramString1, int paramInt, String paramString2, Notification paramNotification);
  
  public IBinder onBind(Intent paramIntent)
  {
    paramIntent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompatSideChannelService
 * JD-Core Version:    0.7.0.1
 */