package com.xuexiang.xui.widget.progress.ratingbar;

import android.view.MotionEvent;
import java.text.DecimalFormat;
import m54207b69;

final class RatingBarUtils
{
  public static DecimalFormat OooO00o;
  
  private RatingBarUtils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static float OooO00o(PartialView paramPartialView, float paramFloat1, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramPartialView;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    return m54207b69.F54207b69_07(5431, arrayOfObject);
  }
  
  public static float OooO0O0(float paramFloat1, int paramInt, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = Float.valueOf(paramFloat1);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localObject;
    return m54207b69.F54207b69_07(5432, arrayOfObject);
  }
  
  public static boolean OooO0OO(float paramFloat1, float paramFloat2, MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[3];
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[0] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[1] = localFloat;
    arrayOfObject[2] = paramMotionEvent;
    return m54207b69.F54207b69_01(5433, arrayOfObject);
  }
  
  public static DecimalFormat getDecimalFormat()
  {
    Object[] arrayOfObject = new Object[0];
    return (DecimalFormat)m54207b69.F54207b69_09(5434, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.progress.ratingbar.RatingBarUtils
 * JD-Core Version:    0.7.0.1
 */