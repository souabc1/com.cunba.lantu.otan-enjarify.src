package com.qinggan.now.common.vehicle;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class LicensePlateColor$1
  implements Parcelable.Creator
{
  public LicensePlateColor OooO00o(Parcel paramParcel)
  {
    LicensePlateColor[] arrayOfLicensePlateColor = LicensePlateColor.values();
    int i = paramParcel.readInt();
    return arrayOfLicensePlateColor[i];
  }
  
  public LicensePlateColor[] OooO0O0(int paramInt)
  {
    return new LicensePlateColor[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.vehicle.LicensePlateColor.1
 * JD-Core Version:    0.7.0.1
 */