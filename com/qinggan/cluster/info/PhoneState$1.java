package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class PhoneState$1
  implements Parcelable.Creator
{
  public PhoneState OooO00o(Parcel paramParcel)
  {
    Object localObject = PhoneState.values();
    int i = paramParcel.readInt();
    localObject = localObject[i];
    int j = paramParcel.readInt();
    ((PhoneState)localObject).o00OoOoo = j;
    return localObject;
  }
  
  public PhoneState[] OooO0O0(int paramInt)
  {
    return new PhoneState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.PhoneState.1
 * JD-Core Version:    0.7.0.1
 */