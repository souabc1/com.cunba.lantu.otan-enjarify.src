package com.qinggan.cluster;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.qinggan.common.OnInitListener;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import m54207b69;

class InstrumentClusterManager$EventHandler
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    ??? = new java/lang/StringBuilder;
    ((StringBuilder)???).<init>();
    Object localObject2 = m54207b69.F54207b69_11("WJ222C26312A340D36414235383B7378363F4A4B3E41448681");
    ((StringBuilder)???).append((String)localObject2);
    ((StringBuilder)???).append(paramMessage);
    int i = paramMessage.what;
    boolean bool2 = false;
    localObject2 = null;
    int j;
    Object localObject5;
    boolean bool5;
    boolean bool6;
    boolean bool3;
    switch (i)
    {
    default: 
      ??? = new java/lang/StringBuilder;
      ((StringBuilder)???).<init>();
      localObject2 = m54207b69.F54207b69_11("Gd310B031F18060D1709094E140D24251413127057");
      ((StringBuilder)???).append((String)localObject2);
      j = paramMessage.what;
      ((StringBuilder)???).append(j);
      break;
    case 6: 
      paramMessage = (Pair)paramMessage.obj;
      ??? = (String)paramMessage.first;
      ??? = (Integer)((Pair)paramMessage.second).first;
      int k = ((Integer)???).intValue();
      paramMessage = (Integer)((Pair)paramMessage.second).second;
      j = paramMessage.intValue();
      synchronized (InstrumentClusterManager.OooOO0O(this.OooO00o))
      {
        localObject5 = this.OooO00o;
        localObject5 = InstrumentClusterManager.OooOO0o((InstrumentClusterManager)localObject5);
        bool5 = ((Map)localObject5).containsKey(???);
        if (bool5)
        {
          localObject2 = new java/util/ArrayList;
          localObject5 = this.OooO00o;
          localObject5 = InstrumentClusterManager.OooOO0o((InstrumentClusterManager)localObject5);
          ??? = ((Map)localObject5).get(???);
          ??? = (Collection)???;
          ((ArrayList)localObject2).<init>((Collection)???);
        }
        if (localObject2 != null)
        {
          ??? = ((List)localObject2).iterator();
          bool2 = ((Iterator)???).hasNext();
          if (bool2)
          {
            localObject2 = (IClusterCallback)((Iterator)???).next();
            ((IClusterCallback)localObject2).OooO0o0(k, j);
          }
        }
      }
    case 5: 
      paramMessage = (Pair)paramMessage.obj;
      ??? = (String)paramMessage.first;
      paramMessage = (Integer)paramMessage.second;
      j = paramMessage.intValue();
      synchronized (InstrumentClusterManager.OooOO0O(this.OooO00o))
      {
        ??? = this.OooO00o;
        ??? = InstrumentClusterManager.OooOO0o((InstrumentClusterManager)???);
        bool6 = ((Map)???).containsKey(???);
        if (bool6)
        {
          localObject2 = new java/util/ArrayList;
          ??? = this.OooO00o;
          ??? = InstrumentClusterManager.OooOO0o((InstrumentClusterManager)???);
          ??? = ((Map)???).get(???);
          ??? = (Collection)???;
          ((ArrayList)localObject2).<init>((Collection)???);
        }
        if (localObject2 != null)
        {
          ??? = ((List)localObject2).iterator();
          bool2 = ((Iterator)???).hasNext();
          if (bool2)
          {
            localObject2 = (IClusterCallback)((Iterator)???).next();
            ((IClusterCallback)localObject2).OooO0o(j);
          }
        }
      }
    case 4: 
      paramMessage = (Pair)paramMessage.obj;
      ??? = (String)paramMessage.first;
      paramMessage = paramMessage.second;
      ??? = paramMessage;
      ??? = (ClusterState)((Pair)paramMessage).first;
      paramMessage = (Integer)((Pair)paramMessage).second;
      j = paramMessage.intValue();
      synchronized (InstrumentClusterManager.OooOO0O(this.OooO00o))
      {
        localObject5 = this.OooO00o;
        localObject5 = InstrumentClusterManager.OooOO0o((InstrumentClusterManager)localObject5);
        bool5 = ((Map)localObject5).containsKey(???);
        if (bool5)
        {
          localObject2 = new java/util/ArrayList;
          localObject5 = this.OooO00o;
          localObject5 = InstrumentClusterManager.OooOO0o((InstrumentClusterManager)localObject5);
          ??? = ((Map)localObject5).get(???);
          ??? = (Collection)???;
          ((ArrayList)localObject2).<init>((Collection)???);
        }
        if (localObject2 != null)
        {
          ??? = ((List)localObject2).iterator();
          bool2 = ((Iterator)???).hasNext();
          if (bool2)
          {
            localObject2 = (IClusterCallback)((Iterator)???).next();
            ((IClusterCallback)localObject2).OooO0Oo((ClusterState)???, j);
          }
        }
      }
    case 3: 
      paramMessage = (Pair)paramMessage.obj;
      ??? = (String)paramMessage.first;
      paramMessage = paramMessage.second;
      ??? = paramMessage;
      ??? = (String)((Pair)paramMessage).first;
      paramMessage = (Integer)((Pair)paramMessage).second;
      j = paramMessage.intValue();
      synchronized (InstrumentClusterManager.OooOO0O(this.OooO00o))
      {
        localObject5 = this.OooO00o;
        localObject5 = InstrumentClusterManager.OooOO0o((InstrumentClusterManager)localObject5);
        bool5 = ((Map)localObject5).containsKey(???);
        if (bool5)
        {
          localObject2 = new java/util/ArrayList;
          localObject5 = this.OooO00o;
          localObject5 = InstrumentClusterManager.OooOO0o((InstrumentClusterManager)localObject5);
          ??? = ((Map)localObject5).get(???);
          ??? = (Collection)???;
          ((ArrayList)localObject2).<init>((Collection)???);
        }
        if (localObject2 != null)
        {
          ??? = ((List)localObject2).iterator();
          bool2 = ((Iterator)???).hasNext();
          if (bool2)
          {
            localObject2 = (IClusterCallback)((Iterator)???).next();
            ((IClusterCallback)localObject2).OooO0OO((String)???, j);
          }
        }
      }
    case 2: 
      paramMessage = (Pair)paramMessage.obj;
      ??? = (String)paramMessage.first;
      paramMessage = paramMessage.second;
      ??? = paramMessage;
      ??? = (String)((Pair)paramMessage).first;
      paramMessage = (Bundle)((Pair)paramMessage).second;
      synchronized (InstrumentClusterManager.OooOO0O(this.OooO00o))
      {
        localObject5 = this.OooO00o;
        localObject5 = InstrumentClusterManager.OooOO0o((InstrumentClusterManager)localObject5);
        bool5 = ((Map)localObject5).containsKey(???);
        if (bool5)
        {
          localObject2 = new java/util/ArrayList;
          localObject5 = this.OooO00o;
          localObject5 = InstrumentClusterManager.OooOO0o((InstrumentClusterManager)localObject5);
          ??? = ((Map)localObject5).get(???);
          ??? = (Collection)???;
          ((ArrayList)localObject2).<init>((Collection)???);
        }
        if (localObject2 != null)
        {
          ??? = ((List)localObject2).iterator();
          bool2 = ((Iterator)???).hasNext();
          if (bool2)
          {
            localObject2 = (IClusterCallback)((Iterator)???).next();
            ((IClusterCallback)localObject2).OooO00o((String)???, paramMessage);
          }
        }
      }
    case 1: 
      synchronized (InstrumentClusterManager.OooOO0O(this.OooO00o))
      {
        paramMessage = paramMessage.obj;
        paramMessage = (Boolean)paramMessage;
        bool3 = paramMessage.booleanValue();
        localObject2 = new java/util/HashSet;
        ((HashSet)localObject2).<init>();
        ??? = this.OooO00o;
        ??? = InstrumentClusterManager.OooOO0o((InstrumentClusterManager)???);
        ??? = ((Map)???).entrySet();
        ??? = ((Set)???).iterator();
        for (;;)
        {
          bool6 = ((Iterator)???).hasNext();
          if (!bool6) {
            break;
          }
          ??? = ((Iterator)???).next();
          ??? = (Map.Entry)???;
          ??? = ((Map.Entry)???).getValue();
          ??? = (Collection)???;
          ((AbstractCollection)localObject2).addAll((Collection)???);
        }
        ??? = new java/util/ArrayList;
        ((ArrayList)???).<init>((Collection)localObject2);
        localObject2 = ((List)???).iterator();
        for (;;)
        {
          boolean bool4 = ((Iterator)localObject2).hasNext();
          if (!bool4) {
            break;
          }
          ??? = ((Iterator)localObject2).next();
          ??? = (IClusterCallback)???;
          ((IClusterCallback)???).OooO0O0(bool3);
        }
      }
    case 0: 
      paramMessage = paramMessage.obj;
      boolean bool1 = paramMessage instanceof OnInitListener;
      if (bool1)
      {
        localObject2 = paramMessage;
        localObject2 = (OnInitListener)paramMessage;
      }
      if (localObject2 != null)
      {
        bool3 = InstrumentClusterManager.OooO();
        ((OnInitListener)localObject2).OooO00o(bool3);
        paramMessage = InstrumentClusterManager.OooOO0();
        bool3 = paramMessage.contains(localObject2);
        if (!bool3)
        {
          paramMessage = InstrumentClusterManager.OooOO0();
          paramMessage.add(localObject2);
        }
      }
      break;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.InstrumentClusterManager.EventHandler
 * JD-Core Version:    0.7.0.1
 */