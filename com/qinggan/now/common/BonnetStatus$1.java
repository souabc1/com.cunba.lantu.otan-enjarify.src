package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class BonnetStatus$1
  implements Parcelable.Creator
{
  public BonnetStatus OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    return BonnetStatus.values()[i];
  }
  
  public BonnetStatus[] OooO0O0(int paramInt)
  {
    return new BonnetStatus[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.BonnetStatus.1
 * JD-Core Version:    0.7.0.1
 */