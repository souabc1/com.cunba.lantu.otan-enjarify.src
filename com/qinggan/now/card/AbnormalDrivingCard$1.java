package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.AbnormalDrivingType;

class AbnormalDrivingCard$1
  implements Parcelable.Creator
{
  public AbnormalDrivingCard OooO00o(Parcel paramParcel)
  {
    AbnormalDrivingCard localAbnormalDrivingCard = new com/qinggan/now/card/AbnormalDrivingCard;
    localAbnormalDrivingCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localAbnormalDrivingCard.o00OoOoo = ((NowCardType)localObject);
    localObject = AbnormalDrivingType.class.getClassLoader();
    paramParcel = (AbnormalDrivingType)paramParcel.readParcelable((ClassLoader)localObject);
    localAbnormalDrivingCard.o00Ooo00 = paramParcel;
    return localAbnormalDrivingCard;
  }
  
  public AbnormalDrivingCard[] OooO0O0(int paramInt)
  {
    return new AbnormalDrivingCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.AbnormalDrivingCard.1
 * JD-Core Version:    0.7.0.1
 */