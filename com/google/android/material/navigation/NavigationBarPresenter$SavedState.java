package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.material.internal.ParcelableSparseArray;

class NavigationBarPresenter$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  ParcelableSparseArray badgeSavedStates;
  int selectedItemId;
  
  static
  {
    NavigationBarPresenter.SavedState.1 local1 = new com/google/android/material/navigation/NavigationBarPresenter$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public NavigationBarPresenter$SavedState() {}
  
  public NavigationBarPresenter$SavedState(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.selectedItemId = i;
    ClassLoader localClassLoader = getClass().getClassLoader();
    paramParcel = (ParcelableSparseArray)paramParcel.readParcelable(localClassLoader);
    this.badgeSavedStates = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.selectedItemId;
    paramParcel.writeInt(paramInt);
    ParcelableSparseArray localParcelableSparseArray = this.badgeSavedStates;
    paramParcel.writeParcelable(localParcelableSparseArray, 0);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.navigation.NavigationBarPresenter.SavedState
 * JD-Core Version:    0.7.0.1
 */