package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.PointF;
import android.graphics.RectF;

public class ShapeAppearancePathProvider
{
  private final Path boundsPath;
  private final Path cornerPath;
  private final ShapePath[] cornerPaths;
  private final Matrix[] cornerTransforms;
  private boolean edgeIntersectionCheckEnabled;
  private final Path edgePath;
  private final Matrix[] edgeTransforms;
  private final Path overlappedEdgePath;
  private final PointF pointF;
  private final float[] scratch;
  private final float[] scratch2;
  private final ShapePath shapePath;
  
  public ShapeAppearancePathProvider()
  {
    int i = 4;
    Object localObject1 = new ShapePath[i];
    this.cornerPaths = ((ShapePath[])localObject1);
    localObject1 = new Matrix[i];
    this.cornerTransforms = ((Matrix[])localObject1);
    localObject1 = new Matrix[i];
    this.edgeTransforms = ((Matrix[])localObject1);
    localObject1 = new android/graphics/PointF;
    ((PointF)localObject1).<init>();
    this.pointF = ((PointF)localObject1);
    localObject1 = new android/graphics/Path;
    ((Path)localObject1).<init>();
    this.overlappedEdgePath = ((Path)localObject1);
    localObject1 = new android/graphics/Path;
    ((Path)localObject1).<init>();
    this.boundsPath = ((Path)localObject1);
    localObject1 = new com/google/android/material/shape/ShapePath;
    ((ShapePath)localObject1).<init>();
    this.shapePath = ((ShapePath)localObject1);
    int j = 2;
    Object localObject2 = new float[j];
    this.scratch = ((float[])localObject2);
    localObject1 = new float[j];
    this.scratch2 = ((float[])localObject1);
    localObject1 = new android/graphics/Path;
    ((Path)localObject1).<init>();
    this.edgePath = ((Path)localObject1);
    localObject1 = new android/graphics/Path;
    ((Path)localObject1).<init>();
    this.cornerPath = ((Path)localObject1);
    this.edgeIntersectionCheckEnabled = true;
    j = 0;
    localObject1 = null;
    while (j < i)
    {
      localObject2 = this.cornerPaths;
      Object localObject3 = new com/google/android/material/shape/ShapePath;
      ((ShapePath)localObject3).<init>();
      localObject2[j] = localObject3;
      localObject2 = this.cornerTransforms;
      localObject3 = new android/graphics/Matrix;
      ((Matrix)localObject3).<init>();
      localObject2[j] = localObject3;
      localObject2 = this.edgeTransforms;
      localObject3 = new android/graphics/Matrix;
      ((Matrix)localObject3).<init>();
      localObject2[j] = localObject3;
      j += 1;
    }
  }
  
  private float angleOfEdge(int paramInt)
  {
    return (paramInt + 1) % 4 * 90;
  }
  
  private void appendCornerPath(ShapeAppearancePathProvider.ShapeAppearancePathSpec paramShapeAppearancePathSpec, int paramInt)
  {
    Object localObject1 = this.scratch;
    float f1 = this.cornerPaths[paramInt].getStartX();
    float f2 = 0.0F;
    Path localPath = null;
    localObject1[0] = f1;
    localObject1 = this.scratch;
    f1 = this.cornerPaths[paramInt].getStartY();
    int i = 1;
    localObject1[i] = f1;
    localObject1 = this.cornerTransforms[paramInt];
    Object localObject2 = this.scratch;
    ((Matrix)localObject1).mapPoints((float[])localObject2);
    localObject1 = paramShapeAppearancePathSpec.path;
    localObject2 = this.scratch;
    if (paramInt == 0)
    {
      f2 = localObject2[0];
      f1 = localObject2[i];
      ((Path)localObject1).moveTo(f2, f1);
    }
    else
    {
      f2 = localObject2[0];
      f1 = localObject2[i];
      ((Path)localObject1).lineTo(f2, f1);
    }
    localObject1 = this.cornerPaths[paramInt];
    localObject2 = this.cornerTransforms[paramInt];
    localPath = paramShapeAppearancePathSpec.path;
    ((ShapePath)localObject1).applyToPath((Matrix)localObject2, localPath);
    paramShapeAppearancePathSpec = paramShapeAppearancePathSpec.pathListener;
    if (paramShapeAppearancePathSpec != null)
    {
      localObject1 = this.cornerPaths[paramInt];
      localObject2 = this.cornerTransforms[paramInt];
      paramShapeAppearancePathSpec.onCornerPathCreated((ShapePath)localObject1, (Matrix)localObject2, paramInt);
    }
  }
  
