package com.scwang.smartrefresh.header.waveswipe;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Path;
import android.view.View;

class WaveView$4
  implements ValueAnimator.AnimatorUpdateListener
{
  public WaveView$4(WaveView paramWaveView) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f1 = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    this.o00OoOoo.o00Ooo0.moveTo(0.0F, 0.0F);
    Object localObject = this.o00OoOoo;
    Path localPath = ((WaveView)localObject).o00Ooo0;
    int i = ((WaveView)localObject).o00OooOO;
    float f2 = i * 0.25F;
    float f3 = i * 0.333F;
    float f4 = 0.5F;
    float f5 = f1 * f4;
    localPath.quadTo(f2, 0.0F, f3, f5);
    localObject = this.o00OoOoo;
    localPath = ((WaveView)localObject).o00Ooo0;
    i = ((WaveView)localObject).o00OooOO;
    f2 = i * f4;
    f1 *= 1.4F;
    f3 = i * 0.666F;
    localPath.quadTo(f2, f1, f3, f5);
    paramValueAnimator = this.o00OoOoo;
    localObject = paramValueAnimator.o00Ooo0;
    int j = paramValueAnimator.o00OooOO;
    float f6 = j * 0.75F;
    f1 = j;
    ((Path)localObject).quadTo(f6, 0.0F, f1, 0.0F);
    this.o00OoOoo.postInvalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.waveswipe.WaveView.4
 * JD-Core Version:    0.7.0.1
 */