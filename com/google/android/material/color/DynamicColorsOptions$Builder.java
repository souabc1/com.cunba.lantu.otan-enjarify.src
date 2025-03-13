package com.google.android.material.color;

import android.graphics.Bitmap;

public class DynamicColorsOptions$Builder
{
  private Bitmap contentBasedSource;
  private DynamicColors.OnAppliedCallback onAppliedCallback;
  private DynamicColors.Precondition precondition;
  private int themeOverlay;
  
  public DynamicColorsOptions$Builder()
  {
    Object localObject = DynamicColorsOptions.access$400();
    this.precondition = ((DynamicColors.Precondition)localObject);
    localObject = DynamicColorsOptions.access$500();
    this.onAppliedCallback = ((DynamicColors.OnAppliedCallback)localObject);
  }
  
  public DynamicColorsOptions build()
  {
    DynamicColorsOptions localDynamicColorsOptions = new com/google/android/material/color/DynamicColorsOptions;
    localDynamicColorsOptions.<init>(this, null);
    return localDynamicColorsOptions;
  }
  
  public Builder setContentBasedSource(Bitmap paramBitmap)
  {
    this.contentBasedSource = paramBitmap;
    return this;
  }
  
  public Builder setOnAppliedCallback(DynamicColors.OnAppliedCallback paramOnAppliedCallback)
  {
    this.onAppliedCallback = paramOnAppliedCallback;
    return this;
  }
  
  public Builder setPrecondition(DynamicColors.Precondition paramPrecondition)
  {
    this.precondition = paramPrecondition;
    return this;
  }
  
  public Builder setThemeOverlay(int paramInt)
  {
    this.themeOverlay = paramInt;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.DynamicColorsOptions.Builder
 * JD-Core Version:    0.7.0.1
 */