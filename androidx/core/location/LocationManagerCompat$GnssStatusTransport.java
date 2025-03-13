package androidx.core.location;

import android.location.GnssStatus;
import android.location.GnssStatus.Callback;
import androidx.core.util.Preconditions;

class LocationManagerCompat$GnssStatusTransport
  extends GnssStatus.Callback
{
  public final GnssStatusCompat.Callback OooO00o;
  
  public LocationManagerCompat$GnssStatusTransport(GnssStatusCompat.Callback paramCallback)
  {
    boolean bool;
    if (paramCallback != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.OooO0O0(bool, "invalid null callback");
    this.OooO00o = paramCallback;
  }
  
  public void onFirstFix(int paramInt)
  {
    this.OooO00o.OooO00o(paramInt);
  }
  
  public void onSatelliteStatusChanged(GnssStatus paramGnssStatus)
  {
    GnssStatusCompat.Callback localCallback = this.OooO00o;
    paramGnssStatus = GnssStatusCompat.OooO00o(paramGnssStatus);
    localCallback.OooO0O0(paramGnssStatus);
  }
  
  public void onStarted()
  {
    this.OooO00o.OooO0OO();
  }
  
  public void onStopped()
  {
    this.OooO00o.OooO0Oo();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationManagerCompat.GnssStatusTransport
 * JD-Core Version:    0.7.0.1
 */