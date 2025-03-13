package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.qrcode.decoder.Version;
import java.util.Map;

public class Detector
{
  private final BitMatrix image;
  private ResultPointCallback resultPointCallback;
  
  public Detector(BitMatrix paramBitMatrix)
  {
    this.image = paramBitMatrix;
  }
  
  private float calculateModuleSizeOneWay(ResultPoint paramResultPoint1, ResultPoint paramResultPoint2)
  {
    int i = (int)paramResultPoint1.getX();
    int j = (int)paramResultPoint1.getY();
    int k = (int)paramResultPoint2.getX();
    float f1 = paramResultPoint2.getY();
    int m = (int)f1;
    float f2 = sizeOfBlackWhiteBlackRunBothWays(i, j, k, m);
    j = (int)paramResultPoint2.getX();
    float f3 = paramResultPoint2.getY();
    int n = (int)f3;
    float f4 = paramResultPoint1.getX();
    k = (int)f4;
    int i1 = (int)paramResultPoint1.getY();
    float f5 = sizeOfBlackWhiteBlackRunBothWays(j, n, k, i1);
    boolean bool = Float.isNaN(f2);
    j = 1088421888;
    float f6 = 7.0F;
    if (bool) {
      return f5 / f6;
    }
    bool = Float.isNaN(f5);
    if (bool) {
      return f2 / f6;
    }
    return (f2 + f5) / 14.0F;
  }
  
  private static int computeDimension(ResultPoint paramResultPoint1, ResultPoint paramResultPoint2, ResultPoint paramResultPoint3, float paramFloat)
  {
    float f = ResultPoint.distance(paramResultPoint1, paramResultPoint2) / paramFloat;
    int i = MathUtils.round(f);
    int j = MathUtils.round(ResultPoint.distance(paramResultPoint1, paramResultPoint3) / paramFloat);
    i += j;
    j = 2;
    i = i / j + 7;
    int k = i & 0x3;
    if (k != 0)
    {
      if (k != j)
      {
        j = 3;
        if (k == j) {
          throw NotFoundException.getNotFoundInstance();
        }
      }
      else
      {
        i += -1;
      }
    }
    else {
      i += 1;
    }
    return i;
  }
  
  private static PerspectiveTransform createTransform(ResultPoint paramResultPoint1, ResultPoint paramResultPoint2, ResultPoint paramResultPoint3, ResultPoint paramResultPoint4, int paramInt)
  {
    float f1 = paramInt;
    float f2 = 3.5F;
    float f3 = f1 - f2;
    float f4;
    float f5;
    float f6;
    float f7;
    if (paramResultPoint4 != null)
    {
      f1 = paramResultPoint4.getX();
      f2 = paramResultPoint4.getY();
      f4 = f3 - 3.0F;
      f5 = f1;
      f6 = f2;
      f7 = f4;
    }
    else
    {
      f1 = paramResultPoint2.getX();
      f2 = paramResultPoint1.getX();
      f1 -= f2;
      f2 = paramResultPoint3.getX();
      f1 += f2;
      f2 = paramResultPoint2.getY();
      f4 = paramResultPoint1.getY();
      f2 -= f4;
      f4 = paramResultPoint3.getY();
      f2 += f4;
      f5 = f1;
      f6 = f2;
      f7 = f3;
    }
    float f8 = paramResultPoint1.getX();
    float f9 = paramResultPoint1.getY();
    float f10 = paramResultPoint2.getX();
    float f11 = paramResultPoint2.getY();
    float f12 = paramResultPoint3.getX();
    float f13 = paramResultPoint3.getY();
    return PerspectiveTransform.quadrilateralToQuadrilateral(3.5F, 3.5F, f3, 3.5F, f7, f7, 3.5F, f3, f8, f9, f10, f11, f5, f6, f12, f13);
  }
  
  private static BitMatrix sampleGrid(BitMatrix paramBitMatrix, PerspectiveTransform paramPerspectiveTransform, int paramInt)
  {
    return GridSampler.getInstance().sampleGrid(paramBitMatrix, paramInt, paramInt, paramPerspectiveTransform);
  }
  
