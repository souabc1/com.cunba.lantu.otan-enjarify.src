package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class Recommendation$1
  implements Parcelable.Creator
{
  public Recommendation OooO00o(Parcel paramParcel)
  {
    Recommendation localRecommendation = new com/qinggan/now/common/Recommendation;
    Poi localPoi = (Poi)Poi.CREATOR.createFromParcel(paramParcel);
    localRecommendation.<init>(localPoi);
    float f = paramParcel.readFloat();
    Recommendation.OooO00o(localRecommendation, f);
    f = paramParcel.readFloat();
    Recommendation.OooO0OO(localRecommendation, f);
    paramParcel = paramParcel.readString();
    Recommendation.OooO0Oo(localRecommendation, paramParcel);
    return localRecommendation;
  }
  
  public Recommendation[] OooO0O0(int paramInt)
  {
    return new Recommendation[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Recommendation.1
 * JD-Core Version:    0.7.0.1
 */