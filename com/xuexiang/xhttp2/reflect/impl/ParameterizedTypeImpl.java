package com.xuexiang.xhttp2.reflect.impl;

import com.xuexiang.xhttp2.reflect.TypeException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import m54207b69;

public class ParameterizedTypeImpl
  implements ParameterizedType
{
  public final Class o00OoOoo;
  public final Type o00Ooo0;
  public final Type[] o00Ooo00;
  
  public ParameterizedTypeImpl(Class paramClass, Type[] paramArrayOfType, Type paramType)
  {
    this.o00OoOoo = paramClass;
    if (paramArrayOfType == null)
    {
      paramClass = null;
      paramArrayOfType = new Type[0];
    }
    this.o00Ooo00 = paramArrayOfType;
    this.o00Ooo0 = paramType;
    OooO00o();
  }
  
  public final void OooO00o()
  {
    Object localObject1 = this.o00OoOoo;
    if (localObject1 != null)
    {
      localObject1 = ((Class)localObject1).getTypeParameters();
      localObject2 = this.o00Ooo00;
      int i = localObject2.length;
      if (i != 0)
      {
        i = localObject1.length;
        int j = localObject2.length;
        if (i != j)
        {
          localObject2 = new com/xuexiang/xhttp2/reflect/TypeException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str = this.o00OoOoo.getName();
          localStringBuilder.append(str);
          str = m54207b69.F54207b69_11("T)094D535C504F6310");
          localStringBuilder.append(str);
          int k = localObject1.length;
          localStringBuilder.append(k);
          localObject1 = m54207b69.F54207b69_11("5a410115094D174E54490F18204D");
          localStringBuilder.append((String)localObject1);
          k = this.o00Ooo00.length;
          localStringBuilder.append(k);
          localObject1 = localStringBuilder.toString();
          ((TypeException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
        }
      }
      return;
    }
    localObject1 = new com/xuexiang/xhttp2/reflect/TypeException;
    Object localObject2 = m54207b69.F54207b69_11(":I3B29406C2E2A2E4142723433337B4B783B3D7B3A503A3B");
    ((TypeException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public boolean equals(Object paramObject)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramObject;
    return m54207b69.F54207b69_01(1364, arrayOfObject);
  }
  
  public Type[] getActualTypeArguments()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Type[])m54207b69.F54207b69_09(1365, arrayOfObject);
  }
  
  public Type getOwnerType()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Type)m54207b69.F54207b69_09(1366, arrayOfObject);
  }
  
  public Type getRawType()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Type)m54207b69.F54207b69_09(1367, arrayOfObject);
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1368, arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = this.o00OoOoo.getName();
    localStringBuilder.append((String)localObject1);
    localObject1 = this.o00Ooo00;
    int i = localObject1.length;
    if (i != 0)
    {
      localStringBuilder.append('<');
      i = 0;
      localObject1 = null;
      int j = 0;
      for (;;)
      {
        Object localObject2 = this.o00Ooo00;
        int k = localObject2.length;
        if (j >= k) {
          break;
        }
        if (j != 0)
        {
          localObject2 = ", ";
          localStringBuilder.append((String)localObject2);
        }
        localObject2 = this.o00Ooo00[j];
        boolean bool1 = localObject2 instanceof Class;
        if (!bool1) {}
        for (localObject2 = localObject2.toString();; localObject2 = ((Class)localObject2).getName())
        {
          localStringBuilder.append((String)localObject2);
          break label216;
          localObject2 = (Class)localObject2;
          bool1 = ((Class)localObject2).isArray();
          if (bool1) {
            break;
          }
        }
        bool1 = false;
        int m;
        boolean bool2;
        do
        {
          bool1 += true;
          localObject2 = ((Class)localObject2).getComponentType();
          bool2 = ((Class)localObject2).isArray();
        } while (bool2);
        localObject2 = ((Class)localObject2).getName();
        localStringBuilder.append((String)localObject2);
        while (m > 0)
        {
          localObject2 = "[]";
          localStringBuilder.append((String)localObject2);
          m += -1;
        }
        label216:
        j += 1;
      }
      i = 62;
      localStringBuilder.append(i);
    }
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.reflect.impl.ParameterizedTypeImpl
 * JD-Core Version:    0.7.0.1
 */