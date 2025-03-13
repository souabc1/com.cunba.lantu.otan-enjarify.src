package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class Province$1
  implements Parcelable.Creator
{
  public Province OooO00o(Parcel paramParcel)
  {
    Province localProvince = new com/qinggan/now/common/Province;
    localProvince.<init>();
    String str = paramParcel.readString();
    Province.OooO00o(localProvince, str);
    str = paramParcel.readString();
    Province.OooO0OO(localProvince, str);
    paramParcel = paramParcel.readString();
    Province.OooO0Oo(localProvince, paramParcel);
    return localProvince;
  }
  
  public Province[] OooO0O0(int paramInt)
  {
    return new Province[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Province.1
 * JD-Core Version:    0.7.0.1
 */