package androidx.core.location;

import android.location.GnssStatus;
import android.location.GpsStatus;

public abstract class GnssStatusCompat
{
  public static GnssStatusCompat OooO00o(GnssStatus paramGnssStatus)
  {
    GnssStatusWrapper localGnssStatusWrapper = new androidx/core/location/GnssStatusWrapper;
    localGnssStatusWrapper.<init>(paramGnssStatus);
    return localGnssStatusWrapper;
  }
  
  public static GnssStatusCompat OooO0O0(GpsStatus paramGpsStatus)
  {
    GpsStatusWrapper localGpsStatusWrapper = new androidx/core/location/GpsStatusWrapper;
    localGpsStatusWrapper.<init>(paramGpsStatus);
    return localGpsStatusWrapper;
  }
  
  public abstract float getAzimuthDegrees(int paramInt);
  
  public abstract float getBasebandCn0DbHz(int paramInt);
  
  public abstract float getCarrierFrequencyHz(int paramInt);
  
  public abstract float getCn0DbHz(int paramInt);
  
  public abstract int getConstellationType(int paramInt);
  
  public abstract float getElevationDegrees(int paramInt);
  
  public abstract int getSatelliteCount();
  
  public abstract int getSvid(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.GnssStatusCompat
 * JD-Core Version:    0.7.0.1
 */