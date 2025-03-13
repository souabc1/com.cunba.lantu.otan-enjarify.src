package androidx.lifecycle;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class ClassesInfoCache$MethodReference
{
  public final int OooO00o;
  public final Method OooO0O0;
  
  public ClassesInfoCache$MethodReference(int paramInt, Method paramMethod)
  {
    this.OooO00o = paramInt;
    this.OooO0O0 = paramMethod;
    paramMethod.setAccessible(true);
  }
  
  public void OooO00o(LifecycleOwner paramLifecycleOwner, Lifecycle.Event paramEvent, Object paramObject)
  {
    try
    {
      int i = this.OooO00o;
      if (i != 0)
      {
        int j = 1;
        if (i != j)
        {
          j = 2;
          if (i == j)
          {
            Method localMethod = this.OooO0O0;
            paramLifecycleOwner = new Object[] { paramLifecycleOwner, paramEvent };
            localMethod.invoke(paramObject, paramLifecycleOwner);
          }
        }
        else
        {
          paramEvent = this.OooO0O0;
          paramLifecycleOwner = new Object[] { paramLifecycleOwner };
          paramEvent.invoke(paramObject, paramLifecycleOwner);
        }
      }
      else
      {
        paramLifecycleOwner = this.OooO0O0;
        paramEvent = null;
        paramEvent = new Object[0];
        paramLifecycleOwner.invoke(paramObject, paramEvent);
      }
      return;
    }
    catch (IllegalAccessException paramLifecycleOwner)
    {
      paramEvent = new java/lang/RuntimeException;
      paramEvent.<init>(paramLifecycleOwner);
      throw paramEvent;
    }
    catch (InvocationTargetException paramLifecycleOwner)
    {
      paramEvent = new java/lang/RuntimeException;
      paramLifecycleOwner = paramLifecycleOwner.getCause();
      paramEvent.<init>("Failed to call observer method", paramLifecycleOwner);
      throw paramEvent;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof MethodReference;
    if (!bool2) {
      return false;
    }
    paramObject = (MethodReference)paramObject;
    int i = this.OooO00o;
    int j = paramObject.OooO00o;
    if (i == j)
    {
      String str = this.OooO0O0.getName();
      paramObject = paramObject.OooO0O0.getName();
      boolean bool3 = str.equals(paramObject);
      if (bool3) {}
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public int hashCode()
  {
    int i = this.OooO00o * 31;
    int j = this.OooO0O0.getName().hashCode();
    return i + j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ClassesInfoCache.MethodReference
 * JD-Core Version:    0.7.0.1
 */