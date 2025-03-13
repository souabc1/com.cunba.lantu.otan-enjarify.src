package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.content.LocusIdCompat;
import java.util.ArrayList;

public class NotificationCompat$Builder
{
  public RemoteViews OooO;
  public Context OooO00o;
  public ArrayList OooO0O0;
  public ArrayList OooO0OO;
  public ArrayList OooO0Oo;
  public CharSequence OooO0o;
  public CharSequence OooO0o0;
  public PendingIntent OooO0oO;
  public PendingIntent OooO0oo;
  public Bitmap OooOO0;
  public CharSequence OooOO0O;
  public int OooOO0o;
  public boolean OooOOO;
  public int OooOOO0;
  public boolean OooOOOO;
  public NotificationCompat.Style OooOOOo;
  public CharSequence OooOOo;
  public CharSequence OooOOo0;
  public CharSequence[] OooOOoo;
  public boolean OooOo;
  public int OooOo0;
  public int OooOo00;
  public boolean OooOo0O;
  public String OooOo0o;
  public boolean OooOoO;
  public String OooOoO0;
  public boolean OooOoOO;
  public String OooOoo;
  public boolean OooOoo0;
  public Bundle OooOooO;
  public int OooOooo;
  public int Oooo;
  public RemoteViews Oooo0;
  public int Oooo000;
  public Notification Oooo00O;
  public RemoteViews Oooo00o;
  public RemoteViews Oooo0O0;
  public String Oooo0OO;
  public String Oooo0o;
  public int Oooo0o0;
  public LocusIdCompat Oooo0oO;
  public long Oooo0oo;
  public Notification OoooO;
  public boolean OoooO0;
  public int OoooO00;
  public NotificationCompat.BubbleMetadata OoooO0O;
  public boolean OoooOO0;
  public ArrayList OoooOOO;
  public Icon o000oOoO;
  
  public NotificationCompat$Builder(Context paramContext, String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0O0 = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0OO = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0Oo = localArrayList;
    boolean bool = true;
    this.OooOOO = bool;
    this.OooOoO = false;
    this.OooOooo = 0;
    this.Oooo000 = 0;
    this.Oooo0o0 = 0;
    this.Oooo = 0;
    this.OoooO00 = 0;
    Notification localNotification = new android/app/Notification;
    localNotification.<init>();
    this.OoooO = localNotification;
    this.OooO00o = paramContext;
    this.Oooo0OO = paramString;
    long l = System.currentTimeMillis();
    localNotification.when = l;
    this.OoooO.audioStreamType = -1;
    this.OooOOO0 = 0;
    paramContext = new java/util/ArrayList;
    paramContext.<init>();
    this.OoooOOO = paramContext;
    this.OoooO0 = bool;
  }
  
