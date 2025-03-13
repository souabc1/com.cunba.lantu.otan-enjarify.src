package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

public final class MonochromeRectangleDetector
{
  private static final int MAX_MODULES = 32;
  private final BitMatrix image;
  
  public MonochromeRectangleDetector(BitMatrix paramBitMatrix)
  {
    this.image = paramBitMatrix;
  }
  
  private int[] blackWhiteRange(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    int i = (paramInt3 + paramInt4) / 2;
    int j = i;
    BitMatrix localBitMatrix1;
    while (j >= paramInt3)
    {
      localBitMatrix1 = this.image;
      boolean bool1;
      if (paramBoolean)
      {
        bool1 = localBitMatrix1.get(j, paramInt1);
        if (!bool1) {
          break label71;
        }
      }
      else
      {
        bool1 = localBitMatrix1.get(paramInt1, j);
        if (!bool1) {
          break label71;
        }
      }
      j += -1;
      continue;
      label71:
      int k = j;
      boolean bool3;
      do
      {
        BitMatrix localBitMatrix2;
        do
        {
          k += -1;
          if (k < paramInt3) {
            break label131;
          }
          localBitMatrix2 = this.image;
          if (!paramBoolean) {
            break;
          }
          bool3 = localBitMatrix2.get(k, paramInt1);
        } while (!bool3);
        break;
        bool3 = localBitMatrix2.get(paramInt1, k);
      } while (!bool3);
      label131:
      int n = j - k;
      if ((k < paramInt3) || (n > paramInt2)) {
        break;
      }
      j = k;
    }
    j += 1;
    while (i < paramInt4)
    {
      BitMatrix localBitMatrix3 = this.image;
      if (paramBoolean)
      {
        paramInt3 = localBitMatrix3.get(i, paramInt1);
        if (paramInt3 == 0) {
          break label222;
        }
      }
      else
      {
        paramInt3 = localBitMatrix3.get(paramInt1, i);
        if (paramInt3 == 0) {
          break label222;
        }
      }
      i += 1;
      continue;
      label222:
      paramInt3 = i;
      boolean bool2;
      do
      {
        do
        {
          paramInt3 += 1;
          if (paramInt3 >= paramInt4) {
            break label277;
          }
          localBitMatrix1 = this.image;
          if (!paramBoolean) {
            break;
          }
          bool2 = localBitMatrix1.get(paramInt3, paramInt1);
        } while (!bool2);
        break;
        bool2 = localBitMatrix1.get(paramInt1, paramInt3);
      } while (!bool2);
      label277:
      int m = paramInt3 - i;
      if ((paramInt3 >= paramInt4) || (m > paramInt2)) {
        break;
      }
      i = paramInt3;
    }
    i += -1;
    int[] arrayOfInt;
    if (i > j)
    {
      arrayOfInt = new int[] { j, i };
    }
    else
    {
      paramInt1 = 0;
      arrayOfInt = null;
    }
    return arrayOfInt;
  }
  
