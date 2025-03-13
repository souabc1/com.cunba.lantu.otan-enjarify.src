package com.qinggan.system;

import java.util.HashMap;

class KeyManager$6
  implements Runnable
{
  public KeyManager$6(KeyManager paramKeyManager) {}
  
  public void run()
  {
    Object localObject1 = KeyManager.OooO0oo(this.o00OoOoo);
    if (localObject1 != null)
    {
      localObject1 = KeyManager.OooO0oo(this.o00OoOoo);
      int i = ((HashMap)localObject1).size();
      if (i > 0)
      {
        localObject1 = KeyManager.OooO0oo(this.o00OoOoo);
        Object localObject2 = KeyManager.OooO(this.o00OoOoo);
        localObject1 = (KeyManager.OnInitListener)((HashMap)localObject1).get(localObject2);
        long l = 30;
        try
        {
          Thread.sleep(l);
          for (;;)
          {
            localObject2 = KeyManager.OooO0o0();
            if (localObject2 != null) {
              break;
            }
            l = 50;
            Thread.sleep(l);
          }
          KeyManager localKeyManager;
          boolean bool;
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
          if (localObject1 != null)
          {
            localKeyManager = this.o00OoOoo;
            bool = KeyManager.OooO0O0(localKeyManager);
            ((KeyManager.OnInitListener)localObject1).OooO00o(bool);
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.KeyManager.6
 * JD-Core Version:    0.7.0.1
 */