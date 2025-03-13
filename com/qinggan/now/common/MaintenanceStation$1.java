package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class MaintenanceStation$1
  implements Parcelable.Creator
{
  public MaintenanceStation OooO00o(Parcel paramParcel)
  {
    MaintenanceStation localMaintenanceStation = new com/qinggan/now/common/MaintenanceStation;
    paramParcel = (Poi)Poi.CREATOR.createFromParcel(paramParcel);
    localMaintenanceStation.<init>(paramParcel);
    return localMaintenanceStation;
  }
  
  public MaintenanceStation[] OooO0O0(int paramInt)
  {
    return new MaintenanceStation[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.MaintenanceStation.1
 * JD-Core Version:    0.7.0.1
 */