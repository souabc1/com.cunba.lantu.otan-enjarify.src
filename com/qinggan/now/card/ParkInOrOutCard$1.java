package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.ParkInOrOutInfo;

class ParkInOrOutCard$1
  implements Parcelable.Creator
{
  public ParkInOrOutCard OooO00o(Parcel paramParcel)
  {
    ParkInOrOutCard localParkInOrOutCard = new com/qinggan/now/card/ParkInOrOutCard;
    localParkInOrOutCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localParkInOrOutCard.o00OoOoo = ((NowCardType)localObject);
    localObject = ParkInOrOutInfo.class.getClassLoader();
    paramParcel = (ParkInOrOutInfo)paramParcel.readParcelable((ClassLoader)localObject);
    localParkInOrOutCard.o00Ooo00 = paramParcel;
    return localParkInOrOutCard;
  }
  
  public ParkInOrOutCard[] OooO0O0(int paramInt)
  {
    return new ParkInOrOutCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.ParkInOrOutCard.1
 * JD-Core Version:    0.7.0.1
 */