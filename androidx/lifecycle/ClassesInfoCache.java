package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class ClassesInfoCache
{
  public static ClassesInfoCache OooO0OO;
  public final Map OooO00o;
  public final Map OooO0O0;
  
  static
  {
    ClassesInfoCache localClassesInfoCache = new androidx/lifecycle/ClassesInfoCache;
    localClassesInfoCache.<init>();
    OooO0OO = localClassesInfoCache;
  }
  
  public ClassesInfoCache()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO00o = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO0O0 = localHashMap;
  }
  
  public final ClassesInfoCache.CallbackInfo OooO00o(Class paramClass, Method[] paramArrayOfMethod)
  {
    Object localObject1 = paramClass.getSuperclass();
    Object localObject2 = new java/util/HashMap;
    ((HashMap)localObject2).<init>();
    if (localObject1 != null)
    {
      localObject1 = OooO0OO((Class)localObject1);
      if (localObject1 != null)
      {
        localObject1 = ((ClassesInfoCache.CallbackInfo)localObject1).OooO0O0;
        ((Map)localObject2).putAll((Map)localObject1);
      }
    }
    localObject1 = paramClass.getInterfaces();
    int i = localObject1.length;
    int j = 0;
    Object localObject3 = null;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    while (j < i)
    {
      localObject4 = localObject1[j];
      localObject4 = OooO0OO((Class)localObject4).OooO0O0.entrySet().iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject4).hasNext();
        if (!bool) {
          break;
        }
        localObject5 = (Map.Entry)((Iterator)localObject4).next();
        localObject6 = (ClassesInfoCache.MethodReference)((Map.Entry)localObject5).getKey();
        localObject5 = (Lifecycle.Event)((Map.Entry)localObject5).getValue();
        OooO0o0((Map)localObject2, (ClassesInfoCache.MethodReference)localObject6, (Lifecycle.Event)localObject5, paramClass);
      }
      j += 1;
    }
    if (paramArrayOfMethod == null) {
      paramArrayOfMethod = OooO0O0(paramClass);
    }
    int k = paramArrayOfMethod.length;
    i = 0;
    j = 0;
    localObject3 = null;
    while (i < k)
    {
      localObject4 = paramArrayOfMethod[i];
      localObject5 = (OnLifecycleEvent)((Method)localObject4).getAnnotation(OnLifecycleEvent.class);
      if (localObject5 != null)
      {
        localObject3 = ((Method)localObject4).getParameterTypes();
        int m = localObject3.length;
        int i1 = 1;
        Class localClass;
        int n;
        if (m > 0)
        {
          localObject6 = LifecycleOwner.class;
          localClass = localObject3[0];
          n = ((Class)localObject6).isAssignableFrom(localClass);
          if (n != 0)
          {
            n = i1;
          }
          else
          {
            paramClass = new java/lang/IllegalArgumentException;
            paramClass.<init>("invalid parameter type. Must be one and instanceof LifecycleOwner");
            throw paramClass;
          }
        }
        else
        {
          n = 0;
          localObject6 = null;
        }
        localObject5 = ((OnLifecycleEvent)localObject5).value();
        int i2 = localObject3.length;
        int i3 = 2;
        if (i2 > i1)
        {
          localObject6 = Lifecycle.Event.class;
          localClass = localObject3[i1];
          n = ((Class)localObject6).isAssignableFrom(localClass);
          if (n != 0)
          {
            localObject6 = Lifecycle.Event.ON_ANY;
            if (localObject5 == localObject6)
            {
              n = i3;
            }
            else
            {
              paramClass = new java/lang/IllegalArgumentException;
              paramClass.<init>("Second arg is supported only for ON_ANY value");
              throw paramClass;
            }
          }
          else
          {
            paramClass = new java/lang/IllegalArgumentException;
            paramClass.<init>("invalid parameter type. second arg must be an event");
            throw paramClass;
          }
        }
        j = localObject3.length;
        if (j <= i3)
        {
          localObject3 = new androidx/lifecycle/ClassesInfoCache$MethodReference;
          ((ClassesInfoCache.MethodReference)localObject3).<init>(n, (Method)localObject4);
          OooO0o0((Map)localObject2, (ClassesInfoCache.MethodReference)localObject3, (Lifecycle.Event)localObject5, paramClass);
          j = i1;
        }
      }
      else
      {
        i += 1;
        continue;
      }
      paramClass = new java/lang/IllegalArgumentException;
      paramClass.<init>("cannot have more than 2 params");
      throw paramClass;
    }
    paramArrayOfMethod = new androidx/lifecycle/ClassesInfoCache$CallbackInfo;
    paramArrayOfMethod.<init>((Map)localObject2);
    this.OooO00o.put(paramClass, paramArrayOfMethod);
    localObject1 = this.OooO0O0;
    localObject2 = Boolean.valueOf(j);
    ((Map)localObject1).put(paramClass, localObject2);
    return paramArrayOfMethod;
  }
  
  public final Method[] OooO0O0(Class paramClass)
  {
    try
    {
      return paramClass.getDeclaredMethods();
    }
    catch (NoClassDefFoundError paramClass)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", paramClass);
      throw localIllegalArgumentException;
    }
  }
  
  public ClassesInfoCache.CallbackInfo OooO0OO(Class paramClass)
  {
    ClassesInfoCache.CallbackInfo localCallbackInfo = (ClassesInfoCache.CallbackInfo)this.OooO00o.get(paramClass);
    if (localCallbackInfo != null) {
      return localCallbackInfo;
    }
    return OooO00o(paramClass, null);
  }
  
  public boolean OooO0Oo(Class paramClass)
  {
    Object localObject = (Boolean)this.OooO0O0.get(paramClass);
    if (localObject != null) {
      return ((Boolean)localObject).booleanValue();
    }
    localObject = OooO0O0(paramClass);
    int i = localObject.length;
    int j = 0;
    while (j < i)
    {
      OnLifecycleEvent localOnLifecycleEvent1 = localObject[j];
      OnLifecycleEvent localOnLifecycleEvent2 = OnLifecycleEvent.class;
      localOnLifecycleEvent1 = (OnLifecycleEvent)localOnLifecycleEvent1.getAnnotation(localOnLifecycleEvent2);
      if (localOnLifecycleEvent1 != null)
      {
        OooO00o(paramClass, (Method[])localObject);
        return true;
      }
      j += 1;
    }
    localObject = this.OooO0O0;
    Boolean localBoolean = Boolean.FALSE;
    ((Map)localObject).put(paramClass, localBoolean);
    return false;
  }
  
  public final void OooO0o0(Map paramMap, ClassesInfoCache.MethodReference paramMethodReference, Lifecycle.Event paramEvent, Class paramClass)
  {
    Lifecycle.Event localEvent = (Lifecycle.Event)paramMap.get(paramMethodReference);
    if ((localEvent != null) && (paramEvent != localEvent))
    {
      paramMap = paramMethodReference.OooO0O0;
      paramMethodReference = new java/lang/IllegalArgumentException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Method ");
      paramMap = paramMap.getName();
      localStringBuilder.append(paramMap);
      localStringBuilder.append(" in ");
      paramMap = paramClass.getName();
      localStringBuilder.append(paramMap);
      localStringBuilder.append(" already declared with different @OnLifecycleEvent value: previous value ");
      localStringBuilder.append(localEvent);
      localStringBuilder.append(", new value ");
      localStringBuilder.append(paramEvent);
      paramMap = localStringBuilder.toString();
      paramMethodReference.<init>(paramMap);
      throw paramMethodReference;
    }
    if (localEvent == null) {
      paramMap.put(paramMethodReference, paramEvent);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ClassesInfoCache
 * JD-Core Version:    0.7.0.1
 */