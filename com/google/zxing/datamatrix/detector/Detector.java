package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.WhiteRectangleDetector;

public final class Detector
{
  private final BitMatrix image;
  private final WhiteRectangleDetector rectangleDetector;
  
  public Detector(BitMatrix paramBitMatrix)
  {
    this.image = paramBitMatrix;
    WhiteRectangleDetector localWhiteRectangleDetector = new com/google/zxing/common/detector/WhiteRectangleDetector;
    localWhiteRectangleDetector.<init>(paramBitMatrix);
    this.rectangleDetector = localWhiteRectangleDetector;
  }
  
  private ResultPoint correctTopRight(ResultPoint[] paramArrayOfResultPoint)
  {
    int i = 0;
    ResultPoint localResultPoint1 = paramArrayOfResultPoint[0];
    int j = 1;
    ResultPoint localResultPoint2 = paramArrayOfResultPoint[j];
    int k = 2;
    ResultPoint localResultPoint3 = paramArrayOfResultPoint[k];
    paramArrayOfResultPoint = paramArrayOfResultPoint[3];
    int m = transitionsBetween(localResultPoint1, paramArrayOfResultPoint);
    int n = (transitionsBetween(localResultPoint2, paramArrayOfResultPoint) + j) * 4;
    ResultPoint localResultPoint4 = shiftPoint(localResultPoint1, localResultPoint2, n);
    m = (m + j) * 4;
    ResultPoint localResultPoint5 = shiftPoint(localResultPoint3, localResultPoint2, m);
    int i1 = transitionsBetween(localResultPoint4, paramArrayOfResultPoint);
    int i2 = transitionsBetween(localResultPoint5, paramArrayOfResultPoint);
    ResultPoint localResultPoint6 = new com/google/zxing/ResultPoint;
    float f1 = paramArrayOfResultPoint.getX();
    float f2 = localResultPoint3.getX();
    float f3 = localResultPoint2.getX();
    f2 -= f3;
    i1 += j;
    float f4 = i1;
    f2 /= f4;
    f1 += f2;
    f2 = paramArrayOfResultPoint.getY();
    float f5 = localResultPoint3.getY();
    f3 = localResultPoint2.getY();
    f5 = (f5 - f3) / f4;
    f2 += f5;
    localResultPoint6.<init>(f1, f2);
    localResultPoint3 = new com/google/zxing/ResultPoint;
    f4 = paramArrayOfResultPoint.getX();
    f1 = localResultPoint1.getX();
    f2 = localResultPoint2.getX();
    f1 -= f2;
    i2 += j;
    float f6 = i2;
    f1 /= f6;
    f4 += f1;
    float f7 = paramArrayOfResultPoint.getY();
    float f8 = localResultPoint1.getY();
    float f9 = localResultPoint2.getY();
    f8 = (f8 - f9) / f6;
    f7 += f8;
    localResultPoint3.<init>(f4, f7);
    boolean bool = isValid(localResultPoint6);
    if (!bool)
    {
      bool = isValid(localResultPoint3);
      if (bool) {
        return localResultPoint3;
      }
      return null;
    }
    bool = isValid(localResultPoint3);
    if (!bool) {
      return localResultPoint6;
    }
    int i3 = transitionsBetween(localResultPoint4, localResultPoint6);
    i = transitionsBetween(localResultPoint5, localResultPoint6);
    i3 += i;
    i = transitionsBetween(localResultPoint4, localResultPoint3);
    j = transitionsBetween(localResultPoint5, localResultPoint3);
    i += j;
    if (i3 > i) {
      return localResultPoint6;
    }
    return localResultPoint3;
  }
  
  private ResultPoint[] detectSolid1(ResultPoint[] paramArrayOfResultPoint)
  {
    ResultPoint localResultPoint1 = paramArrayOfResultPoint[0];
    int i = 1;
    ResultPoint localResultPoint2 = paramArrayOfResultPoint[i];
    int j = 3;
    ResultPoint localResultPoint3 = paramArrayOfResultPoint[j];
    int k = 2;
    paramArrayOfResultPoint = paramArrayOfResultPoint[k];
    int m = transitionsBetween(localResultPoint1, localResultPoint2);
    int n = transitionsBetween(localResultPoint2, localResultPoint3);
    int i1 = transitionsBetween(localResultPoint3, paramArrayOfResultPoint);
    int i2 = transitionsBetween(paramArrayOfResultPoint, localResultPoint1);
    int i3 = 4;
    ResultPoint[] arrayOfResultPoint = new ResultPoint[i3];
    arrayOfResultPoint[0] = paramArrayOfResultPoint;
    arrayOfResultPoint[i] = localResultPoint1;
    arrayOfResultPoint[k] = localResultPoint2;
    arrayOfResultPoint[j] = localResultPoint3;
    if (m > n)
    {
      arrayOfResultPoint[0] = localResultPoint1;
      arrayOfResultPoint[i] = localResultPoint2;
      arrayOfResultPoint[k] = localResultPoint3;
      arrayOfResultPoint[j] = paramArrayOfResultPoint;
      m = n;
    }
    if (m > i1)
    {
      arrayOfResultPoint[0] = localResultPoint2;
      arrayOfResultPoint[i] = localResultPoint3;
      arrayOfResultPoint[k] = paramArrayOfResultPoint;
      arrayOfResultPoint[j] = localResultPoint1;
    }
    else
    {
      i1 = m;
    }
    if (i1 > i2)
    {
      arrayOfResultPoint[0] = localResultPoint3;
      arrayOfResultPoint[i] = paramArrayOfResultPoint;
      arrayOfResultPoint[k] = localResultPoint1;
      arrayOfResultPoint[j] = localResultPoint2;
    }
    return arrayOfResultPoint;
  }
  
