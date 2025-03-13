package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class MediaState$1
  implements Parcelable.Creator
{
  public MediaState OooO00o(Parcel paramParcel)
  {
    Object localObject = MediaState.values();
    int i = paramParcel.readInt();
    localObject = localObject[i];
    int j = paramParcel.readInt();
    ((MediaState)localObject).o00OoOoo = j;
    return localObject;
  }
  
  public MediaState[] OooO0O0(int paramInt)
  {
    return new MediaState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.MediaState.1
 * JD-Core Version:    0.7.0.1
 */