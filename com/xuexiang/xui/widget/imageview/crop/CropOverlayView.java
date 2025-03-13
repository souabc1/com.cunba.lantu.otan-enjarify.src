package com.xuexiang.xui.widget.imageview.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import m54207b69;

public class CropOverlayView
  extends View
{
  public static final float o00o0;
  public static final float o00o0O0;
  public static final float o00o0O00;
  public static final float o00o0O0O;
  public Paint o00OoOoo;
  public Paint o00Ooo0;
  public Paint o00Ooo00;
  public Paint o00Ooo0O;
  public Rect o00Ooo0o;
  public float o00OooO;
  public float o00OooO0;
  public Pair o00OooOO;
  public Handle o00OooOo;
  public int o00OoooO;
  public int o00Ooooo;
  public float o00o00;
  public int o00o000;
  public float o00o0000;
  public boolean o00o000O;
  public float o00o000o;
  public Bitmap o00o00O0;
  public int o00o00Oo;
  public Bitmap o00o00o;
  public int o00o00o0;
  public int o00o00oO;
  public int o00o00oo;
  public boolean o0O00o0 = false;
  public float oo00oO;
  
  static
  {
    float f1 = PaintUtil.getCornerThickness();
    o00o0 = f1;
    float f2 = PaintUtil.getLineThickness();
    o00o0O00 = f2;
    float f3 = 2.0F;
    float f4 = f1 / f3;
    f2 /= f3;
    f4 -= f2;
    o00o0O0 = f4;
    o00o0O0O = f1 / f3 + f4;
  }
  
  public CropOverlayView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int i = 1;
    this.o00OoooO = i;
    this.o00Ooooo = i;
    float f1 = i;
    float f2 = i;
    f1 /= f2;
    this.o00o0000 = f1;
    this.o00o000O = false;
    this.o00o00O0 = null;
    this.o00o00Oo = 0;
    this.o00o00o0 = 0;
    this.o00o00o = null;
    this.o00o00oO = 0;
    this.o00o00oo = 0;
    OooO0o0(paramContext);
  }
  
  public static boolean OooOO0O()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(3797, arrayOfObject);
  }
  
  public final void OooO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3787, arrayOfObject);
  }
  
  public final void OooO00o(Canvas paramCanvas, Rect paramRect)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    arrayOfObject[2] = paramRect;
    m54207b69.F54207b69_00(3788, arrayOfObject);
  }
  
  public final void OooO0O0(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(3789, arrayOfObject);
  }
  
  public final void OooO0OO(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(3790, arrayOfObject);
  }
  
  public final void OooO0Oo(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(3791, arrayOfObject);
  }
  
  public final void OooO0o(Rect paramRect)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRect;
    m54207b69.F54207b69_00(3792, arrayOfObject);
  }
  
  public final void OooO0o0(Context paramContext)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    m54207b69.F54207b69_00(3793, arrayOfObject);
  }
  
  public final void OooO0oO(float paramFloat1, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    m54207b69.F54207b69_00(3794, arrayOfObject);
  }
  
  public final void OooO0oo(float paramFloat1, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    m54207b69.F54207b69_00(3795, arrayOfObject);
  }
  
  public void OooOO0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3796, arrayOfObject);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(3798, arrayOfObject);
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
    m54207b69.F54207b69_00(3799, arrayOfObject);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = isEnabled();
    if (!bool) {
      return false;
    }
    int i = paramMotionEvent.getAction();
    int j = 1;
    if (i != 0)
    {
      if (i != j)
      {
        int k = 2;
        if (i != k)
        {
          int m = 3;
          f1 = 4.203895E-045F;
          if (i != m) {
            return false;
          }
        }
        else
        {
          f2 = paramMotionEvent.getX();
          f1 = paramMotionEvent.getY();
          OooO0oo(f2, f1);
          getParent().requestDisallowInterceptTouchEvent(j);
          return j;
        }
      }
      getParent().requestDisallowInterceptTouchEvent(false);
      OooO();
      return j;
    }
    float f2 = paramMotionEvent.getX();
    float f1 = paramMotionEvent.getY();
    OooO0oO(f2, f1);
    return j;
  }
  
  public void setAspectRatioX(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3801, arrayOfObject);
  }
  
  public void setAspectRatioY(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3802, arrayOfObject);
  }
  
  public void setBitmapRect(Rect paramRect)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRect;
    m54207b69.F54207b69_00(3803, arrayOfObject);
  }
  
  public void setBitmapSize(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(3804, arrayOfObject);
  }
  
  public void setBorderAndGuidelineColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3805, arrayOfObject);
  }
  
  public void setBorderAndGuidelineStyle(int paramInt, float paramFloat)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(paramFloat);
    arrayOfObject[2] = localObject;
    m54207b69.F54207b69_00(3806, arrayOfObject);
  }
  
  public void setBorderColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3807, arrayOfObject);
  }
  
  public void setBorderStyle(int paramInt, float paramFloat)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(paramFloat);
    arrayOfObject[2] = localObject;
    m54207b69.F54207b69_00(3808, arrayOfObject);
  }
  
  public void setBorderWidth(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(3809, arrayOfObject);
  }
  
  public void setCornerColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3810, arrayOfObject);
  }
  
  public void setCornerStyle(int paramInt, float paramFloat)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(paramFloat);
    arrayOfObject[2] = localObject;
    m54207b69.F54207b69_00(3811, arrayOfObject);
  }
  
  public void setCornerWidth(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(3812, arrayOfObject);
  }
  
  public void setCropOverlayCornerBitmap(Bitmap paramBitmap)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBitmap;
    m54207b69.F54207b69_00(3813, arrayOfObject);
  }
  
  public void setFixedAspectRatio(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(3814, arrayOfObject);
  }
  
  public void setGuidelineColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3815, arrayOfObject);
  }
  
  public void setGuidelineStyle(int paramInt, float paramFloat)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(paramFloat);
    arrayOfObject[2] = localObject;
    m54207b69.F54207b69_00(3816, arrayOfObject);
  }
  
  public void setGuidelineWidth(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(3817, arrayOfObject);
  }
  
  public void setGuidelines(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3818, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.imageview.crop.CropOverlayView
 * JD-Core Version:    0.7.0.1
 */