package androidx.swiperefreshlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class SwipeRefreshLayout$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  public final boolean o00OoOoo;
  
  static
  {
    SwipeRefreshLayout.SavedState.1 local1 = new androidx/swiperefreshlayout/widget/SwipeRefreshLayout$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SwipeRefreshLayout$SavedState(Parcel paramParcel)
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
  
  public SwipeRefreshLayout$SavedState(Parcelable paramParcelable, boolean paramBoolean)
  {
    super(paramParcelable);
    this.o00OoOoo = paramBoolean;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramInt = this.o00OoOoo;
    paramParcel.writeByte(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState
 * JD-Core Version:    0.7.0.1
 */