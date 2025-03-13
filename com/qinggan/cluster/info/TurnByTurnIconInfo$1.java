package com.qinggan.cluster.info;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class TurnByTurnIconInfo$1
  implements Parcelable.Creator
{
  public TurnByTurnIconInfo OooO00o(Parcel paramParcel)
  {
    Object localObject = TurnByTurnIconInfo.values();
    int i = paramParcel.readInt();
    localObject = localObject[i];
    int j = paramParcel.readInt();
    ((TurnByTurnIconInfo)localObject).o00OoOoo = j;
    return localObject;
  }
  
  public TurnByTurnIconInfo[] OooO0O0(int paramInt)
  {
    return new TurnByTurnIconInfo[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.info.TurnByTurnIconInfo.1
 * JD-Core Version:    0.7.0.1
 */