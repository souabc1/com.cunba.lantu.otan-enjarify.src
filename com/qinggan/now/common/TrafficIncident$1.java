package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Date;

class TrafficIncident$1
  implements Parcelable.Creator
{
  public TrafficIncident OooO00o(Parcel paramParcel)
  {
    TrafficIncident localTrafficIncident = new com/qinggan/now/common/TrafficIncident;
    localTrafficIncident.<init>();
    long l1 = paramParcel.readLong();
    long l2 = 0L;
    boolean bool1 = l1 < l2;
    if (bool1)
    {
      Date localDate1 = new java/util/Date;
      localDate1.<init>(l1);
      localTrafficIncident.o00Ooo0O = localDate1;
    }
    else
    {
      localTrafficIncident.o00Ooo0O = null;
    }
    l1 = paramParcel.readLong();
    boolean bool2 = l1 < l2;
    if (bool2)
    {
      Date localDate2 = new java/util/Date;
      localDate2.<init>(l1);
      localTrafficIncident.o00Ooo00 = localDate2;
    }
    else
    {
      localTrafficIncident.o00Ooo00 = null;
    }
    Object localObject = GeoPoint.class.getClassLoader();
    localObject = (GeoPoint)paramParcel.readParcelable((ClassLoader)localObject);
    localTrafficIncident.o00Ooo0 = ((GeoPoint)localObject);
    paramParcel = paramParcel.readString();
    localTrafficIncident.o00OoOoo = paramParcel;
    return localTrafficIncident;
  }
  
  public TrafficIncident[] OooO0O0(int paramInt)
  {
    return new TrafficIncident[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.TrafficIncident.1
 * JD-Core Version:    0.7.0.1
 */