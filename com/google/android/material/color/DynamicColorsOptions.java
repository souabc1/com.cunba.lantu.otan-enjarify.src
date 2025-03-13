package com.google.android.material.color;

import android.graphics.Bitmap;
import com.google.android.material.color.utilities.QuantizerCelebi;
import com.google.android.material.color.utilities.Score;
import java.util.List;

public class DynamicColorsOptions
{
  private static final DynamicColors.Precondition ALWAYS_ALLOW;
  private static final DynamicColors.OnAppliedCallback NO_OP_CALLBACK;
  private Integer contentBasedSeedColor;
  private final DynamicColors.OnAppliedCallback onAppliedCallback;
  private final DynamicColors.Precondition precondition;
  private final int themeOverlay;
  
  static
  {
    Object localObject = new com/google/android/material/color/DynamicColorsOptions$1;
    ((DynamicColorsOptions.1)localObject).<init>();
    ALWAYS_ALLOW = (DynamicColors.Precondition)localObject;
    localObject = new com/google/android/material/color/DynamicColorsOptions$2;
    ((DynamicColorsOptions.2)localObject).<init>();
    NO_OP_CALLBACK = (DynamicColors.OnAppliedCallback)localObject;
  }
  
  private DynamicColorsOptions(DynamicColorsOptions.Builder paramBuilder)
  {
    int i = DynamicColorsOptions.Builder.access$000(paramBuilder);
    this.themeOverlay = i;
    Object localObject = DynamicColorsOptions.Builder.access$100(paramBuilder);
    this.precondition = ((DynamicColors.Precondition)localObject);
    localObject = DynamicColorsOptions.Builder.access$200(paramBuilder);
    this.onAppliedCallback = ((DynamicColors.OnAppliedCallback)localObject);
    localObject = DynamicColorsOptions.Builder.access$300(paramBuilder);
    if (localObject != null)
    {
      int j = extractSeedColorFromImage(DynamicColorsOptions.Builder.access$300(paramBuilder));
      paramBuilder = Integer.valueOf(j);
      this.contentBasedSeedColor = paramBuilder;
    }
  }
  
  private static int extractSeedColorFromImage(Bitmap paramBitmap)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    int[] arrayOfInt = new int[i * j];
    paramBitmap.getPixels(arrayOfInt, 0, i, 0, 0, i, j);
    return ((Integer)Score.score(QuantizerCelebi.quantize(arrayOfInt, 128)).get(0)).intValue();
  }
  
  public Integer getContentBasedSeedColor()
  {
    return this.contentBasedSeedColor;
  }
  
  public DynamicColors.OnAppliedCallback getOnAppliedCallback()
  {
    return this.onAppliedCallback;
  }
  
  public DynamicColors.Precondition getPrecondition()
  {
    return this.precondition;
  }
  
  public int getThemeOverlay()
  {
    return this.themeOverlay;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.DynamicColorsOptions
 * JD-Core Version:    0.7.0.1
 */