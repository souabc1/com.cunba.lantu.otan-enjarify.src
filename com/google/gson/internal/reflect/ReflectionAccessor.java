package com.google.gson.internal.reflect;

import com.google.gson.internal.JavaVersion;
import java.lang.reflect.AccessibleObject;

public abstract class ReflectionAccessor
{
  private static final ReflectionAccessor instance;
  
  static
  {
    int i = JavaVersion.getMajorJavaVersion();
    int j = 9;
    Object localObject;
    if (i < j)
    {
      localObject = new com/google/gson/internal/reflect/PreJava9ReflectionAccessor;
      ((PreJava9ReflectionAccessor)localObject).<init>();
    }
    else
    {
      localObject = new com/google/gson/internal/reflect/UnsafeReflectionAccessor;
      ((UnsafeReflectionAccessor)localObject).<init>();
    }
    instance = (ReflectionAccessor)localObject;
  }
  
  public static ReflectionAccessor getInstance()
  {
    return instance;
  }
  
  public abstract void makeAccessible(AccessibleObject paramAccessibleObject);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.reflect.ReflectionAccessor
 * JD-Core Version:    0.7.0.1
 */