package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.Recommendation;
import java.util.ArrayList;
import java.util.List;

class RecommendationCard$1
  implements Parcelable.Creator
{
  public RecommendationCard OooO00o(Parcel paramParcel)
  {
    RecommendationCard localRecommendationCard = new com/qinggan/now/card/RecommendationCard;
    localRecommendationCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localRecommendationCard.o00OoOoo = ((NowCardType)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localRecommendationCard.o00Ooo00 = ((ArrayList)localObject);
    Parcelable.Creator localCreator = Recommendation.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    return localRecommendationCard;
  }
  
  public RecommendationCard[] OooO0O0(int paramInt)
  {
    return new RecommendationCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.RecommendationCard.1
 * JD-Core Version:    0.7.0.1
 */