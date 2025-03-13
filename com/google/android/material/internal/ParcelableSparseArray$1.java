package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class ParcelableSparseArray$1
  implements Parcelable.ClassLoaderCreator
{
  public ParcelableSparseArray createFromParcel(Parcel paramParcel)
  {
    ParcelableSparseArray localParcelableSparseArray = new com/google/android/material/internal/ParcelableSparseArray;
    localParcelableSparseArray.<init>(paramParcel, null);
    return localParcelableSparseArray;
  }
  
  public ParcelableSparseArray createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    ParcelableSparseArray localParcelableSparseArray = new com/google/android/material/internal/ParcelableSparseArray;
    localParcelableSparseArray.<init>(paramParcel, paramClassLoader);
    return localParcelableSparseArray;
  }
  
  public ParcelableSparseArray[] newArray(int paramInt)
  {
    return new ParcelableSparseArray[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ParcelableSparseArray.1
 * JD-Core Version:    0.7.0.1
 */