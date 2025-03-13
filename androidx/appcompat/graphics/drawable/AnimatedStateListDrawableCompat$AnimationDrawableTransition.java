package androidx.appcompat.graphics.drawable;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.AnimationDrawable;
import androidx.appcompat.resources.Compatibility.Api18Impl;

class AnimatedStateListDrawableCompat$AnimationDrawableTransition
  extends AnimatedStateListDrawableCompat.Transition
{
  public final ObjectAnimator OooO00o;
  public final boolean OooO0O0;
  
  public AnimatedStateListDrawableCompat$AnimationDrawableTransition(AnimationDrawable paramAnimationDrawable, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(null);
    int i = paramAnimationDrawable.getNumberOfFrames();
    int j = 0;
    int[] arrayOfInt = null;
    int k;
    if (paramBoolean1) {
      k = i + -1;
    } else {
      k = 0;
    }
    boolean bool = true;
    if (!paramBoolean1) {
      j = i + -1;
    }
    localFrameInterpolator = new androidx/appcompat/graphics/drawable/AnimatedStateListDrawableCompat$FrameInterpolator;
    localFrameInterpolator.<init>(paramAnimationDrawable, paramBoolean1);
    arrayOfInt = new int[] { k, j };
    paramAnimationDrawable = ObjectAnimator.ofInt(paramAnimationDrawable, "currentIndex", arrayOfInt);
    Compatibility.Api18Impl.OooO00o(paramAnimationDrawable, bool);
    long l = localFrameInterpolator.getTotalDuration();
    paramAnimationDrawable.setDuration(l);
    paramAnimationDrawable.setInterpolator(localFrameInterpolator);
    this.OooO0O0 = paramBoolean2;
    this.OooO00o = paramAnimationDrawable;
  }
  
  public boolean OooO00o()
  {
    return this.OooO0O0;
  }
  
  public void OooO0O0()
  {
    this.OooO00o.reverse();
  }
  
  public void OooO0OO()
  {
    this.OooO00o.start();
  }
  
  public void OooO0Oo()
  {
    this.OooO00o.cancel();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimationDrawableTransition
 * JD-Core Version:    0.7.0.1
 */