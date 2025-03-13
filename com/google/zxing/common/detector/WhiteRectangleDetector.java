package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

public final class WhiteRectangleDetector
{
  private static final int CORR = 1;
  private static final int INIT_SIZE = 10;
  private final int downInit;
  private final int height;
  private final BitMatrix image;
  private final int leftInit;
  private final int rightInit;
  private final int upInit;
  private final int width;
  
  public WhiteRectangleDetector(BitMatrix paramBitMatrix)
  {
    this(paramBitMatrix, 10, i, j);
  }
  
  public WhiteRectangleDetector(BitMatrix paramBitMatrix, int paramInt1, int paramInt2, int paramInt3)
  {
    this.image = paramBitMatrix;
    int i = paramBitMatrix.getHeight();
    this.height = i;
    int j = paramBitMatrix.getWidth();
    this.width = j;
    paramInt1 /= 2;
    int k = paramInt2 - paramInt1;
    this.leftInit = k;
    paramInt2 += paramInt1;
    this.rightInit = paramInt2;
    int m = paramInt3 - paramInt1;
    this.upInit = m;
    paramInt3 += paramInt1;
    this.downInit = paramInt3;
    if ((m >= 0) && (k >= 0) && (paramInt3 < i) && (paramInt2 < j)) {
      return;
    }
    throw NotFoundException.getNotFoundInstance();
  }
  
  private ResultPoint[] centerEdges(ResultPoint paramResultPoint1, ResultPoint paramResultPoint2, ResultPoint paramResultPoint3, ResultPoint paramResultPoint4)
  {
    float f1 = paramResultPoint1.getX();
    float f2 = paramResultPoint1.getY();
    float f3 = paramResultPoint2.getX();
    float f4 = paramResultPoint2.getY();
    float f5 = paramResultPoint3.getX();
    float f6 = paramResultPoint3.getY();
    float f7 = paramResultPoint4.getX();
    float f8 = paramResultPoint4.getY();
    float f9 = this.width / 2.0F;
    boolean bool = f1 < f9;
    int i = 3;
    int j = 2;
    int k = 1;
    int m = 4;
    float f10 = 1.0F;
    if (bool)
    {
      arrayOfResultPoint = new ResultPoint[m];
      localResultPoint = new com/google/zxing/ResultPoint;
      f7 -= f10;
      f8 += f10;
      localResultPoint.<init>(f7, f8);
      arrayOfResultPoint[0] = localResultPoint;
      paramResultPoint4 = new com/google/zxing/ResultPoint;
      f3 += f10;
      f4 += f10;
      paramResultPoint4.<init>(f3, f4);
      arrayOfResultPoint[k] = paramResultPoint4;
      paramResultPoint2 = new com/google/zxing/ResultPoint;
      f5 -= f10;
      f6 -= f10;
      paramResultPoint2.<init>(f5, f6);
      arrayOfResultPoint[j] = paramResultPoint2;
      paramResultPoint2 = new com/google/zxing/ResultPoint;
      f1 += f10;
      f2 -= f10;
      paramResultPoint2.<init>(f1, f2);
      arrayOfResultPoint[i] = paramResultPoint2;
      return arrayOfResultPoint;
    }
    ResultPoint[] arrayOfResultPoint = new ResultPoint[m];
    ResultPoint localResultPoint = new com/google/zxing/ResultPoint;
    f7 += f10;
    f8 += f10;
    localResultPoint.<init>(f7, f8);
    arrayOfResultPoint[0] = localResultPoint;
    paramResultPoint4 = new com/google/zxing/ResultPoint;
    f3 += f10;
    f4 -= f10;
    paramResultPoint4.<init>(f3, f4);
    arrayOfResultPoint[k] = paramResultPoint4;
    paramResultPoint2 = new com/google/zxing/ResultPoint;
    f5 -= f10;
    f6 += f10;
    paramResultPoint2.<init>(f5, f6);
    arrayOfResultPoint[j] = paramResultPoint2;
    paramResultPoint2 = new com/google/zxing/ResultPoint;
    f1 -= f10;
    f2 -= f10;
    paramResultPoint2.<init>(f1, f2);
    arrayOfResultPoint[i] = paramResultPoint2;
    return arrayOfResultPoint;
  }
  
  private boolean containsBlackPoint(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    boolean bool = true;
    BitMatrix localBitMatrix;
    if (paramBoolean) {
      while (paramInt1 <= paramInt2)
      {
        localBitMatrix = this.image;
        paramBoolean = localBitMatrix.get(paramInt1, paramInt3);
        if (paramBoolean) {
          return bool;
        }
        paramInt1 += 1;
      }
    }
    while (paramInt1 <= paramInt2)
    {
      localBitMatrix = this.image;
      paramBoolean = localBitMatrix.get(paramInt3, paramInt1);
      if (paramBoolean) {
        return bool;
      }
      paramInt1 += 1;
    }
    return false;
  }
  
