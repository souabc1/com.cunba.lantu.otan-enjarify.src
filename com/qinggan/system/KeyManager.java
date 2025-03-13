package com.qinggan.system;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.qinggan.os.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m54207b69;

public class KeyManager
{
  public static String OooOOOO = "com.qinggan.keymanager.action.KEY_MANAGER_SERVICE";
  public static String OooOOOo = "com.qinggan.keymanager.service";
  public static Object OooOOo;
  public static KeyManager OooOOo0;
  public final Object OooO;
  public ServiceConnection OooO00o;
  public IBinder.DeathRecipient OooO0O0;
  public final ArrayList OooO0OO;
  public ScheduledExecutorService OooO0Oo;
  public Context OooO0o;
  public HashMap OooO0o0;
  public KeyManager.OnInitListener OooO0oO;
  public boolean OooO0oo;
  public final HashMap OooOO0;
  public final IKeyManagerCallback OooOO0O;
  public IKeyManagerService OooOO0o;
  public Runnable OooOOO;
  public boolean OooOOO0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooOOo = localObject;
  }
  
  private List getKeyEventListenerByType(int paramInt)
  {
    int i = 1;
    String str1;
    if (paramInt == i) {
      str1 = m54207b69.F54207b69_11("ml3326243B2D4335304441");
    } else {
      str1 = m54207b69.F54207b69_11("Dv29393B273F3C40");
    }
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    Iterator localIterator = this.OooOO0.entrySet().iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject = (Map.Entry)localIterator.next();
      String str2 = (String)((Map.Entry)localObject).getKey();
      boolean bool2 = str2.contains(str1);
      if (bool2)
      {
        localObject = (KeyManager.OnKeyEventListener)((Map.Entry)localObject).getValue();
        localLinkedList.add(localObject);
      }
    }
    return localLinkedList;
  }
  
  public final void OooOOOo()
  {
    Object localObject1 = this.OooOO0o;
    if (localObject1 != null) {
      return;
    }
    localObject1 = ServiceManager.OooO0O0(m54207b69.F54207b69_11("/[2A3D773342270A3D423E44474A36"));
    int i = 1;
    if (localObject1 == null)
    {
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = OooOOOO;
      ((Intent)localObject1).setAction((String)localObject2);
      localObject2 = OooOOOo;
      ((Intent)localObject1).setPackage((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("Tm0C040B2206090F4A0C0C23130F26511D1C2A1A1D16342A5A54434043503D4A424C4B4A62");
      ((Intent)localObject1).addCategory((String)localObject2);
      localObject2 = this.OooO0o;
      ServiceConnection localServiceConnection = this.OooO00o;
      ((Context)localObject2).bindService((Intent)localObject1, localServiceConnection, i);
      localObject1 = this.OooO0Oo;
      localObject3 = this.OooOOO;
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      ((ScheduledExecutorService)localObject1).schedule((Runnable)localObject3, 50, localTimeUnit);
      return;
    }
    Object localObject2 = IKeyManagerService.Stub.o0Oo0o0O((IBinder)localObject1);
    this.OooOO0o = ((IKeyManagerService)localObject2);
    this.OooO0oo = i;
    Object localObject3 = this.OooO0Oo;
    localObject2 = new com/qinggan/system/KeyManager$6;
    ((KeyManager.6)localObject2).<init>(this);
    ((Executor)localObject3).execute((Runnable)localObject2);
    try
    {
      localObject3 = this.OooO0O0;
      localObject2 = null;
      ((IBinder)localObject1).linkToDeath((IBinder.DeathRecipient)localObject3, 0);
    }
    catch (RemoteException localRemoteException)
    {
      localRemoteException.printStackTrace();
    }
  }
  
  public final String OooOOo0(String paramString, int paramInt)
  {
    int i = 1;
    String str;
    if (paramInt == i) {
      str = m54207b69.F54207b69_11(")0797F667866787B676C");
    } else {
      str = m54207b69.F54207b69_11("Ic2D2D33312634");
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(paramString);
    localStringBuilder.append("_");
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public void finalize()
  {
    Object localObject1 = this.OooOO0o;
    Object localObject2 = this.OooOO0O;
    String str2 = this.OooO0o.getPackageName();
    ((IKeyManagerService)localObject1).o0O0o0oo((IKeyManagerCallback)localObject2, str2);
    try
    {
      localObject1 = this.OooO0o;
      localObject2 = this.OooO00o;
      ((Context)localObject1).unbindService((ServiceConnection)localObject2);
    }
    catch (Exception localException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str2 = m54207b69.F54207b69_11("pZ2F353A3638430F4630353D444B874D3149503C41474A4A77");
      ((StringBuilder)localObject2).append(str2);
      String str1 = localException.getMessage();
      ((StringBuilder)localObject2).append(str1);
    }
    super.finalize();
  }
  
  public int getMappingKeyEvent(int paramInt)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("<+4C4F61694E6061494D556A595E7B6B5D557015151F262157666B825F6B6B29302B");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(paramInt);
    try
    {
      localObject1 = this.OooOO0o;
      if (localObject1 != null)
      {
        localObject2 = this.OooO0o;
        localObject2 = ((Context)localObject2).getPackageName();
        return ((IKeyManagerService)localObject1).o0O0oO(paramInt, (String)localObject2);
      }
      OooOOOo();
    }
    catch (Exception localException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str2 = m54207b69.F54207b69_11("SP35293B27073A392C2A3E274A40427E4438444733384E555582");
      ((StringBuilder)localObject2).append(str2);
      String str1 = localException.getMessage();
      ((StringBuilder)localObject2).append(str1);
      OooOOOo();
    }
    return paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.KeyManager
 * JD-Core Version:    0.7.0.1
 */