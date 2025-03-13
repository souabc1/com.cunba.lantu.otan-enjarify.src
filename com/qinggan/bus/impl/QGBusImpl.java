package com.qinggan.bus.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.UserHandle;
import com.qinggan.bus.QGBusEvent;
import com.qinggan.bus.QGBusEventFilter;
import com.qinggan.bus.QGBusEventHandler;
import com.qinggan.util.Log;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m54207b69;

public class QGBusImpl
{
  public static QGBusImpl OooOOO0;
  public boolean OooO = false;
  public final int OooO00o = 2;
  public final int OooO0O0 = 1;
  public HashSet OooO0OO = null;
  public HashSet OooO0Oo = null;
  public ServiceConnection OooO0o;
  public Messenger OooO0o0;
  public Context OooO0oO = null;
  public Handler OooO0oo;
  public String OooOO0 = null;
  public Messenger OooOO0O;
  public SubscribeInfo OooOO0o;
  
  private QGBusImpl()
  {
    Object localObject = new com/qinggan/bus/impl/QGBusImpl$1;
    ((QGBusImpl.1)localObject).<init>(this);
    this.OooO0oo = ((Handler)localObject);
    localObject = new android/os/Messenger;
    QGBusImpl.2 local2 = new com/qinggan/bus/impl/QGBusImpl$2;
    local2.<init>(this);
    ((Messenger)localObject).<init>(local2);
    this.OooO0o0 = ((Messenger)localObject);
    localObject = new com/qinggan/bus/impl/QGBusImpl$3;
    ((QGBusImpl.3)localObject).<init>(this);
    this.OooO0o = ((ServiceConnection)localObject);
    this.OooO = false;
    localObject = new com/qinggan/bus/impl/SubscribeInfo;
    ((SubscribeInfo)localObject).<init>();
    this.OooOO0o = ((SubscribeInfo)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.OooO0OO = ((HashSet)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.OooO0Oo = ((HashSet)localObject);
  }
  
  public static QGBusImpl getInstance()
  {
    QGBusImpl localQGBusImpl = QGBusImpl.class;
    try
    {
      localQGBusImpl = OooOOO0;
      if (localQGBusImpl == null)
      {
        localQGBusImpl = new com/qinggan/bus/impl/QGBusImpl;
        localQGBusImpl.<init>();
        OooOOO0 = localQGBusImpl;
      }
      localQGBusImpl = OooOOO0;
      return localQGBusImpl;
    }
    finally {}
  }
  
  public void OooOO0o(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    String str = m54207b69.F54207b69_11("l(4A42484F7F52606549545774678A695C6A");
    Object localObject1 = UserHandle.class;
    Object localObject2 = "OB0D160E0A14";
    try
    {
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject2 = ((Class)localObject1).getDeclaredField((String)localObject2);
      boolean bool = true;
      ((AccessibleObject)localObject2).setAccessible(bool);
      Object localObject3 = null;
      localObject2 = ((Field)localObject2).get(null);
      localObject2 = (UserHandle)localObject2;
      localObject3 = paramContext.getClass();
      int i = 4;
      Class[] arrayOfClass = new Class[i];
      Object localObject4 = Intent.class;
      arrayOfClass[0] = localObject4;
      localObject4 = ServiceConnection.class;
      arrayOfClass[bool] = localObject4;
      localObject4 = Integer.TYPE;
      int j = 2;
      arrayOfClass[j] = localObject4;
      int k = 3;
      arrayOfClass[k] = localObject1;
      localObject1 = ((Class)localObject3).getMethod(str, arrayOfClass);
      localObject3 = new Object[i];
      localObject3[0] = paramIntent;
      localObject3[bool] = paramServiceConnection;
      paramIntent = Integer.valueOf(paramInt);
      localObject3[j] = paramIntent;
      localObject3[k] = localObject2;
      ((Method)localObject1).invoke(paramContext, (Object[])localObject3);
    }
    catch (Exception localException)
    {
      paramContext = localException.toString();
      Log.OooO0O0(str, paramContext);
    }
  }
  
  public final void OooOOO(Context paramContext)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    Object localObject = m54207b69.F54207b69_11("Be060B0A4E181111090A0D1556402F351F265C46353B252C4D18302D27221D");
    localIntent.setAction((String)localObject);
    localObject = m54207b69.F54207b69_11("*1525F5E22445D655D5E59692A6C83815352");
    localIntent.setPackage((String)localObject);
    localObject = Build.PRODUCT;
    String str = m54207b69.F54207b69_11("^}1E4F4F504D1A");
    boolean bool1 = str.equals(localObject);
    int i = 1;
    if (!bool1)
    {
      str = m54207b69.F54207b69_11("}K2D7C7A7E8028");
      boolean bool2 = str.equals(localObject);
      if (!bool2)
      {
        localObject = this.OooO0o;
        paramContext.bindService(localIntent, (ServiceConnection)localObject, i);
        return;
      }
    }
    localObject = this.OooO0o;
    OooOO0o(paramContext, localIntent, (ServiceConnection)localObject, i);
  }
  
  public final void OooOOO0()
  {
    Object localObject = this.OooO0oo;
    int i = 2;
    boolean bool = ((Handler)localObject).hasMessages(i);
    if (bool)
    {
      localObject = m54207b69.F54207b69_11("P869807C504F765B4F5C");
      String str = m54207b69.F54207b69_11("ok0808100D1D501F15100D0F101A152D5A291F2C31222D355C5D5E");
      Log.OooO00o((String)localObject, str);
      localObject = this.OooO0oo;
      ((Handler)localObject).removeMessages(i);
    }
  }
  
  public final void OooOOOO()
  {
    Message localMessage = ProtocolMessage.OooO0Oo();
    Object localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    String str1 = m54207b69.F54207b69_11("NI2729262F");
    String str2 = this.OooOO0;
    ((BaseBundle)localObject).putString(str1, str2);
    localMessage.setData((Bundle)localObject);
    localObject = this.OooO0o0;
    localMessage.replyTo = ((Messenger)localObject);
    ProtocolMessage.OooO0O0(this.OooOO0O, localMessage);
  }
  
  public void OooOOOo(QGBusEvent paramQGBusEvent)
  {
    if (paramQGBusEvent == null)
    {
      paramQGBusEvent = m54207b69.F54207b69_11("P869807C504F765B4F5C");
      ??? = m54207b69.F54207b69_11("R?4F4B5F565A515D266252645C572C645B2F625C666733");
      Log.OooO0oO(paramQGBusEvent, (String)???);
      return;
    }
    ??? = this.OooOO0;
    paramQGBusEvent.o00OooO0 = ((String)???);
    boolean bool = this.OooO;
    if (bool)
    {
      ??? = this.OooOO0O;
      paramQGBusEvent = ProtocolMessage.OooO0OO(paramQGBusEvent);
      ProtocolMessage.OooO0O0((Messenger)???, paramQGBusEvent);
    }
    synchronized (this.OooO0OO)
    {
      HashSet localHashSet = this.OooO0OO;
      localHashSet.add(paramQGBusEvent);
      return;
    }
  }
  
  public void OooOOo(QGBusEventFilter paramQGBusEventFilter, QGBusEventHandler arg2)
  {
    if ((paramQGBusEventFilter != null) && (??? != null))
    {
      localObject1 = this.OooOO0o;
      ((SubscribeInfo)localObject1).OooO00o(paramQGBusEventFilter, ???);
      boolean bool1 = this.OooO;
      if (bool1)
      {
        ??? = this.OooOO0O;
        localObject1 = this.OooOO0;
        paramQGBusEventFilter = ProtocolMessage.OooO0o((String)localObject1, paramQGBusEventFilter);
        ProtocolMessage.OooO0O0(???, paramQGBusEventFilter);
      }
      else
      {
        paramQGBusEventFilter = paramQGBusEventFilter.getEventList();
        if (paramQGBusEventFilter != null) {
          synchronized (this.OooO0Oo)
          {
            paramQGBusEventFilter = paramQGBusEventFilter.iterator();
            for (;;)
            {
              boolean bool2 = paramQGBusEventFilter.hasNext();
              if (!bool2) {
                break;
              }
              localObject1 = paramQGBusEventFilter.next();
              localObject1 = (String)localObject1;
              localObject2 = this.OooO0Oo;
              ((HashSet)localObject2).add(localObject1);
            }
          }
        }
      }
      return;
    }
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("l6454456485949655B5B88655166235E6E6A536557202B");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(paramQGBusEventFilter);
    paramQGBusEventFilter = m54207b69.F54207b69_11("?_7380394135403941356E89");
    ((StringBuilder)localObject1).append(paramQGBusEventFilter);
    ((StringBuilder)localObject1).append(???);
    paramQGBusEventFilter = m54207b69.F54207b69_11("P869807C504F765B4F5C");
    ??? = ((StringBuilder)localObject1).toString();
    Log.OooO0oO(paramQGBusEventFilter, ???);
  }
  
  public final void OooOOo0()
  {
    Handler localHandler = this.OooO0oo;
    int i = 2;
    boolean bool = localHandler.hasMessages(i);
    if (!bool)
    {
      localHandler = this.OooO0oo;
      long l = 3000L;
      localHandler.sendEmptyMessageDelayed(i, l);
    }
  }
  
  public final void OooOOoo()
  {
    ??? = this.OooOO0O;
    if (??? != null) {
      synchronized (this.OooO0Oo)
      {
        ??? = this.OooO0Oo;
        int i = ((HashSet)???).size();
        Object localObject5;
        Object localObject6;
        if (i > 0)
        {
          ??? = new com/qinggan/bus/QGBusEventFilter;
          ((QGBusEventFilter)???).<init>();
          localObject5 = this.OooO0Oo;
          localObject5 = ((HashSet)localObject5).iterator();
          for (;;)
          {
            boolean bool1 = ((Iterator)localObject5).hasNext();
            if (!bool1) {
              break;
            }
            localObject6 = ((Iterator)localObject5).next();
            localObject6 = (String)localObject6;
            ((QGBusEventFilter)???).OooO00o((String)localObject6);
          }
          localObject5 = this.OooOO0O;
          localObject6 = this.OooOO0;
          ??? = ProtocolMessage.OooO0o((String)localObject6, (QGBusEventFilter)???);
          ProtocolMessage.OooO0O0((Messenger)localObject5, (Message)???);
          ??? = this.OooO0Oo;
          ((HashSet)???).clear();
        }
        synchronized (this.OooO0OO)
        {
          ??? = this.OooO0OO;
          j = ((HashSet)???).size();
          if (j > 0)
          {
            ??? = this.OooO0OO;
            ??? = ((HashSet)???).iterator();
            for (;;)
            {
              boolean bool2 = ((Iterator)???).hasNext();
              if (!bool2) {
                break;
              }
              localObject5 = ((Iterator)???).next();
              localObject5 = (QGBusEvent)localObject5;
              localObject6 = this.OooOO0O;
              localObject5 = ProtocolMessage.OooO0OO((QGBusEvent)localObject5);
              ProtocolMessage.OooO0O0((Messenger)localObject6, (Message)localObject5);
            }
            ??? = this.OooO0OO;
            ((HashSet)???).clear();
          }
          j = 1;
          this.OooO = j;
        }
      }
    }
    HashSet localHashSet = this.OooO0Oo;
    int j = localHashSet.size();
    if (j <= 0)
    {
      localHashSet = this.OooO0OO;
      j = localHashSet.size();
      if (j <= 0) {}
    }
    else
    {
      OooOo00();
    }
  }
  
  public void OooOo0(QGBusEventFilter paramQGBusEventFilter)
  {
    if (paramQGBusEventFilter == null) {
      return;
    }
    ??? = this.OooOO0o;
    ((SubscribeInfo)???).OooO0OO(paramQGBusEventFilter);
    boolean bool1 = this.OooO;
    Object localObject2;
    if (bool1)
    {
      ??? = this.OooOO0O;
      localObject2 = this.OooOO0;
      paramQGBusEventFilter = ProtocolMessage.OooO0oO((String)localObject2, paramQGBusEventFilter);
      ProtocolMessage.OooO0O0((Messenger)???, paramQGBusEventFilter);
    }
    else
    {
      paramQGBusEventFilter = paramQGBusEventFilter.getEventList();
      if (paramQGBusEventFilter != null) {
        synchronized (this.OooO0Oo)
        {
          paramQGBusEventFilter = paramQGBusEventFilter.iterator();
          for (;;)
          {
            boolean bool2 = paramQGBusEventFilter.hasNext();
            if (!bool2) {
              break;
            }
            localObject2 = paramQGBusEventFilter.next();
            localObject2 = (String)localObject2;
            HashSet localHashSet = this.OooO0Oo;
            localHashSet.remove(localObject2);
          }
        }
      }
    }
  }
  
  public final void OooOo00()
  {
    Handler localHandler = this.OooO0oo;
    int i = 1;
    boolean bool = localHandler.hasMessages(i);
    if (!bool)
    {
      localHandler = this.OooO0oo;
      localHandler.removeMessages(i);
    }
    this.OooO0oo.sendEmptyMessageDelayed(i, 10);
  }
  
  public void setContext(Context paramContext)
  {
    if (paramContext != null)
    {
      Object localObject = this.OooO0oO;
      if (localObject == null)
      {
        localObject = paramContext.getPackageName();
        this.OooOO0 = ((String)localObject);
        this.OooO0oO = paramContext;
        OooOOO(paramContext);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bus.impl.QGBusImpl
 * JD-Core Version:    0.7.0.1
 */