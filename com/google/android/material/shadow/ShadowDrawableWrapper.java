package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
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
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.content.ContextCompat;
import com.google.android.material.R.color;
import m54207b69;

public class ShadowDrawableWrapper
  extends DrawableWrapper
{
  static final double COS_45 = Math.cos(Math.toRadians(45.0D));
  static final float SHADOW_BOTTOM_SCALE = 1.0F;
  static final float SHADOW_HORIZ_SCALE = 0.5F;
  static final float SHADOW_MULTIPLIER = 1.5F;
  static final float SHADOW_TOP_SCALE = 0.25F;
  private boolean addPaddingForCorners;
  final RectF contentBounds;
  float cornerRadius;
  final Paint cornerShadowPaint;
  Path cornerShadowPath;
  private boolean dirty;
  final Paint edgeShadowPaint;
  float maxShadowSize;
  private boolean printedShadowClipWarning;
  float rawMaxShadowSize;
  float rawShadowSize;
  private float rotation;
  private final int shadowEndColor;
  private final int shadowMiddleColor;
  float shadowSize;
  private final int shadowStartColor;
  
  public ShadowDrawableWrapper(Context paramContext, Drawable paramDrawable, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    super(paramDrawable);
    boolean bool = true;
    this.dirty = bool;
    this.addPaddingForCorners = bool;
    this.printedShadowClipWarning = false;
    int i = R.color.design_fab_shadow_start_color;
    i = ContextCompat.OooO0OO(paramContext, i);
    this.shadowStartColor = i;
    i = R.color.design_fab_shadow_mid_color;
    i = ContextCompat.OooO0OO(paramContext, i);
    this.shadowMiddleColor = i;
    i = R.color.design_fab_shadow_end_color;
    int j = ContextCompat.OooO0OO(paramContext, i);
    this.shadowEndColor = j;
    paramContext = new android/graphics/Paint;
    paramContext.<init>(5);
    this.cornerShadowPaint = paramContext;
    Paint.Style localStyle = Paint.Style.FILL;
    paramContext.setStyle(localStyle);
    paramFloat1 = Math.round(paramFloat1);
    this.cornerRadius = paramFloat1;
    Object localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.contentBounds = ((RectF)localObject);
    localObject = new android/graphics/Paint;
    ((Paint)localObject).<init>(paramContext);
    this.edgeShadowPaint = ((Paint)localObject);
    ((Paint)localObject).setAntiAlias(false);
    setShadowSize(paramFloat2, paramFloat3);
  }
  
  private void buildComponents(Rect paramRect)
  {
    float f1 = this.rawMaxShadowSize;
    float f2 = 1.5F * f1;
    RectF localRectF1 = this.contentBounds;
    float f3 = paramRect.left + f1;
    float f4 = paramRect.top + f2;
    float f5 = paramRect.right - f1;
    float f6 = paramRect.bottom - f2;
    localRectF1.set(f3, f4, f5, f6);
    paramRect = getWrappedDrawable();
    RectF localRectF2 = this.contentBounds;
    int i = (int)localRectF2.left;
    int j = (int)localRectF2.top;
    int k = (int)localRectF2.right;
    int m = (int)localRectF2.bottom;
    paramRect.setBounds(i, j, k, m);
    buildShadowCorners();
  }
  
  private void buildShadowCorners()
  {
    ShadowDrawableWrapper localShadowDrawableWrapper = this;
    RectF localRectF1 = new android/graphics/RectF;
    float f1 = this.cornerRadius;
    float f2 = -f1;
    float f3 = -f1;
    localRectF1.<init>(f2, f3, f1, f1);
    RectF localRectF2 = new android/graphics/RectF;
    localRectF2.<init>(localRectF1);
    f2 = this.shadowSize;
    f3 = -f2;
    f2 = -f2;
    localRectF2.inset(f3, f2);
    Object localObject1 = this.cornerShadowPath;
    if (localObject1 == null)
    {
      localObject1 = new android/graphics/Path;
      ((Path)localObject1).<init>();
      this.cornerShadowPath = ((Path)localObject1);
    }
    else
    {
      ((Path)localObject1).reset();
    }
    localObject1 = localShadowDrawableWrapper.cornerShadowPath;
    Path.FillType localFillType = Path.FillType.EVEN_ODD;
    ((Path)localObject1).setFillType(localFillType);
    localObject1 = localShadowDrawableWrapper.cornerShadowPath;
    f3 = -localShadowDrawableWrapper.cornerRadius;
    Object localObject2 = null;
    ((Path)localObject1).moveTo(f3, 0.0F);
    localObject1 = localShadowDrawableWrapper.cornerShadowPath;
    f3 = -localShadowDrawableWrapper.shadowSize;
    ((Path)localObject1).rLineTo(f3, 0.0F);
    localShadowDrawableWrapper.cornerShadowPath.arcTo(localRectF2, 180.0F, 90.0F, false);
    localObject1 = localShadowDrawableWrapper.cornerShadowPath;
    int i = -1028390912;
    float f4 = -90.0F;
    ((Path)localObject1).arcTo(localRectF1, 270.0F, f4, false);
    localObject1 = localShadowDrawableWrapper.cornerShadowPath;
    ((Path)localObject1).close();
    f2 = localRectF2.top;
    float f5 = -f2;
    boolean bool = f5 < 0.0F;
    int k = 3;
    f3 = 4.203895E-045F;
    if (bool)
    {
      f2 = localShadowDrawableWrapper.cornerRadius / f5;
      i = 1065353216;
      f4 = 1.0F;
      float f6 = (f4 - f2) / 2.0F + f2;
      localObject3 = localShadowDrawableWrapper.cornerShadowPaint;
      localObject4 = new android/graphics/RadialGradient;
      int m = localShadowDrawableWrapper.shadowStartColor;
      int n = localShadowDrawableWrapper.shadowMiddleColor;
      int i1 = localShadowDrawableWrapper.shadowEndColor;
      int[] tmp305_303 = new int[4];
      int[] tmp306_305 = tmp305_303;
      int[] tmp306_305 = tmp305_303;
      tmp306_305[0] = 0;
      tmp306_305[1] = m;
      tmp306_305[2] = n;
      int[] tmp318_306 = tmp306_305;
      tmp318_306[3] = i1;
      int[] arrayOfInt = tmp318_306;
      localObject5 = new float[4];
      localObject5[0] = 0.0F;
      localObject5[1] = f2;
      int j = 2;
      f2 = 2.802597E-045F;
      localObject5[j] = f6;
      localObject5[k] = f4;
      localObject1 = Shader.TileMode.CLAMP;
      localObject6 = localObject4;
      i1 = 0;
      f7 = 0.0F;
      localObject2 = localObject4;
      localObject4 = localObject1;
      localObject6.<init>(0.0F, 0.0F, f5, arrayOfInt, (float[])localObject5, (Shader.TileMode)localObject1);
      ((Paint)localObject3).setShader(localObject6);
    }
    localObject1 = localShadowDrawableWrapper.edgeShadowPaint;
    localObject2 = new android/graphics/LinearGradient;
    float f7 = localRectF1.top;
    float f8 = localRectF2.top;
    int i2 = localShadowDrawableWrapper.shadowStartColor;
    int i3 = localShadowDrawableWrapper.shadowMiddleColor;
    i = localShadowDrawableWrapper.shadowEndColor;
    int[] tmp453_451 = new int[3];
    int[] tmp454_453 = tmp453_451;
    int[] tmp454_453 = tmp453_451;
    tmp454_453[0] = i2;
    tmp454_453[1] = i3;
    tmp454_453[2] = i;
    Object localObject5 = tmp454_453;
    Object localObject4 = new float[k];
    Object tmp477_475 = localObject4;
    tmp477_475[0] = 0.0F;
    Object tmp481_477 = tmp477_475;
    tmp481_477[1] = 0.5F;
    tmp481_477[2] = 1.0F;
    Object localObject3 = Shader.TileMode.CLAMP;
    Object localObject6 = localObject2;
    ((LinearGradient)localObject2).<init>(0.0F, f7, 0.0F, f8, (int[])localObject5, (float[])localObject4, (Shader.TileMode)localObject3);
    ((Paint)localObject1).setShader((Shader)localObject2);
    localShadowDrawableWrapper.edgeShadowPaint.setAntiAlias(false);
  }
  
  public static float calculateHorizontalPadding(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      double d1 = paramFloat1;
      double d2 = COS_45;
      double d3 = 1.0D - d2;
      double d4 = paramFloat2;
      d3 *= d4;
      d1 += d3;
      paramFloat1 = (float)d1;
    }
    return paramFloat1;
  }
  
  public static float calculateVerticalPadding(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f = 1.5F;
    paramFloat1 *= f;
    if (paramBoolean)
    {
      double d1 = paramFloat1;
      double d2 = COS_45;
      double d3 = 1.0D - d2;
      double d4 = paramFloat2;
      d3 *= d4;
      d1 += d3;
      paramFloat1 = (float)d1;
    }
    return paramFloat1;
  }
  
  private void drawShadow(Canvas paramCanvas)
  {
    ShadowDrawableWrapper localShadowDrawableWrapper = this;
    Canvas localCanvas = paramCanvas;
    int i = paramCanvas.save();
    float f1 = this.rotation;
    float f2 = this.contentBounds.centerX();
    RectF localRectF = this.contentBounds;
    float f3 = localRectF.centerY();
    paramCanvas.rotate(f1, f2, f3);
    float f4 = this.cornerRadius;
    f1 = -f4;
    f2 = this.shadowSize;
    float f5 = f1 - f2;
    Object localObject = this.contentBounds;
    f1 = ((RectF)localObject).width();
    float f6 = f4 * 2.0F;
    f1 -= f6;
    f2 = 0.0F;
    Paint localPaint1 = null;
    boolean bool = f1 < 0.0F;
    int k = 1;
    f3 = 1.4E-45F;
    int m = 0;
    float f7 = 0.0F;
    Paint localPaint2;
    if (bool)
    {
      n = k;
    }
    else
    {
      n = 0;
      localPaint2 = null;
    }
    localObject = localShadowDrawableWrapper.contentBounds;
    f1 = ((RectF)localObject).height() - f6;
    bool = f1 < 0.0F;
    int i1;
    if (bool) {
      i1 = k;
    } else {
      i1 = 0;
    }
    f1 = localShadowDrawableWrapper.rawShadowSize;
    f2 = 0.25F * f1;
    f2 = f1 - f2;
    k = 1056964608;
    f3 = 0.5F * f1;
    f3 = f1 - f3;
    int i2 = 1065353216;
    float f8 = 1.0F;
    f7 = f1 * f8;
    f1 -= f7;
    f3 += f4;
    float f9 = f4 / f3;
    f2 += f4;
    float f10 = f4 / f2;
    f1 += f4;
    float f11 = f4 / f1;
    m = paramCanvas.save();
    localObject = localShadowDrawableWrapper.contentBounds;
    f2 = ((RectF)localObject).left + f4;
    f1 = ((RectF)localObject).top + f4;
    localCanvas.translate(f2, f1);
    localCanvas.scale(f9, f10);
    localObject = localShadowDrawableWrapper.cornerShadowPath;
    localPaint1 = localShadowDrawableWrapper.cornerShadowPaint;
    localCanvas.drawPath((Path)localObject, localPaint1);
    float f14;
    int i3;
    float f15;
    Paint localPaint4;
    if (n != 0)
    {
      f1 = f8 / f9;
      localCanvas.scale(f1, f8);
      f2 = 0.0F;
      localPaint1 = null;
      float f12 = localShadowDrawableWrapper.contentBounds.width() - f6;
      f1 = localShadowDrawableWrapper.cornerRadius;
      f3 = -f1;
      Paint localPaint3 = localShadowDrawableWrapper.edgeShadowPaint;
      localObject = paramCanvas;
      float f13 = f3;
      f3 = f5;
      i2 = m;
      f7 = f12;
      f14 = f11;
      f11 = f13;
      i3 = i;
      f15 = f10;
      localPaint4 = localPaint3;
      paramCanvas.drawRect(0.0F, f5, f12, f13, localPaint3);
    }
    else
    {
      i2 = m;
      f14 = f11;
      i3 = i;
      f15 = f10;
    }
    localCanvas.restoreToCount(i2);
    i2 = paramCanvas.save();
    localObject = localShadowDrawableWrapper.contentBounds;
    f2 = ((RectF)localObject).right - f4;
    f1 = ((RectF)localObject).bottom - f4;
    localCanvas.translate(f2, f1);
    f10 = f14;
    localCanvas.scale(f9, f14);
    int j = 1127481344;
    f1 = 180.0F;
    localCanvas.rotate(f1);
    localObject = localShadowDrawableWrapper.cornerShadowPath;
    localPaint1 = localShadowDrawableWrapper.cornerShadowPaint;
    localCanvas.drawPath((Path)localObject, localPaint1);
    float f16;
    if (n != 0)
    {
      j = 1065353216;
      f1 = 1.0F;
      f2 = f1 / f9;
      localCanvas.scale(f2, f1);
      f2 = 0.0F;
      localPaint1 = null;
      f7 = localShadowDrawableWrapper.contentBounds.width() - f6;
      f1 = -localShadowDrawableWrapper.cornerRadius;
      f3 = localShadowDrawableWrapper.shadowSize;
      f11 = f1 + f3;
      localPaint2 = localShadowDrawableWrapper.edgeShadowPaint;
      localObject = paramCanvas;
      f3 = f5;
      f16 = f15;
      f15 = f14;
      localPaint4 = localPaint2;
      paramCanvas.drawRect(0.0F, f5, f7, f11, localPaint2);
    }
    else
    {
      f16 = f15;
      f15 = f14;
    }
    localCanvas.restoreToCount(i2);
    int n = paramCanvas.save();
    localObject = localShadowDrawableWrapper.contentBounds;
    f2 = ((RectF)localObject).left + f4;
    f1 = ((RectF)localObject).bottom - f4;
    localCanvas.translate(f2, f1);
    localCanvas.scale(f9, f15);
    j = 1132920832;
    f1 = 270.0F;
    localCanvas.rotate(f1);
    localObject = localShadowDrawableWrapper.cornerShadowPath;
    localPaint1 = localShadowDrawableWrapper.cornerShadowPaint;
    localCanvas.drawPath((Path)localObject, localPaint1);
    if (i1 != 0)
    {
      j = 1065353216;
      f1 = 1.0F;
      f8 = f1 / f15;
      localCanvas.scale(f8, f1);
      f2 = 0.0F;
      localPaint1 = null;
      f7 = localShadowDrawableWrapper.contentBounds.height() - f6;
      f1 = localShadowDrawableWrapper.cornerRadius;
      f11 = -f1;
      localPaint4 = localShadowDrawableWrapper.edgeShadowPaint;
      localObject = paramCanvas;
      f3 = f5;
      paramCanvas.drawRect(0.0F, f5, f7, f11, localPaint4);
    }
    localCanvas.restoreToCount(n);
    i = paramCanvas.save();
    localObject = localShadowDrawableWrapper.contentBounds;
    f2 = ((RectF)localObject).right - f4;
    f1 = ((RectF)localObject).top + f4;
    localCanvas.translate(f2, f1);
    f4 = f16;
    localCanvas.scale(f9, f16);
    j = 1119092736;
    f1 = 90.0F;
    localCanvas.rotate(f1);
    localObject = localShadowDrawableWrapper.cornerShadowPath;
    localPaint1 = localShadowDrawableWrapper.cornerShadowPaint;
    localCanvas.drawPath((Path)localObject, localPaint1);
    if (i1 != 0)
    {
      j = 1065353216;
      f1 = 1.0F;
      f8 = f1 / f16;
      localCanvas.scale(f8, f1);
      f2 = 0.0F;
      localPaint1 = null;
      f7 = localShadowDrawableWrapper.contentBounds.height() - f6;
      f1 = localShadowDrawableWrapper.cornerRadius;
      f11 = -f1;
      localPaint4 = localShadowDrawableWrapper.edgeShadowPaint;
      localObject = paramCanvas;
      f3 = f5;
      paramCanvas.drawRect(0.0F, f5, f7, f11, localPaint4);
    }
    localCanvas.restoreToCount(i);
    j = i3;
    localCanvas.restoreToCount(i3);
  }
  
  private static int toEven(float paramFloat)
  {
    int i = Math.round(paramFloat);
    int j = i % 2;
    int k = 1;
    if (j == k) {
      i += -1;
    }
    return i;
  }
  
  public void draw(Canvas paramCanvas)
  {
    boolean bool = this.dirty;
    if (bool)
    {
      Rect localRect = getBounds();
      buildComponents(localRect);
      bool = false;
      localRect = null;
      this.dirty = false;
    }
    drawShadow(paramCanvas);
    super.draw(paramCanvas);
  }
  
  public float getCornerRadius()
  {
    return this.cornerRadius;
  }
  
  public float getMaxShadowSize()
  {
    return this.rawMaxShadowSize;
  }
  
  public float getMinHeight()
  {
    float f1 = this.rawMaxShadowSize;
    float f2 = this.cornerRadius;
    float f3 = 1.5F;
    float f4 = f1 * f3;
    float f5 = 2.0F;
    f4 /= f5;
    f2 += f4;
    f1 = Math.max(f1, f2) * f5;
    f2 = this.rawMaxShadowSize * f3 * f5;
    return f1 + f2;
  }
  
  public float getMinWidth()
  {
    float f1 = this.rawMaxShadowSize;
    float f2 = this.cornerRadius;
    float f3 = 2.0F;
    float f4 = f1 / f3;
    f2 += f4;
    f1 = Math.max(f1, f2) * f3;
    f2 = this.rawMaxShadowSize * f3;
    return f1 + f2;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public boolean getPadding(Rect paramRect)
  {
    float f1 = this.rawMaxShadowSize;
    float f2 = this.cornerRadius;
    boolean bool1 = this.addPaddingForCorners;
    int i = (int)Math.ceil(calculateVerticalPadding(f1, f2, bool1));
    f2 = this.rawMaxShadowSize;
    float f3 = this.cornerRadius;
    boolean bool2 = this.addPaddingForCorners;
    int j = (int)Math.ceil(calculateHorizontalPadding(f2, f3, bool2));
    paramRect.set(j, i, j, i);
    return true;
  }
  
  public float getShadowSize()
  {
    return this.rawShadowSize;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    this.dirty = true;
  }
  
  public void setAddPaddingForCorners(boolean paramBoolean)
  {
    this.addPaddingForCorners = paramBoolean;
    invalidateSelf();
  }
  
  public void setAlpha(int paramInt)
  {
    super.setAlpha(paramInt);
    this.cornerShadowPaint.setAlpha(paramInt);
    this.edgeShadowPaint.setAlpha(paramInt);
  }
  
  public void setCornerRadius(float paramFloat)
  {
    int i = Math.round(paramFloat);
    paramFloat = i;
    float f = this.cornerRadius;
    boolean bool = f < paramFloat;
    if (!bool) {
      return;
    }
    this.cornerRadius = paramFloat;
    this.dirty = true;
    invalidateSelf();
  }
  
  public void setMaxShadowSize(float paramFloat)
  {
    float f = this.rawShadowSize;
    setShadowSize(f, paramFloat);
  }
  
  public final void setRotation(float paramFloat)
  {
    float f = this.rotation;
    boolean bool = f < paramFloat;
    if (bool)
    {
      this.rotation = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setShadowSize(float paramFloat)
  {
    float f = this.rawMaxShadowSize;
    setShadowSize(paramFloat, f);
  }
  
  public void setShadowSize(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = false;
    float f = 0.0F;
    boolean bool2 = paramFloat1 < 0.0F;
    if (!bool2)
    {
      bool1 = paramFloat2 < 0.0F;
      if (!bool1)
      {
        int i = toEven(paramFloat1);
        paramFloat1 = i;
        int j = toEven(paramFloat2);
        paramFloat2 = j;
        bool1 = paramFloat1 < paramFloat2;
        bool2 = true;
        if (bool1)
        {
          boolean bool3 = this.printedShadowClipWarning;
          if (!bool3) {
            this.printedShadowClipWarning = bool2;
          }
          paramFloat1 = paramFloat2;
        }
        f = this.rawShadowSize;
        bool1 = f < paramFloat1;
        if (!bool1)
        {
          f = this.rawMaxShadowSize;
          bool1 = f < paramFloat2;
          if (!bool1) {
            return;
          }
        }
        this.rawShadowSize = paramFloat1;
        this.rawMaxShadowSize = paramFloat2;
        paramFloat1 = Math.round(paramFloat1 * 1.5F);
        this.shadowSize = paramFloat1;
        this.maxShadowSize = paramFloat2;
        this.dirty = bool2;
        invalidateSelf();
        return;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("k[32362F3D3B374582303C444A40398937423250");
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shadow.ShadowDrawableWrapper
 * JD-Core Version:    0.7.0.1
 */