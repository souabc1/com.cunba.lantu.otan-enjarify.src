package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class UserInfo$1
  implements Parcelable.Creator
{
  public UserInfo OooO00o(Parcel paramParcel)
  {
    UserInfo localUserInfo = new com/qinggan/wechat/UserInfo;
    localUserInfo.<init>();
    String str = paramParcel.readString();
    localUserInfo.o00Ooo00 = str;
    str = paramParcel.readString();
    localUserInfo.o00OooO0 = str;
    str = paramParcel.readString();
    localUserInfo.o00OoOoo = str;
    str = paramParcel.readString();
    localUserInfo.o00Ooo0 = str;
    int i = paramParcel.readInt();
    localUserInfo.o00Ooo0O = i;
    return localUserInfo;
  }
  
  public UserInfo[] OooO0O0(int paramInt)
  {
    return new UserInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.UserInfo.1
 * JD-Core Version:    0.7.0.1
 */