package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import com.google.android.material.R.style;
import java.util.HashMap;
import java.util.Map;

public class HarmonizedColors
{
  private static final String TAG = "HarmonizedColors";
  
  private static void addHarmonizedColorAttributesToReplacementMap(Map paramMap, TypedArray paramTypedArray1, TypedArray paramTypedArray2, int paramInt)
  {
    if (paramTypedArray2 == null) {
      paramTypedArray2 = paramTypedArray1;
    }
    int i = 0;
    for (;;)
    {
      int j = paramTypedArray1.getIndexCount();
      if (i >= j) {
        break;
      }
      j = paramTypedArray2.getResourceId(i, 0);
      if (j != 0)
      {
        boolean bool = paramTypedArray1.hasValue(i);
        if (bool)
        {
          bool = ResourcesLoaderUtils.isColorResource(paramTypedArray1.getType(i));
          if (bool)
          {
            int k = paramTypedArray1.getColor(i, 0);
            Integer localInteger1 = Integer.valueOf(j);
            k = MaterialColors.harmonize(k, paramInt);
            Integer localInteger2 = Integer.valueOf(k);
            paramMap.put(localInteger1, localInteger2);
          }
        }
      }
      i += 1;
    }
  }
  
  public static void applyToContextIfAvailable(Context paramContext, HarmonizedColorsOptions paramHarmonizedColorsOptions)
  {
    boolean bool = isHarmonizedColorAvailable();
    if (!bool) {
      return;
    }
    Map localMap = createHarmonizedColorReplacementMap(paramContext, paramHarmonizedColorsOptions);
    int i = paramHarmonizedColorsOptions.getThemeOverlayResourceId(0);
    bool = ResourcesLoaderUtils.addResourcesLoaderToContext(paramContext, localMap);
    if ((bool) && (i != 0)) {
      ThemeUtils.applyThemeOverlay(paramContext, i);
    }
  }
  
  private static Map createHarmonizedColorReplacementMap(Context paramContext, HarmonizedColorsOptions paramHarmonizedColorsOptions)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    int i = paramHarmonizedColorsOptions.getColorAttributeToHarmonizeWith();
    Object localObject = TAG;
    i = MaterialColors.getColor(paramContext, i, (String)localObject);
    localObject = paramHarmonizedColorsOptions.getColorResourceIds();
    int j = localObject.length;
    int k = 0;
    ContextThemeWrapper localContextThemeWrapper = null;
    while (k < j)
    {
      int m = localObject[k];
      int n = MaterialColors.harmonize(ContextCompat.OooO0OO(paramContext, m), i);
      Integer localInteger1 = Integer.valueOf(m);
      Integer localInteger2 = Integer.valueOf(n);
      localHashMap.put(localInteger1, localInteger2);
      k += 1;
    }
    paramHarmonizedColorsOptions = paramHarmonizedColorsOptions.getColorAttributes();
    if (paramHarmonizedColorsOptions != null)
    {
      localObject = paramHarmonizedColorsOptions.getAttributes();
      j = localObject.length;
      if (j > 0)
      {
        int i1 = paramHarmonizedColorsOptions.getThemeOverlay();
        TypedArray localTypedArray = paramContext.obtainStyledAttributes((int[])localObject);
        if (i1 != 0)
        {
          localContextThemeWrapper = new android/view/ContextThemeWrapper;
          localContextThemeWrapper.<init>(paramContext, i1);
          paramContext = localContextThemeWrapper.obtainStyledAttributes((int[])localObject);
        }
        else
        {
          paramContext = null;
        }
        addHarmonizedColorAttributesToReplacementMap(localHashMap, localTypedArray, paramContext, i);
        localTypedArray.recycle();
        if (paramContext != null) {
          paramContext.recycle();
        }
      }
    }
    return localHashMap;
  }
  
  public static boolean isHarmonizedColorAvailable()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static Context wrapContextIfAvailable(Context paramContext, HarmonizedColorsOptions paramHarmonizedColorsOptions)
  {
    boolean bool1 = isHarmonizedColorAvailable();
    if (!bool1) {
      return paramContext;
    }
    Map localMap = createHarmonizedColorReplacementMap(paramContext, paramHarmonizedColorsOptions);
    int i = R.style.ThemeOverlay_Material3_HarmonizedColors_Empty;
    int j = paramHarmonizedColorsOptions.getThemeOverlayResourceId(i);
    ContextThemeWrapper localContextThemeWrapper = new android/view/ContextThemeWrapper;
    localContextThemeWrapper.<init>(paramContext, j);
    paramHarmonizedColorsOptions = new android/content/res/Configuration;
    paramHarmonizedColorsOptions.<init>();
    localContextThemeWrapper.applyOverrideConfiguration(paramHarmonizedColorsOptions);
    boolean bool2 = ResourcesLoaderUtils.addResourcesLoaderToContext(localContextThemeWrapper, localMap);
    if (bool2) {
      paramContext = localContextThemeWrapper;
    }
    return paramContext;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.HarmonizedColors
 * JD-Core Version:    0.7.0.1
 */