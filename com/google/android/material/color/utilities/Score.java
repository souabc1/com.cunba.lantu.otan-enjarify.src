package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class Score
{
  private static final double CUTOFF_CHROMA = 15.0D;
  private static final double CUTOFF_EXCITED_PROPORTION = 0.01D;
  private static final double CUTOFF_TONE = 10.0D;
  private static final double TARGET_CHROMA = 48.0D;
  private static final double WEIGHT_CHROMA_ABOVE = 0.3D;
  private static final double WEIGHT_CHROMA_BELOW = 0.1D;
  private static final double WEIGHT_PROPORTION = 0.7D;
  
  private static List filter(Map paramMap1, Map paramMap2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    paramMap2 = paramMap2.entrySet().iterator();
    for (;;)
    {
      boolean bool = paramMap2.hasNext();
      if (!bool) {
        break;
      }
      Object localObject1 = (Map.Entry)paramMap2.next();
      Integer localInteger = (Integer)((Map.Entry)localObject1).getKey();
      int i = localInteger.intValue();
      localObject1 = (Cam16)((Map.Entry)localObject1).getValue();
      Object localObject2 = Integer.valueOf(i);
      localObject2 = (Double)paramMap1.get(localObject2);
      double d1 = ((Double)localObject2).doubleValue();
      double d2 = ((Cam16)localObject1).getChroma();
      double d3 = 15.0D;
      bool = d2 < d3;
      if (!bool)
      {
        d2 = ColorUtils.lstarFromArgb(i);
        d3 = 10.0D;
        bool = d2 < d3;
        if (!bool)
        {
          d2 = 0.01D;
          bool = d1 < d2;
          if (!bool)
          {
            localObject1 = Integer.valueOf(i);
            localArrayList.add(localObject1);
          }
        }
      }
    }
    return localArrayList;
  }
  
  public static List score(Map paramMap)
  {
    Object localObject1 = paramMap.entrySet().iterator();
    double d1 = 0.0D;
    double d3;
    for (double d2 = d1;; d2 += d3)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (Integer)((Map.Entry)((Iterator)localObject1).next()).getValue();
      i = ((Integer)localObject2).intValue();
      d3 = i;
    }
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    int i = 361;
    Object localObject2 = new double[i];
    paramMap = paramMap.entrySet().iterator();
    Object localObject3;
    int k;
    double d4;
    double d5;
    int j;
    double d6;
    for (;;)
    {
      boolean bool3 = paramMap.hasNext();
      if (!bool3) {
        break;
      }
      localObject3 = (Map.Entry)paramMap.next();
      k = ((Integer)((Map.Entry)localObject3).getKey()).intValue();
      d4 = ((Integer)((Map.Entry)localObject3).getValue()).intValue() / d2;
      localObject3 = Cam16.fromInt(k);
      Integer localInteger = Integer.valueOf(k);
      ((Map)localObject1).put(localInteger, localObject3);
      d5 = ((Cam16)localObject3).getHue();
      long l1 = Math.round(d5);
      j = (int)l1;
      d6 = localObject2[j] + d4;
      localObject2[j] = d6;
    }
    paramMap = new java/util/HashMap;
    paramMap.<init>();
    Object localObject4 = ((Map)localObject1).entrySet().iterator();
    Object localObject5;
    double d7;
    long l2;
    int m;
    for (;;)
    {
      boolean bool5 = ((Iterator)localObject4).hasNext();
      if (!bool5) {
        break;
      }
      localObject5 = (Map.Entry)((Iterator)localObject4).next();
      localObject3 = (Integer)((Map.Entry)localObject5).getKey();
      j = ((Integer)localObject3).intValue();
      localObject5 = (Cam16)((Map.Entry)localObject5).getValue();
      d7 = ((Cam16)localObject5).getHue();
      l2 = Math.round(d7);
      m = (int)l2;
      k = m + -15;
      d4 = d1;
      for (;;)
      {
        int n = m + 15;
        if (k >= n) {
          break;
        }
        n = MathUtils.sanitizeDegreesInt(k);
        d6 = localObject2[n];
        d4 += d6;
        k += 1;
      }
      localObject5 = Integer.valueOf(j);
      localObject3 = Double.valueOf(d4);
      paramMap.put(localObject5, localObject3);
    }
    Object localObject6 = new java/util/HashMap;
    ((HashMap)localObject6).<init>();
    Object localObject7 = ((Map)localObject1).entrySet().iterator();
    boolean bool6;
    for (;;)
    {
      bool6 = ((Iterator)localObject7).hasNext();
      if (!bool6) {
        break;
      }
      localObject4 = (Map.Entry)((Iterator)localObject7).next();
      localObject5 = (Integer)((Map.Entry)localObject4).getKey();
      m = ((Integer)localObject5).intValue();
      localObject4 = (Cam16)((Map.Entry)localObject4).getValue();
      localObject2 = Integer.valueOf(m);
      localObject2 = (Double)paramMap.get(localObject2);
      d3 = ((Double)localObject2).doubleValue() * 100.0D;
      l2 = 4604480259023595110L;
      d3 *= 0.7D;
      d7 = ((Cam16)localObject4).getChroma();
      double d8 = 48.0D;
      boolean bool4 = d7 < d8;
      if (bool4)
      {
        l2 = 4591870180066957722L;
        d7 = 0.1D;
      }
      else
      {
        l2 = 4599075939470750515L;
        d7 = 0.3D;
      }
      double d9 = (((Cam16)localObject4).getChroma() - d8) * d7;
      d3 += d9;
      localObject4 = Integer.valueOf(m);
      localObject5 = Double.valueOf(d3);
      ((Map)localObject6).put(localObject4, localObject5);
    }
    paramMap = filter(paramMap, (Map)localObject1);
    localObject7 = new java/util/HashMap;
    ((HashMap)localObject7).<init>();
    paramMap = paramMap.iterator();
    int i1;
    for (;;)
    {
      bool6 = paramMap.hasNext();
      if (!bool6) {
        break;
      }
      i1 = ((Integer)paramMap.next()).intValue();
      localObject5 = Integer.valueOf(i1);
      localObject4 = Integer.valueOf(i1);
      localObject4 = (Double)((Map)localObject6).get(localObject4);
      ((Map)localObject7).put(localObject5, localObject4);
    }
    paramMap = new java/util/ArrayList;
    localObject6 = ((Map)localObject7).entrySet();
    paramMap.<init>((Collection)localObject6);
    localObject6 = new com/google/android/material/color/utilities/Score$ScoredComparator;
    ((Score.ScoredComparator)localObject6).<init>();
    Collections.sort(paramMap, (Comparator)localObject6);
    localObject6 = new java/util/ArrayList;
    ((ArrayList)localObject6).<init>();
    paramMap = paramMap.iterator();
    for (;;)
    {
      boolean bool7 = paramMap.hasNext();
      if (!bool7) {
        break;
      }
      localObject7 = (Map.Entry)paramMap.next();
      i1 = ((Integer)((Map.Entry)localObject7).getKey()).intValue();
      localObject4 = Integer.valueOf(i1);
      localObject4 = (Cam16)((Map)localObject1).get(localObject4);
      localObject5 = ((List)localObject6).iterator();
      boolean bool2;
      do
      {
        bool2 = ((Iterator)localObject5).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (Integer)((Iterator)localObject5).next();
        localObject2 = (Cam16)((Map)localObject1).get(localObject2);
        d5 = ((Cam16)localObject4).getHue();
        d4 = ((Cam16)localObject2).getHue();
        d3 = MathUtils.differenceDegrees(d5, d4);
        l2 = 4624633867356078080L;
        d7 = 15.0D;
        bool2 = d3 < d7;
      } while (!bool2);
      i1 = 1;
      break label932;
      i1 = 0;
      localObject4 = null;
      label932:
      if (i1 == 0)
      {
        localObject7 = (Integer)((Map.Entry)localObject7).getKey();
        ((List)localObject6).add(localObject7);
      }
    }
    boolean bool8 = ((List)localObject6).isEmpty();
    if (bool8)
    {
      int i2 = -12417548;
      paramMap = Integer.valueOf(i2);
      ((List)localObject6).add(paramMap);
    }
    return localObject6;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.Score
 * JD-Core Version:    0.7.0.1
 */