  private void appendEdgePath(ShapeAppearancePathProvider.ShapeAppearancePathSpec paramShapeAppearancePathSpec, int paramInt)
  {
    int i = (paramInt + 1) % 4;
    Object localObject1 = this.scratch;
    float f1 = this.cornerPaths[paramInt].getEndX();
    localObject1[0] = f1;
    localObject1 = this.scratch;
    f1 = this.cornerPaths[paramInt].getEndY();
    int j = 1;
    localObject1[j] = f1;
    localObject1 = this.cornerTransforms[paramInt];
    Object localObject2 = this.scratch;
    ((Matrix)localObject1).mapPoints((float[])localObject2);
    localObject1 = this.scratch2;
    f1 = this.cornerPaths[i].getStartX();
    localObject1[0] = f1;
    localObject1 = this.scratch2;
    f1 = this.cornerPaths[i].getStartY();
    localObject1[j] = f1;
    localObject1 = this.cornerTransforms[i];
    localObject2 = this.scratch2;
    ((Matrix)localObject1).mapPoints((float[])localObject2);
    localObject1 = this.scratch;
    f1 = localObject1[0];
    Object localObject3 = this.scratch2;
    float f2 = localObject3[0];
    double d1 = f1 - f2;
    float f3 = localObject1[j];
    f1 = localObject3[j];
    double d2 = f3 - f1;
    d2 = Math.hypot(d1, d2);
    f3 = (float)d2 - 0.001F;
    f1 = 0.0F;
    f3 = Math.max(f3, 0.0F);
    localObject3 = paramShapeAppearancePathSpec.bounds;
    float f4 = getEdgeCenterForIndex((RectF)localObject3, paramInt);
    this.shapePath.reset(0.0F, 0.0F);
    localObject2 = paramShapeAppearancePathSpec.shapeAppearanceModel;
    localObject2 = getEdgeTreatmentForIndex(paramInt, (ShapeAppearanceModel)localObject2);
    f2 = paramShapeAppearancePathSpec.interpolation;
    ShapePath localShapePath = this.shapePath;
    ((EdgeTreatment)localObject2).getEdgePath(f3, f4, f2, localShapePath);
    this.edgePath.reset();
    localObject1 = this.shapePath;
    localObject3 = this.edgeTransforms[paramInt];
    Path localPath = this.edgePath;
    ((ShapePath)localObject1).applyToPath((Matrix)localObject3, localPath);
    boolean bool2 = this.edgeIntersectionCheckEnabled;
    if (bool2)
    {
      bool2 = ((EdgeTreatment)localObject2).forceIntersection();
      if (!bool2)
      {
        localObject1 = this.edgePath;
        bool2 = pathOverlapsCorner((Path)localObject1, paramInt);
        if (!bool2)
        {
          localObject1 = this.edgePath;
          boolean bool1 = pathOverlapsCorner((Path)localObject1, i);
          if (!bool1) {
            break label538;
          }
        }
      }
      localObject4 = this.edgePath;
      localObject1 = this.boundsPath;
      localObject2 = Path.Op.DIFFERENCE;
      ((Path)localObject4).op((Path)localObject4, (Path)localObject1, (Path.Op)localObject2);
      localObject4 = this.scratch;
      f3 = this.shapePath.getStartX();
      localObject4[0] = f3;
      localObject4 = this.scratch;
      f3 = this.shapePath.getStartY();
      localObject4[j] = f3;
      localObject4 = this.edgeTransforms[paramInt];
      localObject1 = this.scratch;
      ((Matrix)localObject4).mapPoints((float[])localObject1);
      localObject4 = this.overlappedEdgePath;
      localObject1 = this.scratch;
      f1 = localObject1[0];
      f3 = localObject1[j];
      ((Path)localObject4).moveTo(f1, f3);
      localObject4 = this.shapePath;
      localObject1 = this.edgeTransforms[paramInt];
      localObject2 = this.overlappedEdgePath;
      break label558;
    }
    label538:
    Object localObject4 = this.shapePath;
    localObject1 = this.edgeTransforms[paramInt];
    localObject2 = paramShapeAppearancePathSpec.path;
    label558:
    ((ShapePath)localObject4).applyToPath((Matrix)localObject1, (Path)localObject2);
    paramShapeAppearancePathSpec = paramShapeAppearancePathSpec.pathListener;
    if (paramShapeAppearancePathSpec != null)
    {
      localObject4 = this.shapePath;
      localObject1 = this.edgeTransforms[paramInt];
      paramShapeAppearancePathSpec.onEdgePathCreated((ShapePath)localObject4, (Matrix)localObject1, paramInt);
    }
  }
  
