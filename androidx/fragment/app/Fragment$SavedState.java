package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Fragment$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public final Bundle o00OoOoo;
  
  static
  {
    Fragment.SavedState.1 local1 = new androidx/fragment/app/Fragment$SavedState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Fragment$SavedState(Bundle paramBundle)
  {
    this.o00OoOoo = paramBundle;
  }
  
  public Fragment$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    paramParcel = paramParcel.readBundle();
    this.o00OoOoo = paramParcel;
    if ((paramClassLoader != null) && (paramParcel != null)) {
      paramParcel.setClassLoader(paramClassLoader);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Bundle localBundle = this.o00OoOoo;
    paramParcel.writeBundle(localBundle);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.Fragment.SavedState
 * JD-Core Version:    0.7.0.1
 */