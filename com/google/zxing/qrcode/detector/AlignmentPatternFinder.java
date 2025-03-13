package com.google.zxing.qrcode.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class AlignmentPatternFinder
{
  private final int[] crossCheckStateCount;
  private final int height;
  private final BitMatrix image;
  private final float moduleSize;
  private final List possibleCenters;
  private final ResultPointCallback resultPointCallback;
  private final int startX;
  private final int startY;
  private final int width;
  
  public AlignmentPatternFinder(BitMatrix paramBitMatrix, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, ResultPointCallback paramResultPointCallback)
  {
    this.image = paramBitMatrix;
    paramBitMatrix = new java/util/ArrayList;
    paramBitMatrix.<init>(5);
    this.possibleCenters = paramBitMatrix;
    this.startX = paramInt1;
    this.startY = paramInt2;
    this.width = paramInt3;
    this.height = paramInt4;
    this.moduleSize = paramFloat;
    paramBitMatrix = new int[3];
    this.crossCheckStateCount = paramBitMatrix;
    this.resultPointCallback = paramResultPointCallback;
  }
  
  private static float centerFromEnd(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt[2];
    float f1 = paramInt - i;
    float f2 = paramArrayOfInt[1] / 2.0F;
    return f1 - f2;
  }
  
  private float crossCheckVertical(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    BitMatrix localBitMatrix = this.image;
    int i = localBitMatrix.getHeight();
    int[] arrayOfInt = this.crossCheckStateCount;
    arrayOfInt[0] = 0;
    int j = 1;
    arrayOfInt[j] = 0;
    int k = 2;
    arrayOfInt[k] = 0;
    int m = paramInt1;
    while (m >= 0)
    {
      boolean bool3 = localBitMatrix.get(paramInt2, m);
      if (!bool3) {
        break;
      }
      i2 = arrayOfInt[j];
      if (i2 > paramInt3) {
        break;
      }
      i2 += 1;
      arrayOfInt[j] = i2;
      m += -1;
    }
    int i2 = 2143289344;
    float f = 0.0F / 0.0F;
    if (m >= 0)
    {
      int i3 = arrayOfInt[j];
      if (i3 <= paramInt3)
      {
        while (m >= 0)
        {
          boolean bool4 = localBitMatrix.get(paramInt2, m);
          if (bool4) {
            break;
          }
          int i4 = arrayOfInt[0];
          if (i4 > paramInt3) {
            break;
          }
          i4 += 1;
          arrayOfInt[0] = i4;
          m += -1;
        }
        m = arrayOfInt[0];
        if (m > paramInt3) {
          return f;
        }
        paramInt1 += j;
        int n;
        while (paramInt1 < i)
        {
          boolean bool1 = localBitMatrix.get(paramInt2, paramInt1);
          if (!bool1) {
            break;
          }
          n = arrayOfInt[j];
          if (n > paramInt3) {
            break;
          }
          n += 1;
          arrayOfInt[j] = n;
          paramInt1 += 1;
        }
        if (paramInt1 != i)
        {
          n = arrayOfInt[j];
          if (n <= paramInt3)
          {
            while (paramInt1 < i)
            {
              boolean bool2 = localBitMatrix.get(paramInt2, paramInt1);
              if (bool2) {
                break;
              }
              int i1 = arrayOfInt[k];
              if (i1 > paramInt3) {
                break;
              }
              i1 += 1;
              arrayOfInt[k] = i1;
              paramInt1 += 1;
            }
            paramInt2 = arrayOfInt[k];
            if (paramInt2 > paramInt3) {
              return f;
            }
            paramInt3 = arrayOfInt[0];
            int i5 = arrayOfInt[j];
            paramInt3 = paramInt3 + i5 + paramInt2 - paramInt4;
            paramInt2 = Math.abs(paramInt3) * 5;
            paramInt4 *= k;
            if (paramInt2 >= paramInt4) {
              return f;
            }
            paramInt2 = foundPatternCross(arrayOfInt);
            if (paramInt2 != 0) {
              f = centerFromEnd(arrayOfInt, paramInt1);
            }
          }
        }
      }
    }
    return f;
  }
  
  private boolean foundPatternCross(int[] paramArrayOfInt)
  {
    float f1 = this.moduleSize;
    float f2 = f1 / 2.0F;
    int i = 0;
    for (;;)
    {
      int j = 3;
      float f3 = 4.203895E-045F;
      if (i >= j) {
        break;
      }
      f3 = paramArrayOfInt[i];
      f3 = Math.abs(f1 - f3);
      boolean bool = f3 < f2;
      if (!bool) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  private AlignmentPattern handlePossibleCenter(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject = null;
    int j = paramArrayOfInt[0];
    boolean bool3 = true;
    int m = paramArrayOfInt[bool3];
    j += m;
    m = 2;
    int n = paramArrayOfInt[m];
    j += n;
    float f2 = centerFromEnd(paramArrayOfInt, paramInt2);
    n = (int)f2;
    int i1 = paramArrayOfInt[bool3] * m;
    float f3 = crossCheckVertical(paramInt1, n, i1, j);
    boolean bool1 = Float.isNaN(f3);
    if (!bool1)
    {
      i = paramArrayOfInt[0];
      int k = paramArrayOfInt[bool3];
      i += k;
      int i2 = paramArrayOfInt[m];
      float f4 = i + i2;
      i = 1077936128;
      f1 = 3.0F;
      f4 /= f1;
      localObject = this.possibleCenters.iterator();
      AlignmentPattern localAlignmentPattern;
      do
      {
        boolean bool2 = ((Iterator)localObject).hasNext();
        if (!bool2) {
          break;
        }
        localAlignmentPattern = (AlignmentPattern)((Iterator)localObject).next();
        bool3 = localAlignmentPattern.aboutEquals(f4, f3, f2);
      } while (!bool3);
      return localAlignmentPattern.combineEstimate(f3, f2, f4);
      localObject = new com/google/zxing/qrcode/detector/AlignmentPattern;
      ((AlignmentPattern)localObject).<init>(f2, f3, f4);
      this.possibleCenters.add(localObject);
      paramArrayOfInt = this.resultPointCallback;
      if (paramArrayOfInt != null) {
        paramArrayOfInt.foundPossibleResultPoint((ResultPoint)localObject);
      }
    }
    return null;
  }
  
  public AlignmentPattern find()
  {
    int i = this.startX;
    int j = this.height;
    int k = this.width + i;
    int m = this.startY;
    int n = j / 2;
    m += n;
    n = 3;
    int[] arrayOfInt = new int[n];
    int i1 = 0;
    while (i1 < j)
    {
      int i2 = i1 & 0x1;
      int i3 = 2;
      if (i2 == 0) {
        i2 = (i1 + 1) / i3;
      } else {
        i2 = -((i1 + 1) / i3);
      }
      i2 += m;
      arrayOfInt[0] = 0;
      int i4 = 1;
      arrayOfInt[i4] = 0;
      arrayOfInt[i3] = 0;
      int i5 = i;
      while (i5 < k)
      {
        localObject = this.image;
        i6 = ((BitMatrix)localObject).get(i5, i2);
        if (i6 != 0) {
          break;
        }
        i5 += 1;
      }
      int i6 = 0;
      Object localObject = null;
      while (i5 < k)
      {
        BitMatrix localBitMatrix = this.image;
        boolean bool4 = localBitMatrix.get(i5, i2);
        int i9;
        int i7;
        if (bool4)
        {
          if (i6 == i4)
          {
            i9 = arrayOfInt[i4] + i4;
            arrayOfInt[i4] = i9;
          }
          else if (i6 == i3)
          {
            boolean bool3 = foundPatternCross(arrayOfInt);
            if (bool3)
            {
              localObject = handlePossibleCenter(arrayOfInt, i2, i5);
              if (localObject != null) {
                return localObject;
              }
            }
            i7 = arrayOfInt[i3];
            arrayOfInt[0] = i7;
            arrayOfInt[i4] = i4;
            arrayOfInt[i3] = 0;
            i7 = i4;
          }
          else
          {
            i7 += 1;
            i9 = arrayOfInt[i7] + i4;
            arrayOfInt[i7] = i9;
          }
        }
        else
        {
          int i8;
          if (i7 == i4) {
            i7 += 1;
          }
          i9 = arrayOfInt[i8] + i4;
          arrayOfInt[i8] = i9;
        }
        i5 += 1;
      }
      boolean bool2 = foundPatternCross(arrayOfInt);
      if (bool2)
      {
        AlignmentPattern localAlignmentPattern = handlePossibleCenter(arrayOfInt, i2, k);
        if (localAlignmentPattern != null) {
          return localAlignmentPattern;
        }
      }
      i1 += 1;
    }
    List localList = this.possibleCenters;
    boolean bool1 = localList.isEmpty();
    if (!bool1) {
      return (AlignmentPattern)this.possibleCenters.get(0);
    }
    throw NotFoundException.getNotFoundInstance();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.detector.AlignmentPatternFinder
 * JD-Core Version:    0.7.0.1
 */