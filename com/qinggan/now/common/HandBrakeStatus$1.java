package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class HandBrakeStatus$1
  implements Parcelable.Creator
{
  public HandBrakeStatus OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    return HandBrakeStatus.values()[i];
  }
  
  public HandBrakeStatus[] OooO0O0(int paramInt)
  {
    return new HandBrakeStatus[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.HandBrakeStatus.1
 * JD-Core Version:    0.7.0.1
 */