package com.xuexiang.xhttp2.reflect;

import java.lang.reflect.Type;
import m54207b69;

public abstract class TypeToken
{
  public final Type OooO00o;
  
  public TypeToken()
  {
    Object localObject = getClass().getGenericSuperclass();
    boolean bool = localObject instanceof Class;
    if (!bool)
    {
      localObject = ((java.lang.reflect.ParameterizedType)localObject).getActualTypeArguments()[0];
      this.OooO00o = ((Type)localObject);
      return;
    }
    localObject = new com/xuexiang/xhttp2/reflect/TypeException;
    String str = m54207b69.F54207b69_11("r[15357D3F423A44303A41328649413C444F8B");
    ((TypeException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public Type getType()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Type)m54207b69.F54207b69_09(1362, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.reflect.TypeToken
 * JD-Core Version:    0.7.0.1
 */