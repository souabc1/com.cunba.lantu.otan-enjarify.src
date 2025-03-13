package com.google.zxing.pdf417.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import com.google.zxing.pdf417.decoder.ec.ErrorCorrection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class PDF417ScanningDecoder
{
  private static final int CODEWORD_SKEW_SIZE = 2;
  private static final int MAX_EC_CODEWORDS = 512;
  private static final int MAX_ERRORS = 3;
  private static final ErrorCorrection errorCorrection;
  
  static
  {
    ErrorCorrection localErrorCorrection = new com/google/zxing/pdf417/decoder/ec/ErrorCorrection;
    localErrorCorrection.<init>();
    errorCorrection = localErrorCorrection;
  }
  
  private static BoundingBox adjustBoundingBox(DetectionResultRowIndicatorColumn paramDetectionResultRowIndicatorColumn)
  {
    int i = 0;
    BoundingBox localBoundingBox = null;
    if (paramDetectionResultRowIndicatorColumn == null) {
      return null;
    }
    int[] arrayOfInt = paramDetectionResultRowIndicatorColumn.getRowHeights();
    if (arrayOfInt == null) {
      return null;
    }
    i = getMax(arrayOfInt);
    int j = arrayOfInt.length;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1;
    int i2;
    while (m < j)
    {
      i1 = arrayOfInt[m];
      i2 = i - i1;
      n += i2;
      if (i1 > 0) {
        break;
      }
      m += 1;
    }
    Codeword[] arrayOfCodeword = paramDetectionResultRowIndicatorColumn.getCodewords();
    m = 0;
    while (n > 0)
    {
      Codeword localCodeword = arrayOfCodeword[m];
      if (localCodeword != null) {
        break;
      }
      n += -1;
      m += 1;
    }
    m = arrayOfInt.length + -1;
    while (m >= 0)
    {
      i1 = arrayOfInt[m];
      i2 = i - i1;
      k += i2;
      if (i1 > 0) {
        break;
      }
      m += -1;
    }
    i = arrayOfCodeword.length + -1;
    while (k > 0)
    {
      arrayOfInt = arrayOfCodeword[i];
      if (arrayOfInt != null) {
        break;
      }
      k += -1;
      i += -1;
    }
    localBoundingBox = paramDetectionResultRowIndicatorColumn.getBoundingBox();
    boolean bool = paramDetectionResultRowIndicatorColumn.isLeft();
    return localBoundingBox.addMissingRows(n, k, bool);
  }
  
  private static void adjustCodewordCount(DetectionResult paramDetectionResult, BarcodeValue[][] paramArrayOfBarcodeValue)
  {
    paramArrayOfBarcodeValue = paramArrayOfBarcodeValue[0];
    int i = 1;
    paramArrayOfBarcodeValue = paramArrayOfBarcodeValue[i];
    int[] arrayOfInt = paramArrayOfBarcodeValue.getValue();
    int j = paramDetectionResult.getBarcodeColumnCount();
    int k = paramDetectionResult.getBarcodeRowCount();
    j *= k;
    int m = getNumberOfECCodeWords(paramDetectionResult.getBarcodeECLevel());
    j -= m;
    m = arrayOfInt.length;
    k = 928;
    if (m == 0) {
      if ((j < i) || (j > k)) {}
    }
    do
    {
      paramArrayOfBarcodeValue.setValue(j);
      break;
      throw NotFoundException.getNotFoundInstance();
      m = arrayOfInt[0];
    } while ((m != j) && (j >= i) && (j <= k));
  }
  
  private static int adjustCodewordStartColumn(BitMatrix paramBitMatrix, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4)
  {
    int i;
    if (paramBoolean) {
      i = -1;
    } else {
      i = 1;
    }
    int j = 0;
    int k = paramInt3;
    for (;;)
    {
      int m = 2;
      if (j >= m) {
        break;
      }
      while (paramBoolean ? k >= paramInt1 : k < paramInt2)
      {
        boolean bool = paramBitMatrix.get(k, paramInt4);
        if (paramBoolean != bool) {
          break;
        }
        int n = Math.abs(paramInt3 - k);
        if (n > m) {
          return paramInt3;
        }
        k += i;
      }
      i = -i;
      paramBoolean ^= true;
      j += 1;
    }
    return k;
  }
  
  private static boolean checkCodewordSkew(int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt2 += -2;
    if (paramInt2 <= paramInt1)
    {
      paramInt3 += 2;
      if (paramInt1 <= paramInt3) {
        return 1;
      }
    }
    paramInt1 = 0;
    return paramInt1;
  }
  
  private static int correctErrors(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    int i;
    if (paramArrayOfInt2 != null)
    {
      i = paramArrayOfInt2.length;
      int j = paramInt / 2 + 3;
      if (i > j) {}
    }
    else if (paramInt >= 0)
    {
      i = 512;
      if (paramInt <= i) {
        return errorCorrection.decode(paramArrayOfInt1, paramInt, paramArrayOfInt2);
      }
    }
    throw ChecksumException.getChecksumInstance();
  }
  
  private static BarcodeValue[][] createBarcodeMatrix(DetectionResult paramDetectionResult)
  {
    int i = paramDetectionResult.getBarcodeRowCount();
    int j = paramDetectionResult.getBarcodeColumnCount() + 2;
    Object localObject1 = { i, j };
    localObject1 = (BarcodeValue[][])Array.newInstance(BarcodeValue.class, (int[])localObject1);
    j = 0;
    int k = 0;
    Object localObject3;
    for (;;)
    {
      m = localObject1.length;
      if (k >= m) {
        break;
      }
      m = 0;
      for (;;)
      {
        localObject2 = localObject1[k];
        int n = localObject2.length;
        if (m >= n) {
          break;
        }
        localObject3 = new com/google/zxing/pdf417/decoder/BarcodeValue;
        ((BarcodeValue)localObject3).<init>();
        localObject2[m] = localObject3;
        m += 1;
      }
      k += 1;
    }
    paramDetectionResult = paramDetectionResult.getDetectionResultColumns();
    k = paramDetectionResult.length;
    int m = 0;
    int i1 = 0;
    Object localObject2 = null;
    while (m < k)
    {
      localObject3 = paramDetectionResult[m];
      if (localObject3 != null)
      {
        localObject3 = ((DetectionResultColumn)localObject3).getCodewords();
        int i2 = localObject3.length;
        int i3 = 0;
        while (i3 < i2)
        {
          Object localObject4 = localObject3[i3];
          if (localObject4 != null)
          {
            int i4 = localObject4.getRowNumber();
            if (i4 >= 0)
            {
              int i5 = localObject1.length;
              if (i4 < i5)
              {
                Object localObject5 = localObject1[i4][i1];
                int i6 = localObject4.getValue();
                localObject5.setValue(i6);
              }
            }
          }
          i3 += 1;
        }
      }
      i1 += 1;
      m += 1;
    }
    return localObject1;
  }
  
  private static DecoderResult createDecoderResult(DetectionResult paramDetectionResult)
  {
    Object localObject1 = createBarcodeMatrix(paramDetectionResult);
    adjustCodewordCount(paramDetectionResult, (BarcodeValue[][])localObject1);
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    int i = paramDetectionResult.getBarcodeRowCount();
    int j = paramDetectionResult.getBarcodeColumnCount();
    i *= j;
    int[] arrayOfInt1 = new int[i];
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    int k = 0;
    int m = 0;
    int[][] arrayOfInt = null;
    Object localObject3;
    for (;;)
    {
      int n = paramDetectionResult.getBarcodeRowCount();
      if (m >= n) {
        break;
      }
      n = 0;
      localObject3 = null;
      for (;;)
      {
        int i1 = paramDetectionResult.getBarcodeColumnCount();
        if (n >= i1) {
          break;
        }
        int[] arrayOfInt2 = localObject1[m];
        int i2 = n + 1;
        arrayOfInt2 = arrayOfInt2[i2].getValue();
        int i3 = paramDetectionResult.getBarcodeColumnCount() * m + n;
        n = arrayOfInt2.length;
        if (n == 0)
        {
          localObject3 = Integer.valueOf(i3);
          ((Collection)localObject2).add(localObject3);
        }
        else
        {
          n = arrayOfInt2.length;
          int i4 = 1;
          if (n == i4)
          {
            n = arrayOfInt2[0];
            arrayOfInt1[i3] = n;
          }
          else
          {
            localObject3 = Integer.valueOf(i3);
            localArrayList2.add(localObject3);
            localArrayList1.add(arrayOfInt2);
          }
        }
        n = i2;
      }
      m += 1;
    }
    int i5 = localArrayList1.size();
    arrayOfInt = new int[i5][];
    while (k < i5)
    {
      localObject3 = (int[])localArrayList1.get(k);
      arrayOfInt[k] = localObject3;
      k += 1;
    }
    int i6 = paramDetectionResult.getBarcodeECLevel();
    localObject1 = PDF417Common.toIntArray((Collection)localObject2);
    localObject2 = PDF417Common.toIntArray(localArrayList2);
    return createDecoderResultFromAmbiguousValues(i6, arrayOfInt1, (int[])localObject1, (int[])localObject2, arrayOfInt);
  }
  
  private static DecoderResult createDecoderResultFromAmbiguousValues(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[][] paramArrayOfInt)
  {
    int i = paramArrayOfInt3.length;
    int[] arrayOfInt1 = new int[i];
    int j = 100;
    for (;;)
    {
      int k = j + -1;
      if (j > 0)
      {
        j = 0;
        int m = 0;
        int n;
        int[] arrayOfInt2;
        int i2;
        while (m < i)
        {
          n = paramArrayOfInt3[m];
          arrayOfInt2 = paramArrayOfInt[m];
          int i1 = arrayOfInt1[m];
          i2 = arrayOfInt2[i1];
          paramArrayOfInt1[n] = i2;
          m += 1;
        }
        try
        {
          return decodeCodewords(paramArrayOfInt1, paramInt, paramArrayOfInt2);
        }
        catch (ChecksumException localChecksumException)
        {
          if (i != 0)
          {
            m = 0;
            while (m < i)
            {
              n = arrayOfInt1[m];
              arrayOfInt2 = paramArrayOfInt[m];
              i2 = arrayOfInt2.length + -1;
              if (n < i2)
              {
                n += 1;
                arrayOfInt1[m] = n;
              }
              else
              {
                arrayOfInt1[m] = 0;
                n = i + -1;
                if (m != n) {
                  m += 1;
                } else {
                  throw ChecksumException.getChecksumInstance();
                }
              }
            }
            j = k;
          }
          else
          {
            throw ChecksumException.getChecksumInstance();
          }
        }
      }
    }
    throw ChecksumException.getChecksumInstance();
  }
  
  public static DecoderResult decode(BitMatrix paramBitMatrix, ResultPoint paramResultPoint1, ResultPoint paramResultPoint2, ResultPoint paramResultPoint3, ResultPoint paramResultPoint4, int paramInt1, int paramInt2)
  {
    BoundingBox localBoundingBox1 = new com/google/zxing/pdf417/decoder/BoundingBox;
    Object localObject1 = localBoundingBox1;
    Object localObject2 = paramBitMatrix;
    Object localObject3 = paramResultPoint1;
    Object localObject4 = paramResultPoint2;
    localBoundingBox1.<init>(paramBitMatrix, paramResultPoint1, paramResultPoint2, paramResultPoint3, paramResultPoint4);
    int i = 0;
    localObject1 = null;
    int j = 1;
    float f1 = 1.4E-45F;
    int k = 0;
    localObject3 = null;
    int m = j;
    BoundingBox localBoundingBox2;
    int i2;
    Object localObject5;
    for (;;)
    {
      localBoundingBox2 = localBoundingBox1;
      boolean bool;
      if (paramResultPoint1 != null)
      {
        bool = true;
        localObject4 = paramBitMatrix;
        i1 = paramInt1;
        i2 = paramInt2;
        localObject1 = getRowIndicatorColumn(paramBitMatrix, localBoundingBox1, paramResultPoint1, bool, paramInt1, paramInt2);
      }
      if (paramResultPoint3 != null)
      {
        bool = false;
        localBoundingBox1 = null;
        localObject4 = paramBitMatrix;
        i1 = paramInt1;
        i2 = paramInt2;
        localObject3 = getRowIndicatorColumn(paramBitMatrix, localBoundingBox2, paramResultPoint3, false, paramInt1, paramInt2);
      }
      localObject4 = merge((DetectionResultRowIndicatorColumn)localObject1, (DetectionResultRowIndicatorColumn)localObject3);
      if (localObject4 == null) {
        break label685;
      }
      localBoundingBox1 = ((DetectionResult)localObject4).getBoundingBox();
      if ((m == 0) || (localBoundingBox1 == null)) {
        break;
      }
      i3 = localBoundingBox1.getMinY();
      i1 = localBoundingBox2.getMinY();
      if (i3 >= i1)
      {
        i3 = localBoundingBox1.getMaxY();
        i1 = localBoundingBox2.getMaxY();
        if (i3 <= i1) {
          break;
        }
      }
      m = 0;
      localObject5 = null;
    }
    ((DetectionResult)localObject4).setBoundingBox(localBoundingBox2);
    int i3 = ((DetectionResult)localObject4).getBarcodeColumnCount() + j;
    ((DetectionResult)localObject4).setDetectionResultColumn(0, (DetectionResultColumn)localObject1);
    ((DetectionResult)localObject4).setDetectionResultColumn(i3, (DetectionResultColumn)localObject3);
    if (localObject1 != null)
    {
      i = j;
    }
    else
    {
      i = 0;
      localObject1 = null;
    }
    k = paramInt1;
    int n = paramInt2;
    int i1 = j;
    while (i1 <= i3)
    {
      if (i != 0) {
        i2 = i1;
      } else {
        i2 = i3 - i1;
      }
      localObject5 = ((DetectionResult)localObject4).getDetectionResultColumn(i2);
      if (localObject5 == null)
      {
        if ((i2 != 0) && (i2 != i3))
        {
          localObject5 = new com/google/zxing/pdf417/decoder/DetectionResultColumn;
          ((DetectionResultColumn)localObject5).<init>(localBoundingBox2);
        }
        Object localObject6;
        for (;;)
        {
          localObject6 = localObject5;
          break;
          localObject5 = new com/google/zxing/pdf417/decoder/DetectionResultRowIndicatorColumn;
          int i4;
          if (i2 == 0) {
            i4 = j;
          } else {
            i4 = 0;
          }
          ((DetectionResultRowIndicatorColumn)localObject5).<init>(localBoundingBox2, i4);
        }
        ((DetectionResult)localObject4).setDetectionResultColumn(i2, (DetectionResultColumn)localObject5);
        m = localBoundingBox2.getMinY();
        int i6 = -1;
        float f2 = 0.0F / 0.0F;
        int i7 = m;
        int i8 = i6;
        for (;;)
        {
          m = localBoundingBox2.getMaxY();
          if (i7 > m) {
            break;
          }
          m = getStartColumn((DetectionResult)localObject4, i2, i7, i);
          int i5;
          int i9;
          if (m >= 0)
          {
            i5 = localBoundingBox2.getMaxX();
            if (m <= i5)
            {
              i9 = m;
              break label501;
            }
          }
          int i10;
          int i11;
          float f3;
          if (i8 == i6)
          {
            i10 = i8;
            i5 = i7;
            i11 = i6;
            f3 = f2;
            localObject2 = localObject6;
          }
          else
          {
            i9 = i8;
            label501:
            i5 = localBoundingBox2.getMinX();
            int i12 = localBoundingBox2.getMaxX();
            localObject5 = paramBitMatrix;
            i10 = i8;
            i8 = i12;
            int i13 = i7;
            i7 = i;
            i11 = i6;
            f3 = f2;
            i6 = i9;
            localObject2 = localObject6;
            i12 = k;
            localObject5 = detectCodeword(paramBitMatrix, i5, i8, i, i9, i13, k, n);
            i5 = i13;
            if (localObject5 != null)
            {
              localObject6.setCodeword(i13, (Codeword)localObject5);
              i8 = ((Codeword)localObject5).getWidth();
              k = Math.min(k, i8);
              m = ((Codeword)localObject5).getWidth();
              n = Math.max(n, m);
              i8 = i9;
              break label635;
            }
          }
          i8 = i10;
          label635:
          i7 = i5 + 1;
          localObject6 = localObject2;
          i6 = i11;
          f2 = f3;
          j = 1;
          f1 = 1.4E-45F;
        }
      }
      i1 += 1;
      j = 1;
      f1 = 1.4E-45F;
    }
    return createDecoderResult((DetectionResult)localObject4);
    label685:
    throw NotFoundException.getNotFoundInstance();
  }
  
  private static DecoderResult decodeCodewords(int[] paramArrayOfInt1, int paramInt, int[] paramArrayOfInt2)
  {
    int i = paramArrayOfInt1.length;
    if (i != 0)
    {
      i = paramInt + 1;
      i = 1 << i;
      int j = correctErrors(paramArrayOfInt1, paramArrayOfInt2, i);
      verifyCodewordCount(paramArrayOfInt1, i);
      Object localObject = String.valueOf(paramInt);
      paramArrayOfInt1 = DecodedBitStreamParser.decode(paramArrayOfInt1, (String)localObject);
      localObject = Integer.valueOf(j);
      paramArrayOfInt1.setErrorsCorrected((Integer)localObject);
      localObject = Integer.valueOf(paramArrayOfInt2.length);
      paramArrayOfInt1.setErasures((Integer)localObject);
      return paramArrayOfInt1;
    }
    throw FormatException.getFormatInstance();
  }
  
  private static Codeword detectCodeword(BitMatrix paramBitMatrix, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    paramInt3 = adjustCodewordStartColumn(paramBitMatrix, paramInt1, paramInt2, paramBoolean, paramInt3, paramInt4);
    paramBitMatrix = getModuleBitCount(paramBitMatrix, paramInt1, paramInt2, paramBoolean, paramInt3, paramInt4);
    paramInt1 = 0;
    Codeword localCodeword = null;
    if (paramBitMatrix == null) {
      return null;
    }
    paramInt2 = MathUtils.sum(paramBitMatrix);
    if (paramBoolean)
    {
      paramBoolean = paramInt3 + paramInt2;
    }
    else
    {
      paramBoolean = false;
      for (;;)
      {
        paramInt4 = paramBitMatrix.length / 2;
        if (paramBoolean >= paramInt4) {
          break;
        }
        paramInt4 = paramBitMatrix[paramBoolean];
        int i = paramBitMatrix.length + -1 - paramBoolean;
        i = paramBitMatrix[i];
        paramBitMatrix[paramBoolean] = i;
        i = paramBitMatrix.length + -1 - paramBoolean;
        paramBitMatrix[i] = paramInt4;
        paramBoolean += true;
      }
      paramBoolean = paramInt3 - paramInt2;
      boolean bool = paramInt3;
      paramInt3 = paramBoolean;
      paramBoolean = bool;
    }
    paramInt2 = checkCodewordSkew(paramInt2, paramInt5, paramInt6);
    if (paramInt2 == 0) {
      return null;
    }
    int j = PDF417CodewordDecoder.getDecodedValue(paramBitMatrix);
    paramInt2 = PDF417Common.getCodeword(j);
    paramInt4 = -1;
    if (paramInt2 == paramInt4) {
      return null;
    }
    localCodeword = new com/google/zxing/pdf417/decoder/Codeword;
    j = getCodewordBucketNumber(j);
    localCodeword.<init>(paramInt3, paramBoolean, j, paramInt2);
    return localCodeword;
  }
  
  private static BarcodeMetadata getBarcodeMetadata(DetectionResultRowIndicatorColumn paramDetectionResultRowIndicatorColumn1, DetectionResultRowIndicatorColumn paramDetectionResultRowIndicatorColumn2)
  {
    BarcodeMetadata localBarcodeMetadata = null;
    if (paramDetectionResultRowIndicatorColumn1 != null)
    {
      paramDetectionResultRowIndicatorColumn1 = paramDetectionResultRowIndicatorColumn1.getBarcodeMetadata();
      if (paramDetectionResultRowIndicatorColumn1 != null)
      {
        if (paramDetectionResultRowIndicatorColumn2 != null)
        {
          paramDetectionResultRowIndicatorColumn2 = paramDetectionResultRowIndicatorColumn2.getBarcodeMetadata();
          if (paramDetectionResultRowIndicatorColumn2 != null)
          {
            int i = paramDetectionResultRowIndicatorColumn1.getColumnCount();
            int j = paramDetectionResultRowIndicatorColumn2.getColumnCount();
            if (i != j)
            {
              i = paramDetectionResultRowIndicatorColumn1.getErrorCorrectionLevel();
              j = paramDetectionResultRowIndicatorColumn2.getErrorCorrectionLevel();
              if (i != j)
              {
                i = paramDetectionResultRowIndicatorColumn1.getRowCount();
                int k = paramDetectionResultRowIndicatorColumn2.getRowCount();
                if (i != k) {
                  return null;
                }
              }
            }
          }
        }
        return paramDetectionResultRowIndicatorColumn1;
      }
    }
    if (paramDetectionResultRowIndicatorColumn2 != null) {
      localBarcodeMetadata = paramDetectionResultRowIndicatorColumn2.getBarcodeMetadata();
    }
    return localBarcodeMetadata;
  }
  
  private static int[] getBitCountForCodeword(int paramInt)
  {
    int i = 8;
    int[] arrayOfInt = new int[i];
    int j = 0;
    int k = 7;
    for (;;)
    {
      int m = paramInt & 0x1;
      if (m != j)
      {
        k += -1;
        if (k < 0) {
          return arrayOfInt;
        }
        j = m;
      }
      m = arrayOfInt[k] + 1;
      arrayOfInt[k] = m;
      paramInt >>= 1;
    }
  }
  
  private static int getCodewordBucketNumber(int paramInt)
  {
    return getCodewordBucketNumber(getBitCountForCodeword(paramInt));
  }
  
  private static int getCodewordBucketNumber(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j = paramArrayOfInt[2];
    i -= j;
    j = paramArrayOfInt[4];
    i += j;
    int k = paramArrayOfInt[6];
    return (i - k + 9) % 9;
  }
  
  private static int getMax(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int j = -1;
    int k = 0;
    while (k < i)
    {
      int m = paramArrayOfInt[k];
      j = Math.max(j, m);
      k += 1;
    }
    return j;
  }
  
  private static int[] getModuleBitCount(BitMatrix paramBitMatrix, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4)
  {
    int i = 8;
    int[] arrayOfInt = new int[i];
    int j = 1;
    int k;
    if (paramBoolean) {
      k = j;
    } else {
      k = -1;
    }
    int m = 0;
    boolean bool1 = paramBoolean;
    while ((paramBoolean ? paramInt3 < paramInt2 : paramInt3 >= paramInt1) && (m < i))
    {
      boolean bool2 = paramBitMatrix.get(paramInt3, paramInt4);
      if (bool2 == bool1)
      {
        int n = arrayOfInt[m] + j;
        arrayOfInt[m] = n;
        paramInt3 += k;
      }
      else
      {
        m += 1;
        bool1 ^= true;
      }
    }
    if (m != i)
    {
      if (paramBoolean) {
        paramInt1 = paramInt2;
      }
      if (paramInt3 == paramInt1)
      {
        int i1 = 7;
        if (m == i1) {}
      }
      else
      {
        return null;
      }
    }
    return arrayOfInt;
  }
  
  private static int getNumberOfECCodeWords(int paramInt)
  {
    return 2 << paramInt;
  }
  
  private static DetectionResultRowIndicatorColumn getRowIndicatorColumn(BitMatrix paramBitMatrix, BoundingBox paramBoundingBox, ResultPoint paramResultPoint, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    boolean bool = paramBoolean;
    DetectionResultRowIndicatorColumn localDetectionResultRowIndicatorColumn = new com/google/zxing/pdf417/decoder/DetectionResultRowIndicatorColumn;
    localDetectionResultRowIndicatorColumn.<init>(paramBoundingBox, paramBoolean);
    int i = 0;
    float f1 = 0.0F;
    Object localObject = null;
    int j = 0;
    for (;;)
    {
      i = 2;
      f1 = 2.802597E-045F;
      if (j >= i) {
        break;
      }
      if (j == 0)
      {
        i = 1;
        f1 = 1.4E-45F;
      }
      else
      {
        i = -1;
        f1 = 0.0F / 0.0F;
      }
      int k = i;
      f1 = paramResultPoint.getX();
      i = (int)f1;
      float f2 = paramResultPoint.getY();
      int m = (int)f2;
      int n = i;
      int i1 = m;
      for (;;)
      {
        i = paramBoundingBox.getMaxY();
        if (i1 > i) {
          break;
        }
        i = paramBoundingBox.getMinY();
        if (i1 < i) {
          break;
        }
        m = 0;
        f2 = 0.0F;
        int i2 = paramBitMatrix.getWidth();
        localObject = paramBitMatrix;
        localObject = detectCodeword(paramBitMatrix, 0, i2, paramBoolean, n, i1, paramInt1, paramInt2);
        if (localObject != null)
        {
          localDetectionResultRowIndicatorColumn.setCodeword(i1, (Codeword)localObject);
          if (bool) {
            i = ((Codeword)localObject).getStartX();
          } else {
            i = ((Codeword)localObject).getEndX();
          }
          n = i;
        }
        i1 += k;
      }
      j += 1;
    }
    return localDetectionResultRowIndicatorColumn;
  }
  
  private static int getStartColumn(DetectionResult paramDetectionResult, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 1;
    } else {
      i = -1;
    }
    int j = paramInt1 - i;
    boolean bool1 = isValidBarcodeColumn(paramDetectionResult, j);
    if (bool1)
    {
      localObject1 = paramDetectionResult.getDetectionResultColumn(j).getCodeword(paramInt2);
    }
    else
    {
      bool1 = false;
      localObject1 = null;
    }
    int k;
    if (localObject1 != null)
    {
      if (paramBoolean) {
        k = ((Codeword)localObject1).getEndX();
      } else {
        k = ((Codeword)localObject1).getStartX();
      }
      return k;
    }
    Object localObject1 = paramDetectionResult.getDetectionResultColumn(paramInt1).getCodewordNearby(paramInt2);
    if (localObject1 != null)
    {
      if (paramBoolean) {
        k = ((Codeword)localObject1).getStartX();
      } else {
        k = ((Codeword)localObject1).getEndX();
      }
      return k;
    }
    boolean bool2 = isValidBarcodeColumn(paramDetectionResult, j);
    if (bool2)
    {
      localDetectionResultColumn = paramDetectionResult.getDetectionResultColumn(j);
      localObject1 = localDetectionResultColumn.getCodewordNearby(paramInt2);
    }
    if (localObject1 != null)
    {
      if (paramBoolean) {
        k = ((Codeword)localObject1).getEndX();
      } else {
        k = ((Codeword)localObject1).getStartX();
      }
      return k;
    }
    paramInt2 = 0;
    j = 0;
    DetectionResultColumn localDetectionResultColumn = null;
    for (;;)
    {
      paramInt1 -= i;
      bool1 = isValidBarcodeColumn(paramDetectionResult, paramInt1);
      if (!bool1) {
        break;
      }
      localObject1 = paramDetectionResult.getDetectionResultColumn(paramInt1).getCodewords();
      int m = localObject1.length;
      int n = 0;
      while (n < m)
      {
        Object localObject2 = localObject1[n];
        if (localObject2 != null)
        {
          if (paramBoolean) {
            k = localObject2.getEndX();
          } else {
            k = localObject2.getStartX();
          }
          i *= j;
          paramInt1 = localObject2.getEndX();
          paramInt2 = localObject2.getStartX();
          paramInt1 -= paramInt2;
          i *= paramInt1;
          return k + i;
        }
        n += 1;
      }
      j += 1;
    }
    paramDetectionResult = paramDetectionResult.getBoundingBox();
    if (paramBoolean) {
      k = paramDetectionResult.getMinX();
    } else {
      k = paramDetectionResult.getMaxX();
    }
    return k;
  }
  
  private static boolean isValidBarcodeColumn(DetectionResult paramDetectionResult, int paramInt)
  {
    int j;
    if (paramInt >= 0)
    {
      int i = paramDetectionResult.getBarcodeColumnCount();
      j = 1;
      i += j;
      if (paramInt <= i) {}
    }
    else
    {
      j = 0;
    }
    return j;
  }
  
  private static DetectionResult merge(DetectionResultRowIndicatorColumn paramDetectionResultRowIndicatorColumn1, DetectionResultRowIndicatorColumn paramDetectionResultRowIndicatorColumn2)
  {
    if ((paramDetectionResultRowIndicatorColumn1 == null) && (paramDetectionResultRowIndicatorColumn2 == null)) {
      return null;
    }
    BarcodeMetadata localBarcodeMetadata = getBarcodeMetadata(paramDetectionResultRowIndicatorColumn1, paramDetectionResultRowIndicatorColumn2);
    if (localBarcodeMetadata == null) {
      return null;
    }
    paramDetectionResultRowIndicatorColumn1 = adjustBoundingBox(paramDetectionResultRowIndicatorColumn1);
    paramDetectionResultRowIndicatorColumn2 = adjustBoundingBox(paramDetectionResultRowIndicatorColumn2);
    paramDetectionResultRowIndicatorColumn1 = BoundingBox.merge(paramDetectionResultRowIndicatorColumn1, paramDetectionResultRowIndicatorColumn2);
    paramDetectionResultRowIndicatorColumn2 = new com/google/zxing/pdf417/decoder/DetectionResult;
    paramDetectionResultRowIndicatorColumn2.<init>(localBarcodeMetadata, paramDetectionResultRowIndicatorColumn1);
    return paramDetectionResultRowIndicatorColumn2;
  }
  
  /* Error */
  public static String toString(BarcodeValue[][] paramArrayOfBarcodeValue)
  {
    // Byte code:
    //   0: new 375	java/util/Formatter
    //   3: astore_1
    //   4: aload_1
    //   5: invokespecial 376	java/util/Formatter:<init>	()V
    //   8: aconst_null
    //   9: astore_2
    //   10: iconst_0
    //   11: istore_3
    //   12: aload_0
    //   13: arraylength
    //   14: istore 4
    //   16: iload_3
    //   17: iload 4
    //   19: if_icmpge +244 -> 263
    //   22: ldc_w 378
    //   25: astore 5
    //   27: aload 5
    //   29: invokestatic 384	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   32: astore 5
    //   34: iconst_1
    //   35: istore 6
    //   37: iload 6
    //   39: anewarray 4	java/lang/Object
    //   42: astore 7
    //   44: iload_3
    //   45: invokestatic 146	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   48: astore 8
    //   50: aload 7
    //   52: iconst_0
    //   53: aload 8
    //   55: aastore
    //   56: aload_1
    //   57: aload 5
    //   59: aload 7
    //   61: invokevirtual 388	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   64: pop
    //   65: iconst_0
    //   66: istore 4
    //   68: aconst_null
    //   69: astore 5
    //   71: aload_0
    //   72: iload_3
    //   73: aaload
    //   74: astore 7
    //   76: aload 7
    //   78: arraylength
    //   79: istore 9
    //   81: iload 4
    //   83: iload 9
    //   85: if_icmpge +151 -> 236
    //   88: aload 7
    //   90: iload 4
    //   92: aaload
    //   93: astore 7
    //   95: aload 7
    //   97: invokevirtual 59	com/google/zxing/pdf417/decoder/BarcodeValue:getValue	()[I
    //   100: astore 8
    //   102: aload 8
    //   104: arraylength
    //   105: istore 9
    //   107: iload 9
    //   109: ifne +32 -> 141
    //   112: ldc_w 390
    //   115: astore 7
    //   117: aload 7
    //   119: invokestatic 384	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   122: astore 7
    //   124: iconst_0
    //   125: istore 9
    //   127: aconst_null
    //   128: astore 8
    //   130: aload_1
    //   131: aload 7
    //   133: aconst_null
    //   134: invokevirtual 388	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   137: pop
    //   138: goto +89 -> 227
    //   141: ldc_w 392
    //   144: astore 8
    //   146: aload 8
    //   148: invokestatic 384	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   151: astore 8
    //   153: iconst_2
    //   154: istore 10
    //   156: iload 10
    //   158: anewarray 4	java/lang/Object
    //   161: astore 11
    //   163: aload 7
    //   165: invokevirtual 59	com/google/zxing/pdf417/decoder/BarcodeValue:getValue	()[I
    //   168: astore 12
    //   170: aload 12
    //   172: iconst_0
    //   173: iaload
    //   174: istore 13
    //   176: iload 13
    //   178: invokestatic 146	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   181: astore 12
    //   183: aload 11
    //   185: iconst_0
    //   186: aload 12
    //   188: aastore
    //   189: aload 7
    //   191: invokevirtual 59	com/google/zxing/pdf417/decoder/BarcodeValue:getValue	()[I
    //   194: astore 12
    //   196: aload 12
    //   198: iconst_0
    //   199: iaload
    //   200: istore 13
    //   202: aload 7
    //   204: iload 13
    //   206: invokevirtual 395	com/google/zxing/pdf417/decoder/BarcodeValue:getConfidence	(I)Ljava/lang/Integer;
    //   209: astore 7
    //   211: aload 11
    //   213: iload 6
    //   215: aload 7
    //   217: aastore
    //   218: aload_1
    //   219: aload 8
    //   221: aload 11
    //   223: invokevirtual 388	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   226: pop
    //   227: iload 4
    //   229: iconst_1
    //   230: iadd
    //   231: istore 4
    //   233: goto -162 -> 71
    //   236: ldc_w 397
    //   239: astore 5
    //   241: iconst_0
    //   242: anewarray 4	java/lang/Object
    //   245: astore 14
    //   247: aload_1
    //   248: aload 5
    //   250: aload 14
    //   252: invokevirtual 388	java/util/Formatter:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
    //   255: pop
    //   256: iload_3
    //   257: iconst_1
    //   258: iadd
    //   259: istore_3
    //   260: goto -248 -> 12
    //   263: aload_1
    //   264: invokevirtual 401	java/util/Formatter:toString	()Ljava/lang/String;
    //   267: astore_0
    //   268: aload_1
    //   269: invokevirtual 404	java/util/Formatter:close	()V
    //   272: aload_0
    //   273: areturn
    //   274: astore_0
    //   275: aload_0
    //   276: athrow
    //   277: astore_2
    //   278: aload_1
    //   279: invokevirtual 404	java/util/Formatter:close	()V
    //   282: goto +9 -> 291
    //   285: astore_1
    //   286: aload_0
    //   287: aload_1
    //   288: invokevirtual 410	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   291: aload_2
    //   292: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	293	0	paramArrayOfBarcodeValue	BarcodeValue[][]
    //   3	276	1	localFormatter	java.util.Formatter
    //   285	3	1	localThrowable	java.lang.Throwable
    //   9	1	2	localObject1	Object
    //   277	15	2	localObject2	Object
    //   11	249	3	i	int
    //   14	218	4	j	int
    //   25	224	5	str	String
    //   35	179	6	k	int
    //   42	174	7	localObject3	Object
    //   48	172	8	localObject4	Object
    //   79	47	9	m	int
    //   154	3	10	n	int
    //   161	61	11	arrayOfObject1	Object[]
    //   168	29	12	localObject5	Object
    //   174	31	13	i1	int
    //   245	6	14	arrayOfObject2	Object[]
    // Exception table:
    //   from	to	target	type
    //   12	14	274	finally
    //   27	32	274	finally
    //   37	42	274	finally
    //   44	48	274	finally
    //   53	56	274	finally
    //   59	65	274	finally
    //   72	74	274	finally
    //   76	79	274	finally
    //   90	93	274	finally
    //   95	100	274	finally
    //   102	105	274	finally
    //   117	122	274	finally
    //   133	138	274	finally
    //   146	151	274	finally
    //   156	161	274	finally
    //   163	168	274	finally
    //   172	174	274	finally
    //   176	181	274	finally
    //   186	189	274	finally
    //   189	194	274	finally
    //   198	200	274	finally
    //   204	209	274	finally
    //   215	218	274	finally
    //   221	227	274	finally
    //   241	245	274	finally
    //   250	256	274	finally
    //   263	267	274	finally
    //   275	277	277	finally
    //   278	282	285	finally
  }
  
  private static void verifyCodewordCount(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt.length;
    int j = 4;
    if (i >= j)
    {
      i = 0;
      j = paramArrayOfInt[0];
      int k = paramArrayOfInt.length;
      if (j <= k)
      {
        if (j == 0)
        {
          j = paramArrayOfInt.length;
          if (paramInt < j)
          {
            j = paramArrayOfInt.length - paramInt;
            paramArrayOfInt[0] = j;
          }
          else
          {
            throw FormatException.getFormatInstance();
          }
        }
        return;
      }
      throw FormatException.getFormatInstance();
    }
    throw FormatException.getFormatInstance();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.PDF417ScanningDecoder
 * JD-Core Version:    0.7.0.1
 */