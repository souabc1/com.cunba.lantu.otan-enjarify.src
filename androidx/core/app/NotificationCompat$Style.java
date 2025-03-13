package androidx.core.app;

import android.os.BaseBundle;
import android.os.Bundle;
import android.widget.RemoteViews;

public abstract class NotificationCompat$Style
{
  public NotificationCompat.Builder OooO00o;
  public CharSequence OooO0O0;
  public CharSequence OooO0OO;
  public boolean OooO0Oo = false;
  
  public void OooO00o(Bundle paramBundle)
  {
    boolean bool = this.OooO0Oo;
    Object localObject2;
    if (bool)
    {
      localObject1 = "android.summaryText";
      localObject2 = this.OooO0OO;
      paramBundle.putCharSequence((String)localObject1, (CharSequence)localObject2);
    }
    Object localObject1 = this.OooO0O0;
    if (localObject1 != null)
    {
      localObject2 = "android.title.big";
      paramBundle.putCharSequence((String)localObject2, (CharSequence)localObject1);
    }
    localObject1 = getClassName();
    if (localObject1 != null)
    {
      localObject2 = "androidx.core.app.extra.COMPAT_TEMPLATE";
      paramBundle.putString((String)localObject2, (String)localObject1);
    }
  }
  
  public void OooO0O0(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor) {}
  
  public RemoteViews OooO0OO(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    return null;
  }
  
  public RemoteViews OooO0Oo(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    return null;
  }
  
  public RemoteViews OooO0o0(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
  {
    return null;
  }
  
  public String getClassName()
  {
    return null;
  }
  
  public void setBuilder(NotificationCompat.Builder paramBuilder)
  {
    NotificationCompat.Builder localBuilder = this.OooO00o;
    if (localBuilder != paramBuilder)
    {
      this.OooO00o = paramBuilder;
      if (paramBuilder != null) {
        paramBuilder.OooOOOo(this);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.Style
 * JD-Core Version:    0.7.0.1
 */