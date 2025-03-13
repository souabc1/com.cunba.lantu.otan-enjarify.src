package com.sun.jna;

import com.sun.jna.internal.ReflectionUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import m54207b69;

public class Library$Handler
  implements InvocationHandler
{
  public static final Method OooO0o;
  public static final Method OooO0oO;
  public static final Method OooO0oo;
  public final NativeLibrary OooO00o;
  public final Class OooO0O0;
  public final Map OooO0OO;
  public final InvocationMapper OooO0Oo;
  public final Map OooO0o0;
  
  static
  {
    Object localObject1 = Object.class;
    Object localObject2 = "md100C39131A12100A";
    try
    {
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      Class[] arrayOfClass = new Class[0];
      localObject2 = ((Class)localObject1).getMethod((String)localObject2, arrayOfClass);
      OooO0o = (Method)localObject2;
      localObject2 = ":P3832253B17443A3C";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      arrayOfClass = new Class[0];
      localObject2 = ((Class)localObject1).getMethod((String)localObject2, arrayOfClass);
      OooO0oO = (Method)localObject2;
      localObject2 = "8X3D2A2F3C3830";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      int i = 1;
      arrayOfClass = new Class[i];
      arrayOfClass[0] = localObject1;
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, arrayOfClass);
      OooO0oo = (Method)localObject1;
      return;
    }
    catch (Exception localException)
    {
      localObject1 = new java/lang/Error;
      localObject2 = m54207b69.F54207b69_11("|r370102200457061E0E09252210282A24624E222B2B261C731E363B211C383A347A7C74423B2B40443E");
      ((Error)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  public Class getInterfaceClass()
  {
    return this.OooO0O0;
  }
  
  public String getLibraryName()
  {
    return this.OooO00o.getName();
  }
  
  public NativeLibrary getNativeLibrary()
  {
    return this.OooO00o;
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    Object localObject1 = OooO0o;
    boolean bool1 = ((Method)localObject1).equals(paramMethod);
    if (bool1)
    {
      paramObject = new java/lang/StringBuilder;
      paramObject.<init>();
      paramMethod = m54207b69.F54207b69_11("}f36150B21234B150F1A0C1E0B13121155221A58");
      paramObject.append(paramMethod);
      paramMethod = this.OooO00o;
      paramObject.append(paramMethod);
      return paramObject.toString();
    }
    localObject1 = OooO0oO;
    bool1 = ((Method)localObject1).equals(paramMethod);
    if (bool1) {
      return Integer.valueOf(hashCode());
    }
    localObject1 = OooO0oo;
    bool1 = ((Method)localObject1).equals(paramMethod);
    if (bool1)
    {
      boolean bool2 = false;
      paramObject = null;
      paramMethod = paramArrayOfObject[0];
      if (paramMethod != null)
      {
        paramArrayOfObject = paramMethod.getClass();
        boolean bool3 = Proxy.isProxyClass(paramArrayOfObject);
        if (bool3)
        {
          paramMethod = Proxy.getInvocationHandler(paramMethod);
          if (paramMethod == this) {
            bool2 = true;
          }
          return Function.o00Oo0(bool2);
        }
      }
      return Boolean.FALSE;
    }
    localObject1 = (Library.Handler.FunctionInfo)this.OooO0o0.get(paramMethod);
    if (localObject1 == null) {
      synchronized (this.OooO0o0)
      {
        localObject1 = this.OooO0o0;
        localObject1 = ((Map)localObject1).get(paramMethod);
        localObject1 = (Library.Handler.FunctionInfo)localObject1;
        if (localObject1 == null)
        {
          bool1 = ReflectionUtils.OooO0o0(paramMethod);
          if (!bool1)
          {
            boolean bool4 = Function.o00O0O(paramMethod);
            localObject1 = this.OooO0Oo;
            localObject3 = null;
            if (localObject1 != null)
            {
              localObject4 = this.OooO00o;
              localObject1 = ((InvocationMapper)localObject1).OooO00o((NativeLibrary)localObject4, paramMethod);
              localObject4 = localObject1;
            }
            else
            {
              localObject4 = null;
            }
            Object localObject7;
            if (localObject4 == null)
            {
              localObject1 = this.OooO00o;
              localObject3 = paramMethod.getName();
              localObject1 = ((NativeLibrary)localObject1).OooO((String)localObject3, paramMethod);
              localObject3 = paramMethod.getParameterTypes();
              localObject5 = new java/util/HashMap;
              localObject6 = this.OooO0OO;
              ((HashMap)localObject5).<init>((Map)localObject6);
              localObject6 = "d/46425B43484B474F0A4B5466534D59";
              localObject6 = m54207b69.F54207b69_11((String)localObject6);
              ((Map)localObject5).put(localObject6, paramMethod);
              localObject6 = localObject3;
              localObject7 = localObject5;
              localObject5 = localObject1;
            }
            else
            {
              localObject5 = null;
              localObject6 = null;
              localObject7 = null;
            }
            localObject1 = new com/sun/jna/Library$Handler$FunctionInfo;
            localObject3 = localObject1;
            ((Library.Handler.FunctionInfo)localObject1).<init>((InvocationHandler)localObject4, (Function)localObject5, (Class[])localObject6, bool4, localObject7);
          }
          else
          {
            localObject1 = new com/sun/jna/Library$Handler$FunctionInfo;
            localObject3 = ReflectionUtils.OooO0OO(paramMethod);
            ((Library.Handler.FunctionInfo)localObject1).<init>(localObject3);
          }
          localObject3 = this.OooO0o0;
          ((Map)localObject3).put(paramMethod, localObject1);
        }
      }
    }
    ??? = ((Library.Handler.FunctionInfo)localObject1).OooO0Oo;
    if (??? != null) {
      return ReflectionUtils.OooO0Oo(paramObject, ???, paramArrayOfObject);
    }
    boolean bool5 = ((Library.Handler.FunctionInfo)localObject1).OooO0OO;
    if (bool5) {
      paramArrayOfObject = Function.OooooO0(paramArrayOfObject);
    }
    Object localObject6 = paramArrayOfObject;
    paramArrayOfObject = ((Library.Handler.FunctionInfo)localObject1).OooO00o;
    if (paramArrayOfObject != null) {
      return paramArrayOfObject.invoke(paramObject, paramMethod, (Object[])localObject6);
    }
    ??? = ((Library.Handler.FunctionInfo)localObject1).OooO0O0;
    Object localObject4 = ((Library.Handler.FunctionInfo)localObject1).OooO0o;
    Object localObject5 = paramMethod.getReturnType();
    Map localMap = ((Library.Handler.FunctionInfo)localObject1).OooO0o0;
    Object localObject3 = paramMethod;
    return ((Function)???).Oooooo(paramMethod, (Class[])localObject4, (Class)localObject5, (Object[])localObject6, localMap);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.Library.Handler
 * JD-Core Version:    0.7.0.1
 */