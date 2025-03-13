package com.qinggan.turnbyturn;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qinggan.util.Log;
import m54207b69;

class TurnByTurnInfo$1
  implements ServiceConnection
{
  public TurnByTurnInfo$1(TurnByTurnInfo paramTurnByTurnInfo) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = TurnByTurnInfo.OooO00o(this.OooO00o);
    Object localObject = "Bp24060421360E2A0C0A274329222C";
    try
    {
      localObject = m54207b69.F54207b69_11((String)localObject);
      String str = "o26648425F74506C4E48658567606A6F6650556D646B27737379705A5F776E75907D7D7E7A756B7D7D";
      str = m54207b69.F54207b69_11(str);
      Log.OooO0OO((String)localObject, str);
      localObject = this.OooO00o;
      paramIBinder = ITurnByTurnInfo.Stub.o0Oo0o0O(paramIBinder);
      TurnByTurnInfo.OooO0O0((TurnByTurnInfo)localObject, paramIBinder);
      paramIBinder = this.OooO00o;
      boolean bool = true;
      TurnByTurnInfo.OooO0OO(paramIBinder, bool);
      paramComponentName = TurnByTurnInfo.OooO0Oo(this.OooO00o);
      if (paramComponentName != null)
      {
        paramComponentName = this.OooO00o;
        paramIBinder = TurnByTurnInfo.OooO0Oo(paramComponentName);
        paramComponentName.OooO0oo(paramIBinder);
      }
      paramComponentName = TurnByTurnInfo.OooO0o0(this.OooO00o);
      if (paramComponentName != null)
      {
        TurnByTurnInfo.OooO0o0(this.OooO00o).OooO00o(0);
        paramComponentName = this.OooO00o;
        paramIBinder = null;
        TurnByTurnInfo.OooO0o(paramComponentName, null);
      }
      return;
    }
    finally {}
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = TurnByTurnInfo.OooO00o(this.OooO00o);
    Object localObject1 = "Bp24060421360E2A0C0A274329222C";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      String str = "^E1131392E0B4117373F3416362F37242F47443E39347A40422E39514E48433E204C57484D4F50464D59494B";
      str = m54207b69.F54207b69_11(str);
      Log.OooO0OO((String)localObject1, str);
      localObject1 = this.OooO00o;
      localObject1 = TurnByTurnInfo.OooO0o0((TurnByTurnInfo)localObject1);
      if (localObject1 != null)
      {
        localObject1 = this.OooO00o;
        localObject1 = TurnByTurnInfo.OooO0o0((TurnByTurnInfo)localObject1);
        int i = -1;
        ((TurnByTurnInfo.OnInitListener)localObject1).OooO00o(i);
        localObject1 = this.OooO00o;
        i = 0;
        str = null;
        TurnByTurnInfo.OooO0o((TurnByTurnInfo)localObject1, null);
      }
      return;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.turnbyturn.TurnByTurnInfo.1
 * JD-Core Version:    0.7.0.1
 */