package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.material.shadow.ShadowRenderer;

abstract class ShapePath$ShadowCompatOperation
{
  static final Matrix IDENTITY_MATRIX;
  final Matrix renderMatrix;
  
  static
  {
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>();
    IDENTITY_MATRIX = localMatrix;
  }
  
  public ShapePath$ShadowCompatOperation()
  {
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>();
    this.renderMatrix = localMatrix;
  }
  
  public abstract void draw(Matrix paramMatrix, ShadowRenderer paramShadowRenderer, int paramInt, Canvas paramCanvas);
  
  public final void draw(ShadowRenderer paramShadowRenderer, int paramInt, Canvas paramCanvas)
  {
    Matrix localMatrix = IDENTITY_MATRIX;
    draw(localMatrix, paramShadowRenderer, paramInt, paramCanvas);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shape.ShapePath.ShadowCompatOperation
 * JD-Core Version:    0.7.0.1
 */