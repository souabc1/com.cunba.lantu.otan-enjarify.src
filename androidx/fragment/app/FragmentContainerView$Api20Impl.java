package androidx.fragment.app;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import kotlin.jvm.internal.Intrinsics;

public final class FragmentContainerView$Api20Impl
{
  public static final Api20Impl OooO00o;
  
  static
  {
    Api20Impl localApi20Impl = new androidx/fragment/app/FragmentContainerView$Api20Impl;
    localApi20Impl.<init>();
    OooO00o = localApi20Impl;
  }
  
  public final WindowInsets OooO00o(View.OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener, View paramView, WindowInsets paramWindowInsets)
  {
    Intrinsics.OooO0o(paramOnApplyWindowInsetsListener, "onApplyWindowInsetsListener");
    Intrinsics.OooO0o(paramView, "v");
    Intrinsics.OooO0o(paramWindowInsets, "insets");
    paramOnApplyWindowInsetsListener = paramOnApplyWindowInsetsListener.onApplyWindowInsets(paramView, paramWindowInsets);
    Intrinsics.OooO0o0(paramOnApplyWindowInsetsListener, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
    return paramOnApplyWindowInsetsListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentContainerView.Api20Impl
 * JD-Core Version:    0.7.0.1
 */