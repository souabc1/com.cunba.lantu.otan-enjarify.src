package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class WeatherType$1
  implements Parcelable.Creator
{
  public WeatherType OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    paramParcel.readString();
    return WeatherType.values()[i];
  }
  
  public WeatherType[] OooO0O0(int paramInt)
  {
    return new WeatherType[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.WeatherType.1
 * JD-Core Version:    0.7.0.1
 */