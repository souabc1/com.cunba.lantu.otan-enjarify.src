package com.qinggan.os;

import android.os.Bundle;
import java.util.ArrayList;
import m54207b69;

class UEventObserver$UEventThread
  extends Thread
{
  public ArrayList o00OoOoo;
  
  public void OooO00o(UEventObserver paramUEventObserver)
  {
    ArrayList localArrayList1 = this.o00OoOoo;
    int i = 1;
    for (;;)
    {
      int j = i;
      label12:
      ArrayList localArrayList2;
      int k;
      if (j != 0)
      {
        j = 0;
        localArrayList2 = null;
        k = 0;
      }
      try
      {
        for (;;)
        {
          Object localObject = this.o00OoOoo;
          int m = ((ArrayList)localObject).size();
          if (k >= m) {
            break label12;
          }
          localObject = this.o00OoOoo;
          int n = k + 1;
          localObject = ((ArrayList)localObject).get(n);
          if (localObject == paramUEventObserver)
          {
            localArrayList2 = this.o00OoOoo;
            localArrayList2.remove(n);
            localArrayList2 = this.o00OoOoo;
            localArrayList2.remove(k);
            break;
          }
          k += 2;
        }
        return;
      }
      finally {}
    }
  }
  
  public void run()
  {
    int i;
    try
    {
      UEventObserver localUEventObserver = this.o00Ooo00;
      i = UEventObserver.OooO0OO(localUEventObserver);
      i = UEventNative.native_setup(i);
      UEventObserver.OooO0O0(localUEventObserver, i);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    Object localObject1 = this.o00Ooo00;
    int j = UEventObserver.OooO00o((UEventObserver)localObject1);
    Object localObject3;
    if (j < 0)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = m54207b69.F54207b69_11("W477565C175E60461B634D5B65206E5F51616B52272929675D5E74602F6378757E71618D7574392F3B");
      ((StringBuilder)localObject1).append((String)localObject3);
      i = UEventObserver.OooO00o(this.o00Ooo00);
      ((StringBuilder)localObject1).append(i);
      return;
    }
    j = 256;
    localObject1 = new int[j];
    for (;;)
    {
      localObject3 = this.o00Ooo00;
      i = UEventObserver.OooO00o((UEventObserver)localObject3);
      i = UEventNative.next_event((int[])localObject1, i);
      if (i <= 0) {
        continue;
      }
      Bundle localBundle = BundleFormat.OooO00o((int[])localObject1);
      ArrayList localArrayList = this.o00OoOoo;
      int k = 0;
      try
      {
        for (;;)
        {
          Object localObject4 = this.o00OoOoo;
          int m = ((ArrayList)localObject4).size();
          if (k >= m) {
            break;
          }
          localObject4 = this.o00OoOoo;
          int n = k + 1;
          localObject4 = ((ArrayList)localObject4).get(n);
          localObject4 = (UEventObserver)localObject4;
          ((UEventObserver)localObject4).OooO0Oo(i, localBundle);
          k += 2;
        }
      }
      finally {}
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.UEventObserver.UEventThread
 * JD-Core Version:    0.7.0.1
 */