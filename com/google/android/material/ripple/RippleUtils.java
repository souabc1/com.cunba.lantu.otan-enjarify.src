package com.google.android.material.ripple;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.core.graphics.ColorUtils;

public class RippleUtils
{
  private static final int[] ENABLED_PRESSED_STATE_SET;
  private static final int[] FOCUSED_STATE_SET;
  private static final int[] HOVERED_FOCUSED_STATE_SET;
  private static final int[] HOVERED_STATE_SET;
  static final String LOG_TAG = RippleUtils.class.getSimpleName();
  private static final int[] PRESSED_STATE_SET;
  private static final int[] SELECTED_FOCUSED_STATE_SET;
  private static final int[] SELECTED_HOVERED_FOCUSED_STATE_SET;
  private static final int[] SELECTED_HOVERED_STATE_SET;
  private static final int[] SELECTED_PRESSED_STATE_SET;
  private static final int[] SELECTED_STATE_SET;
  static final String TRANSPARENT_DEFAULT_COLOR_WARNING = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";
  public static final boolean USE_FRAMEWORK_RIPPLE = true;
  
  static
  {
    int i = 16842919;
    PRESSED_STATE_SET = new int[] { i };
    int j = 16843623;
    int k = 16842908;
    HOVERED_FOCUSED_STATE_SET = new int[] { j, k };
    FOCUSED_STATE_SET = new int[] { k };
    HOVERED_STATE_SET = new int[] { j };
    int m = 16842913;
    SELECTED_PRESSED_STATE_SET = new int[] { m, i };
    int[] tmp77_75 = new int[3];
    int[] tmp78_77 = tmp77_75;
    int[] tmp78_77 = tmp77_75;
    tmp78_77[0] = m;
    tmp78_77[1] = j;
    tmp78_77[2] = k;
    SELECTED_HOVERED_FOCUSED_STATE_SET = tmp78_77;
    SELECTED_FOCUSED_STATE_SET = new int[] { m, k };
    SELECTED_HOVERED_STATE_SET = new int[] { m, j };
    SELECTED_STATE_SET = new int[] { m };
    ENABLED_PRESSED_STATE_SET = new int[] { 16842910, i };
  }
  
