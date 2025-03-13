package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

class MotionLayout$DevModeDraw
{
  public Paint OooO;
  public float[] OooO00o;
  public int[] OooO0O0;
  public float[] OooO0OO;
  public Path OooO0Oo;
  public Paint OooO0o;
  public Paint OooO0o0;
  public Paint OooO0oO;
  public Paint OooO0oo;
  public float[] OooOO0;
  public final int OooOO0O;
  public final int OooOO0o;
  public final int OooOOO;
  public final int OooOOO0;
  public final int OooOOOO;
  public DashPathEffect OooOOOo;
  public Rect OooOOo;
  public int OooOOo0;
  public boolean OooOOoo;
  public int OooOo00;
  
  public MotionLayout$DevModeDraw(MotionLayout paramMotionLayout)
  {
    int i = -21965;
    this.OooOO0O = i;
    int j = -2067046;
    this.OooOO0o = j;
    int k = -13391360;
    this.OooOOO0 = k;
    this.OooOOO = 1996488704;
    this.OooOOOO = 10;
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.OooOOo = localRect;
    localRect = null;
    this.OooOOoo = false;
    int m = 1;
    this.OooOo00 = m;
    Paint localPaint = new android/graphics/Paint;
    localPaint.<init>();
    this.OooO0o0 = localPaint;
    localPaint.setAntiAlias(m);
    localPaint = this.OooO0o0;
    localPaint.setColor(i);
    Object localObject = this.OooO0o0;
    float f1 = 2.0F;
    ((Paint)localObject).setStrokeWidth(f1);
    localObject = this.OooO0o0;
    Paint.Style localStyle1 = Paint.Style.STROKE;
    ((Paint)localObject).setStyle(localStyle1);
    localObject = new android/graphics/Paint;
    ((Paint)localObject).<init>();
    this.OooO0o = ((Paint)localObject);
    ((Paint)localObject).setAntiAlias(m);
    this.OooO0o.setColor(j);
    this.OooO0o.setStrokeWidth(f1);
    localObject = this.OooO0o;
    Paint.Style localStyle2 = Paint.Style.STROKE;
    ((Paint)localObject).setStyle(localStyle2);
    localObject = new android/graphics/Paint;
    ((Paint)localObject).<init>();
    this.OooO0oO = ((Paint)localObject);
    ((Paint)localObject).setAntiAlias(m);
    this.OooO0oO.setColor(k);
    this.OooO0oO.setStrokeWidth(f1);
    localObject = this.OooO0oO;
    localStyle2 = Paint.Style.STROKE;
    ((Paint)localObject).setStyle(localStyle2);
    localObject = new android/graphics/Paint;
    ((Paint)localObject).<init>();
    this.OooO0oo = ((Paint)localObject);
    ((Paint)localObject).setAntiAlias(m);
    this.OooO0oo.setColor(k);
    localObject = this.OooO0oo;
    float f2 = paramMotionLayout.getContext().getResources().getDisplayMetrics().density * 12.0F;
    ((Paint)localObject).setTextSize(f2);
    paramMotionLayout = new float[8];
    this.OooOO0 = paramMotionLayout;
    paramMotionLayout = new android/graphics/Paint;
    paramMotionLayout.<init>();
    this.OooO = paramMotionLayout;
    paramMotionLayout.setAntiAlias(m);
    paramMotionLayout = new android/graphics/DashPathEffect;
    i = 2;
    float f3 = 2.802597E-045F;
    localObject = new float[i];
    Object tmp377_375 = localObject;
    tmp377_375[0] = 4.0F;
    tmp377_375[1] = 8.0F;
    j = 0;
    localStyle2 = null;
    paramMotionLayout.<init>((float[])localObject, 0.0F);
    this.OooOOOo = paramMotionLayout;
    localObject = this.OooO0oO;
    ((Paint)localObject).setPathEffect(paramMotionLayout);
    paramMotionLayout = new float[100];
    this.OooO0OO = paramMotionLayout;
    f2 = 7.006492E-044F;
    paramMotionLayout = new int[50];
    this.OooO0O0 = paramMotionLayout;
    boolean bool = this.OooOOoo;
    if (bool)
    {
      paramMotionLayout = this.OooO0o0;
      i = 1090519040;
      f3 = 8.0F;
      paramMotionLayout.setStrokeWidth(f3);
      this.OooO.setStrokeWidth(f3);
      paramMotionLayout = this.OooO0o;
      paramMotionLayout.setStrokeWidth(f3);
      int n = 4;
      f2 = 5.605194E-045F;
      this.OooOo00 = n;
    }
  }
  
