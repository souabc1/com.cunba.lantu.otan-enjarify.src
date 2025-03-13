package com.qinggan.util;

import android.os.Environment;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m54207b69;

public class ReflectionUtil$Environment
{
  public static File getUserSystemDirectory(int paramInt)
  {
    Object localObject1 = Environment.class;
    Object localObject2 = "%m0A091B3B220D25451C2723130C36122E181F2B153329";
    try
    {
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      int i = 1;
      Class[] arrayOfClass = new Class[i];
      Class localClass = Integer.TYPE;
      arrayOfClass[0] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      localObject2 = new Object[i];
      Object localObject3 = Integer.valueOf(paramInt);
      localObject2[0] = localObject3;
      localObject3 = ((Method)localObject1).invoke(null, (Object[])localObject2);
      return (File)localObject3;
    }
    catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException) {}catch (NoSuchMethodException localNoSuchMethodException) {}
    localNoSuchMethodException.printStackTrace();
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.util.ReflectionUtil.Environment
 * JD-Core Version:    0.7.0.1
 */