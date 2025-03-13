package com.qinggan.wechat;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.qinggan.common.OnInitListener;
import m54207b69;

class WeChatManager$2
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO00o;
    paramIBinder = IWeChatService.Stub.o0Oo0o0O(paramIBinder);
    WeChatManager.OooO0o(paramComponentName, paramIBinder);
    try
    {
      paramComponentName = new java/lang/StringBuilder;
      paramComponentName.<init>();
      paramIBinder = "x-406F44465D4D5B600B53526489595C555C5B5A7660555E1C1C262A28";
      paramIBinder = m54207b69.F54207b69_11(paramIBinder);
      paramComponentName.append(paramIBinder);
      paramIBinder = this.OooO00o;
      paramIBinder = WeChatManager.OooO0oo(paramIBinder);
      paramIBinder = paramIBinder.getPackageName();
      paramComponentName.append(paramIBinder);
      paramComponentName = "Jg04090C4C1A130F07080F135412242558201316221A28";
      paramComponentName = m54207b69.F54207b69_11(paramComponentName);
      paramIBinder = this.OooO00o;
      paramIBinder = WeChatManager.OooO0oo(paramIBinder);
      paramIBinder = paramIBinder.getPackageName();
      boolean bool1 = paramComponentName.equals(paramIBinder);
      if (bool1)
      {
        paramComponentName = this.OooO00o;
        paramComponentName = WeChatManager.OooO0o0(paramComponentName);
        paramIBinder = this.OooO00o;
        paramIBinder = WeChatManager.OooO(paramIBinder);
        paramComponentName.o00O00OO(paramIBinder);
      }
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
    paramComponentName = WeChatManager.OooO0oO(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = WeChatManager.OooO0oO(this.OooO00o);
      boolean bool2 = true;
      paramComponentName.OooO00o(bool2);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    WeChatManager.OooO0o(this.OooO00o, null);
    paramComponentName = WeChatManager.OooO0oO(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = WeChatManager.OooO0oO(this.OooO00o);
      paramComponentName.OooO00o(false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.WeChatManager.2
 * JD-Core Version:    0.7.0.1
 */