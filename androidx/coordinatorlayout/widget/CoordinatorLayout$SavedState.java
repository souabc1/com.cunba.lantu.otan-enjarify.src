package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import androidx.customview.view.AbsSavedState;

public class CoordinatorLayout$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  public SparseArray o00OoOoo;
  
  static
  {
    CoordinatorLayout.SavedState.1 local1 = new androidx/coordinatorlayout/widget/CoordinatorLayout$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public CoordinatorLayout$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    int[] arrayOfInt = new int[i];
    paramParcel.readIntArray(arrayOfInt);
    paramParcel = paramParcel.readParcelableArray(paramClassLoader);
    paramClassLoader = new android/util/SparseArray;
    paramClassLoader.<init>(i);
    this.o00OoOoo = paramClassLoader;
    int j = 0;
    paramClassLoader = null;
    while (j < i)
    {
      SparseArray localSparseArray = this.o00OoOoo;
      int k = arrayOfInt[j];
      Object localObject = paramParcel[j];
      localSparseArray.append(k, localObject);
      j += 1;
    }
  }
  
  public CoordinatorLayout$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    SparseArray localSparseArray = this.o00OoOoo;
    int i = 0;
    int j;
    if (localSparseArray != null)
    {
      j = localSparseArray.size();
    }
    else
    {
      j = 0;
      localSparseArray = null;
    }
    paramParcel.writeInt(j);
    int[] arrayOfInt = new int[j];
    Parcelable[] arrayOfParcelable = new Parcelable[j];
    while (i < j)
    {
      int k = this.o00OoOoo.keyAt(i);
      arrayOfInt[i] = k;
      Parcelable localParcelable = (Parcelable)this.o00OoOoo.valueAt(i);
      arrayOfParcelable[i] = localParcelable;
      i += 1;
    }
    paramParcel.writeIntArray(arrayOfInt);
    paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState
 * JD-Core Version:    0.7.0.1
 */