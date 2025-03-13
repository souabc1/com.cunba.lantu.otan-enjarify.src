package androidx.core.app;

import android.app.Notification.BigPictureStyle;
import android.app.Notification.Builder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import androidx.core.graphics.drawable.IconCompat;

public class NotificationCompat$BigPictureStyle
  extends NotificationCompat.Style
{
  public boolean OooO;
  public IconCompat OooO0o;
  public IconCompat OooO0o0;
  public boolean OooO0oO;
  public CharSequence OooO0oo;
  
  public void OooO0O0(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    int i = Build.VERSION.SDK_INT;
    Notification.BigPictureStyle localBigPictureStyle = new android/app/Notification$BigPictureStyle;
    Object localObject = paramNotificationBuilderWithBuilderAccessor.getBuilder();
    localBigPictureStyle.<init>((Notification.Builder)localObject);
    localObject = this.OooO0O0;
    localBigPictureStyle = localBigPictureStyle.setBigContentTitle((CharSequence)localObject);
    localObject = this.OooO0o0;
    int j = 31;
    Context localContext = null;
    if (localObject != null) {
      if (i >= j)
      {
        boolean bool1 = paramNotificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder;
        if (bool1)
        {
          localObject = paramNotificationBuilderWithBuilderAccessor;
          localObject = ((NotificationCompatBuilder)paramNotificationBuilderWithBuilderAccessor).getContext();
        }
        else
        {
          bool1 = false;
          localObject = null;
        }
        IconCompat localIconCompat = this.OooO0o0;
        localObject = localIconCompat.OooOOO0((Context)localObject);
        NotificationCompat.BigPictureStyle.Api31Impl.OooO00o(localBigPictureStyle, (Icon)localObject);
      }
      else
      {
        int k = ((IconCompat)localObject).getType();
        int m = 1;
        if (k == m)
        {
          localObject = this.OooO0o0.getBitmap();
          localBigPictureStyle = localBigPictureStyle.bigPicture((Bitmap)localObject);
        }
      }
    }
    boolean bool2 = this.OooO0oO;
    if (bool2)
    {
      localObject = this.OooO0o;
      if (localObject == null)
      {
        NotificationCompat.BigPictureStyle.Api16Impl.OooO00o(localBigPictureStyle, null);
      }
      else
      {
        bool2 = paramNotificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder;
        if (bool2)
        {
          paramNotificationBuilderWithBuilderAccessor = (NotificationCompatBuilder)paramNotificationBuilderWithBuilderAccessor;
          localContext = paramNotificationBuilderWithBuilderAccessor.getContext();
        }
        paramNotificationBuilderWithBuilderAccessor = this.OooO0o.OooOOO0(localContext);
        NotificationCompat.BigPictureStyle.Api23Impl.OooO00o(localBigPictureStyle, paramNotificationBuilderWithBuilderAccessor);
      }
    }
    boolean bool3 = this.OooO0Oo;
    if (bool3)
    {
      paramNotificationBuilderWithBuilderAccessor = this.OooO0OO;
      NotificationCompat.BigPictureStyle.Api16Impl.OooO0O0(localBigPictureStyle, paramNotificationBuilderWithBuilderAccessor);
    }
    if (i >= j)
    {
      bool3 = this.OooO;
      NotificationCompat.BigPictureStyle.Api31Impl.OooO0OO(localBigPictureStyle, bool3);
      paramNotificationBuilderWithBuilderAccessor = this.OooO0oo;
      NotificationCompat.BigPictureStyle.Api31Impl.OooO0O0(localBigPictureStyle, paramNotificationBuilderWithBuilderAccessor);
    }
  }
  
  public String getClassName()
  {
    return "androidx.core.app.NotificationCompat$BigPictureStyle";
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.BigPictureStyle
 * JD-Core Version:    0.7.0.1
 */