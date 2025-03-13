package com.google.zxing.aztec.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

public final class Detector
{
  private static final int[] EXPECTED_CORNER_BITS = tmp20_4;
  private boolean compact;
  private final BitMatrix image;
  private int nbCenterLayers;
  private int nbDataBlocks;
  private int nbLayers;
  private int shift;
  
  static
  {
    int[] tmp3_1 = new int[4];
    int[] tmp4_3 = tmp3_1;
    int[] tmp4_3 = tmp3_1;
    tmp4_3[0] = 3808;
    tmp4_3[1] = 476;
    tmp4_3[2] = 2107;
    int[] tmp20_4 = tmp4_3;
    tmp20_4[3] = 1799;
  }
  
  public Detector(BitMatrix paramBitMatrix)
  {
    this.image = paramBitMatrix;
  }
  
  private static float distance(ResultPoint paramResultPoint1, ResultPoint paramResultPoint2)
  {
    float f1 = paramResultPoint1.getX();
    float f2 = paramResultPoint1.getY();
    float f3 = paramResultPoint2.getX();
    float f4 = paramResultPoint2.getY();
    return MathUtils.distance(f1, f2, f3, f4);
  }
  
  private static float distance(Detector.Point paramPoint1, Detector.Point paramPoint2)
  {
    int i = paramPoint1.getX();
    int j = paramPoint1.getY();
    int k = paramPoint2.getX();
    int m = paramPoint2.getY();
    return MathUtils.distance(i, j, k, m);
  }
  
  private static ResultPoint[] expandSquare(ResultPoint[] paramArrayOfResultPoint, int paramInt1, int paramInt2)
  {
    float f1 = paramInt2;
    float f2 = paramInt1;
    float f3 = 2.0F;
    f2 *= f3;
    f1 /= f2;
    float f4 = paramArrayOfResultPoint[0].getX();
    int i = 2;
    float f5 = paramArrayOfResultPoint[i].getX();
    f4 -= f5;
    f5 = paramArrayOfResultPoint[0].getY();
    float f6 = paramArrayOfResultPoint[i].getY();
    f5 -= f6;
    f6 = paramArrayOfResultPoint[0].getX();
    float f7 = paramArrayOfResultPoint[i].getX();
    f6 = (f6 + f7) / f3;
    f7 = paramArrayOfResultPoint[0].getY();
    float f8 = paramArrayOfResultPoint[i].getY();
    f7 = (f7 + f8) / f3;
    ResultPoint localResultPoint1 = new com/google/zxing/ResultPoint;
    f4 *= f1;
    float f9 = f6 + f4;
    f5 *= f1;
    float f10 = f7 + f5;
    localResultPoint1.<init>(f9, f10);
    ResultPoint localResultPoint2 = new com/google/zxing/ResultPoint;
    f6 -= f4;
    f7 -= f5;
    localResultPoint2.<init>(f6, f7);
    int j = 1;
    f5 = paramArrayOfResultPoint[j].getX();
    int k = 3;
    f7 = paramArrayOfResultPoint[k].getX();
    f5 -= f7;
    f7 = paramArrayOfResultPoint[j].getY();
    f10 = paramArrayOfResultPoint[k].getY();
    f7 -= f10;
    f10 = paramArrayOfResultPoint[j].getX();
    float f11 = paramArrayOfResultPoint[k].getX();
    f10 = (f10 + f11) / f3;
    f11 = paramArrayOfResultPoint[j].getY();
    float f12 = paramArrayOfResultPoint[k].getY();
    f11 = (f11 + f12) / f3;
    paramArrayOfResultPoint = new com/google/zxing/ResultPoint;
    f5 *= f1;
    f3 = f10 + f5;
    f1 *= f7;
    f7 = f11 + f1;
    paramArrayOfResultPoint.<init>(f3, f7);
    ResultPoint localResultPoint3 = new com/google/zxing/ResultPoint;
    f10 -= f5;
    f11 -= f1;
    localResultPoint3.<init>(f10, f11);
    ResultPoint[] arrayOfResultPoint = new ResultPoint[4];
    arrayOfResultPoint[0] = localResultPoint1;
    arrayOfResultPoint[j] = paramArrayOfResultPoint;
    arrayOfResultPoint[i] = localResultPoint2;
    arrayOfResultPoint[k] = localResultPoint3;
    return arrayOfResultPoint;
  }
  
