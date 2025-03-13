package com.google.gson.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import m54207b69;

public final class $Gson$Types
{
  static final Type[] EMPTY_TYPE_ARRAY = new Type[0];
  
  private $Gson$Types()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public static GenericArrayType arrayOf(Type paramType)
  {
    .Gson.Types.GenericArrayTypeImpl localGenericArrayTypeImpl = new com/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;
    localGenericArrayTypeImpl.<init>(paramType);
    return localGenericArrayTypeImpl;
  }
  
  public static Type canonicalize(Type paramType)
  {
    boolean bool = paramType instanceof Class;
    Object localObject1;
    if (bool)
    {
      paramType = (Class)paramType;
      bool = paramType.isArray();
      if (bool)
      {
        localObject1 = new com/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;
        paramType = canonicalize(paramType.getComponentType());
        ((.Gson.Types.GenericArrayTypeImpl)localObject1).<init>(paramType);
        paramType = (Type)localObject1;
      }
      return (Type)paramType;
    }
    bool = paramType instanceof ParameterizedType;
    Object localObject2;
    if (bool)
    {
      paramType = (ParameterizedType)paramType;
      localObject1 = new com/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;
      localObject2 = paramType.getOwnerType();
      Type localType = paramType.getRawType();
      paramType = paramType.getActualTypeArguments();
      ((.Gson.Types.ParameterizedTypeImpl)localObject1).<init>((Type)localObject2, localType, paramType);
      return localObject1;
    }
    bool = paramType instanceof GenericArrayType;
    if (bool)
    {
      paramType = (GenericArrayType)paramType;
      localObject1 = new com/google/gson/internal/$Gson$Types$GenericArrayTypeImpl;
      paramType = paramType.getGenericComponentType();
      ((.Gson.Types.GenericArrayTypeImpl)localObject1).<init>(paramType);
      return localObject1;
    }
    bool = paramType instanceof WildcardType;
    if (bool)
    {
      paramType = (WildcardType)paramType;
      localObject1 = new com/google/gson/internal/$Gson$Types$WildcardTypeImpl;
      localObject2 = paramType.getUpperBounds();
      paramType = paramType.getLowerBounds();
      ((.Gson.Types.WildcardTypeImpl)localObject1).<init>((Type[])localObject2, paramType);
      return localObject1;
    }
    return paramType;
  }
  
  public static void checkNotPrimitive(Type paramType)
  {
    boolean bool1 = paramType instanceof Class;
    if (bool1)
    {
      paramType = (Class)paramType;
      bool2 = paramType.isPrimitive();
      if (bool2)
      {
        bool2 = false;
        paramType = null;
        break label35;
      }
    }
    boolean bool2 = true;
    label35:
    .Gson.Preconditions.checkArgument(bool2);
  }
  
  private static Class declaringClassOf(TypeVariable paramTypeVariable)
  {
    paramTypeVariable = paramTypeVariable.getGenericDeclaration();
    boolean bool = paramTypeVariable instanceof Class;
    if (bool) {
      paramTypeVariable = (Class)paramTypeVariable;
    } else {
      paramTypeVariable = null;
    }
    return paramTypeVariable;
  }
  
