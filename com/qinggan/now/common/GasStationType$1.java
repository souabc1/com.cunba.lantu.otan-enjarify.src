package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class GasStationType$1
  implements Parcelable.Creator
{
  public GasStationType OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    return GasStationType.values()[i];
  }
  
  public GasStationType[] OooO0O0(int paramInt)
  {
    return new GasStationType[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.GasStationType.1
 * JD-Core Version:    0.7.0.1
 */