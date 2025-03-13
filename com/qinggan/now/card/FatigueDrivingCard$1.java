package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.ServiceDistrict;

class FatigueDrivingCard$1
  implements Parcelable.Creator
{
  public FatigueDrivingCard OooO00o(Parcel paramParcel)
  {
    FatigueDrivingCard localFatigueDrivingCard = new com/qinggan/now/card/FatigueDrivingCard;
    localFatigueDrivingCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localFatigueDrivingCard.o00OoOoo = ((NowCardType)localObject);
    long l = paramParcel.readLong();
    localFatigueDrivingCard.o00Ooo00 = l;
    l = paramParcel.readLong();
    localFatigueDrivingCard.o00Ooo0O = l;
    localObject = ServiceDistrict.class.getClassLoader();
    paramParcel = (ServiceDistrict)paramParcel.readParcelable((ClassLoader)localObject);
    localFatigueDrivingCard.o00Ooo0 = paramParcel;
    return localFatigueDrivingCard;
  }
  
  public FatigueDrivingCard[] OooO0O0(int paramInt)
  {
    return new FatigueDrivingCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.FatigueDrivingCard.1
 * JD-Core Version:    0.7.0.1
 */