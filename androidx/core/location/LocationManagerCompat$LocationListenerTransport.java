package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.core.util.ObjectsCompat;
import java.util.List;
import java.util.concurrent.Executor;

class LocationManagerCompat$LocationListenerTransport
  implements LocationListener
{
  public volatile LocationManagerCompat.LocationListenerKey OooO00o;
  public final Executor OooO0O0;
  
  public void OooOOO0()
  {
    this.OooO00o = null;
  }
  
  public LocationManagerCompat.LocationListenerKey getKey()
  {
    return (LocationManagerCompat.LocationListenerKey)ObjectsCompat.OooO0OO(this.OooO00o);
  }
  
  public void onFlushComplete(int paramInt)
  {
    Object localObject = this.OooO00o;
    if (localObject == null) {
      return;
    }
    localObject = this.OooO0O0;
    OooOOO0 localOooOOO0 = new androidx/core/location/OooOOO0;
    localOooOOO0.<init>(this, paramInt);
    ((Executor)localObject).execute(localOooOOO0);
  }
  
  public void onLocationChanged(Location paramLocation)
  {
    Object localObject = this.OooO00o;
    if (localObject == null) {
      return;
    }
    localObject = this.OooO0O0;
    OooOo00 localOooOo00 = new androidx/core/location/OooOo00;
    localOooOo00.<init>(this, paramLocation);
    ((Executor)localObject).execute(localOooOo00);
  }
  
  public void onLocationChanged(List paramList)
  {
    Object localObject = this.OooO00o;
    if (localObject == null) {
      return;
    }
    localObject = this.OooO0O0;
    OooOOO localOooOOO = new androidx/core/location/OooOOO;
    localOooOOO.<init>(this, paramList);
    ((Executor)localObject).execute(localOooOOO);
  }
  
  public void onProviderDisabled(String paramString)
  {
    Object localObject = this.OooO00o;
    if (localObject == null) {
      return;
    }
    localObject = this.OooO0O0;
    OooOOOO localOooOOOO = new androidx/core/location/OooOOOO;
    localOooOOOO.<init>(this, paramString);
    ((Executor)localObject).execute(localOooOOOO);
  }
  
  public void onProviderEnabled(String paramString)
  {
    Object localObject = this.OooO00o;
    if (localObject == null) {
      return;
    }
    localObject = this.OooO0O0;
    OooOO0O localOooOO0O = new androidx/core/location/OooOO0O;
    localOooOO0O.<init>(this, paramString);
    ((Executor)localObject).execute(localOooOO0O);
  }
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
    Object localObject = this.OooO00o;
    if (localObject == null) {
      return;
    }
    localObject = this.OooO0O0;
    OooOo localOooOo = new androidx/core/location/OooOo;
    localOooOo.<init>(this, paramString, paramInt, paramBundle);
    ((Executor)localObject).execute(localOooOo);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationManagerCompat.LocationListenerTransport
 * JD-Core Version:    0.7.0.1
 */