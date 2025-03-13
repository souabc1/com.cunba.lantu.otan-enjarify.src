package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class CoordSystem$1
  implements Parcelable.Creator
{
  public CoordSystem OooO00o(Parcel paramParcel)
  {
    CoordSystem[] arrayOfCoordSystem = CoordSystem.values();
    int i = paramParcel.readInt();
    return arrayOfCoordSystem[i];
  }
  
  public CoordSystem[] OooO0O0(int paramInt)
  {
    return new CoordSystem[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.CoordSystem.1
 * JD-Core Version:    0.7.0.1
 */