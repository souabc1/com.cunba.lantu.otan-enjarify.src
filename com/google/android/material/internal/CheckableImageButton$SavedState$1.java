package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class CheckableImageButton$SavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public CheckableImageButton.SavedState createFromParcel(Parcel paramParcel)
  {
    CheckableImageButton.SavedState localSavedState = new com/google/android/material/internal/CheckableImageButton$SavedState;
    localSavedState.<init>(paramParcel, null);
    return localSavedState;
  }
  
  public CheckableImageButton.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    CheckableImageButton.SavedState localSavedState = new com/google/android/material/internal/CheckableImageButton$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public CheckableImageButton.SavedState[] newArray(int paramInt)
  {
    return new CheckableImageButton.SavedState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.CheckableImageButton.SavedState.1
 * JD-Core Version:    0.7.0.1
 */