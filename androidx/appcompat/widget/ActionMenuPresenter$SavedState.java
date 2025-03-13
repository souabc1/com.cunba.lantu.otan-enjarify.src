package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class ActionMenuPresenter$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  
  static
  {
    ActionMenuPresenter.SavedState.1 local1 = new androidx/appcompat/widget/ActionMenuPresenter$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public ActionMenuPresenter$SavedState() {}
  
  public ActionMenuPresenter$SavedState(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.o00OoOoo = i;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter.SavedState
 * JD-Core Version:    0.7.0.1
 */