  private ResultPoint getBlackPointOnSegment(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = MathUtils.distance(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    int i = MathUtils.round(f1);
    paramFloat3 -= paramFloat1;
    float f2 = i;
    paramFloat3 /= f2;
    paramFloat4 = (paramFloat4 - paramFloat2) / f2;
    int j = 0;
    f2 = 0.0F;
    while (j < i)
    {
      float f3 = j;
      float f4 = f3 * paramFloat3 + paramFloat1;
      int k = MathUtils.round(f4);
      f3 = f3 * paramFloat4 + paramFloat2;
      int m = MathUtils.round(f3);
      BitMatrix localBitMatrix = this.image;
      boolean bool = localBitMatrix.get(k, m);
      if (bool)
      {
        ResultPoint localResultPoint = new com/google/zxing/ResultPoint;
        paramFloat2 = k;
        paramFloat3 = m;
        localResultPoint.<init>(paramFloat2, paramFloat3);
        return localResultPoint;
      }
      j += 1;
    }
    return null;
  }
  
  public ResultPoint[] detect()
  {
    int i = this.leftInit;
    int j = this.rightInit;
    int k = this.upInit;
    int m = this.downInit;
    int n = 0;
    int i1 = 1;
    float f1 = 1.4E-45F;
    int i3 = 0;
    ResultPoint localResultPoint1 = null;
    float f2 = 0.0F;
    int i4 = 0;
    ResultPoint localResultPoint2 = null;
    float f3 = 0.0F;
    int i6 = 0;
    float f4 = 0.0F;
    int i9 = 0;
    float f5 = 0.0F;
    int i10 = i1;
    float f6 = f1;
    float f7;
    boolean bool3;
    if (i10 != 0)
    {
      boolean bool4 = false;
      f7 = 0.0F;
      i10 = i1;
      f6 = f1;
      while ((i10 != 0) || (i3 == 0))
      {
        int i11 = this.width;
        if (j >= i11) {
          break;
        }
        boolean bool1 = containsBlackPoint(k, m, j, false);
        if (bool1)
        {
          j += 1;
          i3 = i1;
          f2 = f1;
          bool4 = i1;
          f7 = f1;
        }
        else if (i3 == 0)
        {
          j += 1;
        }
      }
      int i12 = this.width;
      if (j >= i12) {}
      for (;;)
      {
        n = i1;
        break label451;
        i12 = i1;
        f6 = f1;
        while ((i12 != 0) || (i4 == 0))
        {
          int i13 = this.height;
          if (m >= i13) {
            break;
          }
          boolean bool2 = containsBlackPoint(i, j, m, i1);
          if (bool2)
          {
            m += 1;
            i4 = i1;
            f3 = f1;
            bool4 = i1;
            f7 = f1;
          }
          else if (i4 == 0)
          {
            m += 1;
          }
        }
        int i14 = this.height;
        if (m < i14)
        {
          i14 = i1;
          f6 = f1;
          while (((i14 != 0) || (i6 == 0)) && (i >= 0))
          {
            bool3 = containsBlackPoint(k, m, i, false);
            if (bool3)
            {
              i += -1;
              i6 = i1;
              f4 = f1;
              bool4 = i1;
              f7 = f1;
            }
            else if (i6 == 0)
            {
              i += -1;
            }
          }
          if (i >= 0)
          {
            bool3 = bool4;
            f6 = f7;
            bool4 = i1;
            f7 = f1;
            while (((bool4) || (i9 == 0)) && (k >= 0))
            {
              bool4 = containsBlackPoint(i, j, k, i1);
              if (bool4)
              {
                k += -1;
                bool3 = i1;
                f6 = f1;
                i9 = i1;
                f5 = f1;
              }
              else if (i9 == 0)
              {
                k += -1;
              }
            }
            if (k >= 0) {
              break;
            }
          }
        }
      }
    }
    label451:
    if (n == 0)
    {
      n = j - i;
      bool3 = false;
      f6 = 0.0F;
      ResultPoint localResultPoint3 = null;
      i4 = i1;
      f3 = f1;
      i3 = 0;
      localResultPoint1 = null;
      f2 = 0.0F;
      int i5;
      while ((localResultPoint1 == null) && (i4 < n))
      {
        f2 = i;
        i6 = m - i4;
        f4 = i6;
        i9 = i + i4;
        f5 = i9;
        f7 = m;
        localResultPoint1 = getBlackPointOnSegment(f2, f4, f5, f7);
        i4 += 1;
      }
      if (localResultPoint1 != null)
      {
        i6 = i1;
        f4 = f1;
        i5 = 0;
        localResultPoint2 = null;
        f3 = 0.0F;
        int i16;
        float f8;
        int i7;
        while ((localResultPoint2 == null) && (i6 < n))
        {
          f3 = i;
          i9 = k + i6;
          f5 = i9;
          i16 = i + i6;
          f7 = i16;
          f8 = k;
          localResultPoint2 = getBlackPointOnSegment(f3, f5, f7, f8);
          i6 += 1;
        }
        if (localResultPoint2 != null)
        {
          i7 = i1;
          f4 = f1;
          i = 0;
          ResultPoint localResultPoint4 = null;
          float f9 = 0.0F;
          int i8;
          while ((localResultPoint4 == null) && (i7 < n))
          {
            f9 = j;
            i9 = k + i7;
            f5 = i9;
            i16 = j - i7;
            f7 = i16;
            f8 = k;
            localResultPoint4 = getBlackPointOnSegment(f9, f5, f7, f8);
            i7 += 1;
          }
          if (localResultPoint4 != null)
          {
            while ((localResultPoint3 == null) && (i1 < n))
            {
              float f10 = j;
              int i15 = m - i1;
              f6 = i15;
              i8 = j - i1;
              f4 = i8;
              f5 = m;
              localResultPoint3 = getBlackPointOnSegment(f10, f6, f4, f5);
              int i2;
              i1 += 1;
            }
            if (localResultPoint3 != null) {
              return centerEdges(localResultPoint3, localResultPoint1, localResultPoint4, localResultPoint2);
            }
            throw NotFoundException.getNotFoundInstance();
          }
          throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
      }
      throw NotFoundException.getNotFoundInstance();
    }
    throw NotFoundException.getNotFoundInstance();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.detector.WhiteRectangleDetector
 * JD-Core Version:    0.7.0.1
 */