package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class ParkingLot$1
  implements Parcelable.Creator
{
  public ParkingLot OooO00o(Parcel paramParcel)
  {
    ParkingLot localParkingLot = new com/qinggan/now/common/ParkingLot;
    Object localObject = (Poi)Poi.CREATOR.createFromParcel(paramParcel);
    localParkingLot.<init>((Poi)localObject);
    float f = paramParcel.readFloat();
    ParkingLot.OooO00o(localParkingLot, f);
    int i = paramParcel.readInt();
    ParkingLot.OooO0Oo(localParkingLot, i);
    f = paramParcel.readFloat();
    ParkingLot.OooO0oo(localParkingLot, f);
    i = paramParcel.readInt();
    ParkingLot.OooO(localParkingLot, i);
    i = paramParcel.readInt();
    ParkingLot.OooOO0(localParkingLot, i);
    i = paramParcel.readInt();
    ParkingLot.OooOO0O(localParkingLot, i);
    localObject = paramParcel.readString();
    ParkingLot.OooOO0o(localParkingLot, (String)localObject);
    i = paramParcel.readInt();
    ParkingLot.OooOOO0(localParkingLot, i);
    f = paramParcel.readFloat();
    ParkingLot.OooOOO(localParkingLot, f);
    localObject = Long.valueOf(paramParcel.readLong());
    ParkingLot.OooOOOO(localParkingLot, (Long)localObject);
    localObject = Long.valueOf(paramParcel.readLong());
    ParkingLot.OooO0OO(localParkingLot, (Long)localObject);
    i = paramParcel.readInt();
    ParkingLot.OooO0o0(localParkingLot, i);
    localObject = paramParcel.readString();
    ParkingLot.OooO0o(localParkingLot, (String)localObject);
    paramParcel = paramParcel.readString();
    ParkingLot.OooO0oO(localParkingLot, paramParcel);
    return localParkingLot;
  }
  
  public ParkingLot[] OooO0O0(int paramInt)
  {
    return new ParkingLot[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.ParkingLot.1
 * JD-Core Version:    0.7.0.1
 */