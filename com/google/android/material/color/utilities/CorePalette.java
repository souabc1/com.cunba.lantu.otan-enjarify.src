package com.google.android.material.color.utilities;

public final class CorePalette
{
  public TonalPalette a1;
  public TonalPalette a2;
  public TonalPalette a3;
  public TonalPalette error;
  public TonalPalette n1;
  public TonalPalette n2;
  
  private CorePalette(int paramInt, boolean paramBoolean)
  {
    Object localObject = Hct.fromInt(paramInt);
    double d1 = ((Hct)localObject).getHue();
    double d2 = ((Hct)localObject).getChroma();
    double d3 = 8.0D;
    double d4 = 4.0D;
    double d5 = 60.0D;
    double d6;
    if (paramBoolean)
    {
      localObject = TonalPalette.fromHueAndChroma(d1, d2);
      this.a1 = ((TonalPalette)localObject);
      d6 = d2 / 3.0D;
      localObject = TonalPalette.fromHueAndChroma(d1, d6);
      this.a2 = ((TonalPalette)localObject);
      d5 += d1;
      d6 = d2 / 2.0D;
      localObject = TonalPalette.fromHueAndChroma(d5, d6);
      this.a3 = ((TonalPalette)localObject);
      d6 = Math.min(d2 / 12.0D, d4);
      localObject = TonalPalette.fromHueAndChroma(d1, d6);
      this.n1 = ((TonalPalette)localObject);
      d2 /= 6.0D;
      d6 = Math.min(d2, d3);
      localObject = TonalPalette.fromHueAndChroma(d1, d6);
    }
    else
    {
      d6 = Math.max(48.0D, d2);
      localObject = TonalPalette.fromHueAndChroma(d1, d6);
      this.a1 = ((TonalPalette)localObject);
      localObject = TonalPalette.fromHueAndChroma(d1, 16.0D);
      this.a2 = ((TonalPalette)localObject);
      d5 += d1;
      d6 = 24.0D;
      localObject = TonalPalette.fromHueAndChroma(d5, d6);
      this.a3 = ((TonalPalette)localObject);
      localObject = TonalPalette.fromHueAndChroma(d1, d4);
      this.n1 = ((TonalPalette)localObject);
      localObject = TonalPalette.fromHueAndChroma(d1, d3);
    }
    this.n2 = ((TonalPalette)localObject);
    localObject = TonalPalette.fromHueAndChroma(25.0D, 84.0D);
    this.error = ((TonalPalette)localObject);
  }
  
  public static CorePalette contentOf(int paramInt)
  {
    CorePalette localCorePalette = new com/google/android/material/color/utilities/CorePalette;
    localCorePalette.<init>(paramInt, true);
    return localCorePalette;
  }
  
  public static CorePalette of(int paramInt)
  {
    CorePalette localCorePalette = new com/google/android/material/color/utilities/CorePalette;
    localCorePalette.<init>(paramInt, false);
    return localCorePalette;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.CorePalette
 * JD-Core Version:    0.7.0.1
 */