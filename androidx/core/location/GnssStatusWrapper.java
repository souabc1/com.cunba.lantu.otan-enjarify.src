package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build.VERSION;
import androidx.core.util.Preconditions;

class GnssStatusWrapper
  extends GnssStatusCompat
{
  public final GnssStatus OooO00o;
  
  public GnssStatusWrapper(Object paramObject)
  {
    paramObject = (GnssStatus)Preconditions.OooO0oo((GnssStatus)paramObject);
    this.OooO00o = paramObject;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    boolean bool = paramObject instanceof GnssStatusWrapper;
    if (!bool) {
      return false;
    }
    paramObject = (GnssStatusWrapper)paramObject;
    GnssStatus localGnssStatus = this.OooO00o;
    paramObject = paramObject.OooO00o;
    return localGnssStatus.equals(paramObject);
  }
  
  public float getAzimuthDegrees(int paramInt)
  {
    return this.OooO00o.getAzimuthDegrees(paramInt);
  }
  
  public float getBasebandCn0DbHz(int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j) {
      return GnssStatusWrapper.Api30Impl.OooO00o(this.OooO00o, paramInt);
    }
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public float getCarrierFrequencyHz(int paramInt)
  {
    return GnssStatusWrapper.Api26Impl.OooO00o(this.OooO00o, paramInt);
  }
  
  public float getCn0DbHz(int paramInt)
  {
    return this.OooO00o.getCn0DbHz(paramInt);
  }
  
  public int getConstellationType(int paramInt)
  {
    return this.OooO00o.getConstellationType(paramInt);
  }
  
  public float getElevationDegrees(int paramInt)
  {
    return this.OooO00o.getElevationDegrees(paramInt);
  }
  
  public int getSatelliteCount()
  {
    return this.OooO00o.getSatelliteCount();
  }
  
  public int getSvid(int paramInt)
  {
    return this.OooO00o.getSvid(paramInt);
  }
  
  public int hashCode()
  {
    return this.OooO00o.hashCode();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.location.GnssStatusWrapper
 * JD-Core Version:    0.7.0.1
 */