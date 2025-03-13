package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

class BorderDrawable
  extends Drawable
{
  private static final float DRAW_STROKE_WIDTH_MULTIPLE = 1.3333F;
  private ColorStateList borderTint;
  float borderWidth;
  private int bottomInnerStrokeColor;
  private int bottomOuterStrokeColor;
  private final RectF boundsRectF;
  private int currentBorderTintColor;
  private boolean invalidateShader;
  private final Paint paint;
  private final ShapeAppearancePathProvider pathProvider;
  private final Rect rect;
  private final RectF rectF;
  private ShapeAppearanceModel shapeAppearanceModel;
  private final Path shapePath;
  private final BorderDrawable.BorderState state;
  private int topInnerStrokeColor;
  private int topOuterStrokeColor;
  
  public BorderDrawable(ShapeAppearanceModel paramShapeAppearanceModel)
  {
    Object localObject = ShapeAppearancePathProvider.getInstance();
    this.pathProvider = ((ShapeAppearancePathProvider)localObject);
    localObject = new android/graphics/Path;
    ((Path)localObject).<init>();
    this.shapePath = ((Path)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.rect = ((Rect)localObject);
    localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.rectF = ((RectF)localObject);
    localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.boundsRectF = ((RectF)localObject);
    localObject = new com/google/android/material/floatingactionbutton/BorderDrawable$BorderState;
    ((BorderDrawable.BorderState)localObject).<init>(this, null);
    this.state = ((BorderDrawable.BorderState)localObject);
    int i = 1;
    this.invalidateShader = i;
    this.shapeAppearanceModel = paramShapeAppearanceModel;
    paramShapeAppearanceModel = new android/graphics/Paint;
    paramShapeAppearanceModel.<init>(i);
    this.paint = paramShapeAppearanceModel;
    localObject = Paint.Style.STROKE;
    paramShapeAppearanceModel.setStyle((Paint.Style)localObject);
  }
  
  private Shader createGradientShader()
  {
    Rect localRect = this.rect;
    copyBounds(localRect);
    float f1 = this.borderWidth;
    float f2 = localRect.height();
    f1 /= f2;
    int i = 6;
    int[] arrayOfInt = new int[i];
    int j = this.topOuterStrokeColor;
    int k = this.currentBorderTintColor;
    j = ColorUtils.OooO0oO(j, k);
    arrayOfInt[0] = j;
    j = this.topInnerStrokeColor;
    int m = this.currentBorderTintColor;
    j = ColorUtils.OooO0oO(j, m);
    m = 1;
    arrayOfInt[m] = j;
    j = ColorUtils.OooOO0(this.topInnerStrokeColor, 0);
    int n = this.currentBorderTintColor;
    j = ColorUtils.OooO0oO(j, n);
    n = 2;
    arrayOfInt[n] = j;
    j = ColorUtils.OooOO0(this.bottomInnerStrokeColor, 0);
    int i1 = this.currentBorderTintColor;
    j = ColorUtils.OooO0oO(j, i1);
    i1 = 3;
    arrayOfInt[i1] = j;
    j = this.bottomInnerStrokeColor;
    int i2 = this.currentBorderTintColor;
    j = ColorUtils.OooO0oO(j, i2);
    i2 = 4;
    arrayOfInt[i2] = j;
    j = this.bottomOuterStrokeColor;
    int i3 = this.currentBorderTintColor;
    j = ColorUtils.OooO0oO(j, i3);
    i3 = 5;
    arrayOfInt[i3] = j;
    float[] arrayOfFloat = new float[i];
    arrayOfFloat[0] = 0.0F;
    arrayOfFloat[m] = f1;
    float f3 = 0.5F;
    arrayOfFloat[n] = f3;
    arrayOfFloat[i1] = f3;
    f3 = 1.0F;
    f1 = f3 - f1;
    arrayOfFloat[i2] = f1;
    arrayOfFloat[i3] = f3;
    LinearGradient localLinearGradient = new android/graphics/LinearGradient;
    float f4 = localRect.top;
    float f5 = localRect.bottom;
    Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
    localLinearGradient.<init>(0.0F, f4, 0.0F, f5, arrayOfInt, arrayOfFloat, localTileMode);
    return localLinearGradient;
  }
  
  public void draw(Canvas paramCanvas)
  {
    boolean bool1 = this.invalidateShader;
    if (bool1)
    {
      localObject1 = this.paint;
      Shader localShader = createGradientShader();
      ((Paint)localObject1).setShader(localShader);
      bool1 = false;
      f1 = 0.0F;
      localObject1 = null;
      this.invalidateShader = false;
    }
    Object localObject1 = this.paint;
    float f1 = ((Paint)localObject1).getStrokeWidth();
    float f2 = 2.0F;
    f1 /= f2;
    Object localObject2 = this.rect;
    copyBounds((Rect)localObject2);
    localObject2 = this.rectF;
    Object localObject3 = this.rect;
    ((RectF)localObject2).set((Rect)localObject3);
    localObject2 = this.shapeAppearanceModel.getTopLeftCornerSize();
    localObject3 = getBoundsAsRectF();
    float f3 = ((CornerSize)localObject2).getCornerSize((RectF)localObject3);
    float f4 = this.rectF.width() / f2;
    f2 = Math.min(f3, f4);
    localObject2 = this.shapeAppearanceModel;
    localObject3 = getBoundsAsRectF();
    boolean bool2 = ((ShapeAppearanceModel)localObject2).isRoundRect((RectF)localObject3);
    if (bool2)
    {
      this.rectF.inset(f1, f1);
      localObject1 = this.rectF;
      localObject2 = this.paint;
      paramCanvas.drawRoundRect((RectF)localObject1, f2, f2, (Paint)localObject2);
    }
  }
  
  public RectF getBoundsAsRectF()
  {
    RectF localRectF = this.boundsRectF;
    Rect localRect = getBounds();
    localRectF.set(localRect);
    return this.boundsRectF;
  }
  
  public Drawable.ConstantState getConstantState()
  {
    return this.state;
  }
  
  public int getOpacity()
  {
    float f = this.borderWidth;
    boolean bool = f < 0.0F;
    int i;
    if (bool)
    {
      i = -3;
      f = 0.0F / 0.0F;
    }
    else
    {
      i = -2;
      f = 0.0F / 0.0F;
    }
    return i;
  }
  
  public void getOutline(Outline paramOutline)
  {
    Object localObject1 = this.shapeAppearanceModel;
    Object localObject2 = getBoundsAsRectF();
    boolean bool = ((ShapeAppearanceModel)localObject1).isRoundRect((RectF)localObject2);
    if (bool)
    {
      localObject1 = this.shapeAppearanceModel.getTopLeftCornerSize();
      localObject2 = getBoundsAsRectF();
      float f = ((CornerSize)localObject1).getCornerSize((RectF)localObject2);
      localObject2 = getBounds();
      paramOutline.setRoundRect((Rect)localObject2, f);
      return;
    }
    localObject1 = this.rect;
    copyBounds((Rect)localObject1);
    localObject1 = this.rectF;
    localObject2 = this.rect;
    ((RectF)localObject1).set((Rect)localObject2);
    localObject1 = this.pathProvider;
    localObject2 = this.shapeAppearanceModel;
    RectF localRectF = this.rectF;
    Path localPath = this.shapePath;
    ((ShapeAppearancePathProvider)localObject1).calculatePath((ShapeAppearanceModel)localObject2, 1.0F, localRectF, localPath);
    localObject1 = this.shapePath;
    DrawableUtils.setOutlineToPath(paramOutline, (Path)localObject1);
  }
  
  public boolean getPadding(Rect paramRect)
  {
    ShapeAppearanceModel localShapeAppearanceModel = this.shapeAppearanceModel;
    RectF localRectF = getBoundsAsRectF();
    boolean bool = localShapeAppearanceModel.isRoundRect(localRectF);
    if (bool)
    {
      float f = this.borderWidth;
      int i = Math.round(f);
      paramRect.set(i, i, i, i);
    }
    return true;
  }
  
  public ShapeAppearanceModel getShapeAppearanceModel()
  {
    return this.shapeAppearanceModel;
  }
  
  public boolean isStateful()
  {
    ColorStateList localColorStateList = this.borderTint;
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
    this.invalidateShader = true;
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    ColorStateList localColorStateList = this.borderTint;
    if (localColorStateList != null)
    {
      int i = this.currentBorderTintColor;
      int j = localColorStateList.getColorForState(paramArrayOfInt, i);
      int k = this.currentBorderTintColor;
      if (j != k)
      {
        k = 1;
        this.invalidateShader = k;
        this.currentBorderTintColor = j;
      }
    }
    boolean bool = this.invalidateShader;
    if (bool) {
      invalidateSelf();
    }
    return this.invalidateShader;
  }
  
  public void setAlpha(int paramInt)
  {
    this.paint.setAlpha(paramInt);
    invalidateSelf();
  }
  
  public void setBorderTint(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      int[] arrayOfInt = getState();
      int i = this.currentBorderTintColor;
      int j = paramColorStateList.getColorForState(arrayOfInt, i);
      this.currentBorderTintColor = j;
    }
    this.borderTint = paramColorStateList;
    this.invalidateShader = true;
    invalidateSelf();
  }
  
  public void setBorderWidth(float paramFloat)
  {
    float f1 = this.borderWidth;
    boolean bool1 = f1 < paramFloat;
    if (bool1)
    {
      this.borderWidth = paramFloat;
      Paint localPaint = this.paint;
      float f2 = 1.3333F;
      paramFloat *= f2;
      localPaint.setStrokeWidth(paramFloat);
      boolean bool2 = true;
      paramFloat = 1.4E-45F;
      this.invalidateShader = bool2;
      invalidateSelf();
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.paint.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setGradientColors(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.topOuterStrokeColor = paramInt1;
    this.topInnerStrokeColor = paramInt2;
    this.bottomOuterStrokeColor = paramInt3;
    this.bottomInnerStrokeColor = paramInt4;
  }
  
  public void setShapeAppearanceModel(ShapeAppearanceModel paramShapeAppearanceModel)
  {
    this.shapeAppearanceModel = paramShapeAppearanceModel;
    invalidateSelf();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.floatingactionbutton.BorderDrawable
 * JD-Core Version:    0.7.0.1
 */