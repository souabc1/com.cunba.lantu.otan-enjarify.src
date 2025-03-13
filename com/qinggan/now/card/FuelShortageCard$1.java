package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.Fuel;
import com.qinggan.now.common.GasStation;
import com.qinggan.now.common.GasStationType;
import java.util.ArrayList;
import java.util.List;

class FuelShortageCard$1
  implements Parcelable.Creator
{
  public FuelShortageCard OooO00o(Parcel paramParcel)
  {
    FuelShortageCard localFuelShortageCard = new com/qinggan/now/card/FuelShortageCard;
    localFuelShortageCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localFuelShortageCard.o00OoOoo = ((NowCardType)localObject);
    localObject = Fuel.class.getClassLoader();
    localObject = (Fuel)paramParcel.readParcelable((ClassLoader)localObject);
    localFuelShortageCard.o00Ooo00 = ((Fuel)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localFuelShortageCard.o00Ooo0O = ((ArrayList)localObject);
    Parcelable.Creator localCreator = GasStation.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    localObject = GasStationType.class.getClassLoader();
    paramParcel = (GasStationType)paramParcel.readParcelable((ClassLoader)localObject);
    localFuelShortageCard.o00Ooo0 = paramParcel;
    return localFuelShortageCard;
  }
  
  public FuelShortageCard[] OooO0O0(int paramInt)
  {
    return new FuelShortageCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.FuelShortageCard.1
 * JD-Core Version:    0.7.0.1
 */