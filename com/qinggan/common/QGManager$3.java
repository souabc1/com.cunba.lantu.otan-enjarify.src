package com.qinggan.common;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.RemoteException;
import com.qinggan.os.ServiceManager;
import com.qinggan.util.Log;
import m54207b69;

class QGManager$3
  implements Runnable
{
  public void run()
  {
    int i = 1;
    int j = i;
    for (;;)
    {
      Object localObject1 = this.o00OoOoo;
      boolean bool1 = ((QGManager)localObject1).OooO0o0;
      if (bool1) {
        break;
      }
      localObject1 = this.o00OoOoo;
      Object localObject3 = ServiceManager.OooO0O0(QGManager.OooO0oO((QGManager)localObject1));
      QGManager.OooO0o((QGManager)localObject1, (IBinder)localObject3);
      localObject1 = QGManager.OooO0o0(this.o00OoOoo);
      String str1;
      if (localObject1 == null)
      {
        int k = j % 10;
        localObject3 = m54207b69.F54207b69_11("Hi382F260B0B0D141323");
        if (k == 0)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          str1 = m54207b69.F54207b69_11(";-4E4D451047475F14525163186A556D6A545F5A20");
          ((StringBuilder)localObject1).append(str1);
          str1 = QGManager.OooO0oO(this.o00OoOoo);
          ((StringBuilder)localObject1).append(str1);
          str1 = m54207b69.F54207b69_11("ic4D4E4F505152");
          ((StringBuilder)localObject1).append(str1);
          localObject1 = ((StringBuilder)localObject1).toString();
          Log.OooO0oO((String)localObject3, (String)localObject1);
        }
        long l1 = j * 100;
        long l2 = 180000L;
        boolean bool2 = l1 < l2;
        if (bool2)
        {
          Object localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          String str2 = m54207b69.F54207b69_11(":j1E0409124E0A25254E24290E2A571612141F565758");
          ((StringBuilder)localObject4).append(str2);
          str2 = QGManager.OooO0oO(this.o00OoOoo);
          ((StringBuilder)localObject4).append(str2);
          localObject4 = ((StringBuilder)localObject4).toString();
          Log.OooO0oO((String)localObject3, (String)localObject4);
          break;
        }
        long l3 = 100;
        try
        {
          Thread.sleep(l3);
          j += 1;
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
        }
      }
      else
      {
        try
        {
          Object localObject2 = this.o00OoOoo;
          localObject2 = QGManager.OooO0o0((QGManager)localObject2);
          localObject3 = this.o00OoOoo;
          localObject3 = ((QGManager)localObject3).OooO00o;
          str1 = null;
          ((IBinder)localObject2).linkToDeath((IBinder.DeathRecipient)localObject3, 0);
        }
        catch (RemoteException localRemoteException)
        {
          localRemoteException.printStackTrace();
        }
        QGManager localQGManager = this.o00OoOoo;
        localObject3 = QGManager.OooO0o0(localQGManager);
        localObject3 = localQGManager.OooOO0((IBinder)localObject3);
        localQGManager.OooO0oo = ((IInterface)localObject3);
        this.o00OoOoo.OooO0o0 = i;
        localQGManager = this.o00OoOoo;
        boolean bool3 = localQGManager.OooO0o0;
        QGManager.OooO0O0(localQGManager, bool3);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.common.QGManager.3
 * JD-Core Version:    0.7.0.1
 */