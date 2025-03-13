package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseBooleanArray;

class ParcelableSparseBooleanArray$1
  implements Parcelable.Creator
{
  public ParcelableSparseBooleanArray createFromParcel(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    ParcelableSparseBooleanArray localParcelableSparseBooleanArray = new com/google/android/material/internal/ParcelableSparseBooleanArray;
    localParcelableSparseBooleanArray.<init>(i);
    int[] arrayOfInt = new int[i];
    boolean[] arrayOfBoolean = new boolean[i];
    paramParcel.readIntArray(arrayOfInt);
    paramParcel.readBooleanArray(arrayOfBoolean);
    int j = 0;
    paramParcel = null;
    while (j < i)
    {
      int k = arrayOfInt[j];
      int m = arrayOfBoolean[j];
      localParcelableSparseBooleanArray.put(k, m);
      j += 1;
    }
    return localParcelableSparseBooleanArray;
  }
  
  public ParcelableSparseBooleanArray[] newArray(int paramInt)
  {
    return new ParcelableSparseBooleanArray[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ParcelableSparseBooleanArray.1
 * JD-Core Version:    0.7.0.1
 */