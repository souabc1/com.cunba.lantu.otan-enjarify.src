package com.qinggan.now;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class NowFeedBackAction$1
  implements Parcelable.Creator
{
  public NowFeedBackAction OooO00o(Parcel paramParcel)
  {
    NowFeedBackAction[] arrayOfNowFeedBackAction = NowFeedBackAction.values();
    int i = paramParcel.readInt();
    return arrayOfNowFeedBackAction[i];
  }
  
  public NowFeedBackAction[] OooO0O0(int paramInt)
  {
    return new NowFeedBackAction[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NowFeedBackAction.1
 * JD-Core Version:    0.7.0.1
 */