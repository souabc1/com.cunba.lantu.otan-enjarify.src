package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class StaggeredGridLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public int[] o00Ooo0O;
  public int o00Ooo0o;
  public List o00OooO;
  public int[] o00OooO0;
  public boolean o00OooOO;
  public boolean o00OooOo;
  public boolean o0O00o0;
  
  static
  {
    StaggeredGridLayoutManager.SavedState.1 local1 = new androidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public StaggeredGridLayoutManager$SavedState() {}
  
  public StaggeredGridLayoutManager$SavedState(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.o00OoOoo = i;
    i = paramParcel.readInt();
    this.o00Ooo00 = i;
    i = paramParcel.readInt();
    this.o00Ooo0 = i;
    if (i > 0)
    {
      localObject = new int[i];
      this.o00Ooo0O = ((int[])localObject);
      paramParcel.readIntArray((int[])localObject);
    }
    i = paramParcel.readInt();
    this.o00Ooo0o = i;
    if (i > 0)
    {
      localObject = new int[i];
      this.o00OooO0 = ((int[])localObject);
      paramParcel.readIntArray((int[])localObject);
    }
    i = paramParcel.readInt();
    boolean bool = false;
    int j = 1;
    if (i == j)
    {
      i = j;
    }
    else
    {
      i = 0;
      localObject = null;
    }
    this.o00OooOO = i;
    i = paramParcel.readInt();
    if (i == j)
    {
      i = j;
    }
    else
    {
      i = 0;
      localObject = null;
    }
    this.o00OooOo = i;
    i = paramParcel.readInt();
    if (i == j) {
      bool = j;
    }
    this.o0O00o0 = bool;
    Object localObject = StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class.getClassLoader();
    paramParcel = paramParcel.readArrayList((ClassLoader)localObject);
    this.o00OooO = paramParcel;
  }
  
  public StaggeredGridLayoutManager$SavedState(SavedState paramSavedState)
  {
    int i = paramSavedState.o00Ooo0;
    this.o00Ooo0 = i;
    i = paramSavedState.o00OoOoo;
    this.o00OoOoo = i;
    i = paramSavedState.o00Ooo00;
    this.o00Ooo00 = i;
    int[] arrayOfInt = paramSavedState.o00Ooo0O;
    this.o00Ooo0O = arrayOfInt;
    i = paramSavedState.o00Ooo0o;
    this.o00Ooo0o = i;
    arrayOfInt = paramSavedState.o00OooO0;
    this.o00OooO0 = arrayOfInt;
    boolean bool = paramSavedState.o00OooOO;
    this.o00OooOO = bool;
    bool = paramSavedState.o00OooOo;
    this.o00OooOo = bool;
    bool = paramSavedState.o0O00o0;
    this.o0O00o0 = bool;
    paramSavedState = paramSavedState.o00OooO;
    this.o00OooO = paramSavedState;
  }
  
  public void OooO00o()
  {
    this.o00Ooo0O = null;
    this.o00Ooo0 = 0;
    int i = -1;
    this.o00OoOoo = i;
    this.o00Ooo00 = i;
  }
  
  public void OooO0OO()
  {
    this.o00Ooo0O = null;
    this.o00Ooo0 = 0;
    this.o00Ooo0o = 0;
    this.o00OooO0 = null;
    this.o00OooO = null;
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
    paramInt = this.o00Ooo0;
    if (paramInt > 0)
    {
      localObject = this.o00Ooo0O;
      paramParcel.writeIntArray((int[])localObject);
    }
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0o;
    if (paramInt > 0)
    {
      localObject = this.o00OooO0;
      paramParcel.writeIntArray((int[])localObject);
    }
    paramInt = this.o00OooOO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooOo;
    paramParcel.writeInt(paramInt);
    paramInt = this.o0O00o0;
    paramParcel.writeInt(paramInt);
    Object localObject = this.o00OooO;
    paramParcel.writeList((List)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState
 * JD-Core Version:    0.7.0.1
 */