package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class MsgContentType$1
  implements Parcelable.Creator
{
  public MsgContentType OooO00o(Parcel paramParcel)
  {
    MsgContentType[] arrayOfMsgContentType = MsgContentType.values();
    int i = paramParcel.readInt();
    return arrayOfMsgContentType[i];
  }
  
  public MsgContentType[] OooO0O0(int paramInt)
  {
    return new MsgContentType[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.MsgContentType.1
 * JD-Core Version:    0.7.0.1
 */