package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.content.PermissionChecker;
import java.util.Calendar;

class TwilightManager
{
  public static TwilightManager OooO0Oo;
  public final Context OooO00o;
  public final LocationManager OooO0O0;
  public final TwilightManager.TwilightState OooO0OO;
  
  public TwilightManager(Context paramContext, LocationManager paramLocationManager)
  {
    TwilightManager.TwilightState localTwilightState = new androidx/appcompat/app/TwilightManager$TwilightState;
    localTwilightState.<init>();
    this.OooO0OO = localTwilightState;
    this.OooO00o = paramContext;
    this.OooO0O0 = paramLocationManager;
  }
  
  public static TwilightManager OooO00o(Context paramContext)
  {
    TwilightManager localTwilightManager = OooO0Oo;
    if (localTwilightManager == null)
    {
      paramContext = paramContext.getApplicationContext();
      localTwilightManager = new androidx/appcompat/app/TwilightManager;
      LocationManager localLocationManager = (LocationManager)paramContext.getSystemService("location");
      localTwilightManager.<init>(paramContext, localLocationManager);
      OooO0Oo = localTwilightManager;
    }
    return OooO0Oo;
  }
  
  private Location getLastKnownLocation()
  {
    Object localObject = this.OooO00o;
    int i = PermissionChecker.OooO0O0((Context)localObject, "android.permission.ACCESS_COARSE_LOCATION");
    Location localLocation = null;
    if (i == 0)
    {
      localObject = OooO0O0("network");
    }
    else
    {
      i = 0;
      localObject = null;
    }
    Context localContext = this.OooO00o;
    String str = "android.permission.ACCESS_FINE_LOCATION";
    int j = PermissionChecker.OooO0O0(localContext, str);
    if (j == 0) {
      localLocation = OooO0O0("gps");
    }
    if ((localLocation != null) && (localObject != null))
    {
      long l1 = localLocation.getTime();
      long l2 = ((Location)localObject).getTime();
      boolean bool = l1 < l2;
      if (bool) {
        localObject = localLocation;
      }
      return localObject;
    }
    if (localLocation != null) {
      localObject = localLocation;
    }
    return localObject;
  }
  
  private boolean isStateValid()
  {
    TwilightManager.TwilightState localTwilightState = this.OooO0OO;
    long l1 = localTwilightState.OooO0O0;
    long l2 = System.currentTimeMillis();
    boolean bool = l1 < l2;
    if (bool)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localTwilightState = null;
    }
    return bool;
  }
  
  public static void setInstance(TwilightManager paramTwilightManager)
  {
    OooO0Oo = paramTwilightManager;
  }
  
  public final Location OooO0O0(String paramString)
  {
    try
    {
      LocationManager localLocationManager = this.OooO0O0;
      boolean bool = localLocationManager.isProviderEnabled(paramString);
      if (bool)
      {
        localLocationManager = this.OooO0O0;
        return localLocationManager.getLastKnownLocation(paramString);
      }
    }
    catch (Exception localException) {}
    return null;
  }
  
  public final void OooO0OO(Location paramLocation)
  {
    TwilightManager.TwilightState localTwilightState = this.OooO0OO;
    long l1 = System.currentTimeMillis();
    TwilightCalculator localTwilightCalculator = TwilightCalculator.getInstance();
    long l2 = 86400000L;
    double d1 = 4.26872718006837E-316D;
    long l3 = l1 - l2;
    double d2 = paramLocation.getLatitude();
    double d3 = paramLocation.getLongitude();
    localTwilightCalculator.OooO00o(l3, d2, d3);
    d2 = paramLocation.getLatitude();
    d3 = paramLocation.getLongitude();
    l3 = l1;
    localTwilightCalculator.OooO00o(l1, d2, d3);
    int i = localTwilightCalculator.OooO0OO;
    int j = 1;
    if (i != j) {
      j = 0;
    }
    int k = j;
    long l4 = localTwilightCalculator.OooO0O0;
    long l5 = localTwilightCalculator.OooO00o;
    l3 = l1 + l2;
    d1 = paramLocation.getLatitude();
    double d4 = paramLocation.getLongitude();
    long l6 = l5;
    d2 = d1;
    l2 = l4;
    d3 = d4;
    localTwilightCalculator.OooO00o(l3, d1, d4);
    long l7 = localTwilightCalculator.OooO0O0;
    long l8 = -1;
    boolean bool2 = l4 < l8;
    if (bool2)
    {
      boolean bool3 = l5 < l8;
      if (bool3)
      {
        bool3 = l1 < l5;
        l5 = 0L;
        d2 = 0.0D;
        if (bool3)
        {
          l7 += l5;
        }
        else
        {
          boolean bool1 = l1 < l4;
          if (bool1) {
            l7 = l6 + l5;
          } else {
            l7 = l4 + l5;
          }
        }
        l8 = 60000L;
        l7 += l8;
        break label279;
      }
    }
    l7 = 43200000L + l1;
    label279:
    localTwilightState.OooO00o = k;
    localTwilightState.OooO0O0 = l7;
  }
  
  public boolean isNight()
  {
    Object localObject = this.OooO0OO;
    boolean bool = isStateValid();
    if (bool) {
      return ((TwilightManager.TwilightState)localObject).OooO00o;
    }
    Location localLocation = getLastKnownLocation();
    if (localLocation != null)
    {
      OooO0OO(localLocation);
      return ((TwilightManager.TwilightState)localObject).OooO00o;
    }
    localObject = Calendar.getInstance();
    int j = ((Calendar)localObject).get(11);
    int i = 6;
    if (j >= i)
    {
      i = 22;
      if (j < i)
      {
        j = 0;
        localObject = null;
        break label82;
      }
    }
    j = 1;
    label82:
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.TwilightManager
 * JD-Core Version:    0.7.0.1
 */