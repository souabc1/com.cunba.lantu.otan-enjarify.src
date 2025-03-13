package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import m54207b69;

public abstract class UnsafeAllocator
{
  public static void assertInstantiable(Class paramClass)
  {
    int i = paramClass.getModifiers();
    boolean bool2 = Modifier.isInterface(i);
    if (!bool2)
    {
      boolean bool1 = Modifier.isAbstract(i);
      if (!bool1) {
        return;
      }
      localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str = m54207b69.F54207b69_11("a5745848444B595C481D5F635F52532365646C2454296C662C7474605C70785F7B74627274383A9C807C6F70408781867F3F46");
      localStringBuilder.append(str);
      paramClass = paramClass.getName();
      localStringBuilder.append(paramClass);
      paramClass = localStringBuilder.toString();
      localUnsupportedOperationException.<init>(paramClass);
      throw localUnsupportedOperationException;
    }
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("$F0F29342638252D2C2B6F2F32346E4075343478423C4A483E404B49424E40408686304A554759464E4D4C9053535851AB96");
    localStringBuilder.append(str);
    paramClass = paramClass.getName();
    localStringBuilder.append(paramClass);
    paramClass = localStringBuilder.toString();
    localUnsupportedOperationException.<init>(paramClass);
    throw localUnsupportedOperationException;
  }
  
  public static UnsafeAllocator create()
  {
    Object localObject1 = m54207b69.F54207b69_11("&05E56497C62484A58665C5F");
    Object localObject2 = ObjectStreamClass.class;
    Class localClass = Class.class;
    int i = 0;
    Object localObject3 = null;
    boolean bool = true;
    Object localObject4 = "C~0D0C1253171C132458341A182B2529";
    try
    {
      localObject4 = m54207b69.F54207b69_11((String)localObject4);
      localObject4 = Class.forName((String)localObject4);
      localObject5 = "kf120F05360C1A0D070B";
      localObject5 = m54207b69.F54207b69_11((String)localObject5);
      localObject5 = ((Class)localObject4).getDeclaredField((String)localObject5);
      ((AccessibleObject)localObject5).setAccessible(bool);
      localObject5 = ((Field)localObject5).get(null);
      localObject6 = "P]3C32333542412F3F1C3C383448404C47";
      localObject6 = m54207b69.F54207b69_11((String)localObject6);
      localObject7 = new Class[bool];
      localObject7[0] = localClass;
      localObject4 = ((Class)localObject4).getMethod((String)localObject6, (Class[])localObject7);
      localObject6 = new com/google/gson/internal/UnsafeAllocator$1;
      ((UnsafeAllocator.1)localObject6).<init>((Method)localObject4, localObject5);
      return localObject6;
    }
    catch (Exception localException1)
    {
      Object localObject6;
      Object localObject7;
      int j = 2;
      Object localObject5 = "$h0F0E1E2E0B0B21232226152713272F1B";
      try
      {
        localObject5 = m54207b69.F54207b69_11((String)localObject5);
        localObject6 = new Class[bool];
        localObject6[0] = localClass;
        localObject5 = ((Class)localObject2).getDeclaredMethod((String)localObject5, (Class[])localObject6);
        ((AccessibleObject)localObject5).setAccessible(bool);
        localObject6 = new Object[bool];
        localObject7 = Object.class;
        localObject6[0] = localObject7;
        localObject3 = ((Method)localObject5).invoke(null, (Object[])localObject6);
        localObject3 = (Integer)localObject3;
        i = ((Integer)localObject3).intValue();
        localObject5 = new Class[j];
        localObject5[0] = localClass;
        localObject6 = Integer.TYPE;
        localObject5[bool] = localObject6;
        localObject2 = ((Class)localObject2).getDeclaredMethod((String)localObject1, (Class[])localObject5);
        ((AccessibleObject)localObject2).setAccessible(bool);
        localObject5 = new com/google/gson/internal/UnsafeAllocator$2;
        ((UnsafeAllocator.2)localObject5).<init>((Method)localObject2, i);
        return localObject5;
      }
      catch (Exception localException2)
      {
        localObject2 = ObjectInputStream.class;
        try
        {
          localObject3 = new Class[j];
          localObject3[0] = localClass;
          localObject3[bool] = localClass;
          localObject1 = ((Class)localObject2).getDeclaredMethod((String)localObject1, (Class[])localObject3);
          ((AccessibleObject)localObject1).setAccessible(bool);
          localObject2 = new com/google/gson/internal/UnsafeAllocator$3;
          ((UnsafeAllocator.3)localObject2).<init>((Method)localObject1);
          return localObject2;
        }
        catch (Exception localException3)
        {
          localObject1 = new com/google/gson/internal/UnsafeAllocator$4;
          ((UnsafeAllocator.4)localObject1).<init>();
        }
      }
    }
    return localObject1;
  }
  
  public abstract Object newInstance(Class paramClass);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.internal.UnsafeAllocator
 * JD-Core Version:    0.7.0.1
 */