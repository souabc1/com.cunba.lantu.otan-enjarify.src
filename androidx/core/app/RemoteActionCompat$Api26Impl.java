package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;

class RemoteActionCompat$Api26Impl
{
  public static RemoteAction OooO00o(Icon paramIcon, CharSequence paramCharSequence1, CharSequence paramCharSequence2, PendingIntent paramPendingIntent)
  {
    RemoteAction localRemoteAction = new android/app/RemoteAction;
    localRemoteAction.<init>(paramIcon, paramCharSequence1, paramCharSequence2, paramPendingIntent);
    return localRemoteAction;
  }
  
  public static PendingIntent OooO0O0(RemoteAction paramRemoteAction)
  {
    return paramRemoteAction.getActionIntent();
  }
  
  public static CharSequence OooO0OO(RemoteAction paramRemoteAction)
  {
    return paramRemoteAction.getContentDescription();
  }
  
  public static Icon OooO0Oo(RemoteAction paramRemoteAction)
  {
    return paramRemoteAction.getIcon();
  }
  
  public static boolean OooO0o(RemoteAction paramRemoteAction)
  {
    return paramRemoteAction.isEnabled();
  }
  
  public static CharSequence OooO0o0(RemoteAction paramRemoteAction)
  {
    return paramRemoteAction.getTitle();
  }
  
  public static void OooO0oO(RemoteAction paramRemoteAction, boolean paramBoolean)
  {
    paramRemoteAction.setEnabled(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.RemoteActionCompat.Api26Impl
 * JD-Core Version:    0.7.0.1
 */