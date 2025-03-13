package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class MediaType$1
  implements Parcelable.Creator
{
  public MediaType OooO00o(Parcel paramParcel)
  {
    Object localObject = MediaType.values();
    int i = paramParcel.readInt();
    localObject = localObject[i];
    int j = paramParcel.readInt();
    ((MediaType)localObject).o00OoOoo = j;
    return localObject;
  }
  
  public MediaType[] OooO0O0(int paramInt)
  {
    return new MediaType[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.MediaType.1
 * JD-Core Version:    0.7.0.1
 */