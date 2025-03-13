package com.xuexiang.xrouter.model;

import java.lang.reflect.Type;
import m54207b69;

public class TypeWrapper
{
  public final Type OooO00o;
  
  public TypeWrapper()
  {
    Type localType = ((java.lang.reflect.ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    this.OooO00o = localType;
  }
  
  public Type getType()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Type)m54207b69.F54207b69_09(1842, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xrouter.model.TypeWrapper
 * JD-Core Version:    0.7.0.1
 */