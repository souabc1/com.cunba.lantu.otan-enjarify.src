package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class CommuterRoute$1
  implements Parcelable.Creator
{
  public CommuterRoute OooO00o(Parcel paramParcel)
  {
    CommuterRoute localCommuterRoute = new com/qinggan/now/common/CommuterRoute;
    localCommuterRoute.<init>();
    Object localObject1 = Poi.class;
    Object localObject2 = ((Class)localObject1).getClassLoader();
    localObject2 = (Poi)paramParcel.readParcelable((ClassLoader)localObject2);
    CommuterRoute.OooO00o(localCommuterRoute, (Poi)localObject2);
    localObject1 = ((Class)localObject1).getClassLoader();
    localObject1 = (Poi)paramParcel.readParcelable((ClassLoader)localObject1);
    CommuterRoute.OooO0Oo(localCommuterRoute, (Poi)localObject1);
    localObject1 = paramParcel.readString();
    CommuterRoute.OooO0o0(localCommuterRoute, (String)localObject1);
    localObject1 = paramParcel.readString();
    CommuterRoute.OooO0o(localCommuterRoute, (String)localObject1);
    localObject1 = paramParcel.readString();
    CommuterRoute.OooO0oO(localCommuterRoute, (String)localObject1);
    localObject1 = paramParcel.readString();
    CommuterRoute.OooO0oo(localCommuterRoute, (String)localObject1);
    localObject1 = paramParcel.readString();
    CommuterRoute.OooO(localCommuterRoute, (String)localObject1);
    localObject1 = paramParcel.readString();
    CommuterRoute.OooOO0(localCommuterRoute, (String)localObject1);
    localObject1 = paramParcel.readString();
    CommuterRoute.OooOO0O(localCommuterRoute, (String)localObject1);
    localObject1 = AddressLabel.class.getClassLoader();
    localObject1 = (AddressLabel)paramParcel.readParcelable((ClassLoader)localObject1);
    CommuterRoute.OooOO0o(localCommuterRoute, (AddressLabel)localObject1);
    paramParcel = paramParcel.readString();
    CommuterRoute.OooO0OO(localCommuterRoute, paramParcel);
    return localCommuterRoute;
  }
  
  public CommuterRoute[] OooO0O0(int paramInt)
  {
    return new CommuterRoute[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.CommuterRoute.1
 * JD-Core Version:    0.7.0.1
 */