package com.qinggan.bluetooth.profile;

import android.os.Handler.Callback;
import android.os.Message;
import com.qinggan.bluetooth.BTDeviceManager;
import com.qinggan.bluetooth.bean.BTMediaInfo;
import java.util.Iterator;
import java.util.List;

class A2dp$1
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    int j = 1;
    Object localObject1;
    if (i != 0)
    {
      Object localObject2;
      Object localObject3;
      boolean bool3;
      if (i != j)
      {
        int k = 2;
        boolean bool2;
        if (i != k)
        {
          k = 3;
          if (i != k)
          {
            k = 4;
            if (i != k)
            {
              k = 5;
              if (i == k)
              {
                localObject1 = this.OooO00o.OooO00o.iterator();
                for (;;)
                {
                  bool2 = ((Iterator)localObject1).hasNext();
                  if (!bool2) {
                    break;
                  }
                  localObject2 = (IA2dpCallback)((Iterator)localObject1).next();
                  localObject3 = (BTMediaInfo)paramMessage.obj;
                  ((IA2dpCallback)localObject2).OooOOO((BTMediaInfo)localObject3);
                }
              }
            }
            else
            {
              localObject1 = this.OooO00o.OooO00o.iterator();
              for (;;)
              {
                bool2 = ((Iterator)localObject1).hasNext();
                if (!bool2) {
                  break;
                }
                localObject2 = (IA2dpCallback)((Iterator)localObject1).next();
                localObject3 = (Boolean)paramMessage.obj;
                bool3 = ((Boolean)localObject3).booleanValue();
                ((IA2dpCallback)localObject2).OooO0o(bool3);
              }
            }
          }
          else
          {
            localObject1 = this.OooO00o.OooO00o.iterator();
            for (;;)
            {
              bool2 = ((Iterator)localObject1).hasNext();
              if (!bool2) {
                break;
              }
              localObject2 = (IA2dpCallback)((Iterator)localObject1).next();
              localObject3 = (Long)paramMessage.obj;
              long l = ((Long)localObject3).longValue();
              ((IA2dpCallback)localObject2).OooO0o0(l);
            }
          }
        }
        else
        {
          localObject1 = this.OooO00o.OooO00o.iterator();
          for (;;)
          {
            bool2 = ((Iterator)localObject1).hasNext();
            if (!bool2) {
              break;
            }
            localObject2 = (IA2dpCallback)((Iterator)localObject1).next();
            localObject3 = (BTMediaInfo)paramMessage.obj;
            ((IA2dpCallback)localObject2).OooOOOO((BTMediaInfo)localObject3);
          }
        }
      }
      else
      {
        localObject1 = (BTDevice)paramMessage.obj;
        localObject1 = this.OooO00o.OooO0O0.OooO0OO((BTDevice)localObject1);
        localObject2 = this.OooO00o.OooO00o.iterator();
        for (;;)
        {
          bool3 = ((Iterator)localObject2).hasNext();
          if (!bool3) {
            break;
          }
          localObject3 = (IA2dpCallback)((Iterator)localObject2).next();
          int m = paramMessage.arg1;
          int n = paramMessage.arg2;
          ((IBTProfileCallback)localObject3).OooO0oo((BTDevice)localObject1, m, n);
        }
      }
    }
    else
    {
      paramMessage = paramMessage.obj;
      if (paramMessage == null)
      {
        paramMessage = this.OooO00o.OooO00o.iterator();
        for (;;)
        {
          boolean bool1 = paramMessage.hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = (IA2dpCallback)paramMessage.next();
          ((IBTProfileCallback)localObject1).OooO0O0();
        }
      }
      paramMessage = (IA2dpCallback)paramMessage;
      paramMessage.OooO0O0();
    }
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bluetooth.profile.A2dp.1
 * JD-Core Version:    0.7.0.1
 */