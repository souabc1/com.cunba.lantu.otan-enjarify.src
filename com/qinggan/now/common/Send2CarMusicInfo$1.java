package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class Send2CarMusicInfo$1
  implements Parcelable.Creator
{
  public Send2CarMusicInfo OooO00o(Parcel paramParcel)
  {
    Object localObject = (Send2CarInfo)Send2CarInfo.CREATOR.createFromParcel(paramParcel);
    Send2CarMusicInfo localSend2CarMusicInfo = new com/qinggan/now/common/Send2CarMusicInfo;
    localSend2CarMusicInfo.<init>((Send2CarInfo)localObject);
    if (localObject != null)
    {
      localObject = paramParcel.readString();
      localSend2CarMusicInfo.o00OooOO = ((String)localObject);
      localObject = paramParcel.readString();
      localSend2CarMusicInfo.o00OooO = ((String)localObject);
      localObject = paramParcel.readString();
      localSend2CarMusicInfo.o00OooOo = ((String)localObject);
      paramParcel = paramParcel.readString();
      localSend2CarMusicInfo.o00OooO0 = paramParcel;
    }
    return localSend2CarMusicInfo;
  }
  
  public Send2CarMusicInfo[] OooO0O0(int paramInt)
  {
    return new Send2CarMusicInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Send2CarMusicInfo.1
 * JD-Core Version:    0.7.0.1
 */