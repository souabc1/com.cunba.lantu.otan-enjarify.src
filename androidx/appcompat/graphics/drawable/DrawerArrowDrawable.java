package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.style;
import androidx.appcompat.R.styleable;
import androidx.core.graphics.drawable.DrawableCompat;

public class DrawerArrowDrawable
  extends Drawable
{
  public static final float OooOOO0 = (float)Math.toRadians(45.0D);
  public boolean OooO;
  public final Paint OooO00o;
  public float OooO0O0;
  public float OooO0OO;
  public float OooO0Oo;
  public boolean OooO0o;
  public float OooO0o0;
  public final Path OooO0oO;
  public final int OooO0oo;
  public float OooOO0;
  public float OooOO0O;
  public int OooOO0o;
  
  public DrawerArrowDrawable(Context paramContext)
  {
    Object localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>();
    this.OooO00o = ((Paint)localObject1);
    Path localPath = new android/graphics/Path;
    localPath.<init>();
    this.OooO0oO = localPath;
    this.OooO = false;
    this.OooOO0o = 2;
    Object localObject2 = Paint.Style.STROKE;
    ((Paint)localObject1).setStyle((Paint.Style)localObject2);
    localObject2 = Paint.Join.MITER;
    ((Paint)localObject1).setStrokeJoin((Paint.Join)localObject2);
    localObject2 = Paint.Cap.BUTT;
    ((Paint)localObject1).setStrokeCap((Paint.Cap)localObject2);
    boolean bool1 = true;
    ((Paint)localObject1).setAntiAlias(bool1);
    paramContext = paramContext.getTheme();
    localObject1 = R.styleable.DrawerArrowToggle;
    int i = R.attr.drawerArrowStyle;
    int j = R.style.Base_Widget_AppCompat_DrawerArrowToggle;
    paramContext = paramContext.obtainStyledAttributes(null, (int[])localObject1, i, j);
    int k = R.styleable.DrawerArrowToggle_color;
    k = paramContext.getColor(k, 0);
    setColor(k);
    k = R.styleable.DrawerArrowToggle_thickness;
    float f = paramContext.getDimension(k, 0.0F);
    setBarThickness(f);
    k = R.styleable.DrawerArrowToggle_spinBars;
    boolean bool2 = paramContext.getBoolean(k, bool1);
    setSpinEnabled(bool2);
    int m = R.styleable.DrawerArrowToggle_gapBetweenBars;
    f = Math.round(paramContext.getDimension(m, 0.0F));
    setGapSize(f);
    m = R.styleable.DrawerArrowToggle_drawableSize;
    m = paramContext.getDimensionPixelSize(m, 0);
    this.OooO0oo = m;
    m = R.styleable.DrawerArrowToggle_barLength;
    f = Math.round(paramContext.getDimension(m, 0.0F));
    this.OooO0OO = f;
    m = R.styleable.DrawerArrowToggle_arrowHeadLength;
    f = Math.round(paramContext.getDimension(m, 0.0F));
    this.OooO0O0 = f;
    m = R.styleable.DrawerArrowToggle_arrowShaftLength;
    f = paramContext.getDimension(m, 0.0F);
    this.OooO0Oo = f;
    paramContext.recycle();
  }
  
  public static float OooO00o(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramFloat2 = (paramFloat2 - paramFloat1) * paramFloat3;
    return paramFloat1 + paramFloat2;
  }
  
  public void draw(Canvas paramCanvas)
  {
    DrawerArrowDrawable localDrawerArrowDrawable = this;
    Canvas localCanvas = paramCanvas;
    Object localObject = getBounds();
    int i = this.OooOO0o;
    int j = 0;
    float f1 = 0.0F;
    int k = 1;
    float f2 = 1.4E-45F;
    if (i != 0)
    {
      if (i != k)
      {
        m = 3;
        f3 = 4.203895E-045F;
        if (i != m)
        {
          i = DrawableCompat.OooO0o(this);
          if (i != k) {
            break label90;
          }
        }
        else
        {
          i = DrawableCompat.OooO0o(this);
          if (i != 0) {
            break label90;
          }
        }
      }
      j = k;
      f1 = f2;
    }
    label90:
    float f4 = localDrawerArrowDrawable.OooO0O0;
    f4 *= f4;
    int m = 1073741824;
    float f3 = 2.0F;
    double d1 = Math.sqrt(f4 * f3);
    f4 = (float)d1;
    float f5 = localDrawerArrowDrawable.OooO0OO;
    float f6 = localDrawerArrowDrawable.OooOO0;
    f4 = OooO00o(f5, f4, f6);
    f5 = localDrawerArrowDrawable.OooO0OO;
    f6 = localDrawerArrowDrawable.OooO0Oo;
    float f7 = localDrawerArrowDrawable.OooOO0;
    f5 = OooO00o(f5, f6, f7);
    f6 = localDrawerArrowDrawable.OooOO0O;
    f7 = localDrawerArrowDrawable.OooOO0;
    float f8 = 0.0F;
    Path localPath1 = null;
    int n = Math.round(OooO00o(0.0F, f6, f7));
    f6 = n;
    f7 = OooOOO0;
    float f9 = localDrawerArrowDrawable.OooOO0;
    f7 = OooO00o(0.0F, f7, f9);
    if (j != 0)
    {
      localPaint1 = null;
      f9 = 0.0F;
    }
    else
    {
      f9 = -180.0F;
    }
    float f10 = 180.0F;
    if (j != 0)
    {
      f11 = f10;
    }
    else
    {
      localPath2 = null;
      f11 = 0.0F;
    }
    float f12 = localDrawerArrowDrawable.OooOO0;
    f9 = OooO00o(f9, f11, f12);
    double d2 = f4;
    float f13 = f9;
    double d3 = f7;
    double d4 = Math.cos(d3) * d2;
    int i1 = j;
    f7 = f1;
    long l1 = Math.round(d4);
    f4 = (float)l1;
    d3 = Math.sin(d3);
    d2 *= d3;
    long l2 = Math.round(d2);
    f1 = (float)l2;
    localPath1 = localDrawerArrowDrawable.OooO0oO;
    localPath1.rewind();
    f8 = localDrawerArrowDrawable.OooO0o0;
    Paint localPaint1 = localDrawerArrowDrawable.OooO00o;
    f9 = localPaint1.getStrokeWidth();
    f8 += f9;
    f9 = -localDrawerArrowDrawable.OooOO0O;
    float f11 = localDrawerArrowDrawable.OooOO0;
    f8 = OooO00o(f8, f9, f11);
    f9 = -f5 / f3;
    Path localPath2 = localDrawerArrowDrawable.OooO0oO;
    f12 = f9 + f6;
    localPath2.moveTo(f12, 0.0F);
    localPath2 = localDrawerArrowDrawable.OooO0oO;
    f6 *= f3;
    f5 -= f6;
    localPath2.rLineTo(f5, 0.0F);
    localDrawerArrowDrawable.OooO0oO.moveTo(f9, f8);
    localDrawerArrowDrawable.OooO0oO.rLineTo(f4, f1);
    Path localPath3 = localDrawerArrowDrawable.OooO0oO;
    f5 = -f8;
    localPath3.moveTo(f9, f5);
    localPath3 = localDrawerArrowDrawable.OooO0oO;
    f1 = -f1;
    localPath3.rLineTo(f4, f1);
    localDrawerArrowDrawable.OooO0oO.close();
    paramCanvas.save();
    Paint localPaint2 = localDrawerArrowDrawable.OooO00o;
    f4 = localPaint2.getStrokeWidth();
    f1 = ((Rect)localObject).height();
    k = 1077936128;
    f2 = 3.0F * f4;
    f1 -= f2;
    f2 = localDrawerArrowDrawable.OooO0o0;
    f3 *= f2;
    j = (int)(f1 - f3) / 4 * 2;
    f1 = j;
    m = 1069547520;
    f3 = 1.5F;
    f4 = f4 * f3 + f2;
    f1 += f4;
    float f14 = ((Rect)localObject).centerX();
    localCanvas.translate(f14, f1);
    boolean bool = localDrawerArrowDrawable.OooO0o;
    if (bool)
    {
      bool = localDrawerArrowDrawable.OooO ^ i1;
      if (bool)
      {
        k = -1;
        f2 = 0.0F / 0.0F;
      }
      else
      {
        k = 1;
        f2 = 1.4E-45F;
      }
      f14 = k;
      f9 = f13 * f14;
      localCanvas.rotate(f9);
    }
    else if (i1 != 0)
    {
      localCanvas.rotate(f10);
    }
    localObject = localDrawerArrowDrawable.OooO0oO;
    localPaint2 = localDrawerArrowDrawable.OooO00o;
    localCanvas.drawPath((Path)localObject, localPaint2);
    paramCanvas.restore();
  }
  
  public float getArrowHeadLength()
  {
    return this.OooO0O0;
  }
  
  public float getArrowShaftLength()
  {
    return this.OooO0Oo;
  }
  
  public float getBarLength()
  {
    return this.OooO0OO;
  }
  
  public float getBarThickness()
  {
    return this.OooO00o.getStrokeWidth();
  }
  
  public int getColor()
  {
    return this.OooO00o.getColor();
  }
  
  public int getDirection()
  {
    return this.OooOO0o;
  }
  
  public float getGapSize()
  {
    return this.OooO0o0;
  }
  
  public int getIntrinsicHeight()
  {
    return this.OooO0oo;
  }
  
  public int getIntrinsicWidth()
  {
    return this.OooO0oo;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public final Paint getPaint()
  {
    return this.OooO00o;
  }
  
  public float getProgress()
  {
    return this.OooOO0;
  }
  
  public boolean isSpinEnabled()
  {
    return this.OooO0o;
  }
  
  public void setAlpha(int paramInt)
  {
    Paint localPaint = this.OooO00o;
    int i = localPaint.getAlpha();
    if (paramInt != i)
    {
      localPaint = this.OooO00o;
      localPaint.setAlpha(paramInt);
      invalidateSelf();
    }
  }
  
  public void setArrowHeadLength(float paramFloat)
  {
    float f = this.OooO0O0;
    boolean bool = f < paramFloat;
    if (bool)
    {
      this.OooO0O0 = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setArrowShaftLength(float paramFloat)
  {
    float f = this.OooO0Oo;
    boolean bool = f < paramFloat;
    if (bool)
    {
      this.OooO0Oo = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setBarLength(float paramFloat)
  {
    float f = this.OooO0OO;
    boolean bool = f < paramFloat;
    if (bool)
    {
      this.OooO0OO = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setBarThickness(float paramFloat)
  {
    Paint localPaint = this.OooO00o;
    float f = localPaint.getStrokeWidth();
    boolean bool = f < paramFloat;
    if (bool)
    {
      localPaint = this.OooO00o;
      localPaint.setStrokeWidth(paramFloat);
      int i = 1073741824;
      f = 2.0F;
      double d1 = paramFloat / f;
      double d2 = Math.cos(OooOOO0);
      d1 *= d2;
      paramFloat = (float)d1;
      this.OooOO0O = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setColor(int paramInt)
  {
    Paint localPaint = this.OooO00o;
    int i = localPaint.getColor();
    if (paramInt != i)
    {
      localPaint = this.OooO00o;
      localPaint.setColor(paramInt);
      invalidateSelf();
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.OooO00o.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setDirection(int paramInt)
  {
    int i = this.OooOO0o;
    if (paramInt != i)
    {
      this.OooOO0o = paramInt;
      invalidateSelf();
    }
  }
  
  public void setGapSize(float paramFloat)
  {
    float f = this.OooO0o0;
    boolean bool = paramFloat < f;
    if (bool)
    {
      this.OooO0o0 = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setProgress(float paramFloat)
  {
    float f = this.OooOO0;
    boolean bool = f < paramFloat;
    if (bool)
    {
      this.OooOO0 = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setSpinEnabled(boolean paramBoolean)
  {
    boolean bool = this.OooO0o;
    if (bool != paramBoolean)
    {
      this.OooO0o = paramBoolean;
      invalidateSelf();
    }
  }
  
  public void setVerticalMirror(boolean paramBoolean)
  {
    boolean bool = this.OooO;
    if (bool != paramBoolean)
    {
      this.OooO = paramBoolean;
      invalidateSelf();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.graphics.drawable.DrawerArrowDrawable
 * JD-Core Version:    0.7.0.1
 */