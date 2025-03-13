package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ShapePath
{
  protected static final float ANGLE_LEFT = 180.0F;
  private static final float ANGLE_UP = 270.0F;
  private boolean containsIncompatibleShadowOp;
  public float currentShadowAngle;
  public float endShadowAngle;
  public float endX;
  public float endY;
  private final List operations;
  private final List shadowCompatOperations;
  public float startX;
  public float startY;
  
  public ShapePath()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.operations = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.shadowCompatOperations = localArrayList;
    reset(0.0F, 0.0F);
  }
  
  public ShapePath(float paramFloat1, float paramFloat2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.operations = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.shadowCompatOperations = localArrayList;
    reset(paramFloat1, paramFloat2);
  }
  
  private void addConnectingShadowIfNecessary(float paramFloat)
  {
    float f1 = getCurrentShadowAngle();
    boolean bool1 = f1 < paramFloat;
    if (!bool1) {
      return;
    }
    f1 = getCurrentShadowAngle();
    f1 = paramFloat - f1;
    float f2 = 360.0F;
    f1 = (f1 + f2) % f2;
    f2 = 180.0F;
    boolean bool2 = f1 < f2;
    if (bool2) {
      return;
    }
    ShapePath.PathArcOperation localPathArcOperation = new com/google/android/material/shape/ShapePath$PathArcOperation;
    float f3 = getEndX();
    float f4 = getEndY();
    float f5 = getEndX();
    float f6 = getEndY();
    localPathArcOperation.<init>(f3, f4, f5, f6);
    f3 = getCurrentShadowAngle();
    ShapePath.PathArcOperation.access$600(localPathArcOperation, f3);
    ShapePath.PathArcOperation.access$700(localPathArcOperation, f1);
    List localList = this.shadowCompatOperations;
    ShapePath.ArcShadowOperation localArcShadowOperation = new com/google/android/material/shape/ShapePath$ArcShadowOperation;
    localArcShadowOperation.<init>(localPathArcOperation);
    localList.add(localArcShadowOperation);
    setCurrentShadowAngle(paramFloat);
  }
  
  private void addShadowCompatOperation(ShapePath.ShadowCompatOperation paramShadowCompatOperation, float paramFloat1, float paramFloat2)
  {
    addConnectingShadowIfNecessary(paramFloat1);
    this.shadowCompatOperations.add(paramShadowCompatOperation);
    setCurrentShadowAngle(paramFloat2);
  }
  
  private float getCurrentShadowAngle()
  {
    return this.currentShadowAngle;
  }
  
  private float getEndShadowAngle()
  {
    return this.endShadowAngle;
  }
  
  private void setCurrentShadowAngle(float paramFloat)
  {
    this.currentShadowAngle = paramFloat;
  }
  
  private void setEndShadowAngle(float paramFloat)
  {
    this.endShadowAngle = paramFloat;
  }
  
  private void setEndX(float paramFloat)
  {
    this.endX = paramFloat;
  }
  
  private void setEndY(float paramFloat)
  {
    this.endY = paramFloat;
  }
  
  private void setStartX(float paramFloat)
  {
    this.startX = paramFloat;
  }
  
  private void setStartY(float paramFloat)
  {
    this.startY = paramFloat;
  }
  
  public void addArc(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    ShapePath.PathArcOperation localPathArcOperation = new com/google/android/material/shape/ShapePath$PathArcOperation;
    localPathArcOperation.<init>(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    ShapePath.PathArcOperation.access$600(localPathArcOperation, paramFloat5);
    ShapePath.PathArcOperation.access$700(localPathArcOperation, paramFloat6);
    this.operations.add(localPathArcOperation);
    ShapePath.ArcShadowOperation localArcShadowOperation = new com/google/android/material/shape/ShapePath$ArcShadowOperation;
    localArcShadowOperation.<init>(localPathArcOperation);
    float f1 = paramFloat5 + paramFloat6;
    float f2 = 0.0F;
    boolean bool = paramFloat6 < 0.0F;
    if (bool)
    {
      bool = true;
      paramFloat6 = 1.4E-45F;
    }
    else
    {
      bool = false;
      paramFloat6 = 0.0F;
    }
    f2 = 360.0F;
    float f3 = 180.0F;
    if (bool) {
      paramFloat5 = (paramFloat5 + f3) % f2;
    }
    if (bool) {
      f3 = (f3 + f1) % f2;
    } else {
      f3 = f1;
    }
    addShadowCompatOperation(localArcShadowOperation, paramFloat5, f3);
    paramFloat5 = paramFloat1 + paramFloat3;
    paramFloat6 = 0.5F;
    paramFloat5 *= paramFloat6;
    paramFloat3 -= paramFloat1;
    paramFloat1 = 2.0F;
    paramFloat3 /= paramFloat1;
    double d = f1;
    f2 = (float)Math.cos(Math.toRadians(d));
    paramFloat3 *= f2;
    paramFloat5 += paramFloat3;
    setEndX(paramFloat5);
    paramFloat3 = (paramFloat2 + paramFloat4) * paramFloat6;
    paramFloat4 = (paramFloat4 - paramFloat2) / paramFloat1;
    paramFloat1 = (float)Math.sin(Math.toRadians(d));
    paramFloat4 *= paramFloat1;
    paramFloat3 += paramFloat4;
    setEndY(paramFloat3);
  }
  
  public void applyToPath(Matrix paramMatrix, Path paramPath)
  {
    List localList = this.operations;
    int i = localList.size();
    int j = 0;
    while (j < i)
    {
      ShapePath.PathOperation localPathOperation = (ShapePath.PathOperation)this.operations.get(j);
      localPathOperation.applyToPath(paramMatrix, paramPath);
      j += 1;
    }
  }
  
  public boolean containsIncompatibleShadowOp()
  {
    return this.containsIncompatibleShadowOp;
  }
  
  public ShapePath.ShadowCompatOperation createShadowCompatOperation(Matrix paramMatrix)
  {
    float f = getEndShadowAngle();
    addConnectingShadowIfNecessary(f);
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>(paramMatrix);
    paramMatrix = new java/util/ArrayList;
    Object localObject = this.shadowCompatOperations;
    paramMatrix.<init>((Collection)localObject);
    localObject = new com/google/android/material/shape/ShapePath$1;
    ((ShapePath.1)localObject).<init>(this, paramMatrix, localMatrix);
    return localObject;
  }
  
  public void cubicToPoint(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    ShapePath.PathCubicOperation localPathCubicOperation = new com/google/android/material/shape/ShapePath$PathCubicOperation;
    localPathCubicOperation.<init>(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
    this.operations.add(localPathCubicOperation);
    this.containsIncompatibleShadowOp = true;
    setEndX(paramFloat5);
    setEndY(paramFloat6);
  }
  
  public float getEndX()
  {
    return this.endX;
  }
  
  public float getEndY()
  {
    return this.endY;
  }
  
  public float getStartX()
  {
    return this.startX;
  }
  
  public float getStartY()
  {
    return this.startY;
  }
  
  public void lineTo(float paramFloat1, float paramFloat2)
  {
    ShapePath.PathLineOperation localPathLineOperation = new com/google/android/material/shape/ShapePath$PathLineOperation;
    localPathLineOperation.<init>();
    ShapePath.PathLineOperation.access$002(localPathLineOperation, paramFloat1);
    ShapePath.PathLineOperation.access$102(localPathLineOperation, paramFloat2);
    this.operations.add(localPathLineOperation);
    ShapePath.LineShadowOperation localLineShadowOperation = new com/google/android/material/shape/ShapePath$LineShadowOperation;
    float f1 = getEndX();
    float f2 = getEndY();
    localLineShadowOperation.<init>(localPathLineOperation, f1, f2);
    float f3 = localLineShadowOperation.getAngle();
    f1 = 270.0F;
    f3 += f1;
    f2 = localLineShadowOperation.getAngle() + f1;
    addShadowCompatOperation(localLineShadowOperation, f3, f2);
    setEndX(paramFloat1);
    setEndY(paramFloat2);
  }
  
  public void lineTo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = getEndX();
    f1 = Math.abs(paramFloat1 - f1);
    float f2 = 0.001F;
    boolean bool = f1 < f2;
    if (bool)
    {
      f1 = getEndY();
      f1 = Math.abs(paramFloat2 - f1);
      bool = f1 < f2;
      if (bool) {}
    }
    else
    {
      f1 = Math.abs(paramFloat1 - paramFloat3);
      bool = f1 < f2;
      if (!bool) {
        break label107;
      }
      f1 = Math.abs(paramFloat2 - paramFloat4);
      bool = f1 < f2;
      if (!bool) {
        break label107;
      }
    }
    lineTo(paramFloat3, paramFloat4);
    return;
    label107:
    ShapePath.PathLineOperation localPathLineOperation1 = new com/google/android/material/shape/ShapePath$PathLineOperation;
    localPathLineOperation1.<init>();
    ShapePath.PathLineOperation.access$002(localPathLineOperation1, paramFloat1);
    ShapePath.PathLineOperation.access$102(localPathLineOperation1, paramFloat2);
    this.operations.add(localPathLineOperation1);
    ShapePath.PathLineOperation localPathLineOperation2 = new com/google/android/material/shape/ShapePath$PathLineOperation;
    localPathLineOperation2.<init>();
    ShapePath.PathLineOperation.access$002(localPathLineOperation2, paramFloat3);
    ShapePath.PathLineOperation.access$102(localPathLineOperation2, paramFloat4);
    this.operations.add(localPathLineOperation2);
    ShapePath.InnerCornerShadowOperation localInnerCornerShadowOperation = new com/google/android/material/shape/ShapePath$InnerCornerShadowOperation;
    float f3 = getEndX();
    float f4 = getEndY();
    localInnerCornerShadowOperation.<init>(localPathLineOperation1, localPathLineOperation2, f3, f4);
    f1 = localInnerCornerShadowOperation.getSweepAngle();
    f2 = 0.0F;
    localPathLineOperation2 = null;
    bool = f1 < 0.0F;
    if (bool)
    {
      lineTo(paramFloat1, paramFloat2);
      lineTo(paramFloat3, paramFloat4);
      return;
    }
    paramFloat1 = localInnerCornerShadowOperation.getStartAngle();
    paramFloat2 = 270.0F;
    paramFloat1 += paramFloat2;
    f1 = localInnerCornerShadowOperation.getEndAngle() + paramFloat2;
    addShadowCompatOperation(localInnerCornerShadowOperation, paramFloat1, f1);
    setEndX(paramFloat3);
    setEndY(paramFloat4);
  }
  
  public void quadToPoint(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    ShapePath.PathQuadOperation localPathQuadOperation = new com/google/android/material/shape/ShapePath$PathQuadOperation;
    localPathQuadOperation.<init>();
    ShapePath.PathQuadOperation.access$200(localPathQuadOperation, paramFloat1);
    ShapePath.PathQuadOperation.access$300(localPathQuadOperation, paramFloat2);
    ShapePath.PathQuadOperation.access$400(localPathQuadOperation, paramFloat3);
    ShapePath.PathQuadOperation.access$500(localPathQuadOperation, paramFloat4);
    this.operations.add(localPathQuadOperation);
    this.containsIncompatibleShadowOp = true;
    setEndX(paramFloat3);
    setEndY(paramFloat4);
  }
  
  public void reset(float paramFloat1, float paramFloat2)
  {
    reset(paramFloat1, paramFloat2, 270.0F, 0.0F);
  }
  
  public void reset(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    setStartX(paramFloat1);
    setStartY(paramFloat2);
    setEndX(paramFloat1);
    setEndY(paramFloat2);
    setCurrentShadowAngle(paramFloat3);
    paramFloat3 = (paramFloat3 + paramFloat4) % 360.0F;
    setEndShadowAngle(paramFloat3);
    this.operations.clear();
    this.shadowCompatOperations.clear();
    this.containsIncompatibleShadowOp = false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shape.ShapePath
 * JD-Core Version:    0.7.0.1
 */