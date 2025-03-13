package com.xuexiang.xui.widget.banner.anim;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import m54207b69;

class BaseAnimator$1
  implements Animator.AnimatorListener
{
  public BaseAnimator$1(BaseAnimator paramBaseAnimator) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(2321, arrayOfObject);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(2322, arrayOfObject);
  }
  
  public void onAnimationRepeat(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(2323, arrayOfObject);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimator;
    m54207b69.F54207b69_00(2324, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.banner.anim.BaseAnimator.1
 * JD-Core Version:    0.7.0.1
 */