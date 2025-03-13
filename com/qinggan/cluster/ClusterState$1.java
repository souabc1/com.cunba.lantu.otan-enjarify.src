package com.qinggan.cluster;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class ClusterState$1
  implements Parcelable.Creator
{
  public ClusterState OooO00o(Parcel paramParcel)
  {
    Object localObject = ClusterState.values();
    int i = paramParcel.readInt();
    localObject = localObject[i];
    int j = paramParcel.readInt();
    ClusterState.OooO0OO((ClusterState)localObject, j);
    return localObject;
  }
  
  public ClusterState[] OooO0O0(int paramInt)
  {
    return new ClusterState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.cluster.ClusterState.1
 * JD-Core Version:    0.7.0.1
 */