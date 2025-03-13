package com.qinggan.tbox;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.qinggan.os.ServiceManager;
import java.util.HashMap;
import m54207b69;

class TBoxManager$ObtainServiceThread
  extends Thread
{
  public TBoxManager$ObtainServiceThread(TBoxManager paramTBoxManager) {}
  
  public void run()
  {
    int i = 100;
    for (;;)
    {
      Object localObject1 = this.o00OoOoo;
      boolean bool1 = TBoxManager.OooO0OO((TBoxManager)localObject1);
      if (bool1) {
        break;
      }
      localObject1 = this.o00OoOoo;
      Object localObject4 = ServiceManager.OooO0O0(m54207b69.F54207b69_11("DJ2E273B18422D2B391D4239434830373E"));
      TBoxManager.OooO0o((TBoxManager)localObject1, (IBinder)localObject4);
      localObject1 = TBoxManager.OooO0o0(this.o00OoOoo);
      int j;
      if (localObject1 == null)
      {
        j = i % 1000;
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
        Object localObject2 = this.o00OoOoo;
        boolean bool2 = true;
        TBoxManager.OooO0Oo((TBoxManager)localObject2, bool2);
        try
        {
          localObject2 = this.o00OoOoo;
          localObject2 = TBoxManager.OooO0o0((TBoxManager)localObject2);
          localObject4 = this.o00OoOoo;
          localObject4 = ((TBoxManager)localObject4).OooO0OO;
          ((IBinder)localObject2).linkToDeath((IBinder.DeathRecipient)localObject4, 0);
        }
        catch (RemoteException localRemoteException)
        {
          localRemoteException.printStackTrace();
        }
        Object localObject3 = this.o00OoOoo;
        localObject4 = ITBoxService.Stub.o0Oo0o0O(TBoxManager.OooO0o0((TBoxManager)localObject3));
        TBoxManager.OooO0oO((TBoxManager)localObject3, (ITBoxService)localObject4);
        localObject3 = TBoxManager.OooO0O0(this.o00OoOoo);
        j = ((HashMap)localObject3).size();
        if (j > 0)
        {
          localObject3 = TBoxManager.OooO0O0(this.o00OoOoo);
          localObject4 = TBoxManager.OooO0oo(this.o00OoOoo);
          localObject3 = (TBoxManager.OnInitListener)((HashMap)localObject3).get(localObject4);
          localObject4 = this.o00OoOoo;
          TBoxManager.OooO((TBoxManager)localObject4, (TBoxManager.OnInitListener)localObject3);
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.tbox.TBoxManager.ObtainServiceThread
 * JD-Core Version:    0.7.0.1
 */