  private float sizeOfBlackWhiteBlackRun(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = Math.abs(paramInt4 - paramInt2);
    int j = Math.abs(paramInt3 - paramInt1);
    int k = 1;
    float f1 = 1.4E-45F;
    if (i > j)
    {
      i = k;
      f2 = f1;
    }
    else
    {
      i = 0;
      f2 = 0.0F;
    }
    int m;
    int n;
    int i1;
    if (i != 0)
    {
      m = paramInt1;
      j = paramInt2;
      n = paramInt3;
      i1 = paramInt4;
    }
    else
    {
      j = paramInt1;
      m = paramInt2;
      i1 = paramInt3;
      n = paramInt4;
    }
    int i2 = Math.abs(i1 - j);
    int i3 = Math.abs(n - m);
    int i4 = -i2;
    int i5 = 2;
    float f3 = 2.802597E-045F;
    i4 /= i5;
    int i6 = -1;
    int i7;
    if (j < i1) {
      i7 = k;
    } else {
      i7 = i6;
    }
    if (m < n) {
      i6 = k;
    }
    i1 += i7;
    int i8 = j;
    int i9 = m;
    int i10 = 0;
    while (i8 != i1)
    {
      int i11;
      if (i != 0) {
        i11 = i9;
      } else {
        i11 = i8;
      }
      if (i != 0) {
        i5 = i8;
      } else {
        i5 = i9;
      }
      int i13;
      float f4;
      if (i10 == k)
      {
        i13 = i;
        f4 = f2;
        i = k;
        f2 = f1;
        paramInt2 = i1;
        localDetector = this;
      }
      else
      {
        localDetector = this;
        i13 = i;
        f4 = f2;
        paramInt2 = i1;
        i = 0;
        f2 = 0.0F;
      }
      BitMatrix localBitMatrix = localDetector.image;
      int i12 = localBitMatrix.get(i11, i5);
      if (i == i12)
      {
        i = 2;
        f2 = 2.802597E-045F;
        if (i10 == i) {
          return MathUtils.distance(i8, i9, j, m);
        }
        i10 += 1;
      }
      i4 += i3;
      if (i4 > 0)
      {
        if (i9 == n)
        {
          i = 2;
          f2 = 2.802597E-045F;
          break label411;
        }
        i9 += i6;
        i4 -= i2;
      }
      i8 += i7;
      i1 = paramInt2;
      i = i13;
      f2 = f4;
      k = 1;
      f1 = 1.4E-45F;
      i5 = 2;
      f3 = 2.802597E-045F;
    }
    Detector localDetector = this;
    paramInt2 = i1;
    i = i5;
    float f2 = f3;
    label411:
    if (i10 == i)
    {
      i1 = paramInt2;
      return MathUtils.distance(paramInt2, n, j, m);
    }
    return 0.0F / 0.0F;
  }
  
