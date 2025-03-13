package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.common.vehicle.VehicleMode;
import java.util.Date;

class MaintenanceInfo$1
  implements Parcelable.Creator
{
  public MaintenanceInfo OooO00o(Parcel paramParcel)
  {
    MaintenanceInfo localMaintenanceInfo = new com/qinggan/now/common/MaintenanceInfo;
    localMaintenanceInfo.<init>();
    Object localObject = paramParcel.readString();
    localMaintenanceInfo.o00OooOo = ((String)localObject);
    localObject = paramParcel.readString();
    localMaintenanceInfo.o00Ooooo = ((String)localObject);
    localObject = paramParcel.readString();
    localMaintenanceInfo.o00Ooo00 = ((String)localObject);
    int i = paramParcel.readInt();
    localMaintenanceInfo.o00Ooo0o = i;
    localObject = VehicleMode.class.getClassLoader();
    localObject = (VehicleMode)paramParcel.readParcelable((ClassLoader)localObject);
    localMaintenanceInfo.o00OoooO = ((VehicleMode)localObject);
    i = 0;
    localObject = null;
    localMaintenanceInfo.o00OooO = null;
    long l1 = paramParcel.readLong();
    long l2 = 0L;
    boolean bool1 = l1 < l2;
    Date localDate;
    if (bool1)
    {
      localDate = new java/util/Date;
      localDate.<init>(l1);
      localMaintenanceInfo.o00OooO = localDate;
    }
    l1 = paramParcel.readLong();
    bool1 = l1 < l2;
    if (bool1)
    {
      localDate = new java/util/Date;
      localDate.<init>(l1);
      localMaintenanceInfo.o00Ooo0 = localDate;
    }
    else
    {
      localMaintenanceInfo.o00Ooo0 = null;
    }
    int j = paramParcel.readInt();
    localMaintenanceInfo.o00Ooo0O = j;
    l1 = paramParcel.readLong();
    boolean bool2 = l1 < l2;
    if (bool2)
    {
      localObject = new java/util/Date;
      ((Date)localObject).<init>(l1);
    }
    localMaintenanceInfo.o00OooOO = ((Date)localObject);
    i = paramParcel.readInt();
    localMaintenanceInfo.o00OooO0 = i;
    i = paramParcel.readInt();
    localMaintenanceInfo.o00OoOoo = i;
    localObject = MaintenanceStation.class.getClassLoader();
    paramParcel = (MaintenanceStation)paramParcel.readParcelable((ClassLoader)localObject);
    localMaintenanceInfo.o0O00o0 = paramParcel;
    return localMaintenanceInfo;
  }
  
  public MaintenanceInfo[] OooO0O0(int paramInt)
  {
    return new MaintenanceInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.MaintenanceInfo.1
 * JD-Core Version:    0.7.0.1
 */