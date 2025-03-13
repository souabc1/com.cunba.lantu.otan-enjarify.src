package com.qinggan.system;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.qinggan.os.ServiceManager;
import m54207b69;

class ReverseManager$ObtainServiceThread
  extends Thread
{
  public ReverseManager$ObtainServiceThread(ReverseManager paramReverseManager) {}
  
  public void run()
  {
    int i = 100;
    for (;;)
    {
      Object localObject1 = this.o00OoOoo;
      boolean bool1 = ReverseManager.OooO0O0((ReverseManager)localObject1);
      if (!bool1)
      {
        localObject1 = ServiceManager.OooO0O0(ReverseManager.OooO0oO);
        Object localObject3;
        if (localObject1 == null)
        {
          int j = i % 1000;
          if (j == 0)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject3 = m54207b69.F54207b69_11(";-4E4D451047475F14525163186A556D6A545F5A20");
            ((StringBuilder)localObject1).append((String)localObject3);
            localObject3 = ReverseManager.OooO0oO;
            ((StringBuilder)localObject1).append((String)localObject3);
          }
          long l = 200L;
          try
          {
            Thread.sleep(l);
            i += 100;
          }
          catch (InterruptedException localInterruptedException)
          {
            localInterruptedException.printStackTrace();
          }
        }
        else
        {
          boolean bool2;
          try
          {
            localObject3 = this.o00OoOoo;
            localObject3 = ((ReverseManager)localObject3).OooO00o;
            bool2 = false;
            localInterruptedException.linkToDeath((IBinder.DeathRecipient)localObject3, 0);
          }
          catch (RemoteException localRemoteException)
          {
            localRemoteException.printStackTrace();
          }
          Object localObject4 = this.o00OoOoo;
          ??? = ISystemPolicy.Stub.o0Oo0o0O(localInterruptedException);
          ReverseManager.OooO0o0((ReverseManager)localObject4, (ISystemPolicy)???);
          ReverseManager.OooO0OO(this.o00OoOoo, true);
          ??? = new java/lang/StringBuilder;
          ((StringBuilder)???).<init>();
          localObject4 = m54207b69.F54207b69_11("J?52774E7F54565761645464662B635A2E2F");
          ((StringBuilder)???).append((String)localObject4);
          localObject4 = this.o00OoOoo;
          boolean bool3 = ReverseManager.OooO0O0((ReverseManager)localObject4);
          ((StringBuilder)???).append(bool3);
          synchronized (ReverseManager.OooO0o())
          {
            localObject4 = this.o00OoOoo;
            bool2 = ReverseManager.OooO0O0((ReverseManager)localObject4);
            ReverseManager.OooO0Oo((ReverseManager)localObject4, bool2);
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.ReverseManager.ObtainServiceThread
 * JD-Core Version:    0.7.0.1
 */