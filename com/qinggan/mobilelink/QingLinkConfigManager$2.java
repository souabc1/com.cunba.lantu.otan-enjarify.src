package com.qinggan.mobilelink;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.qinggan.util.Log;
import m54207b69;

class QingLinkConfigManager$2
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = m54207b69.F54207b69_11("+y2811192139151D19421F212A1C2B42272729302F1F");
    String str = m54207b69.F54207b69_11("9d0B0B39041A17130E09301515160E151F1111");
    Log.OooO00o(paramComponentName, str);
    paramComponentName = this.OooO00o;
    paramIBinder = IQingLinkConfigManager.Stub.o0Oo0o0O(paramIBinder);
    QingLinkConfigManager.OooO0O0(paramComponentName, paramIBinder);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = m54207b69.F54207b69_11("+y2811192139151D19421F212A1C2B42272729302F1F");
    String str = m54207b69.F54207b69_11("|]3234103B33303A4540223E394A3F4142484F3B4B4D");
    Log.OooO00o(paramComponentName, str);
    QingLinkConfigManager.OooO0O0(this.OooO00o, null);
    QingLinkConfigManager.OooO0Oo(this.OooO00o).sendEmptyMessageDelayed(1001, 5000L);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.mobilelink.QingLinkConfigManager.2
 * JD-Core Version:    0.7.0.1
 */