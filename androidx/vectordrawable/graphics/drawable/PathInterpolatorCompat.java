package androidx.vectordrawable.graphics.drawable;

import android.view.animation.Interpolator;

public class PathInterpolatorCompat
  implements Interpolator
{
  public float[] OooO00o;
  public float[] OooO0O0;
  
  public float getInterpolation(float paramFloat)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    float[] arrayOfFloat1 = null;
    boolean bool2 = paramFloat < 0.0F;
    if (!bool2) {
      return 0.0F;
    }
    int i = 1065353216;
    float f2 = 1.0F;
    int j = paramFloat < f2;
    if (j >= 0) {
      return f2;
    }
    float[] arrayOfFloat2 = this.OooO00o;
    i = arrayOfFloat2.length;
    j = 1;
    float f3 = 1.4E-45F;
    i -= j;
    int k = 0;
    for (;;)
    {
      int m = i - k;
      if (m <= j) {
        break;
      }
      int n = (k + i) / 2;
      float[] arrayOfFloat3 = this.OooO00o;
      float f4 = arrayOfFloat3[n];
      boolean bool3 = paramFloat < f4;
      if (bool3) {
        i = n;
      } else {
        k = n;
      }
    }
    float[] arrayOfFloat4 = this.OooO00o;
    float f5 = arrayOfFloat4[i];
    f3 = arrayOfFloat4[k];
    f5 -= f3;
    bool1 = f5 < 0.0F;
    if (!bool1) {
      return this.OooO0O0[k];
    }
    paramFloat = (paramFloat - f3) / f5;
    arrayOfFloat1 = this.OooO0O0;
    f3 = arrayOfFloat1[k];
    f1 = arrayOfFloat1[i] - f3;
    paramFloat *= f1;
    return f3 + paramFloat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat
 * JD-Core Version:    0.7.0.1
 */