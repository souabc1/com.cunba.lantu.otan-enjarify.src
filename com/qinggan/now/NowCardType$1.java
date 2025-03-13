package com.qinggan.now;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class NowCardType$1
  implements Parcelable.Creator
{
  public NowCardType OooO00o(Parcel paramParcel)
  {
    NowCardType[] arrayOfNowCardType = NowCardType.values();
    int i = paramParcel.readInt();
    return arrayOfNowCardType[i];
  }
  
  public NowCardType[] OooO0O0(int paramInt)
  {
    return new NowCardType[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NowCardType.1
 * JD-Core Version:    0.7.0.1
 */