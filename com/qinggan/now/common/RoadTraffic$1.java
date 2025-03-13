package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class RoadTraffic$1
  implements Parcelable.Creator
{
  public RoadTraffic OooO00o(Parcel paramParcel)
  {
    RoadTraffic localRoadTraffic = new com/qinggan/now/common/RoadTraffic;
    localRoadTraffic.<init>();
    Object localObject = paramParcel.readString();
    localRoadTraffic.o00OoOoo = ((String)localObject);
    localObject = paramParcel.readString();
    localRoadTraffic.o00Ooo0 = ((String)localObject);
    localObject = TrafficType.class.getClassLoader();
    localObject = (TrafficType)paramParcel.readParcelable((ClassLoader)localObject);
    localRoadTraffic.o00OooO0 = ((TrafficType)localObject);
    int i = paramParcel.readInt();
    localRoadTraffic.o00Ooo0O = i;
    i = paramParcel.readInt();
    localRoadTraffic.o00Ooo00 = i;
    long l = paramParcel.readLong();
    localRoadTraffic.o00Ooo0o = l;
    return localRoadTraffic;
  }
  
  public RoadTraffic[] OooO0O0(int paramInt)
  {
    return new RoadTraffic[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.RoadTraffic.1
 * JD-Core Version:    0.7.0.1
 */