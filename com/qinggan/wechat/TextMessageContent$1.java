package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class TextMessageContent$1
  implements Parcelable.Creator
{
  public TextMessageContent OooO00o(Parcel paramParcel)
  {
    MessageContent localMessageContent = (MessageContent)MessageContent.CREATOR.createFromParcel(paramParcel);
    TextMessageContent localTextMessageContent = new com/qinggan/wechat/TextMessageContent;
    localTextMessageContent.<init>(localMessageContent);
    if (localMessageContent != null)
    {
      paramParcel = paramParcel.readString();
      localTextMessageContent.o00Ooo0o = paramParcel;
    }
    return localTextMessageContent;
  }
  
  public TextMessageContent[] OooO0O0(int paramInt)
  {
    return new TextMessageContent[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.TextMessageContent.1
 * JD-Core Version:    0.7.0.1
 */