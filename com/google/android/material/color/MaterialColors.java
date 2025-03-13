package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R.attr;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;

public class MaterialColors
{
  public static final float ALPHA_DISABLED = 0.38F;
  public static final float ALPHA_DISABLED_LOW = 0.12F;
  public static final float ALPHA_FULL = 1.0F;
  public static final float ALPHA_LOW = 0.32F;
  public static final float ALPHA_MEDIUM = 0.54F;
  private static final int TONE_ACCENT_CONTAINER_DARK = 30;
  private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
  private static final int TONE_ACCENT_DARK = 80;
  private static final int TONE_ACCENT_LIGHT = 40;
  private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
  private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
  private static final int TONE_ON_ACCENT_DARK = 20;
  private static final int TONE_ON_ACCENT_LIGHT = 100;
  
  public static int compositeARGBWithAlpha(int paramInt1, int paramInt2)
  {
    int i = Color.alpha(paramInt1) * paramInt2 / 255;
    return ColorUtils.OooOO0(paramInt1, i);
  }
  
  public static int getColor(Context paramContext, int paramInt1, int paramInt2)
  {
    TypedValue localTypedValue = MaterialAttributes.resolve(paramContext, paramInt1);
    if (localTypedValue != null) {
      return resolveColor(paramContext, localTypedValue);
    }
    return paramInt2;
  }
  
  public static int getColor(Context paramContext, int paramInt, String paramString)
  {
    TypedValue localTypedValue = MaterialAttributes.resolveTypedValueOrThrow(paramContext, paramInt, paramString);
    return resolveColor(paramContext, localTypedValue);
  }
  
  public static int getColor(View paramView, int paramInt)
  {
    Context localContext = paramView.getContext();
    paramView = MaterialAttributes.resolveTypedValueOrThrow(paramView, paramInt);
    return resolveColor(localContext, paramView);
  }
  
  public static int getColor(View paramView, int paramInt1, int paramInt2)
  {
    return getColor(paramView.getContext(), paramInt1, paramInt2);
  }
  
  private static int getColorRole(int paramInt1, int paramInt2)
  {
    Hct localHct = Hct.fromInt(paramInt1);
    double d = paramInt2;
    localHct.setTone(d);
    return localHct.toInt();
  }
  
  public static ColorRoles getColorRoles(int paramInt, boolean paramBoolean)
  {
    int i = 90;
    ColorRoles localColorRoles;
    int j;
    int k;
    int m;
    if (paramBoolean)
    {
      localColorRoles = new com/google/android/material/color/ColorRoles;
      j = getColorRole(paramInt, 40);
      k = getColorRole(paramInt, 100);
      i = getColorRole(paramInt, i);
      m = 10;
      paramInt = getColorRole(paramInt, m);
      localColorRoles.<init>(j, k, i, paramInt);
    }
    else
    {
      localColorRoles = new com/google/android/material/color/ColorRoles;
      j = getColorRole(paramInt, 80);
      k = getColorRole(paramInt, 20);
      m = getColorRole(paramInt, 30);
      paramInt = getColorRole(paramInt, i);
      localColorRoles.<init>(j, k, m, paramInt);
    }
    return localColorRoles;
  }
  
  public static ColorRoles getColorRoles(Context paramContext, int paramInt)
  {
    int i = R.attr.isLightTheme;
    boolean bool = MaterialAttributes.resolveBoolean(paramContext, i, true);
    return getColorRoles(paramInt, bool);
  }
  
  public static ColorStateList getColorStateList(Context paramContext, int paramInt, ColorStateList paramColorStateList)
  {
    TypedValue localTypedValue = MaterialAttributes.resolve(paramContext, paramInt);
    if (localTypedValue != null) {
      paramContext = resolveColorStateList(paramContext, localTypedValue);
    } else {
      paramContext = null;
    }
    if (paramContext != null) {
      paramColorStateList = paramContext;
    }
    return paramColorStateList;
  }
  
  public static ColorStateList getColorStateListOrNull(Context paramContext, int paramInt)
  {
    TypedValue localTypedValue = MaterialAttributes.resolve(paramContext, paramInt);
    if (localTypedValue == null) {
      return null;
    }
    int i = localTypedValue.resourceId;
    if (i != 0) {
      return ContextCompat.OooO0Oo(paramContext, i);
    }
    int j = localTypedValue.data;
    if (j != 0) {
      return ColorStateList.valueOf(j);
    }
    return null;
  }
  
  public static int harmonize(int paramInt1, int paramInt2)
  {
    return Blend.harmonize(paramInt1, paramInt2);
  }
  
  public static int harmonizeWithPrimary(Context paramContext, int paramInt)
  {
    int i = R.attr.colorPrimary;
    String str = MaterialColors.class.getCanonicalName();
    int j = getColor(paramContext, i, str);
    return harmonize(paramInt, j);
  }
  
  public static boolean isColorLight(int paramInt)
  {
    if (paramInt != 0)
    {
      double d1 = ColorUtils.OooO0Oo(paramInt);
      double d2 = 0.5D;
      paramInt = d1 < d2;
      if (paramInt > 0) {
        return 1;
      }
    }
    paramInt = 0;
    return paramInt;
  }
  
  public static int layer(int paramInt1, int paramInt2)
  {
    return ColorUtils.OooO0oO(paramInt2, paramInt1);
  }
  
  public static int layer(int paramInt1, int paramInt2, float paramFloat)
  {
    int i = Math.round(Color.alpha(paramInt2) * paramFloat);
    paramInt2 = ColorUtils.OooOO0(paramInt2, i);
    return layer(paramInt1, paramInt2);
  }
  
  public static int layer(View paramView, int paramInt1, int paramInt2)
  {
    return layer(paramView, paramInt1, paramInt2, 1.0F);
  }
  
  public static int layer(View paramView, int paramInt1, int paramInt2, float paramFloat)
  {
    paramInt1 = getColor(paramView, paramInt1);
    int i = getColor(paramView, paramInt2);
    return layer(paramInt1, i, paramFloat);
  }
  
  private static int resolveColor(Context paramContext, TypedValue paramTypedValue)
  {
    int i = paramTypedValue.resourceId;
    if (i != 0) {
      return ContextCompat.OooO0OO(paramContext, i);
    }
    return paramTypedValue.data;
  }
  
  private static ColorStateList resolveColorStateList(Context paramContext, TypedValue paramTypedValue)
  {
    int i = paramTypedValue.resourceId;
    if (i != 0) {
      return ContextCompat.OooO0Oo(paramContext, i);
    }
    return ColorStateList.valueOf(paramTypedValue.data);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.MaterialColors
 * JD-Core Version:    0.7.0.1
 */