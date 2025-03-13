package com.google.android.material.shape;

import android.graphics.Path;
import android.graphics.RectF;

final class ShapeAppearancePathProvider$ShapeAppearancePathSpec
{
  public final RectF bounds;
  public final float interpolation;
  public final Path path;
  public final ShapeAppearancePathProvider.PathListener pathListener;
  public final ShapeAppearanceModel shapeAppearanceModel;
  
  public ShapeAppearancePathProvider$ShapeAppearancePathSpec(ShapeAppearanceModel paramShapeAppearanceModel, float paramFloat, RectF paramRectF, ShapeAppearancePathProvider.PathListener paramPathListener, Path paramPath)
  {
    this.pathListener = paramPathListener;
    this.shapeAppearanceModel = paramShapeAppearanceModel;
    this.interpolation = paramFloat;
    this.bounds = paramRectF;
    this.path = paramPath;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shape.ShapeAppearancePathProvider.ShapeAppearancePathSpec
 * JD-Core Version:    0.7.0.1
 */