package com.qinggan.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import java.util.Iterator;
import java.util.List;
import m54207b69;

public class NetUtil
{
  public static final String OooO0O0 = "NetUtil";
  public static ConnectivityManager OooO0OO;
  public static Object OooO0Oo;
  public static boolean OooO0o0 = false;
  public List OooO00o;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0Oo = localObject;
  }
  
  public static boolean OooO0Oo(Context paramContext)
  {
    Object localObject1 = OooO0OO;
    boolean bool1 = false;
    if (localObject1 == null)
    {
      localObject1 = "Jc000D0F100A051D111D132125";
      try
      {
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        paramContext = paramContext.getSystemService((String)localObject1);
        paramContext = (ConnectivityManager)paramContext;
        OooO0OO = paramContext;
      }
      catch (Exception paramContext)
      {
        localObject1 = OooO0O0;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = m54207b69.F54207b69_11("CO282B3D1F3A4141312A25344845333A397F1D1214151F22321E322036322D3A293D3A282F2E94505E54536966524D4FA4");
        ((StringBuilder)localObject2).append((String)localObject3);
        paramContext = paramContext.getMessage();
        ((StringBuilder)localObject2).append(paramContext);
        paramContext = ((StringBuilder)localObject2).toString();
        Log.OooO0O0((String)localObject1, paramContext);
        return false;
      }
    }
    paramContext = OooO0OO.getActiveNetworkInfo();
    if (paramContext != null)
    {
      localObject1 = paramContext.getTypeName();
      localObject2 = OooO0O0;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = m54207b69.F54207b69_11(":K252F413F283E26722A2E372F7D");
      ((StringBuilder)localObject3).append((String)localObject4);
      ((StringBuilder)localObject3).append((String)localObject1);
      localObject1 = m54207b69.F54207b69_11("[N622E23232430334133337E");
      ((StringBuilder)localObject3).append((String)localObject1);
      bool2 = paramContext.isConnected();
      ((StringBuilder)localObject3).append(bool2);
      paramContext = ((StringBuilder)localObject3).toString();
      Log.OooO00o((String)localObject2, paramContext);
    }
    paramContext = OooO0OO;
    int i = 1;
    float f = 1.4E-45F;
    paramContext = paramContext.getNetworkInfo(i);
    Object localObject2 = OooO0OO.getNetworkInfo(0);
    Object localObject3 = OooO0OO;
    int j = 9;
    localObject3 = ((ConnectivityManager)localObject3).getNetworkInfo(j);
    Object localObject5;
    Object localObject6;
    if (paramContext != null)
    {
      localObject4 = OooO0O0;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject6 = m54207b69.F54207b69_11("vd130E04103B150B1709674E");
      ((StringBuilder)localObject5).append((String)localObject6);
      localObject6 = paramContext.getState();
      ((StringBuilder)localObject5).append(localObject6);
      localObject5 = ((StringBuilder)localObject5).toString();
      Log.OooO0OO((String)localObject4, (String)localObject5);
      bool2 = paramContext.isConnected();
      if (bool2)
      {
        bool2 = i;
        break label305;
      }
    }
    boolean bool2 = false;
    paramContext = null;
    label305:
    Object localObject4 = m54207b69.F54207b69_11("m15C5F555B6159684C584E5E161D");
    if (localObject2 != null)
    {
      localObject5 = OooO0O0;
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      ((StringBuilder)localObject6).append((String)localObject4);
      NetworkInfo.State localState = ((NetworkInfo)localObject2).getState();
      ((StringBuilder)localObject6).append(localState);
      localObject6 = ((StringBuilder)localObject6).toString();
      Log.OooO0OO((String)localObject5, (String)localObject6);
      if (!bool2)
      {
        bool2 = ((NetworkInfo)localObject2).isConnected();
        if (!bool2)
        {
          bool2 = false;
          paramContext = null;
          break label398;
        }
      }
      bool2 = i;
    }
    label398:
    if (localObject3 != null)
    {
      localObject2 = OooO0O0;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      ((StringBuilder)localObject5).append((String)localObject4);
      localObject4 = ((NetworkInfo)localObject3).getState();
      ((StringBuilder)localObject5).append(localObject4);
      localObject4 = ((StringBuilder)localObject5).toString();
      Log.OooO0OO((String)localObject2, (String)localObject4);
      if (!bool2)
      {
        bool2 = ((NetworkInfo)localObject3).isConnected();
        if (!bool2) {}
      }
      else
      {
        bool1 = i;
      }
      bool2 = bool1;
    }
    OooO0o0 = bool2;
    return bool2;
  }
  
  public final void OooO0o0(boolean paramBoolean)
  {
    Iterator localIterator = this.OooO00o.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      NetUtil.NetworkChangeCallback localNetworkChangeCallback = (NetUtil.NetworkChangeCallback)localIterator.next();
      localNetworkChangeCallback.OooO00o(paramBoolean);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.util.NetUtil
 * JD-Core Version:    0.7.0.1
 */