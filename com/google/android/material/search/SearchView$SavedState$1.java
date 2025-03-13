package com.google.android.material.search;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class SearchView$SavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public SearchView.SavedState createFromParcel(Parcel paramParcel)
  {
    SearchView.SavedState localSavedState = new com/google/android/material/search/SearchView$SavedState;
    localSavedState.<init>(paramParcel);
    return localSavedState;
  }
  
  public SearchView.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    SearchView.SavedState localSavedState = new com/google/android/material/search/SearchView$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public SearchView.SavedState[] newArray(int paramInt)
  {
    return new SearchView.SavedState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.search.SearchView.SavedState.1
 * JD-Core Version:    0.7.0.1
 */