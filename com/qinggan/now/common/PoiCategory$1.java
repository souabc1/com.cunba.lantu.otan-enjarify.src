package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class PoiCategory$1
  implements Parcelable.Creator
{
  public PoiCategory OooO00o(Parcel paramParcel)
  {
    PoiCategory localPoiCategory = new com/qinggan/now/common/PoiCategory;
    localPoiCategory.<init>();
    String str = paramParcel.readString();
    localPoiCategory.o00Ooo00 = str;
    paramParcel = paramParcel.readString();
    localPoiCategory.o00OoOoo = paramParcel;
    return localPoiCategory;
  }
  
  public PoiCategory[] OooO0O0(int paramInt)
  {
    return new PoiCategory[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.PoiCategory.1
 * JD-Core Version:    0.7.0.1
 */