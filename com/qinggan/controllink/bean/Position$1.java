package com.qinggan.controllink.bean;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class Position$1
  implements Parcelable.Creator
{
  public Position OooO00o(Parcel paramParcel)
  {
    Position localPosition = new com/qinggan/controllink/bean/Position;
    int i = paramParcel.readInt();
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    int j = paramParcel.readInt();
    int k = paramParcel.readInt();
    int m = paramParcel.readInt();
    localPosition.<init>(i, str1, str2, j, k, m);
    return localPosition;
  }
  
  public Position[] OooO0O0(int paramInt)
  {
    return new Position[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.controllink.bean.Position.1
 * JD-Core Version:    0.7.0.1
 */