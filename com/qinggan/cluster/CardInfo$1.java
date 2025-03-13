package com.qinggan.cluster;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class CardInfo$1
  implements Parcelable.Creator
{
  public CardInfo OooO00o(Parcel paramParcel)
  {
    Object localObject = CardInfo.values();
    int i = paramParcel.readInt();
    localObject = localObject[i];
    int j = paramParcel.readInt();
    ((CardInfo)localObject).o00OoOoo = j;
    return localObject;
  }
  
  public CardInfo[] OooO0O0(int paramInt)
  {
    return new CardInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.CardInfo.1
 * JD-Core Version:    0.7.0.1
 */