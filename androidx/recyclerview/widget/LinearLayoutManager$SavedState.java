package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LinearLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public boolean o00Ooo0;
  public int o00Ooo00;
  
  static
  {
    LinearLayoutManager.SavedState.1 local1 = new androidx/recyclerview/widget/LinearLayoutManager$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public LinearLayoutManager$SavedState() {}
  
  public LinearLayoutManager$SavedState(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.o00OoOoo = i;
    i = paramParcel.readInt();
    this.o00Ooo00 = i;
    int j = paramParcel.readInt();
    i = 1;
    if (j != i) {
      i = 0;
    }
    this.o00Ooo0 = i;
  }
  
  public LinearLayoutManager$SavedState(SavedState paramSavedState)
  {
    int i = paramSavedState.o00OoOoo;
    this.o00OoOoo = i;
    i = paramSavedState.o00Ooo00;
    this.o00Ooo00 = i;
    boolean bool = paramSavedState.o00Ooo0;
    this.o00Ooo0 = bool;
  }
  
  public boolean OooO00o()
  {
    int i = this.o00OoOoo;
    if (i >= 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void OooO0OO()
  {
    this.o00OoOoo = -1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.LinearLayoutManager.SavedState
 * JD-Core Version:    0.7.0.1
 */