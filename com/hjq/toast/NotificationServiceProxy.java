package com.hjq.toast;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import m54207b69;

final class NotificationServiceProxy
  implements InvocationHandler
{
  public final Object OooO00o;
  
  public NotificationServiceProxy(Object paramObject)
  {
    this.OooO00o = paramObject;
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    paramObject = paramMethod.getName();
    paramObject.hashCode();
    int i = paramObject.hashCode();
    int j = -1;
    String str;
    boolean bool;
    switch (i)
    {
    default: 
      break;
    case 1967758591: 
      str = m54207b69.F54207b69_11("6_3A32302D3E2F401238473636");
      bool = paramObject.equals(str);
      if (bool) {
        j = 2;
      }
      break;
    case 1230397970: 
      str = m54207b69.F54207b69_11("VS363E24293A2B3C0E443B2A322238");
      bool = paramObject.equals(str);
      if (bool) {
        j = 1;
      }
      break;
    case -1581943859: 
      str = m54207b69.F54207b69_11("_h0B0A080E1109420E112426");
      bool = paramObject.equals(str);
      if (bool) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      break;
    case 0: 
    case 1: 
    case 2: 
      paramObject = m54207b69.F54207b69_11(")l0D030A21070A0E");
      paramArrayOfObject[0] = paramObject;
    }
    paramObject = this.OooO00o;
    return paramMethod.invoke(paramObject, paramArrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.toast.NotificationServiceProxy
 * JD-Core Version:    0.7.0.1
 */