package com.qinggan.now;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class NowMessageAction$1
  implements Parcelable.Creator
{
  public NowMessageAction OooO00o(Parcel paramParcel)
  {
    NowMessageAction[] arrayOfNowMessageAction = NowMessageAction.values();
    int i = paramParcel.readInt();
    return arrayOfNowMessageAction[i];
  }
  
  public NowMessageAction[] OooO0O0(int paramInt)
  {
    return new NowMessageAction[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NowMessageAction.1
 * JD-Core Version:    0.7.0.1
 */