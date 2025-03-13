package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;

final class LocationManagerCompat$CancellableLocationListener
  implements LocationListener
{
  public final LocationManager OooO00o;
  public final Executor OooO0O0;
  public final Handler OooO0OO;
  public Consumer OooO0Oo;
  public Runnable OooO0o;
  public boolean OooO0o0;
  
  public final void OooO0O0()
  {
    this.OooO0Oo = null;
    this.OooO00o.removeUpdates(this);
    Runnable localRunnable = this.OooO0o;
    if (localRunnable != null)
    {
      Handler localHandler = this.OooO0OO;
      localHandler.removeCallbacks(localRunnable);
      this.OooO0o = null;
    }
  }
  
  public void onLocationChanged(Location paramLocation)
  {
    try
    {
      boolean bool = this.OooO0o0;
      if (bool) {
        return;
      }
      bool = true;
      this.OooO0o0 = bool;
      Consumer localConsumer = this.OooO0Oo;
      Executor localExecutor = this.OooO0O0;
      OooO0O0 localOooO0O0 = new androidx/core/location/OooO0O0;
      localOooO0O0.<init>(localConsumer, paramLocation);
      localExecutor.execute(localOooO0O0);
      OooO0O0();
      return;
    }
    finally {}
  }
  
  public void onProviderDisabled(String paramString)
  {
    onLocationChanged(null);
  }
  
  public void onProviderEnabled(String paramString) {}
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationManagerCompat.CancellableLocationListener
 * JD-Core Version:    0.7.0.1
 */