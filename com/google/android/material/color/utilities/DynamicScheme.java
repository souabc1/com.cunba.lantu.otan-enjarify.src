package com.google.android.material.color.utilities;

public class DynamicScheme
{
  public final double contrastLevel;
  public final TonalPalette errorPalette;
  public final boolean isDark;
  public final TonalPalette neutralPalette;
  public final TonalPalette neutralVariantPalette;
  public final TonalPalette primaryPalette;
  public final TonalPalette secondaryPalette;
  public final int sourceColorArgb;
  public final Hct sourceColorHct;
  public final TonalPalette tertiaryPalette;
  public final Variant variant;
  
  public DynamicScheme(Hct paramHct, Variant paramVariant, boolean paramBoolean, double paramDouble, TonalPalette paramTonalPalette1, TonalPalette paramTonalPalette2, TonalPalette paramTonalPalette3, TonalPalette paramTonalPalette4, TonalPalette paramTonalPalette5)
  {
    int i = paramHct.toInt();
    this.sourceColorArgb = i;
    this.sourceColorHct = paramHct;
    this.variant = paramVariant;
    this.isDark = paramBoolean;
    this.contrastLevel = paramDouble;
    this.primaryPalette = paramTonalPalette1;
    this.secondaryPalette = paramTonalPalette2;
    this.tertiaryPalette = paramTonalPalette3;
    this.neutralPalette = paramTonalPalette4;
    this.neutralVariantPalette = paramTonalPalette5;
    paramHct = TonalPalette.fromHueAndChroma(25.0D, 84.0D);
    this.errorPalette = paramHct;
  }
  
  public static double getRotatedHue(Hct paramHct, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    double d1 = paramHct.getHue();
    int i = paramArrayOfDouble2.length;
    int j = 1;
    int k = 0;
    double d2;
    if (i == j)
    {
      d2 = paramArrayOfDouble2[0];
      return MathUtils.sanitizeDegreesDouble(d1 + d2);
    }
    i = paramArrayOfDouble1.length;
    for (;;)
    {
      j = i + -2;
      if (k > j) {
        return d1;
      }
      double d3 = paramArrayOfDouble1[k];
      j = k + 1;
      double d4 = paramArrayOfDouble1[j];
      boolean bool = d3 < d1;
      if (bool)
      {
        bool = d1 < d4;
        if (bool)
        {
          d2 = paramArrayOfDouble2[k];
          break;
        }
      }
      k = j;
    }
    return d1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.DynamicScheme
 * JD-Core Version:    0.7.0.1
 */