  private ResultPoint[] detectSolid2(ResultPoint[] paramArrayOfResultPoint)
  {
    ResultPoint localResultPoint1 = paramArrayOfResultPoint[0];
    int i = 1;
    ResultPoint localResultPoint2 = paramArrayOfResultPoint[i];
    int j = 2;
    ResultPoint localResultPoint3 = paramArrayOfResultPoint[j];
    int k = 3;
    ResultPoint localResultPoint4 = paramArrayOfResultPoint[k];
    int m = (transitionsBetween(localResultPoint1, localResultPoint4) + i) * 4;
    ResultPoint localResultPoint5 = shiftPoint(localResultPoint2, localResultPoint3, m);
    ResultPoint localResultPoint6 = shiftPoint(localResultPoint3, localResultPoint2, m);
    int n = transitionsBetween(localResultPoint5, localResultPoint1);
    m = transitionsBetween(localResultPoint6, localResultPoint4);
    if (n < m)
    {
      paramArrayOfResultPoint[0] = localResultPoint1;
      paramArrayOfResultPoint[i] = localResultPoint2;
      paramArrayOfResultPoint[j] = localResultPoint3;
      paramArrayOfResultPoint[k] = localResultPoint4;
    }
    else
    {
      paramArrayOfResultPoint[0] = localResultPoint2;
      paramArrayOfResultPoint[i] = localResultPoint3;
      paramArrayOfResultPoint[j] = localResultPoint4;
      paramArrayOfResultPoint[k] = localResultPoint1;
    }
    return paramArrayOfResultPoint;
  }
  
  private boolean isValid(ResultPoint paramResultPoint)
  {
    float f1 = paramResultPoint.getX();
    boolean bool1 = f1 < 0.0F;
    if (!bool1)
    {
      f1 = paramResultPoint.getX();
      BitMatrix localBitMatrix1 = this.image;
      int j = localBitMatrix1.getWidth();
      k = 1;
      j -= k;
      float f2 = j;
      bool1 = f1 < f2;
      if (!bool1)
      {
        f1 = paramResultPoint.getY();
        bool1 = f1 < 0.0F;
        if (bool1)
        {
          float f3 = paramResultPoint.getY();
          BitMatrix localBitMatrix2 = this.image;
          int i = localBitMatrix2.getHeight() - k;
          f1 = i;
          boolean bool2 = f3 < f1;
          if (!bool2) {
            break label109;
          }
        }
      }
    }
    int k = 0;
    label109:
    return k;
  }
  
  private static ResultPoint moveAway(ResultPoint paramResultPoint, float paramFloat1, float paramFloat2)
  {
    float f1 = paramResultPoint.getX();
    float f2 = paramResultPoint.getY();
    boolean bool = f1 < paramFloat1;
    float f3 = 1.0F;
    if (bool) {
      f1 -= f3;
    } else {
      f1 += f3;
    }
    bool = f2 < paramFloat2;
    if (bool) {
      f2 -= f3;
    } else {
      f2 += f3;
    }
    ResultPoint localResultPoint = new com/google/zxing/ResultPoint;
    localResultPoint.<init>(f1, f2);
    return localResultPoint;
  }
  
