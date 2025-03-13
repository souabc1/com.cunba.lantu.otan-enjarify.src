package com.xuexiang.xui.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import m54207b69;

public final class DrawableUtils
{
  public static final Canvas OooO00o;
  
  static
  {
    Canvas localCanvas = new android/graphics/Canvas;
    localCanvas.<init>();
    OooO00o = localCanvas;
  }
  
  private DrawableUtils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static Drawable OooO(Context paramContext, Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramDrawable;
    return (Drawable)m54207b69.F54207b69_09(2061, arrayOfObject);
  }
  
  public static Drawable OooO00o(Bitmap paramBitmap)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramBitmap;
    return (Drawable)m54207b69.F54207b69_09(2062, arrayOfObject);
  }
  
  public static Bitmap OooO0O0(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = paramBitmap;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt4);
    arrayOfObject[4] = localInteger;
    localInteger = Integer.valueOf(paramInt5);
    arrayOfObject[5] = localInteger;
    return (Bitmap)m54207b69.F54207b69_09(2063, arrayOfObject);
  }
  
  public static Bitmap OooO0OO(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramDrawable;
    return (Bitmap)m54207b69.F54207b69_09(2064, arrayOfObject);
  }
  
  public static Bitmap OooO0Oo(Context paramContext, int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramContext;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (Bitmap)m54207b69.F54207b69_09(2065, arrayOfObject);
  }
  
  public static StateListDrawable OooO0o(int paramInt1, int paramInt2, int paramInt3)
  {
    Object[] arrayOfObject = new Object[3];
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[0] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[2] = localInteger;
    return (StateListDrawable)m54207b69.F54207b69_09(2066, arrayOfObject);
  }
  
  public static StateListDrawable OooO0o0(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[2];
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[0] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[1] = localInteger;
    return (StateListDrawable)m54207b69.F54207b69_09(2067, arrayOfObject);
  }
  
  public static GradientDrawable OooO0oO(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[2];
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[0] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[1] = localInteger;
    return (GradientDrawable)m54207b69.F54207b69_09(2068, arrayOfObject);
  }
  
  public static StateListDrawable OooO0oo(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramDrawable1;
    arrayOfObject[1] = paramDrawable2;
    return (StateListDrawable)m54207b69.F54207b69_09(2069, arrayOfObject);
  }
  
  public static Drawable OooOO0(Context paramContext, Drawable paramDrawable, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramDrawable;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = localBoolean;
    return (Drawable)m54207b69.F54207b69_09(2070, arrayOfObject);
  }
  
  public static boolean OooOO0O(Bitmap paramBitmap)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramBitmap;
    return m54207b69.F54207b69_01(2071, arrayOfObject);
  }
  
  public static Bitmap OooOO0o(Bitmap paramBitmap, int paramInt, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = paramBitmap;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(paramFloat1);
    arrayOfObject[2] = localObject;
    localObject = Float.valueOf(paramFloat2);
    arrayOfObject[3] = localObject;
    localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[4] = localObject;
    return (Bitmap)m54207b69.F54207b69_09(2072, arrayOfObject);
  }
  
  public static Drawable OooOOO0(Drawable paramDrawable, int paramInt, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = paramDrawable;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(paramFloat1);
    arrayOfObject[2] = localObject;
    localObject = Float.valueOf(paramFloat2);
    arrayOfObject[3] = localObject;
    localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[4] = localObject;
    return (Drawable)m54207b69.F54207b69_09(2073, arrayOfObject);
  }
  
  public static StateListDrawable getDrawable(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    return (StateListDrawable)m54207b69.F54207b69_09(2074, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.utils.DrawableUtils
 * JD-Core Version:    0.7.0.1
 */