package com.qinggan.app.launcher;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.qinggan.common.OnInitListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import m54207b69;

public class PluginMsgProxyImpl
  implements ServiceConnection
{
  public static Object OooOO0;
  public Map OooO;
  public ExecutorService OooO00o;
  public Map OooO0O0;
  public boolean OooO0OO;
  public Context OooO0Oo;
  public IAppClient OooO0o;
  public HashMap OooO0o0;
  public IMsgCallback OooO0oO;
  public List OooO0oo;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooOO0 = localObject;
  }
  
  public final void OooO00o()
  {
    Intent localIntent = new android/content/Intent;
    Object localObject = m54207b69.F54207b69_11("D(4B4847095D464C5657525011675A686D515C5F198D848E5B75687B61976A787D616C6F");
    localIntent.<init>((String)localObject);
    localObject = m54207b69.F54207b69_11("J)5D515B4F");
    String str = "";
    localIntent.putExtra((String)localObject, str);
    localObject = m54207b69.F54207b69_11("V{181518580E171B2324231F6026181964272B20282C283420");
    localIntent.setPackage((String)localObject);
    this.OooO0Oo.startService(localIntent);
    localObject = this.OooO0Oo;
    int i = 1;
    boolean bool = ((Context)localObject).bindService(localIntent, this, i);
    if (!bool)
    {
      bool = false;
      localIntent = null;
      this.OooO0o = null;
    }
  }
  
  public final void OooO0O0(boolean paramBoolean)
  {
    Object localObject1 = this.OooO0o0;
    if (localObject1 != null)
    {
      int i = ((HashMap)localObject1).size();
      if (i > 0)
      {
        localObject1 = this.OooO0o0.keySet().iterator();
        for (;;)
        {
          boolean bool = ((Iterator)localObject1).hasNext();
          if (!bool) {
            break;
          }
          Object localObject2 = (String)((Iterator)localObject1).next();
          HashMap localHashMap = this.OooO0o0;
          localObject2 = (OnInitListener)localHashMap.get(localObject2);
          ((OnInitListener)localObject2).OooO00o(paramBoolean);
        }
      }
    }
  }
  
  public final void OooO0OO()
  {
    ??? = this.OooO0o;
    if (??? == null) {
      return;
    }
    synchronized (this.OooO0oo)
    {
      Object localObject2 = this.OooO0oo;
      localObject2 = ((List)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        Object localObject4 = ((Iterator)localObject2).next();
        localObject4 = (QGMessage)localObject4;
        try
        {
          IAppClient localIAppClient = this.OooO0o;
          localIAppClient.o0Oo00oo((QGMessage)localObject4);
        }
        catch (RemoteException localRemoteException)
        {
          localRemoteException.printStackTrace();
        }
      }
      localObject2 = this.OooO0oo;
      ((List)localObject2).clear();
      return;
    }
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = this.OooO0o;
    if (paramComponentName == null)
    {
      paramComponentName = IAppClient.Stub.o0Oo0o0O(paramIBinder);
      this.OooO0o = paramComponentName;
      bool = true;
      this.OooO0OO = bool;
    }
    try
    {
      paramComponentName = this.OooO0o;
      paramIBinder = this.OooO0oO;
      paramComponentName.o0O00O0o(paramIBinder);
    }
    catch (Exception paramComponentName)
    {
      paramComponentName.printStackTrace();
    }
    boolean bool = this.OooO0OO;
    OooO0O0(bool);
    OooO0OO();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = this.OooO0o;
    if (paramComponentName != null)
    {
      this.OooO0o = null;
      bool = false;
      paramComponentName = null;
      this.OooO0OO = false;
    }
    boolean bool = this.OooO0OO;
    OooO0O0(bool);
    OooO00o();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.app.launcher.PluginMsgProxyImpl
 * JD-Core Version:    0.7.0.1
 */