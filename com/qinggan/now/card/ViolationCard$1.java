package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.ViolationInfo;
import com.qinggan.now.common.ViolationNews;
import java.util.ArrayList;
import java.util.List;

class ViolationCard$1
  implements Parcelable.Creator
{
  public ViolationCard OooO00o(Parcel paramParcel)
  {
    ViolationCard localViolationCard = new com/qinggan/now/card/ViolationCard;
    localViolationCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localViolationCard.o00OoOoo = ((NowCardType)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localViolationCard.o00Ooo0 = ((ArrayList)localObject);
    Parcelable.Creator localCreator = ViolationNews.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    localViolationCard.o00Ooo00 = ((ArrayList)localObject);
    localCreator = ViolationInfo.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    return localViolationCard;
  }
  
  public ViolationCard[] OooO0O0(int paramInt)
  {
    return new ViolationCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.ViolationCard.1
 * JD-Core Version:    0.7.0.1
 */