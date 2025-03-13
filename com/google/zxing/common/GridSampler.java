package com.google.zxing.common;

import com.google.zxing.NotFoundException;

public abstract class GridSampler
{
  private static GridSampler gridSampler;
  
  static
  {
    DefaultGridSampler localDefaultGridSampler = new com/google/zxing/common/DefaultGridSampler;
    localDefaultGridSampler.<init>();
    gridSampler = localDefaultGridSampler;
  }
  
  public static void checkAndNudgePoints(BitMatrix paramBitMatrix, float[] paramArrayOfFloat)
  {
    int i = paramBitMatrix.getWidth();
    int j = paramBitMatrix.getHeight();
    int k = paramArrayOfFloat.length;
    int m = 1;
    float f1 = 1.4E-45F;
    k -= m;
    int n = m;
    float f2 = f1;
    int i1 = 0;
    float f3 = 0.0F;
    int i2;
    int i3;
    for (;;)
    {
      i2 = -1;
      if ((i1 >= k) || (n == 0)) {
        break label226;
      }
      f2 = paramArrayOfFloat[i1];
      n = (int)f2;
      i3 = i1 + 1;
      float f4 = paramArrayOfFloat[i3];
      int i4 = (int)f4;
      if ((n < i2) || (n > i) || (i4 < i2) || (i4 > j)) {
        break;
      }
      if (n == i2) {
        paramArrayOfFloat[i1] = 0.0F;
      }
      for (;;)
      {
        n = m;
        f2 = f1;
        break label165;
        if (n != i) {
          break;
        }
        n = i + -1;
        f2 = n;
        paramArrayOfFloat[i1] = f2;
      }
      n = 0;
      f2 = 0.0F;
      label165:
      if (i4 == i2) {
        paramArrayOfFloat[i3] = 0.0F;
      }
      for (;;)
      {
        n = m;
        f2 = f1;
        break;
        if (i4 != j) {
          break;
        }
        n = j + -1;
        f2 = n;
        paramArrayOfFloat[i3] = f2;
      }
      i1 += 2;
    }
    throw NotFoundException.getNotFoundInstance();
    label226:
    k = paramArrayOfFloat.length + -2;
    i1 = m;
    f3 = f1;
    while ((k >= 0) && (i1 != 0))
    {
      f3 = paramArrayOfFloat[k];
      i1 = (int)f3;
      n = k + 1;
      float f5 = paramArrayOfFloat[n];
      i3 = (int)f5;
      if ((i1 >= i2) && (i1 <= i) && (i3 >= i2) && (i3 <= j))
      {
        if (i1 == i2) {
          paramArrayOfFloat[k] = 0.0F;
        }
        for (;;)
        {
          i1 = m;
          f3 = f1;
          break label359;
          if (i1 != i) {
            break;
          }
          i1 = i + -1;
          f3 = i1;
          paramArrayOfFloat[k] = f3;
        }
        i1 = 0;
        f3 = 0.0F;
        label359:
        if (i3 == i2) {
          paramArrayOfFloat[n] = 0.0F;
        }
        for (;;)
        {
          i1 = m;
          f3 = f1;
          break;
          if (i3 != j) {
            break;
          }
          i1 = j + -1;
          f3 = i1;
          paramArrayOfFloat[n] = f3;
        }
        k += -2;
      }
      else
      {
        throw NotFoundException.getNotFoundInstance();
      }
    }
  }
  
  public static GridSampler getInstance()
  {
    return gridSampler;
  }
  
  public static void setGridSampler(GridSampler paramGridSampler)
  {
    gridSampler = paramGridSampler;
  }
  
  public abstract BitMatrix sampleGrid(BitMatrix paramBitMatrix, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, float paramFloat15, float paramFloat16);
  
  public abstract BitMatrix sampleGrid(BitMatrix paramBitMatrix, int paramInt1, int paramInt2, PerspectiveTransform paramPerspectiveTransform);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.GridSampler
 * JD-Core Version:    0.7.0.1
 */