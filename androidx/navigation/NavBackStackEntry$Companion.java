package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle.State;
import kotlin.jvm.internal.Intrinsics;

public final class NavBackStackEntry$Companion
{
  public final NavBackStackEntry OooO00o(Context paramContext, NavDestination paramNavDestination, Bundle paramBundle1, Lifecycle.State paramState, NavViewModelStoreProvider paramNavViewModelStoreProvider, String paramString, Bundle paramBundle2)
  {
    Intrinsics.OooO0o(paramNavDestination, "destination");
    Intrinsics.OooO0o(paramState, "hostLifecycleState");
    Intrinsics.OooO0o(paramString, "id");
    NavBackStackEntry localNavBackStackEntry = new androidx/navigation/NavBackStackEntry;
    localNavBackStackEntry.<init>(paramContext, paramNavDestination, paramBundle1, paramState, paramNavViewModelStoreProvider, paramString, paramBundle2, null);
    return localNavBackStackEntry;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavBackStackEntry.Companion
 * JD-Core Version:    0.7.0.1
 */