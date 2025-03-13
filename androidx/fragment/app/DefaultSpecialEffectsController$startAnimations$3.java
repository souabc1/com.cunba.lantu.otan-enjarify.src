package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import kotlin.jvm.internal.Intrinsics;

public final class DefaultSpecialEffectsController$startAnimations$3
  implements Animation.AnimationListener
{
  public DefaultSpecialEffectsController$startAnimations$3(SpecialEffectsController.Operation paramOperation, DefaultSpecialEffectsController paramDefaultSpecialEffectsController, View paramView, DefaultSpecialEffectsController.AnimationInfo paramAnimationInfo) {}
  
  public static final void OooO0O0(DefaultSpecialEffectsController paramDefaultSpecialEffectsController, View paramView, DefaultSpecialEffectsController.AnimationInfo paramAnimationInfo)
  {
    Intrinsics.OooO0o(paramDefaultSpecialEffectsController, "this$0");
    Intrinsics.OooO0o(paramAnimationInfo, "$animationInfo");
    paramDefaultSpecialEffectsController.getContainer().endViewTransition(paramView);
    paramAnimationInfo.OooO00o();
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    Intrinsics.OooO0o(paramAnimation, "animation");
    paramAnimation = this.OooO0O0.getContainer();
    Object localObject = this.OooO0O0;
    View localView = this.OooO0OO;
    DefaultSpecialEffectsController.AnimationInfo localAnimationInfo = this.OooO0Oo;
    OooOOO0 localOooOOO0 = new androidx/fragment/app/OooOOO0;
    localOooOOO0.<init>((DefaultSpecialEffectsController)localObject, localView, localAnimationInfo);
    paramAnimation.post(localOooOOO0);
    boolean bool = FragmentManager.isLoggingEnabled(2);
    if (bool)
    {
      paramAnimation = new java/lang/StringBuilder;
      paramAnimation.<init>();
      paramAnimation.append("Animation from operation ");
      localObject = this.OooO00o;
      paramAnimation.append(localObject);
      localObject = " has ended.";
      paramAnimation.append((String)localObject);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation)
  {
    Intrinsics.OooO0o(paramAnimation, "animation");
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    Object localObject = "animation";
    Intrinsics.OooO0o(paramAnimation, (String)localObject);
    boolean bool = FragmentManager.isLoggingEnabled(2);
    if (bool)
    {
      paramAnimation = new java/lang/StringBuilder;
      paramAnimation.<init>();
      paramAnimation.append("Animation from operation ");
      localObject = this.OooO00o;
      paramAnimation.append(localObject);
      localObject = " has reached onAnimationStart.";
      paramAnimation.append((String)localObject);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.startAnimations.3
 * JD-Core Version:    0.7.0.1
 */