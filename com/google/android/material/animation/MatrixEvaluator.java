package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class MatrixEvaluator
  implements TypeEvaluator
{
  private final float[] tempEndValues;
  private final Matrix tempMatrix;
  private final float[] tempStartValues;
  
  public MatrixEvaluator()
  {
    int i = 9;
    float[] arrayOfFloat = new float[i];
    this.tempStartValues = arrayOfFloat;
    Object localObject = new float[i];
    this.tempEndValues = ((float[])localObject);
    localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    this.tempMatrix = ((Matrix)localObject);
  }
  
  public Matrix evaluate(float paramFloat, Matrix paramMatrix1, Matrix paramMatrix2)
  {
    float[] arrayOfFloat1 = this.tempStartValues;
    paramMatrix1.getValues(arrayOfFloat1);
    paramMatrix1 = this.tempEndValues;
    paramMatrix2.getValues(paramMatrix1);
    int i = 0;
    paramMatrix1 = null;
    for (;;)
    {
      int j = 9;
      if (i >= j) {
        break;
      }
      paramMatrix2 = this.tempEndValues;
      float f1 = paramMatrix2[i];
      float[] arrayOfFloat2 = this.tempStartValues;
      float f2 = arrayOfFloat2[i];
      f1 = (f1 - f2) * paramFloat;
      f2 += f1;
      paramMatrix2[i] = f2;
      i += 1;
    }
    Matrix localMatrix = this.tempMatrix;
    paramMatrix1 = this.tempEndValues;
    localMatrix.setValues(paramMatrix1);
    return this.tempMatrix;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.animation.MatrixEvaluator
 * JD-Core Version:    0.7.0.1
 */