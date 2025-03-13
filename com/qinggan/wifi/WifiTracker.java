package com.qinggan.wifi;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m54207b69;

public class WifiTracker
{
  public final WifiTracker.WifiListener OooO;
  public ArrayList OooO00o;
  public final AtomicBoolean OooO0O0;
  public final Context OooO0OO;
  public final boolean OooO0Oo;
  public final boolean OooO0o;
  public final boolean OooO0o0;
  public WifiInfo OooO0oO;
  public NetworkInfo OooO0oo;
  public final WifiTracker.MainHandler OooOO0;
  public boolean OooOO0O;
  public Integer OooOO0o;
  public WifiTracker.Scanner OooOOO;
  public HashMap OooOOO0;
  public HashMap OooOOOO;
  public final WifiManager OooOOOo;
  public Object OooOOo;
  public final WifiTracker.WorkHandler OooOOo0;
  
  private WifiConfiguration getWifiConfigurationForNetworkId(int paramInt)
  {
    Object localObject1 = this.OooOOOo.getConfiguredNetworks();
    if (localObject1 != null)
    {
      localObject1 = ((List)localObject1).iterator();
      WifiConfiguration localWifiConfiguration;
      int j;
      do
      {
        int i;
        do
        {
          do
          {
            boolean bool1 = ((Iterator)localObject1).hasNext();
            if (!bool1) {
              break;
            }
            localWifiConfiguration = (WifiConfiguration)((Iterator)localObject1).next();
            localObject2 = this.OooO0oO;
          } while (localObject2 == null);
          i = localWifiConfiguration.networkId;
        } while (paramInt != i);
        Object localObject2 = m54207b69.F54207b69_11("SD37222A250925262828");
        boolean bool2 = OooOOO(localWifiConfiguration, (String)localObject2);
        if (!bool2) {
          break;
        }
        localObject2 = m54207b69.F54207b69_11("2V38243D1A292A3F3C47402C4A4545");
        j = OooOOOO(localWifiConfiguration, (String)localObject2);
      } while (j == 0);
      return localWifiConfiguration;
    }
    return null;
  }
  
