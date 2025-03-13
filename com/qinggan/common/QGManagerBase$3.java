package com.qinggan.common;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.RemoteException;
import com.qinggan.os.ServiceManager;
import m54207b69;

class QGManagerBase$3
  implements Runnable
{
  public void run()
  {
    int i = 1;
    int j = i;
    for (;;)
    {
      Object localObject1 = this.o00OoOoo;
      boolean bool1 = ((QGManagerBase)localObject1).OooO0Oo;
      if (bool1) {
        break;
      }
      localObject1 = this.o00OoOoo;
      Object localObject3 = ServiceManager.OooO0O0(QGManagerBase.OooO0o((QGManagerBase)localObject1));
      QGManagerBase.OooO0o0((QGManagerBase)localObject1, (IBinder)localObject3);
      localObject1 = QGManagerBase.OooO0Oo(this.o00OoOoo);
      QGManagerBase localQGManagerBase2;
      if (localObject1 == null)
      {
        int k = j % 10;
        if (k == 0)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject3 = m54207b69.F54207b69_11(";-4E4D451047475F14525163186A556D6A545F5A20");
          ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = QGManagerBase.OooO0o(this.o00OoOoo);
          ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = m54207b69.F54207b69_11("ic4D4E4F505152");
          ((StringBuilder)localObject1).append((String)localObject3);
        }
        long l1 = j * 100;
        localQGManagerBase2 = this.o00OoOoo;
        long l2 = localQGManagerBase2.getRetryTime();
        boolean bool2 = l1 < l2;
        if (bool2)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str = m54207b69.F54207b69_11(":j1E0409124E0A25254E24290E2A571612141F565758");
          localStringBuilder.append(str);
          str = QGManagerBase.OooO0o(this.o00OoOoo);
          localStringBuilder.append(str);
          break;
        }
        l1 = 100;
        try
        {
          Thread.sleep(l1);
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
          localObject2 = QGManagerBase.OooO0Oo((QGManagerBase)localObject2);
          localObject3 = this.o00OoOoo;
          localObject3 = ((QGManagerBase)localObject3).OooO00o;
          localQGManagerBase2 = null;
          ((IBinder)localObject2).linkToDeath((IBinder.DeathRecipient)localObject3, 0);
        }
        catch (RemoteException localRemoteException)
        {
          localRemoteException.printStackTrace();
        }
        QGManagerBase localQGManagerBase1 = this.o00OoOoo;
        localObject3 = QGManagerBase.OooO0Oo(localQGManagerBase1);
        localObject3 = localQGManagerBase1.OooO0oo((IBinder)localObject3);
        localQGManagerBase1.OooO0oO = ((IInterface)localObject3);
        this.o00OoOoo.OooO0Oo = i;
        localQGManagerBase1 = this.o00OoOoo;
        boolean bool3 = localQGManagerBase1.OooO0Oo;
        QGManagerBase.OooO00o(localQGManagerBase1, bool3);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.common.QGManagerBase.3
 * JD-Core Version:    0.7.0.1
 */