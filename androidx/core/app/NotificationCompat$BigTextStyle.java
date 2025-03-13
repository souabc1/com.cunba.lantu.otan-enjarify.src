package androidx.core.app;

import android.app.Notification.BigTextStyle;
import android.os.Bundle;

public class NotificationCompat$BigTextStyle
  extends NotificationCompat.Style
{
  public CharSequence OooO0o0;
  
  public void OooO00o(Bundle paramBundle)
  {
    super.OooO00o(paramBundle);
  }
  
  public void OooO0O0(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    Object localObject = new android/app/Notification$BigTextStyle;
    paramNotificationBuilderWithBuilderAccessor = paramNotificationBuilderWithBuilderAccessor.getBuilder();
    ((Notification.BigTextStyle)localObject).<init>(paramNotificationBuilderWithBuilderAccessor);
    paramNotificationBuilderWithBuilderAccessor = this.OooO0O0;
    paramNotificationBuilderWithBuilderAccessor = ((Notification.BigTextStyle)localObject).setBigContentTitle(paramNotificationBuilderWithBuilderAccessor);
    localObject = this.OooO0o0;
    paramNotificationBuilderWithBuilderAccessor = paramNotificationBuilderWithBuilderAccessor.bigText((CharSequence)localObject);
    boolean bool = this.OooO0Oo;
    if (bool)
    {
      localObject = this.OooO0OO;
      paramNotificationBuilderWithBuilderAccessor.setSummaryText((CharSequence)localObject);
    }
  }
  
  public String getClassName()
  {
    return "androidx.core.app.NotificationCompat$BigTextStyle";
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.BigTextStyle
 * JD-Core Version:    0.7.0.1
 */