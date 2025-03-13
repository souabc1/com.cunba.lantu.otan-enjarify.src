package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.HubPackage;

class NetworkFlowCard$1
  implements Parcelable.Creator
{
  public NetworkFlowCard OooO00o(Parcel paramParcel)
  {
    NetworkFlowCard localNetworkFlowCard = new com/qinggan/now/card/NetworkFlowCard;
    localNetworkFlowCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localNetworkFlowCard.o00OoOoo = ((NowCardType)localObject);
    localObject = HubPackage.class.getClassLoader();
    paramParcel = (HubPackage)paramParcel.readParcelable((ClassLoader)localObject);
    localNetworkFlowCard.o00Ooo00 = paramParcel;
    return localNetworkFlowCard;
  }
  
  public NetworkFlowCard[] OooO0O0(int paramInt)
  {
    return new NetworkFlowCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.NetworkFlowCard.1
 * JD-Core Version:    0.7.0.1
 */