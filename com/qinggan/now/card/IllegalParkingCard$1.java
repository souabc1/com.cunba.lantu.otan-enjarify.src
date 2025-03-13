package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.ParkingLot;
import java.util.ArrayList;
import java.util.List;

class IllegalParkingCard$1
  implements Parcelable.Creator
{
  public IllegalParkingCard OooO00o(Parcel paramParcel)
  {
    IllegalParkingCard localIllegalParkingCard = new com/qinggan/now/card/IllegalParkingCard;
    localIllegalParkingCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localIllegalParkingCard.o00OoOoo = ((NowCardType)localObject);
    float f = paramParcel.readFloat();
    localIllegalParkingCard.o00Ooo0 = f;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localIllegalParkingCard.o00Ooo00 = ((ArrayList)localObject);
    Parcelable.Creator localCreator = ParkingLot.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    return localIllegalParkingCard;
  }
  
  public IllegalParkingCard[] OooO0O0(int paramInt)
  {
    return new IllegalParkingCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.IllegalParkingCard.1
 * JD-Core Version:    0.7.0.1
 */