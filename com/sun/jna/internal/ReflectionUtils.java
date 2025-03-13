package com.sun.jna.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import m54207b69;

public class ReflectionUtils
{
  public static final Method OooO;
  public static final Logger OooO00o = Logger.getLogger(ReflectionUtils.class.getName());
  public static final Method OooO0O0;
  public static final Method OooO0OO;
  public static final Method OooO0Oo;
  public static final Method OooO0o;
  public static final Method OooO0o0;
  public static final Method OooO0oO;
  public static final Method OooO0oo;
  public static final Method OooOO0;
  public static Constructor OooOO0O;
  
  static
  {
    Object localObject1 = OooO0o(m54207b69.F54207b69_11("`b08041606501309130D551517201A17165C4019291E221C411B252029232E"));
    Object localObject2 = OooO0o(m54207b69.F54207b69_11("*Y3339313B7B3A3E3E46803A423B43404B87254E40454B53285050575058"));
    Object localObject3 = OooO0o(m54207b69.F54207b69_11("9E2F2535276F2E2A322A7436363F373C2F7B193244413F37243C443B443C537F284A4B505359"));
    Class localClass1 = OooO0o(m54207b69.F54207b69_11("2E2F2535276F2E2A322A7436363F373C2F7B193244413F3728544E3A"));
    String str = m54207b69.F54207b69_11("5G2E350525252B38323B");
    Class[] arrayOfClass = new Class[0];
    Object localObject4 = Method.class;
    OooO0O0 = OooO0oo((Class)localObject4, str, arrayOfClass);
    str = m54207b69.F54207b69_11("+?535152574E54");
    arrayOfClass = new Class[0];
    OooO0OO = OooO0oo((Class)localObject1, str, arrayOfClass);
    int i = 1;
    arrayOfClass = new Class[i];
    Class localClass2 = Class.class;
    arrayOfClass[0] = localClass2;
    OooO0Oo = OooO0oo((Class)localObject3, "in", arrayOfClass);
    int j = 2;
    Object localObject5 = new Class[j];
    localObject5[0] = localObject4;
    localObject5[i] = localClass2;
    localObject4 = m54207b69.F54207b69_11("=M3824412B2F262E35412747333A313A30");
    OooO0o = OooO0oo((Class)localObject3, (String)localObject4, (Class[])localObject5);
    localObject4 = new Class[4];
    localObject4[0] = localClass2;
    localObject4[i] = String.class;
    localObject4[j] = localClass1;
    localObject4[3] = localClass2;
    localObject5 = m54207b69.F54207b69_11("K85E52585F6F4D636259625E");
    OooO0oO = OooO0oo((Class)localObject3, (String)localObject5, (Class[])localObject4);
    localObject4 = new Class[i];
    localObject4[0] = Object.class;
    localObject5 = m54207b69.F54207b69_11("Aj08040611420A");
    OooO0oo = OooO0oo((Class)localObject2, (String)localObject5, (Class[])localObject4);
    localObject4 = new Class[i];
    localObject4[0] = [Ljava.lang.Object.class;
    localObject5 = m54207b69.F54207b69_11("G;52564F5754637259575C8454685B646D65605A");
    OooO = OooO0oo((Class)localObject2, (String)localObject5, (Class[])localObject4);
    localObject2 = new Class[j];
    localObject2[0] = localClass2;
    localObject2[i] = localObject3;
    localObject3 = m54207b69.F54207b69_11("Q~0E0D190B230F2139191A1F161A441E");
    OooO0o0 = OooO0oo((Class)localObject1, (String)localObject3, (Class[])localObject2);
    localObject1 = new Class[j];
    localObject1[0] = localClass2;
    localObject1[i] = [Ljava.lang.Class.class;
    localObject2 = m54207b69.F54207b69_11("'.434C5C49454F805E6654");
    OooOO0 = OooO0oo(localClass1, (String)localObject2, (Class[])localObject1);
  }
  
  public static Object OooO(Object paramObject, Method paramMethod)
  {
    Method localMethod = OooO0oO;
    Class localClass = paramMethod.getDeclaringClass();
    String str = paramMethod.getName();
    Object localObject1 = OooOO0;
    Object localObject2 = paramMethod.getReturnType();
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    localObject2 = new Object[] { localObject2, arrayOfClass };
    localObject1 = ((Method)localObject1).invoke(null, (Object[])localObject2);
    paramMethod = paramMethod.getDeclaringClass();
    Object[] tmp67_64 = new Object[4];
    Object[] tmp68_67 = tmp67_64;
    Object[] tmp68_67 = tmp67_64;
    tmp68_67[0] = localClass;
    tmp68_67[1] = str;
    tmp68_67[2] = localObject1;
    Object[] tmp80_68 = tmp68_67;
    tmp80_68[3] = paramMethod;
    paramMethod = tmp80_68;
    return localMethod.invoke(paramObject, paramMethod);
  }
  
  public static Object OooO00o()
  {
    Method localMethod = OooO0OO;
    Object[] arrayOfObject = new Object[0];
    return localMethod.invoke(null, arrayOfObject);
  }
  
  public static Object OooO0O0(Class paramClass, Object paramObject)
  {
    Method localMethod = OooO0o0;
    paramClass = new Object[] { paramClass, paramObject };
    return localMethod.invoke(null, paramClass);
  }
  
  public static Object OooO0OO(Method paramMethod)
  {
    Object localObject1 = OooO00o();
    Object localObject2;
    try
    {
      localObject2 = paramMethod.getDeclaringClass();
      localObject1 = OooO0O0((Class)localObject2, localObject1);
      return OooO(localObject1, paramMethod);
    }
    catch (Exception localException)
    {
      localObject1 = getConstructorLookupClass();
      localObject2 = paramMethod.getDeclaringClass();
      localObject2 = new Object[] { localObject2 };
    }
    return OooOO0(((Constructor)localObject1).newInstance((Object[])localObject2), paramMethod);
  }
  
  public static Object OooO0Oo(Object paramObject1, Object paramObject2, Object... paramVarArgs)
  {
    Method localMethod = OooO0oo;
    paramObject1 = new Object[] { paramObject1 };
    paramObject1 = localMethod.invoke(paramObject2, paramObject1);
    paramObject2 = OooO;
    paramVarArgs = new Object[] { paramVarArgs };
    return paramObject2.invoke(paramObject1, paramVarArgs);
  }
  
  public static Class OooO0o(String paramString)
  {
    try
    {
      return Class.forName(paramString);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Logger localLogger = OooO00o;
      Level localLevel = Level.FINE;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = m54207b69.F54207b69_11("[K0D2B242A323471462C74312F302D4C4A7B39393D4C4D8782");
      localStringBuilder.append(str);
      localStringBuilder.append(paramString);
      paramString = localStringBuilder.toString();
      localLogger.log(localLevel, paramString, localClassNotFoundException);
    }
    return null;
  }
  
  public static boolean OooO0o0(Method paramMethod)
  {
    Object localObject = OooO0O0;
    Object[] arrayOfObject = null;
    if (localObject == null) {
      return false;
    }
    try
    {
      arrayOfObject = new Object[0];
      paramMethod = ((Method)localObject).invoke(paramMethod, arrayOfObject);
      paramMethod = (Boolean)paramMethod;
      return paramMethod.booleanValue();
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      paramMethod = localInvocationTargetException.getCause();
      boolean bool = paramMethod instanceof RuntimeException;
      if (!bool)
      {
        bool = paramMethod instanceof Error;
        if (bool) {
          throw ((Error)paramMethod);
        }
        localObject = new java/lang/RuntimeException;
        ((RuntimeException)localObject).<init>(paramMethod);
        throw ((Throwable)localObject);
      }
      throw ((RuntimeException)paramMethod);
    }
    catch (IllegalArgumentException paramMethod)
    {
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(paramMethod);
      throw ((Throwable)localObject);
    }
    catch (IllegalAccessException paramMethod)
    {
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(paramMethod);
      throw ((Throwable)localObject);
    }
  }
  
  public static Constructor OooO0oO(Class paramClass, Class... paramVarArgs)
  {
    String str = m54207b69.F54207b69_11("?<7A5E57535D5D224F5B255A5E5F64575B2C626B5B68686E1D34196F6D7165203E672E63376B33673C");
    Object localObject;
    Level localLevel;
    if (paramClass == null)
    {
      localObject = OooO00o;
      localLevel = Level.FINE;
      paramVarArgs = Arrays.toString(paramVarArgs);
      paramClass = new Object[] { paramClass, paramVarArgs };
      ((Logger)localObject).log(localLevel, str, paramClass);
      return null;
    }
    try
    {
      localObject = paramClass.getDeclaredConstructor(paramVarArgs);
      boolean bool = true;
      ((AccessibleObject)localObject).setAccessible(bool);
      return localObject;
    }
    catch (Exception localException)
    {
      localObject = OooO00o;
      localLevel = Level.FINE;
      paramVarArgs = Arrays.toString(paramVarArgs);
      paramClass = new Object[] { paramClass, paramVarArgs };
      ((Logger)localObject).log(localLevel, str, paramClass);
    }
    return null;
  }
  
  public static Method OooO0oo(Class paramClass, String paramString, Class... paramVarArgs)
  {
    String str = m54207b69.F54207b69_11("ZA07212A30282A673C366A37393A374240713D36483D433B9279538B577E578E5B895B955F8C");
    Logger localLogger;
    Level localLevel;
    if (paramClass == null)
    {
      localLogger = OooO00o;
      localLevel = Level.FINE;
      paramVarArgs = Arrays.toString(paramVarArgs);
      Object[] tmp29_26 = new Object[3];
      Object[] tmp30_29 = tmp29_26;
      Object[] tmp30_29 = tmp29_26;
      tmp30_29[0] = paramClass;
      tmp30_29[1] = paramString;
      tmp30_29[2] = paramVarArgs;
      paramClass = tmp30_29;
      localLogger.log(localLevel, str, paramClass);
      return null;
    }
    try
    {
      return paramClass.getMethod(paramString, paramVarArgs);
    }
    catch (Exception localException)
    {
      localLogger = OooO00o;
      localLevel = Level.FINE;
      paramVarArgs = Arrays.toString(paramVarArgs);
      Object[] tmp79_76 = new Object[3];
      Object[] tmp80_79 = tmp79_76;
      Object[] tmp80_79 = tmp79_76;
      tmp80_79[0] = paramClass;
      tmp80_79[1] = paramString;
      tmp80_79[2] = paramVarArgs;
      paramClass = tmp80_79;
      localLogger.log(localLevel, str, paramClass);
    }
    return null;
  }
  
  public static Object OooOO0(Object paramObject, Method paramMethod)
  {
    Method localMethod = OooO0Oo;
    Object localObject = paramMethod.getDeclaringClass();
    localObject = new Object[] { localObject };
    paramObject = localMethod.invoke(paramObject, (Object[])localObject);
    localMethod = OooO0o;
    localObject = paramMethod.getDeclaringClass();
    paramMethod = new Object[] { paramMethod, localObject };
    return localMethod.invoke(paramObject, paramMethod);
  }
  
  private static Constructor getConstructorLookupClass()
  {
    Object localObject = OooOO0O;
    if (localObject == null)
    {
      localObject = OooO0o(m54207b69.F54207b69_11("9E2F2535276F2E2A322A7436363F373C2F7B193244413F37243C443B443C537F284A4B505359"));
      int i = 1;
      Class[] arrayOfClass = new Class[i];
      Class localClass = Class.class;
      arrayOfClass[0] = localClass;
      localObject = OooO0oO((Class)localObject, arrayOfClass);
      OooOO0O = (Constructor)localObject;
    }
    return OooOO0O;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.internal.ReflectionUtils
 * JD-Core Version:    0.7.0.1
 */