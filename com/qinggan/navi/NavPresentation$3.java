package com.qinggan.navi;

import com.qinggan.os.ServiceManager;
import com.qinggan.util.Log;
import java.util.ArrayList;
import m54207b69;

class NavPresentation$3
  implements Runnable
{
  public void run()
  {
    ArrayList localArrayList = NavPresentation.OooO0O0();
    int i = 100;
    try
    {
      long l;
      for (;;)
      {
        boolean bool1 = NavPresentation.OooO0o0();
        if (bool1) {
          break label291;
        }
        Object localObject1 = "Xb13064E090F1618150B24471A0F1911141721";
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        localObject1 = ServiceManager.OooO0O0((String)localObject1);
        if (localObject1 != null) {
          break;
        }
        j = i % 1000;
        if (j == 0)
        {
          localObject1 = "Or3C140625041C071E240F1D11272A2A";
          localObject1 = m54207b69.F54207b69_11((String)localObject1);
          localObject3 = ":g04070B4A0D0D194E080B1D52200F23201E15145A2A155F1A262D3126223B5629262A2823263A";
          localObject3 = m54207b69.F54207b69_11((String)localObject3);
          Log.OooO0O0((String)localObject1, (String)localObject3);
        }
        l = 500L;
        try
        {
          Thread.sleep(l);
          i += 100;
        }
        catch (InterruptedException localInterruptedException1)
        {
          localInterruptedException1.printStackTrace();
        }
      }
      Object localObject3 = this.o00OoOoo;
      Object localObject2 = IDisplayManagerService.Stub.o0Oo0o0O(localInterruptedException1);
      NavPresentation.OooO0Oo((NavPresentation)localObject3, (IDisplayManagerService)localObject2);
      int j = 1;
      NavPresentation.OooO0o(j);
      for (;;)
      {
        localObject2 = NavPresentation.OooO0O0();
        boolean bool2 = ((ArrayList)localObject2).isEmpty();
        if (bool2) {
          break;
        }
        localObject2 = NavPresentation.OooO0O0();
        ((ArrayList)localObject2).size();
        localObject2 = NavPresentation.OooO0O0();
        boolean bool3 = false;
        localObject3 = null;
        localObject2 = ((ArrayList)localObject2).remove(0);
        localObject2 = (NavPresentation.OnInitListener)localObject2;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = "UK26052B422E272B162A414532363F1439353B3E414D1E383C47475386433F565E4E46505C9A";
        str = m54207b69.F54207b69_11(str);
        ((StringBuilder)localObject3).append(str);
        ((StringBuilder)localObject3).append(localObject2);
        str = "Or3C140625041C071E240F1D11272A2A";
        str = m54207b69.F54207b69_11(str);
        localObject3 = ((StringBuilder)localObject3).toString();
        Log.OooO00o(str, (String)localObject3);
        if (localObject2 != null)
        {
          bool3 = NavPresentation.OooO0o0();
          ((NavPresentation.OnInitListener)localObject2).OooO00o(bool3);
        }
        l = 50;
        try
        {
          Thread.sleep(l);
        }
        catch (InterruptedException localInterruptedException2)
        {
          localInterruptedException2.printStackTrace();
        }
      }
      label291:
      return;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.NavPresentation.3
 * JD-Core Version:    0.7.0.1
 */