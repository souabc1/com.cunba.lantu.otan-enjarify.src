package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.Poi;

class PushPoiCard$1
  implements Parcelable.Creator
{
  public PushPoiCard OooO00o(Parcel paramParcel)
  {
    PushPoiCard localPushPoiCard = new com/qinggan/now/card/PushPoiCard;
    localPushPoiCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localPushPoiCard.o00OoOoo = ((NowCardType)localObject);
    localObject = Poi.class.getClassLoader();
    paramParcel = (Poi)paramParcel.readParcelable((ClassLoader)localObject);
    localPushPoiCard.o00Ooo00 = paramParcel;
    return localPushPoiCard;
  }
  
  public PushPoiCard[] OooO0O0(int paramInt)
  {
    return new PushPoiCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.PushPoiCard.1
 * JD-Core Version:    0.7.0.1
 */