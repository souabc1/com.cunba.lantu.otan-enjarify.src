package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import m54207b69;

public class MaterialAttributes
{
  public static TypedValue resolve(Context paramContext, int paramInt)
  {
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    paramContext = paramContext.getTheme();
    boolean bool1 = true;
    boolean bool2 = paramContext.resolveAttribute(paramInt, localTypedValue, bool1);
    if (bool2) {
      return localTypedValue;
    }
    return null;
  }
  
  public static boolean resolveBoolean(Context paramContext, int paramInt, boolean paramBoolean)
  {
    paramContext = resolve(paramContext, paramInt);
    if (paramContext != null)
    {
      paramInt = paramContext.type;
      int i = 18;
      if (paramInt == i)
      {
        int j = paramContext.data;
        if (j != 0) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
      }
    }
    return paramBoolean;
  }
  
  public static boolean resolveBooleanOrThrow(Context paramContext, int paramInt, String paramString)
  {
    int i = resolveOrThrow(paramContext, paramInt, paramString);
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramContext = null;
    }
    return i;
  }
  
  public static int resolveDimension(Context paramContext, int paramInt1, int paramInt2)
  {
    TypedValue localTypedValue = resolve(paramContext, paramInt1);
    if (localTypedValue != null)
    {
      int i = localTypedValue.type;
      int j = 5;
      if (i == j) {
        paramContext = paramContext.getResources().getDisplayMetrics();
      }
    }
    for (float f = localTypedValue.getDimension(paramContext);; f = paramContext.getDimension(paramInt2))
    {
      return (int)f;
      paramContext = paramContext.getResources();
    }
  }
  
  public static int resolveInteger(Context paramContext, int paramInt1, int paramInt2)
  {
    paramContext = resolve(paramContext, paramInt1);
    if (paramContext != null)
    {
      paramInt1 = paramContext.type;
      int i = 16;
      if (paramInt1 == i) {
        paramInt2 = paramContext.data;
      }
    }
    return paramInt2;
  }
  
  public static int resolveMinimumAccessibleTouchTarget(Context paramContext)
  {
    int i = R.attr.minTouchTargetSize;
    int j = R.dimen.mtrl_min_touch_target_size;
    return resolveDimension(paramContext, i, j);
  }
  
  public static int resolveOrThrow(Context paramContext, int paramInt, String paramString)
  {
    return resolveTypedValueOrThrow(paramContext, paramInt, paramString).data;
  }
  
  public static int resolveOrThrow(View paramView, int paramInt)
  {
    return resolveTypedValueOrThrow(paramView, paramInt).data;
  }
  
  public static TypedValue resolveTypedValueOrThrow(Context paramContext, int paramInt, String paramString)
  {
    Object localObject = resolve(paramContext, paramInt);
    if (localObject != null) {
      return localObject;
    }
    localObject = new java/lang/IllegalArgumentException;
    paramContext = paramContext.getResources().getResourceName(paramInt);
    paramContext = new Object[] { paramString, paramContext };
    paramContext = String.format(m54207b69.F54207b69_11("<_7A6F7D2F83324035323F3745388C4C8E394F453D4E944F4745984552569C988C9B4DA1614F50535D65535565AB585EAE6D6BB15F6E60B56D69B8606B666ABD7D6F70C16E7B7F7881B9C8507B76CC8A8D81D08C897F8C9084D7859486DB889599DF9F8D8E919BA39193A3E9A19DEC949F9A9EF19EABAFA8B1F7A9A7FAA6ACB9BDABBB01A9B4AFB306B3C0C4BDC60CB9BF0FC7C3CACEC2CCC217D2C7CBCE1CA9D6DAD3DC14B6E3D1E1D5DFE8DEC8DDE0DEE0E2ECE4DFE1352EE8E639F93BF8F8EBFCFBF3FE02F6F13D39"), paramContext);
    ((IllegalArgumentException)localObject).<init>(paramContext);
    throw ((Throwable)localObject);
  }
  
  public static TypedValue resolveTypedValueOrThrow(View paramView, int paramInt)
  {
    Context localContext = paramView.getContext();
    paramView = paramView.getClass().getCanonicalName();
    return resolveTypedValueOrThrow(localContext, paramInt, paramView);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.resources.MaterialAttributes
 * JD-Core Version:    0.7.0.1
 */