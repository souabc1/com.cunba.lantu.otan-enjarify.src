package com.sun.jna;

import java.lang.reflect.Method;
import m54207b69;

abstract class VarArgsChecker
{
  public static VarArgsChecker OooO00o()
  {
    Object localObject = Method.class;
    String str = "*/465D7B516173634F64";
    try
    {
      str = m54207b69.F54207b69_11(str);
      Class[] arrayOfClass = null;
      arrayOfClass = new Class[0];
      localObject = ((Class)localObject).getMethod(str, arrayOfClass);
      if (localObject != null)
      {
        localObject = new com/sun/jna/VarArgsChecker$RealVarArgsChecker;
        ((VarArgsChecker.RealVarArgsChecker)localObject).<init>(null);
        return localObject;
      }
      localObject = new com/sun/jna/VarArgsChecker$NoVarArgsChecker;
      ((VarArgsChecker.NoVarArgsChecker)localObject).<init>(null);
      return localObject;
    }
    catch (SecurityException localSecurityException)
    {
      localObject = new com/sun/jna/VarArgsChecker$NoVarArgsChecker;
      ((VarArgsChecker.NoVarArgsChecker)localObject).<init>(null);
      return localObject;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localObject = new com/sun/jna/VarArgsChecker$NoVarArgsChecker;
      ((VarArgsChecker.NoVarArgsChecker)localObject).<init>(null);
    }
    return localObject;
  }
  
  public abstract int OooO0O0(Method paramMethod);
  
  public abstract boolean OooO0OO(Method paramMethod);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.VarArgsChecker
 * JD-Core Version:    0.7.0.1
 */