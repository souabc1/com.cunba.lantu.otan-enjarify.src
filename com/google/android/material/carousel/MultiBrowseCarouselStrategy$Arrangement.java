package com.google.android.material.carousel;

import androidx.core.math.MathUtils;
import m54207b69;

final class MultiBrowseCarouselStrategy$Arrangement
{
  final float cost;
  final int largeCount;
  float largeSize;
  final int mediumCount;
  float mediumSize;
  final int priority;
  final int smallCount;
  float smallSize;
  
  public MultiBrowseCarouselStrategy$Arrangement(int paramInt1, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt2, float paramFloat4, int paramInt3, float paramFloat5, int paramInt4, float paramFloat6)
  {
    this.priority = paramInt1;
    float f = MathUtils.OooO00o(paramFloat1, paramFloat2, paramFloat3);
    this.smallSize = f;
    this.smallCount = paramInt2;
    this.mediumSize = paramFloat4;
    this.mediumCount = paramInt3;
    this.largeSize = paramFloat5;
    this.largeCount = paramInt4;
    fit(paramFloat6, paramFloat2, paramFloat3, paramFloat5);
    f = cost(paramFloat5);
    this.cost = f;
  }
  
  private float calculateLargeSize(float paramFloat1, int paramInt1, float paramFloat2, int paramInt2, int paramInt3)
  {
    if (paramInt1 <= 0) {
      paramFloat2 = 0.0F;
    }
    float f1 = paramInt1;
    float f2 = paramInt2 / 2.0F;
    f1 = (f1 + f2) * paramFloat2;
    paramFloat1 -= f1;
    f1 = paramInt3 + f2;
    return paramFloat1 / f1;
  }
  
  private float cost(float paramFloat)
  {
    boolean bool = isValid();
    if (!bool) {
      return 3.4028235E+38F;
    }
    float f = this.largeSize;
    paramFloat = Math.abs(paramFloat - f);
    f = this.priority;
    return paramFloat * f;
  }
  
  private void fit(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = getSpace();
    f1 = paramFloat1 - f1;
    int i = this.smallCount;
    float f2;
    if (i > 0)
    {
      boolean bool1 = f1 < 0.0F;
      if (bool1)
      {
        paramFloat2 = this.smallSize;
        f2 = i;
        f1 /= f2;
        paramFloat3 -= paramFloat2;
        paramFloat3 = Math.min(f1, paramFloat3);
        paramFloat2 += paramFloat3;
        this.smallSize = paramFloat2;
        break label127;
      }
    }
    if (i > 0)
    {
      boolean bool2 = f1 < 0.0F;
      if (bool2)
      {
        paramFloat3 = this.smallSize;
        f2 = i;
        f1 /= f2;
        paramFloat2 -= paramFloat3;
        paramFloat2 = Math.max(f1, paramFloat2);
        paramFloat3 += paramFloat2;
        this.smallSize = paramFloat3;
      }
    }
    label127:
    int k = this.smallCount;
    float f3 = this.smallSize;
    int m = this.mediumCount;
    int n = this.largeCount;
    paramFloat1 = calculateLargeSize(paramFloat1, k, f3, m, n);
    this.largeSize = paramFloat1;
    paramFloat2 = this.smallSize + paramFloat1;
    paramFloat3 = 2.0F;
    paramFloat2 /= paramFloat3;
    this.mediumSize = paramFloat2;
    int j = this.mediumCount;
    if (j > 0)
    {
      boolean bool3 = paramFloat1 < paramFloat4;
      if (bool3)
      {
        paramFloat4 -= paramFloat1;
        paramFloat1 = this.largeCount;
        paramFloat4 *= paramFloat1;
        paramFloat2 *= 0.1F;
        paramFloat1 = j;
        paramFloat2 *= paramFloat1;
        paramFloat1 = Math.min(Math.abs(paramFloat4), paramFloat2);
        boolean bool4 = paramFloat4 < 0.0F;
        if (bool4)
        {
          paramFloat2 = this.mediumSize;
          paramFloat3 = this.mediumCount;
          paramFloat3 = paramFloat1 / paramFloat3;
          paramFloat2 -= paramFloat3;
          this.mediumSize = paramFloat2;
          paramFloat2 = this.largeSize;
          j = this.largeCount;
          paramFloat3 = j;
          paramFloat1 /= paramFloat3;
          paramFloat2 += paramFloat1;
        }
        else
        {
          paramFloat2 = this.mediumSize;
          paramFloat3 = this.mediumCount;
          paramFloat3 = paramFloat1 / paramFloat3;
          paramFloat2 += paramFloat3;
          this.mediumSize = paramFloat2;
          paramFloat2 = this.largeSize;
          j = this.largeCount;
          paramFloat3 = j;
          paramFloat1 /= paramFloat3;
          paramFloat2 -= paramFloat1;
        }
        this.largeSize = paramFloat2;
      }
    }
  }
  
  private float getSpace()
  {
    float f1 = this.largeSize;
    float f2 = this.largeCount;
    f1 *= f2;
    f2 = this.mediumSize;
    float f3 = this.mediumCount;
    f2 *= f3;
    f1 += f2;
    f2 = this.smallSize;
    f3 = this.smallCount;
    f2 *= f3;
    return f1 + f2;
  }
  
  private boolean isValid()
  {
    int i = this.largeCount;
    boolean bool3 = false;
    boolean bool4 = true;
    float f1;
    float f2;
    boolean bool1;
    if (i > 0)
    {
      int k = this.smallCount;
      if (k > 0)
      {
        k = this.mediumCount;
        if (k > 0)
        {
          f1 = this.largeSize;
          f2 = this.mediumSize;
          bool1 = f1 < f2;
          if (bool1)
          {
            f1 = this.smallSize;
            bool1 = f2 < f1;
            if (bool1) {
              bool3 = bool4;
            }
          }
          return bool3;
        }
      }
    }
    if (bool1)
    {
      int j = this.smallCount;
      if (j > 0)
      {
        f1 = this.largeSize;
        f2 = this.smallSize;
        boolean bool2 = f1 < f2;
        if (bool2) {
          bool3 = bool4;
        }
        return bool3;
      }
    }
    return bool4;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("*Q10242533433B3A433C482F7C162E31474E344A383C81");
    localStringBuilder.append(str);
    int i = this.priority;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("VO63703E253228291328432B467E");
    localStringBuilder.append(str);
    i = this.smallCount;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("(T7875293C393D3E0E45373B74");
    localStringBuilder.append(str);
    float f = this.smallSize;
    localStringBuilder.append(f);
    str = m54207b69.F54207b69_11("9X747937404036333C234037413872");
    localStringBuilder.append(str);
    i = this.mediumCount;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("M$08054B44445257507F56684C25");
    localStringBuilder.append(str);
    f = this.mediumSize;
    localStringBuilder.append(f);
    str = m54207b69.F54207b69_11("^I656A272B3F3332112E45314880");
    localStringBuilder.append(str);
    i = this.largeCount;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("pD68652A283A28271E35472B84");
    localStringBuilder.append(str);
    f = this.largeSize;
    localStringBuilder.append(f);
    str = m54207b69.F54207b69_11("qR7E733340252B75");
    localStringBuilder.append(str);
    f = this.cost;
    localStringBuilder.append(f);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.carousel.MultiBrowseCarouselStrategy.Arrangement
 * JD-Core Version:    0.7.0.1
 */