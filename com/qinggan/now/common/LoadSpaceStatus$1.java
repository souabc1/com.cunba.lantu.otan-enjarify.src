package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class LoadSpaceStatus$1
  implements Parcelable.Creator
{
  public LoadSpaceStatus OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    return LoadSpaceStatus.values()[i];
  }
  
  public LoadSpaceStatus[] OooO0O0(int paramInt)
  {
    return new LoadSpaceStatus[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.LoadSpaceStatus.1
 * JD-Core Version:    0.7.0.1
 */