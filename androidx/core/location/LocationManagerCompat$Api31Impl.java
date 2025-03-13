package androidx.core.location;

import android.location.GnssMeasurementsEvent.Callback;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import java.util.concurrent.Executor;

class LocationManagerCompat$Api31Impl
{
  public static boolean OooO00o(LocationManager paramLocationManager, String paramString)
  {
    return paramLocationManager.hasProvider(paramString);
  }
  
  public static boolean OooO0O0(LocationManager paramLocationManager, Executor paramExecutor, GnssMeasurementsEvent.Callback paramCallback)
  {
    return paramLocationManager.registerGnssMeasurementsCallback(paramExecutor, paramCallback);
  }
  
  public static void OooO0OO(LocationManager paramLocationManager, String paramString, LocationRequest paramLocationRequest, Executor paramExecutor, LocationListener paramLocationListener)
  {
    paramLocationManager.requestLocationUpdates(paramString, paramLocationRequest, paramExecutor, paramLocationListener);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationManagerCompat.Api31Impl
 * JD-Core Version:    0.7.0.1
 */