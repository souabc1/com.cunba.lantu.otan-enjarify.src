package com.qinggan.carplay;

import android.content.Context;
import java.util.HashMap;

class CarPlayManager$1
  implements Runnable
{
  public void run()
  {
    Object localObject = CarPlayManager.OooO00o(this.o00OoOoo);
    if (localObject != null)
    {
      localObject = CarPlayManager.OooO00o(this.o00OoOoo);
      int i = ((HashMap)localObject).size();
      if (i > 0)
      {
        localObject = CarPlayManager.OooO00o(this.o00OoOoo);
        Context localContext = CarPlayManager.OooO0O0(this.o00OoOoo);
        localObject = (CarPlayManager.CarPlayManagerCallback)((HashMap)localObject).get(localContext);
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
          CarPlayManager localCarPlayManager = this.o00OoOoo;
          boolean bool = localCarPlayManager.OooO0OO;
          ((CarPlayManager.CarPlayManagerCallback)localObject).OooO00o(bool);
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.carplay.CarPlayManager.1
 * JD-Core Version:    0.7.0.1
 */