  private void extractParameters(ResultPoint[] paramArrayOfResultPoint)
  {
    int i = 0;
    ResultPoint localResultPoint1 = paramArrayOfResultPoint[0];
    int k = isValid(localResultPoint1);
    if (k != 0)
    {
      k = 1;
      ResultPoint localResultPoint2 = paramArrayOfResultPoint[k];
      boolean bool2 = isValid(localResultPoint2);
      if (bool2)
      {
        int m = 2;
        ResultPoint localResultPoint3 = paramArrayOfResultPoint[m];
        boolean bool3 = isValid(localResultPoint3);
        if (bool3)
        {
          int n = 3;
          ResultPoint localResultPoint4 = paramArrayOfResultPoint[n];
          boolean bool4 = isValid(localResultPoint4);
          if (bool4)
          {
            int i1 = this.nbCenterLayers * m;
            ResultPoint localResultPoint5 = paramArrayOfResultPoint[0];
            ResultPoint localResultPoint6 = paramArrayOfResultPoint[k];
            int i2 = sampleLine(localResultPoint5, localResultPoint6, i1);
            localResultPoint6 = paramArrayOfResultPoint[k];
            ResultPoint localResultPoint7 = paramArrayOfResultPoint[m];
            int i4 = sampleLine(localResultPoint6, localResultPoint7, i1);
            localResultPoint2 = paramArrayOfResultPoint[m];
            localResultPoint7 = paramArrayOfResultPoint[n];
            m = sampleLine(localResultPoint2, localResultPoint7, i1);
            localResultPoint3 = paramArrayOfResultPoint[n];
            paramArrayOfResultPoint = paramArrayOfResultPoint[0];
            int i5 = sampleLine(localResultPoint3, paramArrayOfResultPoint, i1);
            int[] tmp188_186 = new int[4];
            int[] tmp189_188 = tmp188_186;
            int[] tmp189_188 = tmp188_186;
            tmp189_188[0] = i2;
            tmp189_188[1] = i4;
            tmp189_188[2] = m;
            int[] tmp202_189 = tmp189_188;
            tmp202_189[3] = i5;
            paramArrayOfResultPoint = tmp202_189;
            m = getRotation(paramArrayOfResultPoint, i1);
            this.shift = m;
            long l1 = 0L;
            for (;;)
            {
              i1 = 4;
              if (i >= i1) {
                break;
              }
              i2 = (this.shift + i) % i1;
              i1 = paramArrayOfResultPoint[i2];
              boolean bool5 = this.compact;
              int i3;
              long l2;
              if (bool5)
              {
                i3 = 7;
                l1 <<= i3;
                i1 = i1 >> 1 & 0x7F;
                l2 = i1;
              }
              else
              {
                l1 <<= 10;
                i3 = i1 >> 2 & 0x3E0;
                i1 = i1 >> 1 & 0x1F;
                i3 += i1;
                l2 = i3;
              }
              l1 += l2;
              i += 1;
            }
            boolean bool6 = this.compact;
            int i6 = getCorrectedParameterData(l1, bool6);
            boolean bool1 = this.compact;
            int j;
            if (bool1)
            {
              j = (i6 >> 6) + k;
              this.nbLayers = j;
              i6 &= 0x3F;
            }
            else
            {
              j = (i6 >> 11) + k;
              this.nbLayers = j;
              i6 &= 0x7FF;
            }
            int i7;
            i6 += k;
            this.nbDataBlocks = i7;
            return;
          }
        }
      }
    }
    throw NotFoundException.getNotFoundInstance();
  }
  
