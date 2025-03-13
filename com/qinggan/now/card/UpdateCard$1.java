package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.UpdateInfo;

class UpdateCard$1
  implements Parcelable.Creator
{
  public UpdateCard OooO00o(Parcel paramParcel)
  {
    UpdateCard localUpdateCard = new com/qinggan/now/card/UpdateCard;
    localUpdateCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localUpdateCard.o00OoOoo = ((NowCardType)localObject);
    localObject = UpdateInfo.class.getClassLoader();
    paramParcel = (UpdateInfo)paramParcel.readParcelable((ClassLoader)localObject);
    localUpdateCard.o00Ooo00 = paramParcel;
    return localUpdateCard;
  }
  
  public UpdateCard[] OooO0O0(int paramInt)
  {
    return new UpdateCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.UpdateCard.1
 * JD-Core Version:    0.7.0.1
 */