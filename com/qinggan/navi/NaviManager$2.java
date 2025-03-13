package com.qinggan.navi;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.qinggan.common.OnInitListener;
import m54207b69;

class NaviManager$2
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO00o;
    paramIBinder = IAutoNaviService.Stub.o0Oo0o0O(paramIBinder);
    NaviManager.OooO0OO(paramComponentName, paramIBinder);
    try
    {
      paramComponentName = this.OooO00o;
      paramComponentName = NaviManager.OooO0O0(paramComponentName);
      paramIBinder = this.OooO00o;
      paramIBinder = NaviManager.OooO0o0(paramIBinder);
      paramComponentName.o0000oo(paramIBinder);
    }
    catch (RemoteException paramComponentName)
    {
      paramIBinder = new java/lang/StringBuilder;
      paramIBinder.<init>();
      String str = m54207b69.F54207b69_11("=&544443525957495B794C6F59535F73565A5B565A59621C5A765E5D716E6C67673C");
      paramIBinder.append(str);
      str = paramComponentName.getMessage();
      paramIBinder.append(str);
      paramComponentName.printStackTrace();
    }
    paramComponentName = NaviManager.OooO0Oo(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = NaviManager.OooO0Oo(this.OooO00o);
      paramIBinder = null;
      paramComponentName.OooO00o(false);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    NaviManager.OooO0OO(this.OooO00o, null);
    paramComponentName = NaviManager.OooO0Oo(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = NaviManager.OooO0Oo(this.OooO00o);
      paramComponentName.OooO00o(false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.NaviManager.2
 * JD-Core Version:    0.7.0.1
 */