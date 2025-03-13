package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Build.VERSION;
import android.view.ContextThemeWrapper;
import androidx.core.os.BuildCompat;
import com.google.android.material.R.attr;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.SchemeContent;
import com.google.android.material.resources.MaterialAttributes;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m54207b69;

public class DynamicColors
{
  private static final DynamicColors.DeviceSupportCondition DEFAULT_DEVICE_SUPPORT_CONDITION;
  private static final Map DYNAMIC_COLOR_SUPPORTED_BRANDS;
  private static final Map DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS;
  private static final int[] DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE;
  private static final DynamicColors.DeviceSupportCondition SAMSUNG_DEVICE_SUPPORT_CONDITION;
  private static final int USE_DEFAULT_THEME_OVERLAY;
  
  static
  {
    int i = R.attr.dynamicColorThemeOverlay;
    DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = new int[] { i };
    DynamicColors.1 local1 = new com/google/android/material/color/DynamicColors$1;
    local1.<init>();
    DEFAULT_DEVICE_SUPPORT_CONDITION = local1;
    Object localObject1 = new com/google/android/material/color/DynamicColors$2;
    ((DynamicColors.2)localObject1).<init>();
    SAMSUNG_DEVICE_SUPPORT_CONDITION = (DynamicColors.DeviceSupportCondition)localObject1;
    Object localObject2 = new java/util/HashMap;
    ((HashMap)localObject2).<init>();
    String str = m54207b69.F54207b69_11("Gg01050B16");
    ((Map)localObject2).put(str, local1);
    str = m54207b69.F54207b69_11("Sw10191A131F17");
    ((Map)localObject2).put(str, local1);
    str = m54207b69.F54207b69_11("kg0F0B054A04100E0C0E14");
    ((Map)localObject2).put(str, local1);
    str = m54207b69.F54207b69_11("{f0F0902120C1424");
    ((Map)localObject2).put(str, local1);
    str = m54207b69.F54207b69_11("jF2F2922322C34446D33322E3A363C404E763B413E43473939");
    ((Map)localObject2).put(str, local1);
    str = m54207b69.F54207b69_11("0<55495B53");
    ((Map)localObject2).put(str, local1);
    str = m54207b69.F54207b69_11("345F4E5D5A554B5B");
    ((Map)localObject2).put(str, local1);
    str = m54207b69.F54207b69_11("%v1A141A1C041E");
    ((Map)localObject2).put(str, local1);
    ((Map)localObject2).put("lge", local1);
    str = m54207b69.F54207b69_11("Q>53524C5450565866");
    ((Map)localObject2).put(str, local1);
    str = m54207b69.F54207b69_11("s.40425C494B454F");
    ((Map)localObject2).put(str, local1);
    str = m54207b69.F54207b69_11("P;5456604E5B534E");
    ((Map)localObject2).put(str, local1);
    str = m54207b69.F54207b69_11("(M223E3F25");
    ((Map)localObject2).put(str, local1);
    str = m54207b69.F54207b69_11("]=4F595E54545D");
    ((Map)localObject2).put(str, local1);
    str = m54207b69.F54207b69_11("J042605462605A594B4A625D");
    ((Map)localObject2).put(str, local1);
    str = m54207b69.F54207b69_11("j)5A49465D604C54");
    ((Map)localObject2).put(str, localObject1);
    localObject1 = m54207b69.F54207b69_11("~C302C243437");
    ((Map)localObject2).put(localObject1, local1);
    localObject1 = m54207b69.F54207b69_11("4?4C515349");
    ((Map)localObject2).put(localObject1, local1);
    ((Map)localObject2).put("tcl", local1);
    localObject1 = m54207b69.F54207b69_11("o*5E504B4749");
    ((Map)localObject2).put(localObject1, local1);
    localObject1 = m54207b69.F54207b69_11(".F3224272B2D6B31302C38342E72373D3A3F433535");
    ((Map)localObject2).put(localObject1, local1);
    localObject1 = m54207b69.F54207b69_11("_X2E32303A");
    ((Map)localObject2).put(localObject1, local1);
    localObject1 = m54207b69.F54207b69_11("KM3A25252D3D2D342C");
    ((Map)localObject2).put(localObject1, local1);
    localObject1 = m54207b69.F54207b69_11("?k13030C070A07");
    ((Map)localObject2).put(localObject1, local1);
    DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = Collections.unmodifiableMap((Map)localObject2);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    localObject2 = m54207b69.F54207b69_11("`=5C4F4A51");
    ((Map)localObject1).put(localObject2, local1);
    ((Map)localObject1).put("jio", local1);
    DYNAMIC_COLOR_SUPPORTED_BRANDS = Collections.unmodifiableMap((Map)localObject1);
  }
  
