package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public abstract class AbsSavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final AbsSavedState EMPTY_STATE;
  private final Parcelable mSuperState;
  
  static
  {
    Object localObject = new androidx/customview/view/AbsSavedState$1;
    ((AbsSavedState.1)localObject).<init>();
    EMPTY_STATE = (AbsSavedState)localObject;
    localObject = new androidx/customview/view/AbsSavedState$2;
    ((AbsSavedState.2)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
  }
  
  private AbsSavedState()
  {
    this.mSuperState = null;
  }
  
  public AbsSavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    paramParcel = paramParcel.readParcelable(paramClassLoader);
    if (paramParcel == null) {
      paramParcel = EMPTY_STATE;
    }
    this.mSuperState = paramParcel;
  }
  
  public AbsSavedState(Parcelable paramParcelable)
  {
    if (paramParcelable != null)
    {
      AbsSavedState localAbsSavedState = EMPTY_STATE;
      if (paramParcelable == localAbsSavedState) {
        paramParcelable = null;
      }
      this.mSuperState = paramParcelable;
      return;
    }
    paramParcelable = new java/lang/IllegalArgumentException;
    paramParcelable.<init>("superState must not be null");
    throw paramParcelable;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final Parcelable getSuperState()
  {
    return this.mSuperState;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Parcelable localParcelable = this.mSuperState;
    paramParcel.writeParcelable(localParcelable, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.customview.view.AbsSavedState
 * JD-Core Version:    0.7.0.1
 */