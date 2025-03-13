package com.qinggan.common;

import android.os.IBinder.DeathRecipient;
import com.qinggan.util.Log;
import m54207b69;

class QGManager$2
  implements IBinder.DeathRecipient
{
  public void binderDied()
  {
    this.OooO00o.OooO0oo = null;
    this.OooO00o.OooO0o0 = false;
    Object localObject1 = this.OooO00o;
    boolean bool = ((QGManager)localObject1).OooO0o0;
    QGManager.OooO0O0((QGManager)localObject1, bool);
    localObject1 = new java/lang/Thread;
    Object localObject2 = QGManager.OooO0OO(this.OooO00o);
    ((Thread)localObject1).<init>((Runnable)localObject2);
    ((Thread)localObject1).start();
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = QGManager.OooO0Oo(this.OooO00o);
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("^*0A5951484C63514A4C1351845B656A5259607A565863656F1C1D1E");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("Hi382F260B0B0D141323");
    localObject1 = ((StringBuilder)localObject1).toString();
    Log.OooO00o((String)localObject2, (String)localObject1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.common.QGManager.2
 * JD-Core Version:    0.7.0.1
 */