package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class GeoPoint$1
  implements Parcelable.Creator
{
  public GeoPoint OooO00o(Parcel paramParcel)
  {
    GeoPoint localGeoPoint = new com/qinggan/now/common/GeoPoint;
    localGeoPoint.<init>();
    double d = paramParcel.readDouble();
    GeoPoint.OooO00o(localGeoPoint, d);
    d = paramParcel.readDouble();
    GeoPoint.OooO0OO(localGeoPoint, d);
    ClassLoader localClassLoader = CoordSystem.class.getClassLoader();
    paramParcel = (CoordSystem)paramParcel.readParcelable(localClassLoader);
    GeoPoint.OooO0Oo(localGeoPoint, paramParcel);
    return localGeoPoint;
  }
  
  public GeoPoint[] OooO0O0(int paramInt)
  {
    return new GeoPoint[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.GeoPoint.1
 * JD-Core Version:    0.7.0.1
 */