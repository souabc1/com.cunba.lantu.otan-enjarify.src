package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import java.util.HashMap;

class UtilsCard$1
  implements Parcelable.Creator
{
  public UtilsCard OooO00o(Parcel paramParcel)
  {
    UtilsCard localUtilsCard = new com/qinggan/now/card/UtilsCard;
    localUtilsCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localUtilsCard.o00OoOoo = ((NowCardType)localObject);
    localObject = paramParcel.readString();
    UtilsCard.OooO00o(localUtilsCard, (String)localObject);
    localObject = HashMap.class.getClassLoader();
    paramParcel = paramParcel.readHashMap((ClassLoader)localObject);
    UtilsCard.OooO0OO(localUtilsCard, paramParcel);
    return localUtilsCard;
  }
  
  public UtilsCard[] OooO0O0(int paramInt)
  {
    return new UtilsCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.UtilsCard.1
 * JD-Core Version:    0.7.0.1
 */