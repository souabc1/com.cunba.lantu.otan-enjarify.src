package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class PictureMessageContent$1
  implements Parcelable.Creator
{
  public PictureMessageContent OooO00o(Parcel paramParcel)
  {
    Object localObject = (MessageContent)MessageContent.CREATOR.createFromParcel(paramParcel);
    PictureMessageContent localPictureMessageContent = new com/qinggan/wechat/PictureMessageContent;
    localPictureMessageContent.<init>((MessageContent)localObject);
    if (localObject != null)
    {
      localObject = paramParcel.readString();
      localPictureMessageContent.o00OooOo = ((String)localObject);
      localObject = paramParcel.readString();
      localPictureMessageContent.o00OooOO = ((String)localObject);
      int i = paramParcel.readInt();
      localPictureMessageContent.o00OooO = i;
      i = paramParcel.readInt();
      localPictureMessageContent.o00OooO0 = i;
      paramParcel = paramParcel.readString();
      localPictureMessageContent.o00Ooo0o = paramParcel;
    }
    return localPictureMessageContent;
  }
  
  public PictureMessageContent[] OooO0O0(int paramInt)
  {
    return new PictureMessageContent[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.PictureMessageContent.1
 * JD-Core Version:    0.7.0.1
 */