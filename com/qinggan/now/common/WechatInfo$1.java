package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Date;

class WechatInfo$1
  implements Parcelable.Creator
{
  public WechatInfo OooO00o(Parcel paramParcel)
  {
    WechatInfo localWechatInfo = new com/qinggan/now/common/WechatInfo;
    localWechatInfo.<init>();
    long l1 = paramParcel.readLong();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      Date localDate = new java/util/Date;
      localDate.<init>(l1);
      localWechatInfo.o00Ooo00 = localDate;
    }
    else
    {
      str = null;
      localWechatInfo.o00Ooo00 = null;
    }
    String str = paramParcel.readString();
    localWechatInfo.o00Ooo0 = str;
    paramParcel = paramParcel.readString();
    localWechatInfo.o00OoOoo = paramParcel;
    return localWechatInfo;
  }
  
  public WechatInfo[] OooO0O0(int paramInt)
  {
    return new WechatInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.WechatInfo.1
 * JD-Core Version:    0.7.0.1
 */