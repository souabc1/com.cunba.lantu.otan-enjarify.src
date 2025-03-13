package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.AbsSavedState;

public class Preference$BaseSavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    Preference.BaseSavedState.1 local1 = new androidx/preference/Preference$BaseSavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Preference$BaseSavedState(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public Preference$BaseSavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.Preference.BaseSavedState
 * JD-Core Version:    0.7.0.1
 */