package androidx.core.location;

import android.location.GnssStatus.Callback;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Handler;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Consumer;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Executor;

class LocationManagerCompat$Api30Impl
{
  public static Class OooO00o;
  public static Method OooO0O0;
  
  public static void OooO00o(LocationManager paramLocationManager, String paramString, androidx.core.os.CancellationSignal paramCancellationSignal, Executor paramExecutor, Consumer paramConsumer)
  {
    if (paramCancellationSignal != null) {
      paramCancellationSignal = (android.os.CancellationSignal)paramCancellationSignal.getCancellationSignalObject();
    } else {
      paramCancellationSignal = null;
    }
    Objects.requireNonNull(paramConsumer);
    OooO00o localOooO00o = new androidx/core/location/OooO00o;
    localOooO00o.<init>(paramConsumer);
    paramLocationManager.getCurrentLocation(paramString, paramCancellationSignal, paramExecutor, localOooO00o);
  }
  
  public static boolean OooO0O0(LocationManager paramLocationManager, Handler arg1, Executor paramExecutor, GnssStatusCompat.Callback paramCallback)
  {
    synchronized (LocationManagerCompat.GnssListenersHolder.OooO00o)
    {
      Object localObject = ???.get(paramCallback);
      localObject = (LocationManagerCompat.GnssStatusTransport)localObject;
      if (localObject == null)
      {
        localObject = new androidx/core/location/LocationManagerCompat$GnssStatusTransport;
        ((LocationManagerCompat.GnssStatusTransport)localObject).<init>(paramCallback);
      }
      boolean bool = paramLocationManager.registerGnssStatusCallback(paramExecutor, (GnssStatus.Callback)localObject);
      if (bool)
      {
        ???.put(paramCallback, localObject);
        return true;
      }
      return false;
    }
  }
  
  public static boolean OooO0OO(LocationManager paramLocationManager, String paramString, LocationRequestCompat paramLocationRequestCompat, Executor paramExecutor, LocationListenerCompat paramLocationListenerCompat)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j) {
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
        j = 1;
        if (localObject1 == null)
        {
          localObject1 = LocationManager.class;
          String str = "requestLocationUpdates";
          int k = 3;
          Class[] arrayOfClass = new Class[k];
          Object localObject2 = OooO00o;
          arrayOfClass[0] = localObject2;
          localObject2 = Executor.class;
          arrayOfClass[j] = localObject2;
          localObject2 = LocationListener.class;
          int m = 2;
          arrayOfClass[m] = localObject2;
          localObject1 = ((Class)localObject1).getDeclaredMethod(str, arrayOfClass);
          OooO0O0 = (Method)localObject1;
          ((AccessibleObject)localObject1).setAccessible(j);
        }
        paramString = paramLocationRequestCompat.OooO0O0(paramString);
        if (paramString != null)
        {
          paramLocationRequestCompat = OooO0O0;
          Object[] tmp150_147 = new Object[3];
          Object[] tmp151_150 = tmp150_147;
          Object[] tmp151_150 = tmp150_147;
          tmp151_150[0] = paramString;
          tmp151_150[1] = paramExecutor;
          tmp151_150[2] = paramLocationListenerCompat;
          paramString = tmp151_150;
          paramLocationRequestCompat.invoke(paramLocationManager, paramString);
          return j;
        }
      }
      catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException|ClassNotFoundException|UnsupportedOperationException localNoSuchMethodException) {}
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationManagerCompat.Api30Impl
 * JD-Core Version:    0.7.0.1
 */