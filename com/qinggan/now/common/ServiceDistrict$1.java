package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class ServiceDistrict$1
  implements Parcelable.Creator
{
  public ServiceDistrict OooO00o(Parcel paramParcel)
  {
    ServiceDistrict localServiceDistrict = new com/qinggan/now/common/ServiceDistrict;
    localServiceDistrict.<init>();
    String str = paramParcel.readString();
    ServiceDistrict.OooO00o(localServiceDistrict, str);
    int i = paramParcel.readInt();
    ServiceDistrict.OooO0OO(localServiceDistrict, i);
    i = paramParcel.readInt();
    ServiceDistrict.OooO0Oo(localServiceDistrict, i);
    str = paramParcel.readString();
    ServiceDistrict.OooO0o0(localServiceDistrict, str);
    str = paramParcel.readString();
    ServiceDistrict.OooO0o(localServiceDistrict, str);
    double d = paramParcel.readDouble();
    localServiceDistrict.o00Ooo00 = d;
    d = paramParcel.readDouble();
    localServiceDistrict.o00OoOoo = d;
    return localServiceDistrict;
  }
  
  public ServiceDistrict[] OooO0O0(int paramInt)
  {
    return new ServiceDistrict[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.ServiceDistrict.1
 * JD-Core Version:    0.7.0.1
 */