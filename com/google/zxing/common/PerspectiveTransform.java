package com.google.zxing.common;

public final class PerspectiveTransform
{
  private final float a11;
  private final float a12;
  private final float a13;
  private final float a21;
  private final float a22;
  private final float a23;
  private final float a31;
  private final float a32;
  private final float a33;
  
  private PerspectiveTransform(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9)
  {
    this.a11 = paramFloat1;
    this.a12 = paramFloat4;
    this.a13 = paramFloat7;
    this.a21 = paramFloat2;
    this.a22 = paramFloat5;
    this.a23 = paramFloat8;
    this.a31 = paramFloat3;
    this.a32 = paramFloat6;
    this.a33 = paramFloat9;
  }
  
  public static PerspectiveTransform quadrilateralToQuadrilateral(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, float paramFloat15, float paramFloat16)
  {
    PerspectiveTransform localPerspectiveTransform = quadrilateralToSquare(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramFloat8);
    return squareToQuadrilateral(paramFloat9, paramFloat10, paramFloat11, paramFloat12, paramFloat13, paramFloat14, paramFloat15, paramFloat16).times(localPerspectiveTransform);
  }
  
  public static PerspectiveTransform quadrilateralToSquare(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    return squareToQuadrilateral(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramFloat8).buildAdjoint();
  }
  
  public static PerspectiveTransform squareToQuadrilateral(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    float f1 = paramFloat1 - paramFloat3 + paramFloat5 - paramFloat7;
    float f2 = paramFloat2 - paramFloat4 + paramFloat6 - paramFloat8;
    boolean bool1 = false;
    float f3 = 0.0F;
    boolean bool2 = f1 < 0.0F;
    if (!bool2)
    {
      bool1 = f2 < 0.0F;
      if (!bool1)
      {
        localPerspectiveTransform = new com/google/zxing/common/PerspectiveTransform;
        f2 = paramFloat3 - paramFloat1;
        f3 = paramFloat5 - paramFloat3;
        f4 = paramFloat4 - paramFloat2;
        f5 = paramFloat6 - paramFloat4;
        f6 = paramFloat1;
        f7 = paramFloat2;
        localPerspectiveTransform.<init>(f2, f3, paramFloat1, f4, f5, paramFloat2, 0.0F, 0.0F, 1.0F);
        return localPerspectiveTransform;
      }
    }
    f3 = paramFloat3 - paramFloat5;
    float f6 = paramFloat7 - paramFloat5;
    float f4 = paramFloat4 - paramFloat6;
    float f5 = paramFloat8 - paramFloat6;
    float f7 = f3 * f5;
    float f8 = f6 * f4;
    f7 -= f8;
    f5 *= f1;
    f6 *= f2;
    f8 = (f5 - f6) / f7;
    f3 *= f2;
    f1 *= f4;
    float f9 = (f3 - f1) / f7;
    PerspectiveTransform localPerspectiveTransform = new com/google/zxing/common/PerspectiveTransform;
    f1 = paramFloat3 - paramFloat1;
    f2 = f8 * paramFloat3 + f1;
    f1 = paramFloat7 - paramFloat1;
    f3 = f9 * paramFloat7 + f1;
    f1 = paramFloat4 - paramFloat2;
    f6 = f8 * paramFloat4;
    f4 = f1 + f6;
    f1 = paramFloat8 - paramFloat2;
    f6 = f9 * paramFloat8;
    f5 = f1 + f6;
    f6 = paramFloat1;
    f7 = paramFloat2;
    localPerspectiveTransform.<init>(f2, f3, paramFloat1, f4, f5, paramFloat2, f8, f9, 1.0F);
    return localPerspectiveTransform;
  }
  
  public PerspectiveTransform buildAdjoint()
  {
    PerspectiveTransform localPerspectiveTransform = new com/google/zxing/common/PerspectiveTransform;
    float f1 = this.a22;
    float f2 = this.a33;
    float f3 = f1 * f2;
    float f4 = this.a23;
    float f5 = this.a32;
    float f6 = f4 * f5;
    f3 -= f6;
    f6 = this.a31;
    float f7 = f4 * f6;
    float f8 = this.a21;
    float f9 = f8 * f2;
    f7 -= f9;
    f9 = f8 * f5;
    float f10 = f1 * f6;
    f9 -= f10;
    f10 = this.a13;
    float f11 = f10 * f5;
    float f12 = this.a12;
    float f13 = f12 * f2;
    f11 -= f13;
    f13 = this.a11;
    f2 *= f13;
    float f14 = f10 * f6;
    f14 = f2 - f14;
    f6 *= f12;
    f5 *= f13;
    float f15 = f6 - f5;
    f2 = f12 * f4;
    f5 = f10 * f1;
    float f16 = f2 - f5;
    f10 *= f8;
    f4 *= f13;
    f10 -= f4;
    f13 *= f1;
    f12 *= f8;
    f12 = f13 - f12;
    f2 = f3;
    f3 = f7;
    f4 = f9;
    f5 = f11;
    f6 = f14;
    f7 = f15;
    f8 = f16;
    f9 = f10;
    f10 = f12;
    localPerspectiveTransform.<init>(f2, f3, f4, f11, f14, f15, f16, f9, f12);
    return localPerspectiveTransform;
  }
  
