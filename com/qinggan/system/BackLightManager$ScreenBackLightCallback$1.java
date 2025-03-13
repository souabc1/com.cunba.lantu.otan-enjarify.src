package com.qinggan.system;

import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class BackLightManager$ScreenBackLightCallback$1
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    synchronized (BackLightManager.ScreenBackLightCallback.o0Oo0o0o(this.OooO00o))
    {
      Object localObject2 = this.OooO00o;
      localObject2 = BackLightManager.ScreenBackLightCallback.o0Oo0oO0((BackLightManager.ScreenBackLightCallback)localObject2);
      localObject2 = ((HashMap)localObject2).keySet();
      localObject2 = ((Set)localObject2).iterator();
      int i = paramMessage.what;
      int j = 1;
      boolean bool1;
      Object localObject3;
      Object localObject4;
      BackLightManager.ScreenBackLightCallback localScreenBackLightCallback;
      int n;
      if (i != j)
      {
        j = 2;
        if (i == j) {
          for (;;)
          {
            bool1 = ((Iterator)localObject2).hasNext();
            if (!bool1) {
              break;
            }
            localObject3 = this.OooO00o;
            localObject3 = BackLightManager.ScreenBackLightCallback.o0Oo0oO0((BackLightManager.ScreenBackLightCallback)localObject3);
            localObject4 = ((Iterator)localObject2).next();
            localObject3 = ((HashMap)localObject3).get(localObject4);
            localObject3 = (BackLightManager.OnBackLightListener)localObject3;
            boolean bool2 = localObject3 instanceof BackLightManager.OnScreenBackLightListener;
            if (bool2)
            {
              localObject4 = localObject3;
              localObject4 = (BackLightManager.OnScreenBackLightListener)localObject3;
              localScreenBackLightCallback = this.OooO00o;
              n = BackLightManager.ScreenBackLightCallback.o0Oo0oO(localScreenBackLightCallback);
              BackLightManager.OnScreenBackLightListener.OooO00o((BackLightManager.OnScreenBackLightListener)localObject4, n);
            }
            int k = paramMessage.arg1;
            n = paramMessage.arg2;
            ((BackLightManager.OnBackLightListener)localObject3).Oooo0oo(k, n);
          }
        }
      }
      else
      {
        for (;;)
        {
          bool1 = ((Iterator)localObject2).hasNext();
          if (!bool1) {
            break;
          }
          localObject3 = this.OooO00o;
          localObject3 = BackLightManager.ScreenBackLightCallback.o0Oo0oO0((BackLightManager.ScreenBackLightCallback)localObject3);
          localObject4 = ((Iterator)localObject2).next();
          localObject3 = ((HashMap)localObject3).get(localObject4);
          localObject3 = (BackLightManager.OnBackLightListener)localObject3;
          boolean bool3 = localObject3 instanceof BackLightManager.OnScreenBackLightListener;
          if (bool3)
          {
            localObject4 = localObject3;
            localObject4 = (BackLightManager.OnScreenBackLightListener)localObject3;
            localScreenBackLightCallback = this.OooO00o;
            n = BackLightManager.ScreenBackLightCallback.o0Oo0oO(localScreenBackLightCallback);
            BackLightManager.OnScreenBackLightListener.OooO00o((BackLightManager.OnScreenBackLightListener)localObject4, n);
          }
          int m = paramMessage.arg1;
          n = paramMessage.arg2;
          ((BackLightManager.OnBackLightListener)localObject3).OoooooO(m, n);
        }
      }
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.BackLightManager.ScreenBackLightCallback.1
 * JD-Core Version:    0.7.0.1
 */