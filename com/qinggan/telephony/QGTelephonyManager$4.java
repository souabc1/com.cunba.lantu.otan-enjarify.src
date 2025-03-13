package com.qinggan.telephony;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.qinggan.common.OnInitListener;

class QGTelephonyManager$4
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO00o;
    paramIBinder = IQGTelephonyService.Stub.o0Oo0o0O(paramIBinder);
    QGTelephonyManager.OooO0Oo(paramComponentName, paramIBinder);
    paramComponentName = QGTelephonyManager.OooO00o(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = QGTelephonyManager.OooO00o(this.OooO00o);
      boolean bool = true;
      paramComponentName.OooO00o(bool);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    QGTelephonyManager.OooO0Oo(this.OooO00o, null);
    paramComponentName = QGTelephonyManager.OooO00o(this.OooO00o);
    if (paramComponentName != null)
    {
      paramComponentName = QGTelephonyManager.OooO00o(this.OooO00o);
      paramComponentName.OooO00o(false);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.telephony.QGTelephonyManager.4
 * JD-Core Version:    0.7.0.1
 */