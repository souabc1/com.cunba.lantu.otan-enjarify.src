package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class DoorInfo$1
  implements Parcelable.Creator
{
  public DoorInfo OooO00o(Parcel paramParcel)
  {
    DoorInfo localDoorInfo = new com/qinggan/now/common/DoorInfo;
    localDoorInfo.<init>();
    Object localObject1 = CarDoorStatus.class;
    Object localObject2 = ((Class)localObject1).getClassLoader();
    localObject2 = (CarDoorStatus)paramParcel.readParcelable((ClassLoader)localObject2);
    localDoorInfo.o00Ooo00 = ((CarDoorStatus)localObject2);
    localObject2 = ((Class)localObject1).getClassLoader();
    localObject2 = (CarDoorStatus)paramParcel.readParcelable((ClassLoader)localObject2);
    localDoorInfo.o00Ooo0 = ((CarDoorStatus)localObject2);
    localObject2 = ((Class)localObject1).getClassLoader();
    localObject2 = (CarDoorStatus)paramParcel.readParcelable((ClassLoader)localObject2);
    localDoorInfo.o00Ooo0o = ((CarDoorStatus)localObject2);
    localObject1 = ((Class)localObject1).getClassLoader();
    localObject1 = (CarDoorStatus)paramParcel.readParcelable((ClassLoader)localObject1);
    localDoorInfo.o00OooO0 = ((CarDoorStatus)localObject1);
    localObject1 = BonnetStatus.class.getClassLoader();
    localObject1 = (BonnetStatus)paramParcel.readParcelable((ClassLoader)localObject1);
    localDoorInfo.o00OoOoo = ((BonnetStatus)localObject1);
    localObject1 = LoadSpaceStatus.class.getClassLoader();
    paramParcel = (LoadSpaceStatus)paramParcel.readParcelable((ClassLoader)localObject1);
    localDoorInfo.o00Ooo0O = paramParcel;
    return localDoorInfo;
  }
  
  public DoorInfo[] OooO0O0(int paramInt)
  {
    return new DoorInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.DoorInfo.1
 * JD-Core Version:    0.7.0.1
 */