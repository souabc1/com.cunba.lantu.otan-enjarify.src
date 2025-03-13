package com.xuexiang.xui.widget.textview.autofit;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.TextView;
import java.util.ArrayList;
import m54207b69;

public class AutoFitHelper
{
  public boolean OooO;
  public TextView OooO00o;
  public TextPaint OooO0O0;
  public float OooO0OO;
  public int OooO0Oo;
  public float OooO0o;
  public float OooO0o0;
  public float OooO0oO;
  public boolean OooO0oo;
  public ArrayList OooOO0;
  public TextWatcher OooOO0O;
  public View.OnLayoutChangeListener OooOO0o;
  
  public AutoFitHelper(TextView paramTextView)
  {
    Object localObject = new com/xuexiang/xui/widget/textview/autofit/AutoFitHelper$AutofitTextWatcher;
    ((AutoFitHelper.AutofitTextWatcher)localObject).<init>(this, null);
    this.OooOO0O = ((TextWatcher)localObject);
    localObject = new com/xuexiang/xui/widget/textview/autofit/AutoFitHelper$AutoFitOnLayoutChangeListener;
    ((AutoFitHelper.AutoFitOnLayoutChangeListener)localObject).<init>(this, null);
    this.OooOO0o = ((View.OnLayoutChangeListener)localObject);
    float f1 = paramTextView.getContext().getResources().getDisplayMetrics().scaledDensity;
    this.OooO00o = paramTextView;
    TextPaint localTextPaint = new android/text/TextPaint;
    localTextPaint.<init>();
    this.OooO0O0 = localTextPaint;
    float f2 = paramTextView.getTextSize();
    setRawTextSize(f2);
    int i = OooO0oo(paramTextView);
    this.OooO0Oo = i;
    f1 *= 8.0F;
    this.OooO0o0 = f1;
    float f3 = this.OooO0OO;
    this.OooO0o = f3;
    this.OooO0oO = 0.5F;
  }
  
  public static void OooO0OO(TextView paramTextView, TextPaint paramTextPaint, float paramFloat1, float paramFloat2, int paramInt, float paramFloat3)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = paramTextView;
    arrayOfObject[1] = paramTextPaint;
    Object localObject = Float.valueOf(paramFloat1);
    arrayOfObject[2] = localObject;
    localObject = Float.valueOf(paramFloat2);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(paramInt);
    arrayOfObject[4] = localObject;
    localObject = Float.valueOf(paramFloat3);
    arrayOfObject[5] = localObject;
    m54207b69.F54207b69_00(6180, arrayOfObject);
  }
  
  public static AutoFitHelper OooO0Oo(TextView paramTextView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramTextView;
    return (AutoFitHelper)m54207b69.F54207b69_09(6181, arrayOfObject);
  }
  
  public static float OooO0o(CharSequence paramCharSequence, TextPaint paramTextPaint, float paramFloat1, int paramInt, float paramFloat2, float paramFloat3, float paramFloat4, DisplayMetrics paramDisplayMetrics)
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = paramCharSequence;
    arrayOfObject[1] = paramTextPaint;
    Object localObject = Float.valueOf(paramFloat1);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(paramInt);
    arrayOfObject[3] = localObject;
    localObject = Float.valueOf(paramFloat2);
    arrayOfObject[4] = localObject;
    localObject = Float.valueOf(paramFloat3);
    arrayOfObject[5] = localObject;
    localObject = Float.valueOf(paramFloat4);
    arrayOfObject[6] = localObject;
    arrayOfObject[7] = paramDisplayMetrics;
    return m54207b69.F54207b69_07(6182, arrayOfObject);
  }
  
  public static AutoFitHelper OooO0o0(TextView paramTextView, AttributeSet paramAttributeSet, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramTextView;
    arrayOfObject[1] = paramAttributeSet;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    return (AutoFitHelper)m54207b69.F54207b69_09(6183, arrayOfObject);
  }
  
  public static int OooO0oO(CharSequence paramCharSequence, TextPaint paramTextPaint, float paramFloat1, float paramFloat2, DisplayMetrics paramDisplayMetrics)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = paramCharSequence;
    arrayOfObject[1] = paramTextPaint;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[2] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[3] = localFloat;
    arrayOfObject[4] = paramDisplayMetrics;
    return m54207b69.F54207b69_05(6184, arrayOfObject);
  }
  
  public static int OooO0oo(TextView paramTextView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramTextView;
    return m54207b69.F54207b69_05(6185, arrayOfObject);
  }
  
  private void setRawMaxTextSize(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(6198, arrayOfObject);
  }
  
  private void setRawMinTextSize(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(6199, arrayOfObject);
  }
  
  private void setRawTextSize(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(6200, arrayOfObject);
  }
  
  public final void OooO(float paramFloat1, float paramFloat2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[1] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[2] = localFloat;
    m54207b69.F54207b69_00(6177, arrayOfObject);
  }
  
  public final void OooO0O0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(6179, arrayOfObject);
  }
  
  public AutoFitHelper OooOO0(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (AutoFitHelper)m54207b69.F54207b69_09(6186, arrayOfObject);
  }
  
  public AutoFitHelper OooOO0O(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (AutoFitHelper)m54207b69.F54207b69_09(6187, arrayOfObject);
  }
  
  public AutoFitHelper OooOO0o(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    return (AutoFitHelper)m54207b69.F54207b69_09(6188, arrayOfObject);
  }
  
  public AutoFitHelper OooOOO(int paramInt, float paramFloat)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(paramFloat);
    arrayOfObject[2] = localObject;
    return (AutoFitHelper)m54207b69.F54207b69_09(6189, arrayOfObject);
  }
  
  public AutoFitHelper OooOOO0(int paramInt, float paramFloat)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(paramFloat);
    arrayOfObject[2] = localObject;
    return (AutoFitHelper)m54207b69.F54207b69_09(6190, arrayOfObject);
  }
  
  public AutoFitHelper OooOOOO(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    return (AutoFitHelper)m54207b69.F54207b69_09(6191, arrayOfObject);
  }
  
  public int getMaxLines()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(6192, arrayOfObject);
  }
  
  public float getMaxTextSize()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(6193, arrayOfObject);
  }
  
  public float getMinTextSize()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(6194, arrayOfObject);
  }
  
  public float getPrecision()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(6195, arrayOfObject);
  }
  
  public float getTextSize()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(6196, arrayOfObject);
  }
  
  public boolean isEnabled()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(6197, arrayOfObject);
  }
  
  public void setTextSize(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(6201, arrayOfObject);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(paramFloat);
    arrayOfObject[2] = localObject;
    m54207b69.F54207b69_00(6202, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.textview.autofit.AutoFitHelper
 * JD-Core Version:    0.7.0.1
 */