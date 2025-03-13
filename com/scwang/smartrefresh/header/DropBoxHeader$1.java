package com.scwang.smartrefresh.header;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class DropBoxHeader$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public DropBoxHeader$1(DropBoxHeader paramDropBoxHeader) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    DropBoxHeader localDropBoxHeader = this.o00OoOoo;
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    localDropBoxHeader.o00o000 = f;
    localDropBoxHeader.invalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.DropBoxHeader.1
 * JD-Core Version:    0.7.0.1
 */