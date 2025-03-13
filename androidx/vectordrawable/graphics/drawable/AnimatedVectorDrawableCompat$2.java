package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

class AnimatedVectorDrawableCompat$2
  extends AnimatorListenerAdapter
{
  public AnimatedVectorDrawableCompat$2(AnimatedVectorDrawableCompat paramAnimatedVectorDrawableCompat) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = new java/util/ArrayList;
    ArrayList localArrayList = this.o00OoOoo.o00OooO;
    paramAnimator.<init>(localArrayList);
    int i = paramAnimator.size();
    int j = 0;
    while (j < i)
    {
      Animatable2Compat.AnimationCallback localAnimationCallback = (Animatable2Compat.AnimationCallback)paramAnimator.get(j);
      AnimatedVectorDrawableCompat localAnimatedVectorDrawableCompat = this.o00OoOoo;
      localAnimationCallback.onAnimationEnd(localAnimatedVectorDrawableCompat);
      j += 1;
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = new java/util/ArrayList;
    ArrayList localArrayList = this.o00OoOoo.o00OooO;
    paramAnimator.<init>(localArrayList);
    int i = paramAnimator.size();
    int j = 0;
    while (j < i)
    {
      Animatable2Compat.AnimationCallback localAnimationCallback = (Animatable2Compat.AnimationCallback)paramAnimator.get(j);
      AnimatedVectorDrawableCompat localAnimatedVectorDrawableCompat = this.o00OoOoo;
      localAnimationCallback.onAnimationStart(localAnimatedVectorDrawableCompat);
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.2
 * JD-Core Version:    0.7.0.1
 */