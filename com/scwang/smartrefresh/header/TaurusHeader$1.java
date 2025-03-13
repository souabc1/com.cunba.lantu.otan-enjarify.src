package com.scwang.smartrefresh.header;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class TaurusHeader$1
  extends Animation
{
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = this.o00Ooo00;
    paramFloat = paramFloat / 6.0F * 80.0F;
    paramTransformation.o00OoooO = paramFloat;
    this.o00OoOoo.invalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.TaurusHeader.1
 * JD-Core Version:    0.7.0.1
 */