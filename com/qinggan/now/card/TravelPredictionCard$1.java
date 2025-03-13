package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.AddressLabel;
import com.qinggan.now.common.CommuterRoute;
import com.qinggan.now.common.Poi;
import com.qinggan.now.common.RoadTraffic;
import java.util.ArrayList;
import java.util.List;

class TravelPredictionCard$1
  implements Parcelable.Creator
{
  public TravelPredictionCard OooO00o(Parcel paramParcel)
  {
    TravelPredictionCard localTravelPredictionCard = new com/qinggan/now/card/TravelPredictionCard;
    localTravelPredictionCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localTravelPredictionCard.o00OoOoo = ((NowCardType)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localTravelPredictionCard.o00OooO0 = ((ArrayList)localObject);
    Parcelable.Creator localCreator = RoadTraffic.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    localObject = Poi.class.getClassLoader();
    localObject = (Poi)paramParcel.readParcelable((ClassLoader)localObject);
    localTravelPredictionCard.o00Ooo0O = ((Poi)localObject);
    localObject = AddressLabel.class.getClassLoader();
    localObject = (AddressLabel)paramParcel.readParcelable((ClassLoader)localObject);
    localTravelPredictionCard.o00Ooo00 = ((AddressLabel)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localTravelPredictionCard.o00Ooo0o = ((ArrayList)localObject);
    paramParcel.readStringList((List)localObject);
    localObject = CommuterRoute.class.getClassLoader();
    paramParcel = (CommuterRoute)paramParcel.readParcelable((ClassLoader)localObject);
    localTravelPredictionCard.o00Ooo0 = paramParcel;
    return localTravelPredictionCard;
  }
  
  public TravelPredictionCard[] OooO0O0(int paramInt)
  {
    return new TravelPredictionCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.TravelPredictionCard.1
 * JD-Core Version:    0.7.0.1
 */