  public static ColorStateList convertToRippleDrawableColor(ColorStateList paramColorStateList)
  {
    boolean bool = USE_FRAMEWORK_RIPPLE;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    int[] arrayOfInt1 = null;
    if (bool)
    {
      localObject1 = new int[j][];
      arrayOfInt2 = new int[j];
      localObject2 = SELECTED_STATE_SET;
      localObject1[0] = localObject2;
      localObject2 = SELECTED_PRESSED_STATE_SET;
      int i1 = getColorForState(paramColorStateList, (int[])localObject2);
      arrayOfInt2[0] = i1;
      arrayOfInt1 = FOCUSED_STATE_SET;
      localObject1[m] = arrayOfInt1;
      n = getColorForState(paramColorStateList, arrayOfInt1);
      arrayOfInt2[m] = n;
      arrayOfInt3 = StateSet.NOTHING;
      localObject1[k] = arrayOfInt3;
      arrayOfInt3 = PRESSED_STATE_SET;
      i2 = getColorForState(paramColorStateList, arrayOfInt3);
      arrayOfInt2[k] = i2;
      paramColorStateList = new android/content/res/ColorStateList;
      paramColorStateList.<init>((int[][])localObject1, arrayOfInt2);
      return paramColorStateList;
    }
    int i = 10;
    Object localObject2 = new int[i][];
    Object localObject1 = new int[i];
    int[] arrayOfInt4 = SELECTED_PRESSED_STATE_SET;
    localObject2[0] = arrayOfInt4;
    int i3 = getColorForState(paramColorStateList, arrayOfInt4);
    localObject1[0] = i3;
    arrayOfInt4 = SELECTED_HOVERED_FOCUSED_STATE_SET;
    localObject2[m] = arrayOfInt4;
    i3 = getColorForState(paramColorStateList, arrayOfInt4);
    localObject1[m] = i3;
    int[] arrayOfInt3 = SELECTED_FOCUSED_STATE_SET;
    localObject2[k] = arrayOfInt3;
    m = getColorForState(paramColorStateList, arrayOfInt3);
    localObject1[k] = m;
    int[] arrayOfInt5 = SELECTED_HOVERED_STATE_SET;
    localObject2[j] = arrayOfInt5;
    k = getColorForState(paramColorStateList, arrayOfInt5);
    localObject1[j] = k;
    int[] arrayOfInt2 = SELECTED_STATE_SET;
    k = 4;
    localObject2[k] = arrayOfInt2;
    localObject1[k] = 0;
    arrayOfInt2 = PRESSED_STATE_SET;
    k = 5;
    localObject2[k] = arrayOfInt2;
    j = getColorForState(paramColorStateList, arrayOfInt2);
    localObject1[k] = j;
    arrayOfInt2 = HOVERED_FOCUSED_STATE_SET;
    k = 6;
    localObject2[k] = arrayOfInt2;
    j = getColorForState(paramColorStateList, arrayOfInt2);
    localObject1[k] = j;
    arrayOfInt2 = FOCUSED_STATE_SET;
    k = 7;
    localObject2[k] = arrayOfInt2;
    j = getColorForState(paramColorStateList, arrayOfInt2);
    localObject1[k] = j;
    arrayOfInt2 = HOVERED_STATE_SET;
    k = 8;
    localObject2[k] = arrayOfInt2;
    int i2 = getColorForState(paramColorStateList, arrayOfInt2);
    localObject1[k] = i2;
    paramColorStateList = StateSet.NOTHING;
    j = 9;
    localObject2[j] = paramColorStateList;
    localObject1[j] = 0;
    paramColorStateList = new android/content/res/ColorStateList;
    paramColorStateList.<init>((int[][])localObject2, (int[])localObject1);
    return paramColorStateList;
  }
  
  public static Drawable createOvalRippleLollipop(Context paramContext, int paramInt)
  {
    return RippleUtils.RippleUtilsLollipop.access$000(paramContext, paramInt);
  }
  
  private static int doubleAlpha(int paramInt)
  {
    int i = Math.min(Color.alpha(paramInt) * 2, 255);
    return ColorUtils.OooOO0(paramInt, i);
  }
  
  private static int getColorForState(ColorStateList paramColorStateList, int[] paramArrayOfInt)
  {
    int j;
    if (paramColorStateList != null)
    {
      int i = paramColorStateList.getDefaultColor();
      j = paramColorStateList.getColorForState(paramArrayOfInt, i);
    }
    else
    {
      j = 0;
      paramColorStateList = null;
    }
    boolean bool = USE_FRAMEWORK_RIPPLE;
    if (bool) {
      j = doubleAlpha(j);
    }
    return j;
  }
  
  public static ColorStateList sanitizeRippleDrawableColor(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null) {
      return paramColorStateList;
    }
    return ColorStateList.valueOf(0);
  }
  
  public static boolean shouldDrawRippleCompat(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    boolean bool1 = false;
    int j = 0;
    int k = 0;
    int m = 0;
    boolean bool2;
    for (;;)
    {
      bool2 = true;
      if (j >= i) {
        break;
      }
      int n = paramArrayOfInt[j];
      int i1 = 16842910;
      if (n == i1)
      {
        k = bool2;
      }
      else
      {
        i1 = 16842908;
        if (n == i1) {}
        do
        {
          do
          {
            m = bool2;
            break;
            i1 = 16842919;
          } while (n == i1);
          i1 = 16843623;
        } while (n == i1);
      }
      j += 1;
    }
    if ((k != 0) && (m != 0)) {
      bool1 = bool2;
    }
    return bool1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.ripple.RippleUtils
 * JD-Core Version:    0.7.0.1
 */