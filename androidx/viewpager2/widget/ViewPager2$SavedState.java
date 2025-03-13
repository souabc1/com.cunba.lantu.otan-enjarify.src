package androidx.viewpager2.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class ViewPager2$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public Parcelable o00Ooo0;
  public int o00Ooo00;
  
  static
  {
    ViewPager2.SavedState.1 local1 = new androidx/viewpager2/widget/ViewPager2$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public ViewPager2$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    OooO00o(paramParcel, paramClassLoader);
  }
  
  public ViewPager2$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void OooO00o(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    int i = paramParcel.readInt();
    this.o00OoOoo = i;
    i = paramParcel.readInt();
    this.o00Ooo00 = i;
    paramParcel = paramParcel.readParcelable(paramClassLoader);
    this.o00Ooo0 = paramParcel;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    int i = this.o00OoOoo;
    paramParcel.writeInt(i);
    i = this.o00Ooo00;
    paramParcel.writeInt(i);
    Parcelable localParcelable = this.o00Ooo0;
    paramParcel.writeParcelable(localParcelable, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.SavedState
 * JD-Core Version:    0.7.0.1
 */