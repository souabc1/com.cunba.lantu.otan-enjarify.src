package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.core.math.MathUtils;

public class TypefaceUtils
{
  public static Typeface maybeCopyWithFontWeightAdjustment(Context paramContext, Typeface paramTypeface)
  {
    return maybeCopyWithFontWeightAdjustment(paramContext.getResources().getConfiguration(), paramTypeface);
  }
  
  public static Typeface maybeCopyWithFontWeightAdjustment(Configuration paramConfiguration, Typeface paramTypeface)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 31;
    if (i >= j)
    {
      i = OooO00o.OooO00o(paramConfiguration);
      j = -1 >>> 1;
      if (i != j)
      {
        i = OooO00o.OooO00o(paramConfiguration);
        if ((i != 0) && (paramTypeface != null))
        {
          i = paramTypeface.getWeight();
          int k = OooO00o.OooO00o(paramConfiguration);
          k = MathUtils.OooO0O0(i + k, 1, 1000);
          boolean bool = paramTypeface.isItalic();
          return Typeface.create(paramTypeface, k, bool);
        }
      }
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.resources.TypefaceUtils
 * JD-Core Version:    0.7.0.1
 */