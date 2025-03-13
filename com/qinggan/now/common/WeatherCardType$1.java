package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class WeatherCardType$1
  implements Parcelable.Creator
{
  public WeatherCardType OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    return WeatherCardType.values()[i];
  }
  
  public WeatherCardType[] OooO0O0(int paramInt)
  {
    return new WeatherCardType[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.WeatherCardType.1
 * JD-Core Version:    0.7.0.1
 */