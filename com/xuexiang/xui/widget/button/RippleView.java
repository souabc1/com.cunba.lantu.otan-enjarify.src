package com.xuexiang.xui.widget.button;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import m54207b69;

public class RippleView
  extends FrameLayout
{
  public int o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public float o00OooO;
  public Handler o00OooO0;
  public boolean o00OooOO;
  public int o00OooOo;
  public int o00OoooO;
  public float o00Ooooo;
  public final Runnable o00o0;
  public Boolean o00o00;
  public int o00o000;
  public float o00o0000;
  public float o00o000O;
  public ScaleAnimation o00o000o;
  public Integer o00o00O0;
  public Paint o00o00Oo;
  public int o00o00o;
  public Bitmap o00o00o0;
  public int o00o00oO;
  public GestureDetector o00o00oo;
  public RippleView.OnRippleCompleteListener o00o0O00;
  public int o0O00o0;
  public Boolean oo00oO;
  
  private Bitmap getCircleBitmap(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (Bitmap)m54207b69.F54207b69_09(2721, arrayOfObject);
  }
  
  public void OooO0O0(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    m54207b69.F54207b69_00(2717, arrayOfObject);
  }
  
  public final void OooO0OO(float paramFloat1, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    m54207b69.F54207b69_00(2718, arrayOfObject);
  }
  
  public final void OooO0Oo(Boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBoolean;
    m54207b69.F54207b69_00(2719, arrayOfObject);
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(2720, arrayOfObject);
  }
  
  public int getFrameRate()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(2722, arrayOfObject);
  }
  
  public int getRippleAlpha()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(2723, arrayOfObject);
  }
  
  public int getRippleColor()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(2724, arrayOfObject);
  }
  
  public int getRippleDuration()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(2725, arrayOfObject);
  }
  
  public int getRipplePadding()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(2726, arrayOfObject);
  }
  
  public RippleView.RippleType getRippleType()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (RippleView.RippleType)m54207b69.F54207b69_09(2727, arrayOfObject);
  }
  
  public int getZoomDuration()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(2728, arrayOfObject);
  }
  
  public float getZoomScale()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(2729, arrayOfObject);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(2730, arrayOfObject);
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt4);
    arrayOfObject[4] = localInteger;
    m54207b69.F54207b69_00(2731, arrayOfObject);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    Object localObject = this.o00o00oo;
    boolean bool = ((GestureDetector)localObject).onTouchEvent(paramMotionEvent);
    if (bool)
    {
      OooO0O0(paramMotionEvent);
      localObject = Boolean.FALSE;
      OooO0Oo((Boolean)localObject);
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setCentered(Boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBoolean;
    m54207b69.F54207b69_00(2733, arrayOfObject);
  }
  
  public void setFrameRate(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2734, arrayOfObject);
  }
  
  public void setOnRippleCompleteListener(RippleView.OnRippleCompleteListener paramOnRippleCompleteListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnRippleCompleteListener;
    m54207b69.F54207b69_00(2735, arrayOfObject);
  }
  
  public void setRippleAlpha(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2736, arrayOfObject);
  }
  
  public void setRippleColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2737, arrayOfObject);
  }
  
  public void setRippleDuration(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2738, arrayOfObject);
  }
  
  public void setRipplePadding(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2739, arrayOfObject);
  }
  
  public void setRippleType(RippleView.RippleType paramRippleType)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRippleType;
    m54207b69.F54207b69_00(2740, arrayOfObject);
  }
  
  public void setZoomDuration(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2741, arrayOfObject);
  }
  
  public void setZoomScale(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(2742, arrayOfObject);
  }
  
  public void setZooming(Boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBoolean;
    m54207b69.F54207b69_00(2743, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.button.RippleView
 * JD-Core Version:    0.7.0.1
 */