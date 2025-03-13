package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class WindDirection$1
  implements Parcelable.Creator
{
  public WindDirection OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    paramParcel.readInt();
    return WindDirection.values()[i];
  }
  
  public WindDirection[] OooO0O0(int paramInt)
  {
    return new WindDirection[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.WindDirection.1
 * JD-Core Version:    0.7.0.1
 */