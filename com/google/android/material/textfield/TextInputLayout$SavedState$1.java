package com.google.android.material.textfield;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class TextInputLayout$SavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public TextInputLayout.SavedState createFromParcel(Parcel paramParcel)
  {
    TextInputLayout.SavedState localSavedState = new com/google/android/material/textfield/TextInputLayout$SavedState;
    localSavedState.<init>(paramParcel, null);
    return localSavedState;
  }
  
  public TextInputLayout.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    TextInputLayout.SavedState localSavedState = new com/google/android/material/textfield/TextInputLayout$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public TextInputLayout.SavedState[] newArray(int paramInt)
  {
    return new TextInputLayout.SavedState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.TextInputLayout.SavedState.1
 * JD-Core Version:    0.7.0.1
 */