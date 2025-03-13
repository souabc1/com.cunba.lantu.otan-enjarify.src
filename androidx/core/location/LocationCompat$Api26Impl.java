package androidx.core.location;

import android.location.Location;

class LocationCompat$Api26Impl
{
  public static void OooO(Location paramLocation, float paramFloat)
  {
    paramLocation.setVerticalAccuracyMeters(paramFloat);
  }
  
  public static float OooO00o(Location paramLocation)
  {
    return paramLocation.getBearingAccuracyDegrees();
  }
  
  public static float OooO0O0(Location paramLocation)
  {
    return paramLocation.getSpeedAccuracyMetersPerSecond();
  }
  
  public static float OooO0OO(Location paramLocation)
  {
    return paramLocation.getVerticalAccuracyMeters();
  }
  
  public static boolean OooO0Oo(Location paramLocation)
  {
    return paramLocation.hasBearingAccuracy();
  }
  
  public static boolean OooO0o(Location paramLocation)
  {
    return paramLocation.hasVerticalAccuracy();
  }
  
  public static boolean OooO0o0(Location paramLocation)
  {
    return paramLocation.hasSpeedAccuracy();
  }
  
  public static void OooO0oO(Location paramLocation, float paramFloat)
  {
    paramLocation.setBearingAccuracyDegrees(paramFloat);
  }
  
  public static void OooO0oo(Location paramLocation, float paramFloat)
  {
    paramLocation.setSpeedAccuracyMetersPerSecond(paramFloat);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationCompat.Api26Impl
 * JD-Core Version:    0.7.0.1
 */