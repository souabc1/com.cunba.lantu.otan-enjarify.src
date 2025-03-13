package com.qinggan.util;

import android.os.UserHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m54207b69;

public class ReflectionUtil$UserHandle
{
  public static int getCallingUserId()
  {
    Object localObject1 = UserHandle.class;
    Object localObject2 = "kO282B3D0F3228292D29312447364A143A";
    try
    {
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      Class[] arrayOfClass = new Class[0];
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      localObject2 = new Object[0];
      arrayOfClass = null;
      localObject1 = ((Method)localObject1).invoke(null, (Object[])localObject2);
      localObject1 = (Integer)localObject1;
      return ((Integer)localObject1).intValue();
    }
    catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException) {}catch (NoSuchMethodException localNoSuchMethodException) {}
    localNoSuchMethodException.printStackTrace();
    return 0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.util.ReflectionUtil.UserHandle
 * JD-Core Version:    0.7.0.1
 */