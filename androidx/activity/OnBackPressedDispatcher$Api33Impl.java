package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class OnBackPressedDispatcher$Api33Impl
{
  public static final Api33Impl OooO00o;
  
  static
  {
    Api33Impl localApi33Impl = new androidx/activity/OnBackPressedDispatcher$Api33Impl;
    localApi33Impl.<init>();
    OooO00o = localApi33Impl;
  }
  
  public static final void OooO0OO(Function0 paramFunction0)
  {
    Intrinsics.OooO0o(paramFunction0, "$onBackInvoked");
    paramFunction0.OooO00o();
  }
  
  public final OnBackInvokedCallback OooO0O0(Function0 paramFunction0)
  {
    Intrinsics.OooO0o(paramFunction0, "onBackInvoked");
    OooOOO localOooOOO = new androidx/activity/OooOOO;
    localOooOOO.<init>(paramFunction0);
    return localOooOOO;
  }
  
  public final void OooO0Oo(Object paramObject1, int paramInt, Object paramObject2)
  {
    Intrinsics.OooO0o(paramObject1, "dispatcher");
    Intrinsics.OooO0o(paramObject2, "callback");
    paramObject1 = (OnBackInvokedDispatcher)paramObject1;
    paramObject2 = (OnBackInvokedCallback)paramObject2;
    paramObject1.registerOnBackInvokedCallback(paramInt, paramObject2);
  }
  
  public final void OooO0o0(Object paramObject1, Object paramObject2)
  {
    Intrinsics.OooO0o(paramObject1, "dispatcher");
    Intrinsics.OooO0o(paramObject2, "callback");
    paramObject1 = (OnBackInvokedDispatcher)paramObject1;
    paramObject2 = (OnBackInvokedCallback)paramObject2;
    paramObject1.unregisterOnBackInvokedCallback(paramObject2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.OnBackPressedDispatcher.Api33Impl
 * JD-Core Version:    0.7.0.1
 */