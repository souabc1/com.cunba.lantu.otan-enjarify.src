package com.google.android.material.color.utilities;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public final class QuantizerWsmeans
{
  private static final int MAX_ITERATIONS = 10;
  private static final double MIN_MOVEMENT_DISTANCE = 3.0D;
  
  public static Map quantize(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt)
  {
    Object localObject1 = paramArrayOfInt1;
    Object localObject2 = paramArrayOfInt2;
    Object localObject3 = new java/util/Random;
    long l = 272008L;
    ((Random)localObject3).<init>(l);
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>();
    int i = paramArrayOfInt1.length;
    Object localObject4 = new double[i][];
    int j = paramArrayOfInt1.length;
    Object localObject5 = new int[j];
    PointProviderLab localPointProviderLab = new com/google/android/material/color/utilities/PointProviderLab;
    localPointProviderLab.<init>();
    int k = 0;
    Object localObject6 = null;
    int m = 0;
    Object localObject7 = null;
    int i1;
    Object localObject10;
    for (;;)
    {
      n = localObject1.length;
      i1 = 1;
      if (k >= n) {
        break;
      }
      n = localObject1[k];
      localObject8 = Integer.valueOf(n);
      localObject8 = (Integer)localLinkedHashMap.get(localObject8);
      if (localObject8 == null)
      {
        localObject8 = localPointProviderLab.fromInt(n);
        localObject4[m] = localObject8;
        localObject5[m] = n;
        m += 1;
        localObject9 = Integer.valueOf(n);
        localObject10 = Integer.valueOf(i1);
      }
      else
      {
        localObject9 = Integer.valueOf(n);
        i2 = ((Integer)localObject8).intValue() + i1;
        localObject10 = Integer.valueOf(i2);
      }
      localLinkedHashMap.put(localObject9, localObject10);
      k += 1;
    }
    localObject1 = new int[m];
    k = 0;
    localObject6 = null;
    while (k < m)
    {
      localObject9 = Integer.valueOf(localObject5[k]);
      localObject9 = (Integer)localLinkedHashMap.get(localObject9);
      n = ((Integer)localObject9).intValue();
      localObject1[k] = n;
      k += 1;
    }
    k = paramInt;
    int i3 = Math.min(paramInt, m);
    j = localObject2.length;
    if (j != 0)
    {
      j = localObject2.length;
      i3 = Math.min(i3, j);
    }
    localObject5 = new double[i3][];
    k = 0;
    localObject6 = null;
    int n = 0;
    Object localObject9 = null;
    for (;;)
    {
      i2 = localObject2.length;
      if (k >= i2) {
        break;
      }
      i2 = localObject2[k];
      localObject8 = localPointProviderLab.fromInt(i2);
      localObject5[k] = localObject8;
      n += 1;
      k += 1;
    }
    int i4 = i3 - n;
    if (i4 > 0)
    {
      k = 0;
      localObject6 = null;
      while (k < i4) {
        k += 1;
      }
    }
    localObject2 = new int[m];
    k = 0;
    localObject6 = null;
    while (k < m)
    {
      n = ((Random)localObject3).nextInt(i3);
      localObject2[k] = n;
      k += 1;
    }
    localObject3 = new int[i3][];
    k = 0;
    localObject6 = null;
    while (k < i3)
    {
      localObject9 = new int[i3];
      localObject3[k] = localObject9;
      k += 1;
    }
    localObject6 = new QuantizerWsmeans.Distance[i3][];
    n = 0;
    localObject9 = null;
    Object localObject11;
    QuantizerWsmeans.Distance localDistance;
    while (n < i3)
    {
      localObject8 = new QuantizerWsmeans.Distance[i3];
      localObject6[n] = localObject8;
      i2 = 0;
      localObject8 = null;
      while (i2 < i3)
      {
        localObject11 = localObject6[n];
        localDistance = new com/google/android/material/color/utilities/QuantizerWsmeans$Distance;
        localDistance.<init>();
        localObject11[i2] = localDistance;
        i2 += 1;
      }
      n += 1;
    }
    localObject9 = new int[i3];
    int i2 = 0;
    Object localObject8 = null;
    for (;;)
    {
      int i5 = 10;
      if (i2 >= i5) {
        break;
      }
      i5 = 0;
      localObject11 = null;
      int i7;
      while (i5 < i3)
      {
        i6 = i5 + 1;
        i7 = i6;
        while (i7 < i3)
        {
          localObject10 = localObject5[i5];
          arrayOfDouble = localObject5[i7];
          paramArrayOfInt1 = (int[])localObject9;
          double d1 = localPointProviderLab.distance((double[])localObject10, arrayOfDouble);
          arrayOfDouble = localObject6[i7][i5];
          arrayOfDouble.distance = d1;
          arrayOfDouble.index = i5;
          arrayOfDouble = localObject6[i5][i7];
          arrayOfDouble.distance = d1;
          arrayOfDouble.index = i7;
          i7 += 1;
          i1 = 1;
        }
        paramArrayOfInt1 = (int[])localObject9;
        Arrays.sort(localObject6[i5]);
        i8 = 0;
        arrayOfDouble = null;
        while (i8 < i3)
        {
          localObject9 = localObject3[i5];
          localObject10 = localObject6[i5][i8];
          i1 = ((QuantizerWsmeans.Distance)localObject10).index;
          localObject9[i8] = i1;
          i8 += 1;
        }
        i1 = 1;
        localObject9 = paramArrayOfInt1;
        i5 = i6;
      }
      paramArrayOfInt1 = (int[])localObject9;
      i8 = 0;
      arrayOfDouble = null;
      n = 0;
      localObject9 = null;
      double d2;
      double d3;
      double d5;
      while (i8 < m)
      {
        localObject10 = localObject4[i8];
        i5 = localObject2[i8];
        localDistance = localObject5[i5];
        d2 = localPointProviderLab.distance((double[])localObject10, localDistance);
        paramArrayOfInt2 = (int[])localObject3;
        localObject12 = localObject1;
        d3 = d2;
        i9 = -1;
        int i10 = 0;
        localObject3 = null;
        double d4;
        while (i10 < i3)
        {
          Object localObject13 = localObject6[i5];
          localObject14 = localObject6;
          localObject6 = localObject13[i10];
          i12 = m;
          d4 = ((QuantizerWsmeans.Distance)localObject6).distance;
          d5 = 4.0D * d2;
          bool2 = d4 < d5;
          if (bool2)
          {
            localObject6 = localObject5[i10];
            d4 = localPointProviderLab.distance((double[])localObject10, (double[])localObject6);
            boolean bool4 = d4 < d3;
            if (bool4)
            {
              i9 = i10;
              d3 = d4;
            }
          }
          i10 += 1;
          m = i12;
          localObject6 = localObject14;
        }
        localObject14 = localObject6;
        i12 = m;
        i10 = -1;
        if (i9 != i10)
        {
          d4 = Math.sqrt(d3);
          double d6 = Math.sqrt(d2);
          d4 = Math.abs(d4 - d6);
          d6 = 3.0D;
          boolean bool3 = d4 < d6;
          if (bool3)
          {
            n += 1;
            localObject2[i8] = i9;
          }
        }
        i8 += 1;
        localObject3 = paramArrayOfInt2;
        localObject1 = localObject12;
        m = i12;
        localObject6 = localObject14;
      }
      Object localObject12 = localObject1;
      paramArrayOfInt2 = (int[])localObject3;
      Object localObject14 = localObject6;
      int i12 = m;
      if ((n == 0) && (i2 != 0))
      {
        i2 = 0;
        localObject8 = null;
        localObject7 = paramArrayOfInt1;
        break label1551;
      }
      localObject1 = new double[i3];
      localObject3 = new double[i3];
      arrayOfDouble = new double[i3];
      localObject7 = paramArrayOfInt1;
      boolean bool2 = false;
      localObject6 = null;
      Arrays.fill(paramArrayOfInt1, 0);
      n = 0;
      localObject9 = null;
      double d7;
      for (;;)
      {
        i5 = i12;
        if (n >= i12) {
          break;
        }
        i6 = localObject2[n];
        Object localObject15 = localObject4[n];
        i1 = localObject12[n];
        int i13 = localObject7[i6] + i1;
        localObject7[i6] = i13;
        d3 = localObject1[i6];
        d5 = localObject15[0];
        bool2 = i2;
        d7 = i1;
        d5 *= d7;
        d3 += d5;
        localObject1[i6] = d3;
        d3 = localObject3[i6];
        int i14 = 1;
        d5 = localObject15[i14] * d7;
        d3 += d5;
        localObject3[i6] = d3;
        d3 = arrayOfDouble[i6];
        d5 = localObject15[2] * d7;
        d3 += d5;
        arrayOfDouble[i6] = d3;
        n += 1;
        bool2 = false;
        localObject6 = null;
      }
      bool2 = i2;
      n = 0;
      localObject9 = null;
      while (n < i3)
      {
        i1 = localObject7[n];
        if (i1 == 0)
        {
          i1 = 3;
          localObject10 = new double[i1];
          Object tmp1381_1379 = localObject10;
          tmp1381_1379[0] = 0.0D;
          Object tmp1385_1381 = tmp1381_1379;
          tmp1385_1381[1] = 0.0D;
          tmp1385_1381[2] = 0.0D;
          localObject5[n] = localObject10;
          i2 = 0;
          localObject8 = null;
          i6 = 1;
          i7 = 2;
        }
        else
        {
          d2 = localObject1[n];
          tmp1385_1381 = i1;
          d2 /= tmp1385_1381;
          d3 = localObject3[n] / tmp1385_1381;
          d5 = arrayOfDouble[n] / tmp1385_1381;
          localObject10 = localObject5[n];
          i2 = 0;
          localObject8 = null;
          localObject10[0] = d2;
          i6 = 1;
          localObject10[i6] = d3;
          i7 = 2;
          localObject10[i7] = d5;
        }
        n += 1;
      }
      localObject8 = null;
      int i6 = 1;
      int i9 = bool2 + true;
      localObject3 = paramArrayOfInt2;
      i2 = i9;
      localObject9 = localObject7;
      m = i5;
      i1 = i6;
      localObject1 = localObject12;
      localObject6 = localObject14;
    }
    localObject7 = localObject9;
    i2 = 0;
    localObject8 = null;
    label1551:
    localObject1 = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject1).<init>();
    int i8 = 0;
    double[] arrayOfDouble = null;
    while (i8 < i3)
    {
      i4 = localObject7[i8];
      if (i4 != 0)
      {
        localObject3 = localObject5[i8];
        int i11 = localPointProviderLab.toInt((double[])localObject3);
        localObject4 = Integer.valueOf(i11);
        boolean bool1 = ((Map)localObject1).containsKey(localObject4);
        if (!bool1)
        {
          localObject3 = Integer.valueOf(i11);
          localObject2 = Integer.valueOf(i4);
          ((Map)localObject1).put(localObject3, localObject2);
        }
      }
      i8 += 1;
    }
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.QuantizerWsmeans
 * JD-Core Version:    0.7.0.1
 */