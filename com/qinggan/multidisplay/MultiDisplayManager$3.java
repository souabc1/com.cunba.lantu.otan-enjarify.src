package com.qinggan.multidisplay;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.util.ArrayMap;
import com.qinggan.os.ServiceManager;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import m54207b69;

class MultiDisplayManager$3
  implements Runnable
{
  public void run()
  {
    int i = 100;
    for (;;)
    {
      Object localObject1 = this.o00OoOoo;
      boolean bool1 = MultiDisplayManager.OooO((MultiDisplayManager)localObject1);
      if (!bool1)
      {
        localObject1 = ServiceManager.OooO0O0(m54207b69.F54207b69_11("<B2F3830392F2B31383A372D46"));
        if (localObject1 == null)
        {
          int j = i % 1000;
          long l = 100;
          try
          {
            Thread.sleep(l);
            i += 100;
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
            localObject3 = this.o00OoOoo;
            Object localObject4 = IMultiDisplayService.Stub.o0Oo0o0O(localInterruptedException);
            MultiDisplayManager.OooO0oo((MultiDisplayManager)localObject3, (IMultiDisplayService)localObject4);
            localObject3 = this.o00OoOoo;
            localObject3 = MultiDisplayManager.OooO0oO((MultiDisplayManager)localObject3);
            bool2 = ((IMultiDisplayService)localObject3).OooOoo();
            localObject3 = Boolean.valueOf(bool2);
            MultiDisplayManager.OooOOOO = (Boolean)localObject3;
            localObject3 = this.o00OoOoo;
            localObject3 = MultiDisplayManager.OooO0oO((MultiDisplayManager)localObject3);
            localObject4 = this.o00OoOoo;
            localObject4 = MultiDisplayManager.OooO0O0((MultiDisplayManager)localObject4);
            Object localObject5 = this.o00OoOoo;
            localObject5 = MultiDisplayManager.OooOOO((MultiDisplayManager)localObject5);
            ((IMultiDisplayService)localObject3).o0O0OoO((String)localObject4, (IMultiDisplayListener)localObject5);
            localObject3 = this.o00OoOoo;
            localObject3 = MultiDisplayManager.OooOO0O((MultiDisplayManager)localObject3);
            localObject4 = this.o00OoOoo;
            localObject4 = MultiDisplayManager.OooO0oO((MultiDisplayManager)localObject4);
            ((MultiDisplayObservable)localObject3).OooO0O0((IMultiDisplayService)localObject4);
            localObject3 = this.o00OoOoo;
            localObject3 = MultiDisplayManager.OooOO0o((MultiDisplayManager)localObject3);
            localObject4 = this.o00OoOoo;
            localObject4 = MultiDisplayManager.OooO0oO((MultiDisplayManager)localObject4);
            ((MultiDisplayObservable)localObject3).OooO0O0((IMultiDisplayService)localObject4);
            localObject3 = this.o00OoOoo;
            localObject3 = ((MultiDisplayManager)localObject3).OooO00o;
            boolean bool3 = false;
            localObject4 = null;
            localInterruptedException.linkToDeath((IBinder.DeathRecipient)localObject3, 0);
            Object localObject2 = this.o00OoOoo;
            localObject2 = MultiDisplayManager.OooOOOO((MultiDisplayManager)localObject2);
            localObject2 = ((ArrayMap)localObject2).entrySet();
            localObject2 = ((Set)localObject2).iterator();
            bool2 = ((Iterator)localObject2).hasNext();
            Object localObject6;
            if (bool2)
            {
              localObject3 = ((Iterator)localObject2).next();
              localObject3 = (Map.Entry)localObject3;
              localObject4 = this.o00OoOoo;
              localObject5 = ((Map.Entry)localObject3).getKey();
              localObject5 = (String)localObject5;
              localObject6 = ((Map.Entry)localObject3).getValue();
              localObject6 = (Boolean)localObject6;
              bool3 = MultiDisplayManager.OooO0OO((MultiDisplayManager)localObject4, (String)localObject5, (Boolean)localObject6);
              if (bool3)
              {
                ((Iterator)localObject2).remove();
              }
              else
              {
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                localObject4 = "794A5D4F7F5B5D615C648164585C5C5E5C50896963686D63676E7087718679696E707B7E3C837D767C2B";
                localObject4 = m54207b69.F54207b69_11((String)localObject4);
                ((StringBuilder)localObject2).append((String)localObject4);
                ((StringBuilder)localObject2).append(localObject3);
              }
            }
            localObject2 = this.o00OoOoo;
            localObject2 = MultiDisplayManager.OooO0Oo((MultiDisplayManager)localObject2);
            localObject2 = ((ArrayMap)localObject2).keySet();
            localObject2 = ((Set)localObject2).iterator();
            for (;;)
            {
              bool2 = ((Iterator)localObject2).hasNext();
              if (!bool2) {
                break;
              }
              localObject3 = ((Iterator)localObject2).next();
              localObject3 = (String)localObject3;
              localObject4 = MultiDisplayManager.OooOOOO;
              bool3 = ((Boolean)localObject4).booleanValue();
              if (bool3)
              {
                localObject4 = new java/lang/StringBuilder;
                ((StringBuilder)localObject4).<init>();
                localObject5 = "hm0C0A0B2F121E0A220C221E370F110E1B291514166B62";
                localObject5 = m54207b69.F54207b69_11((String)localObject5);
                ((StringBuilder)localObject4).append((String)localObject5);
                localObject5 = this.o00OoOoo;
                localObject5 = MultiDisplayManager.OooO0O0((MultiDisplayManager)localObject5);
                ((StringBuilder)localObject4).append((String)localObject5);
                localObject5 = "/";
                ((StringBuilder)localObject4).append((String)localObject5);
                ((StringBuilder)localObject4).append((String)localObject3);
              }
              localObject4 = this.o00OoOoo;
              localObject4 = MultiDisplayManager.OooO0oO((MultiDisplayManager)localObject4);
              localObject5 = this.o00OoOoo;
              localObject5 = MultiDisplayManager.OooOOO((MultiDisplayManager)localObject5);
              localObject6 = this.o00OoOoo;
              localObject6 = MultiDisplayManager.OooO0O0((MultiDisplayManager)localObject6);
              ((IMultiDisplayService)localObject4).o000Oo0O((IMultiDisplayListener)localObject5, (String)localObject6, (String)localObject3);
            }
          }
          catch (Exception localException)
          {
            localException.printStackTrace();
            MultiDisplayManager.OooOO0(this.o00OoOoo, true);
            MultiDisplayManager localMultiDisplayManager = this.o00OoOoo;
            Object localObject3 = MultiDisplayManager.OooO0O0(localMultiDisplayManager);
            boolean bool2 = localMultiDisplayManager.OooOOoo((String)localObject3);
            MultiDisplayManager.OooO0o0(localMultiDisplayManager, bool2);
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.multidisplay.MultiDisplayManager.3
 * JD-Core Version:    0.7.0.1
 */