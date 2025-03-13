package com.google.android.material.theme.overlay;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.material.R.attr;

public class MaterialThemeOverlay
{
  private static final int[] ANDROID_THEME_OVERLAY_ATTRS;
  private static final int[] MATERIAL_THEME_OVERLAY_ATTR;
  
  static
  {
    int i = R.attr.theme;
    ANDROID_THEME_OVERLAY_ATTRS = new int[] { 16842752, i };
    int j = R.attr.materialThemeOverlay;
    MATERIAL_THEME_OVERLAY_ATTR = new int[] { j };
  }
  
  private static int obtainAndroidThemeOverlayId(Context paramContext, AttributeSet paramAttributeSet)
  {
    int[] arrayOfInt = ANDROID_THEME_OVERLAY_ATTRS;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    paramAttributeSet = null;
    int i = paramContext.getResourceId(0, 0);
    int j = 1;
    int k = paramContext.getResourceId(j, 0);
    paramContext.recycle();
    if (i == 0) {
      i = k;
    }
    return i;
  }
  
  private static int obtainMaterialThemeOverlayId(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = MATERIAL_THEME_OVERLAY_ATTR;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt1, paramInt2);
    int i = paramContext.getResourceId(0, 0);
    paramContext.recycle();
    return i;
  }
  
  public static Context wrap(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramInt1 = obtainMaterialThemeOverlayId(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramInt2 = paramContext instanceof ContextThemeWrapper;
    int i = 1;
    if (paramInt2 != 0)
    {
      localObject = paramContext;
      localObject = (ContextThemeWrapper)paramContext;
      paramInt2 = ((ContextThemeWrapper)localObject).getThemeResId();
      if (paramInt2 == paramInt1)
      {
        paramInt2 = i;
        break label51;
      }
    }
    paramInt2 = 0;
    Object localObject = null;
    label51:
    if ((paramInt1 != 0) && (paramInt2 == 0))
    {
      localObject = new androidx/appcompat/view/ContextThemeWrapper;
      ((ContextThemeWrapper)localObject).<init>(paramContext, paramInt1);
      int j = obtainAndroidThemeOverlayId(paramContext, paramAttributeSet);
      if (j != 0)
      {
        paramAttributeSet = ((Context)localObject).getTheme();
        paramAttributeSet.applyStyle(j, i);
      }
      return localObject;
    }
    return paramContext;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.theme.overlay.MaterialThemeOverlay
 * JD-Core Version:    0.7.0.1
 */