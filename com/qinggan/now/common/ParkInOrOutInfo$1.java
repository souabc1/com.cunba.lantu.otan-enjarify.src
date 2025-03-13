package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class ParkInOrOutInfo$1
  implements Parcelable.Creator
{
  public ParkInOrOutInfo OooO00o(Parcel paramParcel)
  {
    ParkInOrOutInfo localParkInOrOutInfo = new com/qinggan/now/common/ParkInOrOutInfo;
    localParkInOrOutInfo.<init>();
    String str = paramParcel.readString();
    localParkInOrOutInfo.o00Ooo0 = str;
    str = paramParcel.readString();
    localParkInOrOutInfo.o00Ooo00 = str;
    paramParcel = paramParcel.readString();
    localParkInOrOutInfo.o00OoOoo = paramParcel;
    return localParkInOrOutInfo;
  }
  
  public ParkInOrOutInfo[] OooO0O0(int paramInt)
  {
    return new ParkInOrOutInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.ParkInOrOutInfo.1
 * JD-Core Version:    0.7.0.1
 */