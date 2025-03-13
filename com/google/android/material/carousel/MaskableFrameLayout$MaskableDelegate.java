package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.google.android.material.canvas.CanvasCompat.CanvasOperation;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

abstract class MaskableFrameLayout$MaskableDelegate
{
  boolean forceCompatClippingEnabled = false;
  RectF maskBounds;
  ShapeAppearanceModel shapeAppearanceModel;
  final Path shapePath;
  
  private MaskableFrameLayout$MaskableDelegate()
  {
    Object localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.maskBounds = ((RectF)localObject);
    localObject = new android/graphics/Path;
    ((Path)localObject).<init>();
    this.shapePath = ((Path)localObject);
  }
  
  private void updateShapePath()
  {
    Object localObject = this.maskBounds;
    boolean bool = ((RectF)localObject).isEmpty();
    if (!bool)
    {
      localObject = this.shapeAppearanceModel;
      if (localObject != null)
      {
        localObject = ShapeAppearancePathProvider.getInstance();
        ShapeAppearanceModel localShapeAppearanceModel = this.shapeAppearanceModel;
        RectF localRectF = this.maskBounds;
        Path localPath = this.shapePath;
        float f = 1.0F;
        ((ShapeAppearancePathProvider)localObject).calculatePath(localShapeAppearanceModel, f, localRectF, localPath);
      }
    }
  }
  
  public abstract void invalidateClippingMethod(View paramView);
  
  public boolean isForceCompatClippingEnabled()
  {
    return this.forceCompatClippingEnabled;
  }
  
  public void maybeClip(Canvas paramCanvas, CanvasCompat.CanvasOperation paramCanvasOperation)
  {
    boolean bool = shouldUseCompatClipping();
    if (bool)
    {
      Path localPath = this.shapePath;
      bool = localPath.isEmpty();
      if (!bool)
      {
        paramCanvas.save();
        localPath = this.shapePath;
        paramCanvas.clipPath(localPath);
        paramCanvasOperation.run(paramCanvas);
        paramCanvas.restore();
        return;
      }
    }
    paramCanvasOperation.run(paramCanvas);
  }
  
  public void onMaskChanged(View paramView, RectF paramRectF)
  {
    this.maskBounds = paramRectF;
    updateShapePath();
    invalidateClippingMethod(paramView);
  }
  
  public void onShapeAppearanceChanged(View paramView, ShapeAppearanceModel paramShapeAppearanceModel)
  {
    this.shapeAppearanceModel = paramShapeAppearanceModel;
    updateShapePath();
    invalidateClippingMethod(paramView);
  }
  
  public void setForceCompatClippingEnabled(View paramView, boolean paramBoolean)
  {
    boolean bool = this.forceCompatClippingEnabled;
    if (paramBoolean != bool)
    {
      this.forceCompatClippingEnabled = paramBoolean;
      invalidateClippingMethod(paramView);
    }
  }
  
  public abstract boolean shouldUseCompatClipping();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.carousel.MaskableFrameLayout.MaskableDelegate
 * JD-Core Version:    0.7.0.1
 */