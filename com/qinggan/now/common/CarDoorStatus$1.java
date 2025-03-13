package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class CarDoorStatus$1
  implements Parcelable.Creator
{
  public CarDoorStatus OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    return CarDoorStatus.values()[i];
  }
  
  public CarDoorStatus[] OooO0O0(int paramInt)
  {
    return new CarDoorStatus[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.CarDoorStatus.1
 * JD-Core Version:    0.7.0.1
 */