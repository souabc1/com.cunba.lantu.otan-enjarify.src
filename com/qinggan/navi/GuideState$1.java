package com.qinggan.navi;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class GuideState$1
  implements Parcelable.Creator
{
  public GuideState OooO00o(Parcel paramParcel)
  {
    GuideState[] arrayOfGuideState = GuideState.values();
    int i = paramParcel.readInt();
    return arrayOfGuideState[i];
  }
  
  public GuideState[] OooO0O0(int paramInt)
  {
    return new GuideState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.GuideState.1
 * JD-Core Version:    0.7.0.1
 */