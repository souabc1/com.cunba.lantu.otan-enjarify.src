package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

public class Toolbar$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public boolean o00Ooo00;
  
  static
  {
    Toolbar.SavedState.1 local1 = new androidx/appcompat/widget/Toolbar$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Toolbar$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    this.o00OoOoo = i;
    int j = paramParcel.readInt();
    if (j != 0)
    {
      j = 1;
    }
    else
    {
      j = 0;
      paramParcel = null;
    }
    this.o00Ooo00 = j;
  }
  
  public Toolbar$SavedState(Parcelable paramParcelable)
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
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.Toolbar.SavedState
 * JD-Core Version:    0.7.0.1
 */