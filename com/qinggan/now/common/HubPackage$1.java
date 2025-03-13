package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Date;

class HubPackage$1
  implements Parcelable.Creator
{
  public HubPackage OooO00o(Parcel paramParcel)
  {
    HubPackage localHubPackage = new com/qinggan/now/common/HubPackage;
    localHubPackage.<init>();
    long l1 = paramParcel.readLong();
    HubPackage.OooO00o(localHubPackage, l1);
    Object localObject = paramParcel.readString();
    HubPackage.OooO0OO(localHubPackage, (String)localObject);
    l1 = paramParcel.readLong();
    HubPackage.OooO0Oo(localHubPackage, l1);
    l1 = paramParcel.readLong();
    HubPackage.OooO0o0(localHubPackage, l1);
    double d = paramParcel.readDouble();
    HubPackage.OooO0o(localHubPackage, d);
    d = paramParcel.readDouble();
    HubPackage.OooO0oO(localHubPackage, d);
    d = paramParcel.readDouble();
    HubPackage.OooO0oo(localHubPackage, d);
    localObject = new java/util/Date;
    long l2 = paramParcel.readLong();
    ((Date)localObject).<init>(l2);
    HubPackage.OooO(localHubPackage, (Date)localObject);
    localObject = new java/util/Date;
    l2 = paramParcel.readLong();
    ((Date)localObject).<init>(l2);
    HubPackage.OooOO0(localHubPackage, (Date)localObject);
    d = paramParcel.readDouble();
    HubPackage.OooOO0O(localHubPackage, d);
    return localHubPackage;
  }
  
  public HubPackage[] OooO0O0(int paramInt)
  {
    return new HubPackage[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.HubPackage.1
 * JD-Core Version:    0.7.0.1
 */