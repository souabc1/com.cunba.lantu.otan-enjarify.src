package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;

abstract class LookupTableInterpolator
  implements Interpolator
{
  public final float[] OooO00o;
  public final float OooO0O0;
  
  public LookupTableInterpolator(float[] paramArrayOfFloat)
  {
    this.OooO00o = paramArrayOfFloat;
    float f1 = paramArrayOfFloat.length + -1;
    float f2 = 1.0F / f1;
    this.OooO0O0 = f2;
  }
  
  public float getInterpolation(float paramFloat)
  {
    int i = 1065353216;
    float f1 = 1.0F;
    boolean bool = paramFloat < f1;
    if (!bool) {
      return f1;
    }
    i = 0;
    f1 = 0.0F;
    float[] arrayOfFloat1 = null;
    bool = paramFloat < 0.0F;
    if (!bool) {
      return 0.0F;
    }
    arrayOfFloat1 = this.OooO00o;
    int j = (int)((arrayOfFloat1.length + -1) * paramFloat);
    i = arrayOfFloat1.length + -2;
    i = Math.min(j, i);
    float f2 = i;
    float f3 = this.OooO0O0;
    f2 *= f3;
    paramFloat = (paramFloat - f2) / f3;
    float[] arrayOfFloat2 = this.OooO00o;
    f3 = arrayOfFloat2[i];
    i += 1;
    f1 = arrayOfFloat2[i] - f3;
    paramFloat *= f1;
    return f3 + paramFloat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.interpolator.view.animation.LookupTableInterpolator
 * JD-Core Version:    0.7.0.1
 */