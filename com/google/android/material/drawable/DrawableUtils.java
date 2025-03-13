package com.google.android.material.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.carousel.OooO0OO;
import java.io.IOException;
import java.util.Arrays;
import m54207b69;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class DrawableUtils
{
  public static Drawable compositeTwoLayeredDrawable(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    if (paramDrawable1 == null) {
      return paramDrawable2;
    }
    if (paramDrawable2 == null) {
      return paramDrawable1;
    }
    LayerDrawable localLayerDrawable = new android/graphics/drawable/LayerDrawable;
    float f1 = 2.802597E-045F;
    Drawable[] arrayOfDrawable = new Drawable[2];
    arrayOfDrawable[0] = paramDrawable1;
    int i = 1;
    arrayOfDrawable[i] = paramDrawable2;
    localLayerDrawable.<init>(arrayOfDrawable);
    int j = paramDrawable2.getIntrinsicWidth();
    int k = -1;
    float f2 = 0.0F / 0.0F;
    if (j != k)
    {
      j = paramDrawable2.getIntrinsicHeight();
      if (j != k)
      {
        j = paramDrawable2.getIntrinsicWidth();
        k = paramDrawable1.getIntrinsicWidth();
        if (j <= k)
        {
          j = paramDrawable2.getIntrinsicHeight();
          k = paramDrawable1.getIntrinsicHeight();
          if (j <= k)
          {
            m = paramDrawable2.getIntrinsicWidth();
            int n = paramDrawable2.getIntrinsicHeight();
            break label261;
          }
        }
        j = paramDrawable2.getIntrinsicWidth();
        f1 = j;
        float f3 = paramDrawable2.getIntrinsicHeight();
        f1 /= f3;
        f3 = paramDrawable1.getIntrinsicWidth();
        k = paramDrawable1.getIntrinsicHeight();
        f2 = k;
        f3 /= f2;
        boolean bool = f1 < f3;
        if (!bool)
        {
          m = paramDrawable1.getIntrinsicWidth();
          f3 = m / f1;
          i1 = (int)f3;
          break label261;
        }
        i1 = paramDrawable1.getIntrinsicHeight();
        float f4 = i1;
        f1 *= f4;
        m = (int)f1;
        break label261;
      }
    }
    int i1 = paramDrawable1.getIntrinsicWidth();
    int m = paramDrawable1.getIntrinsicHeight();
    int i2 = i1;
    i1 = m;
    m = i2;
    label261:
    localLayerDrawable.setLayerSize(i, m, i1);
    localLayerDrawable.setLayerGravity(i, 17);
    return localLayerDrawable;
  }
  
  public static Drawable createTintableDrawableIfNeeded(Drawable paramDrawable, ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    return createTintableMutatedDrawableIfNeeded(paramDrawable, paramColorStateList, paramMode, false);
  }
  
  public static Drawable createTintableMutatedDrawableIfNeeded(Drawable paramDrawable, ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    return createTintableMutatedDrawableIfNeeded(paramDrawable, paramColorStateList, paramMode, false);
  }
  
  private static Drawable createTintableMutatedDrawableIfNeeded(Drawable paramDrawable, ColorStateList paramColorStateList, PorterDuff.Mode paramMode, boolean paramBoolean)
  {
    if (paramDrawable == null) {
      return null;
    }
    if (paramColorStateList != null)
    {
      paramDrawable = DrawableCompat.OooOOo(paramDrawable).mutate();
      if (paramMode != null) {
        DrawableCompat.OooOOOo(paramDrawable, paramMode);
      }
    }
    else if (paramBoolean)
    {
      paramDrawable.mutate();
    }
    return paramDrawable;
  }
  
  public static int[] getCheckedState(int[] paramArrayOfInt)
  {
    int i = 0;
    int[] arrayOfInt = null;
    int k;
    for (;;)
    {
      int j = paramArrayOfInt.length;
      k = 16842912;
      if (i >= j) {
        break;
      }
      j = paramArrayOfInt[i];
      if (j == k) {
        return paramArrayOfInt;
      }
      if (j == 0)
      {
        paramArrayOfInt = (int[])paramArrayOfInt.clone();
        paramArrayOfInt[i] = k;
        return paramArrayOfInt;
      }
      i += 1;
    }
    i = paramArrayOfInt.length + 1;
    arrayOfInt = Arrays.copyOf(paramArrayOfInt, i);
    int m = paramArrayOfInt.length;
    arrayOfInt[m] = k;
    return arrayOfInt;
  }
  
  public static int[] getUncheckedState(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int[] arrayOfInt = new int[i];
    int j = paramArrayOfInt.length;
    int k = 0;
    int m = 0;
    while (k < j)
    {
      int n = paramArrayOfInt[k];
      int i1 = 16842912;
      if (n != i1)
      {
        i1 = m + 1;
        arrayOfInt[m] = n;
        m = i1;
      }
      k += 1;
    }
    return arrayOfInt;
  }
  
  public static AttributeSet parseDrawableXml(Context paramContext, int paramInt, CharSequence paramCharSequence)
  {
    try
    {
      paramContext = paramContext.getResources();
      paramContext = paramContext.getXml(paramInt);
      int i;
      int j;
      int k;
      do
      {
        i = paramContext.next();
        j = 2;
        if (i == j) {
          break;
        }
        k = 1;
      } while (i != k);
      if (i == j)
      {
        localObject = paramContext.getName();
        boolean bool = TextUtils.equals((CharSequence)localObject, paramCharSequence);
        if (bool) {
          return Xml.asAttributeSet(paramContext);
        }
        paramContext = new org/xmlpull/v1/XmlPullParserException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str1 = "^`2D161517440D071D0D490B4B68";
        str1 = m54207b69.F54207b69_11(str1);
        ((StringBuilder)localObject).append(str1);
        ((StringBuilder)localObject).append(paramCharSequence);
        paramCharSequence = ";e5B461814081C174C190D0C";
        paramCharSequence = m54207b69.F54207b69_11(paramCharSequence);
        ((StringBuilder)localObject).append(paramCharSequence);
        paramCharSequence = ((StringBuilder)localObject).toString();
        paramContext.<init>(paramCharSequence);
        throw paramContext;
      }
      paramContext = new org/xmlpull/v1/XmlPullParserException;
      paramCharSequence = "<27C5E14444A58464D1A4F5D601E616B566C67";
      paramCharSequence = m54207b69.F54207b69_11(paramCharSequence);
      paramContext.<init>(paramCharSequence);
      throw paramContext;
    }
    catch (IOException paramContext) {}catch (XmlPullParserException paramContext) {}
    paramCharSequence = new android/content/res/Resources$NotFoundException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str1 = m54207b69.F54207b69_11("HH0B2A2872406D2A2E3135723535393D3C784B3F4E3B52504245811B278488964F");
    ((StringBuilder)localObject).append(str1);
    String str2 = Integer.toHexString(paramInt);
    ((StringBuilder)localObject).append(str2);
    str2 = ((StringBuilder)localObject).toString();
    paramCharSequence.<init>(str2);
    paramCharSequence.initCause(paramContext);
    throw paramCharSequence;
  }
  
  public static void setOutlineToPath(Outline paramOutline, Path paramPath)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j)
    {
      OooO0OO.OooO00o(paramOutline, paramPath);
    }
    else
    {
      j = 29;
      if (i < j) {}
    }
    try
    {
      paramOutline.setConvexPath(paramPath);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      boolean bool;
      label50:
      break label50;
    }
    bool = paramPath.isConvex();
    if (bool) {
      paramOutline.setConvexPath(paramPath);
    }
  }
  
  public static void setRippleDrawableRadius(RippleDrawable paramRippleDrawable, int paramInt)
  {
    paramRippleDrawable.setRadius(paramInt);
  }
  
  public static void setTint(Drawable paramDrawable, int paramInt)
  {
    int i;
    if (paramInt != 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      DrawableCompat.OooOOO(paramDrawable, paramInt);
    }
    else
    {
      paramInt = 0;
      DrawableCompat.OooOOOO(paramDrawable, null);
    }
  }
  
  public static PorterDuffColorFilter updateTintFilter(Drawable paramDrawable, ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList != null) && (paramMode != null))
    {
      paramDrawable = paramDrawable.getState();
      int i = paramColorStateList.getColorForState(paramDrawable, 0);
      paramColorStateList = new android/graphics/PorterDuffColorFilter;
      paramColorStateList.<init>(i, paramMode);
      return paramColorStateList;
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.drawable.DrawableUtils
 * JD-Core Version:    0.7.0.1
 */