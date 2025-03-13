package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class VehicleRemindType$1
  implements Parcelable.Creator
{
  public VehicleRemindType OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    return VehicleRemindType.values()[i];
  }
  
  public VehicleRemindType[] OooO0O0(int paramInt)
  {
    return new VehicleRemindType[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.VehicleRemindType.1
 * JD-Core Version:    0.7.0.1
 */