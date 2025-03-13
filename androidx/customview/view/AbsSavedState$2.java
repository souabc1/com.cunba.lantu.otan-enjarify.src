package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class AbsSavedState$2
  implements Parcelable.ClassLoaderCreator
{
  public AbsSavedState OooO00o(Parcel paramParcel)
  {
    return OooO0O0(paramParcel, null);
  }
  
  public AbsSavedState OooO0O0(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    paramParcel = paramParcel.readParcelable(paramClassLoader);
    if (paramParcel == null) {
      return AbsSavedState.EMPTY_STATE;
    }
    paramParcel = new java/lang/IllegalStateException;
    paramParcel.<init>("superState must be null");
    throw paramParcel;
  }
  
  public AbsSavedState[] OooO0OO(int paramInt)
  {
    return new AbsSavedState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.customview.view.AbsSavedState.2
 * JD-Core Version:    0.7.0.1
 */