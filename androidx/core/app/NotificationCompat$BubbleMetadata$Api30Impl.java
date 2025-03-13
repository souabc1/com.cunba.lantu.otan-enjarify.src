package androidx.core.app;

import android.app.Notification.BubbleMetadata;
import android.app.Notification.BubbleMetadata.Builder;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

class NotificationCompat$BubbleMetadata$Api30Impl
{
  public static Notification.BubbleMetadata OooO00o(NotificationCompat.BubbleMetadata paramBubbleMetadata)
  {
    if (paramBubbleMetadata == null) {
      return null;
    }
    Object localObject1 = paramBubbleMetadata.getShortcutId();
    if (localObject1 != null)
    {
      localObject1 = new android/app/Notification$BubbleMetadata$Builder;
      localObject2 = paramBubbleMetadata.getShortcutId();
      ((Notification.BubbleMetadata.Builder)localObject1).<init>((String)localObject2);
    }
    else
    {
      localObject1 = new android/app/Notification$BubbleMetadata$Builder;
      localObject2 = paramBubbleMetadata.getIntent();
      Icon localIcon = paramBubbleMetadata.getIcon().OooOO0o();
      ((Notification.BubbleMetadata.Builder)localObject1).<init>((PendingIntent)localObject2, localIcon);
    }
    Object localObject2 = paramBubbleMetadata.getDeleteIntent();
    localObject2 = ((Notification.BubbleMetadata.Builder)localObject1).setDeleteIntent((PendingIntent)localObject2);
    boolean bool = paramBubbleMetadata.getAutoExpandBubble();
    localObject2 = ((Notification.BubbleMetadata.Builder)localObject2).setAutoExpandBubble(bool);
    bool = paramBubbleMetadata.isNotificationSuppressed();
    ((Notification.BubbleMetadata.Builder)localObject2).setSuppressNotification(bool);
    int i = paramBubbleMetadata.getDesiredHeight();
    if (i != 0)
    {
      i = paramBubbleMetadata.getDesiredHeight();
      ((Notification.BubbleMetadata.Builder)localObject1).setDesiredHeight(i);
    }
    i = paramBubbleMetadata.getDesiredHeightResId();
    if (i != 0)
    {
      int j = paramBubbleMetadata.getDesiredHeightResId();
      ((Notification.BubbleMetadata.Builder)localObject1).setDesiredHeightResId(j);
    }
    return ((Notification.BubbleMetadata.Builder)localObject1).build();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.BubbleMetadata.Api30Impl
 * JD-Core Version:    0.7.0.1
 */