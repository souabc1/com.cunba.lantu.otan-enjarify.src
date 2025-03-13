package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.core.graphics.PathParser;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.resources.MaterialAttributes;
import m54207b69;

public class MotionUtils
{
  private static final String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
  private static final String EASING_TYPE_FORMAT_END = ")";
  private static final String EASING_TYPE_FORMAT_START = "(";
  private static final String EASING_TYPE_PATH = "path";
  
  private static float getLegacyControlPoint(String[] paramArrayOfString, int paramInt)
  {
    paramArrayOfString = paramArrayOfString[paramInt];
    float f1 = Float.parseFloat(paramArrayOfString);
    float f2 = 0.0F;
    IllegalArgumentException localIllegalArgumentException = null;
    paramInt = f1 < 0.0F;
    if (paramInt >= 0)
    {
      f2 = 1.0F;
      paramInt = f1 < f2;
      if (paramInt <= 0) {
        return f1;
      }
    }
    localIllegalArgumentException = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("}t391C02201F1F5A181D1027251F61252A2A11182E2C691A3235331A6F1E32362031753B242B257A3D397D403C2C303F404A857687494F468B7D888E5856443E50555196565F45949B");
    localStringBuilder.append(str);
    localStringBuilder.append(f1);
    paramArrayOfString = localStringBuilder.toString();
    localIllegalArgumentException.<init>(paramArrayOfString);
    throw localIllegalArgumentException;
  }
  
  private static String getLegacyEasingContent(String paramString1, String paramString2)
  {
    int i = paramString2.length() + 1;
    int j = paramString1.length() + -1;
    return paramString1.substring(i, j);
  }
  
  private static TimeInterpolator getLegacyThemeInterpolator(String paramString)
  {
    Object localObject = m54207b69.F54207b69_11("_P3326343C3782383C32423F2D");
    boolean bool1 = isLegacyEasingType(paramString, (String)localObject);
    if (bool1)
    {
      paramString = getLegacyEasingContent(paramString, (String)localObject);
      localObject = ",";
      paramString = paramString.split((String)localObject);
      int j = paramString.length;
      int i = 4;
      float f1 = 5.605194E-045F;
      if (j == i)
      {
        float f2 = getLegacyControlPoint(paramString, 0);
        f1 = getLegacyControlPoint(paramString, 1);
        float f3 = getLegacyControlPoint(paramString, 2);
        float f4 = getLegacyControlPoint(paramString, 3);
        return PathInterpolatorCompat.OooO0O0(f2, f1, f3, f4);
      }
      localObject = new java/lang/IllegalArgumentException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str = m54207b69.F54207b69_11("G;76555155585A216562515C6068285D626E67702E6E6465606A72686A7A38746D68703D767E7284423744827F817C7783874C7D87868A857F538B97568A8590949C5C9BA18597A49063A1989499AB69ACA49AA8ADA35571A9ADA1A9B9B6BC79BBB4B0637E");
      localStringBuilder.append(str);
      int k = paramString.length;
      localStringBuilder.append(k);
      paramString = localStringBuilder.toString();
      ((IllegalArgumentException)localObject).<init>(paramString);
      throw ((Throwable)localObject);
    }
    localObject = m54207b69.F54207b69_11("FR2234283D");
    boolean bool2 = isLegacyEasingType(paramString, (String)localObject);
    if (bool2) {
      return PathInterpolatorCompat.OooO0OO(PathParser.OooO0o0(getLegacyEasingContent(paramString, (String)localObject)));
    }
    localObject = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11(":m24041D0F05090F54080B230F0E105B171C2F16161E622F2B35217168");
    localStringBuilder.append(str);
    localStringBuilder.append(paramString);
    paramString = localStringBuilder.toString();
    ((IllegalArgumentException)localObject).<init>(paramString);
    throw ((Throwable)localObject);
  }
  
  private static boolean isLegacyEasingAttribute(String paramString)
  {
    String str = m54207b69.F54207b69_11("_P3326343C3782383C32423F2D");
    boolean bool1 = isLegacyEasingType(paramString, str);
    if (!bool1)
    {
      str = m54207b69.F54207b69_11("FR2234283D");
      bool2 = isLegacyEasingType(paramString, str);
      if (!bool2)
      {
        bool2 = false;
        paramString = null;
        return bool2;
      }
    }
    boolean bool2 = true;
    return bool2;
  }
  
  private static boolean isLegacyEasingType(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(paramString2);
    localStringBuilder.append("(");
    paramString2 = localStringBuilder.toString();
    boolean bool1 = paramString1.startsWith(paramString2);
    if (bool1)
    {
      paramString2 = ")";
      bool2 = paramString1.endsWith(paramString2);
      if (bool2)
      {
        bool2 = true;
        break label62;
      }
    }
    boolean bool2 = false;
    paramString1 = null;
    label62:
    return bool2;
  }
  
  public static int resolveThemeDuration(Context paramContext, int paramInt1, int paramInt2)
  {
    return MaterialAttributes.resolveInteger(paramContext, paramInt1, paramInt2);
  }
  
  public static TimeInterpolator resolveThemeInterpolator(Context paramContext, int paramInt, TimeInterpolator paramTimeInterpolator)
  {
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    Resources.Theme localTheme = paramContext.getTheme();
    boolean bool1 = true;
    paramInt = localTheme.resolveAttribute(paramInt, localTypedValue, bool1);
    if (paramInt == 0) {
      return paramTimeInterpolator;
    }
    paramInt = localTypedValue.type;
    int i = 3;
    if (paramInt == i)
    {
      str = String.valueOf(localTypedValue.string);
      boolean bool2 = isLegacyEasingAttribute(str);
      if (bool2) {
        return getLegacyThemeInterpolator(str);
      }
      paramInt = localTypedValue.resourceId;
      return AnimationUtils.loadInterpolator(paramContext, paramInt);
    }
    paramContext = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("55785B435F5E601B575C4F66665E224F6C606962286856575E74705A5C6C32765F6662377A743A7A823D9E86866D7D75748A8A86748E7C4B7E887F947B83938E54939B89584E9987888F63A2A58DA9A8AAC0A598AFAFA775D3B39AAAA2A1B7B7B3A1BBA978B8A6A7AEC4C0AAACBCB383C9B786C688BAB6BDD3D3CB8FCED6C49389D4C2C3CA9EDDE0C8E4E3E5FBE0D3EAEAE2B0A7E7D5D6DDF3EFD9DBEBE2B8");
    paramContext.<init>(str);
    throw paramContext;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.motion.MotionUtils
 * JD-Core Version:    0.7.0.1
 */