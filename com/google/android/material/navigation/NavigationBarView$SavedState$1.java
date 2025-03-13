package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class NavigationBarView$SavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public NavigationBarView.SavedState createFromParcel(Parcel paramParcel)
  {
    NavigationBarView.SavedState localSavedState = new com/google/android/material/navigation/NavigationBarView$SavedState;
    localSavedState.<init>(paramParcel, null);
    return localSavedState;
  }
  
  public NavigationBarView.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    NavigationBarView.SavedState localSavedState = new com/google/android/material/navigation/NavigationBarView$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public NavigationBarView.SavedState[] newArray(int paramInt)
  {
    return new NavigationBarView.SavedState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.navigation.NavigationBarView.SavedState.1
 * JD-Core Version:    0.7.0.1
 */