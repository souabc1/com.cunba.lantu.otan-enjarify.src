package androidx.navigation;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class NavBackStackEntryState$Companion$CREATOR$1
  implements Parcelable.Creator
{
  public NavBackStackEntryState OooO00o(Parcel paramParcel)
  {
    Intrinsics.OooO0o(paramParcel, "inParcel");
    NavBackStackEntryState localNavBackStackEntryState = new androidx/navigation/NavBackStackEntryState;
    localNavBackStackEntryState.<init>(paramParcel);
    return localNavBackStackEntryState;
  }
  
  public NavBackStackEntryState[] OooO0O0(int paramInt)
  {
    return new NavBackStackEntryState[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavBackStackEntryState.Companion.CREATOR.1
 * JD-Core Version:    0.7.0.1
 */