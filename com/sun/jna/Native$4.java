package com.sun.jna;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;
import m54207b69;

final class Native$4
  implements PrivilegedAction
{
  public Method OooO00o()
  {
    Object localObject = ClassLoader.class;
    String str1 = "H\\3A36343B143A443545372F";
    try
    {
      str1 = m54207b69.F54207b69_11(str1);
      boolean bool = true;
      Class[] arrayOfClass = new Class[bool];
      String str2 = String.class;
      arrayOfClass[0] = str2;
      localObject = ((Class)localObject).getDeclaredMethod(str1, arrayOfClass);
      ((AccessibleObject)localObject).setAccessible(bool);
      return localObject;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.Native.4
 * JD-Core Version:    0.7.0.1
 */