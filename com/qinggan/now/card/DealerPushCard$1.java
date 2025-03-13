package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.DealerPushInfo;

class DealerPushCard$1
  implements Parcelable.Creator
{
  public DealerPushCard OooO00o(Parcel paramParcel)
  {
    DealerPushCard localDealerPushCard = new com/qinggan/now/card/DealerPushCard;
    localDealerPushCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localDealerPushCard.o00OoOoo = ((NowCardType)localObject);
    localObject = DealerPushInfo.class.getClassLoader();
    paramParcel = (DealerPushInfo)paramParcel.readParcelable((ClassLoader)localObject);
    localDealerPushCard.o00Ooo00 = paramParcel;
    return localDealerPushCard;
  }
  
  public DealerPushCard[] OooO0O0(int paramInt)
  {
    return new DealerPushCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.DealerPushCard.1
 * JD-Core Version:    0.7.0.1
 */