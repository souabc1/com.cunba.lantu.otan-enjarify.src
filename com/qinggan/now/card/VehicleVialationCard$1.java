package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;

class VehicleVialationCard$1
  implements Parcelable.Creator
{
  public VehicleVialationCard OooO00o(Parcel paramParcel)
  {
    VehicleVialationCard localVehicleVialationCard = new com/qinggan/now/card/VehicleVialationCard;
    localVehicleVialationCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localVehicleVialationCard.o00OoOoo = ((NowCardType)localObject);
    localObject = paramParcel.readString();
    localVehicleVialationCard.o00Ooo0 = ((String)localObject);
    paramParcel = paramParcel.readString();
    localVehicleVialationCard.o00Ooo00 = paramParcel;
    return localVehicleVialationCard;
  }
  
  public VehicleVialationCard[] OooO0O0(int paramInt)
  {
    return new VehicleVialationCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.VehicleVialationCard.1
 * JD-Core Version:    0.7.0.1
 */