package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Date;

class MessageInfo$1
  implements Parcelable.Creator
{
  public MessageInfo OooO00o(Parcel paramParcel)
  {
    MessageInfo localMessageInfo = new com/qinggan/now/common/MessageInfo;
    localMessageInfo.<init>();
    long l1 = paramParcel.readLong();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      Date localDate = new java/util/Date;
      localDate.<init>(l1);
      localMessageInfo.o00Ooo0 = localDate;
    }
    else
    {
      str = null;
      localMessageInfo.o00Ooo0 = null;
    }
    String str = paramParcel.readString();
    localMessageInfo.o00OoOoo = str;
    str = paramParcel.readString();
    localMessageInfo.o00Ooo0O = str;
    paramParcel = paramParcel.readString();
    localMessageInfo.o00Ooo00 = paramParcel;
    return localMessageInfo;
  }
  
  public MessageInfo[] OooO0O0(int paramInt)
  {
    return new MessageInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.MessageInfo.1
 * JD-Core Version:    0.7.0.1
 */