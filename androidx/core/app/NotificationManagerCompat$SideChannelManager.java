package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;
import android.support.v4.app.INotificationSideChannel.Stub;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class NotificationManagerCompat$SideChannelManager
  implements Handler.Callback, ServiceConnection
{
  public final Context OooO00o;
  public final HandlerThread OooO0O0;
  public final Handler OooO0OO;
  public final Map OooO0Oo;
  public Set OooO0o0;
  
  public NotificationManagerCompat$SideChannelManager(Context paramContext)
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO0Oo = ((Map)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.OooO0o0 = ((Set)localObject);
    this.OooO00o = paramContext;
    paramContext = new android/os/HandlerThread;
    paramContext.<init>("NotificationManagerCompat");
    this.OooO0O0 = paramContext;
    paramContext.start();
    localObject = new android/os/Handler;
    paramContext = paramContext.getLooper();
    ((Handler)localObject).<init>(paramContext, this);
    this.OooO0OO = ((Handler)localObject);
  }
  
  public final void OooO(NotificationManagerCompat.SideChannelManager.ListenerRecord paramListenerRecord)
  {
    Object localObject1 = this.OooO0OO;
    Object localObject2 = paramListenerRecord.OooO00o;
    int i = 3;
    boolean bool1 = ((Handler)localObject1).hasMessages(i, localObject2);
    if (bool1) {
      return;
    }
    int j = paramListenerRecord.OooO0o0;
    int k = 1;
    j += k;
    paramListenerRecord.OooO0o0 = j;
    int m = 6;
    if (j > m)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("Giving up on delivering ");
      k = paramListenerRecord.OooO0Oo.size();
      ((StringBuilder)localObject1).append(k);
      ((StringBuilder)localObject1).append(" tasks to ");
      localObject2 = paramListenerRecord.OooO00o;
      ((StringBuilder)localObject1).append(localObject2);
      ((StringBuilder)localObject1).append(" after ");
      k = paramListenerRecord.OooO0o0;
      ((StringBuilder)localObject1).append(k);
      ((StringBuilder)localObject1).append(" retries");
      paramListenerRecord.OooO0Oo.clear();
      return;
    }
    j -= k;
    j = (k << j) * 1000;
    localObject2 = "NotifManCompat";
    boolean bool2 = Log.isLoggable((String)localObject2, i);
    if (bool2)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Scheduling retry for ");
      ((StringBuilder)localObject2).append(j);
      String str = " ms";
      ((StringBuilder)localObject2).append(str);
    }
    localObject2 = this.OooO0OO;
    paramListenerRecord = paramListenerRecord.OooO00o;
    paramListenerRecord = ((Handler)localObject2).obtainMessage(i, paramListenerRecord);
    localObject2 = this.OooO0OO;
    long l = j;
    ((Handler)localObject2).sendMessageDelayed(paramListenerRecord, l);
  }
  
  public final boolean OooO00o(NotificationManagerCompat.SideChannelManager.ListenerRecord paramListenerRecord)
  {
    boolean bool = paramListenerRecord.OooO0O0;
    if (bool) {
      return true;
    }
    Object localObject1 = new android/content/Intent;
    ((Intent)localObject1).<init>("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
    Object localObject2 = paramListenerRecord.OooO00o;
    localObject1 = ((Intent)localObject1).setComponent((ComponentName)localObject2);
    localObject2 = this.OooO00o;
    int i = 33;
    bool = ((Context)localObject2).bindService((Intent)localObject1, this, i);
    paramListenerRecord.OooO0O0 = bool;
    if (bool)
    {
      bool = false;
      localObject1 = null;
      paramListenerRecord.OooO0o0 = 0;
    }
    else
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("Unable to bind to listener ");
      localObject2 = paramListenerRecord.OooO00o;
      ((StringBuilder)localObject1).append(localObject2);
      localObject1 = this.OooO00o;
      ((Context)localObject1).unbindService(this);
    }
    return paramListenerRecord.OooO0O0;
  }
  
  public final void OooO0O0(NotificationManagerCompat.SideChannelManager.ListenerRecord paramListenerRecord)
  {
    boolean bool = paramListenerRecord.OooO0O0;
    if (bool)
    {
      this.OooO00o.unbindService(this);
      bool = false;
      paramListenerRecord.OooO0O0 = false;
    }
    paramListenerRecord.OooO0OO = null;
  }
  
  public final void OooO0OO(NotificationManagerCompat.Task paramTask)
  {
    OooOO0();
    Iterator localIterator = this.OooO0Oo.values().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      NotificationManagerCompat.SideChannelManager.ListenerRecord localListenerRecord = (NotificationManagerCompat.SideChannelManager.ListenerRecord)localIterator.next();
      ArrayDeque localArrayDeque = localListenerRecord.OooO0Oo;
      localArrayDeque.add(paramTask);
      OooO0oO(localListenerRecord);
    }
  }
  
  public final void OooO0Oo(ComponentName paramComponentName)
  {
    Map localMap = this.OooO0Oo;
    paramComponentName = (NotificationManagerCompat.SideChannelManager.ListenerRecord)localMap.get(paramComponentName);
    if (paramComponentName != null) {
      OooO0oO(paramComponentName);
    }
  }
  
  public final void OooO0o(ComponentName paramComponentName)
  {
    Map localMap = this.OooO0Oo;
    paramComponentName = (NotificationManagerCompat.SideChannelManager.ListenerRecord)localMap.get(paramComponentName);
    if (paramComponentName != null) {
      OooO0O0(paramComponentName);
    }
  }
  
  public final void OooO0o0(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Map localMap = this.OooO0Oo;
    paramComponentName = (NotificationManagerCompat.SideChannelManager.ListenerRecord)localMap.get(paramComponentName);
    if (paramComponentName != null)
    {
      paramIBinder = INotificationSideChannel.Stub.o0Oo0o0O(paramIBinder);
      paramComponentName.OooO0OO = paramIBinder;
      paramIBinder = null;
      paramComponentName.OooO0o0 = 0;
      OooO0oO(paramComponentName);
    }
  }
  
  public final void OooO0oO(NotificationManagerCompat.SideChannelManager.ListenerRecord paramListenerRecord)
  {
    Object localObject1 = "NotifManCompat";
    int i = 3;
    boolean bool1 = Log.isLoggable((String)localObject1, i);
    Object localObject3;
    if (bool1)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Processing component ");
      localObject3 = paramListenerRecord.OooO00o;
      ((StringBuilder)localObject2).append(localObject3);
      ((StringBuilder)localObject2).append(", ");
      int j = paramListenerRecord.OooO0Oo.size();
      ((StringBuilder)localObject2).append(j);
      localObject3 = " queued tasks";
      ((StringBuilder)localObject2).append((String)localObject3);
    }
    Object localObject2 = paramListenerRecord.OooO0Oo;
    bool1 = ((ArrayDeque)localObject2).isEmpty();
    if (bool1) {
      return;
    }
    bool1 = OooO00o(paramListenerRecord);
    if (bool1)
    {
      localObject2 = paramListenerRecord.OooO0OO;
      if (localObject2 != null)
      {
        for (;;)
        {
          localObject2 = (NotificationManagerCompat.Task)paramListenerRecord.OooO0Oo.peek();
          if (localObject2 != null) {
            try
            {
              boolean bool2 = Log.isLoggable((String)localObject1, i);
              if (bool2)
              {
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                String str = "Sending task ";
                ((StringBuilder)localObject3).append(str);
                ((StringBuilder)localObject3).append(localObject2);
              }
              localObject3 = paramListenerRecord.OooO0OO;
              ((NotificationManagerCompat.Task)localObject2).OooO00o((INotificationSideChannel)localObject3);
              localObject2 = paramListenerRecord.OooO0Oo;
              ((ArrayDeque)localObject2).remove();
            }
            catch (RemoteException localRemoteException)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject4 = "RemoteException communicating with ";
              ((StringBuilder)localObject1).append((String)localObject4);
              localObject4 = paramListenerRecord.OooO00o;
              ((StringBuilder)localObject1).append(localObject4);
            }
            catch (DeadObjectException localDeadObjectException)
            {
              for (;;)
              {
                bool3 = Log.isLoggable((String)localObject1, i);
                if (!bool3) {
                  break;
                }
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                Object localObject4 = "Remote service has died: ";
              }
            }
          }
        }
        localObject1 = paramListenerRecord.OooO0Oo;
        boolean bool3 = ((ArrayDeque)localObject1).isEmpty();
        if (!bool3) {
          OooO(paramListenerRecord);
        }
        return;
      }
    }
    OooO(paramListenerRecord);
  }
  
  public void OooO0oo(NotificationManagerCompat.Task paramTask)
  {
    this.OooO0OO.obtainMessage(0, paramTask).sendToTarget();
  }
  
  public final void OooOO0()
  {
    Object localObject1 = NotificationManagerCompat.OooO0o(this.OooO00o);
    Object localObject2 = this.OooO0o0;
    boolean bool1 = ((Set)localObject1).equals(localObject2);
    if (bool1) {
      return;
    }
    this.OooO0o0 = ((Set)localObject1);
    localObject2 = this.OooO00o.getPackageManager();
    Object localObject3 = new android/content/Intent;
    ((Intent)localObject3).<init>();
    localObject3 = ((Intent)localObject3).setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
    boolean bool2 = false;
    Object localObject4 = null;
    localObject2 = ((PackageManager)localObject2).queryIntentServices((Intent)localObject3, 0);
    localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject2 = ((List)localObject2).iterator();
    Object localObject5;
    Object localObject6;
    Object localObject7;
    for (;;)
    {
      bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      localObject4 = (ResolveInfo)((Iterator)localObject2).next();
      localObject5 = ((ResolveInfo)localObject4).serviceInfo.packageName;
      boolean bool3 = ((Set)localObject1).contains(localObject5);
      if (bool3)
      {
        localObject5 = new android/content/ComponentName;
        localObject6 = ((ResolveInfo)localObject4).serviceInfo;
        localObject7 = ((ServiceInfo)localObject6).packageName;
        localObject6 = ((ServiceInfo)localObject6).name;
        ((ComponentName)localObject5).<init>((String)localObject7, (String)localObject6);
        localObject4 = ((ResolveInfo)localObject4).serviceInfo.permission;
        if (localObject4 != null)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject6 = "Permission present on component ";
          ((StringBuilder)localObject4).append((String)localObject6);
          ((StringBuilder)localObject4).append(localObject5);
          localObject5 = ", not adding listener record.";
          ((StringBuilder)localObject4).append((String)localObject5);
        }
        else
        {
          ((Set)localObject3).add(localObject5);
        }
      }
    }
    localObject1 = ((Set)localObject3).iterator();
    boolean bool4;
    int j;
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      int i = 3;
      localObject5 = "NotifManCompat";
      if (!bool1) {
        break;
      }
      localObject2 = (ComponentName)((Iterator)localObject1).next();
      localObject6 = this.OooO0Oo;
      bool4 = ((Map)localObject6).containsKey(localObject2);
      if (!bool4)
      {
        j = Log.isLoggable((String)localObject5, i);
        if (j != 0)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject5 = "Adding listener record for ";
          ((StringBuilder)localObject4).append((String)localObject5);
          ((StringBuilder)localObject4).append(localObject2);
        }
        localObject4 = this.OooO0Oo;
        localObject5 = new androidx/core/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
        ((NotificationManagerCompat.SideChannelManager.ListenerRecord)localObject5).<init>((ComponentName)localObject2);
        ((Map)localObject4).put(localObject2, localObject5);
      }
    }
    localObject1 = this.OooO0Oo.entrySet().iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localObject6 = ((Map.Entry)localObject2).getKey();
      bool4 = ((Set)localObject3).contains(localObject6);
      if (!bool4)
      {
        bool4 = Log.isLoggable((String)localObject5, j);
        if (bool4)
        {
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          ((StringBuilder)localObject6).append("Removing listener record for ");
          localObject7 = ((Map.Entry)localObject2).getKey();
          ((StringBuilder)localObject6).append(localObject7);
        }
        localObject2 = (NotificationManagerCompat.SideChannelManager.ListenerRecord)((Map.Entry)localObject2).getValue();
        OooO0O0((NotificationManagerCompat.SideChannelManager.ListenerRecord)localObject2);
        ((Iterator)localObject1).remove();
      }
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    int j = 1;
    if (i != 0)
    {
      if (i != j)
      {
        int k = 2;
        if (i != k)
        {
          k = 3;
          if (i != k) {
            return false;
          }
          paramMessage = (ComponentName)paramMessage.obj;
          OooO0Oo(paramMessage);
          return j;
        }
        paramMessage = (ComponentName)paramMessage.obj;
        OooO0o(paramMessage);
        return j;
      }
      paramMessage = (NotificationManagerCompat.ServiceConnectedEvent)paramMessage.obj;
      ComponentName localComponentName = paramMessage.OooO00o;
      paramMessage = paramMessage.OooO0O0;
      OooO0o0(localComponentName, paramMessage);
      return j;
    }
    paramMessage = (NotificationManagerCompat.Task)paramMessage.obj;
    OooO0OO(paramMessage);
    return j;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Object localObject1 = "NotifManCompat";
    int i = 3;
    boolean bool = Log.isLoggable((String)localObject1, i);
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Connected to service ";
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(paramComponentName);
    }
    localObject1 = this.OooO0OO;
    Object localObject2 = new androidx/core/app/NotificationManagerCompat$ServiceConnectedEvent;
    ((NotificationManagerCompat.ServiceConnectedEvent)localObject2).<init>(paramComponentName, paramIBinder);
    ((Handler)localObject1).obtainMessage(1, localObject2).sendToTarget();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    Object localObject = "NotifManCompat";
    int i = 3;
    boolean bool = Log.isLoggable((String)localObject, i);
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "Disconnected from service ";
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(paramComponentName);
    }
    this.OooO0OO.obtainMessage(2, paramComponentName).sendToTarget();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.NotificationManagerCompat.SideChannelManager
 * JD-Core Version:    0.7.0.1
 */