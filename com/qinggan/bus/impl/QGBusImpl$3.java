package com.qinggan.bus.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import com.qinggan.util.Log;
import m54207b69;

class QGBusImpl$3
  implements ServiceConnection
{
  public QGBusImpl$3(QGBusImpl paramQGBusImpl) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = m54207b69.F54207b69_11("P869807C504F765B4F5C");
    Object localObject = m54207b69.F54207b69_11("rL6F7071727371292927324845313C371E3333343C434D3F3F8488898A8B8C");
    Log.OooO00o(paramComponentName, (String)localObject);
    paramComponentName = this.OooO00o;
    localObject = new android/os/Messenger;
    ((Messenger)localObject).<init>(paramIBinder);
    QGBusImpl.OooO0o(paramComponentName, (Messenger)localObject);
    QGBusImpl.OooO0oO(this.OooO00o);
    QGBusImpl.OooO0oo(this.OooO00o);
    QGBusImpl.OooO(this.OooO00o);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = m54207b69.F54207b69_11("P869807C504F765B4F5C");
    String str = m54207b69.F54207b69_11("^91A1B1C1D1E1E5C5E7265555A5C676A8C605B6C696B6C727165757734363738393A");
    Log.OooO00o(paramComponentName, str);
    QGBusImpl.OooO0o(this.OooO00o, null);
    QGBusImpl.OooOO0(this.OooO00o, false);
    QGBusImpl.OooOO0O(this.OooO00o);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bus.impl.QGBusImpl.3
 * JD-Core Version:    0.7.0.1
 */