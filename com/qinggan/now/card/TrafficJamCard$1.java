package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.RoadTraffic;
import java.util.ArrayList;
import java.util.List;

class TrafficJamCard$1
  implements Parcelable.Creator
{
  public TrafficJamCard OooO00o(Parcel paramParcel)
  {
    TrafficJamCard localTrafficJamCard = new com/qinggan/now/card/TrafficJamCard;
    localTrafficJamCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localTrafficJamCard.o00OoOoo = ((NowCardType)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localTrafficJamCard.o00Ooo00 = ((ArrayList)localObject);
    Parcelable.Creator localCreator = RoadTraffic.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    return localTrafficJamCard;
  }
  
  public TrafficJamCard[] OooO0O0(int paramInt)
  {
    return new TrafficJamCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.TrafficJamCard.1
 * JD-Core Version:    0.7.0.1
 */