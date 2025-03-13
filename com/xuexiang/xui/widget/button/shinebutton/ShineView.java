package com.xuexiang.xui.widget.button.shinebutton;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.View;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;
import com.xuexiang.xui.widget.button.shinebutton.interpolator.EasingInterpolator;
import java.lang.ref.WeakReference;
import java.util.Random;
import m54207b69;

public class ShineView
  extends View
{
  public static int[] o00o0OO = new int[10];
  public ShineAnimator o00OoOoo;
  public WeakReference o00Ooo0;
  public ValueAnimator o00Ooo00;
  public Paint o00Ooo0O;
  public Paint o00Ooo0o;
  public int o00OooO = 10;
  public Paint o00OooO0;
  public int o00OooOO;
  public float o00OooOo;
  public long o00OoooO;
  public long o00Ooooo;
  public int o00o0;
  public boolean o00o00;
  public int o00o000;
  public float o00o0000;
  public int o00o000O;
  public int o00o000o;
  public RectF o00o00O0;
  public RectF o00o00Oo;
  public int o00o00o;
  public Random o00o00o0;
  public int o00o00oO;
  public int o00o00oo;
  public float o00o0O0;
  public float o00o0O00;
  public boolean o00o0O0O;
  public float o00o0OO0;
  public float o0O00o0;
  public boolean oo00oO;
  
  public ShineView(Context paramContext, ShineButton paramShineButton, ShineView.ShineParams paramShineParams)
  {
    super(paramContext);
    paramContext = o00o0OO;
    int i = paramContext[0];
    this.o00o000 = i;
    int j = paramContext[1];
    this.o00o000O = j;
    this.o00o000o = 0;
    this.oo00oO = false;
    this.o00o00 = false;
    paramContext = new android/graphics/RectF;
    paramContext.<init>();
    this.o00o00O0 = paramContext;
    paramContext = new android/graphics/RectF;
    paramContext.<init>();
    this.o00o00Oo = paramContext;
    paramContext = new java/util/Random;
    paramContext.<init>();
    this.o00o00o0 = paramContext;
    this.o00o0O0 = 0.0F;
    this.o00o0O0O = false;
    this.o00o0OO0 = 0.2F;
    OooOOo(paramShineParams, paramShineButton);
    paramContext = new java/lang/ref/WeakReference;
    paramContext.<init>(paramShineButton);
    this.o00Ooo0 = paramContext;
    paramContext = new com/xuexiang/xui/widget/button/shinebutton/ShineAnimator;
    long l1 = this.o00OoooO;
    float f1 = this.o00o0000;
    long l2 = this.o00Ooooo;
    Object localObject1 = paramContext;
    paramContext.<init>(l1, f1, l2);
    this.o00OoOoo = paramContext;
    long l3 = 25;
    ValueAnimator.setFrameDelay(l3);
    paramShineParams = new android/graphics/Paint;
    paramShineParams.<init>();
    this.o00Ooo0O = paramShineParams;
    int k = this.o00o000O;
    paramShineParams.setColor(k);
    paramShineParams = this.o00Ooo0O;
    float f2 = 20.0F;
    paramShineParams.setStrokeWidth(f2);
    paramShineParams = this.o00Ooo0O;
    Object localObject2 = Paint.Style.STROKE;
    paramShineParams.setStyle((Paint.Style)localObject2);
    paramShineParams = this.o00Ooo0O;
    localObject2 = Paint.Cap.ROUND;
    paramShineParams.setStrokeCap((Paint.Cap)localObject2);
    paramShineParams = new android/graphics/Paint;
    paramShineParams.<init>();
    this.o00Ooo0o = paramShineParams;
    paramShineParams.setColor(-1);
    this.o00Ooo0o.setStrokeWidth(f2);
    paramShineParams = this.o00Ooo0o;
    localObject1 = Paint.Cap.ROUND;
    paramShineParams.setStrokeCap((Paint.Cap)localObject1);
    paramShineParams = new android/graphics/Paint;
    paramShineParams.<init>();
    this.o00OooO0 = paramShineParams;
    k = this.o00o000;
    paramShineParams.setColor(k);
    this.o00OooO0.setStrokeWidth(10.0F);
    paramShineParams = this.o00OooO0;
    localObject1 = Paint.Style.STROKE;
    paramShineParams.setStyle((Paint.Style)localObject1);
    paramShineParams = this.o00OooO0;
    localObject1 = Paint.Cap.ROUND;
    paramShineParams.setStrokeCap((Paint.Cap)localObject1);
    paramShineParams = new float[2];
    ShineView.ShineParams tmp363_362 = paramShineParams;
    tmp363_362[0] = 0.0F;
    tmp363_362[1] = 1.1F;
    paramShineParams = ValueAnimator.ofFloat(paramShineParams);
    this.o00Ooo00 = paramShineParams;
    ValueAnimator.setFrameDelay(l3);
    paramContext = this.o00Ooo00;
    long l4 = this.o00Ooooo;
    paramContext.setDuration(l4);
    paramContext = this.o00Ooo00;
    paramShineButton = new com/xuexiang/xui/widget/button/shinebutton/interpolator/EasingInterpolator;
    paramShineParams = Ease.o00OooOo;
    paramShineButton.<init>(paramShineParams);
    paramContext.setInterpolator(paramShineButton);
    paramContext = this.o00Ooo00;
    paramShineButton = new com/xuexiang/xui/widget/button/shinebutton/ShineView$1;
    paramShineButton.<init>(this);
    paramContext.addUpdateListener(paramShineButton);
    paramContext = this.o00Ooo00;
    paramShineButton = new com/xuexiang/xui/widget/button/shinebutton/ShineView$2;
    paramShineButton.<init>(this);
    paramContext.addListener(paramShineButton);
    paramContext = this.o00OoOoo;
    paramShineButton = new com/xuexiang/xui/widget/button/shinebutton/ShineView$3;
    paramShineButton.<init>(this);
    paramContext.addListener(paramShineButton);
  }
  
  public final void OooOOo(ShineView.ShineParams paramShineParams, ShineButton paramShineButton)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramShineParams;
    arrayOfObject[2] = paramShineButton;
    m54207b69.F54207b69_00(2884, arrayOfObject);
  }
  
  public final Paint OooOOo0(Paint paramPaint)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramPaint;
    return (Paint)m54207b69.F54207b69_09(2885, arrayOfObject);
  }
  
  public void OooOOoo(ShineButton paramShineButton)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramShineButton;
    m54207b69.F54207b69_00(2886, arrayOfObject);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(2887, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.button.shinebutton.ShineView
 * JD-Core Version:    0.7.0.1
 */