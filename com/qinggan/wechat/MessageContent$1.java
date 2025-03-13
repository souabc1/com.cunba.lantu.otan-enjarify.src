package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class MessageContent$1
  implements Parcelable.Creator
{
  public MessageContent OooO00o(Parcel paramParcel)
  {
    MessageContent localMessageContent = new com/qinggan/wechat/MessageContent;
    localMessageContent.<init>();
    Object localObject = MsgContentType.class.getClassLoader();
    localObject = (MsgContentType)paramParcel.readParcelable((ClassLoader)localObject);
    localMessageContent.o00Ooo0O = ((MsgContentType)localObject);
    localObject = paramParcel.readString();
    localMessageContent.o00Ooo0 = ((String)localObject);
    int i = paramParcel.readInt();
    int j = 1;
    if (i != j) {
      j = 0;
    }
    localMessageContent.o00Ooo00 = j;
    paramParcel = paramParcel.readString();
    localMessageContent.o00OoOoo = paramParcel;
    return localMessageContent;
  }
  
  public MessageContent[] OooO0O0(int paramInt)
  {
    return new MessageContent[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.MessageContent.1
 * JD-Core Version:    0.7.0.1
 */