package com.google.zxing.pdf417.detector;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class Detector
{
  private static final int BARCODE_MIN_HEIGHT = 10;
  private static final int[] INDEXES_START_PATTERN;
  private static final int[] INDEXES_STOP_PATTERN;
  private static final float MAX_AVG_VARIANCE = 0.42F;
  private static final float MAX_INDIVIDUAL_VARIANCE = 0.8F;
  private static final int MAX_PATTERN_DRIFT = 5;
  private static final int MAX_PIXEL_DRIFT = 3;
  private static final int[] ROTATIONS = tmp149_135;
  private static final int ROW_STEP = 5;
  private static final int SKIPPED_ROW_COUNT_MAX = 25;
  private static final int[] START_PATTERN;
  private static final int[] STOP_PATTERN;
  
  static
  {
    int[] tmp3_1 = new int[4];
    int[] tmp4_3 = tmp3_1;
    int[] tmp4_3 = tmp3_1;
    tmp4_3[0] = 0;
    tmp4_3[1] = 4;
    tmp4_3[2] = 1;
    int[] tmp14_4 = tmp4_3;
    tmp14_4[3] = 5;
    INDEXES_START_PATTERN = tmp14_4;
    int[] tmp24_22 = new int[4];
    int[] tmp25_24 = tmp24_22;
    int[] tmp25_24 = tmp24_22;
    tmp25_24[0] = 6;
    tmp25_24[1] = 2;
    tmp25_24[2] = 7;
    int[] tmp37_25 = tmp25_24;
    tmp37_25[3] = 3;
    INDEXES_STOP_PATTERN = tmp37_25;
    int[] arrayOfInt = new int[8];
    int[] tmp51_49 = arrayOfInt;
    tmp51_49[0] = 8;
    arrayOfInt[1] = 1;
    int[] tmp59_51 = tmp51_49;
    tmp59_51[2] = 1;
    arrayOfInt[3] = 1;
    int[] tmp66_59 = tmp59_51;
    tmp66_59[4] = 1;
    arrayOfInt[5] = 1;
    tmp66_59[6] = 1;
    arrayOfInt[7] = 3;
    START_PATTERN = arrayOfInt;
    arrayOfInt = new int[9];
    int[] tmp92_90 = arrayOfInt;
    tmp92_90[0] = 7;
    arrayOfInt[1] = 1;
    int[] tmp100_92 = tmp92_90;
    tmp100_92[2] = 1;
    arrayOfInt[3] = 3;
    int[] tmp107_100 = tmp100_92;
    tmp107_100[4] = 1;
    arrayOfInt[5] = 1;
    tmp107_100[6] = 1;
    arrayOfInt[7] = 2;
    arrayOfInt[8] = 1;
    STOP_PATTERN = arrayOfInt;
    int[] tmp134_132 = new int[4];
    int[] tmp135_134 = tmp134_132;
    int[] tmp135_134 = tmp134_132;
    tmp135_134[0] = 0;
    tmp135_134[1] = '´';
    tmp135_134[2] = 270;
    int[] tmp149_135 = tmp135_134;
    tmp149_135[3] = 90;
  }
  
  private static BitMatrix applyRotation(BitMatrix paramBitMatrix, int paramInt)
  {
    int i = paramInt % 360;
    if (i == 0) {
      return paramBitMatrix;
    }
    paramBitMatrix = paramBitMatrix.clone();
    paramBitMatrix.rotate(paramInt);
    return paramBitMatrix;
  }
  
  private static void copyToResult(ResultPoint[] paramArrayOfResultPoint1, ResultPoint[] paramArrayOfResultPoint2, int[] paramArrayOfInt)
  {
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfInt.length;
      if (i >= j) {
        break;
      }
      j = paramArrayOfInt[i];
      ResultPoint localResultPoint = paramArrayOfResultPoint2[i];
      paramArrayOfResultPoint1[j] = localResultPoint;
      i += 1;
    }
  }
  
  public static PDF417DetectorResult detect(BinaryBitmap paramBinaryBitmap, Map paramMap, boolean paramBoolean)
  {
    paramBinaryBitmap = paramBinaryBitmap.getBlackMatrix();
    paramMap = ROTATIONS;
    int i = paramMap.length;
    int j = 0;
    while (j < i)
    {
      int k = paramMap[j];
      BitMatrix localBitMatrix = applyRotation(paramBinaryBitmap, k);
      List localList = detect(paramBoolean, localBitMatrix);
      boolean bool = localList.isEmpty();
      if (!bool)
      {
        paramBinaryBitmap = new com/google/zxing/pdf417/detector/PDF417DetectorResult;
        paramBinaryBitmap.<init>(localBitMatrix, localList, k);
        return paramBinaryBitmap;
      }
      j += 1;
    }
    paramMap = new com/google/zxing/pdf417/detector/PDF417DetectorResult;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    paramMap.<init>(paramBinaryBitmap, localArrayList, 0);
    return paramMap;
  }
  
  private static List detect(boolean paramBoolean, BitMatrix paramBitMatrix)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    Object localObject1 = null;
    float f1 = 0.0F;
    int j = 0;
    Object localObject2 = null;
    boolean bool = false;
    Object localObject3 = null;
    float f3;
    for (float f2 = 0.0F;; f2 = f3)
    {
      int m = paramBitMatrix.getHeight();
      if (i >= m) {
        return localArrayList;
      }
      localObject2 = findVertices(paramBitMatrix, i, j);
      Object localObject4 = localObject2[0];
      int n = 1;
      f3 = 1.4E-45F;
      if (localObject4 == null)
      {
        m = 3;
        Object localObject5 = localObject2[m];
        if (localObject5 == null)
        {
          if (!bool) {
            return localArrayList;
          }
          localObject2 = localArrayList.iterator();
          for (;;)
          {
            bool = ((Iterator)localObject2).hasNext();
            if (!bool) {
              break;
            }
            localObject3 = (ResultPoint[])((Iterator)localObject2).next();
            localObject5 = localObject3[n];
            if (localObject5 != null)
            {
              f1 = i;
              float f4 = localObject5.getY();
              f1 = Math.max(f1, f4);
              i = (int)f1;
            }
            localObject3 = localObject3[m];
            if (localObject3 != null)
            {
              f2 = ((ResultPoint)localObject3).getY();
              k = (int)f2;
              i = Math.max(i, k);
            }
          }
          i += 5;
          j = 0;
          localObject2 = null;
          break;
        }
      }
      localArrayList.add(localObject2);
      if (!paramBoolean) {
        return localArrayList;
      }
      i = 2;
      f1 = 2.802597E-045F;
      localObject3 = localObject2[i];
      if (localObject3 != null)
      {
        f2 = ((ResultPoint)localObject3).getX();
        k = (int)f2;
        localObject1 = localObject2[i];
      }
      else
      {
        i = 4;
        f1 = 5.605194E-045F;
        localObject3 = localObject2[i];
        f2 = ((ResultPoint)localObject3).getX();
        k = (int)f2;
        localObject1 = localObject2[i];
      }
      f1 = localObject1.getY();
      i = (int)f1;
      j = k;
      int k = n;
    }
    return localArrayList;
  }
  
  private static int[] findGuardPattern(BitMatrix paramBitMatrix, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int i = paramArrayOfInt2.length;
    Arrays.fill(paramArrayOfInt2, 0, i, 0);
    for (i = 0;; i = j)
    {
      boolean bool1 = paramBitMatrix.get(paramInt1, paramInt2);
      if ((!bool1) || (paramInt1 <= 0)) {
        break;
      }
      j = i + 1;
      k = 3;
      if (i >= k) {
        break;
      }
      paramInt1 += -1;
    }
    i = paramArrayOfInt1.length;
    int j = paramInt1;
    int k = 0;
    boolean bool2 = false;
    float f1;
    int i1;
    for (;;)
    {
      int m = 1054280253;
      f1 = 0.42F;
      i1 = 1;
      if (paramInt1 >= paramInt3) {
        break;
      }
      boolean bool4 = paramBitMatrix.get(paramInt1, paramInt2);
      if (bool4 != bool2)
      {
        m = paramArrayOfInt2[k] + i1;
        paramArrayOfInt2[k] = m;
      }
      else
      {
        int i2 = i + -1;
        if (k == i2)
        {
          float f2 = patternMatchVariance(paramArrayOfInt2, paramArrayOfInt1);
          boolean bool3 = f2 < f1;
          if (bool3) {
            return new int[] { j, paramInt1 };
          }
          int n = paramArrayOfInt2[0];
          i2 = paramArrayOfInt2[i1];
          n += i2;
          j += n;
          n = k + -1;
          i2 = 2;
          f2 = 2.802597E-045F;
          System.arraycopy(paramArrayOfInt2, i2, paramArrayOfInt2, 0, n);
          paramArrayOfInt2[n] = 0;
          paramArrayOfInt2[k] = 0;
          k += -1;
        }
        else
        {
          k += 1;
        }
        paramArrayOfInt2[k] = i1;
        bool2 ^= true;
      }
      paramInt1 += 1;
    }
    i -= i1;
    if (k == i)
    {
      float f3 = patternMatchVariance(paramArrayOfInt2, paramArrayOfInt1);
      boolean bool5 = f3 < f1;
      if (bool5)
      {
        paramInt1 -= i1;
        return new int[] { j, paramInt1 };
      }
    }
    return null;
  }
  
  private static ResultPoint[] findRowsWithPattern(BitMatrix paramBitMatrix, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    int i = paramInt1;
    int j = 4;
    ResultPoint[] arrayOfResultPoint = new ResultPoint[j];
    int k = paramArrayOfInt.length;
    int[] arrayOfInt = new int[k];
    int m = paramInt3;
    int n;
    int i2;
    int i3;
    label153:
    float f3;
    for (;;)
    {
      n = 1;
      float f1 = 1.4E-45F;
      if (m >= i) {
        break;
      }
      localObject1 = paramBitMatrix;
      i1 = paramInt4;
      i2 = m;
      i3 = paramInt2;
      localObject1 = findGuardPattern(paramBitMatrix, paramInt4, m, paramInt2, paramArrayOfInt, arrayOfInt);
      if (localObject1 != null)
      {
        Object localObject2 = localObject1;
        k = m;
        while (k > 0)
        {
          i4 = k + -1;
          localObject1 = paramBitMatrix;
          i1 = paramInt4;
          i2 = i4;
          i3 = paramInt2;
          localObject1 = findGuardPattern(paramBitMatrix, paramInt4, i4, paramInt2, paramArrayOfInt, arrayOfInt);
          if (localObject1 != null)
          {
            localObject2 = localObject1;
            k = i4;
          }
          else
          {
            i4 += n;
            break label153;
          }
        }
        int i4 = k;
        localObject1 = new com/google/zxing/ResultPoint;
        float f2 = localObject2[0];
        f3 = i4;
        ((ResultPoint)localObject1).<init>(f2, f3);
        arrayOfResultPoint[0] = localObject1;
        localObject1 = new com/google/zxing/ResultPoint;
        i1 = localObject2[n];
        f2 = i1;
        ((ResultPoint)localObject1).<init>(f2, f3);
        arrayOfResultPoint[n] = localObject1;
        k = n;
        f4 = f1;
        m = i4;
        break label251;
      }
      m += 5;
    }
    k = 0;
    Object localObject1 = null;
    float f4 = 0.0F;
    label251:
    int i1 = m + 1;
    label465:
    ResultPoint localResultPoint2;
    if (k != 0)
    {
      f4 = arrayOfResultPoint[0].getX();
      k = (int)f4;
      ResultPoint localResultPoint1 = arrayOfResultPoint[n];
      f3 = localResultPoint1.getX();
      i2 = (int)f3;
      localObject1 = new int[] { k, i2 };
      Object localObject3 = localObject1;
      int i5 = i1;
      int i6 = 0;
      while (i5 < i)
      {
        i1 = localObject3[0];
        localObject1 = paramBitMatrix;
        i2 = i5;
        i3 = paramInt2;
        localObject1 = findGuardPattern(paramBitMatrix, i1, i5, paramInt2, paramArrayOfInt, arrayOfInt);
        if (localObject1 != null)
        {
          i1 = localObject3[0];
          i2 = localObject1[0];
          i1 = Math.abs(i1 - i2);
          i2 = 5;
          f3 = 7.006492E-045F;
          if (i1 < i2)
          {
            i1 = localObject3[n];
            i3 = localObject1[n];
            i1 = Math.abs(i1 - i3);
            if (i1 < i2)
            {
              localObject3 = localObject1;
              i6 = 0;
              break label465;
            }
          }
        }
        k = 25;
        f4 = 3.503246E-044F;
        if (i6 > k) {
          break;
        }
        i6 += 1;
        i5 += 1;
      }
      i6 += n;
      i1 = i5 - i6;
      localResultPoint2 = new com/google/zxing/ResultPoint;
      f4 = localObject3[0];
      f3 = i1;
      localResultPoint2.<init>(f4, f3);
      arrayOfResultPoint[2] = localResultPoint2;
      localResultPoint2 = new com/google/zxing/ResultPoint;
      f4 = localObject3[n];
      localResultPoint2.<init>(f4, f3);
      k = 3;
      f4 = 4.203895E-045F;
      arrayOfResultPoint[k] = localResultPoint2;
    }
    i1 -= m;
    i = 10;
    if (i1 < i)
    {
      i = 0;
      localResultPoint2 = null;
      Arrays.fill(arrayOfResultPoint, null);
    }
    return arrayOfResultPoint;
  }
  
  private static ResultPoint[] findVertices(BitMatrix paramBitMatrix, int paramInt1, int paramInt2)
  {
    int i = paramBitMatrix.getHeight();
    int j = paramBitMatrix.getWidth();
    ResultPoint[] arrayOfResultPoint = new ResultPoint[8];
    int[] arrayOfInt = START_PATTERN;
    Object localObject1 = paramBitMatrix;
    localObject1 = findRowsWithPattern(paramBitMatrix, i, j, paramInt1, paramInt2, arrayOfInt);
    Object localObject2 = INDEXES_START_PATTERN;
    copyToResult(arrayOfResultPoint, (ResultPoint[])localObject1, (int[])localObject2);
    int k = 4;
    localObject2 = arrayOfResultPoint[k];
    if (localObject2 != null)
    {
      paramInt2 = (int)((ResultPoint)localObject2).getX();
      localObject3 = arrayOfResultPoint[k];
      float f = ((ResultPoint)localObject3).getY();
      paramInt1 = (int)f;
    }
    arrayOfInt = STOP_PATTERN;
    localObject1 = paramBitMatrix;
    paramBitMatrix = findRowsWithPattern(paramBitMatrix, i, j, paramInt1, paramInt2, arrayOfInt);
    Object localObject3 = INDEXES_STOP_PATTERN;
    copyToResult(arrayOfResultPoint, paramBitMatrix, (int[])localObject3);
    return arrayOfResultPoint;
  }
  
  private static float patternMatchVariance(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int i = paramArrayOfInt1.length;
    int j = 0;
    int k = 0;
    float f1 = 0.0F;
    int m = 0;
    float f2 = 0.0F;
    int n = 0;
    float f3 = 0.0F;
    while (k < i)
    {
      i1 = paramArrayOfInt1[k];
      m += i1;
      i1 = paramArrayOfInt2[k];
      n += i1;
      k += 1;
    }
    k = 2139095040;
    f1 = 1.0F / 0.0F;
    if (m < n) {
      return f1;
    }
    f2 = m;
    f3 = n;
    f3 = f2 / f3;
    int i1 = 1061997773;
    float f4 = 0.8F * f3;
    float f5 = 0.0F;
    while (j < i)
    {
      int i2 = paramArrayOfInt1[j];
      int i3 = paramArrayOfInt2[j];
      float f6 = i3 * f3;
      float f7 = i2;
      boolean bool2 = f7 < f6;
      if (bool2) {
        f7 -= f6;
      } else {
        f7 = f6 - f7;
      }
      boolean bool1 = f7 < f4;
      if (bool1) {
        return f1;
      }
      f5 += f7;
      j += 1;
    }
    return f5 / f2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.detector.Detector
 * JD-Core Version:    0.7.0.1
 */