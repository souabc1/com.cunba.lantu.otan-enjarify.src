package com.scwang.smartrefresh.header.waterdrop;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.scwang.smartrefresh.layout.util.DensityUtil;

public class WaterDropView
  extends View
{
  public static int o00OooO = 2;
  public Circle o00OoOoo;
  public Path o00Ooo0;
  public Circle o00Ooo00;
  public Paint o00Ooo0O;
  public int o00Ooo0o;
  public int o00OooO0;
  
  private double getAngle()
  {
    Circle localCircle1 = this.o00Ooo00;
    float f1 = localCircle1.OooO0OO;
    Circle localCircle2 = this.o00OoOoo;
    float f2 = localCircle2.OooO0OO;
    boolean bool = f1 < f2;
    if (bool) {
      return 0.0D;
    }
    f2 -= f1;
    float f3 = localCircle1.OooO0O0;
    f1 = localCircle2.OooO0O0;
    f3 -= f1;
    return Math.asin(f2 / f3);
  }
  
  public ValueAnimator OooO00o()
  {
    Object localObject1 = new float[2];
    Object tmp5_4 = localObject1;
    tmp5_4[0] = 1.0F;
    tmp5_4[1] = 0.001F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1).setDuration(180L);
    Object localObject2 = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject2).<init>();
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
    localObject2 = new com/scwang/smartrefresh/header/waterdrop/WaterDropView$1;
    ((WaterDropView.1)localObject2).<init>(this);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    return localObject1;
  }
  
  public final void OooO0O0()
  {
    this.o00Ooo0.reset();
    Object localObject1 = this.o00Ooo0;
    Object localObject2 = this.o00OoOoo;
    float f1 = ((Circle)localObject2).OooO00o;
    float f2 = ((Circle)localObject2).OooO0O0;
    float f3 = ((Circle)localObject2).OooO0OO;
    Object localObject3 = Path.Direction.CCW;
    ((Path)localObject1).addCircle(f1, f2, f3, (Path.Direction)localObject3);
    localObject1 = this.o00Ooo00;
    float f4 = ((Circle)localObject1).OooO0O0;
    localObject2 = this.o00OoOoo;
    f3 = ((Circle)localObject2).OooO0O0;
    int i = DensityUtil.OooO0O0(1.0F);
    f1 = i;
    f3 += f1;
    boolean bool = f4 < f3;
    if (bool)
    {
      localObject1 = this.o00Ooo0;
      localObject2 = this.o00Ooo00;
      f1 = ((Circle)localObject2).OooO00o;
      f2 = ((Circle)localObject2).OooO0O0;
      f3 = ((Circle)localObject2).OooO0OO;
      localObject3 = Path.Direction.CCW;
      ((Path)localObject1).addCircle(f1, f2, f3, (Path.Direction)localObject3);
      double d1 = getAngle();
      Circle localCircle1 = this.o00OoOoo;
      double d2 = localCircle1.OooO00o;
      double d3 = localCircle1.OooO0OO;
      double d4 = Math.cos(d1);
      d3 *= d4;
      d2 -= d3;
      f1 = (float)d2;
      Circle localCircle2 = this.o00OoOoo;
      double d5 = localCircle2.OooO0O0;
      double d6 = localCircle2.OooO0OO;
      double d7 = Math.sin(d1);
      d6 *= d7;
      d5 += d6;
      f2 = (float)d5;
      localObject3 = this.o00OoOoo;
      d3 = ((Circle)localObject3).OooO00o;
      d4 = ((Circle)localObject3).OooO0OO;
      double d8 = Math.cos(d1);
      d4 *= d8;
      d3 += d4;
      float f5 = (float)d3;
      Circle localCircle3 = this.o00Ooo00;
      d6 = localCircle3.OooO00o;
      d7 = localCircle3.OooO0OO;
      double d9 = Math.cos(d1);
      d7 *= d9;
      d6 -= d7;
      float f6 = (float)d6;
      Circle localCircle4 = this.o00Ooo00;
      d4 = localCircle4.OooO0O0;
      d8 = localCircle4.OooO0OO;
      double d10 = Math.sin(d1);
      d8 *= d10;
      d4 += d8;
      float f7 = (float)d4;
      Circle localCircle5 = this.o00Ooo00;
      d7 = localCircle5.OooO00o;
      d9 = localCircle5.OooO0OO;
      d1 = Math.cos(d1);
      d9 *= d1;
      d7 += d9;
      f4 = (float)d7;
      localObject2 = this.o00Ooo0;
      localCircle5 = this.o00OoOoo;
      float f8 = localCircle5.OooO00o;
      float f9 = localCircle5.OooO0O0;
      ((Path)localObject2).moveTo(f8, f9);
      this.o00Ooo0.lineTo(f1, f2);
      localObject2 = this.o00Ooo0;
      localCircle1 = this.o00Ooo00;
      f9 = localCircle1.OooO00o;
      f8 = localCircle1.OooO0OO;
      f9 -= f8;
      f1 = localCircle1.OooO0O0;
      Circle localCircle6 = this.o00OoOoo;
      f8 = localCircle6.OooO0O0;
      f1 += f8;
      f8 = 2.0F;
      f1 /= f8;
      ((Path)localObject2).quadTo(f9, f1, f6, f7);
      this.o00Ooo0.lineTo(f4, f7);
      localObject1 = this.o00Ooo0;
      localObject2 = this.o00Ooo00;
      f1 = ((Circle)localObject2).OooO00o;
      f6 = ((Circle)localObject2).OooO0OO;
      f1 += f6;
      f3 = (((Circle)localObject2).OooO0O0 + f2) / f8;
      ((Path)localObject1).quadTo(f1, f3, f5, f2);
    }
    this.o00Ooo0.close();
  }
  
  public void OooO0OO(float paramFloat)
  {
    int i = this.o00Ooo0o;
    double d1 = i;
    double d2 = paramFloat * 0.25D;
    double d3 = i;
    d2 *= d3;
    float f1 = (float)(d1 - d2);
    float f2 = (this.o00OooO0 - i) * paramFloat;
    float f3 = i;
    f2 += f3;
    paramFloat *= 4.0F;
    float f4 = i;
    paramFloat *= f4;
    Circle localCircle1 = this.o00OoOoo;
    localCircle1.OooO0OO = f1;
    Circle localCircle2 = this.o00Ooo00;
    localCircle2.OooO0OO = f2;
    f4 = localCircle1.OooO0O0 + paramFloat;
    localCircle2.OooO0O0 = f4;
  }
  
  public void OooO0Oo(int paramInt)
  {
    int i = getPaddingTop();
    int j = getPaddingBottom();
    int k = this.o00Ooo0o;
    int m = k * 2 + i + j;
    float f1 = m;
    float f2 = paramInt;
    boolean bool = f2 < f1;
    float f5;
    if (bool)
    {
      Circle localCircle1 = this.o00OoOoo;
      float f3 = k;
      localCircle1.OooO0OO = f3;
      Circle localCircle2 = this.o00Ooo00;
      float f4 = k;
      localCircle2.OooO0OO = f4;
      f5 = localCircle1.OooO0O0;
      localCircle2.OooO0O0 = f5;
    }
    else
    {
      int n = this.o00OooO0;
      k -= n;
      float f6 = k;
      n = 0;
      f2 -= f1;
      f1 = Math.max(0.0F, f2);
      double d1 = f6;
      f6 = -f1;
      m = DensityUtil.OooO0O0(200.0F);
      f1 = m;
      double d2 = f6 / f1;
      d2 = Math.pow(100.0D, d2);
      double d3 = 1.0D - d2;
      d1 *= d3;
      f6 = (float)d1;
      Circle localCircle3 = this.o00OoOoo;
      int i1 = this.o00Ooo0o;
      float f7 = i1;
      float f8 = f6 / 4.0F;
      f7 -= f8;
      localCircle3.OooO0OO = f7;
      localCircle3 = this.o00Ooo00;
      f2 = i1 - f6;
      localCircle3.OooO0OO = f2;
      paramInt = paramInt - i - j;
      f5 = paramInt - f2;
      localCircle3.OooO0O0 = f5;
    }
  }
  
  public void OooO0o0(int paramInt1, int paramInt2) {}
  
  public Circle getBottomCircle()
  {
    return this.o00Ooo00;
  }
  
  public int getIndicatorColor()
  {
    return this.o00Ooo0O.getColor();
  }
  
  public int getMaxCircleRadius()
  {
    return this.o00Ooo0o;
  }
  
  public Circle getTopCircle()
  {
    return this.o00OoOoo;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getPaddingTop();
    int j = getPaddingLeft();
    int k = getPaddingBottom();
    int m = getHeight();
    paramCanvas.save();
    float f1 = m;
    Circle localCircle = this.o00OoOoo;
    float f2 = localCircle.OooO0OO;
    float f3 = 2.0F;
    float f4 = f2 * f3;
    float f5 = i;
    f4 += f5;
    float f6 = k;
    f4 += f6;
    boolean bool = f1 < f4;
    Object localObject;
    float f7;
    if (!bool)
    {
      f5 = j;
      f2 *= f3;
      f1 = f1 - f2 - f6;
      paramCanvas.translate(f5, f1);
      localObject = this.o00OoOoo;
      f7 = ((Circle)localObject).OooO00o;
      f6 = ((Circle)localObject).OooO0O0;
      f5 = ((Circle)localObject).OooO0OO;
      Paint localPaint1 = this.o00Ooo0O;
      paramCanvas.drawCircle(f7, f6, f5, localPaint1);
    }
    else
    {
      f7 = j;
      paramCanvas.translate(f7, f5);
      OooO0O0();
      localObject = this.o00Ooo0;
      Paint localPaint2 = this.o00Ooo0O;
      paramCanvas.drawPath((Path)localObject, localPaint2);
    }
    paramCanvas.restore();
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramBoolean = getHeight();
    OooO0Oo(paramBoolean);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt1 = this.o00Ooo0o;
    int i = o00OooO;
    paramInt1 = (paramInt1 + i) * 2;
    Circle localCircle = this.o00Ooo00;
    float f1 = localCircle.OooO0O0;
    float f2 = localCircle.OooO0OO;
    f1 += f2;
    float f3 = i * 2;
    i = (int)Math.ceil(f1 + f3);
    int j = getPaddingLeft();
    paramInt1 += j;
    j = getPaddingRight();
    paramInt1 += j;
    j = getPaddingTop();
    i += j;
    j = getPaddingBottom();
    paramInt2 = View.resolveSize(i + j, paramInt2);
    super.setMeasuredDimension(paramInt1, paramInt2);
  }
  
  public void setIndicatorColor(int paramInt)
  {
    this.o00Ooo0O.setColor(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.waterdrop.WaterDropView
 * JD-Core Version:    0.7.0.1
 */