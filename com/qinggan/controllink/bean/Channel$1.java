package com.qinggan.controllink.bean;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class Channel$1
  implements Parcelable.Creator
{
  public Channel OooO00o(Parcel paramParcel)
  {
    Channel localChannel = new com/qinggan/controllink/bean/Channel;
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    int i = paramParcel.readInt();
    localChannel.<init>(str1, str2, i);
    return localChannel;
  }
  
  public Channel[] OooO0O0(int paramInt)
  {
    return new Channel[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.controllink.bean.Channel.1
 * JD-Core Version:    0.7.0.1
 */