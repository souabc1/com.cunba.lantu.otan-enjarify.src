package com.google.android.material.color;

public class HarmonizedColorsOptions
{
  private final int colorAttributeToHarmonizeWith;
  private final HarmonizedColorAttributes colorAttributes;
  private final int[] colorResourceIds;
  
  private HarmonizedColorsOptions(HarmonizedColorsOptions.Builder paramBuilder)
  {
    Object localObject = HarmonizedColorsOptions.Builder.access$000(paramBuilder);
    this.colorResourceIds = ((int[])localObject);
    localObject = HarmonizedColorsOptions.Builder.access$100(paramBuilder);
    this.colorAttributes = ((HarmonizedColorAttributes)localObject);
    int i = HarmonizedColorsOptions.Builder.access$200(paramBuilder);
    this.colorAttributeToHarmonizeWith = i;
  }
  
  public static HarmonizedColorsOptions createMaterialDefaults()
  {
    HarmonizedColorsOptions.Builder localBuilder = new com/google/android/material/color/HarmonizedColorsOptions$Builder;
    localBuilder.<init>();
    HarmonizedColorAttributes localHarmonizedColorAttributes = HarmonizedColorAttributes.createMaterialDefaults();
    return localBuilder.setColorAttributes(localHarmonizedColorAttributes).build();
  }
  
  public int getColorAttributeToHarmonizeWith()
  {
    return this.colorAttributeToHarmonizeWith;
  }
  
  public HarmonizedColorAttributes getColorAttributes()
  {
    return this.colorAttributes;
  }
  
  public int[] getColorResourceIds()
  {
    return this.colorResourceIds;
  }
  
  public int getThemeOverlayResourceId(int paramInt)
  {
    HarmonizedColorAttributes localHarmonizedColorAttributes1 = this.colorAttributes;
    if (localHarmonizedColorAttributes1 != null)
    {
      int i = localHarmonizedColorAttributes1.getThemeOverlay();
      if (i != 0)
      {
        HarmonizedColorAttributes localHarmonizedColorAttributes2 = this.colorAttributes;
        paramInt = localHarmonizedColorAttributes2.getThemeOverlay();
      }
    }
    return paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.HarmonizedColorsOptions
 * JD-Core Version:    0.7.0.1
 */