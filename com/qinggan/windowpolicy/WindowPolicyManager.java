package com.qinggan.windowpolicy;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.qinggan.os.ServiceManager;
import com.qinggan.util.Log;
import java.util.HashMap;
import m54207b69;

public class WindowPolicyManager
{
  public static Object OooO0oO;
  public IBinder.DeathRecipient OooO00o;
  public boolean OooO0O0;
  public Runnable OooO0OO;
  public final Object OooO0Oo;
  public IWindowPolicyService OooO0o;
  public final HashMap OooO0o0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0oO = localObject;
  }
  
  public static String getPolicyMessage(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        i = 2;
        if (paramInt != i)
        {
          i = 3;
          if (paramInt != i)
          {
            i = 4;
            if (paramInt != i) {
              return m54207b69.F54207b69_11("Y*5F45434749624A");
            }
            return m54207b69.F54207b69_11("g5425D5D545E47704C6262666158775363505762");
          }
          return m54207b69.F54207b69_11("*146596158624B74486666625D547B50546E52");
        }
        return m54207b69.F54207b69_11(";`170A1007131C45171715130E254C1E141E151B211B");
      }
      return m54207b69.F54207b69_11("Q(5F42484F4B647D5F4F4D4B565D84685C6B6E5760");
    }
    return m54207b69.F54207b69_11("oK3C23273228411A422C302C333E213333353F");
  }
  
  private IWindowPolicyService getServiceInstance()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("Wc040719330A161B11080F34181C24101C10175521441B272C221920745F");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = this.OooO0o;
    ((StringBuilder)localObject1).append(localObject2);
    localObject2 = m54207b69.F54207b69_11("p&71504A454D567C5052584F6A77545656515466");
    localObject1 = ((StringBuilder)localObject1).toString();
    Log.OooO00o((String)localObject2, (String)localObject1);
    localObject1 = this.OooO0o;
    if (localObject1 == null)
    {
      localObject1 = ServiceManager.OooO0O0(m54207b69.F54207b69_11(".k1A0D471F060A150B243D250F130F1621"));
      localObject2 = IWindowPolicyService.Stub.o0Oo0o0O((IBinder)localObject1);
      this.OooO0o = ((IWindowPolicyService)localObject2);
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
    return this.OooO0o;
  }
  
  public final WindowPolicyManager.OnWindowPolicyListener OooO0oO(String paramString)
  {
    return (WindowPolicyManager.OnWindowPolicyListener)this.OooO0o0.get(paramString);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.windowpolicy.WindowPolicyManager
 * JD-Core Version:    0.7.0.1
 */