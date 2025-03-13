package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class GeoPoint
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public CoordSystem o00OoOoo;
  public double o00Ooo0;
  public double o00Ooo00;
  
  static
  {
    GeoPoint.1 local1 = new com/qinggan/now/common/GeoPoint$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public GeoPoint()
  {
    CoordSystem localCoordSystem = CoordSystem.o00OooO;
    this.o00OoOoo = localCoordSystem;
  }
  
  public void OooO0o0(double paramDouble1, double paramDouble2)
  {
    this.o00Ooo0 = paramDouble1;
    this.o00Ooo00 = paramDouble2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public CoordSystem getCoordSystem()
  {
    return this.o00OoOoo;
  }
  
  public double getLat()
  {
    return this.o00Ooo00;
  }
  
  public String getLatLng()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    double d = this.o00Ooo00;
    localStringBuilder.append(d);
    localStringBuilder.append(",");
    d = this.o00Ooo0;
    localStringBuilder.append(d);
    return localStringBuilder.toString();
  }
  
  public String getLatLng2()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("+");
    double d = this.o00Ooo00;
    localStringBuilder.append(d);
    localStringBuilder.append(",+");
    d = this.o00Ooo0;
    localStringBuilder.append(d);
    return localStringBuilder.toString();
  }
  
  public double getLng()
  {
    return this.o00Ooo0;
  }
  
  public String getLngLat()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    double d = this.o00Ooo0;
    localStringBuilder.append(d);
    localStringBuilder.append(",");
    d = this.o00Ooo00;
    localStringBuilder.append(d);
    return localStringBuilder.toString();
  }
  
  public String getLngLat2()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("+");
    double d = this.o00Ooo0;
    localStringBuilder.append(d);
    localStringBuilder.append(",+");
    d = this.o00Ooo00;
    localStringBuilder.append(d);
    return localStringBuilder.toString();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("iT0F393D3D72");
    localStringBuilder.append((String)localObject);
    double d = this.o00Ooo0;
    localStringBuilder.append(d);
    localObject = m54207b69.F54207b69_11("Mt5819170352");
    localStringBuilder.append((String)localObject);
    d = this.o00Ooo00;
    localStringBuilder.append(d);
    localObject = m54207b69.F54207b69_11("'m410F0405230E5D");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    double d = this.o00Ooo0;
    paramParcel.writeDouble(d);
    d = this.o00Ooo00;
    paramParcel.writeDouble(d);
    CoordSystem localCoordSystem = this.o00OoOoo;
    paramParcel.writeParcelable(localCoordSystem, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.GeoPoint
 * JD-Core Version:    0.7.0.1
 */