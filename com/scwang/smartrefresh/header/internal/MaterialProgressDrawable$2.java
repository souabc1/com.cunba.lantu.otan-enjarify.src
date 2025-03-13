package com.scwang.smartrefresh.header.internal;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class MaterialProgressDrawable$2
  implements Animation.AnimationListener
{
  public void onAnimationEnd(Animation paramAnimation) {}
  
  public void onAnimationRepeat(Animation paramAnimation)
  {
    this.OooO00o.OooO0o0();
    this.OooO00o.OooO0OO();
    Object localObject = this.OooO00o;
    float f1 = ((MaterialProgressDrawable.Ring)localObject).OooO0o0;
    ((MaterialProgressDrawable.Ring)localObject).OooO0Oo = f1;
    localObject = this.OooO0O0;
    boolean bool = ((MaterialProgressDrawable)localObject).o00OooOo;
    if (bool)
    {
      bool = false;
      f1 = 0.0F;
      ((MaterialProgressDrawable)localObject).o00OooOo = false;
      long l = 1332L;
      paramAnimation.setDuration(l);
      paramAnimation = this.OooO0O0;
      paramAnimation.OooO0o0(false);
    }
    else
    {
      float f2 = ((MaterialProgressDrawable)localObject).o00OooO0 + 1.0F;
      int i = 1084227584;
      f1 = 5.0F;
      f2 %= f1;
      ((MaterialProgressDrawable)localObject).o00OooO0 = f2;
    }
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    this.OooO0O0.o00OooO0 = 0.0F;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.2
 * JD-Core Version:    0.7.0.1
 */