  private static BitMatrix sampleGrid(BitMatrix paramBitMatrix, ResultPoint paramResultPoint1, ResultPoint paramResultPoint2, ResultPoint paramResultPoint3, ResultPoint paramResultPoint4, int paramInt1, int paramInt2)
  {
    GridSampler localGridSampler = GridSampler.getInstance();
    float f1 = paramInt1;
    float f2 = 0.5F;
    f1 -= f2;
    float f3 = paramInt2 - f2;
    f2 = f3;
    float f4 = paramResultPoint1.getX();
    float f5 = paramResultPoint1.getY();
    float f6 = paramResultPoint4.getX();
    float f7 = paramResultPoint4.getY();
    float f8 = paramResultPoint3.getX();
    float f9 = paramResultPoint3.getY();
    float f10 = paramResultPoint2.getX();
    float f11 = paramResultPoint2.getY();
    return localGridSampler.sampleGrid(paramBitMatrix, paramInt1, paramInt2, 0.5F, 0.5F, f1, 0.5F, f1, f3, 0.5F, f3, f4, f5, f6, f7, f8, f9, f10, f11);
  }
  
  private static ResultPoint shiftPoint(ResultPoint paramResultPoint1, ResultPoint paramResultPoint2, int paramInt)
  {
    float f1 = paramResultPoint2.getX();
    float f2 = paramResultPoint1.getX();
    f1 -= f2;
    float f3 = paramInt + 1;
    f1 /= f3;
    float f4 = paramResultPoint2.getY();
    f2 = paramResultPoint1.getY();
    f4 = (f4 - f2) / f3;
    ResultPoint localResultPoint = new com/google/zxing/ResultPoint;
    f2 = paramResultPoint1.getX() + f1;
    float f5 = paramResultPoint1.getY() + f4;
    localResultPoint.<init>(f2, f5);
    return localResultPoint;
  }
  
  private ResultPoint[] shiftToModuleCenter(ResultPoint[] paramArrayOfResultPoint)
  {
    Object localObject = paramArrayOfResultPoint[0];
    int i = 1;
    ResultPoint localResultPoint1 = paramArrayOfResultPoint[i];
    int j = 2;
    ResultPoint localResultPoint2 = paramArrayOfResultPoint[j];
    int k = 3;
    paramArrayOfResultPoint = paramArrayOfResultPoint[k];
    int m = transitionsBetween((ResultPoint)localObject, paramArrayOfResultPoint) + i;
    int n = transitionsBetween(localResultPoint2, paramArrayOfResultPoint) + i;
    int i1 = 4;
    n *= i1;
    ResultPoint localResultPoint3 = shiftPoint((ResultPoint)localObject, localResultPoint1, n);
    m *= i1;
    ResultPoint localResultPoint4 = shiftPoint(localResultPoint2, localResultPoint1, m);
    n = transitionsBetween(localResultPoint3, paramArrayOfResultPoint) + i;
    m = transitionsBetween(localResultPoint4, paramArrayOfResultPoint) + i;
    int i2 = n & 0x1;
    if (i2 == i) {
      n += 1;
    }
    i2 = m & 0x1;
    if (i2 == i) {
      m += 1;
    }
    float f1 = ((ResultPoint)localObject).getX();
    float f2 = localResultPoint1.getX();
    f1 += f2;
    f2 = localResultPoint2.getX();
    f1 += f2;
    f2 = paramArrayOfResultPoint.getX();
    f1 += f2;
    f2 = 4.0F;
    f1 /= f2;
    float f3 = ((ResultPoint)localObject).getY();
    float f4 = localResultPoint1.getY();
    f3 += f4;
    f4 = localResultPoint2.getY();
    f3 += f4;
    f4 = paramArrayOfResultPoint.getY();
    f3 = (f3 + f4) / f2;
    localObject = moveAway((ResultPoint)localObject, f1, f3);
    localResultPoint1 = moveAway(localResultPoint1, f1, f3);
    localResultPoint2 = moveAway(localResultPoint2, f1, f3);
    paramArrayOfResultPoint = moveAway(paramArrayOfResultPoint, f1, f3);
    m *= i1;
    ResultPoint localResultPoint5 = shiftPoint((ResultPoint)localObject, localResultPoint1, m);
    n *= i1;
    localResultPoint5 = shiftPoint(localResultPoint5, paramArrayOfResultPoint, n);
    ResultPoint localResultPoint6 = shiftPoint(shiftPoint(localResultPoint1, (ResultPoint)localObject, m), localResultPoint2, n);
    localResultPoint1 = shiftPoint(shiftPoint(localResultPoint2, paramArrayOfResultPoint, m), localResultPoint1, n);
    paramArrayOfResultPoint = shiftPoint(shiftPoint(paramArrayOfResultPoint, localResultPoint2, m), (ResultPoint)localObject, n);
    localObject = new ResultPoint[i1];
    localObject[0] = localResultPoint5;
    localObject[i] = localResultPoint6;
    localObject[j] = localResultPoint1;
    localObject[k] = paramArrayOfResultPoint;
    return localObject;
  }
  
