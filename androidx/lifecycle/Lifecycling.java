package androidx.lifecycle;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Lifecycling
{
  public static final Lifecycling OooO00o;
  public static final Map OooO0O0;
  public static final Map OooO0OO;
  
  static
  {
    Object localObject = new androidx/lifecycle/Lifecycling;
    ((Lifecycling)localObject).<init>();
    OooO00o = (Lifecycling)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    OooO0O0 = (Map)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    OooO0OO = (Map)localObject;
  }
  
  public static final String OooO0OO(String paramString)
  {
    Intrinsics.OooO0o(paramString, "className");
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    paramString = StringsKt.OooOOOO(paramString, ".", "_", false, 4, null);
    localStringBuilder.append(paramString);
    localStringBuilder.append("_LifecycleAdapter");
    return localStringBuilder.toString();
  }
  
  public static final LifecycleEventObserver OooO0o(Object paramObject)
  {
    Object localObject1 = "object";
    Intrinsics.OooO0o(paramObject, (String)localObject1);
    boolean bool1 = paramObject instanceof LifecycleEventObserver;
    boolean bool2 = paramObject instanceof DefaultLifecycleObserver;
    if ((bool1) && (bool2))
    {
      localObject1 = new androidx/lifecycle/DefaultLifecycleObserverAdapter;
      localObject2 = paramObject;
      localObject2 = (DefaultLifecycleObserver)paramObject;
      paramObject = (LifecycleEventObserver)paramObject;
      ((DefaultLifecycleObserverAdapter)localObject1).<init>((DefaultLifecycleObserver)localObject2, paramObject);
      return localObject1;
    }
    if (bool2)
    {
      localObject1 = new androidx/lifecycle/DefaultLifecycleObserverAdapter;
      paramObject = (DefaultLifecycleObserver)paramObject;
      ((DefaultLifecycleObserverAdapter)localObject1).<init>(paramObject, null);
      return localObject1;
    }
    if (bool1) {
      return (LifecycleEventObserver)paramObject;
    }
    localObject1 = paramObject.getClass();
    Object localObject2 = OooO00o;
    int j = ((Lifecycling)localObject2).OooO0Oo((Class)localObject1);
    int k = 2;
    if (j == k)
    {
      Object localObject3 = OooO0OO;
      localObject1 = ((Map)localObject3).get(localObject1);
      Intrinsics.OooO0OO(localObject1);
      localObject1 = (List)localObject1;
      j = ((List)localObject1).size();
      k = 0;
      int m = 1;
      if (j == m)
      {
        localObject1 = (Constructor)((List)localObject1).get(0);
        paramObject = ((Lifecycling)localObject2).OooO00o((Constructor)localObject1, paramObject);
        localObject1 = new androidx/lifecycle/SingleGeneratedAdapterObserver;
        ((SingleGeneratedAdapterObserver)localObject1).<init>(paramObject);
        return localObject1;
      }
      int i = ((List)localObject1).size();
      localObject3 = new GeneratedAdapter[i];
      while (k < i)
      {
        Object localObject4 = OooO00o;
        Constructor localConstructor = (Constructor)((List)localObject1).get(k);
        localObject4 = ((Lifecycling)localObject4).OooO00o(localConstructor, paramObject);
        localObject3[k] = localObject4;
        k += 1;
      }
      paramObject = new androidx/lifecycle/CompositeGeneratedAdaptersObserver;
      paramObject.<init>((GeneratedAdapter[])localObject3);
      return paramObject;
    }
    localObject1 = new androidx/lifecycle/ReflectiveGenericLifecycleObserver;
    ((ReflectiveGenericLifecycleObserver)localObject1).<init>(paramObject);
    return localObject1;
  }
  
  public final GeneratedAdapter OooO00o(Constructor paramConstructor, Object paramObject)
  {
    try
    {
      paramObject = new Object[] { paramObject };
      paramConstructor = paramConstructor.newInstance(paramObject);
      paramObject = "{\n            constructo…tance(`object`)\n        }";
      Intrinsics.OooO0o0(paramConstructor, paramObject);
      return (GeneratedAdapter)paramConstructor;
    }
    catch (InvocationTargetException paramConstructor)
    {
      paramObject = new java/lang/RuntimeException;
      paramObject.<init>(paramConstructor);
      throw paramObject;
    }
    catch (InstantiationException paramConstructor)
    {
      paramObject = new java/lang/RuntimeException;
      paramObject.<init>(paramConstructor);
      throw paramObject;
    }
    catch (IllegalAccessException paramConstructor)
    {
      paramObject = new java/lang/RuntimeException;
      paramObject.<init>(paramConstructor);
      throw paramObject;
    }
  }
  
  public final Constructor OooO0O0(Class paramClass)
  {
    try
    {
      localObject1 = paramClass.getPackage();
      Object localObject2 = paramClass.getCanonicalName();
      if (localObject1 != null) {
        localObject1 = ((Package)localObject1).getName();
      } else {
        localObject1 = "";
      }
      Object localObject3 = "fullPackage";
      Intrinsics.OooO0o0(localObject1, (String)localObject3);
      int i = ((CharSequence)localObject1).length();
      int j = 1;
      if (i == 0)
      {
        i = j;
      }
      else
      {
        i = 0;
        localObject3 = null;
      }
      if (i == 0)
      {
        localObject3 = "name";
        Intrinsics.OooO0o0(localObject2, (String)localObject3);
        i = ((String)localObject1).length() + j;
        localObject2 = ((String)localObject2).substring(i);
        localObject3 = "this as java.lang.String).substring(startIndex)";
        Intrinsics.OooO0o0(localObject2, (String)localObject3);
      }
      localObject3 = "if (fullPackage.isEmpty(…g(fullPackage.length + 1)";
      Intrinsics.OooO0o0(localObject2, (String)localObject3);
      localObject2 = OooO0OO((String)localObject2);
      i = ((CharSequence)localObject1).length();
      if (i == 0)
      {
        i = j;
      }
      else
      {
        i = 0;
        localObject3 = null;
      }
      if (i == 0)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append((String)localObject1);
        char c = '.';
        ((StringBuilder)localObject3).append(c);
        ((StringBuilder)localObject3).append((String)localObject2);
        localObject2 = ((StringBuilder)localObject3).toString();
      }
      localObject1 = Class.forName((String)localObject2);
      localObject2 = "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>";
      Intrinsics.OooO0Oo(localObject1, (String)localObject2);
      localObject2 = new Class[j];
      localObject2[0] = paramClass;
      paramClass = ((Class)localObject1).getDeclaredConstructor((Class[])localObject2);
      boolean bool = paramClass.isAccessible();
      if (!bool) {
        paramClass.setAccessible(j);
      }
    }
    catch (NoSuchMethodException paramClass)
    {
      Object localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>(paramClass);
      throw ((Throwable)localObject1);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      paramClass = null;
    }
    return paramClass;
  }
  
  public final int OooO0Oo(Class paramClass)
  {
    Map localMap = OooO0O0;
    Integer localInteger1 = (Integer)localMap.get(paramClass);
    if (localInteger1 != null) {
      return localInteger1.intValue();
    }
    int i = OooO0oO(paramClass);
    Integer localInteger2 = Integer.valueOf(i);
    localMap.put(paramClass, localInteger2);
    return i;
  }
  
  public final boolean OooO0o0(Class paramClass)
  {
    if (paramClass != null)
    {
      LifecycleObserver localLifecycleObserver = LifecycleObserver.class;
      bool = localLifecycleObserver.isAssignableFrom(paramClass);
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    paramClass = null;
    return bool;
  }
  
  public final int OooO0oO(Class paramClass)
  {
    Object localObject1 = paramClass.getCanonicalName();
    int i = 1;
    if (localObject1 == null) {
      return i;
    }
    localObject1 = OooO0O0(paramClass);
    int j = 2;
    if (localObject1 != null)
    {
      Map localMap = OooO0OO;
      localObject1 = CollectionsKt.OooO0o0(localObject1);
      localMap.put(paramClass, localObject1);
      return j;
    }
    localObject1 = ClassesInfoCache.OooO0OO;
    boolean bool1 = ((ClassesInfoCache)localObject1).OooO0Oo(paramClass);
    if (bool1) {
      return i;
    }
    localObject1 = paramClass.getSuperclass();
    boolean bool2 = OooO0o0((Class)localObject1);
    Object localObject2;
    int k;
    if (bool2)
    {
      localObject2 = "superclass";
      Intrinsics.OooO0o0(localObject1, (String)localObject2);
      k = OooO0Oo((Class)localObject1);
      if (k == i) {
        return i;
      }
      localObject2 = new java/util/ArrayList;
      localObject3 = OooO0OO;
      localObject1 = ((Map)localObject3).get(localObject1);
      Intrinsics.OooO0OO(localObject1);
      localObject1 = (Collection)localObject1;
      ((ArrayList)localObject2).<init>((Collection)localObject1);
    }
    else
    {
      k = 0;
      localObject2 = null;
    }
    localObject1 = paramClass.getInterfaces();
    Object localObject3 = "klass.interfaces";
    Intrinsics.OooO0o0(localObject1, (String)localObject3);
    int m = localObject1.length;
    int n = 0;
    while (n < m)
    {
      Object localObject4 = localObject1[n];
      boolean bool3 = OooO0o0((Class)localObject4);
      if (bool3)
      {
        Object localObject5 = "intrface";
        Intrinsics.OooO0o0(localObject4, (String)localObject5);
        int i1 = OooO0Oo((Class)localObject4);
        if (i1 == i) {
          return i;
        }
        if (localObject2 == null)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
        }
        localObject5 = OooO0OO;
        localObject4 = ((Map)localObject5).get(localObject4);
        Intrinsics.OooO0OO(localObject4);
        localObject4 = (Collection)localObject4;
        ((List)localObject2).addAll((Collection)localObject4);
      }
      n += 1;
    }
    if (localObject2 != null)
    {
      OooO0OO.put(paramClass, localObject2);
      return j;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.Lifecycling
 * JD-Core Version:    0.7.0.1
 */