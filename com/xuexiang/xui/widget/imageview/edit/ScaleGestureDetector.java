package com.xuexiang.xui.widget.imageview.edit;

import android.view.MotionEvent;
import android.view.View;
import m54207b69;

class ScaleGestureDetector
{
  public float OooO;
  public final ScaleGestureDetector.OnScaleGestureListener OooO00o;
  public boolean OooO0O0;
  public MotionEvent OooO0OO;
  public MotionEvent OooO0Oo;
  public float OooO0o;
  public Vector2D OooO0o0;
  public float OooO0oO;
  public float OooO0oo;
  public float OooOO0;
  public float OooOO0O;
  public float OooOO0o;
  public float OooOOO;
  public float OooOOO0;
  public float OooOOOO;
  public float OooOOOo;
  public boolean OooOOo;
  public long OooOOo0;
  public int OooOOoo;
  public boolean OooOo0;
  public int OooOo00;
  
  public ScaleGestureDetector(ScaleGestureDetector.OnScaleGestureListener paramOnScaleGestureListener)
  {
    this.OooO00o = paramOnScaleGestureListener;
    paramOnScaleGestureListener = new com/xuexiang/xui/widget/imageview/edit/Vector2D;
    paramOnScaleGestureListener.<init>();
    this.OooO0o0 = paramOnScaleGestureListener;
  }
  
  private float getCurrentSpan()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(4001, arrayOfObject);
  }
  
  private float getPreviousSpan()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(4008, arrayOfObject);
  }
  
  public final int OooO00o(MotionEvent paramMotionEvent, int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localInteger;
    return m54207b69.F54207b69_05(3997, arrayOfObject);
  }
  
  public boolean OooO0O0(View paramView, MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    arrayOfObject[2] = paramMotionEvent;
    return m54207b69.F54207b69_01(3998, arrayOfObject);
  }
  
  public final void OooO0OO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3999, arrayOfObject);
  }
  
  public final void OooO0Oo(View paramView, MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    arrayOfObject[2] = paramMotionEvent;
    m54207b69.F54207b69_00(4000, arrayOfObject);
  }
  
  public Vector2D getCurrentSpanVector()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Vector2D)m54207b69.F54207b69_09(4002, arrayOfObject);
  }
  
  public float getCurrentSpanX()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(4003, arrayOfObject);
  }
  
  public float getCurrentSpanY()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(4004, arrayOfObject);
  }
  
  public long getEventTime()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_06(4005, arrayOfObject);
  }
  
  public float getFocusX()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(4006, arrayOfObject);
  }
  
  public float getFocusY()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(4007, arrayOfObject);
  }
  
  public float getPreviousSpanX()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(4009, arrayOfObject);
  }
  
  public float getPreviousSpanY()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(4010, arrayOfObject);
  }
  
  public float getScaleFactor()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(4011, arrayOfObject);
  }
  
  public long getTimeDelta()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_06(4012, arrayOfObject);
  }
  
  public boolean isInProgress()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(4013, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.edit.ScaleGestureDetector
 * JD-Core Version:    0.7.0.1
 */