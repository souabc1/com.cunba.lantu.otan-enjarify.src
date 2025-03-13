package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class AddressCategory$1
  implements Parcelable.Creator
{
  public AddressCategory OooO00o(Parcel paramParcel)
  {
    AddressCategory localAddressCategory = new com/qinggan/now/common/AddressCategory;
    localAddressCategory.<init>();
    long l = paramParcel.readLong();
    AddressCategory.OooO00o(localAddressCategory, l);
    paramParcel = paramParcel.readString();
    AddressCategory.OooO0OO(localAddressCategory, paramParcel);
    return localAddressCategory;
  }
  
  public AddressCategory[] OooO0O0(int paramInt)
  {
    return new AddressCategory[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.AddressCategory.1
 * JD-Core Version:    0.7.0.1
 */