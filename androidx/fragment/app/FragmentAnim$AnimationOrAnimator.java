package androidx.fragment.app;

import android.animation.Animator;
import android.view.animation.Animation;

class FragmentAnim$AnimationOrAnimator
{
  public final Animation OooO00o;
  public final Animator OooO0O0;
  
  public FragmentAnim$AnimationOrAnimator(Animator paramAnimator)
  {
    this.OooO00o = null;
    this.OooO0O0 = paramAnimator;
    if (paramAnimator != null) {
      return;
    }
    paramAnimator = new java/lang/IllegalStateException;
    paramAnimator.<init>("Animator cannot be null");
    throw paramAnimator;
  }
  
  public FragmentAnim$AnimationOrAnimator(Animation paramAnimation)
  {
    this.OooO00o = paramAnimation;
    this.OooO0O0 = null;
    if (paramAnimation != null) {
      return;
    }
    paramAnimation = new java/lang/IllegalStateException;
    paramAnimation.<init>("Animation cannot be null");
    throw paramAnimation;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentAnim.AnimationOrAnimator
 * JD-Core Version:    0.7.0.1
 */