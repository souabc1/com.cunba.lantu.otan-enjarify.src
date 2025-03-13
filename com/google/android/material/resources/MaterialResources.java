package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R.styleable;

public class MaterialResources
{
  private static final float FONT_SCALE_1_3 = 1.3F;
  private static final float FONT_SCALE_2_0 = 2.0F;
  
  public static ColorStateList getColorStateList(Context paramContext, TypedArray paramTypedArray, int paramInt)
  {
    boolean bool = paramTypedArray.hasValue(paramInt);
    if (bool)
    {
      int i = paramTypedArray.getResourceId(paramInt, 0);
      if (i != 0)
      {
        paramContext = AppCompatResources.OooO00o(paramContext, i);
        if (paramContext != null) {
          return paramContext;
        }
      }
    }
    return paramTypedArray.getColorStateList(paramInt);
  }
  
  public static ColorStateList getColorStateList(Context paramContext, TintTypedArray paramTintTypedArray, int paramInt)
  {
    boolean bool = paramTintTypedArray.OooOO0o(paramInt);
    if (bool)
    {
      int i = paramTintTypedArray.OooOO0O(paramInt, 0);
      if (i != 0)
      {
        paramContext = AppCompatResources.OooO00o(paramContext, i);
        if (paramContext != null) {
          return paramContext;
        }
      }
    }
    return paramTintTypedArray.getColorStateList(paramInt);
  }
  
  private static int getComplexUnit(TypedValue paramTypedValue)
  {
    return paramTypedValue.getComplexUnit();
  }
  
  public static int getDimensionPixelSize(Context paramContext, TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    boolean bool = paramTypedArray.getValue(paramInt1, localTypedValue);
    if (bool)
    {
      int i = localTypedValue.type;
      int j = 2;
      if (i == j)
      {
        paramContext = paramContext.getTheme();
        int k = localTypedValue.data;
        paramTypedArray = new int[] { k };
        paramContext = paramContext.obtainStyledAttributes(paramTypedArray);
        k = paramContext.getDimensionPixelSize(0, paramInt2);
        paramContext.recycle();
        return k;
      }
    }
    return paramTypedArray.getDimensionPixelSize(paramInt1, paramInt2);
  }
  
  public static Drawable getDrawable(Context paramContext, TypedArray paramTypedArray, int paramInt)
  {
    boolean bool = paramTypedArray.hasValue(paramInt);
    if (bool)
    {
      int i = paramTypedArray.getResourceId(paramInt, 0);
      if (i != 0)
      {
        paramContext = AppCompatResources.OooO0O0(paramContext, i);
        if (paramContext != null) {
          return paramContext;
        }
      }
    }
    return paramTypedArray.getDrawable(paramInt);
  }
  
  public static int getIndexWithValue(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    boolean bool = paramTypedArray.hasValue(paramInt1);
    if (bool) {
      return paramInt1;
    }
    return paramInt2;
  }
  
  public static TextAppearance getTextAppearance(Context paramContext, TypedArray paramTypedArray, int paramInt)
  {
    boolean bool = paramTypedArray.hasValue(paramInt);
    if (bool)
    {
      bool = false;
      int i = paramTypedArray.getResourceId(paramInt, 0);
      if (i != 0)
      {
        TextAppearance localTextAppearance = new com/google/android/material/resources/TextAppearance;
        localTextAppearance.<init>(paramContext, i);
        return localTextAppearance;
      }
    }
    return null;
  }
  
  public static int getUnscaledTextSize(Context paramContext, int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {
      return paramInt2;
    }
    Object localObject = R.styleable.TextAppearance;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramInt1, (int[])localObject);
    localObject = new android/util/TypedValue;
    ((TypedValue)localObject).<init>();
    int i = R.styleable.TextAppearance_android_textSize;
    boolean bool = localTypedArray.getValue(i, (TypedValue)localObject);
    localTypedArray.recycle();
    if (!bool) {
      return paramInt2;
    }
    paramInt1 = getComplexUnit((TypedValue)localObject);
    paramInt2 = 2;
    if (paramInt1 == paramInt2)
    {
      float f1 = TypedValue.complexToFloat(((TypedValue)localObject).data);
      float f2 = paramContext.getResources().getDisplayMetrics().density;
      return Math.round(f1 * f2);
    }
    paramInt1 = ((TypedValue)localObject).data;
    paramContext = paramContext.getResources().getDisplayMetrics();
    return TypedValue.complexToDimensionPixelSize(paramInt1, paramContext);
  }
  
  public static boolean isFontScaleAtLeast1_3(Context paramContext)
  {
    paramContext = paramContext.getResources().getConfiguration();
    float f1 = paramContext.fontScale;
    float f2 = 1.3F;
    boolean bool = f1 < f2;
    if (!bool)
    {
      bool = true;
      f1 = 1.4E-45F;
    }
    else
    {
      bool = false;
      f1 = 0.0F;
      paramContext = null;
    }
    return bool;
  }
  
  public static boolean isFontScaleAtLeast2_0(Context paramContext)
  {
    paramContext = paramContext.getResources().getConfiguration();
    float f1 = paramContext.fontScale;
    float f2 = 2.0F;
    boolean bool = f1 < f2;
    if (!bool)
    {
      bool = true;
      f1 = 1.4E-45F;
    }
    else
    {
      bool = false;
      f1 = 0.0F;
      paramContext = null;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.resources.MaterialResources
 * JD-Core Version:    0.7.0.1
 */