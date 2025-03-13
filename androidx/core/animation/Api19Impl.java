package androidx.core.animation;

import android.animation.Animator;
import android.animation.Animator.AnimatorPauseListener;
import kotlin.jvm.internal.Intrinsics;

final class Api19Impl
{
  public static final Api19Impl OooO00o;
  
  static
  {
    Api19Impl localApi19Impl = new androidx/core/animation/Api19Impl;
    localApi19Impl.<init>();
    OooO00o = localApi19Impl;
  }
  
  public static final void OooO00o(Animator paramAnimator, Animator.AnimatorPauseListener paramAnimatorPauseListener)
  {
    Intrinsics.OooO0o(paramAnimator, "animator");
    Intrinsics.OooO0o(paramAnimatorPauseListener, "listener");
    paramAnimator.addPauseListener(paramAnimatorPauseListener);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.animation.Api19Impl
 * JD-Core Version:    0.7.0.1
 */