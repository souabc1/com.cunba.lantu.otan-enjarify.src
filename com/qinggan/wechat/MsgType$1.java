package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class MsgType$1
  implements Parcelable.Creator
{
  public MsgType OooO00o(Parcel paramParcel)
  {
    Object localObject = MsgType.values();
    int i = paramParcel.readInt();
    localObject = localObject[i];
    int j = paramParcel.readInt();
    MsgType.OooO0OO((MsgType)localObject, j);
    return localObject;
  }
  
  public MsgType[] OooO0O0(int paramInt)
  {
    return new MsgType[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.MsgType.1
 * JD-Core Version:    0.7.0.1
 */