  private ResultPoint[] getBullsEyeCorners(Detector.Point paramPoint)
  {
    int i = 1;
    this.nbCenterLayers = i;
    Object localObject1 = paramPoint;
    Object localObject2 = paramPoint;
    Object localObject3 = paramPoint;
    int j = i;
    int i1;
    for (;;)
    {
      m = this.nbCenterLayers;
      n = 9;
      i1 = 2;
      if (m >= n) {
        break;
      }
      m = -1;
      f1 = 0.0F / 0.0F;
      localPoint1 = getFirstDifferent(paramPoint, j, i, m);
      Detector.Point localPoint2 = getFirstDifferent((Detector.Point)localObject1, j, i, i);
      Detector.Point localPoint3 = getFirstDifferent((Detector.Point)localObject2, j, m, i);
      Detector.Point localPoint4 = getFirstDifferent((Detector.Point)localObject3, j, m, m);
      int i2 = this.nbCenterLayers;
      if (i2 > i1)
      {
        float f2 = distance(localPoint4, localPoint1);
        int i3 = this.nbCenterLayers;
        float f3 = i3;
        f2 *= f3;
        f3 = distance((Detector.Point)localObject3, paramPoint);
        float f4 = this.nbCenterLayers + i1;
        f3 *= f4;
        f2 /= f3;
        double d1 = f2;
        double d2 = 0.75D;
        boolean bool2 = d1 < d2;
        if (bool2) {
          break;
        }
        d2 = 1.25D;
        boolean bool1 = d1 < d2;
        if (bool1) {
          break;
        }
        bool1 = isWhiteOrBlackRectangle(localPoint1, localPoint2, localPoint3, localPoint4);
        if (!bool1) {
          break;
        }
      }
      j ^= 0x1;
      i4 = this.nbCenterLayers + i;
      this.nbCenterLayers = i4;
      localObject3 = localPoint4;
      paramPoint = localPoint1;
      localObject1 = localPoint2;
      localObject2 = localPoint3;
    }
    int k = this.nbCenterLayers;
    int m = 5;
    float f1 = 7.006492E-045F;
    if (k != m)
    {
      n = 7;
      if (k != n) {
        throw NotFoundException.getNotFoundInstance();
      }
    }
    int n = 0;
    Detector.Point localPoint1 = null;
    if (k == m)
    {
      k = i;
    }
    else
    {
      k = 0;
      localResultPoint = null;
    }
    this.compact = k;
    ResultPoint localResultPoint = new com/google/zxing/ResultPoint;
    f1 = paramPoint.getX();
    float f5 = 0.5F;
    f1 += f5;
    float f6 = paramPoint.getY() - f5;
    localResultPoint.<init>(f1, f6);
    paramPoint = new com/google/zxing/ResultPoint;
    f1 = ((Detector.Point)localObject1).getX() + f5;
    float f7 = ((Detector.Point)localObject1).getY() + f5;
    paramPoint.<init>(f1, f7);
    localObject1 = new com/google/zxing/ResultPoint;
    f1 = ((Detector.Point)localObject2).getX() - f5;
    float f8 = ((Detector.Point)localObject2).getY() + f5;
    ((ResultPoint)localObject1).<init>(f1, f8);
    localObject2 = new com/google/zxing/ResultPoint;
    f1 = ((Detector.Point)localObject3).getX() - f5;
    float f9 = ((Detector.Point)localObject3).getY() - f5;
    ((ResultPoint)localObject2).<init>(f1, f9);
    localObject3 = new ResultPoint[4];
    localObject3[0] = localResultPoint;
    localObject3[i] = paramPoint;
    localObject3[i1] = localObject1;
    int i4 = 3;
    localObject3[i4] = localObject2;
    i = this.nbCenterLayers;
    int i5 = i * 2 - i4;
    i *= i1;
    return expandSquare((ResultPoint[])localObject3, i5, i);
  }
  
  private int getColor(Detector.Point paramPoint1, Detector.Point paramPoint2)
  {
    float f1 = distance(paramPoint1, paramPoint2);
    float f2 = 0.0F;
    boolean bool1 = f1 < 0.0F;
    boolean bool3 = false;
    if (!bool1) {
      return 0;
    }
    int i = paramPoint2.getX();
    int j = paramPoint1.getX();
    i -= j;
    f2 = i / f1;
    int k = paramPoint2.getY();
    j = paramPoint1.getY();
    k -= j;
    float f3 = k / f1;
    j = paramPoint1.getX();
    float f4 = j;
    int m = paramPoint1.getY();
    float f5 = m;
    BitMatrix localBitMatrix1 = this.image;
    int n = paramPoint1.getX();
    int i1 = paramPoint1.getY();
    boolean bool5 = localBitMatrix1.get(n, i1);
    double d = Math.floor(f1);
    int i2 = (int)d;
    n = 0;
    int i3 = 0;
    while (n < i2)
    {
      BitMatrix localBitMatrix2 = this.image;
      int i4 = MathUtils.round(f4);
      int i5 = MathUtils.round(f5);
      boolean bool6 = localBitMatrix2.get(i4, i5);
      if (bool6 != bool5) {
        i3 += 1;
      }
      f4 += f2;
      f5 += f3;
      n += 1;
    }
    f3 = i3 / f1;
    int i6 = 1036831949;
    f1 = 0.1F;
    boolean bool2 = f3 < f1;
    if (bool2)
    {
      f2 = 0.9F;
      bool2 = f3 < f2;
      if (bool2) {
        return 0;
      }
    }
    boolean bool4 = f3 < f1;
    i6 = 1;
    f1 = 1.4E-45F;
    if (!bool4) {
      bool3 = i6;
    }
    if (bool3 != bool5)
    {
      i6 = -1;
      f1 = 0.0F / 0.0F;
    }
    return i6;
  }
  
