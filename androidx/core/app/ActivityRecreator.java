package androidx.core.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

final class ActivityRecreator
{
  public static final Class OooO00o;
  public static final Field OooO0O0;
  public static final Field OooO0OO;
  public static final Method OooO0Oo;
  public static final Method OooO0o;
  public static final Method OooO0o0;
  public static final Handler OooO0oO;
  
  static
  {
    Object localObject = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    ((Handler)localObject).<init>(localLooper);
    OooO0oO = (Handler)localObject;
    localObject = getActivityThreadClass();
    OooO00o = (Class)localObject;
    OooO0O0 = getMainThreadField();
    OooO0OO = getTokenField();
    OooO0Oo = OooO0O0((Class)localObject);
    OooO0o0 = OooO00o((Class)localObject);
    OooO0o = OooO0OO((Class)localObject);
  }
  
  public static Method OooO00o(Class paramClass)
  {
    if (paramClass == null) {
      return null;
    }
    String str = "performStopActivity";
    int i = 2;
    try
    {
      Class[] arrayOfClass = new Class[i];
      Object localObject = IBinder.class;
      boolean bool = false;
      arrayOfClass[0] = localObject;
      localObject = Boolean.TYPE;
      bool = true;
      arrayOfClass[bool] = localObject;
      paramClass = paramClass.getDeclaredMethod(str, arrayOfClass);
      paramClass.setAccessible(bool);
      return paramClass;
    }
    finally {}
    return null;
  }
  
  public static Method OooO0O0(Class paramClass)
  {
    if (paramClass == null) {
      return null;
    }
    String str = "performStopActivity";
    int i = 3;
    try
    {
      Class[] arrayOfClass = new Class[i];
      Object localObject = IBinder.class;
      boolean bool = false;
      arrayOfClass[0] = localObject;
      localObject = Boolean.TYPE;
      bool = true;
      arrayOfClass[bool] = localObject;
      localObject = String.class;
      int j = 2;
      arrayOfClass[j] = localObject;
      paramClass = paramClass.getDeclaredMethod(str, arrayOfClass);
      paramClass.setAccessible(bool);
      return paramClass;
    }
    finally {}
    return null;
  }
  
  public static Method OooO0OO(Class paramClass)
  {
    Configuration localConfiguration = Configuration.class;
    Object localObject = List.class;
    boolean bool1 = OooO0Oo();
    if ((bool1) && (paramClass != null))
    {
      String str = "requestRelaunchActivity";
      int i = 9;
      try
      {
        Class[] arrayOfClass = new Class[i];
        IBinder localIBinder = IBinder.class;
        int j = 0;
        arrayOfClass[0] = localIBinder;
        boolean bool2 = true;
        arrayOfClass[bool2] = localObject;
        j = 2;
        arrayOfClass[j] = localObject;
        localObject = Integer.TYPE;
        j = 3;
        arrayOfClass[j] = localObject;
        localObject = Boolean.TYPE;
        j = 4;
        arrayOfClass[j] = localObject;
        j = 5;
        arrayOfClass[j] = localConfiguration;
        j = 6;
        arrayOfClass[j] = localConfiguration;
        int k = 7;
        arrayOfClass[k] = localObject;
        k = 8;
        arrayOfClass[k] = localObject;
        paramClass = paramClass.getDeclaredMethod(str, arrayOfClass);
        paramClass.setAccessible(bool2);
        return paramClass;
      }
      finally {}
    }
    return null;
  }
  
  public static boolean OooO0Oo()
  {
    return false;
  }
  
  public static boolean OooO0o0(Object paramObject, int paramInt, Activity paramActivity)
  {
    try
    {
      Object localObject = OooO0OO;
      localObject = ((Field)localObject).get(paramActivity);
      if (localObject == paramObject)
      {
        int i = paramActivity.hashCode();
        if (i == paramInt)
        {
          paramObject = OooO0O0;
          paramObject = paramObject.get(paramActivity);
          Handler localHandler = OooO0oO;
          paramActivity = new androidx/core/app/ActivityRecreator$3;
          paramActivity.<init>(paramObject, localObject);
          localHandler.postAtFrontOfQueue(paramActivity);
          return true;
        }
      }
    }
    finally {}
    return false;
  }
  
  private static Class getActivityThreadClass()
  {
    String str = "android.app.ActivityThread";
    try
    {
      return Class.forName(str);
    }
    finally {}
    return null;
  }
  
  private static Field getMainThreadField()
  {
    Object localObject = Activity.class;
    String str = "mMainThread";
    try
    {
      localObject = ((Class)localObject).getDeclaredField(str);
      boolean bool = true;
      ((AccessibleObject)localObject).setAccessible(bool);
      return localObject;
    }
    finally {}
    return null;
  }
  
  private static Field getTokenField()
  {
    Object localObject = Activity.class;
    String str = "mToken";
    try
    {
      localObject = ((Class)localObject).getDeclaredField(str);
      boolean bool = true;
      ((AccessibleObject)localObject).setAccessible(bool);
      return localObject;
    }
    finally {}
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.ActivityRecreator
 * JD-Core Version:    0.7.0.1
 */