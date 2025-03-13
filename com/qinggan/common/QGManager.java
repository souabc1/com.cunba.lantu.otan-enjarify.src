package com.qinggan.common;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.RemoteException;
import com.qinggan.os.ServiceManager;
import com.qinggan.util.Log;
import java.util.ArrayList;
import m54207b69;

public abstract class QGManager
{
  public volatile IBinder OooO;
  public IBinder.DeathRecipient OooO00o;
  public Context OooO0O0;
  public ArrayList OooO0OO;
  public Handler OooO0Oo;
  public Object OooO0o;
  public volatile boolean OooO0o0;
  public Runnable OooO0oO;
  public volatile IInterface OooO0oo;
  public String OooOO0;
  public String OooOO0O;
  public String OooOO0o;
  
  public final void OooO(boolean paramBoolean)
  {
    Object localObject1 = this.OooO0o;
    int i = 0;
    try
    {
      for (;;)
      {
        Object localObject2 = this.OooO0OO;
        int j = ((ArrayList)localObject2).size();
        if (i >= j) {
          break;
        }
        localObject2 = this.OooO0OO;
        localObject2 = ((ArrayList)localObject2).get(i);
        if (localObject2 != null)
        {
          localObject2 = this.OooO0OO;
          localObject2 = ((ArrayList)localObject2).get(i);
          localObject2 = (OnInitListener)localObject2;
          ((OnInitListener)localObject2).OooO00o(paramBoolean);
        }
        i += 1;
      }
      return;
    }
    finally {}
  }
  
  public final void OooO0oo(OnInitListener paramOnInitListener)
  {
    synchronized (this.OooO0o)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "`c02080923061415080A09123A161D25521F1B222A1A221C2876";
      str = m54207b69.F54207b69_11(str);
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(paramOnInitListener);
      str = "Hi382F260B0B0D141323";
      str = m54207b69.F54207b69_11(str);
      localObject2 = ((StringBuilder)localObject2).toString();
      Log.OooO00o(str, (String)localObject2);
      localObject2 = this.OooO0OO;
      if ((localObject2 != null) && (paramOnInitListener != null))
      {
        boolean bool = ((ArrayList)localObject2).contains(paramOnInitListener);
        if (!bool)
        {
          localObject2 = this.OooO0OO;
          ((ArrayList)localObject2).add(paramOnInitListener);
        }
      }
      return;
    }
  }
  
  public abstract IInterface OooOO0(IBinder paramIBinder);
  
  public boolean OooOO0O()
  {
    Object localObject1 = ServiceManager.OooO0O0(this.OooOO0);
    this.OooO = ((IBinder)localObject1);
    localObject1 = this.OooO;
    Object localObject2 = null;
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = m54207b69.F54207b69_11(";-4E4D451047475F14525163186A556D6A545F5A20");
      ((StringBuilder)localObject1).append((String)localObject3);
      localObject3 = this.OooOO0;
      ((StringBuilder)localObject1).append((String)localObject3);
      localObject3 = m54207b69.F54207b69_11("Hi382F260B0B0D141323");
      localObject1 = ((StringBuilder)localObject1).toString();
      Log.OooO0O0((String)localObject3, (String)localObject1);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject3 = this.OooOO0o;
      ((Intent)localObject1).setPackage((String)localObject3);
      localObject3 = this.OooOO0O;
      ((Intent)localObject1).setAction((String)localObject3);
      this.OooO0O0.startService((Intent)localObject1);
      localObject1 = new java/lang/Thread;
      localObject3 = this.OooO0oO;
      ((Thread)localObject1).<init>((Runnable)localObject3);
      ((Thread)localObject1).start();
      return false;
    }
    localObject1 = this.OooO;
    localObject1 = OooOO0((IBinder)localObject1);
    this.OooO0oo = ((IInterface)localObject1);
    boolean bool = true;
    this.OooO0o0 = bool;
    OooOO0o();
    try
    {
      localObject3 = this.OooO;
      IBinder.DeathRecipient localDeathRecipient = this.OooO00o;
      ((IBinder)localObject3).linkToDeath(localDeathRecipient, 0);
    }
    catch (RemoteException localRemoteException)
    {
      localRemoteException.printStackTrace();
    }
    return bool;
  }
  
  public final void OooOO0o()
  {
    Handler localHandler = this.OooO0Oo;
    if (localHandler != null)
    {
      int i = 2;
      long l = 50;
      localHandler.sendEmptyMessageDelayed(i, l);
    }
  }
  
  public boolean isServiceAvailable()
  {
    Object localObject1 = this.OooO;
    if (localObject1 != null)
    {
      localObject1 = this.OooO;
      boolean bool1 = ((IBinder)localObject1).isBinderAlive();
      if (bool1)
      {
        localObject1 = this.OooO;
        bool1 = ((IBinder)localObject1).pingBinder();
        if (bool1) {
          return true;
        }
      }
    }
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("hV25342623433A397D3A483D3D7583324232355133478B3B4A3C3959504F94945A25544643635A593B67615C5E50A3");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = this.OooO;
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    localObject2 = m54207b69.F54207b69_11("Hi382F260B0B0D141323");
    Log.OooO0oO((String)localObject2, (String)localObject1);
    localObject1 = this.OooO;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject3 = m54207b69.F54207b69_11("K8556C5F4D52566164825A6067695724605B8B6369707260906C6A68782C2E");
      ((StringBuilder)localObject1).append((String)localObject3);
      boolean bool2 = this.OooO.isBinderAlive();
      ((StringBuilder)localObject1).append(bool2);
      localObject3 = m54207b69.F54207b69_11("(418155B6A554B48645F5A8068665D5F552A556F6D678B7371686A60373931");
      ((StringBuilder)localObject1).append((String)localObject3);
      localObject3 = this.OooO;
      bool2 = ((IBinder)localObject3).pingBinder();
      ((StringBuilder)localObject1).append(bool2);
      localObject1 = ((StringBuilder)localObject1).toString();
      Log.OooO0oO((String)localObject2, (String)localObject1);
    }
    return false;
  }
  
  public boolean ismIsConnected()
  {
    return this.OooO0o0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.common.QGManager
 * JD-Core Version:    0.7.0.1
 */