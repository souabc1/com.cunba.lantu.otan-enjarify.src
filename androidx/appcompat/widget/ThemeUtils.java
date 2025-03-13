package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.R.styleable;
import androidx.core.graphics.ColorUtils;

public class ThemeUtils
{
  public static final int[] OooO = new int[0];
  public static final ThreadLocal OooO00o;
  public static final int[] OooO0O0;
  public static final int[] OooO0OO;
  public static final int[] OooO0Oo;
  public static final int[] OooO0o;
  public static final int[] OooO0o0;
  public static final int[] OooO0oO;
  public static final int[] OooO0oo;
  public static final int[] OooOO0 = new int[1];
  
  static
  {
    ThreadLocal localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    OooO00o = localThreadLocal;
    OooO0O0 = new int[] { -16842910 };
    OooO0OO = new int[] { 16842908 };
    OooO0Oo = new int[] { 16843518 };
    OooO0o0 = new int[] { 16842919 };
    OooO0o = new int[] { 16842912 };
    OooO0oO = new int[] { 16842913 };
    OooO0oo = new int[] { -16842919, -16842908 };
  }
  
  public static void OooO00o(View paramView, Context paramContext)
  {
    Object localObject = R.styleable.AppCompatTheme;
    paramContext = paramContext.obtainStyledAttributes((int[])localObject);
    try
    {
      int i = R.styleable.AppCompatTheme_windowActionBar;
      boolean bool = paramContext.hasValue(i);
      if (!bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = "View ";
        ((StringBuilder)localObject).append(str);
        paramView = paramView.getClass();
        ((StringBuilder)localObject).append(paramView);
        paramView = " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).";
        ((StringBuilder)localObject).append(paramView);
      }
      return;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public static int OooO0O0(Context paramContext, int paramInt)
  {
    Object localObject = OooO0o0(paramContext, paramInt);
    if (localObject != null)
    {
      boolean bool = ((ColorStateList)localObject).isStateful();
      if (bool)
      {
        paramContext = OooO0O0;
        paramInt = ((ColorStateList)localObject).getDefaultColor();
        return ((ColorStateList)localObject).getColorForState(paramContext, paramInt);
      }
    }
    localObject = getTypedValue();
    paramContext.getTheme().resolveAttribute(16842803, (TypedValue)localObject, true);
    float f = ((TypedValue)localObject).getFloat();
    return OooO0Oo(paramContext, paramInt, f);
  }
  
  public static int OooO0OO(Context paramContext, int paramInt)
  {
    int[] arrayOfInt = OooOO0;
    arrayOfInt[0] = paramInt;
    paramInt = 0;
    Object localObject1 = null;
    paramContext = TintTypedArray.OooOOO(paramContext, null, arrayOfInt);
    try
    {
      paramInt = paramContext.OooO0O0(0, 0);
      return paramInt;
    }
    finally
    {
      paramContext.OooOOOo();
    }
  }
  
  public static int OooO0Oo(Context paramContext, int paramInt, float paramFloat)
  {
    int i = OooO0OO(paramContext, paramInt);
    paramInt = Math.round(Color.alpha(i) * paramFloat);
    return ColorUtils.OooOO0(i, paramInt);
  }
  
  public static ColorStateList OooO0o0(Context paramContext, int paramInt)
  {
    int[] arrayOfInt = OooOO0;
    arrayOfInt[0] = paramInt;
    paramInt = 0;
    ColorStateList localColorStateList = null;
    paramContext = TintTypedArray.OooOOO(paramContext, null, arrayOfInt);
    try
    {
      localColorStateList = paramContext.getColorStateList(0);
      return localColorStateList;
    }
    finally
    {
      paramContext.OooOOOo();
    }
  }
  
  private static TypedValue getTypedValue()
  {
    ThreadLocal localThreadLocal = OooO00o;
    TypedValue localTypedValue = (TypedValue)localThreadLocal.get();
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      localThreadLocal.set(localTypedValue);
    }
    return localTypedValue;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ThemeUtils
 * JD-Core Version:    0.7.0.1
 */