package com.qinggan.system;

import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class SunRiseSetManager$1
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    Iterator localIterator = SunRiseSetManager.OooO00o(this.OooO00o).keySet().iterator();
    int i = paramMessage.what;
    int j = 1;
    if (i == j) {
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        Object localObject1 = SunRiseSetManager.OooO00o(this.OooO00o);
        Object localObject2 = localIterator.next();
        localObject1 = (SunRiseSetManager.OnSunRiseSetListener)((HashMap)localObject1).get(localObject2);
        int k = paramMessage.arg1;
        if (k == j) {
          ((SunRiseSetManager.OnSunRiseSetListener)localObject1).OooO00o();
        } else {
          ((SunRiseSetManager.OnSunRiseSetListener)localObject1).OooO0O0();
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.SunRiseSetManager.1
 * JD-Core Version:    0.7.0.1
 */