package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import androidx.core.util.Preconditions;
import java.util.Iterator;

class GpsStatusWrapper
  extends GnssStatusCompat
{
  public final GpsStatus OooO00o;
  public int OooO0O0;
  public Iterator OooO0OO;
  public int OooO0Oo;
  public GpsSatellite OooO0o0;
  
  public GpsStatusWrapper(GpsStatus paramGpsStatus)
  {
    paramGpsStatus = (GpsStatus)Preconditions.OooO0oo(paramGpsStatus);
    this.OooO00o = paramGpsStatus;
    int i = -1;
    this.OooO0O0 = i;
    paramGpsStatus = paramGpsStatus.getSatellites().iterator();
    this.OooO0OO = paramGpsStatus;
    this.OooO0Oo = i;
    this.OooO0o0 = null;
  }
  
  private static int getConstellationFromPrn(int paramInt)
  {
    if (paramInt > 0)
    {
      i = 32;
      if (paramInt <= i) {
        return 1;
      }
    }
    int i = 33;
    int j = 64;
    if ((paramInt >= i) && (paramInt <= j)) {
      return 2;
    }
    if (paramInt > j)
    {
      i = 88;
      if (paramInt <= i) {
        return 3;
      }
    }
    i = 200;
    if (paramInt > i)
    {
      j = 235;
      if (paramInt <= j) {
        return 5;
      }
    }
    j = 193;
    if ((paramInt >= j) && (paramInt <= i)) {
      return 4;
    }
    return 0;
  }
  
  private GpsSatellite getSatellite(int paramInt)
  {
    synchronized (this.OooO00o)
    {
      int i = this.OooO0Oo;
      Object localObject1;
      if (paramInt < i)
      {
        localObject1 = this.OooO00o;
        localObject1 = ((GpsStatus)localObject1).getSatellites();
        localObject1 = ((Iterable)localObject1).iterator();
        this.OooO0OO = ((Iterator)localObject1);
        i = -1;
        this.OooO0Oo = i;
      }
      for (;;)
      {
        i = this.OooO0Oo;
        if (i >= paramInt) {
          break;
        }
        i += 1;
        this.OooO0Oo = i;
        localObject1 = this.OooO0OO;
        boolean bool = ((Iterator)localObject1).hasNext();
        if (!bool)
        {
          paramInt = 0;
          localGpsSatellite = null;
          this.OooO0o0 = null;
          break;
        }
        localObject1 = this.OooO0OO;
        localObject1 = ((Iterator)localObject1).next();
        localObject1 = (GpsSatellite)localObject1;
        this.OooO0o0 = ((GpsSatellite)localObject1);
      }
      GpsSatellite localGpsSatellite = this.OooO0o0;
      return (GpsSatellite)Preconditions.OooO0oo(localGpsSatellite);
    }
  }
  
  private static int getSvidFromPrn(int paramInt)
  {
    int i = getConstellationFromPrn(paramInt);
    int j = 2;
    if (i != j)
    {
      j = 3;
      if (i != j)
      {
        j = 5;
        if (i == j) {
          paramInt += -200;
        }
      }
      else
      {
        paramInt += -64;
      }
    }
    else
    {
      paramInt += 87;
    }
    return paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    boolean bool = paramObject instanceof GpsStatusWrapper;
    if (!bool) {
      return false;
    }
    paramObject = (GpsStatusWrapper)paramObject;
    GpsStatus localGpsStatus = this.OooO00o;
    paramObject = paramObject.OooO00o;
    return localGpsStatus.equals(paramObject);
  }
  
  public float getAzimuthDegrees(int paramInt)
  {
    return getSatellite(paramInt).getAzimuth();
  }
  
  public float getBasebandCn0DbHz(int paramInt)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public float getCarrierFrequencyHz(int paramInt)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public float getCn0DbHz(int paramInt)
  {
    return getSatellite(paramInt).getSnr();
  }
  
  public int getConstellationType(int paramInt)
  {
    return getConstellationFromPrn(getSatellite(paramInt).getPrn());
  }
  
  public float getElevationDegrees(int paramInt)
  {
    return getSatellite(paramInt).getElevation();
  }
  
  public int getSatelliteCount()
  {
    synchronized (this.OooO00o)
    {
      int i = this.OooO0O0;
      int j = -1;
      if (i == j)
      {
        Object localObject1 = this.OooO00o;
        localObject1 = ((GpsStatus)localObject1).getSatellites();
        localObject1 = ((Iterable)localObject1).iterator();
        for (;;)
        {
          boolean bool = ((Iterator)localObject1).hasNext();
          if (!bool) {
            break;
          }
          Object localObject3 = ((Iterator)localObject1).next();
          localObject3 = (GpsSatellite)localObject3;
          int k = this.OooO0O0 + 1;
          this.OooO0O0 = k;
        }
        i = this.OooO0O0 + 1;
        this.OooO0O0 = i;
      }
      i = this.OooO0O0;
      return i;
    }
  }
  
  public int getSvid(int paramInt)
  {
    return getSvidFromPrn(getSatellite(paramInt).getPrn());
  }
  
  public int hashCode()
  {
    return this.OooO00o.hashCode();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.GpsStatusWrapper
 * JD-Core Version:    0.7.0.1
 */