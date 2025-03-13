package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import androidx.cardview.R.color;
import androidx.cardview.R.dimen;

class RoundRectDrawableWithShadow
  extends Drawable
{
  public static RoundRectDrawableWithShadow.RoundRectHelper OooOOo;
  public static final double OooOOo0 = Math.cos(Math.toRadians(45.0D));
  public float OooO;
  public final int OooO00o;
  public Paint OooO0O0;
  public Paint OooO0OO;
  public Paint OooO0Oo;
  public float OooO0o;
  public final RectF OooO0o0;
  public Path OooO0oO;
  public float OooO0oo;
  public float OooOO0;
  public ColorStateList OooOO0O;
  public boolean OooOO0o;
  public final int OooOOO;
  public final int OooOOO0;
  public boolean OooOOOO;
  public boolean OooOOOo;
  
  public RoundRectDrawableWithShadow(Resources paramResources, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool = true;
    this.OooOO0o = bool;
    this.OooOOOO = bool;
    this.OooOOOo = false;
    int i = R.color.cardview_shadow_start_color;
    i = paramResources.getColor(i);
    this.OooOOO0 = i;
    i = R.color.cardview_shadow_end_color;
    i = paramResources.getColor(i);
    this.OooOOO = i;
    i = R.dimen.cardview_compat_inset_shadow;
    int j = paramResources.getDimensionPixelSize(i);
    this.OooO00o = j;
    paramResources = new android/graphics/Paint;
    i = 5;
    paramResources.<init>(i);
    this.OooO0O0 = paramResources;
    setBackground(paramColorStateList);
    paramResources = new android/graphics/Paint;
    paramResources.<init>(i);
    this.OooO0OO = paramResources;
    paramColorStateList = Paint.Style.FILL;
    paramResources.setStyle(paramColorStateList);
    float f = (int)(paramFloat1 + 0.5F);
    this.OooO0o = f;
    paramResources = new android/graphics/RectF;
    paramResources.<init>();
    this.OooO0o0 = paramResources;
    paramResources = new android/graphics/Paint;
    paramColorStateList = this.OooO0OO;
    paramResources.<init>(paramColorStateList);
    this.OooO0Oo = paramResources;
    paramResources.setAntiAlias(false);
    OooO0oO(paramFloat2, paramFloat3);
  }
  
  public static float OooO0OO(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      double d1 = paramFloat1;
      double d2 = OooOOo0;
      double d3 = 1.0D - d2;
      double d4 = paramFloat2;
      d3 *= d4;
      d1 += d3;
      paramFloat1 = (float)d1;
    }
    return paramFloat1;
  }
  
  public static float OooO0Oo(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f = 1.5F;
    paramFloat1 *= f;
    if (paramBoolean)
    {
      double d1 = paramFloat1;
      double d2 = OooOOo0;
      double d3 = 1.0D - d2;
      double d4 = paramFloat2;
      d3 *= d4;
      d1 += d3;
      paramFloat1 = (float)d1;
    }
    return paramFloat1;
  }
  
  private void setBackground(ColorStateList paramColorStateList)
  {
    if (paramColorStateList == null)
    {
      i = 0;
      paramColorStateList = ColorStateList.valueOf(0);
    }
    this.OooOO0O = paramColorStateList;
    Paint localPaint = this.OooO0O0;
    int[] arrayOfInt = getState();
    int j = this.OooOO0O.getDefaultColor();
    int i = paramColorStateList.getColorForState(arrayOfInt, j);
    localPaint.setColor(i);
  }
  
  public final void OooO00o(Rect paramRect)
  {
    float f1 = this.OooO0oo;
    float f2 = 1.5F * f1;
    RectF localRectF = this.OooO0o0;
    float f3 = paramRect.left + f1;
    float f4 = paramRect.top + f2;
    float f5 = paramRect.right - f1;
    float f6 = paramRect.bottom - f2;
    localRectF.set(f3, f4, f5, f6);
    OooO0O0();
  }
  
  public final void OooO0O0()
  {
    Object localObject1 = new android/graphics/RectF;
    float f1 = this.OooO0o;
    float f2 = -f1;
    float f3 = -f1;
    ((RectF)localObject1).<init>(f2, f3, f1, f1);
    Object localObject2 = new android/graphics/RectF;
    ((RectF)localObject2).<init>((RectF)localObject1);
    f2 = this.OooO;
    f3 = -f2;
    f2 = -f2;
    ((RectF)localObject2).inset(f3, f2);
    Object localObject3 = this.OooO0oO;
    if (localObject3 == null)
    {
      localObject3 = new android/graphics/Path;
      ((Path)localObject3).<init>();
      this.OooO0oO = ((Path)localObject3);
    }
    else
    {
      ((Path)localObject3).reset();
    }
    localObject3 = this.OooO0oO;
    Path.FillType localFillType = Path.FillType.EVEN_ODD;
    ((Path)localObject3).setFillType(localFillType);
    localObject3 = this.OooO0oO;
    f3 = -this.OooO0o;
    ((Path)localObject3).moveTo(f3, 0.0F);
    localObject3 = this.OooO0oO;
    f3 = -this.OooO;
    ((Path)localObject3).rLineTo(f3, 0.0F);
    this.OooO0oO.arcTo((RectF)localObject2, 180.0F, 90.0F, false);
    this.OooO0oO.arcTo((RectF)localObject1, 270.0F, -90.0F, false);
    this.OooO0oO.close();
    float f4 = this.OooO0o;
    f1 = this.OooO + f4;
    f4 /= f1;
    localObject2 = this.OooO0OO;
    localObject3 = new android/graphics/RadialGradient;
    f3 = this.OooO0o;
    float f5 = this.OooO;
    float f6 = f3 + f5;
    int i = this.OooOOO0;
    int j = this.OooOOO;
    int[] tmp250_248 = new int[3];
    int[] tmp251_250 = tmp250_248;
    int[] tmp251_250 = tmp250_248;
    tmp251_250[0] = i;
    tmp251_250[1] = i;
    tmp251_250[2] = j;
    int[] arrayOfInt = tmp251_250;
    i = 3;
    Object localObject4 = new float[i];
    localObject4[0] = 0.0F;
    localObject4[1] = f4;
    localObject4[2] = 1.0F;
    Object localObject5 = Shader.TileMode.CLAMP;
    ((RadialGradient)localObject3).<init>(0.0F, 0.0F, f6, arrayOfInt, (float[])localObject4, (Shader.TileMode)localObject5);
    ((Paint)localObject2).setShader((Shader)localObject3);
    localObject1 = this.OooO0Oo;
    localObject2 = new android/graphics/LinearGradient;
    f2 = this.OooO0o;
    float f7 = -f2;
    f5 = this.OooO;
    float f8 = f7 + f5;
    float f9 = -f2 - f5;
    int k = this.OooOOO0;
    int m = this.OooOOO;
    int[] tmp374_372 = new int[3];
    int[] tmp375_374 = tmp374_372;
    int[] tmp375_374 = tmp374_372;
    tmp375_374[0] = k;
    tmp375_374[1] = k;
    tmp375_374[2] = m;
    localObject4 = tmp375_374;
    localObject5 = new float[i];
    Object tmp398_396 = localObject5;
    tmp398_396[0] = 0.0F;
    Object tmp402_398 = tmp398_396;
    tmp402_398[1] = 0.5F;
    tmp402_398[2] = 1.0F;
    Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
    ((LinearGradient)localObject2).<init>(0.0F, f8, 0.0F, f9, (int[])localObject4, (float[])localObject5, localTileMode);
    ((Paint)localObject1).setShader((Shader)localObject2);
    this.OooO0Oo.setAntiAlias(false);
  }
  
  public void OooO0o(Rect paramRect)
  {
    getPadding(paramRect);
  }
  
  public final void OooO0o0(Canvas paramCanvas)
  {
    float f1 = this.OooO0o;
    float f2 = -f1;
    float f3 = this.OooO;
    f2 -= f3;
    f3 = this.OooO00o;
    f1 += f3;
    f3 = this.OooOO0;
    float f4 = 2.0F;
    f3 /= f4;
    f1 += f3;
    RectF localRectF1 = this.OooO0o0;
    f3 = localRectF1.width();
    float f5 = f1 * f4;
    f3 -= f5;
    boolean bool1 = false;
    f4 = 0.0F;
    Object localObject1 = null;
    boolean bool2 = f3 < 0.0F;
    boolean bool3 = true;
    float f6 = 1.4E-45F;
    if (bool2)
    {
      bool2 = bool3;
      f3 = f6;
    }
    else
    {
      bool2 = false;
      localRectF1 = null;
      f3 = 0.0F;
    }
    RectF localRectF2 = this.OooO0o0;
    float f7 = localRectF2.height() - f5;
    bool1 = f7 < 0.0F;
    int k;
    if (bool1) {
      k = bool3;
    } else {
      k = 0;
    }
    int m = paramCanvas.save();
    localObject1 = this.OooO0o0;
    f6 = ((RectF)localObject1).left + f1;
    f4 = ((RectF)localObject1).top + f1;
    paramCanvas.translate(f6, f4);
    localObject1 = this.OooO0oO;
    Paint localPaint1 = this.OooO0OO;
    paramCanvas.drawPath((Path)localObject1, localPaint1);
    float f8;
    Paint localPaint2;
    if (bool2)
    {
      bool3 = false;
      f6 = 0.0F;
      localPaint1 = null;
      f7 = this.OooO0o0.width() - f5;
      f4 = this.OooO0o;
      f8 = -f4;
      localPaint2 = this.OooO0Oo;
      localObject1 = paramCanvas;
      paramCanvas.drawRect(0.0F, f2, f7, f8, localPaint2);
    }
    paramCanvas.restoreToCount(m);
    m = paramCanvas.save();
    localObject1 = this.OooO0o0;
    f6 = ((RectF)localObject1).right - f1;
    f4 = ((RectF)localObject1).bottom - f1;
    paramCanvas.translate(f6, f4);
    int i = 1127481344;
    f4 = 180.0F;
    paramCanvas.rotate(f4);
    localObject1 = this.OooO0oO;
    localPaint1 = this.OooO0OO;
    paramCanvas.drawPath((Path)localObject1, localPaint1);
    if (bool2)
    {
      bool3 = false;
      f6 = 0.0F;
      localPaint1 = null;
      localRectF1 = this.OooO0o0;
      f7 = localRectF1.width() - f5;
      f3 = -this.OooO0o;
      f4 = this.OooO;
      f8 = f3 + f4;
      localPaint2 = this.OooO0Oo;
      localObject1 = paramCanvas;
      paramCanvas.drawRect(0.0F, f2, f7, f8, localPaint2);
    }
    paramCanvas.restoreToCount(m);
    int j = paramCanvas.save();
    localObject1 = this.OooO0o0;
    f6 = ((RectF)localObject1).left + f1;
    f4 = ((RectF)localObject1).bottom - f1;
    paramCanvas.translate(f6, f4);
    i = 1132920832;
    f4 = 270.0F;
    paramCanvas.rotate(f4);
    localObject1 = this.OooO0oO;
    localPaint1 = this.OooO0OO;
    paramCanvas.drawPath((Path)localObject1, localPaint1);
    if (k != 0)
    {
      bool3 = false;
      f6 = 0.0F;
      localPaint1 = null;
      f7 = this.OooO0o0.height() - f5;
      f4 = this.OooO0o;
      f8 = -f4;
      localPaint2 = this.OooO0Oo;
      localObject1 = paramCanvas;
      paramCanvas.drawRect(0.0F, f2, f7, f8, localPaint2);
    }
    paramCanvas.restoreToCount(j);
    j = paramCanvas.save();
    localObject1 = this.OooO0o0;
    f6 = ((RectF)localObject1).right - f1;
    f4 = ((RectF)localObject1).top + f1;
    paramCanvas.translate(f6, f4);
    f1 = 90.0F;
    paramCanvas.rotate(f1);
    Object localObject2 = this.OooO0oO;
    localObject1 = this.OooO0OO;
    paramCanvas.drawPath((Path)localObject2, (Paint)localObject1);
    if (k != 0)
    {
      bool3 = false;
      f6 = 0.0F;
      localPaint1 = null;
      localObject2 = this.OooO0o0;
      f7 = ((RectF)localObject2).height() - f5;
      f1 = this.OooO0o;
      f8 = -f1;
      localPaint2 = this.OooO0Oo;
      localObject1 = paramCanvas;
      paramCanvas.drawRect(0.0F, f2, f7, f8, localPaint2);
    }
    paramCanvas.restoreToCount(j);
  }
  
  public final void OooO0oO(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = false;
    float f = 0.0F;
    StringBuilder localStringBuilder = null;
    boolean bool2 = paramFloat1 < 0.0F;
    String str = ". Must be >= 0";
    if (!bool2)
    {
      bool1 = paramFloat2 < 0.0F;
      if (!bool1)
      {
        int i = OooO0oo(paramFloat1);
        paramFloat1 = i;
        int j = OooO0oo(paramFloat2);
        paramFloat2 = j;
        bool1 = paramFloat1 < paramFloat2;
        bool2 = true;
        if (bool1)
        {
          boolean bool3 = this.OooOOOo;
          if (!bool3) {
            this.OooOOOo = bool2;
          }
          paramFloat1 = paramFloat2;
        }
        f = this.OooOO0;
        bool1 = f < paramFloat1;
        if (!bool1)
        {
          f = this.OooO0oo;
          bool1 = f < paramFloat2;
          if (!bool1) {
            return;
          }
        }
        this.OooOO0 = paramFloat1;
        this.OooO0oo = paramFloat2;
        paramFloat1 *= 1.5F;
        paramFloat2 = this.OooO00o;
        paramFloat1 = (int)(paramFloat1 + paramFloat2 + 0.5F);
        this.OooO = paramFloat1;
        this.OooOO0o = bool2;
        invalidateSelf();
        return;
      }
      localObject1 = new java/lang/IllegalArgumentException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Invalid max shadow size ");
      localStringBuilder.append(paramFloat2);
      localStringBuilder.append(str);
      localObject2 = localStringBuilder.toString();
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = new java/lang/IllegalArgumentException;
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Invalid shadow size ");
    localStringBuilder.append(paramFloat1);
    localStringBuilder.append(str);
    Object localObject1 = localStringBuilder.toString();
    ((IllegalArgumentException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  public final int OooO0oo(float paramFloat)
  {
    float f = 0.5F;
    paramFloat += f;
    int i = (int)paramFloat;
    int j = i % 2;
    int k = 1;
    if (j == k) {
      i -= k;
    }
    return i;
  }
  
  public void draw(Canvas paramCanvas)
  {
    boolean bool = this.OooOO0o;
    if (bool)
    {
      localObject = getBounds();
      OooO00o((Rect)localObject);
      bool = false;
      f1 = 0.0F;
      localObject = null;
      this.OooOO0o = false;
    }
    float f1 = this.OooOO0;
    float f2 = 2.0F;
    f1 /= f2;
    paramCanvas.translate(0.0F, f1);
    OooO0o0(paramCanvas);
    f1 = -this.OooOO0 / f2;
    paramCanvas.translate(0.0F, f1);
    Object localObject = OooOOo;
    RectF localRectF = this.OooO0o0;
    float f3 = this.OooO0o;
    Paint localPaint = this.OooO0O0;
    ((RoundRectDrawableWithShadow.RoundRectHelper)localObject).OooO00o(paramCanvas, localRectF, f3, localPaint);
  }
  
  public ColorStateList getColor()
  {
    return this.OooOO0O;
  }
  
  public float getCornerRadius()
  {
    return this.OooO0o;
  }
  
  public float getMaxShadowSize()
  {
    return this.OooO0oo;
  }
  
  public float getMinHeight()
  {
    float f1 = this.OooO0oo;
    float f2 = this.OooO0o;
    float f3 = this.OooO00o;
    f2 += f3;
    f3 = 1.5F;
    float f4 = f1 * f3;
    float f5 = 2.0F;
    f4 /= f5;
    f2 += f4;
    f1 = Math.max(f1, f2) * f5;
    f2 = this.OooO0oo * f3;
    f3 = this.OooO00o;
    f2 = (f2 + f3) * f5;
    return f1 + f2;
  }
  
  public float getMinWidth()
  {
    float f1 = this.OooO0oo;
    float f2 = this.OooO0o;
    float f3 = this.OooO00o;
    f2 += f3;
    f3 = 2.0F;
    float f4 = f1 / f3;
    f2 += f4;
    f1 = Math.max(f1, f2) * f3;
    f2 = this.OooO0oo;
    f4 = this.OooO00o;
    f2 = (f2 + f4) * f3;
    return f1 + f2;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public boolean getPadding(Rect paramRect)
  {
    float f1 = this.OooO0oo;
    float f2 = this.OooO0o;
    boolean bool1 = this.OooOOOO;
    int i = (int)Math.ceil(OooO0Oo(f1, f2, bool1));
    f2 = this.OooO0oo;
    float f3 = this.OooO0o;
    boolean bool2 = this.OooOOOO;
    int j = (int)Math.ceil(OooO0OO(f2, f3, bool2));
    paramRect.set(j, i, j, i);
    return true;
  }
  
  public float getShadowSize()
  {
    return this.OooOO0;
  }
  
  public boolean isStateful()
  {
    ColorStateList localColorStateList = this.OooOO0O;
    if (localColorStateList != null)
    {
      bool = localColorStateList.isStateful();
      if (bool) {}
    }
    else
    {
      bool = super.isStateful();
      if (!bool) {
        break label32;
      }
    }
    boolean bool = true;
    return bool;
    label32:
    bool = false;
    localColorStateList = null;
    return bool;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.OooOO0o = true;
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    Object localObject = this.OooOO0O;
    int i = ((ColorStateList)localObject).getDefaultColor();
    int j = ((ColorStateList)localObject).getColorForState(paramArrayOfInt, i);
    localObject = this.OooO0O0;
    int k = ((Paint)localObject).getColor();
    if (k == j) {
      return false;
    }
    this.OooO0O0.setColor(j);
    j = 1;
    this.OooOO0o = j;
    invalidateSelf();
    return j;
  }
  
  public void setAddPaddingForCorners(boolean paramBoolean)
  {
    this.OooOOOO = paramBoolean;
    invalidateSelf();
  }
  
  public void setAlpha(int paramInt)
  {
    this.OooO0O0.setAlpha(paramInt);
    this.OooO0OO.setAlpha(paramInt);
    this.OooO0Oo.setAlpha(paramInt);
  }
  
  public void setColor(ColorStateList paramColorStateList)
  {
    setBackground(paramColorStateList);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.OooO0O0.setColorFilter(paramColorFilter);
  }
  
  public void setCornerRadius(float paramFloat)
  {
    float f = 0.0F;
    IllegalArgumentException localIllegalArgumentException = null;
    boolean bool = paramFloat < 0.0F;
    if (!bool)
    {
      int i = (int)(paramFloat + 0.5F);
      paramFloat = i;
      f = this.OooO0o;
      bool = f < paramFloat;
      if (!bool) {
        return;
      }
      this.OooO0o = paramFloat;
      this.OooOO0o = true;
      invalidateSelf();
      return;
    }
    localIllegalArgumentException = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Invalid radius ");
    localStringBuilder.append(paramFloat);
    localStringBuilder.append(". Must be >= 0");
    String str = localStringBuilder.toString();
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public void setMaxShadowSize(float paramFloat)
  {
    float f = this.OooOO0;
    OooO0oO(f, paramFloat);
  }
  
  public void setShadowSize(float paramFloat)
  {
    float f = this.OooO0oo;
    OooO0oO(paramFloat, f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.cardview.widget.RoundRectDrawableWithShadow
 * JD-Core Version:    0.7.0.1
 */