package com.qinggan.navi;

import com.qinggan.util.Log;
import java.util.ArrayList;
import m54207b69;

class NavPresentation$2
  implements Runnable
{
  public NavPresentation$2(NavPresentation paramNavPresentation) {}
  
  public void run()
  {
    synchronized ()
    {
      Object localObject1 = NavPresentation.OooO0O0();
      if (localObject1 != null)
      {
        localObject1 = NavPresentation.OooO0O0();
        int i = ((ArrayList)localObject1).size();
        if (i > 0)
        {
          long l;
          for (;;)
          {
            localObject1 = this.o00OoOoo;
            localObject1 = NavPresentation.OooO0OO((NavPresentation)localObject1);
            l = 50;
            if (localObject1 != null) {
              break;
            }
            try
            {
              Thread.sleep(l);
            }
            catch (InterruptedException localInterruptedException1)
            {
              localInterruptedException1.printStackTrace();
            }
          }
          i = 1;
          NavPresentation.OooO0o(i);
          for (;;)
          {
            Object localObject2 = NavPresentation.OooO0O0();
            boolean bool1 = ((ArrayList)localObject2).isEmpty();
            if (bool1) {
              break;
            }
            localObject2 = NavPresentation.OooO0O0();
            ((ArrayList)localObject2).size();
            localObject2 = NavPresentation.OooO0O0();
            boolean bool2 = false;
            Object localObject4 = null;
            localObject2 = ((ArrayList)localObject2).remove(0);
            localObject2 = (NavPresentation.OnInitListener)localObject2;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            String str = "<0624660615557625C1865634E50626C64521E";
            str = m54207b69.F54207b69_11(str);
            ((StringBuilder)localObject4).append(str);
            ((StringBuilder)localObject4).append(localObject2);
            str = "Or3C140625041C071E240F1D11272A2A";
            str = m54207b69.F54207b69_11(str);
            localObject4 = ((StringBuilder)localObject4).toString();
            Log.OooO00o(str, (String)localObject4);
            if (localObject2 != null)
            {
              bool2 = NavPresentation.OooO0o0();
              ((NavPresentation.OnInitListener)localObject2).OooO00o(bool2);
            }
            try
            {
              Thread.sleep(l);
            }
            catch (InterruptedException localInterruptedException2)
            {
              localInterruptedException2.printStackTrace();
            }
          }
        }
      }
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.NavPresentation.2
 * JD-Core Version:    0.7.0.1
 */