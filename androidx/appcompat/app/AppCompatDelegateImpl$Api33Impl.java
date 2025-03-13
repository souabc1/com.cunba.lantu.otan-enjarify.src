package androidx.appcompat.app;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

class AppCompatDelegateImpl$Api33Impl
{
  public static OnBackInvokedDispatcher OooO00o(Activity paramActivity)
  {
    return OooO0OO.OooO00o(paramActivity);
  }
  
  public static OnBackInvokedCallback OooO0O0(Object paramObject, AppCompatDelegateImpl paramAppCompatDelegateImpl)
  {
    Objects.requireNonNull(paramAppCompatDelegateImpl);
    OooOOO0 localOooOOO0 = new androidx/appcompat/app/OooOOO0;
    localOooOOO0.<init>(paramAppCompatDelegateImpl);
    OooOO0O.OooO00o(OooO.OooO00o(paramObject), 1000000, localOooOOO0);
    return localOooOOO0;
  }
  
  public static void OooO0OO(Object paramObject1, Object paramObject2)
  {
    paramObject2 = OooO0o.OooO00o(paramObject2);
    OooOO0.OooO00o(OooO.OooO00o(paramObject1), paramObject2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl
 * JD-Core Version:    0.7.0.1
 */