  private void getCoordinatesOfCorner(int paramInt, RectF paramRectF, PointF paramPointF)
  {
    int i = 1;
    float f1;
    if (paramInt != i)
    {
      i = 2;
      if (paramInt != i)
      {
        i = 3;
        if (paramInt != i) {
          f1 = paramRectF.right;
        }
      }
    }
    for (float f2 = paramRectF.top;; f2 = paramRectF.bottom)
    {
      paramPointF.set(f1, f2);
      return;
      f1 = paramRectF.left;
      break;
      f1 = paramRectF.left;
      continue;
      f1 = paramRectF.right;
    }
  }
  
  private CornerSize getCornerSizeForIndex(int paramInt, ShapeAppearanceModel paramShapeAppearanceModel)
  {
    int i = 1;
    if (paramInt != i)
    {
      i = 2;
      if (paramInt != i)
      {
        i = 3;
        if (paramInt != i) {
          return paramShapeAppearanceModel.getTopRightCornerSize();
        }
        return paramShapeAppearanceModel.getTopLeftCornerSize();
      }
      return paramShapeAppearanceModel.getBottomLeftCornerSize();
    }
    return paramShapeAppearanceModel.getBottomRightCornerSize();
  }
  
  private CornerTreatment getCornerTreatmentForIndex(int paramInt, ShapeAppearanceModel paramShapeAppearanceModel)
  {
    int i = 1;
    if (paramInt != i)
    {
      i = 2;
      if (paramInt != i)
      {
        i = 3;
        if (paramInt != i) {
          return paramShapeAppearanceModel.getTopRightCorner();
        }
        return paramShapeAppearanceModel.getTopLeftCorner();
      }
      return paramShapeAppearanceModel.getBottomLeftCorner();
    }
    return paramShapeAppearanceModel.getBottomRightCorner();
  }
  
  private float getEdgeCenterForIndex(RectF paramRectF, int paramInt)
  {
    float[] arrayOfFloat1 = this.scratch;
    Object localObject = this.cornerPaths[paramInt];
    float f1 = ((ShapePath)localObject).endX;
    arrayOfFloat1[0] = f1;
    float f2 = ((ShapePath)localObject).endY;
    int i = 1;
    f1 = 1.4E-45F;
    arrayOfFloat1[i] = f2;
    localObject = this.cornerTransforms[paramInt];
    ((Matrix)localObject).mapPoints(arrayOfFloat1);
    float f3;
    float[] arrayOfFloat2;
    if (paramInt != i)
    {
      int j = 3;
      if (paramInt != j)
      {
        f3 = paramRectF.centerY();
        arrayOfFloat2 = this.scratch;
      }
    }
    for (float f4 = arrayOfFloat2[i];; f4 = arrayOfFloat2[0])
    {
      return Math.abs(f3 - f4);
      f3 = paramRectF.centerX();
      arrayOfFloat2 = this.scratch;
    }
  }
  
  private EdgeTreatment getEdgeTreatmentForIndex(int paramInt, ShapeAppearanceModel paramShapeAppearanceModel)
  {
    int i = 1;
    if (paramInt != i)
    {
      i = 2;
      if (paramInt != i)
      {
        i = 3;
        if (paramInt != i) {
          return paramShapeAppearanceModel.getRightEdge();
        }
        return paramShapeAppearanceModel.getTopEdge();
      }
      return paramShapeAppearanceModel.getLeftEdge();
    }
    return paramShapeAppearanceModel.getBottomEdge();
  }
  
  public static ShapeAppearancePathProvider getInstance()
  {
    return ShapeAppearancePathProvider.Lazy.INSTANCE;
  }
  
  private boolean pathOverlapsCorner(Path paramPath, int paramInt)
  {
    this.cornerPath.reset();
    ShapePath localShapePath = this.cornerPaths[paramInt];
    Object localObject = this.cornerTransforms[paramInt];
    Path localPath = this.cornerPath;
    localShapePath.applyToPath((Matrix)localObject, localPath);
    localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    boolean bool1 = true;
    paramPath.computeBounds((RectF)localObject, bool1);
    this.cornerPath.computeBounds((RectF)localObject, bool1);
    localPath = this.cornerPath;
    Path.Op localOp = Path.Op.INTERSECT;
    paramPath.op(localPath, localOp);
    paramPath.computeBounds((RectF)localObject, bool1);
    boolean bool2 = ((RectF)localObject).isEmpty();
    if (bool2)
    {
      float f1 = ((RectF)localObject).width();
      float f2 = 1.0F;
      bool2 = f1 < f2;
      if (bool2)
      {
        f1 = ((RectF)localObject).height();
        bool2 = f1 < f2;
        if (bool2) {}
      }
      else
      {
        bool1 = false;
        localShapePath = null;
      }
    }
    return bool1;
  }
  
