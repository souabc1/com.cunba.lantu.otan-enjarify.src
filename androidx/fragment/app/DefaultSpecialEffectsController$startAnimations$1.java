package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

public final class DefaultSpecialEffectsController$startAnimations$1
  extends AnimatorListenerAdapter
{
  public DefaultSpecialEffectsController$startAnimations$1(DefaultSpecialEffectsController paramDefaultSpecialEffectsController, View paramView, boolean paramBoolean, SpecialEffectsController.Operation paramOperation, DefaultSpecialEffectsController.AnimationInfo paramAnimationInfo) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    Intrinsics.OooO0o(paramAnimator, "anim");
    paramAnimator = this.o00OoOoo.getContainer();
    Object localObject = this.o00Ooo00;
    paramAnimator.endViewTransition((View)localObject);
    boolean bool = this.o00Ooo0;
    if (bool)
    {
      paramAnimator = this.o00Ooo0O.getFinalState();
      localObject = this.o00Ooo00;
      String str = "viewToAnimate";
      Intrinsics.OooO0o0(localObject, str);
      paramAnimator.OooO0OO((View)localObject);
    }
    paramAnimator = this.o00Ooo0o;
    paramAnimator.OooO00o();
    bool = FragmentManager.isLoggingEnabled(2);
    if (bool)
    {
      paramAnimator = new java/lang/StringBuilder;
      paramAnimator.<init>();
      paramAnimator.append("Animator from operation ");
      localObject = this.o00Ooo0O;
      paramAnimator.append(localObject);
      localObject = " has ended.";
      paramAnimator.append((String)localObject);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.startAnimations.1
 * JD-Core Version:    0.7.0.1
 */