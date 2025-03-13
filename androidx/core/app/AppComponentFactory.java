package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AppComponentFactory
  extends android.app.AppComponentFactory
{
  public Activity OooO00o(ClassLoader paramClassLoader, String paramString, Intent paramIntent)
  {
    try
    {
      paramClassLoader = Class.forName(paramString, false, paramClassLoader);
      paramString = Activity.class;
      paramClassLoader = paramClassLoader.asSubclass(paramString);
      paramString = new Class[0];
      paramClassLoader = paramClassLoader.getDeclaredConstructor(paramString);
      paramString = new Object[0];
      paramClassLoader = paramClassLoader.newInstance(paramString);
      return (Activity)paramClassLoader;
    }
    catch (NoSuchMethodException paramClassLoader) {}catch (InvocationTargetException paramClassLoader) {}
    paramString = new java/lang/RuntimeException;
    paramString.<init>("Couldn't call constructor", paramClassLoader);
    throw paramString;
  }
  
  public Application OooO0O0(ClassLoader paramClassLoader, String paramString)
  {
    try
    {
      paramClassLoader = Class.forName(paramString, false, paramClassLoader);
      paramString = Application.class;
      paramClassLoader = paramClassLoader.asSubclass(paramString);
      paramString = new Class[0];
      paramClassLoader = paramClassLoader.getDeclaredConstructor(paramString);
      paramString = new Object[0];
      paramClassLoader = paramClassLoader.newInstance(paramString);
      return (Application)paramClassLoader;
    }
    catch (NoSuchMethodException paramClassLoader) {}catch (InvocationTargetException paramClassLoader) {}
    paramString = new java/lang/RuntimeException;
    paramString.<init>("Couldn't call constructor", paramClassLoader);
    throw paramString;
  }
  
  public ContentProvider OooO0OO(ClassLoader paramClassLoader, String paramString)
  {
    try
    {
      paramClassLoader = Class.forName(paramString, false, paramClassLoader);
      paramString = ContentProvider.class;
      paramClassLoader = paramClassLoader.asSubclass(paramString);
      paramString = new Class[0];
      paramClassLoader = paramClassLoader.getDeclaredConstructor(paramString);
      paramString = new Object[0];
      paramClassLoader = paramClassLoader.newInstance(paramString);
      return (ContentProvider)paramClassLoader;
    }
    catch (NoSuchMethodException paramClassLoader) {}catch (InvocationTargetException paramClassLoader) {}
    paramString = new java/lang/RuntimeException;
    paramString.<init>("Couldn't call constructor", paramClassLoader);
    throw paramString;
  }
  
  public BroadcastReceiver OooO0Oo(ClassLoader paramClassLoader, String paramString, Intent paramIntent)
  {
    try
    {
      paramClassLoader = Class.forName(paramString, false, paramClassLoader);
      paramString = BroadcastReceiver.class;
      paramClassLoader = paramClassLoader.asSubclass(paramString);
      paramString = new Class[0];
      paramClassLoader = paramClassLoader.getDeclaredConstructor(paramString);
      paramString = new Object[0];
      paramClassLoader = paramClassLoader.newInstance(paramString);
      return (BroadcastReceiver)paramClassLoader;
    }
    catch (NoSuchMethodException paramClassLoader) {}catch (InvocationTargetException paramClassLoader) {}
    paramString = new java/lang/RuntimeException;
    paramString.<init>("Couldn't call constructor", paramClassLoader);
    throw paramString;
  }
  
  public Service OooO0o0(ClassLoader paramClassLoader, String paramString, Intent paramIntent)
  {
    try
    {
      paramClassLoader = Class.forName(paramString, false, paramClassLoader);
      paramString = Service.class;
      paramClassLoader = paramClassLoader.asSubclass(paramString);
      paramString = new Class[0];
      paramClassLoader = paramClassLoader.getDeclaredConstructor(paramString);
      paramString = new Object[0];
      paramClassLoader = paramClassLoader.newInstance(paramString);
      return (Service)paramClassLoader;
    }
    catch (NoSuchMethodException paramClassLoader) {}catch (InvocationTargetException paramClassLoader) {}
    paramString = new java/lang/RuntimeException;
    paramString.<init>("Couldn't call constructor", paramClassLoader);
    throw paramString;
  }
  
  public final Activity instantiateActivity(ClassLoader paramClassLoader, String paramString, Intent paramIntent)
  {
    return (Activity)CoreComponentFactory.OooO00o(OooO00o(paramClassLoader, paramString, paramIntent));
  }
  
  public final Application instantiateApplication(ClassLoader paramClassLoader, String paramString)
  {
    return (Application)CoreComponentFactory.OooO00o(OooO0O0(paramClassLoader, paramString));
  }
  
  public final ContentProvider instantiateProvider(ClassLoader paramClassLoader, String paramString)
  {
    return (ContentProvider)CoreComponentFactory.OooO00o(OooO0OO(paramClassLoader, paramString));
  }
  
  public final BroadcastReceiver instantiateReceiver(ClassLoader paramClassLoader, String paramString, Intent paramIntent)
  {
    return (BroadcastReceiver)CoreComponentFactory.OooO00o(OooO0Oo(paramClassLoader, paramString, paramIntent));
  }
  
  public final Service instantiateService(ClassLoader paramClassLoader, String paramString, Intent paramIntent)
  {
    return (Service)CoreComponentFactory.OooO00o(OooO0o0(paramClassLoader, paramString, paramIntent));
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.AppComponentFactory
 * JD-Core Version:    0.7.0.1
 */