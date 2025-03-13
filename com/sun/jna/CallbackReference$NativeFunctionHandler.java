package com.sun.jna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import m54207b69;

class CallbackReference$NativeFunctionHandler
  implements InvocationHandler
{
  public final Function OooO00o;
  public final Map OooO0O0;
  
  public CallbackReference$NativeFunctionHandler(Pointer paramPointer, int paramInt, Map paramMap)
  {
    this.OooO0O0 = paramMap;
    Function localFunction = new com/sun/jna/Function;
    String str = m54207b69.F54207b69_11("fv050306221C16611A201E231D2B251F");
    paramMap = (String)paramMap.get(str);
    localFunction.<init>(paramPointer, paramInt, paramMap);
    this.OooO00o = localFunction;
  }
  
  public Pointer getPointer()
  {
    return this.OooO00o;
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    paramObject = Library.Handler.OooO0o;
    boolean bool1 = paramObject.equals(paramMethod);
    if (bool1)
    {
      paramObject = new java/lang/StringBuilder;
      paramObject.<init>();
      paramMethod = m54207b69.F54207b69_11("}f36150B21234B150F1A0C1E0B13121155221A58");
      paramObject.append(paramMethod);
      paramMethod = this.OooO00o;
      paramObject.append(paramMethod);
      paramObject = paramObject.toString();
      paramMethod = this.OooO0O0;
      paramArrayOfObject = m54207b69.F54207b69_11("d/46425B43484B474F0A4B5466534D59");
      paramMethod = CallbackReference.OooO0oO(((Method)paramMethod.get(paramArrayOfObject)).getDeclaringClass());
      paramArrayOfObject = new java/lang/StringBuilder;
      paramArrayOfObject.<init>();
      paramArrayOfObject.append(paramObject);
      paramArrayOfObject.append(" (");
      paramObject = paramMethod.getName();
      paramArrayOfObject.append(paramObject);
      paramArrayOfObject.append(")");
      return paramArrayOfObject.toString();
    }
    paramObject = Library.Handler.OooO0oO;
    bool1 = paramObject.equals(paramMethod);
    if (bool1) {
      return Integer.valueOf(hashCode());
    }
    paramObject = Library.Handler.OooO0oo;
    bool1 = paramObject.equals(paramMethod);
    if (bool1)
    {
      bool1 = false;
      paramObject = null;
      paramMethod = paramArrayOfObject[0];
      if (paramMethod != null)
      {
        paramArrayOfObject = paramMethod.getClass();
        boolean bool2 = Proxy.isProxyClass(paramArrayOfObject);
        if (bool2)
        {
          paramMethod = Proxy.getInvocationHandler(paramMethod);
          if (paramMethod == this) {
            bool1 = true;
          }
          return Function.o00Oo0(bool1);
        }
      }
      return Boolean.FALSE;
    }
    bool1 = Function.o00O0O(paramMethod);
    if (bool1) {
      paramArrayOfObject = Function.OooooO0(paramArrayOfObject);
    }
    paramObject = this.OooO00o;
    paramMethod = paramMethod.getReturnType();
    Map localMap = this.OooO0O0;
    return paramObject.Oooooo0(paramMethod, paramArrayOfObject, localMap);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.CallbackReference.NativeFunctionHandler
 * JD-Core Version:    0.7.0.1
 */