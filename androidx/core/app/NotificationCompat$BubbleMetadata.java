package androidx.core.app;

import android.app.Notification.BubbleMetadata;
import android.app.PendingIntent;
import android.os.Build.VERSION;
import androidx.core.graphics.drawable.IconCompat;

public final class NotificationCompat$BubbleMetadata
{
  public PendingIntent OooO00o;
  public PendingIntent OooO0O0;
  public IconCompat OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public String OooO0oO;
  
  public static Notification.BubbleMetadata OooO00o(BubbleMetadata paramBubbleMetadata)
  {
    if (paramBubbleMetadata == null) {
      return null;
    }
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j) {
      return NotificationCompat.BubbleMetadata.Api30Impl.OooO00o(paramBubbleMetadata);
    }
    j = 29;
    if (i == j) {
      return NotificationCompat.BubbleMetadata.Api29Impl.OooO00o(paramBubbleMetadata);
    }
    return null;
  }
  
  public boolean getAutoExpandBubble()
  {
    int i = this.OooO0o;
    int j = 1;
    i &= j;
    if (i == 0) {
      j = 0;
    }
    return j;
  }
  
  public PendingIntent getDeleteIntent()
  {
    return this.OooO0O0;
  }
  
  public int getDesiredHeight()
  {
    return this.OooO0Oo;
  }
  
  public int getDesiredHeightResId()
  {
    return this.OooO0o0;
  }
  
  public IconCompat getIcon()
  {
    return this.OooO0OO;
  }
  
  public PendingIntent getIntent()
  {
    return this.OooO00o;
  }
  
  public String getShortcutId()
  {
    return this.OooO0oO;
  }
  
  public boolean isNotificationSuppressed()
  {
    int i = this.OooO0o & 0x2;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void setFlags(int paramInt)
  {
    this.OooO0o = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.BubbleMetadata
 * JD-Core Version:    0.7.0.1
 */