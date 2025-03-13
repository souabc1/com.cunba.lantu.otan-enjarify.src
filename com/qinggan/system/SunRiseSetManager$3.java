package com.qinggan.system;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qinggan.common.OnInitListener;

class SunRiseSetManager$3
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO00o;
    paramIBinder = ISunRiseSetService.Stub.o0Oo0o0O(paramIBinder);
    SunRiseSetManager.OooO0OO(paramComponentName, paramIBinder);
    paramComponentName = SunRiseSetManager.OooO0Oo(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = SunRiseSetManager.OooO0Oo(this.OooO00o);
      boolean bool = true;
      paramComponentName.OooO00o(bool);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    SunRiseSetManager.OooO0OO(this.OooO00o, null);
    paramComponentName = SunRiseSetManager.OooO0Oo(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = SunRiseSetManager.OooO0Oo(this.OooO00o);
      paramComponentName.OooO00o(false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.SunRiseSetManager.3
 * JD-Core Version:    0.7.0.1
 */