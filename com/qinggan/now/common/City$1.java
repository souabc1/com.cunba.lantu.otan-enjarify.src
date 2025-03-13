package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class City$1
  implements Parcelable.Creator
{
  public City OooO00o(Parcel paramParcel)
  {
    City localCity = new com/qinggan/now/common/City;
    localCity.<init>();
    String str = paramParcel.readString();
    City.OooO00o(localCity, str);
    paramParcel = paramParcel.readString();
    City.OooO0OO(localCity, paramParcel);
    return localCity;
  }
  
  public City[] OooO0O0(int paramInt)
  {
    return new City[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.City.1
 * JD-Core Version:    0.7.0.1
 */