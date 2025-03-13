package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.DoorInfo;
import com.qinggan.now.common.HandBrakeStatus;
import com.qinggan.now.common.VehicleRemindType;

class VehicleConditionCard$1
  implements Parcelable.Creator
{
  public VehicleConditionCard OooO00o(Parcel paramParcel)
  {
    VehicleConditionCard localVehicleConditionCard = new com/qinggan/now/card/VehicleConditionCard;
    localVehicleConditionCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localVehicleConditionCard.o00OoOoo = ((NowCardType)localObject);
    localObject = VehicleRemindType.class.getClassLoader();
    localObject = (VehicleRemindType)paramParcel.readParcelable((ClassLoader)localObject);
    localVehicleConditionCard.o00OooO0 = ((VehicleRemindType)localObject);
    localObject = DoorInfo.class.getClassLoader();
    localObject = (DoorInfo)paramParcel.readParcelable((ClassLoader)localObject);
    localVehicleConditionCard.o00Ooo0 = ((DoorInfo)localObject);
    localObject = HandBrakeStatus.class.getClassLoader();
    localObject = (HandBrakeStatus)paramParcel.readParcelable((ClassLoader)localObject);
    localVehicleConditionCard.o00Ooo0O = ((HandBrakeStatus)localObject);
    int i = paramParcel.readInt();
    localVehicleConditionCard.o00Ooo0o = i;
    i = paramParcel.readInt();
    localVehicleConditionCard.o00OooO = i;
    int j = paramParcel.readInt();
    localVehicleConditionCard.o00Ooo00 = j;
    return localVehicleConditionCard;
  }
  
  public VehicleConditionCard[] OooO0O0(int paramInt)
  {
    return new VehicleConditionCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.VehicleConditionCard.1
 * JD-Core Version:    0.7.0.1
 */