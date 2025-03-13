package com.google.gson.reflect;

import com.google.gson.internal..Gson.Preconditions;
import com.google.gson.internal..Gson.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import m54207b69;

public class TypeToken
{
  final int hashCode;
  final Class rawType;
  final Type type;
  
  public TypeToken()
  {
    Type localType = getSuperclassTypeParameter(getClass());
    this.type = localType;
    Class localClass = .Gson.Types.getRawType(localType);
    this.rawType = localClass;
    int i = localType.hashCode();
    this.hashCode = i;
  }
  
  public TypeToken(Type paramType)
  {
    paramType = .Gson.Types.canonicalize((Type).Gson.Preconditions.checkNotNull(paramType));
    this.type = paramType;
    Class localClass = .Gson.Types.getRawType(paramType);
    this.rawType = localClass;
    int i = paramType.hashCode();
    this.hashCode = i;
  }
  
  private static AssertionError buildUnexpectedTypeError(Type paramType, Class... paramVarArgs)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    String str1 = m54207b69.F54207b69_11("EK1E2630363F332E463638754A3E483C747B1F454E423D554547843E404A88424C918C");
    localStringBuilder.<init>(str1);
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      String str2 = paramVarArgs[j].getName();
      localStringBuilder.append(str2);
      str2 = ", ";
      localStringBuilder.append(str2);
      j += 1;
    }
    paramVarArgs = m54207b69.F54207b69_11("La031517440A131B6249");
    localStringBuilder.append(paramVarArgs);
    paramVarArgs = paramType.getClass().getName();
    localStringBuilder.append(paramVarArgs);
    paramVarArgs = m54207b69.F54207b69_11("Nz565B1E180C5F140A12286419211E2D23506B");
    localStringBuilder.append(paramVarArgs);
    paramType = paramType.toString();
    localStringBuilder.append(paramType);
    localStringBuilder.append('.');
    paramType = new java/lang/AssertionError;
    paramVarArgs = localStringBuilder.toString();
    paramType.<init>(paramVarArgs);
    return paramType;
  }
  
  public static TypeToken get(Class paramClass)
  {
    TypeToken localTypeToken = new com/google/gson/reflect/TypeToken;
    localTypeToken.<init>(paramClass);
    return localTypeToken;
  }
  
  public static TypeToken get(Type paramType)
  {
    TypeToken localTypeToken = new com/google/gson/reflect/TypeToken;
    localTypeToken.<init>(paramType);
    return localTypeToken;
  }
  
  public static TypeToken getArray(Type paramType)
  {
    TypeToken localTypeToken = new com/google/gson/reflect/TypeToken;
    paramType = .Gson.Types.arrayOf(paramType);
    localTypeToken.<init>(paramType);
    return localTypeToken;
  }
  
  public static TypeToken getParameterized(Type paramType, Type... paramVarArgs)
  {
    TypeToken localTypeToken = new com/google/gson/reflect/TypeToken;
    paramType = .Gson.Types.newParameterizedTypeWithOwner(null, paramType, paramVarArgs);
    localTypeToken.<init>(paramType);
    return localTypeToken;
  }
  
  public static Type getSuperclassTypeParameter(Class paramClass)
  {
    paramClass = paramClass.getGenericSuperclass();
    boolean bool = paramClass instanceof Class;
    if (!bool) {
      return .Gson.Types.canonicalize(((ParameterizedType)paramClass).getActualTypeArguments()[0]);
    }
    paramClass = new java/lang/RuntimeException;
    String str = m54207b69.F54207b69_11("j?72574E4F5A565E26534F59652B5C6C5C6E636C5E6E6227");
    paramClass.<init>(str);
    throw paramClass;
  }
  
  private static boolean isAssignableFrom(Type paramType, GenericArrayType paramGenericArrayType)
  {
    paramGenericArrayType = paramGenericArrayType.getGenericComponentType();
    boolean bool = paramGenericArrayType instanceof ParameterizedType;
    if (bool)
    {
      bool = paramType instanceof GenericArrayType;
      if (bool)
      {
        paramType = ((GenericArrayType)paramType).getGenericComponentType();
      }
      else
      {
        bool = paramType instanceof Class;
        if (bool) {
          for (paramType = (Class)paramType;; paramType = paramType.getComponentType())
          {
            bool = paramType.isArray();
            if (!bool) {
              break;
            }
          }
        }
      }
      paramGenericArrayType = (ParameterizedType)paramGenericArrayType;
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      return isAssignableFrom(paramType, paramGenericArrayType, localHashMap);
    }
    return true;
  }
  
  private static boolean isAssignableFrom(Type paramType, ParameterizedType paramParameterizedType, Map paramMap)
  {
    int i = 0;
    HashMap localHashMap1 = null;
    if (paramType == null) {
      return false;
    }
    boolean bool1 = paramParameterizedType.equals(paramType);
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    Class localClass = .Gson.Types.getRawType(paramType);
    boolean bool3 = paramType instanceof ParameterizedType;
    boolean bool4;
    if (bool3)
    {
      paramType = (ParameterizedType)paramType;
    }
    else
    {
      bool4 = false;
      paramType = null;
    }
    TypeVariable[] arrayOfTypeVariable;
    HashMap localHashMap2;
    if (paramType != null)
    {
      Type[] arrayOfType = paramType.getActualTypeArguments();
      arrayOfTypeVariable = localClass.getTypeParameters();
      int k = 0;
      localHashMap2 = null;
      for (;;)
      {
        int m = arrayOfType.length;
        if (k >= m) {
          break;
        }
        Object localObject1 = arrayOfType[k];
        Object localObject2 = arrayOfTypeVariable[k];
        for (;;)
        {
          boolean bool5 = localObject1 instanceof TypeVariable;
          if (!bool5) {
            break;
          }
          localObject1 = ((TypeVariable)localObject1).getName();
          localObject1 = (Type)paramMap.get(localObject1);
        }
        localObject2 = ((TypeVariable)localObject2).getName();
        paramMap.put(localObject2, localObject1);
        k += 1;
      }
      bool4 = typeEquals(paramType, paramParameterizedType, paramMap);
      if (bool4) {
        return bool2;
      }
    }
    paramType = localClass.getGenericInterfaces();
    int j = paramType.length;
    while (i < j)
    {
      arrayOfTypeVariable = paramType[i];
      localHashMap2 = new java/util/HashMap;
      localHashMap2.<init>(paramMap);
      boolean bool6 = isAssignableFrom(arrayOfTypeVariable, paramParameterizedType, localHashMap2);
      if (bool6) {
        return bool2;
      }
      i += 1;
    }
    paramType = localClass.getGenericSuperclass();
    localHashMap1 = new java/util/HashMap;
    localHashMap1.<init>(paramMap);
    return isAssignableFrom(paramType, paramParameterizedType, localHashMap1);
  }
  
  private static boolean matches(Type paramType1, Type paramType2, Map paramMap)
  {
    boolean bool1 = paramType2.equals(paramType1);
    if (!bool1)
    {
      bool1 = paramType1 instanceof TypeVariable;
      if (bool1)
      {
        paramType1 = ((TypeVariable)paramType1).getName();
        paramType1 = paramMap.get(paramType1);
        bool2 = paramType2.equals(paramType1);
        if (bool2) {}
      }
      else
      {
        bool2 = false;
        paramType1 = null;
        break label63;
      }
    }
    boolean bool2 = true;
    label63:
    return bool2;
  }
  
  private static boolean typeEquals(ParameterizedType paramParameterizedType1, ParameterizedType paramParameterizedType2, Map paramMap)
  {
    Type localType1 = paramParameterizedType1.getRawType();
    Type localType2 = paramParameterizedType2.getRawType();
    int i = localType1.equals(localType2);
    localType2 = null;
    if (i != 0)
    {
      paramParameterizedType1 = paramParameterizedType1.getActualTypeArguments();
      paramParameterizedType2 = paramParameterizedType2.getActualTypeArguments();
      i = 0;
      localType1 = null;
      for (;;)
      {
        int k = paramParameterizedType1.length;
        if (i >= k) {
          break;
        }
        Type localType3 = paramParameterizedType1[i];
        Type localType4 = paramParameterizedType2[i];
        boolean bool = matches(localType3, localType4, paramMap);
        if (!bool) {
          return false;
        }
        int j;
        i += 1;
      }
      return true;
    }
    return false;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof TypeToken;
    if (bool1)
    {
      Type localType = this.type;
      paramObject = ((TypeToken)paramObject).type;
      bool2 = .Gson.Types.equals(localType, paramObject);
      if (bool2)
      {
        bool2 = true;
        break label45;
      }
    }
    boolean bool2 = false;
    paramObject = null;
    label45:
    return bool2;
  }
  
  public final Class getRawType()
  {
    return this.rawType;
  }
  
  public final Type getType()
  {
    return this.type;
  }
  
  public final int hashCode()
  {
    return this.hashCode;
  }
  
  public boolean isAssignableFrom(TypeToken paramTypeToken)
  {
    paramTypeToken = paramTypeToken.getType();
    return isAssignableFrom(paramTypeToken);
  }
  
  public boolean isAssignableFrom(Class paramClass)
  {
    return isAssignableFrom(paramClass);
  }
  
  public boolean isAssignableFrom(Type paramType)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    if (paramType == null) {
      return false;
    }
    Object localObject2 = this.type;
    boolean bool2 = localObject2.equals(paramType);
    boolean bool3 = true;
    if (bool2) {
      return bool3;
    }
    localObject2 = this.type;
    boolean bool4 = localObject2 instanceof Class;
    if (bool4)
    {
      localObject1 = this.rawType;
      paramType = .Gson.Types.getRawType(paramType);
      return ((Class)localObject1).isAssignableFrom(paramType);
    }
    bool4 = localObject2 instanceof ParameterizedType;
    if (bool4)
    {
      localObject2 = (ParameterizedType)localObject2;
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      return isAssignableFrom(paramType, (ParameterizedType)localObject2, (Map)localObject1);
    }
    bool4 = localObject2 instanceof GenericArrayType;
    if (bool4)
    {
      localObject2 = this.rawType;
      Class localClass = .Gson.Types.getRawType(paramType);
      bool2 = ((Class)localObject2).isAssignableFrom(localClass);
      if (bool2)
      {
        localObject2 = (GenericArrayType)this.type;
        boolean bool5 = isAssignableFrom(paramType, (GenericArrayType)localObject2);
        if (bool5) {
          bool1 = bool3;
        }
      }
      return bool1;
    }
    paramType = new Class[3];
    paramType[0] = Class.class;
    paramType[bool3] = ParameterizedType.class;
    paramType[2] = GenericArrayType.class;
    throw buildUnexpectedTypeError((Type)localObject2, paramType);
  }
  
  public final String toString()
  {
    return .Gson.Types.typeToString(this.type);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.reflect.TypeToken
 * JD-Core Version:    0.7.0.1
 */