package com.xuexiang.xhttp2.reflect.impl;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import m54207b69;

public class WildcardTypeImpl
  implements WildcardType
{
  public final Class[] o00OoOoo;
  public final Class[] o00Ooo00;
  
  public final String OooO00o(String paramString, Class[] paramArrayOfClass)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(paramString);
    int i = 0;
    paramString = null;
    for (;;)
    {
      int j = paramArrayOfClass.length;
      if (i >= j) {
        break;
      }
      if (i != 0)
      {
        str = " & ";
        localStringBuilder.append(str);
      }
      String str = paramArrayOfClass[i].getName();
      localStringBuilder.append(str);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public boolean equals(Object paramObject)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramObject;
    return m54207b69.F54207b69_01(1371, arrayOfObject);
  }
  
  public Type[] getLowerBounds()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Type[])m54207b69.F54207b69_09(1372, arrayOfObject);
  }
  
  public Type[] getUpperBounds()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Type[])m54207b69.F54207b69_09(1373, arrayOfObject);
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1374, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1375, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.reflect.impl.WildcardTypeImpl
 * JD-Core Version:    0.7.0.1
 */