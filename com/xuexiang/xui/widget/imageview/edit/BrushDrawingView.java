package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import java.util.Stack;
import m54207b69;

public class BrushDrawingView
  extends View
{
  public float o00OoOoo;
  public int o00Ooo0;
  public float o00Ooo00;
  public final Stack o00Ooo0O;
  public final Stack o00Ooo0o;
  public Canvas o00OooO;
  public final Paint o00OooO0;
  public boolean o00OooOO;
  public Path o00OooOo;
  public float o00OoooO;
  public BrushViewChangeListener o00Ooooo;
  public float o0O00o0;
  
  public void OooO00o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3866, arrayOfObject);
  }
  
  public final void OooO0O0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3867, arrayOfObject);
  }
  
  public final void OooO0OO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3868, arrayOfObject);
  }
  
  public final void OooO0Oo(float paramFloat1, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    m54207b69.F54207b69_00(3869, arrayOfObject);
  }
  
  public final void OooO0o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3870, arrayOfObject);
  }
  
  public final void OooO0o0(float paramFloat1, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    m54207b69.F54207b69_00(3871, arrayOfObject);
  }
  
  public int getBrushColor()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3872, arrayOfObject);
  }
  
  public boolean getBrushDrawingMode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(3873, arrayOfObject);
  }
  
  public float getBrushSize()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(3874, arrayOfObject);
  }
  
  public Paint getDrawingPaint()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Paint)m54207b69.F54207b69_09(3875, arrayOfObject);
  }
  
  public Pair getDrawingPath()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Pair)m54207b69.F54207b69_09(3876, arrayOfObject);
  }
  
  public float getEraserSize()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(3877, arrayOfObject);
  }
  
  public int getOpacity()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3878, arrayOfObject);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(3879, arrayOfObject);
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
    m54207b69.F54207b69_00(3880, arrayOfObject);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = this.o00OooOO;
    if (bool)
    {
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      int i = paramMotionEvent.getAction();
      int j = 1;
      if (i != 0)
      {
        if (i != j)
        {
          int k = 2;
          if (i == k) {
            OooO0Oo(f1, f2);
          }
        }
        else
        {
          OooO0o();
        }
      }
      else {
        OooO0o0(f1, f2);
      }
      invalidate();
      return j;
    }
    return false;
  }
  
  public void setBrushColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3882, arrayOfObject);
  }
  
  public void setBrushDrawingMode(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(3883, arrayOfObject);
  }
  
  public void setBrushEraserColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3884, arrayOfObject);
  }
  
  public void setBrushEraserSize(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(3885, arrayOfObject);
  }
  
  public void setBrushSize(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(3886, arrayOfObject);
  }
  
  public void setBrushViewChangeListener(BrushViewChangeListener paramBrushViewChangeListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBrushViewChangeListener;
    m54207b69.F54207b69_00(3887, arrayOfObject);
  }
  
  public void setOpacity(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3888, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.edit.BrushDrawingView
 * JD-Core Version:    0.7.0.1
 */