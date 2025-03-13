package com.qinggan.system;

import android.content.Context;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.qinggan.os.ServiceManager;
import com.qinggan.os.SystemProperties;
import com.qinggan.util.Log;
import m54207b69;

public class MultiWindowManager
{
  public static MultiWindowManager OooO;
  public static final boolean OooO0o = SystemProperties.OooO0OO(m54207b69.F54207b69_11("8/5D4103614C0648614B645063524E594F68"), false);
  public static Object OooO0oO;
  public static Context OooO0oo;
  public IBinder.DeathRecipient OooO00o;
  public MultiWindowManager.Connection OooO0O0 = null;
  public boolean OooO0OO = false;
  public Runnable OooO0Oo;
  public IMultiWindowService OooO0o0 = null;
  
  static
  {
    OooO = null;
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0oO = localObject;
  }
  
  public MultiWindowManager(Context paramContext)
  {
    Object localObject = new com/qinggan/system/MultiWindowManager$1;
    ((MultiWindowManager.1)localObject).<init>(this);
    this.OooO00o = ((IBinder.DeathRecipient)localObject);
    localObject = new com/qinggan/system/MultiWindowManager$2;
    ((MultiWindowManager.2)localObject).<init>(this);
    this.OooO0Oo = ((Runnable)localObject);
    OooO0oo = paramContext;
    paramContext = getServiceInstance();
    this.OooO0o0 = paramContext;
  }
  
  public static MultiWindowManager OooO0oO(Context paramContext)
  {
    OooO0oo = paramContext;
    ??? = new java/lang/StringBuilder;
    ((StringBuilder)???).<init>();
    Object localObject2 = m54207b69.F54207b69_11("uz171A1717122408154863");
    ((StringBuilder)???).append((String)localObject2);
    localObject2 = OooO0oo;
    ((StringBuilder)???).append(localObject2);
    localObject2 = m54207b69.F54207b69_11("Ts3E07210A1E2920241F250E491E2A20232612");
    ??? = ((StringBuilder)???).toString();
    Log.OooO00o((String)localObject2, (String)???);
    ??? = OooO;
    if (??? != null) {
      return ???;
    }
    synchronized (OooO0oO)
    {
      localObject2 = OooO;
      if (localObject2 != null) {
        return localObject2;
      }
      localObject2 = new com/qinggan/system/MultiWindowManager;
      ((MultiWindowManager)localObject2).<init>(paramContext);
      OooO = (MultiWindowManager)localObject2;
      return localObject2;
    }
  }
  
  private IMultiWindowService getServiceInstance()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("Wc040719330A161B11080F34181C24101C10175521441B272C221920745F");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = this.OooO0o0;
    ((StringBuilder)localObject1).append(localObject2);
    localObject2 = m54207b69.F54207b69_11("Ts3E07210A1E2920241F250E491E2A20232612");
    localObject1 = ((StringBuilder)localObject1).toString();
    Log.OooO00o((String)localObject2, (String)localObject1);
    localObject1 = this.OooO0o0;
    if (localObject1 == null)
    {
      localObject1 = ServiceManager.OooO0O0(m54207b69.F54207b69_11("uh051E061F0524070D141029"));
      localObject2 = IMultiWindowService.Stub.o0Oo0o0O((IBinder)localObject1);
      this.OooO0o0 = ((IMultiWindowService)localObject2);
      try
      {
        localObject2 = this.OooO00o;
        ((IBinder)localObject1).linkToDeath((IBinder.DeathRecipient)localObject2, 0);
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
    return this.OooO0o0;
  }
  
  public void OooO0o()
  {
    boolean bool = OooO0o;
    String str1 = m54207b69.F54207b69_11("Ts3E07210A1E2920241F250E491E2A20232612");
    Object localObject;
    if (!bool)
    {
      localObject = m54207b69.F54207b69_11("^(4C484812600D6164606151656815675E87566F57705675585E65617A246B6B687C7E7C702C727668848E876F886EAD70767D7992997C8284");
      Log.OooO00o(str1, (String)localObject);
      return;
    }
    try
    {
      localObject = this.OooO0o0;
      if (localObject != null)
      {
        ((IMultiWindowService)localObject).o00oooO();
      }
      else
      {
        localObject = "C+4679505C61474E55134E6852531818";
        localObject = m54207b69.F54207b69_11((String)localObject);
        Log.OooO00o(str1, (String)localObject);
        localObject = getServiceInstance();
        this.OooO0o0 = ((IMultiWindowService)localObject);
      }
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str3 = m54207b69.F54207b69_11("Gp15091B07410A220B21302329202C154C2F252763642A1E2A2D191E343B3B68");
      localStringBuilder.append(str3);
      String str2 = localException.getMessage();
      localStringBuilder.append(str2);
      str2 = localStringBuilder.toString();
      Log.OooO0O0(str1, str2);
    }
  }
  
  public boolean isMultiWindowMode()
  {
    String str1 = m54207b69.F54207b69_11("Ts3E07210A1E2920241F250E491E2A20232612");
    try
    {
      Object localObject = this.OooO0o0;
      if (localObject == null)
      {
        localObject = "iC2A311039333C301B32363137401B3A3636807541243B474C4239407E49534D4E82";
        localObject = m54207b69.F54207b69_11((String)localObject);
        Log.OooO0O0(str1, (String)localObject);
        return false;
      }
      return ((IMultiWindowService)localObject).isMultiWindowMode();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str3 = m54207b69.F54207b69_11(".V3F261D263E27450847413C442D2847414387454149483C3957525287");
      localStringBuilder.append(str3);
      String str2 = localException.getMessage();
      localStringBuilder.append(str2);
      str2 = localStringBuilder.toString();
      Log.OooO0O0(str1, str2);
    }
    return false;
  }
  
  public void setMultiWindowMode(int paramInt)
  {
    boolean bool = OooO0o;
    String str1 = m54207b69.F54207b69_11("Ts3E07210A1E2920241F250E491E2A20232612");
    Object localObject1;
    if (!bool)
    {
      localObject1 = m54207b69.F54207b69_11("B753595B13471C4A494F5062504F24545F786B546E57735675716C725B336E7075636367753B69786AA26B856E8A8D8C88838972AD8C8888");
      Log.OooO00o(str1, (String)localObject1);
      return;
    }
    try
    {
      localObject2 = this.OooO0o0;
      if (localObject2 != null)
      {
        ((IMultiWindowService)localObject2).setMultiWindowMode(paramInt);
      }
      else
      {
        localObject1 = "C+4679505C61474E55134E6852531818";
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        Log.OooO00o(str1, (String)localObject1);
        localObject1 = getServiceInstance();
        this.OooO0o0 = ((IMultiWindowService)localObject1);
      }
    }
    catch (Exception localException)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str3 = m54207b69.F54207b69_11("3$5742526C554D56547B56544B5760775A5052161755715D586C696766663B");
      ((StringBuilder)localObject2).append(str3);
      String str2 = localException.getMessage();
      ((StringBuilder)localObject2).append(str2);
      str2 = ((StringBuilder)localObject2).toString();
      Log.OooO0O0(str1, str2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.MultiWindowManager
 * JD-Core Version:    0.7.0.1
 */