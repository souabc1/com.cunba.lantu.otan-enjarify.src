package com.qinggan.bluetooth.profile;

import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import com.qinggan.bluetooth.BTDeviceManager;
import com.qinggan.bluetooth.bean.BTPhoneMessage;
import java.util.Iterator;
import java.util.List;
import m54207b69;

class Hfp$1
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    int j = 1;
    Object localObject1;
    boolean bool2;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int k;
    int n;
    boolean bool5;
    switch (i)
    {
    default: 
      break;
    case 7: 
      localObject1 = this.OooO00o.OooO0O0.iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (IHfpCallback)((Iterator)localObject1).next();
        boolean bool3 = localObject2 instanceof SimpleHfpCallback;
        if (bool3)
        {
          localObject3 = paramMessage.getData();
          localObject4 = localObject2;
          localObject4 = (SimpleHfpCallback)localObject2;
          str = m54207b69.F54207b69_11(":S3737273D343B");
          localObject3 = Hfp.OooO00o(((Bundle)localObject3).getParcelable(str));
          ((SimpleHfpCallback)localObject4).OooO00o = ((BTDevice)localObject3);
        }
        k = paramMessage.arg1;
        n = paramMessage.arg2;
        String str = (String)paramMessage.obj;
        ((IHfpCallback)localObject2).OooOO0(k, n, str);
      }
    case 6: 
      localObject1 = this.OooO00o.OooO0O0.iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (IHfpCallback)((Iterator)localObject1).next();
        k = paramMessage.arg1;
        localObject4 = (String)paramMessage.obj;
        ((IHfpCallback)localObject2).OooO00o(k, (String)localObject4);
      }
    case 5: 
      localObject1 = this.OooO00o.OooO0O0.iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (IHfpCallback)((Iterator)localObject1).next();
        localObject3 = (BTPhoneMessage)paramMessage.obj;
        ((IHfpCallback)localObject2).OooO0oO((BTPhoneMessage)localObject3);
      }
    case 4: 
      localObject1 = this.OooO00o.OooO0O0.iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (IHfpCallback)((Iterator)localObject1).next();
        boolean bool4 = localObject2 instanceof SimpleHfpCallback;
        if (bool4)
        {
          localObject3 = localObject2;
          localObject3 = (SimpleHfpCallback)localObject2;
          localObject4 = Hfp.OooO00o(paramMessage.obj);
          ((SimpleHfpCallback)localObject3).OooO00o = ((BTDevice)localObject4);
        }
        int m = paramMessage.arg1;
        if (m == j)
        {
          m = j;
        }
        else
        {
          bool5 = false;
          localObject3 = null;
        }
        ((IHfpCallback)localObject2).OooOOOo(bool5);
      }
    case 3: 
      localObject1 = this.OooO00o.OooO0O0.iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (IHfpCallback)((Iterator)localObject1).next();
        bool5 = localObject2 instanceof SimpleHfpCallback;
        if (bool5)
        {
          localObject3 = localObject2;
          localObject3 = (SimpleHfpCallback)localObject2;
          localObject4 = Hfp.OooO00o(paramMessage.obj);
          ((SimpleHfpCallback)localObject3).OooO00o = ((BTDevice)localObject4);
        }
        ((IHfpCallback)localObject2).OooOOO0();
      }
    case 2: 
      localObject1 = this.OooO00o.OooO0O0.iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (IHfpCallback)((Iterator)localObject1).next();
        bool5 = localObject2 instanceof SimpleHfpCallback;
        if (bool5)
        {
          localObject3 = localObject2;
          localObject3 = (SimpleHfpCallback)localObject2;
          localObject4 = Hfp.OooO00o(paramMessage.obj);
          ((SimpleHfpCallback)localObject3).OooO00o = ((BTDevice)localObject4);
        }
        ((IHfpCallback)localObject2).OooO0Oo();
      }
    case 1: 
      localObject1 = (BTDevice)paramMessage.obj;
      localObject1 = this.OooO00o.OooO00o.OooO0OO((BTDevice)localObject1);
      localObject2 = this.OooO00o.OooO0O0.iterator();
      for (;;)
      {
        bool5 = ((Iterator)localObject2).hasNext();
        if (!bool5) {
          break;
        }
        localObject3 = (IHfpCallback)((Iterator)localObject2).next();
        n = paramMessage.arg1;
        int i1 = paramMessage.arg2;
        ((IBTProfileCallback)localObject3).OooO0oo((BTDevice)localObject1, n, i1);
      }
    case 0: 
      paramMessage = paramMessage.obj;
      if (paramMessage == null)
      {
        paramMessage = this.OooO00o.OooO0O0.iterator();
        for (;;)
        {
          boolean bool1 = paramMessage.hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = (IHfpCallback)paramMessage.next();
          ((IBTProfileCallback)localObject1).OooO0O0();
        }
      }
      paramMessage = (IHfpCallback)paramMessage;
      paramMessage.OooO0O0();
    }
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bluetooth.profile.Hfp.1
 * JD-Core Version:    0.7.0.1
 */