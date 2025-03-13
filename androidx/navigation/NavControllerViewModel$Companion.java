package androidx.navigation;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.internal.Intrinsics;

public final class NavControllerViewModel$Companion
{
  public final NavControllerViewModel OooO00o(ViewModelStore paramViewModelStore)
  {
    Intrinsics.OooO0o(paramViewModelStore, "viewModelStore");
    ViewModelProvider localViewModelProvider = new androidx/lifecycle/ViewModelProvider;
    ViewModelProvider.Factory localFactory = NavControllerViewModel.OooO0oO();
    localViewModelProvider.<init>(paramViewModelStore, localFactory, null, 4, null);
    return (NavControllerViewModel)localViewModelProvider.OooO00o(NavControllerViewModel.class);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavControllerViewModel.Companion
 * JD-Core Version:    0.7.0.1
 */