package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

class RectEvaluator
  implements TypeEvaluator
{
  public Rect OooO00o;
  
  public RectEvaluator() {}
  
  public RectEvaluator(Rect paramRect)
  {
    this.OooO00o = paramRect;
  }
  
  public Rect OooO00o(float paramFloat, Rect paramRect1, Rect paramRect2)
  {
    int i = paramRect1.left;
    float f1 = (paramRect2.left - i) * paramFloat;
    int j = (int)f1;
    i += j;
    j = paramRect1.top;
    float f2 = (paramRect2.top - j) * paramFloat;
    int k = (int)f2;
    j += k;
    k = paramRect1.right;
    float f3 = (paramRect2.right - k) * paramFloat;
    int m = (int)f3;
    k += m;
    int n = paramRect1.bottom;
    int i1 = paramRect2.bottom - n;
    float f4 = i1 * paramFloat;
    int i2 = (int)f4;
    n += i2;
    Rect localRect = this.OooO00o;
    if (localRect == null)
    {
      localRect = new android/graphics/Rect;
      localRect.<init>(i, j, k, n);
      return localRect;
    }
    localRect.set(i, j, k, n);
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.RectEvaluator
 * JD-Core Version:    0.7.0.1
 */