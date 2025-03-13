package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class CarWash$1
  implements Parcelable.Creator
{
  public CarWash OooO00o(Parcel paramParcel)
  {
    CarWash localCarWash = new com/qinggan/now/common/CarWash;
    Poi localPoi = (Poi)Poi.CREATOR.createFromParcel(paramParcel);
    localCarWash.<init>(localPoi);
    float f = paramParcel.readFloat();
    CarWash.OooO00o(localCarWash, f);
    int i = paramParcel.readInt();
    CarWash.OooO0OO(localCarWash, i);
    return localCarWash;
  }
  
  public CarWash[] OooO0O0(int paramInt)
  {
    return new CarWash[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.CarWash.1
 * JD-Core Version:    0.7.0.1
 */