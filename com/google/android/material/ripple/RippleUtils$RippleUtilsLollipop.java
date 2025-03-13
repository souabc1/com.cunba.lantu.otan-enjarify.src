package com.google.android.material.ripple;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.R.attr;
import com.google.android.material.color.MaterialColors;

class RippleUtils$RippleUtilsLollipop
{
  private static Drawable createOvalRipple(Context paramContext, int paramInt)
  {
    Object localObject = new android/graphics/drawable/GradientDrawable;
    ((GradientDrawable)localObject).<init>();
    ((GradientDrawable)localObject).setColor(-1);
    ((GradientDrawable)localObject).setShape(1);
    InsetDrawable localInsetDrawable = new android/graphics/drawable/InsetDrawable;
    localInsetDrawable.<init>((Drawable)localObject, paramInt, paramInt, paramInt, paramInt);
    RippleDrawable localRippleDrawable = new android/graphics/drawable/RippleDrawable;
    int i = R.attr.colorControlHighlight;
    localObject = ColorStateList.valueOf(0);
    paramContext = MaterialColors.getColorStateList(paramContext, i, (ColorStateList)localObject);
    localRippleDrawable.<init>(paramContext, null, localInsetDrawable);
    return localRippleDrawable;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.ripple.RippleUtils.RippleUtilsLollipop
 * JD-Core Version:    0.7.0.1
 */