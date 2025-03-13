package androidx.core.location;

import android.location.GnssStatus;
import android.location.GnssStatus.Callback;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;

class LocationManagerCompat$PreRGnssStatusTransport
  extends GnssStatus.Callback
{
  public final GnssStatusCompat.Callback OooO00o;
  public volatile Executor OooO0O0;
  
  public LocationManagerCompat$PreRGnssStatusTransport(GnssStatusCompat.Callback paramCallback)
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
  
  public void OooO(Executor paramExecutor)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramExecutor != null)
    {
      bool2 = bool1;
    }
    else
    {
      bool2 = false;
      localExecutor = null;
    }
    String str = "invalid null executor";
    Preconditions.OooO0O0(bool2, str);
    Executor localExecutor = this.OooO0O0;
    if (localExecutor != null) {
      bool1 = false;
    }
    Preconditions.OooOO0(bool1);
    this.OooO0O0 = paramExecutor;
  }
  
  public void OooOO0()
  {
    this.OooO0O0 = null;
  }
  
  public void onFirstFix(int paramInt)
  {
    Executor localExecutor = this.OooO0O0;
    if (localExecutor == null) {
      return;
    }
    o000oOoO localo000oOoO = new androidx/core/location/o000oOoO;
    localo000oOoO.<init>(this, localExecutor, paramInt);
    localExecutor.execute(localo000oOoO);
  }
  
  public void onSatelliteStatusChanged(GnssStatus paramGnssStatus)
  {
    Executor localExecutor = this.OooO0O0;
    if (localExecutor == null) {
      return;
    }
    Oooo0 localOooo0 = new androidx/core/location/Oooo0;
    localOooo0.<init>(this, localExecutor, paramGnssStatus);
    localExecutor.execute(localOooo0);
  }
  
  public void onStarted()
  {
    Executor localExecutor = this.OooO0O0;
    if (localExecutor == null) {
      return;
    }
    Oooo000 localOooo000 = new androidx/core/location/Oooo000;
    localOooo000.<init>(this, localExecutor);
    localExecutor.execute(localOooo000);
  }
  
  public void onStopped()
  {
    Executor localExecutor = this.OooO0O0;
    if (localExecutor == null) {
      return;
    }
    o0OoOo0 localo0OoOo0 = new androidx/core/location/o0OoOo0;
    localo0OoOo0.<init>(this, localExecutor);
    localExecutor.execute(localo0OoOo0);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport
 * JD-Core Version:    0.7.0.1
 */