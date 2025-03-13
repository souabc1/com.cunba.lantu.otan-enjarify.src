package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.Poi;
import com.qinggan.now.common.RoadTraffic;
import java.util.ArrayList;
import java.util.HashMap;

class OutCityCard$1
  implements Parcelable.Creator
{
  public OutCityCard OooO00o(Parcel paramParcel)
  {
    OutCityCard localOutCityCard = new com/qinggan/now/card/OutCityCard;
    localOutCityCard.<init>();
    Object localObject1 = NowCardType.class.getClassLoader();
    localObject1 = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject1);
    localOutCityCard.o00OoOoo = ((NowCardType)localObject1);
    int i = paramParcel.readInt();
    int j = 0;
    while (j < i)
    {
      Object localObject2 = Poi.class.getClassLoader();
      localObject2 = (Poi)paramParcel.readParcelable((ClassLoader)localObject2);
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject3 = RoadTraffic.CREATOR;
      paramParcel.readTypedList(localArrayList, (Parcelable.Creator)localObject3);
      localObject3 = localOutCityCard.o00Ooo00;
      ((HashMap)localObject3).put(localObject2, localArrayList);
      j += 1;
    }
    return localOutCityCard;
  }
  
  public OutCityCard[] OooO0O0(int paramInt)
  {
    return new OutCityCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.OutCityCard.1
 * JD-Core Version:    0.7.0.1
 */