package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

public class DrawerLayout$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo = 0;
  public int o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  
  static
  {
    DrawerLayout.SavedState.1 local1 = new androidx/drawerlayout/widget/DrawerLayout$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public DrawerLayout$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    this.o00OoOoo = i;
    i = paramParcel.readInt();
    this.o00Ooo00 = i;
    i = paramParcel.readInt();
    this.o00Ooo0 = i;
    i = paramParcel.readInt();
    this.o00Ooo0O = i;
    int j = paramParcel.readInt();
    this.o00Ooo0o = j;
  }
  
  public DrawerLayout$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout.SavedState
 * JD-Core Version:    0.7.0.1
 */