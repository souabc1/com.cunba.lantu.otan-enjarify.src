package com.scwang.smartrefresh.header.internal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;

class MaterialProgressDrawable$Ring
{
  public int[] OooO;
  public final RectF OooO00o;
  public final Paint OooO0O0;
  public final Paint OooO0OO;
  public float OooO0Oo;
  public float OooO0o;
  public float OooO0o0;
  public float OooO0oO;
  public float OooO0oo;
  public int OooOO0;
  public float OooOO0O;
  public float OooOO0o;
  public boolean OooOOO;
  public float OooOOO0;
  public Path OooOOOO;
  public float OooOOOo;
  public int OooOOo;
  public double OooOOo0;
  public int OooOOoo;
  public final Paint OooOo0;
  public int OooOo00;
  public int OooOo0O;
  public int OooOo0o;
  
  private int getNextColorIndex()
  {
    int i = this.OooOO0 + 1;
    int j = this.OooO.length;
    return i % j;
  }
  
  public void OooO00o(Canvas paramCanvas, Rect paramRect)
  {
    RectF localRectF = this.OooO00o;
    localRectF.set(paramRect);
    float f1 = this.OooO0oo;
    localRectF.inset(f1, f1);
    f1 = this.OooO0Oo;
    float f2 = this.OooO0o;
    f1 += f2;
    float f3 = 360.0F;
    float f4 = f1 * f3;
    float f5 = (this.OooO0o0 + f2) * f3 - f4;
    f1 = 0.0F;
    Object localObject = null;
    boolean bool = f5 < 0.0F;
    int j;
    if (bool)
    {
      localObject = this.OooO0O0;
      j = this.OooOo0o;
      ((Paint)localObject).setColor(j);
      Paint localPaint1 = this.OooO0O0;
      localObject = paramCanvas;
      f2 = f4;
      f3 = f5;
      paramCanvas.drawArc(localRectF, f4, f5, false, localPaint1);
    }
    OooO0O0(paramCanvas, f4, f5, paramRect);
    int i = this.OooOo00;
    int k = 255;
    float f6 = 3.573311E-043F;
    if (i < k)
    {
      localObject = this.OooOo0;
      j = this.OooOo0O;
      ((Paint)localObject).setColor(j);
      localObject = this.OooOo0;
      j = this.OooOo00;
      k -= j;
      ((Paint)localObject).setAlpha(k);
      f1 = paramRect.exactCenterX();
      f6 = paramRect.exactCenterY();
      int m = paramRect.width() / 2;
      float f7 = m;
      Paint localPaint2 = this.OooOo0;
      paramCanvas.drawCircle(f1, f6, f7, localPaint2);
    }
  }
  
  public final void OooO0O0(Canvas paramCanvas, float paramFloat1, float paramFloat2, Rect paramRect)
  {
    boolean bool = this.OooOOO;
    if (bool)
    {
      Object localObject = this.OooOOOO;
      if (localObject == null)
      {
        localObject = new android/graphics/Path;
        ((Path)localObject).<init>();
        this.OooOOOO = ((Path)localObject);
        Path.FillType localFillType = Path.FillType.EVEN_ODD;
        ((Path)localObject).setFillType(localFillType);
      }
      else
      {
        ((Path)localObject).reset();
      }
      int i = (int)this.OooO0oo / 2;
      float f1 = i;
      float f2 = this.OooOOOo;
      f1 *= f2;
      double d1 = this.OooOOo0;
      double d2 = 0.0D;
      double d3 = Math.cos(d2);
      d1 *= d3;
      d3 = paramRect.exactCenterX();
      d1 += d3;
      f2 = (float)d1;
      d3 = this.OooOOo0;
      double d4 = Math.sin(d2);
      d3 *= d4;
      d4 = paramRect.exactCenterY();
      d3 += d4;
      float f3 = (float)d3;
      this.OooOOOO.moveTo(0.0F, 0.0F);
      Path localPath1 = this.OooOOOO;
      int j = this.OooOOo;
      float f4 = j;
      float f5 = this.OooOOOo;
      f4 *= f5;
      localPath1.lineTo(f4, 0.0F);
      localPath1 = this.OooOOOO;
      int k = this.OooOOo;
      float f6 = k;
      f4 = this.OooOOOo;
      f6 = f6 * f4 / 2.0F;
      int m = this.OooOOoo;
      f5 = m * f4;
      localPath1.lineTo(f6, f5);
      localPath1 = this.OooOOOO;
      f2 -= f1;
      localPath1.offset(f2, f3);
      this.OooOOOO.close();
      localObject = this.OooO0OO;
      int n = this.OooOo0o;
      ((Paint)localObject).setColor(n);
      paramFloat1 = paramFloat1 + paramFloat2 - 5.0F;
      paramFloat2 = paramRect.exactCenterX();
      float f7 = paramRect.exactCenterY();
      paramCanvas.rotate(paramFloat1, paramFloat2, f7);
      Path localPath2 = this.OooOOOO;
      Paint localPaint = this.OooO0OO;
      paramCanvas.drawPath(localPath2, localPaint);
    }
  }
  
  public void OooO0OO()
  {
    int i = getNextColorIndex();
    setColorIndex(i);
  }
  
  public void OooO0Oo()
  {
    this.OooOO0O = 0.0F;
    this.OooOO0o = 0.0F;
    this.OooOOO0 = 0.0F;
    this.OooO0Oo = 0.0F;
    this.OooO0o0 = 0.0F;
    this.OooO0o = 0.0F;
  }
  
  public void OooO0o0()
  {
    float f = this.OooO0Oo;
    this.OooOO0O = f;
    f = this.OooO0o0;
    this.OooOO0o = f;
    f = this.OooO0o;
    this.OooOOO0 = f;
  }
  
  public int getNextColor()
  {
    int[] arrayOfInt = this.OooO;
    int i = getNextColorIndex();
    return arrayOfInt[i];
  }
  
  public int getStartingColor()
  {
    int[] arrayOfInt = this.OooO;
    int i = this.OooOO0;
    return arrayOfInt[i];
  }
  
  public void setColorIndex(int paramInt)
  {
    this.OooOO0 = paramInt;
    paramInt = this.OooO[paramInt];
    this.OooOo0o = paramInt;
  }
  
  public void setInsets(int paramInt1, int paramInt2)
  {
    paramInt1 = Math.min(paramInt1, paramInt2);
    float f1 = paramInt1;
    double d1 = this.OooOOo0;
    double d2 = 0.0D;
    paramInt2 = d1 < d2;
    float f2 = 2.0F;
    if (paramInt2 > 0)
    {
      paramInt2 = f1 < 0.0F;
      if (paramInt2 >= 0)
      {
        f1 /= f2;
        d3 = f1 - d1;
        break label73;
      }
    }
    f1 = this.OooO0oO / f2;
    double d3 = Math.ceil(f1);
    label73:
    f1 = (float)d3;
    this.OooO0oo = f1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.internal.MaterialProgressDrawable.Ring
 * JD-Core Version:    0.7.0.1
 */