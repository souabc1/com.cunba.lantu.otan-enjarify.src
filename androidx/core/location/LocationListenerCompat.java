package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;

public abstract interface LocationListenerCompat
  extends LocationListener
{
  public void onFlushComplete(int paramInt) {}
  
  public void onLocationChanged(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    while (j < i)
    {
      Location localLocation = (Location)paramList.get(j);
      onLocationChanged(localLocation);
      j += 1;
    }
  }
  
  public void onProviderDisabled(String paramString) {}
  
  public void onProviderEnabled(String paramString) {}
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.LocationListenerCompat
 * JD-Core Version:    0.7.0.1
 */