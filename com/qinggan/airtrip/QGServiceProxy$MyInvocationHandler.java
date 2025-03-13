package com.qinggan.airtrip;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import m54207b69;

public class QGServiceProxy$MyInvocationHandler
  implements InvocationHandler
{
  public Object OooO00o;
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    paramObject = new java/lang/StringBuilder;
    paramObject.<init>();
    String str = m54207b69.F54207b69_11("s250585660445C0E19");
    paramObject.append(str);
    str = paramMethod.getName();
    paramObject.append(str);
    paramObject = this.OooO00o;
    paramObject = paramMethod.invoke(paramObject, paramArrayOfObject);
    paramArrayOfObject = new java/lang/StringBuilder;
    paramArrayOfObject.<init>();
    str = m54207b69.F54207b69_11("9{1A1E11210D4661");
    paramArrayOfObject.append(str);
    paramMethod = paramMethod.getName();
    paramArrayOfObject.append(paramMethod);
    return paramObject;
  }
  
  public void setSource(Object paramObject)
  {
    this.OooO00o = paramObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.QGServiceProxy.MyInvocationHandler
 * JD-Core Version:    0.7.0.1
 */