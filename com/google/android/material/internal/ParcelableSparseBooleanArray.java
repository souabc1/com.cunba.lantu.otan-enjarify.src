package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseBooleanArray;

public class ParcelableSparseBooleanArray
  extends SparseBooleanArray
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    ParcelableSparseBooleanArray.1 local1 = new com/google/android/material/internal/ParcelableSparseBooleanArray$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public ParcelableSparseBooleanArray() {}
  
  public ParcelableSparseBooleanArray(int paramInt)
  {
    super(paramInt);
  }
  
  public ParcelableSparseBooleanArray(SparseBooleanArray paramSparseBooleanArray)
  {
    super(i);
    i = 0;
    for (;;)
    {
      int j = paramSparseBooleanArray.size();
      if (i >= j) {
        break;
      }
      j = paramSparseBooleanArray.keyAt(i);
      boolean bool = paramSparseBooleanArray.valueAt(i);
      put(j, bool);
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
    int[] arrayOfInt = new int[paramInt];
    int i = size();
    boolean[] arrayOfBoolean = new boolean[i];
    int j = 0;
    for (;;)
    {
      int k = size();
      if (j >= k) {
        break;
      }
      k = keyAt(j);
      arrayOfInt[j] = k;
      boolean bool = valueAt(j);
      arrayOfBoolean[j] = bool;
      j += 1;
    }
    j = size();
    paramParcel.writeInt(j);
    paramParcel.writeIntArray(arrayOfInt);
    paramParcel.writeBooleanArray(arrayOfBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ParcelableSparseBooleanArray
 * JD-Core Version:    0.7.0.1
 */