  public static boolean equal(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != paramObject2) {
      if (paramObject1 != null)
      {
        bool = paramObject1.equals(paramObject2);
        if (bool) {}
      }
      else
      {
        bool = false;
        paramObject1 = null;
        return bool;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public static boolean equals(Type paramType1, Type paramType2)
  {
    boolean bool1 = true;
    if (paramType1 == paramType2) {
      return bool1;
    }
    boolean bool2 = paramType1 instanceof Class;
    if (bool2) {
      return paramType1.equals(paramType2);
    }
    bool2 = paramType1 instanceof ParameterizedType;
    Object localObject1;
    Object localObject2;
    boolean bool3;
    if (bool2)
    {
      bool2 = paramType2 instanceof ParameterizedType;
      if (!bool2) {
        return false;
      }
      paramType1 = (ParameterizedType)paramType1;
      paramType2 = (ParameterizedType)paramType2;
      localObject1 = paramType1.getOwnerType();
      localObject2 = paramType2.getOwnerType();
      bool2 = equal(localObject1, localObject2);
      if (bool2)
      {
        localObject1 = paramType1.getRawType();
        localObject2 = paramType2.getRawType();
        bool2 = localObject1.equals(localObject2);
        if (bool2)
        {
          paramType1 = paramType1.getActualTypeArguments();
          paramType2 = paramType2.getActualTypeArguments();
          bool3 = Arrays.equals(paramType1, paramType2);
          if (bool3) {
            break label141;
          }
        }
      }
      bool1 = false;
      label141:
      return bool1;
    }
    bool2 = paramType1 instanceof GenericArrayType;
    if (bool2)
    {
      bool1 = paramType2 instanceof GenericArrayType;
      if (!bool1) {
        return false;
      }
      paramType1 = (GenericArrayType)paramType1;
      paramType2 = (GenericArrayType)paramType2;
      paramType1 = paramType1.getGenericComponentType();
      paramType2 = paramType2.getGenericComponentType();
      return equals(paramType1, paramType2);
    }
    bool2 = paramType1 instanceof WildcardType;
    if (bool2)
    {
      bool2 = paramType2 instanceof WildcardType;
      if (!bool2) {
        return false;
      }
      paramType1 = (WildcardType)paramType1;
      paramType2 = (WildcardType)paramType2;
      localObject1 = paramType1.getUpperBounds();
      localObject2 = paramType2.getUpperBounds();
      bool2 = Arrays.equals((Object[])localObject1, (Object[])localObject2);
      if (bool2)
      {
        paramType1 = paramType1.getLowerBounds();
        paramType2 = paramType2.getLowerBounds();
        bool3 = Arrays.equals(paramType1, paramType2);
        if (bool3) {}
      }
      else
      {
        bool1 = false;
      }
      return bool1;
    }
    bool2 = paramType1 instanceof TypeVariable;
    if (bool2)
    {
      bool2 = paramType2 instanceof TypeVariable;
      if (!bool2) {
        return false;
      }
      paramType1 = (TypeVariable)paramType1;
      paramType2 = (TypeVariable)paramType2;
      localObject1 = paramType1.getGenericDeclaration();
      localObject2 = paramType2.getGenericDeclaration();
      if (localObject1 == localObject2)
      {
        paramType1 = paramType1.getName();
        paramType2 = paramType2.getName();
        bool3 = paramType1.equals(paramType2);
        if (bool3) {}
      }
      else
      {
        bool1 = false;
      }
      return bool1;
    }
    return false;
  }
  
  public static Type getArrayComponentType(Type paramType)
  {
    boolean bool = paramType instanceof GenericArrayType;
    if (bool) {
      paramType = ((GenericArrayType)paramType).getGenericComponentType();
    } else {
      paramType = ((Class)paramType).getComponentType();
    }
    return paramType;
  }
  
  public static Type getCollectionElementType(Type paramType, Class paramClass)
  {
    paramType = getSupertype(paramType, paramClass, Collection.class);
    boolean bool = paramType instanceof WildcardType;
    if (bool) {
      paramType = ((WildcardType)paramType).getUpperBounds()[0];
    }
    bool = paramType instanceof ParameterizedType;
    if (bool) {
      return ((ParameterizedType)paramType).getActualTypeArguments()[0];
    }
    return Object.class;
  }
  
  public static Type getGenericSupertype(Type paramType, Class paramClass1, Class paramClass2)
  {
    if (paramClass2 == paramClass1) {
      return paramType;
    }
    boolean bool1 = paramClass2.isInterface();
    if (bool1)
    {
      paramType = paramClass1.getInterfaces();
      int i = paramType.length;
      int j = 0;
      while (j < i)
      {
        Class localClass = paramType[j];
        if (localClass == paramClass2) {
          return paramClass1.getGenericInterfaces()[j];
        }
        boolean bool3 = paramClass2.isAssignableFrom(localClass);
        if (bool3)
        {
          paramClass1 = paramClass1.getGenericInterfaces()[j];
          paramType = paramType[j];
          return getGenericSupertype(paramClass1, paramType, paramClass2);
        }
        j += 1;
      }
    }
    bool1 = paramClass1.isInterface();
    if (!bool1) {
      for (;;)
      {
        paramType = Object.class;
        if (paramClass1 == paramType) {
          break;
        }
        paramType = paramClass1.getSuperclass();
        if (paramType == paramClass2) {
          return paramClass1.getGenericSuperclass();
        }
        boolean bool2 = paramClass2.isAssignableFrom(paramType);
        if (bool2) {
          return getGenericSupertype(paramClass1.getGenericSuperclass(), paramType, paramClass2);
        }
        paramClass1 = paramType;
      }
    }
    return paramClass2;
  }
  
  public static Type[] getMapKeyAndValueTypes(Type paramType, Class paramClass)
  {
    Object localObject = Properties.class;
    int i = 1;
    int j = 2;
    if (paramType == localObject)
    {
      paramType = new Type[j];
      paramClass = String.class;
      paramType[0] = paramClass;
      paramType[i] = paramClass;
      return paramType;
    }
    localObject = Map.class;
    paramType = getSupertype(paramType, paramClass, (Class)localObject);
    boolean bool = paramType instanceof ParameterizedType;
    if (bool) {
      return ((ParameterizedType)paramType).getActualTypeArguments();
    }
    paramType = new Type[j];
    paramClass = Object.class;
    paramType[0] = paramClass;
    paramType[i] = paramClass;
    return paramType;
  }
  
  public static Class getRawType(Type paramType)
  {
    boolean bool = paramType instanceof Class;
    if (bool) {
      return (Class)paramType;
    }
    bool = paramType instanceof ParameterizedType;
    if (bool)
    {
      paramType = ((ParameterizedType)paramType).getRawType();
      .Gson.Preconditions.checkArgument(paramType instanceof Class);
      return (Class)paramType;
    }
    bool = paramType instanceof GenericArrayType;
    IllegalArgumentException localIllegalArgumentException = null;
    if (bool) {
      return Array.newInstance(getRawType(((GenericArrayType)paramType).getGenericComponentType()), 0).getClass();
    }
    bool = paramType instanceof TypeVariable;
    if (bool) {
      return Object.class;
    }
    bool = paramType instanceof WildcardType;
    if (bool) {
      return getRawType(((WildcardType)paramType).getUpperBounds()[0]);
    }
    String str1;
    if (paramType == null) {
      str1 = m54207b69.F54207b69_11("C?514B5556");
    } else {
      str1 = paramType.getClass().getName();
    }
    localIllegalArgumentException = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = m54207b69.F54207b69_11("(?7A48515D60506062276729875F6B5A5B2330817161736871637367716177798A66707C3643757346A0837B8579838AAD7D7E90799F7B85914B589785875C41");
    localStringBuilder.append(str2);
    localStringBuilder.append(paramType);
    paramType = m54207b69.F54207b69_11("Qb5C430D1446120A491E241C124E");
    localStringBuilder.append(paramType);
    localStringBuilder.append(str1);
    paramType = localStringBuilder.toString();
    localIllegalArgumentException.<init>(paramType);
    throw localIllegalArgumentException;
  }
  
  public static Type getSupertype(Type paramType, Class paramClass1, Class paramClass2)
  {
    boolean bool = paramType instanceof WildcardType;
    if (bool)
    {
      paramType = ((WildcardType)paramType).getUpperBounds();
      bool = false;
      paramType = paramType[0];
    }
    .Gson.Preconditions.checkArgument(paramClass2.isAssignableFrom(paramClass1));
    paramClass2 = getGenericSupertype(paramType, paramClass1, paramClass2);
    return resolve(paramType, paramClass1, paramClass2);
  }
  
  public static int hashCodeOrZero(Object paramObject)
  {
    int i;
    if (paramObject != null)
    {
      i = paramObject.hashCode();
    }
    else
    {
      i = 0;
      paramObject = null;
    }
    return i;
  }
  
  private static int indexOf(Object[] paramArrayOfObject, Object paramObject)
  {
    int i = paramArrayOfObject.length;
    int j = 0;
    while (j < i)
    {
      Object localObject = paramArrayOfObject[j];
      boolean bool = paramObject.equals(localObject);
      if (bool) {
        return j;
      }
      j += 1;
    }
    paramArrayOfObject = new java/util/NoSuchElementException;
    paramArrayOfObject.<init>();
    throw paramArrayOfObject;
  }
  
  public static ParameterizedType newParameterizedTypeWithOwner(Type paramType1, Type paramType2, Type... paramVarArgs)
  {
    .Gson.Types.ParameterizedTypeImpl localParameterizedTypeImpl = new com/google/gson/internal/$Gson$Types$ParameterizedTypeImpl;
    localParameterizedTypeImpl.<init>(paramType1, paramType2, paramVarArgs);
    return localParameterizedTypeImpl;
  }
  
  public static Type resolve(Type paramType1, Class paramClass, Type paramType2)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    return resolve(paramType1, paramClass, paramType2, localHashSet);
  }
  
  private static Type resolve(Type paramType1, Class paramClass, Type paramType2, Collection paramCollection)
  {
    Object localObject1;
    do
    {
      bool = paramType2 instanceof TypeVariable;
      if (!bool) {
        break;
      }
      localObject1 = paramType2;
      localObject1 = (TypeVariable)paramType2;
      j = paramCollection.contains(localObject1);
      if (j != 0) {
        return (Type)paramType2;
      }
      paramCollection.add(localObject1);
      paramType2 = resolveTypeVariable(paramType1, paramClass, (TypeVariable)localObject1);
    } while (paramType2 != localObject1);
    return paramType2;
    boolean bool = paramType2 instanceof Class;
    if (bool)
    {
      localObject1 = paramType2;
      localObject1 = (Class)paramType2;
      j = ((Class)localObject1).isArray();
      if (j != 0)
      {
        paramType2 = ((Class)localObject1).getComponentType();
        paramType1 = resolve(paramType1, paramClass, paramType2, paramCollection);
        if (paramType2 != paramType1) {
          localObject1 = arrayOf(paramType1);
        }
        return localObject1;
      }
    }
    bool = paramType2 instanceof GenericArrayType;
    if (bool)
    {
      paramType2 = (GenericArrayType)paramType2;
      localObject1 = paramType2.getGenericComponentType();
      paramType1 = resolve(paramType1, paramClass, (Type)localObject1, paramCollection);
      if (localObject1 != paramType1) {
        paramType2 = arrayOf(paramType1);
      }
      return paramType2;
    }
    bool = paramType2 instanceof ParameterizedType;
    int j = 1;
    int k = 0;
    Object localObject2;
    if (bool)
    {
      paramType2 = (ParameterizedType)paramType2;
      localObject1 = paramType2.getOwnerType();
      localObject2 = resolve(paramType1, paramClass, (Type)localObject1, paramCollection);
      if (localObject2 != localObject1)
      {
        bool = j;
      }
      else
      {
        bool = false;
        localObject1 = null;
      }
      Object localObject3 = paramType2.getActualTypeArguments();
      int m = localObject3.length;
      while (k < m)
      {
        Type localType1 = localObject3[k];
        localType1 = resolve(paramType1, paramClass, localType1, paramCollection);
        Object localObject4 = localObject3[k];
        if (localType1 != localObject4)
        {
          if (!bool)
          {
            localObject1 = ((Type[])localObject3).clone();
            localObject3 = localObject1;
            localObject3 = (Type[])localObject1;
            bool = j;
          }
          localObject3[k] = localType1;
        }
        k += 1;
      }
      if (bool)
      {
        paramType1 = paramType2.getRawType();
        paramType2 = newParameterizedTypeWithOwner((Type)localObject2, paramType1, (Type[])localObject3);
      }
      return paramType2;
    }
    bool = paramType2 instanceof WildcardType;
    if (bool)
    {
      paramType2 = (WildcardType)paramType2;
      localObject1 = paramType2.getLowerBounds();
      localObject2 = paramType2.getUpperBounds();
      int n = localObject1.length;
      if (n == j)
      {
        Type localType2 = localObject1[0];
        paramType1 = resolve(paramType1, paramClass, localType2, paramCollection);
        paramClass = localObject1[0];
        if (paramType1 != paramClass) {
          return supertypeOf(paramType1);
        }
      }
      else
      {
        int i = localObject2.length;
        if (i == j)
        {
          localObject1 = localObject2[0];
          paramType1 = resolve(paramType1, paramClass, (Type)localObject1, paramCollection);
          paramClass = localObject2[0];
          if (paramType1 != paramClass) {
            return subtypeOf(paramType1);
          }
        }
      }
    }
    return (Type)paramType2;
  }
  
  public static Type resolveTypeVariable(Type paramType, Class paramClass, TypeVariable paramTypeVariable)
  {
    Class localClass = declaringClassOf(paramTypeVariable);
    if (localClass == null) {
      return paramTypeVariable;
    }
    paramType = getGenericSupertype(paramType, paramClass, localClass);
    boolean bool = paramType instanceof ParameterizedType;
    if (bool)
    {
      int i = indexOf(localClass.getTypeParameters(), paramTypeVariable);
      return ((ParameterizedType)paramType).getActualTypeArguments()[i];
    }
    return paramTypeVariable;
  }
  
  public static WildcardType subtypeOf(Type paramType)
  {
    boolean bool = paramType instanceof WildcardType;
    if (bool)
    {
      paramType = ((WildcardType)paramType).getUpperBounds();
    }
    else
    {
      bool = true;
      localObject = new Type[bool];
      arrayOfType = null;
      localObject[0] = paramType;
      paramType = (Type)localObject;
    }
    Object localObject = new com/google/gson/internal/$Gson$Types$WildcardTypeImpl;
    Type[] arrayOfType = EMPTY_TYPE_ARRAY;
    ((.Gson.Types.WildcardTypeImpl)localObject).<init>(paramType, arrayOfType);
    return localObject;
  }
  
  public static WildcardType supertypeOf(Type paramType)
  {
    boolean bool = paramType instanceof WildcardType;
    int i = 1;
    if (bool)
    {
      paramType = ((WildcardType)paramType).getLowerBounds();
    }
    else
    {
      localObject = new Type[i];
      localObject[0] = paramType;
      paramType = (Type)localObject;
    }
    Object localObject = new com/google/gson/internal/$Gson$Types$WildcardTypeImpl;
    Type[] arrayOfType = new Type[i];
    arrayOfType[0] = Object.class;
    ((.Gson.Types.WildcardTypeImpl)localObject).<init>(arrayOfType, paramType);
    return localObject;
  }
  
  public static String typeToString(Type paramType)
  {
    boolean bool = paramType instanceof Class;
    if (bool) {
      paramType = ((Class)paramType).getName();
    } else {
      paramType = paramType.toString();
    }
    return paramType;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal..Gson.Types
 * JD-Core Version:    0.7.0.1
 */