  private float sizeOfBlackWhiteBlackRunBothWays(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = sizeOfBlackWhiteBlackRun(paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt3 -= paramInt1;
    paramInt3 = paramInt1 - paramInt3;
    int i = 0;
    float f2 = 0.0F;
    BitMatrix localBitMatrix1 = null;
    int j = 1065353216;
    float f3 = 1.0F;
    float f4;
    BitMatrix localBitMatrix2;
    if (paramInt3 < 0)
    {
      f4 = paramInt1;
      f5 = paramInt1 - paramInt3;
      f4 /= f5;
      paramInt3 = 0;
      localBitMatrix2 = null;
      f5 = 0.0F;
    }
    else
    {
      BitMatrix localBitMatrix3 = this.image;
      int k = localBitMatrix3.getWidth();
      if (paramInt3 >= k)
      {
        localBitMatrix3 = this.image;
        k = localBitMatrix3.getWidth() + -1 - paramInt1;
        f4 = k;
        f5 = paramInt3 - paramInt1;
        f4 /= f5;
        localBitMatrix2 = this.image;
        paramInt3 = localBitMatrix2.getWidth() + -1;
      }
      else
      {
        k = j;
        f4 = f3;
      }
    }
    float f6 = paramInt2;
    float f7 = (paramInt4 - paramInt2) * f4;
    f7 = f6 - f7;
    paramInt4 = (int)f7;
    if (paramInt4 < 0)
    {
      paramInt4 = paramInt2 - paramInt4;
      f7 = paramInt4;
      f6 /= f7;
    }
    else
    {
      localBitMatrix1 = this.image;
      i = localBitMatrix1.getHeight();
      if (paramInt4 >= i)
      {
        localBitMatrix1 = this.image;
        f2 = localBitMatrix1.getHeight() + -1 - paramInt2;
        f7 = paramInt4 - paramInt2;
        f6 = f2 / f7;
        BitMatrix localBitMatrix4 = this.image;
        paramInt4 = localBitMatrix4.getHeight();
        i = paramInt4 + -1;
      }
      else
      {
        i = paramInt4;
        f6 = f3;
      }
    }
    f7 = paramInt1;
    float f5 = (paramInt3 - paramInt1) * f6;
    paramInt3 = (int)(f7 + f5);
    float f8 = sizeOfBlackWhiteBlackRun(paramInt1, paramInt2, paramInt3, i);
    return f1 + f8 - f3;
  }
  
  public final float calculateModuleSize(ResultPoint paramResultPoint1, ResultPoint paramResultPoint2, ResultPoint paramResultPoint3)
  {
    float f1 = calculateModuleSizeOneWay(paramResultPoint1, paramResultPoint2);
    float f2 = calculateModuleSizeOneWay(paramResultPoint1, paramResultPoint3);
    return (f1 + f2) / 2.0F;
  }
  
  public DetectorResult detect()
  {
    return detect(null);
  }
  
  public final DetectorResult detect(Map paramMap)
  {
    if (paramMap == null)
    {
      localObject = null;
    }
    else
    {
      localObject = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
      localObject = (ResultPointCallback)paramMap.get(localObject);
    }
    this.resultPointCallback = ((ResultPointCallback)localObject);
    Object localObject = new com/google/zxing/qrcode/detector/FinderPatternFinder;
    BitMatrix localBitMatrix = this.image;
    ResultPointCallback localResultPointCallback = this.resultPointCallback;
    ((FinderPatternFinder)localObject).<init>(localBitMatrix, localResultPointCallback);
    paramMap = ((FinderPatternFinder)localObject).find(paramMap);
    return processFinderPatternInfo(paramMap);
  }
  
  public final AlignmentPattern findAlignmentInRegion(float paramFloat1, int paramInt1, int paramInt2, float paramFloat2)
  {
    paramFloat2 *= paramFloat1;
    int i = (int)paramFloat2;
    int j = paramInt1 - i;
    int k = Math.max(0, j);
    BitMatrix localBitMatrix1 = this.image;
    j = localBitMatrix1.getWidth() + -1;
    paramInt1 += i;
    int m = Math.min(j, paramInt1) - k;
    float f1 = m;
    j = 1077936128;
    float f2 = 3.0F * paramFloat1;
    paramInt1 = f1 < f2;
    if (paramInt1 >= 0)
    {
      paramInt1 = paramInt2 - i;
      int n = Math.max(0, paramInt1);
      Object localObject = this.image;
      paramInt1 = ((BitMatrix)localObject).getHeight() + -1;
      paramInt2 += i;
      int i1 = Math.min(paramInt1, paramInt2) - n;
      f1 = i1;
      paramInt1 = f1 < f2;
      if (paramInt1 >= 0)
      {
        localObject = new com/google/zxing/qrcode/detector/AlignmentPatternFinder;
        BitMatrix localBitMatrix2 = this.image;
        ResultPointCallback localResultPointCallback = this.resultPointCallback;
        ((AlignmentPatternFinder)localObject).<init>(localBitMatrix2, k, n, m, i1, paramFloat1, localResultPointCallback);
        return ((AlignmentPatternFinder)localObject).find();
      }
      throw NotFoundException.getNotFoundInstance();
    }
    throw NotFoundException.getNotFoundInstance();
  }
  
  public final BitMatrix getImage()
  {
    return this.image;
  }
  
  public final ResultPointCallback getResultPointCallback()
  {
    return this.resultPointCallback;
  }
  
  public final DetectorResult processFinderPatternInfo(FinderPatternInfo paramFinderPatternInfo)
  {
    FinderPattern localFinderPattern1 = paramFinderPatternInfo.getTopLeft();
    FinderPattern localFinderPattern2 = paramFinderPatternInfo.getTopRight();
    paramFinderPatternInfo = paramFinderPatternInfo.getBottomLeft();
    float f1 = calculateModuleSize(localFinderPattern1, localFinderPattern2, paramFinderPatternInfo);
    int i = 1065353216;
    float f2 = 1.0F;
    boolean bool = f1 < f2;
    if (!bool)
    {
      int j = computeDimension(localFinderPattern1, localFinderPattern2, paramFinderPatternInfo, f1);
      Object localObject1 = Version.getProvisionalVersionForDimension(j);
      int k = ((Version)localObject1).getDimensionForVersion() + -7;
      localObject1 = ((Version)localObject1).getAlignmentPatternCenters();
      int m = localObject1.length;
      int n = 4;
      float f3 = 5.605194E-045F;
      if (m > 0)
      {
        f4 = localFinderPattern2.getX();
        f5 = localFinderPattern1.getX();
        f4 -= f5;
        f5 = paramFinderPatternInfo.getX();
        f4 += f5;
        f5 = localFinderPattern2.getY();
        float f6 = localFinderPattern1.getY();
        f5 -= f6;
        f6 = paramFinderPatternInfo.getY();
        f5 += f6;
        f7 = k;
        f6 = 3.0F / f7;
        f2 -= f6;
        f7 = localFinderPattern1.getX();
        f6 = localFinderPattern1.getX();
        f4 = (f4 - f6) * f2;
        m = (int)(f7 + f4);
        f7 = localFinderPattern1.getY();
        f6 = localFinderPattern1.getY();
        f5 -= f6;
        f2 *= f5;
        i = (int)(f7 + f2);
        k = n;
        f7 = f3;
        for (;;)
        {
          i1 = 16;
          f5 = 2.242078E-044F;
          if (k > i1) {
            break;
          }
          f5 = k;
          try
          {
            localObject2 = findAlignmentInRegion(f1, m, i, f5);
          }
          catch (NotFoundException localNotFoundException)
          {
            k <<= 1;
          }
        }
      }
      f1 = 0.0F;
      Object localObject2 = null;
      Object localObject3 = createTransform(localFinderPattern1, localFinderPattern2, paramFinderPatternInfo, (ResultPoint)localObject2, j);
      localObject1 = this.image;
      localObject3 = sampleGrid((BitMatrix)localObject1, (PerspectiveTransform)localObject3, j);
      j = 3;
      m = 2;
      float f4 = 2.802597E-045F;
      k = 0;
      float f7 = 0.0F;
      int i1 = 1;
      float f5 = 1.4E-45F;
      if (localObject2 == null)
      {
        localObject2 = new ResultPoint[j];
        localObject2[0] = paramFinderPatternInfo;
        localObject2[i1] = localFinderPattern1;
        localObject2[m] = localFinderPattern2;
      }
      else
      {
        ResultPoint[] arrayOfResultPoint = new ResultPoint[n];
        arrayOfResultPoint[0] = paramFinderPatternInfo;
        arrayOfResultPoint[i1] = localFinderPattern1;
        arrayOfResultPoint[m] = localFinderPattern2;
        arrayOfResultPoint[j] = localObject2;
        localObject2 = arrayOfResultPoint;
      }
      paramFinderPatternInfo = new com/google/zxing/common/DetectorResult;
      paramFinderPatternInfo.<init>((BitMatrix)localObject3, (ResultPoint[])localObject2);
      return paramFinderPatternInfo;
    }
    throw NotFoundException.getNotFoundInstance();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.detector.Detector
 * JD-Core Version:    0.7.0.1
 */