package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.internal.reflect.ReflectionAccessor;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class ConstructorConstructor
{
  private final ReflectionAccessor accessor;
  private final Map instanceCreators;
  
  public ConstructorConstructor(Map paramMap)
  {
    ReflectionAccessor localReflectionAccessor = ReflectionAccessor.getInstance();
    this.accessor = localReflectionAccessor;
    this.instanceCreators = paramMap;
  }
  
  private ObjectConstructor newDefaultConstructor(Class paramClass)
  {
    boolean bool = false;
    Object localObject = null;
    try
    {
      localObject = new Class[0];
      paramClass = paramClass.getDeclaredConstructor((Class[])localObject);
      bool = paramClass.isAccessible();
      if (!bool)
      {
        localObject = this.accessor;
        ((ReflectionAccessor)localObject).makeAccessible(paramClass);
      }
      localObject = new com/google/gson/internal/ConstructorConstructor$3;
      ((ConstructorConstructor.3)localObject).<init>(this, paramClass);
      return localObject;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
    return null;
  }
  
  private ObjectConstructor newDefaultImplementationConstructor(Type paramType, Class paramClass)
  {
    Object localObject = Collection.class;
    boolean bool1 = ((Class)localObject).isAssignableFrom(paramClass);
    boolean bool2;
    if (bool1)
    {
      localObject = SortedSet.class;
      bool1 = ((Class)localObject).isAssignableFrom(paramClass);
      if (bool1)
      {
        paramType = new com/google/gson/internal/ConstructorConstructor$4;
        paramType.<init>(this);
        return paramType;
      }
      localObject = EnumSet.class;
      bool1 = ((Class)localObject).isAssignableFrom(paramClass);
      if (bool1)
      {
        paramClass = new com/google/gson/internal/ConstructorConstructor$5;
        paramClass.<init>(this, paramType);
        return paramClass;
      }
      paramType = Set.class;
      bool2 = paramType.isAssignableFrom(paramClass);
      if (bool2)
      {
        paramType = new com/google/gson/internal/ConstructorConstructor$6;
        paramType.<init>(this);
        return paramType;
      }
      paramType = Queue.class;
      bool2 = paramType.isAssignableFrom(paramClass);
      if (bool2)
      {
        paramType = new com/google/gson/internal/ConstructorConstructor$7;
        paramType.<init>(this);
        return paramType;
      }
      paramType = new com/google/gson/internal/ConstructorConstructor$8;
      paramType.<init>(this);
      return paramType;
    }
    localObject = Map.class;
    bool1 = ((Class)localObject).isAssignableFrom(paramClass);
    if (bool1)
    {
      localObject = ConcurrentNavigableMap.class;
      bool1 = ((Class)localObject).isAssignableFrom(paramClass);
      if (bool1)
      {
        paramType = new com/google/gson/internal/ConstructorConstructor$9;
        paramType.<init>(this);
        return paramType;
      }
      localObject = ConcurrentMap.class;
      bool1 = ((Class)localObject).isAssignableFrom(paramClass);
      if (bool1)
      {
        paramType = new com/google/gson/internal/ConstructorConstructor$10;
        paramType.<init>(this);
        return paramType;
      }
      localObject = SortedMap.class;
      boolean bool3 = ((Class)localObject).isAssignableFrom(paramClass);
      if (bool3)
      {
        paramType = new com/google/gson/internal/ConstructorConstructor$11;
        paramType.<init>(this);
        return paramType;
      }
      bool3 = paramType instanceof ParameterizedType;
      if (bool3)
      {
        paramType = ((ParameterizedType)paramType).getActualTypeArguments();
        bool3 = false;
        paramType = TypeToken.get(paramType[0]).getRawType();
        paramClass = String.class;
        bool2 = paramClass.isAssignableFrom(paramType);
        if (!bool2)
        {
          paramType = new com/google/gson/internal/ConstructorConstructor$12;
          paramType.<init>(this);
          return paramType;
        }
      }
      paramType = new com/google/gson/internal/ConstructorConstructor$13;
      paramType.<init>(this);
      return paramType;
    }
    return null;
  }
  
  private ObjectConstructor newUnsafeAllocator(Type paramType, Class paramClass)
  {
    ConstructorConstructor.14 local14 = new com/google/gson/internal/ConstructorConstructor$14;
    local14.<init>(this, paramClass, paramType);
    return local14;
  }
  
  public ObjectConstructor get(TypeToken paramTypeToken)
  {
    Type localType = paramTypeToken.getType();
    paramTypeToken = paramTypeToken.getRawType();
    Object localObject = (InstanceCreator)this.instanceCreators.get(localType);
    if (localObject != null)
    {
      paramTypeToken = new com/google/gson/internal/ConstructorConstructor$1;
      paramTypeToken.<init>(this, (InstanceCreator)localObject, localType);
      return paramTypeToken;
    }
    localObject = (InstanceCreator)this.instanceCreators.get(paramTypeToken);
    if (localObject != null)
    {
      paramTypeToken = new com/google/gson/internal/ConstructorConstructor$2;
      paramTypeToken.<init>(this, (InstanceCreator)localObject, localType);
      return paramTypeToken;
    }
    localObject = newDefaultConstructor(paramTypeToken);
    if (localObject != null) {
      return localObject;
    }
    localObject = newDefaultImplementationConstructor(localType, paramTypeToken);
    if (localObject != null) {
      return localObject;
    }
    return newUnsafeAllocator(localType, paramTypeToken);
  }
  
  public String toString()
  {
    return this.instanceCreators.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.ConstructorConstructor
 * JD-Core Version:    0.7.0.1
 */