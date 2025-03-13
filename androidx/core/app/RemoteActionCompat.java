package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcelable;

public final class RemoteActionCompat
  implements VersionedParcelable
{
  public IconCompat OooO00o;
  public CharSequence OooO0O0;
  public CharSequence OooO0OO;
  public PendingIntent OooO0Oo;
  public boolean OooO0o;
  public boolean OooO0o0;
  
  public PendingIntent getActionIntent()
  {
    return this.OooO0Oo;
  }
  
  public CharSequence getContentDescription()
  {
    return this.OooO0OO;
  }
  
  public IconCompat getIcon()
  {
    return this.OooO00o;
  }
  
  public CharSequence getTitle()
  {
    return this.OooO0O0;
  }
  
  public boolean isEnabled()
  {
    return this.OooO0o0;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.OooO0o0 = paramBoolean;
  }
  
  public void setShouldShowIcon(boolean paramBoolean)
  {
    this.OooO0o = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.RemoteActionCompat
 * JD-Core Version:    0.7.0.1
 */