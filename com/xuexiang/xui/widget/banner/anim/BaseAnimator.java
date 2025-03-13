package com.xuexiang.xui.widget.banner.anim;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.animation.Interpolator;
import m54207b69;

public abstract class BaseAnimator
{
  public long OooO00o = 500L;
  public AnimatorSet OooO0O0;
  public Interpolator OooO0OO;
  public long OooO0Oo;
  public BaseAnimator.AnimatorListener OooO0o0;
  
  public BaseAnimator()
  {
    AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
    localAnimatorSet.<init>();
    this.OooO0O0 = localAnimatorSet;
  }
  
  public static void OooO0Oo(View paramView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramView;
    m54207b69.F54207b69_00(2328, arrayOfObject);
  }
  
  public BaseAnimator OooO0O0(Interpolator paramInterpolator)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramInterpolator;
    return (BaseAnimator)m54207b69.F54207b69_09(2326, arrayOfObject);
  }
  
  public void OooO0OO(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(2327, arrayOfObject);
  }
  
  public void OooO0o0(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(2329, arrayOfObject);
  }
  
  public abstract void setAnimation(View paramView);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.banner.anim.BaseAnimator
 * JD-Core Version:    0.7.0.1
 */