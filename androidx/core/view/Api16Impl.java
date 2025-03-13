package androidx.core.view;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

final class Api16Impl
{
  public static final Api16Impl OooO00o;
  
  static
  {
    Api16Impl localApi16Impl = new androidx/core/view/Api16Impl;
    localApi16Impl.<init>();
    OooO00o = localApi16Impl;
  }
  
  public static final void OooO00o(View paramView, Runnable paramRunnable, long paramLong)
  {
    Intrinsics.OooO0o(paramView, "view");
    Intrinsics.OooO0o(paramRunnable, "action");
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.Api16Impl
 * JD-Core Version:    0.7.0.1
 */