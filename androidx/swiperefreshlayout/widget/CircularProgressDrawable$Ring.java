package androidx.swiperefreshlayout.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;

class CircularProgressDrawable$Ring
{
  public int[] OooO;
  public final RectF OooO00o;
  public final Paint OooO0O0;
  public final Paint OooO0OO;
  public final Paint OooO0Oo;
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
  public float OooOOo0;
  public int OooOOoo;
  public int OooOo0;
  public int OooOo00;
  
  public CircularProgressDrawable$Ring()
  {
    Object localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.OooO00o = ((RectF)localObject);
    localObject = new android/graphics/Paint;
    ((Paint)localObject).<init>();
    this.OooO0O0 = ((Paint)localObject);
    Paint localPaint1 = new android/graphics/Paint;
    localPaint1.<init>();
    this.OooO0OO = localPaint1;
    Paint localPaint2 = new android/graphics/Paint;
    localPaint2.<init>();
    this.OooO0Oo = localPaint2;
    this.OooO0o0 = 0.0F;
    this.OooO0o = 0.0F;
    this.OooO0oO = 0.0F;
    this.OooO0oo = 5.0F;
    this.OooOOOo = 1.0F;
    this.OooOo00 = 255;
    Paint.Cap localCap = Paint.Cap.SQUARE;
    ((Paint)localObject).setStrokeCap(localCap);
    boolean bool = true;
    ((Paint)localObject).setAntiAlias(bool);
    Paint.Style localStyle = Paint.Style.STROKE;
    ((Paint)localObject).setStyle(localStyle);
    localObject = Paint.Style.FILL;
    localPaint1.setStyle((Paint.Style)localObject);
    localPaint1.setAntiAlias(bool);
    localPaint2.setColor(0);
  }
  
  public void OooO00o(Canvas paramCanvas, Rect paramRect)
  {
    RectF localRectF = this.OooO00o;
    float f1 = this.OooOOo0;
    float f2 = this.OooO0oo;
    float f3 = 2.0F;
    f2 = f2 / f3 + f1;
    float f4 = 0.0F;
    boolean bool = f1 < 0.0F;
    if (!bool)
    {
      int i = paramRect.width();
      j = paramRect.height();
      i = Math.min(i, j);
      f1 = i / f3;
      j = this.OooOOo;
      f2 = j;
      f4 = this.OooOOOo;
      f2 = f2 * f4 / f3;
      f4 = this.OooO0oo / f3;
      f2 = Math.max(f2, f4);
      f2 = f1 - f2;
    }
    f1 = paramRect.centerX() - f2;
    f4 = paramRect.centerY() - f2;
    float f5 = paramRect.centerX() + f2;
    float f6 = paramRect.centerY() + f2;
    localRectF.set(f1, f4, f5, f6);
    f6 = this.OooO0o0;
    f1 = this.OooO0oO;
    f6 += f1;
    f2 = 360.0F;
    f6 *= f2;
    float f7 = (this.OooO0o + f1) * f2 - f6;
    Object localObject = this.OooO0O0;
    int j = this.OooOo0;
    ((Paint)localObject).setColor(j);
    localObject = this.OooO0O0;
    j = this.OooOo00;
    ((Paint)localObject).setAlpha(j);
    f1 = this.OooO0oo / f3;
    localRectF.inset(f1, f1);
    f2 = localRectF.centerX();
    f4 = localRectF.centerY();
    f5 = localRectF.width() / f3;
    Paint localPaint1 = this.OooO0Oo;
    paramCanvas.drawCircle(f2, f4, f5, localPaint1);
    f1 = -f1;
    localRectF.inset(f1, f1);
    Paint localPaint2 = this.OooO0O0;
    localObject = paramCanvas;
    f3 = f6;
    f4 = f7;
    paramCanvas.drawArc(localRectF, f6, f7, false, localPaint2);
    OooO0O0(paramCanvas, f6, f7, localRectF);
  }
  
