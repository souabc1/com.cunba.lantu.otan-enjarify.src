package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Op;
import android.graphics.RectF;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

class MaskEvaluator
{
  private ShapeAppearanceModel currentShapeAppearanceModel;
  private final Path endPath;
  private final Path path;
  private final ShapeAppearancePathProvider pathProvider;
  private final Path startPath;
  
  public MaskEvaluator()
  {
    Object localObject = new android/graphics/Path;
    ((Path)localObject).<init>();
    this.path = ((Path)localObject);
    localObject = new android/graphics/Path;
    ((Path)localObject).<init>();
    this.startPath = ((Path)localObject);
    localObject = new android/graphics/Path;
    ((Path)localObject).<init>();
    this.endPath = ((Path)localObject);
    localObject = ShapeAppearancePathProvider.getInstance();
    this.pathProvider = ((ShapeAppearancePathProvider)localObject);
  }
  
  public void clip(Canvas paramCanvas)
  {
    Path localPath = this.path;
    paramCanvas.clipPath(localPath);
  }
  
  public void evaluate(float paramFloat, ShapeAppearanceModel paramShapeAppearanceModel1, ShapeAppearanceModel paramShapeAppearanceModel2, RectF paramRectF1, RectF paramRectF2, RectF paramRectF3, MaterialContainerTransform.ProgressThresholds paramProgressThresholds)
  {
    float f1 = paramProgressThresholds.getStart();
    float f2 = paramProgressThresholds.getEnd();
    Object localObject = TransitionUtils.lerp(paramShapeAppearanceModel1, paramShapeAppearanceModel2, paramRectF1, paramRectF3, f1, f2, paramFloat);
    this.currentShapeAppearanceModel = ((ShapeAppearanceModel)localObject);
    paramShapeAppearanceModel1 = this.pathProvider;
    paramShapeAppearanceModel2 = this.startPath;
    float f3 = 1.0F;
    paramShapeAppearanceModel1.calculatePath((ShapeAppearanceModel)localObject, f3, paramRectF2, paramShapeAppearanceModel2);
    localObject = this.pathProvider;
    paramShapeAppearanceModel1 = this.currentShapeAppearanceModel;
    paramShapeAppearanceModel2 = this.endPath;
    ((ShapeAppearancePathProvider)localObject).calculatePath(paramShapeAppearanceModel1, f3, paramRectF3, paramShapeAppearanceModel2);
    localObject = this.path;
    paramShapeAppearanceModel1 = this.startPath;
    paramShapeAppearanceModel2 = this.endPath;
    paramRectF1 = Path.Op.UNION;
    ((Path)localObject).op(paramShapeAppearanceModel1, paramShapeAppearanceModel2, paramRectF1);
  }
  
  public ShapeAppearanceModel getCurrentShapeAppearanceModel()
  {
    return this.currentShapeAppearanceModel;
  }
  
  public Path getPath()
  {
    return this.path;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.transition.platform.MaskEvaluator
 * JD-Core Version:    0.7.0.1
 */