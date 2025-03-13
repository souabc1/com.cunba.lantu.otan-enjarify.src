package androidx.core.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Action.Builder;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class NotificationCompatBuilder
  implements NotificationBuilderWithBuilderAccessor
{
  public RemoteViews OooO;
  public final Context OooO00o;
  public final Notification.Builder OooO0O0;
  public final NotificationCompat.Builder OooO0OO;
  public RemoteViews OooO0Oo;
  public final List OooO0o;
  public RemoteViews OooO0o0;
  public final Bundle OooO0oO;
  public int OooO0oo;
  
  public NotificationCompatBuilder(NotificationCompat.Builder paramBuilder)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.OooO0o = ((List)localObject1);
    localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    this.OooO0oO = ((Bundle)localObject1);
    this.OooO0OO = paramBuilder;
    localObject1 = paramBuilder.OooO00o;
    this.OooO00o = ((Context)localObject1);
    localObject1 = new android/app/Notification$Builder;
    Object localObject2 = paramBuilder.OooO00o;
    Object localObject3 = paramBuilder.Oooo0OO;
    ((Notification.Builder)localObject1).<init>((Context)localObject2, (String)localObject3);
    this.OooO0O0 = ((Notification.Builder)localObject1);
    localObject2 = paramBuilder.OoooO;
    long l = ((Notification)localObject2).when;
    localObject3 = ((Notification.Builder)localObject1).setWhen(l);
    int i = ((Notification)localObject2).icon;
    int i1 = ((Notification)localObject2).iconLevel;
    localObject3 = ((Notification.Builder)localObject3).setSmallIcon(i, i1);
    Object localObject4 = ((Notification)localObject2).contentView;
    localObject3 = ((Notification.Builder)localObject3).setContent((RemoteViews)localObject4);
    localObject4 = ((Notification)localObject2).tickerText;
    RemoteViews localRemoteViews = paramBuilder.OooO;
    localObject3 = ((Notification.Builder)localObject3).setTicker((CharSequence)localObject4, localRemoteViews);
    localObject4 = ((Notification)localObject2).vibrate;
    localObject3 = ((Notification.Builder)localObject3).setVibrate((long[])localObject4);
    i = ((Notification)localObject2).ledARGB;
    i1 = ((Notification)localObject2).ledOnMS;
    int i2 = ((Notification)localObject2).ledOffMS;
    localObject3 = ((Notification.Builder)localObject3).setLights(i, i1, i2);
    i = ((Notification)localObject2).flags;
    i1 = 2;
    i &= i1;
    i2 = 1;
    boolean bool2 = false;
    Object localObject5 = null;
    if (i != 0)
    {
      i = i2;
    }
    else
    {
      i = 0;
      localObject4 = null;
    }
    localObject3 = ((Notification.Builder)localObject3).setOngoing(i);
    int j = ((Notification)localObject2).flags & 0x8;
    if (j != 0)
    {
      j = i2;
    }
    else
    {
      j = 0;
      localObject4 = null;
    }
    localObject3 = ((Notification.Builder)localObject3).setOnlyAlertOnce(j);
    int k = ((Notification)localObject2).flags & 0x10;
    if (k != 0)
    {
      k = i2;
    }
    else
    {
      k = 0;
      localObject4 = null;
    }
    localObject3 = ((Notification.Builder)localObject3).setAutoCancel(k);
    int m = ((Notification)localObject2).defaults;
    localObject3 = ((Notification.Builder)localObject3).setDefaults(m);
    localObject4 = paramBuilder.OooO0o0;
    localObject3 = ((Notification.Builder)localObject3).setContentTitle((CharSequence)localObject4);
    localObject4 = paramBuilder.OooO0o;
    localObject3 = ((Notification.Builder)localObject3).setContentText((CharSequence)localObject4);
    localObject4 = paramBuilder.OooOO0O;
    localObject3 = ((Notification.Builder)localObject3).setContentInfo((CharSequence)localObject4);
    localObject4 = paramBuilder.OooO0oO;
    localObject3 = ((Notification.Builder)localObject3).setContentIntent((PendingIntent)localObject4);
    localObject4 = ((Notification)localObject2).deleteIntent;
    localObject3 = ((Notification.Builder)localObject3).setDeleteIntent((PendingIntent)localObject4);
    localObject4 = paramBuilder.OooO0oo;
    int i3 = ((Notification)localObject2).flags & 0x80;
    Bundle localBundle1;
    if (i3 != 0)
    {
      i3 = i2;
    }
    else
    {
      i3 = 0;
      localBundle1 = null;
    }
    localObject3 = ((Notification.Builder)localObject3).setFullScreenIntent((PendingIntent)localObject4, i3);
    localObject4 = paramBuilder.OooOO0;
    localObject3 = ((Notification.Builder)localObject3).setLargeIcon((Bitmap)localObject4);
    m = paramBuilder.OooOO0o;
    localObject3 = ((Notification.Builder)localObject3).setNumber(m);
    m = paramBuilder.OooOo00;
    int i4 = paramBuilder.OooOo0;
    int i5 = paramBuilder.OooOo0O;
    ((Notification.Builder)localObject3).setProgress(m, i4, i5);
    localObject3 = paramBuilder.OooOOo0;
    localObject1 = ((Notification.Builder)localObject1).setSubText((CharSequence)localObject3);
    boolean bool3 = paramBuilder.OooOOOO;
    localObject1 = ((Notification.Builder)localObject1).setUsesChronometer(bool3);
    int i7 = paramBuilder.OooOOO0;
    ((Notification.Builder)localObject1).setPriority(i7);
    localObject1 = paramBuilder.OooO0O0.iterator();
    for (;;)
    {
      bool4 = ((Iterator)localObject1).hasNext();
      if (!bool4) {
        break;
      }
      localObject3 = (NotificationCompat.Action)((Iterator)localObject1).next();
      OooO00o((NotificationCompat.Action)localObject3);
    }
    localObject1 = paramBuilder.OooOooO;
    if (localObject1 != null)
    {
      localObject3 = this.OooO0oO;
      ((Bundle)localObject3).putAll((Bundle)localObject1);
    }
    localObject1 = paramBuilder.Oooo00o;
    this.OooO0Oo = ((RemoteViews)localObject1);
    localObject1 = paramBuilder.Oooo0;
    this.OooO0o0 = ((RemoteViews)localObject1);
    localObject1 = this.OooO0O0;
    boolean bool4 = paramBuilder.OooOOO;
    ((Notification.Builder)localObject1).setShowWhen(bool4);
    localObject1 = this.OooO0O0;
    bool4 = paramBuilder.OooOoO;
    localObject1 = ((Notification.Builder)localObject1).setLocalOnly(bool4);
    localObject3 = paramBuilder.OooOo0o;
    localObject1 = ((Notification.Builder)localObject1).setGroup((String)localObject3);
    bool4 = paramBuilder.OooOo;
    localObject1 = ((Notification.Builder)localObject1).setGroupSummary(bool4);
    localObject3 = paramBuilder.OooOoO0;
    ((Notification.Builder)localObject1).setSortKey((String)localObject3);
    int i10 = paramBuilder.Oooo;
    this.OooO0oo = i10;
    localObject1 = this.OooO0O0;
    localObject3 = paramBuilder.OooOoo;
    localObject1 = ((Notification.Builder)localObject1).setCategory((String)localObject3);
    int i8 = paramBuilder.OooOooo;
    localObject1 = ((Notification.Builder)localObject1).setColor(i8);
    i8 = paramBuilder.Oooo000;
    localObject1 = ((Notification.Builder)localObject1).setVisibility(i8);
    localObject3 = paramBuilder.Oooo00O;
    localObject1 = ((Notification.Builder)localObject1).setPublicVersion((Notification)localObject3);
    localObject3 = ((Notification)localObject2).sound;
    localObject4 = ((Notification)localObject2).audioAttributes;
    ((Notification.Builder)localObject1).setSound((Uri)localObject3, (AudioAttributes)localObject4);
    localObject1 = paramBuilder.OoooOOO;
    if (localObject1 != null)
    {
      boolean bool5 = ((List)localObject1).isEmpty();
      if (!bool5)
      {
        localObject1 = ((List)localObject1).iterator();
        for (;;)
        {
          bool5 = ((Iterator)localObject1).hasNext();
          if (!bool5) {
            break;
          }
          localObject3 = (String)((Iterator)localObject1).next();
          localObject4 = this.OooO0O0;
          ((Notification.Builder)localObject4).addPerson((String)localObject3);
        }
      }
    }
    localObject1 = paramBuilder.Oooo0O0;
    this.OooO = ((RemoteViews)localObject1);
    localObject1 = paramBuilder.OooO0Oo;
    i10 = ((ArrayList)localObject1).size();
    if (i10 > 0)
    {
      localObject1 = paramBuilder.getExtras();
      localObject3 = "android.car.EXTENSIONS";
      localObject1 = ((Bundle)localObject1).getBundle((String)localObject3);
      if (localObject1 == null)
      {
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
      }
      localObject4 = new android/os/Bundle;
      ((Bundle)localObject4).<init>((Bundle)localObject1);
      localBundle1 = new android/os/Bundle;
      localBundle1.<init>();
      i5 = 0;
      String str = null;
      for (;;)
      {
        Object localObject6 = paramBuilder.OooO0Oo;
        int i12 = ((ArrayList)localObject6).size();
        if (i5 >= i12) {
          break;
        }
        localObject6 = Integer.toString(i5);
        Bundle localBundle2 = NotificationCompatJellybean.OooO00o((NotificationCompat.Action)paramBuilder.OooO0Oo.get(i5));
        localBundle1.putBundle((String)localObject6, localBundle2);
        int i6;
        i5 += 1;
      }
      str = "invisible_actions";
      ((Bundle)localObject1).putBundle(str, localBundle1);
      ((Bundle)localObject4).putBundle(str, localBundle1);
      localBundle1 = paramBuilder.getExtras();
      localBundle1.putBundle((String)localObject3, (Bundle)localObject1);
      localObject1 = this.OooO0oO;
      ((Bundle)localObject1).putBundle((String)localObject3, (Bundle)localObject4);
    }
    localObject1 = paramBuilder.o000oOoO;
    if (localObject1 != null)
    {
      localObject3 = this.OooO0O0;
      ((Notification.Builder)localObject3).setSmallIcon((Icon)localObject1);
    }
    localObject1 = this.OooO0O0;
    localObject3 = paramBuilder.OooOooO;
    localObject1 = ((Notification.Builder)localObject1).setExtras((Bundle)localObject3);
    localObject3 = paramBuilder.OooOOoo;
    ((Notification.Builder)localObject1).setRemoteInputHistory((CharSequence[])localObject3);
    localObject1 = paramBuilder.Oooo00o;
    if (localObject1 != null)
    {
      localObject3 = this.OooO0O0;
      ((Notification.Builder)localObject3).setCustomContentView((RemoteViews)localObject1);
    }
    localObject1 = paramBuilder.Oooo0;
    if (localObject1 != null)
    {
      localObject3 = this.OooO0O0;
      ((Notification.Builder)localObject3).setCustomBigContentView((RemoteViews)localObject1);
    }
    localObject1 = paramBuilder.Oooo0O0;
    if (localObject1 != null)
    {
      localObject3 = this.OooO0O0;
      ((Notification.Builder)localObject3).setCustomHeadsUpContentView((RemoteViews)localObject1);
    }
    localObject1 = this.OooO0O0;
    int i9 = paramBuilder.Oooo0o0;
    localObject1 = ((Notification.Builder)localObject1).setBadgeIconType(i9);
    localObject3 = paramBuilder.OooOOo;
    localObject1 = ((Notification.Builder)localObject1).setSettingsText((CharSequence)localObject3);
    localObject3 = paramBuilder.Oooo0o;
    localObject1 = ((Notification.Builder)localObject1).setShortcutId((String)localObject3);
    l = paramBuilder.Oooo0oo;
    localObject1 = ((Notification.Builder)localObject1).setTimeoutAfter(l);
    i9 = paramBuilder.Oooo;
    ((Notification.Builder)localObject1).setGroupAlertBehavior(i9);
    boolean bool7 = paramBuilder.OooOoo0;
    if (bool7)
    {
      localObject1 = this.OooO0O0;
      bool6 = paramBuilder.OooOoOO;
      ((Notification.Builder)localObject1).setColorized(bool6);
    }
    localObject1 = paramBuilder.Oooo0OO;
    bool7 = TextUtils.isEmpty((CharSequence)localObject1);
    boolean bool6 = false;
    localObject3 = null;
    if (!bool7)
    {
      localObject1 = this.OooO0O0.setSound(null).setDefaults(0).setLights(0, 0, 0);
      ((Notification.Builder)localObject1).setVibrate(null);
    }
    localObject1 = paramBuilder.OooO0OO.iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject4 = (Person)((Iterator)localObject1).next();
      localObject5 = this.OooO0O0;
      localObject4 = ((Person)localObject4).OooO00o();
      ((Notification.Builder)localObject5).addPerson((android.app.Person)localObject4);
    }
    int i11 = Build.VERSION.SDK_INT;
    int n = 29;
    if (i11 >= n)
    {
      localObject4 = this.OooO0O0;
      bool2 = paramBuilder.OoooO0;
      OooOO0O.OooO00o((Notification.Builder)localObject4, bool2);
      localObject4 = this.OooO0O0;
      localObject5 = NotificationCompat.BubbleMetadata.OooO00o(paramBuilder.OoooO0O);
      OooOOO0.OooO00o((Notification.Builder)localObject4, (Notification.BubbleMetadata)localObject5);
      localObject4 = paramBuilder.Oooo0oO;
      if (localObject4 != null)
      {
        localObject5 = this.OooO0O0;
        localObject4 = ((LocusIdCompat)localObject4).OooO00o();
        OooOOO.OooO00o((Notification.Builder)localObject5, (LocusId)localObject4);
      }
    }
    n = 31;
    if (i11 >= n)
    {
      i11 = paramBuilder.OoooO00;
      if (i11 != 0)
      {
        localObject4 = this.OooO0O0;
        OooOOOO.OooO00o((Notification.Builder)localObject4, i11);
      }
    }
    boolean bool8 = paramBuilder.OoooOO0;
    if (bool8)
    {
      paramBuilder = this.OooO0OO;
      bool8 = paramBuilder.OooOo;
      if (bool8) {
        this.OooO0oo = i1;
      } else {
        this.OooO0oo = i2;
      }
      this.OooO0O0.setVibrate(null);
      this.OooO0O0.setSound(null);
      int i13 = ((Notification)localObject2).defaults & 0xFFFFFFFE & 0xFFFFFFFD;
      ((Notification)localObject2).defaults = i13;
      localObject1 = this.OooO0O0;
      ((Notification.Builder)localObject1).setDefaults(i13);
      paramBuilder = this.OooO0OO.OooOo0o;
      boolean bool9 = TextUtils.isEmpty(paramBuilder);
      if (bool9)
      {
        paramBuilder = this.OooO0O0;
        localObject1 = "silent";
        paramBuilder.setGroup((String)localObject1);
      }
      paramBuilder = this.OooO0O0;
      i11 = this.OooO0oo;
      paramBuilder.setGroupAlertBehavior(i11);
    }
  }
  
  public final void OooO00o(NotificationCompat.Action paramAction)
  {
    Object localObject1 = paramAction.getIconCompat();
    Notification.Action.Builder localBuilder = new android/app/Notification$Action$Builder;
    if (localObject1 != null) {
      localObject1 = ((IconCompat)localObject1).OooOO0o();
    } else {
      localObject1 = null;
    }
    Object localObject2 = paramAction.getTitle();
    Object localObject3 = paramAction.getActionIntent();
    localBuilder.<init>((Icon)localObject1, (CharSequence)localObject2, (PendingIntent)localObject3);
    localObject1 = paramAction.getRemoteInputs();
    if (localObject1 != null)
    {
      localObject1 = RemoteInput.OooO0O0(paramAction.getRemoteInputs());
      i = localObject1.length;
      int j = 0;
      localObject3 = null;
      while (j < i)
      {
        android.app.RemoteInput localRemoteInput = localObject1[j];
        localBuilder.addRemoteInput(localRemoteInput);
        j += 1;
      }
    }
    localObject1 = paramAction.getExtras();
    if (localObject1 != null)
    {
      localObject1 = new android/os/Bundle;
      localObject2 = paramAction.getExtras();
      ((Bundle)localObject1).<init>((Bundle)localObject2);
    }
    else
    {
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
    }
    localObject2 = "android.support.allowGeneratedReplies";
    boolean bool2 = paramAction.getAllowGeneratedReplies();
    ((BaseBundle)localObject1).putBoolean((String)localObject2, bool2);
    int i = Build.VERSION.SDK_INT;
    bool2 = paramAction.getAllowGeneratedReplies();
    localBuilder.setAllowGeneratedReplies(bool2);
    localObject3 = "android.support.action.semanticAction";
    int n = paramAction.getSemanticAction();
    ((BaseBundle)localObject1).putInt((String)localObject3, n);
    int k = paramAction.getSemanticAction();
    localBuilder.setSemanticAction(k);
    k = 29;
    if (i >= k)
    {
      boolean bool3 = paramAction.isContextual();
      OooOo00.OooO00o(localBuilder, bool3);
    }
    int m = 31;
    if (i >= m)
    {
      boolean bool1 = paramAction.isAuthenticationRequired();
      OooOo.OooO00o(localBuilder, bool1);
    }
    boolean bool4 = paramAction.getShowsUserInterface();
    ((BaseBundle)localObject1).putBoolean("android.support.action.showsUserInterface", bool4);
    localBuilder.addExtras((Bundle)localObject1);
    paramAction = this.OooO0O0;
    localObject1 = localBuilder.build();
    paramAction.addAction((Notification.Action)localObject1);
  }
  
  public Notification OooO0O0()
  {
    NotificationCompat.Style localStyle = this.OooO0OO.OooOOOo;
    if (localStyle != null) {
      localStyle.OooO0O0(this);
    }
    Object localObject;
    if (localStyle != null) {
      localObject = localStyle.OooO0Oo(this);
    } else {
      localObject = null;
    }
    Notification localNotification = OooO0OO();
    if (localObject != null) {}
    do
    {
      localNotification.contentView = ((RemoteViews)localObject);
      break;
      localObject = this.OooO0OO.Oooo00o;
    } while (localObject != null);
    if (localStyle != null)
    {
      localObject = localStyle.OooO0OO(this);
      if (localObject != null) {
        localNotification.bigContentView = ((RemoteViews)localObject);
      }
    }
    if (localStyle != null)
    {
      localObject = this.OooO0OO.OooOOOo.OooO0o0(this);
      if (localObject != null) {
        localNotification.headsUpContentView = ((RemoteViews)localObject);
      }
    }
    if (localStyle != null)
    {
      localObject = NotificationCompat.OooO00o(localNotification);
      if (localObject != null) {
        localStyle.OooO00o((Bundle)localObject);
      }
    }
    return localNotification;
  }
  
  public Notification OooO0OO()
  {
    return this.OooO0O0.build();
  }
  
  public Notification.Builder getBuilder()
  {
    return this.OooO0O0;
  }
  
  public Context getContext()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationCompatBuilder
 * JD-Core Version:    0.7.0.1
 */