  private void setCornerPathAndTransform(ShapeAppearancePathProvider.ShapeAppearancePathSpec paramShapeAppearancePathSpec, int paramInt)
  {
    ShapeAppearanceModel localShapeAppearanceModel = paramShapeAppearancePathSpec.shapeAppearanceModel;
    CornerSize localCornerSize = getCornerSizeForIndex(paramInt, localShapeAppearanceModel);
    localShapeAppearanceModel = paramShapeAppearancePathSpec.shapeAppearanceModel;
    Object localObject = getCornerTreatmentForIndex(paramInt, localShapeAppearanceModel);
    ShapePath localShapePath = this.cornerPaths[paramInt];
    float f1 = paramShapeAppearancePathSpec.interpolation;
    RectF localRectF = paramShapeAppearancePathSpec.bounds;
    ((CornerTreatment)localObject).getCornerPath(localShapePath, 90.0F, f1, localRectF, localCornerSize);
    float f2 = angleOfEdge(paramInt);
    this.cornerTransforms[paramInt].reset();
    paramShapeAppearancePathSpec = paramShapeAppearancePathSpec.bounds;
    localObject = this.pointF;
    getCoordinatesOfCorner(paramInt, paramShapeAppearancePathSpec, (PointF)localObject);
    paramShapeAppearancePathSpec = this.cornerTransforms[paramInt];
    localObject = this.pointF;
    float f3 = ((PointF)localObject).x;
    float f4 = ((PointF)localObject).y;
    paramShapeAppearancePathSpec.setTranslate(f3, f4);
    this.cornerTransforms[paramInt].preRotate(f2);
  }
  
  private void setEdgePathAndTransform(int paramInt)
  {
    Object localObject1 = this.scratch;
    float f1 = this.cornerPaths[paramInt].getEndX();
    localObject1[0] = f1;
    localObject1 = this.scratch;
    f1 = this.cornerPaths[paramInt].getEndY();
    int i = 1;
    localObject1[i] = f1;
    localObject1 = this.cornerTransforms[paramInt];
    Object localObject2 = this.scratch;
    ((Matrix)localObject1).mapPoints((float[])localObject2);
    float f2 = angleOfEdge(paramInt);
    this.edgeTransforms[paramInt].reset();
    localObject2 = this.edgeTransforms[paramInt];
    float[] arrayOfFloat = this.scratch;
    float f3 = arrayOfFloat[0];
    float f4 = arrayOfFloat[i];
    ((Matrix)localObject2).setTranslate(f3, f4);
    this.edgeTransforms[paramInt].preRotate(f2);
  }
  
  public void calculatePath(ShapeAppearanceModel paramShapeAppearanceModel, float paramFloat, RectF paramRectF, Path paramPath)
  {
    calculatePath(paramShapeAppearanceModel, paramFloat, paramRectF, null, paramPath);
  }
  
  public void calculatePath(ShapeAppearanceModel paramShapeAppearanceModel, float paramFloat, RectF paramRectF, ShapeAppearancePathProvider.PathListener paramPathListener, Path paramPath)
  {
    paramPath.rewind();
    this.overlappedEdgePath.rewind();
    this.boundsPath.rewind();
    Object localObject = this.boundsPath;
    Path.Direction localDirection = Path.Direction.CW;
    ((Path)localObject).addRect(paramRectF, localDirection);
    localObject = new com/google/android/material/shape/ShapeAppearancePathProvider$ShapeAppearancePathSpec;
    ((ShapeAppearancePathProvider.ShapeAppearancePathSpec)localObject).<init>(paramShapeAppearanceModel, paramFloat, paramRectF, paramPathListener, paramPath);
    int i = 0;
    paramShapeAppearanceModel = null;
    int j = 0;
    Path.Op localOp = null;
    paramFloat = 0.0F;
    int k;
    for (;;)
    {
      k = 4;
      if (j >= k) {
        break;
      }
      setCornerPathAndTransform((ShapeAppearancePathProvider.ShapeAppearancePathSpec)localObject, j);
      setEdgePathAndTransform(j);
      j += 1;
    }
    while (i < k)
    {
      appendCornerPath((ShapeAppearancePathProvider.ShapeAppearancePathSpec)localObject, i);
      appendEdgePath((ShapeAppearancePathProvider.ShapeAppearancePathSpec)localObject, i);
      i += 1;
    }
    paramPath.close();
    this.overlappedEdgePath.close();
    paramShapeAppearanceModel = this.overlappedEdgePath;
    boolean bool = paramShapeAppearanceModel.isEmpty();
    if (!bool)
    {
      paramShapeAppearanceModel = this.overlappedEdgePath;
      localOp = Path.Op.UNION;
      paramPath.op(paramShapeAppearanceModel, localOp);
    }
  }
  
  public void setEdgeIntersectionCheckEnable(boolean paramBoolean)
  {
    this.edgeIntersectionCheckEnabled = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shape.ShapeAppearancePathProvider
 * JD-Core Version:    0.7.0.1
 */