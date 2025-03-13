package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class GasStation$1
  implements Parcelable.Creator
{
  public GasStation OooO00o(Parcel paramParcel)
  {
    GasStation localGasStation = new com/qinggan/now/common/GasStation;
    Poi localPoi = (Poi)Poi.CREATOR.createFromParcel(paramParcel);
    localGasStation.<init>(localPoi);
    paramParcel = paramParcel.readString();
    GasStation.OooO00o(localGasStation, paramParcel);
    return localGasStation;
  }
  
  public GasStation[] OooO0O0(int paramInt)
  {
    return new GasStation[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.GasStation.1
 * JD-Core Version:    0.7.0.1
 */