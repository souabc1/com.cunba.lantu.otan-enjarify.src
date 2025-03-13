package com.qinggan.now.common.vehicle;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class VehicleMode$1
  implements Parcelable.Creator
{
  public VehicleMode OooO00o(Parcel paramParcel)
  {
    VehicleMode localVehicleMode = new com/qinggan/now/common/vehicle/VehicleMode;
    localVehicleMode.<init>();
    String str = paramParcel.readString();
    VehicleMode.OooO00o(localVehicleMode, str);
    str = paramParcel.readString();
    VehicleMode.OooO0OO(localVehicleMode, str);
    str = paramParcel.readString();
    VehicleMode.OooO0Oo(localVehicleMode, str);
    paramParcel = paramParcel.readString();
    VehicleMode.OooO0o0(localVehicleMode, paramParcel);
    return localVehicleMode;
  }
  
  public VehicleMode[] OooO0O0(int paramInt)
  {
    return new VehicleMode[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.vehicle.VehicleMode.1
 * JD-Core Version:    0.7.0.1
 */