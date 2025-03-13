package androidx.constraintlayout.utils.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.FloatLayout;

public class MotionLabel
  extends View
  implements FloatLayout
{
  public TextPaint o00OoOoo;
  public int o00Ooo0;
  public Path o00Ooo00;
  public int o00Ooo0O;
  public boolean o00Ooo0o;
  public float o00OooO;
  public float o00OooO0;
  public ViewOutlineProvider o00OooOO;
  public RectF o00OooOo;
  public float o00OoooO;
  public float o00Ooooo;
  public float o00o0;
  public int o00o00;
  public boolean o00o000;
  public String o00o0000;
  public Rect o00o000O;
  public int o00o000o;
  public int o00o00O0;
  public Layout o00o00Oo;
  public int o00o00o;
  public int o00o00o0;
  public boolean o00o00oO;
  public float o00o00oo;
  public Matrix o00o0O0;
  public float o00o0O00;
  public Bitmap o00o0O0O;
  public Matrix o00o0OO;
  public BitmapShader o00o0OO0;
  public float o00o0OOO;
  public float o00o0OOo;
  public float o00o0Oo;
  public float o00o0Oo0;
  public Paint o00o0OoO;
  public Rect o00o0Ooo;
  public float o00o0o;
  public Paint o00o0o00;
  public float o00o0o0O;
  public float o00o0o0o;
  public float o00o0oO;
  public float o00o0oO0;
  public float o0O00o0;
  public int oo00oO;
  
  private float getHorizontalOffset()
  {
    float f1 = this.o00OoooO;
    boolean bool1 = Float.isNaN(f1);
    int i = 1065353216;
    float f2 = 1.0F;
    if (bool1)
    {
      bool1 = i;
      f1 = f2;
    }
    else
    {
      f1 = this.o0O00o0;
      f3 = this.o00OoooO;
      f1 /= f3;
    }
    TextPaint localTextPaint = this.o00OoOoo;
    String str = this.o00o0000;
    int j = str.length();
    float f3 = localTextPaint.measureText(str, 0, j);
    f1 *= f3;
    f3 = this.o00o0;
    boolean bool2 = Float.isNaN(f3);
    if (bool2)
    {
      int k = getMeasuredWidth();
      f3 = k;
    }
    else
    {
      f3 = this.o00o0;
    }
    float f4 = getPaddingLeft();
    f3 -= f4;
    f4 = getPaddingRight();
    f3 = f3 - f4 - f1;
    f1 = this.o00o0Oo0 + f2;
    return f3 * f1 / 2.0F;
  }
  
  private float getVerticalOffset()
  {
    float f1 = this.o00OoooO;
    boolean bool1 = Float.isNaN(f1);
    int i = 1065353216;
    float f2 = 1.0F;
    if (bool1)
    {
      bool1 = i;
      f1 = f2;
    }
    else
    {
      f1 = this.o0O00o0;
      f3 = this.o00OoooO;
      f1 /= f3;
    }
    Paint.FontMetrics localFontMetrics = this.o00OoOoo.getFontMetrics();
    float f4 = this.o00o0O00;
    boolean bool2 = Float.isNaN(f4);
    if (bool2)
    {
      int j = getMeasuredHeight();
      f4 = j;
    }
    else
    {
      f4 = this.o00o0O00;
    }
    float f5 = getPaddingTop();
    f4 -= f5;
    f5 = getPaddingBottom();
    f4 -= f5;
    f5 = localFontMetrics.descent;
    float f3 = localFontMetrics.ascent;
    f5 = (f5 - f3) * f1;
    f4 -= f5;
    f5 = this.o00o0Oo;
    f2 -= f5;
    f4 = f4 * f2 / 2.0F;
    f1 *= f3;
    return f4 - f1;
  }
  
  public void OooO00o(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = 0.5F;
    float f2 = paramFloat1 + f1;
    int i = (int)f2;
    float f3 = i;
    f3 = paramFloat1 - f3;
    this.o00o00oo = f3;
    f3 = paramFloat3 + f1;
    int j = (int)f3;
    int k = j - i;
    float f4 = paramFloat4 + f1;
    int m = (int)f4;
    f1 += paramFloat2;
    int n = (int)f1;
    int i1 = m - n;
    float f5 = paramFloat3 - paramFloat1;
    this.o00o0 = f5;
    float f6 = paramFloat4 - paramFloat2;
    this.o00o0O00 = f6;
    OooO0Oo(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    int i2 = getMeasuredHeight();
    int i5;
    if (i2 == i1)
    {
      i2 = getMeasuredWidth();
      if (i2 == k) {}
    }
    else
    {
      i2 = 1073741824;
      paramFloat1 = 2.0F;
      i5 = View.MeasureSpec.makeMeasureSpec(k, i2);
      i2 = View.MeasureSpec.makeMeasureSpec(i1, i2);
      measure(i5, i2);
    }
    super.layout(i, n, j, m);
    boolean bool1 = this.o00o00oO;
    if (bool1)
    {
      Object localObject1 = this.o00o0Ooo;
      if (localObject1 == null)
      {
        localObject1 = new android/graphics/Paint;
        ((Paint)localObject1).<init>();
        this.o00o0o00 = ((Paint)localObject1);
        localObject1 = new android/graphics/Rect;
        ((Rect)localObject1).<init>();
        this.o00o0Ooo = ((Rect)localObject1);
        localObject1 = this.o00o0o00;
        localObject2 = this.o00OoOoo;
        ((Paint)localObject1).set((Paint)localObject2);
        localObject1 = this.o00o0o00;
        paramFloat1 = ((Paint)localObject1).getTextSize();
        this.o00o0o0O = paramFloat1;
      }
      this.o00o0 = f5;
      this.o00o0O00 = f6;
      localObject1 = this.o00o0o00;
      Object localObject2 = this.o00o0000;
      int i6 = ((String)localObject2).length();
      Rect localRect = this.o00o0Ooo;
      n = 0;
      f1 = 0.0F;
      ((Paint)localObject1).getTextBounds((String)localObject2, 0, i6, localRect);
      localObject1 = this.o00o0Ooo;
      int i3 = ((Rect)localObject1).width();
      localObject2 = this.o00o0Ooo;
      i5 = ((Rect)localObject2).height();
      paramFloat2 = i5 * 1.3F;
      paramFloat3 = this.oo00oO;
      f5 -= paramFloat3;
      paramFloat3 = this.o00o000o;
      f5 -= paramFloat3;
      paramFloat3 = this.o00o00O0;
      f6 -= paramFloat3;
      paramFloat3 = this.o00o00;
      f6 -= paramFloat3;
      paramFloat1 = i3;
      paramFloat3 = paramFloat1 * f6;
      paramFloat4 = paramFloat2 * f5;
      boolean bool3 = paramFloat3 < paramFloat4;
      if (bool3)
      {
        localObject2 = this.o00OoOoo;
        paramFloat3 = this.o00o0o0O * f5 / paramFloat1;
        ((Paint)localObject2).setTextSize(paramFloat3);
      }
      else
      {
        localObject1 = this.o00OoOoo;
        paramFloat3 = this.o00o0o0O * f6 / paramFloat2;
        ((Paint)localObject1).setTextSize(paramFloat3);
      }
      boolean bool2 = this.o00Ooo0o;
      if (!bool2)
      {
        paramFloat1 = this.o00OoooO;
        bool2 = Float.isNaN(paramFloat1);
        if (bool2) {}
      }
      else
      {
        paramFloat1 = this.o00OoooO;
        bool2 = Float.isNaN(paramFloat1);
        if (bool2)
        {
          int i4 = 1065353216;
          paramFloat1 = 1.0F;
        }
        else
        {
          paramFloat1 = this.o0O00o0;
          paramFloat2 = this.o00OoooO;
          paramFloat1 /= paramFloat2;
        }
        OooO0o0(paramFloat1);
      }
    }
  }
  
  public final void OooO0Oo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Matrix localMatrix = this.o00o0OO;
    if (localMatrix == null) {
      return;
    }
    paramFloat3 -= paramFloat1;
    this.o00o0 = paramFloat3;
    paramFloat4 -= paramFloat2;
    this.o00o0O00 = paramFloat4;
    OooO0o();
  }
  
  public final void OooO0o()
  {
    float f1 = this.o00o0o0o;
    boolean bool1 = Float.isNaN(f1);
    float f2 = 0.0F;
    Matrix localMatrix1 = null;
    if (bool1)
    {
      bool1 = false;
      localObject = null;
      f1 = 0.0F;
    }
    else
    {
      f1 = this.o00o0o0o;
    }
    float f3 = this.o00o0o;
    boolean bool2 = Float.isNaN(f3);
    if (bool2)
    {
      bool2 = false;
      f3 = 0.0F;
    }
    else
    {
      f3 = this.o00o0o;
    }
    float f4 = this.o00o0oO0;
    boolean bool3 = Float.isNaN(f4);
    if (bool3)
    {
      int i = 1065353216;
      f4 = 1.0F;
    }
    else
    {
      f4 = this.o00o0oO0;
    }
    float f5 = this.o00o0oO;
    boolean bool4 = Float.isNaN(f5);
    if (!bool4) {
      f2 = this.o00o0oO;
    }
    this.o00o0OO.reset();
    Bitmap localBitmap1 = this.o00o0O0O;
    int j = localBitmap1.getWidth();
    f5 = j;
    Bitmap localBitmap2 = this.o00o0O0O;
    int k = localBitmap2.getHeight();
    float f6 = k;
    float f7 = this.o00o0OOo;
    boolean bool5 = Float.isNaN(f7);
    if (bool5) {
      f7 = this.o00o0;
    } else {
      f7 = this.o00o0OOo;
    }
    float f8 = this.o00o0OOO;
    boolean bool6 = Float.isNaN(f8);
    if (bool6) {
      f8 = this.o00o0O00;
    } else {
      f8 = this.o00o0OOO;
    }
    float f9 = f5 * f8;
    float f10 = f6 * f7;
    boolean bool7 = f9 < f10;
    if (bool7) {
      f9 = f7 / f5;
    } else {
      f9 = f8 / f6;
    }
    f4 *= f9;
    Matrix localMatrix2 = this.o00o0OO;
    localMatrix2.postScale(f4, f4);
    f5 *= f4;
    f9 = f7 - f5;
    f4 *= f6;
    f6 = f8 - f4;
    f10 = this.o00o0OOO;
    boolean bool8 = Float.isNaN(f10);
    float f11 = 2.0F;
    if (!bool8) {
      f6 = this.o00o0OOO / f11;
    }
    f10 = this.o00o0OOo;
    bool8 = Float.isNaN(f10);
    if (!bool8) {
      f9 = this.o00o0OOo / f11;
    }
    f1 = f1 * f9 + f7 - f5;
    f5 = 0.5F;
    f1 *= f5;
    f3 = (f3 * f6 + f8 - f4) * f5;
    this.o00o0OO.postTranslate(f1, f3);
    Object localObject = this.o00o0OO;
    f7 /= f11;
    f8 /= f11;
    ((Matrix)localObject).postRotate(f2, f7, f8);
    localObject = this.o00o0OO0;
    localMatrix1 = this.o00o0OO;
    ((Shader)localObject).setLocalMatrix(localMatrix1);
  }
  
  public void OooO0o0(float paramFloat)
  {
    boolean bool = this.o00Ooo0o;
    float f1 = 1.0F;
    if (!bool)
    {
      bool = paramFloat < f1;
      if (!bool) {
        return;
      }
    }
    this.o00Ooo00.reset();
    String str1 = this.o00o0000;
    int j = str1.length();
    Object localObject1 = this.o00OoOoo;
    Object localObject2 = this.o00o000O;
    ((Paint)localObject1).getTextBounds(str1, 0, j, (Rect)localObject2);
    localObject2 = this.o00OoOoo;
    Path localPath = this.o00Ooo00;
    ((Paint)localObject2).getTextPath(str1, 0, j, 0.0F, 0.0F, localPath);
    bool = paramFloat < f1;
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      String str2 = Debug.getLoc();
      ((StringBuilder)localObject1).append(str2);
      str2 = " scale ";
      ((StringBuilder)localObject1).append(str2);
      ((StringBuilder)localObject1).append(paramFloat);
      localObject1 = new android/graphics/Matrix;
      ((Matrix)localObject1).<init>();
      ((Matrix)localObject1).postScale(paramFloat, paramFloat);
      localObject3 = this.o00Ooo00;
      ((Path)localObject3).transform((Matrix)localObject1);
    }
    Object localObject3 = this.o00o000O;
    int i = ((Rect)localObject3).right + -1;
    ((Rect)localObject3).right = i;
    i = ((Rect)localObject3).left + 1;
    ((Rect)localObject3).left = i;
    i = ((Rect)localObject3).bottom + 1;
    ((Rect)localObject3).bottom = i;
    i = ((Rect)localObject3).top + -1;
    ((Rect)localObject3).top = i;
    localObject3 = new android/graphics/RectF;
    ((RectF)localObject3).<init>();
    float f2 = getHeight();
    ((RectF)localObject3).bottom = f2;
    f2 = getWidth();
    ((RectF)localObject3).right = f2;
    this.o00o000 = false;
  }
  
  public float getRound()
  {
    return this.o00OooO;
  }
  
  public float getRoundPercent()
  {
    return this.o00OooO0;
  }
  
  public float getScaleFromTextSize()
  {
    return this.o00OoooO;
  }
  
  public float getTextBackgroundPanX()
  {
    return this.o00o0o0o;
  }
  
  public float getTextBackgroundPanY()
  {
    return this.o00o0o;
  }
  
  public float getTextBackgroundRotate()
  {
    return this.o00o0oO;
  }
  
  public float getTextBackgroundZoom()
  {
    return this.o00o0oO0;
  }
  
  public int getTextOutlineColor()
  {
    return this.o00Ooo0O;
  }
  
  public float getTextPanX()
  {
    return this.o00o0Oo0;
  }
  
  public float getTextPanY()
  {
    return this.o00o0Oo;
  }
  
  public float getTextureHeight()
  {
    return this.o00o0OOO;
  }
  
  public float getTextureWidth()
  {
    return this.o00o0OOo;
  }
  
  public Typeface getTypeface()
  {
    return this.o00OoOoo.getTypeface();
  }
  
  public void layout(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.layout(paramInt1, paramInt2, paramInt3, paramInt4);
    float f1 = this.o00OoooO;
    boolean bool1 = Float.isNaN(f1);
    float f2;
    if (bool1)
    {
      f2 = 1.0F;
    }
    else
    {
      f2 = this.o0O00o0;
      f3 = this.o00OoooO;
      f2 /= f3;
    }
    float f3 = paramInt3 - paramInt1;
    this.o00o0 = f3;
    f3 = paramInt4 - paramInt2;
    this.o00o0O00 = f3;
    boolean bool2 = this.o00o00oO;
    if (bool2)
    {
      Object localObject1 = this.o00o0Ooo;
      if (localObject1 == null)
      {
        localObject1 = new android/graphics/Paint;
        ((Paint)localObject1).<init>();
        this.o00o0o00 = ((Paint)localObject1);
        localObject1 = new android/graphics/Rect;
        ((Rect)localObject1).<init>();
        this.o00o0Ooo = ((Rect)localObject1);
        localObject1 = this.o00o0o00;
        localObject2 = this.o00OoOoo;
        ((Paint)localObject1).set((Paint)localObject2);
        localObject1 = this.o00o0o00;
        f3 = ((Paint)localObject1).getTextSize();
        this.o00o0o0O = f3;
      }
      localObject1 = this.o00o0o00;
      Object localObject2 = this.o00o0000;
      int j = ((String)localObject2).length();
      Rect localRect = this.o00o0Ooo;
      ((Paint)localObject1).getTextBounds((String)localObject2, 0, j, localRect);
      localObject1 = this.o00o0Ooo;
      int i = ((Rect)localObject1).width();
      localObject2 = this.o00o0Ooo;
      float f4 = ((Rect)localObject2).height();
      j = 1067869798;
      f4 *= 1.3F;
      int k = (int)f4;
      float f5 = this.o00o0;
      float f6 = this.oo00oO;
      f5 -= f6;
      int m = this.o00o000o;
      f6 = m;
      f5 -= f6;
      f6 = this.o00o0O00;
      float f7 = this.o00o00O0;
      f6 -= f7;
      int n = this.o00o00;
      f7 = n;
      f6 -= f7;
      if (bool1)
      {
        f3 = i;
        f7 = f3 * f6;
        f4 = k;
        float f8 = f4 * f5;
        boolean bool4 = f7 < f8;
        if (bool4)
        {
          localObject2 = this.o00OoOoo;
          f6 = this.o00o0o0O * f5 / f3;
          ((Paint)localObject2).setTextSize(f6);
        }
        else
        {
          localObject1 = this.o00OoOoo;
          f5 = this.o00o0o0O * f6 / f4;
          ((Paint)localObject1).setTextSize(f5);
        }
      }
      else
      {
        f2 = i;
        f3 = f2 * f6;
        f4 = k;
        f7 = f4 * f5;
        bool3 = f3 < f7;
        if (bool3)
        {
          f5 /= f2;
          f2 = f5;
        }
        else
        {
          f6 /= f4;
          f2 = f6;
        }
      }
    }
    boolean bool3 = this.o00Ooo0o;
    if ((bool3) || (!bool1))
    {
      float f9 = paramInt1;
      float f10 = paramInt2;
      float f11 = paramInt3;
      float f12 = paramInt4;
      OooO0Oo(f9, f10, f11, f12);
      OooO0o0(f2);
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    float f1 = this.o00OoooO;
    boolean bool1 = Float.isNaN(f1);
    int j = 1065353216;
    float f2 = 1.0F;
    float f3;
    if (bool1)
    {
      bool1 = j;
      f1 = f2;
    }
    else
    {
      f1 = this.o0O00o0;
      f3 = this.o00OoooO;
      f1 /= f3;
    }
    super.onDraw(paramCanvas);
    boolean bool3 = this.o00Ooo0o;
    Object localObject1;
    float f4;
    Object localObject2;
    if (!bool3)
    {
      bool2 = f1 < f2;
      if (!bool2)
      {
        f1 = this.o00o000o;
        f2 = getHorizontalOffset();
        f1 += f2;
        f2 = this.o00o00;
        f3 = getVerticalOffset();
        f2 += f3;
        localObject1 = this.o00o0000;
        f4 = this.o00o00oo + f1;
        localObject2 = this.o00OoOoo;
        paramCanvas.drawText((String)localObject1, f4, f2, (Paint)localObject2);
        return;
      }
    }
    boolean bool2 = this.o00o000;
    if (bool2) {
      OooO0o0(f1);
    }
    Object localObject3 = this.o00o0O0;
    if (localObject3 == null)
    {
      localObject3 = new android/graphics/Matrix;
      ((Matrix)localObject3).<init>();
      this.o00o0O0 = ((Matrix)localObject3);
    }
    bool2 = this.o00Ooo0o;
    int k;
    Object localObject4;
    int n;
    if (bool2)
    {
      localObject3 = this.o00o0OoO;
      localObject1 = this.o00OoOoo;
      ((Paint)localObject3).set((Paint)localObject1);
      localObject3 = this.o00o0O0;
      ((Matrix)localObject3).reset();
      k = this.o00o000o;
      f2 = k;
      f3 = getHorizontalOffset();
      f2 += f3;
      int m = this.o00o00;
      f3 = m;
      f4 = getVerticalOffset();
      f3 += f4;
      this.o00o0O0.postTranslate(f2, f3);
      this.o00o0O0.preScale(f1, f1);
      localObject2 = this.o00Ooo00;
      localObject4 = this.o00o0O0;
      ((Path)localObject2).transform((Matrix)localObject4);
      localObject2 = this.o00o0OO0;
      if (localObject2 != null)
      {
        localObject2 = this.o00OoOoo;
        boolean bool4 = true;
        f4 = 1.4E-45F;
        ((Paint)localObject2).setFilterBitmap(bool4);
        localObject2 = this.o00OoOoo;
        localObject4 = this.o00o0OO0;
        ((Paint)localObject2).setShader((Shader)localObject4);
      }
      else
      {
        localObject2 = this.o00OoOoo;
        n = this.o00Ooo0;
        ((Paint)localObject2).setColor(n);
      }
      localObject2 = this.o00OoOoo;
      localObject4 = Paint.Style.FILL;
      ((Paint)localObject2).setStyle((Paint.Style)localObject4);
      localObject2 = this.o00OoOoo;
      f4 = this.o00Ooooo;
      ((Paint)localObject2).setStrokeWidth(f4);
      localObject2 = this.o00Ooo00;
      localObject4 = this.o00OoOoo;
      paramCanvas.drawPath((Path)localObject2, (Paint)localObject4);
      localObject2 = this.o00o0OO0;
      if (localObject2 != null)
      {
        localObject2 = this.o00OoOoo;
        n = 0;
        f4 = 0.0F;
        localObject4 = null;
        ((Paint)localObject2).setShader(null);
      }
      localObject2 = this.o00OoOoo;
      n = this.o00Ooo0O;
      ((Paint)localObject2).setColor(n);
      localObject2 = this.o00OoOoo;
      localObject4 = Paint.Style.STROKE;
      ((Paint)localObject2).setStyle((Paint.Style)localObject4);
      localObject2 = this.o00OoOoo;
      f4 = this.o00Ooooo;
      ((Paint)localObject2).setStrokeWidth(f4);
      localObject2 = this.o00Ooo00;
      localObject4 = this.o00OoOoo;
      paramCanvas.drawPath((Path)localObject2, (Paint)localObject4);
      this.o00o0O0.reset();
      paramCanvas = this.o00o0O0;
      f1 = -f2;
      f2 = -f3;
      paramCanvas.postTranslate(f1, f2);
      paramCanvas = this.o00Ooo00;
      localObject2 = this.o00o0O0;
      paramCanvas.transform((Matrix)localObject2);
      paramCanvas = this.o00OoOoo;
      localObject2 = this.o00o0OoO;
      paramCanvas.set((Paint)localObject2);
    }
    else
    {
      int i = this.o00o000o;
      f1 = i;
      f2 = getHorizontalOffset();
      f1 += f2;
      k = this.o00o00;
      f2 = k;
      f3 = getVerticalOffset();
      f2 += f3;
      this.o00o0O0.reset();
      this.o00o0O0.preTranslate(f1, f2);
      localObject1 = this.o00Ooo00;
      localObject4 = this.o00o0O0;
      ((Path)localObject1).transform((Matrix)localObject4);
      localObject1 = this.o00OoOoo;
      n = this.o00Ooo0;
      ((Paint)localObject1).setColor(n);
      localObject1 = this.o00OoOoo;
      localObject4 = Paint.Style.FILL_AND_STROKE;
      ((Paint)localObject1).setStyle((Paint.Style)localObject4);
      localObject1 = this.o00OoOoo;
      f4 = this.o00Ooooo;
      ((Paint)localObject1).setStrokeWidth(f4);
      localObject1 = this.o00Ooo00;
      localObject4 = this.o00OoOoo;
      paramCanvas.drawPath((Path)localObject1, (Paint)localObject4);
      this.o00o0O0.reset();
      paramCanvas = this.o00o0O0;
      f1 = -f1;
      f2 = -f2;
      paramCanvas.preTranslate(f1, f2);
      paramCanvas = this.o00Ooo00;
      localObject2 = this.o00o0O0;
      paramCanvas.transform((Matrix)localObject2);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    int k = 0;
    float f1 = 0.0F;
    this.o00o00oO = false;
    int m = getPaddingLeft();
    this.o00o000o = m;
    m = getPaddingRight();
    this.oo00oO = m;
    m = getPaddingTop();
    this.o00o00 = m;
    m = getPaddingBottom();
    this.o00o00O0 = m;
    m = 1073741824;
    float f2;
    if ((i == m) && (j == m))
    {
      i = this.o00o00o;
      if (i != 0)
      {
        i = 1;
        f2 = 1.4E-45F;
        this.o00o00oO = i;
      }
    }
    else
    {
      TextPaint localTextPaint1 = this.o00OoOoo;
      String str = this.o00o0000;
      int n = str.length();
      Rect localRect1 = this.o00o000O;
      localTextPaint1.getTextBounds(str, 0, n, localRect1);
      k = 1065353048;
      f1 = 0.99999F;
      if (i != m)
      {
        Rect localRect2 = this.o00o000O;
        float f3 = localRect2.width() + f1;
        paramInt1 = (int)f3;
      }
      i = this.o00o000o;
      int i1 = this.oo00oO;
      i += i1;
      paramInt1 += i;
      if (j != m)
      {
        TextPaint localTextPaint2 = this.o00OoOoo;
        m = 0;
        f2 = localTextPaint2.getFontMetricsInt(null) + f1;
        i = (int)f2;
        k = -1 << -1;
        f1 = -0.0F;
        if (j == k) {
          i = Math.min(paramInt2, i);
        }
        paramInt2 = this.o00o00;
        j = this.o00o00O0;
        paramInt2 = paramInt2 + j + i;
      }
    }
    setMeasuredDimension(paramInt1, paramInt2);
  }
  
  public void setGravity(int paramInt)
  {
    int i = 8388615;
    int j = paramInt & i;
    int k = 8388611;
    if (j == 0) {
      paramInt |= k;
    }
    j = paramInt & 0x70;
    if (j == 0) {
      paramInt |= 0x30;
    }
    j = this.o00o00o0;
    if (paramInt != j) {
      invalidate();
    }
    this.o00o00o0 = paramInt;
    j = paramInt & 0x70;
    float f1 = 1.0F;
    float f2 = -1.0F;
    int m = 48;
    if (j != m)
    {
      m = 80;
      if (j != m) {
        this.o00o0Oo = 0.0F;
      } else {
        this.o00o0Oo = f1;
      }
    }
    else
    {
      this.o00o0Oo = f2;
    }
    paramInt &= i;
    i = 3;
    if (paramInt != i)
    {
      i = 5;
      if (paramInt != i)
      {
        if (paramInt == k) {
          break label162;
        }
        i = 8388613;
        if (paramInt != i)
        {
          this.o00o0Oo0 = 0.0F;
          return;
        }
      }
      this.o00o0Oo0 = f1;
      return;
    }
    label162:
    this.o00o0Oo0 = f2;
  }
  
  public void setRound(float paramFloat)
  {
    boolean bool1 = Float.isNaN(paramFloat);
    if (bool1)
    {
      this.o00OooO = paramFloat;
      paramFloat = this.o00OooO0;
      this.o00OooO0 = -1.0F;
      setRoundPercent(paramFloat);
      return;
    }
    float f1 = this.o00OooO;
    bool1 = f1 < paramFloat;
    boolean bool2 = true;
    float f2 = 1.4E-45F;
    float f3 = 0.0F;
    RectF localRectF1 = null;
    if (bool1)
    {
      bool1 = bool2;
      f1 = f2;
    }
    else
    {
      bool1 = false;
      f1 = 0.0F;
    }
    this.o00OooO = paramFloat;
    Path.Direction localDirection = null;
    boolean bool3 = paramFloat < 0.0F;
    if (bool3)
    {
      Object localObject = this.o00Ooo00;
      if (localObject == null)
      {
        localObject = new android/graphics/Path;
        ((Path)localObject).<init>();
        this.o00Ooo00 = ((Path)localObject);
      }
      localObject = this.o00OooOo;
      if (localObject == null)
      {
        localObject = new android/graphics/RectF;
        ((RectF)localObject).<init>();
        this.o00OooOo = ((RectF)localObject);
      }
      localObject = this.o00OooOO;
      if (localObject == null)
      {
        localObject = new androidx/constraintlayout/utils/widget/MotionLabel$2;
        ((MotionLabel.2)localObject).<init>(this);
        this.o00OooOO = ((ViewOutlineProvider)localObject);
        setOutlineProvider((ViewOutlineProvider)localObject);
      }
      setClipToOutline(bool2);
      int j = getWidth();
      int i = getHeight();
      localRectF1 = this.o00OooOo;
      paramFloat = j;
      f2 = i;
      localRectF1.set(0.0F, 0.0F, paramFloat, f2);
      this.o00Ooo00.reset();
      localObject = this.o00Ooo00;
      RectF localRectF2 = this.o00OooOo;
      f3 = this.o00OooO;
      localDirection = Path.Direction.CW;
      ((Path)localObject).addRoundRect(localRectF2, f3, f3, localDirection);
    }
    else
    {
      setClipToOutline(false);
    }
    if (bool1) {
      invalidateOutline();
    }
  }
  
  public void setRoundPercent(float paramFloat)
  {
    float f1 = this.o00OooO0;
    boolean bool1 = f1 < paramFloat;
    boolean bool2 = true;
    float f2 = 1.4E-45F;
    int j = 0;
    float f3 = 0.0F;
    if (bool1)
    {
      bool1 = bool2;
      f1 = f2;
    }
    else
    {
      bool1 = false;
      f1 = 0.0F;
    }
    this.o00OooO0 = paramFloat;
    Path.Direction localDirection = null;
    boolean bool3 = paramFloat < 0.0F;
    if (bool3)
    {
      Object localObject = this.o00Ooo00;
      if (localObject == null)
      {
        localObject = new android/graphics/Path;
        ((Path)localObject).<init>();
        this.o00Ooo00 = ((Path)localObject);
      }
      localObject = this.o00OooOo;
      if (localObject == null)
      {
        localObject = new android/graphics/RectF;
        ((RectF)localObject).<init>();
        this.o00OooOo = ((RectF)localObject);
      }
      localObject = this.o00OooOO;
      if (localObject == null)
      {
        localObject = new androidx/constraintlayout/utils/widget/MotionLabel$1;
        ((MotionLabel.1)localObject).<init>(this);
        this.o00OooOO = ((ViewOutlineProvider)localObject);
        setOutlineProvider((ViewOutlineProvider)localObject);
      }
      setClipToOutline(bool2);
      int k = getWidth();
      int i = getHeight();
      j = Math.min(k, i);
      f3 = j;
      float f4 = this.o00OooO0;
      f3 *= f4;
      f4 = 2.0F;
      f3 /= f4;
      RectF localRectF1 = this.o00OooOo;
      paramFloat = k;
      f2 = i;
      localRectF1.set(0.0F, 0.0F, paramFloat, f2);
      this.o00Ooo00.reset();
      localObject = this.o00Ooo00;
      RectF localRectF2 = this.o00OooOo;
      localDirection = Path.Direction.CW;
      ((Path)localObject).addRoundRect(localRectF2, f3, f3, localDirection);
    }
    else
    {
      setClipToOutline(false);
    }
    if (bool1) {
      invalidateOutline();
    }
  }
  
  public void setScaleFromTextSize(float paramFloat)
  {
    this.o00OoooO = paramFloat;
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    paramCharSequence = paramCharSequence.toString();
    this.o00o0000 = paramCharSequence;
    invalidate();
  }
  
  public void setTextBackgroundPanX(float paramFloat)
  {
    this.o00o0o0o = paramFloat;
    OooO0o();
    invalidate();
  }
  
  public void setTextBackgroundPanY(float paramFloat)
  {
    this.o00o0o = paramFloat;
    OooO0o();
    invalidate();
  }
  
  public void setTextBackgroundRotate(float paramFloat)
  {
    this.o00o0oO = paramFloat;
    OooO0o();
    invalidate();
  }
  
  public void setTextBackgroundZoom(float paramFloat)
  {
    this.o00o0oO0 = paramFloat;
    OooO0o();
    invalidate();
  }
  
  public void setTextFillColor(int paramInt)
  {
    this.o00Ooo0 = paramInt;
    invalidate();
  }
  
  public void setTextOutlineColor(int paramInt)
  {
    this.o00Ooo0O = paramInt;
    this.o00Ooo0o = true;
    invalidate();
  }
  
  public void setTextOutlineThickness(float paramFloat)
  {
    this.o00Ooooo = paramFloat;
    boolean bool1 = true;
    this.o00Ooo0o = bool1;
    boolean bool2 = Float.isNaN(paramFloat);
    if (bool2)
    {
      this.o00Ooooo = 1.0F;
      bool2 = false;
      paramFloat = 0.0F;
      this.o00Ooo0o = false;
    }
    invalidate();
  }
  
  public void setTextPanX(float paramFloat)
  {
    this.o00o0Oo0 = paramFloat;
    invalidate();
  }
  
  public void setTextPanY(float paramFloat)
  {
    this.o00o0Oo = paramFloat;
    invalidate();
  }
  
  public void setTextSize(float paramFloat)
  {
    this.o0O00o0 = paramFloat;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = Debug.getLoc();
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append("  ");
    ((StringBuilder)localObject).append(paramFloat);
    str = " / ";
    ((StringBuilder)localObject).append(str);
    float f1 = this.o00OoooO;
    ((StringBuilder)localObject).append(f1);
    localObject = this.o00OoOoo;
    f1 = this.o00OoooO;
    boolean bool1 = Float.isNaN(f1);
    if (!bool1) {
      paramFloat = this.o00OoooO;
    }
    ((Paint)localObject).setTextSize(paramFloat);
    paramFloat = this.o00OoooO;
    boolean bool2 = Float.isNaN(paramFloat);
    if (bool2)
    {
      int i = 1065353216;
      paramFloat = 1.0F;
    }
    else
    {
      paramFloat = this.o0O00o0;
      float f2 = this.o00OoooO;
      paramFloat /= f2;
    }
    OooO0o0(paramFloat);
    requestLayout();
    invalidate();
  }
  
  public void setTextureHeight(float paramFloat)
  {
    this.o00o0OOO = paramFloat;
    OooO0o();
    invalidate();
  }
  
  public void setTextureWidth(float paramFloat)
  {
    this.o00o0OOo = paramFloat;
    OooO0o();
    invalidate();
  }
  
  public void setTypeface(Typeface paramTypeface)
  {
    Object localObject = this.o00OoOoo.getTypeface();
    if (localObject != paramTypeface)
    {
      localObject = this.o00OoOoo;
      ((Paint)localObject).setTypeface(paramTypeface);
      paramTypeface = this.o00o00Oo;
      if (paramTypeface != null)
      {
        paramTypeface = null;
        this.o00o00Oo = null;
        requestLayout();
        invalidate();
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.utils.widget.MotionLabel
 * JD-Core Version:    0.7.0.1
 */