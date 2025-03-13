package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class UpdateInfo$1
  implements Parcelable.Creator
{
  public UpdateInfo OooO00o(Parcel paramParcel)
  {
    UpdateInfo localUpdateInfo = new com/qinggan/now/common/UpdateInfo;
    localUpdateInfo.<init>();
    String str = paramParcel.readString();
    localUpdateInfo.o00Ooo0 = str;
    str = paramParcel.readString();
    localUpdateInfo.o00Ooo00 = str;
    str = paramParcel.readString();
    localUpdateInfo.o00OoOoo = str;
    long l = paramParcel.readLong();
    localUpdateInfo.o00Ooo0o = l;
    str = paramParcel.readString();
    localUpdateInfo.o00OooO0 = str;
    paramParcel = paramParcel.readString();
    localUpdateInfo.o00Ooo0O = paramParcel;
    return localUpdateInfo;
  }
  
  public UpdateInfo[] OooO0O0(int paramInt)
  {
    return new UpdateInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.UpdateInfo.1
 * JD-Core Version:    0.7.0.1
 */