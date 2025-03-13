package com.google.android.material.button;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class MaterialButton$SavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public MaterialButton.SavedState createFromParcel(Parcel paramParcel)
  {
    MaterialButton.SavedState localSavedState = new com/google/android/material/button/MaterialButton$SavedState;
    localSavedState.<init>(paramParcel, null);
    return localSavedState;
  }
  
  public MaterialButton.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    MaterialButton.SavedState localSavedState = new com/google/android/material/button/MaterialButton$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public MaterialButton.SavedState[] newArray(int paramInt)
  {
    return new MaterialButton.SavedState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.button.MaterialButton.SavedState.1
 * JD-Core Version:    0.7.0.1
 */