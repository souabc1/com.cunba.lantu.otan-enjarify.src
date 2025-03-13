package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseIntArray;

class ParcelableSparseIntArray$1
  implements Parcelable.Creator
{
  public ParcelableSparseIntArray createFromParcel(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    ParcelableSparseIntArray localParcelableSparseIntArray = new com/google/android/material/internal/ParcelableSparseIntArray;
    localParcelableSparseIntArray.<init>(i);
    int[] arrayOfInt1 = new int[i];
    int[] arrayOfInt2 = new int[i];
    paramParcel.readIntArray(arrayOfInt1);
    paramParcel.readIntArray(arrayOfInt2);
    int j = 0;
    paramParcel = null;
    while (j < i)
    {
      int k = arrayOfInt1[j];
      int m = arrayOfInt2[j];
      localParcelableSparseIntArray.put(k, m);
      j += 1;
    }
    return localParcelableSparseIntArray;
  }
  
  public ParcelableSparseIntArray[] newArray(int paramInt)
  {
    return new ParcelableSparseIntArray[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ParcelableSparseIntArray.1
 * JD-Core Version:    0.7.0.1
 */