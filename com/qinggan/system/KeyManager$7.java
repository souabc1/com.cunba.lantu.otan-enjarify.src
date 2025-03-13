package com.qinggan.system;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

class KeyManager$7
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO00o;
    paramIBinder = IKeyManagerService.Stub.o0Oo0o0O(paramIBinder);
    KeyManager.OooO0oO(paramComponentName, paramIBinder);
    paramComponentName = this.OooO00o;
    boolean bool = true;
    KeyManager.OooO0Oo(paramComponentName, bool);
    paramComponentName = KeyManager.OooO0o(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = KeyManager.OooO0o(this.OooO00o);
      paramComponentName.OooO00o(bool);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    KeyManager.OooO0oO(this.OooO00o, null);
    KeyManager.OooO0Oo(this.OooO00o, false);
    paramComponentName = KeyManager.OooO0o(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = KeyManager.OooO0o(this.OooO00o);
      paramComponentName.OooO00o(false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.KeyManager.7
 * JD-Core Version:    0.7.0.1
 */