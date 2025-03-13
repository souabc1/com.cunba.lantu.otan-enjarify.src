package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;

class TrafficIncidentCard$1
  implements Parcelable.Creator
{
  public TrafficIncidentCard OooO00o(Parcel paramParcel)
  {
    TrafficIncidentCard localTrafficIncidentCard = new com/qinggan/now/card/TrafficIncidentCard;
    localTrafficIncidentCard.<init>();
    ClassLoader localClassLoader = NowCardType.class.getClassLoader();
    paramParcel = (NowCardType)paramParcel.readParcelable(localClassLoader);
    localTrafficIncidentCard.o00OoOoo = paramParcel;
    return localTrafficIncidentCard;
  }
  
  public TrafficIncidentCard[] OooO0O0(int paramInt)
  {
    return new TrafficIncidentCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.TrafficIncidentCard.1
 * JD-Core Version:    0.7.0.1
 */