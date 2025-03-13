package com.google.android.material.search;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class SearchBar$SavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public SearchBar.SavedState createFromParcel(Parcel paramParcel)
  {
    SearchBar.SavedState localSavedState = new com/google/android/material/search/SearchBar$SavedState;
    localSavedState.<init>(paramParcel);
    return localSavedState;
  }
  
  public SearchBar.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    SearchBar.SavedState localSavedState = new com/google/android/material/search/SearchBar$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public SearchBar.SavedState[] newArray(int paramInt)
  {
    return new SearchBar.SavedState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.search.SearchBar.SavedState.1
 * JD-Core Version:    0.7.0.1
 */