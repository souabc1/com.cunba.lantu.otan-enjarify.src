package com.qinggan.system;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qinggan.common.OnInitListener;
import m54207b69;

class LastMemory$1
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    LastMemory.OooO00o();
    paramComponentName = new java/lang/StringBuilder;
    paramComponentName.<init>();
    String str = m54207b69.F54207b69_11("[@0C223537112A33363A421D303E43373235714141273A484D413C3F1E4B4B4C44435547479E85");
    paramComponentName.append(str);
    paramComponentName.append(paramIBinder);
    paramComponentName = this.OooO00o;
    boolean bool;
    if (paramIBinder == null)
    {
      paramComponentName = LastMemory.OooO0OO(paramComponentName);
      if (paramComponentName != null)
      {
        paramComponentName = LastMemory.OooO0OO(this.OooO00o);
        bool = false;
        paramIBinder = null;
        paramComponentName.OooO00o(false);
      }
      return;
    }
    paramIBinder = ILastMemoryService.Stub.o0Oo0o0O(paramIBinder);
    LastMemory.OooO0O0(paramComponentName, paramIBinder);
    paramComponentName = LastMemory.OooO0OO(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = LastMemory.OooO0OO(this.OooO00o);
      bool = true;
      paramComponentName.OooO00o(bool);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    LastMemory.OooO00o();
    LastMemory.OooO0O0(this.OooO00o, null);
    paramComponentName = LastMemory.OooO0OO(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = LastMemory.OooO0OO(this.OooO00o);
      paramComponentName.OooO00o(false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.LastMemory.1
 * JD-Core Version:    0.7.0.1
 */