package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class WeChatLocation$1
  implements Parcelable.Creator
{
  public WeChatLocation OooO00o(Parcel paramParcel)
  {
    WeChatLocation localWeChatLocation = new com/qinggan/wechat/WeChatLocation;
    localWeChatLocation.<init>();
    double d = paramParcel.readDouble();
    localWeChatLocation.o00Ooo00 = d;
    d = paramParcel.readDouble();
    localWeChatLocation.o00OoOoo = d;
    paramParcel = paramParcel.readString();
    localWeChatLocation.o00Ooo0 = paramParcel;
    return localWeChatLocation;
  }
  
  public WeChatLocation[] OooO0O0(int paramInt)
  {
    return new WeChatLocation[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.WeChatLocation.1
 * JD-Core Version:    0.7.0.1
 */