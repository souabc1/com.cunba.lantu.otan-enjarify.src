package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.CarWash;
import java.util.ArrayList;
import java.util.List;

class CarWashCard$1
  implements Parcelable.Creator
{
  public CarWashCard OooO00o(Parcel paramParcel)
  {
    CarWashCard localCarWashCard = new com/qinggan/now/card/CarWashCard;
    localCarWashCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localCarWashCard.o00OoOoo = ((NowCardType)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localCarWashCard.o00Ooo00 = ((ArrayList)localObject);
    Parcelable.Creator localCreator = CarWash.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    return localCarWashCard;
  }
  
  public CarWashCard[] OooO0O0(int paramInt)
  {
    return new CarWashCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.CarWashCard.1
 * JD-Core Version:    0.7.0.1
 */