package com.scwang.smartrefresh.header.waveswipe;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

class WaveView$2
  implements ValueAnimator.AnimatorUpdateListener
{
  public WaveView$2(WaveView paramWaveView) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    WaveView localWaveView = this.o00OoOoo;
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    localWaveView.o00OooOo = f;
    this.o00OoOoo.postInvalidateOnAnimation();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.waveswipe.WaveView.2
 * JD-Core Version:    0.7.0.1
 */