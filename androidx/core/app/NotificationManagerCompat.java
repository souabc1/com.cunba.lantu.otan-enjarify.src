package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.BaseBundle;
import android.provider.Settings.Secure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class NotificationManagerCompat
{
  public static final Object OooO0OO;
  public static String OooO0Oo;
  public static final Object OooO0o;
  public static Set OooO0o0;
  public static NotificationManagerCompat.SideChannelManager OooO0oO;
  public final Context OooO00o;
  public final NotificationManager OooO0O0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0OO = localObject;
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    OooO0o0 = (Set)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooO0o = localObject;
  }
  
  public NotificationManagerCompat(Context paramContext)
  {
    this.OooO00o = paramContext;
    paramContext = (NotificationManager)paramContext.getSystemService("notification");
    this.OooO0O0 = paramContext;
  }
  
  public static Set OooO0o(Context paramContext)
  {
    paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "enabled_notification_listeners");
    Object localObject1 = OooO0OO;
    if (paramContext != null) {}
    try
    {
      Object localObject2 = OooO0Oo;
      boolean bool = paramContext.equals(localObject2);
      if (!bool)
      {
        localObject2 = ":";
        int i = -1;
        localObject2 = paramContext.split((String)localObject2, i);
        HashSet localHashSet = new java/util/HashSet;
        int j = localObject2.length;
        localHashSet.<init>(j);
        j = localObject2.length;
        int k = 0;
        while (k < j)
        {
          Object localObject3 = localObject2[k];
          localObject3 = ComponentName.unflattenFromString((String)localObject3);
          if (localObject3 != null)
          {
            localObject3 = ((ComponentName)localObject3).getPackageName();
            localHashSet.add(localObject3);
          }
          k += 1;
        }
        OooO0o0 = localHashSet;
        OooO0Oo = paramContext;
      }
      paramContext = OooO0o0;
      return paramContext;
    }
    finally {}
  }
  
  public static NotificationManagerCompat OooO0o0(Context paramContext)
  {
    NotificationManagerCompat localNotificationManagerCompat = new androidx/core/app/NotificationManagerCompat;
    localNotificationManagerCompat.<init>(paramContext);
    return localNotificationManagerCompat;
  }
  
  public static boolean OooOO0(Notification paramNotification)
  {
    paramNotification = NotificationCompat.OooO00o(paramNotification);
    if (paramNotification != null)
    {
      String str = "android.support.useSideChannel";
      bool = paramNotification.getBoolean(str);
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    paramNotification = null;
    return bool;
  }
  
  public final void OooO(NotificationManagerCompat.Task paramTask)
  {
    synchronized (OooO0o)
    {
      NotificationManagerCompat.SideChannelManager localSideChannelManager = OooO0oO;
      if (localSideChannelManager == null)
      {
        localSideChannelManager = new androidx/core/app/NotificationManagerCompat$SideChannelManager;
        Context localContext = this.OooO00o;
        localContext = localContext.getApplicationContext();
        localSideChannelManager.<init>(localContext);
        OooO0oO = localSideChannelManager;
      }
      localSideChannelManager = OooO0oO;
      localSideChannelManager.OooO0oo(paramTask);
      return;
    }
  }
  
  public boolean OooO00o()
  {
    return this.OooO0O0.areNotificationsEnabled();
  }
  
  public void OooO0O0(int paramInt)
  {
    OooO0OO(null, paramInt);
  }
  
  public void OooO0OO(String paramString, int paramInt)
  {
    this.OooO0O0.cancel(paramString, paramInt);
  }
  
  public void OooO0Oo(NotificationChannel paramNotificationChannel)
  {
    this.OooO0O0.createNotificationChannel(paramNotificationChannel);
  }
  
  public void OooO0oO(int paramInt, Notification paramNotification)
  {
    OooO0oo(null, paramInt, paramNotification);
  }
  
  public void OooO0oo(String paramString, int paramInt, Notification paramNotification)
  {
    boolean bool = OooOO0(paramNotification);
    Object localObject;
    if (bool)
    {
      localObject = new androidx/core/app/NotificationManagerCompat$NotifyTask;
      String str = this.OooO00o.getPackageName();
      ((NotificationManagerCompat.NotifyTask)localObject).<init>(str, paramInt, paramString, paramNotification);
      OooO((NotificationManagerCompat.Task)localObject);
      paramNotification = this.OooO0O0;
      paramNotification.cancel(paramString, paramInt);
    }
    else
    {
      localObject = this.OooO0O0;
      ((NotificationManager)localObject).notify(paramString, paramInt, paramNotification);
    }
  }
  
  public int getImportance()
  {
    return this.OooO0O0.getImportance();
  }
  
  public List getNotificationChannelGroups()
  {
    return this.OooO0O0.getNotificationChannelGroups();
  }
  
  public List getNotificationChannelGroupsCompat()
  {
    Object localObject = getNotificationChannelGroups();
    boolean bool1 = ((List)localObject).isEmpty();
    if (!bool1)
    {
      Collections.emptyList();
      ArrayList localArrayList = new java/util/ArrayList;
      int i = ((List)localObject).size();
      localArrayList.<init>(i);
      localObject = ((List)localObject).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject).hasNext();
        if (!bool2) {
          break;
        }
        NotificationChannelGroup localNotificationChannelGroup = (NotificationChannelGroup)((Iterator)localObject).next();
        NotificationChannelGroupCompat localNotificationChannelGroupCompat = new androidx/core/app/NotificationChannelGroupCompat;
        localNotificationChannelGroupCompat.<init>(localNotificationChannelGroup);
        localArrayList.add(localNotificationChannelGroupCompat);
      }
      return localArrayList;
    }
    return Collections.emptyList();
  }
  
  public List getNotificationChannels()
  {
    return this.OooO0O0.getNotificationChannels();
  }
  
  public List getNotificationChannelsCompat()
  {
    Object localObject = getNotificationChannels();
    boolean bool1 = ((List)localObject).isEmpty();
    if (!bool1)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      int i = ((List)localObject).size();
      localArrayList.<init>(i);
      localObject = ((List)localObject).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject).hasNext();
        if (!bool2) {
          break;
        }
        NotificationChannel localNotificationChannel = (NotificationChannel)((Iterator)localObject).next();
        NotificationChannelCompat localNotificationChannelCompat = new androidx/core/app/NotificationChannelCompat;
        localNotificationChannelCompat.<init>(localNotificationChannel);
        localArrayList.add(localNotificationChannelCompat);
      }
      return localArrayList;
    }
    return Collections.emptyList();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationManagerCompat
 * JD-Core Version:    0.7.0.1
 */