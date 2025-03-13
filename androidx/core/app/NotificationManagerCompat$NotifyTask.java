package androidx.core.app;

import android.app.Notification;
import android.support.v4.app.INotificationSideChannel;

class NotificationManagerCompat$NotifyTask
  implements NotificationManagerCompat.Task
{
  public final String OooO00o;
  public final int OooO0O0;
  public final String OooO0OO;
  public final Notification OooO0Oo;
  
  public NotificationManagerCompat$NotifyTask(String paramString1, int paramInt, String paramString2, Notification paramNotification)
  {
    this.OooO00o = paramString1;
    this.OooO0O0 = paramInt;
    this.OooO0OO = paramString2;
    this.OooO0Oo = paramNotification;
  }
  
  public void OooO00o(INotificationSideChannel paramINotificationSideChannel)
  {
    String str1 = this.OooO00o;
    int i = this.OooO0O0;
    String str2 = this.OooO0OO;
    Notification localNotification = this.OooO0Oo;
    paramINotificationSideChannel.o0OOoO00(str1, i, str2, localNotification);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("NotifyTask[");
    localStringBuilder.append("packageName:");
    String str = this.OooO00o;
    localStringBuilder.append(str);
    localStringBuilder.append(", id:");
    int i = this.OooO0O0;
    localStringBuilder.append(i);
    localStringBuilder.append(", tag:");
    str = this.OooO0OO;
    localStringBuilder.append(str);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationManagerCompat.NotifyTask
 * JD-Core Version:    0.7.0.1
 */