  public static void applyIfAvailable(Activity paramActivity)
  {
    applyToActivityIfAvailable(paramActivity);
  }
  
  public static void applyIfAvailable(Activity paramActivity, int paramInt)
  {
    DynamicColorsOptions.Builder localBuilder = new com/google/android/material/color/DynamicColorsOptions$Builder;
    localBuilder.<init>();
    DynamicColorsOptions localDynamicColorsOptions = localBuilder.setThemeOverlay(paramInt).build();
    applyToActivityIfAvailable(paramActivity, localDynamicColorsOptions);
  }
  
  public static void applyIfAvailable(Activity paramActivity, DynamicColors.Precondition paramPrecondition)
  {
    DynamicColorsOptions.Builder localBuilder = new com/google/android/material/color/DynamicColorsOptions$Builder;
    localBuilder.<init>();
    paramPrecondition = localBuilder.setPrecondition(paramPrecondition).build();
    applyToActivityIfAvailable(paramActivity, paramPrecondition);
  }
  
  public static void applyToActivitiesIfAvailable(Application paramApplication)
  {
    Object localObject = new com/google/android/material/color/DynamicColorsOptions$Builder;
    ((DynamicColorsOptions.Builder)localObject).<init>();
    localObject = ((DynamicColorsOptions.Builder)localObject).build();
    applyToActivitiesIfAvailable(paramApplication, (DynamicColorsOptions)localObject);
  }
  
  public static void applyToActivitiesIfAvailable(Application paramApplication, int paramInt)
  {
    DynamicColorsOptions.Builder localBuilder = new com/google/android/material/color/DynamicColorsOptions$Builder;
    localBuilder.<init>();
    DynamicColorsOptions localDynamicColorsOptions = localBuilder.setThemeOverlay(paramInt).build();
    applyToActivitiesIfAvailable(paramApplication, localDynamicColorsOptions);
  }
  
  public static void applyToActivitiesIfAvailable(Application paramApplication, int paramInt, DynamicColors.Precondition paramPrecondition)
  {
    DynamicColorsOptions.Builder localBuilder = new com/google/android/material/color/DynamicColorsOptions$Builder;
    localBuilder.<init>();
    DynamicColorsOptions localDynamicColorsOptions = localBuilder.setThemeOverlay(paramInt).setPrecondition(paramPrecondition).build();
    applyToActivitiesIfAvailable(paramApplication, localDynamicColorsOptions);
  }
  
  public static void applyToActivitiesIfAvailable(Application paramApplication, DynamicColors.Precondition paramPrecondition)
  {
    DynamicColorsOptions.Builder localBuilder = new com/google/android/material/color/DynamicColorsOptions$Builder;
    localBuilder.<init>();
    paramPrecondition = localBuilder.setPrecondition(paramPrecondition).build();
    applyToActivitiesIfAvailable(paramApplication, paramPrecondition);
  }
  
  public static void applyToActivitiesIfAvailable(Application paramApplication, DynamicColorsOptions paramDynamicColorsOptions)
  {
    DynamicColors.DynamicColorsActivityLifecycleCallbacks localDynamicColorsActivityLifecycleCallbacks = new com/google/android/material/color/DynamicColors$DynamicColorsActivityLifecycleCallbacks;
    localDynamicColorsActivityLifecycleCallbacks.<init>(paramDynamicColorsOptions);
    paramApplication.registerActivityLifecycleCallbacks(localDynamicColorsActivityLifecycleCallbacks);
  }
  
  public static void applyToActivityIfAvailable(Activity paramActivity)
  {
    Object localObject = new com/google/android/material/color/DynamicColorsOptions$Builder;
    ((DynamicColorsOptions.Builder)localObject).<init>();
    localObject = ((DynamicColorsOptions.Builder)localObject).build();
    applyToActivityIfAvailable(paramActivity, (DynamicColorsOptions)localObject);
  }
  
