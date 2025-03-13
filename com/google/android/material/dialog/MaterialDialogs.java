package com.google.android.material.dialog;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.R.dimen;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.ThemeEnforcement;

public class MaterialDialogs
{
  public static Rect getDialogBackgroundInsets(Context paramContext, int paramInt1, int paramInt2)
  {
    Object localObject1 = R.styleable.MaterialAlertDialog;
    int[] arrayOfInt = new int[0];
    Object localObject2 = paramContext;
    int i = paramInt1;
    int j = paramInt2;
    TypedArray localTypedArray = ThemeEnforcement.obtainStyledAttributes(paramContext, null, (int[])localObject1, paramInt1, paramInt2, arrayOfInt);
    paramInt2 = R.styleable.MaterialAlertDialog_backgroundInsetStart;
    localObject2 = paramContext.getResources();
    int k = R.dimen.mtrl_alert_dialog_background_inset_start;
    int m = ((Resources)localObject2).getDimensionPixelSize(k);
    paramInt2 = localTypedArray.getDimensionPixelSize(paramInt2, m);
    m = R.styleable.MaterialAlertDialog_backgroundInsetTop;
    Resources localResources1 = paramContext.getResources();
    int n = R.dimen.mtrl_alert_dialog_background_inset_top;
    k = localResources1.getDimensionPixelSize(n);
    m = localTypedArray.getDimensionPixelSize(m, k);
    k = R.styleable.MaterialAlertDialog_backgroundInsetEnd;
    localObject1 = paramContext.getResources();
    i = R.dimen.mtrl_alert_dialog_background_inset_end;
    n = ((Resources)localObject1).getDimensionPixelSize(i);
    k = localTypedArray.getDimensionPixelSize(k, n);
    n = R.styleable.MaterialAlertDialog_backgroundInsetBottom;
    Resources localResources2 = paramContext.getResources();
    j = R.dimen.mtrl_alert_dialog_background_inset_bottom;
    i = localResources2.getDimensionPixelSize(j);
    n = localTypedArray.getDimensionPixelSize(n, i);
    localTypedArray.recycle();
    paramContext = paramContext.getResources().getConfiguration();
    int i1 = paramContext.getLayoutDirection();
    paramInt1 = 1;
    if (i1 == paramInt1)
    {
      int i2 = k;
      k = paramInt2;
      paramInt2 = i2;
    }
    paramContext = new android/graphics/Rect;
    paramContext.<init>(paramInt2, m, k, n);
    return paramContext;
  }
  
  public static InsetDrawable insetDrawable(Drawable paramDrawable, Rect paramRect)
  {
    InsetDrawable localInsetDrawable = new android/graphics/drawable/InsetDrawable;
    int i = paramRect.left;
    int j = paramRect.top;
    int k = paramRect.right;
    int m = paramRect.bottom;
    localInsetDrawable.<init>(paramDrawable, i, j, k, m);
    return localInsetDrawable;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.dialog.MaterialDialogs
 * JD-Core Version:    0.7.0.1
 */