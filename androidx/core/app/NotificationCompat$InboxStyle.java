package androidx.core.app;

import android.app.Notification.InboxStyle;
import java.util.ArrayList;
import java.util.Iterator;

public class NotificationCompat$InboxStyle
  extends NotificationCompat.Style
{
  public ArrayList OooO0o0;
  
  public NotificationCompat$InboxStyle()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0o0 = localArrayList;
  }
  
  public void OooO0O0(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    Object localObject = new android/app/Notification$InboxStyle;
    paramNotificationBuilderWithBuilderAccessor = paramNotificationBuilderWithBuilderAccessor.getBuilder();
    ((Notification.InboxStyle)localObject).<init>(paramNotificationBuilderWithBuilderAccessor);
    paramNotificationBuilderWithBuilderAccessor = this.OooO0O0;
    paramNotificationBuilderWithBuilderAccessor = ((Notification.InboxStyle)localObject).setBigContentTitle(paramNotificationBuilderWithBuilderAccessor);
    boolean bool1 = this.OooO0Oo;
    if (bool1)
    {
      localObject = this.OooO0OO;
      paramNotificationBuilderWithBuilderAccessor.setSummaryText((CharSequence)localObject);
    }
    localObject = this.OooO0o0.iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject).hasNext();
      if (!bool2) {
        break;
      }
      CharSequence localCharSequence = (CharSequence)((Iterator)localObject).next();
      paramNotificationBuilderWithBuilderAccessor.addLine(localCharSequence);
    }
  }
  
  public String getClassName()
  {
    return "androidx.core.app.NotificationCompat$InboxStyle";
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.InboxStyle
 * JD-Core Version:    0.7.0.1
 */