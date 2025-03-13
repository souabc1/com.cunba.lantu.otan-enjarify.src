package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

public final class ViewModelProvider$AndroidViewModelFactory$Companion
{
  public final ViewModelProvider.Factory OooO00o(ViewModelStoreOwner paramViewModelStoreOwner)
  {
    String str = "owner";
    Intrinsics.OooO0o(paramViewModelStoreOwner, str);
    boolean bool = paramViewModelStoreOwner instanceof HasDefaultViewModelProviderFactory;
    if (bool) {
      paramViewModelStoreOwner = ((HasDefaultViewModelProviderFactory)paramViewModelStoreOwner).getDefaultViewModelProviderFactory();
    } else {
      paramViewModelStoreOwner = ViewModelProvider.NewInstanceFactory.OooO0O0.getInstance();
    }
    return paramViewModelStoreOwner;
  }
  
  public final ViewModelProvider.AndroidViewModelFactory OooO0O0(Application paramApplication)
  {
    Intrinsics.OooO0o(paramApplication, "application");
    ViewModelProvider.AndroidViewModelFactory localAndroidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.OooO0o0();
    if (localAndroidViewModelFactory == null)
    {
      localAndroidViewModelFactory = new androidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;
      localAndroidViewModelFactory.<init>(paramApplication);
      ViewModelProvider.AndroidViewModelFactory.OooO0o(localAndroidViewModelFactory);
    }
    paramApplication = ViewModelProvider.AndroidViewModelFactory.OooO0o0();
    Intrinsics.OooO0OO(paramApplication);
    return paramApplication;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion
 * JD-Core Version:    0.7.0.1
 */