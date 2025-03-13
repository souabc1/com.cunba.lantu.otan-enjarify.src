package com.qinggan.ota;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qinggan.common.OnInitListener;
import com.qinggan.util.Log;
import m54207b69;

class OTAManager$3
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO00o;
    paramIBinder = IOTAService.Stub.o0Oo0o0O(paramIBinder);
    OTAManager.OooO0o(paramComponentName, paramIBinder);
    paramComponentName = this.OooO00o;
    boolean bool = true;
    OTAManager.OooO0Oo(paramComponentName, bool);
    paramComponentName = m54207b69.F54207b69_11("i07F6573805563575E5D4B");
    String str = m54207b69.F54207b69_11("Vz15152B220C11192027421F1F202C271D2F2F6466");
    Log.OooO00o(paramComponentName, str);
    OTAManager.OooO0oO(this.OooO00o);
    paramComponentName = OTAManager.OooO0o0(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = OTAManager.OooO0o0(this.OooO00o);
      paramComponentName.OooO00o(bool);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    OTAManager.OooO0o(this.OooO00o, null);
    OTAManager.OooO0Oo(this.OooO00o, false);
    paramComponentName = m54207b69.F54207b69_11("i07F6573805563575E5D4B");
    String str = m54207b69.F54207b69_11("//40427E4D615E4C5352745067584D4F505A5D6D5D5F1C1C");
    Log.OooO00o(paramComponentName, str);
    paramComponentName = OTAManager.OooO0o0(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = OTAManager.OooO0o0(this.OooO00o);
      paramComponentName.OooO00o(false);
    }
    OTAManager.OooO0oo(this.OooO00o);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.ota.OTAManager.3
 * JD-Core Version:    0.7.0.1
 */