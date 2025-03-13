package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import kotlin.jvm.internal.Intrinsics;

public final class ViewModelProviderGetKt
{
  public static final CreationExtras OooO00o(ViewModelStoreOwner paramViewModelStoreOwner)
  {
    String str = "owner";
    Intrinsics.OooO0o(paramViewModelStoreOwner, str);
    boolean bool = paramViewModelStoreOwner instanceof HasDefaultViewModelProviderFactory;
    if (bool) {
      paramViewModelStoreOwner = ((HasDefaultViewModelProviderFactory)paramViewModelStoreOwner).getDefaultViewModelCreationExtras();
    } else {
      paramViewModelStoreOwner = CreationExtras.Empty.OooO0O0;
    }
    return paramViewModelStoreOwner;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ViewModelProviderGetKt
 * JD-Core Version:    0.7.0.1
 */