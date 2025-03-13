package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FinderPatternFinder
{
  private static final int CENTER_QUORUM = 2;
  protected static final int MAX_MODULES = 97;
  protected static final int MIN_SKIP = 3;
  private static final FinderPatternFinder.EstimatedModuleComparator moduleComparator;
  private final int[] crossCheckStateCount;
  private boolean hasSkipped;
  private final BitMatrix image;
  private final List possibleCenters;
  private final ResultPointCallback resultPointCallback;
  
  static
  {
    FinderPatternFinder.EstimatedModuleComparator localEstimatedModuleComparator = new com/google/zxing/qrcode/detector/FinderPatternFinder$EstimatedModuleComparator;
    localEstimatedModuleComparator.<init>(null);
    moduleComparator = localEstimatedModuleComparator;
  }
  
  public FinderPatternFinder(BitMatrix paramBitMatrix)
  {
    this(paramBitMatrix, null);
  }
  
  public FinderPatternFinder(BitMatrix paramBitMatrix, ResultPointCallback paramResultPointCallback)
  {
    this.image = paramBitMatrix;
    paramBitMatrix = new java/util/ArrayList;
    paramBitMatrix.<init>();
    this.possibleCenters = paramBitMatrix;
    paramBitMatrix = new int[5];
    this.crossCheckStateCount = paramBitMatrix;
    this.resultPointCallback = paramResultPointCallback;
  }
  
  private static float centerFromEnd(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt[4];
    paramInt -= i;
    i = paramArrayOfInt[3];
    float f1 = paramInt - i;
    float f2 = paramArrayOfInt[2] / 2.0F;
    return f1 - f2;
  }
  
  private boolean crossCheckDiagonal(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = getCrossCheckStateCount();
    int i = 0;
    BitMatrix localBitMatrix1 = null;
    int j;
    int n;
    int i2;
    for (;;)
    {
      j = 2;
      n = 1;
      if ((paramInt1 < i) || (paramInt2 < i)) {
        break;
      }
      localBitMatrix2 = this.image;
      i1 = paramInt2 - i;
      i2 = paramInt1 - i;
      boolean bool4 = localBitMatrix2.get(i1, i2);
      if (!bool4) {
        break;
      }
      i4 = arrayOfInt[j] + n;
      arrayOfInt[j] = i4;
      i += 1;
    }
    int i4 = arrayOfInt[j];
    if (i4 == 0) {
      return false;
    }
    while ((paramInt1 >= i) && (paramInt2 >= i))
    {
      localBitMatrix2 = this.image;
      i1 = paramInt2 - i;
      i2 = paramInt1 - i;
      boolean bool5 = localBitMatrix2.get(i1, i2);
      if (bool5) {
        break;
      }
      i5 = arrayOfInt[n] + n;
      arrayOfInt[n] = i5;
      i += 1;
    }
    int i5 = arrayOfInt[n];
    if (i5 == 0) {
      return false;
    }
    while ((paramInt1 >= i) && (paramInt2 >= i))
    {
      localBitMatrix2 = this.image;
      i1 = paramInt2 - i;
      i2 = paramInt1 - i;
      boolean bool6 = localBitMatrix2.get(i1, i2);
      if (!bool6) {
        break;
      }
      i6 = arrayOfInt[0] + n;
      arrayOfInt[0] = i6;
      i += 1;
    }
    i = arrayOfInt[0];
    if (i == 0) {
      return false;
    }
    localBitMatrix1 = this.image;
    i = localBitMatrix1.getHeight();
    BitMatrix localBitMatrix2 = this.image;
    int i6 = localBitMatrix2.getWidth();
    int i1 = n;
    int i7;
    BitMatrix localBitMatrix3;
    int i3;
    for (;;)
    {
      i2 = paramInt1 + i1;
      if (i2 >= i) {
        break;
      }
      i7 = paramInt2 + i1;
      if (i7 >= i6) {
        break;
      }
      localBitMatrix3 = this.image;
      boolean bool3 = localBitMatrix3.get(i7, i2);
      if (!bool3) {
        break;
      }
      i3 = arrayOfInt[j] + n;
      arrayOfInt[j] = i3;
      i1 += 1;
    }
    for (;;)
    {
      j = paramInt1 + i1;
      i3 = 3;
      if (j >= i) {
        break;
      }
      i7 = paramInt2 + i1;
      if (i7 >= i6) {
        break;
      }
      localBitMatrix3 = this.image;
      boolean bool1 = localBitMatrix3.get(i7, j);
      if (bool1) {
        break;
      }
      k = arrayOfInt[i3] + n;
      arrayOfInt[i3] = k;
      i1 += 1;
    }
    int k = arrayOfInt[i3];
    if (k == 0) {
      return false;
    }
    for (;;)
    {
      k = paramInt1 + i1;
      i3 = 4;
      if (k >= i) {
        break;
      }
      i7 = paramInt2 + i1;
      if (i7 >= i6) {
        break;
      }
      localBitMatrix3 = this.image;
      boolean bool2 = localBitMatrix3.get(i7, k);
      if (!bool2) {
        break;
      }
      int m = arrayOfInt[i3] + n;
      arrayOfInt[i3] = m;
      i1 += 1;
    }
    paramInt1 = arrayOfInt[i3];
    if (paramInt1 == 0) {
      return false;
    }
    return foundPatternDiagonal(arrayOfInt);
  }
  
  private float crossCheckHorizontal(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    BitMatrix localBitMatrix = this.image;
    int i = localBitMatrix.getWidth();
    int[] arrayOfInt = getCrossCheckStateCount();
    int j = paramInt1;
    int m;
    int n;
    for (;;)
    {
      m = 2;
      n = 1;
      if (j < 0) {
        break;
      }
      boolean bool2 = localBitMatrix.get(j, paramInt2);
      if (!bool2) {
        break;
      }
      i1 = arrayOfInt[m] + n;
      arrayOfInt[m] = i1;
      j += -1;
    }
    int i1 = 2143289344;
    float f = 0.0F / 0.0F;
    if (j < 0) {
      return f;
    }
    int i2;
    while (j >= 0)
    {
      boolean bool3 = localBitMatrix.get(j, paramInt2);
      if (bool3) {
        break;
      }
      i2 = arrayOfInt[n];
      if (i2 > paramInt3) {
        break;
      }
      i2 += 1;
      arrayOfInt[n] = i2;
      j += -1;
    }
    if (j >= 0)
    {
      i2 = arrayOfInt[n];
      if (i2 <= paramInt3)
      {
        for (;;)
        {
          i2 = 0;
          if (j < 0) {
            break;
          }
          boolean bool4 = localBitMatrix.get(j, paramInt2);
          if (!bool4) {
            break;
          }
          int i3 = arrayOfInt[0];
          if (i3 > paramInt3) {
            break;
          }
          i3 += 1;
          arrayOfInt[0] = i3;
          j += -1;
        }
        j = arrayOfInt[0];
        if (j > paramInt3) {
          return f;
        }
        paramInt1 += n;
        int k;
        while (paramInt1 < i)
        {
          boolean bool1 = localBitMatrix.get(paramInt1, paramInt2);
          if (!bool1) {
            break;
          }
          k = arrayOfInt[m] + n;
          arrayOfInt[m] = k;
          paramInt1 += 1;
        }
        if (paramInt1 == i) {
          return f;
        }
        int i4;
        for (;;)
        {
          k = 3;
          if (paramInt1 >= i) {
            break;
          }
          boolean bool5 = localBitMatrix.get(paramInt1, paramInt2);
          if (bool5) {
            break;
          }
          i4 = arrayOfInt[k];
          if (i4 >= paramInt3) {
            break;
          }
          i4 += 1;
          arrayOfInt[k] = i4;
          paramInt1 += 1;
        }
        if (paramInt1 != i)
        {
          i4 = arrayOfInt[k];
          if (i4 < paramInt3)
          {
            for (;;)
            {
              i4 = 4;
              if (paramInt1 >= i) {
                break;
              }
              boolean bool6 = localBitMatrix.get(paramInt1, paramInt2);
              if (!bool6) {
                break;
              }
              int i5 = arrayOfInt[i4];
              if (i5 >= paramInt3) {
                break;
              }
              i5 += 1;
              arrayOfInt[i4] = i5;
              paramInt1 += 1;
            }
            paramInt2 = arrayOfInt[i4];
            if (paramInt2 >= paramInt3) {
              return f;
            }
            paramInt3 = arrayOfInt[0];
            int i6 = arrayOfInt[n];
            paramInt3 += i6;
            i6 = arrayOfInt[m];
            paramInt3 += i6;
            i6 = arrayOfInt[k];
            paramInt3 = paramInt3 + i6 + paramInt2 - paramInt4;
            paramInt2 = Math.abs(paramInt3) * 5;
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
  
  private float crossCheckVertical(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    BitMatrix localBitMatrix = this.image;
    int i = localBitMatrix.getHeight();
    int[] arrayOfInt = getCrossCheckStateCount();
    int j = paramInt1;
    int m;
    int n;
    for (;;)
    {
      m = 2;
      n = 1;
      if (j < 0) {
        break;
      }
      boolean bool2 = localBitMatrix.get(paramInt2, j);
      if (!bool2) {
        break;
      }
      i1 = arrayOfInt[m] + n;
      arrayOfInt[m] = i1;
      j += -1;
    }
    int i1 = 2143289344;
    float f = 0.0F / 0.0F;
    if (j < 0) {
      return f;
    }
    int i2;
    while (j >= 0)
    {
      boolean bool3 = localBitMatrix.get(paramInt2, j);
      if (bool3) {
        break;
      }
      i2 = arrayOfInt[n];
      if (i2 > paramInt3) {
        break;
      }
      i2 += 1;
      arrayOfInt[n] = i2;
      j += -1;
    }
    if (j >= 0)
    {
      i2 = arrayOfInt[n];
      if (i2 <= paramInt3)
      {
        for (;;)
        {
          i2 = 0;
          if (j < 0) {
            break;
          }
          boolean bool4 = localBitMatrix.get(paramInt2, j);
          if (!bool4) {
            break;
          }
          int i3 = arrayOfInt[0];
          if (i3 > paramInt3) {
            break;
          }
          i3 += 1;
          arrayOfInt[0] = i3;
          j += -1;
        }
        j = arrayOfInt[0];
        if (j > paramInt3) {
          return f;
        }
        paramInt1 += n;
        int k;
        while (paramInt1 < i)
        {
          boolean bool1 = localBitMatrix.get(paramInt2, paramInt1);
          if (!bool1) {
            break;
          }
          k = arrayOfInt[m] + n;
          arrayOfInt[m] = k;
          paramInt1 += 1;
        }
        if (paramInt1 == i) {
          return f;
        }
        int i4;
        for (;;)
        {
          k = 3;
          if (paramInt1 >= i) {
            break;
          }
          boolean bool5 = localBitMatrix.get(paramInt2, paramInt1);
          if (bool5) {
            break;
          }
          i4 = arrayOfInt[k];
          if (i4 >= paramInt3) {
            break;
          }
          i4 += 1;
          arrayOfInt[k] = i4;
          paramInt1 += 1;
        }
        if (paramInt1 != i)
        {
          i4 = arrayOfInt[k];
          if (i4 < paramInt3)
          {
            for (;;)
            {
              i4 = 4;
              if (paramInt1 >= i) {
                break;
              }
              boolean bool6 = localBitMatrix.get(paramInt2, paramInt1);
              if (!bool6) {
                break;
              }
              int i5 = arrayOfInt[i4];
              if (i5 >= paramInt3) {
                break;
              }
              i5 += 1;
              arrayOfInt[i4] = i5;
              paramInt1 += 1;
            }
            paramInt2 = arrayOfInt[i4];
            if (paramInt2 >= paramInt3) {
              return f;
            }
            paramInt3 = arrayOfInt[0];
            int i6 = arrayOfInt[n];
            paramInt3 += i6;
            i6 = arrayOfInt[m];
            paramInt3 += i6;
            i6 = arrayOfInt[k];
            paramInt3 = paramInt3 + i6 + paramInt2 - paramInt4;
            paramInt2 = Math.abs(paramInt3) * 5;
            paramInt4 *= m;
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
  
  public static void doClearCounts(int[] paramArrayOfInt)
  {
    Arrays.fill(paramArrayOfInt, 0);
  }
  
  public static void doShiftCounts2(int[] paramArrayOfInt)
  {
    int i = 2;
    int j = paramArrayOfInt[i];
    paramArrayOfInt[0] = j;
    j = 3;
    int k = paramArrayOfInt[j];
    int m = 1;
    paramArrayOfInt[m] = k;
    k = 4;
    int n = paramArrayOfInt[k];
    paramArrayOfInt[i] = n;
    paramArrayOfInt[j] = m;
    paramArrayOfInt[k] = 0;
  }
  
  private int findRowSkip()
  {
    Object localObject1 = this.possibleCenters;
    int i = ((List)localObject1).size();
    float f1 = 0.0F;
    int j = 1;
    float f2 = 1.4E-45F;
    if (i <= j) {
      return 0;
    }
    localObject1 = this.possibleCenters.iterator();
    Object localObject2 = null;
    FinderPattern localFinderPattern;
    int m;
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break label153;
      }
      localFinderPattern = (FinderPattern)((Iterator)localObject1).next();
      int k = localFinderPattern.getCount();
      m = 2;
      if (k >= m)
      {
        if (localObject2 != null) {
          break;
        }
        localObject2 = localFinderPattern;
      }
    }
    this.hasSkipped = j;
    float f3 = localObject2.getX();
    f1 = localFinderPattern.getX();
    f3 = Math.abs(f3 - f1);
    f1 = localObject2.getY();
    f2 = localFinderPattern.getY();
    f1 = Math.abs(f1 - f2);
    return (int)(f3 - f1) / m;
    label153:
    return 0;
  }
  
  public static boolean foundPatternCross(int[] paramArrayOfInt)
  {
    boolean bool1 = false;
    int i = 0;
    float f1 = 0.0F;
    int j = 0;
    float f2 = 0.0F;
    for (;;)
    {
      int k = 5;
      f3 = 7.006492E-045F;
      if (i >= k) {
        break;
      }
      k = paramArrayOfInt[i];
      if (k == 0) {
        return false;
      }
      j += k;
      i += 1;
    }
    i = 7;
    f1 = 9.809089E-045F;
    if (j < i) {
      return false;
    }
    f1 = j / 7.0F;
    j = 1073741824;
    f2 = f1 / 2.0F;
    float f3 = paramArrayOfInt[0];
    f3 = Math.abs(f1 - f3);
    boolean bool2 = f3 < f2;
    if (bool2)
    {
      bool2 = true;
      f3 = 1.4E-45F;
      float f4 = paramArrayOfInt[bool2];
      f4 = Math.abs(f1 - f4);
      boolean bool3 = f4 < f2;
      if (bool3)
      {
        f4 = 3.0F;
        float f5 = f1 * f4;
        int n = paramArrayOfInt[2];
        float f6 = n;
        f5 = Math.abs(f5 - f6);
        f4 *= f2;
        bool3 = f5 < f4;
        if (bool3)
        {
          f4 = paramArrayOfInt[3];
          f4 = Math.abs(f1 - f4);
          bool3 = f4 < f2;
          if (bool3)
          {
            int m = 4;
            f4 = 5.605194E-045F;
            float f7 = paramArrayOfInt[m];
            f1 -= f7;
            f7 = Math.abs(f1);
            boolean bool4 = f7 < f2;
            if (bool4) {
              bool1 = bool2;
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public static boolean foundPatternDiagonal(int[] paramArrayOfInt)
  {
    boolean bool1 = false;
    int i = 0;
    float f1 = 0.0F;
    int j = 0;
    float f2 = 0.0F;
    for (;;)
    {
      int k = 5;
      f3 = 7.006492E-045F;
      if (i >= k) {
        break;
      }
      k = paramArrayOfInt[i];
      if (k == 0) {
        return false;
      }
      j += k;
      i += 1;
    }
    i = 7;
    f1 = 9.809089E-045F;
    if (j < i) {
      return false;
    }
    f1 = j / 7.0F;
    j = 1068146622;
    f2 = f1 / 1.333F;
    float f3 = paramArrayOfInt[0];
    f3 = Math.abs(f1 - f3);
    boolean bool2 = f3 < f2;
    if (bool2)
    {
      bool2 = true;
      f3 = 1.4E-45F;
      float f4 = paramArrayOfInt[bool2];
      f4 = Math.abs(f1 - f4);
      boolean bool3 = f4 < f2;
      if (bool3)
      {
        f4 = 3.0F;
        float f5 = f1 * f4;
        int n = paramArrayOfInt[2];
        float f6 = n;
        f5 = Math.abs(f5 - f6);
        f4 *= f2;
        bool3 = f5 < f4;
        if (bool3)
        {
          f4 = paramArrayOfInt[3];
          f4 = Math.abs(f1 - f4);
          bool3 = f4 < f2;
          if (bool3)
          {
            int m = 4;
            f4 = 5.605194E-045F;
            float f7 = paramArrayOfInt[m];
            f1 -= f7;
            f7 = Math.abs(f1);
            boolean bool4 = f7 < f2;
            if (bool4) {
              bool1 = bool2;
            }
          }
        }
      }
    }
    return bool1;
  }
  
  private int[] getCrossCheckStateCount()
  {
    doClearCounts(this.crossCheckStateCount);
    return this.crossCheckStateCount;
  }
  
  private boolean haveMultiplyConfirmedCenters()
  {
    List localList = this.possibleCenters;
    int i = localList.size();
    Iterator localIterator = this.possibleCenters.iterator();
    boolean bool2 = false;
    float f1 = 0.0F;
    int j = 0;
    FinderPattern localFinderPattern1 = null;
    float f2 = 0.0F;
    float f3 = 0.0F;
    for (;;)
    {
      boolean bool4 = localIterator.hasNext();
      if (!bool4) {
        break;
      }
      FinderPattern localFinderPattern2 = (FinderPattern)localIterator.next();
      int k = localFinderPattern2.getCount();
      int m = 2;
      if (k >= m)
      {
        j += 1;
        float f4 = localFinderPattern2.getEstimatedModuleSize();
        f3 += f4;
      }
    }
    int n = 3;
    if (j < n) {
      return false;
    }
    float f5 = i;
    f5 = f3 / f5;
    localIterator = this.possibleCenters.iterator();
    for (;;)
    {
      boolean bool3 = localIterator.hasNext();
      if (!bool3) {
        break;
      }
      localFinderPattern1 = (FinderPattern)localIterator.next();
      f2 = Math.abs(localFinderPattern1.getEstimatedModuleSize() - f5);
      f1 += f2;
    }
    f5 = 0.05F;
    f3 *= f5;
    boolean bool1 = f1 < f3;
    if (!bool1) {
      bool2 = true;
    }
    return bool2;
  }
  
  private FinderPattern[] selectBestPatterns()
  {
    FinderPatternFinder localFinderPatternFinder = this;
    Object localObject1 = this.possibleCenters;
    int i = ((List)localObject1).size();
    int j = 3;
    if (i >= j)
    {
      localObject1 = this.possibleCenters.iterator();
      int m;
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject1).hasNext();
        m = 2;
        if (!bool2) {
          break;
        }
        localObject2 = (FinderPattern)((Iterator)localObject1).next();
        k = ((FinderPattern)localObject2).getCount();
        if (k < m) {
          ((Iterator)localObject1).remove();
        }
      }
      localObject1 = localFinderPatternFinder.possibleCenters;
      Object localObject2 = moduleComparator;
      ((List)localObject1).sort((Comparator)localObject2);
      localObject1 = new FinderPattern[j];
      j = 0;
      int k = 0;
      localObject2 = null;
      double d1 = 1.7976931348623157E+308D;
      Object localObject3;
      float f1;
      int i1;
      int i2;
      int i3;
      do
      {
        localObject3 = localFinderPatternFinder.possibleCenters;
        int n = ((List)localObject3).size() - m;
        if (k >= n) {
          break;
        }
        localObject3 = (FinderPattern)localFinderPatternFinder.possibleCenters.get(k);
        f1 = ((FinderPattern)localObject3).getEstimatedModuleSize();
        k += 1;
        i1 = k;
        localObject4 = localFinderPatternFinder.possibleCenters;
        i2 = ((List)localObject4).size();
        i3 = 1;
        i2 -= i3;
      } while (i1 >= i2);
      Object localObject4 = (FinderPattern)localFinderPatternFinder.possibleCenters.get(i1);
      double d2 = squaredDistance((FinderPattern)localObject3, (FinderPattern)localObject4);
      i1 += 1;
      int i4 = i1;
      for (;;)
      {
        Object localObject5 = localFinderPatternFinder.possibleCenters;
        int i5 = ((List)localObject5).size();
        if (i4 >= i5) {
          break;
        }
        localObject5 = (FinderPattern)localFinderPatternFinder.possibleCenters.get(i4);
        float f2 = ((FinderPattern)localObject5).getEstimatedModuleSize();
        float f3 = 1.4F * f1;
        boolean bool3 = f2 < f3;
        if (!bool3)
        {
          double d3 = squaredDistance((FinderPattern)localObject4, (FinderPattern)localObject5);
          double d4 = squaredDistance((FinderPattern)localObject3, (FinderPattern)localObject5);
          boolean bool4 = d2 < d3;
          if (bool4)
          {
            bool4 = d3 < d4;
            if (bool4)
            {
              bool4 = d2 < d4;
              if (bool4)
              {
                d5 = d2;
                break label458;
              }
              d5 = d4;
            }
            else
            {
              d5 = d2;
              double d6 = d3;
              d3 = d4;
              d4 = d6;
              break label458;
            }
          }
          else
          {
            bool4 = d3 < d4;
            if (!bool4) {
              break label446;
            }
            bool4 = d2 < d4;
            if (!bool4) {
              break label439;
            }
            d5 = d3;
            d3 = d4;
          }
          d4 = d2;
          break label458;
          label439:
          double d5 = d3;
          break label454;
          label446:
          d5 = d4;
          d4 = d3;
          label454:
          d3 = d2;
          label458:
          double d7 = 2.0D;
          d4 *= d7;
          d4 = Math.abs(d3 - d4);
          d5 *= d7;
          d3 = Math.abs(d3 - d5);
          d4 += d3;
          bool3 = d4 < d1;
          if (bool3)
          {
            localObject1[0] = localObject3;
            localObject1[i3] = localObject4;
            localObject1[m] = localObject5;
            d1 = d4;
          }
        }
        i4 += 1;
      }
      double d8 = 1.7976931348623157E+308D;
      boolean bool1 = d1 < d8;
      if (bool1) {
        return localObject1;
      }
      throw NotFoundException.getNotFoundInstance();
    }
    throw NotFoundException.getNotFoundInstance();
  }
  
  private static double squaredDistance(FinderPattern paramFinderPattern1, FinderPattern paramFinderPattern2)
  {
    float f1 = paramFinderPattern1.getX();
    float f2 = paramFinderPattern2.getX();
    double d1 = f1 - f2;
    float f3 = paramFinderPattern1.getY();
    float f4 = paramFinderPattern2.getY();
    double d2 = f3 - f4;
    d1 *= d1;
    d2 *= d2;
    return d1 + d2;
  }
  
  public final void clearCounts(int[] paramArrayOfInt)
  {
    doClearCounts(paramArrayOfInt);
  }
  
  public final FinderPatternInfo find(Map paramMap)
  {
    FinderPatternInfo localFinderPatternInfo = null;
    int i = 1;
    if (paramMap != null)
    {
      localObject = DecodeHintType.TRY_HARDER;
      bool1 = paramMap.containsKey(localObject);
      if (bool1)
      {
        bool1 = i;
        break label39;
      }
    }
    boolean bool1 = false;
    paramMap = null;
    label39:
    Object localObject = this.image;
    int k = ((BitMatrix)localObject).getHeight();
    BitMatrix localBitMatrix1 = this.image;
    int m = localBitMatrix1.getWidth();
    int n = k * 3 / 388;
    int i2 = 3;
    float f = 4.203895E-045F;
    if ((n < i2) || (bool1)) {
      n = i2;
    }
    int j = 5;
    paramMap = new int[j];
    int i3 = n + -1;
    boolean bool3 = false;
    while ((i3 < k) && (!bool3))
    {
      doClearCounts(paramMap);
      int i4 = 0;
      int i5 = 0;
      int i1;
      while (i4 < m)
      {
        BitMatrix localBitMatrix2 = this.image;
        int i7 = localBitMatrix2.get(i4, i3);
        int i8;
        if (i7 != 0)
        {
          i7 = i5 & 0x1;
          if (i7 == i) {
            i5 += 1;
          }
          i8 = paramMap[i5] + i;
          paramMap[i5] = i8;
        }
        else
        {
          i8 = i5 & 0x1;
          int i6;
          if (i8 == 0)
          {
            i8 = 4;
            if (i5 == i8)
            {
              boolean bool5 = foundPatternCross(paramMap);
              if (bool5)
              {
                bool5 = handlePossibleCenter(paramMap, i3, i4);
                if (bool5)
                {
                  boolean bool2 = this.hasSkipped;
                  i6 = 2;
                  if (bool2)
                  {
                    bool3 = haveMultiplyConfirmedCenters();
                  }
                  else
                  {
                    i1 = findRowSkip();
                    i8 = paramMap[i6];
                    if (i1 > i8)
                    {
                      i1 = i1 - i8 - i6;
                      i3 += i1;
                      i4 = m + -1;
                    }
                  }
                  doClearCounts(paramMap);
                  i1 = i6;
                  i6 = 0;
                  break label376;
                }
              }
              doShiftCounts2(paramMap);
              i6 = i2;
            }
            else
            {
              i6 += 1;
              i8 = paramMap[i6] + i;
              paramMap[i6] = i8;
            }
          }
          else
          {
            i8 = paramMap[i6] + i;
            paramMap[i6] = i8;
          }
        }
        label376:
        i4 += i;
      }
      boolean bool4 = foundPatternCross(paramMap);
      if (bool4)
      {
        bool4 = handlePossibleCenter(paramMap, i3, m);
        if (bool4)
        {
          i1 = paramMap[0];
          bool4 = this.hasSkipped;
          if (bool4) {
            bool3 = haveMultiplyConfirmedCenters();
          }
        }
      }
      i3 += i1;
    }
    paramMap = selectBestPatterns();
    ResultPoint.orderBestPatterns(paramMap);
    localFinderPatternInfo = new com/google/zxing/qrcode/detector/FinderPatternInfo;
    localFinderPatternInfo.<init>(paramMap);
    return localFinderPatternInfo;
  }
  
  public final BitMatrix getImage()
  {
    return this.image;
  }
  
  public final List getPossibleCenters()
  {
    return this.possibleCenters;
  }
  
  public final boolean handlePossibleCenter(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = paramArrayOfInt[0];
    boolean bool1 = true;
    int k = paramArrayOfInt[bool1];
    j += k;
    k = 2;
    int m = paramArrayOfInt[k];
    j += m;
    m = paramArrayOfInt[3];
    j += m;
    m = paramArrayOfInt[4];
    j += m;
    float f1 = centerFromEnd(paramArrayOfInt, paramInt2);
    paramInt2 = (int)f1;
    m = paramArrayOfInt[k];
    float f2 = crossCheckVertical(paramInt1, paramInt2, m, j);
    boolean bool2 = Float.isNaN(f2);
    if (!bool2)
    {
      int n = (int)f2;
      int i1 = paramArrayOfInt[k];
      float f3 = crossCheckHorizontal(paramInt2, n, i1, j);
      paramInt2 = Float.isNaN(f3);
      if (paramInt2 == 0)
      {
        paramInt2 = (int)f3;
        paramInt2 = crossCheckDiagonal(n, paramInt2);
        if (paramInt2 != 0)
        {
          f1 = j / 7.0F;
          j = 0;
          for (;;)
          {
            Object localObject2 = this.possibleCenters;
            k = ((List)localObject2).size();
            if (j >= k) {
              break;
            }
            localObject2 = (FinderPattern)this.possibleCenters.get(j);
            boolean bool3 = ((FinderPattern)localObject2).aboutEquals(f1, f2, f3);
            if (bool3)
            {
              localObject1 = this.possibleCenters;
              localObject2 = ((FinderPattern)localObject2).combineEstimate(f2, f3, f1);
              ((List)localObject1).set(j, localObject2);
              i = bool1;
              break;
            }
            j += 1;
          }
          if (i == 0)
          {
            localObject1 = new com/google/zxing/qrcode/detector/FinderPattern;
            ((FinderPattern)localObject1).<init>(f3, f2, f1);
            this.possibleCenters.add(localObject1);
            paramArrayOfInt = this.resultPointCallback;
            if (paramArrayOfInt != null) {
              paramArrayOfInt.foundPossibleResultPoint((ResultPoint)localObject1);
            }
          }
          return bool1;
        }
      }
    }
    return false;
  }
  
  public final boolean handlePossibleCenter(int[] paramArrayOfInt, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return handlePossibleCenter(paramArrayOfInt, paramInt1, paramInt2);
  }
  
  public final void shiftCounts2(int[] paramArrayOfInt)
  {
    doShiftCounts2(paramArrayOfInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.detector.FinderPatternFinder
 * JD-Core Version:    0.7.0.1
 */