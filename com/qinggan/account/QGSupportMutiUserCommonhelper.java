package com.qinggan.account;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.UserHandle;
import com.qinggan.os.SystemProperties;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import m54207b69;

public class QGSupportMutiUserCommonhelper
{
  public static boolean OooO00o(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    try
    {
      int i = OooO0O0(paramContext);
      Object localObject1 = "X&474944574D54480F515E127E6150627D5759545D57";
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = Class.forName((String)localObject1);
      boolean bool = true;
      Object localObject2 = new Class[bool];
      Object localObject3 = Integer.TYPE;
      localObject2[0] = localObject3;
      localObject1 = ((Class)localObject1).getConstructor((Class[])localObject2);
      ((AccessibleObject)localObject1).setAccessible(bool);
      localObject2 = new Object[bool];
      Object localObject4 = Integer.valueOf(i);
      localObject2[0] = localObject4;
      localObject4 = ((Constructor)localObject1).newInstance((Object[])localObject2);
      localObject4 = (UserHandle)localObject4;
      localObject1 = paramContext.getClass();
      localObject2 = "l(4A42484F7F52606549545774678A695C6A";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      int j = 4;
      Class[] arrayOfClass = new Class[j];
      Object localObject5 = Intent.class;
      arrayOfClass[0] = localObject5;
      localObject5 = ServiceConnection.class;
      arrayOfClass[bool] = localObject5;
      int k = 2;
      arrayOfClass[k] = localObject3;
      localObject3 = UserHandle.class;
      int m = 3;
      arrayOfClass[m] = localObject3;
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, arrayOfClass);
      localObject2 = new Object[j];
      localObject2[0] = paramIntent;
      localObject2[bool] = paramServiceConnection;
      paramIntent = Integer.valueOf(paramInt);
      localObject2[k] = paramIntent;
      localObject2[m] = localObject4;
      paramContext = ((Method)localObject1).invoke(paramContext, (Object[])localObject2);
      if (paramContext != null) {
        return bool;
      }
      return false;
    }
    catch (Exception localException)
    {
      localException.toString();
    }
    return false;
  }
  
  public static int OooO0O0(Context paramContext)
  {
    try
    {
      boolean bool = isMultiUserEnabled();
      if (bool)
      {
        Object localObject1 = ":'4645555155535965";
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        paramContext = paramContext.getSystemService((String)localObject1);
        paramContext = (ActivityManager)paramContext;
        localObject1 = "bh09070E1D0B06124D1121225135182A102E122E24391E1C20272634";
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        localObject1 = Class.forName((String)localObject1);
        Object localObject2 = "Y750534577464A4B59614C6C4F5E52";
        localObject2 = m54207b69.F54207b69_11((String)localObject2);
        Class[] arrayOfClass = new Class[0];
        localObject1 = ((Class)localObject1).getMethod((String)localObject2, arrayOfClass);
        localObject2 = new Object[0];
        paramContext = ((Method)localObject1).invoke(paramContext, (Object[])localObject2);
        if (paramContext != null)
        {
          paramContext = (Integer)paramContext;
          return paramContext.intValue();
        }
      }
      else
      {
        return 0;
      }
    }
    catch (Exception paramContext)
    {
      paramContext.toString();
    }
    return 0;
  }
  
  public static void OooO0OO(Context paramContext, Intent paramIntent)
  {
    try
    {
      int i = OooO0O0(paramContext);
      Object localObject1 = "X&474944574D54480F515E127E6150627D5759545D57";
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = Class.forName((String)localObject1);
      boolean bool = true;
      Object localObject2 = new Class[bool];
      Object localObject3 = Integer.TYPE;
      UserHandle localUserHandle = null;
      localObject2[0] = localObject3;
      localObject1 = ((Class)localObject1).getConstructor((Class[])localObject2);
      ((AccessibleObject)localObject1).setAccessible(bool);
      localObject2 = new Object[bool];
      Object localObject4 = Integer.valueOf(i);
      localObject2[0] = localObject4;
      localObject4 = ((Constructor)localObject1).newInstance((Object[])localObject2);
      localObject4 = (UserHandle)localObject4;
      localObject1 = paramContext.getClass();
      localObject2 = "(u0602160A052B160E0B25201B40132E152018";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      int j = 2;
      localObject3 = new Class[j];
      Intent localIntent = Intent.class;
      localObject3[0] = localIntent;
      localUserHandle = UserHandle.class;
      localObject3[bool] = localUserHandle;
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
      paramIntent = new Object[] { paramIntent, localObject4 };
      ((Method)localObject1).invoke(paramContext, paramIntent);
    }
    catch (Exception paramContext)
    {
      paramContext.toString();
    }
  }
  
  public static boolean isMultiUserEnabled()
  {
    return SystemProperties.OooO0OO(m54207b69.F54207b69_11(")$5442585A515C56115F6661156150185861596260656C576D"), false);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.account.QGSupportMutiUserCommonhelper
 * JD-Core Version:    0.7.0.1
 */