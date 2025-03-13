package com.qinggan.bluetooth.profile;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import com.qinggan.bluetooth.BTDeviceManager;
import com.qinggan.bluetooth.bean.BTCallLogItem;
import com.qinggan.bluetooth.bean.BTContactItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m54207b69;

class Pbap$1
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1 = m54207b69.F54207b69_11(":S3737273D343B");
    Object localObject2;
    boolean bool2;
    Object localObject3;
    boolean bool3;
    boolean bool4;
    Object localObject4;
    Object localObject5;
    String str;
    int i2;
    boolean bool5;
    switch (i)
    {
    default: 
      return this.OooO00o.OooO0OO(paramMessage);
    case 6: 
      localObject2 = (BluetoothDevice)paramMessage.obj;
      localObject1 = this.OooO00o;
      localObject2 = ((BluetoothDevice)localObject2).getAddress();
      localObject2 = Pbap.OooO00o((Pbap)localObject1, (String)localObject2).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (IPbapCallback)((Iterator)localObject2).next();
        int j = paramMessage.arg1;
        int k = paramMessage.arg2;
        ((IPbapCallback)localObject1).OooOOo(j, k);
      }
    case 5: 
      localObject2 = paramMessage.getData().getParcelable((String)localObject1);
      if (localObject2 != null)
      {
        localObject1 = this.OooO00o;
        localObject2 = (BluetoothDevice)localObject2;
        localObject3 = ((BluetoothDevice)localObject2).getAddress();
        localObject1 = Pbap.OooO00o((Pbap)localObject1, (String)localObject3).iterator();
        for (;;)
        {
          bool3 = ((Iterator)localObject1).hasNext();
          if (!bool3) {
            break;
          }
          localObject3 = (IPbapCallback)((Iterator)localObject1).next();
          bool4 = localObject3 instanceof SimplePbapCallback;
          if (bool4)
          {
            localObject4 = localObject3;
            localObject4 = (SimplePbapCallback)localObject3;
            localObject5 = BTAdapter.OooO;
            str = ((BluetoothDevice)localObject2).getAddress();
            localObject5 = ((BTAdapter)localObject5).OooO0Oo(str);
            ((SimplePbapCallback)localObject4).OooO00o = ((BTDevice)localObject5);
          }
          localObject4 = (BTContactItem)paramMessage.obj;
          ((IPbapCallback)localObject3).OooO((BTContactItem)localObject4);
        }
      }
      break;
    case 4: 
      localObject2 = (BluetoothDevice)paramMessage.obj;
      localObject1 = this.OooO00o;
      localObject3 = ((BluetoothDevice)localObject2).getAddress();
      localObject1 = Pbap.OooO00o((Pbap)localObject1, (String)localObject3).iterator();
      for (;;)
      {
        bool3 = ((Iterator)localObject1).hasNext();
        if (!bool3) {
          break;
        }
        localObject3 = (IPbapCallback)((Iterator)localObject1).next();
        bool4 = localObject3 instanceof SimplePbapCallback;
        if (bool4)
        {
          localObject4 = localObject3;
          localObject4 = (SimplePbapCallback)localObject3;
          localObject5 = BTAdapter.OooO;
          str = ((BluetoothDevice)localObject2).getAddress();
          localObject5 = ((BTAdapter)localObject5).OooO0Oo(str);
          ((SimplePbapCallback)localObject4).OooO00o = ((BTDevice)localObject5);
        }
        int m = paramMessage.arg1;
        i2 = paramMessage.arg2;
        ((IPbapCallback)localObject3).OooOO0o(m, i2);
      }
    case 3: 
      localObject2 = paramMessage.getData().getParcelable((String)localObject1);
      if (localObject2 != null)
      {
        localObject1 = this.OooO00o;
        localObject2 = (BluetoothDevice)localObject2;
        localObject3 = ((BluetoothDevice)localObject2).getAddress();
        localObject1 = Pbap.OooO00o((Pbap)localObject1, (String)localObject3).iterator();
        for (;;)
        {
          bool3 = ((Iterator)localObject1).hasNext();
          if (!bool3) {
            break;
          }
          localObject3 = (IPbapCallback)((Iterator)localObject1).next();
          bool5 = localObject3 instanceof SimplePbapCallback;
          if (bool5)
          {
            localObject4 = localObject3;
            localObject4 = (SimplePbapCallback)localObject3;
            localObject5 = BTAdapter.OooO;
            str = ((BluetoothDevice)localObject2).getAddress();
            localObject5 = ((BTAdapter)localObject5).OooO0Oo(str);
            ((SimplePbapCallback)localObject4).OooO00o = ((BTDevice)localObject5);
          }
          localObject4 = (BTCallLogItem)paramMessage.obj;
          ((IPbapCallback)localObject3).OooOO0O((BTCallLogItem)localObject4);
        }
      }
      break;
    case 2: 
      localObject2 = (BluetoothDevice)paramMessage.obj;
      if (localObject2 != null)
      {
        localObject1 = this.OooO00o;
        localObject3 = ((BluetoothDevice)localObject2).getAddress();
        localObject1 = Pbap.OooO00o((Pbap)localObject1, (String)localObject3).iterator();
        for (;;)
        {
          bool3 = ((Iterator)localObject1).hasNext();
          if (!bool3) {
            break;
          }
          localObject3 = (IPbapCallback)((Iterator)localObject1).next();
          bool5 = localObject3 instanceof SimplePbapCallback;
          if (bool5)
          {
            localObject4 = localObject3;
            localObject4 = (SimplePbapCallback)localObject3;
            localObject5 = BTAdapter.OooO;
            str = ((BluetoothDevice)localObject2).getAddress();
            localObject5 = ((BTAdapter)localObject5).OooO0Oo(str);
            ((SimplePbapCallback)localObject4).OooO00o = ((BTDevice)localObject5);
          }
          int n = paramMessage.arg1;
          i2 = paramMessage.arg2;
          ((IPbapCallback)localObject3).OooO0OO(n, i2);
        }
      }
      break;
    case 1: 
      localObject2 = (BTDevice)paramMessage.obj;
      localObject1 = this.OooO00o.OooO00o.OooO0OO((BTDevice)localObject2);
      localObject3 = this.OooO00o;
      localObject2 = ((BTDevice)localObject2).getAddress();
      localObject2 = Pbap.OooO00o((Pbap)localObject3, (String)localObject2).iterator();
      for (;;)
      {
        bool3 = ((Iterator)localObject2).hasNext();
        if (!bool3) {
          break;
        }
        localObject3 = (IPbapCallback)((Iterator)localObject2).next();
        boolean bool6 = localObject3 instanceof SimplePbapCallback;
        if (bool6)
        {
          localObject4 = localObject3;
          localObject4 = (SimplePbapCallback)localObject3;
          ((SimplePbapCallback)localObject4).OooO00o = ((BTDevice)localObject1);
        }
        int i1 = paramMessage.arg1;
        i2 = paramMessage.arg2;
        ((IBTProfileCallback)localObject3).OooO0oo((BTDevice)localObject1, i1, i2);
      }
    case 0: 
      paramMessage = paramMessage.obj;
      if (paramMessage == null)
      {
        paramMessage = this.OooO00o.OooO0O0.values().iterator();
        boolean bool1 = paramMessage.hasNext();
        if (bool1)
        {
          localObject2 = ((List)paramMessage.next()).iterator();
          for (;;)
          {
            bool2 = ((Iterator)localObject2).hasNext();
            if (!bool2) {
              break;
            }
            localObject1 = (IPbapCallback)((Iterator)localObject2).next();
            ((IBTProfileCallback)localObject1).OooO0O0();
          }
        }
      }
      else
      {
        paramMessage = (IPbapCallback)paramMessage;
        paramMessage.OooO0O0();
      }
      break;
    }
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bluetooth.profile.Pbap.1
 * JD-Core Version:    0.7.0.1
 */