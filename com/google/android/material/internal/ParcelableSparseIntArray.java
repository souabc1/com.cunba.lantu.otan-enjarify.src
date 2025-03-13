package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseIntArray;

public class ParcelableSparseIntArray
  extends SparseIntArray
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    ParcelableSparseIntArray.1 local1 = new com/google/android/material/internal/ParcelableSparseIntArray$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public ParcelableSparseIntArray() {}
  
  public ParcelableSparseIntArray(int paramInt)
  {
    super(paramInt);
  }
  
  public ParcelableSparseIntArray(SparseIntArray paramSparseIntArray)
  {
    int i = 0;
    for (;;)
    {
      int j = paramSparseIntArray.size();
      if (i >= j) {
        break;
      }
      j = paramSparseIntArray.keyAt(i);
      int k = paramSparseIntArray.valueAt(i);
      put(j, k);
      i += 1;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = size();
    int[] arrayOfInt1 = new int[paramInt];
    int i = size();
    int[] arrayOfInt2 = new int[i];
    int j = 0;
    for (;;)
    {
      int k = size();
      if (j >= k) {
        break;
      }
      k = keyAt(j);
      arrayOfInt1[j] = k;
      k = valueAt(j);
      arrayOfInt2[j] = k;
      j += 1;
    }
    j = size();
    paramParcel.writeInt(j);
    paramParcel.writeIntArray(arrayOfInt1);
    paramParcel.writeIntArray(arrayOfInt2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ParcelableSparseIntArray
 * JD-Core Version:    0.7.0.1
 */