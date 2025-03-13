package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.MessageInfo;

class MessageCard$1
  implements Parcelable.Creator
{
  public MessageCard OooO00o(Parcel paramParcel)
  {
    MessageCard localMessageCard = new com/qinggan/now/card/MessageCard;
    localMessageCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localMessageCard.o00OoOoo = ((NowCardType)localObject);
    localObject = MessageInfo.class.getClassLoader();
    paramParcel = (MessageInfo)paramParcel.readParcelable((ClassLoader)localObject);
    localMessageCard.o00Ooo00 = paramParcel;
    return localMessageCard;
  }
  
  public MessageCard[] OooO0O0(int paramInt)
  {
    return new MessageCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.MessageCard.1
 * JD-Core Version:    0.7.0.1
 */