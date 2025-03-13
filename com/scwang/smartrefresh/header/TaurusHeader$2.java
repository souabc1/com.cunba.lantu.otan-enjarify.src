package com.scwang.smartrefresh.header;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class TaurusHeader$2
  extends Animation
{
  public TaurusHeader$2(TaurusHeader paramTaurusHeader, View paramView)
  {
    super.setDuration(100);
    paramTaurusHeader = new android/view/animation/AccelerateInterpolator;
    paramTaurusHeader.<init>();
    super.setInterpolator(paramTaurusHeader);
  }
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f = 1.0F;
    boolean bool = paramFloat < f;
    if (!bool)
    {
      paramTransformation = this.o00Ooo00;
      paramTransformation.o0O00o0 = false;
    }
    this.o00Ooo00.o00o00O0 = paramFloat;
    this.o00OoOoo.invalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.TaurusHeader.2
 * JD-Core Version:    0.7.0.1
 */