package com.qinggan.iap2;

import android.content.Context;
import java.util.HashMap;

class IAP2Manager$1
  implements Runnable
{
  public void run()
  {
    Object localObject = IAP2Manager.OooO00o(this.o00OoOoo);
    if (localObject != null)
    {
      localObject = IAP2Manager.OooO00o(this.o00OoOoo);
      int i = ((HashMap)localObject).size();
      if (i > 0)
      {
        localObject = IAP2Manager.OooO00o(this.o00OoOoo);
        Context localContext = IAP2Manager.OooO0O0(this.o00OoOoo);
        localObject = (IAP2Manager.IAP2ManagerCallback)((HashMap)localObject).get(localContext);
        if (localObject != null)
        {
          long l = 100;
          try
          {
            Thread.sleep(l);
          }
          catch (InterruptedException localInterruptedException)
          {
            localInterruptedException.printStackTrace();
          }
          IAP2Manager localIAP2Manager = this.o00OoOoo;
          boolean bool = IAP2Manager.OooO0OO(localIAP2Manager);
          ((IAP2Manager.IAP2ManagerCallback)localObject).OooO00o(bool);
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.iap2.IAP2Manager.1
 * JD-Core Version:    0.7.0.1
 */