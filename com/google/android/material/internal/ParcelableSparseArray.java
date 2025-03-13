package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;

public class ParcelableSparseArray
  extends SparseArray
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    ParcelableSparseArray.1 local1 = new com/google/android/material/internal/ParcelableSparseArray$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public ParcelableSparseArray() {}
  
  public ParcelableSparseArray(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    int i = paramParcel.readInt();
    int[] arrayOfInt = new int[i];
    paramParcel.readIntArray(arrayOfInt);
    paramParcel = paramParcel.readParcelableArray(paramClassLoader);
    int j = 0;
    paramClassLoader = null;
    while (j < i)
    {
      int k = arrayOfInt[j];
      Object localObject = paramParcel[j];
      put(k, localObject);
      j += 1;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = size();
    int[] arrayOfInt = new int[i];
    Parcelable[] arrayOfParcelable = new Parcelable[i];
    int j = 0;
    while (j < i)
    {
      int k = keyAt(j);
      arrayOfInt[j] = k;
      Parcelable localParcelable = (Parcelable)valueAt(j);
      arrayOfParcelable[j] = localParcelable;
      j += 1;
    }
    paramParcel.writeInt(i);
    paramParcel.writeIntArray(arrayOfInt);
    paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ParcelableSparseArray
 * JD-Core Version:    0.7.0.1
 */