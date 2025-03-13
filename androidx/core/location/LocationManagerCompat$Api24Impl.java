package androidx.core.location;

import android.location.GnssMeasurementsEvent.Callback;
import android.location.GnssStatus.Callback;
import android.location.LocationManager;
import android.os.Handler;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;

class LocationManagerCompat$Api24Impl
{
  public static boolean OooO00o(LocationManager paramLocationManager, GnssMeasurementsEvent.Callback paramCallback, Handler paramHandler)
  {
    return paramLocationManager.registerGnssMeasurementsCallback(paramCallback, paramHandler);
  }
  
  public static boolean OooO0O0(LocationManager paramLocationManager, Handler paramHandler, Executor paramExecutor, GnssStatusCompat.Callback paramCallback)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramHandler != null)
    {
      bool2 = bool1;
    }
    else
    {
      bool2 = false;
      ??? = null;
    }
    Preconditions.OooO00o(bool2);
    synchronized (LocationManagerCompat.GnssListenersHolder.OooO00o)
    {
      Object localObject = ???.get(paramCallback);
      localObject = (LocationManagerCompat.PreRGnssStatusTransport)localObject;
      if (localObject == null)
      {
        localObject = new androidx/core/location/LocationManagerCompat$PreRGnssStatusTransport;
        ((LocationManagerCompat.PreRGnssStatusTransport)localObject).<init>(paramCallback);
      }
      else
      {
        ((LocationManagerCompat.PreRGnssStatusTransport)localObject).OooOO0();
      }
      ((LocationManagerCompat.PreRGnssStatusTransport)localObject).OooO(paramExecutor);
      boolean bool3 = paramLocationManager.registerGnssStatusCallback((GnssStatus.Callback)localObject, paramHandler);
      if (bool3)
      {
        ???.put(paramCallback, localObject);
        return bool1;
      }
      return false;
    }
  }
  
  public static void OooO0OO(LocationManager paramLocationManager, GnssMeasurementsEvent.Callback paramCallback)
  {
    paramLocationManager.unregisterGnssMeasurementsCallback(paramCallback);
  }
  
  public static void OooO0Oo(LocationManager paramLocationManager, Object paramObject)
  {
    boolean bool = paramObject instanceof LocationManagerCompat.PreRGnssStatusTransport;
    if (bool)
    {
      Object localObject = paramObject;
      localObject = (LocationManagerCompat.PreRGnssStatusTransport)paramObject;
      ((LocationManagerCompat.PreRGnssStatusTransport)localObject).OooOO0();
    }
    paramObject = (GnssStatus.Callback)paramObject;
    paramLocationManager.unregisterGnssStatusCallback(paramObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationManagerCompat.Api24Impl
 * JD-Core Version:    0.7.0.1
 */