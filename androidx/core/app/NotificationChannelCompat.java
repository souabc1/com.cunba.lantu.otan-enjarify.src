package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import androidx.core.util.Preconditions;

public class NotificationChannelCompat
{
  public boolean OooO;
  public final String OooO00o;
  public CharSequence OooO0O0;
  public int OooO0OO;
  public String OooO0Oo;
  public boolean OooO0o = true;
  public String OooO0o0;
  public Uri OooO0oO;
  public AudioAttributes OooO0oo;
  public int OooOO0;
  public boolean OooOO0O;
  public long[] OooOO0o;
  public String OooOOO;
  public String OooOOO0;
  public boolean OooOOOO;
  public int OooOOOo;
  public boolean OooOOo;
  public boolean OooOOo0;
  
  public NotificationChannelCompat(NotificationChannel paramNotificationChannel)
  {
    this((String)localObject, i);
    localObject = paramNotificationChannel.getName();
    this.OooO0O0 = ((CharSequence)localObject);
    localObject = paramNotificationChannel.getDescription();
    this.OooO0Oo = ((String)localObject);
    localObject = paramNotificationChannel.getGroup();
    this.OooO0o0 = ((String)localObject);
    boolean bool1 = paramNotificationChannel.canShowBadge();
    this.OooO0o = bool1;
    localObject = paramNotificationChannel.getSound();
    this.OooO0oO = ((Uri)localObject);
    localObject = paramNotificationChannel.getAudioAttributes();
    this.OooO0oo = ((AudioAttributes)localObject);
    bool1 = paramNotificationChannel.shouldShowLights();
    this.OooO = bool1;
    int j = paramNotificationChannel.getLightColor();
    this.OooOO0 = j;
    boolean bool2 = paramNotificationChannel.shouldVibrate();
    this.OooOO0O = bool2;
    localObject = paramNotificationChannel.getVibrationPattern();
    this.OooOO0o = ((long[])localObject);
    int k = Build.VERSION.SDK_INT;
    i = 30;
    if (k >= i)
    {
      String str = OooO0O0.OooO00o(paramNotificationChannel);
      this.OooOOO0 = str;
      str = OooO0OO.OooO00o(paramNotificationChannel);
      this.OooOOO = str;
    }
    boolean bool3 = paramNotificationChannel.canBypassDnd();
    this.OooOOOO = bool3;
    int m = paramNotificationChannel.getLockscreenVisibility();
    this.OooOOOo = m;
    m = 29;
    if (k >= m)
    {
      boolean bool4 = OooO0o.OooO00o(paramNotificationChannel);
      this.OooOOo0 = bool4;
    }
    if (k >= i)
    {
      boolean bool5 = OooO.OooO00o(paramNotificationChannel);
      this.OooOOo = bool5;
    }
  }
  
  public NotificationChannelCompat(String paramString, int paramInt)
  {
    Uri localUri = Settings.System.DEFAULT_NOTIFICATION_URI;
    this.OooO0oO = localUri;
    this.OooOO0 = 0;
    paramString = (String)Preconditions.OooO0oo(paramString);
    this.OooO00o = paramString;
    this.OooO0OO = paramInt;
    paramString = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    this.OooO0oo = paramString;
  }
  
  public AudioAttributes getAudioAttributes()
  {
    return this.OooO0oo;
  }
  
  public String getConversationId()
  {
    return this.OooOOO;
  }
  
  public String getDescription()
  {
    return this.OooO0Oo;
  }
  
  public String getGroup()
  {
    return this.OooO0o0;
  }
  
  public String getId()
  {
    return this.OooO00o;
  }
  
  public int getImportance()
  {
    return this.OooO0OO;
  }
  
  public int getLightColor()
  {
    return this.OooOO0;
  }
  
  public int getLockscreenVisibility()
  {
    return this.OooOOOo;
  }
  
  public CharSequence getName()
  {
    return this.OooO0O0;
  }
  
  public NotificationChannel getNotificationChannel()
  {
    int i = Build.VERSION.SDK_INT;
    NotificationChannel localNotificationChannel = new android/app/NotificationChannel;
    Object localObject1 = this.OooO00o;
    Object localObject2 = this.OooO0O0;
    int j = this.OooO0OO;
    localNotificationChannel.<init>((String)localObject1, (CharSequence)localObject2, j);
    localObject1 = this.OooO0Oo;
    localNotificationChannel.setDescription((String)localObject1);
    localObject1 = this.OooO0o0;
    localNotificationChannel.setGroup((String)localObject1);
    boolean bool1 = this.OooO0o;
    localNotificationChannel.setShowBadge(bool1);
    localObject1 = this.OooO0oO;
    localObject2 = this.OooO0oo;
    localNotificationChannel.setSound((Uri)localObject1, (AudioAttributes)localObject2);
    bool1 = this.OooO;
    localNotificationChannel.enableLights(bool1);
    int k = this.OooOO0;
    localNotificationChannel.setLightColor(k);
    localObject1 = this.OooOO0o;
    localNotificationChannel.setVibrationPattern((long[])localObject1);
    boolean bool2 = this.OooOO0O;
    localNotificationChannel.enableVibration(bool2);
    int m = 30;
    if (i >= m)
    {
      String str = this.OooOOO0;
      if (str != null)
      {
        localObject1 = this.OooOOO;
        if (localObject1 != null) {
          OooOO0.OooO00o(localNotificationChannel, str, (String)localObject1);
        }
      }
    }
    return localNotificationChannel;
  }
  
  public String getParentChannelId()
  {
    return this.OooOOO0;
  }
  
  public Uri getSound()
  {
    return this.OooO0oO;
  }
  
  public long[] getVibrationPattern()
  {
    return this.OooOO0o;
  }
  
  public boolean isImportantConversation()
  {
    return this.OooOOo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationChannelCompat
 * JD-Core Version:    0.7.0.1
 */