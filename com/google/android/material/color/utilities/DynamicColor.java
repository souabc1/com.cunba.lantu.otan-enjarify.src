package com.google.android.material.color.utilities;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class DynamicColor
{
  public final Function background;
  public final Function chroma;
  private final HashMap hctCache;
  public final Function hue;
  public final Function opacity;
  public final Function tone;
  public final Function toneDeltaConstraint;
  public final Function toneMaxContrast;
  public final Function toneMinContrast;
  
  public DynamicColor(Function paramFunction1, Function paramFunction2, Function paramFunction3, Function paramFunction4, Function paramFunction5, Function paramFunction6, Function paramFunction7, Function paramFunction8)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.hctCache = localHashMap;
    this.hue = paramFunction1;
    this.chroma = paramFunction2;
    this.tone = paramFunction3;
    this.opacity = paramFunction4;
    this.background = paramFunction5;
    this.toneMinContrast = paramFunction6;
    this.toneMaxContrast = paramFunction7;
    this.toneDeltaConstraint = paramFunction8;
  }
  
  public static double calculateDynamicTone(DynamicScheme paramDynamicScheme, Function paramFunction1, Function paramFunction2, BiFunction paramBiFunction, Function paramFunction3, Function paramFunction4, Function paramFunction5, Function paramFunction6)
  {
    DynamicScheme localDynamicScheme = paramDynamicScheme;
    Object localObject1 = paramFunction3;
    Object localObject2 = paramFunction5;
    Object localObject3 = paramFunction1;
    Function localFunction = paramFunction6;
    localObject3 = (Double)paramFunction1.apply(paramDynamicScheme);
    double d1 = ((Double)localObject3).doubleValue();
    if (paramFunction3 == null) {
      localObject1 = null;
    } else {
      localObject1 = (DynamicColor)paramFunction3.apply(paramDynamicScheme);
    }
    if (localObject1 == null) {
      return d1;
    }
    double d2 = ((Double)((DynamicColor)localObject1).tone.apply(localDynamicScheme)).doubleValue();
    d2 = Contrast.ratioOfTones(d1, d2);
    double d3 = ((Double)paramFunction2.apply(localObject1)).doubleValue();
    localObject3 = Double.valueOf(d2);
    Double localDouble = Double.valueOf(d3);
    localObject3 = (Double)paramBiFunction.apply(localObject3, localDouble);
    double d4 = ((Double)localObject3).doubleValue();
    double d5 = Contrast.ratioOfTones(d3, d4);
    double d6 = 1.0D;
    if (localObject2 != null)
    {
      localObject3 = Double.valueOf(d2);
      localObject3 = ((Function)localObject2).apply(localObject3);
      if (localObject3 != null)
      {
        localObject3 = Double.valueOf(d2);
        localObject2 = (Double)((Function)localObject2).apply(localObject3);
        d7 = ((Double)localObject2).doubleValue();
        d6 = d7;
      }
    }
    if (localFunction == null) {}
    do
    {
      d8 = 21.0D;
      break;
      localObject2 = Double.valueOf(d2);
      localObject2 = localFunction.apply(localObject2);
    } while (localObject2 == null);
    localObject2 = Double.valueOf(d2);
    localObject2 = (Double)localFunction.apply(localObject2);
    double d7 = ((Double)localObject2).doubleValue();
    double d8 = d7;
    d7 = MathUtils.clampDouble(d6, d8, d5);
    boolean bool = d7 < d5;
    if (bool) {
      d4 = contrastingTone(d3, d7);
    }
    localObject1 = ((DynamicColor)localObject1).background;
    if (localObject1 != null)
    {
      localObject1 = ((Function)localObject1).apply(localDynamicScheme);
      if (localObject1 != null)
      {
        d9 = d4;
        break label381;
      }
    }
    double d9 = enableLightForeground(d4);
    label381:
    localDynamicScheme = paramDynamicScheme;
    return ensureToneDelta(d9, d1, paramDynamicScheme, paramFunction4, paramFunction2);
  }
  
  public static double contrastingTone(double paramDouble1, double paramDouble2)
  {
    double d1 = Contrast.lighterUnsafe(paramDouble1, paramDouble2);
    double d2 = Contrast.darkerUnsafe(paramDouble1, paramDouble2);
    double d3 = Contrast.ratioOfTones(d1, paramDouble1);
    double d4 = Contrast.ratioOfTones(d2, paramDouble1);
    boolean bool1 = tonePrefersLightForeground(paramDouble1);
    if (bool1)
    {
      paramDouble1 = Math.abs(d3 - d4);
      double d5 = 0.1D;
      bool1 = paramDouble1 < d5;
      if (bool1)
      {
        bool1 = d3 < paramDouble2;
        if (bool1)
        {
          bool1 = d4 < paramDouble2;
          if (bool1)
          {
            bool1 = true;
            break label97;
          }
        }
      }
      bool1 = false;
      label97:
      boolean bool2 = d3 < paramDouble2;
      if (bool2)
      {
        bool2 = d3 < d4;
        if ((bool2) && (!bool1)) {
          return d2;
        }
      }
      return d1;
    }
    bool1 = d4 < paramDouble2;
    if (bool1)
    {
      bool1 = d4 < d3;
      if (bool1) {}
    }
    else
    {
      d1 = d2;
    }
    return d1;
  }
  
  public static double enableLightForeground(double paramDouble)
  {
    boolean bool = tonePrefersLightForeground(paramDouble);
    if (bool)
    {
      bool = toneAllowsLightForeground(paramDouble);
      if (!bool) {
        paramDouble = 49.0D;
      }
    }
    return paramDouble;
  }
  
  public static double ensureToneDelta(double paramDouble1, double paramDouble2, DynamicScheme paramDynamicScheme, Function paramFunction1, Function paramFunction2)
  {
    if (paramFunction1 == null) {
      paramFunction1 = null;
    } else {
      paramFunction1 = (ToneDeltaConstraint)paramFunction1.apply(paramDynamicScheme);
    }
    if (paramFunction1 == null) {
      return paramDouble1;
    }
    double d1 = paramFunction1.delta;
    DynamicColor localDynamicColor = paramFunction1.keepAway;
    paramFunction2 = (Double)paramFunction2.apply(localDynamicColor);
    double d2 = paramFunction2.doubleValue();
    double d3 = Math.abs(paramDouble1 - d2);
    boolean bool1 = d3 < d1;
    if (!bool1) {
      return paramDouble1;
    }
    paramFunction2 = DynamicColor.1.$SwitchMap$com$google$android$material$color$utilities$TonePolarity;
    TonePolarity localTonePolarity = paramFunction1.keepAwayPolarity;
    int j = localTonePolarity.ordinal();
    int i = paramFunction2[j];
    j = 1;
    if (i != j)
    {
      int k = 2;
      if (i != k)
      {
        int m = 3;
        if (i != m) {
          return paramDouble1;
        }
        paramFunction1 = paramFunction1.keepAway.tone;
        paramDynamicScheme = (Double)paramFunction1.apply(paramDynamicScheme);
        double d4 = paramDynamicScheme.doubleValue();
        boolean bool2 = paramDouble2 < d4;
        if (bool2) {
          bool2 = j;
        } else {
          bool2 = false;
        }
        d3 -= d1;
        d4 = Math.abs(d3);
        if (bool2)
        {
          d1 = paramDouble1 + d4;
          d2 = 100.0D;
          bool2 = d1 < d2;
          if (!bool2) {
            break label265;
          }
        }
        else
        {
          bool2 = paramDouble1 < d4;
          if (bool2) {
            break label265;
          }
        }
        j = 0;
        localTonePolarity = null;
        label265:
        if (j != 0) {
          paramDouble1 += d4;
        } else {
          paramDouble1 -= d4;
        }
        return paramDouble1;
      }
      paramDouble1 = 0.0D;
      paramDouble2 = 100.0D;
    }
    for (d3 = d2 - d1;; d3 = d2 + d1)
    {
      d1 = paramDouble1;
      d2 = paramDouble2;
      return MathUtils.clampDouble(paramDouble1, paramDouble2, d3);
      paramDouble1 = 0.0D;
      paramDouble2 = 100.0D;
    }
  }
  
  public static DynamicColor fromArgb(int paramInt)
  {
    Hct localHct = Hct.fromInt(paramInt);
    Object localObject = TonalPalette.fromInt(paramInt);
    OooOO0O localOooOO0O = new com/google/android/material/color/utilities/OooOO0O;
    localOooOO0O.<init>((TonalPalette)localObject);
    localObject = new com/google/android/material/color/utilities/OooOOO0;
    ((OooOOO0)localObject).<init>(localHct);
    return fromPalette(localOooOO0O, (Function)localObject);
  }
  
  public static DynamicColor fromArgb(int paramInt, Function paramFunction)
  {
    o00Oo0 localo00Oo0 = new com/google/android/material/color/utilities/o00Oo0;
    localo00Oo0.<init>(paramInt);
    return fromPalette(localo00Oo0, paramFunction);
  }
  
  public static DynamicColor fromArgb(int paramInt, Function paramFunction1, Function paramFunction2)
  {
    o00O0O localo00O0O = new com/google/android/material/color/utilities/o00O0O;
    localo00O0O.<init>(paramInt);
    return fromPalette(localo00O0O, paramFunction1, paramFunction2);
  }
  
  public static DynamicColor fromArgb(int paramInt, Function paramFunction1, Function paramFunction2, Function paramFunction3)
  {
    OooOO0 localOooOO0 = new com/google/android/material/color/utilities/OooOO0;
    localOooOO0.<init>(paramInt);
    return fromPalette(localOooOO0, paramFunction1, paramFunction2, paramFunction3);
  }
  
  public static DynamicColor fromPalette(Function paramFunction1, Function paramFunction2)
  {
    return fromPalette(paramFunction1, paramFunction2, null, null);
  }
  
  public static DynamicColor fromPalette(Function paramFunction1, Function paramFunction2, Function paramFunction3)
  {
    return fromPalette(paramFunction1, paramFunction2, paramFunction3, null);
  }
  
  public static DynamicColor fromPalette(Function paramFunction1, Function paramFunction2, Function paramFunction3, Function paramFunction4)
  {
    DynamicColor localDynamicColor = new com/google/android/material/color/utilities/DynamicColor;
    OooO00o localOooO00o = new com/google/android/material/color/utilities/OooO00o;
    localOooO00o.<init>(paramFunction1);
    OooOo00 localOooOo00 = new com/google/android/material/color/utilities/OooOo00;
    localOooOo00.<init>(paramFunction1);
    OooOo localOooOo = new com/google/android/material/color/utilities/OooOo;
    localOooOo.<init>(paramFunction2, paramFunction3, paramFunction4);
    Oooo000 localOooo000 = new com/google/android/material/color/utilities/Oooo000;
    localOooo000.<init>(paramFunction2, paramFunction3, paramFunction4);
    localDynamicColor.<init>(localOooO00o, localOooOo00, paramFunction2, null, paramFunction3, localOooOo, localOooo000, paramFunction4);
    return localDynamicColor;
  }
  
  public static boolean toneAllowsLightForeground(double paramDouble)
  {
    long l1 = Math.round(paramDouble);
    long l2 = 49;
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static double toneMaxContrastDefault(Function paramFunction1, Function paramFunction2, DynamicScheme paramDynamicScheme, Function paramFunction3)
  {
    OooOOO localOooOOO = new com/google/android/material/color/utilities/OooOOO;
    localOooOOO.<init>(paramDynamicScheme);
    OooOOOO localOooOOOO = new com/google/android/material/color/utilities/OooOOOO;
    localOooOOOO.<init>(paramFunction2, paramDynamicScheme);
    return calculateDynamicTone(paramDynamicScheme, paramFunction1, localOooOOO, localOooOOOO, paramFunction2, paramFunction3, null, null);
  }
  
  public static double toneMinContrastDefault(Function paramFunction1, Function paramFunction2, DynamicScheme paramDynamicScheme, Function paramFunction3)
  {
    Oooo0 localOooo0 = new com/google/android/material/color/utilities/Oooo0;
    localOooo0.<init>(paramDynamicScheme);
    o000oOoO localo000oOoO = new com/google/android/material/color/utilities/o000oOoO;
    localo000oOoO.<init>(paramFunction1, paramDynamicScheme, paramFunction2);
    o0OoOo0 localo0OoOo0 = new com/google/android/material/color/utilities/o0OoOo0;
    localo0OoOo0.<init>();
    return calculateDynamicTone(paramDynamicScheme, paramFunction1, localOooo0, localo000oOoO, paramFunction2, paramFunction3, null, localo0OoOo0);
  }
  
  public static boolean tonePrefersLightForeground(double paramDouble)
  {
    long l1 = Math.round(paramDouble);
    long l2 = 60;
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int getArgb(DynamicScheme paramDynamicScheme)
  {
    Hct localHct = getHct(paramDynamicScheme);
    int i = localHct.toInt();
    Function localFunction = this.opacity;
    if (localFunction == null) {
      return i;
    }
    int j = (int)Math.round(((Double)localFunction.apply(paramDynamicScheme)).doubleValue() * 255.0D);
    j = MathUtils.clampInt(0, 255, j);
    i &= 0xFFFFFF;
    return j << 24 | i;
  }
  
  public Hct getHct(DynamicScheme paramDynamicScheme)
  {
    Hct localHct = (Hct)this.hctCache.get(paramDynamicScheme);
    if (localHct != null) {
      return localHct;
    }
    double d1 = ((Double)this.hue.apply(paramDynamicScheme)).doubleValue();
    double d2 = ((Double)this.chroma.apply(paramDynamicScheme)).doubleValue();
    double d3 = getTone(paramDynamicScheme);
    localHct = Hct.from(d1, d2, d3);
    HashMap localHashMap = this.hctCache;
    int i = localHashMap.size();
    int j = 4;
    if (i > j)
    {
      localHashMap = this.hctCache;
      localHashMap.clear();
    }
    this.hctCache.put(paramDynamicScheme, localHct);
    return localHct;
  }
  
  public double getTone(DynamicScheme paramDynamicScheme)
  {
    DynamicColor localDynamicColor = this;
    DynamicScheme localDynamicScheme = paramDynamicScheme;
    Object localObject1 = (Double)this.tone.apply(paramDynamicScheme);
    double d1 = ((Double)localObject1).doubleValue();
    double d2 = paramDynamicScheme.contrastLevel;
    double d3 = 0.0D;
    boolean bool1 = d2 < d3;
    boolean bool2 = true;
    Object localObject2 = null;
    if (bool1)
    {
      bool1 = bool2;
    }
    else
    {
      bool1 = false;
      localObject3 = null;
    }
    boolean bool3 = d2 < d3;
    if (bool3)
    {
      localObject1 = (Double)localDynamicColor.tone.apply(localDynamicScheme);
      d1 = ((Double)localObject1).doubleValue();
      if (bool1) {
        localObject4 = localDynamicColor.toneMinContrast;
      } else {
        localObject4 = localDynamicColor.toneMaxContrast;
      }
      localObject4 = (Double)((Function)localObject4).apply(localDynamicScheme);
      d2 = ((Double)localObject4).doubleValue() - d1;
      d3 = Math.abs(localDynamicScheme.contrastLevel);
      d2 *= d3;
      d1 += d2;
    }
    Object localObject4 = localDynamicColor.background;
    if (localObject4 == null)
    {
      bool3 = false;
      localObject4 = null;
    }
    else
    {
      localObject4 = (DynamicColor)((Function)localObject4).apply(localDynamicScheme);
    }
    double d4 = 1.0D;
    if (localObject4 != null)
    {
      localObject5 = ((DynamicColor)localObject4).background;
      if (localObject5 != null)
      {
        localObject5 = ((Function)localObject5).apply(localDynamicScheme);
        if (localObject5 != null) {}
      }
      else
      {
        bool2 = false;
        localOooO0O0 = null;
      }
      double d5 = ((Double)localDynamicColor.tone.apply(localDynamicScheme)).doubleValue();
      localObject5 = (Double)((DynamicColor)localObject4).tone.apply(localDynamicScheme);
      d6 = ((Double)localObject5).doubleValue();
      d6 = Contrast.ratioOfTones(d5, d6);
      if (bool1)
      {
        localObject5 = (Double)localDynamicColor.toneMinContrast.apply(localDynamicScheme);
        d7 = ((Double)localObject5).doubleValue();
        localObject2 = (Double)((DynamicColor)localObject4).toneMinContrast.apply(localDynamicScheme);
        d5 = ((Double)localObject2).doubleValue();
        d7 = Contrast.ratioOfTones(d7, d5);
        if (!bool2) {
          break label460;
        }
        d4 = d7;
        break label460;
      }
      localObject5 = (Double)localDynamicColor.toneMaxContrast.apply(localDynamicScheme);
      double d7 = ((Double)localObject5).doubleValue();
      localObject2 = (Double)((DynamicColor)localObject4).toneMaxContrast.apply(localDynamicScheme);
      d5 = ((Double)localObject2).doubleValue();
      d7 = Contrast.ratioOfTones(d7, d5);
      if (bool2)
      {
        double d8 = Math.min(d7, d6);
        d4 = d8;
      }
      if (bool2)
      {
        d6 = Math.max(d7, d6);
        break label460;
      }
    }
    double d6 = 21.0D;
    label460:
    Object localObject5 = localDynamicColor.tone;
    Object localObject3 = new com/google/android/material/color/utilities/o00Ooo;
    ((o00Ooo)localObject3).<init>(localDynamicScheme);
    OooO0O0 localOooO0O0 = new com/google/android/material/color/utilities/OooO0O0;
    localOooO0O0.<init>(d1);
    localObject2 = new com/google/android/material/color/utilities/OooO0OO;
    ((OooO0OO)localObject2).<init>((DynamicColor)localObject4);
    Function localFunction = localDynamicColor.toneDeltaConstraint;
    OooO0o localOooO0o = new com/google/android/material/color/utilities/OooO0o;
    localOooO0o.<init>(d4);
    OooO localOooO = new com/google/android/material/color/utilities/OooO;
    localOooO.<init>(d6);
    localDynamicScheme = paramDynamicScheme;
    localObject1 = localObject5;
    Object localObject6 = localObject3;
    localObject4 = localOooO0O0;
    localObject5 = localOooO0o;
    localObject3 = localOooO;
    return calculateDynamicTone(paramDynamicScheme, (Function)localObject1, localObject6, localOooO0O0, (Function)localObject2, localFunction, localOooO0o, localOooO);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.DynamicColor
 * JD-Core Version:    0.7.0.1
 */