  private static int getCorrectedParameterData(long paramLong, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramBoolean)
    {
      paramBoolean = true;
      bool2 = true;
    }
    else
    {
      paramBoolean = true;
      bool2 = bool1;
    }
    int i = paramBoolean - bool2;
    int[] arrayOfInt = new int[paramBoolean];
    paramBoolean += true;
    while (!paramBoolean)
    {
      int j = (int)paramLong & 0xF;
      arrayOfInt[paramBoolean] = j;
      paramLong >>= bool1;
      paramBoolean += true;
    }
    try
    {
      ReedSolomonDecoder localReedSolomonDecoder = new com/google/zxing/common/reedsolomon/ReedSolomonDecoder;
      GenericGF localGenericGF = GenericGF.AZTEC_PARAM;
      localReedSolomonDecoder.<init>(localGenericGF);
      localReedSolomonDecoder.decode(arrayOfInt, i);
      boolean bool3 = false;
      localReedSolomonDecoder = null;
      boolean bool4 = false;
      localGenericGF = null;
      int m;
      while (bool3 < bool2)
      {
        bool4 <<= true;
        paramBoolean = arrayOfInt[bool3];
        bool4 += paramBoolean;
        int k;
        bool3 += true;
      }
      return m;
    }
    catch (ReedSolomonException localReedSolomonException)
    {
      throw NotFoundException.getNotFoundInstance();
    }
  }
  
  private int getDimension()
  {
    boolean bool = this.compact;
    if (bool) {
      return this.nbLayers * 4 + 11;
    }
    int i = this.nbLayers;
    int j = i * 4;
    i = (i * 2 + 6) / 15 * 2;
    return j + i + 15;
  }
  
  private Detector.Point getFirstDifferent(Detector.Point paramPoint, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    int i = paramPoint.getX() + paramInt1;
    int j = paramPoint.getY();
    boolean bool;
    BitMatrix localBitMatrix1;
    for (;;)
    {
      j += paramInt2;
      bool = isValid(i, j);
      if (!bool) {
        break;
      }
      localBitMatrix1 = this.image;
      bool = localBitMatrix1.get(i, j);
      if (bool != paramBoolean) {
        break;
      }
      i += paramInt1;
    }
    i -= paramInt1;
    j -= paramInt2;
    for (;;)
    {
      bool = isValid(i, j);
      if (!bool) {
        break;
      }
      localBitMatrix1 = this.image;
      bool = localBitMatrix1.get(i, j);
      if (bool != paramBoolean) {
        break;
      }
      i += paramInt1;
    }
    i -= paramInt1;
    for (;;)
    {
      paramInt1 = isValid(i, j);
      if (paramInt1 == 0) {
        break;
      }
      BitMatrix localBitMatrix2 = this.image;
      paramInt1 = localBitMatrix2.get(i, j);
      if (paramInt1 != paramBoolean) {
        break;
      }
      j += paramInt2;
    }
    j -= paramInt2;
    Detector.Point localPoint = new com/google/zxing/aztec/detector/Detector$Point;
    localPoint.<init>(i, j);
    return localPoint;
  }
  
  private Detector.Point getMatrixCenter()
  {
    int i = 3;
    float f1 = 4.203895E-045F;
    int j = 2;
    int k = -1;
    float f2 = 0.0F / 0.0F;
    int m = 1;
    float f3 = 1.4E-45F;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int i1;
    int i2;
    try
    {
      localObject1 = new com/google/zxing/common/detector/WhiteRectangleDetector;
      localObject2 = this.image;
      ((WhiteRectangleDetector)localObject1).<init>((BitMatrix)localObject2);
      localObject1 = ((WhiteRectangleDetector)localObject1).detect();
      localObject2 = localObject1[0];
      localObject3 = localObject1[m];
      localObject4 = localObject1[j];
      localObject1 = localObject1[i];
    }
    catch (NotFoundException localNotFoundException1)
    {
      n = this.image.getWidth() / j;
      i1 = this.image.getHeight() / j;
      localObject3 = new com/google/zxing/aztec/detector/Detector$Point;
      i2 = n + 7;
      i3 = i1 + -7;
      ((Detector.Point)localObject3).<init>(i2, i3);
      localObject3 = getFirstDifferent((Detector.Point)localObject3, false, m, k).toResultPoint();
      Detector.Point localPoint = new com/google/zxing/aztec/detector/Detector$Point;
      i1 += 7;
      localPoint.<init>(i2, i1);
      localObject4 = getFirstDifferent(localPoint, false, m, m).toResultPoint();
      localPoint = new com/google/zxing/aztec/detector/Detector$Point;
      n += -7;
      localPoint.<init>(n, i1);
      localObject2 = getFirstDifferent(localPoint, false, k, m).toResultPoint();
      localPoint = new com/google/zxing/aztec/detector/Detector$Point;
      localPoint.<init>(n, i3);
      localObject1 = getFirstDifferent(localPoint, false, k, k).toResultPoint();
      Object localObject5 = localObject4;
      localObject4 = localObject2;
      localObject2 = localObject3;
      localObject3 = localObject5;
    }
    float f4 = ((ResultPoint)localObject2).getX();
    float f5 = ((ResultPoint)localObject1).getX();
    f4 += f5;
    f5 = ((ResultPoint)localObject3).getX();
    f4 += f5;
    f5 = ((ResultPoint)localObject4).getX();
    f4 += f5;
    f5 = 4.0F;
    f4 /= f5;
    int i3 = MathUtils.round(f4);
    float f6 = ((ResultPoint)localObject2).getY();
    float f7 = ((ResultPoint)localObject1).getY();
    f6 += f7;
    f7 = ((ResultPoint)localObject3).getY();
    f6 += f7;
    f7 = ((ResultPoint)localObject4).getY();
    f6 = (f6 + f7) / f5;
    int n = MathUtils.round(f6);
    Object localObject7;
    try
    {
      localObject2 = new com/google/zxing/common/detector/WhiteRectangleDetector;
      localObject3 = this.image;
      i2 = 15;
      ((WhiteRectangleDetector)localObject2).<init>((BitMatrix)localObject3, i2, i3, n);
      localObject2 = ((WhiteRectangleDetector)localObject2).detect();
      localObject3 = localObject2[0];
      localObject4 = localObject2[m];
      localObject6 = localObject2[j];
      localObject7 = localObject2[i];
    }
    catch (NotFoundException localNotFoundException2)
    {
      localObject7 = new com/google/zxing/aztec/detector/Detector$Point;
      j = i3 + 7;
      i1 = n + -7;
      ((Detector.Point)localObject7).<init>(j, i1);
      localObject3 = getFirstDifferent((Detector.Point)localObject7, false, m, k).toResultPoint();
      localObject7 = new com/google/zxing/aztec/detector/Detector$Point;
      n += 7;
      ((Detector.Point)localObject7).<init>(j, n);
      localObject4 = getFirstDifferent((Detector.Point)localObject7, false, m, m).toResultPoint();
      localObject7 = new com/google/zxing/aztec/detector/Detector$Point;
      i3 += -7;
      ((Detector.Point)localObject7).<init>(i3, n);
      localObject6 = getFirstDifferent((Detector.Point)localObject7, false, k, m).toResultPoint();
      localObject7 = new com/google/zxing/aztec/detector/Detector$Point;
      ((Detector.Point)localObject7).<init>(i3, i1);
      localObject7 = getFirstDifferent((Detector.Point)localObject7, false, k, k).toResultPoint();
    }
    f2 = ((ResultPoint)localObject3).getX();
    f3 = ((ResultPoint)localObject7).getX();
    f2 += f3;
    f3 = ((ResultPoint)localObject4).getX();
    f2 += f3;
    f3 = ((ResultPoint)localObject6).getX();
    k = MathUtils.round((f2 + f3) / f5);
    f3 = ((ResultPoint)localObject3).getY();
    f1 = ((ResultPoint)localObject7).getY();
    f3 += f1;
    f1 = ((ResultPoint)localObject4).getY();
    f3 += f1;
    f1 = ((ResultPoint)localObject6).getY();
    i = MathUtils.round((f3 + f1) / f5);
    Object localObject6 = new com/google/zxing/aztec/detector/Detector$Point;
    ((Detector.Point)localObject6).<init>(k, i);
    return localObject6;
  }
  
  private ResultPoint[] getMatrixCornerPoints(ResultPoint[] paramArrayOfResultPoint)
  {
    int i = this.nbCenterLayers * 2;
    int j = getDimension();
    return expandSquare(paramArrayOfResultPoint, i, j);
  }
  
  private static int getRotation(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt.length;
    int j = 0;
    int k = 0;
    int m = 0;
    int n;
    for (;;)
    {
      n = 2;
      if (k >= i) {
        break;
      }
      int i1 = paramArrayOfInt[k];
      n = paramInt + -2;
      n = i1 >> n << 1;
      i1 &= 0x1;
      n += i1;
      m = (m << 3) + n;
      k += 1;
    }
    int i2 = (m & 0x1) << 11;
    paramInt = m >> 1;
    i2 += paramInt;
    for (;;)
    {
      paramInt = 4;
      if (j >= paramInt) {
        break;
      }
      int[] arrayOfInt = EXPECTED_CORNER_BITS;
      paramInt = Integer.bitCount(arrayOfInt[j] ^ i2);
      if (paramInt <= n) {
        return j;
      }
      j += 1;
    }
    throw NotFoundException.getNotFoundInstance();
  }
  
  private boolean isValid(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      BitMatrix localBitMatrix1 = this.image;
      int i = localBitMatrix1.getWidth();
      if ((paramInt1 < i) && (paramInt2 >= 0))
      {
        localBitMatrix2 = this.image;
        paramInt1 = localBitMatrix2.getHeight();
        if (paramInt2 < paramInt1) {
          return 1;
        }
      }
    }
    paramInt1 = 0;
    BitMatrix localBitMatrix2 = null;
    return paramInt1;
  }
  
  private boolean isValid(ResultPoint paramResultPoint)
  {
    int i = MathUtils.round(paramResultPoint.getX());
    int j = MathUtils.round(paramResultPoint.getY());
    return isValid(i, j);
  }
  
  private boolean isWhiteOrBlackRectangle(Detector.Point paramPoint1, Detector.Point paramPoint2, Detector.Point paramPoint3, Detector.Point paramPoint4)
  {
    Detector.Point localPoint = new com/google/zxing/aztec/detector/Detector$Point;
    int i = paramPoint1.getX() + -3;
    boolean bool = false;
    i = Math.max(0, i);
    int j = this.image.getHeight();
    int k = 1;
    j -= k;
    int m = paramPoint1.getY() + 3;
    m = Math.min(j, m);
    localPoint.<init>(i, m);
    paramPoint1 = new com/google/zxing/aztec/detector/Detector$Point;
    i = paramPoint2.getX() + -3;
    i = Math.max(0, i);
    int n = paramPoint2.getY() + -3;
    n = Math.max(0, n);
    paramPoint1.<init>(i, n);
    paramPoint2 = new com/google/zxing/aztec/detector/Detector$Point;
    i = this.image.getWidth() - k;
    j = paramPoint3.getX() + 3;
    i = Math.min(i, j);
    j = this.image.getHeight() - k;
    int i1 = paramPoint3.getY() + -3;
    i1 = Math.min(j, i1);
    i1 = Math.max(0, i1);
    paramPoint2.<init>(i, i1);
    paramPoint3 = new com/google/zxing/aztec/detector/Detector$Point;
    BitMatrix localBitMatrix1 = this.image;
    i = localBitMatrix1.getWidth() - k;
    j = paramPoint4.getX() + 3;
    i = Math.min(i, j);
    BitMatrix localBitMatrix2 = this.image;
    j = localBitMatrix2.getHeight() - k;
    int i2 = paramPoint4.getY() + 3;
    i2 = Math.min(j, i2);
    paramPoint3.<init>(i, i2);
    i2 = getColor(paramPoint3, localPoint);
    if (i2 == 0) {
      return false;
    }
    int i3 = getColor(localPoint, paramPoint1);
    if (i3 != i2) {
      return false;
    }
    m = getColor(paramPoint1, paramPoint2);
    if (m != i2) {
      return false;
    }
    m = getColor(paramPoint2, paramPoint3);
    if (m == i2) {
      bool = k;
    }
    return bool;
  }
  
  private BitMatrix sampleGrid(BitMatrix paramBitMatrix, ResultPoint paramResultPoint1, ResultPoint paramResultPoint2, ResultPoint paramResultPoint3, ResultPoint paramResultPoint4)
  {
    GridSampler localGridSampler = GridSampler.getInstance();
    int i = getDimension();
    float f1 = i / 2.0F;
    int j = this.nbCenterLayers;
    float f2 = j;
    float f3 = f1 - f2;
    f2 = f3;
    float f4 = j;
    f1 += f4;
    f4 = f1;
    float f5 = paramResultPoint1.getX();
    float f6 = paramResultPoint1.getY();
    float f7 = paramResultPoint2.getX();
    float f8 = paramResultPoint2.getY();
    float f9 = paramResultPoint3.getX();
    float f10 = paramResultPoint3.getY();
    float f11 = paramResultPoint4.getX();
    float f12 = paramResultPoint4.getY();
    return localGridSampler.sampleGrid(paramBitMatrix, i, i, f3, f3, f1, f3, f1, f1, f3, f1, f5, f6, f7, f8, f9, f10, f11, f12);
  }
  
  private int sampleLine(ResultPoint paramResultPoint1, ResultPoint paramResultPoint2, int paramInt)
  {
    float f1 = distance(paramResultPoint1, paramResultPoint2);
    float f2 = paramInt;
    f2 = f1 / f2;
    float f3 = paramResultPoint1.getX();
    float f4 = paramResultPoint1.getY();
    float f5 = paramResultPoint2.getX();
    float f6 = paramResultPoint1.getX();
    f5 = (f5 - f6) * f2 / f1;
    float f7 = paramResultPoint2.getY();
    float f8 = paramResultPoint1.getY();
    f7 -= f8;
    f2 = f2 * f7 / f1;
    int i = 0;
    f8 = 0.0F;
    paramResultPoint1 = null;
    int j = 0;
    paramResultPoint2 = null;
    f7 = 0.0F;
    while (i < paramInt)
    {
      BitMatrix localBitMatrix = this.image;
      f6 = i;
      float f9 = f6 * f5 + f3;
      int k = MathUtils.round(f9);
      f6 = f6 * f2 + f4;
      int m = MathUtils.round(f6);
      boolean bool = localBitMatrix.get(k, m);
      if (bool)
      {
        int n = paramInt - i;
        m = 1;
        f6 = 1.4E-45F;
        n -= m;
        n = m << n;
        j |= n;
      }
      i += 1;
    }
    return j;
  }
  
  public AztecDetectorResult detect()
  {
    return detect(false);
  }
  
  public AztecDetectorResult detect(boolean paramBoolean)
  {
    Object localObject1 = getMatrixCenter();
    ResultPoint[] arrayOfResultPoint1 = getBullsEyeCorners((Detector.Point)localObject1);
    if (paramBoolean)
    {
      i = 0;
      localObject1 = null;
      localObject2 = arrayOfResultPoint1[0];
      j = 2;
      localResultPoint1 = arrayOfResultPoint1[j];
      arrayOfResultPoint1[0] = localResultPoint1;
      arrayOfResultPoint1[j] = localObject2;
    }
    extractParameters(arrayOfResultPoint1);
    Object localObject2 = this.image;
    int i = this.shift;
    int j = i % 4;
    ResultPoint localResultPoint2 = arrayOfResultPoint1[j];
    int k = (i + 1) % 4;
    ResultPoint localResultPoint1 = arrayOfResultPoint1[k];
    int m = (i + 2) % 4;
    ResultPoint localResultPoint3 = arrayOfResultPoint1[m];
    i = (i + 3) % 4;
    ResultPoint localResultPoint4 = arrayOfResultPoint1[i];
    localObject1 = this;
    BitMatrix localBitMatrix = sampleGrid((BitMatrix)localObject2, localResultPoint2, localResultPoint1, localResultPoint3, localResultPoint4);
    ResultPoint[] arrayOfResultPoint2 = getMatrixCornerPoints(arrayOfResultPoint1);
    localObject1 = new com/google/zxing/aztec/AztecDetectorResult;
    boolean bool = this.compact;
    int n = this.nbDataBlocks;
    int i1 = this.nbLayers;
    ((AztecDetectorResult)localObject1).<init>(localBitMatrix, arrayOfResultPoint2, bool, n, i1);
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.aztec.detector.Detector
 * JD-Core Version:    0.7.0.1
 */