package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class VoiceMessageContent$1
  implements Parcelable.Creator
{
  public VoiceMessageContent OooO00o(Parcel paramParcel)
  {
    Object localObject = (MessageContent)MessageContent.CREATOR.createFromParcel(paramParcel);
    VoiceMessageContent localVoiceMessageContent = new com/qinggan/wechat/VoiceMessageContent;
    localVoiceMessageContent.<init>((MessageContent)localObject);
    if (localObject != null)
    {
      localObject = paramParcel.readString();
      localVoiceMessageContent.o00Ooooo = ((String)localObject);
      int i = paramParcel.readInt();
      localVoiceMessageContent.o00OooOO = i;
      i = paramParcel.readInt();
      localVoiceMessageContent.o00OooO0 = i;
      i = paramParcel.readInt();
      localVoiceMessageContent.o00OooOo = i;
      i = paramParcel.readInt();
      localVoiceMessageContent.o00o0000 = i;
      i = paramParcel.readInt();
      localVoiceMessageContent.o00o000 = i;
      i = paramParcel.readInt();
      localVoiceMessageContent.o00OoooO = i;
      localObject = paramParcel.readString();
      localVoiceMessageContent.o00Ooo0o = ((String)localObject);
      localObject = paramParcel.readString();
      localVoiceMessageContent.o00OooO = ((String)localObject);
      paramParcel = paramParcel.readString();
      localVoiceMessageContent.o0O00o0 = paramParcel;
    }
    return localVoiceMessageContent;
  }
  
  public VoiceMessageContent[] OooO0O0(int paramInt)
  {
    return new VoiceMessageContent[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.VoiceMessageContent.1
 * JD-Core Version:    0.7.0.1
 */