  public static CharSequence OooO0OO(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      return paramCharSequence;
    }
    int i = paramCharSequence.length();
    int j = 5120;
    if (i > j)
    {
      i = 0;
      paramCharSequence = paramCharSequence.subSequence(0, j);
    }
    return paramCharSequence;
  }
  
  private void setFlag(int paramInt, boolean paramBoolean)
  {
    Notification localNotification;
    int i;
    if (paramBoolean)
    {
      localNotification = this.OoooO;
      i = localNotification.flags;
      paramInt |= i;
    }
    else
    {
      localNotification = this.OoooO;
      i = localNotification.flags;
      paramInt = (paramInt ^ 0xFFFFFFFF) & i;
    }
    localNotification.flags = paramInt;
  }
  
  public Builder OooO(int paramInt)
  {
    Notification localNotification = this.OoooO;
    localNotification.defaults = paramInt;
    paramInt &= 0x4;
    if (paramInt != 0)
    {
      paramInt = localNotification.flags | 0x1;
      localNotification.flags = paramInt;
    }
    return this;
  }
  
  public Builder OooO00o(NotificationCompat.Action paramAction)
  {
    if (paramAction != null)
    {
      ArrayList localArrayList = this.OooO0O0;
      localArrayList.add(paramAction);
    }
    return this;
  }
  
  public Notification OooO0O0()
  {
    NotificationCompatBuilder localNotificationCompatBuilder = new androidx/core/app/NotificationCompatBuilder;
    localNotificationCompatBuilder.<init>(this);
    return localNotificationCompatBuilder.OooO0O0();
  }
  
  public final Bitmap OooO0Oo(Bitmap paramBitmap)
  {
    return paramBitmap;
  }
  
  public Builder OooO0o(PendingIntent paramPendingIntent)
  {
    this.OooO0oO = paramPendingIntent;
    return this;
  }
  
  public Builder OooO0o0(boolean paramBoolean)
  {
    setFlag(16, paramBoolean);
    return this;
  }
  
  public Builder OooO0oO(CharSequence paramCharSequence)
  {
    paramCharSequence = OooO0OO(paramCharSequence);
    this.OooO0o = paramCharSequence;
    return this;
  }
  
  public Builder OooO0oo(CharSequence paramCharSequence)
  {
    paramCharSequence = OooO0OO(paramCharSequence);
    this.OooO0o0 = paramCharSequence;
    return this;
  }
  
  public Builder OooOO0(PendingIntent paramPendingIntent)
  {
    this.OoooO.deleteIntent = paramPendingIntent;
    return this;
  }
  
  public Builder OooOO0O(Bitmap paramBitmap)
  {
    paramBitmap = OooO0Oo(paramBitmap);
    this.OooOO0 = paramBitmap;
    return this;
  }
  
  public Builder OooOO0o(boolean paramBoolean)
  {
    setFlag(2, paramBoolean);
    return this;
  }
  
  public Builder OooOOO(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.OooOo00 = paramInt1;
    this.OooOo0 = paramInt2;
    this.OooOo0O = paramBoolean;
    return this;
  }
  
  public Builder OooOOO0(int paramInt)
  {
    this.OooOOO0 = paramInt;
    return this;
  }
  
  public Builder OooOOOO(int paramInt)
  {
    this.OoooO.icon = paramInt;
    return this;
  }
  
  public Builder OooOOOo(NotificationCompat.Style paramStyle)
  {
    NotificationCompat.Style localStyle = this.OooOOOo;
    if (localStyle != paramStyle)
    {
      this.OooOOOo = paramStyle;
      if (paramStyle != null) {
        paramStyle.setBuilder(this);
      }
    }
    return this;
  }
  
  public Builder OooOOo(long paramLong)
  {
    this.OoooO.when = paramLong;
    return this;
  }
  
  public Builder OooOOo0(CharSequence paramCharSequence)
  {
    Notification localNotification = this.OoooO;
    paramCharSequence = OooO0OO(paramCharSequence);
    localNotification.tickerText = paramCharSequence;
    return this;
  }
  
  public RemoteViews getBigContentView()
  {
    return this.Oooo0;
  }
  
  public NotificationCompat.BubbleMetadata getBubbleMetadata()
  {
    return this.OoooO0O;
  }
  
  public int getColor()
  {
    return this.OooOooo;
  }
  
  public RemoteViews getContentView()
  {
    return this.Oooo00o;
  }
  
  public Bundle getExtras()
  {
    Bundle localBundle = this.OooOooO;
    if (localBundle == null)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      this.OooOooO = localBundle;
    }
    return this.OooOooO;
  }
  
  public int getForegroundServiceBehavior()
  {
    return this.OoooO00;
  }
  
  public RemoteViews getHeadsUpContentView()
  {
    return this.Oooo0O0;
  }
  
  public Notification getNotification()
  {
    return OooO0O0();
  }
  
  public int getPriority()
  {
    return this.OooOOO0;
  }
  
  public long getWhenIfShowing()
  {
    boolean bool = this.OooOOO;
    long l;
    if (bool)
    {
      Notification localNotification = this.OoooO;
      l = localNotification.when;
    }
    else
    {
      l = 0L;
    }
    return l;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompat.Builder
 * JD-Core Version:    0.7.0.1
 */