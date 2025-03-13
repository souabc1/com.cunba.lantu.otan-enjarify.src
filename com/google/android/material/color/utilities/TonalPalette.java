package com.google.android.material.color.utilities;

import java.util.HashMap;
import java.util.Map;

public final class TonalPalette
{
  Map cache;
  double chroma;
  double hue;
  
  private TonalPalette(double paramDouble1, double paramDouble2)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.cache = localHashMap;
    this.hue = paramDouble1;
    this.chroma = paramDouble2;
  }
  
  public static final TonalPalette fromHct(Hct paramHct)
  {
    double d1 = paramHct.getHue();
    double d2 = paramHct.getChroma();
    return fromHueAndChroma(d1, d2);
  }
  
  public static final TonalPalette fromHueAndChroma(double paramDouble1, double paramDouble2)
  {
    TonalPalette localTonalPalette = new com/google/android/material/color/utilities/TonalPalette;
    localTonalPalette.<init>(paramDouble1, paramDouble2);
    return localTonalPalette;
  }
  
  public static final TonalPalette fromInt(int paramInt)
  {
    return fromHct(Hct.fromInt(paramInt));
  }
  
  public double getChroma()
  {
    return this.chroma;
  }
  
  public Hct getHct(double paramDouble)
  {
    double d1 = this.hue;
    double d2 = this.chroma;
    return Hct.from(d1, d2, paramDouble);
  }
  
  public double getHue()
  {
    return this.hue;
  }
  
  public int tone(int paramInt)
  {
    Object localObject1 = this.cache;
    Object localObject2 = Integer.valueOf(paramInt);
    localObject1 = (Integer)((Map)localObject1).get(localObject2);
    if (localObject1 == null)
    {
      double d1 = this.hue;
      double d2 = this.chroma;
      double d3 = paramInt;
      int i = Hct.from(d1, d2, d3).toInt();
      localObject1 = Integer.valueOf(i);
      localObject2 = this.cache;
      Integer localInteger = Integer.valueOf(paramInt);
      ((Map)localObject2).put(localInteger, localObject1);
    }
    return ((Integer)localObject1).intValue();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.TonalPalette
 * JD-Core Version:    0.7.0.1
 */