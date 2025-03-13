package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class Fragment$SavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public Fragment.SavedState OooO00o(Parcel paramParcel)
  {
    Fragment.SavedState localSavedState = new androidx/fragment/app/Fragment$SavedState;
    localSavedState.<init>(paramParcel, null);
    return localSavedState;
  }
  
  public Fragment.SavedState OooO0O0(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    Fragment.SavedState localSavedState = new androidx/fragment/app/Fragment$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public Fragment.SavedState[] OooO0OO(int paramInt)
  {
    return new Fragment.SavedState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.Fragment.SavedState.1
 * JD-Core Version:    0.7.0.1
 */