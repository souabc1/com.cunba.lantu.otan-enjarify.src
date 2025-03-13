package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NotificationChannelGroupCompat
{
  public final String OooO00o;
  public CharSequence OooO0O0;
  public String OooO0OO;
  public boolean OooO0Oo;
  public List OooO0o0;
  
  public NotificationChannelGroupCompat(NotificationChannelGroup paramNotificationChannelGroup)
  {
    this(paramNotificationChannelGroup, localList);
  }
  
  public NotificationChannelGroupCompat(NotificationChannelGroup paramNotificationChannelGroup, List paramList)
  {
    this(paramList);
    paramList = paramNotificationChannelGroup.getName();
    this.OooO0O0 = paramList;
    paramList = paramNotificationChannelGroup.getDescription();
    this.OooO0OO = paramList;
    boolean bool = paramNotificationChannelGroup.isBlocked();
    this.OooO0Oo = bool;
    paramNotificationChannelGroup = paramNotificationChannelGroup.getChannels();
    paramNotificationChannelGroup = OooO00o(paramNotificationChannelGroup);
    this.OooO0o0 = paramNotificationChannelGroup;
  }
  
  public NotificationChannelGroupCompat(String paramString)
  {
    List localList = Collections.emptyList();
    this.OooO0o0 = localList;
    paramString = (String)Preconditions.OooO0oo(paramString);
    this.OooO00o = paramString;
  }
  
  public final List OooO00o(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    paramList = paramList.iterator();
    for (;;)
    {
      boolean bool1 = paramList.hasNext();
      if (!bool1) {
        break;
      }
      NotificationChannel localNotificationChannel = (NotificationChannel)paramList.next();
      Object localObject = this.OooO00o;
      String str = localNotificationChannel.getGroup();
      boolean bool2 = ((String)localObject).equals(str);
      if (bool2)
      {
        localObject = new androidx/core/app/NotificationChannelCompat;
        ((NotificationChannelCompat)localObject).<init>(localNotificationChannel);
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public List getChannels()
  {
    return this.OooO0o0;
  }
  
  public String getDescription()
  {
    return this.OooO0OO;
  }
  
  public String getId()
  {
    return this.OooO00o;
  }
  
  public CharSequence getName()
  {
    return this.OooO0O0;
  }
  
  public NotificationChannelGroup getNotificationChannelGroup()
  {
    NotificationChannelGroup localNotificationChannelGroup = new android/app/NotificationChannelGroup;
    String str = this.OooO00o;
    CharSequence localCharSequence = this.OooO0O0;
    localNotificationChannelGroup.<init>(str, localCharSequence);
    str = this.OooO0OO;
    localNotificationChannelGroup.setDescription(str);
    return localNotificationChannelGroup;
  }
  
  public boolean isBlocked()
  {
    return this.OooO0Oo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationChannelGroupCompat
 * JD-Core Version:    0.7.0.1
 */