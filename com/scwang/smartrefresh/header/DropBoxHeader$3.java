package com.scwang.smartrefresh.header;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class DropBoxHeader$3
  implements ValueAnimator.AnimatorUpdateListener
{
  public DropBoxHeader$3(DropBoxHeader paramDropBoxHeader) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    DropBoxHeader localDropBoxHeader = this.o00OoOoo;
    float f1 = localDropBoxHeader.o00o0000;
    float f2 = 1.0F;
    boolean bool1 = f1 < f2;
    if (!bool1)
    {
      int i = 1077936128;
      float f3 = 3.0F;
      boolean bool2 = f1 < f3;
      if (bool2)
      {
        int j = 1073741824;
        float f4 = 2.0F;
        boolean bool3 = f1 < f4;
        if (bool3)
        {
          paramValueAnimator = (Float)paramValueAnimator.getAnimatedValue();
          f5 = paramValueAnimator.floatValue() + f2;
          break label171;
        }
        boolean bool4 = f1 < f3;
        if (!bool4) {
          break label177;
        }
        f5 = ((Float)paramValueAnimator.getAnimatedValue()).floatValue() + f4;
        localDropBoxHeader.o00o0000 = f5;
        paramValueAnimator = this.o00OoOoo;
        float f6 = paramValueAnimator.o00o0000;
        boolean bool5 = f6 < f3;
        if (bool5) {
          break label177;
        }
        bool5 = true;
        f6 = 1.4E-45F;
        paramValueAnimator.o00OooOo = bool5;
        break label177;
      }
    }
    paramValueAnimator = (Float)paramValueAnimator.getAnimatedValue();
    float f5 = paramValueAnimator.floatValue();
    label171:
    localDropBoxHeader.o00o0000 = f5;
    label177:
    this.o00OoOoo.invalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.DropBoxHeader.3
 * JD-Core Version:    0.7.0.1
 */