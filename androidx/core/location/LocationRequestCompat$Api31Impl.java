package androidx.core.location;

import android.location.LocationRequest;
import android.location.LocationRequest.Builder;

class LocationRequestCompat$Api31Impl
{
  public static LocationRequest OooO00o(LocationRequestCompat paramLocationRequestCompat)
  {
    LocationRequest.Builder localBuilder = new android/location/LocationRequest$Builder;
    long l = paramLocationRequestCompat.getIntervalMillis();
    localBuilder.<init>(l);
    int i = paramLocationRequestCompat.getQuality();
    localBuilder = localBuilder.setQuality(i);
    l = paramLocationRequestCompat.getMinUpdateIntervalMillis();
    localBuilder = localBuilder.setMinUpdateIntervalMillis(l);
    l = paramLocationRequestCompat.getDurationMillis();
    localBuilder = localBuilder.setDurationMillis(l);
    i = paramLocationRequestCompat.getMaxUpdates();
    localBuilder = localBuilder.setMaxUpdates(i);
    float f = paramLocationRequestCompat.getMinUpdateDistanceMeters();
    localBuilder = localBuilder.setMinUpdateDistanceMeters(f);
    l = paramLocationRequestCompat.getMaxUpdateDelayMillis();
    return localBuilder.setMaxUpdateDelayMillis(l).build();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationRequestCompat.Api31Impl
 * JD-Core Version:    0.7.0.1
 */