package com.qinggan.systempolicy.videopolicy;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class VideoFocusInfo$1
  implements Parcelable.Creator
{
  public VideoFocusInfo OooO00o(Parcel paramParcel)
  {
    VideoFocusInfo localVideoFocusInfo = new com/qinggan/systempolicy/videopolicy/VideoFocusInfo;
    localVideoFocusInfo.<init>();
    String str = paramParcel.readString();
    VideoFocusInfo.OooO00o(localVideoFocusInfo, str);
    int i = paramParcel.readInt();
    VideoFocusInfo.OooO0OO(localVideoFocusInfo, i);
    int j = paramParcel.readInt();
    VideoFocusInfo.OooO0Oo(localVideoFocusInfo, j);
    return localVideoFocusInfo;
  }
  
  public VideoFocusInfo[] OooO0O0(int paramInt)
  {
    return new VideoFocusInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.systempolicy.videopolicy.VideoFocusInfo.1
 * JD-Core Version:    0.7.0.1
 */