  public static void applyToActivityIfAvailable(Activity paramActivity, DynamicColorsOptions paramDynamicColorsOptions)
  {
    boolean bool1 = isDynamicColorAvailable();
    if (!bool1) {
      return;
    }
    Object localObject1 = paramDynamicColorsOptions.getContentBasedSeedColor();
    int i;
    if (localObject1 == null)
    {
      i = paramDynamicColorsOptions.getThemeOverlay();
      if (i == 0) {
        i = getDefaultThemeOverlay(paramActivity);
      } else {
        i = paramDynamicColorsOptions.getThemeOverlay();
      }
    }
    else
    {
      i = 0;
      localObject1 = null;
    }
    Object localObject2 = paramDynamicColorsOptions.getPrecondition();
    boolean bool2 = ((DynamicColors.Precondition)localObject2).shouldApplyDynamicColors(paramActivity, i);
    if (bool2)
    {
      localObject2 = paramDynamicColorsOptions.getContentBasedSeedColor();
      int j;
      if (localObject2 != null)
      {
        localObject1 = new com/google/android/material/color/utilities/SchemeContent;
        int k = paramDynamicColorsOptions.getContentBasedSeedColor().intValue();
        localObject2 = Hct.fromInt(k);
        int m = R.attr.isLightTheme;
        boolean bool4 = true;
        boolean bool3 = MaterialAttributes.resolveBoolean(paramActivity, m, bool4) ^ bool4;
        double d = 0.0D;
        ((SchemeContent)localObject1).<init>((Hct)localObject2, bool3, d);
        localObject2 = ColorResourcesOverride.getInstance();
        if (localObject2 == null) {
          return;
        }
        localObject1 = MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues((DynamicScheme)localObject1);
        j = ((ColorResourcesOverride)localObject2).applyIfPossible(paramActivity, (Map)localObject1);
        if (j != 0) {}
      }
      else
      {
        ThemeUtils.applyThemeOverlay(paramActivity, j);
      }
      paramDynamicColorsOptions = paramDynamicColorsOptions.getOnAppliedCallback();
      paramDynamicColorsOptions.onApplied(paramActivity);
    }
  }
  
  private static int getDefaultThemeOverlay(Context paramContext)
  {
    int[] arrayOfInt = DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE;
    paramContext = paramContext.obtainStyledAttributes(arrayOfInt);
    int i = paramContext.getResourceId(0, 0);
    paramContext.recycle();
    return i;
  }
  
  public static boolean isDynamicColorAvailable()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 31;
    boolean bool2 = false;
    if (i < j) {
      return false;
    }
    boolean bool1 = BuildCompat.isAtLeastT();
    j = 1;
    if (bool1) {
      return j;
    }
    Object localObject = DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS;
    String str = Build.MANUFACTURER.toLowerCase();
    localObject = (DynamicColors.DeviceSupportCondition)((Map)localObject).get(str);
    if (localObject == null)
    {
      localObject = DYNAMIC_COLOR_SUPPORTED_BRANDS;
      str = Build.BRAND.toLowerCase();
      localObject = (DynamicColors.DeviceSupportCondition)((Map)localObject).get(str);
    }
    if (localObject != null)
    {
      bool1 = ((DynamicColors.DeviceSupportCondition)localObject).isSupported();
      if (bool1) {
        bool2 = j;
      }
    }
    return bool2;
  }
  
  public static Context wrapContextIfAvailable(Context paramContext)
  {
    return wrapContextIfAvailable(paramContext, 0);
  }
  
  public static Context wrapContextIfAvailable(Context paramContext, int paramInt)
  {
    boolean bool = isDynamicColorAvailable();
    if (!bool) {
      return paramContext;
    }
    if (paramInt == 0) {
      paramInt = getDefaultThemeOverlay(paramContext);
    }
    if (paramInt != 0)
    {
      ContextThemeWrapper localContextThemeWrapper = new android/view/ContextThemeWrapper;
      localContextThemeWrapper.<init>(paramContext, paramInt);
      paramContext = localContextThemeWrapper;
    }
    return paramContext;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.DynamicColors
 * JD-Core Version:    0.7.0.1
 */