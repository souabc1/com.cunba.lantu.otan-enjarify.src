package com.sun.jna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

final class Native$3
  implements InvocationHandler
{
  public Object invoke(Object arg1, Method paramMethod, Object[] paramArrayOfObject)
  {
    synchronized (this.OooO00o.getNativeLibrary())
    {
      Library.Handler localHandler = this.OooO00o;
      Library localLibrary = this.OooO0O0;
      paramMethod = localHandler.invoke(localLibrary, paramMethod, paramArrayOfObject);
      return paramMethod;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.Native.3
 * JD-Core Version:    0.7.0.1
 */