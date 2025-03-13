package com.qinggan.common;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import java.util.ArrayList;
import m54207b69;

public abstract class QGManagerBase
{
  public String OooO;
  public IBinder.DeathRecipient OooO00o;
  public volatile boolean OooO0O0;
  public ArrayList OooO0OO;
  public volatile boolean OooO0Oo;
  public Runnable OooO0o;
  public Object OooO0o0;
  public volatile IInterface OooO0oO;
  public volatile IBinder OooO0oo;
  public String OooOO0;
  public long OooOO0O;
  
  public final void OooO0oO(boolean paramBoolean)
  {
    Object localObject1 = this.OooO0o0;
    int i = 1;
    try
    {
      this.OooO0O0 = i;
      i = 0;
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
  
  public abstract IInterface OooO0oo(IBinder paramIBinder);
  
  public long getRetryTime()
  {
    return this.OooOO0O;
  }
  
  public boolean isServiceAvailable()
  {
    Object localObject1 = this.OooO0oo;
    if (localObject1 != null)
    {
      localObject1 = this.OooO0oo;
      boolean bool1 = ((IBinder)localObject1).isBinderAlive();
      if (bool1)
      {
        localObject1 = this.OooO0oo;
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
    localObject2 = this.OooO0oo;
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = this.OooO0oo;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("K8556C5F4D52566164825A6067695724605B8B6369707260906C6A68782C2E");
      ((StringBuilder)localObject1).append((String)localObject2);
      boolean bool2 = this.OooO0oo.isBinderAlive();
      ((StringBuilder)localObject1).append(bool2);
      localObject2 = m54207b69.F54207b69_11("(418155B6A554B48645F5A8068665D5F552A556F6D678B7371686A60373931");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = this.OooO0oo;
      bool2 = ((IBinder)localObject2).pingBinder();
      ((StringBuilder)localObject1).append(bool2);
    }
    return false;
  }
  
  public boolean ismIsConnected()
  {
    return this.OooO0Oo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.common.QGManagerBase
 * JD-Core Version:    0.7.0.1
 */