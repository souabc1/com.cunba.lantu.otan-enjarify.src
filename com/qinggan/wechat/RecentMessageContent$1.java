package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

class RecentMessageContent$1
  implements Parcelable.Creator
{
  public RecentMessageContent OooO00o(Parcel paramParcel)
  {
    Object localObject = (MessageContent)MessageContent.CREATOR.createFromParcel(paramParcel);
    RecentMessageContent localRecentMessageContent = new com/qinggan/wechat/RecentMessageContent;
    Parcelable.Creator localCreator = null;
    localRecentMessageContent.<init>((MessageContent)localObject, null);
    if (localObject != null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      localRecentMessageContent.o00Ooo0o = ((List)localObject);
      paramParcel.readStringList((List)localObject);
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      localRecentMessageContent.o00OooO0 = ((List)localObject);
      localCreator = RecentChat.CREATOR;
      paramParcel.readTypedList((List)localObject, localCreator);
    }
    return localRecentMessageContent;
  }
  
  public RecentMessageContent[] OooO0O0(int paramInt)
  {
    return new RecentMessageContent[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.RecentMessageContent.1
 * JD-Core Version:    0.7.0.1
 */