  public void OooO0O0(Canvas paramCanvas, float paramFloat1, float paramFloat2, RectF paramRectF)
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
      float f1 = paramRectF.width();
      float f2 = paramRectF.height();
      f1 = Math.min(f1, f2);
      f2 = 2.0F;
      f1 /= f2;
      int i = this.OooOOo;
      float f3 = i;
      float f4 = this.OooOOOo;
      f3 = f3 * f4 / f2;
      this.OooOOOO.moveTo(0.0F, 0.0F);
      Path localPath1 = this.OooOOOO;
      int j = this.OooOOo;
      float f5 = j;
      float f6 = this.OooOOOo;
      f5 *= f6;
      localPath1.lineTo(f5, 0.0F);
      localPath1 = this.OooOOOO;
      int k = this.OooOOo;
      float f7 = k;
      f5 = this.OooOOOo;
      f7 = f7 * f5 / f2;
      int m = this.OooOOoo;
      f6 = m * f5;
      localPath1.lineTo(f7, f6);
      localPath1 = this.OooOOOO;
      f7 = paramRectF.centerX();
      f1 = f1 + f7 - f3;
      f3 = paramRectF.centerY();
      f7 = this.OooO0oo / f2;
      f3 += f7;
      localPath1.offset(f1, f3);
      this.OooOOOO.close();
      localObject = this.OooO0OO;
      int n = this.OooOo0;
      ((Paint)localObject).setColor(n);
      localObject = this.OooO0OO;
      n = this.OooOo00;
      ((Paint)localObject).setAlpha(n);
      paramCanvas.save();
      paramFloat1 += paramFloat2;
      paramFloat2 = paramRectF.centerX();
      float f8 = paramRectF.centerY();
      paramCanvas.rotate(paramFloat1, paramFloat2, f8);
      Path localPath2 = this.OooOOOO;
      Paint localPaint = this.OooO0OO;
      paramCanvas.drawPath(localPath2, localPaint);
      paramCanvas.restore();
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
    setStartTrim(0.0F);
    setEndTrim(0.0F);
    setRotation(0.0F);
  }
  
  public void OooO0o()
  {
    float f = this.OooO0o0;
    this.OooOO0O = f;
    f = this.OooO0o;
    this.OooOO0o = f;
    f = this.OooO0oO;
    this.OooOOO0 = f;
  }
  
  public void OooO0o0(float paramFloat1, float paramFloat2)
  {
    int i = (int)paramFloat1;
    this.OooOOo = i;
    i = (int)paramFloat2;
    this.OooOOoo = i;
  }
  
  public int getAlpha()
  {
    return this.OooOo00;
  }
  
  public float getArrowHeight()
  {
    return this.OooOOoo;
  }
  
  public float getArrowScale()
  {
    return this.OooOOOo;
  }
  
  public float getArrowWidth()
  {
    return this.OooOOo;
  }
  
  public int getBackgroundColor()
  {
    return this.OooO0Oo.getColor();
  }
  
  public float getCenterRadius()
  {
    return this.OooOOo0;
  }
  
  public int[] getColors()
  {
    return this.OooO;
  }
  
  public float getEndTrim()
  {
    return this.OooO0o;
  }
  
  public int getNextColor()
  {
    int[] arrayOfInt = this.OooO;
    int i = getNextColorIndex();
    return arrayOfInt[i];
  }
  
  public int getNextColorIndex()
  {
    int i = this.OooOO0 + 1;
    int j = this.OooO.length;
    return i % j;
  }
  
  public float getRotation()
  {
    return this.OooO0oO;
  }
  
  public boolean getShowArrow()
  {
    return this.OooOOO;
  }
  
  public float getStartTrim()
  {
    return this.OooO0o0;
  }
  
  public int getStartingColor()
  {
    int[] arrayOfInt = this.OooO;
    int i = this.OooOO0;
    return arrayOfInt[i];
  }
  
  public float getStartingEndTrim()
  {
    return this.OooOO0o;
  }
  
  public float getStartingRotation()
  {
    return this.OooOOO0;
  }
  
  public float getStartingStartTrim()
  {
    return this.OooOO0O;
  }
  
  public Paint.Cap getStrokeCap()
  {
    return this.OooO0O0.getStrokeCap();
  }
  
  public float getStrokeWidth()
  {
    return this.OooO0oo;
  }
  
  public void setAlpha(int paramInt)
  {
    this.OooOo00 = paramInt;
  }
  
  public void setArrowScale(float paramFloat)
  {
    float f = this.OooOOOo;
    boolean bool = paramFloat < f;
    if (bool) {
      this.OooOOOo = paramFloat;
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    this.OooO0Oo.setColor(paramInt);
  }
  
  public void setCenterRadius(float paramFloat)
  {
    this.OooOOo0 = paramFloat;
  }
  
  public void setColor(int paramInt)
  {
    this.OooOo0 = paramInt;
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.OooO0O0.setColorFilter(paramColorFilter);
  }
  
  public void setColorIndex(int paramInt)
  {
    this.OooOO0 = paramInt;
    paramInt = this.OooO[paramInt];
    this.OooOo0 = paramInt;
  }
  
  public void setColors(int[] paramArrayOfInt)
  {
    this.OooO = paramArrayOfInt;
    setColorIndex(0);
  }
  
  public void setEndTrim(float paramFloat)
  {
    this.OooO0o = paramFloat;
  }
  
  public void setRotation(float paramFloat)
  {
    this.OooO0oO = paramFloat;
  }
  
  public void setShowArrow(boolean paramBoolean)
  {
    boolean bool = this.OooOOO;
    if (bool != paramBoolean) {
      this.OooOOO = paramBoolean;
    }
  }
  
  public void setStartTrim(float paramFloat)
  {
    this.OooO0o0 = paramFloat;
  }
  
  public void setStrokeCap(Paint.Cap paramCap)
  {
    this.OooO0O0.setStrokeCap(paramCap);
  }
  
  public void setStrokeWidth(float paramFloat)
  {
    this.OooO0oo = paramFloat;
    this.OooO0O0.setStrokeWidth(paramFloat);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring
 * JD-Core Version:    0.7.0.1
 */