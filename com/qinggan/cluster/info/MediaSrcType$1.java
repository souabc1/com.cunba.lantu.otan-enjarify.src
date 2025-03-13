package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class MediaSrcType$1
  implements Parcelable.Creator
{
  public MediaSrcType OooO00o(Parcel paramParcel)
  {
    Object localObject = MediaSrcType.values();
    int i = paramParcel.readInt();
    localObject = localObject[i];
    int j = paramParcel.readInt();
    ((MediaSrcType)localObject).o00OoOoo = j;
    return localObject;
  }
  
  public MediaSrcType[] OooO0O0(int paramInt)
  {
    return new MediaSrcType[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.MediaSrcType.1
 * JD-Core Version:    0.7.0.1
 */