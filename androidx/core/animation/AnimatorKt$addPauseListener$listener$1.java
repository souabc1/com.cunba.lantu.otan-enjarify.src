package androidx.core.animation;

import android.animation.Animator;
import android.animation.Animator.AnimatorPauseListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AnimatorKt$addPauseListener$listener$1
  implements Animator.AnimatorPauseListener
{
  public void onAnimationPause(Animator paramAnimator)
  {
    Intrinsics.OooO0o(paramAnimator, "animator");
    this.o00OoOoo.invoke(paramAnimator);
  }
  
  public void onAnimationResume(Animator paramAnimator)
  {
    Intrinsics.OooO0o(paramAnimator, "animator");
    this.o00Ooo00.invoke(paramAnimator);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.animation.AnimatorKt.addPauseListener.listener.1
 * JD-Core Version:    0.7.0.1
 */