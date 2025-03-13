package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class AbnormalDrivingType$1
  implements Parcelable.Creator
{
  public AbnormalDrivingType OooO00o(Parcel paramParcel)
  {
    AbnormalDrivingType[] arrayOfAbnormalDrivingType = AbnormalDrivingType.values();
    int i = paramParcel.readInt();
    return arrayOfAbnormalDrivingType[i];
  }
  
  public AbnormalDrivingType[] OooO0O0(int paramInt)
  {
    return new AbnormalDrivingType[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.AbnormalDrivingType.1
 * JD-Core Version:    0.7.0.1
 */