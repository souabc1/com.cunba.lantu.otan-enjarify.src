package com.google.android.material.color;

import com.google.android.material.R.attr;

public class HarmonizedColorsOptions$Builder
{
  private int colorAttributeToHarmonizeWith;
  private HarmonizedColorAttributes colorAttributes;
  private int[] colorResourceIds;
  
  public HarmonizedColorsOptions$Builder()
  {
    int[] arrayOfInt = new int[0];
    this.colorResourceIds = arrayOfInt;
    int i = R.attr.colorPrimary;
    this.colorAttributeToHarmonizeWith = i;
  }
  
  public HarmonizedColorsOptions build()
  {
    HarmonizedColorsOptions localHarmonizedColorsOptions = new com/google/android/material/color/HarmonizedColorsOptions;
    localHarmonizedColorsOptions.<init>(this, null);
    return localHarmonizedColorsOptions;
  }
  
  public Builder setColorAttributeToHarmonizeWith(int paramInt)
  {
    this.colorAttributeToHarmonizeWith = paramInt;
    return this;
  }
  
  public Builder setColorAttributes(HarmonizedColorAttributes paramHarmonizedColorAttributes)
  {
    this.colorAttributes = paramHarmonizedColorAttributes;
    return this;
  }
  
  public Builder setColorResourceIds(int[] paramArrayOfInt)
  {
    this.colorResourceIds = paramArrayOfInt;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.HarmonizedColorsOptions.Builder
 * JD-Core Version:    0.7.0.1
 */