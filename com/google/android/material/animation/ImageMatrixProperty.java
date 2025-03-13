package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public class ImageMatrixProperty
  extends Property
{
  private final Matrix matrix;
  
  public ImageMatrixProperty()
  {
    super(Matrix.class, str);
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>();
    this.matrix = localMatrix;
  }
  
  public Matrix get(ImageView paramImageView)
  {
    Matrix localMatrix = this.matrix;
    paramImageView = paramImageView.getImageMatrix();
    localMatrix.set(paramImageView);
    return this.matrix;
  }
  
  public void set(ImageView paramImageView, Matrix paramMatrix)
  {
    paramImageView.setImageMatrix(paramMatrix);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.animation.ImageMatrixProperty
 * JD-Core Version:    0.7.0.1
 */