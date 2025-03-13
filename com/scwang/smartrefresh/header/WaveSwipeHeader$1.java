package com.scwang.smartrefresh.header;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.scwang.smartrefresh.header.waveswipe.WaveView;

class WaveSwipeHeader$1
  implements ValueAnimator.AnimatorUpdateListener
{
  public WaveSwipeHeader$1(WaveSwipeHeader paramWaveSwipeHeader) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    paramValueAnimator = this.o00OoOoo;
    WaveSwipeHeader.ProgressAnimationImageView localProgressAnimationImageView = paramValueAnimator.o00OooO;
    float f1 = paramValueAnimator.o00Ooo0O.getCurrentCircleCenterY();
    float f2 = localProgressAnimationImageView.getHeight() / 2.0F;
    f1 += f2;
    localProgressAnimationImageView.setTranslationY(f1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.WaveSwipeHeader.1
 * JD-Core Version:    0.7.0.1
 */