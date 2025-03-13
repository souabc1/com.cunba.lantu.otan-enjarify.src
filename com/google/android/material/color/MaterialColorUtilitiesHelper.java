package com.google.android.material.color;

import com.google.android.material.R.color;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class MaterialColorUtilitiesHelper
{
  private static final Map colorResourceIdToColorValue;
  
  static
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Integer localInteger = Integer.valueOf(R.color.material_personalized_color_primary);
    DynamicColor localDynamicColor = MaterialDynamicColors.primary;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_on_primary);
    localDynamicColor = MaterialDynamicColors.onPrimary;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_primary_inverse);
    localDynamicColor = MaterialDynamicColors.primaryInverse;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_primary_container);
    localDynamicColor = MaterialDynamicColors.primaryContainer;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_on_primary_container);
    localDynamicColor = MaterialDynamicColors.onPrimaryContainer;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_secondary);
    localDynamicColor = MaterialDynamicColors.secondary;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_on_secondary);
    localDynamicColor = MaterialDynamicColors.onSecondary;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_secondary_container);
    localDynamicColor = MaterialDynamicColors.secondaryContainer;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_on_secondary_container);
    localDynamicColor = MaterialDynamicColors.onSecondaryContainer;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_tertiary);
    localDynamicColor = MaterialDynamicColors.tertiary;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_on_tertiary);
    localDynamicColor = MaterialDynamicColors.onTertiary;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_tertiary_container);
    localDynamicColor = MaterialDynamicColors.tertiaryContainer;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_on_tertiary_container);
    localDynamicColor = MaterialDynamicColors.onTertiaryContainer;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_background);
    localDynamicColor = MaterialDynamicColors.background;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_on_background);
    localDynamicColor = MaterialDynamicColors.onBackground;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_surface);
    localDynamicColor = MaterialDynamicColors.surface;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_on_surface);
    localDynamicColor = MaterialDynamicColors.onSurface;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_surface_variant);
    localDynamicColor = MaterialDynamicColors.surfaceVariant;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_on_surface_variant);
    localDynamicColor = MaterialDynamicColors.onSurfaceVariant;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_surface_inverse);
    localDynamicColor = MaterialDynamicColors.surfaceInverse;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_on_surface_inverse);
    localDynamicColor = MaterialDynamicColors.onSurfaceInverse;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_surface_bright);
    localDynamicColor = MaterialDynamicColors.surfaceBright;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_surface_dim);
    localDynamicColor = MaterialDynamicColors.surfaceDim;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_surface_container);
    localDynamicColor = MaterialDynamicColors.surfaceContainer;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_surface_container_low);
    localDynamicColor = MaterialDynamicColors.surfaceSub1;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_surface_container_high);
    localDynamicColor = MaterialDynamicColors.surfaceAdd1;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_surface_container_lowest);
    localDynamicColor = MaterialDynamicColors.surfaceSub2;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_surface_container_highest);
    localDynamicColor = MaterialDynamicColors.surfaceAdd2;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_outline);
    localDynamicColor = MaterialDynamicColors.outline;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_outline_variant);
    localDynamicColor = MaterialDynamicColors.outlineVariant;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_error);
    localDynamicColor = MaterialDynamicColors.error;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_on_error);
    localDynamicColor = MaterialDynamicColors.onError;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_error_container);
    localDynamicColor = MaterialDynamicColors.errorContainer;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_on_error_container);
    localDynamicColor = MaterialDynamicColors.onErrorContainer;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_control_activated);
    localDynamicColor = MaterialDynamicColors.controlActivated;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_control_normal);
    localDynamicColor = MaterialDynamicColors.controlNormal;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_control_highlight);
    localDynamicColor = MaterialDynamicColors.controlHighlight;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_text_primary_inverse);
    localDynamicColor = MaterialDynamicColors.textPrimaryInverse;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse);
    localDynamicColor = MaterialDynamicColors.textSecondaryAndTertiaryInverse;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse_disabled);
    localDynamicColor = MaterialDynamicColors.textSecondaryAndTertiaryInverseDisabled;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_text_primary_inverse_disable_only);
    localDynamicColor = MaterialDynamicColors.textPrimaryInverseDisableOnly;
    localHashMap.put(localInteger, localDynamicColor);
    localInteger = Integer.valueOf(R.color.material_personalized_color_text_hint_foreground_inverse);
    localDynamicColor = MaterialDynamicColors.textHintInverse;
    localHashMap.put(localInteger, localDynamicColor);
    colorResourceIdToColorValue = Collections.unmodifiableMap(localHashMap);
  }
  
  public static Map createColorResourcesIdsToColorValues(DynamicScheme paramDynamicScheme)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Iterator localIterator = colorResourceIdToColorValue.entrySet().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (Map.Entry)localIterator.next();
      Integer localInteger = (Integer)((Map.Entry)localObject).getKey();
      int i = ((DynamicColor)((Map.Entry)localObject).getValue()).getArgb(paramDynamicScheme);
      localObject = Integer.valueOf(i);
      localHashMap.put(localInteger, localObject);
    }
    return Collections.unmodifiableMap(localHashMap);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.MaterialColorUtilitiesHelper
 * JD-Core Version:    0.7.0.1
 */