package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class FragmentTabHost$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  
  static
  {
    FragmentTabHost.SavedState.1 local1 = new androidx/fragment/app/FragmentTabHost$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public FragmentTabHost$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    paramParcel = paramParcel.readString();
    this.o00OoOoo = paramParcel;
  }
  
  public FragmentTabHost$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("FragmentTabHost.SavedState{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    localStringBuilder.append(" curTab=");
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentTabHost.SavedState
 * JD-Core Version:    0.7.0.1
 */