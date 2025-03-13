package androidx.core.location;

import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class LocationManagerCompat$Api19Impl
{
  public static Class OooO00o;
  public static Method OooO0O0;
  
  public static boolean OooO00o(LocationManager paramLocationManager, String paramString, LocationRequestCompat paramLocationRequestCompat, LocationListenerCompat paramLocationListenerCompat, Looper paramLooper)
  {
    try
    {
      Object localObject1 = OooO00o;
      if (localObject1 == null)
      {
        localObject1 = "android.location.LocationRequest";
        localObject1 = Class.forName((String)localObject1);
        OooO00o = (Class)localObject1;
      }
      localObject1 = OooO0O0;
      boolean bool = true;
      if (localObject1 == null)
      {
        localObject1 = LocationManager.class;
        String str = "requestLocationUpdates";
        int i = 3;
        Class[] arrayOfClass = new Class[i];
        Object localObject2 = OooO00o;
        arrayOfClass[0] = localObject2;
        localObject2 = LocationListener.class;
        arrayOfClass[bool] = localObject2;
        localObject2 = Looper.class;
        int j = 2;
        arrayOfClass[j] = localObject2;
        localObject1 = ((Class)localObject1).getDeclaredMethod(str, arrayOfClass);
        OooO0O0 = (Method)localObject1;
        ((AccessibleObject)localObject1).setAccessible(bool);
      }
      paramString = paramLocationRequestCompat.OooO0O0(paramString);
      if (paramString != null)
      {
        paramLocationRequestCompat = OooO0O0;
        Object[] tmp134_131 = new Object[3];
        Object[] tmp135_134 = tmp134_131;
        Object[] tmp135_134 = tmp134_131;
        tmp135_134[0] = paramString;
        tmp135_134[1] = paramLocationListenerCompat;
        tmp135_134[2] = paramLooper;
        paramString = tmp135_134;
        paramLocationRequestCompat.invoke(paramLocationManager, paramString);
        return bool;
      }
    }
    catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException|ClassNotFoundException|UnsupportedOperationException localNoSuchMethodException) {}
    return false;
  }
  
  public static boolean OooO0O0(LocationManager paramLocationManager, String paramString, LocationRequestCompat arg2, LocationManagerCompat.LocationListenerTransport paramLocationListenerTransport)
  {
    try
    {
      Object localObject1 = OooO00o;
      if (localObject1 == null)
      {
        localObject1 = "android.location.LocationRequest";
        localObject1 = Class.forName((String)localObject1);
        OooO00o = (Class)localObject1;
      }
      localObject1 = OooO0O0;
      int i = 2;
      int j = 3;
      boolean bool = true;
      if (localObject1 == null)
      {
        localObject1 = LocationManager.class;
        String str = "requestLocationUpdates";
        Class[] arrayOfClass = new Class[j];
        Object localObject2 = OooO00o;
        arrayOfClass[0] = localObject2;
        localObject2 = LocationListener.class;
        arrayOfClass[bool] = localObject2;
        localObject2 = Looper.class;
        arrayOfClass[i] = localObject2;
        localObject1 = ((Class)localObject1).getDeclaredMethod(str, arrayOfClass);
        OooO0O0 = (Method)localObject1;
        ((AccessibleObject)localObject1).setAccessible(bool);
      }
      paramString = ???.OooO0O0(paramString);
      if (paramString != null) {
        synchronized (LocationManagerCompat.OooO00o)
        {
          localObject1 = OooO0O0;
          Object[] arrayOfObject = new Object[j];
          arrayOfObject[0] = paramString;
          arrayOfObject[bool] = paramLocationListenerTransport;
          paramString = Looper.getMainLooper();
          arrayOfObject[i] = paramString;
          ((Method)localObject1).invoke(paramLocationManager, arrayOfObject);
          LocationManagerCompat.OooO00o(paramLocationManager, paramLocationListenerTransport);
          return bool;
        }
      }
    }
    catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException|ClassNotFoundException|UnsupportedOperationException localNoSuchMethodException)
    {
      label189:
      break label189;
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationManagerCompat.Api19Impl
 * JD-Core Version:    0.7.0.1
 */