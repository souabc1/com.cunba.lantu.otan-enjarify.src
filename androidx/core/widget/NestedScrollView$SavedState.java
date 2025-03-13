package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class NestedScrollView$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  
  static
  {
    NestedScrollView.SavedState.1 local1 = new androidx/core/widget/NestedScrollView$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public NestedScrollView$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    int i = paramParcel.readInt();
    this.o00OoOoo = i;
  }
  
  public NestedScrollView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("HorizontalScrollView.SavedState{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    localStringBuilder.append(" scrollPosition=");
    int i = this.o00OoOoo;
    localStringBuilder.append(i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.NestedScrollView.SavedState
 * JD-Core Version:    0.7.0.1
 */