  public final void OooO(Canvas paramCanvas, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = "";
    ((StringBuilder)localObject).append(str);
    float f1 = paramInt1 / 2;
    f1 = paramFloat1 - f1;
    float f2 = 100.0F;
    f1 *= f2;
    float f3 = this.OooOo0.getWidth() - paramInt1;
    double d1 = f1 / f3;
    double d2 = 0.5D;
    f1 = (int)(d1 + d2) / f2;
    ((StringBuilder)localObject).append(f1);
    localObject = ((StringBuilder)localObject).toString();
    Paint localPaint1 = this.OooO0oo;
    OooOO0o((String)localObject, localPaint1);
    float f4 = 2.0F;
    f1 = paramFloat1 / f4;
    f3 = this.OooOOo.width() / 2;
    f1 = f1 - f3 + 0.0F;
    f3 = paramFloat2 - 20.0F;
    Paint localPaint2 = this.OooO0oo;
    paramCanvas.drawText((String)localObject, f1, f3, localPaint2);
    float f5 = 1.0F;
    float f6 = Math.min(0.0F, f5);
    Paint localPaint3 = this.OooO0oO;
    localObject = paramCanvas;
    f1 = paramFloat1;
    f3 = paramFloat2;
    float f7 = paramFloat2;
    paramCanvas.drawLine(paramFloat1, paramFloat2, f6, paramFloat2, localPaint3);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append(str);
    f1 = paramInt2 / 2;
    f1 = (paramFloat2 - f1) * f2;
    f3 = this.OooOo0.getHeight() - paramInt2;
    f1 = (int)(f1 / f3 + d2) / f2;
    ((StringBuilder)localObject).append(f1);
    localObject = ((StringBuilder)localObject).toString();
    localPaint1 = this.OooO0oo;
    OooOO0o((String)localObject, localPaint1);
    f1 = paramFloat2 / f4;
    f3 = this.OooOOo.height() / 2;
    f1 -= f3;
    f3 = paramFloat1 + 5.0F;
    f1 = 0.0F - f1;
    localPaint2 = this.OooO0oo;
    paramCanvas.drawText((String)localObject, f3, f1, localPaint2);
    f7 = Math.max(0.0F, f5);
    localPaint3 = this.OooO0oO;
    localObject = paramCanvas;
    f1 = paramFloat1;
    f3 = paramFloat2;
    f6 = paramFloat1;
    paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat1, f7, localPaint3);
  }
  
  public void OooO00o(Canvas paramCanvas, HashMap paramHashMap, int paramInt1, int paramInt2)
  {
    if (paramHashMap != null)
    {
      int i = paramHashMap.size();
      if (i != 0)
      {
        paramCanvas.save();
        Object localObject1 = this.OooOo0;
        boolean bool1 = ((View)localObject1).isInEditMode();
        int k;
        float f1;
        int m;
        Paint localPaint;
        int n;
        float f2;
        if (!bool1)
        {
          int j = paramInt2 & 0x1;
          k = 2;
          f1 = 2.802597E-045F;
          if (j == k)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            Object localObject2 = this.OooOo0.getContext().getResources();
            m = MotionLayout.OooO0oO(this.OooOo0);
            localObject2 = ((Resources)localObject2).getResourceName(m);
            ((StringBuilder)localObject1).append((String)localObject2);
            ((StringBuilder)localObject1).append(":");
            f1 = this.OooOo0.getProgress();
            ((StringBuilder)localObject1).append(f1);
            localObject1 = ((StringBuilder)localObject1).toString();
            f1 = this.OooOo0.getHeight() + -30;
            localPaint = this.OooO0oo;
            paramCanvas.drawText((String)localObject1, 10.0F, f1, localPaint);
            localObject2 = this.OooOo0;
            k = ((View)localObject2).getHeight() + -29;
            f1 = k;
            localPaint = this.OooO0o0;
            n = 1093664768;
            f2 = 11.0F;
            paramCanvas.drawText((String)localObject1, f2, f1, localPaint);
          }
        }
        paramHashMap = paramHashMap.values().iterator();
        for (;;)
        {
          boolean bool2 = paramHashMap.hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (MotionController)paramHashMap.next();
          k = ((MotionController)localObject1).getDrawPath();
          m = 1;
          float f3 = 1.4E-45F;
          if ((paramInt2 > 0) && (k == 0))
          {
            k = m;
            f1 = f3;
          }
          if (k != 0)
          {
            Object localObject3 = this.OooO0OO;
            int[] arrayOfInt = this.OooO0O0;
            n = ((MotionController)localObject1).OooO0OO((float[])localObject3, arrayOfInt);
            this.OooOOo0 = n;
            if (k >= m)
            {
              m = paramInt1 / 16;
              localObject3 = this.OooO00o;
              if (localObject3 != null)
              {
                n = localObject3.length;
                i1 = m * 2;
                if (n == i1) {}
              }
              else
              {
                n = m * 2;
                localObject3 = new float[n];
                this.OooO00o = ((float[])localObject3);
                localObject3 = new android/graphics/Path;
                ((Path)localObject3).<init>();
                this.OooO0Oo = ((Path)localObject3);
              }
              n = this.OooOo00;
              float f4 = n;
              f2 = n;
              paramCanvas.translate(f4, f2);
              localObject3 = this.OooO0o0;
              int i1 = 1996488704;
              f4 = 2.596148E+033F;
              ((Paint)localObject3).setColor(i1);
              this.OooO.setColor(i1);
              this.OooO0o.setColor(i1);
              this.OooO0oO.setColor(i1);
              localObject3 = this.OooO00o;
              ((MotionController)localObject1).OooO0Oo((float[])localObject3, m);
              m = this.OooOOo0;
              OooO0O0(paramCanvas, k, m, (MotionController)localObject1);
              this.OooO0o0.setColor(-21965);
              localPaint = this.OooO0o;
              n = -2067046;
              localPaint.setColor(n);
              this.OooO.setColor(n);
              localPaint = this.OooO0oO;
              localPaint.setColor(-13391360);
              m = this.OooOo00;
              n = -m;
              f2 = n;
              f3 = -m;
              paramCanvas.translate(f2, f3);
              m = this.OooOOo0;
              OooO0O0(paramCanvas, k, m, (MotionController)localObject1);
              m = 5;
              f3 = 7.006492E-045F;
              if (k == m) {
                OooOO0(paramCanvas, (MotionController)localObject1);
              }
            }
          }
        }
        paramCanvas.restore();
      }
    }
  }
  
  public void OooO0O0(Canvas paramCanvas, int paramInt1, int paramInt2, MotionController paramMotionController)
  {
    int i = 4;
    if (paramInt1 == i) {
      OooO0Oo(paramCanvas);
    }
    i = 2;
    if (paramInt1 == i) {
      OooO0oO(paramCanvas);
    }
    i = 3;
    if (paramInt1 == i) {
      OooO0o0(paramCanvas);
    }
    OooO0OO(paramCanvas);
    OooOO0O(paramCanvas, paramInt1, paramInt2, paramMotionController);
  }
  
  public final void OooO0OO(Canvas paramCanvas)
  {
    float[] arrayOfFloat = this.OooO00o;
    Paint localPaint = this.OooO0o0;
    paramCanvas.drawLines(arrayOfFloat, localPaint);
  }
  
  public final void OooO0Oo(Canvas paramCanvas)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    for (;;)
    {
      int m = this.OooOOo0;
      if (i >= m) {
        break;
      }
      int[] arrayOfInt = this.OooO0O0;
      m = arrayOfInt[i];
      int n = 1;
      if (m == n) {
        j = n;
      }
      if (m == 0) {
        k = n;
      }
      i += 1;
    }
    if (j != 0) {
      OooO0oO(paramCanvas);
    }
    if (k != 0) {
      OooO0o0(paramCanvas);
    }
  }
  
  public final void OooO0o(Canvas paramCanvas, float paramFloat1, float paramFloat2)
  {
    Object localObject1 = this.OooO00o;
    float f1 = localObject1[0];
    int i = 1;
    float f2 = localObject1[i];
    int j = localObject1.length + -2;
    float f3 = localObject1[j];
    int k = localObject1.length - i;
    float f4 = localObject1[k];
    float f5 = Math.min(f1, f3);
    float f6 = Math.max(f2, f4);
    float f7 = Math.min(f1, f3);
    f7 = paramFloat1 - f7;
    float f8 = Math.max(f2, f4) - paramFloat2;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = "";
    ((StringBuilder)localObject2).append(str);
    float f9 = 100.0F;
    float f10 = f7 * f9;
    float f11 = Math.abs(f3 - f1);
    double d1 = f10 / f11;
    double d2 = 0.5D;
    f10 = (int)(d1 + d2) / f9;
    ((StringBuilder)localObject2).append(f10);
    localObject2 = ((StringBuilder)localObject2).toString();
    Paint localPaint1 = this.OooO0oo;
    OooOO0o((String)localObject2, localPaint1);
    f11 = 2.0F;
    f7 /= f11;
    f10 = this.OooOOo.width() / 2;
    f7 = f7 - f10 + f5;
    f5 = paramFloat2 - 20.0F;
    localPaint1 = this.OooO0oo;
    paramCanvas.drawText((String)localObject2, f7, f5, localPaint1);
    f3 = Math.min(f1, f3);
    localPaint1 = this.OooO0oO;
    localObject1 = paramCanvas;
    f1 = paramFloat1;
    f7 = paramFloat2;
    float f12 = paramFloat2;
    paramCanvas.drawLine(paramFloat1, paramFloat2, f3, paramFloat2, localPaint1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(str);
    f1 = f8 * f9;
    f7 = Math.abs(f4 - f2);
    f1 = (int)(f1 / f7 + d2) / f9;
    ((StringBuilder)localObject1).append(f1);
    localObject1 = ((StringBuilder)localObject1).toString();
    Paint localPaint2 = this.OooO0oo;
    OooOO0o((String)localObject1, localPaint2);
    f8 /= f11;
    f1 = this.OooOOo.height() / 2;
    f8 -= f1;
    f1 = paramFloat1 + 5.0F;
    f6 -= f8;
    Paint localPaint3 = this.OooO0oo;
    paramCanvas.drawText((String)localObject1, f1, f6, localPaint3);
    f12 = Math.max(f2, f4);
    localPaint1 = this.OooO0oO;
    localObject1 = paramCanvas;
    f1 = paramFloat1;
    f7 = paramFloat2;
    f3 = paramFloat1;
    paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat1, f12, localPaint1);
  }
  
  public final void OooO0o0(Canvas paramCanvas)
  {
    Object localObject = this.OooO00o;
    float f1 = localObject[0];
    int i = 1;
    float f2 = localObject[i];
    int j = localObject.length + -2;
    float f3 = localObject[j];
    int k = localObject.length - i;
    float f4 = localObject[k];
    float f5 = Math.min(f1, f3);
    float f6 = Math.max(f2, f4);
    float f7 = Math.max(f1, f3);
    float f8 = Math.max(f2, f4);
    Paint localPaint = this.OooO0oO;
    paramCanvas.drawLine(f5, f6, f7, f8, localPaint);
    float f9 = Math.min(f1, f3);
    float f10 = Math.min(f2, f4);
    float f11 = Math.min(f1, f3);
    float f12 = Math.max(f2, f4);
    localObject = this.OooO0oO;
    paramCanvas.drawLine(f9, f10, f11, f12, (Paint)localObject);
  }
  
  public final void OooO0oO(Canvas paramCanvas)
  {
    float[] arrayOfFloat = this.OooO00o;
    float f1 = arrayOfFloat[0];
    int i = 1;
    float f2 = arrayOfFloat[i];
    int j = arrayOfFloat.length + -2;
    float f3 = arrayOfFloat[j];
    j = arrayOfFloat.length - i;
    float f4 = arrayOfFloat[j];
    Paint localPaint = this.OooO0oO;
    paramCanvas.drawLine(f1, f2, f3, f4, localPaint);
  }
  
  public final void OooO0oo(Canvas paramCanvas, float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = this.OooO00o;
    float f1 = arrayOfFloat[0];
    int i = 1;
    float f2 = arrayOfFloat[i];
    int j = arrayOfFloat.length + -2;
    float f3 = arrayOfFloat[j];
    int k = arrayOfFloat.length - i;
    float f4 = arrayOfFloat[k];
    double d1 = f1 - f3;
    double d2 = f2 - f4;
    float f5 = (float)Math.hypot(d1, d2);
    float f6 = paramFloat1 - f1;
    f3 -= f1;
    f6 *= f3;
    float f7 = paramFloat2 - f2;
    f4 -= f2;
    f7 *= f4;
    f6 += f7;
    f7 = f5 * f5;
    f6 /= f7;
    f3 *= f6;
    float f8 = f1 + f3;
    f6 *= f4;
    float f9 = f2 + f6;
    Path localPath = new android/graphics/Path;
    localPath.<init>();
    localPath.moveTo(paramFloat1, paramFloat2);
    localPath.lineTo(f8, f9);
    double d3 = f8 - paramFloat1;
    double d4 = f9 - paramFloat2;
    f4 = (float)Math.hypot(d3, d4);
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("");
    f2 = 100.0F;
    f5 = (int)(f4 * f2 / f5) / f2;
    ((StringBuilder)localObject).append(f5);
    String str = ((StringBuilder)localObject).toString();
    localObject = this.OooO0oo;
    OooOO0o(str, (Paint)localObject);
    f4 /= 2.0F;
    f1 = this.OooOOo.width() / 2;
    f7 = f4 - f1;
    Paint localPaint1 = this.OooO0oo;
    paramCanvas.drawTextOnPath(str, localPath, f7, -20.0F, localPaint1);
    Paint localPaint2 = this.OooO0oO;
    paramCanvas.drawLine(paramFloat1, paramFloat2, f8, f9, localPaint2);
  }
  
  public final void OooOO0(Canvas paramCanvas, MotionController paramMotionController)
  {
    this.OooO0Oo.reset();
    Paint localPaint = null;
    int i = 0;
    for (;;)
    {
      int j = 50;
      float f1 = 7.006492E-044F;
      if (i > j) {
        break;
      }
      float f2 = i;
      f1 = j;
      f2 /= f1;
      Object localObject = this.OooOO0;
      paramMotionController.OooO0o0(f2, (float[])localObject, 0);
      localObject = this.OooO0Oo;
      float[] arrayOfFloat = this.OooOO0;
      float f3 = arrayOfFloat[0];
      f2 = arrayOfFloat[1];
      ((Path)localObject).moveTo(f3, f2);
      localObject = this.OooO0Oo;
      arrayOfFloat = this.OooOO0;
      f3 = arrayOfFloat[2];
      f2 = arrayOfFloat[3];
      ((Path)localObject).lineTo(f3, f2);
      localObject = this.OooO0Oo;
      arrayOfFloat = this.OooOO0;
      f3 = arrayOfFloat[4];
      f2 = arrayOfFloat[5];
      ((Path)localObject).lineTo(f3, f2);
      localObject = this.OooO0Oo;
      arrayOfFloat = this.OooOO0;
      int k = 6;
      f3 = arrayOfFloat[k];
      int m = 7;
      f2 = arrayOfFloat[m];
      ((Path)localObject).lineTo(f3, f2);
      localObject = this.OooO0Oo;
      ((Path)localObject).close();
      i += 1;
    }
    this.OooO0o0.setColor(1140850688);
    float f4 = 2.0F;
    paramCanvas.translate(f4, f4);
    paramMotionController = this.OooO0Oo;
    localPaint = this.OooO0o0;
    paramCanvas.drawPath(paramMotionController, localPaint);
    f4 = -2.0F;
    paramCanvas.translate(f4, f4);
    this.OooO0o0.setColor(-65536);
    paramMotionController = this.OooO0Oo;
    localPaint = this.OooO0o0;
    paramCanvas.drawPath(paramMotionController, localPaint);
  }
  
  public final void OooOO0O(Canvas paramCanvas, int paramInt1, int paramInt2, MotionController paramMotionController)
  {
    DevModeDraw localDevModeDraw = this;
    Canvas localCanvas = paramCanvas;
    int i = paramInt1;
    MotionController localMotionController = paramMotionController;
    Object localObject1 = paramMotionController.OooO0O0;
    int j;
    Object localObject2;
    int m;
    int n;
    if (localObject1 != null)
    {
      j = ((View)localObject1).getWidth();
      localObject2 = paramMotionController.OooO0O0;
      k = ((View)localObject2).getHeight();
      m = j;
      n = k;
    }
    else
    {
      m = 0;
      n = 0;
    }
    int i1 = 1;
    int i2 = i1;
    int i3;
    float f1;
    int i4;
    float f5;
    float f6;
    for (;;)
    {
      j = paramInt2 + -1;
      i3 = 2;
      if (i2 >= j) {
        break;
      }
      j = 4;
      f1 = 5.605194E-045F;
      if (i == j)
      {
        localObject2 = localDevModeDraw.OooO0O0;
        i4 = i2 + -1;
        k = localObject2[i4];
        if (k == 0) {}
      }
      else
      {
        localObject2 = localDevModeDraw.OooO0OO;
        i4 = i2 * 2;
        float f2 = localObject2[i4];
        i4 += i1;
        float f3 = localObject2[i4];
        localDevModeDraw.OooO0Oo.reset();
        localObject2 = localDevModeDraw.OooO0Oo;
        i4 = 1092616192;
        float f4 = 10.0F;
        f5 = f3 + f4;
        ((Path)localObject2).moveTo(f2, f5);
        localObject2 = localDevModeDraw.OooO0Oo;
        f5 = f2 + f4;
        ((Path)localObject2).lineTo(f5, f3);
        localObject2 = localDevModeDraw.OooO0Oo;
        f5 = f3 - f4;
        ((Path)localObject2).lineTo(f2, f5);
        localObject2 = localDevModeDraw.OooO0Oo;
        f4 = f2 - f4;
        ((Path)localObject2).lineTo(f4, f3);
        localObject2 = localDevModeDraw.OooO0Oo;
        ((Path)localObject2).close();
        k = i2 + -1;
        localMotionController.getKeyFrame(k);
        float f7;
        float f8;
        if (i == j)
        {
          localObject1 = localDevModeDraw.OooO0O0;
          j = localObject1[k];
          if (j == i1)
          {
            f1 = f2 - 0.0F;
            f6 = f3 - 0.0F;
            localDevModeDraw.OooO0oo(localCanvas, f1, f6);
          }
          do
          {
            for (;;)
            {
              f7 = f3;
              f8 = f2;
              break label434;
              if (j != 0) {
                break;
              }
              f1 = f2 - 0.0F;
              f6 = f3 - 0.0F;
              localDevModeDraw.OooO0o(localCanvas, f1, f6);
            }
          } while (j != i3);
          f4 = f2 - 0.0F;
          f5 = f3 - 0.0F;
          localObject1 = this;
          localObject2 = paramCanvas;
          f7 = f3;
          f8 = f2;
          OooO(paramCanvas, f4, f5, m, n);
          label434:
          localObject1 = localDevModeDraw.OooO0Oo;
          localObject2 = localDevModeDraw.OooO;
          localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
        }
        else
        {
          f7 = f3;
          f8 = f2;
        }
        if (i == i3)
        {
          f2 = f8 - 0.0F;
          f3 = f7 - 0.0F;
          localDevModeDraw.OooO0oo(localCanvas, f2, f3);
        }
        j = 3;
        f1 = 4.203895E-045F;
        if (i == j)
        {
          f2 = f8 - 0.0F;
          f3 = f7 - 0.0F;
          localDevModeDraw.OooO0o(localCanvas, f2, f3);
        }
        j = 6;
        f1 = 8.407791E-045F;
        if (i == j)
        {
          f4 = f8 - 0.0F;
          f5 = f7 - 0.0F;
          localObject1 = this;
          localObject2 = paramCanvas;
          OooO(paramCanvas, f4, f5, m, n);
        }
        localObject1 = localDevModeDraw.OooO0Oo;
        localObject2 = localDevModeDraw.OooO;
        localCanvas.drawPath((Path)localObject1, (Paint)localObject2);
      }
      i2 += 1;
    }
    localObject1 = localDevModeDraw.OooO00o;
    int k = localObject1.length;
    if (k > i1)
    {
      f6 = localObject1[0];
      f1 = localObject1[i1];
      Paint localPaint = localDevModeDraw.OooO0o;
      f5 = 8.0F;
      localCanvas.drawCircle(f6, f1, f5, localPaint);
      localObject1 = localDevModeDraw.OooO00o;
      k = localObject1.length - i3;
      f6 = localObject1[k];
      i4 = localObject1.length - i1;
      f1 = localObject1[i4];
      localPaint = localDevModeDraw.OooO0o;
      localCanvas.drawCircle(f6, f1, f5, localPaint);
    }
  }
  
  public void OooOO0o(String paramString, Paint paramPaint)
  {
    int i = paramString.length();
    Rect localRect = this.OooOOo;
    paramPaint.getTextBounds(paramString, 0, i, localRect);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionLayout.DevModeDraw
 * JD-Core Version:    0.7.0.1
 */