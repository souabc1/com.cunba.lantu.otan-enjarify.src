package com.scwang.smartrefresh.header.internal;

import android.animation.TimeInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

class MaterialProgressDrawable$1
  extends Animation
{
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = this.o00Ooo00;
    boolean bool1 = paramTransformation.o00OooOo;
    MaterialProgressDrawable.Ring localRing1;
    if (bool1)
    {
      localRing1 = this.o00OoOoo;
      paramTransformation.OooO00o(paramFloat, localRing1);
    }
    else
    {
      localRing1 = this.o00OoOoo;
      float f1 = paramTransformation.OooO0OO(localRing1);
      localRing1 = this.o00OoOoo;
      float f2 = localRing1.OooOO0o;
      float f3 = localRing1.OooOO0O;
      float f4 = localRing1.OooOOO0;
      MaterialProgressDrawable localMaterialProgressDrawable = this.o00Ooo00;
      localMaterialProgressDrawable.OooO0o(paramFloat, localRing1);
      int i = 1056964608;
      float f5 = 0.5F;
      boolean bool2 = paramFloat < f5;
      float f6 = 0.8F;
      if (!bool2)
      {
        float f7 = paramFloat / f5;
        MaterialProgressDrawable.Ring localRing2 = this.o00OoOoo;
        float f8 = f6 - f1;
        Interpolator localInterpolator1 = MaterialProgressDrawable.o00OoooO;
        f7 = localInterpolator1.getInterpolation(f7);
        f8 *= f7;
        f3 += f8;
        localRing2.OooO0Oo = f3;
      }
      boolean bool3 = paramFloat < f5;
      if (bool3)
      {
        f6 -= f1;
        f1 = (paramFloat - f5) / f5;
        localRing1 = this.o00OoOoo;
        Interpolator localInterpolator2 = MaterialProgressDrawable.o00OoooO;
        f1 = localInterpolator2.getInterpolation(f1);
        f6 *= f1;
        f2 += f6;
        localRing1.OooO0o0 = f2;
      }
      paramTransformation = this.o00Ooo00;
      i = 1048576000;
      f5 = 0.25F * paramFloat;
      f4 += f5;
      paramTransformation.setProgressRotation(f4);
      f1 = 216.0F;
      paramFloat *= f1;
      paramTransformation = this.o00Ooo00;
      f5 = paramTransformation.o00OooO0 / 5.0F;
      f2 = 1080.0F;
      f5 *= f2;
      paramFloat += f5;
      paramTransformation.setRotation(paramFloat);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.1
 * JD-Core Version:    0.7.0.1
 */