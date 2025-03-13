package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

public class RectEvaluator
  implements TypeEvaluator
{
  private final Rect rect;
  
  public RectEvaluator(Rect paramRect)
  {
    this.rect = paramRect;
  }
  
  public Rect evaluate(float paramFloat, Rect paramRect1, Rect paramRect2)
  {
    int i = paramRect1.left;
    int j = (int)((paramRect2.left - i) * paramFloat);
    i += j;
    j = paramRect1.top;
    int k = (int)((paramRect2.top - j) * paramFloat);
    j += k;
    k = paramRect1.right;
    int m = (int)((paramRect2.right - k) * paramFloat);
    k += m;
    int n = paramRect1.bottom;
    int i1 = (int)((paramRect2.bottom - n) * paramFloat);
    n += i1;
    this.rect.set(i, j, k, n);
    return this.rect;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.RectEvaluator
 * JD-Core Version:    0.7.0.1
 */