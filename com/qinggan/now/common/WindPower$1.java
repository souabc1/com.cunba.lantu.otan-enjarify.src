package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class WindPower$1
  implements Parcelable.Creator
{
  public WindPower OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    paramParcel.readInt();
    return WindPower.values()[i];
  }
  
  public WindPower[] OooO0O0(int paramInt)
  {
    return new WindPower[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.WindPower.1
 * JD-Core Version:    0.7.0.1
 */