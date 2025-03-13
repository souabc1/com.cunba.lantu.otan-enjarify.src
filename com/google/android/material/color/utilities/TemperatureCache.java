package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public final class TemperatureCache
{
  private final Hct input;
  private Hct precomputedComplement;
  private List precomputedHctsByHue;
  private List precomputedHctsByTemp;
  private Map precomputedTempsByHct;
  
  private TemperatureCache()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public TemperatureCache(Hct paramHct)
  {
    this.input = paramHct;
  }
  
  private Hct getColdest()
  {
    return (Hct)getHctsByTemp().get(0);
  }
  
  private List getHctsByHue()
  {
    Object localObject = this.precomputedHctsByHue;
    if (localObject != null) {
      return localObject;
    }
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    double d2;
    for (double d1 = 0.0D;; d1 += d2)
    {
      d2 = 360.0D;
      boolean bool = d1 < d2;
      if (bool) {
        break;
      }
      double d3 = this.input.getChroma();
      double d4 = this.input.getTone();
      d2 = d1;
      Hct localHct = Hct.from(d1, d3, d4);
      ((List)localObject).add(localHct);
      d2 = 1.0D;
    }
    localObject = Collections.unmodifiableList((List)localObject);
    this.precomputedHctsByHue = ((List)localObject);
    return localObject;
  }
  
  private List getHctsByTemp()
  {
    Object localObject1 = this.precomputedHctsByTemp;
    if (localObject1 != null) {
      return localObject1;
    }
    localObject1 = new java/util/ArrayList;
    Object localObject2 = getHctsByHue();
    ((ArrayList)localObject1).<init>((Collection)localObject2);
    localObject2 = this.input;
    ((List)localObject1).add(localObject2);
    localObject2 = new com/google/android/material/color/utilities/oO00O0o;
    ((oO00O0o)localObject2).<init>(this);
    oOo00OO0 localoOo00OO0 = new com/google/android/material/color/utilities/oOo00OO0;
    localoOo00OO0.<init>();
    localObject2 = Comparator.comparing((Function)localObject2, localoOo00OO0);
    Collections.sort((List)localObject1, (Comparator)localObject2);
    this.precomputedHctsByTemp = ((List)localObject1);
    return localObject1;
  }
  
  private Map getTempsByHct()
  {
    Object localObject1 = this.precomputedTempsByHct;
    if (localObject1 != null) {
      return localObject1;
    }
    localObject1 = new java/util/ArrayList;
    Object localObject2 = getHctsByHue();
    ((ArrayList)localObject1).<init>((Collection)localObject2);
    localObject2 = this.input;
    ((List)localObject1).add(localObject2);
    localObject2 = new java/util/HashMap;
    ((HashMap)localObject2).<init>();
    localObject1 = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      Hct localHct = (Hct)((Iterator)localObject1).next();
      double d = rawTemperature(localHct);
      Double localDouble = Double.valueOf(d);
      ((Map)localObject2).put(localHct, localDouble);
    }
    this.precomputedTempsByHct = ((Map)localObject2);
    return localObject2;
  }
  
  private Hct getWarmest()
  {
    List localList = getHctsByTemp();
    int i = getHctsByTemp().size() + -1;
    return (Hct)localList.get(i);
  }
  
  private static boolean isBetween(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    boolean bool1 = paramDouble2 < paramDouble3;
    boolean bool2 = false;
    boolean bool3 = true;
    boolean bool4 = paramDouble2 < paramDouble1;
    boolean bool5;
    if (bool1)
    {
      if (!bool4)
      {
        bool5 = paramDouble1 < paramDouble3;
        if (!bool5) {
          bool2 = bool3;
        }
      }
      return bool2;
    }
    if (bool4)
    {
      bool5 = paramDouble1 < paramDouble3;
      if (bool5) {}
    }
    else
    {
      bool2 = bool3;
    }
    return bool2;
  }
  
  public static double rawTemperature(Hct paramHct)
  {
    paramHct = ColorUtils.labFromArgb(paramHct.toInt());
    int i = 2;
    double d1 = paramHct[i];
    int j = 1;
    double d2 = paramHct[j];
    d1 = MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(d1, d2)));
    double d3 = paramHct[j];
    double d4 = paramHct[i];
    d3 = Math.pow(Math.hypot(d3, d4), 1.07D) * 0.02D;
    double d5 = Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble(d1 - 50.0D)));
    return d3 * d5 + -0.5D;
  }
  
  public List getAnalogousColors()
  {
    return getAnalogousColors(5, 12);
  }
  
  public List getAnalogousColors(int paramInt1, int paramInt2)
  {
    TemperatureCache localTemperatureCache = this;
    int i = paramInt1;
    int j = paramInt2;
    Hct localHct1 = this.input;
    double d1 = localHct1.getHue();
    long l = Math.round(d1);
    int k = (int)l;
    Hct localHct2 = (Hct)getHctsByHue().get(k);
    double d2 = getRelativeTemperature(localHct2);
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    localArrayList1.add(localHct2);
    double d3 = 0.0D;
    double d4 = d3;
    int m = 0;
    int n;
    double d5;
    for (;;)
    {
      n = 360;
      if (m >= n) {
        break;
      }
      n = MathUtils.sanitizeDegreesInt(k + m);
      List localList = getHctsByHue();
      Hct localHct3 = (Hct)localList.get(n);
      d5 = localTemperatureCache.getRelativeTemperature(localHct3);
      d2 = Math.abs(d5 - d2);
      d4 += d2;
      m += 1;
      d2 = d5;
    }
    d2 = j;
    d4 /= d2;
    double d6 = localTemperatureCache.getRelativeTemperature(localHct2);
    m = 1;
    int i4;
    for (;;)
    {
      int i1 = localArrayList1.size();
      if (i1 >= j) {
        break;
      }
      i1 = MathUtils.sanitizeDegreesInt(k + m);
      Hct localHct4 = (Hct)getHctsByHue().get(i1);
      double d7 = localTemperatureCache.getRelativeTemperature(localHct4);
      d6 = Math.abs(d7 - d6);
      d3 += d6;
      d6 = localArrayList1.size() * d4;
      boolean bool1 = d3 < d6;
      if (!bool1)
      {
        bool1 = true;
      }
      else
      {
        bool1 = false;
        localHct2 = null;
      }
      i4 = 1;
      while (bool1)
      {
        int i2 = localArrayList1.size();
        if (i2 >= j) {
          break;
        }
        localArrayList1.add(localHct4);
        d5 = (localArrayList1.size() + i4) * d4;
        boolean bool2 = d3 < d5;
        if (!bool2)
        {
          bool2 = true;
        }
        else
        {
          bool2 = false;
          localHct2 = null;
        }
        i4 += 1;
        n = 360;
      }
      m += 1;
      i3 = 360;
      if (m > i3) {
        for (;;)
        {
          k = localArrayList1.size();
          if (k >= j) {
            break;
          }
          localArrayList1.add(localHct4);
        }
      }
      n = i3;
      d6 = d7;
    }
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    localHct1 = localTemperatureCache.input;
    localArrayList2.add(localHct1);
    d1 = i - 1.0D;
    d2 = 2.0D;
    d1 = Math.floor(d1 / d2);
    k = (int)d1;
    int i3 = 1;
    int i5;
    Hct localHct5;
    for (;;)
    {
      i4 = k + 1;
      if (i3 >= i4) {
        break;
      }
      i4 = 0 - i3;
      for (;;)
      {
        i5 = localArrayList1.size();
        if (i4 >= 0) {
          break;
        }
        i4 += i5;
      }
      if (i4 >= i5)
      {
        i5 = localArrayList1.size();
        i4 %= i5;
      }
      localHct5 = (Hct)localArrayList1.get(i4);
      localArrayList2.add(0, localHct5);
      i3 += 1;
    }
    i -= k;
    k = 1;
    float f = 1.4E-45F;
    i -= k;
    i3 = k;
    for (;;)
    {
      i5 = i + 1;
      if (i3 >= i5) {
        break;
      }
      i4 = i3;
      for (;;)
      {
        i5 = localArrayList1.size();
        if (i4 >= 0) {
          break;
        }
        i4 += i5;
      }
      if (i4 >= i5)
      {
        i5 = localArrayList1.size();
        i4 %= i5;
      }
      localHct5 = (Hct)localArrayList1.get(i4);
      localArrayList2.add(localHct5);
      i3 += 1;
    }
    return localArrayList2;
  }
  
  public Hct getComplement()
  {
    TemperatureCache localTemperatureCache = this;
    Object localObject1 = this.precomputedComplement;
    if (localObject1 != null) {
      return localObject1;
    }
    double d1 = getColdest().getHue();
    localObject1 = getTempsByHct();
    Object localObject2 = getColdest();
    double d2 = ((Double)((Map)localObject1).get(localObject2)).doubleValue();
    double d3 = getWarmest().getHue();
    localObject1 = getTempsByHct();
    localObject2 = getWarmest();
    double d4 = ((Double)((Map)localObject1).get(localObject2)).doubleValue();
    double d5 = d4 - d2;
    localObject1 = this.input;
    double d6 = ((Hct)localObject1).getHue();
    double d7 = d1;
    boolean bool1 = isBetween(d6, d1, d3);
    double d8;
    if (bool1) {
      d8 = d3;
    } else {
      d8 = d1;
    }
    if (!bool1) {
      d1 = d3;
    }
    localObject1 = getHctsByHue();
    int i = (int)Math.round(localTemperatureCache.input.getHue());
    localObject1 = (Hct)((List)localObject1).get(i);
    localObject2 = localTemperatureCache.input;
    d6 = localTemperatureCache.getRelativeTemperature((Hct)localObject2);
    d3 = 1.0D;
    double d9 = d3 - d6;
    d6 = 1000.0D;
    d7 = 0.0D;
    double d10 = d6;
    for (double d11 = d7;; d11 += d3)
    {
      d6 = 360.0D;
      boolean bool2 = d11 < d6;
      if (bool2) {
        break;
      }
      d6 = d3 * d11;
      double d12 = MathUtils.sanitizeDegreesDouble(d8 + d6);
      d6 = d12;
      d7 = d8;
      bool2 = isBetween(d12, d8, d1);
      if (bool2)
      {
        localObject2 = getHctsByHue();
        long l = Math.round(d12);
        int j = (int)l;
        localObject2 = (Hct)((List)localObject2).get(j);
        Double localDouble = (Double)getTempsByHct().get(localObject2);
        double d13 = (localDouble.doubleValue() - d2) / d5;
        d13 = Math.abs(d9 - d13);
        boolean bool3 = d13 < d10;
        if (bool3)
        {
          localObject1 = localObject2;
          d10 = d13;
        }
      }
    }
    localTemperatureCache.precomputedComplement = ((Hct)localObject1);
    return localObject1;
  }
  
  public double getRelativeTemperature(Hct paramHct)
  {
    Object localObject = getTempsByHct();
    Hct localHct1 = getWarmest();
    localObject = (Double)((Map)localObject).get(localHct1);
    double d1 = ((Double)localObject).doubleValue();
    Map localMap = getTempsByHct();
    Hct localHct2 = getColdest();
    double d2 = ((Double)localMap.get(localHct2)).doubleValue();
    d1 -= d2;
    localMap = getTempsByHct();
    d2 = ((Double)localMap.get(paramHct)).doubleValue();
    paramHct = getTempsByHct();
    Hct localHct3 = getColdest();
    paramHct = (Double)paramHct.get(localHct3);
    double d3 = paramHct.doubleValue();
    d2 -= d3;
    d3 = 0.0D;
    boolean bool = d1 < d3;
    if (!bool) {
      return 0.5D;
    }
    return d2 / d1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.TemperatureCache
 * JD-Core Version:    0.7.0.1
 */