package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class AppCompatSpinner$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  public boolean o00OoOoo;
  
  static
  {
    AppCompatSpinner.SavedState.1 local1 = new androidx/appcompat/widget/AppCompatSpinner$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public AppCompatSpinner$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    int i = paramParcel.readByte();
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramParcel = null;
    }
    this.o00OoOoo = i;
  }
  
  public AppCompatSpinner$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramInt = (byte)this.o00OoOoo;
    paramParcel.writeByte(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.SavedState
 * JD-Core Version:    0.7.0.1
 */