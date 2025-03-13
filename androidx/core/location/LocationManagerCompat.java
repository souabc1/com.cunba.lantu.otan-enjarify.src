package androidx.core.location;

import android.location.LocationManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class LocationManagerCompat
{
  public static final WeakHashMap OooO00o;
  
  static
  {
    WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
    localWeakHashMap.<init>();
    OooO00o = localWeakHashMap;
  }
  
  public static void OooO00o(LocationManager paramLocationManager, LocationManagerCompat.LocationListenerTransport paramLocationListenerTransport)
  {
    WeakHashMap localWeakHashMap = OooO00o;
    LocationManagerCompat.LocationListenerKey localLocationListenerKey = paramLocationListenerTransport.getKey();
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramLocationListenerTransport);
    paramLocationListenerTransport = (WeakReference)localWeakHashMap.put(localLocationListenerKey, localWeakReference);
    if (paramLocationListenerTransport != null) {
      paramLocationListenerTransport = (LocationManagerCompat.LocationListenerTransport)paramLocationListenerTransport.get();
    } else {
      paramLocationListenerTransport = null;
    }
    if (paramLocationListenerTransport != null)
    {
      paramLocationListenerTransport.OooOOO0();
      paramLocationManager.removeUpdates(paramLocationListenerTransport);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationManagerCompat
 * JD-Core Version:    0.7.0.1
 */