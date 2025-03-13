package com.scwang.smartrefresh.header.flyrefresh;

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.animation.PathInterpolatorCompat;

public class MountainSceneView
  extends View
{
  public int o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public int o00OooO;
  public int o00OooO0;
  public int o00OooOO;
  public int o00OooOo;
  public Paint o00OoooO;
  public Paint o00Ooooo;
  public float o00o0;
  public Path o00o00;
  public Paint o00o000;
  public Paint o00o0000;
  public Path o00o000O;
  public Path o00o000o;
  public Path o00o00O0;
  public Matrix o00o00Oo;
  public float o00o00o;
  public float o00o00o0;
  public float o00o00oO;
  public float o00o00oo;
  public int o00o0O00;
  public int o0O00o0;
  public Path oo00oO;
  
  public final void OooO00o(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2)
  {
    paramCanvas.save();
    float f = 100.0F * paramFloat1 / 2.0F;
    paramFloat2 -= f;
    f = 200.0F * paramFloat1;
    paramFloat3 -= f;
    paramCanvas.translate(paramFloat2, paramFloat3);
    paramCanvas.scale(paramFloat1, paramFloat1);
    this.o00o0000.setColor(paramInt2);
    Path localPath = this.o00o00O0;
    Paint localPaint = this.o00o0000;
    paramCanvas.drawPath(localPath, localPaint);
    this.o00Ooooo.setColor(paramInt1);
    localPath = this.o00o00;
    localPaint = this.o00Ooooo;
    paramCanvas.drawPath(localPath, localPaint);
    this.o00o000.setColor(paramInt1);
    localPath = this.o00o00O0;
    localPaint = this.o00o000;
    paramCanvas.drawPath(localPath, localPaint);
    paramCanvas.restore();
  }
  
  public final void OooO0O0(float paramFloat, int paramInt)
  {
    this.o00o00Oo.reset();
    Object localObject1 = this.o00o00Oo;
    float f1 = this.o00o00o0;
    float f2 = this.o00o00o;
    ((Matrix)localObject1).setScale(f1, f2);
    float f3 = 10.0F * paramFloat;
    this.o00o000O.reset();
    Object localObject2 = this.o00o000O;
    f2 = 95.0F + f3;
    ((Path)localObject2).moveTo(0.0F, f2);
    localObject2 = this.o00o000O;
    f2 = 74.0F + f3;
    ((Path)localObject2).lineTo(55.0F, f2);
    localObject2 = this.o00o000O;
    f2 = 104.0F;
    float f4 = f3 + f2;
    ((Path)localObject2).lineTo(146.0F, f4);
    localObject2 = this.o00o000O;
    f4 = 72.0F + f3;
    ((Path)localObject2).lineTo(227.0F, f4);
    localObject2 = this.o00o000O;
    f3 += 80.0F;
    f4 = 240.0F;
    ((Path)localObject2).lineTo(f4, f3);
    localObject1 = this.o00o000O;
    f1 = 180.0F;
    ((Path)localObject1).lineTo(f4, f1);
    this.o00o000O.lineTo(0.0F, f1);
    this.o00o000O.close();
    localObject1 = this.o00o000O;
    Object localObject3 = this.o00o00Oo;
    ((Path)localObject1).transform((Matrix)localObject3);
    f3 = 20.0F * paramFloat;
    this.o00o000o.reset();
    localObject3 = this.o00o000o;
    float f5 = 103.0F + f3;
    ((Path)localObject3).moveTo(0.0F, f5);
    localObject3 = this.o00o000o;
    f5 = 90.0F + f3;
    ((Path)localObject3).lineTo(67.0F, f5);
    localObject3 = this.o00o000o;
    f5 = 115.0F + f3;
    ((Path)localObject3).lineTo(165.0F, f5);
    localObject3 = this.o00o000o;
    f5 = 87.0F + f3;
    ((Path)localObject3).lineTo(221.0F, f5);
    localObject3 = this.o00o000o;
    f3 += 100.0F;
    ((Path)localObject3).lineTo(f4, f3);
    this.o00o000o.lineTo(f4, f1);
    this.o00o000o.lineTo(0.0F, f1);
    this.o00o000o.close();
    localObject1 = this.o00o000o;
    localObject2 = this.o00o00Oo;
    ((Path)localObject1).transform((Matrix)localObject2);
    paramFloat *= 30.0F;
    this.oo00oO.reset();
    localObject1 = this.oo00oO;
    f1 = 114.0F + paramFloat;
    ((Path)localObject1).moveTo(0.0F, f1);
    localObject3 = this.oo00oO;
    float f6 = paramFloat + 106.0F;
    float f7 = paramFloat + 97.0F;
    float f8 = paramFloat + f2;
    ((Path)localObject3).cubicTo(30.0F, f6, 196.0F, f7, 240.0F, f8);
    Path localPath = this.oo00oO;
    float f9 = paramInt;
    f3 = this.o00o00o;
    f3 = f9 / f3;
    localPath.lineTo(f4, f3);
    localPath = this.oo00oO;
    f3 = this.o00o00o;
    f9 /= f3;
    localPath.lineTo(0.0F, f9);
    this.oo00oO.close();
    localPath = this.oo00oO;
    Matrix localMatrix = this.o00o00Oo;
    localPath.transform(localMatrix);
  }
  
  public void OooO0OO(float paramFloat)
  {
    this.o00o00oo = paramFloat;
    paramFloat = Math.max(0.0F, paramFloat);
    float f1 = this.o00o00oo;
    float f2 = Math.max(0.0F, f1);
    this.o00o00oO = f2;
    int i = getMeasuredHeight();
    f1 = this.o00o00oO;
    if (i <= 0)
    {
      i = 180;
      f2 = 2.522337E-043F;
    }
    OooO0O0(f1, i);
    OooO0Oo(paramFloat, false);
  }
  
  public final void OooO0Oo(float paramFloat, boolean paramBoolean)
  {
    float f1 = this.o00o0;
    boolean bool1 = paramFloat < f1;
    if ((!bool1) && (!paramBoolean)) {
      return;
    }
    paramBoolean = -1090519040;
    float f2 = -0.5F * paramFloat;
    Object localObject1 = PathInterpolatorCompat.OooO00o(0.8F, f2);
    paramFloat *= 30.000002F;
    int i = 26;
    f1 = 3.643376E-044F;
    float[] arrayOfFloat1 = new float[i];
    float[] arrayOfFloat2 = new float[i];
    boolean bool2 = false;
    float f3 = 0.0F;
    Path localPath1 = null;
    int j = 0;
    float f4 = 0.0F;
    Path localPath2 = null;
    int k = 1128792064;
    float f5 = 200.0F;
    int m = 0;
    float f6 = 0.0F;
    Path localPath3 = null;
    float f7 = 0.0F;
    int n = k;
    float f8 = f5;
    boolean bool4;
    int i2;
    for (;;)
    {
      bool4 = true;
      float f9 = 3.503246E-044F;
      if (m > bool4) {
        break;
      }
      f9 = ((TimeInterpolator)localObject1).getInterpolation(f7) * paramFloat;
      i2 = 1112014848;
      f10 = 50.0F;
      f9 += f10;
      arrayOfFloat1[m] = f9;
      arrayOfFloat2[m] = f8;
      f8 += -8.0F;
      bool4 = 1025758986;
      f9 = 0.04F;
      f7 += f9;
      m += 1;
    }
    this.o00o00.reset();
    Path localPath4 = this.o00o00;
    localPath4.moveTo(45.0F, f5);
    boolean bool5 = true;
    paramFloat = 2.382207E-044F;
    f2 = bool5 * 0.5F;
    paramBoolean = (int)f2;
    k = true - paramBoolean;
    f5 = k;
    for (;;)
    {
      m = 1084227584;
      f6 = 5.0F;
      if (bool2 >= bool5) {
        break;
      }
      localPath3 = this.o00o00;
      if (bool2 < paramBoolean)
      {
        f8 = arrayOfFloat1[bool2] - f6;
        f6 = arrayOfFloat2[bool2];
      }
      else
      {
        f8 = arrayOfFloat1[bool2];
        i2 = true - bool2;
        f10 = i2 * f6 / f5;
        f8 -= f10;
        f6 = arrayOfFloat2[bool2];
      }
      localPath3.lineTo(f8, f6);
      bool2 += true;
    }
    boolean bool6 = true;
    paramFloat = 2.242078E-044F;
    while (!bool6)
    {
      localPath1 = this.o00o00;
      if (bool6 < paramBoolean)
      {
        f7 = arrayOfFloat1[bool6] + f6;
        f8 = arrayOfFloat2[bool6];
      }
      else
      {
        f7 = arrayOfFloat1[bool6];
        n = true - bool6;
        f8 = n * f6 / f5;
        f7 += f8;
        f8 = arrayOfFloat2[bool6];
      }
      localPath1.lineTo(f7, f8);
      bool6 += true;
    }
    this.o00o00.close();
    localPath4 = this.o00o00O0;
    localPath4.reset();
    int i3 = 15;
    paramFloat = i3;
    localObject1 = this.o00o00O0;
    boolean bool3 = true;
    f3 = 1.401299E-044F;
    f5 = arrayOfFloat1[bool3];
    m = 1101004800;
    f6 = 20.0F;
    f5 -= f6;
    f7 = arrayOfFloat2[bool3];
    ((Path)localObject1).moveTo(f5, f7);
    localObject1 = this.o00o00O0;
    Object localObject2 = new android/graphics/RectF;
    f7 = arrayOfFloat1[bool3];
    f8 = f7 - f6;
    float f10 = arrayOfFloat2[bool3];
    float f11 = f10 - f6;
    f7 += f6;
    f10 += f6;
    ((RectF)localObject2).<init>(f8, f11, f7, f10);
    f7 = 180.0F;
    ((Path)localObject1).addArc((RectF)localObject2, 0.0F, f7);
    paramBoolean = bool3;
    f2 = f3;
    while (paramBoolean <= bool4)
    {
      j = paramBoolean + true;
      f4 = j / paramFloat;
      localObject2 = this.o00o00O0;
      f7 = arrayOfFloat1[paramBoolean] - f6;
      f4 = f4 * f4 * f6;
      f7 += f4;
      f4 = arrayOfFloat2[paramBoolean];
      ((Path)localObject2).lineTo(f7, f4);
      paramBoolean += true;
    }
    while (bool4 >= bool3)
    {
      paramBoolean = bool4 + true;
      f2 = paramBoolean / paramFloat;
      localPath2 = this.o00o00O0;
      f5 = arrayOfFloat1[bool4] + f6;
      f2 = f2 * f2 * f6;
      f5 -= f2;
      f2 = arrayOfFloat2[bool4];
      localPath2.lineTo(f5, f2);
      int i1;
      bool4 += true;
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = this.o00OoOoo;
    paramCanvas.drawColor(i);
    Object localObject1 = this.o00OoooO;
    int j = this.o00Ooo00;
    ((Paint)localObject1).setColor(j);
    localObject1 = this.o00o000O;
    Object localObject2 = this.o00OoooO;
    paramCanvas.drawPath((Path)localObject1, (Paint)localObject2);
    paramCanvas.save();
    float f1 = getWidth() / 2;
    paramCanvas.scale(-1.0F, 1.0F, f1, 0.0F);
    f1 = this.o00o00o0;
    float f2 = f1 * 0.12F;
    float f3 = 180.0F;
    float f4 = f1 * f3;
    f1 = this.o00o00oO;
    float f5 = 20.0F;
    f1 = f1 * f5 + 93.0F;
    float f6 = this.o00o00o;
    float f7 = f1 * f6;
    int k = this.o0O00o0;
    int m = this.o00OooOo;
    localObject1 = this;
    localObject2 = paramCanvas;
    OooO00o(paramCanvas, f2, f4, f7, k, m);
    f1 = this.o00o00o0;
    f2 = f1 * 0.1F;
    f4 = f1 * 200.0F;
    f1 = this.o00o00oO * f5 + 96.0F;
    f6 = this.o00o00o;
    f7 = f1 * f6;
    k = this.o0O00o0;
    m = this.o00OooOo;
    OooO00o(paramCanvas, f2, f4, f7, k, m);
    paramCanvas.restore();
    localObject1 = this.o00OoooO;
    j = this.o00Ooo0;
    ((Paint)localObject1).setColor(j);
    localObject1 = this.o00o000o;
    localObject2 = this.o00OoooO;
    paramCanvas.drawPath((Path)localObject1, (Paint)localObject2);
    f1 = this.o00o00o0;
    f2 = f1 * 0.2F;
    f4 = f1 * 160.0F;
    f1 = this.o00o00oO;
    f5 = 30.0F;
    f1 *= f5;
    float f8 = 105.0F;
    f1 += f8;
    f6 = this.o00o00o;
    f7 = f1 * f6;
    k = this.o00OooO0;
    m = this.o00Ooo0o;
    localObject1 = this;
    localObject2 = paramCanvas;
    OooO00o(paramCanvas, f2, f4, f7, k, m);
    f1 = this.o00o00o0;
    f2 = f1 * 0.14F;
    f4 = f1 * f3;
    f1 = this.o00o00oO * f5 + f8;
    f6 = this.o00o00o;
    f7 = f1 * f6;
    k = this.o00OooOO;
    m = this.o00OooO;
    OooO00o(paramCanvas, f2, f4, f7, k, m);
    f1 = this.o00o00o0;
    f2 = f1 * 0.16F;
    f4 = f1 * 140.0F;
    f1 = this.o00o00oO * f5 + f8;
    f6 = this.o00o00o;
    f7 = f1 * f6;
    k = this.o00OooOO;
    m = this.o00OooO;
    OooO00o(paramCanvas, f2, f4, f7, k, m);
    localObject1 = this.o00OoooO;
    j = this.o00Ooo0O;
    ((Paint)localObject1).setColor(j);
    localObject1 = this.oo00oO;
    localObject2 = this.o00OoooO;
    paramCanvas.drawPath((Path)localObject1, (Paint)localObject2);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = getMeasuredWidth();
    paramInt2 = getMeasuredHeight();
    float f1 = paramInt1;
    float f2 = 1.0F;
    f1 *= f2;
    float f3 = 240.0F;
    f1 /= f3;
    this.o00o00o0 = f1;
    paramInt1 = this.o00o0O00;
    if (paramInt1 <= 0) {
      paramInt1 = paramInt2;
    }
    f1 = paramInt1 * f2 / 180.0F;
    this.o00o00o = f1;
    f1 = this.o00o00oO;
    OooO0O0(f1, paramInt2);
    f1 = this.o00o00oO;
    OooO0Oo(f1, true);
  }
  
  public void setPrimaryColor(int paramInt)
  {
    this.o00OoOoo = paramInt;
    int i = ColorUtils.OooO0oO(-1711276033, paramInt);
    this.o00Ooo00 = i;
    i = ColorUtils.OooO0oO(-1724083556, paramInt);
    this.o00Ooo0 = i;
    i = ColorUtils.OooO0oO(-868327565, paramInt);
    this.o00Ooo0O = i;
    i = ColorUtils.OooO0oO(1428124023, paramInt);
    this.o00Ooo0o = i;
    i = ColorUtils.OooO0oO(-871612856, paramInt);
    this.o00OooO0 = i;
    i = ColorUtils.OooO0oO(1429506191, paramInt);
    this.o00OooO = i;
    i = ColorUtils.OooO0oO(-870620823, paramInt);
    this.o00OooOO = i;
    i = ColorUtils.OooO0oO(1431810478, paramInt);
    this.o00OooOo = i;
    paramInt = ColorUtils.OooO0oO(-865950547, paramInt);
    this.o0O00o0 = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.flyrefresh.MountainSceneView
 * JD-Core Version:    0.7.0.1
 */