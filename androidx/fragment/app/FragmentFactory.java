package androidx.fragment.app;

import androidx.collection.SimpleArrayMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FragmentFactory
{
  public static final SimpleArrayMap OooO00o;
  
  static
  {
    SimpleArrayMap localSimpleArrayMap = new androidx/collection/SimpleArrayMap;
    localSimpleArrayMap.<init>();
    OooO00o = localSimpleArrayMap;
  }
  
  public static boolean OooO0O0(ClassLoader paramClassLoader, String paramString)
  {
    try
    {
      paramClassLoader = OooO0OO(paramClassLoader, paramString);
      paramString = Fragment.class;
      return paramString.isAssignableFrom(paramClassLoader);
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return false;
  }
  
  public static Class OooO0OO(ClassLoader paramClassLoader, String paramString)
  {
    Object localObject = OooO00o;
    SimpleArrayMap localSimpleArrayMap = (SimpleArrayMap)((SimpleArrayMap)localObject).get(paramClassLoader);
    if (localSimpleArrayMap == null)
    {
      localSimpleArrayMap = new androidx/collection/SimpleArrayMap;
      localSimpleArrayMap.<init>();
      ((SimpleArrayMap)localObject).put(paramClassLoader, localSimpleArrayMap);
    }
    localObject = (Class)localSimpleArrayMap.get(paramString);
    if (localObject == null)
    {
      localObject = Class.forName(paramString, false, paramClassLoader);
      localSimpleArrayMap.put(paramString, localObject);
    }
    return localObject;
  }
  
  public static Class OooO0Oo(ClassLoader paramClassLoader, String paramString)
  {
    String str = "Unable to instantiate fragment ";
    try
    {
      return OooO0OO(paramClassLoader, paramString);
    }
    catch (ClassCastException paramClassLoader)
    {
      localInstantiationException = new androidx/fragment/app/Fragment$InstantiationException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str);
      localStringBuilder.append(paramString);
      localStringBuilder.append(": make sure class is a valid subclass of Fragment");
      paramString = localStringBuilder.toString();
      localInstantiationException.<init>(paramString, paramClassLoader);
      throw localInstantiationException;
    }
    catch (ClassNotFoundException paramClassLoader)
    {
      Fragment.InstantiationException localInstantiationException = new androidx/fragment/app/Fragment$InstantiationException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str);
      localStringBuilder.append(paramString);
      localStringBuilder.append(": make sure class name exists");
      paramString = localStringBuilder.toString();
      localInstantiationException.<init>(paramString, paramClassLoader);
      throw localInstantiationException;
    }
  }
  
  public Fragment OooO00o(ClassLoader paramClassLoader, String paramString)
  {
    Object localObject1 = ": make sure class name exists, is public, and has an empty constructor that is public";
    String str = "Unable to instantiate fragment ";
    try
    {
      paramClassLoader = OooO0Oo(paramClassLoader, paramString);
      localObject2 = null;
      localObject3 = new Class[0];
      paramClassLoader = paramClassLoader.getConstructor((Class[])localObject3);
      localObject2 = new Object[0];
      paramClassLoader = paramClassLoader.newInstance((Object[])localObject2);
      return (Fragment)paramClassLoader;
    }
    catch (InvocationTargetException paramClassLoader)
    {
      localObject1 = new androidx/fragment/app/Fragment$InstantiationException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(": calling Fragment constructor caused an exception");
      paramString = ((StringBuilder)localObject2).toString();
      ((Fragment.InstantiationException)localObject1).<init>(paramString, paramClassLoader);
      throw ((Throwable)localObject1);
    }
    catch (NoSuchMethodException paramClassLoader)
    {
      localObject1 = new androidx/fragment/app/Fragment$InstantiationException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(": could not find Fragment constructor");
      paramString = ((StringBuilder)localObject2).toString();
      ((Fragment.InstantiationException)localObject1).<init>(paramString, paramClassLoader);
      throw ((Throwable)localObject1);
    }
    catch (IllegalAccessException paramClassLoader)
    {
      localObject2 = new androidx/fragment/app/Fragment$InstantiationException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append(str);
      ((StringBuilder)localObject3).append(paramString);
      ((StringBuilder)localObject3).append((String)localObject1);
      paramString = ((StringBuilder)localObject3).toString();
      ((Fragment.InstantiationException)localObject2).<init>(paramString, paramClassLoader);
      throw ((Throwable)localObject2);
    }
    catch (InstantiationException paramClassLoader)
    {
      Object localObject2 = new androidx/fragment/app/Fragment$InstantiationException;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append(str);
      ((StringBuilder)localObject3).append(paramString);
      ((StringBuilder)localObject3).append((String)localObject1);
      paramString = ((StringBuilder)localObject3).toString();
      ((Fragment.InstantiationException)localObject2).<init>(paramString, paramClassLoader);
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentFactory
 * JD-Core Version:    0.7.0.1
 */