  private int transitionsBetween(ResultPoint paramResultPoint1, ResultPoint paramResultPoint2)
  {
    Detector localDetector = this;
    float f1 = paramResultPoint1.getX();
    int i = (int)f1;
    float f2 = paramResultPoint1.getY();
    int j = (int)f2;
    float f3 = paramResultPoint2.getX();
    int k = (int)f3;
    BitMatrix localBitMatrix1 = this.image;
    int m = localBitMatrix1.getHeight();
    int n = 1;
    float f4 = 1.4E-45F;
    m -= n;
    float f5 = paramResultPoint2.getY();
    int i1 = (int)f5;
    m = Math.min(m, i1);
    i1 = Math.abs(m - j);
    int i2 = Math.abs(k - i);
    int i3 = 0;
    if (i1 > i2)
    {
      i1 = n;
      f5 = f4;
    }
    else
    {
      i1 = 0;
      f5 = 0.0F;
    }
    if (i1 != 0)
    {
      int i4 = j;
      j = i;
      i = i4;
      int i5 = m;
      m = k;
      k = i5;
    }
    i2 = Math.abs(k - i);
    int i6 = Math.abs(m - j);
    int i7 = -i2 / 2;
    int i8 = -1;
    float f6 = 0.0F / 0.0F;
    int i9;
    if (j < m) {
      i9 = n;
    } else {
      i9 = i8;
    }
    if (i >= k)
    {
      n = i8;
      f4 = f6;
    }
    BitMatrix localBitMatrix2 = localDetector.image;
    int i10;
    if (i1 != 0) {
      i10 = j;
    } else {
      i10 = i;
    }
    int i11;
    if (i1 != 0) {
      i11 = i;
    } else {
      i11 = j;
    }
    boolean bool1 = localBitMatrix2.get(i10, i11);
    while (i != k)
    {
      BitMatrix localBitMatrix3 = localDetector.image;
      if (i1 != 0) {
        i11 = j;
      } else {
        i11 = i;
      }
      int i12;
      if (i1 != 0) {
        i12 = i;
      } else {
        i12 = j;
      }
      boolean bool2 = localBitMatrix3.get(i11, i12);
      if (bool2 != bool1)
      {
        i3 += 1;
        bool1 = bool2;
      }
      i7 += i6;
      if (i7 > 0)
      {
        if (j == m) {
          break;
        }
        j += i9;
        i7 -= i2;
      }
      i += n;
    }
    return i3;
  }
  
  public DetectorResult detect()
  {
    Object localObject1 = this.rectangleDetector.detect();
    localObject1 = detectSolid1((ResultPoint[])localObject1);
    localObject1 = detectSolid2((ResultPoint[])localObject1);
    ResultPoint localResultPoint1 = correctTopRight((ResultPoint[])localObject1);
    int i = 3;
    localObject1[i] = localResultPoint1;
    if (localResultPoint1 != null)
    {
      localObject1 = shiftToModuleCenter((ResultPoint[])localObject1);
      localResultPoint1 = null;
      ResultPoint localResultPoint2 = localObject1[0];
      int j = 1;
      ResultPoint localResultPoint3 = localObject1[j];
      int k = 2;
      ResultPoint localResultPoint4 = localObject1[k];
      localObject1 = localObject1[i];
      int m = transitionsBetween(localResultPoint2, (ResultPoint)localObject1) + j;
      int n = transitionsBetween(localResultPoint4, (ResultPoint)localObject1) + j;
      int i1 = m & 0x1;
      if (i1 == j) {
        m += 1;
      }
      i1 = n & 0x1;
      if (i1 == j) {
        n += 1;
      }
      i1 = m * 4;
      int i2 = n * 6;
      if (i1 < i2)
      {
        i1 = n * 4;
        i2 = m * 6;
        if (i1 < i2)
        {
          m = Math.max(m, n);
          i3 = m;
          i4 = m;
          break label201;
        }
      }
      int i3 = m;
      int i4 = n;
      label201:
      BitMatrix localBitMatrix = this.image;
      Object localObject2 = localResultPoint2;
      Object localObject3 = localResultPoint3;
      localBitMatrix = sampleGrid(localBitMatrix, localResultPoint2, localResultPoint3, localResultPoint4, (ResultPoint)localObject1, i3, i4);
      localObject2 = new com/google/zxing/common/DetectorResult;
      localObject3 = new ResultPoint[4];
      localObject3[0] = localResultPoint2;
      localObject3[j] = localResultPoint3;
      localObject3[k] = localResultPoint4;
      localObject3[i] = localObject1;
      ((DetectorResult)localObject2).<init>(localBitMatrix, (ResultPoint[])localObject3);
      return localObject2;
    }
    throw NotFoundException.getNotFoundInstance();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.detector.Detector
 * JD-Core Version:    0.7.0.1
 */