package com.tencent.mmkv;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;

class ParcelableMMKV$1
  implements Parcelable.Creator
{
  public ParcelableMMKV OooO00o(Parcel paramParcel)
  {
    String str1 = paramParcel.readString();
    Object localObject = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel);
    ParcelFileDescriptor localParcelFileDescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel);
    String str2 = paramParcel.readString();
    if ((localObject != null) && (localParcelFileDescriptor != null))
    {
      paramParcel = new com/tencent/mmkv/ParcelableMMKV;
      int i = ((ParcelFileDescriptor)localObject).detachFd();
      int j = localParcelFileDescriptor.detachFd();
      localObject = paramParcel;
      int k = i;
      i = j;
      paramParcel.<init>(str1, k, j, str2, null);
      return paramParcel;
    }
    return null;
  }
  
  public ParcelableMMKV[] OooO0O0(int paramInt)
  {
    return new ParcelableMMKV[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.tencent.mmkv.ParcelableMMKV.1
 * JD-Core Version:    0.7.0.1
 */