package com.qinggan.common;

import android.os.IBinder.DeathRecipient;
import m54207b69;

class QGManagerBase$2
  implements IBinder.DeathRecipient
{
  public void binderDied()
  {
    this.OooO00o.OooO0oO = null;
    this.OooO00o.OooO0Oo = false;
    Object localObject1 = this.OooO00o;
    boolean bool = ((QGManagerBase)localObject1).OooO0Oo;
    QGManagerBase.OooO00o((QGManagerBase)localObject1, bool);
    localObject1 = new java/lang/Thread;
    Object localObject2 = QGManagerBase.OooO0O0(this.OooO00o);
    ((Thread)localObject1).<init>((Runnable)localObject2);
    ((Thread)localObject1).start();
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = QGManagerBase.OooO0OO(this.OooO00o);
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("^*0A5951484C63514A4C1351845B656A5259607A565863656F1C1D1E");
    ((StringBuilder)localObject1).append((String)localObject2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.common.QGManagerBase.2
 * JD-Core Version:    0.7.0.1
 */