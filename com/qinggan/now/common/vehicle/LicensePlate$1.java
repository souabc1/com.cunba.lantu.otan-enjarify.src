package com.qinggan.now.common.vehicle;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class LicensePlate$1
  implements Parcelable.Creator
{
  public LicensePlate OooO00o(Parcel paramParcel)
  {
    LicensePlate localLicensePlate = new com/qinggan/now/common/vehicle/LicensePlate;
    localLicensePlate.<init>();
    Object localObject = paramParcel.readString();
    LicensePlate.OooO00o(localLicensePlate, (String)localObject);
    localObject = paramParcel.readString();
    LicensePlate.OooO0OO(localLicensePlate, (String)localObject);
    localObject = paramParcel.readString();
    LicensePlate.OooO0Oo(localLicensePlate, (String)localObject);
    localObject = LicensePlateColor.class.getClassLoader();
    paramParcel = (LicensePlateColor)paramParcel.readParcelable((ClassLoader)localObject);
    LicensePlate.OooO0o0(localLicensePlate, paramParcel);
    return localLicensePlate;
  }
  
  public LicensePlate[] OooO0O0(int paramInt)
  {
    return new LicensePlate[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.vehicle.LicensePlate.1
 * JD-Core Version:    0.7.0.1
 */