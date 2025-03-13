package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import m54207b69;

class PoiType$1
  implements Parcelable.Creator
{
  public PoiType OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    paramParcel = paramParcel.readString();
    PoiType.OooO0OO();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11(":w0719205A20171407200E1D58");
    localStringBuilder.append(str);
    localStringBuilder.append(paramParcel);
    paramParcel = m54207b69.F54207b69_11("b4185E5C53555114");
    localStringBuilder.append(paramParcel);
    localStringBuilder.append(i);
    return PoiType.OooO0Oo(i);
  }
  
  public PoiType[] OooO0O0(int paramInt)
  {
    return new PoiType[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.PoiType.1
 * JD-Core Version:    0.7.0.1
 */