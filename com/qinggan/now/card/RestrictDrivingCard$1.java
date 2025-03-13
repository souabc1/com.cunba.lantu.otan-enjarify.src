package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.RestrictInfo;
import java.util.ArrayList;
import java.util.List;

class RestrictDrivingCard$1
  implements Parcelable.Creator
{
  public RestrictDrivingCard OooO00o(Parcel paramParcel)
  {
    RestrictDrivingCard localRestrictDrivingCard = new com/qinggan/now/card/RestrictDrivingCard;
    localRestrictDrivingCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localRestrictDrivingCard.o00OoOoo = ((NowCardType)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localRestrictDrivingCard.o00Ooo00 = ((ArrayList)localObject);
    Parcelable.Creator localCreator = RestrictInfo.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    return localRestrictDrivingCard;
  }
  
  public RestrictDrivingCard[] OooO0O0(int paramInt)
  {
    return new RestrictDrivingCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.RestrictDrivingCard.1
 * JD-Core Version:    0.7.0.1
 */