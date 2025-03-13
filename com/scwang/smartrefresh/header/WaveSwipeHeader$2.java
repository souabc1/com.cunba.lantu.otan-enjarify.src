package com.scwang.smartrefresh.header;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class WaveSwipeHeader$2
  extends Animation
{
  public WaveSwipeHeader$2(WaveSwipeHeader paramWaveSwipeHeader, View paramView) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = this.o00OoOoo;
    float f = 1.0F - paramFloat;
    paramTransformation.setScaleX(f);
    this.o00OoOoo.setScaleY(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.WaveSwipeHeader.2
 * JD-Core Version:    0.7.0.1
 */