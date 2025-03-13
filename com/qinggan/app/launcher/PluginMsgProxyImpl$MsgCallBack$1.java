package com.qinggan.app.launcher;

import android.os.Message;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m54207b69;

class PluginMsgProxyImpl$MsgCallBack$1
  implements Runnable
{
  public PluginMsgProxyImpl$MsgCallBack$1(PluginMsgProxyImpl.MsgCallBack paramMsgCallBack, QGMessage paramQGMessage) {}
  
  public void run()
  {
    Object localObject1 = this.o00OoOoo.OooO00o.OooO.keySet().iterator();
    Object localObject2 = null;
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject3 = (String)((Iterator)localObject1).next();
      String str = this.o00Ooo00.o00Ooo0o;
      bool1 = ((String)localObject3).equals(str);
      if (bool1)
      {
        localObject2 = this.o00OoOoo.OooO00o.OooO;
        localObject3 = this.o00Ooo00.o00Ooo0o;
        localObject2 = (IBoxBridge)((Map)localObject2).get(localObject3);
      }
    }
    if (localObject2 == null) {
      return;
    }
    localObject1 = PluginMsgProxyImpl.OooOO0;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject3 = m54207b69.F54207b69_11("?f09092412191B0D190D17401F151D1D1113255829211672");
    ((StringBuilder)localObject1).append((String)localObject3);
    localObject3 = this.o00Ooo00.o00Ooo0o;
    ((StringBuilder)localObject1).append((String)localObject3);
    localObject3 = m54207b69.F54207b69_11("QG67252C2681");
    ((StringBuilder)localObject1).append((String)localObject3);
    localObject3 = this.o00Ooo00;
    int i = ((QGMessage)localObject3).o00OoOoo;
    ((StringBuilder)localObject1).append(i);
    localObject1 = this.o00Ooo00;
    i = ((QGMessage)localObject1).o00OoOoo;
    int j = 1;
    if (i != j)
    {
      int k = 2;
      if (i != k)
      {
        k = 3;
        if (i != k)
        {
          k = 4;
          if (i == k)
          {
            localObject1 = ((QGMessage)localObject1).o00OooO;
            if (localObject1 == null) {
              return;
            }
            int m = ((List)localObject1).size();
            if (m == j)
            {
              localObject1 = this.o00Ooo00.o00OooO;
              i = 0;
              localObject3 = null;
              localObject1 = (String)((List)localObject1).get(0);
              ((IBoxBridge)localObject2).OooO0O0((String)localObject1);
            }
            else
            {
              localObject1 = this.o00Ooo00.o00OooO;
              m = ((List)localObject1).size();
              if (m > j)
              {
                localObject1 = this.o00Ooo00.o00OooO;
                ((IBoxBridge)localObject2).OooO0o0((List)localObject1);
              }
            }
          }
        }
        else
        {
          localObject1 = ((QGMessage)localObject1).o00OooO;
          ((IBoxBridge)localObject2).OooO0OO((List)localObject1);
        }
      }
      else
      {
        localObject3 = ((QGMessage)localObject1).o00OooO0;
        localObject1 = ((QGMessage)localObject1).o00Ooo0O;
        ((IBoxBridge)localObject2).OooO00o((String)localObject3, (Message)localObject1);
      }
    }
    else
    {
      localObject3 = ((QGMessage)localObject1).o00OooO0;
      j = ((QGMessage)localObject1).o00Ooo0;
      boolean bool2 = ((QGMessage)localObject1).o00Ooo00;
      localObject1 = ((QGMessage)localObject1).o00Ooo0O;
      ((IBoxBridge)localObject2).OooO0Oo((String)localObject3, j, bool2, (Message)localObject1);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.app.launcher.PluginMsgProxyImpl.MsgCallBack.1
 * JD-Core Version:    0.7.0.1
 */