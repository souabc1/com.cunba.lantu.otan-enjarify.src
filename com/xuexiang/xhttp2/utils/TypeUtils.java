package com.xuexiang.xhttp2.utils;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m54207b69;

public final class TypeUtils
{
  private TypeUtils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static Type OooO(Type paramType, int paramInt)
  {
    boolean bool = paramType instanceof ParameterizedType;
    if (bool) {
      return ((ParameterizedType)paramType).getActualTypeArguments()[paramInt];
    }
    paramInt = paramType instanceof TypeVariable;
    if (paramInt != 0)
    {
      paramType = ((TypeVariable)paramType).getBounds();
      paramInt = 0;
      paramType = OooOO0(paramType[0], 0);
    }
    return paramType;
  }
  
  public static Type OooO00o(Class paramClass)
  {
    paramClass = ((ParameterizedType)paramClass.getGenericSuperclass()).getActualTypeArguments();
    Type localType = paramClass[0];
    int i = paramClass.length;
    int j = 1;
    if (i > j)
    {
      boolean bool = localType instanceof ParameterizedType;
      if (bool)
      {
        paramClass = ((ParameterizedType)localType).getActualTypeArguments();
        localType = paramClass[0];
      }
      else
      {
        paramClass = new java/lang/IllegalStateException;
        paramClass.<init>("没有填写泛型参数");
        throw paramClass;
      }
    }
    return localType;
  }
  
  public static Type OooO0O0(Class paramClass)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramClass;
    return (Type)m54207b69.F54207b69_09(1539, arrayOfObject);
  }
  
  public static Type OooO0OO(Class paramClass)
  {
    return OooO0oo((ParameterizedType)paramClass.getGenericSuperclass(), 0);
  }
  
  public static List OooO0Oo(Class paramClass)
  {
    paramClass = paramClass.getGenericSuperclass();
    boolean bool1 = paramClass instanceof ParameterizedType;
    if (bool1)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      paramClass = ((ParameterizedType)paramClass).getActualTypeArguments();
      int i = paramClass.length;
      int j = 0;
      while (j < i)
      {
        Object localObject = paramClass[j];
        localArrayList.add(localObject);
        boolean bool2 = localObject instanceof ParameterizedType;
        if (bool2)
        {
          localObject = ((ParameterizedType)localObject).getActualTypeArguments();
          Collections.addAll(localArrayList, (Object[])localObject);
        }
        j += 1;
      }
    }
    bool1 = false;
    ArrayList localArrayList = null;
    return localArrayList;
  }
  
  public static Class[] OooO0o(Object... paramVarArgs)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramVarArgs;
    return (Class[])m54207b69.F54207b69_09(1542, arrayOfObject);
  }
  
  public static Class OooO0o0(Type paramType, int paramInt)
  {
    boolean bool = paramType instanceof ParameterizedType;
    if (bool) {
      return OooO0oO((ParameterizedType)paramType, paramInt);
    }
    paramInt = paramType instanceof TypeVariable;
    if (paramInt != 0) {
      return OooO0o0(((TypeVariable)paramType).getBounds()[0], 0);
    }
    return (Class)paramType;
  }
  
  public static Class OooO0oO(ParameterizedType paramParameterizedType, int paramInt)
  {
    paramParameterizedType = paramParameterizedType.getActualTypeArguments()[paramInt];
    paramInt = paramParameterizedType instanceof ParameterizedType;
    if (paramInt != 0) {
      return (Class)((ParameterizedType)paramParameterizedType).getRawType();
    }
    paramInt = paramParameterizedType instanceof GenericArrayType;
    if (paramInt != 0) {
      return (Class)((GenericArrayType)paramParameterizedType).getGenericComponentType();
    }
    paramInt = paramParameterizedType instanceof TypeVariable;
    if (paramInt != 0) {
      return OooO0o0(((TypeVariable)paramParameterizedType).getBounds()[0], 0);
    }
    return (Class)paramParameterizedType;
  }
  
  public static Type OooO0oo(ParameterizedType paramParameterizedType, int paramInt)
  {
    paramParameterizedType = paramParameterizedType.getActualTypeArguments()[paramInt];
    paramInt = paramParameterizedType instanceof ParameterizedType;
    if (paramInt != 0) {
      return ((ParameterizedType)paramParameterizedType).getRawType();
    }
    paramInt = paramParameterizedType instanceof GenericArrayType;
    if (paramInt != 0) {
      return ((GenericArrayType)paramParameterizedType).getGenericComponentType();
    }
    paramInt = paramParameterizedType instanceof TypeVariable;
    if (paramInt != 0)
    {
      paramParameterizedType = ((TypeVariable)paramParameterizedType).getBounds();
      paramInt = 0;
      paramParameterizedType = OooO0o0(paramParameterizedType[0], 0);
    }
    return paramParameterizedType;
  }
  
  public static Type OooOO0(Type paramType, int paramInt)
  {
    boolean bool = paramType instanceof ParameterizedType;
    if (bool) {
      return OooO0oo((ParameterizedType)paramType, paramInt);
    }
    paramInt = paramType instanceof TypeVariable;
    if (paramInt != 0)
    {
      paramType = ((TypeVariable)paramType).getBounds();
      paramInt = 0;
      paramType = OooOO0(paramType[0], 0);
    }
    return paramType;
  }
  
  public static Object OooOO0O(Class paramClass, Object... paramVarArgs)
  {
    Class[] arrayOfClass = OooO0o(paramVarArgs);
    paramClass = paramClass.getDeclaredConstructor(arrayOfClass);
    paramClass.setAccessible(true);
    return paramClass.newInstance(paramVarArgs);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.utils.TypeUtils
 * JD-Core Version:    0.7.0.1
 */