package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import androidx.core.graphics.ColorUtils;

public class ShadowRenderer
{
  private static final int COLOR_ALPHA_END = 0;
  private static final int COLOR_ALPHA_MIDDLE = 20;
  private static final int COLOR_ALPHA_START = 68;
  private static final int[] cornerColors;
  private static final float[] cornerPositions;
  private static final int[] edgeColors;
  private static final float[] edgePositions;
  private final Paint cornerShadowPaint;
  private final Paint edgeShadowPaint;
  private final Path scratch;
  private int shadowEndColor;
  private int shadowMiddleColor;
  private final Paint shadowPaint;
  private int shadowStartColor;
  private final Paint transparentPaint;
  
  static
  {
    int i = 3;
    edgeColors = new int[i];
    float[] arrayOfFloat = new float[i];
    float[] tmp13_12 = arrayOfFloat;
    tmp13_12[0] = 0.0F;
    float[] tmp17_13 = tmp13_12;
    tmp17_13[1] = 0.5F;
    tmp17_13[2] = 1.0F;
    edgePositions = arrayOfFloat;
    i = 4;
    cornerColors = new int[i];
    arrayOfFloat = new float[i];
    float[] tmp43_42 = arrayOfFloat;
    float[] tmp44_43 = tmp43_42;
    float[] tmp44_43 = tmp43_42;
    tmp44_43[0] = 0.0F;
    tmp44_43[1] = 0.0F;
    tmp44_43[2] = 0.5F;
    tmp44_43[3] = 1.0F;
    cornerPositions = arrayOfFloat;
  }
  
  public ShadowRenderer()
  {
    this(-16777216);
  }
  
  public ShadowRenderer(int paramInt)
  {
    Object localObject = new android/graphics/Path;
    ((Path)localObject).<init>();
    this.scratch = ((Path)localObject);
    localObject = new android/graphics/Paint;
    ((Paint)localObject).<init>();
    this.transparentPaint = ((Paint)localObject);
    Paint localPaint1 = new android/graphics/Paint;
    localPaint1.<init>();
    this.shadowPaint = localPaint1;
    setShadowColor(paramInt);
    ((Paint)localObject).setColor(0);
    Paint localPaint2 = new android/graphics/Paint;
    localPaint2.<init>(4);
    this.cornerShadowPaint = localPaint2;
    localObject = Paint.Style.FILL;
    localPaint2.setStyle((Paint.Style)localObject);
    localObject = new android/graphics/Paint;
    ((Paint)localObject).<init>(localPaint2);
    this.edgeShadowPaint = ((Paint)localObject);
  }
  
  public void drawCornerShadow(Canvas paramCanvas, Matrix paramMatrix, RectF paramRectF, int paramInt, float paramFloat1, float paramFloat2)
  {
    ShadowRenderer localShadowRenderer = this;
    Canvas localCanvas = paramCanvas;
    RectF localRectF = paramRectF;
    int i = paramInt;
    float f1 = paramFloat2;
    boolean bool1 = false;
    float f2 = 0.0F;
    boolean bool2 = paramFloat2 < 0.0F;
    boolean bool3 = true;
    float f3 = 1.4E-45F;
    int k = 0;
    float f4 = 0.0F;
    if (bool2) {
      bool2 = bool3;
    } else {
      bool2 = false;
    }
    Path localPath = localShadowRenderer.scratch;
    int m = 3;
    float f5 = 4.203895E-045F;
    int n = 2;
    float f6;
    if (bool2)
    {
      int[] arrayOfInt1 = cornerColors;
      arrayOfInt1[0] = 0;
      k = localShadowRenderer.shadowEndColor;
      arrayOfInt1[bool3] = k;
      k = localShadowRenderer.shadowMiddleColor;
      arrayOfInt1[n] = k;
      k = localShadowRenderer.shadowStartColor;
      arrayOfInt1[m] = k;
      f6 = paramFloat1;
    }
    else
    {
      localPath.rewind();
      f6 = paramRectF.centerX();
      float f7 = paramRectF.centerY();
      localPath.moveTo(f6, f7);
      f6 = paramFloat1;
      localPath.arcTo(localRectF, paramFloat1, f1);
      localPath.close();
      int i1 = -i;
      f7 = i1;
      localRectF.inset(f7, f7);
      localObject1 = cornerColors;
      localObject1[0] = 0;
      k = localShadowRenderer.shadowStartColor;
      localObject1[bool3] = k;
      k = localShadowRenderer.shadowMiddleColor;
      localObject1[n] = k;
      k = localShadowRenderer.shadowEndColor;
      localObject1[m] = k;
    }
    f4 = paramRectF.width();
    m = 1073741824;
    f5 = 2.0F;
    float f8 = f4 / f5;
    bool1 = f8 < 0.0F;
    if (!bool1) {
      return;
    }
    float f9 = i / f8;
    int j = 1065353216;
    f2 = 1.0F;
    f9 = f2 - f9;
    f4 = (f2 - f9) / f5 + f9;
    float[] arrayOfFloat = cornerPositions;
    arrayOfFloat[bool3] = f9;
    arrayOfFloat[n] = f4;
    Object localObject2 = new android/graphics/RadialGradient;
    float f10 = paramRectF.centerX();
    float f11 = paramRectF.centerY();
    int[] arrayOfInt2 = cornerColors;
    Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
    Object localObject1 = localObject2;
    ((RadialGradient)localObject2).<init>(f10, f11, f8, arrayOfInt2, arrayOfFloat, localTileMode);
    Paint localPaint = localShadowRenderer.cornerShadowPaint;
    localPaint.setShader((Shader)localObject2);
    paramCanvas.save();
    paramCanvas.concat(paramMatrix);
    f9 = paramRectF.height();
    f3 = paramRectF.width();
    f9 /= f3;
    localCanvas.scale(f2, f9);
    if (!bool2)
    {
      localObject2 = Region.Op.DIFFERENCE;
      localCanvas.clipPath(localPath, (Region.Op)localObject2);
      localObject2 = localShadowRenderer.transparentPaint;
      localCanvas.drawPath(localPath, (Paint)localObject2);
    }
    localPaint = localShadowRenderer.cornerShadowPaint;
    localObject2 = paramCanvas;
    localRectF = paramRectF;
    f2 = paramFloat1;
    f1 = paramFloat2;
    paramCanvas.drawArc(paramRectF, paramFloat1, paramFloat2, true, localPaint);
    paramCanvas.restore();
  }
  
