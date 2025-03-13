package androidx.core.location;

import android.location.GpsStatus;
import android.location.GpsStatus.Listener;
import android.location.LocationManager;
import java.util.concurrent.Executor;

class LocationManagerCompat$GpsStatusTransport
  implements GpsStatus.Listener
{
  public final LocationManager OooO00o;
  public final GnssStatusCompat.Callback OooO0O0;
  public volatile Executor OooO0OO;
  
  public void onGpsStatusChanged(int paramInt)
  {
    Executor localExecutor = this.OooO0OO;
    if (localExecutor == null) {
      return;
    }
    int i = 1;
    Object localObject1;
    if (paramInt != i)
    {
      i = 2;
      if (paramInt != i)
      {
        i = 3;
        Object localObject2;
        if (paramInt != i)
        {
          i = 4;
          if (paramInt != i) {
            return;
          }
          localObject1 = this.OooO00o.getGpsStatus(null);
          if (localObject1 == null) {
            return;
          }
          localObject1 = GnssStatusCompat.OooO0O0((GpsStatus)localObject1);
          localObject2 = new androidx/core/location/OooOO0;
          ((OooOO0)localObject2).<init>(this, localExecutor, (GnssStatusCompat)localObject1);
        }
        else
        {
          localObject1 = this.OooO00o.getGpsStatus(null);
          if (localObject1 == null) {
            return;
          }
          paramInt = ((GpsStatus)localObject1).getTimeToFirstFix();
          localObject2 = new androidx/core/location/OooO;
          ((OooO)localObject2).<init>(this, localExecutor, paramInt);
        }
        localExecutor.execute((Runnable)localObject2);
        return;
      }
      localObject1 = new androidx/core/location/OooO0o;
      ((OooO0o)localObject1).<init>(this, localExecutor);
    }
    else
    {
      localObject1 = new androidx/core/location/OooO0OO;
      ((OooO0OO)localObject1).<init>(this, localExecutor);
    }
    localExecutor.execute((Runnable)localObject1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationManagerCompat.GpsStatusTransport
 * JD-Core Version:    0.7.0.1
 */