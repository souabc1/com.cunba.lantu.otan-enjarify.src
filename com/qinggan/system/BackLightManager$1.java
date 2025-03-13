package com.qinggan.system;

import android.os.Handler.Callback;
import android.os.Message;
import com.qinggan.common.OnInitListener;
import java.util.Iterator;
import java.util.List;

class BackLightManager$1
  implements Handler.Callback
{
  public boolean handleMessage(Message arg1)
  {
    int i = ???.arg1;
    Object localObject1 = null;
    int j = 1;
    if (i != j) {
      j = 0;
    }
    synchronized (this.OooO00o.OooO00o)
    {
      Object localObject3 = this.OooO00o;
      localObject3 = ((BackLightManager)localObject3).OooO00o;
      localObject3 = ((List)localObject3).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject3).hasNext();
        if (!bool) {
          break;
        }
        Object localObject4 = ((Iterator)localObject3).next();
        localObject4 = (OnInitListener)localObject4;
        ((OnInitListener)localObject4).OooO00o(j);
      }
      return false;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.BackLightManager.1
 * JD-Core Version:    0.7.0.1
 */