  public PerspectiveTransform times(PerspectiveTransform paramPerspectiveTransform)
  {
    PerspectiveTransform localPerspectiveTransform = new com/google/zxing/common/PerspectiveTransform;
    float f1 = this.a11;
    float f2 = paramPerspectiveTransform.a11;
    float f3 = f1 * f2;
    float f4 = this.a21;
    float f5 = paramPerspectiveTransform.a12;
    float f6 = f4 * f5;
    f3 += f6;
    f6 = this.a31;
    float f7 = paramPerspectiveTransform.a13;
    float f8 = f6 * f7;
    f3 += f8;
    f8 = paramPerspectiveTransform.a21;
    float f9 = f1 * f8;
    float f10 = paramPerspectiveTransform.a22;
    float f11 = f4 * f10;
    f9 += f11;
    f11 = paramPerspectiveTransform.a23;
    float f12 = f6 * f11;
    f9 += f12;
    f12 = paramPerspectiveTransform.a31;
    f1 *= f12;
    float f13 = paramPerspectiveTransform.a32;
    f4 *= f13;
    f1 += f4;
    float f14 = paramPerspectiveTransform.a33;
    f6 *= f14;
    f4 = f1 + f6;
    f1 = this.a12;
    f6 = f1 * f2;
    float f15 = f4;
    f4 = this.a22;
    float f16 = f4 * f5;
    f6 += f16;
    f16 = f9;
    f9 = this.a32;
    float f17 = f9 * f7;
    f6 += f17;
    f17 = f1 * f8;
    float f18 = f4 * f10;
    f17 += f18;
    f18 = f9 * f11;
    f17 += f18;
    f1 *= f12;
    f4 *= f13;
    f1 += f4;
    f9 = f9 * f14 + f1;
    f1 = this.a13;
    f2 *= f1;
    f4 = this.a23;
    f5 *= f4;
    f2 += f5;
    f5 = this.a33;
    f7 = f7 * f5 + f2;
    f8 *= f1;
    f10 *= f4;
    f8 += f10;
    f11 *= f5;
    f8 += f11;
    f1 *= f12;
    f4 *= f13;
    f1 += f4;
    f5 *= f14;
    f10 = f1 + f5;
    f1 = f3;
    f2 = f16;
    f3 = f15;
    f4 = f6;
    f5 = f17;
    f6 = f9;
    f9 = f10;
    localPerspectiveTransform.<init>(f1, f16, f15, f4, f17, f6, f7, f8, f10);
    return localPerspectiveTransform;
  }
  
  public void transformPoints(float[] paramArrayOfFloat)
  {
    float[] arrayOfFloat = paramArrayOfFloat;
    float f1 = this.a11;
    float f2 = this.a12;
    float f3 = this.a13;
    float f4 = this.a21;
    float f5 = this.a22;
    float f6 = this.a23;
    float f7 = this.a31;
    float f8 = this.a32;
    float f9 = this.a33;
    int i = paramArrayOfFloat.length + -1;
    int j = 0;
    while (j < i)
    {
      float f10 = arrayOfFloat[j];
      int k = j + 1;
      float f11 = arrayOfFloat[k];
      float f12 = f3 * f10;
      float f13 = f6 * f11;
      f12 = f12 + f13 + f9;
      f13 = f1 * f10;
      float f14 = f4 * f11;
      f13 = (f13 + f14 + f7) / f12;
      arrayOfFloat[j] = f13;
      f10 *= f2;
      f11 *= f5;
      f10 = (f10 + f11 + f8) / f12;
      arrayOfFloat[k] = f10;
      j += 2;
    }
  }
  
  public void transformPoints(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    int i = paramArrayOfFloat1.length;
    int j = 0;
    while (j < i)
    {
      float f1 = paramArrayOfFloat1[j];
      float f2 = paramArrayOfFloat2[j];
      float f3 = this.a13 * f1;
      float f4 = this.a23 * f2;
      f3 += f4;
      f4 = this.a33;
      f3 += f4;
      f4 = this.a11 * f1;
      float f5 = this.a21 * f2;
      f4 += f5;
      f5 = this.a31;
      f4 = (f4 + f5) / f3;
      paramArrayOfFloat1[j] = f4;
      f4 = this.a12 * f1;
      f1 = this.a22 * f2;
      f4 += f1;
      f1 = this.a32;
      f4 = (f4 + f1) / f3;
      paramArrayOfFloat2[j] = f4;
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.PerspectiveTransform
 * JD-Core Version:    0.7.0.1
 */