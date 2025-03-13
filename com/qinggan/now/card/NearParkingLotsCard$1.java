package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.ParkingLot;
import java.util.ArrayList;
import java.util.List;

class NearParkingLotsCard$1
  implements Parcelable.Creator
{
  public NearParkingLotsCard OooO00o(Parcel paramParcel)
  {
    NearParkingLotsCard localNearParkingLotsCard = new com/qinggan/now/card/NearParkingLotsCard;
    localNearParkingLotsCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localNearParkingLotsCard.o00OoOoo = ((NowCardType)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localNearParkingLotsCard.o00Ooo0 = ((ArrayList)localObject);
    Parcelable.Creator localCreator = ParkingLot.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    paramParcel = paramParcel.readString();
    localNearParkingLotsCard.o00Ooo00 = paramParcel;
    return localNearParkingLotsCard;
  }
  
  public NearParkingLotsCard[] OooO0O0(int paramInt)
  {
    return new NearParkingLotsCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.NearParkingLotsCard.1
 * JD-Core Version:    0.7.0.1
 */