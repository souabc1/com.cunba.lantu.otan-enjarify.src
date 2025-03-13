package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

class SearchView$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  public boolean o00OoOoo;
  
  static
  {
    SearchView.SavedState.1 local1 = new androidx/appcompat/widget/SearchView$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SearchView$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    boolean bool = ((Boolean)paramParcel.readValue(null)).booleanValue();
    this.o00OoOoo = bool;
  }
  
  public SearchView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SearchView.SavedState{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    localStringBuilder.append(" isIconified=");
    boolean bool = this.o00OoOoo;
    localStringBuilder.append(bool);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    Boolean localBoolean = Boolean.valueOf(this.o00OoOoo);
    paramParcel.writeValue(localBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.SearchView.SavedState
 * JD-Core Version:    0.7.0.1
 */