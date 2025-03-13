package androidx.core.app;

import android.app.Notification.BubbleMetadata;
import android.app.Notification.BubbleMetadata.Builder;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

class NotificationCompat$BubbleMetadata$Api29Impl
{
  public static Notification.BubbleMetadata OooO00o(NotificationCompat.BubbleMetadata paramBubbleMetadata)
  {
    Notification.BubbleMetadata.Builder localBuilder = null;
    if (paramBubbleMetadata == null) {
      return null;
    }
    Object localObject = paramBubbleMetadata.getIntent();
    if (localObject == null) {
      return null;
    }
    localBuilder = new android/app/Notification$BubbleMetadata$Builder;
    localBuilder.<init>();
    localObject = paramBubbleMetadata.getIcon().OooOO0o();
    localBuilder = localBuilder.setIcon((Icon)localObject);
    localObject = paramBubbleMetadata.getIntent();
    localBuilder = localBuilder.setIntent((PendingIntent)localObject);
    localObject = paramBubbleMetadata.getDeleteIntent();
    localBuilder = localBuilder.setDeleteIntent((PendingIntent)localObject);
    boolean bool = paramBubbleMetadata.getAutoExpandBubble();
    localBuilder = localBuilder.setAutoExpandBubble(bool);
    bool = paramBubbleMetadata.isNotificationSuppressed();
    localBuilder = localBuilder.setSuppressNotification(bool);
    int i = paramBubbleMetadata.getDesiredHeight();
    if (i != 0)
    {
      i = paramBubbleMetadata.getDesiredHeight();
      localBuilder.setDesiredHeight(i);
    }
    i = paramBubbleMetadata.getDesiredHeightResId();
    if (i != 0)
    {
      int j = paramBubbleMetadata.getDesiredHeightResId();
      localBuilder.setDesiredHeightResId(j);
    }
    return localBuilder.build();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.BubbleMetadata.Api29Impl
 * JD-Core Version:    0.7.0.1
 */