  public void drawEdgeShadow(Canvas paramCanvas, Matrix paramMatrix, RectF paramRectF, int paramInt)
  {
    float f1 = paramRectF.bottom;
    float f2 = paramInt;
    f1 += f2;
    paramRectF.bottom = f1;
    float f3 = -paramInt;
    paramRectF.offset(0.0F, f3);
    int[] arrayOfInt = edgeColors;
    int i = this.shadowEndColor;
    arrayOfInt[0] = i;
    i = this.shadowMiddleColor;
    arrayOfInt[1] = i;
    i = this.shadowStartColor;
    arrayOfInt[2] = i;
    Paint localPaint = this.edgeShadowPaint;
    LinearGradient localLinearGradient = new android/graphics/LinearGradient;
    float f4 = paramRectF.left;
    float f5 = paramRectF.top;
    float f6 = paramRectF.bottom;
    float[] arrayOfFloat = edgePositions;
    Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
    localLinearGradient.<init>(f4, f5, f4, f6, arrayOfInt, arrayOfFloat, localTileMode);
    localPaint.setShader(localLinearGradient);
    paramCanvas.save();
    paramCanvas.concat(paramMatrix);
    paramMatrix = this.edgeShadowPaint;
    paramCanvas.drawRect(paramRectF, paramMatrix);
    paramCanvas.restore();
  }
  
  public void drawInnerCornerShadow(Canvas paramCanvas, Matrix paramMatrix, RectF paramRectF, int paramInt, float paramFloat1, float paramFloat2, float[] paramArrayOfFloat)
  {
    float f1 = 0.0F;
    boolean bool = paramFloat2 < 0.0F;
    if (bool)
    {
      paramFloat1 += paramFloat2;
      paramFloat2 = -paramFloat2;
    }
    drawCornerShadow(paramCanvas, paramMatrix, paramRectF, paramInt, paramFloat1, paramFloat2);
    Path localPath = this.scratch;
    localPath.rewind();
    f1 = paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[1];
    localPath.moveTo(f1, f2);
    localPath.arcTo(paramRectF, paramFloat1, paramFloat2);
    localPath.close();
    paramCanvas.save();
    paramCanvas.concat(paramMatrix);
    float f3 = paramRectF.height();
    float f4 = paramRectF.width();
    f3 /= f4;
    paramCanvas.scale(1.0F, f3);
    paramMatrix = this.transparentPaint;
    paramCanvas.drawPath(localPath, paramMatrix);
    paramMatrix = this.shadowPaint;
    paramCanvas.drawPath(localPath, paramMatrix);
    paramCanvas.restore();
  }
  
  public Paint getShadowPaint()
  {
    return this.shadowPaint;
  }
  
  public void setShadowColor(int paramInt)
  {
    int i = ColorUtils.OooOO0(paramInt, 68);
    this.shadowStartColor = i;
    i = ColorUtils.OooOO0(paramInt, 20);
    this.shadowMiddleColor = i;
    paramInt = ColorUtils.OooOO0(paramInt, 0);
    this.shadowEndColor = paramInt;
    Paint localPaint = this.shadowPaint;
    i = this.shadowStartColor;
    localPaint.setColor(i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shadow.ShadowRenderer
 * JD-Core Version:    0.7.0.1
 */