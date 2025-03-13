package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class AddressCard$1
  implements Parcelable.Creator
{
  public AddressCard OooO00o(Parcel paramParcel)
  {
    AddressCard localAddressCard = new com/qinggan/now/common/AddressCard;
    localAddressCard.<init>();
    long l = paramParcel.readLong();
    AddressCard.OooO00o(localAddressCard, l);
    Object localObject = paramParcel.readString();
    AddressCard.OooO0OO(localAddressCard, (String)localObject);
    localObject = GeoPoint.class.getClassLoader();
    localObject = (GeoPoint)paramParcel.readParcelable((ClassLoader)localObject);
    AddressCard.OooO0Oo(localAddressCard, (GeoPoint)localObject);
    localObject = paramParcel.readString();
    AddressCard.OooO0o0(localAddressCard, (String)localObject);
    localObject = AddressCategory.class.getClassLoader();
    localObject = (AddressCategory)paramParcel.readParcelable((ClassLoader)localObject);
    AddressCard.OooO0o(localAddressCard, (AddressCategory)localObject);
    localObject = AddressLabel.class.getClassLoader();
    localObject = (AddressLabel)paramParcel.readParcelable((ClassLoader)localObject);
    AddressCard.OooO0oO(localAddressCard, (AddressLabel)localObject);
    int i = paramParcel.readInt();
    AddressCard.OooO0oo(localAddressCard, i);
    float f = paramParcel.readFloat();
    AddressCard.OooO(localAddressCard, f);
    f = paramParcel.readFloat();
    AddressCard.OooOO0(localAddressCard, f);
    localObject = City.class.getClassLoader();
    paramParcel = (City)paramParcel.readParcelable((ClassLoader)localObject);
    AddressCard.OooOO0O(localAddressCard, paramParcel);
    return localAddressCard;
  }
  
  public AddressCard[] OooO0O0(int paramInt)
  {
    return new AddressCard[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.AddressCard.1
 * JD-Core Version:    0.7.0.1
 */