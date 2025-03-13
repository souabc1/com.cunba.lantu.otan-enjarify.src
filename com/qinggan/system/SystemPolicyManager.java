package com.qinggan.system;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import com.qinggan.common.OnInitListener;
import com.qinggan.os.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m54207b69;

public class SystemPolicyManager
{
  public static String OooO = "com.qinggan.systempolicy.SystemPolicyService";
  public static String OooO0oo = "qg.system_policy";
  public static String OooOO0 = "com.qinggan.systempolicy";
  public static Handler OooOO0O;
  public static SystemPolicyManager OooOO0o;
  public static boolean OooOOO0 = false;
  public IBinder.DeathRecipient OooO00o;
  public final List OooO0O0;
  public HashMap OooO0OO;
  public Context OooO0Oo;
  public Runnable OooO0o;
  public OnInitListener OooO0o0;
  public ISystemPolicy OooO0oO;
  
  static
  {
    SystemPolicyManager.1 local1 = new com/qinggan/system/SystemPolicyManager$1;
    local1.<init>();
    OooOO0O = local1;
  }
  
  public final boolean OooO()
  {
    Object localObject1 = ServiceManager.OooO0O0(OooO0oo);
    Context localContext = null;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = m54207b69.F54207b69_11(";-4E4D451047475F14525163186A556D6A545F5A20");
      ((StringBuilder)localObject1).append((String)localObject3);
      localObject3 = OooO0oo;
      ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject3 = OooOO0;
      ((Intent)localObject1).setPackage((String)localObject3);
      localObject3 = OooO;
      ((Intent)localObject1).setAction((String)localObject3);
      this.OooO0Oo.startService((Intent)localObject1);
      localObject1 = new java/lang/Thread;
      localObject3 = this.OooO0o;
      ((Thread)localObject1).<init>((Runnable)localObject3);
      ((Thread)localObject1).start();
      return false;
    }
    Object localObject3 = ISystemPolicy.Stub.o0Oo0o0O((IBinder)localObject1);
    this.OooO0oO = ((ISystemPolicy)localObject3);
    boolean bool = true;
    OooOOO0 = bool;
    try
    {
      IBinder.DeathRecipient localDeathRecipient = this.OooO00o;
      ((IBinder)localObject1).linkToDeath(localDeathRecipient, 0);
    }
    catch (RemoteException localRemoteException)
    {
      localRemoteException.printStackTrace();
    }
    Object localObject2 = this.OooO0OO;
    int i = ((HashMap)localObject2).size();
    if (i > 0)
    {
      localObject2 = this.OooO0OO;
      localContext = this.OooO0Oo;
      localObject2 = (OnInitListener)((HashMap)localObject2).get(localContext);
      OooOOO0((OnInitListener)localObject2);
    }
    return bool;
  }
  
  public int OooOO0(int... paramVarArgs)
  {
    if (paramVarArgs != null) {}
    try
    {
      int i = paramVarArgs.length;
      int j;
      if (i > 0)
      {
        i = 0;
        localISystemPolicy = null;
        j = paramVarArgs[0];
      }
      else
      {
        j = 1;
      }
      ISystemPolicy localISystemPolicy = this.OooO0oO;
      if (localISystemPolicy != null) {
        return localISystemPolicy.getBackLight(j);
      }
      OooO();
    }
    catch (Exception paramVarArgs)
    {
      paramVarArgs.printStackTrace();
      OooO();
    }
    return -1;
  }
  
  public int OooOO0O(int... paramVarArgs)
  {
    if (paramVarArgs != null) {}
    try
    {
      int i = paramVarArgs.length;
      int j;
      if (i > 0)
      {
        i = 0;
        localObject = null;
        j = paramVarArgs[0];
      }
      else
      {
        j = 1;
      }
      localObject = this.OooO0oO;
      if (localObject != null) {
        return ((ISystemPolicy)localObject).getDimmer(j);
      }
      OooO();
    }
    catch (Exception paramVarArgs)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = m54207b69.F54207b69_11("SP35293B27073A392C2A3E274A40427E4438444733384E555582");
      ((StringBuilder)localObject).append(str);
      paramVarArgs = paramVarArgs.getMessage();
      ((StringBuilder)localObject).append(paramVarArgs);
      OooO();
    }
    return -1;
  }
  
  public int OooOO0o(IBackLightCallback paramIBackLightCallback, int... paramVarArgs)
  {
    if (paramVarArgs != null) {}
    try
    {
      int i = paramVarArgs.length;
      int j;
      if (i > 0)
      {
        i = 0;
        localObject = null;
        j = paramVarArgs[0];
      }
      else
      {
        j = 1;
      }
      localObject = this.OooO0oO;
      if (localObject != null) {
        return ((ISystemPolicy)localObject).o0ooO(paramIBackLightCallback, j);
      }
      OooO();
    }
    catch (Exception paramIBackLightCallback)
    {
      paramVarArgs = new java/lang/StringBuilder;
      paramVarArgs.<init>();
      Object localObject = m54207b69.F54207b69_11("SP35293B27073A392C2A3E274A40427E4438444733384E555582");
      paramVarArgs.append((String)localObject);
      paramIBackLightCallback = paramIBackLightCallback.getMessage();
      paramVarArgs.append(paramIBackLightCallback);
      OooO();
    }
    return -1;
  }
  
  public boolean OooOOO(int paramInt1, int paramInt2, int... paramVarArgs)
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    Object localObject = m54207b69.F54207b69_11("^14255477654576084605F63501D181F625369686C59746A595A24");
    localStringBuilder1.append((String)localObject);
    localStringBuilder1.append(paramInt1);
    localObject = ",";
    localStringBuilder1.append((String)localObject);
    localStringBuilder1.append(paramVarArgs);
    localStringBuilder1 = null;
    if (paramVarArgs != null)
    {
      int i = paramVarArgs.length;
      if (i > 0)
      {
        j = paramVarArgs[0];
        break label78;
      }
    }
    int j = 1;
    try
    {
      label78:
      localObject = this.OooO0oO;
      if (localObject != null) {
        return ((ISystemPolicy)localObject).o0ooO0O0(paramInt1, paramInt2, j, false);
      }
      OooO();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>();
      paramVarArgs = m54207b69.F54207b69_11("SP35293B27073A392C2A3E274A40427E4438444733384E555582");
      localStringBuilder2.append(paramVarArgs);
      String str = localException.getMessage();
      localStringBuilder2.append(str);
      OooO();
    }
    return false;
  }
  
  public final void OooOOO0(OnInitListener paramOnInitListener)
  {
    Message localMessage = new android/os/Message;
    localMessage.<init>();
    localMessage.what = 0;
    Context localContext = this.OooO0Oo;
    paramOnInitListener = new Object[] { localContext, paramOnInitListener };
    localMessage.obj = paramOnInitListener;
    OooOO0O.sendMessageDelayed(localMessage, 50);
  }
  
  public boolean OooOOOO(int paramInt1, int paramInt2, int... paramVarArgs)
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    Object localObject = m54207b69.F54207b69_11("9i1A0D1F3004090A1323525D54190D12131C2C65");
    localStringBuilder1.append((String)localObject);
    localStringBuilder1.append(paramInt1);
    localStringBuilder1 = null;
    if (paramVarArgs != null)
    {
      int i = paramVarArgs.length;
      if (i > 0)
      {
        j = paramVarArgs[0];
        break label59;
      }
    }
    int j = 1;
    try
    {
      label59:
      localObject = this.OooO0oO;
      if (localObject != null) {
        return ((ISystemPolicy)localObject).o0O0OoO0(paramInt1, paramInt2, j, false);
      }
      OooO();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>();
      paramVarArgs = m54207b69.F54207b69_11("SP35293B27073A392C2A3E274A40427E4438444733384E555582");
      localStringBuilder2.append(paramVarArgs);
      String str = localException.getMessage();
      localStringBuilder2.append(str);
      OooO();
    }
    return false;
  }
  
  public List getAutoConnectDevice()
  {
    try
    {
      ISystemPolicy localISystemPolicy = this.OooO0oO;
      if (localISystemPolicy != null) {
        return localISystemPolicy.getAutoConnectDevice();
      }
      OooO();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = m54207b69.F54207b69_11("SP35293B27073A392C2A3E274A40427E4438444733384E555582");
      localStringBuilder.append(str);
      localObject = localException.getMessage();
      localStringBuilder.append((String)localObject);
      OooO();
    }
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    return localObject;
  }
  
  public List getScannedDevices()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      ISystemPolicy localISystemPolicy = this.OooO0oO;
      if (localISystemPolicy != null) {
        return null;
      }
      OooO();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("SP35293B27073A392C2A3E274A40427E4438444733384E555582");
      localStringBuilder.append(str2);
      String str1 = localException.getMessage();
      localStringBuilder.append(str1);
      OooO();
    }
    return localArrayList;
  }
  
  public boolean isBTRecording(int paramInt)
  {
    try
    {
      localObject = this.OooO0oO;
      if (localObject != null) {
        return ((ISystemPolicy)localObject).isBTRecording(paramInt);
      }
      OooO();
    }
    catch (Exception localException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11("SP35293B27073A392C2A3E274A40427E4438444733384E555582");
      ((StringBuilder)localObject).append(str2);
      String str1 = localException.getMessage();
      ((StringBuilder)localObject).append(str1);
      OooO();
    }
    return false;
  }
  
  public boolean isQGNetworkAvailable()
  {
    try
    {
      ISystemPolicy localISystemPolicy = this.OooO0oO;
      if (localISystemPolicy != null) {
        return localISystemPolicy.isQGNetworkAvailable();
      }
      OooO();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("SP35293B27073A392C2A3E274A40427E4438444733384E555582");
      localStringBuilder.append(str2);
      String str1 = localException.getMessage();
      localStringBuilder.append(str1);
      OooO();
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.SystemPolicyManager
 * JD-Core Version:    0.7.0.1
 */