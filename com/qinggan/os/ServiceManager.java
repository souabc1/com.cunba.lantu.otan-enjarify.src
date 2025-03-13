package com.qinggan.os;

import android.content.Context;
import android.os.IBinder;
import android.view.Display;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m54207b69;

public class ServiceManager
{
  public static Class OooO00o;
  public static Class OooO0O0;
  public static Class OooO0OO;
  public static Class OooO0Oo;
  public static Class OooO0o0;
  
  static
  {
    Object localObject = "?L2D232A41272A2E692B486C2A354B48343F3A13403642414056";
    try
    {
      localObject = m54207b69.F54207b69_11((String)localObject);
      localObject = Class.forName((String)localObject);
      OooO0O0 = (Class)localObject;
      localObject = "bh09070E1D0B06124D1121225135182A102E122E24391E1C20272634";
      localObject = m54207b69.F54207b69_11((String)localObject);
      localObject = Class.forName((String)localObject);
      OooO00o = (Class)localObject;
      localObject = "1Q30403726423D3B862F413E318B0F3232474144472653553C3B5757";
      localObject = m54207b69.F54207b69_11((String)localObject);
      localObject = Class.forName((String)localObject);
      OooO0o0 = (Class)localObject;
      localObject = "}3525E5944605F5D244D63604F29676B52565870695B70726E3593775E62649C75677C7E7AA27783797C7F6B";
      localObject = m54207b69.F54207b69_11((String)localObject);
      localObject = Class.forName((String)localObject);
      OooO0Oo = (Class)localObject;
      localObject = "=a00100716120D0B560A171920101C235E321F2128182E2B";
      localObject = m54207b69.F54207b69_11((String)localObject);
      localObject = Class.forName((String)localObject);
      OooO0OO = (Class)localObject;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localClassNotFoundException.printStackTrace();
    }
  }
  
  public static Display OooO00o(Context paramContext)
  {
    try
    {
      localObject1 = OooO0OO;
      localObject2 = "+R353828193F2628453B34";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      Class[] arrayOfClass = new Class[0];
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, arrayOfClass);
      localObject2 = new Object[0];
      paramContext = ((Method)localObject1).invoke(paramContext, (Object[])localObject2);
      return (Display)paramContext;
    }
    catch (Exception paramContext)
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11("Ul0B0A1A2B09242207151E5614201C172B281615156A");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = paramContext.getMessage();
      ((StringBuilder)localObject1).append((String)localObject2);
      paramContext.printStackTrace();
    }
    return null;
  }
  
  public static IBinder OooO0O0(String paramString)
  {
    try
    {
      Object localObject = OooO0O0;
      String str1 = "{a0605173508181D0F0A0D";
      str1 = m54207b69.F54207b69_11(str1);
      int i = 1;
      Class[] arrayOfClass = new Class[i];
      String str2 = String.class;
      arrayOfClass[0] = str2;
      localObject = ((Class)localObject).getMethod(str1, arrayOfClass);
      paramString = new Object[] { paramString };
      paramString = ((Method)localObject).invoke(null, paramString);
      return (IBinder)paramString;
    }
    catch (IllegalAccessException paramString) {}catch (InvocationTargetException paramString) {}catch (NoSuchMethodException paramString) {}
    paramString.printStackTrace();
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.ServiceManager
 * JD-Core Version:    0.7.0.1
 */