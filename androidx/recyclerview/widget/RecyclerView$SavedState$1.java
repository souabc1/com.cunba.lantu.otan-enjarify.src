package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class RecyclerView$SavedState$1
  implements Parcelable.ClassLoaderCreator
{
  public RecyclerView.SavedState OooO00o(Parcel paramParcel)
  {
    RecyclerView.SavedState localSavedState = new androidx/recyclerview/widget/RecyclerView$SavedState;
    localSavedState.<init>(paramParcel, null);
    return localSavedState;
  }
  
  public RecyclerView.SavedState OooO0O0(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    RecyclerView.SavedState localSavedState = new androidx/recyclerview/widget/RecyclerView$SavedState;
    localSavedState.<init>(paramParcel, paramClassLoader);
    return localSavedState;
  }
  
  public RecyclerView.SavedState[] OooO0OO(int paramInt)
  {
    return new RecyclerView.SavedState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.SavedState.1
 * JD-Core Version:    0.7.0.1
 */