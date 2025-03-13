package com.qinggan.system;

import com.qinggan.common.OnInitListener;
import java.util.List;

class BackLightManager$3
  implements Runnable
{
  public void run()
  {
    Object localObject = this.o00OoOoo;
    boolean bool1 = true;
    ((OnInitListener)localObject).OooO00o(bool1);
    localObject = BackLightManager.OooO0o().OooO00o;
    OnInitListener localOnInitListener = this.o00OoOoo;
    boolean bool2 = ((List)localObject).contains(localOnInitListener);
    if (bool2)
    {
      localObject = BackLightManager.OooO0o().OooO00o;
      localOnInitListener = this.o00OoOoo;
      ((List)localObject).remove(localOnInitListener);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.BackLightManager.3
 * JD-Core Version:    0.7.0.1
 */