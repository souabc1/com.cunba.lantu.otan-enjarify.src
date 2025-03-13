package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.Send2CarInfo;

class Send2CarCard$1
  implements Parcelable.Creator
{
  public Send2CarCard OooO00o(Parcel paramParcel)
  {
    Send2CarCard localSend2CarCard = new com/qinggan/now/card/Send2CarCard;
    localSend2CarCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localSend2CarCard.o00OoOoo = ((NowCardType)localObject);
    localObject = Send2CarInfo.class.getClassLoader();
    paramParcel = (Send2CarInfo)paramParcel.readParcelable((ClassLoader)localObject);
    localSend2CarCard.o00Ooo00 = paramParcel;
    return localSend2CarCard;
  }
  
  public Send2CarCard[] OooO0O0(int paramInt)
  {
    return new Send2CarCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.Send2CarCard.1
 * JD-Core Version:    0.7.0.1
 */