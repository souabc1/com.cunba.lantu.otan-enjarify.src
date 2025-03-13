package com.sun.jna;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import m54207b69;

abstract class Klass
{
  public static Object OooO00o(Class paramClass)
  {
    Object localObject1 = m54207b69.F54207b69_11("Xg4B4817051A17141C0A1D5111532420141B1F165A1D1D601D2D19611F24263232353326362C3A836E");
    String str = m54207b69.F54207b69_11("(t37161C5604591D0D191E0A1C602228632D2B1913292F2D286C342C6F");
    Object[] arrayOfObject = null;
    try
    {
      localObject2 = new Class[0];
      localObject2 = paramClass.getDeclaredConstructor((Class[])localObject2);
      arrayOfObject = new Object[0];
      return ((Constructor)localObject2).newInstance(arrayOfObject);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      localObject2 = localInvocationTargetException.getCause();
      boolean bool = localObject2 instanceof RuntimeException;
      if (bool) {
        throw ((RuntimeException)localInvocationTargetException.getCause());
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(paramClass);
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(localInvocationTargetException);
      paramClass = ((StringBuilder)localObject2).toString();
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>(paramClass, localInvocationTargetException);
      throw ((Throwable)localObject1);
    }
    catch (SecurityException localSecurityException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(paramClass);
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(localSecurityException);
      paramClass = ((StringBuilder)localObject2).toString();
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>(paramClass, localSecurityException);
      throw ((Throwable)localObject1);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(paramClass);
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(localNoSuchMethodException);
      paramClass = ((StringBuilder)localObject2).toString();
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>(paramClass, localNoSuchMethodException);
      throw ((Throwable)localObject1);
    }
    catch (InstantiationException localInstantiationException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(paramClass);
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(localInstantiationException);
      paramClass = ((StringBuilder)localObject2).toString();
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>(paramClass, localInstantiationException);
      throw ((Throwable)localObject1);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(paramClass);
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(localIllegalArgumentException);
      paramClass = ((StringBuilder)localObject2).toString();
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>(paramClass, localIllegalArgumentException);
      throw ((Throwable)localObject1);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(paramClass);
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(localIllegalAccessException);
      paramClass = ((StringBuilder)localObject2).toString();
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>(paramClass, localIllegalAccessException);
      throw ((Throwable)localObject1);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.Klass
 * JD-Core Version:    0.7.0.1
 */