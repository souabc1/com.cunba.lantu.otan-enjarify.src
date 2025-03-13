package com.qinggan.now.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.qinggan.now.NowCardType;
import com.qinggan.now.common.WechatInfo;

class WechatCard$1
  implements Parcelable.Creator
{
  public WechatCard OooO00o(Parcel paramParcel)
  {
    WechatCard localWechatCard = new com/qinggan/now/card/WechatCard;
    localWechatCard.<init>();
    Object localObject = NowCardType.class.getClassLoader();
    localObject = (NowCardType)paramParcel.readParcelable((ClassLoader)localObject);
    localWechatCard.o00OoOoo = ((NowCardType)localObject);
    localObject = WechatInfo.class.getClassLoader();
    paramParcel = (WechatInfo)paramParcel.readParcelable((ClassLoader)localObject);
    localWechatCard.o00Ooo00 = paramParcel;
    return localWechatCard;
  }
  
  public WechatCard[] OooO0O0(int paramInt)
  {
    return new WechatCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.card.WechatCard.1
 * JD-Core Version:    0.7.0.1
 */