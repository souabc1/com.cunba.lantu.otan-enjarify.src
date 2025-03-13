package com.scwang.smartrefresh.header.waveswipe;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;

public class WaveView
  extends View
  implements ViewTreeObserver.OnPreDrawListener
{
  public static final float[][] o00o00o;
  public static final float[][] o00o00o0;
  public static final float[][] o00o00oO;
  public float o00OoOoo;
  public Path o00Ooo0;
  public Paint o00Ooo00;
  public Path o00Ooo0O;
  public Path o00Ooo0o;
  public RectF o00OooO;
  public Path o00OooO0;
  public int o00OooOO;
  public float o00OooOo;
  public boolean o00OoooO;
  public boolean o00Ooooo;
  public ValueAnimator o00o00;
  public ValueAnimator o00o000;
  public int o00o0000;
  public ValueAnimator o00o000O;
  public ValueAnimator o00o000o;
  public ValueAnimator o00o00O0;
  public ValueAnimator.AnimatorUpdateListener o00o00Oo;
  public int o0O00o0;
  public ValueAnimator oo00oO;
  
  static
  {
    int i = 6;
    Object localObject = new float[i][];
    int j = 2;
    float[] arrayOfFloat = new float[j];
    float[] tmp15_14 = arrayOfFloat;
    tmp15_14[0] = 0.1655F;
    tmp15_14[1] = 0.0F;
    localObject[0] = arrayOfFloat;
    arrayOfFloat = new float[j];
    float[] tmp32_31 = arrayOfFloat;
    tmp32_31[0] = 0.4188F;
    tmp32_31[1] = -0.0109F;
    int k = 1;
    localObject[k] = arrayOfFloat;
    arrayOfFloat = new float[j];
    float[] tmp54_53 = arrayOfFloat;
    tmp54_53[0] = 0.4606F;
    tmp54_53[1] = -0.0049F;
    localObject[j] = arrayOfFloat;
    arrayOfFloat = new float[j];
    float[] tmp72_71 = arrayOfFloat;
    tmp72_71[0] = 0.4893F;
    tmp72_71[1] = 0.0F;
    int m = 3;
    localObject[m] = arrayOfFloat;
    arrayOfFloat = new float[j];
    float[] tmp93_92 = arrayOfFloat;
    tmp93_92[0] = 0.4893F;
    tmp93_92[1] = 0.0F;
    int n = 4;
    localObject[n] = arrayOfFloat;
    arrayOfFloat = new float[j];
    float[] tmp114_113 = arrayOfFloat;
    tmp114_113[0] = 0.5F;
    tmp114_113[1] = 0.0F;
    int i1 = 5;
    localObject[i1] = arrayOfFloat;
    o00o00o0 = (float[][])localObject;
    localObject = new float[i][];
    arrayOfFloat = new float[j];
    float[] tmp144_143 = arrayOfFloat;
    tmp144_143[0] = 0.1655F;
    tmp144_143[1] = 0.0F;
    localObject[0] = arrayOfFloat;
    arrayOfFloat = new float[j];
    float[] tmp161_160 = arrayOfFloat;
    tmp161_160[0] = 0.5237F;
    tmp161_160[1] = 0.0553F;
    localObject[k] = arrayOfFloat;
    arrayOfFloat = new float[j];
    float[] tmp180_179 = arrayOfFloat;
    tmp180_179[0] = 0.4557F;
    tmp180_179[1] = 0.0936F;
    localObject[j] = arrayOfFloat;
    arrayOfFloat = new float[j];
    float[] tmp198_197 = arrayOfFloat;
    tmp198_197[0] = 0.3908F;
    tmp198_197[1] = 0.1302F;
    localObject[m] = arrayOfFloat;
    arrayOfFloat = new float[j];
    float[] tmp217_216 = arrayOfFloat;
    tmp217_216[0] = 0.4303F;
    tmp217_216[1] = 0.2173F;
    localObject[n] = arrayOfFloat;
    arrayOfFloat = new float[j];
    float[] tmp236_235 = arrayOfFloat;
    tmp236_235[0] = 0.5F;
    tmp236_235[1] = 0.2173F;
    localObject[i1] = arrayOfFloat;
    o00o00o = (float[][])localObject;
    float[][] arrayOfFloat1 = new float[i][];
    localObject = new float[j];
    Object tmp265_264 = localObject;
    tmp265_264[0] = 0.1655F;
    tmp265_264[1] = 0.0F;
    arrayOfFloat1[0] = localObject;
    localObject = new float[j];
    Object tmp283_282 = localObject;
    tmp283_282[0] = 0.5909F;
    tmp283_282[1] = 0.0F;
    arrayOfFloat1[k] = localObject;
    localObject = new float[j];
    Object tmp302_301 = localObject;
    tmp302_301[0] = 0.4557F;
    tmp302_301[1] = 0.1642F;
    arrayOfFloat1[j] = localObject;
    localObject = new float[j];
    Object tmp321_320 = localObject;
    tmp321_320[0] = 0.3941F;
    tmp321_320[1] = 0.2061F;
    arrayOfFloat1[m] = localObject;
    localObject = new float[j];
    Object tmp341_340 = localObject;
    tmp341_340[0] = 0.4303F;
    tmp341_340[1] = 0.2889F;
    arrayOfFloat1[n] = localObject;
    localObject = new float[j];
    Object tmp361_360 = localObject;
    tmp361_360[0] = 0.5F;
    tmp361_360[1] = 0.2889F;
    arrayOfFloat1[i1] = localObject;
    o00o00oO = arrayOfFloat1;
  }
  
  public void OooO()
  {
    int i = 2;
    Object localObject1 = new float[i];
    Object tmp7_6 = localObject1;
    tmp7_6[0] = 1.0F;
    tmp7_6[1] = 1.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    this.o00o00 = ((ValueAnimator)localObject1);
    ((ValueAnimator)localObject1).setDuration(1L);
    this.o00o00.start();
    localObject1 = new float[i];
    float f1 = this.o00OooOO / 1440.0F * 500.0F;
    localObject1[0] = f1;
    f1 = this.o0O00o0;
    int j = 1;
    localObject1[j] = f1;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    this.oo00oO = ((ValueAnimator)localObject1);
    long l = 500L;
    ((ValueAnimator)localObject1).setDuration(l);
    localObject1 = this.oo00oO;
    Object localObject2 = new com/scwang/smartrefresh/header/waveswipe/WaveView$2;
    ((WaveView.2)localObject2).<init>(this);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    localObject1 = this.oo00oO;
    localObject2 = new android/view/animation/AccelerateDecelerateInterpolator;
    ((AccelerateDecelerateInterpolator)localObject2).<init>();
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
    this.oo00oO.start();
    localObject1 = new float[i];
    localObject1[0] = 0.0F;
    f1 = this.o0O00o0;
    float f2 = this.o00OoOoo;
    f1 -= f2;
    localObject1[j] = f1;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    this.o00o000 = ((ValueAnimator)localObject1);
    ((ValueAnimator)localObject1).setDuration(l);
    localObject1 = this.o00o000;
    localObject2 = this.o00o00Oo;
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    this.o00o000.start();
    localObject1 = new float[i];
    Object tmp221_220 = localObject1;
    tmp221_220[0] = 0.0F;
    tmp221_220[1] = 1.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    this.o00o000O = ((ValueAnimator)localObject1);
    ((ValueAnimator)localObject1).setDuration(l);
    localObject1 = this.o00o000O;
    localObject2 = this.o00o00Oo;
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    localObject1 = this.o00o000O;
    localObject2 = new com/scwang/smartrefresh/header/waveswipe/DropBounceInterpolator;
    ((DropBounceInterpolator)localObject2).<init>();
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
    this.o00o000O.setStartDelay(l);
    this.o00o000O.start();
    Object localObject3 = new float[i];
    Object tmp307_305 = localObject3;
    tmp307_305[0] = 0.0F;
    tmp307_305[1] = 1.0F;
    localObject3 = ValueAnimator.ofFloat((float[])localObject3);
    this.o00o000o = ((ValueAnimator)localObject3);
    ((ValueAnimator)localObject3).setDuration(l);
    localObject3 = this.o00o000o;
    localObject1 = this.o00o00Oo;
    ((ValueAnimator)localObject3).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject1);
    localObject3 = this.o00o000o;
    localObject1 = new com/scwang/smartrefresh/header/waveswipe/DropBounceInterpolator;
    ((DropBounceInterpolator)localObject1).<init>();
    ((ValueAnimator)localObject3).setInterpolator((TimeInterpolator)localObject1);
    this.o00o000o.setStartDelay(625L);
    this.o00o000o.start();
  }
  
  public void OooO00o()
  {
    ValueAnimator localValueAnimator = this.o00o00;
    boolean bool = localValueAnimator.isRunning();
    if (bool) {
      return;
    }
    OooO();
    OooOO0(0.1F);
  }
  
  public void OooO0O0(float paramFloat1, float paramFloat2)
  {
    OooO0o();
    this.o00Ooo0.moveTo(0.0F, 0.0F);
    Path localPath1 = this.o00Ooo0;
    int i = this.o00OooOO;
    float f1 = i;
    float[][] arrayOfFloat1 = o00o00o;
    float[] arrayOfFloat2 = arrayOfFloat1[0];
    float f2 = arrayOfFloat2[0];
    f1 *= f2;
    f2 = i;
    int j = 1;
    float f3 = arrayOfFloat2[j];
    f2 *= f3;
    float f4 = i;
    float[][] arrayOfFloat3 = o00o00o0;
    f3 = arrayOfFloat3[j][0] + paramFloat2;
    float f5 = arrayOfFloat1[j][0];
    f3 = Math.min(f3, f5);
    f5 = f4 * f3;
    f4 = this.o00OooOO;
    f3 = arrayOfFloat3[j][j] + paramFloat1 - paramFloat2;
    float f6 = arrayOfFloat1[j][j];
    f3 = Math.max(f3, f6);
    f6 = f4 * f3;
    f4 = this.o00OooOO;
    int k = 2;
    f3 = arrayOfFloat3[k][0] - paramFloat2;
    float f7 = arrayOfFloat1[k][0];
    f3 = Math.max(f3, f7);
    f7 = f4 * f3;
    f4 = this.o00OooOO;
    f3 = arrayOfFloat3[k][j] + paramFloat1 - paramFloat2;
    float f8 = arrayOfFloat1[k][j];
    f3 = Math.max(f3, f8);
    f8 = f4 * f3;
    f3 = f1;
    localPath1.cubicTo(f1, f2, f5, f6, f7, f8);
    Path localPath2 = this.o00Ooo0;
    f4 = this.o00OooOO;
    int m = 3;
    float f9 = arrayOfFloat3[m][0] - paramFloat2;
    f3 = arrayOfFloat1[m][0];
    f9 = Math.max(f9, f3);
    float f10 = f4 * f9;
    f4 = this.o00OooOO;
    f9 = arrayOfFloat3[m][j] + paramFloat1 + paramFloat2;
    f3 = arrayOfFloat1[m][j];
    f9 = Math.min(f9, f3);
    float f11 = f4 * f9;
    f4 = this.o00OooOO;
    int n = 4;
    f3 = arrayOfFloat3[n][0] - paramFloat2;
    f2 = arrayOfFloat1[n][0];
    f3 = Math.max(f3, f2);
    float f12 = f4 * f3;
    f4 = this.o00OooOO;
    f3 = arrayOfFloat3[n][j] + paramFloat1 + paramFloat2;
    f2 = arrayOfFloat1[n][j];
    f3 = Math.min(f3, f2);
    float f13 = f4 * f3;
    i = this.o00OooOO;
    f3 = i;
    float[] arrayOfFloat4 = arrayOfFloat1[5];
    f5 = arrayOfFloat4[0];
    float f14 = f3 * f5;
    f4 = i;
    f3 = arrayOfFloat3[0][j] + paramFloat1 + paramFloat2;
    f2 = arrayOfFloat4[j];
    f3 = Math.min(f3, f2);
    float f15 = f4 * f3;
    localPath2.cubicTo(f10, f11, f12, f13, f14, f15);
    Path localPath3 = this.o00Ooo0;
    int i1 = this.o00OooOO;
    f2 = i1;
    f3 = i1;
    f5 = arrayOfFloat3[n][0] - paramFloat2;
    f6 = arrayOfFloat1[n][0];
    f5 = Math.max(f5, f6);
    f3 *= f5;
    float f16 = f2 - f3;
    f3 = this.o00OooOO;
    f2 = arrayOfFloat3[n][j] + paramFloat1 + paramFloat2;
    f9 = arrayOfFloat1[n][j];
    f9 = Math.min(f2, f9);
    float f17 = f3 * f9;
    n = this.o00OooOO;
    f3 = n;
    f9 = n;
    f2 = arrayOfFloat3[m][0] - paramFloat2;
    f5 = arrayOfFloat1[m][0];
    f2 = Math.max(f2, f5);
    f9 *= f2;
    float f18 = f3 - f9;
    f9 = this.o00OooOO;
    f3 = arrayOfFloat3[m][j] + paramFloat1 + paramFloat2;
    f2 = arrayOfFloat1[m][j];
    f3 = Math.min(f3, f2);
    float f19 = f9 * f3;
    n = this.o00OooOO;
    f3 = n;
    f9 = n;
    f2 = arrayOfFloat3[k][0] - paramFloat2;
    f5 = arrayOfFloat1[k][0];
    f2 = Math.max(f2, f5);
    f9 *= f2;
    float f20 = f3 - f9;
    f9 = this.o00OooOO;
    f3 = arrayOfFloat3[k][j] + paramFloat1 - paramFloat2;
    f2 = arrayOfFloat1[k][j];
    f3 = Math.max(f3, f2);
    float f21 = f9 * f3;
    localPath3.cubicTo(f16, f17, f18, f19, f20, f21);
    localPath1 = this.o00Ooo0;
    i = this.o00OooOO;
    f3 = i;
    f4 = i;
    f2 = arrayOfFloat3[j][0] + paramFloat2;
    f5 = arrayOfFloat1[j][0];
    f2 = Math.min(f2, f5);
    f4 *= f2;
    f3 -= f4;
    f4 = this.o00OooOO;
    f2 = arrayOfFloat3[j][j] + paramFloat1 - paramFloat2;
    f5 = arrayOfFloat1[j][j];
    f2 = Math.max(f2, f5) * f4;
    i = this.o00OooOO;
    f5 = i;
    f6 = i;
    float[] arrayOfFloat5 = arrayOfFloat1[0];
    f8 = arrayOfFloat5[0];
    f6 *= f8;
    f5 -= f6;
    f6 = i;
    f7 = arrayOfFloat5[j];
    f6 *= f7;
    f7 = i;
    localPath1.cubicTo(f3, f2, f5, f6, f7, 0.0F);
    f4 = this.o00OooOO;
    f9 = arrayOfFloat3[m][j] + paramFloat1 + paramFloat2;
    f1 = arrayOfFloat1[m][j];
    f1 = Math.min(f9, f1);
    f4 *= f1;
    f1 = this.o00OoOoo;
    f4 += f1;
    this.o00OooOo = f4;
    postInvalidateOnAnimation();
  }
  
  public void OooO0OO(float paramFloat)
  {
    OooO0o();
    this.o00Ooo0.moveTo(0.0F, 0.0F);
    Path localPath1 = this.o00Ooo0;
    int i = this.o00OooOO;
    float f1 = i;
    float[][] arrayOfFloat = o00o00o0;
    float[] arrayOfFloat1 = arrayOfFloat[0];
    float f2 = arrayOfFloat1[0];
    f1 *= f2;
    int j = 1;
    f2 = arrayOfFloat1[j];
    float f3 = i;
    float[] arrayOfFloat2 = arrayOfFloat[j];
    float f4 = arrayOfFloat2[0] * f3;
    f3 = i;
    float f5 = arrayOfFloat2[j] + paramFloat;
    float f6 = f3 * f5;
    f3 = i;
    int k = 2;
    arrayOfFloat2 = arrayOfFloat[k];
    float f7 = arrayOfFloat2[0] * f3;
    float f8 = i;
    f3 = arrayOfFloat2[j] + paramFloat;
    f8 *= f3;
    f3 = f1;
    f5 = f4;
    f4 = f6;
    f6 = f7;
    f7 = f8;
    localPath1.cubicTo(f1, f2, f5, f4, f6, f8);
    Path localPath2 = this.o00Ooo0;
    i = this.o00OooOO;
    f1 = i;
    int m = 3;
    arrayOfFloat1 = arrayOfFloat[m];
    f2 = arrayOfFloat1[0];
    float f9 = f1 * f2;
    f1 = i;
    f3 = arrayOfFloat1[j] + paramFloat;
    float f10 = f1 * f3;
    f1 = i;
    int n = 4;
    float[] arrayOfFloat3 = arrayOfFloat[n];
    f5 = arrayOfFloat3[0];
    float f11 = f1 * f5;
    f1 = i;
    f2 = arrayOfFloat3[j] + paramFloat;
    float f12 = f1 * f2;
    f1 = i;
    arrayOfFloat3 = arrayOfFloat[5];
    f5 = arrayOfFloat3[0];
    float f13 = f1 * f5;
    f8 = i;
    f1 = arrayOfFloat3[j] + paramFloat;
    float f14 = f8 * f1;
    localPath2.cubicTo(f9, f10, f11, f12, f13, f14);
    Path localPath3 = this.o00Ooo0;
    int i1 = this.o00OooOO;
    f2 = i1;
    f5 = i1;
    arrayOfFloat1 = arrayOfFloat[n];
    f4 = arrayOfFloat1[0];
    f5 *= f4;
    float f15 = f2 - f5;
    f2 = i1;
    f3 = arrayOfFloat1[j] + paramFloat;
    float f16 = f2 * f3;
    f3 = i1;
    f2 = i1;
    localPath1 = arrayOfFloat[m];
    f5 = localPath1[0];
    f2 *= f5;
    float f17 = f3 - f2;
    f3 = i1;
    float f18 = localPath1[j] + paramFloat;
    float f19 = f3 * f18;
    f18 = i1;
    f3 = i1;
    arrayOfFloat3 = arrayOfFloat[k];
    f5 = arrayOfFloat3[0];
    f3 *= f5;
    float f20 = f18 - f3;
    f1 = i1;
    f18 = arrayOfFloat3[j] + paramFloat;
    float f21 = f1 * f18;
    localPath3.cubicTo(f15, f16, f17, f19, f20, f21);
    Path localPath4 = this.o00Ooo0;
    i = this.o00OooOO;
    f18 = i;
    f3 = i;
    arrayOfFloat3 = arrayOfFloat[j];
    f5 = arrayOfFloat3[0];
    f3 *= f5;
    f18 -= f3;
    f3 = i;
    f2 = arrayOfFloat3[j] + paramFloat;
    f3 *= f2;
    f2 = i;
    f5 = i;
    float[] arrayOfFloat4 = arrayOfFloat[0];
    f6 = arrayOfFloat4[0];
    f5 *= f6;
    f2 -= f5;
    f5 = arrayOfFloat4[j];
    f4 = i;
    localPath4.cubicTo(f18, f3, f2, f5, f4, 0.0F);
    postInvalidateOnAnimation();
  }
  
  public void OooO0Oo(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    OooO0o();
    this.o00Ooo0.moveTo(0.0F, 0.0F);
    Path localPath1 = this.o00Ooo0;
    int i = this.o00OooOO;
    float f1 = i;
    float[][] arrayOfFloat1 = o00o00oO;
    float[] arrayOfFloat2 = arrayOfFloat1[0];
    float f2 = arrayOfFloat2[0];
    f1 *= f2;
    f2 = i;
    int j = 1;
    float f3 = arrayOfFloat2[j];
    f2 *= f3;
    float f4 = i;
    float[][] arrayOfFloat3 = o00o00o0;
    f3 = arrayOfFloat3[j][0] + paramFloat2;
    float[][] arrayOfFloat4 = o00o00o;
    float f5 = arrayOfFloat4[j][0];
    f3 = Math.min(f3, f5) + paramFloat3;
    f5 = arrayOfFloat1[j][0];
    f3 = Math.min(f3, f5);
    f5 = f4 * f3;
    f4 = this.o00OooOO;
    f3 = arrayOfFloat3[j][j] + paramFloat1 - paramFloat2;
    float f6 = arrayOfFloat4[j][j];
    f3 = Math.max(f3, f6) - paramFloat3;
    f6 = arrayOfFloat1[j][j];
    f3 = Math.max(f3, f6);
    f6 = f4 * f3;
    f4 = this.o00OooOO;
    int k = 2;
    f3 = arrayOfFloat3[k][0] - paramFloat2;
    float f7 = arrayOfFloat1[k][0];
    f3 = Math.max(f3, f7);
    f7 = f4 * f3;
    f4 = this.o00OooOO;
    f3 = arrayOfFloat3[k][j] + paramFloat1 - paramFloat2;
    float f8 = arrayOfFloat4[k][j];
    f3 = Math.max(f3, f8) + paramFloat3;
    f8 = arrayOfFloat1[k][j];
    f3 = Math.min(f3, f8);
    f8 = f4 * f3;
    f3 = f1;
    localPath1.cubicTo(f1, f2, f5, f6, f7, f8);
    Path localPath2 = this.o00Ooo0;
    f1 = this.o00OooOO;
    int m = 3;
    f3 = arrayOfFloat3[m][0] - paramFloat2;
    f2 = arrayOfFloat4[m][0];
    f3 = Math.max(f3, f2) + paramFloat3;
    f2 = arrayOfFloat1[m][0];
    f3 = Math.min(f3, f2);
    float f9 = f1 * f3;
    f1 = this.o00OooOO;
    f3 = arrayOfFloat3[m][j] + paramFloat1 + paramFloat2;
    f2 = arrayOfFloat4[m][j];
    f3 = Math.min(f3, f2) + paramFloat3;
    f2 = arrayOfFloat1[m][j];
    f3 = Math.min(f3, f2);
    float f10 = f1 * f3;
    f1 = this.o00OooOO;
    int n = 4;
    f2 = arrayOfFloat3[n][0] - paramFloat2;
    f5 = arrayOfFloat1[n][0];
    f2 = Math.max(f2, f5);
    float f11 = f1 * f2;
    f1 = this.o00OooOO;
    f2 = arrayOfFloat3[n][j] + paramFloat1 + paramFloat2;
    f5 = arrayOfFloat4[n][j];
    f2 = Math.min(f2, f5) + paramFloat3;
    f5 = arrayOfFloat1[n][j];
    f2 = Math.min(f2, f5);
    float f12 = f1 * f2;
    int i1 = this.o00OooOO;
    f2 = i1;
    int i2 = 5;
    f6 = arrayOfFloat1[i2][0];
    float f13 = f2 * f6;
    f1 = i1;
    f2 = arrayOfFloat3[0][j] + paramFloat1 + paramFloat2;
    f6 = arrayOfFloat4[i2][j];
    f2 = Math.min(f2, f6) + paramFloat3;
    f5 = arrayOfFloat1[i2][j];
    f2 = Math.min(f2, f5);
    float f14 = f1 * f2;
    localPath2.cubicTo(f9, f10, f11, f12, f13, f14);
    localPath2 = this.o00Ooo0;
    i1 = this.o00OooOO;
    f2 = i1;
    f1 = i1;
    f5 = arrayOfFloat3[n][0] - paramFloat2;
    f6 = arrayOfFloat1[n][0];
    f5 = Math.max(f5, f6);
    f1 *= f5;
    float f15 = f2 - f1;
    f1 = this.o00OooOO;
    f2 = arrayOfFloat3[n][j] + paramFloat1 + paramFloat2;
    f5 = arrayOfFloat4[n][j];
    f2 = Math.min(f2, f5) + paramFloat3;
    f3 = arrayOfFloat1[n][j];
    f3 = Math.min(f2, f3);
    float f16 = f1 * f3;
    i1 = this.o00OooOO;
    f3 = i1;
    f1 = i1;
    f2 = arrayOfFloat3[m][0] - paramFloat2;
    f5 = arrayOfFloat4[m][0];
    f2 = Math.max(f2, f5) + paramFloat3;
    f5 = arrayOfFloat1[m][0];
    f2 = Math.min(f2, f5);
    f1 *= f2;
    float f17 = f3 - f1;
    f1 = this.o00OooOO;
    f3 = arrayOfFloat3[m][j] + paramFloat1 + paramFloat2;
    f2 = arrayOfFloat4[m][j];
    f3 = Math.min(f3, f2) + paramFloat3;
    f2 = arrayOfFloat1[m][j];
    f3 = Math.min(f3, f2);
    float f18 = f1 * f3;
    i1 = this.o00OooOO;
    f3 = i1;
    f1 = i1;
    f2 = arrayOfFloat3[k][0] - paramFloat2;
    f5 = arrayOfFloat1[k][0];
    f2 = Math.max(f2, f5);
    f1 *= f2;
    float f19 = f3 - f1;
    f1 = this.o00OooOO;
    f3 = arrayOfFloat3[k][j] + paramFloat1 - paramFloat2;
    f2 = arrayOfFloat4[k][j];
    f3 = Math.max(f3, f2) + paramFloat3;
    f2 = arrayOfFloat1[k][j];
    f3 = Math.min(f3, f2);
    float f20 = f1 * f3;
    localPath2.cubicTo(f15, f16, f17, f18, f19, f20);
    Path localPath3 = this.o00Ooo0;
    i = this.o00OooOO;
    f1 = i;
    f4 = i;
    f3 = arrayOfFloat3[j][0] + paramFloat2;
    f2 = arrayOfFloat4[j][0];
    f3 = Math.min(f3, f2) + paramFloat3;
    f2 = arrayOfFloat1[j][0];
    f3 = Math.min(f3, f2);
    f4 *= f3;
    float f21 = f1 - f4;
    f4 = this.o00OooOO;
    f1 = arrayOfFloat3[j][j] + paramFloat1 - paramFloat2;
    f3 = arrayOfFloat4[j][j];
    f1 = Math.max(f1, f3) - paramFloat3;
    f3 = arrayOfFloat1[j][j];
    f1 = Math.max(f1, f3);
    f9 = f4 * f1;
    i = this.o00OooOO;
    f1 = i;
    f3 = i;
    float[] arrayOfFloat5 = arrayOfFloat1[0];
    f5 = arrayOfFloat5[0];
    f3 *= f5;
    f10 = f1 - f3;
    f1 = i;
    f3 = arrayOfFloat5[j];
    f11 = f1 * f3;
    f4 = i;
    f12 = f4;
    localPath3.cubicTo(f21, f9, f10, f11, f4, 0.0F);
    f4 = this.o00OooOO;
    f1 = arrayOfFloat3[m][j] + paramFloat1 + paramFloat2;
    f3 = arrayOfFloat4[m][j];
    f1 = Math.min(f1, f3) + paramFloat3;
    float f22 = arrayOfFloat1[m][j];
    f1 = Math.min(f1, f22);
    f4 *= f1;
    f1 = this.o00OoOoo;
    f4 += f1;
    this.o00OooOo = f4;
    postInvalidateOnAnimation();
  }
  
  public void OooO0o()
  {
    ValueAnimator localValueAnimator = this.o00o00O0;
    if (localValueAnimator != null)
    {
      boolean bool = localValueAnimator.isRunning();
      if (bool)
      {
        localValueAnimator = this.o00o00O0;
        localValueAnimator.cancel();
      }
    }
  }
  
  public void OooO0o0()
  {
    boolean bool = this.o00OoooO;
    if (bool) {
      return;
    }
    bool = true;
    this.o00OoooO = bool;
    int i = 2;
    Object localObject = new float[i];
    int j = this.o0O00o0;
    float f1 = j;
    localObject[0] = f1;
    float f2 = j;
    localObject[bool] = f2;
    localObject = ValueAnimator.ofFloat((float[])localObject);
    this.oo00oO = ((ValueAnimator)localObject);
    ((ValueAnimator)localObject).start();
    float[] arrayOfFloat = new float[i];
    int k = this.o0O00o0;
    f2 = k;
    f1 = this.o00OoOoo;
    f2 -= f1;
    arrayOfFloat[0] = f2;
    float f3 = k - f1;
    arrayOfFloat[bool] = f3;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(arrayOfFloat);
    this.o00o000 = localValueAnimator;
    localValueAnimator.start();
    float f4 = this.o0O00o0;
    this.o00OooOo = f4;
    postInvalidate();
  }
  
  public void OooO0oO()
  {
    int i = 2;
    Object localObject1 = new float[i];
    Object tmp7_6 = localObject1;
    tmp7_6[0] = 0.0F;
    tmp7_6[1] = 0.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    this.o00o000 = ((ValueAnimator)localObject1);
    localObject1 = new float[i];
    Object tmp29_28 = localObject1;
    tmp29_28[0] = 0.0F;
    tmp29_28[1] = 0.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    this.o00o000O = ((ValueAnimator)localObject1);
    localObject1 = new float[i];
    Object tmp51_50 = localObject1;
    tmp51_50[0] = 0.0F;
    tmp51_50[1] = 0.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    this.o00o000o = ((ValueAnimator)localObject1);
    localObject1 = new float[i];
    Object tmp73_72 = localObject1;
    tmp73_72[0] = -1000.0F;
    tmp73_72[1] = -1000.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    this.oo00oO = ((ValueAnimator)localObject1);
    ((ValueAnimator)localObject1).start();
    Object localObject2 = new float[i];
    Object tmp101_100 = localObject2;
    tmp101_100[0] = 1.0F;
    tmp101_100[1] = 1.0F;
    localObject2 = ValueAnimator.ofFloat((float[])localObject2);
    this.o00o00 = ((ValueAnimator)localObject2);
    ((ValueAnimator)localObject2).setDuration(1L);
    this.o00o00.start();
  }
  
  public void OooO0oo()
  {
    Object localObject1 = new float[2];
    Object tmp5_4 = localObject1;
    tmp5_4[0] = 1.0F;
    tmp5_4[1] = 0.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    this.o00o00 = ((ValueAnimator)localObject1);
    Object localObject2 = this.o00o00Oo;
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    this.o00o00.setDuration(200L);
    localObject1 = this.o00o00;
    localObject2 = new com/scwang/smartrefresh/header/waveswipe/WaveView$3;
    ((WaveView.3)localObject2).<init>(this);
    ((Animator)localObject1).addListener((Animator.AnimatorListener)localObject2);
    this.o00o00.start();
  }
  
  public void OooOO0(float paramFloat)
  {
    paramFloat = Math.min(paramFloat, 0.2F);
    float f = this.o00OooOO;
    paramFloat *= f;
    Object localObject = new float[2];
    localObject[0] = paramFloat;
    localObject[1] = 0.0F;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat((float[])localObject);
    this.o00o00O0 = localValueAnimator;
    localValueAnimator.setDuration(1000L);
    localValueAnimator = this.o00o00O0;
    localObject = new com/scwang/smartrefresh/header/waveswipe/WaveView$4;
    ((WaveView.4)localObject).<init>(this);
    localValueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject);
    localValueAnimator = this.o00o00O0;
    localObject = new android/view/animation/BounceInterpolator;
    ((BounceInterpolator)localObject).<init>();
    localValueAnimator.setInterpolator((TimeInterpolator)localObject);
    this.o00o00O0.start();
  }
  
  public void OooOO0O(int paramInt)
  {
    float f1 = this.o00OooOO / 1440.0F;
    float f2 = 500.0F;
    f1 *= f2;
    float f3 = paramInt;
    boolean bool = f1 < f3;
    if (bool) {
      return;
    }
    int i = getHeight();
    f1 = i;
    f2 = this.o00OoOoo;
    f1 -= f2;
    f3 = Math.min(f3, f1);
    paramInt = (int)f3;
    this.o0O00o0 = paramInt;
    paramInt = this.o00OoooO;
    if (paramInt != 0)
    {
      paramInt = 0;
      f3 = 0.0F;
      this.o00OoooO = false;
      OooO0o0();
    }
  }
  
  public float getCurrentCircleCenterY()
  {
    return this.o00OooOo;
  }
  
  public void onDetachedFromWindow()
  {
    ValueAnimator localValueAnimator = this.o00o00;
    if (localValueAnimator != null)
    {
      localValueAnimator.end();
      localValueAnimator = this.o00o00;
      localValueAnimator.removeAllUpdateListeners();
    }
    localValueAnimator = this.oo00oO;
    if (localValueAnimator != null)
    {
      localValueAnimator.end();
      localValueAnimator = this.oo00oO;
      localValueAnimator.removeAllUpdateListeners();
    }
    localValueAnimator = this.o00o000;
    if (localValueAnimator != null)
    {
      localValueAnimator.end();
      localValueAnimator = this.o00o000;
      localValueAnimator.removeAllUpdateListeners();
    }
    localValueAnimator = this.o00o00O0;
    if (localValueAnimator != null)
    {
      localValueAnimator.end();
      localValueAnimator = this.o00o00O0;
      localValueAnimator.removeAllUpdateListeners();
    }
    localValueAnimator = this.o00o000o;
    if (localValueAnimator != null)
    {
      localValueAnimator.end();
      localValueAnimator = this.o00o000o;
      localValueAnimator.removeAllUpdateListeners();
    }
    localValueAnimator = this.o00o000O;
    if (localValueAnimator != null)
    {
      localValueAnimator.end();
      localValueAnimator = this.o00o000O;
      localValueAnimator.removeAllUpdateListeners();
    }
    super.onDetachedFromWindow();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Path localPath = this.o00Ooo0;
    Object localObject1 = this.o00Ooo00;
    paramCanvas.drawPath(localPath, (Paint)localObject1);
    boolean bool = isInEditMode();
    if (!bool)
    {
      this.o00Ooo0.rewind();
      this.o00Ooo0O.rewind();
      localPath = this.o00Ooo0o;
      localPath.rewind();
    }
    float f1 = ((Float)this.oo00oO.getAnimatedValue()).floatValue();
    float f2 = this.o00OooOO;
    float f3 = 2.0F;
    f2 /= f3;
    float f4 = ((Float)this.o00o00.getAnimatedValue()).floatValue();
    float f5 = ((Float)this.o00o000O.getAnimatedValue()).floatValue();
    float f6 = ((Float)this.o00o000o.getAnimatedValue()).floatValue();
    RectF localRectF = this.o00OooO;
    float f7 = this.o00OoOoo;
    float f8 = 1.0F;
    float f9 = f5 + f8;
    float f10 = f7 * f9 * f4;
    f10 = f2 - f10;
    float f11 = f7 * f6 / f3;
    f10 += f11;
    f8 += f6;
    f11 = f7 * f8 * f4 + f1;
    float f12 = f7 * f5 / f3;
    f11 -= f12;
    f9 = f9 * f7 * f4 + f2;
    f6 = f6 * f7 / f3;
    f9 -= f6;
    f8 = f8 * f7 * f4;
    f4 = f1 - f8;
    f7 = f7 * f5 / f3;
    f4 += f7;
    localRectF.set(f10, f11, f9, f4);
    f3 = ((Float)this.o00o000.getAnimatedValue()).floatValue();
    this.o00Ooo0O.moveTo(f2, f3);
    double d1 = this.o00OoOoo;
    double d2 = 2.0D;
    d1 = Math.pow(d1, d2);
    double d3 = f1 * f3;
    d1 += d3;
    d3 = f1;
    double d4 = Math.pow(d3, d2);
    d1 -= d4;
    d4 = f3 - f1;
    d1 /= d4;
    d4 = this.o00OooOO * -2.0D / d2;
    d3 = Math.pow(d1 - d3, d2);
    double d5 = Math.pow(f2, d2);
    d3 += d5;
    d5 = Math.pow(this.o00OoOoo, d2);
    d3 -= d5;
    d5 = -d4;
    d4 *= d4;
    d3 *= 4.0D;
    d4 -= d3;
    d3 = (Math.sqrt(d4) + d5) / d2;
    d4 = Math.sqrt(d4);
    d5 = (d5 - d4) / d2;
    Object localObject2 = this.o00Ooo0O;
    f6 = (float)d3;
    f4 = (float)d1;
    ((Path)localObject2).lineTo(f6, f4);
    localObject2 = this.o00Ooo0O;
    f1 = (float)d5;
    ((Path)localObject2).lineTo(f1, f4);
    this.o00Ooo0O.close();
    localPath = this.o00OooO0;
    localObject1 = this.o00Ooo0O;
    localPath.set((Path)localObject1);
    localPath = this.o00OooO0;
    localObject1 = this.o00OooO;
    localObject2 = Path.Direction.CCW;
    localPath.addOval((RectF)localObject1, (Path.Direction)localObject2);
    localPath = this.o00Ooo0o;
    localObject1 = this.o00OooO;
    localObject2 = Path.Direction.CCW;
    localPath.addOval((RectF)localObject1, (Path.Direction)localObject2);
    localPath = this.o00Ooo0O;
    localObject1 = this.o00Ooo00;
    paramCanvas.drawPath(localPath, (Paint)localObject1);
    localPath = this.o00Ooo0o;
    localObject1 = this.o00Ooo00;
    paramCanvas.drawPath(localPath, (Paint)localObject1);
  }
  
  public boolean onPreDraw()
  {
    ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
    localViewTreeObserver.removeOnPreDrawListener(this);
    boolean bool = this.o00Ooooo;
    if (bool)
    {
      int i = this.o00o0000;
      OooOO0O(i);
    }
    return false;
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.o00OooOO = paramInt1;
    float f1 = paramInt1 / 14.4F;
    this.o00OoOoo = f1;
    f1 = Math.min(paramInt1, paramInt2);
    float f2 = getHeight();
    float f3 = this.o00OoOoo;
    f2 -= f3;
    int i = (int)Math.min(f1, f2);
    OooOO0O(i);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setShadow(int paramInt1, int paramInt2)
  {
    Paint localPaint = this.o00Ooo00;
    float f = paramInt1;
    localPaint.setShadowLayer(f, 0.0F, 0.0F, paramInt2);
  }
  
  public void setWaveColor(int paramInt)
  {
    this.o00Ooo00.setColor(paramInt);
    invalidate();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.waveswipe.WaveView
 * JD-Core Version:    0.7.0.1
 */