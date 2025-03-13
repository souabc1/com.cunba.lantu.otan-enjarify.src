package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;

public abstract class ShapePath$PathOperation
{
  protected final Matrix matrix;
  
  public ShapePath$PathOperation()
  {
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>();
    this.matrix = localMatrix;
  }
  
  public abstract void applyToPath(Matrix paramMatrix, Path paramPath);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shape.ShapePath.PathOperation
 * JD-Core Version:    0.7.0.1
 */