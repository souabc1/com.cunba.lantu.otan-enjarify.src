package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;

public class ElevationOverlayProvider
{
  private static final float FORMULA_MULTIPLIER = 4.5F;
  private static final float FORMULA_OFFSET = 2.0F;
  private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int)Math.round(5.100000000000001D);
  private final int colorSurface;
  private final float displayDensity;
  private final int elevationOverlayAccentColor;
  private final int elevationOverlayColor;
  private final boolean elevationOverlayEnabled;
  
  public ElevationOverlayProvider(Context paramContext)
  {
    this(bool, j, k, m, f);
  }
  
  public ElevationOverlayProvider(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    this.elevationOverlayEnabled = paramBoolean;
    this.elevationOverlayColor = paramInt1;
    this.elevationOverlayAccentColor = paramInt2;
    this.colorSurface = paramInt3;
    this.displayDensity = paramFloat;
  }
  
  private boolean isThemeSurfaceColor(int paramInt)
  {
    paramInt = ColorUtils.OooOO0(paramInt, 255);
    int i = this.colorSurface;
    if (paramInt == i) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public int calculateOverlayAlpha(float paramFloat)
  {
    return Math.round(calculateOverlayAlphaFraction(paramFloat) * 255.0F);
  }
  
  public float calculateOverlayAlphaFraction(float paramFloat)
  {
    float f = this.displayDensity;
    boolean bool = f < 0.0F;
    if (bool)
    {
      bool = paramFloat < 0.0F;
      if (bool) {
        return Math.min(((float)Math.log1p(paramFloat / f) * 4.5F + 2.0F) / 100.0F, 1.0F);
      }
    }
    return 0.0F;
  }
  
  public int compositeOverlay(int paramInt, float paramFloat)
  {
    paramFloat = calculateOverlayAlphaFraction(paramFloat);
    int i = Color.alpha(paramInt);
    paramInt = ColorUtils.OooOO0(paramInt, 255);
    int j = this.elevationOverlayColor;
    paramInt = MaterialColors.layer(paramInt, j, paramFloat);
    j = 0;
    boolean bool = paramFloat < 0.0F;
    if (bool)
    {
      int k = this.elevationOverlayAccentColor;
      if (k != 0)
      {
        j = OVERLAY_ACCENT_COLOR_ALPHA;
        k = ColorUtils.OooOO0(k, j);
        paramInt = MaterialColors.layer(paramInt, k);
      }
    }
    return ColorUtils.OooOO0(paramInt, i);
  }
  
  public int compositeOverlay(int paramInt, float paramFloat, View paramView)
  {
    float f = getParentAbsoluteElevation(paramView);
    paramFloat += f;
    return compositeOverlay(paramInt, paramFloat);
  }
  
  public int compositeOverlayIfNeeded(int paramInt, float paramFloat)
  {
    boolean bool = this.elevationOverlayEnabled;
    if (bool)
    {
      bool = isThemeSurfaceColor(paramInt);
      if (bool) {
        paramInt = compositeOverlay(paramInt, paramFloat);
      }
    }
    return paramInt;
  }
  
  public int compositeOverlayIfNeeded(int paramInt, float paramFloat, View paramView)
  {
    float f = getParentAbsoluteElevation(paramView);
    paramFloat += f;
    return compositeOverlayIfNeeded(paramInt, paramFloat);
  }
  
  public int compositeOverlayWithThemeSurfaceColorIfNeeded(float paramFloat)
  {
    int i = this.colorSurface;
    return compositeOverlayIfNeeded(i, paramFloat);
  }
  
  public int compositeOverlayWithThemeSurfaceColorIfNeeded(float paramFloat, View paramView)
  {
    float f = getParentAbsoluteElevation(paramView);
    paramFloat += f;
    return compositeOverlayWithThemeSurfaceColorIfNeeded(paramFloat);
  }
  
  public float getParentAbsoluteElevation(View paramView)
  {
    return ViewUtils.getParentAbsoluteElevation(paramView);
  }
  
  public int getThemeElevationOverlayColor()
  {
    return this.elevationOverlayColor;
  }
  
  public int getThemeSurfaceColor()
  {
    return this.colorSurface;
  }
  
  public boolean isThemeElevationOverlayEnabled()
  {
    return this.elevationOverlayEnabled;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.elevation.ElevationOverlayProvider
 * JD-Core Version:    0.7.0.1
 */