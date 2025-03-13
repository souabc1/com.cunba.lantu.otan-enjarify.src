package com.qinggan.bluetooth.profile;

import android.os.BaseBundle;
import android.os.Handler.Callback;
import android.os.Message;
import android.text.TextUtils;
import com.qinggan.bluetooth.BTDeviceManager;
import com.qinggan.bluetooth.internal.util.Log;
import com.qinggan.bluetooth.listener.BTStateListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m54207b69;

class BTAdapter$1
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    int k = 1;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int i4;
    int i3;
    int i9;
    boolean bool3;
    boolean bool4;
    boolean bool1;
    boolean bool11;
    boolean bool5;
    boolean bool6;
    switch (i)
    {
    default: 
      break;
    case 16: 
      localObject1 = (BTDevice)paramMessage.obj;
      localObject2 = paramMessage.getData();
      localObject3 = m54207b69.F54207b69_11("_L3C3F252D29252F");
      int m = ((BaseBundle)localObject2).getInt((String)localObject3);
      if ((m != 0) && (localObject1 != null))
      {
        localObject3 = this.OooO00o.OooO0o.iterator();
        for (;;)
        {
          boolean bool7 = ((Iterator)localObject3).hasNext();
          if (!bool7) {
            break;
          }
          localObject4 = (IBTCallback)((Iterator)localObject3).next();
          boolean bool8 = localObject4 instanceof BTStateListener;
          if (bool8)
          {
            localObject4 = (BTStateListener)localObject4;
            i4 = paramMessage.arg1;
            int i5 = paramMessage.arg2;
            ((BTStateListener)localObject4).OooO00o((BTDevice)localObject1, m, i4, i5);
          }
        }
      }
      break;
    case 15: 
      localObject1 = (BTDevice)paramMessage.obj;
      localObject2 = this.OooO00o.OooO0o.iterator();
      for (;;)
      {
        boolean bool9 = ((Iterator)localObject2).hasNext();
        if (!bool9) {
          break;
        }
        localObject3 = (IBTCallback)((Iterator)localObject2).next();
        i3 = paramMessage.arg1;
        i4 = paramMessage.arg2;
        ((IBTCallback)localObject3).OooO0o((BTDevice)localObject1, i3, i4);
      }
    case 14: 
      localObject1 = (BTDevice)paramMessage.obj;
      if (localObject1 != null)
      {
        localObject2 = BTAdapter.OooO0OO();
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = m54207b69.F54207b69_11(".)4D4D61434E510D555466725859685A696A12121C281E");
        ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = ((BTDevice)localObject1).getAddress();
        ((StringBuilder)localObject3).append((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).toString();
        Log.OooO00o((String)localObject2, (String)localObject3);
        localObject2 = this.OooO00o.OooO0OO;
        localObject1 = ((BTDevice)localObject1).getAddress();
        localObject1 = ((BTDeviceManager)localObject2).OooO0O0((String)localObject1);
      }
      else
      {
        localObject1 = BTAdapter.OooO0OO();
        localObject2 = m54207b69.F54207b69_11("d+4F4F5F454C53114960144F69535418");
        Log.OooO00o((String)localObject1, (String)localObject2);
        i = 0;
        localObject1 = null;
      }
      localObject2 = this.OooO00o;
      i9 = paramMessage.arg1;
      BTAdapter.OooO0O0((BTAdapter)localObject2, i9);
      if (localObject1 != null)
      {
        paramMessage = this.OooO00o.OooO0o.iterator();
        for (;;)
        {
          bool3 = paramMessage.hasNext();
          if (!bool3) {
            break;
          }
          localObject2 = (IBTCallback)paramMessage.next();
          ((IBTCallback)localObject2).OooOOO0((BTDevice)localObject1);
        }
      }
      paramMessage = BTAdapter.OooO0OO();
      localObject1 = m54207b69.F54207b69_11("`B362B29092B3931282F6B353C6E39453D3E74");
      Log.OooO00o(paramMessage, (String)localObject1);
      break;
    case 13: 
      localObject1 = this.OooO00o.OooO0o.iterator();
      for (;;)
      {
        bool3 = ((Iterator)localObject1).hasNext();
        if (!bool3) {
          break;
        }
        localObject2 = (IBTCallback)((Iterator)localObject1).next();
        localObject3 = (String)paramMessage.obj;
        ((IBTCallback)localObject2).OooO0Oo((String)localObject3);
      }
    case 12: 
      localObject1 = (BTDevice)paramMessage.obj;
      localObject2 = this.OooO00o.OooO0OO;
      localObject3 = ((BTDevice)localObject1).getAddress();
      localObject2 = ((BTDeviceManager)localObject2).OooO0O0((String)localObject3);
      int i6 = paramMessage.arg2;
      i3 = 16;
      if (i6 == i3)
      {
        localObject3 = this.OooO00o;
        i4 = -1;
        BTAdapter.OooO0O0((BTAdapter)localObject3, i4);
      }
      else
      {
        i4 = 19;
        if (i6 == i4)
        {
          localObject3 = this.OooO00o;
          BTAdapter.OooO00o((BTAdapter)localObject3);
        }
      }
      boolean bool10;
      if (localObject2 == null)
      {
        localObject2 = this.OooO00o.OooO0OO;
        localObject1 = ((BTDeviceManager)localObject2).OooO00o((BTDevice)localObject1);
        int n = paramMessage.arg2;
        if (n == i3)
        {
          localObject2 = this.OooO00o.OooO0o.iterator();
          for (;;)
          {
            bool10 = ((Iterator)localObject2).hasNext();
            if (!bool10) {
              break;
            }
            localObject3 = (IBTCallback)((Iterator)localObject2).next();
            ((IBTCallback)localObject3).OooO0oO((BTDevice)localObject1);
          }
        }
        localObject2 = this.OooO00o.OooO0o.iterator();
        for (;;)
        {
          bool10 = ((Iterator)localObject2).hasNext();
          if (!bool10) {
            break;
          }
          localObject3 = (IBTCallback)((Iterator)localObject2).next();
          i3 = paramMessage.arg1;
          i4 = paramMessage.arg2;
          ((IBTCallback)localObject3).OooO0OO((BTDevice)localObject1, i3, i4);
        }
      }
      localObject1 = this.OooO00o.OooO0o.iterator();
      for (;;)
      {
        bool10 = ((Iterator)localObject1).hasNext();
        if (!bool10) {
          break;
        }
        localObject3 = (IBTCallback)((Iterator)localObject1).next();
        i3 = paramMessage.arg1;
        i4 = paramMessage.arg2;
        ((IBTCallback)localObject3).OooO0OO((BTDevice)localObject2, i3, i4);
      }
    case 11: 
      localObject1 = this.OooO00o.OooO0o.iterator();
      for (;;)
      {
        bool4 = ((Iterator)localObject1).hasNext();
        if (!bool4) {
          break;
        }
        localObject2 = (IBTCallback)((Iterator)localObject1).next();
        int i7 = paramMessage.arg1;
        i3 = paramMessage.arg2;
        ((IBTCallback)localObject2).OooO0o0(i7, i3);
      }
    case 9: 
    case 10: 
      paramMessage = (BTDevice)paramMessage.obj;
      localObject1 = this.OooO00o.OooO0OO;
      localObject2 = paramMessage.getAddress();
      localObject1 = ((BTDeviceManager)localObject1).OooO0O0((String)localObject2);
      if (localObject1 == null)
      {
        localObject1 = this.OooO00o.getConnectedDevice();
        localObject2 = this.OooO00o;
        bool4 = ((BTAdapter)localObject2).isDiscovering();
        if (!bool4) {
          if (localObject1 != null)
          {
            localObject1 = ((BTDevice)localObject1).getAddress();
            localObject2 = paramMessage.getAddress();
            bool1 = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
            if (bool1) {}
          }
          else
          {
            return k;
          }
        }
        localObject1 = this.OooO00o.OooO0OO.OooO00o(paramMessage);
        localObject2 = this.OooO00o.OooO0o.iterator();
        for (;;)
        {
          bool11 = ((Iterator)localObject2).hasNext();
          if (!bool11) {
            break;
          }
          localObject3 = (IBTCallback)((Iterator)localObject2).next();
          ((IBTCallback)localObject3).OooO0oO((BTDevice)localObject1);
        }
      }
      ((BTDevice)localObject1).OooO00o(paramMessage);
      paramMessage = this.OooO00o.OooO0o.iterator();
      for (;;)
      {
        bool4 = paramMessage.hasNext();
        if (!bool4) {
          break;
        }
        localObject2 = (IBTCallback)paramMessage.next();
        ((IBTCallback)localObject2).OooOO0o((BTDevice)localObject1);
      }
    case 8: 
      localObject1 = (BTDevice)paramMessage.obj;
      localObject2 = this.OooO00o.OooO0OO;
      localObject3 = ((BTDevice)localObject1).getAddress();
      localObject2 = ((BTDeviceManager)localObject2).OooO0O0((String)localObject3);
      if (localObject2 == null)
      {
        localObject2 = this.OooO00o.OooO0OO.getCachedDevices();
        int i1 = ((Map)localObject2).size();
        if (i1 == 0)
        {
          i9 = paramMessage.arg2;
          i1 = 65;
          if (i9 == i1)
          {
            paramMessage = this.OooO00o;
            paramMessage.OooO0o();
          }
        }
        paramMessage = this.OooO00o.OooO0OO.OooO00o((BTDevice)localObject1);
        localObject1 = this.OooO00o.OooO0o.iterator();
        for (;;)
        {
          bool5 = ((Iterator)localObject1).hasNext();
          if (!bool5) {
            break;
          }
          localObject2 = (IBTCallback)((Iterator)localObject1).next();
          ((IBTCallback)localObject2).OooO0oO(paramMessage);
        }
      }
      localObject1 = this.OooO00o.OooO0o.iterator();
      for (;;)
      {
        bool11 = ((Iterator)localObject1).hasNext();
        if (!bool11) {
          break;
        }
        localObject3 = (IBTCallback)((Iterator)localObject1).next();
        i3 = paramMessage.arg1;
        i4 = paramMessage.arg2;
        ((IBTCallback)localObject3).OooO((BTDevice)localObject2, i3, i4);
      }
    case 7: 
      paramMessage = (BTDevice)paramMessage.obj;
      localObject1 = this.OooO00o.OooO0OO;
      localObject2 = paramMessage.getAddress();
      localObject1 = ((BTDeviceManager)localObject1).OooO0O0((String)localObject2);
      if (localObject1 == null)
      {
        localObject1 = this.OooO00o.getConnectedDevice();
        localObject2 = this.OooO00o;
        bool5 = ((BTAdapter)localObject2).isDiscovering();
        if (!bool5) {
          if (localObject1 != null)
          {
            localObject1 = ((BTDevice)localObject1).getAddress();
            localObject2 = paramMessage.getAddress();
            bool1 = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
            if (bool1) {}
          }
          else
          {
            return k;
          }
        }
        paramMessage = this.OooO00o.OooO0OO.OooO00o(paramMessage);
        localObject1 = this.OooO00o.OooO0o.iterator();
        for (;;)
        {
          bool5 = ((Iterator)localObject1).hasNext();
          if (!bool5) {
            break;
          }
          localObject2 = (IBTCallback)((Iterator)localObject1).next();
          ((IBTCallback)localObject2).OooO0oO(paramMessage);
        }
      }
      ((BTDevice)localObject1).OooO0O0(paramMessage);
      paramMessage = this.OooO00o.OooO0o.iterator();
      for (;;)
      {
        bool5 = paramMessage.hasNext();
        if (!bool5) {
          break;
        }
        localObject2 = (IBTCallback)paramMessage.next();
        ((IBTCallback)localObject2).OooO0oo((BTDevice)localObject1);
      }
    case 6: 
      paramMessage = (BTDevice)paramMessage.obj;
      localObject1 = this.OooO00o.OooO0OO;
      localObject2 = paramMessage.getAddress();
      localObject1 = ((BTDeviceManager)localObject1).OooO0O0((String)localObject2);
      if (localObject1 != null)
      {
        localObject1 = this.OooO00o.OooO0OO;
        localObject2 = paramMessage.getAddress();
        ((BTDeviceManager)localObject1).OooO0o0((String)localObject2);
        localObject1 = this.OooO00o.OooO0o.iterator();
        for (;;)
        {
          bool5 = ((Iterator)localObject1).hasNext();
          if (!bool5) {
            break;
          }
          localObject2 = (IBTCallback)((Iterator)localObject1).next();
          ((IBTCallback)localObject2).OooOO0(paramMessage);
        }
      }
      break;
    case 5: 
      paramMessage = (BTDevice)paramMessage.obj;
      localObject1 = this.OooO00o.OooO0OO;
      localObject2 = paramMessage.getAddress();
      localObject1 = ((BTDeviceManager)localObject1).OooO0O0((String)localObject2);
      if (localObject1 == null)
      {
        this.OooO00o.OooO0OO.OooO00o(paramMessage);
        localObject1 = this.OooO00o.OooO0o.iterator();
        for (;;)
        {
          bool5 = ((Iterator)localObject1).hasNext();
          if (!bool5) {
            break;
          }
          localObject2 = (IBTCallback)((Iterator)localObject1).next();
          ((IBTCallback)localObject2).OooO0oO(paramMessage);
        }
      }
      this.OooO00o.OooO0OO.OooO00o(paramMessage);
      localObject1 = this.OooO00o.OooO0o.iterator();
      for (;;)
      {
        bool5 = ((Iterator)localObject1).hasNext();
        if (!bool5) {
          break;
        }
        localObject2 = (IBTCallback)((Iterator)localObject1).next();
        ((IBTCallback)localObject2).OooOO0o(paramMessage);
      }
    case 4: 
      paramMessage = this.OooO00o.OooO0o.iterator();
      for (;;)
      {
        bool1 = paramMessage.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (IBTCallback)paramMessage.next();
        bool5 = false;
        localObject2 = null;
        ((IBTCallback)localObject1).OooOOOO(false);
      }
    case 3: 
      this.OooO00o.OooO0OO.OooO0Oo();
      paramMessage = this.OooO00o.OooO0o.iterator();
      for (;;)
      {
        bool1 = paramMessage.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (IBTCallback)paramMessage.next();
        ((IBTCallback)localObject1).OooOOOO(k);
      }
    case 2: 
      int j = paramMessage.arg2;
      int i2 = 2;
      if ((j == i2) || (j == 0))
      {
        this.OooO00o.OooO0OO.OooO0Oo();
        localObject1 = this.OooO00o;
        BTAdapter.OooO00o((BTAdapter)localObject1);
      }
      localObject1 = this.OooO00o.OooO0o.iterator();
      for (;;)
      {
        bool6 = ((Iterator)localObject1).hasNext();
        if (!bool6) {
          break;
        }
        localObject2 = (IBTCallback)((Iterator)localObject1).next();
        int i8 = paramMessage.arg1;
        i3 = paramMessage.arg2;
        ((IBTCallback)localObject2).OooOO0O(i8, i3);
      }
    case 1: 
      localObject1 = (Set)paramMessage.obj;
      localObject2 = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool12 = ((Iterator)localObject2).hasNext();
        if (!bool12) {
          break;
        }
        localObject3 = (BTDevice)((Iterator)localObject2).next();
        localObject4 = this.OooO00o.OooO0OO;
        String str = ((BTDevice)localObject3).getAddress();
        localObject4 = ((BTDeviceManager)localObject4).OooO0O0(str);
        if (localObject4 == null)
        {
          localObject4 = this.OooO00o.OooO0OO;
          ((BTDeviceManager)localObject4).OooO00o((BTDevice)localObject3);
        }
      }
      i9 = paramMessage.arg1;
      if (i9 == k)
      {
        paramMessage = this.OooO00o.OooO0o.iterator();
        for (;;)
        {
          bool6 = paramMessage.hasNext();
          if (!bool6) {
            break;
          }
          localObject2 = (IBTCallback)paramMessage.next();
          ((IBTCallback)localObject2).OooOOO((Set)localObject1);
        }
      }
      break;
    case 0: 
      paramMessage = paramMessage.obj;
      if (paramMessage == null)
      {
        paramMessage = this.OooO00o;
        paramMessage.OooO0o0 = k;
        paramMessage = paramMessage.OooO0o.iterator();
        for (;;)
        {
          boolean bool2 = paramMessage.hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (IBTCallback)paramMessage.next();
          ((IBTCallback)localObject1).OooO0O0();
        }
      }
      paramMessage = (IBTCallback)paramMessage;
      paramMessage.OooO0O0();
    }
    return k;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bluetooth.profile.BTAdapter.1
 * JD-Core Version:    0.7.0.1
 */