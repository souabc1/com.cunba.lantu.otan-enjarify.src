package com.qinggan.turnbyturn;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class LocationInfo$1
  implements Parcelable.Creator
{
  public LocationInfo OooO00o(Parcel paramParcel)
  {
    LocationInfo localLocationInfo = new com/qinggan/turnbyturn/LocationInfo;
    localLocationInfo.<init>();
    long l = paramParcel.readLong();
    localLocationInfo.o0O00o0 = l;
    int i = paramParcel.readInt();
    localLocationInfo.o00Ooo0 = i;
    i = paramParcel.readInt();
    localLocationInfo.o00OooOo = i;
    double d = paramParcel.readDouble();
    localLocationInfo.o00OooO0 = d;
    d = paramParcel.readDouble();
    localLocationInfo.o00Ooo0o = d;
    d = paramParcel.readDouble();
    localLocationInfo.o00OooOO = d;
    d = paramParcel.readDouble();
    localLocationInfo.o00OooO = d;
    d = paramParcel.readDouble();
    localLocationInfo.o00Ooo00 = d;
    float f = paramParcel.readFloat();
    localLocationInfo.o00OoOoo = f;
    paramParcel = paramParcel.readString();
    localLocationInfo.o00Ooo0O = paramParcel;
    return localLocationInfo;
  }
  
  public LocationInfo[] OooO0O0(int paramInt)
  {
    return new LocationInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.turnbyturn.LocationInfo.1
 * JD-Core Version:    0.7.0.1
 */