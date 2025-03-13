package com.google.android.material.color;

import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import m54207b69;

public final class HarmonizedColorAttributes
{
  private static final int[] HARMONIZED_MATERIAL_ATTRIBUTES = tmp30_20;
  private final int[] attributes;
  private final int themeOverlay;
  
  static
  {
    int i = R.attr.colorError;
    int j = R.attr.colorOnError;
    int k = R.attr.colorErrorContainer;
    int m = R.attr.colorOnErrorContainer;
    int[] tmp19_17 = new int[4];
    int[] tmp20_19 = tmp19_17;
    int[] tmp20_19 = tmp19_17;
    tmp20_19[0] = i;
    tmp20_19[1] = j;
    tmp20_19[2] = k;
    int[] tmp30_20 = tmp20_19;
    tmp30_20[3] = m;
  }
  
  private HarmonizedColorAttributes(int[] paramArrayOfInt, int paramInt)
  {
    if (paramInt != 0)
    {
      int i = paramArrayOfInt.length;
      if (i == 0)
      {
        paramArrayOfInt = new java/lang/IllegalArgumentException;
        String str = m54207b69.F54207b69_11("(6625F555E571B5F475B4D64625B23536D69546C652A69692D5B5E6D6D325E7D617E376481773B7D7C7D82857183857D8E888248928C77A3A24E907C7D809C92828294875B");
        paramArrayOfInt.<init>(str);
        throw paramArrayOfInt;
      }
    }
    this.attributes = paramArrayOfInt;
    this.themeOverlay = paramInt;
  }
  
  public static HarmonizedColorAttributes create(int[] paramArrayOfInt)
  {
    HarmonizedColorAttributes localHarmonizedColorAttributes = new com/google/android/material/color/HarmonizedColorAttributes;
    localHarmonizedColorAttributes.<init>(paramArrayOfInt, 0);
    return localHarmonizedColorAttributes;
  }
  
  public static HarmonizedColorAttributes create(int[] paramArrayOfInt, int paramInt)
  {
    HarmonizedColorAttributes localHarmonizedColorAttributes = new com/google/android/material/color/HarmonizedColorAttributes;
    localHarmonizedColorAttributes.<init>(paramArrayOfInt, paramInt);
    return localHarmonizedColorAttributes;
  }
  
  public static HarmonizedColorAttributes createMaterialDefaults()
  {
    int[] arrayOfInt = HARMONIZED_MATERIAL_ATTRIBUTES;
    int i = R.style.ThemeOverlay_Material3_HarmonizedColors;
    return create(arrayOfInt, i);
  }
  
  public int[] getAttributes()
  {
    return this.attributes;
  }
  
  public int getThemeOverlay()
  {
    return this.themeOverlay;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.HarmonizedColorAttributes
 * JD-Core Version:    0.7.0.1
 */