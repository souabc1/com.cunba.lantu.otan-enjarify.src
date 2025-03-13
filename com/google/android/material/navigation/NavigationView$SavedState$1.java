package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class NavigationView$SavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public NavigationView.SavedState createFromParcel(Parcel paramParcel)
  {
    NavigationView.SavedState localSavedState = new com/google/android/material/navigation/NavigationView$SavedState;
    localSavedState.<init>(paramParcel, null);
    return localSavedState;
  }
  
  public NavigationView.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    NavigationView.SavedState localSavedState = new com/google/android/material/navigation/NavigationView$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public NavigationView.SavedState[] newArray(int paramInt)
  {
    return new NavigationView.SavedState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.navigation.NavigationView.SavedState.1
 * JD-Core Version:    0.7.0.1
 */