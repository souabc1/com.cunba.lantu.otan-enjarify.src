package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.RoadTraffic;

class CongestionAvoidCard$1
  implements Parcelable.Creator
{
  public CongestionAvoidCard OooO00o(Parcel paramParcel)
  {
    CongestionAvoidCard localCongestionAvoidCard = new com/qinggan/now/card/CongestionAvoidCard;
    localCongestionAvoidCard.<init>();
    Object localObject1 = NowCardType.class.getClassLoader();
    localObject1 = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject1);
    localCongestionAvoidCard.o00OoOoo = ((NowCardType)localObject1);
    localObject1 = paramParcel.readString();
    localCongestionAvoidCard.o00Ooo0 = ((String)localObject1);
    localObject1 = RoadTraffic.class;
    Object localObject2 = ((Class)localObject1).getClassLoader();
    localObject2 = (RoadTraffic)paramParcel.readParcelable((ClassLoader)localObject2);
    localCongestionAvoidCard.o00Ooo00 = ((RoadTraffic)localObject2);
    localObject1 = ((Class)localObject1).getClassLoader();
    paramParcel = (RoadTraffic)paramParcel.readParcelable((ClassLoader)localObject1);
    localCongestionAvoidCard.o00Ooo0O = paramParcel;
    return localCongestionAvoidCard;
  }
  
  public CongestionAvoidCard[] OooO0O0(int paramInt)
  {
    return new CongestionAvoidCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.CongestionAvoidCard.1
 * JD-Core Version:    0.7.0.1
 */