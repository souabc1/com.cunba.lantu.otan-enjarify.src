package com.xuexiang.xui.widget.textview.badge;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import java.util.Random;
import m54207b69;

class BadgeAnimator$BitmapFragment
{
  public Random OooO00o;
  public float OooO0O0;
  public float OooO0OO;
  public float OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public Paint OooO0oO;
  
  public BadgeAnimator$BitmapFragment()
  {
    Object localObject = new android/graphics/Paint;
    ((Paint)localObject).<init>();
    this.OooO0oO = ((Paint)localObject);
    ((Paint)localObject).setAntiAlias(true);
    localObject = this.OooO0oO;
    Paint.Style localStyle = Paint.Style.FILL;
    ((Paint)localObject).setStyle(localStyle);
    localObject = new java/util/Random;
    ((Random)localObject).<init>();
    this.OooO00o = ((Random)localObject);
  }
  
  public void OooO00o(float paramFloat, Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    arrayOfObject[2] = paramCanvas;
    m54207b69.F54207b69_00(6222, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.textview.badge.BadgeAnimator.BitmapFragment
 * JD-Core Version:    0.7.0.1
 */