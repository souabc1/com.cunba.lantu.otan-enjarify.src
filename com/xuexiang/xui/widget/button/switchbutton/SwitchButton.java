package com.xuexiang.xui.widget.button.switchbutton;

import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import m54207b69;

public class SwitchButton
  extends CompoundButton
{
  public static int[] o00oO0O0;
  public static int[] o0oOOo = tmp28_27;
  public Drawable o00OoOoo;
  public ColorStateList o00Ooo0;
  public Drawable o00Ooo00;
  public ColorStateList o00Ooo0O;
  public float o00Ooo0o;
  public RectF o00OooO;
  public float o00OooO0;
  public float o00OooOO;
  public long o00OooOo;
  public int o00OoooO;
  public int o00Ooooo;
  public int o00o;
  public RectF o00o0;
  public int o00o00;
  public int o00o000;
  public int o00o0000;
  public int o00o000O;
  public int o00o000o;
  public int o00o00O0;
  public int o00o00Oo;
  public Drawable o00o00o;
  public Drawable o00o00o0;
  public RectF o00o00oO;
  public RectF o00o00oo;
  public RectF o00o0O0;
  public RectF o00o0O00;
  public Paint o00o0O0O;
  public boolean o00o0OO;
  public boolean o00o0OO0;
  public boolean o00o0OOO;
  public ObjectAnimator o00o0OOo;
  public RectF o00o0Oo;
  public float o00o0Oo0;
  public float o00o0OoO;
  public float o00o0Ooo;
  public Paint o00o0o;
  public float o00o0o00;
  public int o00o0o0O;
  public int o00o0o0o;
  public CharSequence o00o0oO;
  public CharSequence o00o0oO0;
  public TextPaint o00o0oOO;
  public Layout o00o0oOo;
  public float o00o0oo;
  public Layout o00o0oo0;
  public float o00o0ooo;
  public CompoundButton.OnCheckedChangeListener o00oO0;
  public int o00oO000;
  public boolean o00oO00O;
  public boolean o00oO00o;
  public boolean o00oOo;
  public int o00oo000;
  public boolean o0O00o0;
  public int oo00oO;
  
  static
  {
    int i = 16842910;
    int j = 16842919;
    int[] tmp9_7 = new int[3];
    int[] tmp10_9 = tmp9_7;
    int[] tmp10_9 = tmp9_7;
    tmp10_9[0] = 16842912;
    tmp10_9[1] = i;
    tmp10_9[2] = j;
    o00oO0O0 = tmp10_9;
    int[] tmp27_25 = new int[3];
    int[] tmp28_27 = tmp27_25;
    int[] tmp28_27 = tmp27_25;
    tmp28_27[0] = -16842912;
    tmp28_27[1] = i;
    tmp28_27[2] = j;
  }
  
  private float getProgress()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(2924, arrayOfObject);
  }
  
  private boolean getStatusBasedOnPos()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(2925, arrayOfObject);
  }
  
  private void setDrawableState(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(2956, arrayOfObject);
  }
  
  private void setProgress(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(2959, arrayOfObject);
  }
  
  public final void OooO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2909, arrayOfObject);
  }
  
  public void OooO00o(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2910, arrayOfObject);
  }
  
  public final void OooO0O0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2911, arrayOfObject);
  }
  
  public final int OooO0OO(double paramDouble)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Double localDouble = Double.valueOf(paramDouble);
    arrayOfObject[1] = localDouble;
    return m54207b69.F54207b69_05(2912, arrayOfObject);
  }
  
  public final Layout OooO0Oo(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    return (Layout)m54207b69.F54207b69_09(2913, arrayOfObject);
  }
  
  public final int OooO0o(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_05(2914, arrayOfObject);
  }
  
  public final int OooO0o0(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_05(2915, arrayOfObject);
  }
  
  public void OooO0oO(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence1;
    arrayOfObject[2] = paramCharSequence2;
    m54207b69.F54207b69_00(2916, arrayOfObject);
  }
  
  public void OooO0oo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    localFloat = Float.valueOf(paramFloat3);
    arrayOfObject[3] = localFloat;
    localFloat = Float.valueOf(paramFloat4);
    arrayOfObject[4] = localFloat;
    m54207b69.F54207b69_00(2917, arrayOfObject);
  }
  
  public void drawableStateChanged()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2918, arrayOfObject);
  }
  
  public long getAnimationDuration()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_06(2919, arrayOfObject);
  }
  
  public ColorStateList getBackColor()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ColorStateList)m54207b69.F54207b69_09(2920, arrayOfObject);
  }
  
  public Drawable getBackDrawable()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Drawable)m54207b69.F54207b69_09(2921, arrayOfObject);
  }
  
  public float getBackRadius()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(2922, arrayOfObject);
  }
  
  public PointF getBackSizeF()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (PointF)m54207b69.F54207b69_09(2923, arrayOfObject);
  }
  
  public CharSequence getTextOff()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (CharSequence)m54207b69.F54207b69_09(2926, arrayOfObject);
  }
  
  public CharSequence getTextOn()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (CharSequence)m54207b69.F54207b69_09(2927, arrayOfObject);
  }
  
  public ColorStateList getThumbColor()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ColorStateList)m54207b69.F54207b69_09(2928, arrayOfObject);
  }
  
  public Drawable getThumbDrawable()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Drawable)m54207b69.F54207b69_09(2929, arrayOfObject);
  }
  
  public float getThumbHeight()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(2930, arrayOfObject);
  }
  
  public RectF getThumbMargin()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (RectF)m54207b69.F54207b69_09(2931, arrayOfObject);
  }
  
  public float getThumbRadius()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(2932, arrayOfObject);
  }
  
  public float getThumbRangeRatio()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(2933, arrayOfObject);
  }
  
  public float getThumbWidth()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(2934, arrayOfObject);
  }
  
  public int getTintColor()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(2935, arrayOfObject);
  }
  
  public boolean isDrawDebugRect()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(2936, arrayOfObject);
  }
  
  public boolean isFadeBack()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(2937, arrayOfObject);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(2938, arrayOfObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(2939, arrayOfObject);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcelable;
    m54207b69.F54207b69_00(2940, arrayOfObject);
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Parcelable)m54207b69.F54207b69_09(2941, arrayOfObject);
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
    m54207b69.F54207b69_00(2942, arrayOfObject);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = isEnabled();
    if (bool1)
    {
      bool1 = isClickable();
      if (bool1)
      {
        bool1 = isFocusable();
        if (bool1)
        {
          bool1 = this.o00oO00o;
          if (bool1)
          {
            int i = paramMotionEvent.getAction();
            float f1 = paramMotionEvent.getX();
            float f2 = this.o00o0OoO;
            f1 -= f2;
            f2 = paramMotionEvent.getY();
            float f3 = this.o00o0Ooo;
            f2 -= f3;
            int k = 1;
            f3 = 1.4E-45F;
            float f5;
            float f6;
            if (i != 0)
            {
              if (i != k)
              {
                int m = 2;
                float f4 = 2.802597E-045F;
                if (i != m)
                {
                  m = 3;
                  f4 = 4.203895E-045F;
                  if (i != m) {
                    break label531;
                  }
                }
                else
                {
                  f5 = paramMotionEvent.getX();
                  f6 = getProgress();
                  f4 = this.o00o0o00;
                  f4 = f5 - f4;
                  RectF localRectF = this.o00o0;
                  float f7 = localRectF.width();
                  f4 /= f7;
                  f6 += f4;
                  setProgress(f6);
                  bool2 = this.o00oOo;
                  if (!bool2)
                  {
                    f6 = Math.abs(f1);
                    m = this.o00o0o0O;
                    f4 = m;
                    f7 = 2.0F;
                    f4 /= f7;
                    bool2 = f6 < f4;
                    if (!bool2)
                    {
                      f6 = Math.abs(f2);
                      m = this.o00o0o0O;
                      f4 = m / f7;
                      bool2 = f6 < f4;
                      if (!bool2) {}
                    }
                    else
                    {
                      f6 = 0.0F;
                      bool2 = f2 < 0.0F;
                      if (bool2)
                      {
                        f6 = Math.abs(f1);
                        f4 = Math.abs(f2);
                        bool2 = f6 < f4;
                        if (!bool2)
                        {
                          f6 = Math.abs(f2);
                          f1 = Math.abs(f1);
                          bool2 = f6 < f1;
                          if (!bool2) {
                            break label326;
                          }
                          return false;
                        }
                      }
                      OooO0O0();
                    }
                  }
                  label326:
                  this.o00o0o00 = f5;
                  break label531;
                }
              }
              this.o00oOo = false;
              setPressed(false);
              long l1 = paramMotionEvent.getEventTime();
              long l2 = paramMotionEvent.getDownTime();
              l1 -= l2;
              f5 = (float)l1;
              f6 = Math.abs(f1);
              int n = this.o00o0o0O;
              f1 = n;
              boolean bool2 = f6 < f1;
              if (bool2)
              {
                f6 = Math.abs(f2);
                n = this.o00o0o0O;
                f1 = n;
                bool2 = f6 < f1;
                if (bool2)
                {
                  int j = this.o00o0o0o;
                  f6 = j;
                  bool4 = f5 < f6;
                  if (bool4)
                  {
                    performClick();
                    break label531;
                  }
                }
              }
              boolean bool4 = getStatusBasedOnPos();
              boolean bool3 = isChecked();
              if (bool4 != bool3)
              {
                playSoundEffect(0);
                setChecked(bool4);
              }
              else
              {
                OooO00o(bool4);
              }
            }
            else
            {
              f6 = paramMotionEvent.getX();
              this.o00o0OoO = f6;
              f5 = paramMotionEvent.getY();
              this.o00o0Ooo = f5;
              f5 = this.o00o0OoO;
              this.o00o0o00 = f5;
              setPressed(k);
            }
            label531:
            return k;
          }
        }
      }
    }
    return false;
  }
  
  public boolean performClick()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(2944, arrayOfObject);
  }
  
  public void setAnimationDuration(long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    m54207b69.F54207b69_00(2945, arrayOfObject);
  }
  
  public void setBackColor(ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorStateList;
    m54207b69.F54207b69_00(2946, arrayOfObject);
  }
  
  public void setBackColorRes(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2947, arrayOfObject);
  }
  
  public void setBackDrawable(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(2948, arrayOfObject);
  }
  
  public void setBackDrawableRes(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2949, arrayOfObject);
  }
  
  public void setBackRadius(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(2950, arrayOfObject);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2951, arrayOfObject);
  }
  
  public void setCheckedImmediately(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2952, arrayOfObject);
  }
  
  public void setCheckedImmediatelyNoEvent(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2953, arrayOfObject);
  }
  
  public void setCheckedNoEvent(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2954, arrayOfObject);
  }
  
  public void setDrawDebugRect(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2955, arrayOfObject);
  }
  
  public void setFadeBack(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2957, arrayOfObject);
  }
  
  public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener paramOnCheckedChangeListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnCheckedChangeListener;
    m54207b69.F54207b69_00(2958, arrayOfObject);
  }
  
  public void setTextAdjust(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2960, arrayOfObject);
  }
  
  public void setTextExtra(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2961, arrayOfObject);
  }
  
  public void setTextThumbInset(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2962, arrayOfObject);
  }
  
  public void setThumbColor(ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorStateList;
    m54207b69.F54207b69_00(2963, arrayOfObject);
  }
  
  public void setThumbColorRes(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2964, arrayOfObject);
  }
  
  public void setThumbDrawable(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(2965, arrayOfObject);
  }
  
  public void setThumbDrawableRes(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2966, arrayOfObject);
  }
  
  public void setThumbMargin(RectF paramRectF)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRectF;
    m54207b69.F54207b69_00(2967, arrayOfObject);
  }
  
  public void setThumbRadius(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(2968, arrayOfObject);
  }
  
  public void setThumbRangeRatio(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(2969, arrayOfObject);
  }
  
  public void setThumbSize(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(2970, arrayOfObject);
  }
  
  public void setTintColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(2971, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.button.switchbutton.SwitchButton
 * JD-Core Version:    0.7.0.1
 */