  public final Collection OooOO0O()
  {
    int i = this.OooOO0o.intValue() + 1;
    Object localObject1 = Integer.valueOf(i);
    this.OooOO0o = ((Integer)localObject1);
    localObject1 = this.OooOOOo.getScanResults();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = m54207b69.F54207b69_11("_O292B3D2F2B213235292634474630494B8580333D4C324053523C55577D5944544A909492");
    ((StringBuilder)localObject2).append((String)localObject3);
    int j = ((List)localObject1).size();
    ((StringBuilder)localObject2).append(j);
    localObject1 = ((List)localObject1).iterator();
    Object localObject4;
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (ScanResult)((Iterator)localObject1).next();
      localObject3 = this.OooOOO0;
      localObject4 = ((ScanResult)localObject2).BSSID;
      ((HashMap)localObject3).put(localObject4, localObject2);
      localObject3 = this.OooOOOO;
      localObject2 = ((ScanResult)localObject2).BSSID;
      localObject4 = this.OooOO0o;
      ((HashMap)localObject3).put(localObject2, localObject4);
    }
    localObject1 = this.OooOO0o;
    i = ((Integer)localObject1).intValue();
    int k = 3;
    if (i > k)
    {
      localObject1 = this.OooOO0o;
      i = ((Integer)localObject1).intValue();
      localObject3 = this.OooOOOO.entrySet().iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = (Map.Entry)((Iterator)localObject3).next();
        Object localObject5 = (Integer)((Map.Entry)localObject4).getValue();
        int m = ((Integer)localObject5).intValue();
        Object localObject6 = Integer.valueOf(i + -3);
        int n = ((Integer)localObject6).intValue();
        if (m < n)
        {
          localObject5 = this.OooOOO0;
          localObject6 = ((Map.Entry)localObject4).getKey();
          localObject5 = (ScanResult)((HashMap)localObject5).get(localObject6);
          localObject5 = this.OooOOO0;
          localObject4 = ((Map.Entry)localObject4).getKey();
          ((HashMap)localObject5).remove(localObject4);
          ((Iterator)localObject3).remove();
        }
      }
    }
    return this.OooOOO0.values();
  }
  
  public final AccessPoint OooOO0o(ScanResult paramScanResult, List paramList)
  {
    int i = paramList.size();
    int j = 0;
    while (j < i)
    {
      AccessPoint localAccessPoint = (AccessPoint)paramList.get(j);
      boolean bool = localAccessPoint.OooOO0(paramScanResult);
      if (bool)
      {
        paramList = (AccessPoint)paramList.remove(j);
        paramList.OooOOOO(paramScanResult);
        return paramList;
      }
      j += 1;
    }
    paramList = new com/qinggan/wifi/AccessPoint;
    Context localContext = this.OooO0OO;
    paramList.<init>(localContext, paramScanResult);
    return paramList;
  }
  
  public final boolean OooOOO(Object paramObject, String paramString)
  {
    Field[] arrayOfField = paramObject.getClass().getDeclaredFields();
    try
    {
      int i = arrayOfField.length;
      int j = 0;
      while (j < i)
      {
        Field localField = arrayOfField[j];
        String str = localField.getName();
        boolean bool1 = str.equals(paramString);
        if (bool1)
        {
          boolean bool2 = true;
          localField.setAccessible(bool2);
          return localField.getBoolean(paramObject);
        }
        j += 1;
      }
      return false;
    }
    catch (Exception localException) {}
  }
  
  public final AccessPoint OooOOO0(WifiConfiguration paramWifiConfiguration, List paramList)
  {
    int i = paramList.size();
    int j = 0;
    while (j < i)
    {
      AccessPoint localAccessPoint = (AccessPoint)paramList.get(j);
      boolean bool = localAccessPoint.OooOO0O(paramWifiConfiguration);
      if (bool)
      {
        paramList = (AccessPoint)paramList.remove(j);
        paramList.OooO(paramWifiConfiguration);
        return paramList;
      }
      j += 1;
    }
    paramList = new com/qinggan/wifi/AccessPoint;
    Context localContext = this.OooO0OO;
    paramList.<init>(localContext, paramWifiConfiguration);
    return paramList;
  }
  
  public final int OooOOOO(Object paramObject, String paramString)
  {
    Field[] arrayOfField = paramObject.getClass().getDeclaredFields();
    try
    {
      int i = arrayOfField.length;
      int j = 0;
      while (j < i)
      {
        Field localField = arrayOfField[j];
        String str = localField.getName();
        boolean bool1 = str.equals(paramString);
        if (bool1)
        {
          boolean bool2 = true;
          localField.setAccessible(bool2);
          return localField.getInt(paramObject);
        }
        j += 1;
      }
      return -1;
    }
    catch (Exception localException) {}
  }
  
  public final WifiConfiguration OooOOOo(Object paramObject, ScanResult paramScanResult)
  {
    Object localObject = paramObject.getClass();
    String str = "')4E4D5F674C625048485058894C5C4E795658615362";
    try
    {
      str = m54207b69.F54207b69_11(str);
      int i = 1;
      Class[] arrayOfClass = new Class[i];
      ScanResult localScanResult = ScanResult.class;
      arrayOfClass[0] = localScanResult;
      localObject = ((Class)localObject).getDeclaredMethod(str, arrayOfClass);
      paramScanResult = new Object[] { paramScanResult };
      paramObject = ((Method)localObject).invoke(paramObject, paramScanResult);
      paramObject = (WifiConfiguration)paramObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      paramObject = null;
    }
    return paramObject;
  }
  
  public final void OooOOo()
  {
    List localList = getAccessPoints();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject2 = localList.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject3 = (AccessPoint)((Iterator)localObject2).next();
      ((AccessPoint)localObject3).OooO0O0();
    }
    localObject2 = new com/qinggan/wifi/WifiTracker$Multimap;
    boolean bool1 = false;
    Object localObject3 = null;
    ((WifiTracker.Multimap)localObject2).<init>(null);
    Object localObject4 = this.OooO0oO;
    if (localObject4 != null)
    {
      int i = ((WifiInfo)localObject4).getNetworkId();
      localObject3 = getWifiConfigurationForNetworkId(i);
    }
    localObject4 = this.OooOOOo.getConfiguredNetworks();
    int j = 1;
    boolean bool2;
    boolean bool5;
    Object localObject8;
    if (localObject4 != null)
    {
      int k = ((List)localObject4).size();
      if (k != 0)
      {
        k = j;
      }
      else
      {
        k = 0;
        localObject5 = null;
      }
      this.OooOO0O = k;
      localObject4 = ((List)localObject4).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject4).hasNext();
        if (!bool2) {
          break;
        }
        localObject5 = (WifiConfiguration)((Iterator)localObject4).next();
        localObject6 = m54207b69.F54207b69_11("SD37222A250925262828");
        boolean bool3 = OooOOO(localObject5, (String)localObject6);
        if (bool3)
        {
          localObject6 = m54207b69.F54207b69_11("2V38243D1A292A3F3C47402C4A4545");
          m = OooOOOO(localObject5, (String)localObject6);
          if (m == 0) {}
        }
        else
        {
          localObject6 = OooOOO0((WifiConfiguration)localObject5, localList);
          ??? = this.OooO0oO;
          if (??? != null)
          {
            ??? = this.OooO0oo;
            if (??? != null)
            {
              bool5 = ((WifiConfiguration)localObject5).isPasspoint();
              if (!bool5)
              {
                ??? = this.OooO0oO;
                localObject8 = this.OooO0oo;
                ((AccessPoint)localObject6).OooOOOo((WifiConfiguration)localObject3, (WifiInfo)???, (NetworkInfo)localObject8);
              }
            }
          }
          bool5 = this.OooO0o0;
          if (bool5)
          {
            bool5 = ((WifiConfiguration)localObject5).isPasspoint();
            if (bool5)
            {
              bool5 = this.OooO0Oo;
              if (!bool5) {}
            }
            else
            {
              localArrayList.add(localObject6);
            }
            bool2 = ((WifiConfiguration)localObject5).isPasspoint();
            if (!bool2)
            {
              localObject5 = ((AccessPoint)localObject6).getSsidStr();
              ((WifiTracker.Multimap)localObject2).OooO0O0(localObject5, localObject6);
            }
          }
          else
          {
            localList.add(localObject6);
          }
        }
      }
    }
    localObject4 = OooOO0O();
    Object localObject5 = new java/lang/StringBuilder;
    ((StringBuilder)localObject5).<init>();
    Object localObject6 = m54207b69.F54207b69_11("%_0B383C82303B2B418739438A39473A39433C3E7893");
    ((StringBuilder)localObject5).append((String)localObject6);
    int m = ((Collection)localObject4).size();
    ((StringBuilder)localObject5).append(m);
    localObject4 = ((Collection)localObject4).iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject4).hasNext();
      if (bool2)
      {
        localObject5 = (ScanResult)((Iterator)localObject4).next();
        localObject6 = ((ScanResult)localObject5).SSID;
        if (localObject6 == null) {
          continue;
        }
        m = ((String)localObject6).length();
        if (m == 0) {
          continue;
        }
        localObject6 = ((ScanResult)localObject5).capabilities;
        ??? = m54207b69.F54207b69_11("\\g3C2F2737383F");
        boolean bool4 = ((String)localObject6).contains((CharSequence)???);
        if (bool4) {
          continue;
        }
        localObject6 = ((ScanResult)localObject5).SSID;
        localObject6 = ((WifiTracker.Multimap)localObject2).OooO00o(localObject6).iterator();
        do
        {
          bool5 = ((Iterator)localObject6).hasNext();
          if (!bool5) {
            break;
          }
          ??? = (AccessPoint)((Iterator)localObject6).next();
          bool5 = ((AccessPoint)???).OooOOOO((ScanResult)localObject5);
        } while (!bool5);
        bool4 = j;
        break label588;
        bool4 = false;
        localObject6 = null;
        label588:
        if (bool4) {
          continue;
        }
        bool4 = this.OooO0o;
        if (!bool4) {
          continue;
        }
        localObject6 = OooOO0o((ScanResult)localObject5, localList);
        ??? = this.OooO0oO;
        if (??? != null)
        {
          localObject8 = this.OooO0oo;
          if (localObject8 != null) {
            ((AccessPoint)localObject6).OooOOOo((WifiConfiguration)localObject3, (WifiInfo)???, (NetworkInfo)localObject8);
          }
        }
        bool5 = ((ScanResult)localObject5).isPasspointNetwork();
        if (bool5)
        {
          ??? = this.OooOOOo;
          ??? = OooOOOo(???, (ScanResult)localObject5);
          if (??? != null) {
            ((AccessPoint)localObject6).OooOOO((WifiConfiguration)???);
          }
        }
        synchronized (this.OooOOo)
        {
          localObject8 = this.OooO0oO;
          if (localObject8 != null)
          {
            localObject8 = ((WifiInfo)localObject8).getBSSID();
            if (localObject8 != null)
            {
              localObject8 = this.OooO0oO;
              localObject8 = ((WifiInfo)localObject8).getBSSID();
              localObject5 = ((ScanResult)localObject5).BSSID;
              bool2 = ((String)localObject8).equals(localObject5);
              if ((bool2) && (localObject3 != null))
              {
                bool2 = ((WifiConfiguration)localObject3).isPasspoint();
                if (bool2) {
                  ((AccessPoint)localObject6).OooOOO((WifiConfiguration)localObject3);
                }
              }
            }
          }
          localArrayList.add(localObject6);
          localObject5 = ((AccessPoint)localObject6).getSsidStr();
          ((WifiTracker.Multimap)localObject2).OooO0O0(localObject5, localObject6);
        }
      }
    }
    Collections.sort(localArrayList);
    Iterator localIterator = this.OooO00o.iterator();
    for (;;)
    {
      boolean bool6 = localIterator.hasNext();
      if (!bool6) {
        break;
      }
      localObject2 = (AccessPoint)localIterator.next();
      localObject3 = ((AccessPoint)localObject2).getSsid();
      if (localObject3 != null)
      {
        localObject2 = ((AccessPoint)localObject2).getSsidStr();
        localObject3 = localArrayList.iterator();
        boolean bool7;
        do
        {
          CharSequence localCharSequence;
          do
          {
            bool7 = ((Iterator)localObject3).hasNext();
            if (!bool7) {
              break;
            }
            localObject4 = (AccessPoint)((Iterator)localObject3).next();
            localCharSequence = ((AccessPoint)localObject4).getSsid();
          } while (localCharSequence == null);
          localObject4 = ((AccessPoint)localObject4).getSsid();
          bool7 = localObject4.equals(localObject2);
        } while (!bool7);
      }
    }
    this.OooO00o = localArrayList;
    this.OooOO0.sendEmptyMessage(2);
  }
  
  public final void OooOOo0()
  {
    this.OooOOO0.clear();
    this.OooOOOO.clear();
    Integer localInteger = Integer.valueOf(0);
    this.OooOO0o = localInteger;
  }
  
  public final void OooOOoo(NetworkInfo arg1)
  {
    ??? = this.OooOOOo;
    boolean bool1 = ((WifiManager)???).isWifiEnabled();
    int j = 4;
    if (!bool1)
    {
      this.OooOO0.sendEmptyMessage(j);
      return;
    }
    NetworkInfo.DetailedState localDetailedState;
    if (??? != null)
    {
      ??? = ???.getDetailedState();
      localDetailedState = NetworkInfo.DetailedState.OBTAINING_IPADDR;
      if (??? == localDetailedState)
      {
        ??? = this.OooOO0;
        break label64;
      }
    }
    ??? = this.OooOO0;
    j = 3;
    label64:
    ((Handler)???).sendEmptyMessage(j);
    synchronized (this.OooOOo)
    {
      Object localObject3 = this.OooOOOo;
      localObject3 = ((WifiManager)localObject3).getConnectionInfo();
      this.OooO0oO = ((WifiInfo)localObject3);
      if (??? != null) {
        this.OooO0oo = ???;
      }
      int k;
      if (localObject3 != null)
      {
        k = ((WifiInfo)localObject3).getNetworkId();
        ??? = getWifiConfigurationForNetworkId(k);
      }
      else
      {
        k = 0;
        ??? = null;
      }
      ??? = this.OooO00o;
      int i = ((ArrayList)???).size();
      j = 1;
      i -= j;
      int m = 0;
      localDetailedState = null;
      while (i >= 0)
      {
        AccessPoint localAccessPoint = (AccessPoint)this.OooO00o.get(i);
        WifiInfo localWifiInfo = this.OooO0oO;
        NetworkInfo localNetworkInfo = this.OooO0oo;
        boolean bool2 = localAccessPoint.OooOOOo(???, localWifiInfo, localNetworkInfo);
        if (bool2) {
          m = j;
        }
        i += -1;
      }
      if (m != 0) {
        synchronized (this.OooO00o)
        {
          ??? = this.OooO00o;
          Collections.sort((List)???);
          ??? = this.OooOO0;
          i = 2;
          ???.sendEmptyMessage(i);
        }
      }
      return;
    }
  }
  
  public final void OooOo00(int paramInt)
  {
    int i = 3;
    if (paramInt == i)
    {
      ??? = this.OooOOO;
      if (??? == null) {
        break label55;
      }
      ((WifiTracker.Scanner)???).OooO0O0();
    }
    synchronized (this.OooOOo)
    {
      this.OooO0oO = null;
      this.OooO0oo = null;
      ??? = this.OooOOO;
      if (??? != null) {
        ((WifiTracker.Scanner)???).OooO00o();
      }
      label55:
      this.OooOO0.obtainMessage(1, paramInt, 0).sendToTarget();
      return;
    }
  }
  
  public List getAccessPoints()
  {
    synchronized (this.OooO00o)
    {
      ArrayList localArrayList2 = new java/util/ArrayList;
      ArrayList localArrayList3 = this.OooO00o;
      localArrayList2.<init>(localArrayList3);
      return localArrayList2;
    }
  }
  
  public WifiManager getManager()
  {
    return this.OooOOOo;
  }
  
  public boolean isConnected()
  {
    return this.OooO0O0.get();
  }
  
  public boolean isWifiEnabled()
  {
    return this.OooOOOo.isWifiEnabled();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wifi.WifiTracker
 * JD-Core Version:    0.7.0.1
 */