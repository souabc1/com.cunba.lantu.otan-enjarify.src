package com.google.android.material.stateful;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class ExtendableSavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public ExtendableSavedState createFromParcel(Parcel paramParcel)
  {
    ExtendableSavedState localExtendableSavedState = new com/google/android/material/stateful/ExtendableSavedState;
    localExtendableSavedState.<init>(paramParcel, null, null);
    return localExtendableSavedState;
  }
  
  public ExtendableSavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    ExtendableSavedState localExtendableSavedState = new com/google/android/material/stateful/ExtendableSavedState;
    localExtendableSavedState.<init>(paramParcel, paramClassLoader, null);
    return localExtendableSavedState;
  }
  
  public ExtendableSavedState[] newArray(int paramInt)
  {
    return new ExtendableSavedState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.stateful.ExtendableSavedState.1
 * JD-Core Version:    0.7.0.1
 */