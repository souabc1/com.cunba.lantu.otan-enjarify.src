package com.google.android.material.internal;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R.attr;
import com.google.android.material.R.styleable;
import com.google.android.material.resources.MaterialAttributes;
import m54207b69;

public final class ThemeEnforcement
{
  private static final int[] APPCOMPAT_CHECK_ATTRS;
  private static final String APPCOMPAT_THEME_NAME = "Theme.AppCompat";
  private static final int[] MATERIAL_CHECK_ATTRS;
  private static final String MATERIAL_THEME_NAME = "Theme.MaterialComponents";
  
  static
  {
    int i = R.attr.colorPrimary;
    APPCOMPAT_CHECK_ATTRS = new int[] { i };
    i = R.attr.colorPrimaryVariant;
    MATERIAL_CHECK_ATTRS = new int[] { i };
  }
  
  public static void checkAppCompatTheme(Context paramContext)
  {
    int[] arrayOfInt = APPCOMPAT_CHECK_ATTRS;
    String str = m54207b69.F54207b69_11("qf320F050E074D2D1D1E2E1316221420");
    checkTheme(paramContext, arrayOfInt, str);
  }
  
  private static void checkCompatibleTheme(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = R.styleable.ThemeEnforcement;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt1, paramInt2);
    paramInt1 = R.styleable.ThemeEnforcement_enforceMaterialTheme;
    paramInt2 = 0;
    paramInt1 = paramAttributeSet.getBoolean(paramInt1, false);
    paramAttributeSet.recycle();
    if (paramInt1 != 0)
    {
      paramAttributeSet = new android/util/TypedValue;
      paramAttributeSet.<init>();
      Resources.Theme localTheme = paramContext.getTheme();
      paramInt2 = R.attr.isMaterialTheme;
      boolean bool = true;
      paramInt1 = localTheme.resolveAttribute(paramInt2, paramAttributeSet, bool);
      if (paramInt1 != 0)
      {
        paramInt1 = paramAttributeSet.type;
        paramInt2 = 18;
        if (paramInt1 == paramInt2)
        {
          int i = paramAttributeSet.data;
          if (i != 0) {}
        }
      }
      else
      {
        checkMaterialTheme(paramContext);
      }
    }
    checkAppCompatTheme(paramContext);
  }
  
  public static void checkMaterialTheme(Context paramContext)
  {
    int[] arrayOfInt = MATERIAL_CHECK_ATTRS;
    String str = m54207b69.F54207b69_11("iR063B39423B81253A2E402A463F4B1F4C4F334F4F4B513C38");
    checkTheme(paramContext, arrayOfInt, str);
  }
  
  private static void checkTextAppearance(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt1, int paramInt1, int paramInt2, int... paramVarArgs)
  {
    Object localObject = R.styleable.ThemeEnforcement;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt1, paramInt2);
    int i = R.styleable.ThemeEnforcement_enforceTextAppearance;
    int k = 0;
    boolean bool1 = ((TypedArray)localObject).getBoolean(i, false);
    if (!bool1)
    {
      ((TypedArray)localObject).recycle();
      return;
    }
    if (paramVarArgs != null)
    {
      int j = paramVarArgs.length;
      if (j != 0)
      {
        boolean bool2 = isCustomTextAppearanceValid(paramContext, paramAttributeSet, paramArrayOfInt1, paramInt1, paramInt2, paramVarArgs);
        break label113;
      }
    }
    int m = R.styleable.ThemeEnforcement_android_textAppearance;
    int n = -1;
    m = ((TypedArray)localObject).getResourceId(m, n);
    if (m != n) {
      k = 1;
    }
    m = k;
    label113:
    ((TypedArray)localObject).recycle();
    if (m != 0) {
      return;
    }
    paramContext = new java/lang/IllegalArgumentException;
    paramAttributeSet = m54207b69.F54207b69_11(",-7946466111534847654B4D534F661B6E586D6A57735D7424715E6674297160772D7F7F6B7269717B35753786786E72783DAA7A888DA19394808599877F8B864C8C9A9BA288949EA0904C57C3A9969AA8985EA695ACB463A3B5B667B4A1A59EA76DBAA470A8A8ABAFC7ADC378B7CCB0AF7DEAB7BBB4BD79D7C4D2C2DAC0C9BFEDC2C1DFC5C7CDC9E0E6968FCDEB9ADA9CD9D9F0E1DCD8DFE3DBF29E9E");
    paramContext.<init>(paramAttributeSet);
    throw paramContext;
  }
  
  private static void checkTheme(Context paramContext, int[] paramArrayOfInt, String paramString)
  {
    boolean bool = isTheme(paramContext, paramArrayOfInt);
    if (bool) {
      return;
    }
    paramContext = new java/lang/IllegalArgumentException;
    paramArrayOfInt = new java/lang/StringBuilder;
    paramArrayOfInt.<init>();
    String str = m54207b69.F54207b69_11("@d300D03471B15230F094D1515501D1A1C2755191E1D29212119232A5F321E33302D37233A684231383E6D2F3F40713E3B313A337744407A3D397D");
    paramArrayOfInt.append(str);
    paramArrayOfInt.append(paramString);
    paramString = m54207b69.F54207b69_11("4<1C1555512062225F615869645E656B61582624");
    paramArrayOfInt.append(paramString);
    paramArrayOfInt = paramArrayOfInt.toString();
    paramContext.<init>(paramArrayOfInt);
    throw paramContext;
  }
  
  public static boolean isAppCompatTheme(Context paramContext)
  {
    int[] arrayOfInt = APPCOMPAT_CHECK_ATTRS;
    return isTheme(paramContext, arrayOfInt);
  }
  
  private static boolean isCustomTextAppearanceValid(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt1, int paramInt1, int paramInt2, int... paramVarArgs)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt1, paramInt1, paramInt2);
    int i = paramVarArgs.length;
    paramArrayOfInt1 = null;
    paramInt1 = 0;
    while (paramInt1 < i)
    {
      paramInt2 = paramVarArgs[paramInt1];
      int j = -1;
      paramInt2 = paramContext.getResourceId(paramInt2, j);
      if (paramInt2 == j)
      {
        paramContext.recycle();
        return false;
      }
      paramInt1 += 1;
    }
    paramContext.recycle();
    return true;
  }
  
  public static boolean isMaterial3Theme(Context paramContext)
  {
    int i = R.attr.isMaterial3Theme;
    return MaterialAttributes.resolveBoolean(paramContext, i, false);
  }
  
  public static boolean isMaterialTheme(Context paramContext)
  {
    int[] arrayOfInt = MATERIAL_CHECK_ATTRS;
    return isTheme(paramContext, arrayOfInt);
  }
  
  private static boolean isTheme(Context paramContext, int[] paramArrayOfInt)
  {
    paramContext = paramContext.obtainStyledAttributes(paramArrayOfInt);
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfInt.length;
      if (i >= j) {
        break;
      }
      boolean bool = paramContext.hasValue(i);
      if (!bool)
      {
        paramContext.recycle();
        return false;
      }
      i += 1;
    }
    paramContext.recycle();
    return true;
  }
  
  public static TypedArray obtainStyledAttributes(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt1, int paramInt1, int paramInt2, int... paramVarArgs)
  {
    checkCompatibleTheme(paramContext, paramAttributeSet, paramInt1, paramInt2);
    checkTextAppearance(paramContext, paramAttributeSet, paramArrayOfInt1, paramInt1, paramInt2, paramVarArgs);
    return paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt1, paramInt1, paramInt2);
  }
  
  public static TintTypedArray obtainTintedStyledAttributes(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt1, int paramInt1, int paramInt2, int... paramVarArgs)
  {
    checkCompatibleTheme(paramContext, paramAttributeSet, paramInt1, paramInt2);
    checkTextAppearance(paramContext, paramAttributeSet, paramArrayOfInt1, paramInt1, paramInt2, paramVarArgs);
    return TintTypedArray.OooOOOO(paramContext, paramAttributeSet, paramArrayOfInt1, paramInt1, paramInt2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ThemeEnforcement
 * JD-Core Version:    0.7.0.1
 */