  private ResultPoint findCornerFromCenter(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    int i = paramInt1;
    int j = paramInt5;
    float f1 = 0.0F;
    Object localObject1 = null;
    int k = paramInt8;
    int m = paramInt1;
    int n = paramInt5;
    while ((n < k) && (n >= paramInt7) && (m < paramInt4) && (m >= paramInt3))
    {
      boolean bool;
      int i1;
      int i2;
      int i3;
      int i4;
      if (paramInt2 == 0)
      {
        bool = true;
        localObject2 = this;
        i1 = n;
        i2 = paramInt9;
        i3 = paramInt3;
        i4 = paramInt4;
      }
      else
      {
        bool = false;
        localObject2 = this;
        i1 = m;
        i2 = paramInt9;
        i3 = paramInt7;
        i4 = paramInt8;
      }
      Object localObject2 = ((MonochromeRectangleDetector)localObject2).blackWhiteRange(i1, i2, i3, i4, bool);
      if (localObject2 == null)
      {
        if (localObject1 != null)
        {
          int i5 = 0;
          localObject2 = null;
          i1 = 1;
          if (paramInt2 == 0)
          {
            n -= paramInt6;
            j = localObject1[0];
            if (j < i)
            {
              i2 = localObject1[i1];
              if (i2 > i)
              {
                localResultPoint1 = new com/google/zxing/ResultPoint;
                if (paramInt6 <= 0) {
                  i5 = i1;
                }
                f2 = localObject1[i5];
                f1 = n;
                localResultPoint1.<init>(f2, f1);
                return localResultPoint1;
              }
              localResultPoint1 = new com/google/zxing/ResultPoint;
              f2 = j;
              f1 = n;
              localResultPoint1.<init>(f2, f1);
              return localResultPoint1;
            }
            localResultPoint1 = new com/google/zxing/ResultPoint;
            f2 = localObject1[i1];
            f1 = n;
            localResultPoint1.<init>(f2, f1);
            return localResultPoint1;
          }
          m -= paramInt2;
          i = localObject1[0];
          if (i < j)
          {
            i2 = localObject1[i1];
            if (i2 > j)
            {
              localResultPoint1 = new com/google/zxing/ResultPoint;
              f2 = m;
              if (paramInt2 >= 0) {
                i5 = i1;
              }
              f1 = localObject1[i5];
              localResultPoint1.<init>(f2, f1);
              return localResultPoint1;
            }
            ResultPoint localResultPoint2 = new com/google/zxing/ResultPoint;
            f1 = m;
            float f3 = i;
            localResultPoint2.<init>(f1, f3);
            return localResultPoint2;
          }
          ResultPoint localResultPoint1 = new com/google/zxing/ResultPoint;
          float f2 = m;
          f1 = localObject1[i1];
          localResultPoint1.<init>(f2, f1);
          return localResultPoint1;
        }
        throw NotFoundException.getNotFoundInstance();
      }
      n += paramInt6;
      m += paramInt2;
      localObject1 = localObject2;
    }
    throw NotFoundException.getNotFoundInstance();
  }
  
  public ResultPoint[] detect()
  {
    int i = this.image.getHeight();
    int j = this.image.getWidth();
    int k = i / 2;
    int m = j / 2;
    int n = i / 256;
    int i1 = 1;
    int i2 = Math.max(i1, n);
    n = j / 256;
    int i3 = Math.max(i1, n);
    int i4 = -i2;
    int i5 = m / 2;
    Object localObject = this;
    int i6 = i4;
    int i7 = i3;
    i3 = i;
    int i8 = i2;
    i2 = i5;
    int i9 = (int)findCornerFromCenter(m, 0, 0, j, k, i4, 0, i, i5).getY() + -1;
    i2 = i7;
    int i10 = -i7;
    i7 = k / 2;
    localObject = this;
    int i11 = i2;
    i2 = i7;
    ResultPoint localResultPoint1 = findCornerFromCenter(m, i10, 0, j, k, 0, i9, i, i7);
    int i12 = (int)localResultPoint1.getX() + -1;
    i10 = i11;
    ResultPoint localResultPoint2 = findCornerFromCenter(m, i11, i12, j, k, 0, i9, i, i7);
    i11 = (int)localResultPoint2.getX() + 1;
    i4 = i8;
    i2 = i5;
    ResultPoint localResultPoint3 = findCornerFromCenter(m, 0, i12, i11, k, i8, i9, i, i5);
    i3 = (int)localResultPoint3.getY() + 1;
    i2 = m / 4;
    i4 = i6;
    localObject = findCornerFromCenter(m, 0, i12, i11, k, i6, i9, i3, i2);
    ResultPoint[] arrayOfResultPoint = new ResultPoint[4];
    arrayOfResultPoint[0] = localObject;
    arrayOfResultPoint[i1] = localResultPoint1;
    arrayOfResultPoint[2] = localResultPoint2;
    arrayOfResultPoint[3] = localResultPoint3;
    return arrayOfResultPoint;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.detector.MonochromeRectangleDetector
 * JD-Core Version:    0.7.0.1
 */