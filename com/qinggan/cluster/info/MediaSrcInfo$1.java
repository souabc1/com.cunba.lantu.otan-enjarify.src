package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class MediaSrcInfo$1
  implements Parcelable.Creator
{
  public MediaSrcInfo OooO00o(Parcel paramParcel)
  {
    MediaSrcInfo localMediaSrcInfo = new com/qinggan/cluster/info/MediaSrcInfo;
    localMediaSrcInfo.<init>();
    Object localObject = MediaSrcType.class.getClassLoader();
    localObject = (MediaSrcType)paramParcel.readParcelable((ClassLoader)localObject);
    localMediaSrcInfo.o00OooO = ((MediaSrcType)localObject);
    localObject = MediaType.class.getClassLoader();
    localObject = (MediaType)paramParcel.readParcelable((ClassLoader)localObject);
    localMediaSrcInfo.o00Ooo0o = ((MediaType)localObject);
    float f = paramParcel.readFloat();
    localMediaSrcInfo.o00Ooo0 = f;
    localObject = MediaState.class.getClassLoader();
    localObject = (MediaState)paramParcel.readParcelable((ClassLoader)localObject);
    localMediaSrcInfo.o00Ooo0O = ((MediaState)localObject);
    localObject = paramParcel.readString();
    localMediaSrcInfo.o00OooO0 = ((String)localObject);
    localObject = paramParcel.readString();
    localMediaSrcInfo.o00Ooo00 = ((String)localObject);
    paramParcel = paramParcel.readString();
    localMediaSrcInfo.o00OoOoo = paramParcel;
    return localMediaSrcInfo;
  }
  
  public MediaSrcInfo[] OooO0O0(int paramInt)
  {
    return new MediaSrcInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.MediaSrcInfo.1
 * JD-Core Version:    0.7.0.1
 */