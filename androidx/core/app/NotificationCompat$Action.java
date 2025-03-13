package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public class NotificationCompat$Action
{
  public int OooO;
  public final Bundle OooO00o;
  public IconCompat OooO0O0;
  public final RemoteInput[] OooO0OO;
  public final RemoteInput[] OooO0Oo;
  public boolean OooO0o;
  public boolean OooO0o0;
  public final int OooO0oO;
  public final boolean OooO0oo;
  public CharSequence OooOO0;
  public PendingIntent OooOO0O;
  public boolean OooOO0o;
  
  public NotificationCompat$Action(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this(localIconCompat, paramCharSequence, paramPendingIntent);
  }
  
  public NotificationCompat$Action(IconCompat paramIconCompat, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this(paramIconCompat, paramCharSequence, paramPendingIntent, localBundle, null, null, true, 0, true, false, false);
  }
  
  public NotificationCompat$Action(IconCompat paramIconCompat, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle, RemoteInput[] paramArrayOfRemoteInput1, RemoteInput[] paramArrayOfRemoteInput2, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    int i = 1;
    this.OooO0o = i;
    this.OooO0O0 = paramIconCompat;
    if (paramIconCompat != null)
    {
      i = paramIconCompat.getType();
      int j = 2;
      if (i == j)
      {
        int k = paramIconCompat.getResId();
        this.OooO = k;
      }
    }
    paramIconCompat = NotificationCompat.Builder.OooO0OO(paramCharSequence);
    this.OooOO0 = paramIconCompat;
    this.OooOO0O = paramPendingIntent;
    if (paramBundle == null)
    {
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
    this.OooO00o = paramBundle;
    this.OooO0OO = paramArrayOfRemoteInput1;
    this.OooO0Oo = paramArrayOfRemoteInput2;
    this.OooO0o0 = paramBoolean1;
    this.OooO0oO = paramInt;
    this.OooO0o = paramBoolean2;
    this.OooO0oo = paramBoolean3;
    this.OooOO0o = paramBoolean4;
  }
  
  public PendingIntent getActionIntent()
  {
    return this.OooOO0O;
  }
  
  public boolean getAllowGeneratedReplies()
  {
    return this.OooO0o0;
  }
  
  public RemoteInput[] getDataOnlyRemoteInputs()
  {
    return this.OooO0Oo;
  }
  
  public Bundle getExtras()
  {
    return this.OooO00o;
  }
  
  public int getIcon()
  {
    return this.OooO;
  }
  
  public IconCompat getIconCompat()
  {
    IconCompat localIconCompat = this.OooO0O0;
    if (localIconCompat == null)
    {
      int i = this.OooO;
      if (i != 0)
      {
        String str = "";
        localIconCompat = IconCompat.OooO0oO(null, str, i);
        this.OooO0O0 = localIconCompat;
      }
    }
    return this.OooO0O0;
  }
  
  public RemoteInput[] getRemoteInputs()
  {
    return this.OooO0OO;
  }
  
  public int getSemanticAction()
  {
    return this.OooO0oO;
  }
  
  public boolean getShowsUserInterface()
  {
    return this.OooO0o;
  }
  
  public CharSequence getTitle()
  {
    return this.OooOO0;
  }
  
  public boolean isAuthenticationRequired()
  {
    return this.OooOO0o;
  }
  
  public boolean isContextual()
  {
    return this.OooO0oo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.Action
 * JD-Core Version:    0.7.0.1
 */