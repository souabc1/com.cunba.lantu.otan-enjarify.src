package androidx.core.animation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AnimatorKt$doOnEnd$$inlined$addListener$default$1
  implements Animator.AnimatorListener
{
  public void onAnimationCancel(Animator paramAnimator)
  {
    Intrinsics.OooO0o(paramAnimator, "animator");
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    Intrinsics.OooO0o(paramAnimator, "animator");
    this.o00OoOoo.invoke(paramAnimator);
  }
  
  public void onAnimationRepeat(Animator paramAnimator)
  {
    Intrinsics.OooO0o(paramAnimator, "animator");
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    Intrinsics.OooO0o(paramAnimator, "animator");
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.animation.AnimatorKt.doOnEnd..inlined.addListener.default.1
 * JD-Core Version:    0.7.0.1
 */