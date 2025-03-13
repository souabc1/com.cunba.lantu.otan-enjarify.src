package com.qinggan.airtrip;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.lang.reflect.Proxy;

public abstract class QGServiceProxy
  implements ServiceConnection
{
  public boolean OooO00o;
  public IAirTripService OooO0O0;
  public QGServiceProxy.MyInvocationHandler OooO0OO;
  
  public Object getService()
  {
    Class localClass = (Class)((java.lang.reflect.ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    ClassLoader localClassLoader = getClass().getClassLoader();
    QGServiceProxy.MyInvocationHandler localMyInvocationHandler = this.OooO0OO;
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = localClass;
    return Proxy.newProxyInstance(localClassLoader, arrayOfClass, localMyInvocationHandler);
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO0O0;
    if (paramComponentName == null)
    {
      paramComponentName = IAirTripService.Stub.o0Oo0o0O(paramIBinder);
      this.OooO0O0 = paramComponentName;
      boolean bool = true;
      this.OooO00o = bool;
      paramIBinder = this.OooO0OO;
      paramIBinder.setSource(paramComponentName);
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = this.OooO0O0;
    if (paramComponentName != null)
    {
      this.OooO0O0 = null;
      paramComponentName = null;
      this.OooO00o = false;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.QGServiceProxy
 * JD-Core Version:    0.7.0.1
 */